package com.szgc.vibrate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.szgc.vibrate"})
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.szgc.vibrate.dao","com.szgc.vibrate.table.dao"})
public class VibrateApplication {

    public static void main(String[] args) {
        SpringApplication.run(VibrateApplication.class, args);
    }

}
