package com.ic.pom;

import org.openqa.selenium.By;

public class HeaderTabsPage {

	public static By userMenu = By
			.xpath("//div[@class='centered']//nav[@class='global-nav']//li//i[@class='fa fa-angle-down']");
	public static By preference = By.xpath("//a[contains(text(),'Preferences')]");
	public static By defaultHomepage = By.xpath("//a[contains(text(),'Default Homepage')]");
	public static By selectDashboard = By.xpath("//input[@id='homepageID' and @value='7']");
	public static By submit = By.xpath("//span[@class='submit-data-txt']");
	public static By logOut = By.xpath("//a//i[@class='fa fa-sign-out']");
	public static By dashboardTab = By.xpath("//li[@class='current dashboards-menu']");
	public static By supplierTab = By.xpath("//a[normalize-space()='Suppliers']");
	public static By newsTab = By.xpath("//a[normalize-space()='News']");
}
