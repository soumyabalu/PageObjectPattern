package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLogin {
	
	WebDriver driver;
	//creating a constructor
	public ReddifLogin(WebDriver driver) {
		//this represent the current driver
		this.driver = driver;
	}
//inspecting the objecyts of the webpage objects	
 By username = By.xpath("//input[@id='login1']");
  By password =By.name("passwd");
 By signin =By.name("proceed");
   By home =By.xpath("//a[text()='Home']");

// creating a method for every object
public WebElement emailId() {
	return driver.findElement(username);
}
public WebElement passWord() {
	return driver.findElement(password);
}
public WebElement SignIn() {
	return driver.findElement(signin);
}
public WebElement Home() {
	return driver.findElement(home);
}


}
