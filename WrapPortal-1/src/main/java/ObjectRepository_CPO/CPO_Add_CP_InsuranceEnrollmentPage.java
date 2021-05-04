package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_InsuranceEnrollmentPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String cipAgreementBtnNext ="//input[@id='cntrlContractorAggreement_btnNext']";
	static String popUpCloneOKBtn ="//div[@class='ui-dialog-buttonset']//button[contains(text(),'OK')]";
	static String popUpCloneCancelBtn ="//div[@class='ui-dialog-buttonset']//button[contains(text(),'Cancel')]";
	
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
	// All Check box
	static String checkBoxClickHereIfLowerTierContractor_Subs = "//input[@id='ctrlInsuranceEnrollment_ChkContractorLowerTier']";
	static String checkBoxClickHereIfCompanyMinorityOwnedBusiness = "//input[@id='ctrlInsuranceEnrollment_chkMOB']";
	static String checkBoxClickHereIfCompanyLocalDisadvantagedBusinessEnterprise = "//input[@id='ctrlInsuranceEnrollment_chkLDBE']";
	static String checkBoxClickHereIfWorkInvolvesHandlingTransportingStoringHazardousChemicalsToxinsOrWaste = "//input[@id='ctrlInsuranceEnrollment_chkHazardous']";
	static String checkBoxClickHereIfWorkInvolvesRemovingAsbestosMaterials = "//input[@id='ctrlInsuranceEnrollment_chkAsbestos']";
	static String checkBoxDoesYourCompanyUtilizeEmployeeLeasingService = "//input[@id='ctrlInsuranceEnrollment_chkEmployeeLeasing']";
	static String commentsOrNotesSection = "//textarea[@id='ctrlInsuranceEnrollment_txtNote']";

	
	public static WebElement cipAgreementBtnNext(WebDriver driver) {
		element = driver.findElement(By.xpath(cipAgreementBtnNext));
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

	// workers compensation
	static String WC_InsuranceCompanyName = "//input[@id='token-input-ctrlInsuranceEnrollment_txt_WCCarrier']";
	static String WC_InsuranceCompanyNameRemoveIcon ="//div[@id='divAutomation']/ul/li/span[contains(text(),'×')]";
	static String WC_PolicyNumber = "//input[@id='ctrlInsuranceEnrollment_txtWCPolicyNumber']";
	static String WC_PolicyStartDate = "//input[@id='ctrlInsuranceEnrollment_WCstartdatetimepicker']";
	static String WC_PolicyExpirationDate = "//input[@id='ctrlInsuranceEnrollment_WCenddatetimepicker']";
	static String WC_BrokerName = "//input[@id='ctrlInsuranceEnrollment_txtWCAgentName']";
	static String WC_BrokerContactName = "//input[@id='ctrlInsuranceEnrollment_txtWCAgentContact']";
	static String WC_BrokerContactPhone = "//input[@id='ctrlInsuranceEnrollment_txtWCAgentPhone']";
	static String WC_BrokerEmail = "//input[@id='ctrlInsuranceEnrollment_txtWCAgentEmail']";
	static String WC_RatingBoardNumber = "//input[@id='ctrlInsuranceEnrollment_txtWCRateBoardNo']";
	static String WC_ExperianceRatingDate = "//input[@id='ctrlInsuranceEnrollment_WCexpratedatimepicker']";
	// general liability
	static String checkBoxForGLSameAsWorkerComp = "//input[@id='Checkbox5']";
	static String GL_InsuranceCompanyName = "//input[@id='token-input-ctrlInsuranceEnrollment_txt_GLPolicy']";
	static String GL_PolicyNumber = "//input[@id='ctrlInsuranceEnrollment_txtGLPolicyNumber']";
	static String GL_PolicyStartDate = "//input[@id='ctrlInsuranceEnrollment_txtGLPolicyStartDate']";
	static String GL_PolicyExpirationDate = "//input[@id='ctrlInsuranceEnrollment_txtGLPolicyExpirationDate']";
	static String GL_BrokerName = "//input[@id='ctrlInsuranceEnrollment_txtGLBrokerAgencyName']";
	static String GL_BrokerContactName = "//input[@id='ctrlInsuranceEnrollment_txtGLBrokerAgencyContactName']";
	static String GL_BrokerContactPhone = "//input[@id='ctrlInsuranceEnrollment_txtGLBrokerAgencyContactPhone']";
	static String GL_BrokerEmail = "//input[@id='ctrlInsuranceEnrollment_txtGLAgentEmail']";
	// umbrell liability
	static String checkBoxForUMBSameAsWorkerComp = "//input[@id='chkUEWC']";
	static String checkBoxForUMBSameAsGeneralLiability = "//input[@id='chkUEGL']";
	static String UMB_InsuranceCompanyName = "//input[@id='token-input-ctrlInsuranceEnrollment_txt_UMBPolicy']";
	static String UMB_PolicyNumber = "//input[@id='ctrlInsuranceEnrollment_txtUmbPolicyNumber']";
	static String UMB_PolicyStartDate = "//input[@id='ctrlInsuranceEnrollment_txtUmbPolicyStartDate']";
	static String UMB_PolicyExpirationDate = "//input[@id='ctrlInsuranceEnrollment_txtUmbPolicyExpirationDate']";
	static String UMB_BrokerName = "//input[@id='ctrlInsuranceEnrollment_txtUmbBrokerAgencyName']";
	static String UMB_BrokerContactName = "//input[@id='ctrlInsuranceEnrollment_txtUmbBrokerAgencyContactName']";
	static String UMB_BrokerContactPhone = "//input[@id='ctrlInsuranceEnrollment_txtUmbBrokerAgencyContactPhone']";
	static String UMB_BrokerEmail = "//input[@id='ctrlInsuranceEnrollment_txtUmbAgentEmail']";
	// automobile liability
	static String checkBoxForALameAsWorkerComp = "//input[@id='Radio1']";
	static String checkBoxForALSameAsGeneralLiability = "//input[@id='Radio2']";
	static String checkBoxForALSameAsUmbrella = "//input[@id='Radio3']";
	static String AL_InsuranceCompanyName = "//input[@id='token-input-ctrlInsuranceEnrollment_txt_AutoPolicy']";
	static String AL_PolicyNumber = "//input[@id='ctrlInsuranceEnrollment_txtALPolicyNumber']";
	static String AL_PolicyStartDate = "//input[@id='ctrlInsuranceEnrollment_txtALPolicyStartDate']";
	static String AL_PolicyExpirationDate = "//input[@id='ctrlInsuranceEnrollment_txtALPolicyExpirationDate']";
	static String AL_BrokerName = "//input[@id='ctrlInsuranceEnrollment_txtALBrokerAgencyName']";
	static String AL_BrokerContactName = "//input[@id='ctrlInsuranceEnrollment_txtALBrokerAgencyContactName']";
	static String AL_BrokerContactPhone = "//input[@id='ctrlInsuranceEnrollment_txtALBrokerAgencyContactPhone']";
	static String AL_BrokerEmail = "//input[@id='ctrlInsuranceEnrollment_txtALBrokerAgencyContactPhone']";

	
	public static WebElement WC_InsuranceCompanyNameRemoveIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_InsuranceCompanyNameRemoveIcon));
		return element;
	}
	public static WebElement WC_InsuranceCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_InsuranceCompanyName));
		return element;
	}

	public static WebElement WC_PolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_PolicyNumber));
		return element;
	}

	public static WebElement WC_PolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_PolicyStartDate));
		return element;
	}

	public static WebElement WC_PolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_PolicyExpirationDate));
		return element;
	}

	public static WebElement WC_BrokerName(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_BrokerName));
		return element;
	}

	public static WebElement WC_BrokerContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_BrokerContactName));
		return element;
	}

	public static WebElement WC_BrokerContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_BrokerContactPhone));
		return element;
	}

	public static WebElement WC_BrokerEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_BrokerEmail));
		return element;
	}

	public static WebElement WC_RatingBoardNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_RatingBoardNumber));
		return element;
	}

	public static WebElement WC_ExperianceRatingDate(WebDriver driver) {
		element = driver.findElement(By.xpath(WC_ExperianceRatingDate));
		return element;
	}

	public static WebElement checkBoxForGLSameAsWorkerComp(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForGLSameAsWorkerComp));
		return element;
	}

	public static WebElement GL_InsuranceCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_InsuranceCompanyName));
		return element;
	}

	public static WebElement GL_PolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_PolicyNumber));
		return element;
	}

	public static WebElement GL_PolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_PolicyStartDate));
		return element;
	}

	public static WebElement GL_PolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_PolicyExpirationDate));
		return element;
	}

	public static WebElement GL_BrokerName(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_BrokerName));
		return element;
	}

	public static WebElement GL_BrokerContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_BrokerContactName));
		return element;
	}

	public static WebElement GL_BrokerContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_BrokerContactPhone));
		return element;
	}

	public static WebElement GL_BrokerEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_BrokerEmail));
		return element;
	}

	public static WebElement checkBoxForUMBSameAsWorkerComp(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForUMBSameAsWorkerComp));
		return element;
	}

	public static WebElement checkBoxForUMBSameAsGeneralLiability(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForUMBSameAsGeneralLiability));
		return element;
	}

	public static WebElement UMB_InsuranceCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_InsuranceCompanyName));
		return element;
	}

	public static WebElement UMB_PolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_PolicyNumber));
		return element;
	}

	public static WebElement UMB_PolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_PolicyStartDate));
		return element;
	}

	public static WebElement UMB_PolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_PolicyExpirationDate));
		return element;
	}

	public static WebElement UMB_BrokerName(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_BrokerName));
		return element;
	}

	public static WebElement UMB_BrokerContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_BrokerContactName));
		return element;
	}

	public static WebElement UMB_BrokerContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_BrokerContactPhone));
		return element;
	}

	public static WebElement UMB_BrokerEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_BrokerEmail));
		return element;
	}

	public static WebElement checkBoxForALameAsWorkerComp(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForALameAsWorkerComp));
		return element;
	}

	public static WebElement checkBoxForALSameAsGeneralLiability(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForALSameAsGeneralLiability));
		return element;
	}

	public static WebElement checkBoxForALSameAsUmbrella(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxForALSameAsUmbrella));
		return element;
	}

	public static WebElement AL_InsuranceCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_InsuranceCompanyName));
		return element;
	}

	public static WebElement AL_PolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_PolicyNumber));
		return element;
	}

	public static WebElement AL_PolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_PolicyStartDate));
		return element;
	}

	public static WebElement AL_PolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_PolicyExpirationDate));
		return element;
	}

	public static WebElement AL_BrokerName(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_BrokerName));
		return element;
	}

	public static WebElement AL_BrokerContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_BrokerContactName));
		return element;
	}

	public static WebElement AL_BrokerContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_BrokerContactPhone));
		return element;
	}

	public static WebElement AL_BrokerEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(AL_BrokerEmail));
		return element;
	}

	// buttons
	static String btnClose = "//button[@id='ctrlInsuranceEnrollment_divClose']";
	static String btnSave = "//input[@value='Save']";
	static String btnSaveAndClose = "//input[@id='ctrlInsuranceEnrollment_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@id='ctrlInsuranceEnrollment_btnNext']";
	static String sendEmailBtnContinueWithoutSending = "//input[@id='btnNext']";
	
	public static WebElement sendEmailBtnContinueWithoutSending(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailBtnContinueWithoutSending));
		return element;
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
	
	//Alert 
	
	static String alertCVtoPayroll ="//button[@id='btnSaveModal' and contains(text(),'I Understand,')]";
	static String alertUncappedPayrolToWorkclassUncappedPayroll ="//button[@id='btnSaveModal' and contains(text(),'Continue')]";
	static String alertCappedPayrolToWorkclassCappedPayroll ="//button[@id='btnSaveModal' and contains(text(),'Continue')]";
	
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
	static String selectWorkClass = "//div[@id='ctrlInsuranceEnrollment_pnlWorkClassWC']/div[2]/div[2]/div[1]//div[contains(text(),'On')]/../div[2]";
			//div[@id='select2-drop-mask']";
	static String selectWorkClassSearchBox ="//input[@id='s2id_autogen1_search']";
	//static String selectWorkClassAutoCompleteTextField = "//input[@id='s2id_autogen1_search']";
	
	static String selectAllWorkClassFromAutoCompleteDropDown = "//div[@id='select2-drop']/ul/li[*]";// list
	static String fetchAllselectWorkClassFromDropdown = "//ul[@id='select2-results-1']/li[*]";// list
	static String addWorkClassWorkHoursField="//input[@id='ctrlInsuranceEnrollment_txtWCHours']";

	static String addWorkClassUnCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtWCPayroll']";
	
	static String addWorkClassCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtCapPayroll']";
	
	static String addWorkClassRateField="//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
			//"id="ctrlInsuranceEnrollment_txtWCRate";
			//"//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
	static String addWorkClassCloseBtn="//div[@id='ctrlInsuranceEnrollment_Div1']//div[@class='panel-body clearfix']/div[8]//button";
	
	static String addWorkClassAddWorkClassBtn="//input[@id='ctrlInsuranceEnrollment_btnAddWC']";
	
	static String editOrDeleteIconSelectedWorkClass = "//table[@id='tblWorkclass']/tbody/tr/td[@class='tableIcon centerAlign']/a[1]";
	static String fetchAllWorkClassList = "//table[@id='tblWorkclass']/tbody/tr[*]";// list
	static String WorkClassWorkersCompensationValue = "//input[@id='ctrlInsuranceEnrollment_TxtTotalWCPremium']";
	static String fetchAllEnrollmentComparisionValue = "//div[@class='col-md-12']//table[@class='table blueTable']/tbody/tr/td";// list
	static String radioBtnWCAndGLEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnOCIP']";
	static String radioBtnWCOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtWCOnly']";
	static String radioBtnGLOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnGLOnly']";
	static String radioBtnExcludedContractorEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnNoCIP']";
	
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
	
	

}
