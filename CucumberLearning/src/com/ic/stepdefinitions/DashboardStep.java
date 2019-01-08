package com.ic.stepdefinitions;

import static com.ic.pom.HeaderTabsPage.*;
import static com.ic.pom.LoginPage.*;
import static com.ic.pom.DashboardPage.*;
import static com.ic.pom.CreateDashboard.*;
import org.junit.runner.RunWith;

import com.ic.utils.SeleniumDrivers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class DashboardStep extends SeleniumDrivers {

	@Given("^Login to the application with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void login_to_the_application_with_username_as_something_and_password_as_something(String user,
			String pass) {

		enterData(userName, user);
		enterData(passWord, pass);
		click(submitButton);

	}

	@When("^user goes to page /ic/account/default-homepage$")
	public void user_goes_to_page_ic_account_default_homepage() {

		mouseHover(userMenu);
		click(preference);
		click(defaultHomepage);

	}

	@Then("^page should be open and contain 'Default Homepage' as title$")
	public void page_should_be_open_and_contain_Default_Homepage_as_title() {

		verifyEquals(getElementText(defaultHomepage), "Default Homepage");

	}

	@Then("^select 'Dashboard' radio button and click on Submit$")
	public void select_dashboard_radio_button_and_click_on_submit() {

		click(selectDashboard);
		//click(submit);

	}

	@Then("^logout from application$")
	public void logout_from_application() {

		mouseHover(userMenu);
		click(logOut);

	}

	@Then("^Dashboard page should be open and selected tab should be \"([^\"]*)\"$")
	public void dashboard_page_should_be_open_and_selected_tab_should_be_something(String actual) {

		verifyEquals(getElementText(dashboardTab), actual);

	}

	@When("^Click on Dashboard tab$")
	public void click_on_dashboard_tab() {

		click(dashboardTab);

	}

	@Then("^Click on plus icon for new dashboard creation$")
	public void click_on_plus_icon_for_new_dashboard_creation() {

		click(createDashbaordButton);
	}

	@Then("^Select pulp and europe and click on Finish button$")
	public void select_pulp_and_europe_and_click_on_finish_button() {

		click(pulpEurope);
		click(finish);
	}

	@Then("^Verify created dashboard having name as \"([^\"]*)\"$")
	public void verify_created_dashboard_having_name_as_something(String actual) {

		verifyEquals(getElementText(pulpEuropeName), actual);
	}
}