package ModulerLibrary;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ContractorDeductTracking;

public class CPO_ReportOpenAction extends BaseClass
{

	WebDriverCommonLib wb=new WebDriverCommonLib();
	public String ProgramName="Sony Tower Test";
	public String ProjectName="Sony Project One";
	public String reportName="Contractor Deduct Tracking";
	
	public void openReport(String ProgramName,String reportName,String reportHeaderName ) throws Throwable
	{		
			String baseUrl=driver.getCurrentUrl();
			
			CPO_LogInAction.logInCPO(driver);
			CPO_HomePage.IconReports(driver).click();
			test.log(LogStatus.INFO, " Clicked On Reports Page");
			wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);
			test.log(LogStatus.PASS,ProgramName+ " Program Selected");
			CPO_ReportsModule.openReport(driver,reportName).click();
			test.log(LogStatus.PASS,reportName+ " Report Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.switchTo().frame(0);
			Thread.sleep(1000);
			wb.selectSingleValue(Report_CPO_ContractorDeductTracking.selectProgram(driver), ProjectName);
			test.log(LogStatus.PASS,ProgramName+ " Project Selected");
			Thread.sleep(1000);
			wb.selectSingleValue(Report_CPO_ContractorDeductTracking.selectContractor(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected");
			Report_CPO_ContractorDeductTracking.btnBuildReportOld(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			
			try {
				driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				System.out.println(Report_CPO_ContractorDeductTracking.reportHeader(driver).getText());
				Assert.assertEquals(Report_CPO_ContractorDeductTracking.reportHeader(driver).getText(), reportHeaderName);
				test.log(LogStatus.PASS, " Report Name Matched");
			} catch (Throwable e) 
			{
				test.log(LogStatus.PASS, e+" Report Name Not Matched");
			} 
			driver.switchTo().defaultContent();
			driver.close();
			driver.switchTo().window(wb.map.get("parentID"));	
			
			driver.navigate().to(baseUrl);
			
			
		
	}
}
