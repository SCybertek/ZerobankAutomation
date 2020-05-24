@login
Feature: Login

  @positive
  Scenario: Login with valid credentials

    Given User is on the login page
    And User enters with valid credentials
    Then User should verify that "Account summary page" should display

  @negative
  Scenario: Login with invalid credentials

    Given User is on the login page
    And User enters "wrongUser" username and "wrongPassword" password
    Then User should verify that "Login and/or password are wrong." error message should display

  Scenario: Login with empty fields

    Given User is on the login page
    And User enters "" username and "" password
    Then User should verify that "Login and/or password are wrong." should display

  @login2
  Scenario Outline: Negative scenarios using examples table

    Given User is on the login page
    And User enters "<username>" username and "<password>" password
    Then User should verify that "<message>" error message should display

    Examples:
      | username | password | message                         |
      | user     | pass     | Login and/or password are wrong. |
      |          |          | Login and/or password are wrong. |