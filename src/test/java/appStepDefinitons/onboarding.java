package appStepDefinitons;

import io.cucumber.java.en.*;
import pom.accountPom;
import pom.onboardingPom;
public class onboarding extends base{
	onboardingPom onboard=new onboardingPom(driver);
	accountPom account=new accountPom(driver);
	@Given("I launch the DiscoveryPlus app")
	public void i_launch_the_discovery_plus_app() {
		onboard.launchapp();
	}

	@When("I land on home page as {string} user")
	public void i_land_on_home_page_as_user(String userType) {
		onboard.validateHomePage(userType);
	}

	@Then("I navigate to the {string} page")
	public void i_navigate_to_the_page(String pageName) throws InterruptedException {
		onboard.navigateToPage(pageName);
	}

	@Then("I login to the app as {string} user")
	public void i_login_to_the_app_as_user(String usertype) throws InterruptedException {
		account.loginToApp(usertype);
	}

	@Then("I select {string} profile")
	public void i_select_profile(String string) {
	}
	
	@When("I validate the home page layout and navigation elements for {string} user")
	public void i_validate_the_home_page_layout_and_navigation_elements_for_user(String userType) {
	    
	}
}
