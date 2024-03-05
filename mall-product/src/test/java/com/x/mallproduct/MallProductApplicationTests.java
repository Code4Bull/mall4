package com.x.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.x.mallproduct.entity.BrandEntity;
import com.x.mallproduct.service.BrandService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MallProductApplication.class})
public class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        // 插入
        brandEntity.setBrandId(6L);
        brandEntity.setDescript("mac yyds");
        brandService.updateById(brandEntity);
        // 查询
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        brandEntityList.forEach(System.out::println);
        System.out.println("save success...");
    }
}
