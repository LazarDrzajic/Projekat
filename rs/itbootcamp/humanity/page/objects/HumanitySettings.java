package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	private static final String COUNTRYDROPDOWN_XPATH = "//select[@id='country']";
	private static final String DEFAULTLANGUAGE_XPATH = "//select[@name='language']";
	private static final String TIMEZONE_XPATH = "//select[@name='pref_24hr']";

	// Select country
	public static Select getCountry(WebDriver driver) {
        return new Select(driver.findElement(By.xpath(COUNTRYDROPDOWN_XPATH)));
    }
    public static void selectCountry(WebDriver driver, String data) {
        getCountry(driver).selectByVisibleText(data);
    }
	
	// Default language
    public static Select getDefaultLanguage(WebDriver driver) {
        return new Select(driver.findElement(By.xpath(DEFAULTLANGUAGE_XPATH)));
    }
    public static void selectDefaultLanguage(WebDriver driver, String data) {
    	getDefaultLanguage(driver).selectByVisibleText(data);
    }

	// Time zone
    public static Select getTimeZone(WebDriver driver) {
        return new Select(driver.findElement(By.xpath(TIMEZONE_XPATH)));
    }
    public static void selectTimeZone(WebDriver driver, String data) {
    	getTimeZone(driver).selectByVisibleText(data);
    }
}
