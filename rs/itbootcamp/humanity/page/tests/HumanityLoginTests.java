package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests  {

	public static boolean LogInTest() throws InterruptedException {
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
		
		Thread.sleep(5000);
		driver.quit();
		
		return true;
	}
}
