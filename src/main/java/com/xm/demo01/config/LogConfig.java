package com.xm.demo01.config;

import com.xm.demo01.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public void logMethod(){
        LOG.info("===================BEGIN   LOG===================");
    }

}
