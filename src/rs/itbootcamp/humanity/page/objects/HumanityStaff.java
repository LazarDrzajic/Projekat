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
	
	
	//Login for tests
	private static final String LOGINNAME_XPATH = "//input[@id='_asf";
	private static final String LOGINLASTNAME_XPATH = "//input[@id='_asl";
	private static final String LOGINEMAIL_XPATH = "//input[@id='_ase";
	private static final String DODATAK_XPATH = "']";

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
	//For tests
	//First name
		public static WebElement getLoginFirstName(WebDriver driver, int red) {
			return driver.findElement(By.xpath(LOGINNAME_XPATH + red + DODATAK_XPATH));
		}

		public static void clickLoginFirstName(WebDriver driver, int red) {
			getLoginFirstName(driver, red).click();
		}

		public static void enterLoginFirstName(WebDriver driver, String data, int red) {
			getLoginFirstName(driver, red).sendKeys(data);
		}

		// Last name
		public static WebElement getLoginLastName(WebDriver driver, int red) {
			return driver.findElement(By.xpath(LOGINLASTNAME_XPATH+ red + DODATAK_XPATH));
		}

		public static void clickgetLoginLastName(WebDriver driver, int red) {
			getLoginLastName(driver, red).click();
		}

		public static void enterLoginLastName(WebDriver driver, String data, int red) {
			getLoginLastName(driver, red).sendKeys(data);
		}

		// E mail
		public static WebElement getLoginEmail(WebDriver driver, int red) {
			return driver.findElement(By.xpath(LOGINEMAIL_XPATH+ red + DODATAK_XPATH));
		}

		public static void clickLoginEmail(WebDriver driver, int red) {
			getLoginEmail(driver, red).click();
		}

		public static void enterLoginEmail(WebDriver driver, String data, int red) {
			getLoginEmail(driver, red).sendKeys(data);
		}
}
