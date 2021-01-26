package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BasePage;

public class HomePage extends BasePage {
	
	
	public HomePage() throws IOException {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//1. Home Page objects
	
	//Page Factory findBy annotation
	@CacheLookup
	@FindBy(how=How.ID, using="btnnewreg")
	WebElement NewUserRegBtn;
	
	
	//PageFactoryHow and Using
	@CacheLookup
	@FindBy(how=How.ID, using="btnAgree")
	WebElement IAgreeBtn;
	
	//PageFactory Find Bys ExportCargoTracking
	@FindBys({
		@FindBy(how=How.XPATH, using="//div[@class=\"navbar-collapse collapse\"]/ul/li[5]/ul/li[1]/a"),
		@FindBy(how=How.TAG_NAME, using="a")
		
	})
	WebElement ExportCargoTracking;
	
	//PageFactory FindAll ImportCargoTracking
	@FindAll({
		@FindBy(how=How.XPATH, using="//div[@class=\"navbar-collapse collapse\"]/ul/li[5]/ul/li[2]/a"),
		@FindBy(how=How.TAG_NAME, using="a")
		
	})
	WebElement ImportCargoTracking;
	
	//2. Class Initiation
	
	//BasePage BP = PageFactory.initElements(driver, BasePage.class);
	
	//3. Methods
	
	//Click New user Registration button
	public boolean IsNewUserBtnClickable() {
		Boolean res = NewUserRegBtn.isDisplayed();
		return res;
		
	}
	public void ClickNewUser() {
		NewUserRegBtn.click();
	}
	
	//Click IAgree button
	public void ClickIAgreeBtn() {
		IAgreeBtn.click();
	}
	
	//Click ExportCargoTracking
	public void clickExportcargoTracking() {
		ExportCargoTracking.click();
	}
	
	//Click ImportCargoTracking
	public void clickImportCargoTracking() {
		ImportCargoTracking.click();
	}
}
