Feature: Facebook login
As a fb user, I want to enter username and pwd as a parameter

Scenario: Validate fb login Scenario1
Given the user is on facebook login page
When he enteres "Deepa" as first name
And he enteres "Medhekar" as Surname
And he enteres 8876542367 as mobile number 
And he enteres "pwd" as new password
And he enteres 25 as birth date
And he enteres "Jul" as birth month
And he enteres 1970 as birth year
And he selects "Female" as gender