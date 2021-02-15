Feature: Create new deals


Scenario: Create new deal
Given user is on CRM login page
When user enters email and passoword
|email|password|
|dj190493@gmail.com|Ahmedabad@1904|
And user clicks on login button
Then user clicks on deals menu
And Clicks on Create new deal
Then user enters deal details 
|Title|Amount|Commision|Probability|
|test|1000|40|30|
|Test1|3000|50|60|


