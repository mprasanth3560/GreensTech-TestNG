package com.TestNG_Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	@Test
	private void Demo() {

		String Db_Username = null;
		
		String actual_Username = "smith";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual_Username,Db_Username);
		
		System.out.println("Welcome To Signin Page");
		
	
	
	
	
	}
	
	
	
	
}
