package com.example.configsever;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.SpringCloudApplication;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient //加入注册中心
@SpringCloudApplication
@EnableConfigServer //启用配置服务端
/**
 * author : ww
 */

public class ConfigseverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigseverApplication.class, args);
    }

}
