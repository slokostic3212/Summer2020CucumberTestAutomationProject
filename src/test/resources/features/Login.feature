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


  @s_o #changed from @paranmetrized_test @smoke_test @s_o
  Scenario Outline: Parametrized login as <role>
    When user logs in as "<role> "
    Then user should see "<page_title>" page

    Examples:
    |role         |page_title        |
    |sales manager|Dashboard         |
    |store manager|Dashboard         |
    |driver       |Quick Launchpad   |

    # role - variable u can name parameters as you want
    # 1st row - always reserced for parameters
    # for autoformating for command + alt + l
    # "driver" - is a parameter "" allows to do test paraetriztion which helps to re-use test

    @negative_login
    Scenario: Invalid password

      When user logs in with "storemanger85" username and "wrong" password
      Then user verifies that "Invalid username or password." message is displayed

    Scenario Outline:  Invalid login
      When user logs in as a "<username" username and "<password>" password
      Then user verifies that "<message>" message is displayed

      Examples: data set

      |username   | password   |  message          |
      | wrong     | bad        | Invalid user name or password |
      | wrong     | bad        | Invalid user name or password |