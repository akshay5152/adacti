package com.pkg.adactindetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
public  WebDriver driver;
	

	
	@FindBy(xpath="//select[@class=\"search_combobox\"]")
	private WebElement location;
	
	@FindBy(xpath="//select[@id=\"hotels\"]")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id=\"room_nos\"]")
	private WebElement roomnos;
	
	@FindBy(xpath="//select[@id=\"adult_room\"]")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@id=\"child_room\"]")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@id=\"Submit\"]")
	private WebElement submit;
	
public Search_Hotel(WebDriver  driver4) {	
	this.driver = driver4;
	PageFactory.initElements(driver4, this);
}

public WebElement getlocation() {
	return location;
	 
}

public WebElement getHotel() {
	return hotels;
	
}

public WebElement getroomtype() {
	return roomtype ;
	
}

public WebElement getroomnos() {
	return roomnos;
	
}

public WebElement getadultroom() {
	return adultroom;
	
}

public WebElement getchildroom() {
	return childroom;
	
}


public WebElement getsubmit() {
	return submit;
	
}


}
