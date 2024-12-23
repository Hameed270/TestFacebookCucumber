Feature: Login page feature


Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Shop"

Scenario: Forget password link
Given user is on login page
Then forget password link should be displayed

Scenario: Login page
Given user is on login page
When user enters username "galaxysk786@gmail.com"
And  user enters password "Shobby@270"
And user click on login button
Then user gets the title of the account page
And Account page title should be "My account - My Store"