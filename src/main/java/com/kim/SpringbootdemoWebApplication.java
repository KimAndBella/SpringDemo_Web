package com.kim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan
public class SpringbootdemoWebApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootdemoWebApplication.class, args);
//		printBeanNames(applicationContext);
	}
	public static void printBeanNames(ApplicationContext applicationContext){
		if(applicationContext != null){
			String[] beanNames = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String name : beanNames){
				System.out.println("definition name - "+name);
			}
		}
	}
}
