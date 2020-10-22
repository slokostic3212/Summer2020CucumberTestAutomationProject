@login
Feature: As a user I want to be able to login under different roles
#this is comment
 #background tests precondition
 # will be executed before every scenario in the particular feature file
  Background: common steps
    Given user is on the landing page

Scenario: Login as a sales manager

  When user logs in
  Then user should see dashboard page


  @paramtrized_test
  Scenario: Parametrized login

    When user logs in as a "store manager"
    Then user should see dashboard page

    @negative_login
    Scenario: Invalid password

      When user logs in with "storemanger85" username and "wrong" password
      Then user verifies that "Invalid username or password." message is displayed