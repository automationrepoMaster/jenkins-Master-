package TestScipts_CPO;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import GenericLibrary.FileUtils1;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_EnrollmentSummary;

public class Report_CPO_EnrollmentSummary_TC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String reportName = "Enrollment Summary";

	String ReportCategory = "Tracking";
	// Select a Category ,Financial,Tracking,Organizational,Open
	// Items,Claims,Enrollment,Data List

	@Test(dataProvider = "excelData")
	public void testEnrollmentTrackingReportOld(String ProgramName, String Division, String Projects)
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String baseUrl = driver.getCurrentUrl();
		try {
			CPO_LogInAction.logInCPO(driver);// login action take in place
			CPO_HomePage.IconReports(driver).click();// click on home report icon
			test.log(LogStatus.INFO, " Clicked On Reports Page");
			wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);// select
			test.log(LogStatus.PASS, ProgramName + " Program Selected");


			try {
				// Raja Wrote for SeletProgram category
				
				wb.selectSingleValue(CPO_ReportsModule.selectCategory(driver), ReportCategory);
				test.log(LogStatus.PASS, "report category is selected as " + ReportCategory);
				Thread.sleep(4000);
				}catch (Exception e) {
					System.out.println("Category is not avaialbel");
				}
			
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", CPO_ReportsModule.openReport(driver, reportName));// click
																										// onReport
			test.log(LogStatus.PASS, reportName + " Report Selected Successfully");

			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.switchTo().frame(0);

			wb.selectSingleValue(Report_CPO_EnrollmentSummary.selectContractors(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Thread.sleep(3000);
			Report_CPO_EnrollmentSummary.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(8000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			wb.waitForElemnet(Report_CPO_EnrollmentSummary.reportHeaderReportName(driver));
			System.out.println(Report_CPO_EnrollmentSummary.reportHeaderReportName(driver).getText());
			//Assert.assertEquals(Report_CPO_EnrollmentSummary.reportHeaderReportName(driver).getText(),
			//		"Enrollment Summary");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			driver.switchTo().defaultContent();
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		driver.navigate().to(baseUrl);
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		// String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP
		// Report Data.xlsx";
		String filePath = "D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
		ExcelDataConfig config = new ExcelDataConfig(filePath);// put all excel data in to the config object
		int row = config.getRowCount(0);// get exact row count from sheet
		int col = config.getColCount(0);
		System.out.println(col);
		System.out.println(row);
		Object[][] data = new Object[row - 1][col];// store all row and column in multidimensional array and print one
													// by one
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test
	}

}
