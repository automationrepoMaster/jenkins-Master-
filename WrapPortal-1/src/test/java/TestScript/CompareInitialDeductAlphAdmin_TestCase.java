package TestScript;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_InitialDeduct;

public class CompareInitialDeductAlphAdmin_TestCase extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	
	@Test
	public void compareInitialDeductReport() throws Throwable {
		String ProgramName = "Program7852";
		String ProjectName = "Sony Project9832";
		String reportName = "Initial Deduct";
		
		try {
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Program Select Form Dropdown");
			Thread.sleep(5000);
			ReportModule.selectReport(driver, reportName).click();
			test.log(LogStatus.PASS, reportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			// wb.selectSingleValue(Report_InitialDeduct.filterSelectDivisionDropdown(driver),
			// Division);
			// test.log(LogStatus.PASS, Division +" Selected Successfully");
			Report_InitialDeduct.filterSelectProjectFormOption(driver, ProjectName).click();
			test.log(LogStatus.PASS, ProjectName + " Project Selected Successfully");
			Report_InitialDeduct.filterSelectContractorFormOption(driver).click();
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Report_InitialDeduct.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
		}
		// String reportName=ReportModule.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {
			System.out.println(Report_InitialDeduct.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_InitialDeduct.reportHeaderReportName(driver).getText(), "Deduct By Contractor");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		List<WebElement> lst1 = Report_InitialDeduct.AllDataInitialDeduct(driver);
		ArrayList<Object> WPlistTotal = new ArrayList<Object>();
		for (int i = 0; i < lst1.size(); i++) 
		{
			WPlistTotal.add(lst1.get(i).getText());
		}

		System.out.println(WPlistTotal);

		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		String baseUrl = driver.getCurrentUrl();
		
		driver.navigate().to("https://alpha.wrapportal.com/");
		Thread.sleep(5000);

		driver.findElement(By.id("txtUserName")).sendKeys("nourtest1");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		try {
			HomePage.controlMenuReports(driver).click();
			test.log(LogStatus.INFO, "Clicked on Report Module Icon");
			Thread.sleep(2000);
			wb.selectSingleValue(ReportModule.selectProgramDropdown(driver), ProgramName);
			test.log(LogStatus.INFO, ProgramName + " Program Select Form Dropdown");
			Thread.sleep(5000);
			ReportModule.selectReport(driver, reportName).click();
			test.log(LogStatus.PASS, reportName + " Report is Selected");
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			// wb.selectSingleValue(Report_InitialDeduct.filterSelectDivisionDropdown(driver),
			// Division);
			// test.log(LogStatus.PASS, Division +" Selected Successfully");
			Report_InitialDeduct.filterSelectProjectFormOption(driver, ProjectName).click();
			test.log(LogStatus.PASS, ProjectName + " Project Selected Successfully");
			Report_InitialDeduct.filterSelectContractorFormOption(driver).click();
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Report_InitialDeduct.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
		}
		// String reportName=ReportModule.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {
			System.out.println(Report_InitialDeduct.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_InitialDeduct.reportHeaderReportName(driver).getText(), "Deduct By Contractor");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		List<WebElement> lst2 = Report_InitialDeduct.AllDataInitialDeduct(driver);
		ArrayList<Object> WPlistTotal2 = new ArrayList<Object>();
		for (int i = 0; i < lst2.size(); i++) 
		{
//			lst2.get(i).getText();
			WPlistTotal2.add(lst2.get(i).getText());
			
		}

		System.out.println(WPlistTotal2);
		System.out.println(WPlistTotal.equals(WPlistTotal2));// Comparing both
		
		for(int i=0 ;i<=WPlistTotal.size()-1;i++)
		{
			if(!WPlistTotal.get(i).equals(WPlistTotal2.get(i)));
			{
				
				System.out.println("wrong element "+WPlistTotal.get(i));
			}
		}
			
		
		
		// list for print data
		ArrayList<Object> ar = new ArrayList<Object>();
		for(int p=0;p<WPlistTotal2.size()-1;p++)
		{
			if(!Arrays.asList(WPlistTotal).contains(WPlistTotal2.get(p)))
				ar.add(WPlistTotal2.get(p));
		}
		System.out.println(ar);
		
		/*for(int l=0;l<=ar.size()-1;l++)
		{
			System.out.println("Missmatch value \t"+ar.get(l));
		}*/
		
		if (WPlistTotal.equals(WPlistTotal2) == true) {
		test.log(LogStatus.PASS, "Data Matched");
		} else {
		test.log(LogStatus.FAIL, "Data did't Matched");
		}
		
		System.out.println(WPlistTotal);
		test.log(LogStatus.PASS, "Admin Wrap Portal:- " + WPlistTotal);
		System.out.println(WPlistTotal2);
		test.log(LogStatus.PASS,
		"Alpha Contractor Portal:- " + WPlistTotal2);
		
		/*for(int i=0;i<=WPlistTotal.size()-1;i++)
		{
			for(int j=0;j<=WPlistTotal2.size()-1;j++)
			{
				if(WPlistTotal.get(i)!=WPlistTotal2.get(j))
				{
					System.out.println(WPlistTotal.get(i));
				}
			}
		}*/
		
		/*int n=WPlistTotal.size();
		int m=WPlistTotal2.size();
		
		findMissing(WPlistTotal, WPlistTotal2, n, m);
		
		*/
		
		
		
		/*String path="E:\\kp workspace selenium\\Wrap Portal\\testData\\OutputExcelDemo.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(path);
		for(int z=0;z<=WPlistTotal2.size()-1;z++)
		{
			
			String data=(String) WPlistTotal2.get(z);
			config.setExeclData("Sheet1", z, z+1,data );
			
		}
		*/
		
		
		
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		driver.navigate().to(baseUrl);
		
	

	}

	
	/*static void findMissing(ArrayList<Object> wPlistTotal, ArrayList<Object> wPlistTotal2, int n, int m) 
	{
		// Store all elements of
		// second array in a hash table
		HashSet<Object> s = new HashSet<>();
		for (int i = 0; i < m; i++)
			s.add(wPlistTotal2[i]);

		// Print all elements of first array
		// that are not present in hash table
		for (int i = 0; i < n; i++)
			if (!s.contains(wPlistTotal[i]))
				System.out.print(wPlistTotal[i] + " ");
	}  */
}
