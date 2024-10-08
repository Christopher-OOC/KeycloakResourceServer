package com.example.keycloak.resource.KeycloakResourceServer.security;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.*;
import java.util.stream.Collectors;

public class JwtRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    @Override
    public Collection<GrantedAuthority> convert(Jwt source) {

        Map<String, Object> jwtMap = source.getClaimAsMap("realm_access");
        List<String> jwtRoles = (List<String>) jwtMap.get("roles");

        if (jwtRoles.isEmpty()) {
            return Collections.emptyList();
        }

        List<GrantedAuthority> roles = jwtRoles
                .stream()
                .map(role -> role.toUpperCase())
                .map(role -> "ROLE_" + role)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        System.out.println(roles);

        return roles;
    }
}
