package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_CPO_ContractorInsuranceCostTracking {
	public static WebElement element;
	public static List<WebElement> listElement;

	static String selectProgram = "//select[@id='ctrlBuildReport_lbProject']";
	static String selectDistrict = "//select[@id='ctrlBuildReport_lbDivision']";
	static String selectProject = "//div[@class='non-selected-wrapper']/a";
	static String selectContractor = "//select[@id='ctrlBuildReport_lbContractor']";
	static String btnBuildReport = "//input[@id='ctrlBuildReport_btnBuildReport']";
	static String reportHeader = "//td[@class='mainTitle txt-center']";
	
	static String generalLiabilityPremiumTotal="//td[contains(text(),'General Liability Premium:')]/../td[position()>3]";
//			"//table[2]//tbody[1]//tr[4]//td[2]//table[1]//tbody[1]//tr[5]//td[1]//table[1]//tbody[1]//tr[4]/td[position()>3]";
	
	static String umbrellaLiabilityPremiumTotal="//td[contains(text(),'Umbrella Liability Premium:')]/../td[position()>3]";
	static String WCPremiumTotal="//td[contains(text(),'Total Premium:')]/../td[position()>1]";
	static String contractorPkgCostSummarySubTotal="//td[contains(text(),'Sub Total:')]/../td[position()>3]";
	static String contractorPkgCostSummaryTotal="//*[contains(text(),'Contractor Insurance Cost Summary')]/../../tr[last()-2]//td[position()>3]";
	static String contractorPkgCostSummaryCostPercentBypayroll="//*[contains(text(),'Contractor Insurance Cost Summary')]/../../tr[last()]//td[position()>3]";
	
	
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
	public static List<WebElement> generalLiabilityPremiumTotal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(generalLiabilityPremiumTotal));
		return listElement;
	}

	public static List<WebElement> umbrellaLiabilityPremiumTotal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(umbrellaLiabilityPremiumTotal));
		return listElement;
	}
	public static List<WebElement> WCPremiumTotal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(WCPremiumTotal));
		return listElement;
	}
	public static List<WebElement> contractorPkgCostSummarySubTotal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgCostSummarySubTotal));
		return listElement;
	}
	public static List<WebElement> contractorPkgCostSummaryTotal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgCostSummaryTotal));
		return listElement;
	}
	public static List<WebElement> contractorPkgCostSummaryCostPercentBypayroll(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgCostSummaryCostPercentBypayroll));
		return listElement;
	}
	//filter xpaths
	static String countProjectNames="//div[@id='divTableDataWeb']/table/tbody/tr[2]/th[contains(text(),'Project:') and position()=2]";
	static String countProjectWiseContractorPkg="//div[@id='divTableData']//table[@class='mainTable']/tbody/tr[2]//table[@class='innerTable']//tbody/tr[1]/td[contains(text(),'Contract #:')]";
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
