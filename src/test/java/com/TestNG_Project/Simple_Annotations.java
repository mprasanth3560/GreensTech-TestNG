package com.TestNG_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void SetProperty() {
		
		System.out.println("Set Property");

	}
	
	@BeforeTest
	private void browserLaunch() {
		  
		System.out.println("Browser Launch");

	}
	
	@BeforeClass
	private void url() {
		
		System.out.println("URL");

	}
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");
	}
	
	@Test
	private void laptop() {
		
		System.out.println("Laptop Search");

	}
	
	@Test
	private void mobile() {
		
		System.out.println("Mobile Search");

	}
	
	@Test
	private void earphones() {
		
		System.out.println("Earphones Search");

	}
	
	@AfterMethod
	private void logOut() {
		
		System.out.println("LogOut");
		
	}
	
	@AfterClass
	private void verifyHomepage() {
		
		System.out.println("Home Page");

	}
	
	@AfterTest
	private void close() {
		
		System.out.println("close");

	}
	
	@AfterSuite
	private void deteleAllCookies() {
		
		System.out.println("Delete all cookies");

	}	
	
}
