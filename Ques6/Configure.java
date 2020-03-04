package com.tothenew.bootcamp.Springframework.Ques6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Autowired
    Something something;
    @Bean
    Injector injector () {
        return new Injector(something);
    }

    @Bean
    Something something () {
        return new Something();
    }

}
