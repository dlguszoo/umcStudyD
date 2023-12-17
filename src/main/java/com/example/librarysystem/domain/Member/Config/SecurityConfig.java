package com.example.librarysystem.domain.Member.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers("/member/login", "/member/join").permitAll()
                .anyRequest().authenticated()
        );

        http.formLogin((auth) -> auth.loginPage("/member/login")
                .loginProcessingUrl("/loginProc")
                .permitAll()
        );
        return http.build();
    }

}
