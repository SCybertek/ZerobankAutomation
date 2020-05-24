@pay_bills
Feature: Pay Bills
# need to take a look at this pay_Bill feature file
  Scenario: Pay Bills title

    Given User is on the login page
    And User enters with valid credentials
    When User navigates to "Pay Bills"
    Then User should verify that title "Zero - Pay Bills" is displayed

@pay_bills1
    Scenario: Paying Bill with the information

      Given User is on the login page
      And User enters with valid credentials
      When User navigates to "Pay Bills"
      And User completes the payment information
      |Payee | Sprint|
      |Account | Savings|
      |Amount | 250     |
      |Date | 2020-05-18|
      |Description | Paying for family phone plan|
      And User clicks on pay button
      Then "The payment was successfully submitted." message should display


@pay_bill2
      Scenario: Paying Bill without any information

        Given User is on the login page
        And User enters with valid credentials
        When User navigates to "Pay Bills"
        And User clicks on pay button
        Then "Please fill out this field." error message should display
@pay_bill3
  Scenario: Paying Bill with invalid characters

    Given User is on the login page
    And User enters with valid credentials
    When User navigates to "Pay Bills"
    And User completes the payment information
      |Payee | Sprint|
      |Account | Savings|
      |Amount | w#z    |
      |Date | abcd|
      |Description | Paying for family phone plan|
    And User clicks on pay button
    Then "Error should come up" message should display




