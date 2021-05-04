package TestScript_NCP;

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
import ModulerLibrary.NCP_LoginAction;
import ObjectRepository.Report_NonCompliance;
import ObjectRepository_NCP.NCP_HomePage;
import ObjectRepository_NCP.NCP_ReportPage;
import ObjectRepository_NCP.Report_NCP_NON_Compliance_Report;

public class Report_NCP_NON_Compliance_Test extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String reportName = "Non-Compliance Report";

	@Test(dataProvider = "excelData")
	public void testNonComplianceReportNCP(String ProgramName, String Division, String Projects)
			throws InterruptedException {
		String BaseUrl = driver.getCurrentUrl();
		try {
			NCP_LoginAction.logInNCP(driver);
			NCP_HomePage.ReportModule(driver).click();
			test.log(LogStatus.PASS, " Clicked on Report Module");
			wb.waitForElemnet(NCP_ReportPage.selectProgramField(driver));
			Thread.sleep(3000);
			wb.selectSingleValueFromList(NCP_ReportPage.selectProgramFromList(driver), ProgramName);
			test.log(LogStatus.PASS, ProgramName + " Program Selected Successfully");
			wb.selectSingleValueFromList(NCP_ReportPage.selectReportNameFromList(driver), reportName);
			test.log(LogStatus.PASS, reportName + " Report Selected Successfully");

			Thread.sleep(5000);
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.manage().window().maximize();
			wb.selectSingleValue(Report_NCP_NON_Compliance_Report.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Divisions Selected Successfully");
			Report_NCP_NON_Compliance_Report.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			wb.selectSingleValue(Report_NCP_NON_Compliance_Report.filterSelectContractorFormOption(driver),
					"All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected Successfully");

			Report_NCP_NON_Compliance_Report.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		// String
		// reportName=Report_NCP_NON_Compliance_Report.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {

			SoftAssert softAssertion = new SoftAssert();
			System.out.println(Report_NCP_NON_Compliance_Report.reportHeaderReportName(driver).getText());
			softAssertion.assertEquals(Report_NCP_NON_Compliance_Report.reportHeaderReportName(driver).getText(),
					"Non-Compliance Report");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
			softAssertion.assertEquals(Report_NCP_NON_Compliance_Report.programName(driver).getText(), ProgramName);
			test.log(LogStatus.PASS,
					"Program Name:- " + Report_NCP_NON_Compliance_Report.programName(driver).getText());
			test.log(LogStatus.PASS,
					"Sponsor Name:- " + Report_NCP_NON_Compliance_Report.sponsorName(driver).getText());
			test.log(LogStatus.PASS,
					"Project Name:- " + Report_NCP_NON_Compliance_Report.projectName(driver).getText());

			test.log(LogStatus.PASS, "Time Stamp:- " + Report_NCP_NON_Compliance_Report.timeStamp(driver).getText());
			test.log(LogStatus.PASS,
					"PDF Option is Present:- " + Report_NCP_NON_Compliance_Report.exportToPDF(driver).isDisplayed());
			test.log(LogStatus.PASS, "Excel Option is Present:- "
					+ Report_NCP_NON_Compliance_Report.exportToExcel(driver).isDisplayed());

			test.log(LogStatus.PASS, "================= Column Name =================");
			List<WebElement> list = Report_NCP_NON_Compliance_Report.allColumnName(driver);
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
		Report_NCP_NON_Compliance_Report.FilterWindowButton(driver).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// select first project
		js.executeScript("arguments[0].click();",
				Report_NCP_NON_Compliance_Report.filterSelectProjectFormOption(driver, "Test Project 10"));
		Thread.sleep(1000);
		// select 2nd Project
		js.executeScript("arguments[0].click();",
				Report_NCP_NON_Compliance_Report.filterSelectProjectFormOption(driver, "Test 132 OFF"));
		// ReportModule.filterSelectProjectFormOption(driver, "Test Project
		// 10").click();
		test.log(LogStatus.PASS, " Project Selected Successfully");

		wb.selectSingleValue(Report_NCP_NON_Compliance_Report.filterSelectContractorFormOption(driver),
				"All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected Successfully");

		Report_NCP_NON_Compliance_Report.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
		// call the method for count verification
		// testCount(2, 11);

		/*
		 * // Check for pdf is generated or not take screenshot
		 * Report_NCP_NON_Compliance_Report.pdfLink(driver).click(); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); test.log(LogStatus.PASS,
		 * "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		 * Thread.sleep(5000); driver.close();
		 * driver.switchTo().window(wb.map.get("childID"));
		 */

		// Excel file
		Report_NCP_NON_Compliance_Report.excelLink(driver).click();
		Thread.sleep(10000);
		// isFileDownloaded is the std method which accept the name of file and
		// confirms the download
		// Assert.assertTrue(wb.isFileDownloaded("Project_Specific_Report.xls"),
		// "Failed to download Expected document");
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
		driver.navigate().to(BaseUrl);
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\NCP Report Data.xlsx";
		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\NCP Report Data.xlsx";
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
	}public void testCount(int projectSize,int contPkgSize )
	{
		
		List<WebElement> countOfProject = Report_NonCompliance.countProjectNames(driver);
		List<WebElement> countOfContractorPkg= Report_NonCompliance.countProjectWiseContractorPkg(driver);
		
		if(countOfProject.size()==projectSize)
		{
			System.out.println("Project Count is Matached");
			test.log(LogStatus.PASS,countOfProject.size()+" Project Count is Matached");
		}else
		{
			System.out.println("Project Count is Not Matached");
			test.log(LogStatus.FAIL,countOfProject.size()+"Project Count is not Matached");
		}
		
		if(countOfContractorPkg.size()==contPkgSize)
		{
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS,countOfContractorPkg.size()+" Contractor Pkg Count is Matached");
		}else
		{
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL,countOfProject.size()+"Contractor Pkg Count is Not Matached");
		}

	}
}
