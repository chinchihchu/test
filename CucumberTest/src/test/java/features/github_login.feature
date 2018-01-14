@tag
Feature: github login

  Scenario: A registered user in BrightTalk modified the last name, the correct last name should display
    Given a registered user login BrightTalk homepage
    When user update the last name 
    Then the updated last name should display correctly on Knowledge Feed page