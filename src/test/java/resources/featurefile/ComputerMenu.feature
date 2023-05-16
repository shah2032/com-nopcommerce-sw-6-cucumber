Feature: Computer menu Test

  @sanity @regression
  Scenario:User should see products are arrange in Alphabatical order
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktop menu
    And I select Sort By position Name: Z to A
    Then I should verify the Products are arrange in Descending order.

#  @smoke @regression
  Scenario: User should add product to shopping cart successfully
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktop menu
    And I select Sort By position Name: A to Z
    And I click on Add to Cart of Product Build your own computer
    Then I should see Build your own computer
    And I select processor 2.2 GHz Intel Pentium Dual-Core E2200
    And I select ram 8GB [+$60.00]
    And I select HDD 400 GB [+$100.00]
    And I select OS Vista Premium [+$60.00]
    And I click on Microsoft Office [+$50.00]" and "Total Commander [+$5.00] checkbox
    And I should see Price $1,475.00
    And I click on ADD TO CART Button
    Then I should see The product has been added to your shopping cart
    And I click on cross button
    And I mouse hover on shopping cart
    And I click on GO TO CART
    Then I should see Shopping cart
    And I change Qty of product and update shopping cart
    Then I should see total price is $2,950.00
    And I click on check box of terms and condition
    And I click on checkout button
    Then I should see Welcome, Please Sign In!
    And I click on CHECKOUT AS GUEST
    And I fill all the mandatory details
    And I click to Continue
    And I select radio button of Next Day Air($0.00)
    And I click on Continue Button
    And I click on radio button Credit Card
    And I click on Continues
    And I Select Master card From Select credit card dropdown
    Then I fill all the card details
    And I click on Continues
    Then I should see Payment method is Credit card
    And I should seeShipping method is Next Day Air
    And I should see total price $2,950.00
    And I click on Confirm
    Then I should see text Thank You
    And I should see Your order has been successfully processed!
    And I click on Continues button
    Then I should see Welcome to our store

