package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ContractActualPayrollOld;

public class Report_ContractActualPayrollOld_TC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Contract Actual Payroll";
	@Test
	public void testContractActualPayrollOld() throws InterruptedException
	{
		try 
		{
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValueByIndex(ReportModule.selectProgramDropdown(driver), 24);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_ContractActualPayrollOld.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.switchTo().frame(0);
			wb.selectSingleValue(Report_ContractActualPayrollOld.selectDivision(driver), "All Divisions");
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_ContractActualPayrollOld.selectProjects(driver), "All Projects");
			test.log(LogStatus.PASS, " Project Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_ContractActualPayrollOld.selectContractors(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Thread.sleep(3000);
			Report_ContractActualPayrollOld.btnBuildReport(driver).click();
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
			System.out.println(Report_ContractActualPayrollOld.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_ContractActualPayrollOld.reportHeaderReportName(driver).getText(), "Contract Actual Payroll");
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
