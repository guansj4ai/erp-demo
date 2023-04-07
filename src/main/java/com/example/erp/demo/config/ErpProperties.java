package com.example.erp.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author guan.sj
 * @date 2023/4/1
 * @since 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "erp")
public class ErpProperties {
    private String url = "https://dev-api.jushuitan.com";
    private String appKey = "b0b7d1db226d4216a3d58df9ffa2dde5";
    private String appSecret = "99c4cef262f34ca882975a7064de0b87";
    private String accessToken = "8db141b6d724211b28d2eff2c93fe918";
}
