package com.adactinpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "check_all")
	private WebElement checkbtn;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public LogOut(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	
	public WebElement getCheckbtn() {
		return checkbtn;
	}

	public WebElement getLogout() {
		return logout;
	}

}
