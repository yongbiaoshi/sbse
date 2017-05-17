package com.shyb.demo.sbse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.shyb.demo.sbse.servlet")
@MapperScan(basePackages = "com.shyb.demo.sbse.dao.mapper")
public class SbseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbseApplication.class, args);
    }
}
