package com.eshop.statyba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getSwaggerApiInfo());
    }

    private ApiInfo getSwaggerApiInfo() {
        return new ApiInfo("statyba.net eshop API",
                "statyba.net eshop api",
                "1.0",
                "Eshop api terms",
                new Contact("Raimondas Siupienis", "url", "info@taforma.lt"),
                "Eshop api license",
                "Eshop api license URL",
                Collections.emptyList());
    }

}
