/**
 * 
 */
package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import com.myPages.HomePage;
import com.myPages.LoginPage;

/**
 * @author LT-SACH
 *
 */
public class LoginPageTest extends BaseTest{
	
	@Test	
	public void verifyloginPageTitleTest(){
		
		String title =page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
		
	}
	
	@Test	
	public void verifyloginPageHeaderTest() {
		
		String header =page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
		
	}
	
	@Test
	public void doLoginTest() {
		HomePage homepage =page.getInstance(LoginPage.class).doLogin("seasam18@gmail.com", "GiveOne@123");
		
		
		String header =homepage.getHomePageHeader();	
		System.out.println(header);
		Assert.assertEquals(header, "Dashboard Library");
	}	
	

}
