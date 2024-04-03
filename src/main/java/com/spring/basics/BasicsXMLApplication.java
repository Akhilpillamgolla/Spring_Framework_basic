package com.spring.basics;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.scope.PersonDAO;
import com.spring.basics.xml.DAO;

//@SpringBootApplication

public class BasicsXMLApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(BasicsXMLApplication.class);
	public static void main(String[] args) {
		
	try(ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("NewFile.xml")){
LOGGER.info("beans loded->{}",(Object)ac.getBeanDefinitionNames());

	DAO b=ac.getBean(DAO.class);
	DAO b1=ac.getBean(DAO.class);
	//System.out.println(b);
	//System.out.println(b.getJdbcConnection());
	LOGGER.info("{}",b);
	LOGGER.info("{}",b.getJdbcConnection());
	LOGGER.info("{}",b.getJdbcConnection());//one instance of PersonDAO gives two different instances of JdbcConnection by using scope prototype and proxymode
	LOGGER.info("{} {}",b1,b1.getJdbcConnection());
	
	}
	}
}
