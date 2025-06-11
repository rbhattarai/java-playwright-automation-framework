@SmokeTest
Feature: Login Feature

  Scenario: User logs in successfully
    Given I open the application
    When I login as a user
    Then I should see the homepage
