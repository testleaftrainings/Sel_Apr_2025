3:00 to 3:30 --->Exception Handling
3:30 to 4:00 --->POM-Cucumber
4:00 to 4:20 --->BreakOut
4:20 to 5:00 --->POM-ThreadLocal
5:00 to 5:10 --->Break
5:10 to 5:30 --->POM-Excel Integration
5:30 to 6:00 --->ExtentReports


Exceptions:
 Abnormal behaviour which stops the program Execution
 1)compile(checked excetions)--->occurs due to N/W errors,i/o errors
 2)Runtime (unchecked )---->durinthe execution of program

 how to handle exceptions:
 -using try and catch block
 -use single try block with multiple catch blocks
 -use try block and catch bocks separately.
 POM with Cucumber:
For TestNG _POM : - with driver as static -> sequential execution is possible - To have sequential and parallel execution declare Parameterized Constructor in each pages
For Cucumber_POM: - Constructor should not be defined - With driver as static -> sequential execution is possible

private-accessed only with in the class
static-belong to class and not to any instance and it ensures on copy for each of the class.
final-once the ocject is initialized,it cannot change it.

Java class which is used to access each thread independently private static final ThreadLocal chDriver = new ThreadLocal();
private: - This variable can be accessed only within the class static+final - constant -> cannot change the value.