Feature: Verify and Validate the Login Functionality of Facebook application

  Scenario: Verify the login functionality with valid username and invalid password
    Given user is on facebook login page
    When user enters the valid username and invalid password
    Then user clicks on  the login button
    And user verifies whether it is navigating to home page of the facebook application
