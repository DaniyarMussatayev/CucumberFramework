package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {
	@Then("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		click(dash.pimLinkBtn);
		click(dash.addEmpBtn);
	}

	@Then("enter first and last name")
	public void enter_first_and_last_name() {
		sendText(addEmp.firstNameField, "John");
		sendText(addEmp.lastName, "Wick");
	}

	@Then("click on sace Button")
	public void click_on_sace_Button() {
		click(addEmp.saveButton);
	}

	@Then("verify the employee is added successfully")
	public void verify_the_employee_is_added_successfully() {
		String profileName = persDetails.profileName.getText();
		Assert.assertEquals("John Wick", profileName);
	}

	@When("enter first name as {string} middle name as {string} and last name as {string}")
	public void enter_first_name_as_middle_name_as_and_last_name_as(String firstName, String middleName,
			String lastName) {
		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.middleName, middleName);
		sendText(addEmp.lastName, lastName);
	}

	@Then("verify that {string} is added successfully")
	public void verify_that_is_added_successfully(String fullName) {
		String profileName = persDetails.profileName.getText();
		Assert.assertEquals(fullName, profileName);
	}

	@When("enter empoyee {string}, {string} and {string}")
	public void enter_empoyee_and(String firstName, String middleName, String lastName) {
		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.middleName, middleName);
		sendText(addEmp.lastName, lastName);
	}

	@Then("verify that {string}, {string} and {string} is successfully added")
	public void verify_that_and_is_successfully_added(String firsName, String middleName, String lastName) {
		String fullName = firsName + " " + middleName + " " + lastName;
		String fullProfileName = persDetails.profileName.getText();
		Assert.assertEquals(fullName, fullProfileName);

	}
}
