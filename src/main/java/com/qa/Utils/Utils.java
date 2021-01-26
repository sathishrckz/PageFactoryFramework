package com.qa.Utils;

import java.io.IOException;

import BaseClass.BasePage;

public class Utils extends BasePage{

	public Utils() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static long implicitwait = 10;
	public static long pageloadtimeout = 10;

}
