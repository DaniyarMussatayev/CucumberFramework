Feature: Login Functionality 
@smoke
Scenario: Loggin with valid credentials
#Given go to HRMS login page 
When login with valid credentials
Then verify the dashboard logo is displayed
#And quit the browser  


@smoke
Scenario: Loggin with invalid credentials
#Given go to HRMS login page 
When login with invalid credentials
Then verify the error message 
#And quit the browser
