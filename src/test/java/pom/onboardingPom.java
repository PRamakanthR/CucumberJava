package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppLocators.HomePageLocators;

public class onboardingPom {
	static WebDriver driver;
	String URL="https://staging-gqa.dplus.dev.cd-tv.mercury.dnitv.com/welcome?debug=true&sonicBase=prod&realm=dplay&country=dplus_uk";
   

	
	
//	WebElement 
	public onboardingPom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	public void launchapp() {
		driver.manage().window().maximize();
		driver.get(URL);
		baseClass.waitUntil(HomePageLocators.splashScreen, 10);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		driver.findElement(By.xpath("//dp-genremenu//dp-genremenuitem[contains(@selected,'true')]//div[contains(text(),'For You')]"));
		baseClass.waitUntil(HomePageLocators.focusedForYouTab, 50);
		baseClass.waitUntil(HomePageLocators.focusedHomeTab, 10);
		baseClass.waitUntil(HomePageLocators.discoveryLogo,10);
	}
	public void validateHomePage(String userType) {
		switch(userType) {
		case "anonymous":
			baseClass.waitUntil(HomePageLocators.focusedForYouTab, 50);
			baseClass.waitUntil(HomePageLocators.focusedHomeTab, 10);
			baseClass.waitUntil(HomePageLocators.discoveryLogo,10);
			break;
		case "multiProfile":
			baseClass.waitUntil(HomePageLocators.focusedForYouTab, 10);
			baseClass.waitUntil(HomePageLocators.focusedHomeTab, 10);
			baseClass.waitUntil(HomePageLocators.discoveryLogo,10);
			break;
		}
	}
	
	public static void navigateToPage(String pagename) throws InterruptedException {
	    Actions actions = new Actions(driver);
	    baseClass.tryUntil(HomePageLocators.focusedSideNav, "LEFT", 5, 6);
	    // Find all sidebar items
	    List<WebElement> sidebarItems = baseClass.findElements(HomePageLocators.sideNavElements);
	    int sizeOfList=sidebarItems.size();
	    String[] arrayOfSideNav=new String[sizeOfList];
	    for(int i=0;i<sizeOfList;i++) {
	    	int n=i+1;
	    	arrayOfSideNav[i]=driver.findElement(By.xpath("(//dp-sidebaritem//div[1])["+n+"]")).getText();
//	    	arrayOfSideNav[i]=baseClass.findElement(HomePageLocators.sideNavElements).getText();
	    }
	    int currentIndex = 0;
	    int dupcurrentIndex=0;
	    int targetIndex = 0;
	    int duptargetIndex = 0;

	    String ele=baseClass.findElement(HomePageLocators.homePageSidebarItem).getText();
	    for(int i=0;i<sizeOfList;i++) 
	    {
	    	if(arrayOfSideNav[i].equals(ele)) {
	    		currentIndex=dupcurrentIndex+1;
	    		break;
	    	}
	    	dupcurrentIndex++;
	    }
	    for(int i=0;i<sizeOfList;i++) 
	    {
	    	if(arrayOfSideNav[i].equals(pagename)) {
	    		targetIndex=duptargetIndex+1;
	    		break;
	    	}
	    	duptargetIndex++;
	    }
	    // Validate that we found both the current and target items
	    if (currentIndex == -1) {
	        System.err.println("Current focused item not found.");
	        return;
	    }
	    if (targetIndex == -1) {
	        System.err.println("Desired item '" + pagename + "' not found.");
	        return;
	    }
	    // Step 2: Determine the number of steps required to reach the target
	    int steps = targetIndex - currentIndex;

	    // Step 3: Navigate by sending the appropriate number of key presses
	    if (steps > 0) {
	        // Move down if the target is after the current position
	        for (int i = 0; i < steps; i++) {
	            actions.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(1000);
	        }
	    } else if (steps < 0) {
	        // Move up if the target is before the current position
	        for (int i = 0; i < Math.abs(steps); i++) {
	            actions.sendKeys(Keys.ARROW_UP).perform();
	        }
	    }
	    // Step 4: Optionally select the item (e.g., by pressing Enter)
	    baseClass.ENTER();
	}
}
