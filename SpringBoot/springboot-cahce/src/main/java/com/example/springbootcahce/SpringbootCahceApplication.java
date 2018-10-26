package com.example.springbootcahce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springbootcahce.mapper")
@SpringBootApplication
public class SpringbootCahceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCahceApplication.class, args);
    }
}
