package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavendependency1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver D = new ChromeDriver();
		
		D.manage().window().maximize();
		
		D.get("https://www.youtube.com/");
		
		Thread.sleep(1000);
		
		D.navigate().to("https://www.google.com/search?q=amazon&rlz=1C1CHZL_enIN830IN830&oq=&sourceid=chrome&ie=UTF-8");
		
		Thread.sleep(1000);

		D.navigate().forward();
		
		Thread.sleep(1000);
		D.navigate().back();
	}

}
