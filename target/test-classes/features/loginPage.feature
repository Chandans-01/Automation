Feature: Signup and login page

Scenario: Verify that Login pages open when user clicks on Login button 
Given user is on Login page
Then Login page should open

Scenario: Verify that Email or mobile number field is present on the Login page
Given user is on Login page
Then Email or Mobile number field should present on the Login page

Scenario: Verify that Request OTP button is enabled on the Login page
Given user is on Login page
Then Request OTP button should be enabled


Scenario: Verify that Terms of Use and Privacy Policy links are present on the Login page
Given user is on Login page
Then Terms of Use and Privacy Policy links should present on the Login page


Scenario: Verify that Terms of Use page opened when user clicks on the Terms of Use link
Given user is on Login page
When user click on Terms of Use link
Then Terms page should open


Scenario: Verify that Privacy Policy page opened when user clicks on the Privacy Policy link
Given user is on Login page
When user click on Privacy Policy link
Then Privacy Policy page should open


Scenario: Verify that error displayed when user enters eleven digit mobile number
Given user is on Login page
And enters "11111111111" digit mobile number
And click on Request OTP button 
Then error should display


Scenario: Verify that Sign Up interface opens when user clicks on New to Flipkart button
Given user is on Login page
When user clicks on New to Flipkart button
Then Sign Up interface should open
And Continue button should displayed
And Existing User Log in button should displayed






