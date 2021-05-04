package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsersModule {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String userAddIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liadd']//a[@class='tipB']";
	static String userEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liedit']";
	static String userDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']";
	static String userSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_ctrlUserList_txtSearch']";
	static String userSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	// Advance Search Box Xpaths
	static String userAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String userAdvanceSearchPhoneNo = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtPhone";// css
	static String userAdvanceSearchFax = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtFax";// css
	static String userAdvanceSearchEmail = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtEmail";// css
	static String userAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String userAdvanceSearchSelectSecurityGroup = "//select[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ddlContractorType']";
	static String userAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String userClearIcon = "//i[@class='fa fa-refresh']";
	// Sponsor Module Preview Panel xpaths
	static String userFetchSponsorIdPrivewP = "//span[@id='ctl21_lblCompanyID']/../..";

	static String userFetchFEIN_NoPrivewP = "//span[@id='ctl21_lblFEINNumber']";
	// static String
	// userMergeBtnPrivewP="//span[@id='ctrlOwnerPreview_lblFEINNumber']";
	static String userFlagBtnPrivewP = "//i[@class='icon20 i-flag']";
	static String userFetchDBA_NoFieldPrivewP = "//ul[@id='ulComapnyDBA']";
	static String userFetchlicense_NoFieldPrivewP = "//ul[@id='ulCompanyLicense']";
	static String userFetchEmailIdPrivewP = "//span[@id='ctl21_lblContactEmail']";
	static String userFetchPhoneNoPrivewP = "//span[@id='ctl21_lblContactPhone']";
	static String userFetchAddressPrivewP = "//div[@id='ctl21_divAddress']";
	static String userFetchContactsCountPrivewP = "//div[contains(text(),'Contacts')]";

	static String userFetchAssignedProgramsPrivewP = "//div[@id='ctl21_divAssignedProject']/div[*]";
	static String userFetchContactsPrivewP = "//div[@class='overflowHide']/table[@class='table darkTable']/tbody/tr[*]";
	static String userFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String userFetchModifiedByPrivewP = "//span[@class='modifydate']";
	
	public static WebElement userAddIcon(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(userAddIcon));	
		return element;
	}

	public static WebElement userEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(userEditIcon));
		return element;
	}

	public static WebElement userDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.cssSelector(userDeleteIcon));
		return element;
	}

	public static WebElement userSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(userSearchEditBox));
		return element;
	}

	public static WebElement userSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(userSearchIcon));
		return element;
	}

	public static WebElement userAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(userAdvanceSearchIcon));
		return element;
	}

	public static WebElement userAdvanceSearchPhoneNo(WebDriver driver) {
		element = driver.findElement(By.cssSelector(userAdvanceSearchPhoneNo));
		return element;
	}

	public static WebElement userAdvanceSearchFax(WebDriver driver) {
		element = driver.findElement(By.xpath(userAdvanceSearchFax));
		return element;
	}

	public static WebElement userAdvanceSearchEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(userAdvanceSearchEmail));
		return element;
	}

	public static WebElement userrAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(userAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement userAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(userAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement userAdvanceSearchSelectSecurityGroup(WebDriver driver) {
		element = driver.findElement(By.xpath(userAdvanceSearchSelectSecurityGroup));
		return element;
	}

	public static WebElement userClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(userClearIcon));
		return element;
	}

	public static WebElement userFetchSponsorIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchSponsorIdPrivewP));
		return element;
	}

	public static WebElement userFetchFEIN_NoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchFEIN_NoPrivewP));
		return element;
	}

	public static WebElement userFlagBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFlagBtnPrivewP));
		return element;
	}

	public static WebElement userFetchDBA_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchDBA_NoFieldPrivewP));
		return element;
	}

	public static WebElement userFetchlicense_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchlicense_NoFieldPrivewP));
		return element;
	}

	public static WebElement userFetchEmailIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchEmailIdPrivewP));
		return element;
	}

	public static WebElement userFetchPhoneNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchPhoneNoPrivewP));
		return element;
	}

	public static WebElement userFetchAddressPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchAddressPrivewP));
		return element;
	}

	public static List<WebElement> userFetchContactsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(userFetchContactsPrivewP));
		return listElement;
	}

	public static WebElement userFetchContactsCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchContactsCountPrivewP));
		return element;
	}

	public static WebElement userFetchAssignedProgramsPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchAssignedProgramsPrivewP));
		return element;
	}
	public static WebElement userFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchCreatedByPrivewP));
		return element;
	}
	public static WebElement userFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(userFetchModifiedByPrivewP));
		return element;
	}

}
