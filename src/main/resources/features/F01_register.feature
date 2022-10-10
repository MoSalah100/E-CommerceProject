@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user navigate to register page
    When   select gender
    And   user enter first name "automation" and last name "tester"
    And   user enter date of birth
    And     user enter email "automationtest@example.com" field
    And   user fills Password fields "P@ssw0rd" "P@ssw0rd"
    When    clicks on register button
    Then    message is displayed
