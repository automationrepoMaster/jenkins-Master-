package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractorModule {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String contractorAddIcon = "//i[@class='fa fa-plus']";
	static String contractorEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liedit']";
	static String contractorDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']";
	static String contractorSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_ctrlUserList_txtSearch']";
	static String contractorSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	// Advance Search Box Xpaths
	static String contractorAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String contractorAdvanceSearchPhoneNo = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtPhone";// css
	static String contractorAdvanceSearchFax = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtFax";// css
	static String contractorAdvanceSearchEmail = "#ctl00_ContentPlaceHolder1_ctrlUserList_txtEmail";// css
	static String contractorAdvanceSearchSelectSecurityGroup = "//select[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ddlContractorType']";
	static String contractorAdvanceSearchSelectEnrollmentAdmin = "//select[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ddlIsEnrollmentAdmin']";
	static String contractorAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String contractorAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String contractorClearIcon = "//i[@class='fa fa-refresh']";
	// contractor Module Preview Panel xpaths
	static String contractorFetchContratorTypePrivewP = "//div[@id='ctrlContractorsPreview_divUserType']";
	static String contractorFetchContratorIdPrivewP = "//div[@class='col-md-3 col-sm-3 col-xs-5 rightAlign']";
	static String contractorFetchFEIN_NoPrivewP = "//div[@id='ctrlContractorsPreview_divFEINNumber']";
	static String contractorMergeBtnPrivewP = "//a[@id='ctrlContractorsPreview_aMerge']";
	static String contractorFlagBtnPrivewP = "//a[@id='ctrlContractorsPreview_spnflag']";
	static String contractorFetchAddressPrivewP = "//div[@id='ctrlContractorsPreview_divAddress']";
	static String contractorFetchEmailIdPrivewP = "//div[@id='ctrlContractorsPreview_divEmail']";
	static String contractorFetchDBA_NoFieldPrivewP = "//div[@id='ctrlContractorsPreview_divDBA']/ul/li";
	static String contractorFetchlicense_NoFieldPrivewP = "//ul[@id='ulCompanyLicense']";
	static String contractorFetchPhoneNoPrivewP = "//div[@id='ctrlContractorsPreview_divPhone']";
	static String contractorDownloadContracotCertificateLinkPrivewP = "//a[@id='ctrlContractorsPreview_aDownloadCertificate']";
	static String contractorFetchContactsCountPrivewP = "//div[contains(text(),'Contacts')]";
	static String contractorFetchAllContactsDetailsPrivewP = "//div[@id='ctrlContractorsPreview_divContactList']//div[@class='whiteMainBox clearfix']/div/table/tbody/tr[*]";// findElements()
	static String contractorFetchPrimaryContractorPackagesNoPrivewP = "//ul[@class='nav nav-tabs tabs-Full']/li[@id='ctrlContractorsPreview_liPrimaryCP']";
	static String contractorFetchSecondaryContractorPackagesNoPrivewP = "//ul[@class='nav nav-tabs tabs-Full']/li[@id='ctrlContractorsPreview_liSecondaryCP']";
	static String contractorFetchAllSecondaryContractorPackagesDetailsPrivewP = "//div[@class='col-md-12 tab-content']/div[2]/div[1]/div[*]";// findElements()
	static String contractorFetchAllPrimaryContractorPackagesDetailsPrivewP	  = "//div[@class='col-md-12 tab-content']/div[1]/div[1]/div[*]";// findElements()
	static String contractorFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String contractorFetchModifiedByPrivewP = "//span[@class='modifydate']";
	//div[@class='col-md-12 tab-content']/div[2]/div[1]/div[*]/div[2]
	static String contractorDownloadContractorCertificateLinkCloseBtn ="//a[@class='btn']";

	public static WebElement contractorAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorAddIcon));
		return element;
	}

	public static WebElement contractorEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorEditIcon));
		return element;
	}

	public static WebElement contractorDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorDeleteIcon));
		return element;
	}

	public static WebElement contractorSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorSearchEditBox));
		return element;
	}

	public static WebElement contractorSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorSearchIcon));
		return element;
	}

	public static WebElement contractorAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorAdvanceSearchIcon));
		return element;
	}

	public static WebElement contractorAdvanceSearchPhoneNo(WebDriver driver) {
		element = driver.findElement(By.cssSelector(contractorAdvanceSearchPhoneNo));
		return element;
	}

	public static WebElement contractorAdvanceSearchFax(WebDriver driver) {
		element = driver.findElement(By.cssSelector(contractorAdvanceSearchFax));
		return element;
	}

	public static WebElement contractorAdvanceSearchEmail(WebDriver driver) {
		element = driver.findElement(By.cssSelector(contractorAdvanceSearchEmail));
		return element;
	}

	public static WebElement contractorAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(contractorAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement contractorAdvanceSearchSelectSecurityGroup(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorAdvanceSearchSelectSecurityGroup));
		return element;
	}

	public static WebElement contractorAdvanceSearchSelectEnrollmentAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorAdvanceSearchSelectEnrollmentAdmin));
		return element;
	}

	public static WebElement contractorAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement contractorClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorClearIcon));
		return element;
	}

	public static WebElement contractorFetchContratorTypePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchContratorTypePrivewP));
		return element;
	}

	public static WebElement contractorFetchContratorIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchContratorIdPrivewP));
		return element;
	}

	public static WebElement contractorFetchFEIN_NoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchFEIN_NoPrivewP));
		return element;
	}

	public static WebElement contractorMergeBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorMergeBtnPrivewP));
		return element;
	}

	public static WebElement contractorFlagBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFlagBtnPrivewP));
		return element;
	}

	public static WebElement contractorFetchAddressPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchAddressPrivewP));
		return element;
	}

	public static WebElement contractorFetchEmailIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchEmailIdPrivewP));
		return element;
	}

	public static WebElement contractorFetchDBA_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchDBA_NoFieldPrivewP));
		return element;
	}

	public static WebElement contractorFetchlicense_NoFieldPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchlicense_NoFieldPrivewP));
		return element;
	}

	public static WebElement contractorFetchPhoneNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchPhoneNoPrivewP));
		return element;
	}

	public static WebElement contractorDownloadContracotCertificateLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorDownloadContracotCertificateLinkPrivewP));
		return element;
	}

	public static WebElement contractorFetchContactsCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchContactsCountPrivewP));
		return element;
	}

	public static List<WebElement> contractorFetchAllContactsDetailsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorFetchAllContactsDetailsPrivewP));
		return listElement;
	}

	public static WebElement contractorFetchPrimaryContractorPackagesNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchPrimaryContractorPackagesNoPrivewP));
		return element;
	}

	public static WebElement contractorFetchSecondaryContractorPackagesNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchSecondaryContractorPackagesNoPrivewP));
		return element;
	}

	public static List<WebElement> contractorFetchAllSecondaryContractorPackagesDetailsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorFetchAllSecondaryContractorPackagesDetailsPrivewP));
		return listElement;
	}

	public static List<WebElement> contractorFetchAllPrimaryContractorPackagesDetailsPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorFetchAllPrimaryContractorPackagesDetailsPrivewP));
		return listElement;
	}

	public static WebElement contractorFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchCreatedByPrivewP));
		return element;
	}

	public static WebElement contractorFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorFetchModifiedByPrivewP));
		return element;
	}
	public static WebElement contractorDownloadContractorCertificateLinkCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorDownloadContractorCertificateLinkCloseBtn));
		return element;
	}
	
}
