3:00 to 3:30 --->Cucumber stepdefinition and runner class
3:30 to 3:45 ---> Breakout
3:45 to 4:15 ---> Parametrization
4:15 to 4:30 ---> Breakout
4:30 to 5:00 ---> Multiple data
5:00 to 5:10 --->Break
5:10 to 5:45 ---> Hooks implementation and tags
5:45 to 6:00 --->Recap

parameterization:
1)surround the dat with single quote in feature file
2)in the step def class replace the data with{string
3)pass the i/p args to the mtd and replace the hardcoded data with the args

Steps to pass multiple data to a scenario using Scenario Outline and Examples:
Create a feature file called CreateLead.feature and write all the BDD steps
In Scenario Outline replace the data with <> and pass a name inside it Enter the companyname as
In StepDefinition on the top of that particular method replace the parameterized data with (.)$ @Given("Enter the companyname as (.)$")

Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags

exceptions:
1)undefined step exception
2)duplicate step definition
3)invalid method exception
4)Null pointer exception