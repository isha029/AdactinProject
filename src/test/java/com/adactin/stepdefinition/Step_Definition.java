package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.testrunner.Test_Runner;
import com.adactinbase.com.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver=Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	
	@Given("^user Successfully Launch The Adactin Url In The Browser$")
	public void user_Successfully_Launch_The_Adactin_Url_In_The_Browser() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanseCR().getUrl();
	browserOpen(url);
	}

	@When("^user Enter The Username In The Field$")
	public void user_Enter_The_Username_In_The_Field() throws Throwable {
	   sendTheValues(pom.getInstanceLogin().getUser(), "Monisha1234");
	}

	@When("^user Enter The Password In The Field$")
	public void user_Enter_The_Password_In_The_Field() throws Throwable {
		sendTheValues(pom.getInstanceLogin().getPass(), "newpassword");
	   
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    	clickOnElement(pom.getInstanceLogin().getLog());
	}

	@When("^user Select The Location In Select Location Field$")
	public void user_Select_The_Location_In_Select_Location_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getLocation(), "index", "1");
	}

	@When("^user Select The Hotels In Select Hotel Field$")
	public void user_Select_The_Hotels_In_Select_Hotel_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getHotel(), "index", "2");}

	@When("^user Select Room Type In Select Room Type Field$")
	public void user_Select_Room_Type_In_Select_Room_Type_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getRoomtype(), "index", "1");
		}

	@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getRoomnos(), "index", "1");
		}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		clearTheElement(pom.getInstanceSearch().getCheckin());
		sendTheValues(pom.getInstanceSearch().getCheckin(), "18/06/2021");

	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		clearTheElement(pom.getInstanceSearch().getCheckout());
		sendTheValues(pom.getInstanceSearch().getCheckout(), "22/06/2021");

	}

	@When("^user Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getAdult(), "value", "2");

	}

	@When("^user Select The Children Per Room In Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
		selectDrop(pom.getInstanceSearch().getChild(), "text", "0 - None");
	}

	@Then("^user Click The Search Button And It Navigate to The Select Hotel$")
	public void user_Click_The_Search_Button_And_It_Navigate_to_The_Select_Hotel() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSeabtn());
	}

	@When("^user Select The Hotel In Select Hotel Field$")
	public void user_Select_The_Hotel_In_Select_Hotel_Field() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getRadio());
	}

	@When("^user Click The Continue Button And It Navigate To The Book A Hotel$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getConbtn());
		iwait();

	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		sendTheValues(pom.getInstanceBook().getFname(), "Hazel");
	}

	@When("^user Enter The Last Name In Last Name field$")
	public void user_Enter_The_Last_Name_In_Last_Name_field() throws Throwable {
		sendTheValues(pom.getInstanceBook().getLname(), "Grace");

	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		sendTheValues(pom.getInstanceBook().getAdd(), "1A, united states");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		String cardno = File_Reader_Manager.getInstance().getInstanseCR().getCardno();
		sendTheValues(pom.getInstanceBook().getCcard(), cardno);
	}

	@When("^user Select The Credit Card Type In Credit Card  Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		selectDrop(pom.getInstanceBook().getCardtype(), "index", "1");
	}

	@When("^user Select The Expiry Date In Select Month And Select Year Field$")
	public void user_Select_The_Expiry_Date_In_Select_Month_And_Select_Year_Field() throws Throwable {
		selectDrop(pom.getInstanceBook().getMnexpriy(), "value", "9");
		selectDrop(pom.getInstanceBook().getYrexpriy(), "text", "2022");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getInstanseCR().getCvv();
		sendTheValues(pom.getInstanceBook().getCvv(), cvv);
		takePicture();

	}

	@Then("^user click The Book Now Button And It Navigate To The Booking Confirmation$")
	public void user_click_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation() throws Throwable {
		clickOnElement(pom.getInstanceBook().getBookbtn());
		iwait();

	}

	@Then("^user Click The My Itinerary Button And It Navigate To Booking Itinerary$")
	public void user_Click_The_My_Itinerary_Button_And_It_Navigate_To_Booking_Itinerary() throws Throwable {
		clickOnElement(pom.getInstanceConfrim().getItinerbtn());
	}

	@When("^user Click The CheckAll Button$")
	public void user_Click_The_CheckAll_Button() throws Throwable {
		clickOnElement(pom.getInstanceLogout().getCheckbtn());
		takeSnap();
	}

	@When("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		clickOnElement(pom.getInstanceLogout().getLogout());
	}



	}
