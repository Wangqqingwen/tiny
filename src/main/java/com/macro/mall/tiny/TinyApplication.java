package com.macro.mall.tiny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class TinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinyApplication.class, args);
    }

}
