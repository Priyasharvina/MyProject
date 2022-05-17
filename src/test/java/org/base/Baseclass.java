package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;	
	}
	
	public static void launch(String url) {
		driver.get(url);	
	}
	
	public static WebElement idvalue(String idvalue) {
		WebElement findElement = driver.findElement(By.id(idvalue));
		return findElement;
		
	}
	
	public static WebElement namevalue(String namevalue) {
		WebElement findElement = driver.findElement(By.name(namevalue));
		return findElement;
	}
	
	public static WebElement xpathvalue(String Xpathvalue) {
		WebElement findElement = driver.findElement(By.xpath(Xpathvalue));
		return findElement;
		
	}
	
     public static void textsend(WebElement refName, String textvalue) {
	 refName.sendKeys(textvalue);		

	}
     
   public static void buttonClick(WebElement refName) {
	   refName.click();

}
   public void textSendJavaScript(String textvalue, WebElement refname) {
	   JavascriptExecutor jk = (JavascriptExecutor)driver;
	jk.executeScript("arguments[0].setAttribute('value'," + textvalue + ")", refname );
}
	

		

	}
	


