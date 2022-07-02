Feature: As a user, I should be able to log out.

  @UND-1120
  Scenario:User can log out and ends up in login page
    Given User should be on dashboard page as login
    When User click username button
    And User click logout button
    Then user should be login page

  @UND-1122
  Scenario: After logout, user cannot return previous page
    Given User should be on dashboard page as login
    When User click username button
    And User click logout button
    And User click step back button
    Then user should be login page
