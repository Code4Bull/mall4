package com.x.mallproduct;

import com.x.mallproduct.MallProductApplication;
import com.x.mallproduct.entity.BrandEntity;
import com.x.mallproduct.service.BrandService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MallProductApplication.class})
public class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(6L);
        brandEntity.setDescript("mac yyds");
        brandService.updateById(brandEntity);
        System.out.println("save success...");
    }
}
