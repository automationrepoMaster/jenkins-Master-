package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectProgram = "//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']";
			//"//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']//label[@class='select2-offscreen']";
	static String selectProgramSearchBox = "//input[@id='s2id_autogen4_search']";
	static String selectProgramDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list
	
	static String selectProject = "//div[@id='s2id_cntrlAddUpdateContractor_ddlWorkSite']";
	static String selectProjectSearchBox ="//input[@id='s2id_autogen5_search']";
	static String selectProjectDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";//list

	static String selectTrade ="//div[@id='s2id_cntrlAddUpdateContractor_ddlTrade']";
	static String selectTradeSearchBox = "//input[@id='s2id_autogen8_search']";//this xpath work for dev
//			"//input[@id='s2id_autogen7_search']";//this xpath work for beta
	static String selectTradeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";
	static String addNewTradeLink ="//div[@id='cntrlAddUpdateContractor_divAddTrade']//a[@class='alinkText'][contains(text(),'click here to add')]";
	
	static String selectUpperTierContractor ="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorUpperTier']";
	static String selectUpperTierContractorSearchBox = "//div[@id='select2-drop']//div[@class='select2-search']//input";
	static String selectUpperTierContractorDropdownAutocomplete = "//ul[@id='select2-results-9']/li[*]";// list

	static String selectContractor = "//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
			//"//ul[@class='token-input-list-facebook']";
//			"//div[@id='cntrlAddUpdateContractor_divContractor']/ul/li/input[@type='text']";
//			"//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
	static String editSelectedContractorLink = "//a[@id='aEditContractors']";
	static String addNewContractorLink = "//a[@id='aContractorPackages']";
	
	static String SelectContact = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContacts']";
	static String SelectContactSearchBox ="//input[@id='s2id_autogen6_search']";
	static String SelectContactAutoCompllete =	"//input[@id='s2id_autogen6_search']/../../ul/li[*]"; 
//			"//input[@id='s2id_autogen6_search']/../../ul/li[*]";
	
	static String selectEnrollmentType="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorType']";
	static String selectEnrollmentTypeSearchBox = "//input[@id='s2id_autogen7_search']";
	//below xpath is use while adding cp from project level 
	static String selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel ="//div[@id='select2-drop']//div[@class='select2-search']/input[contains(@id,'s2id_autogen')]";
	static String selectEnrollmentTypeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";//list
	static String selectOffsiteInsuranceCompliance = "//select[@id='cntrlAddUpdateContractor_ddlCompliance']";
	static String clickHereToComplianceLink = "//a[contains(text(),'click here to add Compliance)')]";
	static String btnNext = "//input[@id='cntrlAddUpdateContractor_btnNext']";
	static String alertConfirmComplianceContinueBtn="//button[@id='btnSaveModal']";
	
	static String non_CIP_Compliance="//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']";
	static String selectCompliance="//ul[@id='select2-results-1']/li[*]";
			//"//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']/../div[2]/select";
	
	static String saveAndCloseBtn ="//input[@id='cntrlAddUpdateContractor_btnSaveandClose']";
	static String sendEmailCloseBtn = "//button[@id='btnCloseWindow']";
	static String sendEmailSendAndCloseBtn = "//input[@id='btnSend']";
	static String cancelContractorPkgBtn ="//input[@id='cntrlAddUpdateContractor_btncancel']";
	static String cancelContractorPkgBtnAlertOKBtn ="//button[@id='btnSaveModal']";
	static String cancelContractorPkgBtnAlertCancelBtn ="//button[@id='btnCloseModal']";
	
	
	//Payroll Mode
	
	static String moreBtn ="//a[@id='divAdvance']";
	static String selectPayrollSubmissionFrequency ="//select[@id='cntrlAddUpdateContractor_ddlFrequency']";
	static String selectreportedTimePeriod="//select[@id='cntrlAddUpdateContractor_ddlReporting']";
	
	public static WebElement moreBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(moreBtn));
		return element;
	}
	public static WebElement selectPayrollSubmissionFrequency(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollSubmissionFrequency));
		return element;
	}public static WebElement selectreportedTimePeriod(WebDriver driver) {
		element = driver.findElement(By.xpath(selectreportedTimePeriod));
		return element;
	}
	
	public static WebElement saveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtn));
		return element;
	}
	public static WebElement cancelContractorPkgBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtn));
		return element;
	}
	public static WebElement cancelContractorPkgBtnAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertOKBtn));
		return element;
	}
	public static WebElement cancelContractorPkgBtnAlertCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertCancelBtn));
		return element;
	}
	public static WebElement selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel));
		return element;
	}
	public static WebElement addNewTradeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewTradeLink));
		return element;
	}
	
	public static WebElement SelectContact(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectContact));
		return element;
	}
	
	public static WebElement SelectContactSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectContactSearchBox));
		return element;
	}
	public static List<WebElement> SelectContactAutoCompllete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(SelectContactAutoCompllete));
		return listElement;
	}
	
	public static WebElement selectProgramSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramSearchBox));
		return element;
	}
	
	public static WebElement selectProjectSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectSearchBox));
		return element;
	}
	public static WebElement selectTradeSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTradeSearchBox));
		return element;
	}
	public static WebElement selectEnrollmentTypeSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBox));
		return element;
	}
	public static WebElement selectEnrollmentType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentType));
		return element;
	}
	
	
	public static WebElement selectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgram));
		return element;
	}

	public static List<WebElement> selectProgramDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectProject(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProject));
		return element;
	}

	public static List<WebElement> selectProjectDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProjectDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTrade));
		return element;
	}

	public static List<WebElement> selectTradeDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectTradeDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectUpperTierContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUpperTierContractor));
		return element;
	}
	public static WebElement selectUpperTierContractorSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUpperTierContractorSearchBox));
		return element;
	}

	public static List<WebElement> selectUpperTierContractorDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectUpperTierContractorDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractor));
		return element;
	}

	public static List<WebElement> selectEnrollmentTypeDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectEnrollmentTypeDropdownAutocomplete));
		return listElement;
	}

	public static WebElement editSelectedContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(editSelectedContractorLink));
		return element;
	}

	public static WebElement addNewContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContractorLink));
		return element;
	}

	public static WebElement selectOffsiteInsuranceCompliance(WebDriver driver) {
		element = driver.findElement(By.xpath(selectOffsiteInsuranceCompliance));
		return element;
	}

	public static WebElement clickHereToComplianceLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereToComplianceLink));
		return element;
	}

	public static WebElement btnNext(WebDriver driver) {
		element = driver.findElement(By.xpath(btnNext));
		return element;
	}

	public static WebElement sendEmailCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailCloseBtn));
		return element;
	}

	public static WebElement sendEmailSendAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailSendAndCloseBtn));
		return element;
	}
	
	public static WebElement alertConfirmComplianceContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(alertConfirmComplianceContinueBtn));
		return element;
	}
	public static WebElement non_CIP_Compliance(WebDriver driver) {
		element = driver.findElement(By.xpath(non_CIP_Compliance));
		return element;
	}
	public static List<WebElement> selectCompliance(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectCompliance));
		return listElement;
	}
	
	// Raja wrote this from Contractor Package page
	
	static String CP_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnCP']//a[@id='ctl00_ContentPlaceHolder1_aCP']";
	static String plus_Btn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liadd']/a/i";
	static String Edit_Btn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liedit']";
	static String Delete_Btn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_lidelete']";
	static String search_Bar = "//input[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_txtSearch']";
	static String search_Bar_btn = "//a[@href='javascript:void(0);']//i[@class='fa fa-search']";
	static String Adv_search_Btn = "//a[@data-original-title='Advanced Search']/i";
	static String View_Project_Details_Btn = "//div[@class='rightButtonGroup']//li[2]//a[1]//i[1]";
	static String Refresh_Btn = "//*[@class='rightButtonGroup']//li[4]//a[1]//i[1]";
	static String Staus_List = "//div[@class='statusType']//div//span";
	static String CPackages_List = "//ul[@id='ui-id-1']//li[contains(text(),'Shelly')]";

	String Company = "Roger Federer";
	String program = "RAUTOMATION123";
	String status = "Enrolled";
	
	
	public static WebElement CP_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(CP_Icon));
		return element;
	}

	public static WebElement plus_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(plus_Btn));
		return element;
	}

	public static WebElement Edit_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Edit_Btn));
		return element;
	}

	public static WebElement Delete_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Delete_Btn));
		return element;
	}

	public static WebElement search_Bar(WebDriver driver) {
		element = driver.findElement(By.xpath(search_Bar));
		return element;
	}

	public static WebElement search_Bar_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(search_Bar_btn));
		return element;
	}

	public static WebElement Adv_search_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Adv_search_Btn));
		return element;
	}

	public static WebElement View_Project_Details_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(View_Project_Details_Btn));
		return element;
	}

	public static WebElement Refresh_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Refresh_Btn));
		return element;
	}

	public static WebElement Staus_List(WebDriver driver) {
		element = driver.findElement(By.xpath(Staus_List));
		return element;
	}
	
	// Raja wrote this from contractor package status validations apge
	
	
	static String contractorName = "Mark Boucher";
	static String projectName = "Hercules PJ";
	static String tradeNo = "2085 | TradeDynamic-";

	
	static String plusBtn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liadd']//i[@class='fa fa-plus']"; // a/i[@class='fa
	static String EditBrn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liedit']/a/i[@class='fa fa-pencil-square-o']";
	// fa-plus']";
	static String DeleteBtn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_lidelete']/a/i[@class='fa fa-trash-o']";
	//static String selectProgram = "//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']";
	// "//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']//label[@class='select2-offscreen']";
	//static String selectProgramSearchBox = "//input[@id='s2id_autogen4_search']";
	//static String selectProgramDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	//static String selectProject = "//div[@id='s2id_cntrlAddUpdateContractor_ddlWorkSite']";
	//static String selectProjectSearchBox = "//input[@id='s2id_autogen5_search']";
	//static String selectProjectDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	//static String selectTrade = "//div[@id='s2id_cntrlAddUpdateContractor_ddlTrade']";
	//static String selectTradeSearchBox = "//input[@id='s2id_autogen8_search']";// this xpath work for dev
