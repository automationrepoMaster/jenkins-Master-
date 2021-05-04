package ObjectRepository_NCP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_NCP_Enrollment_Status_Report 
{
	
	 public static WebElement element;
	
	 static String addFilterBtn="//input[@id='btnAddFilter']";
	 static String radioBtnTrade="//input[@id='rblSort_0']";
	 static String radioBtnContractor="//input[@id='rblSort_1']";
	 static String selectProgram="//select[@id='ListBox2']";
	 static String selectContractor="//select[@id='ctrlBuildReport_lbContractor']";
	 static String btnBuildReport="//input[@id='ctrlBuildReport_btnBuildReport']";
	 
	 //Raja
	 
	 static String prorgramHeading="//td[@bgcolor='#8CAAFA']";
	 
	 public static WebElement prorgramHeading(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(prorgramHeading));
		 return element;
		 
	 }
	 
	 static String ProgramHeadings ="//td[ @class='contractorTitle columnWidth']/span[contains(text(),'Automation Program dont touch')]";
	
	 public static WebElement ProgramHeadings(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(ProgramHeadings));
		 return element;
		 
	 }
	 
	 static String reportHeader="//td[@class='mainTitle txt-center']";
	 
	 public static WebElement addFilterBtn(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(addFilterBtn));
		 return element;
		 
	 }
	 
	 
	 public static WebElement radioBtnTrade(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(radioBtnTrade));
		 return element;
		 
	 } public static WebElement radioBtnContractor(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(radioBtnContractor));
		 return element;
		 
	 }
	 
	 public static WebElement selectProgram(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(selectProgram));
		 return element;
		 
	 }
	 
	 public static WebElement selectContractor(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(selectContractor));
		 return element;
		 
	 } 
	 public static WebElement btnBuildReport(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(btnBuildReport));
		 return element;
		 
	 }
	 
	 
	 public static WebElement reportHeader(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(reportHeader));
		 return element;
		 
		 

	 }
	 
	 
	 
	 
	 
	 
	//Raja wrote a new one
		
		public static WebElement filterselectProjectFormOption(WebDriver driver) {
			element = driver.findElement(By.xpath("//select[@id='ListBox2']"));
			return element;
			
			
		}
		
		static String filterSelectContractorFormOption="//select[@id='ctrlBuildReport_lbWorkSite']"; //Raja //select[@id='ctrlBuildReport_lbContractor']";
		public static WebElement filterSelectcontractorFormOption(WebDriver driver) {
			element = driver.findElement(By.xpath("//select[@id='ctrlBuildReport_lbContractor']"));
			return element;
			
			//select[@id='ListBox3']
			
		}
		
		/*
		 * public static WebElement filterSelectDivisionDropdown(WebDriver driver) {
		 * element = driver.findElement(By.xpath(filterSelectDivisionDropdown)); return
		 * element; }
		 */
		
		static String reportheaderReportName="//span[@id='Label1' and @class='ReportPageHeader']";
		
		public static WebElement reportheaderReportName(WebDriver driver) {
			element = driver.findElement(By.xpath(reportheaderReportName));
			return element;
			//we directly fetch project name in method and use dynamic xpath to accepting report name through method
		}
		
	 
		static String ReportHeadingName="//td[ @class='mainTitle txt-center']";
		
		public static WebElement ReportHeadingName(WebDriver driver) {
			element = driver.findElement(By.xpath(ReportHeadingName));
			return element;
			//we directly fetch project name in method and use dynamic xpath to accepting report name through method
		}
	 
	 static String Timestamp ="//td[@class='dateTimeHeader txt-right']";
	 
	 public static WebElement Timestamp(WebDriver driver) {
			element = driver.findElement(By.xpath(Timestamp));
			return element;
			//we directly fetch project name in method and use dynamic xpath to accepting report name through method
		}
	 
	 //Raja
	 
	 
	 
	 static String ExportToExcelLink ="//a[@id='HlinkExportExcel']";
	 static String ExportToPdfLink ="//a[@id='HlinkExportPDF']";
	 
	 public static WebElement ExportToExcelLink(WebDriver driver) {
			element = driver.findElement(By.xpath(ExportToExcelLink));
			return element;
			
		}
	 
	 
	 public static WebElement ExportToPdfLink(WebDriver driver) {
			element = driver.findElement(By.xpath(ExportToPdfLink));
			return element;
			
		}
	 
	 //Report Frame
	 
	 static String ReportFrame ="//iframe[@name='Report']";
	 
	 public static WebElement ReportFrame(WebDriver driver) {
			element = driver.findElement(By.xpath(ReportFrame));
			return element;
			
		}
	 
	 static String contractorsHeading ="//div[@class='title'][contains(text(),'Contractor')]";
	
	 public static WebElement contractorsHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(contractorsHeading));
			return element;
			
		}	 
			 
	static String sponsorName ="//td[@class='contractorTitle columnWidth']/span[contains(text(),'Sponsor1735')]";		 
			 
	 public static WebElement sponsorName(WebDriver driver) {
			element = driver.findElement(By.xpath(sponsorName));
			return element;
			
		}		 
			 
	static String projectName ="//span[contains(text(),'Sony Projects1631 #PC1631')]/../..";
	
	 public static WebElement projectName(WebDriver driver) {
			element = driver.findElement(By.xpath(projectName));
			return element;
			
	}
	 
	 static String ExportToExcel ="//li[@id='liExcel']";
	 
	 public static WebElement ExportToExcel(WebDriver driver) {
			element = driver.findElement(By.xpath(ExportToExcel));
			return element;
			
	}
	 
	static String Export_ToPDF ="//li[@id='liPDF']";
	
	 public static WebElement Export_ToPDF(WebDriver driver) {
		 
			element = driver.findElement(By.xpath(Export_ToPDF));
			return element;
			
	}
	
	 
}
