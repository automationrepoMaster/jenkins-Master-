package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TradesModule {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String tradesAddIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrTradeList_liadd']";
	static String tradesEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrTradeList_liedit']";
	static String tradesDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntrTradeList_lidelete']//a[@class='tipB']";
	static String tradesSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_cntrTradeList_txtSearch']";
	static String tradesSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	// Advance Search Box Xpaths
	static String tradesAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String tradesAdvanceSearchSelectFlag = "//i[@class='icon20 i-flag lightredflag']";
	static String tradesAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String tradesAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String tradesClearIcon = "//i[@class='fa fa-refresh']";
	// Trades Module Preview Panel xpaths
	static String tradesStatusPrivewP = "//div[@class='patternBG2 clearfix']//div[@class='heading']/../ul/li[*]";// findElements()
	static String tradesFetchContracotrPackagesPrivewP = "//div[contains(text(),'Contractor Packages')]/../div[2]/div[*]"; // findElements()
	// Listing Panels extra xpath
	static String tradesSelectFirstTradeFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]";
	static String tradesSelectAllTradeFrmList = "//ul[@id='ulTradeList']/li//*[@class='userName']";//findElements()
	static String seeMoreLink ="//a[@id='aSeeMore']";
	
	public static WebElement seeMoreLink(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreLink));
		return element;
	}
	
	public static WebElement tradesSelectFirstTradeFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesSelectFirstTradeFrmList));
		return element;
	}
	public static List<WebElement> tradesSelectAllTradeFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(tradesSelectAllTradeFrmList));
		return listElement;
	}
	
	
	public static WebElement tradesAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesAddIcon));
		return element;
	}

	public static WebElement tradesEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesEditIcon));
		return element;
	}

	public static WebElement tradesDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesDeleteIcon));
		return element;
	}

	public static WebElement tradesSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesSearchEditBox));
		return element;
	}

	public static WebElement tradesSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesSearchIcon));
		return element;
	}

	public static WebElement tradesAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesAdvanceSearchIcon));
		return element;
	}

	public static WebElement tradesAdvanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesAdvanceSearchSelectFlag));
		return element;
	}

	public static WebElement tradesAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement tradesAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement tradesClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(tradesClearIcon));
		return element;
	}

	public static List<WebElement> tradesStatusPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(tradesStatusPrivewP));
		return listElement;
	}

	public static List<WebElement> tradesFetchContracotrPackagesPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(tradesFetchContracotrPackagesPrivewP));
		return listElement;
	}

}
