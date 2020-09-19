package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class SearchEmployeeElements extends BaseClass {
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement employeeNameTextBox;

	@FindBy(id = "empsearch_id")
	public WebElement employeeIdTextBox;

	@FindBy(id = "searchBtn")
	public WebElement employeeSearchButton;

	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public WebElement employeeIdResultTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[3]")
	public WebElement employeeNameResultTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[4]")
	public WebElement employeeLastNameResultTable;

	public SearchEmployeeElements() {
		PageFactory.initElements(driver, this);
	}
}
