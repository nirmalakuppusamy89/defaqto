@defaqto
Feature: Verify number of ratings for each product in defaqto home page
  As a user I want to get the number of ratings for each product
  So that I can verify the star ratings for all categories

  Background:
    Given I am on the Defaqto website homepage

  @carInsurance
  Scenario Outline: verify different rating companies for car insurance
    When I click on car insurance product
    Then verify the number of companies under <RATING> star rating for "car-insurance"
    Examples:
      | RATING |
      | 5      |
      | 4      |
      | 3      |

  @homeInsurance
  Scenario Outline: verify different rating companies for home insurance
    When I click home insurance product
    Then verify the number of companies under <RATING> star rating for "home-insurance"
    Examples:
    | RATING |
    | 5      |
    | 4      |
    | 3      |

  @travelInsurance
  Scenario Outline: verify different rating companies for travel insurance
    When I click travel insurance product
    Then verify the number of companies under <RATING> star rating for "travel-insurance"
    Examples:
    | RATING |
    | 5      |
    | 4      |
    | 3      |

  @creditCard
  Scenario Outline: verify different rating companies for credit card
    When I click credit card product
    Then verify the number of companies under <RATING> star rating for "credit-card"
    Examples:
      | RATING |
      | 5      |
      | 4      |
      | 3      |

  @currentAccount
  Scenario Outline: verify different rating companies for current account
    When I click current account product
    Then verify the number of companies under <RATING> star rating for "current-account"
    Examples:
      | RATING |
      | 5      |
      | 4      |
      | 3      |

  @allStarRatings
  Scenario: verify all star rating companies
    When I hover over all start rating icon
    Then I  can see all star rating companies