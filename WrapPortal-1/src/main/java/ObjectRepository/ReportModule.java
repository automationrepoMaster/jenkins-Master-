package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportModule 
{

	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String selectProgramDropdown = "//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	static String selectProgramCategoryDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']";
	static String btnCreateReport ="//input[@id='ctl00_ContentPlaceHolder1_btnCreate']";
	static String btnScheduleReport ="//a[text()='Schedule Report']";
	static String filterSelectProgramDropdown="//select[@id='ctrlBuildReport_lbProject']";
	static String filterSelectDivisionDropdown="//select[@id='ctrlBuildReport_lbDivision']";
	static String filterSelectProjectFormOption="//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	static String filterSelectContractorFormOption="//div[@id='ctrlBuildReport_divContractor']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	
	static String reportHeaderReportName= "//div[@id='divHeaderTable']//tr[1]//td[1]";
//			"//b[contains(text(),'Contractor Enrollment Summary')]";
	static String selectReport = "//span[text()='+reportName+']";//we directly fetch report name in method and use dynamic xpath we accepting report name through method
	static String nonComplianceReportList = "//tr[2]//td[1]//table[1]//tbody[1]//tr[2]//td[2]//table[1]//tbody[1]/tr[*]/td[5]";
	static String btnBuildReport ="//input[@id='ctrlBuildReport_btnBuildReport']";
	static String FilterWindowButton ="//div[@class='filters']";
	
	public static WebElement FilterWindowButton(WebDriver driver) {
		element = driver.findElement(By.xpath(FilterWindowButton));
		return element;
	}
	public static List<WebElement> nonComplianceReportList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(nonComplianceReportList));
		return listElement;
	}
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
	
	
 //  //div[@id='ctrlBuildReport_divProject']//div/select/option------------------------------------
	public static WebElement filterSelectProjectFormOption(WebDriver driver,String projectName) {
		element = driver.findElement(By.xpath("//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'"+projectName+"')]"));
		return element;
		//we directly fetch project name in method and use dynamic xpath to accepting report name through method
	}
	public static WebElement filterSelectContractorFormOption(WebDriver driver,String contractorName) {
		element = driver.findElement(By.xpath("//div[@id='ctrlBuildReport_divContractor']//div[@class='non-selected-wrapper']//a[contains(text(),'"+contractorName+"')]"));
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
	
	
}
