package com.Sanket.JWT_Auth_Demo.WebSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurityConfig {

    @Autowired
    private JwtAuthenticationEntryPoint EntryPoint;
    @Autowired
    private JwtAuthenticationFilterChain jwtAuthenticationFilterChain;

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .cors( cors -> cors.disable())
                .authorizeHttpRequests(
                        auth -> auth.requestMatchers("/home/**").authenticated()
                                .requestMatchers("/auth/login").permitAll()
                                .anyRequest().authenticated())
        .exceptionHandling(exception -> exception.authenticationEntryPoint(EntryPoint))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.addFilterBefore(jwtAuthenticationFilterChain , UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
