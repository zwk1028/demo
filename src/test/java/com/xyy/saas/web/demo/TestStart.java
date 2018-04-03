package com.xyy.saas.web.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by wangzhenyu on 2018/4/2.
 */
@SpringBootApplication
@MapperScan("com.xyy.saas.web.*.dao")
@EnableTransactionManagement
@EnableConfigurationProperties(value = {com.xyy.saas.web.config.UrlConfig.class})
public class TestStart {
    public static void main(String[] args) {
        SpringApplication.run(TestStart.class, args);
    }
}
