package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
import ObjectRepository.Report_ActualPayroll_ReceiptsReport;
import ObjectRepository.Report_TieredReport;

public class Report_TieredReport_TC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Tiered Report";

	@Test(dataProvider = "excelData")
	public void testTieredReport(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2) throws InterruptedException {
		try {
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);

			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO,ProgramName+ "Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_TieredReport.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));

			Report_TieredReport.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects+" Project Selected Successfully");
			
			wb.selectSingleValue(Report_ActualPayroll_ReceiptsReport.filterSelectFromDate(driver), "Jun - 2019");
			test.log(LogStatus.PASS, " From Date Selected Successfully");
			wb.selectSingleValue(Report_ActualPayroll_ReceiptsReport.filterSelectToDate(driver), "Jul - 2020");
			test.log(LogStatus.PASS, " To Date Selected Successfully");
			
			wb.selectSingleValue(Report_TieredReport.filterSelectContractorFormOption(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			
			Report_TieredReport.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		try {
			System.out.println(Report_TieredReport.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_TieredReport.reportHeaderReportName(driver).getText(), "Tiered Report");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		// Filter Testing
				ReportModule.FilterWindowButton(driver).click();
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].click();",
						ReportModule.filterSelectProjectFormOption(driver, "Test Project 10"));
				test.log(LogStatus.PASS, " First Project Selected Successfully");

				Thread.sleep(1000);
				js.executeScript("arguments[0].click();", Report_TieredReport.btnBuildReport(driver));
				test.log(LogStatus.INFO, " Clicked On Build Report Button");
				Thread.sleep(3000);

				testCount(1, 7);
				ReportModule.FilterWindowButton(driver).click();
				Thread.sleep(3000);
				js.executeScript("arguments[0].click();", ReportModule.filterSelectProjectFormOption(driver, "Test 132 OFF"));
				test.log(LogStatus.PASS, " Second Project Selected Successfully");
				Thread.sleep(1000);
				
				js.executeScript("arguments[0].click();", Report_TieredReport.btnBuildReport(driver));
				test.log(LogStatus.INFO, " Clicked On Build Report Button");
				Thread.sleep(3000);
				testCount(2, 11);
				
				Thread.sleep(2000);
				// Check for pdf is generated or not take screenshot
				Report_TieredReport.pdfLink(driver).click();
				Thread.sleep(2000);
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				Thread.sleep(5000);
				test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				driver.close();
				driver.switchTo().window(wb.map.get("childID"));

				// Excel file
				Report_TieredReport.excelLink(driver).click();
				Thread.sleep(10000);
				if (wb.isFileDownloaded("Actual_Payroll-Receipts_Report.xls") == true) {
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
		
		


		// Excel sheet as on 14-04-2021
				
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
		ExcelDataConfig config = new ExcelDataConfig(filePath);// put all excel
																// data in to
																// the config
																// object
		int row = config.getRowCount(0);// get exact row count from sheet
		int col = config.getColCount(0);
		System.out.println(col);
		System.out.println(row);

		Object[][] data = new Object[row - 1][col];// store all row and column
													// in multidimensional array
													// and print one by one
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test
	}

	public void testCount(int projectSize, int contPkgSize) {

		List<WebElement> countOfProject = Report_TieredReport.countProjectNames(driver);
		List<WebElement> countOfContractorPkg = Report_TieredReport
				.countProjectWiseContractorPkg(driver);

		if (countOfProject.size() == projectSize) {
			System.out.println("Project Count is Matached");
			test.log(LogStatus.PASS, countOfProject.size() + " Project Count is Matached");
		} else {
			System.out.println("Project Count is Not Matached");
			test.log(LogStatus.FAIL, countOfProject.size() + "Project Count is not Matached");
		}

		if (countOfContractorPkg.size() == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, countOfContractorPkg.size() + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, countOfContractorPkg.size() + "Contractor Pkg Count is Not Matached");
		}

	}
}
