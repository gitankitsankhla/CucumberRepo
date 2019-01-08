package com.ic.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.ic.pom.NewsPage.*;
import static com.ic.pom.HeaderTabsPage.*;

import com.ic.utils.SeleniumDrivers;

public class NewsStep extends SeleniumDrivers {

	@When("^User clicks on Search under News tab$")
	public void user_clicks_on_search_under_news_tab() {

		mouseHover(newsTab);
		click(searchUnderNewsTab);
	}

	@Then("^Click on Search button$")
	public void click_on_search_button() {

		click(searchButton);
	}

	@Then("^verify result should have text as \"([^\"]*)\"$")
	public void verify_result_should_have_text_as_something(String actual) {

		verifyEquals(getElementText(newsSearchResult), actual);
	}

}
