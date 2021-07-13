package com.guyang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:mybatis/spring-cfg/application-servlet.xml")
public class appConfig {
}