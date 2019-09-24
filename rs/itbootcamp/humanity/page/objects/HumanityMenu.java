package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	private static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']";
	private static final String SHIFTPLAN_XPATH = "//a[@id='sn_schedule']";
	private static final String TIMECLOCK_XPATH = "//a[@id='sn_timeclock']";
	private static final String LEAVE_XPATH = "//a[@id='sn_requests']";
	private static final String TRAINING_XPATH = "//a[@id='sn_training']";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']";
	private static final String PAYROLL_XPATH = "//a[@id='sn_payroll']";
	private static final String REPORTS_XPATH = "//a[@id='sn_reports']";
	private static final String SETTINGSBTN_XPATH = "//i[@class='primNavQtip__icon icon-gear']";

	// Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// Shiftplan
	public static WebElement getShiftplan(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLAN_XPATH));
	}

	public static void clickShiftplan(WebDriver driver) {
		getShiftplan(driver).click();
	}

	// Time Clock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_XPATH));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// Payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// Report
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}

	// Settings button
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGSBTN_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
}
