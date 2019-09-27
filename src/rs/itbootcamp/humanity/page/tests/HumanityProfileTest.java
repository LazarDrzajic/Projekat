package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileTest {
	public static boolean ProfileTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityLogInExcelTest.logInAction(driver);	
		Thread.sleep(3000);
		HumanityProfile.clickDropdownBtn(driver);
		HumanityProfile.clickProfileBtn(driver);
		Thread.sleep(3000);
		HumanityProfile.clickDropdownBtn(driver);
		HumanityProfile.clickSettingsBtn(driver);
		Thread.sleep(3000);
		HumanityProfile.clickDropdownBtn(driver);
		HumanityProfile.clickAvailabilityBtn(driver);
		Thread.sleep(3000);
		HumanityProfile.clickDropdownBtn(driver);
		HumanityProfile.getVersion(driver);
		HumanityProfile.clickDropdownBtn(driver);
		HumanityProfile.clickSignOutBtn(driver);
		Thread.sleep(3000);
		driver.quit();
		return true;
	}
}