package TestScript;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ReportModule;
import ObjectRepository.Report_FinalDeduct;

public class CompareFinalDeductAlphAdmin_TestCase extends BaseClass
{
	WebDriverCommonLib wb = new WebDriverCommonLib();
	List<WebElement> lst1;
	
	@Test
	public void compareFinalDeductReport() throws Throwable {
		String ProgramName = "ABC - Program Decimal Test";
		String ProjectName = "All Projects";
		String reportName = "Final Deduct";
		
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
			// wb.selectSingleValue(Report_FinalDeduct.filterSelectDivisionDropdown(driver),
			// Division);
			// test.log(LogStatus.PASS, Division +" Selected Successfully");
//			Report_FinalDeduct.filterSelectProjectFormOption(driver, ProjectName).click();
//			test.log(LogStatus.PASS, ProjectName + " Project Selected Successfully");
			Report_FinalDeduct.filterSelectContractorFormOption(driver).click();
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Report_FinalDeduct.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
		}
		// String reportName=ReportModule.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {
			System.out.println(Report_FinalDeduct.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_FinalDeduct.reportHeaderReportName(driver).getText(), "Final Deduct");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		 List<WebElement> lst1 = Report_FinalDeduct.AllDataFinalDeduct(driver);
		 List<WebElement> lst2 = Report_FinalDeduct.AllDataFinalDeduct(driver);
	/*	ArrayList<Object> WPlistTotal = new ArrayList<Object>();
		for (int i = 0; i < lst1.size(); i++) 
		{
			WPlistTotal.add(lst1.get(i).getText());
		}*/

	//	System.out.println(WPlistTotal);
		 
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		String cnt = "1";
		for (int i = 0; i <= lst1.size() - 1; i++) {
			System.out.println(lst1.get(i).getText());
			data.put(cnt, new Object[] { lst1.get(i).getText(), lst2.get(i).getText() });
			cnt = cnt + 1;
		}

//		driver.close();
//		driver.switchTo().window(wb.map.get("parentID"));
/*		
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
			// wb.selectSingleValue(Report_FinalDeduct.filterSelectDivisionDropdown(driver),
			// Division);
			// test.log(LogStatus.PASS, Division +" Selected Successfully");
			Report_FinalDeduct.filterSelectProjectFormOption(driver, ProjectName).click();
			test.log(LogStatus.PASS, ProjectName + " Project Selected Successfully");
			Report_FinalDeduct.filterSelectContractorFormOption(driver).click();
			test.log(LogStatus.PASS, " Contractor Selected Successfully");
			Report_FinalDeduct.btnBuildReport(driver).click();
			test.log(LogStatus.INFO, " Clicked On Build Report Button");
			Thread.sleep(3000);

		} catch (Throwable e) {
			test.log(LogStatus.FAIL, e + " Something Went Wrong");
		}
		// String reportName=ReportModule.reportHeaderReportName(driver,
		// "Contractor Enrollment Summary").getText();

		try {
			System.out.println(Report_FinalDeduct.reportHeaderReportName(driver).getText());
			Assert.assertEquals(Report_FinalDeduct.reportHeaderReportName(driver).getText(), "Deduct By Contractor");
			System.out.println("Report Name is Matched");
			test.log(LogStatus.PASS, "Report Header Name Matched");
			test.log(LogStatus.PASS, "Report Generated Successfully");
		} catch (Throwable e) {
			System.out.println("report name not matched");
			test.log(LogStatus.FAIL, e + "Report Header Name Not Matched");
		}

		List<WebElement> lst2 = Report_FinalDeduct.AllDataFinalDeduct(driver);
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
	
		Map<String, Object[]> data = new TreeMap<String, Object[]>(); 	
		String cnt="1";
		for(int i=0 ;i<=lst1.size()-1;i++)
		{
			data.put(cnt, new Object[]{ lst1.get(i).getText(),lst2.get(i).getText()}); 
			cnt=cnt+1;
		}
*/		
	/*	driver.close();
		driver.switchTo().window(wb.map.get("parentID"));*/
		
		
	 	XSSFWorkbook workbook = new XSSFWorkbook(); 
        // Create a blank sheet 
        XSSFSheet sheet = workbook.createSheet("Contractor Pacakge Details"); 
        // Iterate over data and write to sheet 
        Set<String> keyset = data.keySet(); 
        int rownum = 0; 
        for (String key : keyset) { 
            // this creates a new row in the sheet 
            Row row = sheet.createRow(rownum++); 
            Object[] objArr = data.get(key); 
            int cellnum = 0; 
            for (Object obj : objArr) { 
                // this line creates a cell in the next column of that row 
                Cell cell = row.createCell(cellnum++); 
                if (obj instanceof String) 
                    cell.setCellValue((String)obj); 
                else if (obj instanceof Integer) 
                    cell.setCellValue((Integer)obj); 
            } 
        } 
        try { 
            // this Writes the workbook gfgcontribute 
            FileOutputStream out = new FileOutputStream(new File("D:\\Compare Final Dedcut Report.xlsx")); 
            workbook.write(out); 
            out.close(); 
            System.out.println("gfgcontribute.xlsx written successfully on disk."); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 

		
    	driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
	
		
//		driver.navigate().to(baseUrl);
		
	
		
		
		
		
		
		

	}

}
