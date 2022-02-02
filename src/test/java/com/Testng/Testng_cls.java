package com.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_cls {

	@Test
	private void balaji() {
		System.out.println("BAlaji D S ");
		
	}
	
	@Test
	private void venkadesan() {
    System.out.println("Venkadesan D S ");
	}

	@Test
	private void mathi() {
		System.out.println("Mathi s ");

	}
	@BeforeMethod
	private void Ashok() {
		System.out.println("Ashok");

	}
	  
	@AfterMethod
	private void nanba() {
System.out.println("Nanba");
	}
	
}
