package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinpom.com.BookingHotel;
import com.adactinpom.com.ConfrimPage;
import com.adactinpom.com.LogOut;
import com.adactinpom.com.LoginPage;
import com.adactinpom.com.SearchHotel;
import com.adactinpom.com.SelectHotel;

public class Page_Object_Manager {
	public static WebDriver driver;

	private LoginPage login;
	private SearchHotel search;
	private SelectHotel select;
	private BookingHotel book;
	private ConfrimPage confrim;
	private LogOut logout;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public LoginPage getInstanceLogin() {
		login = new LoginPage(driver);
		return login;
	}

	public SearchHotel getInstanceSearch() {
		search = new SearchHotel(driver);
		return search;
	}

	public SelectHotel getInstanceSelect() {
		select = new SelectHotel(driver);
		return select;
	}

	public BookingHotel getInstanceBook() {
		book = new BookingHotel(driver);
		return book;
	}

	public ConfrimPage getInstanceConfrim() {
		confrim = new ConfrimPage(driver);
		return confrim;
	}

	public LogOut getInstanceLogout() {
		logout = new LogOut(driver);
		return logout;
	}

}
