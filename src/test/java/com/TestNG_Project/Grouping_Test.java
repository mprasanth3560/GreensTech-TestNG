package com.TestNG_Project;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Electronics")
	private void laptop() {

		System.out.println("Laptop ");
	}
	
	@Test(groups = "Electronics")
	private void mobiles() {

		System.out.println("Mobiles ");
	}
	
	@Test(groups = "Electronics")
	private void earphone() {
		
		System.out.println("Earphone");
	}
	
	@Test (groups = "Education")
	private void books() {

		System.out.println("Books");
	}
	
	@Test(groups ="Social media")
	private void whatsapp() {

		System.out.println("Whatsapp");
	}
	
	@Test(groups = "Social media")
	private void telegram() {

		System.out.println("Telegram");
	}
}
