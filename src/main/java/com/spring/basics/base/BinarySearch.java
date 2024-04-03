package com.spring.basics.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")                 //By default Singleton
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)       // 2 ways can be written but most likely used
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS) 
public class BinarySearch {
	
	/*private Logger LOGGER=LoggerFactory.getLogger(this.getClass());*/
	
	@Autowired
	@Qualifier("bubble")
private SortAlgorithm sortAlgorithm;
	//private SortAlgorithm bubbleSortAlgorithm;              // Autowired by name sortAlgorithm->bubbleSortAlgorithm
/*public BinarySearch(SortAlgorithm sortAlgorithm) {
	super();
	this.sortAlgorithm = sortAlgorithm;                             //Constructor Injection(most likely and mandatory)
}*/
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;                             //Setter Injection (no need to use by default)
	}	*/

public int bs(int a[],int n) {
	//BubbleSortAlgorithm b=new BubbleSortAlgorithm();
	//int sortedarray[]=BubbleSortAlgorithm.sort(a);
	int sortedarray[]=sortAlgorithm.sort(a);
	System.out.println(sortAlgorithm);
	return 3;
}
					/*@PostConstruct
						public void postConstruct() {
							LOGGER.info("postConstuct");
							}
						@PreDestroy
							public void preDestroy() {
								LOGGER.info("preDestroy");
								}*/
}
