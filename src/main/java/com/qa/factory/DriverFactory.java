package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public static WebDriver driver;
	
	
	//public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		 
	}
	//This is used to get the driver with ThreadLocal for Parallel execution
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
	}


