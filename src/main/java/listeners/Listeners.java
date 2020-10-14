package listeners;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import utilities.ExtentReporter;



public class Listeners  extends Base implements ITestListener{
	
		ExtentReports extentreport = ExtentReporter.getExtentReport();
		ExtentTest extentTest;
		ThreadLocal<ExtentTest> extentTestThread=new ThreadLocal<ExtentTest>();

		public void onTestStart(ITestResult result) {
			
			String testName=result.getName();
			
			extentTest = extentreport.createTest(testName);	
			extentTestThread.set(extentTest);
		
		}
		
		public void onTestSuccess(ITestResult result) {
			
			//extentTest.log(Status.PASS, result.getName()+"Test Execution successful");
			
			extentTestThread.get().log(Status.PASS, result.getName()+"Test Execution successful");
		}

		public void onTestFailure(ITestResult result) {
			
			WebDriver driver = null;
			String testName=result.getName();
			
			//extentTest.fail(result.getThrowable());
	
			extentTestThread.get().fail(result.getThrowable());
			
			 try {
				driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			 try {
			String screenshotfilepath=takescreenshot(testName, driver);
			extentTestThread.get().addScreenCaptureFromPath(screenshotfilepath, testName);
			} 
			 catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		public void onTestSkipped(ITestResult result) {
			System.out.println("The test execution skipped"+result.getName());
		}

		public void onFinish(ITestContext context) {
			
			extentreport.flush();
			
		}
	}




