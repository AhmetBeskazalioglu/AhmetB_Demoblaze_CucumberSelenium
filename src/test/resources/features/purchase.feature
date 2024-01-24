Feature: The user should be able to place order from website

  Background:
    Given The user navigates to website
    When The user clicks on login button and enters "arvadas" and "12345"

  @t_e2e_1
  Scenario: Placing a successful order - E2E Test
    And The user adds "Samsung galaxy s7" product from "Phones" category
    And The user adds "Sony vaio i5" product from "Laptops" category
    And The user adds "MacBook Pro" product from "Laptops" category
    And The user adds "Apple monitor 24" product from "Monitors" category
    And The user removes "Sony vaio i5" chosen product from "Cart" Page
    And The user places order and captures and log amount
    Then The user verifies purchase amount

  @t_e2e_2
  Scenario Outline: Placing a successful order - E2E Test
    When The user adds following products from related category to the cart and return Home page
      | first_column | second_column |
      | Phones       | <phone>       |
      | Laptops      | <laptop1>     |
      | Laptops      | <laptop2>     |
      | Monitors     | <monitors>    |
    And The user removes "<laptop1>" chosen product from "Cart" Page
    And The user places order and captures and log amount
    Then The user verifies purchase amount
    Examples:
      | phone             | laptop1      | laptop2     | monitors         |
      | Samsung galaxy s7 | Sony vaio i5 | MacBook Pro | Apple monitor 24 |


