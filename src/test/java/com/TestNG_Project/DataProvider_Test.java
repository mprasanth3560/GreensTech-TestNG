package com.TestNG_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	@Test(dataProvider = "method2")
	private void method1(String name ,int password) {
			
			System.out.println("name :" +name);
			
			System.out.println("password :"+password);
		}
		
		
	@DataProvider	
	private Object[][] method2() {

			return new Object [][] {
				
				{ "john", 123},
				{"prasanth", 456},
				{"smith", 789},
				};
	}
	
	
	
	
	
	
	
	
	
	

}
