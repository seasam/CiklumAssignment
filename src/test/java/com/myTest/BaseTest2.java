package com.myTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.factory.BrowserFactory;
import com.factory.DriverFactory;
import com.myPages.BasePage;
import com.myPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest2 {
	
	BrowserFactory bf = new BrowserFactory();
	
	public Page page;
	public  int i=1;
	
	@BeforeMethod	
	public void setUpTest() {		
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		WebDriver driver = DriverFactory.getInstance().getDriver();	
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://app.hubspot.com/login");
	       page = new BasePage(driver);
	       i=i+1;
	       System.out.println("THE VALUE OF I = : " + i);
	       System.out.println("THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
		//DriverFactory.getInstance().closeBrowser();
	}
}
