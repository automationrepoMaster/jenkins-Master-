package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;

public class Report_ContractorEnrollmentSummary_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Contractor Enrollment Summary";
	@Test
	public void testContractorEnrollmentSummaryReport() throws InterruptedException
	{
		try 
		{
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValueByIndex(ReportModule.selectProgramDropdown(driver), 25);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			ReportModule.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			wb.selectSingleValue(ReportModule.filterSelectDivisionDropdown(driver), "All Divisions");
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			ReportModule.filterSelectProjectFormOption(driver, "Sony Project One").click();
			test.log(LogStatus.PASS, " Project Selected Successfully");
			ReportModule.filterSelectContractorFormOption(driver, "All Contractors").click();
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			ReportModule.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e+" Something Went Wrong");
		}
		//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
		
		try {
			Assert.assertEquals(ReportModule.reportHeaderReportName(driver).getText(), "Contractor Enrollment Summary");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) 
		{
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, "Report Header Name Not Matched");
		}
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		
	}
	
}
