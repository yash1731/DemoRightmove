package com.RightMove.StepDefs;

import com.RightMove.Pages.RM_Letting_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_Letting_StepDefs {
	
	RM_Letting_Page letting = new RM_Letting_Page();
	
	@When("^Click on the To Rent Button$")
	public void click_on_the_To_Rent_Button() throws Throwable {
		letting.clickToRentButton();
	}
	
	@Then("^Verify the rent related filters page appeared$")
	public void verify_the_rent_related_filters_page_appeared() throws Throwable {
	   letting.verifyFilterPage();
	}

	@Then("^User can verify the header message regarding property to rent$")
	public void user_can_verify_the_header_message_regarding_property_to_rent() throws Throwable {
	    letting.verifyHeaderTitle();
	}

	@Then("^Sort the list to the lowset price$")
	public void sort_the_list_to_the_lowset_price() throws Throwable {
	    letting.sortByFilter();
	}

	@When("^User select on the first non-featured property to rent$")
	public void user_select_on_the_first_non_featured_property_to_rent() throws Throwable {
		letting.selectNonFeaturedToRent();
	}

}
