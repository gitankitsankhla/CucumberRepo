package com.ic.pom;

import org.openqa.selenium.By;

public class NewsPage {
	
	
	public static By searchUnderNewsTab = By.xpath("//a[normalize-space()='Search']");
	public static By searchButton = By.xpath("//span[normalize-space()='Search']");
	public static By newsSearchResult = By.xpath("//a[contains(text(),' NEXT ')]");

}
