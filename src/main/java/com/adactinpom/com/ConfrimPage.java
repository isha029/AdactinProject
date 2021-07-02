package com.adactinpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfrimPage {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "my_itinerary")
	private WebElement itinerbtn;

	public ConfrimPage(WebDriver Adriver) {
		this.driver = Adriver;
		PageFactory.initElements(Adriver, this);
	}

	public WebElement getItinerbtn() {
		return itinerbtn;
	}

}
