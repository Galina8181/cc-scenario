
Feature: Is it friday today
  Scenario: Sunday is not Friday
    Given : today is 'Sunday'
    When : I ask about whether it's Friday yet
    Then : I should be told 'Nope'