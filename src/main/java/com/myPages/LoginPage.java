/**
 * 
 */
package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author LT-SACH
 *
 */
public class LoginPage extends BasePage {

	private By txt_emailId = By.id("username");
	private By txt_password =By.id("password");
	private By btn_loginButton = By.id("loginBtn");
	private By header = By.xpath("//div/i18n-string[contains(text(),'have an account')]");
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the txt_emailId
	 */
	public WebElement getEmailId() {
		return getElement(txt_emailId);
	}

	/**
	 * @return the txt_password
	 */
	public WebElement getPassword() {
		return getElement(txt_password);
	}

	/**
	 * @return the btn_loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(btn_loginButton);
	}
	
	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		
		return getPageTitle();
	}
	
public String getLoginPageHeader() {
		
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String password) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		
		return getInstance(HomePage.class);		
	}	
	

}
