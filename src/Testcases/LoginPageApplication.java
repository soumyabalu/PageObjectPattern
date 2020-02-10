package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ReddifHomePage;
import objectrepository.ReddifLogin;

public class LoginPageApplication {
	@Test
	public void login() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	ReddifLogin lg = new ReddifLogin(driver);
	lg.emailId().sendKeys("soumya123");
	lg.passWord().sendKeys("abcd");
	lg.SignIn().click();
	lg.Home().click();
	ReddifHomePage lh = new ReddifHomePage(driver);
	lh.shoping().sendKeys("reddif");
	lh.search().click();
			}
}