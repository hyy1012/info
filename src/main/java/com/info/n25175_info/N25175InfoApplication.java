package com.info.n25175_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.info.n25175_info.dao")
public class N25175InfoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(N25175InfoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(N25175InfoApplication.class);
	}
}


