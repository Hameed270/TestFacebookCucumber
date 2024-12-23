package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class homepage {

	private WebDriver driver;
	private By accountSec = By.cssSelector("div#columns li");


	public homepage(WebDriver driver) {
		this.driver=driver;
	}
    
	public String getAccountPagetitle() {
		return driver.getTitle();
	}
	public int getAccountsectioncount() {
		return driver.findElements(accountSec).size();
	}

	public List<String> getAccountlabelList() {
		List<String> accountList = new ArrayList<>();
		List<WebElement> labelList = driver.findElements(accountSec);
		for(WebElement e : labelList) {
			String text = e.getText();	 
			System.out.println(text);
			accountList.add(text);
		}
		return accountList;
	}





}
