package com.spring.basics;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.spring.basics.scope")
public class BasicsScopeApplication {
private static Logger LOGGER=LoggerFactory.getLogger(BasicsScopeApplication.class);
	public static void main(String[] args) {
		
	ApplicationContext ac=SpringApplication.run(BasicsScopeApplication.class, args);
	PersonDAO b=ac.getBean(PersonDAO.class);
	PersonDAO b1=ac.getBean(PersonDAO.class);
	LOGGER.info("{}",b);
	LOGGER.info("{}",b.getJdbcConnection());
	LOGGER.info("{}",b.getJdbcConnection());//one instance of PersonDAO gives two different instances of JdbcConnection by using scope prototype and proxymode
	LOGGER.info("{}",b1);
	LOGGER.info("{}",b1.getJdbcConnection());
	}

}
