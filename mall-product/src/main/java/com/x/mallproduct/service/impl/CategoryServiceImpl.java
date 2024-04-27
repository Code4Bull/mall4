package com.x.mallproduct.service.impl;

import com.x.mallproduct.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.x.common.utils.PageUtils;
import com.x.common.utils.Query;

import com.x.mallproduct.dao.CategoryDao;
import com.x.mallproduct.entity.CategoryEntity;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    // 查出所有分类
    // 组装父子结构
    @Override
    public List<CategoryEntity> listWithTree(){
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //找到所有的一级分类
        return entities.stream()
                .filter(item -> item.getParentCid() == 0)
                .map(item -> {
                    item.setChildren(getChildrens(item, entities));
                    return item;
                })
                .sorted((menu1, menu2) -> { return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());})
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        // 配置全局的逻辑删除规则 （可省略）
        // 配置逻辑删除的组件bean（可省略）
        // 给 bean 加上逻辑删除注解 @TableLogic

        baseMapper.deleteBatchIds(list);

    }

    public List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){
        return all.stream()
                .filter(item -> { return Objects.equals(item.getParentCid(), root.getCatId());})
                .map(item -> {
                    item.setChildren(getChildrens(item, all));
                    return item;
                })
                .sorted((menu1, menu2) -> { return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());})
                .collect(Collectors.toList());
    }
}