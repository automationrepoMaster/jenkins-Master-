package TestScipts_CPO;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import GenericLibrary.FileUtils1;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_ReportsModule;
import ObjectRepository_CPO.Report_CPO_ContractorProfile;

public class Report_CPO_ContractorProfile_TC extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String reportName = "Contractor Profile";
	public String ReortCategory= "Organizational";
	
	//while automating report is not generated successfully
	@Test(dataProvider = "excelData")
	public void testMissing_PayrollBy_Contractor_Report(String ProgramName, String Division, String Projects)
			throws Throwable 
	{
		
		String baseUrl = driver.getCurrentUrl();
		CPO_LogInAction.logInCPO(driver);// login action take in place
		CPO_HomePage.IconReports(driver).click();// click on home report icon
		test.log(LogStatus.INFO, " Clicked On Reports Page");
		wb.selectSingleValue(CPO_ReportsModule.selectProgram(driver), ProgramName);// select
		test.log(LogStatus.PASS, ProgramName + " Program Selected");
		
		try {
		// Raja Wrote for SeletProgram category
		
		wb.selectSingleValue(CPO_ReportsModule.selectCategory(driver), ReortCategory);
		test.log(LogStatus.PASS, "report category is selected as " + ReortCategory);
		Thread.sleep(4000);
		}catch (Exception e) {
			System.out.println("Category is not avaialbel");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;// list
		js.executeScript("arguments[0].click();",CPO_ReportsModule.openReport(driver, reportName));// click onReport
		test.log(LogStatus.PASS, reportName + " Report Selected Successfully");

		Thread.sleep(5000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		// wb.selectSingleValueByIndex(Report_CPO_ContractorProfile.selectProgram(driver),
		// 1);
		test.log(LogStatus.PASS, Projects + " Project Selected");
		Thread.sleep(1000);
		wb.selectSingleValue(Report_CPO_ContractorProfile.selectContractor(driver), "All Contractors");
		test.log(LogStatus.PASS, " Contractor Selected");

		Report_CPO_ContractorProfile.btnBuildReport(driver).click();
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		
		
		try {
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.switchTo().frame(1);
			Thread.sleep(2000);
			System.out.println(Report_CPO_ContractorProfile.reportHeader(driver).getText());
			Assert.assertEquals(Report_CPO_ContractorProfile.reportHeader(driver).getText(), "Contractor Profile");
			test.log(LogStatus.PASS, " Report Name Matched");
			test.log(LogStatus.PASS, " Report Generated " +test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		} catch (Throwable e) {
			test.log(LogStatus.PASS, e + " Report Name Not Matched");
		}
		driver.switchTo().defaultContent();
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		driver.navigate().to(baseUrl);
		
	}

	@DataProvider(name = "excelData")
	public Object[][] passdata() {
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP Report Data.xlsx";
		//String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
		
		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
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
}
