package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Utils.Utils;

public class BasePage {
	public static WebDriver driver;
	public static String  browser;
	
	public BasePage(WebDriver driver) throws IOException {
	driver= this.driver;
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\SATHISH\\eclipse-workspace\\PageFactoryProject\\Utils\\property.properties");
	 prop.load(fis);
	  browser = prop.getProperty("browser");
	}
	 
	
	public void browserInitiation() {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH\\Downloads\\chromedriver\\chromedriver.exe");		   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utils.implicitwait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utils.pageloadtimeout, TimeUnit.SECONDS);
	}
	}

	
	

}
