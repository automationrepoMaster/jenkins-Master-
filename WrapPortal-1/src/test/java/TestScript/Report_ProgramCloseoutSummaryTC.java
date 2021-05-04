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
import ObjectRepository.Report_ProgramCloseoutSummary;

public class Report_ProgramCloseoutSummaryTC extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Program Closeout Summary";
	
//	String project1 = "120 Piedmont Student Housing";
//	String project2 = "712 West Peachtree";
	
	//report displays only missing payroll cp's
	@Test(dataProvider = "excelData")
	public void testProgramCloseoutSummary(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2)
			throws InterruptedException {
		try {
//			WPO_LoginActionClientWise.logInLockton(driver);
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Program Select Form Dropdown");
			Thread.sleep(5000);

			wb.selectSingleValueFromList(Report_ProgramCloseoutSummary.allReportList(driver), selectReportName);
			// Report_ProgramCloseoutSummary.selectReport(driver,
			// selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			wb.selectSingleValue(Report_ProgramCloseoutSummary.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Selected Successfully");
			Report_ProgramCloseoutSummary.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			Report_ProgramCloseoutSummary.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			System.out.println(e);
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}

		try {

			System.out.println(Report_ProgramCloseoutSummary.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_ProgramCloseoutSummary.reportHeaderReportName(driver).getText(),
					"Closeout Summary");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}
		// filter testing
		Report_ProgramCloseoutSummary.filterWindowButton(driver).click();
		Thread.sleep(3000);
		Report_ProgramCloseoutSummary.filterSelectProjectFormOption(driver, ProjectNAME1).click();
		test.log(LogStatus.PASS, " First Project Selected Successfully");
		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
		int contPkgSize = 2;
//		testCount(contPkgSize);

		// add second project
		Report_ProgramCloseoutSummary.filterWindowButton(driver).click();
		Thread.sleep(3000);
		Report_ProgramCloseoutSummary.filterSelectProjectFormOption(driver, ProjectNAME2).click();
		test.log(LogStatus.PASS, " Second Project Selected Successfully");
		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
		contPkgSize = 5;
//		testCount(contPkgSize);

		// Check for pdf is generated or not take screenshot
		Report_ProgramCloseoutSummary.pdfLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export To PDF Link ");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");

		// Excel file
		Report_ProgramCloseoutSummary.excelLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export to Excel Link");
		Thread.sleep(5000);

		if (wb.isFileDownloaded("Program_Closeout_Summary.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}

		// Add Filter Test
		Report_ProgramCloseoutSummary.filterWindowButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Filter ");
		Thread.sleep(3000);
		Report_ProgramCloseoutSummary.addFilterBtnOutside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button From Filter");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.waitForElemnet(Report_ProgramCloseoutSummary.selectAnFilterDropdown(driver));
		wb.selectSingleValueByIndex(Report_ProgramCloseoutSummary.selectAnFilterDropdown(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Filter Selected Successfully From Dropdown");
		wb.selectSingleValueByIndex(Report_ProgramCloseoutSummary.selectAFilterCondition(driver), 1);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Filter Condition Selected Successfully ");
		Report_ProgramCloseoutSummary.addFilterParameter1(driver).click();
		Thread.sleep(1000);
		wb.selectSingleValueFromList(Report_ProgramCloseoutSummary.selectParameter1(driver), "Enrolled");
		test.log(LogStatus.PASS, "Parameter Selected Successfully ");
		Report_ProgramCloseoutSummary.addFilterBtnInside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button ");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
	public void testCount(int contPkgSize )
	{
		List<WebElement> countOfContractorPkg= Report_ProgramCloseoutSummary.countContractorPkg(driver);
		
		if(countOfContractorPkg.size()==contPkgSize)
		{
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS,countOfContractorPkg.size()+" Contractor Pkg Count is Matached");
		}else
		{
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL,countOfContractorPkg.size()+"Contractor Pkg Count is Not Matached");
		}
	}
	
}
