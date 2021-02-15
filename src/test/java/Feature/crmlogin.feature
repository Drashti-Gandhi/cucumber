Feature: Free CRM Login Feature
Scenario: Free CRM Login Test Scenario

Given user is already on Login Page
When user enters username and password
Then user clicks on login button
Then user is on home page

Scenario: Login when username password provided in feature file
Given user is already on Login Page
When user enters "dummy" and "dummy"
Then user clicks on login button
Then user is on home page

Scenario Outline: Login with examples keyword
Given user is already on Login Page
When user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Examples: 
	|username|password|
	|dummy|dummy|
	|dummy1|dummy1|

