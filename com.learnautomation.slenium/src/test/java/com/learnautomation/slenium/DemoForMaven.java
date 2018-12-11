/*
 *  @auther Zubair

s
 *  
 */


package com.learnautomation.slenium;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoForMaven {

	@Test
	public void testHello() {
	System.out.println("Welcome to Maven");
	
	}
	
	@Test
	public void Sum(){
		System.out.println("SUM");
		int a = 10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void Sub(){
		System.out.println("SUB");
		int a = 10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}

	@Test
	public void DIV(){
		System.out.println("DIV");
		int a = 10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
	
}