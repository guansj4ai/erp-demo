package com.example.erp.demo.config;

import com.jushuitan.api.ApiClient;
import com.jushuitan.api.ApiRequest;
import com.jushuitan.api.ApiResponse;
import com.jushuitan.api.DefaultApiClient;
import com.jushuitan.api.exception.ApiException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guan.sj
 * @date 2023/4/1
 * @since 1.0
 */
@Configuration
public class ErpConfig {

    @Bean
    public ApiClient apiClient() {
        ApiClient client = new DefaultApiClient();
        // 设置超时时间
        ((DefaultApiClient)client).setReadTimeout(3000);
        ((DefaultApiClient)client).setConnectTimeout(2000);
        return client;
    }


    public static void main(String[] args) {

    }
}
