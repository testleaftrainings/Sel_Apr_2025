2:45 to 3:00 --->ExtentReports
3:00 to 4:00 --->ExtentReportIntegration
4:00 to 4:10 --->Break
4:10 to 5:10 --->HybridFramework
5:10 to 5:40 --->BreakOut
5:40 to 6:00 --->Recap

extent reports:
-AventStack(library)

@BeforeSUITE--->startReports()

 @BEFORETEST---->setvalues()

   @BEFORECLASS---->testcasedetails()

     @DATAPROVIDER---->sendData()

      @BEFOREMETHOD--->precondns()

        @Test----->testcase
    
     @AFTERMETHOD---->postcondns()

  @AfterCLASS

@AFTERTEST

@AFTERSUITE---->stopreports()

Framework:
 -tool
  -language
   -designpattern
    -libraries

Description:
 -HybridFramework(TestNG+Cucumber)
 -selenium webdriver as atool to interact with the web applns
-PAGEOBJECTMODEL
-libraries
   -Apache poi-read to values from Excel
   -AventStack-ExtentReports
   -testng-->execution
   -cucumber-->supports BDD
COMPONENTS OF FRAMEWOK:

-com.framework.selenium.design:
   -Browser-->it is an interface which has allthe un implemented method related the browsers
   -Element--->it is an interface which has allthe un implemented method related the Elements.
   -Enum--->group of constants which belongs to the same category
-com.framework.selenium.base:
 -selenium base:1)acts as a wrapperclass
                 2)proper exception handling is done.
                 3)its a class all reusable methods

-DriverInstance:it is used to maintain the driver instances specifically,to avoid the conflicts during parallel execution.
-com.framework.testNG.base:
  -PSM:--->defines precondns and postcondns
  -Retry Engine--->used to retry the failed testcases
-com.framework.utils:
 -datalibrary--->read excel 
 -reporter---->extent report Integration
-com.framework.pages:
 -testcases

 Faker:
  add the library java faker(1.0.1)
 
  throw and throws keyword:
throw is used to throw an exception at a specific point in a code
throws is used to declare that a method acn throw certain exceptions, allowing the calling method to handle them appropriately
 








