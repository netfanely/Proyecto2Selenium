Feature: Login functionality

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    Then I should see a success message
