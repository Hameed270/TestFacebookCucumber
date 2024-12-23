package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	// locators created globally 
	private By emailID = By.id("email");
	private By password = By.id("passwd");
	private By SignInbutton = By.name("SubmitLogin");
	private By forgotpwdlink = By.linkText("Forgot your password?");
	
	// contructor of this class provide params webdriver 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//page actions : features of the form of methods
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotpasswrdlinkavail() {
		return driver.findElement(forgotpwdlink).isDisplayed();
	}
	
	public void enterUsername(String username) {
		driver.findElement(emailID).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonLogin() {
		driver.findElement(SignInbutton).click();
	}
	public String accountTitle() {
		return driver.getTitle();
	}
	public homepage doLoginMethod(String un ,String Pwd) {
		System.out.println("Login with: "+un + " and "+ Pwd);
		driver.findElement(emailID).sendKeys(un);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(SignInbutton).click();
		return new homepage(driver);
	}
	
}
