package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Policy_Certificates_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String btnOpenPolicy = "//a[@id='aGLEidt']";
	static String policyAndCertificateTabCloseBtn = "//button[@class='btn']";
	static String policyAndCertificateTabBackBtn = "//input[@value='Back']";
	static String policyAndCertificateTabPreviewCertificateBtn = "//a[contains(text(),'Preview Certificate')]";
	static String policyAndCertificateTabSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String policyAndCertificateTabSaveAndContinueBtn = "//input[@value='Save and Continue']";

	public static WebElement btnOpenPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(btnOpenPolicy));
		return element;
	}

	public static WebElement policyAndCertificateTabCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(policyAndCertificateTabCloseBtn));
		return element;
	}

	public static WebElement policyAndCertificateTabBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(policyAndCertificateTabBackBtn));
		return element;
	}

	public static WebElement policyAndCertificateTabPreviewCertificateBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(policyAndCertificateTabPreviewCertificateBtn));
		return element;
	}

	public static WebElement policyAndCertificateTabSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(policyAndCertificateTabSaveAndCloseBtn));
		return element;
	}

	public static WebElement policyAndCertificateTabSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(policyAndCertificateTabSaveAndContinueBtn));
		return element;
	}

	// Renewal Policy
	static String btnRenewalPolicy = "//a[@id='aStartRenew']";
	static String selectPolicyTypeToRenew ="//ul[@class='checkBoxListing']/li/div[2 and contains(text(),'Excess/Umbrella Liability Layer Layer: 2')]/../div[1]//input";
	static String renewPolicySaveAndContinueButton ="//input[@id='ctrlRenewalPolicy_btnSaveandContinue']";
	static String GL_RenewPolicySaveAndContinueButton ="//input[@type='submit' and @value='Save and Continue']";
	public static WebElement GL_RenewPolicySaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_RenewPolicySaveAndContinueButton));
		return element;
	}
	public static WebElement selectPolicyTypeToRenew(WebDriver driver,String renewPolicyName) {
		element = driver.findElement(By.xpath("//ul[@class='checkBoxListing']/li/div[2 and contains(text(),'"+renewPolicyName+"')]/../div[1]//input"));
		return element;
	}public static WebElement renewPolicySaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(renewPolicySaveAndContinueButton));
		return element;
	}
	

	static String renewalPolicyRadioBtnStartOver = "//input[@id='rdbStartOver']";
	static String renewalPolicyRadioBtnContinue = "//input[@id='rdbContinue']";
	static String renewalPolicySaveAndContinueBtn = "//input[@id='btnSaveandContinue']";
	static String renewalPolicyCloseBtn = "//button[@class='btn']";
	static String selectPolicyForRenewal = "//div[@class='col-md-6 col-sm-8 col-xs-10 col-md-offset-3 col-sm-offset-2 col-xs-offset-1']/ul/li[*]//input[@type='checkbox']";// list
	
	static String selectAllContractorPackageForRenewalCheckBox = "//input[@id='chkSelectAll']";
	static String selectContractorPackageForRenewalCheckBox = "//ul[@id='divNoteList']/li[*]//input[@type='checkbox']";// list
	static String selectContractorPackageRenewalCloseBtn = "//button[@class='btn']";
	static String selectContractorPackageRenewalBackBtn = "//input[@id='btnBackList']";
	static String selectContractorPackageRenewalSaveAndContinueBtn = "//input[@id='btnSaveAndContinue']";
	
	static String newPolicyNumberCloseBtn = "//input[@id='btnClose']";
	static String newPolicyNumberBackBtn = "//input[@value='Back']";
	
	static String newPolicyNumberGenerateCertificatesandCloseBtn = "//input[@value='Generate Certificates and Close']";
	static String newPolicyNumberGenerateCertificatesSendEmailBtn = "//input[@value='Generate Certificates and Send Email']";
	
	static String newPolicyNumberGenerateCertificatesSendEmailToTextField = "//input[@id='token-input-txt_ToEmail']";
	static String newPolicyNumberGenerateCertificatesSendEmailCCTextField = "//input[@id='token-input-txt_CCEmail']";
	static String newPolicyNumberGenerateCertificatesSendEmailBCCTextField = "//input[@id='token-input-txt_BCCEmail']";
	static String newPolicyNumberGenerateCertificatesSendEmailCloseBtn = "//input[@id='btnClose']";
	static String newPolicyNumberGenerateCertificatesSendEmailBackBtn = "//input[@value='Back']";
	static String newPolicyNumberGenerateCertificatesSendEmailPreviewBtn = "//input[@value='Preview']";
	static String newPolicyNumberGenerateCertificatesSendEmailSendBtn = "//input[@value='Send']";
	static String newPolicyNumberGenerateCertificatesSendEmailSendBtn_OK_Alert ="//button[@id='btnSaveModal']";
	
	public static WebElement newPolicyNumberGenerateCertificatesSendEmailSendBtn_OK_Alert(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailSendBtn_OK_Alert));
		return element;
	}
	
	public static WebElement btnRenewalPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(btnRenewalPolicy));
		return element;
	}

	public static WebElement renewalPolicyRadioBtnStartOver(WebDriver driver) {
		element = driver.findElement(By.xpath(renewalPolicyRadioBtnStartOver));
		return element;
	}

	public static WebElement renewalPolicyRadioBtnContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(renewalPolicyRadioBtnContinue));
		return element;
	}

	public static WebElement renewalPolicySaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(renewalPolicySaveAndContinueBtn));
		return element;
	}

	public static WebElement renewalPolicyCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(renewalPolicyCloseBtn));
		return element;
	}

	public static List<WebElement> selectPolicyForRenewal(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectPolicyForRenewal));
		return listElement;
	}

	public static WebElement selectAllContractorPackageForRenewalCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAllContractorPackageForRenewalCheckBox));
		return element;
	}

	public static WebElement selectContractorPackageForRenewalCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPackageForRenewalCheckBox));
		return element;
	}

	public static WebElement selectContractorPackageRenewalCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPackageRenewalCloseBtn));
		return element;
	}

	public static WebElement selectContractorPackageRenewalBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPackageRenewalBackBtn));
		return element;
	}

	public static WebElement selectContractorPackageRenewalSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPackageRenewalSaveAndContinueBtn));
		return element;
	}

	public static WebElement newPolicyNumberCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberCloseBtn));
		return element;
	}

	public static WebElement newPolicyNumberBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberBackBtn));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesandCloseBtn));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailBtn));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailToTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailToTextField));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailCCTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailCCTextField));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailBCCTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailBCCTextField));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailCloseBtn));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailPreviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailPreviewBtn));
		return element;
	}

	public static WebElement newPolicyNumberGenerateCertificatesSendEmailSendBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(newPolicyNumberGenerateCertificatesSendEmailSendBtn));
		return element;
	}

	// Add GL Policy
	static String addGLPolicySelectCarrier = "//select[@id='ctrlGLPolicy_ddlCarrier']";// list
	static String addGLPolicyRadioBtnClaimsMade = "//input[@id='ctrlGLPolicy_rdoClaimsMade']";
	static String addGLPolicyRadioBtnOccur = "//input[@id='ctrlGLPolicy_rdoOccur']";
	static String addGLPolicyRadioBtnDeductible = "//input[@id='ctrlGLPolicy_rbDeductable']";
	static String addGLPolicyRadioBtnRetention = "//input[@id='ctrlGLPolicy_rbRetention']";
	static String addGLPolicyFieldRetentionEditBox = "//input[@id='ctrlGLPolicy_txtDeductableRetention']";
	static String addGLPolicyRadioBtnPolicy = "//input[@id='ctrlGLPolicy_rdoPolicy']";
	static String addGLPolicyRadioBtnProject = "//input[@id='ctrlGLPolicy_rdoProject']";
	static String addGLPolicyRadioBtnLocation = "static String radioBtnPolicy=";
	static String addGLPolicyRadioBtnMasterPolicy = "//input[@id='ctrlGLPolicy_rdoMasterPolicy']";
	static String addGLPolicyFieldMasterPolicyEditBox = "//input[@id='ctrlGLPolicy_txtMasterPolicy']";
	static String addGLPolicyRadioBtnIndividualPolicyNumberEachEnrollment = "//input[@id='ctrlGLPolicy_rdoindividual']";
	static String addGLPolicyRadioBtnRange = "//input[@id='ctrlGLPolicy_rdoRange']";
	static String addGLPolicyFieldRangeEditBox = "//input[@id='ctrlGLPolicy_txtRange']";
	static String addGLPolicyFieldRangeFromEditBox = "//input[@id='ctrlGLPolicy_txtRangeFrom']";
	static String addGLPolicyFieldRangeToEditBox = "//input[@id='ctrlGLPolicy_txtRangeTo']";
	static String addGLPolicyCheckBoxExistingContractorPolicyNumber = "//input[@id='ctrlGLPolicy_chkSamePolicyNumber']";
	static String addGLPolicyPolicyEffectiveDate = "//input[@id='ctrlGLPolicy_txtPolicyEffectiveDate1']";
	static String addGLpolicyExpirationDate = "//input[@id='ctrlGLPolicy_txtPolicyExpirationDate1']";

	public static WebElement addGLPolicySelectCarrier(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySelectCarrier));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnClaimsMade(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnClaimsMade));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnOccur(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnOccur));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnDeductible(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnDeductible));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnRetention(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnRetention));
		return element;
	}

	public static WebElement addGLPolicyFieldRetentionEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldRetentionEditBox));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnPolicy));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnProject(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnProject));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnLocation(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnLocation));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnMasterPolicy));
		return element;
	}

	public static WebElement addGLPolicyFieldMasterPolicyEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldMasterPolicyEditBox));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnIndividualPolicyNumberEachEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnIndividualPolicyNumberEachEnrollment));
		return element;
	}

	public static WebElement addGLPolicyRadioBtnRange(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyRadioBtnRange));
		return element;
	}

	public static WebElement addGLPolicyFieldRangeEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldRangeEditBox));
		return element;
	}

	public static WebElement addGLPolicyFieldRangeFromEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldRangeFromEditBox));
		return element;
	}

	public static WebElement addGLPolicyFieldRangeToEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldRangeToEditBox));
		return element;
	}

	public static WebElement addGLPolicyCheckBoxExistingContractorPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyCheckBoxExistingContractorPolicyNumber));
		return element;
	}

	public static WebElement addGLPolicyPolicyEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyPolicyEffectiveDate));
		return element;
	}

	public static WebElement addGLpolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLpolicyExpirationDate));
		return element;
	}

	// Use the following as the Effective Date on Contractor Certificate xpaths

	static String addGLPolicyPolicyEffectiveDateAsEffectiveDate = "//input[@id='ctrlGLPolicy_rdoPolicyEffectiveDate']";
	static String addGLPolicyIndividualContractStartDateAsEffectiveDate = "//input[@id='ctrlGLPolicy_rdoIndividualContractStartDate']";
	static String addGLPolicyEnrollmentDateAsEffectiveDate = "//input[@id='ctrlGLPolicy_rdoEnrollmentDate']";
	static String addGLPolicyProgramStartDateAsEffectiveDate = "//input[@id='ctrlGLPolicy_rdoProjectStartDate']";
	static String addGLPolicyProjectStartDateAsEffectiveDate = "//input[@id='ctrlGLPolicy_rdoWorksiteStartDate']";
	static String addGLPolicyPolicyExpirationDateAsCompletionDate = "//input[@id='ctrlGLPolicy_rdoPolicyCompletionDate']";
	static String addGLPolicyProjectEstimatedEndDateAsCompletionDate = "//input[@id='ctrlGLPolicy_rdoPolicyWorksiteCompletionDate']";
	static String addGLPolicyContractorEstimatedEndDateAsCompletionDate = "//input[@id='ctrlGLPolicy_rdoPolicyContractorCompletionDate']";
	static String addGLPolicyswitchExtendPolicy = "//div[@class='inner']";
	static String addGLPolicySelectExtentionPolicyDate = "//input[@id='txtExtendedPolicyDate']";
	static String addGLPolicyFieldResonForExtention = "//input[@id='txtExtendedPolicyDateDesc']";
	static String addGLPolicyAddExtentionPolicyPlusBtn = "//button[@id='AddNewDate']";
	static String addGLPolicySelectExtentionOnePolicyDate = "//div[@class='marg-top-10 row']//input[@id='txtExtendedPolicyDate']";
	static String addGLPolicyFieldResonForExtentionOne = "//div[@class='marg-top-10 row']//input[@id='txtExtendedPolicyDateDesc']";
	static String addGLPolicyAddExtentionOnePolicyPlusBtn = "//div[@class='marg-top-10 row']//i[@class='fa fa-plus']";
	static String addGLPolicyAddExtentionOnePolicyRemoveBtn = "//button[@class='remove_field btn btn-danger btnRemove marg-right-10']//i[@class='fa fa-minus']";
	static String addGLPolicyEachOccurence = "//input[@id='ctrlGLPolicy_txtEachOccurence']";
	static String addGLPolicyDamageRentedPremises = "//input[@id='ctrlGLPolicy_txtDamageToRentedPremises']";
	static String addGLPolicyMedExp = "//input[@id='ctrlGLPolicy_txtMedExps']";
	static String addGLPolicyPersonalAndAdvInjury = "//input[@id='ctrlGLPolicy_txtPersonalAdvInjury']";
	static String addGLPolicyGeneralAggregate = "//input[@id='ctrlGLPolicy_txtGeneralAggregate']";
	static String addGLPolicyProducts_Comp_Agg = "//input[@id='ctrlGLPolicy_txtProductsCompOpAgg']";
	static String addGLPolicySelectAdditionalInsured = "//select[@id='ctrlGLPolicy_ddlAdditionalInsured']";
	static String addGLPolicySelectWaiverSubrogation = "//select[@id='ctrlGLPolicy_ddlWaiverofSubrogation']";
	static String addGLPolicyCloseBtn = "//button[@class='btn']";
	static String addGLPolicySaveBtn = "//input[@id='ctrlGLPolicy_btnSave']";
	static String addGLPolicySaveAndCloseBtn = "//input[@id='ctrlGLPolicy_btnSaveandClose']";

	public static WebElement addGLPolicyPolicyEffectiveDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyPolicyEffectiveDateAsEffectiveDate));
		return element;
	}

	public static WebElement addGLPolicyIndividualContractStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyIndividualContractStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addGLPolicyEnrollmentDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyEnrollmentDateAsEffectiveDate));
		return element;
	}

	public static WebElement addGLPolicyProgramStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyProgramStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addGLPolicyProjectStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyProjectStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addGLPolicyPolicyExpirationDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyPolicyExpirationDateAsCompletionDate));
		return element;
	}

	public static WebElement addGLPolicyProjectEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyProjectEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addGLPolicyContractorEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyContractorEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addGLPolicyswitchExtendPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyswitchExtendPolicy));
		return element;
	}

	public static WebElement addGLPolicySelectExtentionPolicyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySelectExtentionPolicyDate));
		return element;
	}

	public static WebElement addGLPolicyFieldResonForExtention(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldResonForExtention));
		return element;
	}

	public static WebElement addGLPolicyAddExtentionPolicyPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyAddExtentionPolicyPlusBtn));
		return element;
	}

	public static WebElement addGLPolicySelectExtentionOnePolicyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySelectExtentionOnePolicyDate));
		return element;
	}

	public static WebElement addGLPolicyFieldResonForExtentionOne(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyFieldResonForExtentionOne));
		return element;
	}

	public static WebElement addGLPolicyAddExtentionOnePolicyPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyAddExtentionOnePolicyPlusBtn));
		return element;
	}

	public static WebElement addGLPolicyAddExtentionOnePolicyRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyAddExtentionOnePolicyRemoveBtn));
		return element;
	}

	public static WebElement addGLPolicyEachOccurence(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyEachOccurence));
		return element;
	}

	public static WebElement addGLPolicyDamageRentedPremises(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyDamageRentedPremises));
		return element;
	}

	public static WebElement addGLPolicyMedExp(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyMedExp));
		return element;
	}

	public static WebElement addGLPolicyPersonalAndAdvInjury(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyPersonalAndAdvInjury));
		return element;
	}

	public static WebElement addGLPolicyGeneralAggregate(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyGeneralAggregate));
		return element;
	}

	public static WebElement addGLPolicyProducts_Comp_Agg(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyProducts_Comp_Agg));
		return element;
	}

	public static WebElement addGLPolicySelectAdditionalInsured(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySelectAdditionalInsured));
		return element;
	}

	public static WebElement addGLPolicySelectWaiverSubrogation(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySelectWaiverSubrogation));
		return element;
	}

	public static WebElement addGLPolicyCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicyCloseBtn));
		return element;
	}

	public static WebElement addGLPolicySaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySaveBtn));
		return element;
	}

	public static WebElement addGLPolicySaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addGLPolicySaveAndCloseBtn));
		return element;
	}

	// add wc policy
	static String btnOpenWorkersCompensation = "//a[@id='aWCEdit']";
	static String addWCPolicySelectCarrier = "//select[@id='ctrlWCPolicy_ddlCarrier']";// list
	static String addWCPolicyRadioBtnMasterPolicy = "//input[@id='ctrlWCPolicy_rdoMasterPolicy']";
	static String addWCPolicyFieldMasterPolicy = "//input[@id='ctrlWCPolicy_txtMasterPolicy']";
	static String addWCPolicyRadioBtnIndividualPolicyNumberEachEnrollment = "//input[@id='ctrlWCPolicy_rdoindividual']";
	static String addWCPolicyRadioBtnRange = "//input[@id='ctrlWCPolicy_rdoRange']";
	static String addWCPolicyFieldRangeEditBox = "//input[@id='ctrlWCPolicy_txtRange']";
	static String addWCPolicyFieldRangeFromEditBox = "//input[@id='ctrlWCPolicy_txtRangeFrom']";
	static String addWCPolicyFieldRangeToEditBox = "//input[@id='ctrlGLPolicy_txtRangeTo']";
	static String addWCPolicyCheckBoxExistingContractorPolicyNumber = "//input[@id='ctrlWCPolicy_chkSamePolicyNumber']";
	static String addWCPolicyPolicyEffectiveDate = "//input[@id='ctrlWCPolicy_txtPolicyEffectiveDate1']";
	static String addWCpolicyExpirationDate = "//input[@id='ctrlWCPolicy_txtPolicyExpirationDate1']";

	public static WebElement btnOpenWorkersCompensation(WebDriver driver) {
		element = driver.findElement(By.xpath(btnOpenWorkersCompensation));
		return element;
	}

	public static WebElement addWCPolicySelectCarrier(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectCarrier));
		return element;
	}

	public static WebElement addWCPolicyRadioBtnMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyRadioBtnMasterPolicy));
		return element;
	}

	public static WebElement addWCPolicyFieldMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldMasterPolicy));
		return element;
	}

	public static WebElement addWCPolicyRadioBtnIndividualPolicyNumberEachEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyRadioBtnIndividualPolicyNumberEachEnrollment));
		return element;
	}

	public static WebElement addWCPolicyRadioBtnRange(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyRadioBtnRange));
		return element;
	}

	public static WebElement addWCPolicyFieldRangeEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldRangeEditBox));
		return element;
	}
	public static WebElement addWCPolicyFieldRangeFromEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldRangeFromEditBox));
		return element;
	}
	public static WebElement addWCPolicyFieldRangeToEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldRangeToEditBox));
		return element;
	}
	public static WebElement addWCPolicyCheckBoxExistingContractorPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyCheckBoxExistingContractorPolicyNumber));
		return element;
	}

	public static WebElement addWCPolicyPolicyEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyPolicyEffectiveDate));
		return element;
	}

	public static WebElement addWCpolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCpolicyExpirationDate));
		return element;
	}

	// Use the following as the Effective Date on Contractor Certificate xpaths

	static String addWCPolicyPolicyEffectiveDateAsEffectiveDate = "//input[@id='ctrlWCPolicy_rdoPolicyEffectiveDate']";
	static String addWCPolicyIndividualContractStartDateAsEffectiveDate = "//input[@id='ctrlWCPolicy_rdoIndividualContractStartDate']";
	static String addWCPolicyEnrollmentDateAsEffectiveDate = "//input[@id='ctrlWCPolicy_rdoEnrollmentDate']";
	static String addWCPolicyProgramStartDateAsEffectiveDate = "//input[@id='ctrlWCPolicy_rdoProjectStartDate']";
	static String addWCPolicyProjectStartDateAsEffectiveDate = "//input[@id='ctrlWCPolicy_rdoWorksiteStartDate']";
	static String addWCPolicyPolicyExpirationDateAsCompletionDate = "//input[@id='ctrlWCPolicy_rdoPolicyCompletionDate']";
	static String addWCPolicyProjectEstimatedEndDateAsCompletionDate = "//input[@id='ctrlWCPolicy_rdoPolicyWorksiteCompletionDate']";
	static String addWCPolicyContractorEstimatedEndDateAsCompletionDate = "//input[@id='ctrlWCPolicy_rdoPolicyContractorCompletionDate']";
	static String addWCPolicySelectAnyProprieter = "//select[@id='ctrlWCPolicy_ddlIsAnyMemberExcluded']";// list
	static String addWCPolicyswitchExtendPolicy = "//div[@class='inner']";
	static String addWCPolicySelectExtentionPolicyDate = "//input[@id='txtExtendedPolicyDate']";
	static String addWCPolicyFieldResonForExtention = "//input[@id='txtExtendedPolicyDateDesc']";
	static String addWCPolicyAddExtentionPolicyPlusBtn = "//button[@id='AddNewDate']";
	static String addWCPolicySelectExtentionOnePolicyDate = "//div[@class='marg-top-10 row']//input[@id='txtExtendedPolicyDate']";
	static String addWCPolicyFieldResonForExtentionOne = "//div[@class='marg-top-10 row']//input[@id='txtExtendedPolicyDateDesc']";
	static String addWCPolicyAddExtentionOnePolicyPlusBtn = "//div[@class='marg-top-10 row']//i[@class='fa fa-plus']";
	static String addWCPolicyAddExtentionOnePolicyRemoveBtn = "//button[@class='remove_field btn btn-danger btnRemove marg-right-10']//i[@class='fa fa-minus']";
	static String addWCPolicyRadioBtnWCStatutoryLimit = "//input[@id='ctrlWCPolicy_rdoWCStatutoryLimits']";
	static String addWCPolicyEditBoxWCStatutoryLimit = "//input[@id='ctrlWCPolicy_txtWCStatutoryLimits']";
	static String addWCPolicyRadioBtnOthersLimit = "//input[@id='ctrlWCPolicy_rdoOthers']";
	static String addWCPolicyELDiseaseEAEmployee = "//input[@id='ctrlWCPolicy_txtELDiseaseEAEmployee']";
	static String addWCPolicyELDiseasePolicyLimit = "//input[@id='ctrlWCPolicy_txtELDiseasePolicyLimit']";
	static String addWCPolicyELEachAccident = "//input[@id='ctrlWCPolicy_txtELEachAccident']";
	static String addWCPolicySelectAdditionalInsured = "//select[@id='ctrlWCPolicy_ddlAdditionalInsured']";// list
	static String addWCPolicySelectWaiverSubrogation = "//select[@id='ctrlWCPolicy_ddlWaiverofSubrogation']";// list
	static String addWCPolicyCloseBtn = "//button[@class='btn']";
	static String addWCPolicySaveBtn = "//input[@id='ctrlWCPolicy_btnSave']";
	static String addWCPolicySaveAndCloseBtn = "//input[@id='ctrlWCPolicy_btnSaveandClose']";

	public static WebElement addWCPolicyPolicyEffectiveDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyPolicyEffectiveDateAsEffectiveDate));
		return element;
	}
	public static WebElement addWCPolicyIndividualContractStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyIndividualContractStartDateAsEffectiveDate));
		return element;
	}
	public static WebElement addWCPolicyEnrollmentDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyEnrollmentDateAsEffectiveDate));
		return element;
	}

	public static WebElement addWCPolicyProgramStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyProgramStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addWCPolicyProjectStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyProjectStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addWCPolicyPolicyExpirationDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyPolicyExpirationDateAsCompletionDate));
		return element;
	}

	public static WebElement addWCPolicyProjectEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyProjectEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addWCPolicyContractorEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyContractorEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addWCPolicySelectAnyProprieter(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectAnyProprieter));
		return element;
	}

	public static WebElement addWCPolicyswitchExtendPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyswitchExtendPolicy));
		return element;
	}

	public static WebElement addWCPolicySelectExtentionPolicyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectExtentionPolicyDate));
		return element;
	}

	public static WebElement addWCPolicyFieldResonForExtention(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldResonForExtention));
		return element;
	}

	public static WebElement addWCPolicyAddExtentionPolicyPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyAddExtentionPolicyPlusBtn));
		return element;
	}

	public static WebElement addWCPolicySelectExtentionOnePolicyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectExtentionOnePolicyDate));
		return element;
	}

	public static WebElement addWCPolicyFieldResonForExtentionOne(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyFieldResonForExtentionOne));
		return element;
	}

	public static WebElement addWCPolicyAddExtentionOnePolicyPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyAddExtentionOnePolicyPlusBtn));
		return element;
	}

	public static WebElement addWCPolicyAddExtentionOnePolicyRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyAddExtentionOnePolicyRemoveBtn));
		return element;
	}

	public static WebElement addWCPolicyRadioBtnWCStatutoryLimit(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyRadioBtnWCStatutoryLimit));
		return element;
	}

	public static WebElement addWCPolicyEditBoxWCStatutoryLimit(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyEditBoxWCStatutoryLimit));
		return element;
	}

	public static WebElement addWCPolicyRadioBtnOthersLimit(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyRadioBtnOthersLimit));
		return element;
	}

	public static WebElement addWCPolicyELDiseaseEAEmployee(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyELDiseaseEAEmployee));
		return element;
	}

	public static WebElement addWCPolicyELDiseasePolicyLimit(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyELDiseasePolicyLimit));
		return element;
	}

	public static WebElement addWCPolicyELEachAccident(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyELEachAccident));
		return element;
	}

	public static WebElement addWCPolicySelectAdditionalInsured(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectAdditionalInsured));
		return element;
	}

	public static WebElement addWCPolicySelectWaiverSubrogation(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySelectWaiverSubrogation));
		return element;
	}

	public static WebElement addWCPolicyCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicyCloseBtn));
		return element;
	}

	public static WebElement addWCPolicySaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySaveBtn));
		return element;
	}

	public static WebElement addWCPolicySaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWCPolicySaveAndCloseBtn));
		return element;
	}

	// Excess UMB policy
	static String addUmbPolAddPolicyBtn = "//a[@id='aProjectEULPolicyNoRecord2']";
	static String addUmbPolClickHereLink = "//a[@id='aProjectEULPolicyNoRecord']";
	static String addUmbPolSelectCarrier = "//select[@id='ctrlEULPolicy_ddlCarrier']";// list
	static String addUmbPolSelectLayer = "//select[@id='ctrlEULPolicy_ddlLayer']";// list
	static String addUmbPolUmbrellaLiabilityPolicyRedioButton = "//input[@id='ctrlEULPolicy_rbtumbType']";
	static String addUmbPolExcessLiabilityPolicyRedioButton = "//input[@id='ctrlEULPolicy_rbtexcessType']";
	static String addUmbPolClaimsModeRedioButton = "//input[@id='ctrlEULPolicy_rdoClaimsMade']";
	static String addUmbPolOccurRedioButton = "//input[@id='ctrlEULPolicy_rdoOccur']";
	static String addUmbPolDeductableRedioButton = "//input[@id='ctrlEULPolicy_rbDeductable']";
	static String addUmbPolRetentionRedioButton = "//input[@id='ctrlEULPolicy_rbRetention']";
	static String addUmbPolRetention_DeductableAmtField = "//input[@id='ctrlEULPolicy_txtDeductableRetention']";
	static String addUmbPolRadioBtnMasterPolicy = "//input[@id='ctrlEULPolicy_rdoMasterPolicy']";
	static String addUmbPolEnterPolicyNumberField = "//input[@id='ctrlEULPolicy_txtMasterPolicy']";
	static String addUmbPolRadioBtnIndividualPolicyNumberEachEnrollment = "//input[@id='ctrlEULPolicy_rdoindividual']";
	static String addUmbPolRadioBtnRange = "//input[@id='ctrlEULPolicy_rdoRange']";
	static String addUmbPolFieldRangeEditBox = "//input[@id='ctrlEULPolicy_txtRange']";
	static String addUmbPolFieldRangeFromEditBox = "//input[@id='ctrlEULPolicy_txtRangeFrom']";
	static String addUmbPolFieldRangeToEditBox = "//input[@id='ctrlEULPolicy_txtRangeTo']";
	static String addUmbPolCheckBoxExistingContractorPolicyNumber = "//input[@id='ctrlEULPolicy_chkSamePolicyNumber']";
	static String addUmbPolSelectPolicyEffectiveDate = "//input[@id='ctrlEULPolicy_txtPolicyEffectiveDate1']";
	static String addUmbPolSelectPolicyExpirationDate = "//input[@id='ctrlEULPolicy_txtPolicyExpirationDate1']";
	// Use the following as the Effective Date on Contractor Certificate xpaths
	static String addUmbPolPolicyEffectiveDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoPolicyEffectiveDate']";
	static String addUmbPolIndividualContractStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoIndividualContractStartDate']";
	static String addUmbPolEnrollmentDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoEnrollmentDate']";
	static String addUmbPolProgramStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoProjectStartDate']";
	static String addUmbPolProjectStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoWorksiteStartDate']";

	public static WebElement addUmbPolAddPolicyBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolAddPolicyBtn));
		return element;
	}

	public static WebElement addUmbPolClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolClickHereLink));
		return element;
	}

	public static WebElement addUmbPolSelectLayer(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectLayer));
		return element ;
	}

	public static WebElement addUmbPolSelectCarrier(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectCarrier));
		return element;
	}

	public static WebElement addUmbPolUmbrellaLiabilityPolicyRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolUmbrellaLiabilityPolicyRedioButton));
		return element;
	}

	public static WebElement addUmbPolExcessLiabilityPolicyRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolExcessLiabilityPolicyRedioButton));
		return element;
	}

	public static WebElement addUmbPolClaimsModeRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolClaimsModeRedioButton));
		return element;
	}

	public static WebElement addUmbPolOccurRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolOccurRedioButton));
		return element;
	}

	public static WebElement addUmbPolDeductableRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolDeductableRedioButton));
		return element;
	}

	public static WebElement addUmbPolRetentionRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolRetentionRedioButton));
		return element;
	}

	public static WebElement addUmbPolRetention_DeductableAmtField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolRetention_DeductableAmtField));
		return element;
	}

	public static WebElement addUmbPolRadioBtnMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolRadioBtnMasterPolicy));
		return element;
	}

	public static WebElement addUmbPolEnterPolicyNumberField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolEnterPolicyNumberField));
		return element;
	}

	public static WebElement addUmbPolRadioBtnIndividualPolicyNumberEachEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolRadioBtnIndividualPolicyNumberEachEnrollment));
		return element;
	}

	public static WebElement addUmbPolRadioBtnRange(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolRadioBtnRange));
		return element;
	}

	public static WebElement addUmbPolFieldRangeEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldRangeEditBox));
		return element;
	}

	public static WebElement addUmbPolFieldRangeFromEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldRangeFromEditBox));
		return element;
	}

	public static WebElement addUmbPolFieldRangeToEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldRangeToEditBox));
		return element;
	}

	public static WebElement addUmbPolCheckBoxExistingContractorPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolCheckBoxExistingContractorPolicyNumber));
		return element;
	}

	public static WebElement addUmbPolSelectPolicyEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectPolicyEffectiveDate));
		return element;
	}
	
	public static WebElement addUmbPolSelectPolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectPolicyExpirationDate));
		return element;
	}
	

	public static WebElement addUmbPolPolicyEffectiveDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolPolicyEffectiveDateAsEffectiveDate));
		return element;
	}

	public static WebElement addUmbPolIndividualContractStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolIndividualContractStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addUmbPolEnrollmentDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolEnrollmentDateAsEffectiveDate));
		return element;
	}

	public static WebElement addUmbPolProgramStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolProgramStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addUmbPolProjectStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolProjectStartDateAsEffectiveDate));
		return element;
	}

	// Use the following as the Estimated Completion Date
	// on_Contractor_Certificate Xpaths
	static String addUmbPolPolicyExpirationDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyCompletionDate']";
	static String addUmbPolProjectEstimatedEndDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyWorksiteCompletionDate']";
	static String addUmbPolContractorEstimatedEndDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyContractorCompletionDate']";
	static String addUmbPolSwitchExtendedPolicy = "//div[@class='ios-ui-select']";
	static String addUmbPolFieldEacyOccurrence = "//input[@id='ctrlEULPolicy_txtEachOccurence']";
	static String addUmbPolFieldAggregate = "//input[@id='ctrlEULPolicy_txtAggregate']";
	static String addUmbPolFieldProductsCompletedOperations = "//input[@id='ctrlEULPolicy_txtProductsCompletedOperations']";
	static String addUmbPolAdditionalInsuredField = "//select[@id='ctrlEULPolicy_ddlAdditionalInsured']";// list
	static String addUmbPolWaiverofSubrogationField = "//select[@id='ctrlEULPolicy_ddlWaiverofSubrogation']";// list
	static String addUmbPolCloseBtn = "//button[@class='btn']";
	static String addUmbPolSaveBtn = "//input[@value='Save']";
	static String addUmbPolSaveAndCloseBtn = "//input[@id='ctrlEULPolicy_btnSaveandClose']";

	public static WebElement addUmbPolPolicyExpirationDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolPolicyExpirationDateAsCompletionDate));
		return element;
	}

	public static WebElement addUmbPolProjectEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolProjectEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addUmbPolContractorEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolContractorEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addUmbPolSwitchExtendedPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSwitchExtendedPolicy));
		return element;
	}

	public static WebElement addUmbPolFieldEacyOccurrence(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldEacyOccurrence));
		return element;
	}

	public static WebElement addUmbPolFieldAggregate(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldAggregate));
		return element;
	}

	public static WebElement addUmbPolFieldProductsCompletedOperations(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolFieldProductsCompletedOperations));
		return element;
	}

	public static WebElement addUmbPolAdditionalInsuredField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolAdditionalInsuredField));
		return element;
	}

	public static WebElement addUmbPolWaiverofSubrogationField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolWaiverofSubrogationField));
		return element ;
	}

	public static WebElement addUmbPolCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolCloseBtn));
		return element;
	}

	public static WebElement addUmbPolSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSaveBtn));
		return element;
	}

	public static WebElement addUmbPolSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSaveAndCloseBtn));
		return element;
	}

	// Setup General Certificate
	static String setupCertificateBtnSetupGeneralCertificate = "//a[@id='aICEdit']";
	static String setupCertificateProducerPanelField = "//textarea[@id='ctrlInsuranceCertificate_txtEditProducerPanel']";
	static String setupCertificateSelectAdminForCertificate = "//select[@id='ctrlInsuranceCertificate_ddlNodeAdministrator']";// list
	static String setupCertificateRadioBtnContractorCertificateHolderAndSponsorInsured = "//input[@id='ctrlInsuranceCertificate_rdoContractorCertificateHolder']";
	static String setupCertificateRadioBtnContractorInsuredAndSponsorCertificateHolder = "//input[@id='ctrlInsuranceCertificate_rdoOwnerCertificateHolder']";
	static String setupCertificateRadioBtnContractorCertificateHolderAndInsured = "//input[@id='ctrlInsuranceCertificate_rdoContractorCertificateHolderandInsured']";
	static String setupCertificateRadioBtnCertificateOfEnrollment = "//input[@id='ctrlInsuranceCertificate_rdoCertificateLiability']";
	static String setupCertificateRadioBtnAcord25 = "//input[@id='ctrlInsuranceCertificate_rdoAcordCertificateLiability']";
	static String setupCertificateTypeOfCertificateDetailsTextAreaBoldBtn = "//div[@id='mce_419']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateCertificateDetailsSelectAllToken = "//span[@class='title marg-bottom-5']/../div[1]//ul/li[*]";// list
	static String setupCertificateCertificateDetailsSelectTokenCompanyAddress = "//span[@id='ctrlInsuranceCertificate_Label144']";
	static String setupCertificateCertificateDetailsSelectTokenCompanyName = "//span[@id='ctrlInsuranceCertificate_Label145']";
	static String setupCertificateCertificateDetailsSelectTokenContractorContactName = "//span[@id='ctrlInsuranceCertificate_Label146']";
	static String setupCertificateCertificateDetailsSelectTokenDivisionName = "//span[@id='ctrlInsuranceCertificate_Label148']";
	static String setupCertificateCertificateDetailsSelectTokenDivisionAddress = "//span[@id='ctrlInsuranceCertificate_Label169']";
	static String setupCertificateDescriptionsOfOperationsTextAreaBoldBtn = "//div[@id='mce_354']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateDescriptionsOfOperationsSelectAllToken = "//div[@class='col-md-12']//div[4]//div[1]//div[1]//div[1]//div[2]//ul[1]/li[*]";// list
	static String setupCertificateSwitchSecondPageCertificateDetails = "//div[@id='uniform-ctrlInsuranceCertificate_chkSecondPageText']//div[@class='inner']";
	static String setupCertificateSecondPageCertificateRadioBtnBlankPage = "//input[@id='ctrlInsuranceCertificate_rdosecondPageBlank']";
	static String setupCertificateSecondPageCertificateRadioBtnAcord101 = "//input[@id='ctrlInsuranceCertificate_rdosecondAcord']";
	static String setupCertificateSecondPageCertificateTextAreaBoldBtn = "//div[@id='mce_224']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateSecondPageCertificateSelectAllToken = "//div[@class='panel panel-default marg-bottom-0']//ul[@class='tokenPointer']/li[*]";// list
	static String setupCertificateSwitchThirdPageCertificateDetails = "//div[@class='ios-ui-select']//div[@class='inner']";
	static String setupCertificateThirdPageCertificateRadioBtnBlankPage = "//input[@id='ctrlInsuranceCertificate_rdoThirdPageBlank']";
	static String setupCertificateThirdPageCertificateRadioBtnAcord101 = "//input[@id='ctrlInsuranceCertificate_rdoThirddAcord']";
	static String setupCertificateThirdPageCertificateTextAreaBoldBtn = "//div[@id='mce_289']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateThirdPageCertificateSelectAllToken = "//div[@class='row']//div[@class='col-md-12 clearfix']//div[@class='panel panel-default']//ul[@class='tokenPointer']/li[*]";// list
	static String setupCertificateAddCertificatesignatureImage = "//img[@id='ctrlInsuranceCertificate_imgLogo']";
	// Add Additional Insured Name
	static String setupCertificateAdditionalNameInsuredAddBtn = "//input[@id='ctrlInsuranceCertificate_btnQuickAdditionalNameInsured']";
	static String setupCertificateSelectAdditionalNameInsured = "//select[@id='ctrlInsuranceCertificate_ddlAdditionalNameInsured']";// list
	static String setupCertificateAdditionalNameSelectTypeOfPolicyOnCertificate = "//ul[@class='checkBoxListing']/li[*]//input[@type='checkbox']";// list
	static String setupCertificateAdditionalNameSearchForCompany = "//input[@id='token-input-ctrlInsuranceCertificate_txtGL1']";
	static String setupCertificateAdditionalNameDesrciptionOprationBtnBold = "//div[@id='mce_491']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateAdditionalNameDesrciptionOprationSelectAllToken = "//tr[@id='ctrlInsuranceCertificate_trAdditionalNameInsuredDesc']//div[@class='boldText marg-bottom-5'][contains(text(),'Select token from here')]/../ul/li[*]";
	static String setupCertificateAdditionalNameEnterSecondPageText = "//textarea[@id='ctrlInsuranceCertificate_txtPolicyCertificateSecondPageDesc']";
	static String setupCertificateAdditionalNameEnterThirdPageText = "//textarea[@id='ctrlInsuranceCertificate_txtPolicyCertificateThirdPageDesc']";
	static String setupCertificateAdditionalNameSaveBtn = "//input[@id='ctrlInsuranceCertificate_btnAdd_AdditionalNameInsured']";
	static String setupCertificateAdditionalNameFirstEditIcon = "//div[@class='col-md-12']//tr[1]//td[2]//a[1]//i[1]";
	static String setupCertificateAdditionalNameFirstDeleteIcon = "//div[@class='col-md-12']//tr[1]//td[2]//a[2]//i[1]";
	static String setupCertificateAdditionalNameSecondEditIcon = "//tr[2]//td[2]//a[1]//i[1]";
	static String setupCertificateAdditionalNameSecondDeleteIcon = "//tr[2]//td[2]//a[2]//i[1]";
	// Add Additional Insured
	static String setupCertificateAdditionalNameAddBtn = "//input[@id='ctrlInsuranceCertificate_btnQuickAdditionalInsured']";
	static String setupCertificateSelectAdditionalInsured = "//select[@id='ctrlInsuranceCertificate_ddlAdditionalInsured']";// list
	static String setupCertificateAdditionalInsuredSelectTypeOfPolicyOnCertificate = "//div[@id='ctrlInsuranceCertificate_trAdditionalInsuredCheckBox']//div[@class='col-md-12 margBothTB-10']//ul//li[*]//input[@type='checkbox']";// list
	static String setupCertificateAdditionalInsuredSearchForCompany = "//input[@id='token-input-ctrlInsuranceCertificate_txtGL2']";
	static String setupCertificateAdditionalInsuredDesrciptionOprationBtnBold = "//div[@id='mce_159']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateAdditionalInsuredDesrciptionOprationSelectAllToken = "//tr[@id='ctrlInsuranceCertificate_trAdditionalInsuredDesc']//td[1]/div[1]/div[3]//ul/li[*]";// list
	static String setupCertificateAdditionalInsuredEnterSecondPageText = "//textarea[@id='ctrlInsuranceCertificate_txtAdditionalInsuredPolicyCertificateSecondDesc']";
	static String setupCertificateAdditionalInsuredEnterThirdPageText = "//textarea[@id='ctrlInsuranceCertificate_txtPolicyCertificateThirdPageDesc']";
	static String setupCertificateAdditionalInsuredSaveBtn = "//input[@id='ctrlInsuranceCertificate_btnAdd_AdditionalInsured']";
	static String setupCertificateAdditionalInsuredFirstEditIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel1']//tr[1]//td[2]//a[1]//i[1]";
	static String setupCertificateAdditionalInsuredFirstDeleteIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel1']//tr[1]//td[2]//a[2]//i[1]";
	static String setupCertificateAdditionalInsuredSecondEditIcon = "//body//div[@class='col-md-12 marg-top-10']//div[@class='col-md-12 marg-top-10']//tr[2]//td[2]//a[1]//i[1]";
	static String setupCertificateAdditionalInsuredSecondDeleteIcon = "//body//div[@class='col-md-12 marg-top-10']//div[@class='col-md-12 marg-top-10']//tr[2]//td[2]//a[2]//i[1]";
	
