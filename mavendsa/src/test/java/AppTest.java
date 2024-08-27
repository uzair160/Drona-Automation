

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sample.mavendsa.pageObject.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends Base{
	
	
	//@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mnkshopfloorqa.z29.web.core.windows.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='btn btn-blue']")).click();
		driver.findElement(By.xpath("//*[@class='sc-VigVT gCiims']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("10047288");
		driver.findElement(By.xpath("//*[@class='sc-kPVwWT duNpUs sc-kpOJdX eAgQMY']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@class='sc-kPVwWT duNpUs sc-kpOJdX eAgQMY']")).click();
		WebElement dashboard=driver.findElement(By.xpath("//div[@class='top_nav']/h6"));
		String submit=driver.findElement(By.xpath("//*[@class=\"btn btn-blue\"]")).getText();
		
		Assert.assertEquals(submit, "Submit");
		//Assert.assertEquals(dashboard, "Dashboard");

		driver.quit();		
	}
	
	@Test
	public void dailyworkdone() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mnkshopfloorqa.z29.web.core.windows.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='btn btn-blue']")).click();
		driver.findElement(By.xpath("//*[@class='sc-VigVT gCiims']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("10047288");
		driver.findElement(By.xpath("//*[@class='sc-kPVwWT duNpUs sc-kpOJdX eAgQMY']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//*[@alt='Daily Work Done']/parent::a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//driver.findElement(By.xpath("//*[@alt='Daily Work Done']/parent::a")).submit();
		driver.findElement(By.xpath("(//*[@class=\"ng-star-inserted\"])[7]")).click();
		driver.findElement(By.xpath("//*[@class=\"btn btn-blue mt-3\"]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[3]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[6]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[7]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[9]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[11]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[12]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[15]")).click();
		driver.findElement(By.xpath("(//*[@class=\"mdc-radio__native-control\"])[17]")).click();
		driver.findElement(By.xpath("//*[@type=\"button\"]")).click();
			
		
	}
	
	//@Test
	public void selfinitiative() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mnkshopfloorqa.z29.web.core.windows.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='btn btn-blue']")).click();
		//driver.findElement(By.xpath("    ");
		
		
		
	}
}

