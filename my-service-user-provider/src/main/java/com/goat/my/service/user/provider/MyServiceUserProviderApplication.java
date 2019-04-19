package com.goat.my.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.goat.my")
@EnableTransactionManagement
@MapperScan(basePackages = "com.goat.my.commons.mapper")
public class MyServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyServiceUserProviderApplication.class, args);
        Main.main(args);
    }
}
