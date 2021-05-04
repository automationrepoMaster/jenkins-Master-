package TestScipts_CPO;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ContractorInsuranceCostTracking;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ContractorInsuranceCostTracking;

public class Compare_ContractorInsuranceCostTracking_Report extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testCompareContractorInsuranceCostTrakingReport() throws Throwable
	{
		String ProgramName = "Program7852";
		String ProjectName = "Sony Project9832";
		String reportName = "Contractor Insurance Cost Tracking";
		try 
		{
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName+" Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_ContractorInsuranceCostTracking.selectReport(driver, reportName).click();
			test.log(LogStatus.PASS, reportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			wb.selectSingleValueByIndex(Report_ContractorInsuranceCostTracking.filterSelectDivisionDropdown(driver), 1);
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Report_ContractorInsuranceCostTracking.filterSelectProjectFormOption(driver, ProjectName).click();
			test.log(LogStatus.PASS, ProjectName+" Project Selected Successfully");
			
			wb.selectSingleValue(Report_ContractorInsuranceCostTracking.filterSelectContractorFormOption(driver), "All Contractors");		
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			
			Report_ContractorInsuranceCostTracking.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e+" Something Went Wrong");
		}
		//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
		
		try {
			System.out.println(Report_ContractorInsuranceCostTracking.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_ContractorInsuranceCostTracking.reportHeaderReportName(driver).getText(), "Contractor Insurance Cost Tracking");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) 
		{
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e+"Report Header Name Not Matched");
		}
		
		List<WebElement> WPWClist = Report_ContractorInsuranceCostTracking.WCPremiumTotal(driver);
		ArrayList<String> WPlistWCData = new ArrayList<String>();
		for (int i = 0; i < WPWClist.size(); i++) {
			WPlistWCData.add(WPWClist.get(i).getText());
		}
		
		
		List<WebElement> WPGLlist = Report_ContractorInsuranceCostTracking.generalLiabilityPremiumTotal(driver);
		ArrayList<String> WPlistGLData = new ArrayList<String>();
		for (int i = 0; i < WPGLlist.size(); i++) {
			WPlistGLData.add(WPGLlist.get(i).getText());
		}
		
		List<WebElement> WPUMBlist = Report_ContractorInsuranceCostTracking.umbrellaLiabilityPremiumTotal(driver);
		ArrayList<String> WPlistUMBData = new ArrayList<String>();
		for (int i = 0; i < WPUMBlist.size(); i++) {
			WPlistUMBData.add(WPUMBlist.get(i).getText());
		}
		
		List<WebElement> WPSubTotal = Report_ContractorInsuranceCostTracking.contractorPkgCostSummarySubTotal(driver);
		ArrayList<String> WPlistSubTotal = new ArrayList<String>();
		for (int i = 0; i < WPSubTotal.size(); i++) {
			WPlistSubTotal.add(WPSubTotal.get(i).getText());
		}
		
		List<WebElement> WPTotal = Report_ContractorInsuranceCostTracking.contractorPkgCostSummaryTotal(driver);
		ArrayList<String> WPlistTotal = new ArrayList<String>();
		for (int i = 0; i < WPTotal.size(); i++) {
			WPlistTotal.add(WPTotal.get(i).getText());
		}
		
		List<WebElement> WPperPayroll = Report_ContractorInsuranceCostTracking.contractorPkgCostSummaryCostPercentBypayroll(driver);
		ArrayList<String> WPlistPerPayroll= new ArrayList<String>();
		for (int i = 0; i < WPperPayroll.size(); i++) {
			WPlistPerPayroll.add(WPTotal.get(i).getText());
		}
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
//contractor portal start
		String baseUrl = driver.getCurrentUrl();
		CPO_LogInAction.logInCPO(driver);
		CPO_HomePage.IconReports(driver).click();
		test.log(LogStatus.INFO, " Clicked On Reports Page");
		wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);
		test.log(LogStatus.PASS, ProgramName + " Program Selected");
		CPO_ReportsModule.openReport(driver, reportName).click();
		test.log(LogStatus.PASS, reportName + " Report Selected");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(1000);
		wb.selectSingleValueFromList(Report_CPO_ContractorInsuranceCostTracking.selectProject(driver), ProjectName);
		test.log(LogStatus.PASS, ProjectName	 + " Project Selected");
		Thread.sleep(1000);
		wb.selectSingleValue(Report_CPO_ContractorInsuranceCostTracking.selectContractor(driver), "All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected");
		Report_CPO_ContractorInsuranceCostTracking.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		
		List<WebElement> CPWPlist = Report_CPO_ContractorInsuranceCostTracking.WCPremiumTotal(driver);
		ArrayList<String> CPlistWCData = new ArrayList<String>();
		for (int i = 0; i < CPWPlist.size(); i++) {
			CPlistWCData.add(CPWPlist.get(i).getText());
		}
		
		List<WebElement> CPGLlist = Report_CPO_ContractorInsuranceCostTracking.generalLiabilityPremiumTotal(driver);
		ArrayList<String> CPlistGLData = new ArrayList<String>();
		for (int i = 0; i < CPGLlist.size(); i++) {
			CPlistGLData.add(CPGLlist.get(i).getText());
		}
		
		List<WebElement> CPUMBlist = Report_CPO_ContractorInsuranceCostTracking.umbrellaLiabilityPremiumTotal(driver);
		ArrayList<String> CPlistUMBData = new ArrayList<String>();
		for (int i = 0; i < CPUMBlist.size(); i++) {
			CPlistUMBData.add(CPUMBlist.get(i).getText());
		}
		
		List<WebElement> CPSubTotal = Report_CPO_ContractorInsuranceCostTracking.contractorPkgCostSummarySubTotal(driver);
		ArrayList<String> CPlistSubTotal = new ArrayList<String>();
		for (int i = 0; i < CPSubTotal.size(); i++) {
			CPlistSubTotal.add(CPSubTotal.get(i).getText());
		}
		
		List<WebElement> CPTotal = Report_CPO_ContractorInsuranceCostTracking.contractorPkgCostSummaryTotal(driver);
		ArrayList<String> CPlistTotal = new ArrayList<String>();
		for (int i = 0; i < CPTotal.size(); i++) {
			CPlistTotal.add(CPTotal.get(i).getText());
		}
		
		List<WebElement> CPperPayroll = Report_CPO_ContractorInsuranceCostTracking.contractorPkgCostSummaryCostPercentBypayroll(driver);
		ArrayList<String> CPlistPerPayroll = new ArrayList<String>();
		for (int i = 0; i < CPperPayroll.size(); i++) {
			CPlistPerPayroll.add(CPTotal.get(i).getText());
		}
		
		
		System.out.println(WPlistGLData.equals(CPlistGLData));
		if(WPlistGLData.equals(CPlistGLData)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		
		test.log(LogStatus.PASS, "Is List Matched:- "+WPlistGLData.equals(CPlistGLData));
		System.out.println(WPlistGLData);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report GL Values Wrap Portal:- "+WPlistGLData);
		System.out.println(CPlistGLData);
		test.log(LogStatus.PASS, "Contractor Insurance Tracking Report GL Values Contractor Portal:- "+CPlistGLData );

		System.out.println("Result of removing " + WPlistGLData.removeAll(CPlistGLData));
		System.out.println("Removing element are:- " + WPlistGLData);

		
		System.out.println(WPlistWCData.equals(CPlistWCData));
		if(WPlistWCData.equals(CPlistWCData)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		System.out.println(WPlistWCData);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report WC Values Wrap Portal:- "+WPlistWCData);
		System.out.println(CPlistWCData);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report WC Values Contractor Portal:- "+CPlistWCData);
		
		System.out.println(WPlistUMBData.equals(CPlistUMBData));
		if(WPlistUMBData.equals(CPlistUMBData)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		
		System.out.println(WPlistUMBData);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report UMB Values Wrap Portal:- "+WPlistUMBData);
		System.out.println(CPlistUMBData);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report UMB Values Contractor Portal:- "+CPlistUMBData);
		
		
		System.out.println(WPlistSubTotal.equals(CPlistSubTotal));
		if(WPlistSubTotal.equals(CPlistSubTotal)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		
		System.out.println(WPlistSubTotal);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Sub Total Values Wrap Portal:- "+WPlistSubTotal);
		System.out.println(CPlistSubTotal);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Sub Total Values Contractor Portal:- "+CPlistSubTotal);
		
		
		System.out.println(WPlistTotal.equals(CPlistTotal));
		if(WPlistTotal.equals(CPlistTotal)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		
		System.out.println(WPlistTotal);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Total Values Wrap Portal:- "+WPlistTotal);
		System.out.println(CPlistTotal);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Total Values Contractor Portal:- "+CPlistTotal);
		
		
		
		System.out.println(WPlistPerPayroll.equals(CPlistPerPayroll));
		if(WPlistPerPayroll.equals(CPlistPerPayroll)== true)
		{
			test.log(LogStatus.PASS,"Data Matched");
		}
		else
		{
			test.log(LogStatus.FAIL,"Data did't Matched");
		}
		
		System.out.println(WPlistPerPayroll);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Insurance Cost % by Payroll Values Wrap Portal:- "+WPlistPerPayroll);
		System.out.println(CPlistPerPayroll);
		test.log(LogStatus.PASS,"Contractor Insurance Tracking Report Insurance Cost % by Payroll Values Contractor Portal:- "+CPlistPerPayroll);
		
		
		
		int temp = 0;
		for (int i = 0; i < WPlistGLData.size(); i++) {
			System.out.println(WPlistGLData.get(i));
			for (int j = 0; j < CPlistGLData.size(); j++) {
				System.out.println(CPlistGLData.get(j));
				if (WPlistGLData.get(i).equals(CPlistGLData.get(j))) {
					System.out.println(WPlistGLData.get(i));
				} else {
					// System.out.println("in else ");
					temp = 1;
				}
			}
		}

		// System.out.println(temp);
		if (temp == 1) {
			System.out.println("List not matched");
		}
		
		
		Thread.sleep(5000);
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));

		driver.navigate().to(baseUrl);

		
	}
}
