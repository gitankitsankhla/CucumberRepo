package com.ic.pom;

import org.openqa.selenium.By;

public class LoginPage {

	public static By userName = By.name("j_username");
	public static By passWord = By.name("j_password");
	public static By submitButton = By.xpath("//input[@value='Log In']");
}