@regression
Feature: Negative Login Test
  # As a user I want to be able to login with invalid credentials

  Background:
    Given The user navigates to website

  @wip
  Scenario Outline: Negative Login Test 1 with scenario outline
    When The user clicks on login button and enters "<username>" and "<password>"
    Then The user verifies "<error>" message
    Examples:
      | username      | password      | error                                  |
      | wrongUserName | 12345         | User does not exist.                   |
      | wrongUserName | wrongPassword | User does not exist.                   |
      | arvadas       | wrongPassword | Wrong password.                        |
      |               | 12345         | Please fill out Username and Password. |
      | arvadas       |               | Please fill out Username and Password. |
      |               |               | Please fill out Username and Password. |