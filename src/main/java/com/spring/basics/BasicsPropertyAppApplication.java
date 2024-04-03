package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.base.BinarySearch;
import com.spring.basics.external.Property;

//@SpringBootApplication
@Configuration             // Running as java application without using Springboot(Java Annotations)
@ComponentScan//("com.spring.basics.base")
@PropertySource("classpath:app.properties")
public class BasicsPropertyAppApplication {

	public static void main(String[] args) {
		
		//BinarySearch b=new BinarySearch(new QuickSortAlgorithm()); when implements is used
	//ApplicationContext ac=SpringApplication.run(BasicsPropertyAppApplication.class, args);
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(BasicsApplication.class)){
	Property b=ac.getBean(Property.class);
	
	System.out.println(b);
	System.out.println(b.returnURL());
		
	}
	}
}
