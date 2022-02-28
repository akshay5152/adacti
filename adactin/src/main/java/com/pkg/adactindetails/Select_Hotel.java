package com.pkg.adactindetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id=\"radiobutton_0\"]")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id=\"continue\"]")
	private WebElement continues;
	
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id=\"address\"]")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id=\"cc_num\"]")
	private WebElement ccnum;
	
	@FindBy(xpath = "//select[@id=\"cc_type\"]" )
	private WebElement cctype;
	
	@FindBy(xpath = "//select[@id=\"cc_exp_month\"]")
	private WebElement ccmonth;
	
	@FindBy(xpath = "//select[@id=\"cc_exp_year\"]")
	private WebElement expyear;
	
	@FindBy(xpath = "//input[@name=\"cc_cvv\"]")
	private WebElement cccvv;
	
	 public Select_Hotel(WebDriver driver3) {
		 this.driver = driver3;
		 PageFactory.initElements(driver, this);
		 
			}
	
	 public WebElement getradiobutton() {
		return radiobutton;
		 
	 }
	 
	 public WebElement getcontinues() {
		return continues;
		 
	 }
	 
	 public WebElement getfirstname() {
		return firstname;
		 
	 }
	 
	 public WebElement getlastname() {
		return lastname;
		 
	 }
	
	public WebElement getaddress() {
		return address;
		
	}
	
	public WebElement getccnum() {
		return ccnum;
		
	}
	
     public WebElement getcctype() {
		return cctype;
    	 
     }
     
     public WebElement getccmonth() {
		return ccmonth;
    	 
     }
     
     public WebElement getexpyear() {
		return expyear;
    	 
     }
     
     public WebElement getcccvv() {
		return cccvv;
    	 
     }

}
