package com.ic.pom;

import org.openqa.selenium.By;

public class SupplierPage {

	public static By searchSupplier = By.xpath("//a[contains(text(),' Search Suppliers')]");
	public static By supplierSearchResult = By
			.xpath("//div[@class='curve-graph-summary']/h2[contains(text(),'Asia - Specialty and Industrial')]");
	public static By regionAsia = By.xpath("//a[contains(text(),'Asia')]");
	public static By gradePackagingPaper = By.xpath("//a[contains(text(),'Packaging Paper')]");
	
}
