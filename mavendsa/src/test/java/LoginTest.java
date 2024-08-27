import org.openqa.selenium.WebDriver;
import org.sample.mavendsa.pageObject.LoginPage;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginPage objLoginPage;
	
	@Test
	public void Login()
	{
		
		objLoginPage = new LoginPage(driver);
		objLoginPage.loginBtn();
		objLoginPage.username("10047288");
		objLoginPage.continueBtn();
		objLoginPage.password("Test@1234");
		objLoginPage.continueBtn();
		objLoginPage.DashbordSubmit();
		
		
	}
	
	@Test
	public void dailyWorkDone()
	{
		
		objLoginPage = new LoginPage(driver);
		objLoginPage.loginBtn();
		objLoginPage.username("10047288");
		objLoginPage.continueBtn();
		objLoginPage.password("Test@1234");
		objLoginPage.continueBtn();
		objLoginPage.DashbordSubmit();
		
		
	}
	
	
}
