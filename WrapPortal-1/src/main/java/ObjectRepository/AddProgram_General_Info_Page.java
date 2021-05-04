package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_General_Info_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String programName = "//input[@id='txtProjectName']";
	static String programCode = "//input[@id='txtProjectCode']";
	static String selectPolicyType = "//select[@id='ddlProjectType']";
	static String selectProgramType = "//select[@id='ddlCIPType']";
	static String selectProgramAdministrator = "//select[@id='ddlNodeAdministrator']";
	static String selectProgramSponsor = "//select[@id='ddlOwner']";
	// Staus switches xpaths
	// select all switch at time
	static String selectAllswitches = "//ul[@class='iosListing']/li[@style='display: block' or @style='display: block;' ]//div[@class='inner']";
	static String selectAllStatusSwitch = "//ul[@class='iosListing']/li[position()>1 and position()!=15]//*[@class='inner']";
	// "//ul[@class='iosListing']/li[@style='display: block' or @style='display:
	// block;' or @style='display: none;' ]//div[@class='inner']";
	// "//ul[@class='iosListing']/li//div[@class='inner']";//list
	static String switchStatus = "//div[@id='uniform-chkStatus']//div[@class='inner']";
	// "//div[@id='uniform-chkStatus']//span";
	// "//div[@id='uniform-chkTrackOffsiteCoverage']//div[@class='inner']/../../input";
	// "//div[@id='uniform-chkStatus']//div[@class='inner']/../..";
	// "//div[@id='uniform-chkStatus']//div[@class='inner']";//work for on and
	// off but not for pre confirmation
	// "//ul[@class='iosListing']//li[1]//input[@id='chkStatus']";
	// "//div[@id='uniform-chkStatus']//div[@class='ios-ui-select checked']";
	static String switchTrackOffsiteCoverage = "//div[@id='uniform-chkTrackOffsiteCoverage']//div[@class='inner']";
	// "//input[@id='chkTrackOffsiteCoverage']";
	static String switchTrackOffsitePolicyLimits = "//div[@id='uniform-chkIsCertificateTracking']//div[@class='ios-ui-select checked']";
	static String switchManageOCIPCertificates = "//div[@id='uniform-chkManageOCIPCertificates']//div[@class='ios-ui-select checked']";
	static String switchTrackLossControlAndSafety = "//div[@id='uniform-chkTrackSafetyLimits']//div[@class='ios-ui-select checked']";
	static String switchTrackDeductCredit = "//div[@id='uniform-chkTrackDeduct']//div[@class='ios-ui-select checked']";
	static String switchAllowNegotiatedCreditDeduct = "//div[@id='uniform-chkAllowNegotiatedDeduct']//div[@class='ios-ui-select checked']";
	static String switchTrackExcludedContractor = "//div[@id='uniform-chkTrackExcludedContractor']//div[@class='ios-ui-select checked']";
	static String switchTrackFixedCostTimeAndMaterial = "//div[@id='uniform-chkShowFixedCostandUnitPrice']//div[@class='ios-ui-select checked']";
	static String switchTrackRateAndFees = "//div[@id='uniform-chkRatesandFees']//div[@class='ios-ui-select']";
	static String switchGLDedSIRLossCharge = "//div[@id='uniform-chkGLLossCharge']//div[@class='ios-ui-select']";
	static String switchMaintenanceWrap = "//div[@id='uniform-chkIsProjectOrMaintenance']//div[@class='ios-ui-select']";
	static String switchTrackCapUnCapPayroll = "//div[@id='uniform-chkCapUnCapPayroll']//div[@class='ios-ui-select']";

	// program information
	static String contactName = "//input[@id='txtContactName']";
	static String emailAddress = "//input[@id='txtEmailAddress']";
	static String telephoneNumber = "//input[@id='txtTelephoneNumber']";
	static String faxnumber = "//input[@id='txtFaxNumber']";
	static String selectBidType = "//select[@id='ddlBidType']";// list
	static String estimatedProgramConstructionValue = "//input[@id='txtEstimatedProjectValue']";
	static String programBeginDate = "//input[@id='txtProjectBeginDate']";
	static String programCompletionDate = "//input[@id='txtProjectCompletionDate']";
	static String programProjectedLosses = "//input[@id='txtProjectProjectedLosses']";
	static String totalprogramDeduct = "//input[@id='txtTotalProjectDeduct']";
	static String estimatedPayroll = "//input[@id='txtProjectEstimatedPayroll']";
	static String estimatedHours = "//input[@id='txtProjectEstimatedHours']";
	static String programMinimumRate = "//input[@id='txtProjectMinimumRate']";
	static String programMaximumRate = "//input[@id='txtProjectMaximumRate']";
	static String noteSection = "//textarea[@id='txtNote']";
	static String closeButton = "//button[@class='btn']";
	static String saveButton = "//input[@value='Save']";
	// "//input[@id='btnSaveGeneralInformation']";
	static String saveAndCloseButton = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String inviteEmailToSponsorButton = "//input[@id='btnInviteOwner']";
	static String saveAndContinueButton = "//input[@id='btnNextGeneralInfomation']";

	public static List<WebElement> selectAllStatusSwitch(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllStatusSwitch));
		return listElement;
	}

	public static List<WebElement> selectAllswitches(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllswitches));
		return listElement;
	}

	public static WebElement programName(WebDriver driver) {
		element = driver.findElement(By.xpath(programName));
		return element;
	}

	public static WebElement programCode(WebDriver driver) {
		element = driver.findElement(By.xpath(programCode));
		return element;
	}

	public static WebElement selectPolicyType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPolicyType));
		return element;
	}

	public static WebElement selectProgramType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramType));
		return element;
	}

	public static WebElement selectProgramAdministrator(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramAdministrator));
		return element;
	}

	public static WebElement selectProgramSponsor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramSponsor));
		return element;
	}

	public static WebElement switchStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(switchStatus));
		return element;
	}

	public static WebElement switchTrackOffsiteCoverage(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackOffsiteCoverage));
		return element;
	}

	public static WebElement switchTrackOffsitePolicyLimits(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackOffsitePolicyLimits));
		return element;
	}

	public static WebElement switchManageOCIPCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(switchManageOCIPCertificates));
		return element;
	}

	public static WebElement switchTrackLossControlAndSafety(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackLossControlAndSafety));
		return element;
	}

	public static WebElement switchTrackDeductCredit(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackDeductCredit));
		return element;
	}

	public static WebElement switchAllowNegotiatedCreditDeduct(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllowNegotiatedCreditDeduct));
		return element;
	}

	public static WebElement switchTrackExcludedContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackExcludedContractor));
		return element;
	}

	public static WebElement switchTrackFixedCostTimeAndMaterial(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackFixedCostTimeAndMaterial));
		return element;
	}

	public static WebElement switchTrackRateAndFees(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackRateAndFees));
		return element;
	}

	public static WebElement switchGLDedSIRLossCharge(WebDriver driver) {
		element = driver.findElement(By.xpath(switchGLDedSIRLossCharge));
		return element;
	}

	public static WebElement switchMaintenanceWrap(WebDriver driver) {
		element = driver.findElement(By.xpath(switchMaintenanceWrap));
		return element;
	}

	public static WebElement switchTrackCapUnCapPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackCapUnCapPayroll));
		return element;
	}

	public static WebElement contactName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactName));
		return element;
	}

	public static WebElement emailAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(emailAddress));
		return element;
	}

	public static WebElement telephoneNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(telephoneNumber));
		return element;
	}

	public static WebElement faxnumber(WebDriver driver) {
		element = driver.findElement(By.xpath(faxnumber));
		return element;
	}

	public static WebElement selectBidType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectBidType));
		return element;
	}

	public static WebElement estimatedProgramConstructionValue(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedProgramConstructionValue));
		return element;
	}

	public static WebElement programBeginDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programBeginDate));
		return element;
	}

	public static WebElement programCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programCompletionDate));
		return element;
	}

	public static WebElement programProjectedLosses(WebDriver driver) {
		element = driver.findElement(By.xpath(programProjectedLosses));
		return element;
	}

	public static WebElement totalprogramDeduct(WebDriver driver) {
		element = driver.findElement(By.xpath(totalprogramDeduct));
		return element;
	}

	public static WebElement estimatedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayroll));
		return element;
	}

	public static WebElement estimatedHours(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedHours));
		return element;
	}

	public static WebElement programMinimumRate(WebDriver driver) {
		element = driver.findElement(By.xpath(programMinimumRate));
		return element;
	}

	public static WebElement programMaximumRate(WebDriver driver) {
		element = driver.findElement(By.xpath(programMaximumRate));
		return element;
	}

	public static WebElement noteSection(WebDriver driver) {
		element = driver.findElement(By.xpath(noteSection));
		return element;
	}

	public static WebElement closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButton));
		return element;
	}

	public static WebElement saveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveButton));
		return element;
	}

	public static WebElement saveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseButton));
		return element;
	}

	public static WebElement inviteEmailToSponsorButton(WebDriver driver) {
		element = driver.findElement(By.xpath(inviteEmailToSponsorButton));
		return element;
	}

	public static WebElement saveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueButton));
		return element;
	}

