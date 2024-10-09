package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppLocators.HomePageLocators;

public class homePom {
	WebDriver driver;
	public homePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateHomePage(String userType) {
		baseClass.waitUntil(HomePageLocators.focusedForYouTab, 50);
		baseClass.waitUntil(HomePageLocators.focusedHomeTab, 10);
		baseClass.waitUntil(HomePageLocators.discoveryLogo,10);
		if(userType.equals("anonymous")) {
			//profile and my-list should not be visible in side navigation
			//My-list button on primary hero should not be visible
			//On selecting start watching button on primary hero, sign up CTA should be displayed
		}
	}
}
