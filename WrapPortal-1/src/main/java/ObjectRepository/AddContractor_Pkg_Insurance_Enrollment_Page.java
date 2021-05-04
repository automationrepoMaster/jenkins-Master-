package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Insurance_Enrollment_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String popUpCloneOKBtn ="//div[@class='ui-dialog-buttonset']//button[contains(text(),'OK')]";
	static String popUpCloneCancelBtn ="//div[@class='ui-dialog-buttonset']//button[contains(text(),'Cancel')]";
	static String InsuranceEnrollmentTab ="//a[contains(text(),'Insurance Enrollment')]";
	
	static String enrollContractorPkgAllTab ="//ul[@id='myTab']/li/a";//list
	
	public static List<WebElement >enrollContractorPkgAllTab(WebDriver driver) {
		listElement = driver.findElements(By.xpath(enrollContractorPkgAllTab));
		return listElement;
	}
	
	// Contractor Information tab xpaths
	static String fieldContractorName = "//input[@id='ctrlInsuranceEnrollment_txtContractorName']";
	static String selectContractorDBA = "//select[@id='ctrlInsuranceEnrollment_ddlContractorDBA']";
	static String fieldContractorLicense = "//input[@id='ctrlInsuranceEnrollment_txtContractorLicense']";
	static String fieldAddress1 = "//input[@id='ctrlInsuranceEnrollment_txtContractorAddress1']";
	static String fieldAddress2 = "//input[@id='ctrlInsuranceEnrollment_txtContractorAddress2']";
	static String fieldCity = "//input[@id='ctrlInsuranceEnrollment_txtCity']";
	static String selectState = "//select[@id='ctrlInsuranceEnrollment_ddlState']";
	static String fieldZipCode = "//input[@id='ctrlInsuranceEnrollment_txtZip']";
	static String fieldFederalIDNumber = "//input[@id='ctrlInsuranceEnrollment_txtFederalIDNumber']";
	static String selectLegalStatus = "//select[@id='ctrlInsuranceEnrollment_ddlLegalStatus']";
	static String fieldNCCIExperienceModifireRate = "//input[@id='ctrlInsuranceEnrollment_txtNcciExperienceModifierRate']";
	static String fieldNCCIExperienceModifireDate = "//input[@id='ctrlInsuranceEnrollment_txtNcciExperienceModifierDate']";
	static String fieldCIP_WC_PolicyNumber = "//input[@id='ctrlInsuranceEnrollment_txtOCIPId']";
	static String fieldLocationNumber ="//input[@id='ctrlInsuranceEnrollment_txtLocationCode']";
	
	// All Check box
	static String checkBoxClickHereIfLowerTierContractor_Subs = "//input[@id='ctrlInsuranceEnrollment_ChkContractorLowerTier']";
	static String checkBoxClickHereIfCompanyMinorityOwnedBusiness = "//input[@id='ctrlInsuranceEnrollment_chkMOB']";
	static String checkBoxClickHereIfCompanyLocalDisadvantagedBusinessEnterprise = "//input[@id='ctrlInsuranceEnrollment_chkLDBE']";
	static String checkBoxClickHereIfWorkInvolvesHandlingTransportingStoringHazardousChemicalsToxinsOrWaste = "//input[@id='ctrlInsuranceEnrollment_chkHazardous']";
	static String checkBoxClickHereIfWorkInvolvesRemovingAsbestosMaterials = "//input[@id='ctrlInsuranceEnrollment_chkAsbestos']";
	static String checkBoxDoesYourCompanyUtilizeEmployeeLeasingService = "//input[@id='ctrlInsuranceEnrollment_chkEmployeeLeasing']";
	static String commentsOrNotesSection = "//textarea[@id='ctrlInsuranceEnrollment_txtNote']";
	static String locationCodeDuplicateAlertOKBtn="//button[@class='btn btn-primary pull-right']";
	
	
	
	
	
	public static WebElement locationCodeDuplicateAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(locationCodeDuplicateAlertOKBtn));
		return element;
	}
	
	public static WebElement fieldLocationNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldLocationNumber));
		return element;
	}
	public static WebElement InsuranceEnrollmentTab(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentTab));
		return element;
	}
	public static WebElement popUpCloneOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(popUpCloneOKBtn));
		return element;
	}
	public static WebElement popUpCloneCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(popUpCloneCancelBtn));
		return element;
	}
	public static WebElement fieldContractorName(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldContractorName));
		return element;
	}

	public static WebElement selectContractorDBA(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorDBA));
		return element;
	}

	public static WebElement fieldContractorLicense(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldContractorLicense));
		return element;
	}

	public static WebElement fieldAddress1(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAddress1));
		return element;
	}

	public static WebElement fieldAddress2(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAddress2));
		return element;
	}

	public static WebElement fieldCity(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldCity));
		return element;
	}

	public static WebElement selectState(WebDriver driver) {
		element = driver.findElement(By.xpath(selectState));
		return element;
	}

	public static WebElement fieldZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldZipCode));
		return element;
	}

	public static WebElement fieldFederalIDNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldFederalIDNumber));
		return element;
	}

	public static WebElement selectLegalStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLegalStatus));
		return element;
	}

	public static WebElement fieldNCCIExperienceModifireRate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldNCCIExperienceModifireRate));
		return element;
	}

	public static WebElement fieldNCCIExperienceModifireDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldNCCIExperienceModifireDate));
		return element;
	}

	public static WebElement fieldCIP_WC_PolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldCIP_WC_PolicyNumber));
		return element;
	}

	public static WebElement checkBoxClickHereIfLowerTierContractor_Subs(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxClickHereIfLowerTierContractor_Subs));
		return element;
	}

	public static WebElement checkBoxClickHereIfCompanyMinorityOwnedBusiness(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxClickHereIfCompanyMinorityOwnedBusiness));
		return element;
	}

	public static WebElement checkBoxClickHereIfCompanyLocalDisadvantagedBusinessEnterprise(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxClickHereIfCompanyLocalDisadvantagedBusinessEnterprise));
		return element;
	}

	public static WebElement checkBoxClickHereIfWorkInvolvesHandlingTransportingStoringHazardousChemicalsToxinsOrWaste(
			WebDriver driver) {
		element = driver.findElement(
				By.xpath(checkBoxClickHereIfWorkInvolvesHandlingTransportingStoringHazardousChemicalsToxinsOrWaste));
		return element;
	}

	public static WebElement checkBoxClickHereIfWorkInvolvesRemovingAsbestosMaterials(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxClickHereIfWorkInvolvesRemovingAsbestosMaterials));
		return element;
	}

	public static WebElement checkBoxDoesYourCompanyUtilizeEmployeeLeasingService(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxDoesYourCompanyUtilizeEmployeeLeasingService));
		return element;
	}

	public static WebElement commentsOrNotesSection(WebDriver driver) {
		element = driver.findElement(By.xpath(commentsOrNotesSection));
		return element;
	}

	// Contact inforamtion
	static String contactInformationFirstName = "//input[@id='ctrlInsuranceEnrollment_txtFirstName0']";
	static String contactInformationLastName = "//input[@id='ctrlInsuranceEnrollment_txtLastName0']";
	static String contactInformationPhone = "//input[@id='ctrlInsuranceEnrollment_txtPhone0']";
	static String contactInformationEmail = "//input[@id='ctrlInsuranceEnrollment_txtEmail0']";
	static String contactInformationFax = "//input[@id='ctrlInsuranceEnrollment_txtFax0']";
	static String contactInformationSelectClaimContact = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl00_rptWorkSiteContactMulti_ctl00_ddlContact']";
	static String contactInformationSameAsAboveAllCheckBox = "//div[@id='ctrlInsuranceEnrollment_upWorkSiteContact']/div/div/div[1]/div/div[2]//span";// lsit
	// claim contact
	static String contactInformationClaimContactSameAsAboveCheckBox = "//span[contains(text(),'Claim Contact')]/../../div[2]//input[@type='checkbox']";
	static String contactInformationClaimContactClickHereToAddNewContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl00_rptWorkSiteContactMulti_ctl00_aContractorPackage']";
	static String contactInformationSelectClaimContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl00_rptWorkSiteContactMulti_ctl00_ddlContact']";
	static String contactInformationClickHereToAddAnotherClaimContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl00_lnkAddWkCT']";
	static String contactInformationSelectSecondClaimContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl00_rptWorkSiteContactMulti_ctl01_ddlContact']";
	// General Contractor
	static String contactInformationGeneralContractorSameAsAboveCheckBox = "//span[contains(text(),'General Contrator')]/../../div[2]//input[@type='checkbox']";
	static String contactInformationGeneralContractorClickHereToAddNewContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl01_rptWorkSiteContactMulti_ctl00_aContractorPackage']";
	static String contactInformationSelectGeneralContractorDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl01_rptWorkSiteContactMulti_ctl00_ddlContact']";
	static String contactInformationClickHereToAddAnotherGeneralContractorLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl01_lnkAddWkCT']";
	static String contactInformationSelectSecondGeneralContractorDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl01_rptWorkSiteContactMulti_ctl01_ddlContact']";
	// New Contact
	static String contactInformationNewContactSameAsAboveCheckBox = "//span[contains(text(),'New Contact')]/../../div[2]//input[@type='checkbox']";
	static String contactInformationNewContactClickHereToAddNewContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl02_rptWorkSiteContactMulti_ctl00_aContractorPackage']";
	static String contactInformationSelectNewContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl02_rptWorkSiteContactMulti_ctl00_ddlContact']";
	static String contactInformationClickHereToAddAnotherNewContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl02_lnkAddWkCT']";
	static String contactInformationSelectSecondNewContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl02_rptWorkSiteContactMulti_ctl01_ddlContact']";
	// Safety Contact
	static String contactInformationSafetyContactSameAsAboveCheckBox = "//span[contains(text(),'Safety Contact')]/../../div[2]//input[@type='checkbox']";
	static String contactInformationSafetyContactClickHereToAddNewContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl03_rptWorkSiteContactMulti_ctl00_aContractorPackage']";
	static String contactInformationSelectSafetyContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl03_rptWorkSiteContactMulti_ctl00_ddlContact']";
	static String contactInformationClickHereToAddAnotherSafetyContactLink = "//a[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl03_lnkAddWkCT']";
	static String contactInformationSelectSecondSafetyContactDropdown = "//select[@id='ctrlInsuranceEnrollment_rptWorkSiteContactNew_ctl03_rptWorkSiteContactMulti_ctl01_ddlContact']";

	public static WebElement contactInformationFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationFirstName));
		return element;
	}

	public static WebElement contactInformationLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationLastName));
		return element;
	}

	public static WebElement contactInformationPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationPhone));
		return element;
	}

	public static WebElement contactInformationEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationEmail));
		return element;
	}

	public static WebElement contactInformationFax(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationFax));
		return element;
	}

	public static WebElement contactInformationSelectClaimContact(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectClaimContact));
		return element;
	}

	public static WebElement contactInformationSameAsAboveAllCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSameAsAboveAllCheckBox));
		return element;
	}

	public static WebElement contactInformationClaimContactSameAsAboveCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClaimContactSameAsAboveCheckBox));
		return element;
	}

	public static WebElement contactInformationClaimContactClickHereToAddNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClaimContactClickHereToAddNewContactLink));
		return element;
	}

	public static WebElement contactInformationSelectClaimContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectClaimContactDropdown));
		return element;
	}

	public static WebElement contactInformationClickHereToAddAnotherClaimContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClickHereToAddAnotherClaimContactLink));
		return element;
	}

	public static WebElement contactInformationSelectSecondClaimContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectSecondClaimContactDropdown));
		return element;
	}

	public static WebElement contactInformationGeneralContractorSameAsAboveCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationGeneralContractorSameAsAboveCheckBox));
		return element;
	}

	public static WebElement contactInformationGeneralContractorClickHereToAddNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationGeneralContractorClickHereToAddNewContactLink));
		return element;
	}

	public static WebElement contactInformationSelectGeneralContractorDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectGeneralContractorDropdown));
		return element;
	}

	public static WebElement contactInformationClickHereToAddAnotherGeneralContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClickHereToAddAnotherGeneralContractorLink));
		return element;
	}

	public static WebElement contactInformationSelectSecondGeneralContractorDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectSecondGeneralContractorDropdown));
		return element;
	}

	public static WebElement contactInformationNewContactSameAsAboveCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationNewContactSameAsAboveCheckBox));
		return element;
	}

	public static WebElement contactInformationNewContactClickHereToAddNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationNewContactClickHereToAddNewContactLink));
		return element;
	}

	public static WebElement contactInformationSelectNewContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectNewContactDropdown));
		return element;
	}

	public static WebElement contactInformationClickHereToAddAnotherNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClickHereToAddAnotherNewContactLink));
		return element;
	}

	public static WebElement contactInformationSelectSecondNewContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectSecondNewContactDropdown));
		return element;
	}

	public static WebElement contactInformationSafetyContactSameAsAboveCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSafetyContactSameAsAboveCheckBox));
		return element;
	}

	public static WebElement contactInformationSafetyContactClickHereToAddNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSafetyContactClickHereToAddNewContactLink));
		return element;
	}

	public static WebElement contactInformationSelectSafetyContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectSafetyContactDropdown));
		return element;
	}

	public static WebElement contactInformationClickHereToAddAnotherSafetyContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationClickHereToAddAnotherSafetyContactLink));
		return element;
	}

	public static WebElement contactInformationSelectSecondSafetyContactDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contactInformationSelectSecondSafetyContactDropdown));
		return element;
	}

	

	// for Admin use only xpaths
	static String flagThisPageChechkBox = "//input[@id='ctrlInsuranceEnrollment_chkAction']";
	static String formSignedChechkBox = "//input[@id='ctrlInsuranceEnrollment_chkFormsSigned']";
	static String pendingReviewRadioBtn = "//input[@id='ctrlInsuranceEnrollment_rdoPendingReview']";
	static String markAsConfirmedRadioBtn = "//input[@id='ctrlInsuranceEnrollment_rdoConfirm']";
	static String markAsIncompleteRadioBtn = "//input[@id='ctrlInsuranceEnrollment_rdoMarkasComplete']";
	static String enrollmentDate = "//input[@id='ctrlInsuranceEnrollment_txtEnrollmentDate']";
	static String initialFollowupDate = "//input[@id='ctrlInsuranceEnrollment_txtInitFollowup']";
	static String secondFollowupDate = "//input[@id='ctrlInsuranceEnrollment_txtSecondFollowup']";
	static String thirdFollowupDate = "//input[@id='ctrlInsuranceEnrollment_txtThirdFollowup']";
	static String noticeToProceed = "//input[@id='ctrlInsuranceEnrollment_txtNoticeToProceed']";
	static String notesToAppearOnReportsTextArea = "//textarea[@id='ctrlInsuranceEnrollment_txtReasonForIncomplete']";
	static String actionNotesTextArea = "//textarea[@id='ctrlInsuranceEnrollment_txtActionNotes']";
	static String insuranceEnrollmentCreatedDate = "//span[@class='createddate']";
	static String insuranceEnrollmentModifyDate = "//span[@class='modifydate']";
	static String seeMoreModifyByDatesUpArrow = "//i[@class='fa fa-angle-up']";
	static String seeMoreModifyByDatesList = "//div[@id='divModified']/div";// list
	// buttons
	static String btnClose = "//button[@id='ctrlInsuranceEnrollment_divClose']";
	static String btnSave = "//input[@value='Save']";
	static String btnSaveAndClose = "//input[@id='ctrlInsuranceEnrollment_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@id='ctrlInsuranceEnrollment_btnNext']";
	
	static String sendEmailBtnContinueWithoutSending = "//input[@id='btnNext']";
	
	static String alertCoomman ="//button[@id='btnSaveModal']";
	static String alertCVtoPayroll ="//button[@id='btnSaveModal' and contains(text(),'I Understand,')]";
	static String alertUncappedPayrolToWorkclassUncappedPayroll ="//button[@id='btnSaveModal']";//button[@id='btnSaveModal' and contains(text(),'Continue')]";
	static String alertCappedPayrolToWorkclassCappedPayroll ="//button[@id='btnSaveModal']";//button[@id='btnSaveModal' and contains(text(),'Continue')]";
	
	public static WebElement alertCoomman(WebDriver driver) {
		element = driver.findElement(By.xpath(alertCoomman));
		return element;
	}
	public static WebElement alertCVtoPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(alertCVtoPayroll));
		return element;
	}public static WebElement alertUncappedPayrolToWorkclassUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(alertUncappedPayrolToWorkclassUncappedPayroll));
		return element;
	}public static WebElement alertCappedPayrolToWorkclassCappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(alertCappedPayrolToWorkclassCappedPayroll));
		return element;
	}
	
	public static WebElement sendEmailBtnContinueWithoutSending(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailBtnContinueWithoutSending));
		return element;
	}

	public static WebElement flagThisPageChechkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(flagThisPageChechkBox));
		return element;
	}

	public static WebElement formSignedChechkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(formSignedChechkBox));
		return element;
	}

	public static WebElement pendingReviewRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(pendingReviewRadioBtn));
		return element;
	}

	public static WebElement markAsConfirmedRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markAsConfirmedRadioBtn));
		return element;
	}

	public static WebElement markAsIncompleteRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markAsIncompleteRadioBtn));
		return element;
	}

	public static WebElement enrollmentDate(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmentDate));
		return element;
	}

	public static WebElement initialFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(initialFollowupDate));
		return element;
	}

	public static WebElement secondFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(secondFollowupDate));
		return element;
	}

	public static WebElement thirdFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(thirdFollowupDate));
		return element;
	}

	public static WebElement noticeToProceed(WebDriver driver) {
		element = driver.findElement(By.xpath(noticeToProceed));
		return element;
	}

	public static WebElement notesToAppearOnReportsTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(notesToAppearOnReportsTextArea));
		return element;
	}

	public static WebElement actionNotesTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(actionNotesTextArea));
		return element;
	}

	public static WebElement insuranceEnrollmentCreatedDate(WebDriver driver) {
		element = driver.findElement(By.xpath(insuranceEnrollmentCreatedDate));
		return element;
	}

	public static WebElement insuranceEnrollmentModifyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(insuranceEnrollmentModifyDate));
		return element;
	}

	public static WebElement seeMoreModifyByDatesUpArrow(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreModifyByDatesUpArrow));
		return element;
	}

	public static List<WebElement> seeMoreModifyByDatesList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(seeMoreModifyByDatesList));
		return listElement;
	}

	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}

	public static WebElement btnSave(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSave));
		return element;
	}

	public static WebElement btnSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndClose));
		return element;
	}

	public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}
	
	
	//Contract Details page
	
	//pop up for wc work class
	static String estimatedPayrollWorkClassPayrollAlertContinueBtn ="//button[@id='btnSaveModal']";
	// Contractor insurance cost
	static String fieldContractValue = "//input[@id='ctrlInsuranceEnrollment_txtContractPrice']";
	static String fieldSelfPerformedContractValue = "//input[@id='ctrlInsuranceEnrollment_txtSelfContractValue']";
	static String fieldEstimatedCappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtEstCapPayroll']";
	static String fieldEstimatedUncappedPayroll ="//input[@id='ctrlInsuranceEnrollment_txtPayrolls']";
	static String fieldEstimatedManHours = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String fieldEstimatedStartDate = "//input[@id='ctrlInsuranceEnrollment_txtStartDate']";
	static String fieldEstimatedCompletionDate = "//input[@id='ctrlInsuranceEnrollment_txtEndDate']";
	static String selectTypeOfContract = "//select[@id='ctrlInsuranceEnrollment_ddlFixedOrUnitPrice']";
	
	static String estimatedNoOfEmployees = "//input[@id='ctrlInsuranceEnrollment_txtEmployeesAtSite']";
	static String estimatedNoOfSubContractors ="//input[@id='ctrlInsuranceEnrollment_txtEstContractorsNumber']";
	// Briefly Describe the Scope of the Work
	static String redioBtnProgram = "//input[@id='ctrlInsuranceEnrollment_rdoProject']";
	static String redioBtnMaintenance = "//input[@id='ctrlInsuranceEnrollment_rdoMaintenance']";
	static String textAreaBrieflyDescribetheScopeWork = "//textarea[@id='ctrlInsuranceEnrollment_txtBrieflyDescribetheScopeWork']";
	
	// Worker's Compensation - Work Classes
	static String selectWorkClassHamburgericon = "//div[@id='ctrlInsurance_pnlWorkClassWC']/div/div/i[@class='icon20 i-menu-6']";
	static String selectWorkClass = "//div[@id='ctrlInsuranceEnrollment_pnlWorkClassWC']/div[2]/div[1]/div[2]//div[contains(text(),'On')]/../div[2]";
			//div[@id='select2-drop-mask']";
	static String selectWorkClassSearchBox ="//input[@id='s2id_autogen1_search']";
	//static String selectWorkClassAutoCompleteTextField = "//input[@id='s2id_autogen1_search']";
	
	static String selectAllWorkClassFromAutoCompleteDropDown = "//div[@id='select2-drop']/ul/li[*]";// list
	static String fetchAllselectWorkClassFromDropdown = "//ul[@id='select2-results-1']/li[*]";// list
	static String addWorkClassWorkHoursField="//input[@id='ctrlInsuranceEnrollment_txtWCHours']";
	static String addWorkClassUnCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtWCPayroll']";
	static String addWorkClassCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtCapPayroll']";
	
	static String cappedPayrollAlertOkBtn="//button[@id='btnYes']";
	
	
	static String addWorkClassRateField="//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
	static String addWorkClassCloseBtn="//div[@id='ctrlInsuranceEnrollment_Div1']//div[@class='panel-body clearfix']/div[8]//button";
	
	static String addWorkClassAddWorkClassBtn="//input[@id='ctrlInsuranceEnrollment_btnAddWC']";
	
	static String editOrDeleteIconSelectedWorkClass = "//table[@id='tblWorkclass']/tbody/tr/td[@class='tableIcon centerAlign']/a[1]";
	static String fetchAllWorkClassList = "//table[@id='tblWorkclass']/tbody/tr[*]";// list
	static String WorkClassWorkersCompensationValue = "//input[@id='ctrlInsuranceEnrollment_TxtTotalWCPremium']";

