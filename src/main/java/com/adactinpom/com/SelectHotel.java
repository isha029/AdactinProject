package com.adactinpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	
	
public  WebDriver driver;

public WebDriver getDriver() {
	return driver;
}

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(xpath="//input[@id='continue']")	
private WebElement conbtn;


public SelectHotel(WebDriver Adriver) {
	this.driver = Adriver;
	PageFactory.initElements(Adriver, this);
}

public WebElement getRadio() {
	return radio;
}

public WebElement getConbtn() {
	return conbtn;
}


	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
