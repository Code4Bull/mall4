package com.x.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


// 导入 mybatis
// 连接 SQL
// 配置数据源 application.yml 配置相关信息
// 配置 mybatis-plus 1)使用MapperScan 2)告诉mybatis mysql的映射文件位置 3)配置自增组件
@MapperScan("com.x.mallproduct.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