//				"//input[@id='s2id_autogen7_search']";//this xpath work for beta
	//static String selectTradeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";
	//static String addNewTradeLink = "//div[@id='cntrlAddUpdateContractor_divAddTrade']//a[@class='alinkText'][contains(text(),'click here to add')]";

	//static String selectUpperTierContractor = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorUpperTier']";
	//static String selectUpperTierContractorSearchBox = "//div[@id='select2-drop']//div[@class='select2-search']//input";
	//static String selectUpperTierContractorDropdownAutocomplete = "//ul[@id='select2-results-9']/li[*]";// list
	static String UpperTierContractorlist = "//ul[@id='select2-results-15']/li";
	//static String selectContractor = "//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
	// "//ul[@class='token-input-list-facebook']";
//				"//div[@id='cntrlAddUpdateContractor_divContractor']/ul/li/input[@type='text']";
//				"//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
	//static String editSelectedContractorLink = "//a[@id='aEditContractors']";
	//static String addNewContractorLink = "//a[@id='aContractorPackages']";

	//static String SelectContact = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContacts']";
	//static String SelectContactSearchBox = "//input[@id='s2id_autogen6_search']";
	//static String SelectContactAutoCompllete = "//input[@id='s2id_autogen6_search']/../../ul/li[*]";
