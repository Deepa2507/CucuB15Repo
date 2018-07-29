Feature: Facebook login
As a fb user, I want to enter username and pwd as a parameter

Scenario: Validate fb login Scenario1
Given the user is on facebook login page
When he enteres "user" as user name
And he enteres "pwd" as password
Then check username is present in textbox