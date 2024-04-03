package com.spring.basics.base;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] b) {
		return b;
	}

}
