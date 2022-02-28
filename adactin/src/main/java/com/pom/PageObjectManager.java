package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pkg.adactindetails.Book_Now;
import com.pkg.adactindetails.Login;
import com.pkg.adactindetails.Search_Hotel;
import com.pkg.adactindetails.Select_Hotel;

public class PageObjectManager {
	
	
public WebDriver driver;
	
	private Login log;
	
	private Book_Now book;
	
	private Search_Hotel srh;
	
	private Select_Hotel sel;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public Login getInstancelogin() {
		
		
		if (log==null) {
			
			log = new Login(driver);
			
		}
		return log;
		
	}
	
	public Book_Now getInstancebook() {
		
		if (book == null) {
			
			book = new Book_Now(driver);
				
		}
		return book;
	}
	
	public Search_Hotel getInstancesrh() {
		
		if (srh == null) {
			
			srh = new Search_Hotel(driver);
					
		}
		return srh;
	}

	public Select_Hotel getinstancesel() {
		
		if (sel == null) {
			
			sel = new Select_Hotel(driver);
			
		}
		return sel;
		
		
		
	}

}
