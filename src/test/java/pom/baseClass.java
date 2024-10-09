package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AppLocators.HomePageLocators;
import webDriverManager.DrivermanagerClass;

public class baseClass {
	static WebDriverWait wait;
	static WebDriver driver=DrivermanagerClass.getDriver();
	static Actions actions = new Actions(driver);
	public static boolean waitUntil(By element, int timeoutInSeconds) {
	    try {
//	    	wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
	    	driver.findElement(element);
	        return true;
	    } catch (TimeoutException e) {
	    	System.out.println("Failed ");
	        System.err.println("Element not found within " + timeoutInSeconds + " seconds.");
	        return false;
	    }
	}
	public static void tryUntil(By element, String action, int numberOfTimes, int timeoutInSeconds) {
		for (int i = 0; i < numberOfTimes; i++) {
            switch (action) {
                case "LEFT":
                    LEFT();
                    break;
                case "RIGHT":
                    RIGHT();
                    break;
                case "UP":
                    UP();
                    break;
                case "DOWN":
                    DOWN();
                    break;
                case "ENTER":
                    ENTER();
                    break;
                default:
                    System.out.println("Invalid action specified");
                    return;
            }

            if (elementIsVisible(element, timeoutInSeconds)) {
//                System.out.println("Element found after " + (i + 1) + " attempts.");
                break; // Exit loop if element is found
            }
        }
	}
	public static void LEFT() {
        actions.sendKeys(Keys.ARROW_LEFT).perform();	
    }
	public static void RIGHT() {
        actions.sendKeys(Keys.ARROW_RIGHT).perform();	
    }
	public static void DOWN() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();	
    }
	public static void UP() {
        actions.sendKeys(Keys.ARROW_UP).perform();	
    }
	public static void ENTER() {
        actions.sendKeys(Keys.ENTER).perform();	
    }
	private static boolean elementIsVisible(By element, int timeoutInSeconds) {
        try {
//            wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
	    	driver.findElement(element);
            return true; // Element is found and visible
        } catch (Exception e) {
            return false; // Element is not found within the timeout
        }
    }
	
	public static void enterTheText(String text) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	actions.sendKeys(text).perform();

	}
	
	public static WebElement findElement(By element) {
		return driver.findElement(element);
	}
	public static List<WebElement> findElements(By element) {
		// TODO Auto-generated method stub
		return driver.findElements(element);
	}
	

}
