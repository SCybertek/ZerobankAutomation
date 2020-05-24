@account_summary
Feature: Account summary
  Scenario: Account Summary title
    #Account Activity page should have the title Zero –Account activity.
    Given User is on the login page
    And User enters with valid credentials
    When User navigates to "Account Summary"
    Then User should verify that title "Zero - Account Summary" is displayed
    And Account summary page should display following
    |Cash Accounts|
    |Investment Accounts|
    |Credit Accounts   |
    |Loan Accounts     |
    And Credit Accounts table should have these options
    |Account|
    |Credit Card|
    |Balance    |