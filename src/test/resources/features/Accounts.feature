@Smoke @Regression
Feature: Testing Account Section

  Background: open browser and navigate to retail app
    Given open browser and navigate to retail app
    Then click on login button
    Then enter username "supervisor" and password "tek_supervisor"
    Then click on sign in button
    Then click on Accounts button

  @Accounts_Scenario_1
  Scenario: Login with CSR Credentials
  Then validate Primary Accounts title is exist
  Then close browser

  @Accounts_Scenario_2
  Scenario: Validate Primary Account Table
    When change item per page to "5"
    Then validate table row count to be 5
    When change item per page to "10"
    Then validate table row count to be 10
    When change item per page to "25"
    Then validate table row count to be 25
    When change item per page to "50"
    Then validate table row count to be 50
    Then close browser