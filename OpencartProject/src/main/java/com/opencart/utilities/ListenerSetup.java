package com.opencart.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testbase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Test case execution started :-" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("Test case execution completed :-" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		logger.info("Test case execution failed :-" +result.getName());
		UtilClass.captureScreenshot(result.getName());
		logger.info("captured Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		logger.info("Test case execution skipped :-" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
