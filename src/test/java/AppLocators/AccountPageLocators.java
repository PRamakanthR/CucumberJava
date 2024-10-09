package AppLocators;

import org.openqa.selenium.By;

public class AccountPageLocators {
	public static final By accountPageTitle=By.xpath("//tv-menu[contains(@class,'accountSubnav')]//div[contains(text(),'Account')]");
	public static final By focussedSettingsTab=By.xpath("//dp-accounttab[contains(@id,'subnav-Settings') and @selected='true']");
	public static final By focussedSignInButton=By.xpath("//dp-button[contains(@id,'button-signin') and @selected='true']");
	public static final By focussedSignInWithEmailButton=By.xpath("//dp-button[contains(@aria-label,'Sign In With Email button 2 of 2') and @selected='true']");
	public static final By focussedRefreshButton=By.xpath("//dp-activatebutton[contains(@id,'refresh-button') and @selected='true']");
	public static final By focussedEmailInputFeild=By.xpath("//dp-email[contains(@id,'signin-email-input' and @selected='true')]");
	public static final By focussedPasswordFeild=By.xpath("//dp-password[@selected='true' and contains(@class, 'signin_password')]");
	public static final By emailInputFeildEntered=By.xpath("//dp-email[contains(@id,'signin-email-input')]");
	public static final By passwordFeildEntered=By.xpath("//dp-password[contains(@class, 'signin_password')]");
	public static final By focusedSignInWithEmailbutton=By.xpath("//dp-button[contains(@id,'signInButton') and @selected='true']");
	
	
	public static final String authEmail="k@l.com";
	public static final String authpassword="Qwerfd123!";

}
