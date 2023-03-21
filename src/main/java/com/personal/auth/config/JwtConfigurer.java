package com.personal.auth.config;

import com.personal.auth.filter.JwtRequestFilter;
import com.personal.auth.util.JwtUtil;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {


    public JwtConfigurer() {
    }

    @Override
    public void configure(HttpSecurity http) {
        JwtRequestFilter customFilter = new JwtRequestFilter();
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}

