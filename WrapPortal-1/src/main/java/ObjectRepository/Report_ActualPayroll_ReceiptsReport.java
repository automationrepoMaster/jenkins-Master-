package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_ActualPayroll_ReceiptsReport 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	static String selectProgramDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	static String selectProgramCategoryDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']";
	static String btnCreateReport ="//input[@id='ctl00_ContentPlaceHolder1_btnCreate']";
	static String btnScheduleReport ="//a[text()='Schedule Report']";
	
	static String filterSortOptionAlpha="//input[@id='ctrlBuildReport_rdoAlpha']";
	static String filterSortOptionTieredAlpha="//input[@id='ctrlBuildReport_rdoTieredAlpha']";
	static String filterSelectProgramDropdown="//select[@id='ctrlBuildReport_lbProject']";
	static String filterSelectDivisionDropdown="//select[@id='ctrlBuildReport_lbDivision']";
	static String filterSelectProjectFormOption="//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	//Raja
	static String filterSelectContractorFormOption="//div[@id='ctrlBuildReport_divContractor']//select/option[1]";                //"//select[@id='ctrlBuildReport_lbContractor']";
	static String filterSelectFromDate="//select[@id='ctrlBuildReport_ddlFromMonthYear']";
	static String filterSelectToDate="//select[@id='ctrlBuildReport_ddlToMonthYear']";
	
	static String reportHeaderReportName= "//td[@class='mainTitle tcc']";
//			"//b[contains(text(),'Contractor Enrollment Summary')]";
	
	static String selectReport = "//span[text()='+reportName+']";//we directly fetch report name in method and use dynamic xpath we accepting report name through method
	static String btnBuildReport ="//input[@class='blueButton btnBuildReport']";
	
	
	public static WebElement filterSelectFromDate(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectFromDate));
		return element;
	}
	public static WebElement filterSelectToDate(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectToDate));
		return element;
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
	
	public static WebElement filterSelectProjectFormOption(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='ctrlBuildReport_lbWorkSite']"));
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
	//Raaja
	static String buildReportBtn= "//input[@id='ctrlBuildReport_btnBuildReport']";                      //"//input[@id='ctrlBuildReport_btnBuildReport' or @class='blueButton btnBuildReport' ]";
	static String exportToPDF="//div[@id='divExportIcon']/ul/li[@id='liPDF']";
	static String exportToExcel="//div[@id='divExportIcon']/ul/li[@id='liExcel']";
	//Raaja
	static String timeStamp= "//td[@class='dateTimeHeader trt']";                    //"//table[@class='subTable tableHeader']/tbody/tr[1]";
	static String programName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[2]/span";
	static String sponsorName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[3]/span";
	static String projectName="//table[@class='mainTable']/tbody/tr[2]//*[@class='innerTable']/tbody/tr/td[1]/span";
	static String allProjectName="//*[@class='innerTable']/tbody/tr/td[1]/span";//list
	static String allColumnName="//table[@class='mainTable']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]//table[@class='innerTable tbl-alt tableData']/tbody/tr[1]/th";//list
	
	
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
	//filter xpaths
	static String countProjectNames="//div[@id='divTableData']/table/tbody/tr[2]/th[contains(text(),'Project:') and position()=2]";
	static String countProjectWiseContractorPkg="//div[@id='divTableData']//tbody//tr//td[@class='txt-left innerTableData tdCompanyName']";
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
