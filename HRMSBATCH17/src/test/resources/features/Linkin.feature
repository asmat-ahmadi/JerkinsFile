
Feature: Sign in scenarios

  Scenario: Valid user sign in
    Given user is navigated to Linkedin application
    When user enters  username and password
    And user clicks on signin button
    Then user is successfully sign in