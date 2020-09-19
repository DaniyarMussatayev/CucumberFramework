@addEmployee
Feature: Add Employee

  #HW: Cucumber class 02 from 14 september
  #Come up with test scenarios which adds an employee
  #1. Without login details
  #2. with login details
  Background: 
    When login with valid credentials
    Then navigate to add employee page

  @HW
  Scenario: Add employee without login details
    #When login with valid credentials
    #Then navigate to add employee page
    Then add  first name and last name
    And verify the HW employee is added successfully

  @HW
  Scenario: Add employee with login details
    #When login with valid credentials
    #Then navigate to add employee page
    Then add  first name and last name
    Then create login details
    And verify the HW employee is added successfully

  Scenario: Add employee by first name and last name but without middle nmae
    And enter first and last name
    Then click on sace Button
    And verify the employee is added successfully

  Scenario: Add employee with login credentials
    And enter first and last name
    When check login details checkbox
    Then enter login details
    Then click on sace Button
    And verify the employee is added successfully

  @parameter
  Scenario: Add employee without login details but with middle name
    When enter first name as "Ahmet" middle name as "Can" and last name as "Bicer"
    Then click on sace Button
    And verify that "Ahmet Can Bicer" is added successfully

  @examples
  Scenario Outline: Adding multiple employees without login details
    When enter empoyee "<First Name>", "<Middle Name>" and "<Last Name>"
    Then click on sace Button
    And verify that "<First Name>", "<Middle Name>" and "<Last Name>" is successfully added

    Examples: 
      | First Name | Middle Name | Last Name |
      | Mark       | J           | Smith     |
      | Hunter     | ABC         | Musoev    |
      | John       | M           | Wick      |
      | John       | F           | Kennedy   |

  @dtWithHeader
  Scenario: Adding multiple employees at one execution
    When add miltiple employees and verify they are added
      | First Name | Middle Name | Last Name | Employee ID |
      | Mark       | J           | Smith     | aqfdb       |
      | Hunter     | ABC         | Musoev    | dfbdfb      |
      | John       | M           | Wick      | bvcvxsdf    |
      | John       | F           | Kennedy   | sdfsdgsdgs  |

@excelTask
  Scenario: Adding multiple employees from excel file
  When add multiple employees from "AddEmployee" verify they are added successfully
  