// Certificate Holder
	static String setupCertificateCertificateHolderAddBtn = "//input[@id='ctrlInsuranceCertificate_btnQuickCertificateHolder']";
	static String setupCertificateSelecctCertificateHolder = "//select[@id='ctrlInsuranceCertificate_ddlCertificateHolder']";// list
	static String setupCertificateCertificateHolderSelectTypeOfPolicyOnCertificate = "//div[@id='ctrlInsuranceCertificate_trCertificateHolderCheckBox']//div[@class='row']";// list
	static String setupCertificateCertificateHolderSearchForCompany = "//input[@id='token-input-ctrlInsuranceCertificate_txtGL3']";
	static String setupCertificateCertificateHolderDesrciptionOprationBtnBold = "//div[@id='mce_756']//i[@class='mce-ico mce-i-bold']";
	static String setupCertificateCertificateHolderDesrciptionOprationSelectAllToken = "//tr[@id='ctrlInsuranceCertificate_trCertificateHolderDesc']/td[1]/div[1]//div[3]//ul/li[*]";// list
	static String setupCertificateCertificateHolderEnterSecondPageText = "//textarea[@id='ctrlInsuranceCertificate_txtCertificateHolderPolicyCertificateSecondDesc']";
	static String setupCertificateCertificateHolderEnterThirdPageText = "//textarea[@id='ctrlInsuranceCertificate_txtCertificateHolderPolicyCertificateThirdDesc']";
	static String setupCertificateCertificateHolderSaveBtn = "//input[@id='ctrlInsuranceCertificate_btn_CertificateHolder']";
	static String setupCertificateCertificateHolderFirstEditIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel2']//tr[1]//td[2]//a[1]//i[1]";
	static String setupCertificateCertificateHolderFirstDeleteIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel2']//tr[1]//td[2]//a[2]//i[1]";
	static String setupCertificateCertificateHolderSecondEditIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel2']//tr[2]//td[2]//a[1]//i[1]";
	static String setupCertificateCertificateHolderSecondDeleteIcon = "//div[@id='ctrlInsuranceCertificate_UpdatePanel2']//tr[2]//td[2]//a[2]//i[1]";
	static String setupCertificateCloseBtn = "//button[@class='btn']";
	static String setupCertificateSaveBtn = "//input[@id='ctrlInsuranceCertificate_btnSave']";
	static String setupCertificateSaveAndCloseBtn = "//input[@id='ctrlInsuranceCertificate_btnSaveandClose']";

	public static WebElement setupCertificateBtnSetupGeneralCertificate(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateBtnSetupGeneralCertificate));
		return element;
	}

	public static WebElement setupCertificateProducerPanelField(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateProducerPanelField));
		return element;
	}

	public static List<WebElement> setupCertificateSelectAdminForCertificate(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateSelectAdminForCertificate));
		return listElement;
	}

	public static WebElement setupCertificateRadioBtnContractorCertificateHolderAndSponsorInsured(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateRadioBtnContractorCertificateHolderAndSponsorInsured));
		return element;
	}

	public static WebElement setupCertificateRadioBtnContractorInsuredAndSponsorCertificateHolder(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateRadioBtnContractorInsuredAndSponsorCertificateHolder));
		return element;
	}

	public static WebElement setupCertificateRadioBtnContractorCertificateHolderAndInsured(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateRadioBtnContractorCertificateHolderAndInsured));
		return element;
	}

	public static WebElement setupCertificateRadioBtnCertificateOfEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateRadioBtnCertificateOfEnrollment));
		return element;
	}

	public static WebElement setupCertificateRadioBtnAcord25(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateRadioBtnAcord25));
		return element;
	}

	public static WebElement setupCertificateTypeOfCertificateDetailsTextAreaBoldBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateTypeOfCertificateDetailsTextAreaBoldBtn));
		return element;
	}

	public static List<WebElement> setupCertificateCertificateDetailsSelectAllToken(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateCertificateDetailsSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateCertificateDetailsSelectTokenContractorContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateDetailsSelectTokenContractorContactName));
		return element;
	}

	public static WebElement setupCertificateCertificateDetailsSelectTokenDivisionName(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateDetailsSelectTokenDivisionName));
		return element;
	}

	public static WebElement setupCertificateCertificateDetailsSelectTokenDivisionAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateDetailsSelectTokenDivisionAddress));
		return element;
	}

	public static WebElement setupCertificateDescriptionsOfOperationsTextAreaBoldBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateDescriptionsOfOperationsTextAreaBoldBtn));
		return element;
	}

	public static List<WebElement> setupCertificateDescriptionsOfOperationsSelectAllToken(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateDescriptionsOfOperationsSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateSwitchSecondPageCertificateDetails(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSwitchSecondPageCertificateDetails));
		return element;
	}

	public static WebElement setupCertificateSecondPageCertificateRadioBtnBlankPage(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSecondPageCertificateRadioBtnBlankPage));
		return element;
	}

	public static WebElement setupCertificateSecondPageCertificateRadioBtnAcord101(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSecondPageCertificateRadioBtnAcord101));
		return element;
	}

	public static WebElement setupCertificateSecondPageCertificateTextAreaBoldBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSecondPageCertificateTextAreaBoldBtn));
		return element;
	}

	public static WebElement setupCertificateSecondPageCertificateSelectAllToken(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSecondPageCertificateSelectAllToken));
		return element;
	}

	public static WebElement setupCertificateSwitchThirdPageCertificateDetails(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSwitchThirdPageCertificateDetails));
		return element;
	}

	public static WebElement setupCertificateThirdPageCertificateRadioBtnBlankPage(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateThirdPageCertificateRadioBtnBlankPage));
		return element;
	}

	public static WebElement setupCertificateThirdPageCertificateRadioBtnAcord101(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateThirdPageCertificateRadioBtnAcord101));
		return element;
	}

	public static WebElement setupCertificateThirdPageCertificateTextAreaBoldBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateThirdPageCertificateTextAreaBoldBtn));
		return element;
	}

	public static List<WebElement> setupCertificateThirdPageCertificateSelectAllToken(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateThirdPageCertificateSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateAddCertificatesignatureImage(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAddCertificatesignatureImage));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameInsuredAddBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameInsuredAddBtn));
		return element;
	}

	public static List<WebElement> setupCertificateSelectAdditionalNameInsured(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateSelectAdditionalNameInsured));
		return listElement;
	}

	public static List<WebElement> setupCertificateAdditionalNameSelectTypeOfPolicyOnCertificate(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateAdditionalNameSelectTypeOfPolicyOnCertificate));
		return listElement;
	}

	public static WebElement setupCertificateAdditionalNameSearchForCompany(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameSearchForCompany));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameDesrciptionOprationBtnBold(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameDesrciptionOprationBtnBold));
		return element;
	}

	public static List<WebElement> setupCertificateAdditionalNameDesrciptionOprationSelectAllToken(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateAdditionalNameDesrciptionOprationSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateAdditionalNameEnterSecondPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameEnterSecondPageText));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameEnterThirdPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameEnterThirdPageText));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameSaveBtn));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameFirstEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameFirstEditIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameFirstDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameSecondEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameSecondEditIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameSecondDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalNameAddBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalNameAddBtn));
		return element;
	}

	public static List<WebElement> setupCertificateSelectAdditionalInsured(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateSelectAdditionalInsured));
		return listElement;
	}

	public static WebElement setupCertificateAdditionalInsuredSelectTypeOfPolicyOnCertificate(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredSelectTypeOfPolicyOnCertificate));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredSearchForCompany(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredSearchForCompany));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredDesrciptionOprationBtnBold(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredDesrciptionOprationBtnBold));
		return element;
	}

	public static List<WebElement> setupCertificateAdditionalInsuredDesrciptionOprationSelectAllToken(
			WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateAdditionalInsuredDesrciptionOprationSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateAdditionalInsuredEnterSecondPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredEnterSecondPageText));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredEnterThirdPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredEnterThirdPageText));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredSaveBtn));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredFirstEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredFirstEditIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredFirstDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredSecondEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredSecondEditIcon));
		return element;
	}

	public static WebElement setupCertificateAdditionalInsuredSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateAdditionalInsuredSecondDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderAddBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderAddBtn));
		return element;
	}

	public static List<WebElement> setupCertificateSelecctCertificateHolder(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateSelecctCertificateHolder));
		return listElement;
	}

	public static List<WebElement> setupCertificateCertificateHolderSelectTypeOfPolicyOnCertificate(WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateCertificateHolderSelectTypeOfPolicyOnCertificate));
		return listElement;
	}

	public static WebElement setupCertificateCertificateHolderSearchForCompany(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderSearchForCompany));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderDesrciptionOprationBtnBold(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderDesrciptionOprationBtnBold));
		return element;
	}

	public static List<WebElement> setupCertificateCertificateHolderDesrciptionOprationSelectAllToken(
			WebDriver driver) {
		listElement = driver.findElements(By.xpath(setupCertificateCertificateHolderDesrciptionOprationSelectAllToken));
		return listElement;
	}

	public static WebElement setupCertificateCertificateHolderEnterSecondPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderEnterSecondPageText));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderEnterThirdPageText(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderEnterThirdPageText));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderSaveBtn));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderFirstEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderFirstEditIcon));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderFirstDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderSecondEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderSecondEditIcon));
		return element;
	}

	public static WebElement setupCertificateCertificateHolderSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCertificateHolderSecondDeleteIcon));
		return element;
	}

	public static WebElement setupCertificateCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateCloseBtn));
		return element;
	}

	public static WebElement setupCertificateSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSaveBtn));
		return element;
	}

	public static WebElement setupCertificateSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(setupCertificateSaveAndCloseBtn));
		return element;
	}

	// fetch data from Preview
	static String fetchGLPolicyGeneralInformation = "//div[@id='divGeneralLiability']//div[@class='col-md-12 marg-bottom-10']//div[@class='patternBG2']/div[1]/div[2]/div[*]/div[*]";// list
	static String fetchGLPolicyLimits = "//body/form[@id='validate']/div[@class='wrapper']/div[@class='container-fluid']/div[@id='divrowPad25']/div[@class='col-md-12 clearfix']/div[@id='home']/div[@class='row']/div[@class='col-md-12']/div[@class='row']/div[@class='col-md-6']/div[@class='row']/div[@id='divGeneralLiability']/div[@class='panel panel-default']/div[@class='panel-body clearfix']/div[@class='row hrmarg5']/div[@class='col-md-12']/div[@class='patternBG2']/div[1]/div[2]/div[*]/div[*]";// list
	static String fetchGLPolicyAllDates = "//div[@id='divGLRenewCertificate']//table[@class='table grayTable checkAll']/tbody/tr[*]/td";// list
	static String fetchWCPolicyGeneralInformation = "//div[@id='divWCLiability']//div[@class='panel panel-default']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[*]/div";// list
	static String fetchWCPolicyLimits = "//div[@id='divWCLiability']//div[@class='panel panel-default']/div[2]/div[1]/div[3]/div//div[@class='row']/div[2]/div[*]/div[*]";// list
	static String fetchWCPolicyAllDates = "//div[@id='divWCLiability']//div[@class='panel panel-default']/div[2]/div[2]//table/tbody/tr[*]/td";// list
	static String fetchUMBPolicyAllDates = "//table[@class='table blueTable borderTable checkAll']/tbody/tr[*]/td[*]";// list
	static String fetchGeneralCertificateSetup = "//div[@id='divInsuranceCertificate']//div[@class='row']/div[*]";// list

	public static List<WebElement> fetchGLPolicyGeneralInformation(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchGLPolicyGeneralInformation));
		return listElement;
	}

	public static List<WebElement> fetchGLPolicyLimits(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchGLPolicyLimits));
		return listElement;
	}

	public static List<WebElement> fetchGLPolicyAllDates(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchGLPolicyAllDates));
		return listElement;
	}

	public static List<WebElement> fetchWCPolicyGeneralInformation(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchWCPolicyGeneralInformation));
		return listElement;
	}

	public static List<WebElement> fetchWCPolicyLimits(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchWCPolicyLimits));
		return listElement;
	}

	public static List<WebElement> fetchWCPolicyAllDates(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchWCPolicyAllDates));
		return listElement;
	}

	public static List<WebElement> fetchUMBPolicyAllDates(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchUMBPolicyAllDates));
		return listElement;
	}

	public static List<WebElement> fetchGeneralCertificateSetup(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchGeneralCertificateSetup));
		return listElement;
	}
	
