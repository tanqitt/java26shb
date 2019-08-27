package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@MapperScan("com.accp.dao")
@EnableCaching
public class ErpprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpprojectApplication.class, args);
	}

}
