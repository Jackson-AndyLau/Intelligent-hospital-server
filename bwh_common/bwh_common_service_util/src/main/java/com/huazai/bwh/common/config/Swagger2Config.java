package com.huazai.bwh.common.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置信息
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                //只显示api路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();

    }

    @Bean
    public Docket adminApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                //只显示admin路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();

    }


    @Bean
    public Docket hospitalApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("hospitalApi")
                .apiInfo(hospitalApiInfo())
                .select()
                //只显示admin路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/hospital/.*")))
                .build();

    }

    private ApiInfo webApiInfo() {

        return new ApiInfoBuilder()
                .title("门户网站-API文档")
                .description("本文档描述了网站微服务接口定义")
                .version("1.0-SNAPSHOT")
                .contact(new Contact("Intelligent_hospital", "http://api.java98k.vip", "who.seek.me@java98k.vip"))
                .build();
    }

    private ApiInfo adminApiInfo() {

        return new ApiInfoBuilder()
                .title("后台管理系统-API文档")
                .description("本文档描述了后台管理系统微服务接口定义")
                .version("1.0-SNAPSHOT")
                .contact(new Contact("Intelligent_hospital", "http://api.java98k.vip", "who.seek.me@java98k.vip"))
                .build();
    }

    private ApiInfo hospitalApiInfo() {

        return new ApiInfoBuilder()
                .title("智慧医院管理系统-API文档")
                .description("本文档描述了智慧医院管理系统微服务接口定义")
                .version("1.0-SNAPSHOT")
                .contact(new Contact("Intelligent_hospital", "http://api.java98k.vip", "who.seek.me@java98k.vip"))
                .build();
    }


}
