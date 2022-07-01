Feature: As a user, I should be able to log out.

  @wip
  Scenario:User can log out and ends up in login page
    Given User should be on dashboard page as login
    When User click username button
    And User click logout button
    Then user should be login page

  Scenario: After logout, user cannot return previous page
    Given User should be on dashboard page as login
    When User click username button
    And User click logout button
    And User click step back button
    Then User should not be able to return dashboard page
