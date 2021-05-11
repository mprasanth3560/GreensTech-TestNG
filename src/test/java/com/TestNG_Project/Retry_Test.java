package com.TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Test {
	
	@Test
	private void method1() {
		
		String Db_username = "John";
		
		String Actual_username = "Smith";
		
		Assert.assertEquals(Actual_username, Db_username);
		
	}
	
	
	@Test
	private void method2() {
		
		String Db_password = "123";
		
		String Actual_password = "3456";
		
		Assert.assertEquals(Actual_password, Db_password);

	}

}
