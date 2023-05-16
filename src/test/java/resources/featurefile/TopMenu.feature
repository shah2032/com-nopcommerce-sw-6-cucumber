Feature: TopMenu
  As user I want to navigate to selected menu page
@sanity
Scenario Outline: User should navigate to selected menu page
  Given I am on homepage
  When I click on any menu from "<Topmenu tab>"
  Then I navigate to selected menu page "<Navigate Page>"
  Examples:
    | Topmenu tab       | Navigate Page     |
    | Computers         | Computers         |
    | Electronics       | Electronics       |
    | Apparel           | Apparel           |
    | Digital downloads | Digital downloads |
    | Books             | Books             |
    | Jewelry           | Jewelry           |
    | Gift Cards        | Gift Cards        |