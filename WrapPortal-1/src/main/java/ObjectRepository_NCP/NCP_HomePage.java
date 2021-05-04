package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_HomePage {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String ProfilePictureicon = "//img[@id='imgAvtar']";
	static String MyProfileIcon = "//a[@class='dropdown-item waves-effect waves-light']";
	static String SignOutIcon = "//a[@id='aLogout']";
	static String searchForContractorPkgField = "//input[@id='txt-search']";
	static String searchForContractorPkgSearchIcon = "//i[@class='fa fa-search']";
	static String ReportModule="//a[@href='/Report/Index']";
	static String MyDocumentModule="//span[contains(text(),'My Documents')]";
	
	// Notification Section
	static String notificationAssignContractorPkg = "//*[contains(text(),'My Notifications')]/../div/div[1]/div/div[1]/a";
	static String notificationMissingPayrollPkg = "//*[contains(text(),'My Notifications')]/../div/div[1]/div/div[2]/a";
	static String notificationIncompletePaperWork = "//*[contains(text(),'My Notifications')]/../div/div[1]/div/div[3]/a";
	static String notificationExpiredOffSiteCoverage = "//*[contains(text(),'My Notifications')]/../div/div[1]/div/div[4]/a";
	// Filter
	static String btnFilterBy = "//a[@class='filter-btn']";
	static String selectProgramField = "//div[@class='advance-search']/div/div[1]//input[@type='text']";
	static String selectProgramFromList = "//div[@class='advance-search']/div/div[1]//ul/li[*]";// list
	static String selectProjectField = "//div[@class='advance-search']/div/div[2]/div[1]/div/input";
	static String selectProjectFromList = "//div[@class='advance-search']/div/div[2]/div[1]//ul/li[*]";// list
	
	
	//trade-raja 
	static String selectTradeField = "//div[@class='advance-search']/div[1]/div[6]/div[1]/div" ; //                     "//div[@class='advance-search']/div/div[3]/div//input";
	static String searchForTradeField =  "//div[@class='advance-search']/div[1]/div[6]/div[1]/div//input[@class='search form-control w-100 d-block']";                                           //"//input[@placeholder='Search here..']";
	
	static String selectTradeFromList = "//div[@class='advance-search']/div[1]/div[6]/div[1]/div/input/..//ul/li";           //"//div[@class='advance-search']/div/div[3]/div/div/ul/li[*]/span";// list
	
	static String selectEnrollmentTypeField = "//div[@class='advance-search']/div/div[4]/div/div/input";
	static String selectEnrollmentFromList = "//div[@class='advance-search']/div/div[4]//ul/li[*]";// list
	static String sortOptionField = "//div[@class='advance-search']/div/div[8]/div/div/input";
	static String selectsortOptionsFromList = "//div[@class='advance-search']/div/div[8]//ul/li";// list
	static String sortOrderField = "//div[@class='advance-search']/div/div[9]/div/div/input";
	static String selectSortOrderFromList = "//div[@class='advance-search']/div/div[9]//ul/li";// list
	static String selectContractValue = "//input[@id='txtContractValue']";
	static String selectContractNumber = "//input[@id='txtContractNumber']";
	static String btnSearch = "//a[contains(text(),'Search')]";
	
	// Contractor Package Selection
	static String myProjectListing = "//span[contains(text(),'My Projects')]";
	static String mySubContractorListing = "//span[contains(text(),'My Subcontractors')]";
	static String selectPreviewPanelProjectDropdown = "//div[@id='accordionEx']/div[*]//h5[contains(text(),'Sony Project9832')]/../..//i[@class='fas fa-angle-down rotate-icon']";
	static String btnRefresh = "//i[@class='mdi mdi-refresh']";
	static String seeMoreContracts ="//a[@onclick='seeMoreContractorPackage();']";
	
	
	
	public static WebElement searchForTradeField(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(searchForTradeField));
		return element;
	}
	public static WebElement seeMoreContracts(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreContracts));
		return element;
	}
	public static WebElement MyDocumentModule(WebDriver driver) {
		element = driver.findElement(By.xpath(MyDocumentModule));
		return element;
	}
	public static WebElement ReportModule(WebDriver driver) {
		element = driver.findElement(By.xpath(ReportModule));
		return element;
	}
	public static WebElement ProfilePictureicon(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfilePictureicon));
		return element;
	}

	public static WebElement MyProfileIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(MyProfileIcon));
		return element;
	}

	public static WebElement SignOutIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(SignOutIcon));
		return element;
	}

	public static WebElement searchForContractorPkgField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchForContractorPkgField));
		return element;
	}

	public static WebElement searchForContractorPkgSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(searchForContractorPkgSearchIcon));
		return element;
	}

	public static WebElement notificationAssignContractorPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(notificationAssignContractorPkg));
		return element;
	}

	public static WebElement notificationMissingPayrollPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(notificationMissingPayrollPkg));
		return element;
	}

	public static WebElement notificationIncompletePaperWork(WebDriver driver) {
		element = driver.findElement(By.xpath(notificationIncompletePaperWork));
		return element;
	}

	public static WebElement notificationExpiredOffSiteCoverage(WebDriver driver) {
		element = driver.findElement(By.xpath(notificationExpiredOffSiteCoverage));
		return element;
	}

	public static WebElement btnFilterBy(WebDriver driver) {
		element = driver.findElement(By.xpath(btnFilterBy));
		return element;
	}

	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramField));
		return element;
	}

	public static List<WebElement> selectProgramFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramFromList));
		return listElement;
	}

	public static WebElement selectProjectField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectField));
		return element;
	}

	public static List<WebElement> selectProjectFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProjectFromList));
		return listElement;
	}

	public static WebElement selectTradeField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTradeField));
		return element;
	}

	public static List<WebElement> selectTradeFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectTradeFromList));
		return listElement;
	}
	
	

	public static WebElement selectEnrollmentTypeField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentTypeField));
		return element;
	}

	public static List<WebElement> selectEnrollmentFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectEnrollmentFromList));
		return listElement;
	}

	public static WebElement sortOptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(sortOptionField));
		return element;
	}

	public static List<WebElement> selectsortOptionsFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectsortOptionsFromList));
		return listElement;
	}

	public static WebElement sortOrderField(WebDriver driver) {
		element = driver.findElement(By.xpath(sortOrderField));
		return element;
	}

	public static List<WebElement> selectSortOrderFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectSortOrderFromList));
		return listElement;
	}

	public static WebElement selectContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractValue));
		return element;
	}

	public static WebElement selectContractNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractNumber));
		return element;
	}

	public static WebElement btnSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSearch));
		return element;
	}

	public static WebElement myProjectListing(WebDriver driver) {
		element = driver.findElement(By.xpath(myProjectListing));
		return element;
	}

	public static WebElement mySubContractorListing(WebDriver driver) {
		element = driver.findElement(By.xpath(mySubContractorListing));
		return element;
	}

	public static WebElement selectPreviewPanelProjectDropdown(WebDriver driver,String projectName) {
		element = driver.findElement(By.xpath("//div[@id='accordionEx']/div[*]//h5[contains(text(),'"+projectName+"')]/../..//i[@class='fas fa-angle-down rotate-icon']"));
		return element;
	}

	public static WebElement btnRefresh(WebDriver driver) {
		element = driver.findElement(By.xpath(btnRefresh));
		return element;
	}

	public static WebElement selectEnrollmentTab(WebDriver driver, String tabname)// 'Enrollment'
	{ // ul[@class='list-enrolled']/li/a[contains(text(),'Enrollment')]/../a[2]
		element = driver
				.findElement(By.xpath("//ul[@class='list-enrolled']//*[contains(text(),'" + tabname + "')]/../a[2]"));
		return element;
	}
	
	
	//Raja -17-02-2020
	
	static String ContractorStatusDropDown ="//div[@class='advance-search']/div[1]/div[5]/div[1]/div/input";
	public static WebElement ContractorStatusDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorStatusDropDown));
		return element;
	}
	
	static String StatusListChkboxes="//ul[@id='select-options-b4caa9aa-e859-454b-a4ec-d3f60448e45b']/li/span";
	public static List<WebElement> StatusListChkboxes(WebDriver driver) {
		listElement = driver.findElements(By.xpath(StatusListChkboxes));
		return listElement;
	}
	
	public static WebElement SelectbyStatusName(WebDriver driver,String statusname) {
		
		element = driver.findElement(By.xpath("//ul/li//span[@class='filtrable'][normalize-space()='"+ statusname +"']"));
		return element;
	}


}
