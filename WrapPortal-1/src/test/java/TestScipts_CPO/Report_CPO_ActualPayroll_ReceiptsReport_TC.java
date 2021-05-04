package TestScipts_CPO;

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
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository.ReportModule;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ActualPayrolReceiptsReport;

public class Report_CPO_ActualPayroll_ReceiptsReport_TC extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
/*	public String ProgramName = "Program7852";// Sony Tower Test
	public String ProjectName = "Sony Project9832";
*/	public String reportName = "Actual Payroll-Receipts Report";

	@Test(dataProvider="excelData")
	public void testActulaPayrollReceiptsReport_CPO(String ProgramName, String Division, String Projects) throws Throwable {
		String baseUrl = driver.getCurrentUrl();

		try
		{
		CPO_LogInAction.logInCPO(driver);// login action take in place
		CPO_HomePage.IconReports(driver).click();// click on home report icon
		test.log(LogStatus.INFO, " Clicked On Reports Page");
		wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);// select
																					// list
		test.log(LogStatus.PASS, ProgramName + " Program Selected");
		CPO_ReportsModule.openReport(driver, reportName).click();// click onReport
		
		test.log(LogStatus.PASS, reportName + " Report Selected");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(1000);
		
		wb.selectSingleValue(Report_CPO_ActualPayrolReceiptsReport.filterSelectProjectFormOption(driver), Projects);
		test.log(LogStatus.PASS, Projects+" Project Selected Successfully");
		wb.selectSingleValue(Report_CPO_ActualPayrolReceiptsReport.filterSelectFromDate(driver), "Apr - 2019");
		test.log(LogStatus.PASS, " From Date Selected Successfully");
		wb.selectSingleValue(Report_CPO_ActualPayrolReceiptsReport.filterSelectToDate(driver), "Jul - 2020");
		test.log(LogStatus.PASS, " To Date Selected Successfully");
		
		wb.selectSingleValue(Report_CPO_ActualPayrolReceiptsReport.filterSelectContractorFormOption(driver), "All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected Successfully");

		Report_CPO_ActualPayrolReceiptsReport.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

	} catch (Throwable e) {
		test.log(LogStatus.FAIL, e + " Something Went Wrong");
		test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	}
	
	try {
		System.out.println(Report_CPO_ActualPayrolReceiptsReport.reportHeaderReportName(driver).getText());
		
		SoftAssert softAssertion= new SoftAssert();
		System.out.println(Report_CPO_ActualPayrolReceiptsReport.reportHeaderReportName(driver).getText());
		softAssertion.assertEquals(Report_CPO_ActualPayrolReceiptsReport.reportHeaderReportName(driver).getText(),
				"Actual Payroll-Receipts Report");
		System.out.println("Report Name is Matched");
		test.log(LogStatus.PASS, "Report Header Name Matched");
		test.log(LogStatus.PASS, "Report Generated Successfully");
		softAssertion.assertEquals(Report_CPO_ActualPayrolReceiptsReport.programName(driver).getText(),ProgramName);
		test.log(LogStatus.PASS,"Program Name:- " + Report_CPO_ActualPayrolReceiptsReport.programName(driver).getText());
		test.log(LogStatus.PASS,"Sponsor Name:- " + Report_CPO_ActualPayrolReceiptsReport.sponsorName(driver).getText());
		test.log(LogStatus.PASS,"Project Name:- " + Report_CPO_ActualPayrolReceiptsReport.projectName(driver).getText());
		
		test.log(LogStatus.PASS,"Time Stamp:- " + Report_CPO_ActualPayrolReceiptsReport.timeStamp(driver).getText());
		test.log(LogStatus.PASS,"PDF Option is Present:- " + Report_CPO_ActualPayrolReceiptsReport.exportToPDF(driver).isDisplayed());
		test.log(LogStatus.PASS,"Excel Option is Present:- " + Report_CPO_ActualPayrolReceiptsReport.exportToExcel(driver).isDisplayed());
		test.log(LogStatus.PASS,"================= Column Name =================" );
		List<WebElement> list = Report_CPO_ActualPayrolReceiptsReport.allColumnName(driver);
//		wb.printListData();
		for(int i=0;i<list.size();i++)
		{
			test.log(LogStatus.PASS,"=====> "+ list.get(i).getText() +" <=====");
			
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
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();",
				ReportModule.filterSelectProjectFormOption(driver, "Test Project 10"));
		test.log(LogStatus.PASS, " First Project Selected Successfully");

		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Report_CPO_ActualPayrolReceiptsReport.btnBuildReport(driver));
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);

//		testCount(1, 13);
		js.executeScript("arguments[0].click();", ReportModule.FilterWindowButton(driver));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", ReportModule.filterSelectProjectFormOption(driver, "Test 132 OFF"));
		test.log(LogStatus.PASS, " Second Project Selected Successfully");
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Report_CPO_ActualPayrolReceiptsReport.btnBuildReport(driver));
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
//		testCount(2, 19);
		
		Thread.sleep(2000);
		// Check for pdf is generated or not take screenshot
		Report_CPO_ActualPayrolReceiptsReport.pdfLink(driver).click();
		Thread.sleep(2000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));

		// Excel file
		Report_CPO_ActualPayrolReceiptsReport.excelLink(driver).click();
		Thread.sleep(10000);
		if (wb.isFileDownloaded("Actual_Payroll-Receipts_Report.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		Thread.sleep(5000);

	} catch (Throwable e) {
		System.out.println(e);
		test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	}
		
	driver.close();
	driver.switchTo().window(wb.map.get("parentID"));
	
	driver.navigate().to(baseUrl);
}
	
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		//String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP Report Data.xlsx";
		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(filePath);//put all excel data in to the config object
		int row=config.getRowCount(0);//get exact row count from sheet
		int col=config.getColCount(0);
		System.out.println(col);
		System.out.println(row);

Object[][] data = new Object[row-1][col];//store all row and column in multidimensional array and print one by one
		for(int i = 1;i<row;i++)
		{	
			for (int j = 0; j <col; j++) 
			{
	            data[i-1][j] = config.getExcelData("Sheet1", i, j);
	        }
		}
		return data;//return data to test
	}
	public void testCount(int projectSize, int contPkgSize) {

		List<WebElement> countOfProject = Report_CPO_ActualPayrolReceiptsReport.countProjectNames(driver);
		List<WebElement> countOfContractorPkg = Report_CPO_ActualPayrolReceiptsReport.countProjectWiseContractorPkg(driver);

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