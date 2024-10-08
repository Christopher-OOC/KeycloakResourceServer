package com.example.keycloak.resource.KeycloakResourceServer.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private Map<String, String> user1 = new HashMap<>();
    private Map<String, String> user2 = new HashMap<>();

    {
        user1.put("id", "1");
        user1.put("name", "Olojede Christopher");
        user1.put("age", "23");

        user2.put("id", "2");
        user2.put("name", "Olojede Richard");
        user2.put("age", "17");
    }

    @GetMapping("/users")
    public List<Map<String, String>> getUsers(@AuthenticationPrincipal Jwt jwt) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

//        user1.put("access_token", jwt.getClaimAsString("scope"));
//        user2.put("access_token", jwt.getClaimAsString("scope"));
//
//        System.out.println("Token: " + authentication);

        return Arrays.asList(user1, user2);
    }


}
