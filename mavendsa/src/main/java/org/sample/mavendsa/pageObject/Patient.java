package org.sample.mavendsa.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Patient {

	WebDriver driver;

	By AllPatientBtn = By.xpath("//a[normalize-space()='All Patients']");
	By ConsultBtn = By.xpath("(//*[@class=\"consult-home-btn mr-2 ng-star-inserted\"])[1]");
	By Treatmentbtn = By.xpath("//*[@placeholder=\"Search or add Treatment\"]");
	By ToothBtn = By.xpath("//*[@placeholder=\"Tooth No.\"]");
	By Entertooth = By.xpath("(//*[@style=\"opacity: 1; pointer-events: auto;\"])[1]");
	By Addtooth = By.xpath("//*[@class=\"btn-treatment-save mx-2\"]");
	By Instruction = By.xpath("//*[@placeholder=\"Search to add instruction\"][@placeholder=\"Search to add instruction\"]");
	By Enterinstruction = By.xpath("//*[@placeholder=\"Search to add instruction\"]");
	By PrescriptionNotes = By.xpath("//*[@placeholder=\"Type a note\"]");
	By Savepreview = By.xpath("//*[@class=\"consult-s-btn drona-Primary_v2 ng-star-inserted\"]");
	By Followupdate = By.xpath("(//*[@class=\"follow-up-day pointer\"])[1]");
	By Whatsappcomplete = By.xpath("(//*[@class=\"conslt-prev-btn tooltip gray-bg\"])[1]");	
	

	public Patient(WebDriver driver) {
		this.driver = driver;

	}

	public void AllPatientBtn() {

		driver.findElement(AllPatientBtn).click();

	}

	public void ConsultBtn() {
		driver.findElement(ConsultBtn).click();

	}

	public void Treatmentbtn(String arg1) {
		driver.findElement(Treatmentbtn).sendKeys(arg1);

	}

	public void ToothBtn() {

		driver.findElement(ToothBtn).click();

	}

	public void Entertooth() {
		driver.findElement(Entertooth).click();
	}

	public void Addtooth() {

		driver.findElement(Addtooth).click();
	}

	public void Instruction() {
		driver.findElement(Instruction).click();

	}

	public void Enterinstruction(String arg1) {
		driver.findElement(Enterinstruction).sendKeys(arg1);
	}

	public void PrescriptionNotes(String arg1) {
		driver.findElement(PrescriptionNotes).sendKeys(arg1);
	}

	public void Savepreview()
	{
	driver.findElement(Savepreview).click();
}
	
	public void Followupdate()
	{
	   
		WebElement element = driver.findElement(Followupdate);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void Whatsappcomplete()
	{
		driver.findElement(Whatsappcomplete).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
