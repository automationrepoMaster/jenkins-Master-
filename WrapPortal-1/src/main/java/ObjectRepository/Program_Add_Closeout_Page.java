package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//preview Panel Add Closeout Button 
public class Program_Add_Closeout_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String addCloseoutFetchProjectNameList = "//div[@id='ctrlCloseout_divWorksiteList']/div/table/tbody/tr[*]/td[*]";// list
	// selecting project and Add notice selection is work from test calss
	static String addCloseoutCloseButton = "//button[@id='ctrlCloseout_btnClose']";
	static String addCloseoutSkipAndAddCloseoutButton = "//input[@id='ctrlCloseout_btnSkipandAddCloseout']";
	// Closeout Page Xpaths
	static String fetchCompletionDate = "//span[@id='ctrlCloseout_lblTitle']/span[@class='valueTxt']";
	static String fetchProgramName = "//div[@class='col-md-12 clearfix']//div[@class='lableValueTxt']";
	static String fetchProjectName = "//div[@class='col-md-12 clearfix']//div[@class='lableValueTxt']";
	static String fetchAllCloseoutPanelValues = "//table[@class='table blueTable marg-top-10']/tbody/tr[*]";// list
	static String selectActualCompletionDate = "//input[@id='ctrlCloseout_txtCompletionDate']"; 
																								//Date Format(01/30/2019)
	static String selectFinalActualContractCost = "//input[@id='ctrlCloseout_txtActualCost']";
	static String selectFinalActualPayroll = "//input[@id='ctrlCloseout_txtActualPayroll']";
	static String selectFinalActualManHours = "//input[@id='ctrlCloseout_txtActualHours']";
	static String companyNameField = "//input[@id='ctrlCloseout_txtAuditCompany']";
	static String individualField = "//input[@id='ctrlCloseout_txtAuditContact']";
	static String telephoneField = "//input[@id='ctrlCloseout_txtAuditPhone']";
	static String emailField = "//input[@id='ctrlCloseout_txtAuditEmail']";
	static String checkBox = "//input[@id='ctrlCloseout_chkAgree']";
	static String closeoutPageCloseButton = "//button[@id='ctrlCloseout_btnClose']";
	static String closeoutPageSaveAndClose = "//input[@id='ctrlCloseout_btnSaveandClose']";

	public static WebElement addCloseoutFetchProjectNameList(WebDriver driver) {
		element = driver.findElement(By.xpath(addCloseoutFetchProjectNameList));
		return element;
	}

	public static WebElement addCloseoutCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addCloseoutCloseButton));
		return element;
	}

	public static WebElement addCloseoutSkipAndAddCloseoutButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addCloseoutSkipAndAddCloseoutButton));
		return element;
	}

	public static WebElement fetchCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchCompletionDate));
		return element;
	}

	public static WebElement fetchProgramName(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchProgramName));
		return element;
	}

	public static WebElement fetchProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchProjectName));
		return element;
	}

	public static WebElement fetchAllCloseoutPanelValues(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllCloseoutPanelValues));
		return element;
	}

	public static WebElement selectActualCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(selectActualCompletionDate));
		return element;
	}

	public static WebElement selectFinalActualContractCost(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFinalActualContractCost));
		return element;
	}

	public static WebElement selectFinalActualPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFinalActualPayroll));
		return element;
	}

	public static WebElement selectFinalActualManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFinalActualManHours));
		return element;
	}

	public static WebElement companyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(companyNameField));
		return element;
	}

	public static WebElement individualField(WebDriver driver) {
		element = driver.findElement(By.xpath(individualField));
		return element;
	}

	public static WebElement telephoneField(WebDriver driver) {
		element = driver.findElement(By.xpath(telephoneField));
		return element;
	}

	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath(emailField));
		return element;
	}

	public static WebElement checkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBox));
		return element;
	}

	public static WebElement closeoutPageCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeoutPageCloseButton));
		return element;
	}

	public static WebElement closeoutPageSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(closeoutPageSaveAndClose));
		return element;
	}

}
