@searchEmployee
Feature: Search Employee

  #HW Class03 16th September:
  #Search for employee
  #5 sets of data for searching by id
  #5 sets of data searching by name
  #use background, and scenario outline
  Background: 
    When login with valid credintials
    Then navigate to employee list

  Scenario Outline: Search employee by id
  Then enter employee "<Id>"
  Then click on search Button
  Then verify that "<Id>" is successfully added
  
  Examples:
  | Id   |
  | 7570 |
  | 7571 |
  | 7771 |
  | 7573 |
  | 7574 |
  Scenario Outline: Search employee by name
    Then enter employee "<First Name>", "<Middle Name>", and "<Last Name>"
    Then click on search Button
    Then verify that "<First Name>", "<Middle Name>", "<Last Name>" is successfully added

    Examples: 
      | First Name | Middle Name | Last Name |
      | John       | M           | Smith     |
      | Hunter     | ABC         | Musoev    |
      | John       | M           | Wick      |
      | John       | F           | Kennedy   |
      | Harry      | P           | Potter    |
