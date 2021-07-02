package com.adactinbase.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	// static
	public static WebDriver driver;

	// browser launch 1
	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Suganth\\eclipse-workspace\\Adactin_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "path");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("INVALID BROWSER");
		}
		// driver methods-maximize 2
		driver.manage().window().maximize();

		return driver;

	}

	// open browser 2
	public static void browserOpen(String Url) {
		driver.get(Url);
	}

	// close browser 3
	public static void browserClose() {
		driver.close();
	}

	// quit browser 4
	public static void quitAllBrowser() {
		driver.quit();
	}

	// get title 5
	public static void getTheTitle() {
		driver.getTitle();
	}

	// current Url 6
	public static void getTheCurrentUrl() {
		driver.getCurrentUrl();
	}

	// navigate To 7
	public static void moveToPage(String url) {
		driver.navigate().to(url);
	}

	// navigate Refresh 8
	public static void restorePage() {
		driver.navigate().refresh();
	}

	// navigate back 9
	public static void moveBack() {
		driver.navigate().back();
	}

	// navigate forward 10
	public static void moveForward() {
		driver.navigate().forward();
	}

	// find Element 11
	public static void tofindTheElement(By searchbutton) {
		WebElement element = driver.findElement(searchbutton);
		System.out.println(element);
	}

	// Simple alert 12
	public static void simpleAlert() {
		Alert salert = driver.switchTo().alert();
		salert.accept();
	}

	// confirm alert 13
	public static void confirmAlert() {
		Alert calert = driver.switchTo().alert();
		calert.accept();
		calert.dismiss();
	}

	// prompt alert 14
	public static void promptAlert(String value) {
		Alert palert = driver.switchTo().alert();
		palert.sendKeys(value);
		palert.accept();
	}

	// actions 15
	// click
	public static void performClick(WebElement element) {

		Actions act = new Actions(driver);
		act.click(element).build().perform();
	}

	// Right click 16
	public static void performContextOpen(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	// double click 17
	public static void performDoubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	// move 18
	public static void performMoveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	// drag 19
	public static void performDrag(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}

	// robot down 20
	public static void autoDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// robot enter 21
	public static void autoEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// frames 22
	public static void oneFrame(int n) {
		driver.switchTo().frame(n);
	}

	// default 23
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	// window handle 24
	public static void manageWindow() {
		driver.getWindowHandle();
	}

	// window handles 25
	public static void managewindows() {
		driver.getWindowHandles();
	}

	// DropDown 26
	public static void getOptionslist(WebElement element) {
		Select s = new Select(element);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement options : alloptions) {
			String text = options.getText();
			System.out.println(text);
		}
	}

	// methods display 27
	public static void elementVisible(WebElement element) {
		boolean display = element.isDisplayed();
		System.out.println(display);
	}

	// methods enable 28
	public static void elementClickable(WebElement element) {
		boolean enable = element.isEnabled();
		System.out.println(enable);
	}

	// methods select 29
	public static void elementSelect(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
	}

	// multiple drop 30
	// select by- index, value, visible 11
	public static void multipleDrop(WebElement element, String options, String input) {
		Select s = new Select(element);
		boolean multi = s.isMultiple();
		System.out.println("Is Multiple? " + multi);
		if (options.equalsIgnoreCase("index")) {
			// string integer convert
			int p = Integer.parseInt(input);
			s.selectByIndex(p);
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(input);
		} else {
			System.out.println("invaild select");
		}
	}

//
	public static void selectDrop(WebElement element, String options, String input) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			// string integer convert
			int p = Integer.parseInt(input);
			s.selectByIndex(p);
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(input);
		} else {
			System.out.println("invaild select");
		}
	}

	// select methods-All selected, first selected
	// all selected 31
	public static void selectAll(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement alloptions : allSelectedOptions) {
			String text = alloptions.getText();
			System.out.println(text);
		}
	}

	// first selected 32
	public static void firstSelect(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	// wait
	// implicit 33
	public static void iwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// explicit 34
	public static void ewait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// fluent wait 35
	// public static void fwait() {
	//
	// Wait wait1=new
	// FluentWait(driver).withTimeout(60,TimeUnit.SECONDS).pollingEvery(10,
	// TimeUnit.SECONDS).ignoring(null);
	// }

	// Take Screenshot 36
	public static void takePicture() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Suganth\\eclipse-workspace\\Adactin_Project\\Screenshots\\a1.png");
		FileUtils.copyFile(source, destination);
	}

	// scroll up and down 37
	// down
	public static void goDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	// up
	public static void goUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// scroll by pixels 38
	public static void navigatePixels() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	// WebElement 39
	public static void clickOnElement(WebElement element) {
		element.click();

	}

	// clear 40
	public static void clearTheElement(WebElement element) {
		element.clear();

	}

	// sending 41
	public static void sendTheValues(WebElement element, String values) {
		element.sendKeys(values);
	}

	// text 42
	public static void getTheText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// Attribute 43
	public static void getTheAttribute(WebElement element, String input) {
		String value = element.getAttribute(input);
		System.out.println(value);
	}

	// cssvalue 44
	public static void getTheCssValues(WebElement element, String input) {
		String cssValue = element.getCssValue(input);
		System.out.println(cssValue);
	}

	// check box 45
	public static void Declaration(WebElement element) {
		element.click();
	}

	// location 46
	public static void getTheLocation(WebElement element) {
		Point xyvalue = element.getLocation();
		int x = xyvalue.getX();
		int y = xyvalue.getY();
		System.out.println("x is:" + x + "y is:" + y);
	}

	// thread
	public static void sleep() throws Throwable {
		Thread.sleep(3000);
	}

	// Take Screenshot 36
	public static void takeSnap() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Suganth\\eclipse-workspace\\Adactin_Project\\Screenshots\\b1.png");
		FileUtils.copyFile(source, destination);
	}

}
