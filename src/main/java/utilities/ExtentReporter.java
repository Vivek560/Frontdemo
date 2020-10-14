package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
public static  ExtentReports extent;
	
	public static ExtentReports getExtentReport(){
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Front ACCOUNTING");
		reporter.config().setDocumentTitle("QA Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows 10");
		extent.setSystemInfo("Tested By", "Vivek C V");
		
		return extent;
	}

}
