package com.RightMove.StepDefs;

import java.util.Map;

import com.RightMove.Pages.RM_BackGround_Pages;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_BackGround_StepDefs {
	
	RM_BackGround_Pages background = new RM_BackGround_Pages();

	@Given("^RightMove home page is opened in a browser$")
	public void rightmove_home_page_is_opened_in_a_browser() throws Throwable {
	    background.goToApplication();
	}

	@Then("^Verify the title of the website$")
	public void verify_the_title_of_the_website() throws Throwable {
		background.verifyLogo();
	}

	@Then("^Verify the primary navigations and search bar are displayed$")
	public void verify_the_primary_navigations_and_search_bar_are_displayed() throws Throwable {
		background.verifyPrimaryNav();
	}

	@When("^User enter the post code in the search bar$")
	public void user_enter_the_post_code_in_the_search_bar(DataTable dataTable) throws Throwable {
		Map<String,String> backgroundMap = dataTable.asMaps(String.class, String.class).get(0);
		background.enterPostCode(backgroundMap.get("postcode"));
	   
	}

}
