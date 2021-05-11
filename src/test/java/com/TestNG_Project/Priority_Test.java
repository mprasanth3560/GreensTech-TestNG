package com.TestNG_Project;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test (priority = 2)
	private void laptop() {
		
		System.out.println("Laptop Search");

	}
	
	@Test (priority = -5)
	private void mobile() {
		
		System.out.println("Mobile Search");

	}
	
	@Test
	private void earphones() {
		
		System.out.println("Earphones Search");
	}
	
	@Test (priority = -3)
	private void books() {

		System.out.println("Books Search");
	}
	
	
}
