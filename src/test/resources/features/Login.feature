Feature: Login Functionality 
#@smoke
Scenario: Loggin with valid credentials
#Given go to HRMS login page 
When login with valid credentials
Then verify the dashboard logo is displayed
#And quit the browser

#HW: Cucumber class1
#US8809: System should show error message when invalid login is perform
#empty username and valid password --> Username cannot be empty
#valid username and empty password --> Password cannot be empty
#valid username and invalid password --> Invalid credentials

@HWClass01
Scenario: Login with empty username
#Given go to HRMS login page 
When login without username 
Then verify the error message 
#And quit the browser 

@HWClass01
Scenario: Login with empty password
#Given go to HRMS login page 
When login without password 
Then verify the error message 
#And quit the browser  
  


@smoke
Scenario: Loggin with invalid credentials
#Given go to HRMS login page 
When login with invalid credentials
Then verify the error message 
#And quit the browser
