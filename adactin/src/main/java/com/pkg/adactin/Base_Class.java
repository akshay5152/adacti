package com.pkg.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	
	public static WebDriver driver;
	
	public static WebDriver browser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\AdactinHotel_App\\Driver\\chromedriver.exe");

			 driver = new  ChromeDriver();
			 driver.manage().window().maximize();
		}
		
		
		else if (type.equalsIgnoreCase("gecko")){
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\selenium\\geckodriver.exe");

			
			 driver = new  FirefoxDriver();
			 driver.manage().window().maximize();
		}
		
				
		return driver;
			
	}

	public static void Clickmethod(WebElement method1) {
		method1.click();
		
	}
	
	public static void Inputmethod(WebElement input,String value) {
		input.sendKeys(value);
			
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void drop_down(WebElement element , int index) {
		Select in = new Select(element);
		in.selectByIndex(index);
		
	}
	public static void quit() {
		driver.quit();
	}
	
	public static void dropdowns(String type,WebElement element,String value) {
		
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
				
		}
		
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
			
		} 
			
        else if (type.equalsIgnoreCase("byIndex")) {
        	int data = Integer.parseInt(value);
        	s.selectByIndex(data);
			
		}
		
		}

		}
		
	
	
	