//Other Policies 24/07/2020
	static String clickHereAddOtherPoliciesLink = "//a[@id='aProjectOtherPolicyNoRecord']";
	static String AddOtherPoliciesToListBtn="//a[@id='aProjectOtherPolicyNoRecord2']";
	static String selectOtherPolicyForAdd = "//table[@id='rbtOtherPolicy']//tbody/tr/td/label[contains(text(),'Automobile Liability Policy')]/../div//input";//list
	static String selectPolicyNextBtn ="//a[@id='btnOpenPolicy']";
	static String addOtherPolicyRadioBtnClaimsMode ="//input[@id='ctrlOtherPolicy_rdoClaimsMade']";
	static String addOtherPolicyRadioBtnOccur ="//input[@id='ctrlOtherPolicy_rdoOccur']";
	static String addOtherPolicyRadioBtnDeductible ="//input[@id='ctrlOtherPolicy_rbDeductable']";
	static String addOtherPolicyRadioBtnRetention ="//input[@id='ctrlOtherPolicy_rbRetention']";
	static String addOtherPolicyRadioBtnRetentionField ="//input[@id='ctrlOtherPolicy_txtDeductableRetention']";
	
	public static WebElement clickHereAddOtherPoliciesLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereAddOtherPoliciesLink));
		return element;
	}public static WebElement AddOtherPoliciesToListBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(AddOtherPoliciesToListBtn));
		return element;
	}public static WebElement selectOtherPolicyForAdd(WebDriver driver,String selectPolicyType) {
		element = driver.findElement(By.xpath("//table[@id='rbtOtherPolicy']//tbody/tr/td/label[contains(text(),'"+selectPolicyType+"')]"));
		return element;
	}public static WebElement selectPolicyNextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPolicyNextBtn));
		return element;
	}public static WebElement addOtherPolicyRadioBtnClaimsMode(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnClaimsMode));
		return element;
	}public static WebElement addOtherPolicyRadioBtnOccur(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnOccur));
		return element;
	}public static WebElement addOtherPolicyRadioBtnDeductible(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnDeductible));
		return element;
	}public static WebElement addOtherPolicyRadioBtnRetention(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnRetention));
		return element;
	}public static WebElement addOtherPolicyRadioBtnRetentionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnRetentionField));
		return element;
	}
	
	static String addOtherPolicySelectCarrier = "//select[@id='ctrlOtherPolicy_ddlCarrier']";// list
	static String addOtherPolicyAddNewCarrierLink ="//a[contains(text(),'click here to add a carrier.)')]";
	static String addOtherPolicyRadioBtnMasterPolicy = "//input[@id='ctrlOtherPolicy_rdoMasterPolicy']";
	static String addOtherPolicyFieldMasterPolicy = "//input[@id='ctrlOtherPolicy_txtMasterPolicy']";
	static String addOtherPolicyRadioBtnIndividualPolicyNumberEachEnrollment = "//input[@id='ctrlOtherPolicy_rdoindividual']";
	static String addOtherPolicyRadioBtnRange = "//input[@id='ctrlOtherPolicy_rdoRange']";
	static String addOtherPolicyFieldRangeEditBox = "//input[@id='ctrlOtherPolicy_txtRange']";
	static String addOtherPolicyFieldRangeFromEditBox = "//input[@id='ctrlOtherPolicy_txtRangeFrom']";
	static String addOtherPolicyFieldRangeToEditBox = "//input[@id='ctrlOtherPolicy_txtRangeTo']";
	static String addOtherPolicyCheckBoxExistingContractorPolicyNumber = "//input[@id='ctrlOtherPolicy_chkSamePolicyNumber']";
	static String addOtherPolicyPolicyEffectiveDate = "//input[@id='ctrlOtherPolicy_txtPolicyEffectiveDate1']";
	static String addOtherpolicyExpirationDate = "//input[@id='ctrlOtherPolicy_txtPolicyExpirationDate1']";

	public static WebElement addOtherPolicySelectCarrier(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicySelectCarrier));
		return element;
	}public static WebElement addOtherPolicyAddNewCarrierLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyAddNewCarrierLink));
		return element;
	}

	public static WebElement addOtherPolicyRadioBtnMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnMasterPolicy));
		return element;
	}

	public static WebElement addOtherPolicyFieldMasterPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyFieldMasterPolicy));
		return element;
	}

	public static WebElement addOtherPolicyRadioBtnIndividualPolicyNumberEachEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnIndividualPolicyNumberEachEnrollment));
		return element;
	}

	public static WebElement addOtherPolicyRadioBtnRange(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyRadioBtnRange));
		return element;
	}

	public static WebElement addOtherPolicyFieldRangeEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyFieldRangeEditBox));
		return element;
	}

	public static WebElement addOtherPolicyFieldRangeFromEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyFieldRangeFromEditBox));
		return element;
	}

	public static WebElement addOtherPolicyFieldRangeToEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyFieldRangeToEditBox));
		return element;
	}

	public static WebElement addOtherPolicyCheckBoxExistingContractorPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyCheckBoxExistingContractorPolicyNumber));
		return element;
	}

	public static WebElement addOtherPolicyPolicyEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyPolicyEffectiveDate));
		return element;
	}

	public static WebElement addOtherpolicyExpirationDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherpolicyExpirationDate));
		return element;
	}

