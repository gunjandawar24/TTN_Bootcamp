package com.tothenew.bootcamp.Springframework.Ques6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Framework
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext= SpringApplication.run(Framework.class,args);
        Injector injector = applicationContext.getBean(Injector.class);
        injector.showmsg();

    }
}