package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
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

	@Then("add  first name and last name")
	public void add_first_name_and_last_name() {
		sendText(addEmp.firstNameField, "Harry");
		sendText(addEmp.lastName, "Potter");
	}

	@Then("create login details")
	public void create_login_details() {
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, "harrypotterrrrrrr");
		sendText(addEmp.userPassword, "N_Arm$trong789!##");
		sendText(addEmp.confirmPassword, "N_Arm$trong789!##");
	}

	@Then("click on save Button")
	public void click_on_sace_Button() {
		click(addEmp.saveButton);
	}

	@Then("verify the employee is added successfully")
	public void verify_the_employee_is_added_successfully() {
		String profileName = persDetails.profileName.getText();
		Assert.assertEquals("John Wick", profileName);
	}

	@Then("verify the HW employee is added successfully")
	public void verify_the_HW_employee_is_added_successfully() {
		click(addEmp.saveButton);
		Assert.assertEquals(persDetails.profileName.getText(), "Harry Potter");
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
	public void verify_that_and_is_successfully_added(String firstName, String middleName, String lastName) {
		String fullName = firstName + " " + middleName + " " + lastName;
		String fullProfileName = persDetails.profileName.getText();
		Assert.assertEquals(fullName, fullProfileName);

	}

	@When("add miltiple employees and verify they are added")
	public void add_miltiple_employees_and_verify_they_are_added(DataTable employees) throws InterruptedException {
		List<Map<String, String>> employeeNames = employees.asMaps();
		for (Map<String, String> employeeName : employeeNames) {
			String firstName = employeeName.get("First Name");
			String middleName = employeeName.get("Middle Name");
			String lastName = employeeName.get("Last Name");
			String empId = employeeName.get("Employee ID");

			sendText(addEmp.firstNameField, firstName);
			sendText(addEmp.middleName, middleName);
			sendText(addEmp.lastName, lastName);
			sendText(addEmp.idField, empId);

			click(addEmp.saveButton);

			String actualName = persDetails.profileName.getText();
			String expectedName = firstName + " " + middleName + " " + lastName;
			Assert.assertEquals("Verifying employee names", expectedName, actualName);
			click(dash.addEmpBtn);
			Thread.sleep(1000);

		}

	}

	@When("add multiple employees from {string} verify they are added successfully")
	public void add_multiple_employees_from_verify_they_are_added_successfully(String sheetName) throws InterruptedException {
		List<Map<String, String>> excelData = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH, sheetName);
		
		for (Map<String, String> excelEmpname : excelData) {
			String firstName = excelEmpname.get("FirstName");
			String middleName = excelEmpname.get("MiddleName");
			String lastName = excelEmpname.get("LastName");
			String empId = excelEmpname.get("Employee ID");

			sendText(addEmp.firstNameField, firstName);
			sendText(addEmp.middleName, middleName);
			sendText(addEmp.lastName, lastName);
			sendText(addEmp.idField, empId);

			click(addEmp.saveButton);

			String actualName = persDetails.profileName.getText();
			String expectedName = firstName + " " + middleName + " " + lastName;
			Assert.assertEquals("Verifying employee names", expectedName, actualName);
			jsClick(dash.addEmpBtn);
		}

	}
}
