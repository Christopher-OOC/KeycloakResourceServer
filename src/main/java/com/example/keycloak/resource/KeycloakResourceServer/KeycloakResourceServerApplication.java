package com.example.keycloak.resource.KeycloakResourceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.keycloak.resource.KeycloakResourceServer.security")
@ComponentScan("com.example.keycloak.resource.KeycloakResourceServer.controller")

@EnableDiscoveryClient
@SpringBootApplication
public class KeycloakResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakResourceServerApplication.class, args);
	}

}
