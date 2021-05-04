package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarriersModule {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String carriersAddIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_liadd']";
	static String carriersEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_liedit']";
	static String carriersDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_lidelete']//a[@class='tipB']";
	static String carriersSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_txtSearch']";
	static String carriersSearchIcon = "//div[@class='controllGroup']//a";
	// Advance Search Box Xpaths
	static String carriersAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String carriersAdvanceSearchSelectState = "//select[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_ddlStateSearch']";
	static String carriersAdvanceSearchSelectStatus = "//select[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_ddlStatus']";
	static String carriersAdvanceSearchSelectFlag = "//i[@class='icon20 i-flag lightredflag']";
	static String carriersAdvanceSearchSelectCategory = "//button[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_btnDropdown']";
	static String carriersAdvanceSearchSelectSortingExpression = "//select[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_ddlSortingExpression']";
	static String carriersAdvanceSearchSelectSortingOrder = "//select[@id='ctl00_ContentPlaceHolder1_cntrlCarrierList_ddlSortingOrder']";

	static String carriersAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String carriersAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String carriersClearIcon = "//i[@class='fa fa-refresh']";
	// Class Code Module Preview Panel xpaths
	static String carriersNAICPrivewP = "//div[@class='lableValueTxt']";
	static String carriersOffsiteCoverageStatusPrivewP = "//div[@class='patternBG2 clearfix']/ul/li"; // findElements();
	static String carriersFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String carriersFetchModifiedByPrivewP = "//span[@class='modifydate']";

	public static WebElement carriersAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAddIcon));
		return element;
	}

	public static WebElement carriersEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersEditIcon));
		return element;
	}

	public static WebElement carriersDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersDeleteIcon));
		return element;
	}

	public static WebElement carriersSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersSearchEditBox));
		return element;
	}

	public static WebElement carriersSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersSearchIcon));
		return element;
	}

	public static WebElement carriersAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchIcon));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectState(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectState));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectStatus));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectFlag));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectCategory(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectCategory));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectSortingExpression(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectSortingExpression));
		return element;
	}

	public static WebElement carriersAdvanceSearchSelectSortingOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSelectSortingOrder));
		return element;
	}

	public static WebElement carriersAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement carriersAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(carriersAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement carriersClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersClearIcon));
		return element;
	}

	public static WebElement carriersNAICPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersNAICPrivewP));
		return element;
	}

	public static List<WebElement> carriersOffsiteCoverageStatusPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(carriersOffsiteCoverageStatusPrivewP));
		return listElement;
	}

	public static WebElement carriersFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersFetchCreatedByPrivewP));
		return element;
	}

	public static WebElement carriersFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(carriersFetchModifiedByPrivewP));
		return element;
	}

}
