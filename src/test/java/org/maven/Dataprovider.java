package org.maven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
   
	@DataProvider(name = "MyDatas")
	private Object[][] getdata() {
		
		return new Object[][] {{"ncskc25@gmail.com", "sdkcsoid"}, {"ncsdcnlk@gmail.com", "ncsdlcjkc"}};

	}
	
	@Test(dataProvider = "MyDatas")
	private void test1(String s, String s1) {
		System.out.println(s);
		System.out.println(s1);
		

	}

	}


