Feature: Application Login
  Scenario: Home Page default login
    Given User is on NetBanking Landing Page
    When User Logs in to application with username "nitin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  Scenario: Home Page default login
    Given User is on NetBanking Landing Page
    When User Logs in to application with username "piku" and password "4321"
    Then Home Page is displayed
    And Cards are displayed