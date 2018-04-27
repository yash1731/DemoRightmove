package com.RightMove.StepDefs;

import com.RightMove.Pages.RM_Sale_Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_Sale_StepDefs {
	
	RM_Sale_Pages sale = new RM_Sale_Pages();
	
	@When("^Click on the To Sale Button$")
	public void click_on_the_To_Sale_Button() throws Throwable {
	    sale.clickForSaleButton();
	}

	@Then("^Verify the filters page appeared$")
	public void verify_the_filters_page_appeared() throws Throwable {
	   sale.verifyFilterPage();
	}

	@Then("^User can verify the header message regarding property to sale$")
	public void user_can_verify_the_header_message_regarding_property_to_sale() throws Throwable {
	    sale.verifyPageHeader();
	}

	@When("^User select the filters$")
	public void user_select_the_filters() throws Throwable {
	    sale.selectFilters();
	}

	@When("^Click on the Find Properties button$")
	public void click_on_the_Find_Properties_button() throws Throwable {
	    sale.clickFindProperties();
	}

	@Then("^List of matching properties are displayed$")
	public void list_of_matching_properties_are_displayed() throws Throwable {
	    sale.verifyMatchesList();
	}

	@Then("^Verify list of featured properties$")
	public void verify_list_of_featured_properties() throws Throwable {
	    sale.listFeaturedProperties();
	}

	@Then("^Verify list of non featured properties$")
	public void verify_list_of_non_featured_properties() throws Throwable {
		  sale.listNONFeaturedProperties();
	}

	@Then("^Sort the list to the newest$")
	public void sort_the_list_to_the_newest() throws Throwable {
	   sale.sortFilterToNewest();
	}

	@When("^User select on the first non-featured property$")
	public void user_select_on_the_first_non_featured_property() throws Throwable {
	    sale.selectNonFeatured();
	}

	@Then("^Verify the selected property details page is appeared$")
	public void verify_the_selected_property_details_page_is_appeared() throws Throwable {
	    sale.verifyPropertyDetailPage();
	}



}
