package com.x.mallproduct.dao;

import com.x.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kengsir
 * @email czlsk62@gmail.com
 * @date 2024-03-03 22:12:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}