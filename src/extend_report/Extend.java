package extend_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentTest test;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);

        spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyfirstExtendReport");
	 test= extent.createTest("login test");
	 
	 test.pass("login test started succesfully");
	 test.pass("url is loaded");
	 test.pass("value enterd");
	 test.pass("login test started successfully");
	 
	 test= extent.createTest("homepage test");
	 test.pass("homepage test started succesfully");
	 test.pass("url is loaded");
	 test.pass("value enterd");
	 test.pass("homepage  started successfully");
	 
	 
	 extent.flush();
	 
	 
	 
	
       

		
	}

}
