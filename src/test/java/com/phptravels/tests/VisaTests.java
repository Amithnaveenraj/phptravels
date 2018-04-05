package com.phptravels.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.pages.HomePage;
import com.phptravels.pages.VisaPage;
import com.phptravels.utils.TestBase;

public class VisaTests extends TestBase {

	HomePage homePage;
	WebDriver driver;

	@Test (priority=1)
	public void verify_visaPage() throws InterruptedException {

		//homePage.clickOnVisaTab();
		
		//Thread.sleep(10000);
		// Visa Results Page
		System.out.println("Test Method 1");
	}
	@Test(priority=2)
	public void verify_visa_for_India_US() throws InterruptedException {

		//homePage.clickOnVisaTab();
		//Thread.sleep(10000);
		// Visa Results Page
		System.out.println("Test Method 2");
	}

	@BeforeClass
	public void setup() {
		//homePage = new HomePage(getDriver());
		System.out.println("Before Class");

	}
	@BeforeMethod
	public void beforeAllMethods(){
		System.out.println("Before Method");
		//Click on Phptravel Logo
		//Click on visa tab
		
	}
		
	

}
