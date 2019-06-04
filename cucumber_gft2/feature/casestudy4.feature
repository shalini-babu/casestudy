Feature: Add to cart

  Scenario: search product without add to cart
    Given User has registered into testmeApp
    When user search the product like headphone
    And try to proceed payment without adding product to cart
    Then Testmeapp doesn't display cart icon
