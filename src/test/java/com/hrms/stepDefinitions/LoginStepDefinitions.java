package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends CommonMethods{

//	@Given("go to HRMS login page")
//	public void go_to_hrms_login_page() {
//		setUp();
//	}

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
	}

	@Then("verify the dashboard logo is displayed")
	public void verify_the_dashboard_logo_is_displayed() {
	    Assert.assertTrue(dash.welcome.isDisplayed());
	}
	
	@When("login without username")
	public void login_without_username() {
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
	}
	
	@When("login without password")
	public void login_without_password() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		click(login.btnLogin);

	}

//	@Then("quit the browser")
//	public void quit_the_browser() {
//	    tearDown();
//	}
	
	@When("login with invalid credentials")
	public void login_with_invalid_credentials() {
		login.loginToHrms("Admin11", "Syntax");
	}

	@Then("verify the error message")
	public void verify_the_error_message() {
		Assert.assertTrue(login.spanMessage.isDisplayed());
	}
}