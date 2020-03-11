@operations
Feature: Operations

  Background:
    Given User on the login page
    When he submit login form with credentials username as "Luke" and password as "Skywalker"
    Then he should see greetings message as "Hello Luke"

  @create
  Scenario: Create a new record
    And he creates a new record with followings:
      | FirstName | LastName    | StartDate    | Email                       |
      | Test      | Data1       | 2020-01-01   | testdata1@mailinator.com    |
    Then he should see the record in employees list

  @update
  Scenario: Update a record
    And he updates a record with followings:
      | FirstName | LastName    | StartDate    | Email                              |
      | Test      | Data1       | 2020-05-05   | UPDATEDtestdata1@mailinator.com    |
    Then he should see the record in employees list