//				"//input[@id='s2id_autogen6_search']/../../ul/li[*]";
    static String PreBidContractorPkgs="//li[@id='ctl00_ctrlMenu_liPreBidContracts']";
	//static String selectEnrollmentType = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorType']";
	//static String selectEnrollmentTypeSearchBox = "//input[@id='s2id_autogen7_search']";
	// below xpath is use while adding cp from project level
	//static String selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel = "//div[@id='select2-drop']//div[@class='select2-search']/input[contains(@id,'s2id_autogen')]";

	//static String selectEnrollmentTypeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	//static String selectOffsiteInsuranceCompliance = "//select[@id='cntrlAddUpdateContractor_ddlCompliance']";
	//static String clickHereToComplianceLink = "//a[contains(text(),'click here to add Compliance)')]";
	//static String btnNext = "//input[@id='cntrlAddUpdateContractor_btnNext']";
	//static String alertConfirmComplianceContinueBtn = "//*[@class='btn btn-success pull-right'  and @id='btnSaveModal']";

	//static String non_CIP_Compliance = "//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']";
	static String non_CIP_ComplianceList = "//div[@id='uniform-cntrlAddUpdateContractor_ddlCompliance']//select//../option";
	// "//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']/../div[2]/select";
	static String nonCIPCompliancename = "//div[@class='select2-drop select2-display-none select2-drop-active']//ul//li//div[contains(text(),'Hercules-Non-CIP')]"; // ul[@id='select2-results-1']//li//div[@class]//span[@class]
	// ul[@id='select2-results-1']/li"; //ul[@id='select2-results-1']/li[2]";
	static String ContarctorpkgsaveAndCloseBtn = "//input[@id='cntrlAddUpdateContractor_btnSaveandClose']";
	//static String sendEmailCloseBtn = "//button[@id='btnCloseWindow']";
	//static String sendEmailSendAndCloseBtn = "//input[@id='btnSend']";
	//static String cancelContractorPkgBtn = "//input[@id='cntrlAddUpdateContractor_btncancel']";
	//static String cancelContractorPkgBtnAlertOKBtn = "//button[@id='btnSaveModal']";
	//static String cancelContractorPkgBtnAlertCancelBtn = "//button[@id='btnCloseModal']";
	static String StatusesList_Enrollment = "//div[@class='col-md-12 clearfix']//ul//li";
	static String Enrollment_frame = "//iframe[@id='ifrmPreview']";
	static String CompletionNoticeFrameLink = "//a[@id='aCompletionNotice']";
	static String SelectPayrollperiod = "//select[@id='cntrlMissingPayroll_ddlPayrollMonths']";
	static String InsurancePagelink = "//a[@id='aInsuranceEnrollment']";
	static String MoreBtnContractorPackage = "//a//span//i[@class='marg-right-10 fa fa-caret-down' or 'marg-right-10 fa fa-caret-up']";
	static String ContractorPKgMinimumRequirementsSwitch = "//div[@id='uniform-cntrlAddUpdateContractor_chkConditionalEnrollment']//div[@class='ios-ui-select checked' or 'ios-ui-select']";
	static String ContractorPKgContractNumber = "//input[@id='cntrlAddUpdateContractor_txtContractNumber']";
	static String ContractorPkgEstimatedStartDate = "//input[@id='cntrlAddUpdateContractor_txtStartDate']";
	static String ContractorPkgContractStatusDropdown="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractStatus']";
	static String ContractorPkgContractorTypeDropdown="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractType']";
	static String ContractorPkgContractTypeList = "//ul[@id='select2-results-2']//li[*]";
	static String ContractorPkgContractStatusList = "//ul[@id='select2-results-3']//li[*]";
	static String ContractorPkgContractStatusList_NotAwarded="//ul[@id='select2-results-3']//li[2]";
	static String ContractorPkgBrieflyDescribeTheScope = "//textarea[@id='cntrlAddUpdateContractor_txtBriefDescription']";
	static String ContractorPkgNotes = "//textarea[@id='cntrlAddUpdateContractor_txtCommentsOrNotes']";
	static String ContractorPkgPayRollCvSubmission = "//select[@id='cntrlAddUpdateContractor_ddlFrequency']";
	static String ContractorPkgReportingTimePeriod = "//select[@id='cntrlAddUpdateContractor_ddlReporting']";
	static String ContractorPkgDuedate = "//input[@id='cntrlAddUpdateContractor_txtDueDate']";
	static String PrebidContractorPkgs="//a[@id='ctl00_ctrlMenu_aPostCP']";
    static String Contractorpkgsbtn ="//a[@id='ctl00_ctrlMenu_aCP']";
	// Payroll Add
	static String PayrollLink = "//a[@id='aMonthlyPayroll']";
	static String PayrollClasscodeHoursfeild = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_HoursText']";
	static String PayrollClasscodeUncappedpayroll = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_PayrollText']";
	static String PayrollAgreeTermsandConditions = "//input[@id='cntrlMissingPayroll_chkPayrollSubmit']";
	static String PayrollMarkasconfirmedBtn = "//input[@id='cntrlMissingPayroll_chkConfirmation']";
	static String PayrollLockThispayrollBtn = "//input[@id='cntrlMissingPayroll_chkLockPayroll']";
	static String PayrollFlagThispage = "//input[@id='cntrlMissingPayroll_ChkAction']";
	static String PayrollFinalpayrollBtn = "//input[@id='cntrlMissingPayroll_chkFinalPayroll']";
	static String PayrollSaveBtn = "//input[@id='cntrlMissingPayroll_btnSave']";
	static String PayrollSaveandcloseBtn = "//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	static String ContinuefornxtmnthBtn = "//input[@id='cntrlMissingPayroll_btnContinueWithoutSending']";
	static String PayrollCloseBtn = "//button[@id='cntrlMissingPayroll_divClose']";

	// Certificates frame

	static String CertificatesLink = "//a[@id='aCertificates']";
	static String CertificatesAutoGenerate = "//a[@id='btnGenerateCertificate']";
	static String CertificatesManage = "//a[@id='aCertificateAutoManage']";
	static String viewCertificatesAutoGenerate = "//input[@id='cntrlViewCertificates_btnGenerateCertificate']";
	static String viewCertificatesManuallyGenerate = "//a[@id='cntrlViewCertificates_aAddCertificates']";
	static String ViewCertificatesFrame = "//iframe[@name='_iframe-EmailBox12']";
	static String ViewCertificatesGLPolicyNumber = "//input[@id='txtGLPolicyNumber']";
	static String ViewCertificatesExcessUmbrellaPolicyNumber = "//input[@id='rptUMBList_ctl00_txtUMBPolicyNumberNew']";
	static String ViewCertificatesWcPolicyNumber = "//input[@id='txtWCPolicyNumber']";
	static String ViewCertificatesaveandClosebtn = "//input[@id='btnSavePolicyNumber']";
	static String ViewCertificatesFinishandCloseBtn = "//button[@id='cntrlViewCertificates_btnFinishandClose']";

	// Completion Notice

	static String CompletionNoticeSelectCompletionDate = "//input[@id='cntrlCompletionNotice_TxtCloseoutDate']";
	static String CompletionNoticeSaveBtn = "//input[@id='cntrlCompletionNotice_BtnSubmit']";
	static String CompletionNoticemarkasConfirmedBtn = "//input[@id='cntrlCompletionNotice_chkConfirm']";
	static String CompletionNoticeFlagThispage = "//input[@id='cntrlCompletionNotice_chkAction']";
	static String CompletionNoticeTermsandConditionspage = "//input[@id='cntrlCompletionNotice_chkAgree']";
	static String CompletionNoticesaveandContinueBtn = "//input[@id='cntrlCompletionNotice_btnSaveandClose']";
	static String CompletionNoticeAlertOkBtn = "//button[@id='btnOKCompletionModel']";
    static String ReturnBackLink ="//a[@id='aBack']";
    static String ReturnHomeLink ="//a[text()='Return to the homepage ']";
    static String GLUmbrellapageLink ="//a[@id='aGLUmbrellaCoverage']";
    
    
    public static WebElement Contractorpkgsbtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractorpkgsbtn));
		return element;
	}
    public static WebElement GLUmbrellapageLink(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellapageLink));
		return element;
	}
    public static WebElement PreBidContractorPkgs(WebDriver driver) {
		element = driver.findElement(By.xpath(PreBidContractorPkgs));
		return element;
	}
    public static WebElement ContractorPkgContractStatusList_NotAwarded(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractStatusList_NotAwarded));
		return element;
	}
    public static WebElement ReturnBackLink(WebDriver driver) {
		element = driver.findElement(By.xpath(ReturnBackLink));
		return element;
	}
	public static WebElement ContractorPKgMinimumRequirementsSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPKgMinimumRequirementsSwitch));
		return element;
	}
	
	public static List<WebElement> PrebidContractorPkgs(WebDriver driver) {
		listElement = driver.findElements(By.xpath(PrebidContractorPkgs));
		return listElement;
	}
	public static List<WebElement> ContractorPkgContractTypeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContractorPkgContractTypeList));
		return listElement;
	}
	public static List<WebElement> ContractorPkgContractStatusList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContractorPkgContractStatusList));
		return listElement;
	}
	public static WebElement ContractorPkgDuedate(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgDuedate));
		return element;
	}

	public static WebElement ContractorPkgContractorTypeDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractorTypeDropdown));
		return element;
	}

	public static WebElement ContractorPkgContractStatusDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractStatusDropdown));
		return element;
	}

	public static WebElement ContractorPkgReportingTimePeriod(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgReportingTimePeriod));
		return element;
	}

	public static WebElement ContractorPkgPayRollCvSubmission(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgPayRollCvSubmission));
		return element;
	}

	public static WebElement ContractorPkgNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgNotes));
		return element;
	}

	public static WebElement ContractorPkgBrieflyDescribeTheScope(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgBrieflyDescribeTheScope));
		return element;
	}

	public static WebElement ContractorPkgEstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgEstimatedStartDate));
		return element;
	}

	public static WebElement ContractorPKgContractNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPKgContractNumber));
		return element;
	}

	public static WebElement PayrollCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollCloseBtn));
		return element;
	}

	public static WebElement CompletionNoticeAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeAlertOkBtn));
		return element;
	}

	public static WebElement CompletionNoticesaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticesaveandContinueBtn));
		return element;
	}

	public static WebElement CompletionNoticeTermsandConditionspage(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeTermsandConditionspage));
		return element;
	}

	public static WebElement CompletionNoticeFlagThispage(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeFlagThispage));
		return element;
	}

	public static WebElement CompletionNoticemarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticemarkasConfirmedBtn));
		return element;
	}

	public static WebElement CompletionNoticeSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeSaveBtn));
		return element;
	}

	public static WebElement CompletionNoticeSelectCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeSelectCompletionDate));
		return element;
	}

	public static WebElement CompletionNoticeFrameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeFrameLink));
		return element;
	}

	public static WebElement ViewCertificatesFinishandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesFinishandCloseBtn));
		return element;
	}

	public static WebElement ViewCertificatesGLPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesGLPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesExcessUmbrellaPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesExcessUmbrellaPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesWcPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesWcPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesaveandClosebtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesaveandClosebtn));
		return element;
	}

	public static WebElement ViewCertificatesFrame(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesFrame));
		return element;
	}

	public static WebElement viewCertificatesAutoGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(viewCertificatesAutoGenerate));
		return element;
	}

	public static WebElement viewCertificatesManuallyGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(viewCertificatesManuallyGenerate));
		return element;
	}

	public static WebElement CertificatesLink(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesLink));
		return element;
	}

	public static WebElement CertificatesManage(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesManage));
		return element;
	}

	public static WebElement CertificatesAutoGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesAutoGenerate));
		return element;
	}

	public static WebElement PayrollSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollSaveBtn));
		return element;
	}

	public static WebElement PayrollSaveandcloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollSaveandcloseBtn));
		return element;
	}

	public static WebElement ContinuefornxtmnthBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContinuefornxtmnthBtn));
		return element;
	}

	public static WebElement PayrollFlagThispage(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollFlagThispage));
		return element;
	}

	public static WebElement PayrollFinalpayrollBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollFinalpayrollBtn));
		return element;
	}

	public static WebElement PayrollClasscodeHoursfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollClasscodeHoursfeild));
		return element;
	}

	public static WebElement PayrollClasscodeUncappedpayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollClasscodeUncappedpayroll));
		return element;
	}

	public static WebElement PayrollAgreeTermsandConditions(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollAgreeTermsandConditions));
		return element;
	}

	public static WebElement PayrollMarkasconfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollMarkasconfirmedBtn));
		return element;
	}

	public static WebElement PayrollLockThispayrollBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollLockThispayrollBtn));
		return element;
	}

	public static WebElement SelectPayrollperiod(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectPayrollperiod));
		return element;
	}

	public static WebElement nonCIPCompliancename(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(
				"//div[@class='select2-drop select2-display-none select2-drop-active']//ul//li//div[contains(text(),'"
						+ text + "')]"));
		return element;
	}

	public static WebElement PayrollLink(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollLink));
		return element;
	}

	public static WebElement DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtn));
		return element;
	}

	public static WebElement EditBrn(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBrn));
		return element;
	}

	public static WebElement MoreBtnContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(MoreBtnContractorPackage));
		return element;
	}

	public static WebElement InsurancePagelink(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurancePagelink));
		return element;
	}

	public static WebElement Enrollment_frame(WebDriver driver) {
		element = driver.findElement(By.xpath(Enrollment_frame));
		return element;
	}

	public static List<WebElement> StatusesList_Enrollment(WebDriver driver) {
		listElement = driver.findElements(By.xpath(StatusesList_Enrollment));
		return listElement;
	}

	public static List<WebElement> UpperTierContractorlist(WebDriver driver) {
		listElement = driver.findElements(By.xpath(UpperTierContractorlist));
		return listElement;
	}

	public static WebElement plusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(plusBtn));
		return element;
	}

	public static WebElement ContarctorpkgsaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContarctorpkgsaveAndCloseBtn));
		return element;
	}

