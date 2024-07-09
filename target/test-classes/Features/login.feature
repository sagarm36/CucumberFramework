Feature: Check the login functionality

Background: user launches the browser
Given Launch the browser

  Scenario Outline: Check login is success with valid credentials
    Given User is on login page
    When User enters "<username>" and "<password>"
    And User clicks on login button
    Then User is navigated to home page
    And User close the browser

    Examples: 
      | username                      | password         |
      | sagar.muttappanavar@gmail.com | Sagar@8618228856 |
      | sagar.muttappanavar@gmail.com | sagar@8618228856 |