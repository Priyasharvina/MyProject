package org.base;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Selenium Day1 Task\\Driver\\chromedriver.exe");
		
		WebDriver Dri = new ChromeDriver();
		
		Dri.manage().window().maximize();
		
		Dri.get("http://greenstech.in/selenium-course-content.html");
		
		TakesScreenshot tk = (TakesScreenshot)Dri;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Mani\\OneDrive\\Desktop\\Priya\\Sample.png");
		FileUtils.copyFile(src, des);
		Dri.close();
		
		
		
		
		
		
		
		
	}
	

}
