package BaseTestPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonUseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public static Properties getproperty() throws IOException {
		FileInputStream stream=new FileInputStream("data.properties");
		prop=new Properties();
		prop.load(stream);
		return prop;
	}
    @BeforeSuite()
	public static void BrowserInvoke() throws IOException {
		getproperty();
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else {
			driver =new InternetExplorerDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
			
	}
    @AfterSuite()
	public void teardowmmethod() {
		//driver.quit();
	}
	
	
}
