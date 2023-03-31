Feature: Login Functionality

  Scenario: Login to Account

    Given Navigate to site

    When User sending Keys for Login

    Then User should Login successfully

    And User Logout successfully

  Scenario Outline: Wrong user login

    When User sending Keys for "<username>" and "<password>" click to login

    Then Allert massage should be displayed

    Examples:
      | username | password   |
      | MECorlu  | Corlu860   |
      | Techno   | Technogrp3 |
      | Joker    | Batman1    |

