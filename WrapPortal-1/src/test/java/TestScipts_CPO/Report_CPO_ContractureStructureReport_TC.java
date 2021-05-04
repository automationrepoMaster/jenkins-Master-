package TestScipts_CPO;

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
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_ContractorStructure;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;

public class Report_CPO_ContractureStructureReport_TC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String reportName = "Contractor Structure By Program";
	String ReportCategory="Tracking";
	
	//Select a Category ,Financial,Tracking,Organizational,Open Items,Claims,Enrollment,Data List
	

	@Test(dataProvider = "excelData")
	public void testContractorStructure(String ProgramName, String Division, String Projects)
			throws Throwable {
		String baseUrl = driver.getCurrentUrl();
		JavascriptExecutor js = (JavascriptExecutor) driver;// list
		try {
			CPO_LogInAction.logInCPO(driver);// login action take in place
			CPO_HomePage.IconReports(driver).click();// click on home report
														// icon
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
			
			
			// JavascriptExecutor js = (JavascriptExecutor) driver;// list
			js.executeScript("arguments[0].click();", CPO_ReportsModule.openReport(driver, reportName));// click
																										// onReport
			test.log(LogStatus.PASS, reportName + " Report Selected Successfully");
			Thread.sleep(1000);
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			wb.selectSingleValue(Report_ContractorStructure.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + "  Selected Successfully");
			Report_ContractorStructure.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			Report_ContractorStructure.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS,
					" Something Went Wrong " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
	
		try {
			System.out.println(Report_ContractorStructure.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_ContractorStructure.reportHeaderReportName(driver).getText(),
					"Contractor Structure By Program");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		// filter testing

		Report_ContractorStructure.filterWindowButton(driver).click();
		Thread.sleep(3000);
		Report_ContractorStructure.filterSelectProjectFormOption(driver, "Test Project 10").click();
		test.log(LogStatus.PASS, " First Project Selected Successfully");
		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
		int contPkgSize = 7;
		// testCount(contPkgSize);

		// add second project
		Report_ContractorStructure.filterWindowButton(driver).click();
		Thread.sleep(3000);
		Report_ContractorStructure.filterSelectProjectFormOption(driver, "Test 132 OFF").click();
		test.log(LogStatus.PASS, " Second Project Selected Successfully");
		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
		contPkgSize = 11;
		// testCount(contPkgSize);
try {
		// Check for pdf is generated or not take screenshot
		Report_ContractorStructure.pdfLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export To PDF Link ");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
}catch (Exception e) {
	// TODO: handle exception
	test.log(LogStatus.PASS, "can not be Clicked on Build Report Button  as it is removed in security modules change");
}

		// Excel file
		Report_ContractorStructure.excelLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export to Excel Link");
		Thread.sleep(10000);
		// isFileDownloaded is the std method which accept the name of file and
		// confirms the download
		//Assert.assertTrue(wb.isFileDownloaded("Claims_Coding_-_Contractor_Summary_Report.xls"),
		//		"Failed to download Expected document");
		if (wb.isFileDownloaded("Contractor_Structure_By_Program.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}

		// Add Filter Test
		Report_ContractorStructure.filterWindowButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Filter ");
		Thread.sleep(3000);
		Report_ContractorStructure.addFilterBtnOutside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button From Filter");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.waitForElemnet(Report_ContractorStructure.selectAnFilterDropdown(driver));
		wb.selectSingleValueByIndex(Report_ContractorStructure.selectAnFilterDropdown(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Filter Selected Successfully From Dropdown");
		wb.selectSingleValueByIndex(Report_ContractorStructure.selectAFilterCondition(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Filter Condition Selected Successfully ");
		Report_ContractorStructure.addFilterParameter1(driver).click();
		Thread.sleep(1000);
		wb.selectSingleValueFromList(Report_ContractorStructure.selectParameter1(driver), "Enrolled");
		test.log(LogStatus.PASS, "Parameter Selected Successfully ");
		Report_ContractorStructure.addFilterBtnInside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button ");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));

		js.executeScript("arguments[0].click();", ReportModule.btnBuildReport(driver));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");

		Thread.sleep(5000);

		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		driver.navigate().to(baseUrl);

	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP Report Data.xlsx";
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
		ExcelDataConfig config = new ExcelDataConfig(filePath);
		int row = config.getRowCount(0);// get exact row count from sheet
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

	public void testCount(int contPkgSize) {
		List<WebElement> countOfContractorPkg = Report_ContractorStructure.countContractorPkg(driver);

		if (countOfContractorPkg.size() == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, countOfContractorPkg.size() + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, "Contractor Pkg Count is Not Matached");
		}

	}
}
