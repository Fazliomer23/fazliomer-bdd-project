@Smoke
Feature: Create Primary Account

  Background: open browser and navigate to retail app
    Given open browser and navigate to retail app
    When click on Crate Primary Account link
    Then validate section title to be Create Primary Account Holder
    When fill up create account form
    Then click on Create Account button

  @Scenario_1
  Scenario: Create New Account and then login
    Then close browser

  @Scenario_2
  Scenario: Validate user navigate to Sign up your Account page
    Then validate Sign up your account title is exist
    Then validate user full name is displayed
    Then validate email address shows as expected
    When when the user fill up sign up form
    Then click on submit button
    Then close browser

  @Scenario_3
  Scenario: Validate user navigate to Sign up your Account page
    Given open browser and navigate to retail app
    When click on Crate Primary Account link
    When fill up create account form page
    Then click on Create Account button
    Then validate account error message
    Then close browser
