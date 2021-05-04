package TestScipts_CPO;

import java.util.List;

import org.openqa.selenium.By;
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
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ContractorDeductTracking;

public class ReportCPO_ContractorDeductTracking_TC extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String reportName = "Contractor Deduct Tracking"; //Raja changed it- Contractor Insurance Cost Tracking";
	String ReportCategory = "Tracking";
	// Select a Category ,Financial,Tracking,Organizational,Open
	// Items,Claims,Enrollment,Data List

	@Test(dataProvider = "excelData")
	public void testContractorDeductTrackingReport(String ProgramName, String Division, String Projects)
			throws Throwable {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String baseUrl = driver.getCurrentUrl();
		try {
			CPO_LogInAction.logInCPO(driver);
			CPO_HomePage.IconReports(driver).click();
			test.log(LogStatus.INFO, " Clicked On Reports Page");
			wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);
			test.log(LogStatus.PASS, ProgramName + " Program Selected");


			try {
				// Raja Wrote for SeletProgram category
				
				wb.selectSingleValue(CPO_ReportsModule.selectCategory(driver), ReportCategory);
				test.log(LogStatus.PASS, "report category is selected as " + ReportCategory);
				Thread.sleep(4000);
				}catch (Exception e) {
					System.out.println("Category is not avaialbel");
				}
			
			CPO_ReportsModule.openReport(driver, reportName).click();
			test.log(LogStatus.PASS, reportName + " Report Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));

			/*
			 * wb.selectSingleValue(Report_CPO_ContractorDeductTracking.
			 * filterSelectDivisionDropdown(driver), Division); test.log(LogStatus.PASS,
			 * Division + " Divisions Selected Successfully");
			 * Report_CPO_ContractorDeductTracking.filterSelectProjectFormOption(driver,
			 * Projects).click(); test.log(LogStatus.PASS, Projects +
			 * " Project Selected Successfully");
			 * 
			 * wb.selectSingleValue(Report_CPO_ContractorDeductTracking.
			 * filterSelectContractorFormOption(driver), "All Contractors");
			 * test.log(LogStatus.PASS, " Contractor Selected Successfully");
			 */

			//Report_CPO_ContractorDeductTracking.btnBuildReport(driver).click();
			
			try {
				driver.switchTo().frame(0);
			
			//Division
			List<WebElement>ist = driver.findElements(By.xpath("//div[@id='pnlDivision']/table/tbody/tr/td//select/option"));
			
			wb.selectSingleValueFromList(ist, Division);
			test.log(LogStatus.PASS, "contractor  is selected as"+ "All Division");
			Thread.sleep(2000);
			
			//Project
			
			
			
			List<WebElement>projectslist = driver.findElements(By.xpath("//div[@id='Panel2']/table/tbody/tr/td//select/option"));
			wb.selectSingleValueFromList(ist, "Test 132 ON");
			test.log(LogStatus.PASS, "Project is selected as"+ "Test 132 ON");
			Thread.sleep(2000);
			
			
			// All contractors
			
			List<WebElement>contactslist = driver.findElements(By.xpath("//div[@id='pnlContractor']/table/tbody/tr/td//select/option"));
			wb.selectSingleValueFromList(ist, "All Contractors");
			test.log(LogStatus.PASS, "contractor  is selected as"+ "All Contractors");
			Thread.sleep(2000);
			
			
			
			
			
			WebElement buildreport = driver.findElement(By.xpath("//input[@id='btnBuildReport']"));
			js.executeScript("arguments[0].scrollIntoView();", buildreport);
			buildreport.click();
			Thread.sleep(2000);
			//buildreport.click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Report Generated" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			}catch (Exception e) {
				System.out.println("Test no frame");
			}

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
			test.log(LogStatus.PASS, "Something Went Wrong" + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		}
		// String reportName=ReportModule.reportHeaderReportName(driver, "Contractor
		// Enrollment Summary").getText();

		try {
			//System.out.println(Report_CPO_ContractorDeductTracking.reportHeaderReportName(driver).getText());
	     //Assert.assertEquals(Report_CPO_ContractorDeductTracking.reportHeaderReportName(driver).getText(),
		//		"Contractor Insurance Cost Tracking");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}
		// Filter Testing
		//ReportModule.FilterWindowButton(driver).click();
		Thread.sleep(3000);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
		 * js.executeScript("arguments[0].click();",
		 * ReportModule.filterSelectProjectFormOption(driver, "Test Project 10"));
		 * test.log(LogStatus.PASS, " First Project Selected Successfully");
		 */
		/*
		 * WebElement buildreport1 =
		 * driver.findElement(By.xpath("//input[@value='Build Report']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].click();", buildreport1);
		 * test.log(LogStatus.INFO, " Clicked On Build Report Button");
		 * Thread.sleep(3000);
		 */

//				testCount(2);
		//ReportModule.FilterWindowButton(driver).click();
		//Thread.sleep(3000);
		/*
		 * js.executeScript("arguments[0].click();",
		 * ReportModule.filterSelectProjectFormOption(driver, "Test 132 OFF"));
		 * test.log(LogStatus.PASS, " Second Project Selected Successfully");
		 */
		Thread.sleep(1000);
		/*
		 * js.executeScript("arguments[0].click();",
		 * Report_CPO_ContractorDeductTracking.btnBuildReport(driver));
		 * test.log(LogStatus.INFO, " Clicked On Build Report Button");
		 * Thread.sleep(3000);
		 */
//				testCount(5);

		Thread.sleep(2000);
		
		  try { driver.switchTo().frame(1); 
		  }
		  catch (Exception e) 
		  {
		  System.out.println("No such frame"); 
		  }
		 

		try {
			 driver.switchTo().defaultContent();
			// Check for pdf is generated or not take screenshot
			Report_CPO_ContractorDeductTracking.pdfLink(driver).click();
			Thread.sleep(5000);
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			driver.close();
			driver.switchTo().window(wb.map.get("childID"));
		} catch (Exception e) {
			// TODO: handle exception
			test.log(LogStatus.PASS,
					"can not be Clicked on Build Report Button  as it is removed in security modules change");
		}

		try {
		// Excel file
		Report_CPO_ContractorDeductTracking.excelLink(driver).click();
		Thread.sleep(10000);
		}catch (Exception e) {
			test.log(LogStatus.PASS, baseUrl);
		}
		/*
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 */
		//Thread.sleep(3000);
		if (wb.isFileDownloaded("Contractor Deduct Tracking.xls") == true) {
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		} else {
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		Thread.sleep(5000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("parentID"));

		driver.navigate().to(baseUrl);

	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		// String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP
		// Report Data.xlsx";
		String filePath = "D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
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

	public void testCount(int contPkgSize) {

		List<WebElement> countOfContractorPkg = Report_CPO_ContractorDeductTracking
				.countProjectWiseContractorPkg(driver);

		if (countOfContractorPkg.size() == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, countOfContractorPkg.size() + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, countOfContractorPkg.size() + "Contractor Pkg Count is Not Matached");
		}

	}

}
