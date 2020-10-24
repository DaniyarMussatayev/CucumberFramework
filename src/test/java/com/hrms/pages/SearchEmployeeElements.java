package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	public List<WebElement> employeeNameResultTable; //We changed to List<WebElement> for SQL project, previosly was just WebElement!!!!!!!!!!!!!!!
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[4]")
	public WebElement employeeLastNameResultTable;
	
	@FindBy(xpath ="//table[@id = 'resultTable']")
	public WebElement resultTable;
	
	public boolean isTableDisplayed() {
		return resultTable.isDisplayed();
		
	}
	
	public List<Map<String, String>> getFirstNameFromTable(){
		List<Map<String, String>> uiFirstNames = new ArrayList<>();
		for(WebElement firstNameRow: employeeNameResultTable) {
			Map<String, String> mapData = new LinkedHashMap<>();
			String tableName = firstNameRow.getText();
			mapData.put("emp_firstname", tableName);
			uiFirstNames.add(mapData);
		}
		return uiFirstNames;
	}
	

	public SearchEmployeeElements() {
		PageFactory.initElements(driver, this);
	}
}
