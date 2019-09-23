package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	private static final String ADDEMPL_XPATH = "//button[@id='act_primary']";
	private static final String FIRSTNAME_XPATH = "//input[@id='_asf1']";
	private static final String LASTNAME_XPATH = "//input[@id='_asl1']";
	private static final String EMAIL_XPATH = "//input[@id='_ase1']";
	private static final String SAVEEMP_XPATH = "//button[@id='_as_save_multiple']";
	private static final String CHECKEMP_XPATH = "//a[@id='sn_staff']";

	// Add employee
	public static WebElement getAddEmp(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPL_XPATH));
	}

	public static void clickAddEmp(WebDriver driver) {
		getAddEmp(driver).click();
	}

	// First name
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRSTNAME_XPATH));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void enterFirstName(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);
	}

	// Last name
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LASTNAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void enterLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	// E mail
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void enterEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	// Save employee
	public static WebElement getSaveEmp(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMP_XPATH));
	}

	public static void clickSaveEmp(WebDriver driver) {
		getSaveEmp(driver).click();
	}

	// Check employee
	public static WebElement getCheckEmp(WebDriver driver) {
		return driver.findElement(By.xpath(CHECKEMP_XPATH));
	}

	public static void clickCheckEmp(WebDriver driver) {
		getCheckEmp(driver).click();
	}
}
