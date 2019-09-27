package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySlika;

public class HumanityEditStaffTest {
	public static boolean staffTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityLogInExcelTest.logInAction(driver);
		
		HumanityMenu.clickStaff(driver);
		
		HumanitySlika.clickEmpName(driver);
		HumanitySlika.clickDetailsBtn(driver);
		HumanityEditStaff.SetImage(driver);
		HumanityEditStaff.clickNicknameField(driver);
		HumanityEditStaff.enterNickname(driver, "Veverica");
		HumanityEditStaff.clickSaveChangesBtn(driver);
		
		Thread.sleep(4000);
		driver.quit();
		
		return true;
		
	}
}
