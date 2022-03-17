package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private By header =By.xpath("//h1/i18n-string[@data-key='dashboard-library.header']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	//page actions
	
	public String getHomePageTitle() {
		
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		
		return getPageHeader(header);
	}

}
