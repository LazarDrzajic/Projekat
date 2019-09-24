package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySlika;

public class HumanitySlikaTest {
	public static boolean SlikaTest() throws InterruptedException {
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
		
		HumanityMenu.clickStaff(driver);
		
		HumanitySlika.clickEmpName(driver);
		HumanitySlika.clickDetailsBtn(driver);
		HumanitySlika.clickUploadBtn(driver);
		
		return true;
	}
}
