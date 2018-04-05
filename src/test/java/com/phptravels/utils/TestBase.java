package com.phptravels.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.phptravels.utils.WebDriverHelper;

public class TestBase {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeAllClasses(){
		driver=WebDriverHelper.createDriver("Chrome");
		
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
		
	}
	

}
