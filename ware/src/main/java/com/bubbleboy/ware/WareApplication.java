package com.bubbleboy.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@MapperScan(basePackages = "com.bubbleboy.ware.dao")
@EnableDiscoveryClient
public class WareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WareApplication.class, args);
	}

}
