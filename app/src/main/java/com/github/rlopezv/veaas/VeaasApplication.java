package com.github.rlopezv.veaas;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VeaasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeaasApplication.class, args);
	}

	@Bean
	public GroupedOpenApi infrastructureOpenApi() {
	 	return GroupedOpenApi.builder().group("account").pathsToMatch("/infrastructure/**").build();
	}

	@Bean
	public GroupedOpenApi environmentOpenApi() {
	 	return GroupedOpenApi.builder().group("environment").pathsToMatch("/environment/**").build();
	}

	@Bean
	public GroupedOpenApi accountOpenApi() {
	 	return GroupedOpenApi.builder().group("account").pathsToMatch("/account/**").build();
	}

	@Bean
	public GroupedOpenApi defaultOpenApi() {
		return GroupedOpenApi.builder().group("api").pathsToMatch("/api/**").build();
	}

}
