package TestcasePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTestPackage.CommonUseClass;
import pageobjectpackage.LoginPageElement;
import pageobjectpackage.ProductPageElement;

public class ValidationClass extends CommonUseClass {

	public LoginPageElement loginelement;
	public ProductPageElement productelement;

	@Test
	public void login() {
		loginelement = new LoginPageElement(driver);

		loginelement.username.sendKeys(prop.getProperty("username"));
		loginelement.password.sendKeys(prop.getProperty("password"));
		loginelement.submitbutton.click();

	}

	@Test
	public void addproduct() throws InterruptedException {
		productelement = new ProductPageElement(driver);
        Thread.sleep(3000);
        productelement.cart.click();
		productelement.firstaddtocart.click();

	}

}
