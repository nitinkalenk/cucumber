Feature: Application Login
  Background:
    Given Browser is open

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

  @SanityTest
  Scenario: Testing of ParameterType
    Given I have a blue ball

  Scenario: Testing of DataTable
    Given I have a below details
    | nitin | 1234 | 29 | medline

  Scenario: Testing of DataTable with header
    Given I have a below details with header
    | userName | password | age | organization |
    | nitin    | 1234     | 29  | medline |

  Scenario: Testing of DataTable with header
    Given I have a below details with header using transformer
      | userName | password | age | organization |
      | nitin    | 1234     | 29  | medline |

  Scenario Outline: Example of using examples in cucumber
    Given User is on NetBanking Landing Page
    When I want to login with username "<UserName>" and password "<Password>"
    Then Home Page is displayed
    Examples:
      | UserName | Password |
      | nitin    | 1234     |

