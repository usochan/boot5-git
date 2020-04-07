package com.usochantest44.datatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.usochantest44.datatest.mapper")
public class Usochantest44Application {

    public static void main(String[] args) {
        SpringApplication.run(Usochantest44Application.class, args);
    }

}
