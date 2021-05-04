package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_GL_Credit_Tracking_Report {

	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String selectProgramDropdown = "//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	static String selectProgramCategoryDropdown = "//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']";
	static String btnCreateReport = "//input[@id='ctl00_ContentPlaceHolder1_btnCreate']";
	static String btnScheduleReport = "//a[text()='Schedule Report']";
	
//Report Main filter window	
	static String filterSelectProgramDropdown = "//select[@id='ctrlBuildReport_lbProject']";
	static String filterSelectDivisionDropdown = "//select[@id='ctrlBuildReport_lbDivision']";
	static String filterSelectProjectFormOption = "//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'Sony Project Five')]";
	static String filterSelectContractorFormOption = "//select[@id='ctrlBuildReport_lbContractor']";
	
	static String reportHeaderReportName = "//td[@class='tdMainColsPan']/span/table/thead/tr[2]/th";
	static String selectReport = "//span[text()='+reportName+']";


	
	public static WebElement btnScheduleReport(WebDriver driver) {
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

	public static WebElement selectReport(WebDriver driver, String reportName) {
		element = driver.findElement(By.xpath("//span[contains(text(),'" + reportName + "')]"));
		return element;
	}

	public static WebElement filterSelectProjectFormOption(WebDriver driver, String projectName) {
		element = driver.findElement(By
				.xpath("//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'"
						+ projectName + "')]"));
		return element;
	}

	public static WebElement filterSelectContractorFormOption(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectContractorFormOption));
		return element;
	}

	public static WebElement reportHeaderReportName(WebDriver driver) {
		element = driver.findElement(By.xpath(reportHeaderReportName));
		return element;
	}

	public static WebElement filterSelectProgramDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectProgramDropdown));
		return element;
	}

	public static WebElement filterSelectDivisionDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(filterSelectDivisionDropdown));
		return element;
	}

	static String allReportList = "//div[starts-with(@id,'divChild')]//span[@class='reportName']//span";// list
	static String buildReportBtn = "//input[@id='ctrlBuildReport_btnBuildReport' or @class='blueButton btnBuildReport' ]";
	static String exportToPDF = "//div[@id='divExportIcon']/ul/li[1]";
	static String exportToExcel = "//div[@id='divExportIcon']/ul/li[2]";
	
	//Raja wrote this
	
	static String exportToExcel_Enrollmentsummary ="//a[normalize-space()='Export To Excel']";
	
	public static WebElement exportToExcel_Enrollmentsummary(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToExcel_Enrollmentsummary));
		return element;
	}
	
	public static WebElement Reportheader_EnrollmentSummary(String headername,WebDriver driver) {
		element = driver.findElement(By.xpath("//b[normalize-space()='"+headername +"']"));
		return element;
	}
	
	
	
	static String exportToPDF_Enrollmentsummary ="//a[normalize-space()='[Export to PDF]']";
	
	public static WebElement exportToPDF_Enrollmentsummary(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToPDF_Enrollmentsummary));
		return element;
	}
	
	static String timeStamp = "//td[@class='tdMainColsPan']/span/table/thead/tr[1]/th";
	
	//Raja
	
	static String Timestamp_EnrollmentSummary ="//span[@id='lblDate']";
	
	public static WebElement Timestamp_EnrollmentSummary(WebDriver driver) {
		element = driver.findElement(By.xpath(Timestamp_EnrollmentSummary));
		return element;
	}
	
	
	static String programName = "//td[@class='tdMainColsPan']/span/table/thead/tr[3]/th[2]/span";
	static String sponsorName = "//td[@class='tdMainColsPan']/span/table/thead/tr[3]/th[3]/span";
	
	static String projectName = "//table[@class='innerTable tbl-alt tableData'][1]//span[contains(text(),'Project')]/../span[2]";
	static String allProjectName = "//table[@class='innerTable tbl-alt tableData']//span[contains(text(),'Project')]/../span[2]";// list
	static String allColumnName = "//table[@class='innerTable tbl-alt tableData'][1]/tbody[position()<5]//tr//th[contains(@class,'innerTableHeading')]";// list

	
	//Raja
	
	static String programName_Enrollmensummary ="//td[contains(text(),'Project :')]";
	
	public static WebElement programName_Enrollmensummary(WebDriver driver) {
		element = driver.findElement(By.xpath(programName_Enrollmensummary));
		return element;
	}
	
	public static List<WebElement> allReportList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allReportList));
		return listElement;
	}

	public static WebElement buildReportBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(buildReportBtn));
		return element;
	}

	public static WebElement exportToPDF(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToPDF));
		return element;
	}

	public static WebElement exportToExcel(WebDriver driver) {
		element = driver.findElement(By.xpath(exportToExcel));
		return element;
	}

	public static WebElement timeStamp(WebDriver driver) {
		element = driver.findElement(By.xpath(timeStamp));
		return element;
	}

	public static WebElement programName(WebDriver driver) {
		element = driver.findElement(By.xpath(programName));
		return element;
	}

	public static WebElement sponsorName(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorName));
		return element;
	}

	public static WebElement projectName(WebDriver driver) {
		element = driver.findElement(By.xpath(projectName));
		return element;
	}

	public static List<WebElement> allProjectName(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allProjectName));
		return listElement;
	}

	public static List<WebElement> allColumnName(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allColumnName));
		return listElement;
	}



//for filter
	static String filterWindowButton = "//div[@class='filters']";
	static String countContractorPkg = "//div[@id='divTableData']//table/tbody/tr/td[contains(text(),'Award Status')]";

	public static WebElement filterWindowButton(WebDriver driver) {
		element = driver.findElement(By.xpath(filterWindowButton));
		return element;
	}

	public static List<WebElement> countContractorPkg(WebDriver driver) {
		listElement = driver.findElements(By.xpath(countContractorPkg));
		return listElement;
	}

//Add filter
	static String addFilterBtnOutside = "//input[@class='greenButton']";
	static String selectAnFilterDropdown = "//select[@id='ddlField']";
	static String selectAFilterCondition = "//select[@id='ddlCompare']";
	static String addFilterParameter1 = "//div[@id='s2id_lbParam']";
	static String selectParameter1 = "//div[@id='select2-drop']/ul/li";
	static String addFilterBtnInside = "//input[@id='btnAdd']";

	public static WebElement addFilterBtnOutside(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterBtnOutside));
		return element;
	}

	public static WebElement selectAnFilterDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAnFilterDropdown));
		return element;
	}

	public static WebElement selectAFilterCondition(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAFilterCondition));
		return element;
	}

	public static WebElement addFilterParameter1(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterParameter1));
		return element;
	}

	public static WebElement addFilterBtnInside(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterBtnInside));
		return element;
	}

	public static List<WebElement> selectParameter1(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectParameter1));
		return listElement;
	}

}