// All tool tip xpath and methods
	static String programCodeToolTip = "//span[@id='lblProjectCode']/../i";
	static String allStatusToolTip = "//i[@oldtitle]";// returns all tool tip
														// object which is
														// present on dom
	// "//ul[@class='iosListing']/li//*[@class='titles']/i";//list
	static String trackOffsitePolicyLimitsToolTip1 = "//div[@id='qtip-20-content']//div[@class='row']//div[@class='centerAlign' or @class='col-md-4 centerAlign pad-top20']";
	static String programMinimumRateToolTip = "//i[@id='iconProjectMinimumRate']";
	static String programMaximumRateToolTip = "//i[@id='iconProjectMaximumRate']";

	public static WebElement programCodeToolTip(WebDriver driver) {
		element = driver.findElement(By.xpath(programCodeToolTip));
		return element;
	}
	public static List<WebElement> allStatusToolTip(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allStatusToolTip));
		return listElement;
	}
	public static WebElement trackOffsitePolicyLimitsToolTip1(WebDriver driver) {
		element = driver.findElement(By.xpath(trackOffsitePolicyLimitsToolTip1));
		return element;
	}
	public static WebElement programMinimumRateToolTip(WebDriver driver) {
		element = driver.findElement(By.xpath(programMinimumRateToolTip));
		return element;
	}
	public static WebElement programMaximumRateToolTip(WebDriver driver) {
		element = driver.findElement(By.xpath(programMaximumRateToolTip));
		return element;
	}

	
