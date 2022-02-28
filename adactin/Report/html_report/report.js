$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking Application",
  "description": "",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enters The Username In The User Column",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enters The Password In The Password Column",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 10558220800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Username_In_The_User_Column()"
});
formatter.result({
  "duration": 1663887700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Password_In_The_Password_Column()"
});
formatter.result({
  "duration": 310765100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2356506200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Searching The Hotels",
  "description": "",
  "id": "adactin-hotel-booking-application;searching-the-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Select The Hotel Name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select No Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "USer Select The Child Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Clicks The Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 711396800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Name()"
});
formatter.result({
  "duration": 264992300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 258094800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_No_Of_Rooms()"
});
formatter.result({
  "duration": 286961000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 277220200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Child_Per_Room()"
});
formatter.result({
  "duration": 232458300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Search_Button()"
});
formatter.result({
  "duration": 1119310000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Searching The Select Hotels",
  "description": "",
  "id": "adactin-hotel-booking-application;searching-the-select-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user Selecting Hotel Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Clicks The Continue Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Selecting_Hotel_Radio_Button()"
});
formatter.result({
  "duration": 120057600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Continue_Button()"
});
formatter.result({
  "duration": 1710715900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Booking A Hotel",
  "description": "",
  "id": "adactin-hotel-booking-application;booking-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "user Enters The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Enters The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user ENters The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enters the Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enters The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enters The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enters The Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enters The Ccvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Enters The BookNow Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_First_Name()"
});
formatter.result({
  "duration": 1643680600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Last_Name()"
});
formatter.result({
  "duration": 274321100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_ENters_The_Billing_Address()"
});
formatter.result({
  "duration": 416371200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_the_Credit_Card_Number()"
});
formatter.result({
  "duration": 301012700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 268234200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Expiry_Date()"
});
formatter.result({
  "duration": 268151100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Expiry_Year()"
});
formatter.result({
  "duration": 247593300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Ccvv_Number()"
});
formatter.result({
  "duration": 126958600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_BookNow_Button()"
});
formatter.result({
  "duration": 250558800,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "booking Confirmation",
  "description": "",
  "id": "adactin-hotel-booking-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "user Clicks The Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Logout_Button()"
});
formatter.result({
  "duration": 280000,
  "status": "passed"
});
});