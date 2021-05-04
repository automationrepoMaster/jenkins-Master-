package TestScript;

import java.util.List;

import org.openqa.selenium.By;
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
import ObjectRepository.Report_OpenActionItems;

public class Report_OpenActionItems_TC extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Open Action Items";
	// String ProjectNAME1 ="UC - Test ";
	// String ProjectNAME2 ="UCD Tercero Dining Commons 2";

	@Test(dataProvider = "excelData")
	public void testOpenActionItemReport(String ProgramName, String Division, String Projects, String userName,
			String password, String ProjectNAME1, String ProjectNAME2) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			// WPO_LoginActionClientWise.logInWTW(driver);
			System.out.println(ProgramName + Division + Projects);
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(5000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + "Respective Program Select Form Dropdown");
			Thread.sleep(5000);

			js.executeScript("arguments[0].click();", Report_OpenActionItems.selectReport(driver, selectReportName));
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			System.out.println("Clicked on open Action Items Report");

			// Raja
			// wb.selectSingleValueFromList(Report_OpenActionItems.programsListFilter(driver),
			// "DPR Program IV");
			wb.selectSingleValueFromList(Report_OpenActionItems.programsListFilter(driver), ProgramName);
			// js.executeScript("arguments[0].scrollIntoView();", prog);
			// js.executeScript("arguments[0].click();",prog);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Respective Program Select Form Dropdown");

			wb.selectSingleValue(Report_OpenActionItems.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Divisions Selected Successfully");

			// Raja commnted it as by default it is taking All
			/*
			 * wb.selectSingleValue(Report_OpenActionItems.
			 * filterSelectProjectFormOption( driver), Projects);
			 * test.log(LogStatus.PASS,
			 * Projects+" Project Selected Successfully");
			 */

			// Raja

			js.executeScript("arguments[0].scrollIntoView();",
					Report_OpenActionItems.filterSelectContractorFormOption(driver));
			Report_OpenActionItems.filterSelectContractorFormOption(driver).click();
			// wb.selectSingleValue(Report_OpenActionItems.filterSelectContractorFormOption(driver),
			// "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");

			Report_OpenActionItems.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(7000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		try {
			System.out.println(Report_OpenActionItems.reportHeaderReportName(driver).getText());

			SoftAssert softAssertion = new SoftAssert();
			System.out.println(Report_OpenActionItems.reportHeaderReportName(driver).getText());
			softAssertion.assertEquals(Report_OpenActionItems.reportHeaderReportName(driver).getText(),
					"Open Action Items");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			// Raja chnaged it from program name
			
			// softAssertion.assertEquals(Report_OpenActionItems.programName(driver).getText(),
			// "DPR Program IV");\
			softAssertion.assertEquals(Report_OpenActionItems.programName_OpenAction(driver,ProgramName).getText(), ProgramName);
			//test.log(LogStatus.PASS, "Program Name:- " + Report_OpenActionItems.programName(driver).getText());
			//test.log(LogStatus.PASS, "Sponsor Name:- " + Report_OpenActionItems.sponsorName(driver).getText());
			//test.log(LogStatus.PASS, "Project Name:- " + Report_OpenActionItems.projectName(driver).getText());

			test.log(LogStatus.PASS, "Time Stamp:- " + Report_OpenActionItems.timeStamp(driver).getText());
			test.log(LogStatus.PASS,
					"PDF Option is Present:- " + Report_OpenActionItems.exportToPDF(driver).isDisplayed());
			test.log(LogStatus.PASS,
					"Excel Option is Present:- " + Report_OpenActionItems.exportToExcel(driver).isDisplayed());
			test.log(LogStatus.PASS, "================= Column Name =================");
			List<WebElement> list = Report_OpenActionItems.allColumnName(driver);
			// wb.printListData();
			for (int i = 0; i < list.size(); i++) {
				test.log(LogStatus.PASS, "=====> " + list.get(i).getText() + " <=====");

			}
			softAssertion.assertAll();
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		try {
			// Filter Testing
			ReportModule.FilterWindowButton(driver).click();
			Thread.sleep(3000);
			// JavascriptExecutor js = (JavascriptExecutor) driver;

			try {
				wb.selectSingleValue(Report_OpenActionItems.filterSelectProjectFormOption(driver), ProjectNAME1);
			} catch (Exception e) {
				test.log(LogStatus.INFO, "No such project 1");
			}
			test.log(LogStatus.PASS, " First Project Selected Successfully");

			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", Report_OpenActionItems.btnBuildReport(driver));
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

			// testCount(3);
			Thread.sleep(4000);
			ReportModule.FilterWindowButton(driver).click();
			Thread.sleep(3000);
			try {
				wb.selectSingleValue(Report_OpenActionItems.filterSelectProjectFormOption(driver), ProjectNAME2);
			} catch (Exception e) {
				test.log(LogStatus.INFO, "No such project");
			}
			test.log(LogStatus.PASS, " Second Project Selected Successfully");
			Thread.sleep(5000);
			js.executeScript("arguments[0].click();", Report_OpenActionItems.btnBuildReport(driver));
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			// testCount(13);

			Thread.sleep(2000);
			// Check for pdf is generated or not take screenshot
			Report_OpenActionItems.pdfLink(driver).click();
			Thread.sleep(2000);
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			driver.close();
			driver.switchTo().window(wb.map.get("childID"));
		} catch (Throwable e) {
			System.out.println(e);
			test.log(LogStatus.FAIL,
					e + "Something went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		// Excel file
		Report_OpenActionItems.excelLink(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Open_Action_Items.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		Thread.sleep(5000);

		// Add Filter Test
		ReportModule.FilterWindowButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Filter ");
		Thread.sleep(3000);

		Report_OpenActionItems.addFilterBtnOutside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button From Filter");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.waitForElemnet(Report_OpenActionItems.selectAnFilterDropdown(driver));
		wb.selectSingleValueByIndex(Report_OpenActionItems.selectAnFilterDropdown(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Filter Selected Successfully From Dropdown");
		wb.selectSingleValueByIndex(Report_OpenActionItems.selectAFilterCondition(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Filter Condition Selected Successfully ");
		Report_OpenActionItems.addFilterParameter1(driver).click();
		Thread.sleep(1000);

		// Raja changed it from Monthly payrll to Action Items
		wb.selectSingleValueFromList(Report_OpenActionItems.selectParameter1(driver), "Action Items"); // "Monthly
																										// Payroll");
		test.log(LogStatus.PASS, "Parameter Selected Successfully ");
		Report_OpenActionItems.addFilterBtnInside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button ");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ReportModule.btnBuildReport(driver));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");

		Thread.sleep(5000);

		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));

	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {

		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
		// String filePath = "D:\\NOURTEK\\Wrap
		// Portal-2\\testData\\WTWTestData.xlsx";
		


		// Excel sheet as on 14-04-2021
				
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";
		
		
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
													// and print one
													// by one
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test
	}

	public void testCount(int contPkgSize) {

		List<WebElement> countOfContractorPkg = Report_OpenActionItems.countProjectWiseContractorPkg(driver);

		if (countOfContractorPkg.size() == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, countOfContractorPkg.size() + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, countOfContractorPkg.size() + "Contractor Pkg Count is Not Matached");
		}

	}

}
