package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BasePage;

import org.openqa.selenium.support.FindAll;

public class ExportCargoTrackingPage extends BasePage {
	

	public ExportCargoTrackingPage() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	//1.Page Objects
	//PageFactory FIndBys
	@FindBys({
		@FindBy(how=How.CLASS_NAME, using="col-lg-2"),
		@FindBy(how=How.ID, using="ddlAAILocation")
		
	})
	
	WebElement selectLocationDrpdwn;
	
	@FindAll({
	@FindBy(how=How.NAME, using="ctl00$ContentPlaceHolder1$txtawbno"),
	@FindBy(how=How.ID, using="ctl00_ContentPlaceHolder1_txtawbno")
	})
	WebElement awbTxtBx;
	
	//2.Class Initiation
	
	BasePage BP = PageFactory.initElements(driver, BasePage.class);
	
	//3.Methods
	public void selectLocationDrpdwn(String location) {
		selectLocationDrpdwn.click();
		Select locopt = new Select(selectLocationDrpdwn);
		locopt.selectByVisibleText(location);
	}
	
	public void setAWBnumber(String AWBNumber) {
		awbTxtBx.sendKeys(AWBNumber);
	}

}
