package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUTUS_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String FULLNAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String STARTBTN_XPATH = "//input[@id='free-trial-link-01']";
	private static final String LOGIN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String FREETRIAL_XPATH = "//a[@class='button pale']";
	private static final String USEREMAIL_XPATH = "//input[@id='email']";
	private static final String PASSWRD_XPATH = "//input[@id='password']";
	private static final String CONFIRMLOGIN_XPATH = "//button[contains(text(),'Log in')]";

	// About us
	public static WebElement getAboutUsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS_XPATH));
	}

	public static void clickAboutUsBtn(WebDriver driver) {
		getAboutUsBtn(driver).click();
	}

	// Full name
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULLNAME_XPATH));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void enterFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

	// E mail
	public static WebElement getEMail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEMail(driver).click();
	}

	public static void enterEMail(WebDriver driver, String data) {
		getEMail(driver).sendKeys(data);
	}

	// Start free trial
	public static WebElement getFreeTrialBtn(WebDriver driver) {
		return driver.findElement(By.xpath(STARTBTN_XPATH));
	}

	public static void clickFreeTrialBtn(WebDriver driver) {
		getFreeTrialBtn(driver).click();
	}

	// Log in button
	public static WebElement getLogInBtn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogInBtn(WebDriver driver) {
		getLogInBtn(driver).click();
	}

	// Free trial button
	public static WebElement getFreetrialBtn(WebDriver driver) {
		return driver.findElement(By.xpath(FREETRIAL_XPATH));
	}

	public static void clickFreetrial(WebDriver driver) {
		getFreetrialBtn(driver).click();
	}

	// E mail user name
	public static WebElement getEmailUser(WebDriver driver) {
		return driver.findElement(By.xpath(USEREMAIL_XPATH));
	}

	public static void clickEmailUser(WebDriver driver) {
		getEmailUser(driver).click();
	}

	public static void enterEmailUser(WebDriver driver, String data) {
		getEmailUser(driver).sendKeys(data);
	}

	// Password field
	public static WebElement getPassField(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWRD_XPATH));
	}

	public static void clickPassField(WebDriver driver) {
		getPassField(driver).click();
	}

	public static void enterPassField(WebDriver driver, String data) {
		getPassField(driver).sendKeys(data);
	}

	// Confirm Log In
	public static WebElement getlogInBtn(WebDriver driver) {
		return driver.findElement(By.xpath(CONFIRMLOGIN_XPATH));
	}

	public static void clicklogInbtn(WebDriver driver) {
		getlogInBtn(driver).click();
	}
}
