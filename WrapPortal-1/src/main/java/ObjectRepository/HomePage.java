package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	// WebDriver driver;
	private static WebElement element;
	private static List<WebElement> listElement;

	// All Home Page Objects Xpaths
	static String controlMenuHomeIcon = "//li[@id='ctl00_ctrlMenu_liHome']";
	static String controlMenuDashboard = "//li[@id='ctl00_ctrlMenu_liDashboard']";
	static String controlMenuOpenActionItem = "//li[@id='ctl00_ctrlMenu_liOpenActionItems']";
	static String controlMenuPreBidContractorPackage = "//li[@id='ctl00_ctrlMenu_liPreBidContracts']";
	static String controlMenuContractorPackage = "//li[@id='ctl00_ctrlMenu_liContracts']";
	static String controlMenuContractor = "//li[@id='ctl00_ctrlMenu_liUser']";
	static String controlMenuProgram = "//li[@id='ctl00_ctrlMenu_liProjects']";
	static String controlMenuProject = "//li[@id='ctl00_ctrlMenu_liWorksites']";
	static String controlMenuLossControl = "//li[@id='ctl00_ctrlMenu_liLossControl']";
	static String controlMenuClaimsDashboard = "//li[@id='ctl00_ctrlMenu_liClaim']";
	static String controlMenuClaims = "//li[@id='ctl00_ctrlMenu_liClaim']//li[1]//a[1]";
	static String controlMenuInbox = "//li[@id='ctl00_ctrlMenu_liInbox']";
	static String controlMenuFax = "//li[@id='ctl00_ctrlMenu_liFax']";
	static String controlMenuNote = "//li[@id='ctl00_ctrlMenu_liNote']";
	static String controlMenuDocuments = "//li[@id='ctl00_ctrlMenu_liDocument']";
	static String controlMenuTask = "//li[@id='ctl00_ctrlMenu_liTask']";
	static String controlMenuCalender = "//li[@id='ctl00_ctrlMenu_liCalendar']";
	static String controlMenuReports = "//li[@id='ctl00_ctrlMenu_liReports']";

	static String HomeMenuSponsors = "//span[@id='ctl00_ContentPlaceHolder1_spnOwner']";
	static String HomeMenuPrograms = "//span[@id='ctl00_ContentPlaceHolder1_spnProject']";
	static String HomeMenuProjects = "//span[@id='ctl00_ContentPlaceHolder1_spnWorksite']";
	static String HomeMenuContractors = "//span[@id='ctl00_ContentPlaceHolder1_spnContractor']";
	static String HomeMenuHelp = "//label[contains(text(),'Help')]/..";
	static String HomeMenuSettings = "//label[contains(text(),'Settings')]/..";
	static String HomeMenuDistrict = "//span[@id='ctl00_ContentPlaceHolder1_spnDistrict']";
	static String HomeMenuContractorPackage = "//label[contains(text(),'Contractor Packages')]/..";
	static String HomeMenuInsuranceEnrollment = "//label[contains(text(),'Insurance Enrollment')]/..";
	static String HomeMenuContractDetails = "//label[contains(text(),'Contract Details')]/..";
	static String HomeMenuDocuments = "//span[@id='ctl00_ContentPlaceHolder1_spnDocuments2']";
	static String HomeMenuCertificates = "//label[contains(text(),'Certificates')]/..";
	static String HomeMenuPayroll = "//label[contains(text(),'Payroll')]/..";
	static String HomeMenuChangeOrders = "//label[contains(text(),'Change Orders')]/..";
	static String HomeMenuClaims = "//label[contains(text(),'Claims')]/..";
	static String HomeMenuLossControl = "//label[contains(text(),'Loss Control')]/..";
	static String HomeMenuCompletionNotice = "//span[@id='ctl00_ContentPlaceHolder1_spnCN']";
	static String HomeMenuReports = "//label[contains(text(),'Reports')]/..";
	static String HomeMenuTrade = "//a[@id='ctl00_ContentPlaceHolder1_aTrade']";
	static String HomeMenuWorkClass = "//a[@id='ctl00_ContentPlaceHolder1_aWorkClass']";
	static String HomeMenuComplianceCategories = "//span[@id='ctl00_ContentPlaceHolder1_spnCC']";
	static String HomeMenuTask = "//span[@id='ctl00_ContentPlaceHolder1_spnTasks']";
	static String HomeMenuNotes = "//span[@id='ctl00_ContentPlaceHolder1_spnNotes']";
	static String HomeMenuColorCategories = "//span[@id='ctl00_ContentPlaceHolder1_spnColor']";
	static String HomeMenuEmails ="//a[@id='ctl00_ContentPlaceHolder1_aEmails']//img";
	static String HomeMenuFaxes ="//a[@id='ctl00_ContentPlaceHolder1_aFaxs']";

