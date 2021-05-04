package TestScript;

import org.openqa.selenium.JavascriptExecutor;
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
import ObjectRepository.Report_Agenda;

public class Report_AgendaTC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Agenda";

//	String project1 = "120 Piedmont Student Housing";
//	String project2 = "712 West Peachtree";

	@Test(dataProvider = "excelData")
	public void testAgendaReport(String ProgramName, String Division, String Projects, String userName, String password,
			String ProjectNAME1, String ProjectNAME2) throws InterruptedException {
		System.out.println(ProgramName + Division + Projects);
		try {
//			WPO_LoginActionClientWise.logInLockton(driver);
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);

			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Program Select Form Dropdown");
			Thread.sleep(5000);
			ReportModule.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			System.out.println(Division);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",
					Report_Agenda.filterSelectProjectFormOption(driver, Projects));
			Report_Agenda.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			Report_Agenda.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
		}
		// String reportName=ReportModule.reportHeaderReportName(driver, "Contractor
		// Enrollment Summary").getText();

		try {
			System.out.println(Report_Agenda.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_Agenda.reportHeaderReportName(driver).getText(), "Agenda");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {

		// String filePath = "E:\\kp workspace selenium\\Wrap
		// Portal\\testData\\clientWiseReportTestData.xlsx";

		// Excel sheet as on 14-04-2021

		String filePath = "D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";

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
