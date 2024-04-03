package com.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class CDI {
	//@Autowired
	@Inject                    // To use this annotations javax.inject dependency must present in pom.xml
	CDIDAO cdiDao;

	public CDIDAO getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CDIDAO cdiDao) {
		this.cdiDao = cdiDao;
	}

}
