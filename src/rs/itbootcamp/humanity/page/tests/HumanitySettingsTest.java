package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {
	public static boolean SettingsTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityLogInExcelTest.logInAction(driver);
		HumanityMenu.clickSettings(driver);
		HumanitySettings.getCountry(driver);
		HumanitySettings.selectCountry(driver, "Malta");
		HumanitySettings.getDefaultLanguage(driver);
		HumanitySettings.selectDefaultLanguage(driver, "American English");
		HumanitySettings.getTimeZone(driver);
		HumanitySettings.selectTimeZone(driver, "24 hour");
		HumanitySettings.clickSaveSettings(driver);
		
		Thread.sleep(5000);
		driver.quit();
		
		return true;
	}
}