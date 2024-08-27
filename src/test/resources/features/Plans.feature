@Smoke @Regression
Feature: Login with credential and validate Plans Page

  Scenario: Navigate to Customer Service Portal with valid CSR credentials and Validate 4 row of data is present.
    Given open browser and navigate to retail app
    Then click on login button
    Then enter username "supervisor" and password "tek_supervisor"
    Then click on sign in button
    Then click on plans button
    Then validate 4 row of the data is present
    Then close browser
