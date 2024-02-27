package TestNG.Axis;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution has successed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution has Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution has skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Execution has failed with few steps passed");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Execution has begin");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution has completed");
		
	}		
}