//	public static WebElement cancelContractorPkgBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(cancelContractorPkgBtn));
//		return element;
//	}
//
//	public static WebElement cancelContractorPkgBtnAlertOKBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertOKBtn));
//		return element;
//	}
//
//	public static WebElement cancelContractorPkgBtnAlertCancelBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertCancelBtn));
//		return element;
//	}

//	public static WebElement selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel));
//		return element;
//	}

//	public static WebElement addNewTradeLink(WebDriver driver) {
//		element = driver.findElement(By.xpath(addNewTradeLink));
//		return element;
//	}
//
//	public static WebElement SelectContact(WebDriver driver) {
//		element = driver.findElement(By.xpath(SelectContact));
//		return element;
//	}
//
//	public static WebElement SelectContactSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(SelectContactSearchBox));
//		return element;
//	}
//
//	public static List<WebElement> SelectContactAutoCompllete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(SelectContactAutoCompllete));
//		return listElement;
//	}
//
//	public static WebElement selectProgramSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectProgramSearchBox));
//		return element;
//	}

//	public static WebElement selectProjectSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectProjectSearchBox));
//		return element;
//	}

//	public static WebElement selectTradeSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectTradeSearchBox));
//		return element;
//	}

//	public static WebElement selectEnrollmentTypeSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBox));
//		return element;
//	}