// Use the following as the Effective Date on Contractor Certificate xpaths
	static String addOtherPolicyPolicyEffectiveDateAsEffectiveDate = "//input[@id='ctrlOtherPolicy_rdoPolicyEffectiveDate']";
	static String addOtherPolicyIndividualContractStartDateAsEffectiveDate = "//input[@id='ctrlOtherPolicy_rdoIndividualContractStartDate']";
	static String addOtherPolicyEnrollmentDateAsEffectiveDate = "//input[@id='ctrlOtherPolicy_rdoEnrollmentDate']";
	static String addOtherPolicyProgramStartDateAsEffectiveDate = "//input[@id='ctrlOtherPolicy_rdoProjectStartDate']";
	static String addOtherPolicyProjectStartDateAsEffectiveDate = "//input[@id='ctrlOtherPolicy_rdoWorksiteStartDate']";
	static String addOtherPolicyPolicyExpirationDateAsCompletionDate = "//input[@id='ctrlOtherPolicy_rdoPolicyCompletionDate']";
	static String addOtherPolicyProjectEstimatedEndDateAsCompletionDate = "//input[@id='ctrlOtherPolicy_rdoPolicyWorksiteCompletionDate']";
	static String addOtherPolicyContractorEstimatedEndDateAsCompletionDate = "//input[@id='ctrlOtherPolicy_rdoPolicyContractorCompletionDate']";
