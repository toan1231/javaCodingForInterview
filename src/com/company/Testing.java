package com.company;

import org.testng.annotations.Test;



public class Testing {
	
	@Test(priority=0)
	public void test1(){
		System.out.println("testing1");
		
	}
	@Test(priority=1)
	public void test2(){
		System.out.println("testing2");
		
	}
	@Test(priority=2)
	public void test3(){
		System.out.println("testing3");
		
	}
}
