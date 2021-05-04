package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_MonthlyPayroll_Page 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String selectPayrollMonthYear ="//select[@id='cntrlMissingPayroll_ddlPayrollMonths']";
	static String enterAllHoursRate ="//table[@class='table blueTable table-Border']/tbody/tr[last(WebDriver driver)-1]/td[position()>1and position()<3]/input";
	
	static String checkBoxFinalPayroll="//input[@id='cntrlMissingPayroll_chkFinalPayroll']";
	static String enterAllHoursAndMonthlyPayrollValue="//table[@class='table blueTable table-Border']/tbody/tr[position()!=last(WebDriver driver)]/td[position()>1and position()<4]/input[@type='text']";
	static String checkBoxMarkAsConfirmed="//input[@id='cntrlMissingPayroll_chkConfirmation']";
	static String checkBoxFlagThisPage="//input[@id='cntrlMissingPayroll_ChkAction']";
	static String checkBoxLockThisPayroll="//input[@id='cntrlMissingPayroll_chkLockPayroll']";
	static String actionNotes="//textarea[@id='cntrlMissingPayroll_txtActionNotes']";
	
	static String btnClose="//button[@id='cntrlMissingPayroll_divClose']";
	static String btnSave="//input[@id='cntrlMissingPayroll_btnSave']";
	static String btnContinueForNextMonth="//input[@id='cntrlMissingPayroll_btnContinueWithoutSending']";
	static String btnSaveAndClose="//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	static String btnSaveAndSendEmail="//input[@id='cntrlMissingPayroll_btnSaveandSend']";
	
	
	
	public static WebElement selectPayrollMonthYear(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollMonthYear));
		return element;
	}public static WebElement enterAllHoursRate(WebDriver driver) {
		element = driver.findElement(By.xpath(enterAllHoursRate));
		return element;
	}public static List<WebElement> checkBoxFinalPayroll(WebDriver driver) {
		listElement = driver.findElements(By.xpath(checkBoxFinalPayroll));
		return listElement;
	}public static List<WebElement> enterAllHoursAndMonthlyPayrollValue(WebDriver driver) {
		listElement = driver.findElements(By.xpath(enterAllHoursAndMonthlyPayrollValue));
		return listElement;
	}public static WebElement checkBoxMarkAsConfirmed(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxMarkAsConfirmed));
		return element;
	}public static WebElement checkBoxFlagThisPage(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxFlagThisPage));
		return element;
	}public static WebElement checkBoxLockThisPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxLockThisPayroll));
		return element;
	}public static WebElement actionNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(actionNotes));
		return element;
	}public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}public static WebElement btnSave(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSave));
		return element;
	}public static WebElement btnContinueForNextMonth(WebDriver driver) {
		element = driver.findElement(By.xpath(btnContinueForNextMonth));
		return element;
	}public static WebElement btnSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndClose));
		return element;
	}public static WebElement btnSaveAndSendEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndSendEmail));
		return element;
	}
	
	
	static String addPayrollCVField = "//input[@id='cntrlMissingPayroll_txtContractValue']";
	static String addPayrollSelfCVField = "//input[@id='cntrlMissingPayroll_txtSelfContractValue']";
	static String addPayrollSubContractorCostField = "//input[@id='cntrlMissingPayroll_txtSubContractorCost']";
	// add payroll including hours and capped and uncapped values
	static String addPayrollForALLWorkClass = "//table[@class='table blueTable table-Border']/tbody/tr[position()>1 and position()<last()-1]/td[position()>1]/input[@type!='hidden']";// list
	static String addPayrollGrandTotalHours = "//input[@id='cntrlMissingPayroll_txtHoursTotal']";
	static String addPayrollGrandTotalUncappedPayroll = "//input[@id='cntrlMissingPayroll_txtPayrollTotal']";
	static String addPayrollGrandTotalCappedPayroll = "//input[@id='cntrlMissingPayroll_txtUnCapPayrollTotal']";
	
	static String addPayrollFinalPayrollCheckBox = "//input[@id='cntrlMissingPayroll_chkFinalPayroll']";
	static String addPayrollNextMonthBtn = "//input[contains(@value,'Continue for')]";//continue next month payroll button
	static String addPayrollSaveBtn = "//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	static String addPayrollCloseBtn = "//button[@id='cntrlMissingPayroll_divClose']";
	
	static String selectPayrollPeriodFromList ="//select[@id='cntrlMissingPayroll_ddlPayrollMonths']";
	static String unusualPayrolSaveBtn ="//a[@onclick='SaveComment(WebDriver driver)']";
	static String unusualPayrolExplinationTextArea ="//textarea[@id='txtComment']";
	
	
	public static WebElement addPayrollCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollCVField));
		return element;
	}

	public static WebElement addPayrollSelfCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSelfCVField));
		return element;
	}

	public static WebElement addPayrollSubContractorCostField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSubContractorCostField));
		return element;
	}

	public static List<WebElement> addPayrollForALLWorkClass(WebDriver driver) {
		listElement = driver.findElements(By.xpath(addPayrollForALLWorkClass));
		return listElement;
	}

	public static WebElement addPayrollGrandTotalHours(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalHours));
		return element;
	}

	public static WebElement addPayrollGrandTotalUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalUncappedPayroll));
		return element;
	}

	public static WebElement addPayrollGrandTotalCappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalCappedPayroll));
		return element;
	}

	public static WebElement addPayrollFinalPayrollCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollFinalPayrollCheckBox));
		return element;
	}

	public static WebElement addPayrollNextMonthBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollNextMonthBtn));
		return element;
	}

	public static WebElement addPayrollSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSaveBtn));
		return element;
	}

	public static WebElement addPayrollCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollCloseBtn));
		return element;
	}
	public static WebElement selectPayrollPeriodFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollPeriodFromList));
		return element;
	}
	

	// Raja wrote this from COI_payroll Validations
	

	
	public static String SwitchesList = "//div[@class='checker']";
	static String ProgrammeICon = "//span[@id='ctl00_ContentPlaceHolder1_spnProject']";
	static String Programmesearchbar = "//input[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_txtSearch']";
	static String EditBtnProgrammeICON = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
	static String AdvancesearchbarIcon = "//a[@class='tipB']//i[@class='fa fa-caret-down']";
	static String RefreshbBtnProgramme = "//i[@class='fa fa-refresh']";
	static String PlusBtnProgramme = "//i[@class='fa fa-plus']";
	static String DeletebBtnProgramme = "//li[@id = 'ctl00_ContentPlaceHolder1_ctrlProjectList_lidelete']//i[@class='fa fa-trash-o']";
	static String SelectStatusDropDownProgramme = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlStatus']";
	static String searchBtnDownProgramme = "//input[@id='btnAdvanceSearch']";
	static String Select_Programme_Admin = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlNodeAdministrator']";
	static String Select_Programme_SPonsor = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlOwner']";
	static String Select_Proj_sponr = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlOwner']"; // select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlOwner']
	public static String project_contractor_AdvSearch = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntWorkList_txt_Contractor']";
	static String Edit_btn = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
	public static String Manage_CIP_Certificates_Switch = "//*[@id='uniform-chkManageOCIPCertificates']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	public static String TrackOffsite_Coverage = "//*[@id='uniform-chkTrackOffsiteCoverage']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	public static String ShowDBA_COI_Switch = "//*[@id='uniform-chkIsShowDBA']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	static String SeperatorText_DBA_Switch = "//input[@id='txtDBAText']";
	static String saveandCloseBtn = "//input[@id='btnSaveandCloseGeneralInformation']";
	public static String Prog_Switc_list = "//ul//div[@class='listWrap clearfix']";
	public static String DBA_feild_Error_txt = "//label[@for='txtDBAText']";
	public static String DBA_Switch_TolTip_txt = "//div[@class='qtip-content' and @id='qtip-16-content']";
	public static String DBA_Switch_TolTip = "//li[@id='liShowDBA']//i[@class='icon16 i-info']";
	public static String Reports_Icon = "//div//ul//li[@id='ctl00_ctrlMenu_liReports']";
	public static String SelectProgramme_Report = "//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";
	public static String Superindent_programme_Report = "//span[@id='ctl00_ContentPlaceHolder1_rptReport_ctl01_rptSubReport_ctl69_lblReportItemDesc']";
	public static String baseclass_UN_feild = "//input[@id='txtUserName']";
	public static String baseclass_PW_feild = "//input[@id='txtPassword']";
	public static String baseclass_Login_Btn = "//a[@class='commanBigButton darkBlueButton']";
	public static String HierachyButton = "//i[@class='fa fa-sitemap']";
	public static String HierarchyBtn_txt_graph = "//a[@data-original-title='Click here to view the Key Performance Indicators(KPIs) ']";
	public static String HierarchyBtn_txt_Bar = "//a[@data-original-title='Click here to view the hierarchy ']";
	public static String Programme_Frame = "//div[@class='contractorList porjectNameList tipB']";
	public static String Cpkgs_List = "//ul[@class='ulTreeViewContractorList']/li";
	public static String CP_Satus = "//div[contains(text(),'Enrolled')]";
	public static String CP_Status_assign = "//div[contains(text(),'Assigned')]";
	public static String Insurance_enrollment = "//a[@id='aInsuranceEnrollment']";
	public static String SelctDBA_DropDown = "//select[@id='ctrlInsuranceEnrollment_ddlContractorDBA']";
	public static String Close_btn = "//button[@id='ctrlInsuranceEnrollment_divClose']";
	public static String Insurance_Heading = "//a[contains(text(),'Insurance Enrollment')]";
	public static String Programme_LIst_Report = "//div[@class='non-selected-wrapper']/a";
	public static String Contractor_list_Report = "//select[@id='ctrlBuildReport_lbContractor']";
	public static String Build_Report_Btn = "//input[@id='ctrlBuildReport_btnBuildReport']";
	public static String Report_Heading = "//tbody[@class='bodyBackground'] //td[@class='mainTitle txt-center']";
	public static String program_Heading_report = "//td[@class='contractorTitle columnWidth'][1]";
	public static String Contract_Name_Text = "//table[@class='innerTable tbl-alt tableData']/tbody/tr[2]/td[2]";
	public static String trackOffsite_Switch = "//div[@id='uniform-chkTrackOffsiteCoverage']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	public static String PDF_Icon_report = "//div[@id='divExportIcon']/ul/li[1]";
	public static String Exel_Icon_Report = "//div[@id='divExportIcon']/ul/li[2]";
	public static String Select_prog_Type = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlProgramType']";
	public static String More_ICOn_Heading = "//div[@class='dropdown-gridnav']";
	public static String policy_Certificates = "//a[@id='ctrlProjectAddUpdate_aPolicyManagement']";
	public static String Open_Polict_Btn = "//a[@id='aGLEidt']";
	public static String Carrier_DropDown = "//select[@id='ctrlGLPolicy_ddlCarrier']";
	public static String policy_Eff_date = "//input[@id='ctrlGLPolicy_txtPolicyEffectiveDate1']";
	public static String Policy_Exp_date = "//input[@id='ctrlGLPolicy_txtPolicyExpirationDate1']";
	public static String EachOccurance = "//input[@id='ctrlGLPolicy_txtEachOccurence']";
	public static String DamaageToRentedPremeises = "//input[@id='ctrlGLPolicy_txtDamageToRentedPremises']";
	public static String MedExp = "//input[@id='ctrlGLPolicy_txtMedExps']";
	public static String Personal_AdvInjur = "//input[@id='ctrlGLPolicy_txtPersonalAdvInjury']";
	public static String GeneralAggregate = "//input[@id='ctrlGLPolicy_txtGeneralAggregate']";
	public static String Products_Comp_op = "//input[@id='ctrlGLPolicy_txtProductsCompOpAgg']";
	public static String saveandClose_Btn_policy = "//input[@id='ctrlGLPolicy_btnSaveandClose']";
	public static String SetUpGneralCertificate = "//a[@id='aICEdit']";
	public static String Select_Insured_String = "//select[@id='ctrlInsuranceCertificate_ddlInsured']";
	public static String SaveandClose_InsuCert = "//input[@id='ctrlInsuranceCertificate_btnSaveandClose']";
	public static String Certifcates_frame = "//a[@id='aCertificates']";
	public static String Enrollment_frame ="ifrmPreview";
	public static String AutoGenerateCetificate = "//input[@id='cntrlViewCertificates_btnGenerateCertificate']";
	public static String GL_Policy_Number = "//input[@id='txtGLPolicyNumber']";
	public static String Excess_Umbrella = "//input[@id='rptUMBList_ctl00_txtUMBPolicyNumberNew']";
	public static String SavenadCloseBtn_GLpolicy = "//input[@id='btnSavePolicyNumber']";
	public static String View_Certificates = "//table[@class='table blueTable']/tbody/tr";
	public static String Finish_Close = "//button[@id='cntrlViewCertificates_btnFinishandClose']";
	public static String Ok_Btn = "//button[@id='btnSaveModal']";
	public static String Frame_Viewcertciates = "_iframe-EmailBox12";
	public static String Certificate_Holder_setupCertifc = "//select[@id='ctrlInsuranceCertificate_ddlCertficateHolder']";
	public static String Auto_gen_Table_Table = "//table[@class='table blueTable']";
	public static String Table_text_Autogen = "//tbody/tr[1]";
	public static String Table_View_AutogenList = "//tbody";
	public static String Table_Rows_AutogenList = "//tbody/tr";
	public static String Table_Cols_AutogenList = "//tbody/tr/td";
	public static String Contrctr_list_frame = "//div[@class='contractorList']";
	public static String Contrctr_Status_list_frame = "//div[@class='contractorStatusName']";
	public static String Payroll_Cvtrack_Btn = "//a[@id='ctrlProjectAddUpdate_aPayrollCVTracking']";
	public static String Require_Payroll_ChkBox_Switch = "//*[@id='uniform-ChkRequiredForMothlyPayroll']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	public static String Require_Payroll_ChkBox_Switch_Toltip = "//div[@class='infoIcon']//i[ @class='font20 i-info']";
	public static String Require_Payroll_ChkBox_Switch_Toltip_txt = "//div[@class='qtip-content'][contains(text(),'checking the agreement box')]";
	public static String Require_Payroll_ChkBox_Switch_Alert = "//button[@class='btn btn-success pull-right' and @id='btnYes']";
	public static String Require_Payroll_ChkBox_TokenList = "//div[@class='col-md-3 col-sm-3 col-xs-3 marg-top-30']/ul/li";
	public static String Require_Payroll_ChkBox_field = "//div[@class='mce-tinymce mce-container mce-panel']";
	public static String SavenadCloseBtn_payroll_CV_progrm = "//input[@id='btnSaveandClosePayrollCVTrack']";
	public static String HomeIcon = "//li[@id='ctl00_ctrlMenu_liHome']";
	public static String projectICon = "//a[@id='ctl00_ContentPlaceHolder1_aWorksite']";
	public static String SelectProjectAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlNodeAdministrator']";
	public static String Payroll_CV_project_Btn = "//li[@id='cntrWorkSiteAddUpdate_cntrWorkSiteAddUpdate_liPayrollCVTracking']";
	public static String Project_MoreBtn ="//div[@class='dropdown-gridnav']";
	public static String payRollSetting_Changes_Project = "//div[@id='uniform-chkPauytollCvTrack']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	public static String Save_Clsoe_Btn_Payroll_Project = "//input[@id='btnSaveandClose']";
	public static String Enrollment_List = "//div[@class='col-md-12 clearfix']/span";
	public static String Class_Code_Hours_Feild = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_HoursText']";
	public static String Class_Code_Uncapped_Payroll = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_PayrollText']";
    public static String payRoll_ChkBox_CP="//input[@id='cntrlMissingPayroll_chkPayrollSubmit']";
	public static String SaveandCloseBtn_CPkg_PayrollPage ="//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	public static String OK_SaveandCloseBtn_CPkg_PayrollPage ="//div[@class='modal-footer']//button[@class='btn btn-primary pull-right']";
	public static String AlerMsg_OK_SaveandCloseBtn_CPkg_PayrollPage ="//div[@class='modalAlertMessage']";
	public static String ProgrammAdmin_Project ="//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlNodeAdministrator']";
	public static String projectAdmin_project ="//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlWorkSiteAdministrator']";
	public static String ProgrammSponsor_project ="//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlOwner']";
	public static String Monthsly_payrollTablelist ="//table//tr//td//span[@class='month']";
	public static String NCP_LetsStart_Btn ="//a[@class='btn btn-dark-green btn-lg float-right']";
	public static  String NCP_UN_Feild = "//input[@id='UserName']";
	public static String NCP_PW_Feild ="//input[@id='Password']";
	public static String NCP_LOgin_Btn ="//button[@onclick='VerifyUser(WebDriver driver)']";
	public static String NCP_Prog_Dropdown_Arrow="//div[@class='col-md-8']//span[@class='caret']";
	public static String NCP_Prog_List ="//ul[@id='select-options-ae488506-7e82-4c0d-acaa-f834619d6dcd']/li";
	public static  String NCP_proj_List ="//ul[@id='select-options-7337d635-83b2-4c0a-a5c5-ba4edcd6e9b1']/li";
	public static String  NCP_CP_ICON ="//div[@class='text-default graph-text count-text div-contractorpackage-count']";
	public static String   NCP_MyProject_tab ="//li[@class='nav-item'][2]";
	public static String  NCP_FilterBy_btn ="//a[@class='filter-btn']";
	public static String NCP_CP_LIST_FILTERS ="//div[@class='project-name with-status']";
	public static String NCP_CP_Status_list ="//li[@class='sub-box']/a";
	public static String NCP_FileterSearch_btn ="//div[@class='float-right']//a[@class='search-btn mr-2 float-left']";
	public static String NCP_List_SearchBar="//input[@id='txt-search']";
	public static String NCP_HirerarchyBtn=" //u[contains(text(),'View Hierarchy')]";
	public static String NCP_Proj_Actve_btn="//span[@id='span-worksite-status']";
	public static String NCP_payroll_Missing= "//div[@class='status-name missing-payroll-status']";
	public static String NCP_MyContracts_list="//div[@class='text-lg-right text-md-right text-sm-right div-status']/span";
	public static String NCP_Contractor_Activities="//ul[@class='list-enrolled']/li/a";
	public static String NCP_Payroll_Monthlist="//table[@class='table table-gray mb-0 last-border-none']/tbody/tr/td/a";
	public static String NCP_Payroll_ChkBox ="//div[@class='form-check pl-0']/input[2]";
	public static String NCP_Chkbox_Disabled_txt="//label[@for='chkPayrollSubmit']";
	public static String NCP_Chkbox_Cancel_btn="//button[@class='close']";
	public static String NCP_Payroll_saveBtn="//div/button[@type='button' and @class='close']/span";
	public static String NCP_payroll_Mnth_CancelBtn="//button[@class='close pt-4']/span";
	
	
	public static WebElement Project_MoreBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Project_MoreBtn));
		return element;
	}
	public static WebElement NCP_payroll_Mnth_CancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_payroll_Mnth_CancelBtn));
		return element;
	}
	public static WebElement NCP_Payroll_saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_Payroll_saveBtn));
		return element;
	}
	public static WebElement NCP_Chkbox_Cancel_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_Chkbox_Cancel_btn));
		return element;
	}
	public static WebElement NCP_Chkbox_Disabled_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_Chkbox_Disabled_txt));
		return element;
	}
	public static WebElement NCP_payroll_Missing(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_payroll_Missing));
		return element;
	}
	
	
	public static WebElement NCP_Proj_Actve_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_Proj_Actve_btn));
		return element;
	}
	public static WebElement NCP_HirerarchyBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_HirerarchyBtn));
		return element;
	}
	public static WebElement NCP_List_SearchBar(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_List_SearchBar));
		return element;
	}
	public static WebElement NCP_FileterSearch_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_FileterSearch_btn));
		return element;
	}
	
	public static WebElement NCP_FilterBy_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_FilterBy_btn));
		return element;
	}
	public static WebElement NCP_MyProject_tab(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_MyProject_tab));
		return element;
	}
	public static WebElement NCP_CP_ICON(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_CP_ICON));
		return element;
	}
	public static WebElement NCP_LOgin_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_LOgin_Btn));
		return element;
	}
	public static WebElement NCP_PW_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_PW_Feild));
		return element;
	}
	public static WebElement NCP_UN_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_UN_Feild));
		return element;
	}
	
	public static WebElement NCP_LetsStart_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(NCP_LetsStart_Btn));
		return element;
	}
	public static WebElement ProgrammAdmin_Project(WebDriver driver) {
		element = driver.findElement(By.xpath(ProgrammAdmin_Project));
		return element;
	}
	
	public static WebElement projectAdmin_project(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdmin_project));
		return element;
	}
	public static WebElement ProgrammSponsor_project(WebDriver driver) {
		element = driver.findElement(By.xpath(ProgrammSponsor_project));
		return element;
	}
	
	public static WebElement AlerMsg_OK_SaveandCloseBtn_CPkg_PayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(AlerMsg_OK_SaveandCloseBtn_CPkg_PayrollPage));
		return element;
	}
	public static WebElement OK_SaveandCloseBtn_CPkg_PayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(OK_SaveandCloseBtn_CPkg_PayrollPage));
		return element;
	}
	public static WebElement SaveandCloseBtn_CPkg_PayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtn_CPkg_PayrollPage));
		return element;
	}
	public static WebElement Class_Code_Hours_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(Class_Code_Hours_Feild));
		return element;
	}

	public static WebElement Class_Code_Uncapped_Payroll(WebDriver driver) {
		element = driver.findElement(By.xpath(Class_Code_Uncapped_Payroll));
		return element;
	}

	public static WebElement Save_Clsoe_Btn_Payroll_Project(WebDriver driver) {
		element = driver.findElement(By.xpath(Save_Clsoe_Btn_Payroll_Project));
		return element;
	}

	public static WebElement payRollSetting_Changes_Project(WebDriver driver) {
		element = driver.findElement(By.xpath(payRollSetting_Changes_Project));
		return element;
	}

	public static WebElement Payroll_CV_project_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Payroll_CV_project_Btn));
		return element;
	}

	public static WebElement Select_Proj_sponr(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_Proj_sponr));
		return element;
	}

	public static WebElement SelectProjectAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectProjectAdmin));
		return element;
	}

	public static WebElement projectICon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectICon));
		return element;
	}

	public static WebElement HomeIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(HomeIcon));
		return element;
	}

	public static WebElement project_contractor_AdvSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(project_contractor_AdvSearch));
		return element;
	}

	public static WebElement SavenadCloseBtn_payroll_CV_progrm(WebDriver driver) {
		element = driver.findElement(By.xpath(SavenadCloseBtn_payroll_CV_progrm));
		return element;
	}

	public static WebElement Require_Payroll_ChkBox_field(WebDriver driver) {
		element = driver.findElement(By.xpath(Require_Payroll_ChkBox_field));
		return element;
	}

	public static WebElement Require_Payroll_ChkBox_Switch_Alert(WebDriver driver) {
		element = driver.findElement(By.xpath(Require_Payroll_ChkBox_Switch_Alert));
		return element;
	}

	public static WebElement Require_Payroll_ChkBox_Switch_Toltip_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Require_Payroll_ChkBox_Switch_Toltip_txt));
		return element;
	}

	public static WebElement Require_Payroll_ChkBox_Toltip(WebDriver driver) {
		element = driver.findElement(By.xpath(Require_Payroll_ChkBox_Switch_Toltip));
		return element;
	}

	public static WebElement Payroll_Cvtrack_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Payroll_Cvtrack_Btn));
		return element;
	}

	public static WebElement Table_text_Autogen(WebDriver driver) {
		element = driver.findElement(By.xpath(Table_text_Autogen));
		return element;
	}

	public static WebElement Auto_gen_Table_Table(WebDriver driver) {
		element = driver.findElement(By.xpath(Auto_gen_Table_Table));
		return element;
	}

	public static WebElement Certificate_Holder_setupCertifc(WebDriver driver) {
		element = driver.findElement(By.xpath(Certificate_Holder_setupCertifc));
		return element;
	}

	public static WebElement Ok_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Ok_Btn));
		return element;
	}

	public static WebElement Finish_Close(WebDriver driver) {
		element = driver.findElement(By.xpath(Finish_Close));
		return element;
	}

	public static WebElement View_Certificates(WebDriver driver) {
		element = driver.findElement(By.xpath(View_Certificates));
		return element;
	}

	public static WebElement SavenadCloseBtn_GLpolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SavenadCloseBtn_GLpolicy));
		return element;
	}

	public static WebElement Excess_Umbrella(WebDriver driver) {
		element = driver.findElement(By.xpath(Excess_Umbrella));
		return element;
	}

	public static WebElement GL_Policy_Number(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_Policy_Number));
		return element;
	}

	public static WebElement AutoGenerateCetificate(WebDriver driver) {
		element = driver.findElement(By.xpath(AutoGenerateCetificate));
		return element;
	}

	public static WebElement Certifcates_frame(WebDriver driver) {
		element = driver.findElement(By.xpath(Certifcates_frame));
		return element;
	}

	public static WebElement SaveandClose_InsuCert(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandClose_InsuCert));
		return element;
	}

	public static WebElement Select_Insured_String(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_Insured_String));
		return element;
	}

	public static WebElement SetUpGneralCertificate(WebDriver driver) {
		element = driver.findElement(By.xpath(SetUpGneralCertificate));
		return element;
	}

	public static WebElement saveandClose_Btn_policy(WebDriver driver) {
		element = driver.findElement(By.xpath(saveandClose_Btn_policy));
		return element;
	}

	public static WebElement Products_Comp_op(WebDriver driver) {
		element = driver.findElement(By.xpath(Products_Comp_op));
		return element;
	}

	public static WebElement GeneralAggregate(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralAggregate));
		return element;
	}

	public static WebElement Personal_AdvInjur(WebDriver driver) {
		element = driver.findElement(By.xpath(Personal_AdvInjur));
		return element;
	}

	public static WebElement MedExp(WebDriver driver) {
		element = driver.findElement(By.xpath(MedExp));
		return element;
	}

	public static WebElement DamaageToRentedPremeises(WebDriver driver) {
		element = driver.findElement(By.xpath(DamaageToRentedPremeises));
		return element;
	}

	public static WebElement EachOccurance(WebDriver driver) {
		element = driver.findElement(By.xpath(EachOccurance));
		return element;
	}

	public static WebElement policy_Eff_date(WebDriver driver) {
		element = driver.findElement(By.xpath(policy_Eff_date));
		return element;
	}

	public static WebElement Policy_Exp_date(WebDriver driver) {
		element = driver.findElement(By.xpath(Policy_Exp_date));
		return element;
	}

	public static WebElement Carrier_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(Carrier_DropDown));
		return element;
	}

	public static WebElement Open_Polict_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Open_Polict_Btn));
		return element;
	}

	public static WebElement policy_Certificates(WebDriver driver) {
		element = driver.findElement(By.xpath(policy_Certificates));
		return element;
	}

	public static WebElement More_ICOn_Heading(WebDriver driver) {
		element = driver.findElement(By.xpath(More_ICOn_Heading));
		return element;
	}

	public static WebElement CP_Status_assign(WebDriver driver) {
		element = driver.findElement(By.xpath(CP_Status_assign));
		return element;
	}

	public static WebElement Select_prog_Type(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_prog_Type));
		return element;
	}

	public static WebElement Exel_Icon_Report(WebDriver driver) {
		element = driver.findElement(By.xpath(Exel_Icon_Report));
		return element;
	}

	public static WebElement PDF_Icon_report(WebDriver driver) {
		element = driver.findElement(By.xpath(PDF_Icon_report));
		return element;
	}

	public static WebElement trackOffsite_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackOffsite_Switch));
		return element;
	}

	public static WebElement Contract_Name_text(WebDriver driver) {
		element = driver.findElement(By.xpath(Contract_Name_Text));
		return element;
	}

	public static WebElement program_Heading_report(WebDriver driver) {
		element = driver.findElement(By.xpath(program_Heading_report));
		return element;
	}

	public static WebElement Report_Heading(WebDriver driver) {
		element = driver.findElement(By.xpath(Report_Heading));
		return element;
	}

	public static WebElement Build_Report_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Build_Report_Btn));
		return element;
	}

	public static WebElement Contractor_list_Report(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractor_list_Report));
		return element;
	}

	public static WebElement Insurance_Heading(WebDriver driver) {
		element = driver.findElement(By.xpath(Insurance_Heading));
		return element;
	}

	public static WebElement Close_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Close_btn));
		return element;
	}

	public static WebElement SelctDBA_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(SelctDBA_DropDown));
		return element;
	}

	public static WebElement Insurance_enrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(Insurance_enrollment));
		return element;
	}

	public static WebElement CP_Satus(WebDriver driver) {
		element = driver.findElement(By.xpath(CP_Satus));
		return element;
	}

	public static WebElement Programme_Frame(WebDriver driver) {
		element = driver.findElement(By.xpath(Programme_Frame));
		return element;
	}

	public static WebElement HierarchyBtn_txt_graph(WebDriver driver) {
		element = driver.findElement(By.xpath(HierarchyBtn_txt_graph));
		return element;
	}

	public static WebElement HierarchyBtn_txt_Bar(WebDriver driver) {
		element = driver.findElement(By.xpath(HierarchyBtn_txt_Bar));
		return element;
	}

	public static WebElement HierachyButton(WebDriver driver) {
		element = driver.findElement(By.xpath(HierachyButton));
		return element;
	}

	public static WebElement baseclass_Login_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(baseclass_Login_Btn));
		return element;
	}

	public static WebElement baseclass_UN_feild(WebDriver driver) {
		element = driver.findElement(By.xpath(baseclass_UN_feild));
		return element;
	}

	public static WebElement baseclass_PW_feild(WebDriver driver) {
		element = driver.findElement(By.xpath(baseclass_PW_feild));
		return element;
	}

	public static WebElement DBA_Switch_TolTip_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(DBA_Switch_TolTip_txt));
		return element;
	}

	public static WebElement SelectProgramme_Report(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectProgramme_Report));
		return element;
	}

	public static WebElement Superindent_programme_Report(WebDriver driver) {
		element = driver.findElement(By.xpath(Superindent_programme_Report));
		return element;
	}

	public static WebElement Reports_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_Icon));
		return element;
	}

	public static WebElement DBA_Switch_TolTip(WebDriver driver) {
		element = driver.findElement(By.xpath(DBA_Switch_TolTip));
		return element;
	}

	public static WebElement DBA_feild_Error_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(DBA_feild_Error_txt));
		return element;
	}

	public static WebElement saveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveandCloseBtn));
		return element;
	}

	public static WebElement SeperatorText_DBA_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(SeperatorText_DBA_Switch));
		return element;
	}

	public static WebElement ShowDBA_COI_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(ShowDBA_COI_Switch));
		return element;
	}

	public static WebElement Manage_CIP_Certificates_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Manage_CIP_Certificates_Switch));
		return element;
	}

	public static List<WebElement> SwitchesList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(SwitchesList));
		return listElement;
	}

	public static WebElement Edit_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Edit_btn));
		return element;
	}

	public static WebElement Programmesearchbar(WebDriver driver) {
		element = driver.findElement(By.xpath(Programmesearchbar));
		return element;
	}

	public static WebElement EditBtnProgrammeICON(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBtnProgrammeICON));
		return element;
	}

	public static WebElement AdvancesearchbarIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvancesearchbarIcon));
		return element;
	}

	public static WebElement RefreshbBtnProgramme(WebDriver driver) {
		element = driver.findElement(By.xpath(RefreshbBtnProgramme));
		return element;
	}

	public static WebElement PlusBtnProgramme(WebDriver driver) {
		element = driver.findElement(By.xpath(PlusBtnProgramme));
		return element;
	}

	public static WebElement DeletebBtnProgramme(WebDriver driver) {
		element = driver.findElement(By.xpath(DeletebBtnProgramme));
		return element;
	}

	public static WebElement SelectStatusDropDownProgramme(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectStatusDropDownProgramme));
		return element;
	}

	public static WebElement searchBtnDownProgramme(WebDriver driver) {
		element = driver.findElement(By.xpath(searchBtnDownProgramme));
		return element;
	}

	public static WebElement Select_Programme_Admin(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_Programme_Admin));
		return element;
	}

	public static WebElement Select_Programme_SPonsor(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_Programme_SPonsor));
		return element;
	}

	public static WebElement ProgrammeICon(WebDriver driver) {
		element = driver.findElement(By.xpath(ProgrammeICon));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
}
