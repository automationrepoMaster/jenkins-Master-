package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SponsorsModule 
{
	//WebDriver driver;
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String SponsorAddIcon="//i[@class='fa fa-plus']";
	static String SponsorEditIcon="//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liedit']";
	static String SponsorDeleteIcon="//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']";
	static String sponsorSearchEditBox="//input[@id='ctl00_ContentPlaceHolder1_ctrlUserList_txtSearch']";
	static String sponsorSearchIcon="//div[@class='controllGroup']//i[@class='fa fa-search']";
	//Advance Search Box Xpaths
	static String sponsorAdvanceSearchIcon="//a[@data-original-title='Advanced Search']";
	static String sponsorAdvanceSearchPhoneNo="#ctl00_ContentPlaceHolder1_ctrlUserList_txtPhone";//css
	static String sponsorAdvanceSearchFax="#ctl00_ContentPlaceHolder1_ctrlUserList_txtFax";//css
	static String sponsorAdvanceSearchEmail="#ctl00_ContentPlaceHolder1_ctrlUserList_txtEmail";//css
	static String sponsorAdvanceSearchSearchBtn="#btnAdvanceSearch";//css
	static String sponsorAdvanceSearchSelectSecurityGroup="//select[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ddlContractorType']";
	static String sponsorAdvanceSearchCloseBtn="//button[contains(text(),'Close')]";
	static String sponsorClearIcon="//i[@class='fa fa-refresh']";
	//Sponsor Module Preview Panel xpaths
	static String sponsorFetchSponsorIdPrivewP="//span[@id='ctrlOwnerPreview_lblCompanyID']/../..";
	static String sponsorFetchFEIN_NoPrivewP="//span[@id='ctrlOwnerPreview_lblFEINNumber']";
	static String sponsorMergeBtnPrivewP="//span[@id='ctrlOwnerPreview_lblFEINNumber']";
	static String sponsorFlagBtnPrivewP="//a[@id='ctrlOwnerPreview_spnflag']";
	static String sponsorFetchDBA_NoFieldPrivewP="//ul[@id='ulComapnyDBA']";
	static String sponsorFetchlicense_NoFieldPrivewP="//ul[@id='ulCompanyLicense']";
	static String sponsorFetchEmailIdPrivewP="//span[@id='ctrlOwnerPreview_lblContactEmail']";
	static String sponsorFetchPhoneNoPrivewP="//span[@id='ctrlOwnerPreview_lblContactPhone']";
	static String sponsorFetchAddressPrivewP="//div[@id='ctrlOwnerPreview_divAddress']";
	static String sponsorFetchContactsCountPrivewP="//div[contains(text(),'Contacts')]";
	
	static String sponsorFetchContactsPrivewP="//div[@class='overflowHide']/table[@class='table darkTable']/tbody/tr[*]";//findElements()
	static String sponsorFetchAssignedProgramsPrivewP="//div[@id='ctrlOwnerPreview_divAssignedProject']/div[*]";//findElements()
	static String sponsorFetchContractoPackagesNoPrivewP="//span[@id='ctrlOwnerPreview_ctrlContractorPackageChart_spanProjectCountChart']";
	static String sponsorFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String sponsorFetchModifiedByPrivewP = "//span[@class='modifydate']";
	
	
	
	public static WebElement SponsorAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(SponsorAddIcon));
		return element;
	}

	public static WebElement SponsorEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(SponsorEditIcon));
		return element;
	}

	public static WebElement SponsorDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.cssSelector(SponsorDeleteIcon));
		return element;
	}

	public static WebElement sponsorSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorSearchEditBox));
		return element;
	}

	public static WebElement sponsorAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorAdvanceSearchIcon));
		return element;
	}

	public static WebElement sponsorAdvanceSearchFax(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorAdvanceSearchFax));
		return element;
	}

	public static WebElement sponsorAdvanceSearchEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorAdvanceSearchEmail));
		return element;
	}

	public static WebElement sponsorAdvanceSearchPhoneNo(WebDriver driver) {
		element = driver.findElement(By.cssSelector(sponsorAdvanceSearchPhoneNo));
		return element;
	}

	public static WebElement sponsorAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(sponsorAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement sponsorAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement sponsorClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorClearIcon));
		return element;
	}

	public static WebElement sponsorFetchSponsorIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchSponsorIdPrivewP));
		return element;
	}

	public static WebElement sponsorFetchFEIN_NoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchFEIN_NoPrivewP));
		return element;
	}

	public static WebElement sponsorMergeBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorMergeBtnPrivewP));
		return element;
	}

	public static WebElement sponsorFlagBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFlagBtnPrivewP));
		return element;
	}

	public static WebElement sponsorFetchDBA_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchDBA_NoFieldPrivewP));
		return element;
	}

	public static WebElement sponsorFetchlicense_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchlicense_NoFieldPrivewP));
		return element;
	}

	public static WebElement sponsorFetchEmailIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchEmailIdPrivewP));
		return element;
	}

	public static WebElement sponsorFetchPhoneNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchPhoneNoPrivewP));
		return element;
	}

	public static WebElement sponsorFetchAddressPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchAddressPrivewP));
		return element;
	}

	public static List<WebElement> sponsorFetchContactsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(sponsorFetchContactsPrivewP));
		return listElement;
	}

	public static List<WebElement> sponsorFetchAssignedProgramsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(sponsorFetchAssignedProgramsPrivewP));
		return listElement;
	}

	public static WebElement sponsorFetchContractoPackagesNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchContractoPackagesNoPrivewP));
		return element;
	}

	public static WebElement sponsorFetchContactsCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchContactsCountPrivewP));
		return element;
	}
	public static WebElement sponsorFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchCreatedByPrivewP));
		return element;
	}
	public static WebElement sponsorFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorFetchModifiedByPrivewP));
		return element;
	}
	
	
}
