import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class AddEdit {


	WebDriver driver;

	By AddPatient = By.xpath("//img[contains(@class, 'heroicons-outline_user')]");
	
	

	public AddEdit(WebDriver driver) {
		this.driver = driver;

	}
	
	public void AddPatient()
	
	{
		WebElement element = driver.findElement(AddPatient);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
	}
}
