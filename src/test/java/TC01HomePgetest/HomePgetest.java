package TC01HomePgetest;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Pages.ExportCargoTrackingPage;
import com.qa.Pages.HomePage;

import BaseClass.BasePage;


public class HomePgetest extends BasePage {
	


	public HomePgetest() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Tchome() throws InterruptedException {
		
		
	//Constructor to initiate the driver	
	
	//Class object initiation
	BasePage BP = PageFactory.initElements(driver, BasePage.class);
	ExportCargoTrackingPage ExpCargTrack = PageFactory.initElements(driver, ExportCargoTrackingPage.class);
	//HomePage Hp = PageFactory.initElements(driver, HomePage.class);
	
	//Methods
	browserInitiation();
	driver.manage().window().maximize();
	driver.get("https://aaiclas-ecom.org");	
	HomePage Hp = PageFactory.initElements(driver, HomePage.class);
	Thread.sleep(3000);
	Hp.ClickNewUser();
	Hp.ClickIAgreeBtn();
	driver.close();
	}
	
	
	
}
