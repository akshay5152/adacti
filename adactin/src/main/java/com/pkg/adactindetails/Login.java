package com.pkg.adactindetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	

	
	@FindBy(xpath="//input[@class=\"login_input\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@class=\"login_button\"]")
	private WebElement login;
		

     public Login(WebDriver driver1) {
    	 this.driver = driver1;
    	 PageFactory.initElements(driver, this);
    	 
     
    	 }
     
     public WebElement getusername() {
		return username;
    	 
     }
     
     public WebElement getpassword() {
		return password;
    	 
     }
     
     public WebElement getlogin() {
		return login;
    	 
     }
     


}
