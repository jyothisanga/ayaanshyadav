Feature: test for google application

  Scenario: Verify Title of Google page
    Given Browser and app should open
    When User captures Title
    Then Title should match expected title
