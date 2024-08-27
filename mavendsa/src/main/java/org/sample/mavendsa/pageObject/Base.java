package org.sample.mavendsa.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Base {

    WebDriver driver;
	
    @BeforeTest
    public void setup(){
	{
		  String path="E:\\PRAVESH PC\\AUTOMATION SOFTWARE\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path);
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://mnkshopfloorqa.z29.web.core.windows.net/");
		  
	}
	
	
  }
    
    @AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
