Feature: Homepage


Scenario: Verify that Flipkart Explore plus button present on the page 
Given user is on homepage of flipkart
Then Flipkart Explore plus should be present on the page


Scenario: Verify that search field present on the page 
Given user is on homepage of flipkart
Then search field should be present on the page
	  
	  
Scenario: Verify that login dropdown present on the page 
Given user is on homepage of flipkart
Then login dropdown should be present on the page

Scenario: Verify that Cart button present on the page 
Given user is on homepage of flipkart
Then Cart button should be present on the page

Scenario: Verify that Become a seller button present on the page 
Given user is on homepage of flipkart
Then Become a seller button should be present on the page

Scenario: Verify that more help list dropdown present on the page 
Given user is on homepage of flipkart
Then more help list dropdown should be present on the page


Scenario: Verify that Cart page opened when user clicks on Cart button
Given user is on homepage of flipkart
When user clicks on the Cart button
Then Cart page should open


Scenario: Verify that Seller page page opened when user clicks on Become a Seller button 
Given user is on homepage of flipkart
When user clicks on the Become a Seller button 
Then Seller page should open

Scenario: Verify that More Help List Dropdown options are displayed
Given user is on homepage of flipkart
When user hover on the More Help List Dropdown option
Then Notification Preferences option should be display 
And Customer Care option should be display
And Advertise option should be display
And Download App should be display


Scenario: Verify that Login options are displayed
Given user is on homepage of flipkart
When user hover on the Login option
Then My Profile option should be display 
And Flipkart Plus Zone option should be display
And Orders should be display
And Wishlist should be display
And Rewards should be display
And Gift Cards should be display 

Scenario: Verify that Mobiles get searched when user search Mobile in the search box
Given user is on homepage of flipkart
When user search mobile in the search box
Then mobiles should displays in search results 



 