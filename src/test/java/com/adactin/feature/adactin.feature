Feature: Hotel Booking In Adactin Webpage

Scenario: Login Page
Given user Successfully Launch The Adactin Url In The Browser
When user Enter The Username In The Field
And user Enter The Password In The Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page
Scenario:
When user Select The Location In Select Location Field
And user Select The Hotels In Select Hotel Field
And user Select Room Type In Select Room Type Field
And user Select The Number Of Rooms In Number Of Rooms Field
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adults Per Room In Adults Per Room Field
And user Select The Children Per Room In Children Per Room Field
Then user Click The Search Button And It Navigate to The Select Hotel

Scenario:
When user Select The Hotel In Select Hotel Field
And user Click The Continue Button And It Navigate To The Book A Hotel

Scenario:
When user Enter The First Name In First Name Field 
And user Enter The Last Name In Last Name field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Select The Credit Card Type In Credit Card  Type Field
And user Select The Expiry Date In Select Month And Select Year Field
And user Enter The CVV Number In CVV Number Field
Then user click The Book Now Button And It Navigate To The Booking Confirmation

Scenario:
Then user Click The My Itinerary Button And It Navigate To Booking Itinerary

Scenario:
When user Click The CheckAll Button
When user Click The Logout Button