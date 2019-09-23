package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanitySlika {
	private static final String EMPNAME_XPATH = "//a[contains(text(),'Stevica Kurcubic')]";
	private static final String DETAILSBTN_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOADBTN_XPATH = "//input[@id='fileupload']";

	// Emp Name
	public static WebElement getEmpName(WebDriver driver) {
		return driver.findElement(By.xpath(EMPNAME_XPATH));
	}

	public static void clickEmpName(WebDriver driver) {
		getEmpName(driver).click();
	}

	// Details
	public static WebElement getDetailsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(DETAILSBTN_XPATH));
	}

	public static void clickDetailsBtn(WebDriver driver) {
		getDetailsBtn(driver).click();
	}

	// Upload
	public static WebElement getUploadBtn(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOADBTN_XPATH));
	}

	public static void clickUploadBtn(WebDriver driver) {
		getUploadBtn(driver).click();
	}
}
