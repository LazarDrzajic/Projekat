package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String CURRENTURL = "https://ledenica.humanity.com/app/staff/list/load/true/";
	private static final String EMPLOYEENAME_XPATH = "//a[contains(text(),'Stevica Kurcubic')]";
	private static final String EDITDETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String EMPLOYEENICKNAME_XPATH = "//input[@id='nick_name']";
	private static final String ADDPROFILEPICTURE_XPATH = "//input[@id='fileupload']";
	private static final String SAVECHANGESBTN_XPATH = "//button[@id='act_primary']";

	// Employee name
	public static WebElement getemployeeName(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS_XPATH));
	}

	public static void clickemployeename(WebDriver driver) {
		getemployeeName(driver).click();
	}

	// Edit details
	public static WebElement getEditDetailsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEENAME_XPATH));
	}

	public static void clickAboutUsBtn(WebDriver driver) {
		getEditDetailsBtn(driver).click();
	}

	// Employee Nickname
	public static WebElement getNicknameField(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEENICKNAME_XPATH));
	}

	public static void clickNicknameField(WebDriver driver) {
		getNicknameField(driver).click();
	}

	public static void enterNickname(WebDriver driver, String data) {
		getNicknameField(driver).sendKeys(data);
	}

	// Employee Picture
	public static WebElement getAddPictureBtn(WebDriver driver) {
		return driver.findElement(By.xpath(ADDPROFILEPICTURE_XPATH));
	}

	public static void clickAddPictureBtn(WebDriver driver) {
		getAddPictureBtn(driver).click();
	}

	// Save changes
	public static WebElement getSaveChangesBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVECHANGESBTN_XPATH));
	}

	public static void clickSaveChangesBtn(WebDriver driver) {
		getSaveChangesBtn(driver).click();
	}
}
