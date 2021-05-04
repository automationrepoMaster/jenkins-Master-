package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_NCP_Program_Widecard_Report 
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
	
	static String reportHeaderReportName= "//td[@class='mainTitle txt-center']";
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
	
	static String allReportList="//div[starts-with(@id,'divChild')]//span[@class='reportName']//span";//list
	static String buildReportBtn="//input[@id='ctrlBuildReport_btnBuildReport' or @class='blueButton btnBuildReport' ]";
	static String exportToPDF="//div[@id='divExportIcon']/ul/li[1]";
	static String exportToExcel="//a[@id='lnkExcel']"; //div[@id='divExportIcon']/ul/li[2]";
	static String timeStamp="//table[@class='subTable tableHeader']/tbody/tr[1]";
	static String programName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[2]/span";
	static String sponsorName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[3]/span";
	static String projectName="//table[@class='mainTable']/tbody/tr[2]//*[@class='innerTable']/tbody/tr/td[1]/span";
	static String allProjectName="//*[@class='innerTable']/tbody/tr/td[1]/span";//list
	static String allColumnName="//table[@class='mainTable']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]//table[@class='innerTable tbl-alt tableData']/tbody/tr[1]/th";//list
	static String totalOfAllProjectContractor="//table[@class='mainTable']/tbody/tr[*]/td/table/tbody/tr[2]/td[2]//table[@class='innerTable tbl-alt tableData']/tbody/tr[last()-4]/td[position()=2]";
	static String grandTotalOfContractor="//table[@class='mainTable']/tbody/tr[last()-3]//table[@class='innerTable tbl-alt tableData']//tr[@class='total-heading']//following::tr[1]/td[2]";
	
	
	
	//table[@class='mainTable']/tbody/tr[last()-3]/td/table/tbody/tr[2]/td[2]
	//table[@class='mainTable']/tbody/tr[*]/td/table/tbody/tr[2]/td[2]//table[@class='innerTable tbl-alt tableData']/tbody/tr/th
	//table[@class='innerTable tbl-alt tableData']
	
	
	
	public static List<WebElement> allReportList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allReportList));
		return listElement;
	}public static WebElement buildReportBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(buildReportBtn));
		return element;
	}public static WebElement exportToPDF(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToPDF));
		return element;
	}public static WebElement exportToExcel(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToExcel));
		return element;
	}public static WebElement timeStamp(WebDriver driver) {
		element = driver.findElement(By.xpath(timeStamp));
		return element;
	}public static WebElement programName(WebDriver driver) {
		element = driver.findElement(By.xpath(programName));
		return element;
	}public static WebElement sponsorName(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorName));
		return element;
	}public static WebElement projectName(WebDriver driver) {
		element = driver.findElement(By.xpath(projectName));
		return element;
	}public static List<WebElement> allProjectName(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allProjectName));
		return listElement;
	}public static List<WebElement> allColumnName(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allColumnName));
		return listElement;
	}
	public static List<WebElement> totalOfAllProjectContractor(WebDriver driver) {
		listElement = driver.findElements(By.xpath(totalOfAllProjectContractor));
		return listElement;
	}
	public static WebElement grandTotalOfContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(grandTotalOfContractor));
		return element;
	}
	
	//filter xpaths
	static String countProjectNames="//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[1]/td[2]/table/tbody/tr/td[@class='innerTitle' and position()=1]//span";
	static String countProjectWiseContractorPkg="//table[@class='mainTable']//table[@class='subTable-child']/tbody/tr[2]/td[2]/table/tbody/tr/td[@class='txt-left innerTableData' and position()=2]";
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
