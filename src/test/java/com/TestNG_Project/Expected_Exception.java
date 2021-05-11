package com.TestNG_Project;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions =ArithmeticException.class)
	private void task() {
		
		int a=10;
		
		System.out.println(a/0);
	}
}
