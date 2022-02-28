package com.pkg.adactindetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {
	
	public  WebDriver driver;
	
	
	
    @FindBy(xpath = "//input[@id=\"book_now\"]")
    private WebElement booknow;
    
	public Book_Now(WebDriver driver4) {	
		this.driver = driver4;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getbooknow() {
		return booknow;
		
	}

}
