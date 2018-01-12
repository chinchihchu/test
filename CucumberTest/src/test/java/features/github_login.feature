@tag
Feature: github login

  Scenario: A registered user in BrightTalk modified the last name, the correct last name should display
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen