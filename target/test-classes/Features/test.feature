Feature: Test login functionality of OrageHRM

Scenario Outline: Test the valid login
     
Given user is on login page
When user enters "<username>" and "<password>" 
And click on login button
Then user should land on home page

Examples:
		| username | password  |
		|  Admin   | Admin123  |
		|  admin1  |admin1234  |        
 