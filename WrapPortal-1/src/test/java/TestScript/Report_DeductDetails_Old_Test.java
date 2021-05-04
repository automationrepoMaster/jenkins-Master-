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
import ObjectRepository.Report_ContractorCloseOutTrackingOld;
import ObjectRepository.Report_EnrollmentListReportOld;

public class Report_DeductDetails_Old_Test extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Deduct Details";
	
	@Test(dataProvider = "excelData")
	public void testDeductDetailsOld(String ProgramName, String Division, String Projects,String userName, String password,String ProjectNAME1,String ProjectNAME2)
			throws InterruptedException {
		try {
			
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_ContractorCloseOutTrackingOld.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.switchTo().frame(0);
			/*wb.selectSingleValue(Report_ContractorCloseOutTrackingOld.selectDivision(driver), Division);
			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_ContractorCloseOutTrackingOld.selectProjects(driver), Projects);
			test.log(LogStatus.PASS, " Project Selected Successfully");
			Thread.sleep(3000);
			wb.selectSingleValue(Report_ContractorCloseOutTrackingOld.selectContractors(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");*/
			Thread.sleep(3000);
			Report_ContractorCloseOutTrackingOld.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		} catch (Throwable e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			
		}
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			System.out.println(Report_ContractorCloseOutTrackingOld.reportHeaderReportName_Deduct(driver).getText());
			Assert.assertEquals(Report_ContractorCloseOutTrackingOld.reportHeaderReportName_Deduct(driver).getText(),
					"Deduct Details");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
//			driver.switchTo().defaultContent();
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		// Check for pdf is generated or not take screenshot
		Report_EnrollmentListReportOld.linkExportToPDF(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));

		// Excel file
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		Report_EnrollmentListReportOld.linkExportToExcel(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Deduct_Details.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		
		
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
		


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
