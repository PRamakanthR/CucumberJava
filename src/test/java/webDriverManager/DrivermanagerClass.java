package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrivermanagerClass {
	private static WebDriver driver;
	public static void initializeDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	}
	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
	}
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
