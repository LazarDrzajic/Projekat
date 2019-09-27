package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityMenuTest {
	public static boolean MenuTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityLogInExcelTest.logInAction(driver);
		HumanityMenu.clickDashboard(driver);
		Thread.sleep(3000);
		HumanityMenu.clickShiftplan(driver);
		Thread.sleep(3000);
		HumanityMenu.clickTimeClock(driver);
		Thread.sleep(3000);
		HumanityMenu.clickLeave(driver);
		Thread.sleep(3000);
		HumanityMenu.clickTraining(driver);
		Thread.sleep(3000);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		HumanityMenu.clickPayroll(driver);
		Thread.sleep(3000);
		HumanityMenu.clickReports(driver);
		Thread.sleep(3000);
		HumanityMenu.clickSettings(driver);
		Thread.sleep(4000);
		driver.quit();
		return true;
}
}