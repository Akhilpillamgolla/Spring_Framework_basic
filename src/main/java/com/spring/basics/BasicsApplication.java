package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.base.BinarySearch;

//@SpringBootApplication
@Configuration             // Running as java application without using Springboot(Java Annotations)
@ComponentScan("com.spring.basics.base")
public class BasicsApplication {

	public static void main(String[] args) {
		
		//BinarySearch b=new BinarySearch(new QuickSortAlgorithm()); when implements is used
	//ApplicationContext ac=SpringApplication.run(BasicsApplication.class, args);
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(BasicsApplication.class)){
	BinarySearch b=ac.getBean(BinarySearch.class);
	//BinarySearch b1=ac.getBean(BinarySearch.class);
	System.out.println(b);
	//System.out.println(b1);
		int r=b.bs(new int[]{2,3,5},3);
		System.out.println(r);
		//ac.close();  //to close the application context or using try block
	}
	}
}
