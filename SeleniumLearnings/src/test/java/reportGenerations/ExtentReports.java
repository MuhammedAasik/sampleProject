package reportGenerations;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReports {

	public static void main(String[] args) {
	
		
		//1. to create a html-path
		ExtentSparkReporter reportPath=new ExtentSparkReporter("C:\\Users\\aashi\\eclipse-workspace\\SeleniumSpace\\SeleniumLearnings\\ExtentReports");
		reportPath.config().setTheme(Theme.DARK);
		reportPath.config().setDocumentTitle("Report");
		reportPath.config().setReportName("Muhammed Aasik ");
		//2.Create a report
		ExtentReports createReport= new ExtentReports();
		
		//3.Configur
		//createReport.atta
	
	
	}	

}
