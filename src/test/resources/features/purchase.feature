Feature: The user should be able to place order from website

  @t_e2e
  Scenario: Placing a successful order - E2E Test
    Given The user navigates to website
    When The user clicks on login button and enters "arvadas" and "12345"
    And The user adds "Samsung galaxy s7" product from "Phones" category
    And The user adds "Sony vaio i5" product from "Laptops" category
    And The user adds "MacBook Pro" product from "Laptops" category
    And The user adds "Apple monitor 24" product from "Monitors" category
    And The user removes "Sony vaio i5" chosen product from Cart Page
    And The user places order and captures and log amount
    Then The user verifies purchase amount


