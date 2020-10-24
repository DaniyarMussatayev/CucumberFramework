Feature: Name validations aginst DB

@dbValidation
Scenario: First name validation against DB - searching by Employee ID
When login with valid credentials
Then verify the dashboard logo is displayed
When navigate to employees list
And enter valid Employee id "0056266"
Then click on searchs Button
And verify the table is displayed
When get first name from the table 
Then get first name from the db
Then validate first name from ui against db


