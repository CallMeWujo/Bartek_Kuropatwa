Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $50 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $150 in my wallet
    When  I request $170
    Then  Nothing should be dispensed
    And I should be told that I don't have enough money in my wallet