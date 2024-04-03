package com.spring.basics;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.cdi.CDI;

@SpringBootApplication
@ComponentScan("com.spring.basics.cdi")
public class BasicsCDIApplication {
private static Logger LOGGER=LoggerFactory.getLogger(BasicsCDIApplication.class);
	public static void main(String[] args) {
		
	ApplicationContext ac=SpringApplication.run(BasicsCDIApplication.class, args);
	CDI b=ac.getBean(CDI.class);
	//PersonDAO b1=ac.getBean(PersonDAO.class);
	LOGGER.info("{}",b);
	LOGGER.info("{}",b.getCdiDao());//one instance of PersonDAO gives two different instances of JdbcConnection by using scope prototype and proxymode
	}

}
