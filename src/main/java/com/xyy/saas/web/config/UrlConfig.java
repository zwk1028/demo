package com.xyy.saas.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wangzhenyu on 2018/4/2.
 */
@ConfigurationProperties(prefix = "url")
public class UrlConfig {
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
