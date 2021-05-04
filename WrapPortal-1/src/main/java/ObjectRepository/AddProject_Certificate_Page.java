package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Certificate_Page {

	private static WebElement element;
	private static List<WebElement> listElement;
	
	//new policy xpath added on 26/2/20
	static String BtnAddProjectSpecificPolicyYes="//button[@id='cntrWorkSiteCertificates_btnIsStandAlonePolicyYes']";
	static String BtnAddProjectSpecificPolicyNO="//button[@id='cntrWorkSiteCertificates_btnIsStandAlonePolicyNo']";
	static String BtnInheritProgramLevelPolicyYes="//button[@id='cntrWorkSiteCertificates_btnInheritCertificateProgramLevelYes']";
	static String BtnInheritProgramLevelPolicyNo="//button[@id='cntrWorkSiteCertificates_btnInheritCertificateProgramLevelNo']";
	static String addProjectSpecificPolicyButton = "//span[contains(text(),'Add Project Specific Policy ')]";
	static String selecPolicyRadioBtn="//table[@id='cntrWorkSiteCertificates_rbtOtherPolicy']//tbody/tr/td//label[contains(text(),'Automobile')]/../div[@class='radio']";
	static String selectPolicyNextBtn="//a[@id='btnOpenPolicy']";
	static String selectPolicyCloseBtn="//a[@class='btn pull-left']";
	static String btnSetupGeneralCertificate="//a[@class='abutton fltr']";
	
	
	static String descriptionOperationsTextArea = "//div[@class='row']/div[3]/div[1]/div[1]/div[2]/iframe";
	static String selectProgramNameToken = "//span[@id='cntrWorkSiteCertificates_Label1']";
	static String selectCompanyNameToken = "//span[@id='cntrWorkSiteCertificates_Label61']";
	static String selectProjectStartDateToken = "//span[@id='cntrWorkSiteCertificates_Label132']";
	static String projectSpecificPolicyRadioBtn="//input[@name='cntrWorkSiteCertificates$rdbIsStandAlonePolicy' and @value='1']"; 
//	static String projectSpecificPolicySwitch =	"//div[@id='uniform-cntrWorkSiteCertificates_chkIsStandAlonePolicy']//div[@class='ios-ui-select']";
	
	// Certificate page Save and close button
	static String saveAndContinueButton = "//input[@id='cntrWorkSiteCertificates_btnSaveandContinue']";
	static String saveAndCloseButton = "//input[@value='Save and Close']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";
	// Project Specific Policy
	// EXCESS/UMBRELLA LIABILITY POLICY SETUP Xpaths
	static String addUmbPolSelectCarrier = "//select[@id='ctrlEULPolicy_ddlCarrier']";// dropdown
	static String addUmbPolSelectLayer = "//select[@id='ctrlEULPolicy_ddlLayer']";// dropdown
	static String addUmbPolUmbrellaLiabilityPolicyRedioButton = "//input[@id='ctrlEULPolicy_rbtumbType']";
	static String addUmbPolExcessLiabilityPolicyRedioButton = "//input[@id='ctrlEULPolicy_rbtexcessType']";
	static String addUmbPolClaimsModeRedioButton = "//input[@id='ctrlEULPolicy_rdoClaimsMade']";
	static String addUmbPolOccurRedioButton = "//input[@id='ctrlEULPolicy_rdoOccur']";
	static String addUmbPolDeductableRedioButton = "//input[@id='ctrlEULPolicy_rbDeductable']";
	static String addUmbPolRetentionRedioButton = "//input[@id='ctrlEULPolicy_rbRetention']";
	static String addUmbPolRetention_DeductableAmtField = "//input[@id='ctrlEULPolicy_txtDeductableRetention']";
	static String addUmbPolEnterPolicyNumberField = "//input[@id='ctrlEULPolicy_txtMasterPolicy']";
	static String addUmbPolSelectPolicyEffectiveDate = "//input[@id='ctrlEULPolicy_txtPolicyEffectiveDate1']";
	static String addUmbPolSelectPolicyExpirationDate = "//input[@id='ctrlEULPolicy_txtPolicyExpirationDate1']";
	// Use the following as the Effective Date on Contractor Certificate xpaths
	static String addUmbPolPolicyEffectiveDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoPolicyEffectiveDate']";
	static String addUmbPolIndividualContractStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoIndividualContractStartDate']";
	static String addUmbPolEnrollmentDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoEnrollmentDate']";
	static String addUmbPolProgramStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoProjectStartDate']";
	static String addUmbPolProjectStartDateAsEffectiveDate = "//input[@id='ctrlEULPolicy_rdoWorksiteStartDate']";
	// Use the following as the Estimated Completion Date on Contractor
	// Certificate Xpaths
	static String addUmbPolPolicyExpirationDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyCompletionDate']";
	static String addUmbPolProjectEstimatedEndDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyWorksiteCompletionDate']";
	static String addUmbPolContractorEstimatedEndDateAsCompletionDate = "//input[@id='ctrlEULPolicy_rdoPolicyContractorCompletionDate']";
	static String addUmbPolExtendedPolicySwitch = "//div[@class='ios-ui-select']";
	static String addUmbPolEacyOccurrenceField = "//input[@id='ctrlEULPolicy_txtEachOccurence']";
	static String addUmbPolEacyAggregateField = "//input[@id='ctrlEULPolicy_txtAggregate']";
	static String addUmbPolProductsCompletedOperationsField = "//input[@id='ctrlEULPolicy_txtProductsCompletedOperations']";
	static String addUmbPolAdditionalInsuredField = "//select[@id='ctrlEULPolicy_ddlAdditionalInsured']";
	static String addUmbPolWaiverofSubrogationField = "//select[@id='ctrlEULPolicy_ddlWaiverofSubrogation']";
	static String addUmbPolCloseBtn = "//button[@class='btn']";
	static String addUmbPolSaveBtn = "//input[@value='Save']";
	static String addUmbPolSaveAndCloseBtn = "//input[@id='ctrlEULPolicy_btnSaveandClose']";

	// Switch On to Enter Second Page Certificate Text if required xpaths
	static String enterSecondPageCertificateTextifrequiredSwitch = "//div[@id='uniform-cntrWorkSiteCertificates_chkSecondPageText']//div[@class='ios-ui-select']";
	static String secondCertificateTypeBlankPage = "//input[@id='cntrWorkSiteCertificates_rdosecondPageBlank']";
	static String secondCertificateTypeAccord101 = "//input[@id='cntrWorkSiteCertificates_rdosecondAcord']";

	static String secondCertificateDetailsTextAreaBold ="//div[@id='mce_289']//button";
	static String secondCertificateDetailsTextArea = "//textarea[@id='cntrWorkSiteCertificates_txtEnterSecondPage']";
	static String secondCertificateSelectProgramNameToken = "//span[@id='cntrWorkSiteCertificates_Label102']";
	static String secondCertificateSelectProjectNameToken = "//span[@id='cntrWorkSiteCertificates_Label107']";
	static String secondCertificateContactNameToken = "//span[@id='cntrWorkSiteCertificates_Label103']";

	static String selectAdministratorForCertificate = "//select[@id='cntrWorkSiteCertificates_ddlNodeAdministrator']";// dropdown
	static String showAdminContactInformationOnCertificateSwitch = "//div[@id='uniform-cntrWorkSiteCertificates_chkIsShowAdminOnCertificate']//div[@class='ios-ui-select checked']";

	static String builderRiskEndorsementNumberTextArea = "//textarea[@id='cntrWorkSiteCertificates_txtBuildersRisk']";
	// Additional Named Insured xpaths
	static String additionalNameInsuredAddbutton ="//input[@id='cntrWorkSiteCertificates_btnQuickAdditionalNameInsured']";
	static String additionalNameInsuredClickHereLink = "//input[@id='cntrWorkSiteCertificates_btnQuickAdd']";
	static String additionalNameInsuredSelectAdditionalNameInsured = "//select[@id='cntrWorkSiteCertificates_ddlAdditionalNameInsured']";
	static String additionalNameInsuredSearchForInsuranceCompany = "//input[@id='token-input-cntrWorkSiteCertificates_txtGL1']";
	static String additionalNameInsuredTextAreaBold ="//div[@id='mce_425']//i[@class='mce-ico mce-i-bold']";
	static String additionalNameInsuredTextArea = "//div[@id='mce_486']";
	static String additionalNameInsuredSelectCompanyNameToken = "//span[@id='cntrWorkSiteCertificates_Label20']";
	static String additionalNameInsuredSelectProgramNameToken = "//span[@id='cntrWorkSiteCertificates_Label23']";
	static String additionalNameInsuredSelectProjectNameToken = "//span[@id='cntrWorkSiteCertificates_Label28']";
	static String additionalNameInsuredSaveButton = "//a[@id='cntrWorkSiteCertificates_btnAdd_AdditionalNameInsured']";

	static String descriptionOperationsTextAreaBold="//div[@id='mce_224']//i[@class='mce-ico mce-i-bold']";
	
	
	public static WebElement selecPolicyRadioBtn(WebDriver driver,String selectPolicyName) {
		element = driver.findElement(By.xpath("//table[@id='cntrWorkSiteCertificates_rbtOtherPolicy']//tbody/tr/td//label[contains(text(),'"+selectPolicyName+"')]/../div[@class='radio']"));
		return element;
	}
	public static WebElement BtnAddProjectSpecificPolicyYes(WebDriver driver) {
		element = driver.findElement(By.xpath(BtnAddProjectSpecificPolicyYes));
		return element;
	}public static WebElement BtnAddProjectSpecificPolicyNO(WebDriver driver) {
		element = driver.findElement(By.xpath(BtnAddProjectSpecificPolicyNO));
		return element;
	}
	public static WebElement BtnInheritProgramLevelPolicyYes(WebDriver driver) {
		element = driver.findElement(By.xpath(BtnInheritProgramLevelPolicyYes));
		return element;
	}public static WebElement BtnInheritProgramLevelPolicyNo(WebDriver driver) {
		element = driver.findElement(By.xpath(BtnInheritProgramLevelPolicyNo));
		return element;
	}
	public static WebElement selectPolicyNextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPolicyNextBtn));
		return element;
	}
	public static WebElement additionalNameInsuredAddbutton(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredAddbutton));
		return element;
	}
	public static WebElement descriptionOperationsTextAreaBold(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionOperationsTextAreaBold));
		return element;
	}
	public static WebElement secondCertificateDetailsTextAreaBold(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateDetailsTextAreaBold));
		return element;
	}
	public static WebElement additionalNameInsuredTextAreaBold(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredTextAreaBold));
		return element;
	}
	public static WebElement descriptionOperationsTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionOperationsTextArea));
		return element;
	}

	public static WebElement selectProgramNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramNameToken));
		return element;
	}

	public static WebElement selectCompanyNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(selectCompanyNameToken));
		return element;
	}

	public static WebElement selectProjectStartDateToken(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectStartDateToken));
		return element;
	}

	public static WebElement projectSpecificPolicyRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSpecificPolicyRadioBtn));
		return element;
	}

	public static WebElement addProjectSpecificPolicyButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectSpecificPolicyButton));
		return element;
	}

	public static WebElement saveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueButton));
		return element;
	}

	public static WebElement saveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseButton));
		return element;
	}

	public static WebElement backButton(WebDriver driver) {
		element = driver.findElement(By.xpath(backButton));
		return element;
	}

	public static WebElement closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButton));
		return element;
	}

	public static WebElement addUmbPolSelectCarrier(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectCarrier));
		return element;
	}

	public static WebElement addUmbPolSelectLayer(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolSelectLayer));
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

	public static WebElement addUmbPolEnterPolicyNumberField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolEnterPolicyNumberField));
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

	public static WebElement addUmbPolExtendedPolicySwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolExtendedPolicySwitch));
		return element;
	}

	public static WebElement addUmbPolEacyOccurrenceField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolEacyOccurrenceField));
		return element;
	}

	public static WebElement addUmbPolEacyAggregateField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolEacyAggregateField));
		return element;
	}

	public static WebElement addUmbPolProductsCompletedOperationsField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolProductsCompletedOperationsField));
		return element;
	}

	public static WebElement addUmbPolAdditionalInsuredField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolAdditionalInsuredField));
		return element;
	}

	public static WebElement addUmbPolWaiverofSubrogationField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUmbPolWaiverofSubrogationField));
		return element;
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

	public static WebElement enterSecondPageCertificateTextifrequiredSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(enterSecondPageCertificateTextifrequiredSwitch));
		return element;
	}

	public static WebElement secondCertificateTypeBlankPage(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateTypeBlankPage));
		return element;
	}

	public static WebElement secondCertificateTypeAccord101(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateTypeAccord101));
		return element;
	}

	public static WebElement secondCertificateDetailsTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateDetailsTextArea));
		return element;
	}

	public static WebElement secondCertificateSelectProgramNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateSelectProgramNameToken));
		return element;
	}

	public static WebElement secondCertificateSelectProjectNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateSelectProjectNameToken));
		return element;
	}

	public static WebElement secondCertificateContactNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(secondCertificateContactNameToken));
		return element;
	}

	public static WebElement selectAdministratorForCertificate(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAdministratorForCertificate));
		return element;
	}

	public static WebElement showAdminContactInformationOnCertificateSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(showAdminContactInformationOnCertificateSwitch));
		return element;
	}

	public static WebElement builderRiskEndorsementNumberTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(builderRiskEndorsementNumberTextArea));
		return element;
	}

	public static WebElement additionalNameInsuredClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredClickHereLink));
		return element;
	}

	public static WebElement additionalNameInsuredSelectAdditionalNameInsured(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSelectAdditionalNameInsured));
		return element;
	}

	public static WebElement additionalNameInsuredSearchForInsuranceCompany(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSearchForInsuranceCompany));
		return element;
	}

	public static WebElement additionalNameInsuredTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredTextArea));
		return element;
	}

	public static WebElement additionalNameInsuredSelectCompanyNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSelectCompanyNameToken));
		return element;
	}

	public static WebElement additionalNameInsuredSelectProgramNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSelectProgramNameToken));
		return element;
	}

	public static WebElement additionalNameInsuredSelectProjectNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSelectProjectNameToken));
		return element;
	}

	public static WebElement additionalNameInsuredSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalNameInsuredSaveButton));
		return element;
	}

//Other policies
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

	
	
	
	
	
	
	
}
