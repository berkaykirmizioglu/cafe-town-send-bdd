@login
Feature: Login

  Scenario: Login to CafeTownSend App
    Given User on the login page
    When she submit login form with credentials username as "Luke" and password as "Skywalker"
    Then she should see greetings message as "Hello Luke"
