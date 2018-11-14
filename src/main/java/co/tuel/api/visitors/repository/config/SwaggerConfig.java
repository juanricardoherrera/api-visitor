/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.tuel.api.visitors.repository.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author juan.herrera
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${app.env}")
    private String env;

    @Bean
    public Docket api() {
        switch (env) {
            case "dev":
                return new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("co.tuel.api.visitors.controller"))
                        .paths(PathSelectors.ant("/api/**"))
                        .build();
            default:
                return new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage(""))
                        .paths(PathSelectors.ant("/"))
                        .build();
        }

    }
}
