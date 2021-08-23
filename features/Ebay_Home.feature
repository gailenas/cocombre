Feature: Ebay Home Page Scenarios
  @P1
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on 'Advanced'
    Then I navigate to Advanced Search Page

  @P3 @setCookies @Test
  Scenario: Search Items Count
    Given I am on Ebay Home Page
    When I search for 'Android 11'
    Then I validate at least 1000 search results

  @P3 @setCookies
  Scenario: Search Items Count2
    Given I am on Ebay Home Page
    When I search for 'Iphone 11'
    Then I validate at least 100 search results

  @P7 @setCookies
  Scenario: Search for item in category
    Given I am on Ebay Home Page
    When I search for 'soap' in 'baby' category
    Then I validate at least 100 search results

  @A1
  Scenario Outline: Home Page Links
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples:
      | link        | url                                                  | title          |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124     | Electronics    |
      | Fashion     | https://www.ebay.com/b/Fashion/bn_7000259856         | Fashion        |
      | Sports      | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031 | Sporting Goods |
