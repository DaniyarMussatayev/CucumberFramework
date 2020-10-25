package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchStepDefinitions extends CommonMethods {
	
	@When("navigate1 to employee list")
	public void navigate1_to_employee_list() {
		click(dash.pimLinkBtn);
		click(viewEmp.EmployeeListBtn);
	}

	@When("enter1 a valid Employee id {string}")
	public void enter1_a_valid_Employee_id(String employeeId) {
		sendText(viewEmp.idTextBox, employeeId);
		GlobalVariables.empId = employeeId;
	}

	@Then("click1 on search Button")
	public void click1_on_search_Button() {
		click(viewEmp.searchBtn);
	}

	@Then("verify1 the table is displayed")
	public void verify1_the_table_is_displayed() {
		Assert.assertTrue(viewEmp.isTableDisplayed());
	}

	@When("get1 first name from the table")
	public void get1_first_name_from_the_table() {
	    System.out.println(viewEmp.getFirstNameFromTable());
	}

	@Then("validate1 first names from ui against db")
	public void validate1_first_names_from_ui_against_db() {
	    Assert.assertEquals(DBStepDefinitions.dbData, viewEmp.getFirstNameFromTable());
	}
}
