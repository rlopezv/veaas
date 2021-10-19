package com.github.rlopezv.veaas;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@SpringBootApplication
public class VeaasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeaasApplication.class, args);
	}

	@Bean
	public GroupedOpenApi infrastructureOpenApi() {
	 	return GroupedOpenApi.builder().group("infrastructure").pathsToMatch("/**").build();
	}

	// @Bean
	// public GroupedOpenApi environmentOpenApi() {
	//  	return GroupedOpenApi.builder().group("environment").pathsToMatch("api/environment/**").build();
	// }

	// @Bean
	// public GroupedOpenApi accountOpenApi() {
	//  	return GroupedOpenApi.builder().group("account").pathsToMatch("/account/**").build();
	// }

	// @Bean
	// public GroupedOpenApi repositoryOpenApi() {
	//  	return GroupedOpenApi.builder().group("repository").pathsToMatch("/repository/**").build();
	// }

	// @Bean
	// public GroupedOpenApi defaultOpenApi() {
	// 	return GroupedOpenApi.builder().group("api").pathsToMatch("/api/**").build();
	// }

	@Bean
	public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
		return new OpenAPI()
				// .components(new Components().addSecuritySchemes("basicScheme",
				// 		new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
				.info(new Info().title("VEaaS API").version(appVersion).description(
						"This is the API definitión for the Virtual Environment as a Servie implementation.")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
