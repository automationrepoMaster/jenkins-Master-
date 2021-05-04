package TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import ModulerLibrary.WPO_LoginActionClientWise;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ContractValueandLaborHoursbyProject;

public class Report_ContractValueLaborHoursbyProjectTC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Contract Value and Labor Hours by Project";
	@Test(dataProvider="excelData")
	public void testProjectSpecificReport(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2) throws InterruptedException
	{
	try 
	{
		WPO_LoginActionClientWise.logInCommon(driver, userName, password);
		HomePage.controlMenuReports(driver).click();
		test.log(LogStatus.INFO, "Clicked on Report Module Icon");
		Thread.sleep(2000);
		wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
		test.log(LogStatus.INFO,ProgramName+ " Program Select Form Dropdown");
		Thread.sleep(5000);
		ReportModule.selectReport(driver, selectReportName).click();
		test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
		wb.getWindowIDs();
		
		driver.switchTo().window(wb.map.get("childID"));
		wb.selectSingleValue(Report_ContractValueandLaborHoursbyProject.filterSelectDivisionDropdown(driver), Division);
		test.log(LogStatus.PASS, Division+" Selected Successfully");
		Report_ContractValueandLaborHoursbyProject.filterSelectProjectFormOption(driver, Projects).click();
		test.log(LogStatus.PASS, Projects+" Project Selected Successfully");
		
		
		Report_ContractValueandLaborHoursbyProject.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);

	} catch (Throwable e) {
		test.log(LogStatus.FAIL, e+" Something Went Wrong");
	}
	//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
	
	try {
		System.out.println(Report_ContractValueandLaborHoursbyProject.reportHeaderReportName(driver).getText());
		Assert.assertEquals(Report_ContractValueandLaborHoursbyProject.reportHeaderReportName(driver).getText(), "Contract Value and Labor Hours by Project");
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
	
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		//String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
//		String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\LocktonReportData.xlsx";
		


		// Excel sheet as on 14-04-2021
				
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";
		
		ExcelDataConfig config=new ExcelDataConfig(filePath);//put all excel data in to the config object
		int row=config.getRowCount(0);//get exact row count from sheet
		int col=config.getColCount(0);
		System.out.println(col);
		System.out.println(row);
		Object[][] data = new Object[row][col];//store all row and column in multidimensional array and print one by one
		for(int i = 0;i<row;i++)
		{	
			for (int j = 0; j <col; j++) 
			{
	            data[i][j] = config.getExcelData("Sheet1", i, j);
	        }
		}
		return data;//return data to test
		
	}
}
