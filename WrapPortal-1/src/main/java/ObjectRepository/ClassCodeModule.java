package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassCodeModule {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String classCodeAddIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntWorkList_liadd']";
	static String classCodeEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntWorkList_liedit']";
	static String classCodeDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntWorkList_lidelete']";
	static String classCodeSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_cntWorkList_txtSearch']";
	static String classCodeSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	// Advance Search Box Xpaths
	static String classCodeAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String classCodeAdvanceSearchSelectState = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlStateSearch']";
	static String classCodeAdvanceSearchSelectStatus = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlStatus']";
	static String classCodeAdvanceSearchSelectClassCodeType = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlClassCodeType']";
	static String classCodeAdvanceSearchSelectFlag = "//i[@class='icon20 i-flag lightredflag']";
	static String classCodeAdvanceSearchSelectCategory = "//button[@id='ctl00_ContentPlaceHolder1_cntWorkList_btnDropdown']";
	static String classCodeAdvanceSearchSelectSortingExpression = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlSortingExpression']";
	static String classCodeAdvanceSearchSelectSortingOrder = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlSortingOrder']";
	static String classCodeAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String classCodeAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String classCodeClearIcon = "//i[@class='fa fa-refresh']";
	// Class Code Module Preview Panel xpaths
	static String classCodeStatePrivewP = "//span[@id='lblstate']";
	static String classCodeStatusPrivewP = "//div[contains(text(),'Class Code Status')]/../ul/li[*]"; // findElements();
	static String classCodeTotalEstimatedClassCodePrivewP = "//div[contains(text(),'Total Estimated Class Code')]/../ul/li[*]";// findElements();
	static String classCodeAverageClassCodePrivewP = "//div[contains(text(),'Average Class Code')]/../ul/li[*]";// findElements();
	static String classCodeTotalReportedClassCode_ExcludingCloseout_PrivewP = "//div[contains(text(),'Total Reported Class Code (Excluding Closeout)')]/../ul/li[*]";// findElements();
	static String classCodeTotalReportedClassCode_IncludingCloseout_PrivewP = "//div[contains(text(),'Total Reported Class Code (Including Closeout)')]/../ul/li[*]";// findElements();
	static String classCodeAverageReportedClassCodePrivewP = "//div[contains(text(),'Average Reported Class Code')]/../ul/li[*]";// findElements();
	static String classCodeFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String classCodeFetchModifiedByPrivewP = "//span[@class='modifydate']";
	// Listing Panels extra xpath
	static String classCodeSelectFirstClassCodeFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]";
	static String classCodeSelectAllClassCodeFrmList = "//div[@class='mail_list twoIconset userListLeft divisionList']/ul/li[*]";// elements
	
	static String selectAllClassCodeDescriptionFrmLst ="//div[@class='mail_list twoIconset']/ul/li[*]/div/div[1]/div/div[1]/div[1]";
	static String selectAllClassCodeTypeFrmLst ="//div[@class='mail_list twoIconset']/ul/li[*]/div/div[1]/div/div[1]/div[2]";
	static String selectAllClassCodeFrmLst ="//div[@class='mail_list twoIconset']/ul/li[*]/div/div[1]/div/div[2]/div[1]";
	static String selectAllClassCodeModifiedDateFrmLst =	"//div[@class='mail_list twoIconset']/ul/li[*]/div/div[1]/div/div[2]/div[2]";
	static String displayTotalCountOfClassCode ="//span[contains(text(),'Displaying')]//span[@id='ctl00_ContentPlaceHolder1_cntWorkList_lblTotalRecord']";
	static String seeMoreBtnClassCode ="//a[@id='aSeeMore']";	
	
	public static List<WebElement> selectAllClassCodeDescriptionFrmLst(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllClassCodeDescriptionFrmLst));
		return listElement;
	}
	public static List<WebElement> selectAllClassCodeTypeFrmLst(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllClassCodeTypeFrmLst));
		return listElement;
	}
	public static List<WebElement> selectAllClassCodeFrmLst(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllClassCodeFrmLst));
		return listElement;
	}
	public static List<WebElement> selectAllClassCodeModifiedDateFrmLst(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllClassCodeModifiedDateFrmLst));
		return listElement;
	}
	public static WebElement displayTotalCountOfClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(displayTotalCountOfClassCode));
		return element;
	}
	public static WebElement seeMoreBtnClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreBtnClassCode));
		return element;
	}
	
	public static WebElement classCodeSelectFirstClassCodeFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeSelectFirstClassCodeFrmList));
		return element;
	}

	public static List<WebElement> classCodeSelectAllClassCodeFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeSelectAllClassCodeFrmList));
		return listElement;
	}

	public static WebElement classCodeAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAddIcon));
		return element;
	}

	public static WebElement classCodeEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeEditIcon));
		return element;
	}

	public static WebElement classCodeDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeDeleteIcon));
		return element;
	}

	public static WebElement classCodeSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeSearchEditBox));
		return element;
	}

	public static WebElement classCodeSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeSearchIcon));
		return element;
	}

	public static WebElement classCodeAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchIcon));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectState(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectState));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectStatus));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectClassCodeType(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectClassCodeType));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectFlag));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectCategory(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectCategory));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectSortingExpression(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectSortingExpression));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSelectSortingOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSelectSortingOrder));
		return element;
	}

	public static WebElement classCodeAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement classCodeAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement classCodeClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeClearIcon));
		return element;
	}

	public static WebElement classCodeStatePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeStatePrivewP));
		return element;
	}

	public static List<WebElement> classCodeStatusPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeStatusPrivewP));
		return listElement;
	}

	public static List<WebElement> classCodeTotalEstimatedClassCodePrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeTotalEstimatedClassCodePrivewP));
		return listElement;
	}

	public static List<WebElement> classCodeAverageClassCodePrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeAverageClassCodePrivewP));
		return listElement;
	}

	public static List<WebElement> classCodeTotalReportedClassCode_ExcludingCloseout_PrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeTotalReportedClassCode_ExcludingCloseout_PrivewP));
		return listElement;
	}

	public static List<WebElement> classCodeTotalReportedClassCode_IncludingCloseout_PrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeTotalReportedClassCode_IncludingCloseout_PrivewP));
		return listElement;
	}

	public static List<WebElement> classCodeAverageReportedClassCodePrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(classCodeAverageReportedClassCodePrivewP));
		return listElement;
	}

	public static WebElement classCodeFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeFetchCreatedByPrivewP));
		return element;
	}

	public static WebElement classCodeFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(classCodeFetchModifiedByPrivewP));
		return element;
	}

}
