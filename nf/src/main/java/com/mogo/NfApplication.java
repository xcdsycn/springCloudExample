package com.mogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Eureka register server
@EnableEurekaServer
@SpringBootApplication
@EnableAdminServer
public class NfApplication {

	public static void main(String[] args) {
		SpringApplication.run(NfApplication.class, args);
	}
}
