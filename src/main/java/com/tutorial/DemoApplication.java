package com.tutorial;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.tutorial.infrastructure.mapper"})
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("************** 启动成功 ***************");
        SpringApplication.run(DemoApplication.class, args);
    }
}
