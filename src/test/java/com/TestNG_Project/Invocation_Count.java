package com.TestNG_Project;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test
	private void browserLaunch() {
		  
		System.out.println("Browser Launch");

	}
	@Test (invocationCount = 2)
	private void refresh() {

		System.out.println("Refresh");
	}
	@Test
	private void url() {
		
		System.out.println("URL");

	}
}
