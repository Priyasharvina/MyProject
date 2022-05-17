package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	
	@BeforeClass
	public static void Tc1() {
		System.out.println("Test 1");

	}
	@Test
	public void Tc2() {
		System.out.println("Test 2");

	}
	@Before
	public void Tc3() {
		System.out.println("Test 3");

	}
	@AfterClass
	public static void Tc4() {
		System.out.println("Test 4");

	}
	@After
	public void Tc5() {
		System.out.println("Test 5");

	}

}
