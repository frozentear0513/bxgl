package com.study.bxgl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.bxgl.tbxx.dao")
public class BxglApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxglApplication.class, args);
    }

}
