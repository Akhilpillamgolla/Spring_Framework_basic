package com.spring.basics.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
JdbcConnection(){
	System.out.println("JdbcConnection");
}
}
