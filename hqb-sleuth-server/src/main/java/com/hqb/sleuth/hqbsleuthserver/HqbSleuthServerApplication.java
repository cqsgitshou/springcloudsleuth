package com.hqb.sleuth.hqbsleuthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HqbSleuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HqbSleuthServerApplication.class, args);
	}
}
