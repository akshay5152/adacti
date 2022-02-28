package com.pkg.stepdefinition;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pkg.adactin.Base_Class;
import com.pom.PageObjectManager;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends Base_Class{
	
	  public static WebDriver Driver;
	
	  PageObjectManager pom = new PageObjectManager(driver);

	 

@Given("^user Launch The Adactin Application$")
public void user_Launch_The_Adactin_Application() {
    

	geturl("https://adactinhotelapp.com/");

}

@When("^user Enters The Username In The User Column$")
public void user_Enters_The_Username_In_The_User_Column() {    
		
	Inputmethod(pom.getInstancelogin().getusername(),"akshay5152");
	
}

@When("^user Enters The Password In The Password Column$")
public void user_Enters_The_Password_In_The_Password_Column() {
    
	Inputmethod(pom.getInstancelogin().getpassword(),"6P3C35");
    
}

@Then("^user Clicks The Login Button And It Navigates To The Search Hotel Page$")
public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page(){
    

	Clickmethod(pom.getInstancelogin().getlogin());
	
}

@When("^user Select The Location$")
public void user_Select_The_Location() {
    

	drop_down(pom.getInstancesrh().getlocation(), 3 );
	
}

@When("^user Select The Hotel Name$")
public void user_Select_The_Hotel_Name() {
    

	drop_down(pom.getInstancesrh().getHotel(), 3 );
	
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type(){
    
	drop_down(pom.getInstancesrh().getroomtype(), 3 );
	
}

@When("^user Select No Of Rooms$")
public void user_Select_No_Of_Rooms(){
    
	drop_down(pom.getInstancesrh().getroomnos(), 3);
	
}

@When("^User Select The Adults Per Room$")
public void user_Select_The_Adults_Per_Room() {
    

	drop_down(pom.getInstancesrh().getadultroom(), 3 );
	
}

@When("^USer Select The Child Per Room$")
public void user_Select_The_Child_Per_Room(){
    

	drop_down(pom.getInstancesrh().getchildroom(), 2 );
	
}

@When("^User Clicks The Search Button$")
public void user_Clicks_The_Search_Button(){
    

	Clickmethod(pom.getInstancesrh().getsubmit());
	
}

@When("^user Selecting Hotel Radio Button$")
public void user_Selecting_Hotel_Radio_Button() {
   

	Clickmethod(pom.getinstancesel().getradiobutton());

}

@Then("^user Clicks The Continue Button$")
public void user_Clicks_The_Continue_Button(){
    

	Clickmethod(pom.getinstancesel().getcontinues());
	
}

@When("^user Enters The First Name$")
public void user_Enters_The_First_Name() {
    

	Inputmethod(pom.getinstancesel().getfirstname(),"akshay" );
	
}

@When("^user Enters The Last Name$")
public void user_Enters_The_Last_Name() {
   

	Inputmethod(pom.getinstancesel().getlastname(), "kumar");
	
}

@When("^user ENters The Billing Address$")
public void user_ENters_The_Billing_Address() {
    

    Inputmethod(pom.getinstancesel().getaddress(), "no.4 bridgate street");
    
}

@When("^user Enters the Credit Card Number$")
public void user_Enters_the_Credit_Card_Number() {
   
	Inputmethod(pom.getinstancesel().getccnum(), "1234567890123456");
    
}

@When("^user Enters The Credit Card Type$")
public void user_Enters_The_Credit_Card_Type() {
    

    drop_down(pom.getinstancesel().getcctype(), 2 );
	
}

@When("^user Enters The Expiry Date$")
public void user_Enters_The_Expiry_Date() {
    
	 
    drop_down(pom.getinstancesel().getccmonth(), 3 );
    
}

@When("^user Enters The Expiry Year$")
public void user_Enters_The_Expiry_Year() {
    
	 drop_down(pom.getinstancesel().getexpyear(), 3 );
		
}

@When("^user Enters The Ccvv Number$")
public void user_Enters_The_Ccvv_Number() {
    

	Inputmethod(pom.getinstancesel().getcccvv(), "355");

}

@Then("^User Enters The BookNow Button$")
public void user_Enters_The_BookNow_Button() {
    
	 Clickmethod(pom.getInstancebook().getbooknow());
		
}

@Then("^user Clicks The Logout Button$")
public void user_Clicks_The_Logout_Button() {
   
	System.out.println("hotel booked successfully");
	
}


}
