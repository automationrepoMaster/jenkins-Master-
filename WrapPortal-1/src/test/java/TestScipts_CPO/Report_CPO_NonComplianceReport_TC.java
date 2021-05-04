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
import ObjectRepository_CPO.Report_CPO_NonComplianceReport;

public class Report_CPO_NonComplianceReport_TC extends BaseClass
{
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String reportName = "Non-Compliance Report";
	String ReportCategory="Tracking";
	//Select a Category ,Financial,Tracking,Organizational,Open Items,Claims,Enrollment,Data List
	
	@Test(dataProvider="excelData")
	public void testNonComplianceReport_CPO(String ProgramName, String Division, String Projects) throws Throwable {
		String baseUrl = driver.getCurrentUrl();

		try
		{
		CPO_LogInAction.logInCPO(driver);// login action take in place
		CPO_HomePage.IconReports(driver).click();// click on home report icon
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;// list
		js.executeScript("arguments[0].click();",CPO_ReportsModule.openReport(driver, reportName));// click onReport
		
		test.log(LogStatus.PASS, reportName + " Report Selected");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(1000);
		
		Report_CPO_NonComplianceReport.filterSelectProjectFormOption(driver, Projects).click();
		test.log(LogStatus.PASS,Projects+ " Project Selected Successfully");
		
		wb.selectSingleValue(Report_CPO_NonComplianceReport.filterSelectContractorFormOption(driver), "All Contractors");		
		test.log(LogStatus.PASS, " Contractor Selected Successfully");
		
		js.executeScript("arguments[0].click();",Report_CPO_NonComplianceReport.btnBuildReport(driver));
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, " Report Generated " +test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	} catch (Throwable e) {
		test.log(LogStatus.FAIL, e+" Something Went Wrong");
		test.log(LogStatus.PASS, " Something Went Wrong" +test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	}
	//		String reportName=Report_CPO_NonComplianceReport.reportHeaderReportName(driver, "Contractor Enrollment Summary").getText();
	
	try {
		
		SoftAssert softAssertion= new SoftAssert();
		System.out.println(Report_CPO_NonComplianceReport.reportHeaderReportName(driver).getText());
		softAssertion.assertEquals(Report_CPO_NonComplianceReport.reportHeaderReportName(driver).getText(), "Non-Compliance Report");
		System.out.println("Report Name is Matched");
		test.log(LogStatus.PASS, "Report Header Name Matched");
		test.log(LogStatus.PASS, "Report Generated Successfully");
		softAssertion.assertEquals(Report_CPO_NonComplianceReport.programName(driver).getText(),ProgramName);
		test.log(LogStatus.PASS,"Program Name:- " + Report_CPO_NonComplianceReport.programName(driver).getText());
		test.log(LogStatus.PASS,"Sponsor Name:- " + Report_CPO_NonComplianceReport.sponsorName(driver).getText());
		test.log(LogStatus.PASS,"Project Name:- " + Report_CPO_NonComplianceReport.projectName(driver).getText());
		
		test.log(LogStatus.PASS,"Time Stamp:- " + Report_CPO_NonComplianceReport.timeStamp(driver).getText());
		test.log(LogStatus.PASS,"PDF Option is Present:- " + Report_CPO_NonComplianceReport.exportToPDF(driver).isDisplayed());
		test.log(LogStatus.PASS,"Excel Option is Present:- " + Report_CPO_NonComplianceReport.exportToExcel(driver).isDisplayed());
		
		test.log(LogStatus.PASS,"================= Column Name =================" );
		List<WebElement> list = Report_CPO_NonComplianceReport.allColumnName(driver);
//		wb.printListData();
		for(int i=0;i<list.size();i++)
		{
			test.log(LogStatus.PASS,"=====> "+ list.get(i).getText() +" <=====");
		}
		
		softAssertion.assertAll();
	}
	catch (Throwable e) 
	{
		System.out.println("report name not matched");
		test.log(LogStatus.FAIL, e+"Report Header Name Not Matched");
	}
	
	
	//Filter Testing 
	ReportModule.FilterWindowButton(driver).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//select first project
		js.executeScript("arguments[0].click();",Report_CPO_NonComplianceReport.filterSelectProjectFormOption(driver, "Test Project 10"));
		Thread.sleep(1000);
		//select 2nd Project
		js.executeScript("arguments[0].click();",Report_CPO_NonComplianceReport.filterSelectProjectFormOption(driver, "Test 132 OFF"));
//		Report_CPO_NonComplianceReport.filterSelectProjectFormOption(driver, "Test Project 10").click();
		test.log(LogStatus.PASS, " Project Selected Successfully");
		
		wb.selectSingleValue(Report_CPO_NonComplianceReport.filterSelectContractorFormOption(driver), "All Contractors");		
		test.log(LogStatus.PASS, " Contractor Selected Successfully");
		
		js.executeScript("arguments[0].click();",Report_CPO_NonComplianceReport.btnBuildReport(driver));
		test.log(LogStatus.INFO, " Clicked On Build Report Button");
		Thread.sleep(3000);
		//call the method for count verification
//		testCount(2, 11);
		
		
		/*
		 * //Check for pdf is generated or not take screenshot
		 * Report_CPO_NonComplianceReport.pdfLink(driver).click(); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); test.log(LogStatus.PASS,
		 * "Pdf Generated " +test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		 * Thread.sleep(5000); driver.close();
		 * driver.switchTo().window(wb.map.get("childID"));
		 */
		
		//Excel file
		Report_CPO_NonComplianceReport.excelLink(driver).click();
		Thread.sleep(10000);
		//isFileDownloaded is the std method which accept the name of file and confirms the download
		//Assert.assertTrue(wb.isFileDownloaded("Project_Specific_Report.xls"), "Failed to download Expected document");
		if(wb.isFileDownloaded("Non-Compliance_Report.xls")==true)
		{
			System.out.println("Excel file Downloaded Successfully");
			test.log(LogStatus.PASS, "Excel file Downloaded Successfully");
		}else
		{
			System.out.println("Excel file is not Downloaded Successfully");
			test.log(LogStatus.FAIL, "Excel file is not Downloaded Successfully");
		}
		
	Thread.sleep(5000);
	
	driver.close();
	driver.switchTo().window(wb.map.get("parentID"));
	driver.navigate().to(baseUrl);
		
}
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		//String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\OLD CP Report Data.xlsx";
		String filePath ="D:\\NOURTEK\\Wrap Portal-2\\testData\\OLD CP Report Data.xlsx";
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
	

	public void testCount(int projectSize,int contPkgSize )
	{
		
		List<WebElement> countOfProject = Report_CPO_NonComplianceReport.countProjectNames(driver);
		List<WebElement> countOfContractorPkg= Report_CPO_NonComplianceReport.countProjectWiseContractorPkg(driver);
		
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
