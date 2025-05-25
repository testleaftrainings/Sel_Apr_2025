3:00 to 4:00 --->TestNg Basics &Seq.Execution
4:00 to 4:20 --->BreakOut
4:20 to 5:00 --->ParallelExecution
5:00 to 5:10 --->Break
5:10 to 5:30 --->BreakOut
5:30 to 6:00 --->TestNG Annotations

s/w required :
1)TestNG plugins--->compile &execution of testcases
2)Testng dependencies--->in pom.xml

convert java to testNg script:
1)convert main mthd to normal mtd.
  a)remove static
  b)remove string arguments
  c)give a valid mthd name
2)@Test on top of the method and import it.

Seq execution:
1)select the testcases--->right click--->testng---->convert to testng--->filename--->click on finish
2)open the xml file and execute it.

reports:
1)after the execction--->right click the project--->refresh--->test-output--->open-->right click the index.html-->open with s/y editor.
Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file
