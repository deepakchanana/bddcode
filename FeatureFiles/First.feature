Feature: Login functionality
Scenario: To test the login functionality with the valid credentials
Given user is on the login page
When user enter the username
When user enter the password
Then user should be able to login
When user do the signup