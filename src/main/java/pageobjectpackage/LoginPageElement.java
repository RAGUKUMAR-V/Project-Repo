package pageobjectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	WebDriver driver;
	
	public LoginPageElement (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this );
	}

	@FindBy(id="userEmail")
	public  WebElement username;
	
	@FindBy(id="userPassword")
	public  WebElement password;
	
	@FindBy(id="login")
	public  WebElement submitbutton;
	
}
