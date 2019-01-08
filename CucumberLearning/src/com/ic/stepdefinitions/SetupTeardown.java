package com.ic.stepdefinitions;

import static com.ic.utils.BrowserUtility.closeBrowser;
import static com.ic.utils.BrowserUtility.openBrowser;

import org.openqa.selenium.WebDriver;

import com.ic.utils.PropertyFileReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetupTeardown extends PropertyFileReader {

	public static WebDriver driver;

	@Before
	public void setUp() throws Exception {

		String browser = getData("browserName");
		String url = getData("appUrl");

		driver = openBrowser(driver, browser, url);

	}

	@After
	public void tearDown() {

		closeBrowser(driver);
	}

}