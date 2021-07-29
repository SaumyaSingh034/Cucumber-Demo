Feature: NetBanking Application Login

Scenario: Home Page default Login

Given User is on landing page
When User login into Net Banking application with username "Saumya299" and password "HelloWorld1234@"
Then Home page is displayed
And All Credit card information are displayed "true"


Scenario: Home Page default Login

Given User is on landing page
When User login into Net Banking application with username "Rahul Bist" and password "helloUniverse@123"
Then Home page is displayed
And All Credit card information are displayed "False"