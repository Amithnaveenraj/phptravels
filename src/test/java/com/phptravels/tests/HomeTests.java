package com.phptravels.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.phptravels.pages.HomePage;
import com.phptravels.utils.TestBase;

public class HomeTests extends TestBase {
	HomePage homePage;

	@Test(priority=1)
	public void validate_HomePage() throws InterruptedException{
		//homePage.clickOnHotels();
		//homePage.clickOnFlights();
		//homePage.enterLocationInfo("Bangalore");
		System.out.println("Home Tests");
		
	}
	
	
	
	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());
		
	}

}
