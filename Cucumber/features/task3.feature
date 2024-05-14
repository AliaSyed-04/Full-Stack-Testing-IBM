@task3
Feature: Testing with Tags

  @SmokeTest
  Scenario: Testing Login
    Given User is on the Login Page
    When User enters username and password
    Then Read the page title and the confirmation message
    And Close the login Browser