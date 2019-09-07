Feature: Working with alerts
Background:
Given User launch the test site

# Different types of Alert boxes also called as popups #
Scenario: Test Alert with OKCancle buttons
When User switch to Alert page
And User click  alert with okCancel option
And User click  button for OKCancelAlert
Then User should see alert displayed
Then User dismiss the alert
And User click  alert with okCancel option
And User click  button for OKCancelAlert
Then User should see alert displayed
Then User accept the alert

Scenario: Test Simple Alert
When User switch to Alert page
And User click  alert with ok option
And User click  button
Then User should see alert displayed
Then User accept the alert

Scenario: Test Alert with textbox
When User switch to Alert page
And User click alert with textbox option
And User click button for textboxAlert
Then User should see alert displayed
And User should send username
Then User accept the alert

