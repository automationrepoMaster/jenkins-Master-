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
import ObjectRepository.Report_GL_Credit_Tracking_Report;

public class Report_EnrollmentSummary_Lipscomb_Test extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Enrollment Summary - Lipscomb";
	String reportNameHeader = "Enrollment Summary - Lipscomb";

	@Test(dataProvider = "excelData")
	public void testReport_EnrollmentSummary_Lipscomb(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2)
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		try {
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			ReportModule.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			/*wb.selectSingleValue(ReportModule.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Divisions Selected Successfully");*/

		/*	ReportModule.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");*/

		/*	wb.selectSingleValue(Report_GL_Credit_Tracking_Report.filterSelectContractorFormOption(driver),
					"All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");*/
			js.executeScript("arguments[0].scrollIntoView();", ReportModule.btnBuildReport(driver));
			ReportModule.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		try {

			SoftAssert softAssertion = new SoftAssert();
			System.out.println(Report_GL_Credit_Tracking_Report.Reportheader_EnrollmentSummary(reportNameHeader,driver).getText());
			softAssertion.assertEquals(Report_GL_Credit_Tracking_Report.Reportheader_EnrollmentSummary(reportNameHeader,driver).getText(),
					reportNameHeader);
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			softAssertion.assertEquals(Report_GL_Credit_Tracking_Report.programName_Enrollmensummary(driver).getText(), ProgramName);
			System.out.println(Report_GL_Credit_Tracking_Report.programName(driver).getText()+ "it is program text for enrollment summary");
			test.log(LogStatus.PASS,
					"Program Name:- " + Report_GL_Credit_Tracking_Report.programName(driver).getText());
			  test.log(LogStatus.PASS, "Sponsor Name:- " +
			  Report_GL_Credit_Tracking_Report.sponsorName(driver).getText());
			  test.log(LogStatus.PASS, "Project Name:- " +
			  Report_GL_Credit_Tracking_Report.projectName(driver).getText());
			 
			test.log(LogStatus.PASS, "Time Stamp:- " + Report_GL_Credit_Tracking_Report.Timestamp_EnrollmentSummary(driver).getText());
			test.log(LogStatus.PASS,
					"PDF Option is Present:- " + Report_GL_Credit_Tracking_Report.exportToPDF_Enrollmentsummary(driver).isDisplayed());
			test.log(LogStatus.PASS, "Excel Option is Present:- "
					+ Report_GL_Credit_Tracking_Report.exportToExcel(driver).isDisplayed());

			test.log(LogStatus.PASS, "================= Column Name =================");
			List<WebElement> list = Report_GL_Credit_Tracking_Report.allColumnName(driver);
			// wb.printListData();
			for (int i = 0; i < list.size(); i++) {
				test.log(LogStatus.PASS, "=====> " + list.get(i).getText() + " <=====");
			}
			softAssertion.assertAll();
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		// Filter Testing
		/*ReportModule.FilterWindowButton(driver).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// select first project
		js.executeScript("arguments[0].click();",
				ReportModule.filterSelectProjectFormOption(driver, "Test Project 10"));
		Thread.sleep(1000);
		// select 2nd Project
		js.executeScript("arguments[0].click();", ReportModule.filterSelectProjectFormOption(driver, "Test 132 OFF"));
		// ReportModule.filterSelectProjectFormOption(driver, "Test Project
		// 10").click();
		test.log(LogStatus.PASS, " Project Selected Successfully");

		wb.selectSingleValue(Report_GL_Credit_Tracking_Report.filterSelectContractorFormOption(driver),
				"All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected Successfully");

		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(5000);*/

	//Check for pdf is generated or not take screenshot
		/*Report_GL_Credit_Tracking_Report.exportToPDF(driver).click();
		Thread.sleep(5000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));*/

		//raja
		// Excel file
		Report_GL_Credit_Tracking_Report.exportToExcel_Enrollmentsummary(driver).click();
		Thread.sleep(10000);

		//Raja chaged the reprot name
		
		if (wb.isFileDownloaded("Enrollment_Summary_-_Lipscomb.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		
//Add Filter Test
		Report_GL_Credit_Tracking_Report.filterWindowButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Filter ");
		Thread.sleep(3000);
		Report_GL_Credit_Tracking_Report.addFilterBtnOutside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button From Filter");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.waitForElemnet(Report_GL_Credit_Tracking_Report.selectAnFilterDropdown(driver));
		wb.selectSingleValueByIndex(Report_GL_Credit_Tracking_Report.selectAnFilterDropdown(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Filter Selected Successfully From Dropdown");
		wb.selectSingleValueByIndex(Report_GL_Credit_Tracking_Report.selectAFilterCondition(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Filter Condition Selected Successfully ");
		Report_GL_Credit_Tracking_Report.addFilterParameter1(driver).click();
		Thread.sleep(1000);
		wb.selectSingleValueFromList(Report_GL_Credit_Tracking_Report.selectParameter1(driver), "Enrolled");
		test.log(LogStatus.PASS, "Parameter Selected Successfully ");
		Report_GL_Credit_Tracking_Report.addFilterBtnInside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button ");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ReportModule.btnBuildReport(driver));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
		Thread.sleep(5000);
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\clientWiseReportTestData.xlsx";
		


		// Excel sheet as on 14-04-2021
				
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\clientWiseReportTestData.xlsx";
		
		
		ExcelDataConfig config = new ExcelDataConfig(filePath);
		int row = config.getRowCount(0);
		int col = config.getColCount(0);
		System.out.println(col);
		System.out.println(row);

		Object[][] data = new Object[row - 1][col];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test

	}

}
