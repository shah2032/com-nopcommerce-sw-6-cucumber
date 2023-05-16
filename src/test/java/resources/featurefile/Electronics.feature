Feature: Electronic menu Test
  As a user i am on Electronic menu
#  @sanity @regression
  Scenario:User should navigate to Cell Phone page successfully
    Given I am on homepage
    When I mouse hover to Electronics Tab
    And I mouse hover and click on Cell Phones tab
    Then I should navigate to Cell Phone page

#  @smoke @regression
  Scenario:User should add product to Cart and Place the Order Successfully
    Given I am on homepage
    When I mouse hover to Electronics Tab
    And I mouse hover and click on Cell Phones tab
    Then I should navigate to Cell Phone page
    And I click on List view tab
    And I click on Nokia Lumia 1020
    Then I should see Nokia Lumia 1020
    And I should see price $349.00
    And I change the Qty to 2
    And I click on Add to Cart
    Then I should see The product is added to your shopping cart
    And I click cross
    And I mouse hover on Shopping cart and click on Go to Cart
    Then I should see text Shopping cart
    And I should see Qty is 2
    And I should see price is $698.00
    And I click on check box of terms and service
    And I click on Checkout
    Then I should see Welcome Please Sign In!
#    From Here shopping cart is showing empty