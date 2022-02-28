package com.pkg.adactinrun;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.pkg.adactin.Base_Class;
import com.pom.PageObjectManager;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\pkg\\adactin",glue ="com.pkg.stepdefinition",
dryRun =false,
monochrome=true,
strict=true,
plugin= {"html:Report/html_report","json:report/jsonreport.json","pretty"})


public class Runner_Class  extends Base_Class{
	
	public static WebDriver Driver;
	
	         
	@BeforeClass
	public static void Set_Up() {       
		
		driver = Base_Class.browser("chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {
		
		
		driver.close();

	}

   

}
	





