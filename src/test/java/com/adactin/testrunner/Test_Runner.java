package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactinbase.com.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome= true,
dryRun=false)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanseCR().getBrowser();
		driver = BaseClass.browserLaunch(browser);

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
