package com.smil;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.smil.mapper"})
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("************** 启动成功 ***************");
        SpringApplication.run(DemoApplication.class, args);
    }
}