//	static String addOtherPolicySelectAnyProprieter = "//select[@id='ctrlOtherPolicy_ddlIsAnyMemberExcluded']";// list
	static String addOtherPolicyswitchExtendPolicy = "//div[@class='inner']";
	static String addOtherPolicySelectExtentionPolicyDate = "//input[@id='txtExtendedPolicyDate']";
	static String addOtherPolicyFieldResonForExtention = "//input[@id='txtExtendedPolicyDateDesc']";
	static String addOtherPolicyAddExtentionPolicyPlusBtn = "//button[@id='AddNewDate']";
	static String addOtherPolicyDisplayThePolicyOnCIP_COICheckBox ="//input[@id='ctrlOtherPolicy_chkIsShowPolicy']";
	
	static String addOtherPolicyCloseBtn = "//button[@class='btn'][contains(text(),'Close')]";
	static String addOtherPolicySaveBtn = "//input[@id='ctrlOtherPolicy_btnSave']";
	static String addOtherPolicySaveAndCloseBtn = "//input[@id='ctrlOtherPolicy_btnSaveandClose']";

	
	public static WebElement addOtherPolicyCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyCloseBtn));
		return element;
	}public static WebElement addOtherPolicySaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicySaveBtn));
		return element;
	}public static WebElement addOtherPolicySaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicySaveAndCloseBtn));
		return element;
	}	
	public static WebElement addOtherPolicyDisplayThePolicyOnCIP_COICheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyDisplayThePolicyOnCIP_COICheckBox));
		return element;
	}
	public static WebElement addOtherPolicyPolicyEffectiveDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyPolicyEffectiveDateAsEffectiveDate));
		return element;
	}

	public static WebElement addOtherPolicyIndividualContractStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyIndividualContractStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addOtherPolicyEnrollmentDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyEnrollmentDateAsEffectiveDate));
		return element;
	}

	public static WebElement addOtherPolicyProgramStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyProgramStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addOtherPolicyProjectStartDateAsEffectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyProjectStartDateAsEffectiveDate));
		return element;
	}

	public static WebElement addOtherPolicyPolicyExpirationDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyPolicyExpirationDateAsCompletionDate));
		return element;
	}

	public static WebElement addOtherPolicyProjectEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyProjectEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addOtherPolicyContractorEstimatedEndDateAsCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyContractorEstimatedEndDateAsCompletionDate));
		return element;
	}

	public static WebElement addOtherPolicyswitchExtendPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyswitchExtendPolicy));
		return element;
	}

	public static WebElement addOtherPolicySelectExtentionPolicyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicySelectExtentionPolicyDate));
		return element;
	}

	public static WebElement addOtherPolicyFieldResonForExtention(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyFieldResonForExtention));
		return element;
	}

	public static WebElement addOtherPolicyAddExtentionPolicyPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addOtherPolicyAddExtentionPolicyPlusBtn));
		return element;
	}
}
