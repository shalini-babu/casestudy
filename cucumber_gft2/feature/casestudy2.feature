Feature: Add product to cart

  @Tag1 @SmokeTest
  Scenario: User enters Username and password
    Given The login page is opened
    When User enters lalitha as username
    And User enters password123 as password
    Then User will Finds a TestMeApp hoempage

   Given User click on "All categories" and subcategory as "Electronics"
    When User added the headphone to the cart
    And checkout for the payment
    And fill transcation detail
    Then the product is successful ordered
