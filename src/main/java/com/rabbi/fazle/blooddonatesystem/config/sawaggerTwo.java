package com.rabbi.fazle.blooddonatesystem.config;

import com.rabbi.fazle.blooddonatesystem.model.Donner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class sawaggerTwo {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("Developed By = MD.Fazle Rabbi")
                        .title("FR-Blood Donate App")
                        .version("1.0.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rabbi.fazle.blooddonatesystem.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
