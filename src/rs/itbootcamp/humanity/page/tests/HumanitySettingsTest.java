package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityHome.clickLogInBtn(driver);
		HumanityHome.clickEmailUser(driver);
		HumanityHome.enterEmailUser(driver, "hikaneh@temp-link.net");
		HumanityHome.clickPassField(driver);
		HumanityHome.enterPassField(driver, "trepavica");
		HumanityHome.clicklogInbtn(driver);
		
		HumanityMenu.clickSettings(driver);
		
		HumanitySettings.getCountry(driver);
		HumanitySettings.selectCountry(driver, "Serbia");
		HumanitySettings.getDefaultLanguage(driver);
		HumanitySettings.selectDefaultLanguage(driver, "American English");
		HumanitySettings.getTimeZone(driver);
		HumanitySettings.selectTimeZone(driver, "24 hour");
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
