package pageobjectpackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageElement2 {

	WebDriver driver;

	public CartPageElement2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
