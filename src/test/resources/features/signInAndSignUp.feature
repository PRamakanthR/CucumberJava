Feature: Title of your feature

  Background: I launch the app
  Given I launch the DiscoveryPlus app
  Scenario: Validate the login functionality for the multi profile user
    When I land on home page as "anonymous" user
    Then I navigate to the "Account" page
    And I login to the app as "authenticated" user
    Then I select "default" profile
    And I land on home page as "authenticated" user
    
    Scenario Outline: Validate home page layout and navigation elements as "<userType>"
    When I land on home page as "<userType>" user
    And I validate the home page layout and navigation elements for "<userType>" user
    Examples:
    |   userType  |
    |  anonymous  |
    |authenticated|