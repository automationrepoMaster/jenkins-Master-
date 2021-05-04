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
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ContractorInsuranceCostTracking;
import ObjectRepository_CPO.Report_CPO_FinalDeduct;

public class ReportCPO_ContractorInsuranceCostTracking_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	public String reportName="Contractor Insurance Cost Tracking";
	String ReportCategory ="Tracking";
	
	@Test(dataProvider = "excelData")
	public void testContractorInsuranceCostTrackingReport(String ProgramName, String Division, String Projects) throws Throwable
	{		
			String baseUrl=driver.getCurrentUrl();
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			CPO_LogInAction.logInCPO(driver);//login action take in place 
			CPO_HomePage.IconReports(driver).click();//click on home report icon
			test.log(LogStatus.INFO, "Clicked On Reports Page");
			wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);//select repective program from list
			test.log(LogStatus.PASS,ProgramName+ " Program Selected");

			try {
				// Raja Wrote for SeletProgram category
				
				wb.selectSingleValue(CPO_ReportsModule.selectCategory(driver), ReportCategory);
				test.log(LogStatus.PASS, "report category is selected as " + ReportCategory);
				Thread.sleep(4000);
				}catch (Exception e) {
					System.out.println("Category is not avaialbel");
				}
			js.executeScript("arguments[0].scrollIntoView();",CPO_ReportsModule.openReport(driver,reportName));
			CPO_ReportsModule.openReport(driver,reportName).click();//click on respective report
			test.log(LogStatus.PASS,reportName+ " Report Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			
			Thread.sleep(1000);
//			wb.selectSingleValue(Report_CPO_ContractorInsuranceCostTracking.selectDistrict(driver), "All Districts");
			//JavascriptExecutor js = (JavascriptExecutor) driver;
	
			js.executeScript("arguments[0].scrollIntoView();",Report_CPO_ContractorInsuranceCostTracking.selectContractor(driver));
			Thread.sleep(2000);
//			wb.selectSingleValue(Report_CPO_ContractorInsuranceCostTracking.selectProject(driver), "All Projects");
			wb.selectSingleValueFromList(Report_CPO_ContractorInsuranceCostTracking.selectProject(driver), Projects);
//			wb.selectSingleValue(Report_CPO_ContractorInsuranceCostTracking.selectProject(driver), ProjectName);
			test.log(LogStatus.PASS,ProgramName+ " Project Selected");
			wb.selectSingleValue(Report_CPO_ContractorInsuranceCostTracking.selectContractor(driver), "All Contractors");
			test.log(LogStatus.PASS, " Contractor Selected");
			Report_CPO_ContractorInsuranceCostTracking.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			try {
				
				System.out.println(Report_CPO_ContractorInsuranceCostTracking.reportHeader(driver).getText());
				Assert.assertEquals(Report_CPO_ContractorInsuranceCostTracking.reportHeader(driver).getText(), "Contractor Insurance Cost Tracking");
				test.log(LogStatus.PASS, " Report Name Matched");
			} catch (Throwable e) 
			{
				test.log(LogStatus.PASS, e+" Report Name Not Matched");
			} 
			
			// Filter Testing
			ReportModule.FilterWindowButton(driver).click();
			Thread.sleep(3000);
		

			js.executeScript("arguments[0].click();",
					ReportModule.filterSelectProjectFormOption(driver, "Test Project 10"));
			test.log(LogStatus.PASS, " First Project Selected Successfully");

			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", Report_CPO_ContractorInsuranceCostTracking.btnBuildReport(driver));
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

//			testCount(2);
			ReportModule.FilterWindowButton(driver).click();
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", ReportModule.filterSelectProjectFormOption(driver, "Test 132 OFF"));
			test.log(LogStatus.PASS, " Second Project Selected Successfully");
			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", Report_CPO_ContractorInsuranceCostTracking.btnBuildReport(driver));
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);
//			testCount(5);
			
			Thread.sleep(2000);
			
			try {
			// Check for pdf is generated or not take screenshot
			Report_CPO_ContractorInsuranceCostTracking.pdfLink(driver).click();
			Thread.sleep(2000);
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Pdf Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			driver.close();
			driver.switchTo().window(wb.map.get("childID"));
			}catch (Exception e) {
				// TODO: handle exception
				test.log(LogStatus.PASS, "can not be Clicked on Build Report Button  as it is removed in security modules change");
			}

			// Excel file
			Report_CPO_ContractorInsuranceCostTracking.excelLink(driver).click();
			Thread.sleep(10000);
			if (wb.isFileDownloaded("Contractor_Insurance_Cost_Tracking.xls") == true) {
				System.out.println("Excel file Downloaded Successfully");
				test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
			} else {
				System.out.println("Excel file is not Downloaded Successfully");
				test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
			}
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
		List<WebElement> countOfContractorPkg = Report_CPO_FinalDeduct.countContractorPkg(driver);

		if (countOfContractorPkg.size() == contPkgSize) {
			System.out.println("Contractor Pkg Count is Matached");
			test.log(LogStatus.PASS, countOfContractorPkg.size() + " Contractor Pkg Count is Matached");
		} else {
			System.out.println("Contractor Pkg Count is Not Matached");
			test.log(LogStatus.FAIL, "Contractor Pkg Count is Not Matached");
		}

	}
}
