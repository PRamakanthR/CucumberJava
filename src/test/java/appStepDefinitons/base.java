package appStepDefinitons;
import org.openqa.selenium.WebDriver;

import pom.baseClass;
import webDriverManager.DrivermanagerClass;
public class base {
	protected static WebDriver driver;
	protected baseClass base;
	public base() {
		driver=DrivermanagerClass.getDriver();
		base =new baseClass();
	}
}
