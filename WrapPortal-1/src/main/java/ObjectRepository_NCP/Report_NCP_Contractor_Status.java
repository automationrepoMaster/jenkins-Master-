package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_NCP_Contractor_Status 
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
	
	
	static String reportHeaderReportName= "//div[@id='divHeaderTable']//tr[1]";	
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
		element = driver.findElement(By.xpath("//select[@id='ctrlBuildReport_lbWorkSite']//option[contains(text(),'"+projectName+"')]"));
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
	// filter xpaths
	static String countProjectNames = "//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[1]/td[2]/table/tbody/tr/td[@class='innerTitle' and position()=1]//span";
	static String countProjectWiseContractorPkg = "//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()=2]";
	static String countContractorPkgStatus = "//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()<5]";
	static String countContractorNO = "//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()=3]";

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
	

	//for filter 
	static String filterWindowButton ="//div[@class='filters']";
	static String countContractorPkg ="//div[@id='divTableData']//table/tbody/tr[position()>2]/td[3]";
	static String pdfLink ="//a[@id='lnkPDF']";
	static String excelLink ="//a[@id='lnkExcel']";
	
	public static WebElement filterWindowButton(WebDriver driver) {
		element = driver.findElement(By.xpath(filterWindowButton));
		return element;
	}
	public static List<WebElement> countContractorPkg(WebDriver driver) {
		listElement = driver.findElements(By.xpath(countContractorPkg));
		return listElement;
	}
	public static WebElement pdfLink(WebDriver driver) {
		element = driver.findElement(By.xpath(pdfLink));
		return element;
	}public static WebElement excelLink(WebDriver driver) {
		element = driver.findElement(By.xpath(excelLink));
		return element;
	}
	
	
	//Add filter 
	static String addFilterBtnOutside ="//input[@class='greenButton']";
	static String selectAnFilterDropdown = "//select[@id='ddlField']";
	static String selectAFilterCondition = "//select[@id='ddlCompare']";
	static String addFilterParameter1 ="//div[@id='s2id_lbParam']";
	static String selectParameter1 = "//div[@id='select2-drop']/ul/li";
	static String addFilterBtnInside = "//input[@id='btnAdd']";		
	
	public static WebElement addFilterBtnOutside(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterBtnOutside));
		return element;
	}
	public static WebElement selectAnFilterDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAnFilterDropdown));
		return element;
	}public static WebElement selectAFilterCondition(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAFilterCondition));
		return element;
	}public static WebElement addFilterParameter1(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterParameter1));
		return element;
	}public static WebElement addFilterBtnInside(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterBtnInside));
		return element;
	}
	public static List<WebElement> selectParameter1(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectParameter1));
		return listElement;
	}

}
