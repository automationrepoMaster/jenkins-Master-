package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_TieredReport 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	static String selectProgramDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	static String selectProgramCategoryDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']";
	static String btnCreateReport ="//input[@id='ctl00_ContentPlaceHolder1_btnCreate']";
	static String btnScheduleReport ="//a[text()='Schedule Report']";
	static String filterSelectProgramDropdown="//select[@id='ctrlBuildReport_lbProject']";
	static String filterSelectDivisionDropdown="//select[@id='ctrlBuildReport_lbDivision']";
	static String filterSelectProjectFormOption="//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	static String filterSelectContractorFormOption="//select[@id='ctrlBuildReport_lbContractor']";
	
	static String reportHeaderReportName= "//div[@id='divHeaderTable']//tr[1]/td[2]/b[1]";
//			"//b[contains(text(),'Contractor Enrollment Summary')]";
	
	
	static String selectReport = "//span[text()='+reportName+']";//we directly fetch report name in method and use dynamic xpath we accepting report name through method
	static String btnBuildReport ="//input[@id='ctrlBuildReport_btnBuildReport']";
	
	
	
	
	public static WebElement btnBuildReport(WebDriver driver) {
		element = driver.findElement(By.xpath(btnBuildReport));
		return element;
	}
	
	public static WebElement btnScheduleReport(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(btnScheduleReport));
		return element;
	}
	public static WebElement selectProgramDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramDropdown));
		return element;
	}
	public static WebElement selectProgramCategoryDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramCategoryDropdown));
		return element;
	}
	public static WebElement btnCreateReport(WebDriver driver) {
		element = driver.findElement(By.xpath(btnCreateReport));
		return element;
	}
	public static WebElement selectReport(WebDriver driver,String reportName) {
		element = driver.findElement(By.xpath("//span[contains(text(),'"+reportName+"')]"));
		return element;
		//we directly fetch report name in method and use dynamic xpath to accepting report name through method
	}
	
	public static WebElement filterSelectProjectFormOption(WebDriver driver,String projectName) {
		element = driver.findElement(By.xpath("//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'"+projectName+"')]"));
		return element;
		//we directly fetch project name in method and use dynamic xpath to accepting report name through method
	}
	public static WebElement filterSelectContractorFormOption(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectContractorFormOption));
		return element;
		//we directly fetch project name in method and use dynamic xpath to accepting report name through method
	}
	public static WebElement reportHeaderReportName(WebDriver driver) {
		element = driver.findElement(By.xpath(reportHeaderReportName));
		return element;
		//we directly fetch project name in method and use dynamic xpath to accepting report name through method
	}
	
	public static WebElement filterSelectProgramDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectProgramDropdown));
		return element;
	}
	public static WebElement filterSelectDivisionDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectDivisionDropdown));
		return element;
	}
	static String filterSelectFromDate="//select[@id='ctrlBuildReport_ddlFromMonthYear']";
	static String filterSelectToDate="//select[@id='ctrlBuildReport_ddlToMonthYear']";
	public static WebElement filterSelectFromDate(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectFromDate));
		return element;
	}
	public static WebElement filterSelectToDate(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectToDate));
		return element;
	}
	
	//filter xpaths
		static String countProjectNames="//div[@id='divTableData']/table/tbody/tr/td[contains(text(),'Project :')]";
		static String countProjectWiseContractorPkg="//div[@id='divTableData']/table/tbody/tr[position()>5]/td[contains(@style,'color')]/div";
		static String countContractorPkgStatus="//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()<5]";
		static String countContractorNO="//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()=3]";
		static String pdfLink ="//div[@id='divExportIcon']/ul//li[@id='liPDF']";
		static String excelLink ="//div[@id='divExportIcon']/ul//li[@id='liExcel']";
		
		
		public static List<WebElement> countProjectNames(WebDriver driver) {
			listElement = driver.findElements(By.xpath(countProjectNames));
			return listElement;
		}
		public static List<WebElement> countProjectWiseContractorPkg(WebDriver driver) {
			listElement = driver.findElements(By.xpath(countProjectWiseContractorPkg));
			return listElement;
		}
		public static List<WebElement> countContractorPkgStatus(WebDriver driver) {
			listElement = driver.findElements(By.xpath(countContractorPkgStatus));
			return listElement;
		}
		public static List<WebElement> countContractorNO(WebDriver driver) {
			listElement = driver.findElements(By.xpath(countContractorNO));
			return listElement;
		}
		public static WebElement pdfLink(WebDriver driver) {
			element = driver.findElement(By.xpath(pdfLink));
			return element;
		}public static WebElement excelLink(WebDriver driver) {
			element = driver.findElement(By.xpath(excelLink));
			return element;
		}

}
