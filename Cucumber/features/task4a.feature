@task4
Feature: Login Test WExm

  @SmokeTest
  Scenario: Testing Login with Examples
    Given User is landed on Login Page
    When User logs in with "<Username>" and "<Password>"
    Then Read page title and confirmation message
    And Quit Browser

  Examples:
  | Username | Password |
  | admin    | password |
  | meow     | catcat   |