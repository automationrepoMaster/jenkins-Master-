package TestScript_NCP;

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
import ModulerLibrary.NCP_LoginAction;
import ObjectRepository.ReportModule;
import ObjectRepository_NCP.NCP_HomePage;
import ObjectRepository_NCP.NCP_ReportPage;
import ObjectRepository_NCP.Report_NCP_Contractor_Status;

public class Report_NCP_Contractor_Status_Test extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String reportName = "Contractor Status";

	@Test(dataProvider = "excelData")
	public void testContractorStatus(String ProgramName, String Division, String Projects) throws InterruptedException {
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
			
			wb.selectSingleValue(Report_NCP_Contractor_Status.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Selected Successfully");
			
			Report_NCP_Contractor_Status.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");
			
			Report_NCP_Contractor_Status.btnBuildReport(driver).click();
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
			//System.out.println(Report_NCP_Contractor_Status.reportHeaderReportName(driver).getText());
		//	Assert.assertEquals(Report_NCP_Contractor_Status.reportHeaderReportName(driver).getText(),
				//	"Contractor Status");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}
		// Filter Testing
		ReportModule.FilterWindowButton(driver).click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// select first project
		js.executeScript("arguments[0].click();",Report_NCP_Contractor_Status.filterSelectProjectFormOption(driver, "Test 132 OFF"));
		Thread.sleep(1500);
		// select 2nd Project
		js.executeScript("arguments[0].click();",Report_NCP_Contractor_Status.filterSelectProjectFormOption(driver, "Test Project 10"));
		test.log(LogStatus.PASS, " Project Selected Successfully");

		/*wb.selectSingleValue(Report_NCP_Contractor_Status.filterSelectContractorFormOption(driver), "All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected Successfully");*/

		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
		// call the method for count verification
//		testCount(2, 11);

		// wb.printListData(Report_NCP_Contractor_Status.countContractorPkgStatus(driver));
		test.log(LogStatus.PASS, "===================Below Are Contractor Package Status and Info===================");
		List<WebElement> lst = Report_NCP_Contractor_Status.countContractorPkgStatus(driver);

		for (int i = 0; i <= lst.size() - 1; i++) {

			System.out.println(lst.get(i).getText());
			String a = lst.get(i).getText();
			test.log(LogStatus.PASS, a + "");
		}

		// Check for pdf is generated or not take screenshot
		Report_NCP_Contractor_Status.pdfLink(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));

		// Excel file
		Report_NCP_Contractor_Status.excelLink(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Contract_Status_Report.xls") == true) {
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
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\NCP Report Data.xlsx";
		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\NCP Report Data.xlsx";
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

	}public void testCount(int projectSize, int contPkgSize) {

		List<WebElement> countOfProject = Report_NCP_Contractor_Status.countProjectNames(driver);
		List<WebElement> countOfContractorPkg = Report_NCP_Contractor_Status.countProjectWiseContractorPkg(driver);

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
