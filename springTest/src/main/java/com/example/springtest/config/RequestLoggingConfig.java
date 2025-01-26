package com.example.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingConfig {

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);  // 打印 URL 查询参数
        filter.setIncludeHeaders(true);      // 打印请求头
        filter.setIncludePayload(true);      // 打印请求体
        filter.setMaxPayloadLength(10000);   // 设置请求体的最大打印长度
        filter.setBeforeMessagePrefix("Request: ");  // 设置打印前缀
        return filter;
    }
}
