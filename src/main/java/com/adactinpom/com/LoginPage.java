package com.adactinpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement log;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

}
