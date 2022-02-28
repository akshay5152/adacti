Feature: Adactin Hotel Booking Application
Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enters The Username In The User Column
And user Enters The Password In The Password Column
Then user Clicks The Login Button And It Navigates To The Search Hotel Page

Scenario: Searching The Hotels
When user Select The Location
And user Select The Hotel Name
And user Select The Room Type
And user Select No Of Rooms
And User Select The Adults Per Room
And USer Select The Child Per Room
And User Clicks The Search Button

Scenario: Searching The Select Hotels
When user Selecting Hotel Radio Button
Then user Clicks The Continue Button


Scenario: Booking A Hotel
When user Enters The First Name
And user Enters The Last Name
And user ENters The Billing Address
And user Enters the Credit Card Number
And user Enters The Credit Card Type
And user Enters The Expiry Date 
And user Enters The Expiry Year
And user Enters The Ccvv Number
Then User Enters The BookNow Button

Scenario: booking Confirmation
Then user Clicks The Logout Button
  