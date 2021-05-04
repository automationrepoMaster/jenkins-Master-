package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_MissingPayrollbyContractorOld;

public class Report_MissingPayrollbyContractorOld_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Missing Payroll By Contractor";
	@Test
	public void testMissingPayrollbyContractorOld() throws InterruptedException
	{
		try 
		{
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValueByIndex(ReportModule.selectProgramDropdown(driver), 24);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_MissingPayrollbyContractorOld.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.switchTo().frame(0);
			wb.selectSingleValue(Report_MissingPayrollbyContractorOld.selectDivision(driver), "All Divisions");
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_MissingPayrollbyContractorOld.selectProjects(driver), "All Projects");
			test.log(LogStatus.PASS, " Project Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_MissingPayrollbyContractorOld.selectContractors(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Thread.sleep(3000);
			Report_MissingPayrollbyContractorOld.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
		}
		catch (Throwable e) 
		{
			System.out.println(e);
			test.log(LogStatus.FAIL, e+" Something Went Wrong");
		}
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			System.out.println(Report_MissingPayrollbyContractorOld.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_MissingPayrollbyContractorOld.reportHeaderReportName(driver).getText(),
					"Missing Payroll by Contractor Report");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			driver.switchTo().defaultContent();
		} catch (Throwable e) 
		{
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e+"Report Header Name Not Matched");
		}		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		
	}
}
