package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator class with sum method.
 */
@Service
public class Calculator {
	   // Exercise 5 Java file modification
	   // Trigger code quality checks
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
