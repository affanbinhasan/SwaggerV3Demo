package com.springswagger.swagger_learning;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;



@SpringBootApplication
@OpenAPIDefinition
public class SwaggerLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerLearningApplication.class, args);
	}

	@Bean
	public GroupedOpenApi swaggerConfig() {
		return GroupedOpenApi.builder()
			.group("Contact-APIs")
			.pathsToMatch("/api/*")
			.build();
	}

	@Bean
	public OpenAPI swaggerApiInfoConfig(){
		return new OpenAPI()
		.info(new Info().title("Contact API")
		.description("Swagger Learning Application")
		.version("v0.0.7")
		.license(new License().name("GitHub").url("http://github.com/affanbinhasan")));
	}
	
}
