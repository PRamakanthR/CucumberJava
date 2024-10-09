package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppLocators.AccountPageLocators;
import AppLocators.ProfilePageLocators;

public class accountPom {
	WebDriver driver;
	public accountPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void loginToApp(String userType) throws InterruptedException {
		if(userType.equals("anonymous")) {
	    	return;
	    }
		onboardingPom.navigateToPage("Account");
		baseClass.waitUntil(AccountPageLocators.accountPageTitle, 20);
		baseClass.tryUntil(AccountPageLocators.focussedSignInButton, "DOWN", 3, 2);
		baseClass.tryUntil(AccountPageLocators.focussedRefreshButton, "ENTER", 3, 2);
		baseClass.tryUntil(AccountPageLocators.focussedSignInWithEmailButton, "DOWN", 3, 2);
		baseClass.tryUntil(AccountPageLocators.focussedEmailInputFeild, "ENTER", 3, 2);
		baseClass.ENTER();
		if(userType.equals("anonymous")) {
			return;
		}
		else if(userType.equals("authenticated")) {
			baseClass.enterTheText(AccountPageLocators.authEmail);
			baseClass.tryUntil(AccountPageLocators.focussedPasswordFeild, "DOWN", 3, 2);
			baseClass.ENTER();
			baseClass.enterTheText(AccountPageLocators.authpassword);
			baseClass.tryUntil(AccountPageLocators.focusedSignInWithEmailbutton, "DOWN", 4, 2);
			baseClass.ENTER();
			baseClass.waitUntil(ProfilePageLocators.whoIsWatchingTitile, 30);
		}
		
		
	}
}
