@defaqto
Feature: Verify Feature Test
  As a user
  I should click and verify the relevant data

  Background:
    Given I am on the Defaqto website homepage

  @carInsurance
  Scenario Outline: verify different rating companies for car insurance
    When I click on car insurance icon
    Then verify the number of companies under <RATING> star rating for "car-insurance"
    Examples:
      | RATING |
      | 5      |
      | 4      |

  @homeInsurance
  Scenario Outline: verify different rating companies for home insurance
    When I click home insurance icon
    Then verify the number of companies under <RATING> star rating for "home-insurance"
    Examples:
    | RATING |
    | 5      |
    | 4      |

  @travelInsurance
  Scenario Outline: verify different rating companies for travel insurance
    When I click travel insurance icon
    Then verify the number of companies under <RATING> star rating for "travel-insurance"
    Examples:
    | RATING |
    | 5      |
    | 4      |

  @creditCard
  Scenario Outline: verify different rating companies for credit card
    When I click credit card icon
    Then verify the number of companies under <RATING> star rating for "credit-card"
    Examples:
      | RATING |
      | 5      |
      | 4      |


  @currentAccount
  Scenario Outline: verify different rating companies for current account
    When I click current account
    Then verify the number of companies under <RATING> star rating for "current-account"
    Examples:
      | RATING |
      | 5      |
      | 4      |


  @allStarRatings
  Scenario: verify all star rating companies
    When I hover over all start rating icon
    Then I  can see all star rating companies






