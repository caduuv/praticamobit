package br.com.mobitbrasil.ped.common.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.mobitbrasil"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Desafio Técnico - Estágio Mobit",
                "API RestFul Desenvolvida em SpringBoot que resolve os desafios propostos nesta etapa do processo seletivo.",
                "1.0",
                "Terms of Service",
                new Contact("Carlos Eduardo Freitas Vidal", "https://github.com/caduuv/",
                        "ceduardovidalf@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<>()
        );

        return apiInfo;
    }


}
