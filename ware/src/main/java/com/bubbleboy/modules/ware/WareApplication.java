package com.bubbleboy.modules.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@MapperScan(basePackages = "com.bubbleboy.modules.ware")
@EnableDiscoveryClient
//@EnableFeignClients("com.bubbleboy.modules.member.feign")
public class WareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WareApplication.class, args);
	}

}
