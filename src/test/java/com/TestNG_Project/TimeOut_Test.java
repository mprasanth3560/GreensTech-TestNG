package com.TestNG_Project;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	@Test(timeOut = 4000)
	private void task() throws Throwable {
		
		System.out.println("Browser launch");
		
		Thread.sleep(1000);
		
		System.out.println("Login Button Click");
		
		Thread.sleep(2000);
		
		System.out.println("Navigate to next page");
		
	}
}
