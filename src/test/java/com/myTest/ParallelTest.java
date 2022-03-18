package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.factory.DriverFactory;
import com.myPages.BasePage;
import com.myPages.HomePage;
import com.myPages.LoginPage;
import com.myPages.Page;

public class ParallelTest extends BaseTest{
	
	@Test
	public void parallelTestMethodOne() throws InterruptedException {
      //HomePage homepage =page.getInstance(LoginPage.class).doLogin("seasam18@gmail.com", "GiveOne@123");
	   
      
     // String header =homepage.getHomePageHeader();	
		//System.out.println(header);
		//Assert.assertEquals(header, "Dashboard Library");
		Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWONE--");
		loginpage.getEmailId().sendKeys("TEST01first");
		loginpage.getPassword().sendKeys("TEST01P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST01SEC");
		loginpage.getPassword().sendKeys("#TEST01P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST01THIRD");
		loginpage.getPassword().sendKeys("#TEST01P303");
		Thread.sleep(3000);
	}
	
	@Test
	public void parallelTestMethodTwo() throws InterruptedException {
		Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWTWO--");
		loginpage.getEmailId().sendKeys("TEST02first");
		loginpage.getPassword().sendKeys("TEST02P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST02SEC");
		loginpage.getPassword().sendKeys("#TEST02P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST02THIRD");
		loginpage.getPassword().sendKeys("#TEST02P303");
		Thread.sleep(6000);
		
	}
	
	@Test
	public void parallelTestMethodThree() throws InterruptedException {
		Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWTHREE--");
		loginpage.getEmailId().sendKeys("TEST03first");
		loginpage.getPassword().sendKeys("TEST03P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST03SEC");
		loginpage.getPassword().sendKeys("#TEST03P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST03THIRD");
		loginpage.getPassword().sendKeys("#TEST03P303");
		Thread.sleep(9000);
	}

}
