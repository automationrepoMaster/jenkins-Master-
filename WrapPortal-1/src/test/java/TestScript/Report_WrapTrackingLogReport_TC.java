package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_WrapTrackingLogReport;

public class Report_WrapTrackingLogReport_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Wrap Tracking Log Report";
	@Test
	public void testWrapTrackingLogReport() throws InterruptedException
	{
	try 
	{
		HomePage.controlMenuReports(driver).click();
		test.log(LogStatus.INFO, "Clicked on Report Module Icon");
		Thread.sleep(2000);
		wb.selectSingleValueByIndex(ReportModule.selectProgramDropdown(driver), 24);
		test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
		Thread.sleep(5000);
		Report_WrapTrackingLogReport.selectReport(driver, selectReportName).click();
		test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		Report_WrapTrackingLogReport.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);

	} catch (Throwable e) {
		test.log(LogStatus.FAIL, e+" Something Went Wrong");
	}
	//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
	
	try {
		System.out.println(Report_WrapTrackingLogReport.reportHeaderReportName(driver).getText());
		Assert.assertEquals(Report_WrapTrackingLogReport.reportHeaderReportName(driver).getText(), "Wrap Tracking Log Report");
		System.out.println("Report Name is Matched");
		test.log(LogStatus.PASS, "Report Header Name Matched");
		test.log(LogStatus.PASS, "Report Generated Successfully");
	} catch (Throwable e) 
	{
		System.out.println("report name not matched");
		test.log(LogStatus.FAIL, e+"Report Header Name Not Matched");
	}
	
	driver.close();
	driver.switchTo().window(wb.map.get("parentID"));	
 }
}