//add new administrator hyper link - 23/07/2020
	static String addNewNodeAdministratorLink = "//a[contains(text(),'click here to add Node Administrator.)')]";
	static String contractorCompanyNameField = "//input[@id='token-input-txtSubCompanyName']";
	static String contactFirstName = "//input[@id='txtSubContratorFirstName']";
	static String contactLastName = "//input[@id='txtSubContractorLastName']";
	static String contactEmail = "//input[@id='txtSubContractorEmail']";
	static String contactCellPhone = "//input[@id='txtSubContractorPhone']";
	static String MoreButton = "//a[@id='divAdvance']";
	static String jobTitle = "//input[@id='txtJobTitle']";
	static String businessPhone = "//input[@id='txtBusinessPhone']";
	static String businessFax = "//input[@id='txtBusinessFax']";
	static String addAdministratorSaveAndCloseButton = "//button[@class='btn btn-success']";	
	
	public static WebElement addNewNodeAdministratorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewNodeAdministratorLink));
		return element;
	}public static WebElement contractorCompanyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorCompanyNameField));
		return element;
	}public static WebElement contactFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactFirstName));
		return element;
	}public static WebElement contactLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactLastName));
		return element;
	}public static WebElement contactEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(contactEmail));
		return element;
	}public static WebElement contactCellPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(contactCellPhone));
		return element;
	}public static WebElement MoreButton(WebDriver driver) {
		element = driver.findElement(By.xpath(MoreButton));
		return element;
	}public static WebElement jobTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(jobTitle));
		return element;
	}public static WebElement businessPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(businessPhone));
		return element;
	}public static WebElement businessFax(WebDriver driver) {
		element = driver.findElement(By.xpath(businessFax));
		return element;
	}public static WebElement addAdministratorSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdministratorSaveAndCloseButton));
		return element;
	}
	
//add sponsor hyperlink
	static String addNewSponsorLink ="//div[@id='divAddOwner']//a[@class='alinkText'][contains(text(),'click here to add')]";
	static String uploadLogo ="//img[@id='imgProjectLogo']";
	
	public static WebElement addNewSponsorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewSponsorLink));
		return element;
	}
	public static WebElement uploadLogo(WebDriver driver) {
		element = driver.findElement(By.xpath(uploadLogo));
		return element;
	}
	
	
	
	
	
	
	
}
