package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_NCP_Missing_Payroll_By_Contractor {

	public static WebElement element;
	private static List<WebElement> listElement;

	static String addFilterBtn = "//input[@id='btnAddFilter']";
	static String radioBtnTrade = "//input[@id='rblSort_0']";
	static String radioBtnContractor = "//input[@id='rblSort_1']";
	static String selectProgram = "//select[@id='ListBox2']";
	static String selectContractor = "//select[@id='ListBox3']";
	static String btnBuildReport = "//input[@id='btnBuildReport']";

	static String reportHeader = "//span[@id='Label1']";

	public static WebElement addFilterBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addFilterBtn));
		return element;

	}

	public static WebElement radioBtnTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnTrade));
		return element;

	}

	public static WebElement radioBtnContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnContractor));
		return element;

	}

	public static WebElement selectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgram));
		return element;

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

	// for filter
	static String filterWindowButton = "//div[@class='filters']";
	static String countContractorPkg = "//div[@id='divTableData']//table/tbody/tr/td[contains(text(),'Contract Number')]";
	static String pdfLink = "//a[@id='lnkPDF']";
	static String excelLink = "//a[@id='lnkExcel']";

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
	}

	public static WebElement excelLink(WebDriver driver) {
		element = driver.findElement(By.xpath(excelLink));
		return element;
	}

	// Add filter
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
