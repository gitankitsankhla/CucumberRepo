package com.ic.utils;

import static com.ic.stepdefinitions.SetupTeardown.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumDrivers {

	private static final Logger logger = LoggerFactory.getLogger(BrowserUtility.class);
	
	// Clear element data
	public static void clearData(By locator) throws Exception {

		waitForElementPresent(locator);
		driver.findElement(locator).clear();
	}

	// Enter data in Input fields
	public static void enterData(By locator, String text) {

		waitForElementPresent(locator);
		driver.findElement(locator).sendKeys(text);

	}

	// Click on element
	public static void click(By locator) {

		waitForElementPresent(locator);
		driver.findElement(locator).click();
	}

	// Mouse hover on an element
	public static void mouseHover(By locator) {

		waitForElementPresent(locator);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		action.moveToElement(element).perform();

	}

	// Getting element text
	public static String getElementText(By locator) {

		waitForElementPresent(locator);
		String text = driver.findElement(locator).getText();
		return text;
	}
	
	// Verify text using assert equals
	public static void verifyEquals(String expected, String actual) {

		Assert.assertEquals(expected, actual);
	}

	// Wait for element present
	public static WebElement waitForElementPresent(By locator) {
		WebElement element = null;
		
		logger.info("Waiting for element presence: "+locator);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 120, 5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	// Wait for element to be visible
	public static WebElement waitForElementToBeVisible(WebElement locator) {
		WebElement element = null;

		logger.info("Waiting for element visibility: "+locator);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 120, 5000);
			wait.until(ExpectedConditions.visibilityOf(locator));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
}
