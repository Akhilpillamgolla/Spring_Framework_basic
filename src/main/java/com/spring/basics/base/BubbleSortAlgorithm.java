package com.spring.basics.base;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] b) {
		return b;
	}

}
