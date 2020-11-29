package com.edukt.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Clase de configuracion para la documentacion de la API
 */
@Configuration
public class SpringFoxConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
        .apiInfo(info())
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo info() {
    return new ApiInfoBuilder()
        .title("Edukt API")
        .version("1.0")
        .description("Documentacion de la API para Edukt")
        .contact(new Contact("Grupo 1", "https://github.com/EduJLaC/edukt-dp-g1", ""))
        .build();
  }
}