//	static String HomeMenuProfileIcon = "//img[@id='ctl00_ctrlHeader_imgAvatars']";
//	static String HomeMenuLogoutBtn = "//a[text()='Logout']";
	
	static String HomePageAllToolTips ="//*[@data-original-title]";
	
	public static List<WebElement> HomePageAllToolTips(WebDriver driver) {
		listElement = driver.findElements(By.xpath(HomePageAllToolTips));
		return listElement;
	}
	
	public static WebElement HomeMenuFaxes(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuFaxes));
		return element;
	}
	public static WebElement HomeMenuEmails(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuEmails));
		return element;
	}
	
	public static WebElement controlMenuHomeIcon(WebDriver driver)// left side
																	// Home icon
	{
		element = driver.findElement(By.xpath(controlMenuHomeIcon));
		return element;
	}

	public static WebElement controlMenuDashboard(WebDriver driver)// left side
																	// Dashboard
																	// icon
	{
		element = driver.findElement(By.xpath(controlMenuDashboard));
		return element;
	}

	public static WebElement controlMenuOpenActionItem(WebDriver driver)// left
																		// side
																		// Open
																		// Action
																		// Item
																		// icon
	{
		element = driver.findElement(By.xpath(controlMenuOpenActionItem));
		return element;
	}

	public static WebElement controlMenuPreBidContractorPackage(WebDriver driver)// left
																					// side
																					// Open
																					// Action
																					// Item
																					// icon
	{
		element = driver.findElement(By.xpath(controlMenuPreBidContractorPackage));
		return element;
	}

	public static WebElement controlMenuContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuContractorPackage));
		return element;
	}

	public static WebElement controlMenuContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuContractor));
		return element;
	}

	public static WebElement controlMenuProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuProgram));
		return element;
	}

	public static WebElement controlMenuProject(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuProject));
		return element;
	}

	public static WebElement controlMenuLossControl(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuLossControl));
		return element;
	}

	public static WebElement controlMenuClaimsDashboard(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuClaimsDashboard));
		return element;
	}

	public static WebElement controlMenuClaims(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuClaims));
		return element;
	}

	public static WebElement controlMenuInbox(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuInbox));
		return element;
	}

	public static WebElement controlMenuFax(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuFax));
		return element;
	}

	public static WebElement controlMenuNote(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuNote));
		return element;
	}

	public static WebElement controlMenuDocuments(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuDocuments));
		return element;
	}

	public static WebElement controlMenuTask(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuTask));
		return element;
	}

	public static WebElement controlMenuCalender(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuCalender));
		return element;
	}

	public static WebElement controlMenuReports(WebDriver driver) {
		element = driver.findElement(By.xpath(controlMenuReports));
		return element;
	}

	public static WebElement HomeMenuSponsors(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuSponsors));
		return element;
	}

	public static WebElement HomeMenuPrograms(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuPrograms));
		return element;
	}

	public static WebElement HomeMenuProjects(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuProjects));
		return element;
	}

	public static WebElement HomeMenuContractors(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuContractors));
		return element;
	}

	public static WebElement HomeMenuHelp(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuHelp));
		return element;
	}

	public static WebElement HomeMenuSettings(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuSettings));
		return element;
	}

	public static WebElement HomeMenuDistrict(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuDistrict));
		return element;
	}

	public static WebElement HomeMenuContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuContractorPackage));
		return element;
	}

	public static WebElement HomeMenuInsuranceEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuInsuranceEnrollment));
		return element;
	}

	public static WebElement HomeMenuContractDetails(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuContractDetails));
		return element;
	}

	public static WebElement HomeMenuDocuments(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuDocuments));
		return element;
	}

	public static WebElement HomeMenuPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuPayroll));
		return element;
	}

	public static WebElement HomeMenuCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuCertificates));
		return element;
	}

	public static WebElement HomeMenuChangeOrders(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuChangeOrders));
		return element;
	}

	public static WebElement HomeMenuClaims(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuClaims));
		return element;
	}

	public static WebElement HomeMenuLossControl(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuLossControl));
		return element;
	}

	public static WebElement HomeMenuCompletionNotice(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuCompletionNotice));
		return element;
	}

	public static WebElement HomeMenuReports(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuReports));
		return element;
	}

	public static WebElement HomeMenuWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuWorkClass));
		return element;
	}

	public static WebElement HomeMenuTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuTrade));
		return element;
	}

	public static WebElement HomeMenuComplianceCategories(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuComplianceCategories));
		return element;
	}

	public static WebElement HomeMenuTask(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuTask));
		return element;
	}

	public static WebElement HomeMenuNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuNotes));
		return element;
	}

	public static WebElement HomeMenuColorCategories(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeMenuColorCategories));
		return element;
	}

}
