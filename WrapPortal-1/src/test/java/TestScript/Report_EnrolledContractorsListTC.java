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
import ObjectRepository.Report_ContractorStructure;
import ObjectRepository.Report_EnrolledContractorsList;

public class Report_EnrolledContractorsListTC extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String selectReportName = "Enrolled Contractors";
	String project1 = "120 Piedmont Student Housing";
	String project2 = "712 West Peachtree";
	
	//Raja
	
	String FilterCondition ="only show values similar to";
	String Filter ="Contract Status";

	
	@Test(dataProvider = "excelData")
	public void testEnrolledContractors(String ProgramName, String Division, String Projects,String userName, String password ,String ProjectNAME1,String ProjectNAME2)
			throws InterruptedException {
		try {
//			WPO_LoginActionClientWise.logInLockton(driver);
			WPO_LoginActionClientWise.logInCommon(driver, userName, password);
			System.out.println("username is"+ userName);
			System.out.println("Password  is"+ password);
			
			
			
			
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(Report_ContractorStructure.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Respective Program Select Form Dropdown");
			Thread.sleep(5000);
			Report_ContractorStructure.selectReport(driver, selectReportName).click();
			test.log(LogStatus.PASS, selectReportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			//wb.selectSingleValue(Report_EnrolledContractorsList.filterSelectDivisionDropdown(driver), Division);
			test.log(LogStatus.PASS, Division + " Selected Successfully");
			Report_EnrolledContractorsList.filterSelectProjectFormOption(driver, Projects).click();
			test.log(LogStatus.PASS, Projects + " Project Selected Successfully");

			Report_EnrolledContractorsList.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, " Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		
		try {
			System.out.println(Report_EnrolledContractorsList.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_EnrolledContractorsList.reportHeaderReportName(driver).getText(),
					"Enrolled Contractors");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		// filter testing
		Report_EnrolledContractorsList.filterWindowButton(driver).click();
		Thread.sleep(5000);
		Report_EnrolledContractorsList.filterSelectProjectFormOption(driver, project1).click();
		test.log(LogStatus.PASS, " First Project Selected Successfully");
		int contPkgSize = 11;
		// add second project
		Report_EnrolledContractorsList.filterSelectProjectFormOption(driver, project2).click();
		test.log(LogStatus.PASS, " Second Project Selected Successfully");
		ReportModule.btnBuildReport(driver).click();
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");
//		contPkgSize = 11;
//		testCount(contPkgSize);

		// Check for pdf is generated or not take screenshot
		Report_EnrolledContractorsList.pdfLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export To PDF Link ");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Clicked on Build Report Button ");

		// Excel file
		Report_EnrolledContractorsList.excelLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Export to Excel Link");
		Thread.sleep(5000);
		// isFileDownloaded is the std method which accept the name of file and
		// confirms the download
		//Assert.assertTrue(wb.isFileDownloaded("Claims_Coding_-_Contractor_Summary_Report.xls"),
		//		"Failed to download Expected document");
		if (wb.isFileDownloaded("Enrolled_Contractors_List.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}

		// Add Filter Test
		Report_EnrolledContractorsList.filterWindowButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Filter ");
		Thread.sleep(3000);
		Report_EnrolledContractorsList.addFilterBtnOutside(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Filter Button From Filter");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.waitForElemnet(Report_EnrolledContractorsList.selectAnFilterDropdown(driver));
		
		
		//Raja
		//wb.selectSingleValueByIndex(Report_EnrolledContractorsList.selectAnFilterDropdown(driver), 1);
		wb.selectByVisibleText(Filter, Report_EnrolledContractorsList.selectAnFilterDropdown(driver));
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Filter Selected Successfully From Dropdown");
		//wb.selectSingleValueByIndex(Report_EnrolledContractorsList.selectAFilterCondition(driver), 1);
		wb.selectByVisibleText(FilterCondition, Report_EnrolledContractorsList.selectAFilterCondition(driver));
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "Filter Condition Selected Successfully ");
		Report_EnrolledContractorsList.addFilterParameter1(driver).click();
		Thread.sleep(1000);
		wb.selectSingleValueFromList(Report_EnrolledContractorsList.selectParameter1(driver), "Enrolled");
		test.log(LogStatus.PASS, "Parameter Selected Successfully ");
		Report_EnrolledContractorsList.addFilterBtnInside(driver).click();
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
	}

	public void testCount(int contPkgSize) 
	{
		int ans = 0;
		List<WebElement> countOfContractorPkg = Report_EnrolledContractorsList.countContractorPkg(driver);
		for (int i = 0; i <= countOfContractorPkg.size() - 1; i++) {
			String a = countOfContractorPkg.get(i).getText();
			System.out.println("A-"+a);
			int b = Integer.parseInt(a);
			System.out.println("B-"+b);
			ans = ans + b;
		}
		System.out.println(ans);

		if (ans == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, ans + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, "Contractor Pkg Count is Not Matached");
		}

	}
}
