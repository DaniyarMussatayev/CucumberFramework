Feature: Name validations against DB

	@dbValidation
  Scenario: First name validation against DB - searching by Employee ID
    When login with valid credentials
    Then verify the dashboard logo is displayed
    When navigate1 to employee list
    And enter1 a valid Employee id "0056266"
    Then click1 on search Button
    And verify1 the table is displayed
    When get1 first name from the table
    Then get1 first name from the db
    Then validate1 first names from ui against db


