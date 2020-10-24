$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/nameValidationInDB.feature");
formatter.feature({
  "name": "Name validations aginst DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "First name validation against DB - searching by Employee ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbValidation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the dashboard logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.verify_the_dashboard_logo_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employees list",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.navigate_to_employees_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid Employee id \"0056266\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.enter_valid_Employee_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on searchs Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.click_on_searchs_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the table is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.verify_the_table_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get first name from the table",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.get_first_name_from_the_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get first name from the db",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DBStepDefinitions.get_first_name_from_the_db()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.hrms.utils.DBUtils.storeDataFromDB(DBUtils.java:41)\r\n\tat com.hrms.stepDefinitions.DBStepDefinitions.get_first_name_from_the_db(DBStepDefinitions.java:18)\r\n\tat ✽.get first name from the db(file:///C:/Users/User/eclipse-workspace/CucumberFramework/src/test/resources/features/nameValidationInDB.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "validate first name from ui against db",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.EmployeeSearchStepDefinitions.validate_first_name_from_ui_against_db()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "First name validation against DB - searching by Employee ID");
formatter.after({
  "status": "passed"
});
});