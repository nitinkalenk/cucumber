Feature: Application Login
  Scenario: Home Page default login
    Given User is on NetBanking Landing Page
    When User Logs in to application with username and password
    Then Home Page is displayed
    And Cards are displayed