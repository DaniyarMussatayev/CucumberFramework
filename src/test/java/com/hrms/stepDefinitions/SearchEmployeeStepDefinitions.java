package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeStepDefinitions extends CommonMethods {
	@When("login with valid credintials")
	public void login_with_valid_credintials() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
	}

	@Then("navigate to employee list")
	public void navigate_to_employee_list() {
		click(dash.pimLinkBtn);
		click(dash.empList);
	}

	@Then("enter employee {string}")
	public void enter_employee(String empId) {
		waitForVisability(empList.employeeIdTextBox);
		waitForClickability(empList.employeeIdTextBox);
		
		sendText(empList.employeeIdTextBox, empId);
	}

	@Then("click on search Button")
	public void click_on_search_Button() throws InterruptedException {
		Thread.sleep(3000);
		//waitForClickability(empList.employeeSearchButton);
		click(empList.employeeSearchButton);
		Thread.sleep(3000);
	}

	@Then("enter employee {string}, {string}, and {string}")
	public void enter_employee_and(String firstName, String middleName, String lastName) throws InterruptedException {
		Thread.sleep(7000);
		//waitForClickability(empList.employeeNameTextBox);
		String fullName = firstName + " " + middleName + " " + lastName;
		sendText(empList.employeeNameTextBox, fullName);
		sendText(empList.employeeIdTextBox, "");

	}
	
	@Then("verify that {string} is successfully added")
	public void verify_that_is_successfully_added(String empId ) {
		waitForVisability(empList.employeeIdResultTable);
	    Assert.assertEquals(empId, empList.employeeIdResultTable.getText());
	}

	@Then("verify that {string}, {string}, {string} is successfully added")
	public void verify_that_is_successfully_added(String firstName, String middleName, String lastName) {
		waitForVisability(empList.employeeNameResultTable);
	   String expecetedFullName=firstName + " " + middleName + " " + lastName;
	   String actualFullName=empList.employeeNameResultTable.getText()+ " " +empList.employeeLastNameResultTable.getText();
	   Assert.assertEquals(expecetedFullName, actualFullName);
	}


}
