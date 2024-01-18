Feature: Login Test
  #As as  user: As a user I should be able to login with valid credentials
  Background:
    Given The user navigates to website

  Scenario: Positive Login Test 1 without parameter
    When The user clicks on login button and enters valid credentials
    Then The user verifies welcome message


  Scenario: Positive Login Test 2 with parameter
    When The user clicks on login button and enters "arvadas" and "12345"
    Then The user verifies welcome "arvadas" message


  Scenario Outline: Positive Login Test 3 with scenario outline
    When The user clicks on login button and enters "<username>" and "<password>"
    Then The user verifies welcome "<username>" message
    Examples:
      | username | password |
      | arvadas  | 12345    |


  Scenario Outline: Positive Login Test 4 with scenario outline and data table
    When The user clicks on login button and enters following credentials
      | username | <username> |
      | password | <password> |
    Then The user verifies welcome "<username>" message
    Examples:
      | username | password |
      | arvadas  | 12345    |

  @wip
  Scenario Outline: Negative Login Test 1 with scenario outline and data table
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


