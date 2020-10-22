Feature: As a user I want to be able to login under different roles

Scenario: Login as a sales manager
  Given user is on the landing page
  When user logs in
  Then user should see dashboard page


  @paramtrized_test
  Scenario: Parametrized login
    Given user is on the login page
    When user logs in as a "store manager"
    Then user should see dashboard page

    @negative_login
    Scenario: Invalid password
      Given user is on the login page
      When user logs in with "storemanger85" username and "wrong" password
      Then user verifies that "Invalid username or password." message is displayed