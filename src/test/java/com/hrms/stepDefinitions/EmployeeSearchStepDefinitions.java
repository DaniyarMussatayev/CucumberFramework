package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchStepDefinitions extends CommonMethods {
	
	@When("navigate to employees list")
	public void navigate_to_employees_list() throws InterruptedException {
		  click(dash.pimLinkBtn);
		   click(dash.empList);
			Thread.sleep(7000);

	}
	
	
	@When("enter valid Employee id {string}")
	public void enter_valid_Employee_id(String employeeId) throws InterruptedException {
		Thread.sleep(7000);
		  click(empList.employeeIdTextBox);
		sendText(empList.employeeIdTextBox, employeeId);
	}
	
	@Then("click on searchs Button")
	public void click_on_searchs_Button() {
	   click(empList.employeeSearchButton);
	}

	@Then("verify the table is displayed")
	public void verify_the_table_is_displayed() {
	   Assert.assertTrue(empList.isTableDisplayed());
	}

	@When("get first name from the table")
	public void get_first_name_from_the_table() {
		System.out.println(empList.getFirstNameFromTable());

	}


	@Then("validate first name from ui against db")
	public void validate_first_name_from_ui_against_db() {
	   Assert.assertEquals(DBStepDefinitions.dbData, empList.getFirstNameFromTable());
	}
}
