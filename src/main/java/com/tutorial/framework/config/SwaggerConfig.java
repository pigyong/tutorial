package com.tutorial.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {

    @Bean
    public Docket ProductApi() {
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(productApiInfo())
//                .groupName("James")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tutorial"))
                //.paths(PathSelectors.ant("/hello/**"))
                .build();//构建者模式

    }

    private ApiInfo productApiInfo() {
        return new ApiInfo("XXX系统数据接口文档",
                "文档描述。。。",
                "1.0.0",
                "API TERMS URL",
                "联系人邮箱",
                "license",
                "license url");
    }

}
