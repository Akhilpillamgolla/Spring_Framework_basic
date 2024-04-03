package com.spring.basics.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Property {
	@Value("${external.service.url}")
private String url;
public String returnURL() {
	return url;
}
}
