package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	private static final String DROPDOWNMENU_XPATH = "//div[@id='userm']";
	private static final String PROFILEBTN_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGSBTN_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITYBTN_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGNOUTBTN_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION_XPATH = "//div[@id='humanityAppVersion']";

	// Drop Down
	public static WebElement getDropdownBtn(WebDriver driver) {
		return driver.findElement(By.xpath(DROPDOWNMENU_XPATH));
	}

	public static void clickDropdownBtn(WebDriver driver) {
		getDropdownBtn(driver).click();
	}

	// Profile button
	public static WebElement getProfileBtn(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILEBTN_XPATH));
	}

	public static void clickProfileBtn(WebDriver driver) {
		getProfileBtn(driver).click();
	}

	// Settings button
	public static WebElement getSettingsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGSBTN_XPATH));
	}

	public static void clickSettingsBtn(WebDriver driver) {
		getSettingsBtn(driver).click();
	}

	// Availability button
	public static WebElement getAvailabilityBtn(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITYBTN_XPATH));
	}

	public static void clickAvailabilityBtn(WebDriver driver) {
		getAvailabilityBtn(driver).click();
	}

	// Sign out button
	public static WebElement getSignOutBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUTBTN_XPATH));
	}

	public static void clickSignOutBtn(WebDriver driver) {
		getSignOutBtn(driver).click();
	}

	// Version
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}
}
