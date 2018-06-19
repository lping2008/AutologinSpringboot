package com.plin.autologin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.plin.autologin.mapper"})
public class AutologinSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutologinSpringbootApplication.class, args);
	}
}
