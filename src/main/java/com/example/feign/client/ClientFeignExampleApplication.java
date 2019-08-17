package com.example.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientFeignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientFeignExampleApplication.class, args);
	}

}
