package com.szgc.vibrate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: 振捣后台管理API接口文档配置
 * @author: liuyang
 * @createdtime: 2018-09-19 09:36
 **/
@Configuration
@EnableSwagger2
public class ConcreteApiConfiguration {
    @Bean
    public Docket v1RestApiConcreteCommon() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("01-后台管理服务")
                .apiInfo(apiInfo("01-后台管理服务", "liuyang", "v1"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.szgc.vibrate"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(String apiTitle, String author, String version) {
        return new ApiInfoBuilder()
                .title(apiTitle)
                .description("接口版本: " + version)
                .contact(new Contact(author, "", ""))
                .version(version)
                .build();
    }
}
