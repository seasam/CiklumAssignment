package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myPages.BasePage;
import com.myPages.HomePage;
import com.myPages.LoginPage;
import com.myPages.Page;

public class ParallelTest2 extends BaseTest2{
	
	@Test
	public void parallelTestMethodOne() throws InterruptedException {
      //HomePage homepage =page.getInstance(LoginPage.class).doLogin("seasam18@gmail.com", "GiveOne@123");
	   
      
     // String header =homepage.getHomePageHeader();	
		//System.out.println(header);
		//Assert.assertEquals(header, "Dashboard Library");
		
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWONE--");
		  System.out.println("TEST 1 TOP THE VALUE OF I = : " + i);
	       System.out.println("TEST 1 TOP THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

		Thread.sleep(6000);
		loginpage.getEmailId().sendKeys("TEST01first");
		loginpage.getPassword().sendKeys("TEST01P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST01SEC");
		loginpage.getPassword().sendKeys("#TEST01P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST01THIRD");
		loginpage.getPassword().sendKeys("#TEST01P303");
		Thread.sleep(3000);
		   System.out.println("TEST 1 BOTTOM THE VALUE OF I = : " + i);
	       System.out.println("TEST 1 BOTTOM THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

	}
	
	@Test
	public void parallelTestMethodTwo() throws InterruptedException {
		//Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWTWO--");
		System.out.println("TEST 2 TOP THE VALUE OF I = : " + i);
	       System.out.println("TEST 2 TOP THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

		Thread.sleep(6000);
		loginpage.getEmailId().sendKeys("TEST02first");
		loginpage.getPassword().sendKeys("TEST02P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST02SEC");
		loginpage.getPassword().sendKeys("#TEST02P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST02THIRD");
		loginpage.getPassword().sendKeys("#TEST02P303");
		Thread.sleep(6000);
		
		System.out.println("TEST 2 BOTTOM THE VALUE OF I = : " + i);
	       System.out.println("TEST 2 BOTTOM THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

		
	}
	
	@Test
	public void parallelTestMethodThree() throws InterruptedException {
		//Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWTHREE--");
		
		System.out.println("TEST 33 TOP THE VALUE OF I = : " + i);
	       System.out.println("TEST 33 TOP THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

		Thread.sleep(6000);
		loginpage.getEmailId().sendKeys("TEST03first");
		loginpage.getPassword().sendKeys("TEST03P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST03SEC");
		loginpage.getPassword().sendKeys("#TEST03P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST03THIRD");
		loginpage.getPassword().sendKeys("#TEST03P303");
		Thread.sleep(9000);
		
		System.out.println("TEST 33 BOTTOM THE VALUE OF I = : " + i);
	       System.out.println("TEST 33 BOTTOM THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

	}
	
	@Test
	public void parallelTestMethodFour() throws InterruptedException {
		//Page page = new BasePage(DriverFactory.getInstance().getDriver());
		LoginPage loginpage =page.getInstance(LoginPage.class) ;
		loginpage.getEmailId().sendKeys("WINDOWFOUR--");
		System.out.println("TEST 44 TOP THE VALUE OF I = : " + i);
	       System.out.println("TEST 44 TOP THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());

		Thread.sleep(6000);
		loginpage.getEmailId().sendKeys("TEST044first");
		loginpage.getPassword().sendKeys("TEST044P101");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST044SEC");
		loginpage.getPassword().sendKeys("#TEST044P202");
		Thread.sleep(2000);
		loginpage.getEmailId().sendKeys("#TEST044THIRD");
		loginpage.getPassword().sendKeys("#TEST044P303");
		Thread.sleep(9000);
		System.out.println("TEST 44 BOTTOM THE VALUE OF I = : " + i);
	       System.out.println("TEST 44 BOTTOM THE VALUE OF PAGE = : " + page.toString() +" : " + page.hashCode());
// adding a change for implementing reset
	}

}
