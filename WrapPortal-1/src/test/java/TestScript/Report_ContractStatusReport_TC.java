package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import GenericLibrary.FileUtils1;
import ModulerLibrary.WPO_LoginActionClientWise;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ClaimsCodingContractorSummaryReport;
import ObjectRepository.Report_ContractStatusReport;

public class Report_ContractStatusReport_TC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Contract Status Report";
//	String ProjectNAME1 ="UC - Test ";
//	String ProjectNAME2 ="UCD Tercero Dining Commons 2";
	
	
	@Test(dataProvider = "excelData")
	public void testContractStatusReport(String ProgramName, String Division, String Projects,String userName, String password, String ProjectNAME1,String ProjectNAME2)
			throws Throwable {
		
//			WPO_LoginActionClientWise.logInWTW(driver);
		try {
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
			wb.selectSingleValue(ReportModule.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Divisions Selected Successfully");
			ReportModule.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			wb.selectSingleValue(Report_ContractStatusReport.filterSelectContractorFormOption(driver),
					"All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");

			ReportModule.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		try {

			SoftAssert softAssertion = new SoftAssert();
			System.out.println(Report_ContractStatusReport.reportHeaderReportName(driver).getText());
			softAssertion.assertEquals(Report_ContractStatusReport.reportHeaderReportName(driver).getText(),
					"Contract Status Report");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			softAssertion.assertEquals(Report_ContractStatusReport.programName(driver).getText(), ProgramName);
			test.log(LogStatus.PASS, "Program Name:- " + Report_ContractStatusReport.programName(driver).getText());
			test.log(LogStatus.PASS, "Sponsor Name:- " + Report_ContractStatusReport.sponsorName(driver).getText());
			test.log(LogStatus.PASS, "Project Name:- " + Report_ContractStatusReport.projectName(driver).getText());

			/*
			 * List<WebElement> listofContr =
			 * Report_ContractStatusReport.totalOfAllProjectContractor(driver); int sum = 0;
			 * for (int j = 0; j < listofContr.size(); j++) { String a =
			 * listofContr.get(j).getText(); System.out.println(">>>>"+ a +"><<<<<<<<<<");
			 * int res = Integer.parseInt(a); sum = sum + res; }
			 * System.out.println("Sum Of All Contractor is:- " + sum);
			 * test.log(LogStatus.PASS, "Sum Of All Contractor is:- " + sum); int grandTotal
			 * =
			 * Integer.parseInt(Report_ContractStatusReport.grandTotalOfContractor(driver).
			 * getText()); System.out.println("grandtotoal is >>>>>>>>>>>>>>>>>>>>. "
			 * +grandTotal ); test.log(LogStatus.PASS, "Grand Total Contractor is:- " +
			 * Report_ContractStatusReport.grandTotalOfContractor(driver).getText());
			 * 
			 * if ((sum == grandTotal)) { System.out.println("Contractor Total Matched");
			 * test.log(LogStatus.PASS, "Contractor Total Matched"); } else {
			 * System.out.println("Contractor Total is not Matched");
			 * test.log(LogStatus.FAIL, "Contractor Total misMatched"); }
			 */

			
			
			test.log(LogStatus.PASS, "Time Stamp:- " + Report_ContractStatusReport.timeStamp(driver).getText());
			/*
			 * test.log(LogStatus.PASS, "PDF Option is Present:- " +
			 * Report_ContractStatusReport.exportToPDF(driver).isDisplayed());
			 */
			test.log(LogStatus.PASS,
					"Excel Option is Present:- " + Report_ContractStatusReport.exportToExcel(driver).isDisplayed());

			test.log(LogStatus.PASS, "Total Contractor:- " + Report_ContractStatusReport.timeStamp(driver).getText());
			test.log(LogStatus.PASS, "================= Column Name =================");
			List<WebElement> list = Report_ContractStatusReport.allColumnName(driver);
			// wb.printListData();
			for (int i = 0; i < list.size(); i++) {
				test.log(LogStatus.PASS, "=====> " + list.get(i).getText() + " <=====");
			}
			softAssertion.assertAll();

		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		// Filter Testing
		ReportModule.FilterWindowButton(driver).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// select first project
		js.executeScript("arguments[0].click();",
				ReportModule.filterSelectProjectFormOption(driver, ProjectNAME1));
		Thread.sleep(1000);
		// select 2nd Project
		js.executeScript("arguments[0].click();", ReportModule.filterSelectProjectFormOption(driver, ProjectNAME2));
		// ReportModule.filterSelectProjectFormOption(driver, "Test Project
		// 10").click();
		test.log(LogStatus.PASS, " Project Selected Successfully");

		wb.selectSingleValue(Report_ContractStatusReport.filterSelectContractorFormOption(driver), "All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected Successfully");

		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
		// call the method for count verification
//		testCount(2, 11);

		// wb.printListData(Report_ContractStatusReport.countContractorPkgStatus(driver));
		test.log(LogStatus.PASS, "===================Below Are Contractor Package Status and Info===================");
		List<WebElement> lst = Report_ContractStatusReport.countContractorPkgStatus(driver);

		for (int i = 0; i <= lst.size() - 1; i++) {

			System.out.println(lst.get(i).getText());
			String a = lst.get(i).getText();
			test.log(LogStatus.PASS, a + "");
		}

		//functionality is removed
	/*	// Check for pdf is generated or not take screenshot
		Report_ClaimsCodingContractorSummaryReport.pdfLink(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));*/

		// Excel file
		Report_ClaimsCodingContractorSummaryReport.excelLink(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Contract_Status_Report.xls") == true) { //Raja changed Report name
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
	public Object[][] passdata() 
	{
//		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\WTWTestData.xlsx";
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

	public void testCount(int projectSize, int contPkgSize) {

		List<WebElement> countOfProject = Report_ContractStatusReport.countProjectNames(driver);
		List<WebElement> countOfContractorPkg = Report_ContractStatusReport.countProjectWiseContractorPkg(driver);

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
			test.log(LogStatus.FAIL, countOfProject.size() + "Contractor Pkg Count is Not Matached");
		}

	}
}
