package TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import GenericLibrary.FileUtils1;
import ModulerLibrary.WPO_LoginActionClientWise;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ContractorMonthlyManHours;

public class Report_ContractorMonthlyManHours_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectReportName="Contractor Monthly Man Hours";	
	@Test(dataProvider = "excelData")
	public void testContractorMonthlyManHours(String ProgramName, String Division, String Projects,String userName, String password, String ProjectNAME1,String ProjectNAME2) throws InterruptedException
	{
		try 
		{
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_ContractorMonthlyManHours.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName+ " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			
			/*wb.selectSingleValue(Report_ContractorMonthlyManHours.filterSelectDivisionDropdown(driver), "All Divisions");
			test.log(LogStatus.PASS, " Divisions Selected Successfully");*/
		
//			Report_ContractorMonthlyManHours.filterSelectProjectFormOption(driver, "Eglin AFB").click();
			
//			Report_ContractorMonthlyManHours.filterSelectProjectFormOption(driver, "Sony Project One").click();
			test.log(LogStatus.PASS, " Project Selected Successfully");
		
			wb.selectSingleValue(Report_ContractorMonthlyManHours.selectFromDate(driver), "Apr - 2019");
			test.log(LogStatus.PASS, " From Date Selected Successfully");
			wb.selectSingleValue(Report_ContractorMonthlyManHours.selectToDate(driver), "Mar - 2021");
			test.log(LogStatus.PASS, " To Date Selected Successfully");
			
			Report_ContractorMonthlyManHours.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
					
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e+" Something Went Wrong");
		}
		//		String reportName=ReportModule.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
		try {
			System.out.println(Report_ContractorMonthlyManHours.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_ContractorMonthlyManHours.reportHeaderReportName(driver).getText(), "Contractor Monthly Man Hours");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) 
		{
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e+"Report Header Name Not Matched");
		}
		// Check for pdf is generated or not take screenshot
		Report_ContractorMonthlyManHours.pdfLink(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));

		// Excel file
		Report_ContractorMonthlyManHours.excelLink(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Non-Compliance_Report.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		Thread.sleep(5000);

		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		
	}
	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		
		
		//String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
		


		// Excel sheet as on 14-04-2021
				
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";
		
		
		
		
		ExcelDataConfig config = new ExcelDataConfig(filePath);// put all excel
		int row = config.getRowCount(0);// get exact row count from sheet
		int col = config.getColCount(0);
		System.out.println(col);
		System.out.println(row);
		Object[][] data = new Object[row - 1][col];// store all row and column
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test

	}
}
