package com.adactinpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement add;

	@FindBy(id = "cc_num")
	private WebElement ccard;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement mnexpriy;

	@FindBy(id = "cc_exp_year")
	private WebElement yrexpriy;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookbtn;

	
	public BookingHotel(WebDriver Adriver) {
		this.driver = Adriver;
		PageFactory.initElements(Adriver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcard() {
		return ccard;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMnexpriy() {
		return mnexpriy;
	}

	public WebElement getYrexpriy() {
		return yrexpriy;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

}
