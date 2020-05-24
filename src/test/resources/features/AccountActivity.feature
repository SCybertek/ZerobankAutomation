@account_activity
Feature: Account activity

  Scenario: Account Activity title
    #Account Activity page should have the title Zero –Account activity.
    Given User is on the login page
    And User enters with valid credentials
    When User navigates to "Account Activity"
    Then User should verify that title "Zero - Account Activity" is displayed

@activityVerifications
    Scenario: Show transactions window
      Given User is on the login page
      And User enters with valid credentials
      When User navigates to "Account Activity"
      Then Account dropdown default option "Savings" should display
      And Account dropdown should have these options
      |Savings|
      |Checking|
      |Loan    |
      |Credit Card|
      |Brokerage  |
      And Transaction table should have these columns
      |Date|
      |Description|
      |Deposit    |
      |Withdrawal |



