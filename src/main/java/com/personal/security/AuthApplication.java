package com.personal.security;

import com.personal.security.proxy.MethodProxy;
import com.personal.security.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.personal.security.proxy")
@EnableDiscoveryClient
public class AuthApplication {
	@Autowired
	private MethodService methodService;


	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}



}
