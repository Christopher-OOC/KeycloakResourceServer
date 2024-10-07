package com.example.keycloak.resource.KeycloakResourceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.keycloak.resource.KeycloakResourceServer.security")
@ComponentScan("com.example.keycloak.resource.KeycloakResourceServer.controller")

@SpringBootApplication
public class KeycloakResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakResourceServerApplication.class, args);
	}

}
