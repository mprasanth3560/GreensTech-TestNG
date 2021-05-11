package com.TestNG_Project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"name" ,"password"})
	private void singleset(@Optional("John") String name ,int password) {
		
		System.out.println("name :" +name);
		
		System.out.println("password :"+password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
