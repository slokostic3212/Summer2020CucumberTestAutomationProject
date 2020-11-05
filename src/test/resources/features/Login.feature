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


  @paramtrized_test @smoke_test
  Scenario: Parametrized login

    When user logs in as a "store manager"
    Then user should see dashboard page

  @paramtrized_test @smoke_test
  Scenario: Parametrized login

    When user logs in as a "sales manager"
    Then user should see dashboard page


  @paranmetrized_test @smoke_test @s_o
  Scenario Outline: Parametrized login
    When user logs in as "<role> "
    Then user should see dashboard page

    Examples:
    |role|
    |sales manager|
    |store manager|

    # role - variable u can name parameters as you want
    # 1st row - always reserced for parameters
    # for autoformating for command + alt + l
    # "driver" - is a parameter "" allows to do test paraetriztion which helps to re-use test

    @negative_login
    Scenario: Invalid password

      When user logs in with "storemanger85" username and "wrong" password
      Then user verifies that "Invalid username or password." message is displayed