package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DivisionModule {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String divisionAddIcon = "//li[@id='ctl00_ContentPlaceHolder1_cntDivisionList_liadd']";
	static String divisionEditIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liedit']";
	static String divisionDeleteIcon = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']";
	static String divisionSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_ctrlUserList_txtSearch']";
	static String divisionSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	// Advance Search Box Xpaths
	static String divisionAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String divisionAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String divisionAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String divisionClearIcon = "//i[@class='fa fa-refresh']";

	// Division/district Module Preview Panel xpaths

	static String divisionFlagBtnPrivewP = "//i[@class='icon20 i-flag']";
	static String divisionFetchContactDetailsPrivewP = "//div[@id='ctl22_divContactDetails']";
	static String divisionFetchEmailIdPrivewP = "//div[@id='ctl22_divEmailAddress']";
	static String divisionFetchPhoneNoPrivewP = "//div[@id='ctl22_divTelephoneNumber']";
	static String divisionFetchAddressPrivewP = "//div[@id='ctl22_divAddress']";
	static String divisionFetchProjectCountPrivewP = "//div[@id='ctl22_ctrlContractorPackageChart_divWorkSiteCountChart']//div[@class='countWrap']";

	static String divisionFetchAllContractorPackagesCountPrivewP = "//div[@id='ctl22_ctrlContractorPackageChart_divContractTypeCharts']";
	static String divisionFetchAwardedContractorPackagesCountPrivewP = "//div[@id='ctl22_ctrlContractorPackageChart_divStatustypeCharts']";
	static String divisionFetchUserAccessSponsorsNamePrivewP = "//div[@id='ctl22_divOwner']/ul/li[*]";
	static String divisionFetchAdministratorNamePrivewP = "//div[@id='ctl22_divNodeAdministrator']//ul/li[*]";
	static String divisionFetchAccountCoordinatorNamePrivewP = "//div[@id='ctl22_rptDivisionContactType_ctl00_divContactType']//ul/li[*]";
	static String divisionFetchAssignedProjectNamePrivewP = "//div[@id='ctl22_divAssignedWorkSite']/div[*]";
	static String divisionFetchCreatedByPrivewP = "//span[@class='createddate']";
	static String divisionFetchModifiedByPrivewP = "//span[@class='modifydate']";

	public static WebElement divisionAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionAddIcon));
		return element;
	}

	public static WebElement divisionEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionEditIcon));
		return element;
	}

	public static WebElement divisionDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionDeleteIcon));
		return element;
	}

	public static WebElement divisionSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionSearchEditBox));
		return element;
	}

	public static WebElement divisionSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionSearchIcon));
		return element;
	}

	public static WebElement divisionAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionAdvanceSearchIcon));
		return element;
	}

	public static WebElement divisionAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(divisionAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement divisionAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement divisionClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionClearIcon));
		return element;
	}

	public static WebElement divisionFlagBtnPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFlagBtnPrivewP));
		return element;
	}

	public static WebElement divisionFetchContactDetailsPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchContactDetailsPrivewP));
		return element;
	}

	public static WebElement divisionFetchEmailIdPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchEmailIdPrivewP));
		return element;
	}

	public static WebElement divisionFetchPhoneNoPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchPhoneNoPrivewP));
		return element;
	}

	public static WebElement divisionFetchAddressPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAddressPrivewP));
		return element;
	}

	public static WebElement divisionFetchProjectCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchProjectCountPrivewP));
		return element;
	}

	public static WebElement divisionFetchAllContractorPackagesCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAllContractorPackagesCountPrivewP));
		return element;
	}

	public static WebElement divisionFetchAwardedContractorPackagesCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAwardedContractorPackagesCountPrivewP));
		return element;
	}

	public static WebElement divisionFetchUserAccessSponsorsNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchUserAccessSponsorsNamePrivewP));
		return element;
	}

	public static WebElement divisionFetchAdministratorNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAdministratorNamePrivewP));
		return element;
	}

	public static WebElement divisionFetchAccountCoordinatorNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAccountCoordinatorNamePrivewP));
		return element;
	}

	public static WebElement divisionFetchAssignedProjectNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchAssignedProjectNamePrivewP));
		return element;
	}

	public static WebElement divisionFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchCreatedByPrivewP));
		return element;
	}

	public static WebElement divisionFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionFetchModifiedByPrivewP));
		return element;
	}

}
