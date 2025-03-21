package com.example.intermediarymanagementboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.intermediarymanagementboot.demo.mapper") // 指定 Mapper 接口所在的包
public class IntermediaryManagementBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntermediaryManagementBootApplication.class, args);
    }

}