//	public static WebElement selectEnrollmentType(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectEnrollmentType));
//		return element;
//	}

//	public static WebElement selectProgram(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectProgram));
//		return element;
//	}

//	public static List<WebElement> selectProgramDropdownAutocomplete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(selectProgramDropdownAutocomplete));
//		return listElement;
//	}

//	public static WebElement selectProject(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectProject));
//		return element;
//	}

//	public static List<WebElement> selectProjectDropdownAutocomplete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(selectProjectDropdownAutocomplete));
//		return listElement;
//	}

//	public static WebElement selectTrade(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectTrade));
//		return element;
//	}

//	public static List<WebElement> selectTradeDropdownAutocomplete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(selectTradeDropdownAutocomplete));
//		return listElement;
//	}

//	public static WebElement selectUpperTierContractor(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectUpperTierContractor));
//		return element;
//	}

//	public static WebElement selectUpperTierContractorSearchBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectUpperTierContractorSearchBox));
//		return element;
//	}

//	public static List<WebElement> selectUpperTierContractorDropdownAutocomplete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(selectUpperTierContractorDropdownAutocomplete));
//		return listElement;
//	}

//	public static WebElement selectContractor(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectContractor));
//		return element;
//	}

//	public static List<WebElement> selectEnrollmentTypeDropdownAutocomplete(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(selectEnrollmentTypeDropdownAutocomplete));
//		return listElement;
//	}

//	public static WebElement editSelectedContractorLink(WebDriver driver) {
//		element = driver.findElement(By.xpath(editSelectedContractorLink));
//		return element;
//	}
//
//	public static WebElement addNewContractorLink(WebDriver driver) {
//		element = driver.findElement(By.xpath(addNewContractorLink));
//		return element;
//	}

//	public static WebElement selectOffsiteInsuranceCompliance(WebDriver driver) {
//		element = driver.findElement(By.xpath(selectOffsiteInsuranceCompliance));
//		return element;
//	}

//	public static WebElement clickHereToComplianceLink(WebDriver driver) {
//		element = driver.findElement(By.xpath(clickHereToComplianceLink));
//		return element;
//	}

//	public static WebElement btnNext(WebDriver driver) {
//		element = driver.findElement(By.xpath(btnNext));
//		return element;
//	}

//	public static WebElement sendEmailCloseBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(sendEmailCloseBtn));
//		return element;
//	}

//	public static WebElement sendEmailSendAndCloseBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(sendEmailSendAndCloseBtn));
//		return element;
//	}

//	public static WebElement alertConfirmComplianceContinueBtn(WebDriver driver) {
//		element = driver.findElement(By.xpath(alertConfirmComplianceContinueBtn));
//		return element;
//	}

