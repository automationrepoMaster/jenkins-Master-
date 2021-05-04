package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleListener extends BaseClass implements ITestListener
{
	WebDriver driver=null;
	String filePath = "C:\\Users\\NTC_Brijesh\\Desktop\\Screenshot";
	
//	public static WebDriver driver = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	@Override
	public void onFinish(ITestContext arg0) 
	{
		extent.endTest(test);
		extent.flush();
		extent.close();
	}

	@Override
	public void onStart(ITestContext arg0) 
	{
		extent = new ExtentReports("D://MyExtentReport.html", true);
		extent.loadConfig(new File("E:\\kp workspace selenium\\Wrap Portal\\extent-config.xml"));	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		 test.log(LogStatus.FAIL, result.getName() + " Test is failed" +        result.getThrowable());
		  String faildTestNAme = result.getMethod().getMethodName();
			EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
			
			File srcfile = edriver.getScreenshotAs(OutputType.FILE);
			
			String path=".\\Screenshot\\"+faildTestNAme+".png";
			File dstFile = new File(path);
			try {
				FileUtils.copyFile(srcfile, dstFile);
			                              } catch (IOException e) 
					{
			                            	  System.out.println("Capture Failed "+e.getMessage());
					}			

	}
		
//	{
//		System.out.println("***** Error "+result.getName()+" test has failed *****");
//    	String methodName=result.getName().toString().trim();
//        ITestContext context = result.getTestContext();
//       WebDriver driver = (WebDriver)context.getAttribute("BaseClass.driver");
//    	takeScreenShot(methodName, driver);
//    }
//    
//    public void takeScreenShot(String methodName, WebDriver driver) {
//    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         //The below method will save the screen shot in d drive with test method name 
//            try {
//            	
//				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
//				System.out.println("***Placed screen shot in "+filePath+" ***");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}	
//	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 test.log(LogStatus.SKIP, result.getName() + " Test is Skipped" +  result.getThrowable());
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		test = extent.startTest((this.getClass().getSimpleName() + " :: " + result.getName()), result.getName());
		test.assignAuthor("Kiran Pirangute");
		test.assignCategory("Functional Test");
	     test.log(LogStatus.INFO, result.getName() + " Test has Started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		  test.log(LogStatus.PASS, result.getName() + " Test Passed Successfully");
	}

}
