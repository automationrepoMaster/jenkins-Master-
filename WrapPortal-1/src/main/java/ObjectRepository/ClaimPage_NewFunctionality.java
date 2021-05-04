package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClaimPage_NewFunctionality {

	public static WebElement element;
	public static List<WebElement> listElement;
	static String InjuryEventcode = "Flammable fabrics";
	static String InjuryExtentcode = "Cut/scrape";
	static String  NatureofInjurycodeWC="Angina pectoris (chest pain)";
	static String  NatureofAccidentcodeWC="Absorption, Ingestion, Inhalation, NOC";
	static String PartofBodyCode ="Chest, ribs or sternum - Angina pectoris (chest pain)";
	
	// Advance Search Claims

	static String SelectProgram = "//select[@id='ddlProject']";
	static String SelectProject = "//select[@id='ddlWorkSite']";
	static String SearchContractor = "//input[@id='token-input-txtContractor']";
	static String SelectContractorType = "//select[@id='ddlContractorType']";
	static String ContractNumber = "//input[@id='txtContractNo']";
	static String ContractorLocationCode = "//input[@id='txtSiteLocationCode']";
	static String SearchBtn = "//input[@id='btnSearch']";
	static String CloseBtn = "//button[@id='btnClose']";

	public static WebElement SelectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectProgram));
		return element;
	}

	public static WebElement SelectProject(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectProject));
		return element;
	}

	public static WebElement SearchContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(SearchContractor));
		return element;
	}

	public static WebElement SelectContractorType(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectContractorType));
		return element;
	}

	public static WebElement ContractNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractNumber));
		return element;
	}

	public static WebElement ContractorLocationCode(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorLocationCode));
		return element;
	}

	public static WebElement SearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SearchBtn));
		return element;
	}

	public static WebElement CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtn));
		return element;
	}

	// Claim information page

	static String SelectClaimType = "//select[@id='cntrlClaim_ddlClaimType']";
	static String ProjectDetaisl = "//span[@id='cntrlClaim_lblContrPkgHeader']//ul/li[@class='li-project-details']";
	static String MarkasConfirmedChkBox_AlertOKBtn = "//button[@id='btnOk']";

	public static WebElement SelectClaimType(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectClaimType));
		return element;
	}

	public static WebElement MarkasConfirmedChkBox_AlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(MarkasConfirmedChkBox_AlertOKBtn));
		return element;
	}

	public static WebElement ProjectDetaisl(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectDetaisl));
		return element;
	}

	// Claim information page - GL Liablity

	static String SelectClientSpecificClassCode = "//select[@id='cntrlClaim_ddlClassCode']";
	static String SelectClaimantLossTypeCode = "//select[@id='cntrlClaim_ddlClaimantLossTypeCode']";
	static String ReportedClaimDate = "//input[@id='cntrlClaim_txtReportedClaimDate']";
	static String ReportedClaimTime = "//input[@id='cntrlClaim_txtClaimTime']";
	static String Lossdate = "//input[@id='cntrlClaim_txtLossDate']";
	static String LossTime = "//input[@id='cntrlClaim_txtLossTime']";
	static String CloseDate = "//input[@id='cntrlClaim_txtClosedDate']";
	static String ClaimNumber = "//input[@id='cntrlClaim_txtClaimNumber']";
	static String SelectPolicyNumber = "//select[@id='cntrlClaim_ddlPolicyNumber']";
	static String SelectClaimStatus = "//select[@id='cntrlClaim_ddlClaimStatus']";

	public static WebElement SelectClientSpecificClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectClientSpecificClassCode));
		return element;
	}

	public static WebElement SelectClaimantLossTypeCode(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectClaimantLossTypeCode));
		return element;
	}

	public static WebElement ReportedClaimDate(WebDriver driver) {
		element = driver.findElement(By.xpath(ReportedClaimDate));
		return element;
	}

	public static WebElement ReportedClaimTime(WebDriver driver) {
		element = driver.findElement(By.xpath(ReportedClaimTime));
		return element;
	}

	public static WebElement Lossdate(WebDriver driver) {
		element = driver.findElement(By.xpath(Lossdate));
		return element;
	}

	public static WebElement LossTime(WebDriver driver) {
		element = driver.findElement(By.xpath(LossTime));
		return element;
	}

	public static WebElement CloseDate(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseDate));
		return element;
	}

	public static WebElement ClaimNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimNumber));
		return element;
	}

	public static WebElement SelectPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectPolicyNumber));
		return element;
	}

	public static WebElement SelectClaimStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectClaimStatus));
		return element;
	}

	// Claim information page - Workers compensation

	static String ClaimInformationWC_IncidentReportedbyFirstName = "//input[@id='cntrlClaim_txtIncidentReportedByFirstName']";
	static String ClaimInformationWC_IncidentReportedbyLastName = "//input[@id='cntrlClaim_txtIncidentReportedByLastName']";
	static String ClaimInformationWC_IncidentReportedbyEmail = "//input[@id='cntrlClaim_txtIncidentReportedByEmail']";
	static String ClaimInformationWC_IncidentReportedbyphone = "//input[@id='cntrlClaim_txtIncidentReportedByPhone']";
	static String ClaimInformationWC_SelectWouldyoulikeaWCFirstReportDocumentsentbacktoyou = "cntrlClaim_ddlSentBackWCFirstReportDocument";

	public static WebElement ClaimInformationWC_IncidentReportedbyFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformationWC_IncidentReportedbyFirstName));
		return element;
	}

	public static WebElement ClaimInformationWC_IncidentReportedbyLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformationWC_IncidentReportedbyLastName));
		return element;
	}

	public static WebElement ClaimInformationWC_IncidentReportedbyEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformationWC_IncidentReportedbyEmail));
		return element;
	}

	public static WebElement ClaimInformationWC_IncidentReportedbyphone(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformationWC_IncidentReportedbyphone));
		return element;
	}

	public static WebElement ClaimInformationWC_SelectWouldyoulikeaWCFirstReportDocumentsentbacktoyou(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformationWC_SelectWouldyoulikeaWCFirstReportDocumentsentbacktoyou));
		return element;
	}

	// ClaimInformation page
	static String ClaimDescription = "//textarea[@id='cntrlClaim_txtClaimDescription']";
	static String ClaimInformation_MarkasConfirmedChkBox = "//input[@id='cntrlClaim_chkConfirm']";

	static String ClaimInformation_ActionNotes = "//textarea[@id='cntrlClaim_txtActionNotes']";
	static String ClaimInformation_CLoseBtn = "//button[@id='btnClose']";
	static String ClaimInformation_DeleteBtn = "//button[@id='cntrlClaim_btnDeleteClaim' and @class='btn btn-danger']";
	static String ClaimInformation_SaveBtn = "//input[@id='cntrlClaim_btnSave']";
	static String ClaimInformation_SaveandCloseBtn = "//input[@id='cntrlClaim_btnSaveAndClose']";
	static String ClaimInformation_NextBtn = "//input[@id='cntrlClaim_btnNext']";
	static String ClaimInformation_AlertOKBtn = "//button[@id='btnOkSave']"; // button[@id='btnOk']
	static String ClaimInformation_AlertTextMsg = "//div[@class='modalAlertMessage']/b[contains (text(),'There is no Enrollment Date entered on this Contractor Package')]";
	static String CliamInformation_AlertCancelBtn = "//button[@id='btnCancelSave']";

	public static WebElement ClaimDescription(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimDescription));
		return element;
	}

	public static WebElement ClaimInformation_MarkasConfirmedChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_MarkasConfirmedChkBox));
		return element;
	}

	public static WebElement ClaimInformation_ActionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_ActionNotes));
		return element;
	}

	public static WebElement ClaimInformation_CLoseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_CLoseBtn));
		return element;
	}

	public static WebElement ClaimInformation_DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_DeleteBtn));
		return element;
	}

	public static WebElement ClaimInformation_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_SaveBtn));
		return element;
	}

	public static WebElement ClaimInformation_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_SaveandCloseBtn));
		return element;
	}

	public static WebElement ClaimInformation_NextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_NextBtn));
		return element;
	}

	public static WebElement ClaimInformation_AlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_AlertOKBtn));
		return element;
	}

	public static WebElement ClaimInformation_AlertTextMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimInformation_AlertTextMsg));
		return element;
	}

	public static WebElement CliamInformation_AlertCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CliamInformation_AlertCancelBtn));
		return element;
	}

	// Injury and Damage Detaisl

	static String InjuryDamage_SelectOtherClaimsInvolvedinAccidentLocator = "//select[@id='cntrlClaim_ddlOtherClaimsInvolvedIndicator']";
	static String InjuryDamage_SelectLossTimeExpectedIndicator = "//select[@id='cntrlClaim_ddlLossTimeExpectedIndicator']";
	static String InjuryDamage_SelectLossDays = "//input[@id='cntrlClaim_txtLostDays']";
	static String InjuryDamage_SelectMedicalAttentioProvided = "//select[@id='cntrlClaim_ddlMedicalAttention']";
	static String InjuryDamage_SelectOCcuredonCompanypremisesIndicator = "//select[@id='cntrlClaim_ddlOccuredOnCompanyPremisesIndicator']";
	static String InjuryDamage_SelectProviderTypeCode = "//select[@id='cntrlClaim_ddlProviderTypeCode']";
	static String InjuryDamage_ProviderFirstName = "//input[@id='cntrlClaim_txtProviderFirstName']";
	static String InjuryDamage_ProviderLastName = "//input[@id='cntrlClaim_txtProviderLastName']";
	static String InjuryDamage_ProviderOrganizationName = "//input[@id='cntrlClaim_txtProviderOrganizationName']";
	static String InjuryDamage_NatureofAccidentCodeDropDown = "//div[@id='s2id_cntrlClaim_ddlNatureOfAccidentCode']";
	static String InjuryDamage_NatureofInjuryCodeList = "//div[@id='select2-drop-mask']/../div[@id='select2-drop']/ul/li[*]";
	static String InjuryDamage_NatureofAccidentCodeList = "//div[@id='select2-drop-mask']/../div[@id='select2-drop']/ul/li[*]";
	static String InjuryDamage_PartofBodyCodeDropDownList = "//div[@id='select2-drop']//ul/li";
	static String InjuryDamage_NatureofInjuryCodeDropDown = "//div[@id='s2id_cntrlClaim_ddlNatureofInjuryCode']";
	static String InjuryDamage_NatureOfAccidentCode ="//div[@id='s2id_cntrlClaim_ddlNatureOfAccidentCode']";
	static String InjuryDamage_PartOfBodyCodeDropDown = "//div[@id='s2id_cntrlClaim_ddlPartOfBodyCode']";
	static String InjuryDamage_AccidentAddressLine1Name = "//input[@id='cntrlClaim_txtAccidentAddressLine1Name']";
	static String InjuryDamage_AccidentAddressCityName = "//input[@id='cntrlClaim_txtAccidentAddressCityName']";
	static String InjuryDamage_selectAccidentAddressCountry = "//select[@id='cntrlClaim_ddlAccidentAddressCountry']";
	static String InjuryDamage_selectAccidentAddressState = "//select[@id='cntrlClaim_ddlAccidentAddressState']";
	static String InjuryDamage_AccidentAddressPostCode = "//input[@id='cntrlClaim_txtAccidentAddressPostalCode']";
	static String InjuryDamage_Cause = "//textarea[@id='cntrlClaim_txtCause']";
	static String InjuryDamage_MarkasConfirmedChkBox = "//input[@id='cntrlClaim_chkConfirm']";
	static String InjuryDamage_ActionNotes = "//textarea[@id='cntrlClaim_txtActionNotes']";
	static String InjuryDamage_BackBtn = "//input[@id='cntrlClaim_btnBack']";
	static String InjuryDamage_SaveBtn = "//input[@id='cntrlClaim_btnSave']";
	static String InjuryDamage_SaveandCloseBtn = "//input[@id='cntrlClaim_btnSaveAndClose']";
	static String InjuryDamage_SaveandContinueBtn = "//input[@id='cntrlClaim_btnSaveAndContinue']";
	static String InjuryDamage_CloseBtn = "//button[@id='btnClose']";
	static String InjuryDamage_DeleteBtn = "//button[@id='cntrlClaim_btnDeleteClaim']";
	static String InjuryDamage_InjuryEventCodeDropdown = "//div[@id='s2id_cntrlClaim_ddlInjuryEventCode']";
	static String  InjuryDamage_InjuryEventCodeDropdownTxtBox ="//input[@id='s2id_autogen11_search']";
	static String InjuryDamage_InjuryExtentCodeDropdownTxtBox="//input[@id='s2id_autogen12_search']";
	static String InjuryDamage_InjuryEventCodeDropdownbytext = "//div[@class='select2-search select2-search-hidden select2-offscreen']/..//div/../ul/li/div[contains(text(),'" + InjuryEventcode +"')]";// div[@id='select2-drop']//div";
	static String InjuryDamage_InjuryEventCodeDropdownbytextWC = "//div[@class='select2-search select2-search-hidden select2-offscreen']/..//div/../ul/li/div[contains(text(),'" + NatureofInjurycodeWC +"')]";// div[@id='select2-drop']//div";
																																															// //input[@id='s2id_autogen11_search']/../..//ul/li";
	static String InjuryDamage_InjuryExtentCodeDropDown = "//span[@id='select2-chosen-12']";
	static String InjuryDamage_InjuryExtentCodeDropdownbytextWC = "//div[@class='select2-search select2-search-hidden select2-offscreen']/..//ul/li/div[contains(text(),'" + NatureofAccidentcodeWC +"')]";    //Concussion
	static String InjuryDamage_InjuryExtentCodeDropdownbytext = "//div[@class='select2-search select2-search-hidden select2-offscreen']/..//ul/li/div[contains(text(),'" + InjuryExtentcode +"')]";    //Concussion
    static String InjuryDamage_PartofBodyCodeWC ="//div[@class='select2-search select2-search-hidden select2-offscreen']/..//div/../ul/li/div[contains(text(),'"+PartofBodyCode+"')]";
	static String InjuryDamagePartofBodyCodeDropdownWC ="//div[@id='s2id_cntrlClaim_ddlPartOfBodyCode']";
    
	public static WebElement InjuryDamage_InjuryExtentCodeDropdownTxtBox(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryExtentCodeDropdownTxtBox));
		return element;
	}
	
	public static WebElement InjuryDamage_InjuryEventCodeDropdownTxtBox(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryEventCodeDropdownTxtBox));
		return element;
	}
	
	public static WebElement InjuryDamage_NatureOfAccidentCode(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_NatureOfAccidentCode));
		return element;
	}
    public static WebElement InjuryDamage_PartofBodyCodeWC(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(InjuryDamage_PartofBodyCodeWC));
		return element;
	}
    
    public static WebElement InjuryDamagePartofBodyCodeDropdownWC(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamagePartofBodyCodeDropdownWC));
		return element;
	}
    
    public static WebElement InjuryDamage_NatureofInjuryCodeDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_NatureofInjuryCodeDropDown));
		return element;
	}
    
	public static WebElement InjuryDamage_InjuryExtentCodeDropdownbytextWC(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryExtentCodeDropdownbytextWC));
		return element;
	}
	
	public static WebElement InjuryDamage_InjuryEventCodeDropdownbytextWC(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryEventCodeDropdownbytextWC));
		return element;
	}
	public static WebElement InjuryDamage_SelectOtherClaimsInvolvedinAccidentLocator(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectOtherClaimsInvolvedinAccidentLocator));
		return element;
	}

	public static WebElement InjuryDamage_SelectLossTimeExpectedIndicator(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectLossTimeExpectedIndicator));
		return element;
	}

	public static WebElement InjuryDamage_SelectLossDays(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectLossDays));
		return element;
	}

	public static WebElement InjuryDamage_SelectMedicalAttentioProvided(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectMedicalAttentioProvided));
		return element;
	}

	public static WebElement InjuryDamage_SelectOCcuredonCompanypremisesIndicator(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectOCcuredonCompanypremisesIndicator));
		return element;
	}

	public static WebElement InjuryDamage_SelectProviderTypeCode(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SelectProviderTypeCode));
		return element;
	}

	public static WebElement InjuryDamage_ProviderFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_ProviderFirstName));
		return element;
	}

	public static WebElement InjuryDamage_ProviderLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_ProviderLastName));
		return element;
	}

	public static WebElement InjuryDamage_ProviderOrganizationName(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_ProviderOrganizationName));
		return element;
	}

	public static WebElement InjuryDamage_InjuryEventCodeDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryEventCodeDropdown));
		return element;
	}

	public static WebElement InjuryDamage_InjuryExtentCodeDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryExtentCodeDropDown));
		return element;
	}

	public static WebElement InjuryDamage_InjuryEventCodeDropdownbytext(WebDriver driver, String text) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryEventCodeDropdownbytext));
		return element;
	}

	public static WebElement InjuryDamage_InjuryExtentCodeDropdownbytext(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(InjuryDamage_InjuryExtentCodeDropdownbytext));
		return element;
	}

	public static WebElement InjuryDamage_NatureofAccidentCodeDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_NatureofAccidentCodeDropDown));
		return element;
	}

	public static List<WebElement> InjuryDamage_NatureofInjuryCodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(InjuryDamage_NatureofInjuryCodeList));
		return listElement;
	}

	public static List<WebElement> InjuryDamage_NatureofAccidentCodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(InjuryDamage_NatureofAccidentCodeList));
		return listElement;
	}

	public static List<WebElement> InjuryDamage_PartofBodyCodeDropDownList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(InjuryDamage_PartofBodyCodeDropDownList));
		return listElement;
	}

	public static WebElement InjuryDamage_AccidentAddressLine1Name(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_AccidentAddressLine1Name));
		return element;
	}

	public static WebElement InjuryDamage_AccidentAddressCityName(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_AccidentAddressCityName));
		return element;
	}

	public static WebElement InjuryDamage_selectAccidentAddressCountry(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_selectAccidentAddressCountry));
		return element;
	}

	public static WebElement InjuryDamage_selectAccidentAddressState(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_selectAccidentAddressState));
		return element;
	}

	public static WebElement InjuryDamage_AccidentAddressPostCode(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_AccidentAddressPostCode));
		return element;
	}

	public static WebElement InjuryDamage_Cause(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_Cause));
		return element;
	}

	public static WebElement InjuryDamage_MarkasConfirmedChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_MarkasConfirmedChkBox));
		return element;
	}

	public static WebElement InjuryDamage_ActionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_ActionNotes));
		return element;
	}

	public static WebElement InjuryDamage_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_BackBtn));
		return element;
	}

	public static WebElement InjuryDamage_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SaveBtn));
		return element;
	}

	public static WebElement InjuryDamage_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SaveandCloseBtn));
		return element;
	}

	public static WebElement InjuryDamage_SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_SaveandContinueBtn));
		return element;
	}

	public static WebElement InjuryDamage_CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_CloseBtn));
		return element;
	}

	public static WebElement InjuryDamage_DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InjuryDamage_DeleteBtn));
		return element;
	}

	// Claimant information

	static String ClaimantInformation_ClaimantType_BusinessEntityRadioBtn = "//div[@id='uniform-cntrlClaim_rdoBusinessEntity']";
	static String ClaimantInformation_ClaimantType_IndividualRadioBtn = "//input[@id='cntrlClaim_rdoIndividual']";
	static String ClaimantInformation_CompanyName = "//input[@id='cntrlClaim_txtClaimantCompanyName']";
	static String ClaimantInformation_ContactFirstname = "//input[@id='cntrlClaim_txtClaimantFirstName']";
	static String ClaimantInformation_ContactLastName = "//input[@id='cntrlClaim_txtClaimantLastName']";
	static String ClaimantInformation_ContactPhone = "//input[@id='cntrlClaim_txtClaimantPhone']";
	static String ClaimantInformation_ContactEmail = "//input[@id='cntrlClaim_txtClaimantContactEmail']";
	static String ClaimantInformation_JobTitle = "//input[@id='cntrlClaim_txtClaimantJobTitle']";
	static String ClaimantInformation_SocialSecurityNumber = "//input[@id='cntrlClaim_txtClaimantSocialSecurityNumber']";
	static String ClaimantInformation_SelectGender = "//select[@id='cntrlClaim_ddlClaimantGender']";
	static String ClaimantInformation_DOB = "//input[@id='cntrlClaim_txtClaimantDateOfBirth']";
	static String ClaimantInformation_SelectMartialStatus = "//select[@id='cntrlClaim_ddlClaimantMaritalStatus']";
	static String ClaimantInformation_DateofHire = "//input[@id='cntrlClaim_txtDateOfHire']";
	static String ClaimantInformation_LastDayworkedDate = "//input[@id='cntrlClaim_txtLastDayWorkedDate']";
	static String ClaimantInformation_SelectPaidforDateofInjuryCode = "//select[@id='cntrlClaim_ddlPaidForDateOfInjuryCode']";
	static String ClaimantInformation_AddressLine = "//input[@id='cntrlClaim_txtClaimantAddress1']";
	static String ClaimantInformation_City = "//input[@id='cntrlClaim_txtClaimantCity']";
	static String ClaimantInformation_SelectCountry = "//select[@id='cntrlClaim_ddlCountry']";
	static String ClaimantInformation_SelectState = "//select[@id='cntrlClaim_ddlState']";
	static String ClaimantInformation_ZIP = "//input[@id='cntrlClaim_txtClaimantZip']";
	static String ClaimantInformation_MarkasConfirmedCjkBox = "//input[@id='cntrlClaim_chkConfirm']";
	static String ClaimantInformation_ActionNotes = "//textarea[@id='cntrlClaim_txtActionNotes']";
	static String ClaimantInformation_BackBtn = "//input[@id='cntrlClaim_btnBack']";
	static String ClaimantInformation_SaveBtn = "//input[@id='cntrlClaim_btnSave']";
	static String ClaimantInformation_SaveandCloseBtn = "//input[@id='cntrlClaim_btnSaveAndClose']";
	static String ClaimantInformation__SaveandContinueBtn = "//input[@id='cntrlClaim_btnSaveAndContinue']";
	static String ClaimantInformation__CloseBtn = "//button[@id='btnClose']";
	static String ClaimantInformation__DeleteBtn = "//button[@id='cntrlClaim_btnDeleteClaim']";

	public static WebElement ClaimantInformation_ClaimantType_BusinessEntityRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ClaimantType_BusinessEntityRadioBtn));
		return element;
	}

	public static WebElement ClaimantInformation_ClaimantType_IndividualRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ClaimantType_IndividualRadioBtn));
		return element;
	}

	public static WebElement ClaimantInformation_CompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_CompanyName));
		return element;
	}

	public static WebElement ClaimantInformation_ContactFirstname(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ContactFirstname));
		return element;
	}

	public static WebElement ClaimantInformation_ContactLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ContactLastName));
		return element;
	}

	public static WebElement ClaimantInformation_ContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ContactPhone));
		return element;
	}

	public static WebElement ClaimantInformation_ContactEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ContactEmail));
		return element;
	}

	public static WebElement ClaimantInformation_JobTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_JobTitle));
		return element;
	}

	public static WebElement ClaimantInformation_SocialSecurityNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SocialSecurityNumber));
		return element;
	}

	public static WebElement ClaimantInformation_SelectGender(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SelectGender));
		return element;
	}

	public static WebElement ClaimantInformation_DOB(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_DOB));
		return element;
	}

	public static WebElement ClaimantInformation_SelectMartialStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SelectMartialStatus));
		return element;
	}

	public static WebElement ClaimantInformation_DateofHire(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_DateofHire));
		return element;
	}

	public static WebElement ClaimantInformation_LastDayworkedDate(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_LastDayworkedDate));
		return element;
	}

	public static WebElement ClaimantInformation_SelectPaidforDateofInjuryCode(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SelectPaidforDateofInjuryCode));
		return element;
	}

	public static WebElement ClaimantInformation_AddressLine(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_AddressLine));
		return element;
	}

	public static WebElement ClaimantInformation_City(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_City));
		return element;
	}

	public static WebElement ClaimantInformation_SelectCountry(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SelectCountry));
		return element;
	}

	public static WebElement ClaimantInformation_SelectState(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SelectState));
		return element;
	}

	public static WebElement ClaimantInformation_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SaveandCloseBtn));
		return element;
	}

	public static WebElement ClaimantInformation_MarkasConfirmedCjkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_MarkasConfirmedCjkBox));
		return element;
	}

	public static WebElement ClaimantInformation_ActionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ActionNotes));
		return element;
	}

	public static WebElement ClaimantInformation_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_BackBtn));
		return element;
	}

	public static WebElement ClaimantInformation_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_SaveBtn));
		return element;
	}

	public static WebElement ClaimantInformation__SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation__SaveandContinueBtn));
		return element;
	}

	public static WebElement ClaimantInformation_ZIP(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation_ZIP));
		return element;
	}

	public static WebElement ClaimantInformation__CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation__CloseBtn));
		return element;
	}

	public static WebElement ClaimantInformation__DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimantInformation__DeleteBtn));
		return element;
	}

	// Financial Data

	static String FinancialData_InsurerOSMedicalBIComp = "//input[@id='cntrlClaim_txtInsOSMedBIComp']";
	static String FinancialData_InsurerPaidMedicalBIComp = "//input[@id='cntrlClaim_txtInsPaidMedBIComp']";
	static String FinancialData_RecoveryreceivedMedicalBIComp = "//input[@id='cntrlClaim_txtRecoveryRecMedBIComp']";
	static String FinancialData_InsurerOSIndemnityPDColl = "//input[@id='cntrlClaim_txtInsOSIndemnityPDColl']";
	static String FinancialData_InsurerpaidIndemnityPDColl = "//input[@id='cntrlClaim_txtInsPaidIndemnityPDColl']";
	static String FinancialData_RecoveryRecievedIndemnityPDColl = "//input[@id='cntrlClaim_txtRecoveryRecIndemnityPDColl']";
	static String FinancialData_InsurerOSExpense = "//input[@id='cntrlClaim_txtInsOSExpense']";
	static String FinancialData_InsurerpaidExpense = "//input[@id='cntrlClaim_txtInsPaidExpense']";
	static String FinancialData_RecoveryReceivedExpense = "//input[@id='cntrlClaim_txtRecoveryRecExpense']";
	static String FinancialData_InsurerOSLegal = "//input[@id='cntrlClaim_txtInsOSLegal']";
	static String FinancialData_InsurerPaidLegal = "//input[@id='cntrlClaim_txtInsPaidLegal']";
	static String FinancialData_NetpaidTotal = "//input[@id='cntrlClaim_txtNetPaidTotal']";
	static String FinancialData_ClaimAmount = "//input[@id='cntrlClaim_txtClaimAmount']";
	static String FinancialData_markasConfirmedChkBox = "//input[@id='cntrlClaim_chkConfirm']";
	static String FinancialData_ActionNotes = "//textarea[@id='cntrlClaim_txtActionNotes']";
	static String FinancialData_BackBtn = "//input[@id='cntrlClaim_btnBack']";
	static String FinancialData_SaveBtn = "//input[@id='cntrlClaim_btnSave']";
	static String FinancialData_SaveandCloseBtn = "//input[@id='cntrlClaim_btnSaveAndClose']";
	static String FinancialData_InjuryDamage_CloseBtn = "//button[@id='btnClose']";
	static String FinancialData_DeleteBtn = "//button[@id='cntrlClaim_btnDeleteClaim']";
	static String FinancialData_SaveandContinueBtn = "//input[@id='cntrlClaim_btnSaveAndContinue']";
	
	static String FinancialDataFeildsList ="//div[@id='cntrlClaim_divFinancialData']//div[@class='title']/../input";
	
	public static List<WebElement> FinancialDataFeildsList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(FinancialDataFeildsList));
		return listElement;
	}
	

	public static WebElement FinancialData_InsurerOSMedicalBIComp(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerOSMedicalBIComp));
		return element;
	}

	public static WebElement FinancialData_InsurerPaidMedicalBIComp(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerPaidMedicalBIComp));
		return element;
	}

	public static WebElement FinancialData_RecoveryreceivedMedicalBIComp(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_RecoveryreceivedMedicalBIComp));
		return element;
	}

	public static WebElement FinancialData_InsurerOSIndemnityPDColl(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerOSIndemnityPDColl));
		return element;
	}

	public static WebElement FinancialData_InsurerpaidIndemnityPDColl(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerpaidIndemnityPDColl));
		return element;
	}

	public static WebElement FinancialData_RecoveryRecievedIndemnityPDColl(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_RecoveryRecievedIndemnityPDColl));
		return element;
	}

	public static WebElement FinancialData_InsurerOSExpense(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerOSExpense));
		return element;
	}

	public static WebElement FinancialData_RecoveryReceivedExpense(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_RecoveryReceivedExpense));
		return element;
	}

	public static WebElement FinancialData_InsurerpaidExpense(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerpaidExpense));
		return element;
	}

	public static WebElement FinancialData_InsurerOSLegal(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerOSLegal));
		return element;
	}

	public static WebElement FinancialData_InsurerPaidLegal(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InsurerPaidLegal));
		return element;
	}

	public static WebElement FinancialData_NetpaidTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_NetpaidTotal));
		return element;
	}

	public static WebElement FinancialData_ClaimAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_ClaimAmount));
		return element;
	}

	public static WebElement FinancialData_markasConfirmedChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_markasConfirmedChkBox));
		return element;
	}

	public static WebElement FinancialData_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_SaveandCloseBtn));
		return element;
	}

	public static WebElement FinancialData_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_BackBtn));
		return element;
	}

	public static WebElement FinancialData_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_SaveBtn));
		return element;
	}

	public static WebElement FinancialData_SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_SaveandContinueBtn));
		return element;
	}

	public static WebElement FinancialData_InjuryDamage_CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_InjuryDamage_CloseBtn));
		return element;
	}

	public static WebElement FinancialData_ActionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_ActionNotes));
		return element;
	}

	public static WebElement FinancialData_DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(FinancialData_DeleteBtn));
		return element;
	}

	// Other Information
	static String Other_Information_PreparedByTitile = "//input[@id='cntrlClaim_txtPreparedByTitle']";
	static String Other_Information_PreparedByFirstname = "//input[@id='cntrlClaim_txtPreparedByFirstName']";
	static String Other_Information_PreparedByLastName = "//input[@id='cntrlClaim_txtPreparedByLastName']";
	static String Other_Information_PreparedByEmail = "//input[@id='cntrlClaim_txtPreparedByEmail']";
	static String Other_Information_PreparedByTelephone = "//input[@id='cntrlClaim_txtPreparedByTelephone']";
	static String Other_Information_UploadDocument = "//div[contains(text(),'Drop files here or click to upload.')]";
	static String Other_Information_MarkasConfirmedChkBox = "//input[@id='cntrlClaim_chkConfirm']";
	static String Other_Information_ActionNotes = "//textarea[@id='cntrlClaim_txtActionNotes']";
	static String Other_Information_BackBtn = "//input[@id='cntrlClaim_btnBack']";
	static String Other_Information_SaveBtn = "//input[@id='cntrlClaim_btnSave']";
	static String Other_Information_SaveandCloseBtn = "//input[@id='cntrlClaim_btnSaveAndClose']";
	static String Other_Information_InjuryDamage_CloseBtn = "//button[@id='btnClose']";
	static String Other_Information_DeleteBtn = "//button[@id='cntrlClaim_btnDeleteClaim']";
	static String Other_Information_SaveandSendEmaiBtn = "//input[@id='cntrlClaim_btnSaveAndSendEmail']";

	public static WebElement Other_Information_SaveandSendEmaiBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_SaveandSendEmaiBtn));
		return element;
	}

	public static WebElement Other_Information_PreparedByTitile(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_PreparedByTitile));
		return element;
	}

	public static WebElement Other_Information_PreparedByFirstname(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_PreparedByFirstname));
		return element;
	}

	public static WebElement Other_Information_PreparedByLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_PreparedByLastName));
		return element;
	}

	public static WebElement Other_Information_PreparedByEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_PreparedByEmail));
		return element;
	}

	public static WebElement Other_Information_PreparedByTelephone(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_PreparedByTelephone));
		return element;
	}

	public static WebElement Other_Information_UploadDocument(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_UploadDocument));
		return element;
	}

	public static WebElement Other_Information_MarkasConfirmedChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_MarkasConfirmedChkBox));
		return element;
	}

	public static WebElement Other_Information_ActionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_ActionNotes));
		return element;
	}

	public static WebElement Other_Information_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_BackBtn));
		return element;
	}

	public static WebElement Other_Information_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_SaveBtn));
		return element;
	}

	public static WebElement Other_Information_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_SaveandCloseBtn));
		return element;
	}

	public static WebElement Other_Information_InjuryDamage_CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_InjuryDamage_CloseBtn));
		return element;
	}

	public static WebElement Other_Information_DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Other_Information_DeleteBtn));
		return element;
	}

}
