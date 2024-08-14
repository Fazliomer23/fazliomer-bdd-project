@Regression @Smoke
Feature: Validate home page title is exist

  @Scenario_1
  Scenario: Validate 'TEK Insurance UI' and 'Create Primary Account' button is exist
    Given open browser and navigate to retail app
    Then validate TEK Insurance UI is exist
    Then validate Create Primary Account is exist
    Then validate Login button is enabled
    Then validate color mode button is displayed
    Then close browser
