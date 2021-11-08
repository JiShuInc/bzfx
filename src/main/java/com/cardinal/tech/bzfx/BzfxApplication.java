package com.cardinal.tech.bzfx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(basePackages = "com.cardinal.tech.bzfx.dao")
@EnableAsync
@SpringBootApplication
@EnableScheduling
public class BzfxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BzfxApplication.class, args);
	}

}
