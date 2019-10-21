package com.amit.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.amit.base.Page;
import com.amit.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends Page implements ITestListener  {

	public void onTestStart(ITestResult result) {
		test = rep.startTest(result.getName().toUpperCase());
		
	//	if (!TestUtil.isTestRunnable(result.getName(), excel)) {
			
		//	throw new SkipException("Skipping the test : " +result.getName().toUpperCase()+ " as run mode is NO ");
	//	}
		


	}

	public void onTestSuccess(ITestResult result) {

		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception : " +result.getThrowable());
		test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));
		

		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target = \"_blank\" href=" + Utilities.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\" href=" + Utilities.screenshotName + "><img src=" + Utilities.screenshotName
				+ " height=200 width=200></img></a>");
		
		rep.endTest(test);
		rep.flush();


	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+ " Skipped the test as the run mode is NO ");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
