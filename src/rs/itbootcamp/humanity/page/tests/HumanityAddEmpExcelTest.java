package rs.itbootcamp.humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddEmpExcelTest {
	public static boolean Addemp() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		HumanityLogInExcelTest.logInAction(driver);

		String srcFile = "C:\\Users\\Test\\Documents\\Data.xls";
		File src = new File(srcFile);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(1);
		int rowcount = sheet1.getLastRowNum();
		HumanityMenu.clickStaff(driver);
		System.out.println(rowcount + " employees.");

		try {
			Random ran = new Random();
			for (int i = 0; i <= rowcount; i++) {
				Thread.sleep(1000);
				HumanityStaff.clickAddEmp(driver);
				HSSFRow r = sheet1.getRow(i);
				if (r != null) {
					String ime = r.getCell(0).getStringCellValue();
					String prezime = r.getCell(1).getStringCellValue();
					String email = r.getCell(2).getStringCellValue();

					HumanityStaff.enterLoginFirstName(driver, ime, 1);
					HumanityStaff.enterLoginLastName(driver, prezime, 1);
					HumanityStaff.enterLoginEmail(driver, ran.nextInt(1000) + email, 1);
					HumanityStaff.clickSaveEmp(driver);

				}

				else {

				}
			}
			HumanityStaff.clickSaveEmp(driver);
		} catch (

		Exception e) {
			System.out.println(e.toString());
		} finally {
			wbe.close();
		}
		return true;
	}
}
