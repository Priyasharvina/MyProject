package org.base;

import org.openqa.selenium.WebElement;

public class Testing1 extends Baseclass{
	
	
public static void main(String[] args) throws InterruptedException {
	
	getdriver();
	Thread.sleep(3000);
	launch("https://www.facebook.com/");
	
	WebElement Textuser = idvalue("email");
	Textuser.sendKeys("sjakcais@gamil.com");
  
 
	
	
	
	
	
	

	
	
	
	
	
	
}


	

	
	

}
