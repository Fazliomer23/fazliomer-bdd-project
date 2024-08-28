@Smoke @Regression
Feature: Login with credential and validate Plans Page

  Background: open browser and navigate to retail app
    Given open browser and navigate to retail app
    Then click on login button
    Then enter username "supervisor" and password "tek_supervisor"
    Then click on sign in button
    When click on plans button

  @Scenario_1
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and Validate 4 row of data is present.
    Then validate 4 row of the data is present
    Then close browser

  @Scenario_2
  Scenario:
    Then validate Create Date is today's date in EST Time zone
    Then validate Date Expire is a day after EST Time Zone
    Then close browser