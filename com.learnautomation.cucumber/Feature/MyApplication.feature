Feature: Test Issue Tracker

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I Enter valid "<username>" and "<password>"
    Then user should be able to login successfully

    Examples: 
      | username   | password    |
      | duraipandi | duraipandi  |
      