package com.ic.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.ic.pom.PricePage.*;
import com.ic.utils.SeleniumDrivers;

public class PriceStep extends SeleniumDrivers {
	
	@When("^user goes to /ic/prices$")
    public void user_goes_to_icprices() {
		
		click(priceTab);
		
    }

    @Then("^search for some prices$")
    public void search_for_some_prices() {
    }

    @Then("^select prices to be shown in the grap.$")
    public void select_prices_to_be_shown_in_the_graph() {
    }

    @Then("^user can see 2 years of history$")
    public void user_can_see_2_years_of_history() {
    }

}
