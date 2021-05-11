package com.TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	private void Demo() {

		String Db_Username = null;
		
		String actual_Username = "smith";
		
		System.out.println("Welcome To Signin Page");
		
		//Assert.assertEquals(actual_Username, Db_Username);
		
		//Assert.assertNotEquals(actual_Username, Db_Username );
		
		Assert.assertNull(Db_Username);
		
		System.out.println("Welcome To Home Page");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
