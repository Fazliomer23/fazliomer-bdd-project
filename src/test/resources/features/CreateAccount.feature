@Smoke @Regression
Feature: Create Primary Account

  Background: Create Account create Credentials and Login
    Given open browser and navigate to retail app
    When click on Crate Primary Account link

  @Scenario_1
  Scenario: Create New Account and then login
    Then validate section title to be Create Primary Account Holder
    Then close browser

  @Scenario_2
  Scenario: Validate user navigate to Sign up your Account page
    When fill up create account form
    Then click on Create Account button
    Then validate Sign up your account title is exist
    Then validate user full name is displayed
    Then validate email address shows as expected
    When when the user fill up sign up form
    Then click on submit button
    Then close browser

  @Scenario_3
  Scenario: Validate user navigate to Sign up your Account page
    When fill up create account form page
    Then click on Create Account button
    Then validate account error message
    Then close browser