package com.guyang;
//import org.jboss.jandex.Result;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication()

//@MapperScan("com.guyang.mapper")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {

    @RequestMapping("/")
    String home(){
        return  "going.......";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}