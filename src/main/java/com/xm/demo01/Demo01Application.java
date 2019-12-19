package com.xm.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * springBoot启动类
 */
@SpringBootApplication
@EnableSwagger2
public class Demo01Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo01Application.class);
    }
}
