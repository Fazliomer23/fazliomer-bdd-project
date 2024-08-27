@Smoke @Regression
Feature: Navigate to login page with valid CSR credentials

  Background: User should be able to open browser and sign in with valid username and password
    Given open browser and navigate to retail app
    Then click on login button
    Then enter username "supervisor" and password "tek_supervisor"
    Then click on sign in button
    Then click on profile button

    @Scenario_1
  Scenario: Enter valid username and password and then login
    Then validate information in Profile Side Drawer is correct
    Then close browser

  @Scenario_2
  Scenario: Click on Logout button make sure user navigate to home page
    Then click on logout button
    Then close browser