//	public static WebElement non_CIP_Compliance(WebDriver driver) {
//		element = driver.findElement(By.xpath(non_CIP_Compliance));
//		return element;
//	}

	public static List<WebElement> non_CIP_ComplianceList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(non_CIP_ComplianceList));
		return listElement;
	}

	static String AdvSearchBtn = "//div[@class='rightButtonGroup']//i[@class='fa fa-caret-down']";
	static String AdvSearchSelectprogramme = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlProject']";
	static String AdvSearchSelectproject = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlWorkSite']";
	static String AdvSearchSelectEnrollment = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlEnrollmentType']";
	static String AdvSearchContractorstatus = "//span[@class='fltr']/i[@class='fa fa-caret-down']";
	static String AdvSearch_SelectContractorStatus_List = "//div[@class='mutliSelect']/ul/li";
	static String Advsearch_ContractorStatusList_cp_chkBox = "//div[@class='titles']//div//span";
	static String AdvSearch_SearchBtn_down = "//input[@id='btnAdvanceSearch']";
	static String AdvanceSearch_SeeMore = "//a[@id='aSeeMore']";
	static String ContactsListDropdown = "//ul[@class='select2-results overflow-hidden']/li";
	static String statuslist_Enrollment = "//div[@class='top-bar-wrap clearfix']/ul/li[*]";
	static String statusList_Cpkg = "//div[@class='statusType']/div[1]";

	// CIP Agreement page
	static String CloseBtn_CIPAgreement = "//button[contains(text(),'Close')]";
	static String NextBtn_CIPAgreement = "//input[@id='cntrlContractorAggreement_btnNext']";
	static String CancelBtn_CIPAgreement = "//div[@class='ui-dialog-buttonset']//button[text()='Cancel']";
	static String OKBtn_CIPAgreement = "//div[@class='ui-dialog-buttonset']//button[text()='OK']";
	static String refreshBtn = "//a[@class='tipB']/i[@class='fa fa-refresh']";
	static String AdvSearchSearchContractor = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntrlContractorList_txt_Contractor']";
	static String ContractorNameLegalEntityName = "//input[@id='ctrlInsuranceEnrollment_txtContractorName']";
	static String ContractValue = "//input[@id='ctrlInsuranceEnrollment_txtContractPrice']";
	static String SelfperformedContractValue = "//input[@id='ctrlInsuranceEnrollment_txtSelfContractValue']";
	static String EstimatedUncappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtPayrolls']";
	static String EstimatedcappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtEstCapPayroll']";
	static String EstimatedManHours = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String EstimatedStartDate = "//input[@id='ctrlInsuranceEnrollment_txtStartDate']";
	static String BrieflyDescribetheScopeoftheWork = "//div/textarea[@id='ctrlInsuranceEnrollment_txtBrieflyDescribetheScopeWork']";
	static String workclassDropdown = "//div[@id='s2id_ctrlInsuranceEnrollment_DrpDnWClass']";
	static String WorkclassDropDownList = "//ul[@id='select2-results-1']/li[*]/.";
	static String WorkclassOKBtn = "//button[@id='btnYes']";
	static String WorkclassWorkHours = "//input[@id='ctrlInsuranceEnrollment_txtWCHours']";
	static String WorkclassPayRoll = "//input[@id='ctrlInsuranceEnrollment_txtWCPayroll']";
	static String WorkclassWCRate = "//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
	static String WorkclassAddworkclassBtn = "//input[@id='ctrlInsuranceEnrollment_btnAddWC']";
	static String InsuranceEnrollmentMarkasConfirmedBtn = "//input[@id='ctrlInsuranceEnrollment_rdoConfirm']";
	static String InsuranceEnrollmentPendingReviewBtn = "//input[@id='ctrlInsuranceEnrollment_rdoPendingReview']";
	static String InsuranceEnrollmentSaveandCloseBtn = "//input[@name='ctrlInsuranceEnrollment$btnSaveClose']";
	static String CancelBtn_ENrollment = "//div[@class='ui-dialog-buttonset']//button[text()='Cancel']";
	static String InsuranceEnrollmentSaveBtn = "//input[@name='ctrlInsuranceEnrollment$btnSave']";
	static String Enrollmentstatuslist = "//div[@class='top-bar-wrap clearfix']/ul/li/../li[*][1]";
	static String InsuranceEnrollmentSaveandContinueBtn = "//input[@name='ctrlInsuranceEnrollment$btnNext']";
	static String InsuranceEnrollmentEstimatedManHrs = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String InsuranceEnrollmentCloseBtn = "//button[@id='ctrlInsuranceEnrollment_divClose']";
	static String InsuranceEnrollmentConfirmandEnrolledBtn="//input[@id='ctrlInsuranceEnrollment_rdoConfirmEnrolled']";
	static String InsuranceEnrollmentNotifyCarrierBtn="//input[@id='ctrlInsuranceEnrollment_btnNotifyCarrier']";
	
	
	// button[@class='btn btn-success pull-right' and @id='btnSaveModal']

	// NonCIP

	static String NonCIPInsuranceCompanyname = "//input[@id='token-input-txtCarrier109']";
	static String NonCIPPolicyStartDate = "//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_startdatetimepicker']";
	static String NonCIPPolicyExpiryDate = "//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_enddatetimepicker']";
	static String NonCIPMarkasConfirmedBtn = "//input[@id='ctrlTrackComplianceContractor_rdoConfirm']";
	static String NonCIPPendingReviewBtn = "//input[@id='ctrlTrackComplianceContractor_rdoPendingReview']";
	static String NonCIPMarkasIncomplete = "//input[@id='ctrlTrackComplianceContractor_rdoMarkasComplete']";
	static String NonCIPFlagthispage = "//input[@id='ctrlTrackComplianceContractor_chkAction']";
	static String NonCIPsaveandCloseBtn = "//input[@id='ctrlTrackComplianceContractor_btnSaveCloseCompliance']";
	static String NonCIPsaveBtn = "//input[@id='ctrlTrackComplianceContractor_btnSaveCompliance']";
	static String NonCIPsaveandContinueBtn = "//input[@id='ctrlTrackComplianceContractor_btnNext']";
	static String NonCIP_frameLink = "//a[@id='aTrackingComplianceLimit']";
	static String NonCIPCloseBtn = "//div[@class='col-md-12 marg-bottom-10 clearfix']//button[@class='btn']";

	// WC Premium Modifications

	static String WcPremiumModificationsMarkasConfirmedBtn = "//input[@id='ctrlPremiumModes_rdoConfirm']";
	static String WcPremiumModificationsPendingReviewBtn = "//input[@id='ctrlPremiumModes_rdoPendingReview']";
	static String WcPremiumModificationsSaveaBtn = "//input[@name='ctrlPremiumModes$btnSave']";
	static String WcPremiumModificationssaveandCloseBtn = "//input[@name='ctrlPremiumModes$btnSaveClose']";
	static String WcPremiumModificationssaveandContinueBtn = "//input[@name='ctrlPremiumModes$btnNext']";
	static String WcPremiumModificationAmountBtn = "//input[@id='ctrlPremiumModes_txtWCLossCharge']";

	// GL &Umbrella Coverage

	static String GLUmbrellaGeneraLLibalityClasscodeSearcbox = "//div[@id='s2id_autogen3']";
	static String GLUmbrellaGeneraLLibalityClassCodeList = "//ul[@class='select2-results']/li[*]";
	static String GLUmbrellaUmbrellaLibalitysearchbox = "//div[@id='s2id_autogen5']";
	static String GLUmbrellaUmbrellaLibalityClasscodeList = "//ul[@id='select2-results-6']/li";
	static String GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox = "//div[@id='s2id_autogen7']";
	static String GLUmbrellaPolluctionchargeLiabilityclasscodeList = "//ul[@id='select2-results-8']/li";
	static String GLUmbrellaMarkasConfirmedButton = "//input[@id='rb-mark-as-confirmed']";
	static String GLUmbrellaPendingReviewBtn = "//input[@id='rb-pending-review']";
	static String GLUmbrellaMarkasCompleteBtn = "//input[@id='rb-mark-as-incomplete']";
	static String GLUmbrellaFlagthispageBtn = "//input[@class='chk-flag-this-page']";
	static String GLUmbrellasaveBtn = "//input[@class='btn btn-primary btn-save' and @value='Save']";
	static String GLUmbrellasaveandCloseBtn = "//input[@class='btn btn-primary btn-save' and @value='Save and Close']";
	static String GLUmbrellasaveandcontinueBtn = "//input[@class='btn btn-success btn-save' and @value='Save and Continue']";
	static String GLUmbrellaUmbrellaLibalitySeachBoxfeild = "//input[@id='s2id_autogen6_search']";
	static String GLUmbrellaGeneraLLibalitySeachBoxfeild = "//input[@id='s2id_autogen4_search']";
	static String GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild = "//input[@id='s2id_autogen8_search']";

	// Subcontractor
	static String SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No = "//button[@id='cntrSubContractor_btnNo']";
	static String SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes = "//button[@id='cntrSubContractor_btnYes']";
	static String SubcontractorSaveandContinueBtn = "//input[@id='cntrSubContractor_btnNext']";
	static String SubcontractorCloseBtn = "//button[@id='cntrSubContractor_divClose']";
	static String SubContractorFrameLink = "//a[@id='aSubContractorList']";

	// Enrollment sumary

	static String EnrollmentsummaryAgreeChkBox = "//input[@id='ctl20_chkContractDocument']";
	static String EnrollmentsummaryPrintBtn = "//input[@id='ctl20_btnPrint']";
	static String EnrollmentsummaryConfirmandContinueBtn = "//input[@id='ctl20_btnNext']";
	static String EnrollmentsummaryNoLossStatementchkBox = "//input[@id='ctrlLossLetter_chkContractDocument']";
	static String EnrollmentsummaryNoLossStatementConfirmandContinueBtn = "//input[@id='ctrlLossLetter_btnNext']";
	
	
	public static WebElement InsuranceEnrollmentNotifyCarrierBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentNotifyCarrierBtn));
		return element;
	}
	public static WebElement InsuranceEnrollmentConfirmandEnrolledBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentConfirmandEnrolledBtn));
		return element;
	}
	
	public static WebElement NonCIPCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPCloseBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentCloseBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryNoLossStatementchkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryNoLossStatementchkBox));
		return element;
	}

	public static WebElement EnrollmentsummaryNoLossStatementConfirmandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryNoLossStatementConfirmandContinueBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryConfirmandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryConfirmandContinueBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryPrintBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryPrintBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryAgreeChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryAgreeChkBox));
		return element;
	}

	public static WebElement SubContractorFrameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorFrameLink));
		return element;
	}

	public static WebElement NonCIP_frameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIP_frameLink));
		return element;
	}

	public static WebElement InsuranceEnrollmentEstimatedManHrs(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentEstimatedManHrs));
		return element;
	}

	public static WebElement SubcontractorCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SubcontractorCloseBtn));
		return element;
	}

	public static WebElement NonCIPsaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveandContinueBtn));
		return element;
	}

	public static WebElement NonCIPsaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveBtn));
		return element;
	}

	public static WebElement NonCIPsaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveandCloseBtn));
		return element;
	}

	public static WebElement NonCIPFlagthispage(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPFlagthispage));
		return element;
	}

	public static WebElement NonCIPMarkasIncomplete(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPMarkasIncomplete));
		return element;
	}

	public static WebElement NonCIPPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPendingReviewBtn));
		return element;
	}

	public static WebElement NonCIPMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPMarkasConfirmedBtn));
		return element;
	}

	public static WebElement NonCIPPolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPolicyStartDate));
		return element;
	}

	public static WebElement NonCIPPolicyExpiryDate(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPolicyExpiryDate));
		return element;
	}

	public static WebElement NonCIPInsuranceCompanyname(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPInsuranceCompanyname));
		return element;
	}

	public static WebElement CloseBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtn_CIPAgreement));
		return element;
	}

	public static WebElement WcPremiumModificationAmountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationAmountBtn));
		return element;
	}

	public static WebElement GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild));
		return element;
	}

	public static WebElement GLUmbrellaGeneraLLibalitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaGeneraLLibalitySeachBoxfeild));
		return element;
	}

	public static WebElement GLUmbrellaUmbrellaLibalitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaUmbrellaLibalitySeachBoxfeild));
		return element;
	}

	public static WebElement SubcontractorSaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SubcontractorSaveandContinueBtn));
		return element;
	}

	public static WebElement SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No));
		return element;
	}

	public static WebElement SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes));
		return element;
	}

	public static WebElement GLUmbrellasaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveBtn));
		return element;
	}

	public static WebElement GLUmbrellasaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveandCloseBtn));
		return element;
	}

	public static WebElement GLUmbrellasaveandcontinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveandcontinueBtn));
		return element;
	}

	public static List<WebElement> GLUmbrellaGeneraLLibalityClassCodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaGeneraLLibalityClassCodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaGeneraLLibalityClasscodeSearcbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaGeneraLLibalityClasscodeSearcbox));
		return element;
	}

	public static WebElement GLUmbrellaUmbrellaLibalitysearchbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaUmbrellaLibalitysearchbox));
		return element;
	}

	public static List<WebElement> GLUmbrellaUmbrellaLibalityClasscodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaUmbrellaLibalityClasscodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox));
		return element;
	}

	public static List<WebElement> GLUmbrellaPolluctionchargeLiabilityclasscodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaPolluctionchargeLiabilityclasscodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaMarkasConfirmedButton(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaMarkasConfirmedButton));
		return element;
	}

	public static WebElement GLUmbrellaPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPendingReviewBtn));
		return element;
	}

	public static WebElement GLUmbrellaMarkasCompleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaMarkasCompleteBtn));
		return element;
	}

	public static WebElement GLUmbrellaFlagthispageBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaFlagthispageBtn));
		return element;
	}

	public static WebElement WcPremiumModificationssaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationssaveandContinueBtn));
		return element;
	}

	public static WebElement WcPremiumModificationssaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationssaveandCloseBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsSaveaBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsSaveaBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsPendingReviewBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsMarkasConfirmedBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentSaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveandContinueBtn));
		return element;
	}

	public static List<WebElement> Enrollmentstatuslist(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Enrollmentstatuslist));
		return listElement;
	}

	public static WebElement InsuranceEnrollmentSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveBtn));
		return element;
	}

	public static WebElement CancelBtn_ENrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(CancelBtn_ENrollment));
		return element;
	}

	public static WebElement ContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractValue));
		return element;
	}

	public static WebElement ContractorNameLegalEntityName(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorNameLegalEntityName));
		return element;
	}

	public static WebElement WorkclassAddworkclassBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassAddworkclassBtn));
		return element;
	}

	public static WebElement WorkclassWCRate(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassWCRate));
		return element;
	}

	public static WebElement WorkclassPayRoll(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassPayRoll));
		return element;
	}

	public static WebElement WorkclassWorkHours(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassWorkHours));
		return element;
	}

	public static WebElement WorkclassOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassOKBtn));
		return element;
	}

	public static List<WebElement> WorkclassDropDownList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(WorkclassDropDownList));
		return listElement;
	}

	public static WebElement workclassDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(workclassDropdown));
		return element;
	}

	public static WebElement BrieflyDescribetheScopeoftheWork(WebDriver driver) {
		element = driver.findElement(By.xpath(BrieflyDescribetheScopeoftheWork));
		return element;
	}

	public static WebElement EstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedStartDate));
		return element;
	}

	public static WebElement EstimatedManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedManHours));
		return element;
	}

	public static WebElement EstimatedcappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedcappedPayroll));
		return element;
	}

	public static WebElement EstimatedUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedUncappedPayroll));
		return element;
	}

	public static WebElement SelfperformedContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(SelfperformedContractValue));
		return element;
	}

	public static WebElement InsuranceEnrollmentMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentMarkasConfirmedBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentPendingReviewBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentSaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveandCloseBtn));
		return element;
	}

	public static WebElement selectDynamicContractorPkg(WebDriver driver) {
		// element =
		// driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle'
		// and contains(text(),'"+contractorName+"')]/..//div[@class='workSite' and
		// contains(text(),'"+projectName+"')]/../../div[2]/div[3 and
		// contains(text(),'"+tradeNo+"')]"));
		element = driver
				.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'"
						+ contractorName + "')]/../..//div[@class='workSite']/span[contains(text(),'" + projectName
						+ "')]/../../../div[2]/div[3]/span[contains(text(),'" + tradeNo + "')]"));
		return element;
	}

	public static WebElement AdvSearchSearchContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSearchContractor));
		return element;
	}

	public static WebElement refreshBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(refreshBtn));
		return element;
	}

	public static WebElement CancelBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(CancelBtn_CIPAgreement));
		return element;
	}

	public static WebElement OKBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(OKBtn_CIPAgreement));
		return element;
	}

	public static WebElement NextBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(NextBtn_CIPAgreement));
		return element;
	}

	public static List<WebElement> statuslist_Enrollment(WebDriver driver) {
		listElement = driver.findElements(By.xpath(statuslist_Enrollment));
		return listElement;
	}

	public static WebElement statusList_Cpkg(WebDriver driver) {
		element = driver.findElement(By.xpath(statusList_Cpkg));
		return element;
	}

	public static List<WebElement> ContactsListDropdown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContactsListDropdown));
		return listElement;
	}

	public static WebElement AdvanceSearch_SeeMore(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvanceSearch_SeeMore));
		return element;
	}

	public static WebElement AdvSearch_SearchBtn_down(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearch_SearchBtn_down));
		return element;
	}

	public static List<WebElement> Advsearch_ContractorStatusList_cp_chkBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Advsearch_ContractorStatusList_cp_chkBox));
		return listElement;
	}

	public static List<WebElement> AdvSearch_SelectContractorStatus_List(WebDriver driver) {
		listElement = driver.findElements(By.xpath(AdvSearch_SelectContractorStatus_List));
		return listElement;
	}

	public static WebElement AdvSearchContractorstatus(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchContractorstatus));
		return element;
	}

	public static WebElement AdvSearchSelectEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectEnrollment));
		return element;
	}

	public static WebElement AdvSearchSelectprogramme(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectprogramme));
		return element;
	}

	public static WebElement AdvSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchBtn));
		return element;
	}

	public static WebElement AdvSearchSelectproject(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectproject));
		return element;
	}
	
	// Raja 07-02-2021
	
	  static String ContractNumberExists_AlertOKbtn=   "//button[@id='btnContractYes']";
	  static String  ContractNumber_Feild="//input[@id='cntrlAddUpdateContractor_txtNewContractNumber']";
	  
	  public static WebElement ContractNumber_Feild (WebDriver driver) {
		  element  = driver.findElement(By.xpath(ContractNumber_Feild));
		  return element;
		}

	public static WebElement ContractNumberExists_AlertOKbtn (WebDriver driver) {
	  element  = driver.findElement(By.xpath(ContractNumberExists_AlertOKbtn));
	  return element;
	}
	
	static String AdvsearchSelectcontractstatusDropdown="//span[@class='hida' and contains(text(),'-- Select Contractor Status --')]";

	public static WebElement AdvsearchSelectcontractstatusDropdown (WebDriver driver) {
		  element  = driver.findElement(By.xpath(AdvsearchSelectcontractstatusDropdown));
		  return element;
		}
	
	static String  ChecckboxBystatus="//div/ul/li//input[@name ='search' and @value='Missing Payroll']";
	
	public static WebElement AdvsearchSelectCheckboxBystatus (WebDriver driver, String text) {
		  element  = driver.findElement(By.xpath("//div/ul/li//input[@name ='search' and @value='"+ text+"']"));
		  return element;
		}
	
}


