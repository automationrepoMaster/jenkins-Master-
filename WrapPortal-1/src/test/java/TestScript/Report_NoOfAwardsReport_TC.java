package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_NoOfAwardsReport;

public class Report_NoOfAwardsReport_TC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="No. of Awards Report";	
	@Test
	public void testNoOfAwardsReport() throws InterruptedException
	{
		try 
		{
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValueByIndex(ReportModule.selectProgramDropdown(driver), 24);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_NoOfAwardsReport.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			wb.selectSingleValue(Report_NoOfAwardsReport.filterSelectDivisionDropdown(driver), "All Divisions");
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Report_NoOfAwardsReport.filterSelectProjectFormOption(driver, "Sony Project One").click();
			test.log(LogStatus.PASS, " Project Selected Successfully");
		
			Report_NoOfAwardsReport.selectFromDate(driver).sendKeys("11/14/2017");;
			test.log(LogStatus.PASS, " From Date Selected Successfully");
			Report_NoOfAwardsReport.selectToDate(driver).sendKeys("11/14/2019");
			test.log(LogStatus.PASS, " To Date Selected Successfully");
			
			Report_NoOfAwardsReport.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
					
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e+" Something Went Wrong");
		}
		//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
		try {
			System.out.println(Report_NoOfAwardsReport.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_NoOfAwardsReport.reportHeaderReportName(driver).getText(), "No. of Awards Report");
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
