package AppLocators;

import org.openqa.selenium.By;
public class HomePageLocators {
    // Locators for splash screen 
    public static final By splashScreen = By.xpath("//div[contains(@id,'loading')]//img[contains(@id,'splashImage')]");
    // Locators for Home page
    public static final By focusedForYouTab = By.xpath("//dp-genremenu//dp-genremenuitem[contains(@selected,'true')]//div[contains(text(),'For You')]");
    public static final By focusedHomeTab = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@hover,'true')]//div[contains(text(),'Home')]");
    public static final By discoveryLogo = By.xpath("//dp-logo//dp-image//img[contains(@src,'/static/client/assets/product/logo.png?f=png&p=true&q=75')]");

    // Locators of Side Navigation Page
    public static final By sideNavElements=By.xpath("//dp-sidebaritem//div[1]");
    public static final By focusedSideNav = By.xpath("//dp-tveapp[contains(@sidebar-focused,'true')]");
    public static final By focusedAccountButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'Account')]");
    public static final By focusedHomeButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'Home')]");
    public static final By focusedBrowseButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'Account')]");
    public static final By focusedEpgButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'TV Guide')]");
    public static final By focusedSearchButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'Search')]");
    public static final By focusedMyListButton = By.xpath("//tv-vbox//tv-menu//dp-sidebaritem[contains(@selected,'true')]//div[contains(text(),'Home')]");

    // Add more locators as needed
    public static final By homePageSidebarItem=By.xpath("//dp-sidebaritem[contains(@selected,'true')]//div[1]");
}
