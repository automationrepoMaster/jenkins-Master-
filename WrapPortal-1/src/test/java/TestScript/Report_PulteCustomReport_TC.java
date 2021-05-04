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
import ObjectRepository.Report_PulteCustomReport;
import ObjectRepository_NCP.Report_NCP_ContractorInsuranceCostTrackingReport;

public class Report_PulteCustomReport_TC extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Pulte Custom Report";

	@Test(dataProvider = "excelData")
	public void testPulteCustomReport(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2)
			throws InterruptedException {
		try {
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
//			WPO_LoginActionClientWise.logInOswald(driver);
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_PulteCustomReport.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
//			wb.selectSingleValue(Report_PulteCustomReport.filterSelectDivisionDropdown(driver), Division);
//			test.log(LogStatus.PASS, " Divisions Selected Successfully");
			Report_PulteCustomReport.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, " Project Selected Successfully");

//			wb.selectSingleValue(Report_PulteCustomReport.filterSelectContractorFormOption(driver), Projects);
//			test.log(LogStatus.PASS, " Contractor Selected Successfully");

			Report_PulteCustomReport.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		// String reportName=ReportModule.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {
			System.out.println(Report_PulteCustomReport.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_PulteCustomReport.reportHeaderReportName(driver).getText(),
					"Pulte Custom Report");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		// Check for pdf is generated or not take screenshot
								// Excel file
				Report_NCP_ContractorInsuranceCostTrackingReport.excelLink(driver).click();
				Thread.sleep(10000);
				if (wb.isFileDownloaded("Contractor_Insurance_Cost_Tracking.xls") == true) {
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
