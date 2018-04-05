package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	

	@FindBy(xpath="//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[1]/a/span")
	private WebElement lblHotels;
	
	@FindBy(xpath="")
	private WebElement lblFlights;
	
	@FindBy(xpath="//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[5]/a/span")
	private WebElement tabVisa;
	
	
	
	public void clickOnVisaTab(){
		tabVisa.click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen2']/a/span[1]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='s2id_autogen4']/a/span[1]")).sendKeys("Australia");
		driver.findElement(By.xpath("//*[@id='VISA']/form/div[2]/div/button")).click();
	}
	
	public void clickOnHotels(){
		lblHotels.click();
		lblHotels.click();
	}


	public void clickOnFlights() {
		// TODO Auto-generated method stub
		
	}


	public void enterLocationInfo() {
		//txtLocation.sendKeys("Bangalore" KEYS.en);
		
	}
}
