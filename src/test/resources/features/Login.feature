Feature: As a user I want to be able to login under different roles

Scenario: Login as a sales manager
  Given user is on the landing page
  When user logs in
  Then user should see dashboard page


  @paramtrized_test
  Scenario: Parametrized login
    Given user is on the login page
    When user logs in as a "driver"
    Then user should see dashboard page
