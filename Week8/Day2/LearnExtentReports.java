package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		//step1:setup the report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result1.html");
		//set the maintain the history
		//reporter.setAppendExisting(true);
		
		//instantiate extentreports
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
		//create the testcase and assign the testcase details
		
		ExtentTest test=extent.createTest("login","login with positive credentials");
		//assign the category
		test.assignCategory("smoke");
		test.assignAuthor("saranya");
		//assign testlevel status
		test.pass("uname entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/homepage.png").build());
		test.pass("pword entered sucessfully");
		test.pass("login is sucessful");
		//mandotory step
		extent.flush();
		
		System.out.println("done");


	}

}
