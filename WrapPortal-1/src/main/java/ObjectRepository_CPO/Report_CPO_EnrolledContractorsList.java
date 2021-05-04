package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_CPO_EnrolledContractorsList 
{
	
	public static WebElement element;
	public static List<WebElement> listElement;

	static String selectProgram = "//select[@id='ctrlBuildReport_lbProject']";
	static String selectDistrict = "//select[@id='ctrlBuildReport_lbDivision']";
	static String selectProject = "//div[@class='non-selected-wrapper']/a";
	static String selectContractor = "//select[@id='ctrlBuildReport_lbContractor']";
	static String btnBuildReport = "//input[@id='ctrlBuildReport_btnBuildReport']";
	static String reportHeader = "//div[@id='divHeaderTable']//tr[1]//td[1]/strong";

	public static WebElement selectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgram));
		return element;
	}
	public static WebElement selectDistrict(WebDriver driver) {
		element = driver.findElement(By.xpath(selectDistrict));
		return element;
	}
	public static List<WebElement> selectProject(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProject));
		return listElement;
	}
	public static WebElement selectContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractor));
		return element;
	}
	public static WebElement btnBuildReport(WebDriver driver) {
		element = driver.findElement(By.xpath(btnBuildReport));
		return element;
	}
	public static WebElement reportHeader(WebDriver driver) {
		element = driver.findElement(By.xpath(reportHeader));
		return element;
	}
	public static WebElement filterSelectProjectFormOption(WebDriver driver,String projectName) {
		element = driver.findElement(By.xpath("//div[@id='ctrlBuildReport_divWorksite']//div[@class='non-selected-wrapper']//a[contains(text(),'"+projectName+"')]"));
		return element;
		//we directly fetch project name in method and use dynamic xpath to accepting report name through method
	}

	//for filter 
	static String filterWindowButton ="//div[@class='filters']";
	static String countContractorPkg ="//div[@id='divTableData']//table/tbody/tr/td[contains(text(),'Contract Number')]";
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
