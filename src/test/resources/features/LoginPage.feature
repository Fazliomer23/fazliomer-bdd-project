@Smoke @Regression
Feature: Enter with valid username and password and then login to tek insurance app

  Background: Open browser and navigate to retail app
    Given open browser and navigate to retail app
    When click on login button

  @Practice
  Scenario: Navigate to login page
    Then validate Sign in to your Account text is exist
    Then close browser

  @Scenario_1
  Scenario: Navigate to login page with valid username and password
    Then enter username "supervisor" and password "tek_supervisor"
    Then click on sign in button
    Then validate user navigate to Customer Service Portal
    Then close browser

  @Scenario_2
  Scenario Outline: Navigate to login page and enter wrong credentials and validate error message as expected
    Then enter username "<username>" and password "<password>"
    Then click on sign in button
    Then validate error message "<errorMessage>"
    Then close browser
    Examples:
      | username    | password        | errorMessage |
      | supervisor3 | tek_supervisor  | ERROR        |
      | supervisor  | tek_supervisor3 | ERROR        |