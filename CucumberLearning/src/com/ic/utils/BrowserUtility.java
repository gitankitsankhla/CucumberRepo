package com.ic.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {

	private static final Logger logger = LoggerFactory.getLogger(BrowserUtility.class);

	public static WebDriver openBrowser(WebDriver driver, String browserName, String appUrl)

	{
		logger.info("Opening Browser: " + browserName);
		logger.info("Entering Application URL: " + appUrl);

		// Chrome
		if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("WebDriver.chrome.driver",
					"D:\\RISI\\BrowserDriver\\ChromeDriverSetup\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;

			// Firefox
		} else if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("WebDriver.firefox.driver",
					"D:\\RISI\\BrowserDriver\\FirefoxDriverSetup\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;

			// IE
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\RISI\\BrowserDriver\\IEDriverSetup\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;

		}

		return driver;

	}

	// Closing Browser
	public static void closeBrowser(WebDriver driver) {

		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();

	}

}
