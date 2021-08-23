Feature: Ebay Advanced Search Page
  @P2
  Scenario: Ebay Logo Advanced Search Page
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home Page

  @P8
  Scenario: Advanced Search An Item
    Given I am on Ebay Advanced Search Page
    When I advanced search an item
      | keyword    | exclude     | min | max |
      | Android 11 | refurbished | 500 | 900 |
