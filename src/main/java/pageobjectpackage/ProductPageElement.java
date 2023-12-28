package pageobjectpackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageElement {

	WebDriver driver;

	public ProductPageElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@Class='card-body']//child ::h5/b")
	public List<WebElement> products;

	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	public WebElement cart;

	@FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
	public WebElement orders;

	@FindBy(xpath = "//h3[normalize-space()='Automation']")
	public WebElement orderspagetitle;

	@FindBy(xpath = "//button[@class='btn w-10 rounded']")
	public List<WebElement> addtocart;
	
	//button[@class='btn w-10 rounded'][1])[1]
	
	@FindBy(xpath = "(//div[@class='container']//div[1]//div[1]//div[1]//button[2]")
	public WebElement firstaddtocart;
}
