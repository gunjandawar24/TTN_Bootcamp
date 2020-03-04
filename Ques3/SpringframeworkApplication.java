package com.tothenew.bootcamp.Springframework.Ques3;
//package com.tothenew.bootcamp.Springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(SpringframeworkApplication.class, args);
		Manager manager=applicationContext.getBean(Manager.class);
		manager.mangeWork();


	}
}
