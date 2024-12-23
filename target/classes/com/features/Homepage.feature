Feature: FB Home page


Background:
Given User has already logged in Application
|username|password|
|galaxysk786@gmail.com|Shobby@270|

Scenario: Home page title
Given user is on account page
When user gets the title of the page
Then page title should be "My account - My Store"

Scenario: Account section count
Given user is on account page
Then user gets all account section
|ADD MY FIRST ADDRESS|
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESS|
|MY PERSONAL INFORMATION|
|Home|
And account section count should be 6
