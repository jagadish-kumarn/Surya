package com.stepDefinitions;

import com.charan.Base;
import com.pageObjects.Facebook;
import com.pageObjects.Gmail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs extends Base{
	 static Facebook f = new Facebook();
	 static Gmail g = new Gmail();
	@Given("user is on facebook page")
	public void facebookLogin() {
		openURL("https://www.facebook.com");
	}
	@When("user entered login credentials as {string} and {string}")
	public void user_entered_login_credentials_as_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		f.login(string, string2);
		
	}

	@Then("I validate the errormessage with {string}")
	public void i_validate_the_errormessage_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
		f.errorLoginValidation(string);
	}
	@Given("user launched the browser {string}")
	public void user_launched_the_browser(String string) {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser(string);
	}
	@Given("User is on Gmail page")
	public void user_is_on_Gmail_page() {
	    try {
	    	openURL("https://www.gmail.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@When("Log into Gmail")
	public void log_into_Gmail() {
	    try {
	    	g.gmaillogin();
	    } catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@When("Access the first mail")
	public void access_the_first_mail() {
	 
	}

	}
