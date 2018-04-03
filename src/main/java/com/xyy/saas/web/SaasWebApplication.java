package com.xyy.saas.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.xyy.saas.web.*.dao")
@EnableTransactionManagement
@EnableConfigurationProperties(value = {com.xyy.saas.web.config.UrlConfig.class})
public class SaasWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaasWebApplication.class, args);

	}
}
