package com.ic.stepdefinitions;

import static com.ic.pom.HeaderTabsPage.supplierTab;
import static com.ic.pom.SupplierPage.*;
import com.ic.utils.SeleniumDrivers;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierStep extends SeleniumDrivers {

	@When("^User goes to page /ic/suppliers/suppliers-search$")
    public void user_goes_to_page_icsupplierssupplierssearch() {
		
		click(supplierTab);
		click(searchSupplier);
    }

	@Then("^Select region as 'Asia' and grade as 'Packaging Paper'$")
    public void select_region_as_asia_and_grade_as_packaging_paper() {
		
		click(regionAsia);
		click(gradePackagingPaper);
    }

    @Then("^Search results should get displayed and result should contain \"([^\"]*)\"$")
    public void search_results_should_get_displayed_and_result_should_contain_something(String actual) {
    	
    	verifyEquals(getElementText(supplierSearchResult), actual);
    }

}
