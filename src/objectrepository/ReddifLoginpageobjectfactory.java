package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginpageobjectfactory {
	
	WebDriver driver;
	//creating a constructor
	public ReddifLoginpageobjectfactory(WebDriver driver) {
		//this represent the current driver
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//"driver" is the test argument and "this"is the local driverobjec
	}
//inspecting the objecyts of the webpage objects	
 //By username = By.xpath("//input[@id='login1']");
  //By password =By.name("passwd");
   //By signin =By.name("proceed");
//By home =By.xpath("//a[text()='Home']");
@FindBy(xpath="//input[@id='login1']")
WebElement username;

@FindBy(name="passwd")
WebElement password;

@FindBy(name="proceed")
WebElement signin;

@FindBy(xpath="//a[text()='Home']")
WebElement home;
// creating a method for every object
public WebElement emailId() {
	return username;
}
public WebElement passWord() {
	return password;
}
public WebElement SignIn() {
	return signin;
}
public WebElement Home() {
	return home;
}


}
