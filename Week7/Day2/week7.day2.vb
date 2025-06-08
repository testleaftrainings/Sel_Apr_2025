3:00 to 3:30 ---> Explicit wait
3.30 to 4.00 ---> constructor
4:00 to 4:10 ---> Break
4:10 to 5:00 ---> POM introduction & seq execution
5:00 to 5:20 ---> Breakout
5:20 to 6:00 --->Parallel execution
6:00 to 6:15 --->Recap

explicit wait:
condn based wait
waits for specific condn and stops waiting as soon as the condn is met.
when explicit wait can be used:
1)dynamic loading of web elements
2)element to be clickable
3)alerts
4)element not  interactable
5)staleness

LoginPage
-enterUsername
-Enter pwd
-click on login
welcomePage
 -click crmsfalink
myhomepage
-click leads
myLeads
-click on createlead
createlead
-entercompanyname
-enter fname
-enterlastname
viewleads
-verify leads

Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file
For Parallel Execution:
    - Remove static keyword in PSM
    - Create parameterized constructor in each pages
       public LoginPage(ChromeDriver driver) {
	        this.driver=driver;
         }
    - Pass driver value in each Constructor initialization in each pages and testcases
  