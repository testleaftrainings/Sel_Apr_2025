Feature: Login functionality of leaftaps appln
#Background:
#Given Launch the browser and load the url
@smoke
Scenario: Login with positive cedentials

When enter the username as 'demosalesmanager'
When enter the password as 'crmsfa'
And Click on login button
Then Homepage is displayed

@sanity @regression
Scenario: Login with negative cedentials

When enter the username as 'demosales'
When enter the password as 'crmsfa'
And Click on login button
But Errormsg is displayed