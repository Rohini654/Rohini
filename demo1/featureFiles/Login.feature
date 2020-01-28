Feature: Login Functionality 
@data-driven
Scenario: test login
 Given when i am on home page
 When i enter uname and pwd
 Then i am able to login
 
 
 @data-driven
 Scenario: The one where user picks different product through serach functionality
 When Larry searches below products in the search box:
 |Headphone|
 |Travel|
 |Laptop|
 Then product should be added in the cart if available
 
 
 @user-specific
Scenario Outline: test login
 Given when i am on home page
 When i enter "<uname>" and "<pwd>"
 Then i am able to login
 
 Examples:
 | uname | pwd |
 | ABC | Password123 |