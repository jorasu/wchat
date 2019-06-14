package com.kgc.kd52;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kgc.kd52.dao")
public class WchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WchatApplication.class, args);
	}

}
