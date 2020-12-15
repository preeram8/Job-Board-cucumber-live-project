@Activity1
Feature: Create a new User


@tag1
Scenario: Visit the sites backend and create a new user
    Given User is on Jobs login page
    When user enters username and password
    Then Navigate to users and create a user
    And close the browser