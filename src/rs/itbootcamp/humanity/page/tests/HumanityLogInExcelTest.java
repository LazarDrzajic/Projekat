package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLogInExcelTest {
	public static boolean Log() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		logInAction(driver);

		
		driver.quit();

		return true;
	}
	public static void logInAction(WebDriver driver) throws InterruptedException {
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogInBtn(driver);

		String srcFile = "C:\\Users\\Test\\Documents\\Data.xls";

		ExcelUtils.setExcell(srcFile);
		ExcelUtils.setWorkSheet(0);

		String email = ExcelUtils.getDataAt(0, 0);
		String pass = ExcelUtils.getDataAt(0, 1);

		HumanityHome.clickEmailUser(driver);
		HumanityHome.enterEmailUser(driver, email);
		HumanityHome.clickPassField(driver);
		HumanityHome.enterPassField(driver, pass);
		HumanityHome.clicklogInbtn(driver);

		Thread.sleep(10000);
		
		ExcelUtils.closeExcell();
	}
}

