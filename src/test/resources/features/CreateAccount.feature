Feature: Create Primary Account

  Scenario Outline: Create Account and login
    Given open browser and navigate to retail app
    When click on "Crate Primary Account" links
    Then validate section title to be "Create Primary Account Holder"
    Then fill up create account form
    Examples:
      | email            | random             |
      | firstName        | <firstName>        |
      | lastName /       | <lastName>         |
      | prefix           | <prefix>           |
      | gender           | <gender>           |
      | maritalStatus    | <maritalStatus>    |
      | employmentStatus | <employmentStatus> |
      | dateOfBirth      | <dateOfBirth>      |
    When click on "Create Account" button

