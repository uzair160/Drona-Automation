package org.sample.mavendsa.pageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By OneLoginBtn = By.xpath("//*[@class='btn btn-blue']");
	//By usernameFieldclk = By.xpath("//*[@class='sc-VigVT gCiims']");
	By username = By.xpath("//*[@id='username']");
	By continueBtn = By.xpath("//*[@type=\\\"submit\\\"]");
	By password = By.xpath("//*[@id='password']");
	By DashbordSubmit = By.xpath("//*[@class=\\\"btn btn-blue\\\"]");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void loginBtn()
	{
		driver.findElement(OneLoginBtn).click();
	}

	public void username(String arg1)
	{
		driver.findElement(username).sendKeys(arg1);
	}
	
	public void password(String arg1)
	{
		driver.findElement(password).sendKeys(arg1);
	}
	
	public void continueBtn()
	{
		driver.findElement(continueBtn).click();
		
	}
	public void DashbordSubmit()
	{
		String submit=driver.findElement(DashbordSubmit).getText();
		assertEquals("Submit",submit);
	}
	
}
