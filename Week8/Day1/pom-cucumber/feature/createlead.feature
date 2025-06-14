Feature: createLead functionality of leaftaps appln

#Background:
#Given Launch the browser and load the url

Scenario Outline: createlead with multiple data
When enter the username as 'demosalesmanager'
When enter the password as 'crmsfa'
And Click on login button
When click on crmsfa link
And click on leads link
And click on create leads link
And enter the companyName as <Company name>
And enter the firstname as <first name>
And enter the lastname as <last name>
When click on leads submitbutton
Then viewLeadsPage is displayed

Examples:
|Company name|first name|last name|
|Testleaf|Saranya|S|
|Testleaf|Vidya|R|

