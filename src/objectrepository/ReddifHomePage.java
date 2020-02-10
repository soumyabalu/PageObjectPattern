package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifHomePage {
	WebDriver driver;
public ReddifHomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
 //By search = By.xpath("//input[@id='srchword']");
// By go =By.xpath("//*[@id='queryTop']/input");
@FindBy(xpath="//input[@id='srchword']")
WebElement search;

@FindBy(xpath="//input[@type='submit']")
WebElement go;

public WebElement shoping() {
	return search;
}
public WebElement search() {
	return go;
}
}