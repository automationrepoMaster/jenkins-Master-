package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_OpenActionItems 
{
	private static WebElement element;
	private static List<WebElement> listElement;
	static String selectProgramDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	static String selectProgramCategoryDropdown ="//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']";
	static String btnCreateReport ="//input[@id='ctl00_ContentPlaceHolder1_btnCreate']";
	static String btnScheduleReport ="//a[text()='Schedule Report']";
	static String filterWindow="//div[@class='filters']";
	
	static String filterSortOptionAlpha="//input[@id='ctrlBuildReport_rdoAlpha']";
	static String filterSortOptionTieredAlpha="//input[@id='ctrlBuildReport_rdoTieredAlpha']";
	static String filterSelectProgramDropdown="//select[@id='ctrlBuildReport_lbProject']";
	static String filterSelectDivisionDropdown="//select[@id='ctrlBuildReport_lbDivision']";
	static String filterSelectProjectFormOption="//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	//Raja
	
	static String filterSelectContractorFormOption=   "//div[@id='ctrlBuildReport_divContractor']//select/option[1]"; //select[@id='ctrlBuildReport_lbContractor']";
	static String filterSelectFromDate="//select[@id='ctrlBuildReport_ddlFromMonthYear']";
	static String filterSelectToDate="//select[@id='ctrlBuildReport_ddlToMonthYear']";
	
	static String reportHeaderReportName= "//td[@class='mainTitle txt-center']"; //span[@id='spnHeaderContent']//tr[2]/th";
//			"//b[contains(text(),'Contractor Enrollment Summary')]";
	
	static String selectReport = "//span[text()='+reportName+']";//we directly fetch report name in method and use dynamic xpath we accepting report name through method
	static String btnBuildReport ="//input[@class='blueButton btnBuildReport']";
	
	public static WebElement filterWindow(WebDriver driver) {
		element = driver.findElement(By.xpath(filterWindow));
		return element;
	}
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
		element = driver.findElement(By.xpath("//div[@class='wrapper']//span[contains(text(),'"+reportName+"')]"));
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
	static String buildReportBtn="//input[@id='ctrlBuildReport_btnBuildReport' or @class='blueButton btnBuildReport' ]";
	static String exportToPDF="//div[@id='divExportIcon']/ul/li[@id='liPDF']";
	static String exportToExcel="//div[@id='divExportIcon']/ul/li[@id='liExcel']";
	static String timeStamp="//td[@class='dateTimeHeader txt-right']"; //"//span[@id='spnHeaderContent']//table/thead/tr[1]";
	static String programName="//td[contains(text(),'Program')]//span[@class='contractorData']"; //span[@id='spnHeaderContent']//tr[3]//th[2]//span";
	static String sponsorName="//td[contains(text(),'Sponsor')]/span[1]"; //span[@id='spnHeaderContent']//tr[3]//th[3]//span";
	static String projectName="//table[@class='innerTable tbl-alt tableData']/tbody/tr[2]/td[5][@class='txt-left innerTableData']"; //tbody//tbody[1]//tr[2]/th[@class]";
	static String allProjectName="//table[@class='innerTable tbl-alt tableData']/tbody/tr/td[4][@class='txt-left innerTableData']";//tbody//tbody[*]//tr[2]/th[@class]//span";//list
	static String allColumnName="//table[@class='mainTable']/tbody/tr[2]//tbody/tr[2]//tbody/tr";//list
	
	
	
	//Raja
	
	static  String programsListFilter ="//div[@id='ctrlBuildReport_divProject']//select/option";
	
	 
	
	public static WebElement programName_OpenAction (WebDriver driver, String Programnames) {
		
		element =driver.findElement(By.xpath("//span[@class='contractorData' and text()='"+ Programnames +"']"));
		return element;
		
	}
	
	
	public static List<WebElement> programsListFilter(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programsListFilter));
		return listElement;
	}

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
	static String countProjectWiseContractorPkg="//div[@id='divTableData']/table/tbody[2]/tr/td[1]";
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
	
	//raja
	
	static String ProjectHeading ="//span[@id='ctrlBuildReport_lblWorksiteTitle']";
	static String ProjectsList ="//div[@class='non-selected-wrapper']/a";
	
	public static WebElement ProjectHeading(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectHeading));
		return element;
	}
	
	public static List<WebElement> ProjectsList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ProjectsList));
		return listElement;
	}
	
	
	
}
