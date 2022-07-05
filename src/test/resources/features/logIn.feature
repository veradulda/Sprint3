Feature: As a user, I should be able to login.

  @UND-1154
  Scenario: User can login with valid credentials
    Given Navigate to login page
    When Enter "Employee41" into username input
    And Enter "Employee123" into password input
    And Click on the login button on the login page
    Then Can navigate to homepage


  @UND-1155
  Scenario Outline: Verify to can’t login with invalid credentials for username (password and username data is valid)
    Given Navigate to login page
    When Enter "<invalid username>" as a invalid username  data
    When Enter "<invalid password>" as a invalid password  data
    And Click on the login button on the login page
    Then Verify to see this message “Wrong username or password.”

    Examples:
      | invalid username | invalid password |
      | Employee         | Employee123      |
      | Employee41       | Employee23       |
      | Employee1        | Employee23       |


  @UND-1156
  Scenario: Verify to can’t login with blank input for username (password data is valid)
    Given Navigate to login page
    When Enter valid password  data and left blank username input
    And Click on the login button on the login page
    And Click on the login button on the login page
    Then Verify to see this message “Please fill out this field.”

  @UND-1157
  Scenario: Verify to see only dots in the password input when typing password
    Given Navigate to login page
    Then verify to password input has required attribute


  @UND-1158
  Scenario: Verify can see the password if user wish
    Given Navigate to login page
    And Click “eye” icon in the password input
    Then Verify to can see password

  @UND-1159
  Scenario: Verify to see reset password page
    Given Navigate to login page
    And Click on the Forget password button
    Then verify to see reset password button

  @UND-1160
  Scenario: Verify to see placeholders on username and password inputs
    Given Navigate to login page
    When Verify to see "Username or email" in the username input
    Then Verify to see "Password" in the password input