//Enrollment Comparison	
	static String fetchAllEnrollmentComparisionValue = "//div[@class='col-md-12']//table[@class='table blueTable']/tbody/tr/td";// list
	static String radioBtnWCAndGLEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnOCIP']";
	static String radioBtnWCOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtWCOnly']";
	static String radioBtnGLOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnGLOnly']";
	static String radioBtnExcludedContractorEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnNoCIP']";
	static String alertEnrollmentChangeConfirmationBtn ="//button[@id='btnYes']";
	
	
	public static WebElement cappedPayrollAlertOkBtn(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(cappedPayrollAlertOkBtn));
		return element;
	}
	public static WebElement alertEnrollmentChangeConfirmationBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(alertEnrollmentChangeConfirmationBtn));
		return element;
	}
	public static WebElement addWorkClassCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassCloseBtn));
		return element;
	}
	public static WebElement estimatedNoOfEmployees(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedNoOfEmployees));
		return element;
	}
	public static WebElement estimatedNoOfSubContractors(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedNoOfSubContractors));
		return element;
	}
	public static WebElement addWorkClassCappedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassCappedPayrollField));
		return element;
	}
	public static WebElement addWorkClassUnCappedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassUnCappedPayrollField));
		return element;
	}
	public static WebElement estimatedPayrollWorkClassPayrollAlertContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollWorkClassPayrollAlertContinueBtn));
		return element;
	}
	/*public static WebElement switchSubContractorPerformWorkOnSite(WebDriver driver) {
		element = driver.findElement(By.xpath(switchSubContractorPerformWorkOnSite));
		return element;
	}*/
	public static WebElement selectWorkClassHamburgericon(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClassHamburgericon));
		return element;
	}
	public static WebElement addWorkClassWorkHoursField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassWorkHoursField));
		return element;
	}public static WebElement fieldEstimatedCappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedCappedPayroll));
		return element;
	}public static WebElement addWorkClassRateField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassRateField));
		return element;
	}public static WebElement addWorkClassAddWorkClassBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassAddWorkClassBtn));
		return element;
	}
	
	
	public static WebElement selectWorkClassSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClassSearchBox));
		return element;
	}
	public static WebElement fieldContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldContractValue));
		return element;
	}

	public static WebElement fieldSelfPerformedContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldSelfPerformedContractValue));
		return element;
	}

	public static WebElement fieldEstimatedUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedUncappedPayroll));
		return element;
	}

	public static WebElement fieldEstimatedManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedManHours));
		return element;
	}

	public static WebElement fieldEstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedStartDate));
		return element;
	}

	public static WebElement fieldEstimatedCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedCompletionDate));
		return element;
	}

	public static WebElement selectTypeOfContract(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTypeOfContract));
		return element;
	}

	public static WebElement redioBtnProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(redioBtnProgram));
		return element;
	}

	public static WebElement redioBtnMaintenance(WebDriver driver) {
		element = driver.findElement(By.xpath(redioBtnMaintenance));
		return element;
	}

	public static WebElement textAreaBrieflyDescribetheScopeWork(WebDriver driver) {
		element = driver.findElement(By.xpath(textAreaBrieflyDescribetheScopeWork));
		return element;
	}

	public static WebElement selectWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClass));
		return element;
	}

	//	public static WebElement selectWorkClassAutoCompleteTextField(WebDriver driver) {
	//		element = driver.findElement(By.xpath(selectWorkClassAutoCompleteTextField));
	//		return element;
	//	}

	public static List<WebElement> selectAllWorkClassFromAutoCompleteDropDown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllWorkClassFromAutoCompleteDropDown));
		return listElement;
	}

	public static WebElement fetchAllselectWorkClassFromDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllselectWorkClassFromDropdown));
		return element;
	}

	public static WebElement editOrDeleteIconSelectedWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(editOrDeleteIconSelectedWorkClass));
		return element;
	}

	public static WebElement fetchAllWorkClassList(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllWorkClassList));
		return element;
	}

	public static WebElement WorkClassWorkersCompensationValue(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkClassWorkersCompensationValue));
		return element;
	}

	public static WebElement fetchAllEnrollmentComparisionValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllEnrollmentComparisionValue));
		return element;
	}

	public static WebElement radioBtnWCAndGLEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnWCAndGLEnrollment));
		return element;
	}

	public static WebElement radioBtnWCOnlyEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnWCOnlyEnrollment));
		return element;
	}

	public static WebElement radioBtnGLOnlyEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnGLOnlyEnrollment));
		return element;
	}

	public static WebElement radioBtnExcludedContractorEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnExcludedContractorEnrollment));
		return element;
	}
	
	//Raja
	
	static String PolicyOkBtn_Alert ="//button[@id='policybtnYes']";
	
	public static WebElement PolicyOkBtn_Alert(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyOkBtn_Alert));
		return element;
	}
	
}
