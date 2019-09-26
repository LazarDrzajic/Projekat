package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static boolean AddEmployeeTest() throws InterruptedException {
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
		
		HumanityStaff.clickAddEmp(driver);
		HumanityStaff.clickFirstName(driver);
		HumanityStaff.enterFirstName(driver, "Stevica");
		HumanityStaff.clickLastName(driver);
		HumanityStaff.enterLastName(driver, "Kurcubic");
		HumanityStaff.clickEmail(driver);
		HumanityStaff.enterEmail(driver, "stevdza@raditel.com");
		HumanityStaff.clickSaveEmp(driver);
		HumanityStaff.clickCheckEmp(driver);
		
		Thread.sleep(5000);
		driver.quit();
		
		return true;
	}
}
