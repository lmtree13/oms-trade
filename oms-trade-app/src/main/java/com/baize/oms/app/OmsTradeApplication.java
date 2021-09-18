package com.baize.oms.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/20 15:09
 **/
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.baize.oms","com.baize.sca.common.config"})
@MapperScan("com.baize.oms.mapper")
@EnableTransactionManagement
public class OmsTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmsTradeApplication.class, args);
    }
}
