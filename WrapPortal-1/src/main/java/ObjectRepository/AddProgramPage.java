package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgramPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String addProgramGeneralInformationTab = "//a[text()='General Information']";
	static String addProgramProgramParametersTab = "//li[@id='ctrlProjectAddUpdate_liProjectParameters']";
	static String addProgramEmailManagementTab = "//a[text()='Email Management']";
	static String addProgramContractorPortalOptionTab = "//a[text()='Contractor Portal Options']";
	static String addProgramUserAccessTab = "//a[text()='User Access']";
	static String addProgramPremiumModificationTab = "//a[text()='Premium Modification']";
	static String addProgramPolicyAndCertificatesTab = "//a[text()='Policy & Certificates']";
	static String addProgramFixedCostAndratesTab = "//a[text()='Fixed Costs & Rates']";
	static String addProgramClaimsTab = "//a[text()='Claims']";
	static String addProgramBenchmarkTab = "//a[text()='Benchmark']";
	static String addProgramOtherinformationTab = "//a[text()='Other Information']";
	static String addProgramComplianceTab = "//a[text()='Compliance']";
	static String addProgramMoreTab = "//div[@class='dropdown-gridnav']";
	static String addProgramCustomFormsTab ="//a[text()='Custom Forms']";
	
	
	public static WebElement addProgramCustomFormsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramCustomFormsTab));
		return element;
	}
	public static WebElement addProgramGeneralInformationTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramGeneralInformationTab));
		return element;
	}

	public static WebElement addProgramProgramParametersTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramProgramParametersTab));
		return element;
	}

	public static WebElement addProgramEmailManagementTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramEmailManagementTab));
		return element;
	}

	public static WebElement addProgramContractorPortalOptionTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramContractorPortalOptionTab));
		return element;
	}

	public static WebElement addProgramUserAccessTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramUserAccessTab));
		return element;
	}

	public static WebElement addProgramPremiumModificationTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramPremiumModificationTab));
		return element;
	}

	public static WebElement addProgramPolicyAndCertificatesTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramPolicyAndCertificatesTab));
		return element;
	}

	public static WebElement addProgramFixedCostAndratesTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramFixedCostAndratesTab));
		return element;
	}

	public static WebElement addProgramClaimsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramClaimsTab));
		return element;
	}

	public static WebElement addProgramBenchmarkTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramBenchmarkTab));
		return element;
	}

	public static WebElement addProgramOtherinformationTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramOtherinformationTab));
		return element;
	}

	public static WebElement addProgramComplianceTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramComplianceTab));
		return element;
	}

	public static WebElement addProgramMoreTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProgramMoreTab));
		return element;
	}
	
	// Raja wrote this from Programme Page
	
	

	static String ProgrammeICon = "//span[@id='ctl00_ContentPlaceHolder1_spnProject']";
	static String Programme_Plus_Btn = "//i[@class='fa fa-plus']";

	static String Programme_Close_Btn_Common_for_All = "//button[@class='btn']";

	// Programme at General Information page
	static String Program_GenInfo_Headers_AddProgramm_Txt = "//span[@id='lblAddEditProject']";
	static String Program_GenInfo_TopHeadings_Txt = "//div[@class='greedy-container']//ul[@class='ulGreedy clearfix']";
	static String Program_GenInfo_programme_Name = "//input[@id='txtProjectName']";
	static String Program_GenInfo_programme_Code = "//input[@id='txtProjectCode']";
	static String Program_GenInfo_PolicyType = "//select[@id='ddlProjectType']";
	static String Program_GenInfo_Programme_Type = "//select[@id='ddlCIPType']";
	static String Program_GenInfo_ProgramAdministrator = "//select[@id='ddlNodeAdministrator']";
	static String Program_GenInfo_Sponsor = "//select[@id='ddlOwner']";
	static String Program_GenInfo_Status_Switch = "//div[@class='col-md-6 col-sm-6 iosSwitch']//div[@id='uniform-chkStatus']//div[@class='ios-ui-select checked']";
	static String Program_GenInfo_Track_OffSite_Coverage_Switch = "//div[@id='uniform-chkTrackOffsiteCoverage']";
	static String Program_Track_offsite_Policy_Limits_Switch = "//div[@id='uniform-chkIsCertificateTracking']";
	static String Program_GenInfo_Manage_CIP_Certificates_Switch = "//div[@id='uniform-chkManageOCIPCertificates']";
	static String Program_GenInfo_Track_Insured_Cost_Switch = "//div[@id='uniform-chkTrackDeduct']";
	static String Program_GenInfo_Track_Change_Order_Switch = "//div[@id='uniform-chkIsIncludeChangeOrder']";
	static String Program_GenInfo_Excluded_Contractors_Switch = "//div[@id='uniform-chkTrackExcludedContractor']";
	static String Program_GenInfo_TrackFixedcost_Time_material_Switch = "//div[@id='uniform-chkShowFixedCostandUnitPrice']";
	static String Program_GenInfo_Track_Rates_Fees_Switch = "//div[@id='uniform-chkRatesandFees']";
	static String Program_GenInfo_GLDeducn_Sir_Loss_Charge_Switch = "//div[@id='uniform-chkGLLossCharge']";
	static String Program_GenInfo_Maintenance_Wrap_Switch = "//div[@id='uniform-chkIsProjectOrMaintenance']";
	static String Program_GenInfo_Is_trade_Required_For_a_Contractor_package_Switch = "//div[@id='uniform-chkAllowTradeInContractorportal']";
	static String Program_GenInfo_Minimum_Requirements_Enrolled_Switch = "//div[@id='uniform-chkConditionalEnrollment']";
	static String Program_GenInfo_RequirecloseOut_for_Lower_tier_Contractors_Switch = "//div[@id='uniform-chkIsTrackCloseOutContractors']";
	static String Program_GenInfo_Show_DBA_on_CIPCOIS_Reports_Switch = "//div[@id='uniform-chkIsShowDBA']";
	static String Program_GenInfo_Contractor_to_verified_Insurancee_Cost_Comparision_Switch = "//div[@id='uniform-chkVerifiedInsuranceCost']";
	static String Program_GenInfo_Contact_name = "//input[@id='txtContactName']";
	static String Program_GenInfo_EmailAddress = "//input[@id='txtEmailAddress']";
	static String Program_GenInfo_Telephone_Number = "//input[@id='txtTelephoneNumber']";
	static String Program_GenInfo_Fax_Number = "//input[@id='txtFaxNumber']";
	static String Program_GenInfo_Bid_Type = "//select[@id='ddlBidType']";
	static String Program_GenInfo_Estimate_Program_Construction_Value = "//input[@id='txtEstimatedProjectValue']";
	static String Program_GenInfo_Program_Begin_Date = "//input[@id='txtProjectBeginDate']";
	static String Program_GenInfo_Program_Estimated_Completion_date = "//input[@id='txtProjectCompletionDate']";
	static String Program_GenInfo_projected_Losses = "//input[@id='txtProjectProjectedLosses']";
	static String Program_GenInfo_Total_Program_Insurance_cost = "//input[@id='txtTotalProjectDeduct']";
	static String Program_GenInfo_Estimated_Payroll = "//input[@id='txtProjectEstimatedPayroll']";
	static String Program_GenInfo_Estimated_Hours = "//input[@id='txtProjectEstimatedHours']";
	static String Program_GenInfo_Program_Minimum_Rate = "//input[@id='txtProjectMinimumRate']";
	static String Program_genInfo_Program_Maximum_Rate = "//input[@id='txtProjectMaximumRate']";
	static String Program_GenInfo_Note = "//textarea[@id='txtNote']";
	static String Program_GenInfo_close_btn = "//button[@class='btn']";
	static String Program_GenInfo_Save_btn = "//input[@id='btnSaveGeneralInformation']";
	static String Program_GenInfo_SaveandClsoe_btn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String Program_GenInfo_SaveandContinue_btn = "//input[@id='btnNextGeneralInfomation']";

	// Program parameters
	static String Program_prog_Parmtr_Minimum_ContractValue = "//input[@id='txtMinimumContractPrice']";
	static String Program_prog_parmtr_Minimum_Man_Hrs = "//input[@id='txtMinimumManHours']";
	static String Program_Prog_minumum_payroll = "//input[@id='txtMinimumPayroll']";
	static String Program_prog_Parmtr_Minimun_Days_On_Job_Site = "//input[@id='txtMinimumDaysonJobSite']";
	static String Program_prog_parmtr_ClickeHere_To_add_trade_To_Exclude = "//a[@id='btnQuickAdd']";
	static String Program_prog_paramtr_clickHere_To_add_Classcode_To_Exclude = "//a[@id='btnQuickAddWorkclass']";
	static String Program_prog_paramtr_Enable_Contract_Number_Switch = "//div[@class='iosSwith clearfix']//div[@id='uniform-chkTrackContractNumber']";
	static String Program_Prog_paramtr_Alertforduplication_Switch = "//div[@class='iosSwith clearfix']//div[@id='uniform-chkDuplicateContractNumber']";
	static String Program_Prog_paramtr_Create_Contract_Number_template = "//textarea[@id='txtCNFormat']";
	static String Program_Prog_Paramtr_Create_Contract_Number_template_Select_token_from_here = "//li[@class='liContractNumber clearfix']//ul[@class='tokenPointer']";
	static String Program_Prog_paramtr_Contarct_number_sequence = "//input[@id='txtCNSequence']";
	static String Program_prog_paramtr_Enable_location_code = "//div[@id='uniform-chkTrackLocationCode']//span//div//div";
	static String Program_prog_paramtr_Create_Location_Code_template = "//textarea[@id='txtLocationCodeFormat']";
	static String Program_prog_paramtr_Create_Location_Code_template_SelectToken_from_here = "//li[@class='liLocationCode clearfix']//ul[@class='tokenPointer']";
	static String Program_prog_paramtr_Location_Code_Sequence = "//input[@id='txtLocationCodeSequence']";
	static String Program_prog_paramtr_Hign_EMR_Switch = "//div[@id='uniform-chkHighModRate']//div[@class='ios-ui-select']";
	static String Program_prog_paramtr_Mod_Rate_value = "//input[@id='txtHighModRate']";
	static String Program_prog_paramtr_Closeout_Contract_Value_Variance_Alert_Switch = "//div[@id='uniform-chkCloseoutPayrollCV']//div[@class='ios-ui-select']";
	static String Program_prog_paramtr_Estimated_Payroll_To_CV_Ratio = "//div[@id='uniform-chkContractorDuringEnrollment']//div//div";
	static String Program_Prog_parmtr_Back_btn = "//input[@id='btnBackGeneralInformation']";
	static String Program_Prog_parmtr_Save_btn = "//input[@class='btn btn-primary'and @title='Save'][1]";
	static String Program_Prog_parmtr_Saveand_vClsoe_btn = "//input[@class='btn btn-primary'and @title='Save and Close'][1]";
	static String Program_Prog_parmtr_SaveandContinue_btn = "//input[@class='btn btn-success'and @title='Save and Continue'][1]";

	// Email Management

	static String Program_Email_Managmnt_close_Btn = "//input[@id='btnBackEmailManagement']";
	static String Program_Email_Managmnt_Save_Btn = "//input[@id='btnSaveGeneralInformation']";
	static String Program_Email_Managmnt_SaveandClose_Btn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String program_Email_Managmnt_SaveandContinue_Btn = "//input[@id='btnNextGeneralInfomation']";

	// Contractor Porttal

	static String Program_Activate_Contract_Portal_Switch = "//div[@id='uniform-chkContractorPortalAccess']//div[@class='ios-ui-select']";
	static String Program_Contract_Port_Save_Btn = "//input[@id='btnSaveCPOption']";
	static String Program_Contract_Port_SaveandContinue_Btn = "//input[@id='btnNextCPOption']";
	static String Program_Contract_Port_SaveandClsoe_Btn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String Program_Contract_Port_Back_Btn = "//input[@id='btnBackCPOption']";

	// user Access

	static String Program_User_Access_SaveandContinue_btn = "//input[@id='btnSaveandClose']";
	static String Program_User_Access_FinishandClose_Btn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String Program_User_Access_Back_Btn = "//input[@id='btnBackUserAccess']";

	// PayRoll and CV Tracking

	static String Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_Yes_btn = "//button[@id='btnQuotaShareYes']";
	static String Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_No_btn = "//button[@id='btnQuotaShareNo']";
	static String Program_PayRollandCVTrack_Save_Btn = "//input[@id='btnSavePayrollCVTrack']";
	static String Program_PayRollandCVTrack_SaveandContinue_Btn = "//input[@id='btnNextPayrollCVTrack']";
	static String Program_PayRollandCVTrack_SaveandClose_Btn = "//input[@id='btnSaveandClosePayrollCVTrack']";
	static String Program_PayRollandCVTrack_Back_Btn = "//input[@id='btnBackPayrollCVTrack']";

	// Non-CIP-Compliance

	static String Program_NonCIP_SaveandContinue_Btn = "//a[@id='btnSaveandContinueCompliance']";
	static String Program_NonCIP_Back_Btn = "//input[@id='btnBackCompliance']";

	// Premium Modifications

	static String Program_PremiumModifictions_Page_Headigs_text = "//span[@id='lblAddEditNote']";
	static String Program_PremiumModifictions_Page_Save_Btn = "//input[@id='btnSave']";
	static String Program_PremiumModifictions_Page_SaveandContinue_Btn = "//input[@id='btnSaveContinue']";
	static String Program_PremiumModifictions_Page_SaveandClose_Btn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String Program_PremiumModifictions_Page_Back_Btn = "//input[@id='btnBack']";

	public static WebElement Program_PremiumModifictions_Page_Headigs_text(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PremiumModifictions_Page_Headigs_text));
		return element;
	}

	public static WebElement Program_PremiumModifictions_Page_Save_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PremiumModifictions_Page_Save_Btn));
		return element;
	}

	public static WebElement Program_PremiumModifictions_Page_SaveandContinue_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PremiumModifictions_Page_SaveandContinue_Btn));
		return element;
	}

	public static WebElement Program_PremiumModifictions_Page_SaveandClose_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PremiumModifictions_Page_SaveandClose_Btn));
		return element;
	}

	public static WebElement Program_PremiumModifictions_Page_Back_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PremiumModifictions_Page_Back_Btn));
		return element;
	}

	public static WebElement Program_NonCIP_Back_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_NonCIP_Back_Btn));
		return element;
	}

	public static WebElement Program_NonCIP_SaveandContinue_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_NonCIP_SaveandContinue_Btn));
		return element;
	}

	public static WebElement Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_Yes_btn(WebDriver driver) {
		element = driver.findElement(
				By.xpath(Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_Yes_btn));
		return element;
	}

	public static WebElement Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_No_btn(WebDriver driver) {
		element = driver.findElement(
				By.xpath(Program_PayrollandCVTrack_Do_you_want_to_track_Payroll_and_or_Contract_Value_No_btn));
		return element;
	}

	public static WebElement Program_PayRollandCVTrack_Save_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PayRollandCVTrack_Save_Btn));
		return element;
	}

	public static WebElement Program_PayRollandCVTrack_SaveandContinue_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PayRollandCVTrack_SaveandContinue_Btn));
		return element;
	}

	public static WebElement Program_PayRollandCVTrack_SaveandClose_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PayRollandCVTrack_SaveandClose_Btn));
		return element;
	}

	public static WebElement Program_PayRollandCVTrack_Back_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_PayRollandCVTrack_Back_Btn));
		return element;
	}

	public static WebElement Program_User_Access_FinishandClose_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_User_Access_FinishandClose_Btn));
		return element;
	}

	public static WebElement Program_User_Access_Back_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_User_Access_Back_Btn));
		return element;
	}

	public static WebElement Program_User_Access_SaveandContinue_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_User_Access_SaveandContinue_btn));
		return element;
	}

	public static WebElement Program_Activate_Contract_Portal_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Activate_Contract_Portal_Switch));
		return element;
	}

	public static WebElement Program_Contract_Port_Save_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Contract_Port_Save_Btn));
		return element;
	}

	public static WebElement Program_Contract_Port_SaveandContinue_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Contract_Port_SaveandContinue_Btn));
		return element;
	}

	public static WebElement Program_Contract_Port_SaveandClsoe_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Contract_Port_SaveandClsoe_Btn));
		return element;
	}

	public static WebElement Program_Contract_Port_Back_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Contract_Port_Back_Btn));
		return element;
	}

	public static WebElement Programme_Close_Btn_Common_for_All(WebDriver driver) {
		element = driver.findElement(By.xpath(Programme_Close_Btn_Common_for_All));
		return element;
	}

	public static WebElement Program_Email_Managmnt_close_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Email_Managmnt_close_Btn));
		return element;
	}

	public static WebElement Program_Email_Managmnt_Save_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Email_Managmnt_Save_Btn));
		return element;
	}

	public static WebElement Program_Email_Managmnt_SaveandClose_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Email_Managmnt_SaveandClose_Btn));
		return element;
	}

	public static WebElement program_Email_Managmnt_SaveandContinue_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(program_Email_Managmnt_SaveandContinue_Btn));
		return element;
	}

	public static WebElement Program_prog_Parmtr_Minimum_ContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_Parmtr_Minimum_ContractValue));
		return element;
	}

	public static WebElement Program_prog_parmtr_Minimum_Man_Hrs(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_parmtr_Minimum_Man_Hrs));
		return element;
	}

	public static WebElement Program_Prog_minumum_payroll(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_minumum_payroll));
		return element;
	}

	public static WebElement Program_prog_Parmtr_Minimun_Days_On_Job_Site(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_Parmtr_Minimun_Days_On_Job_Site));
		return element;
	}

	public static WebElement Program_prog_parmtr_ClickeHere_To_add_trade_To_Exclude(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_parmtr_ClickeHere_To_add_trade_To_Exclude));
		return element;
	}

	public static WebElement Program_prog_paramtr_clickHere_To_add_Classcode_To_Exclude(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_clickHere_To_add_Classcode_To_Exclude));
		return element;
	}

	public static WebElement Program_prog_paramtr_Enable_Contract_Number_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Enable_Contract_Number_Switch));
		return element;
	}

	public static WebElement Program_Prog_paramtr_Alertforduplication_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_paramtr_Alertforduplication_Switch));
		return element;
	}

	public static WebElement Program_Prog_paramtr_Create_Contract_Number_template(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_paramtr_Create_Contract_Number_template));
		return element;
	}

	public static WebElement Program_prog_paramtr_Create_Location_Code_template_SelectToken_from_here(WebDriver driver) {
		element = driver
				.findElement(By.xpath(Program_prog_paramtr_Create_Location_Code_template_SelectToken_from_here));
		return element;
	}

	public static WebElement Program_prog_paramtr_Location_Code_Sequence(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Location_Code_Sequence));
		return element;
	}

	public static WebElement Program_prog_paramtr_Hign_EMR_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Hign_EMR_Switch));
		return element;
	}

	public static WebElement Program_prog_paramtr_Mod_Rate_value(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Mod_Rate_value));
		return element;
	}

	public static WebElement Program_prog_paramtr_Closeout_Contract_Value_Variance_Alert_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Closeout_Contract_Value_Variance_Alert_Switch));
		return element;
	}

	public static WebElement Program_prog_paramtr_Estimated_Payroll_To_CV_Ratio(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_prog_paramtr_Estimated_Payroll_To_CV_Ratio));
		return element;
	}

	public static WebElement Program_Prog_parmtr_Back_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_parmtr_Back_btn));
		return element;
	}

	public static WebElement Program_Prog_parmtr_Save_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_parmtr_Save_btn));
		return element;
	}

	public static WebElement Program_Prog_parmtr_Saveand_vClsoe_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_parmtr_Saveand_vClsoe_btn));
		return element;
	}

	public static WebElement Program_Prog_parmtr_SaveandContinue_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Prog_parmtr_SaveandContinue_btn));
		return element;
	}

	public static WebElement Programme_Plus_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Programme_Plus_Btn));
		return element;
	}

//	public static WebElement ProgrammeICon(WebDriver driver) {
//		element = driver.findElement(By.xpath(ProgrammeICon));
//		return element;
//	}

	public static WebElement Program_GenInfo_Headers_AddProgramm_Txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Headers_AddProgramm_Txt));
		return element;
	}

	public static WebElement Program_GenInfo_TopHeadings_Txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_TopHeadings_Txt));
		return element;
	}

	public static WebElement Program_GenInfo_programme_Name(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_programme_Name));
		return element;
	}

	public static WebElement Program_GenInfo_programme_Code(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_programme_Code));
		return element;
	}

	public static WebElement Program_GenInfo_PolicyType(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_PolicyType));
		return element;
	}

	public static WebElement Program_GenInfo_Programme_Type(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Programme_Type));
		return element;
	}

	public static WebElement Program_GenInfo_ProgramAdministrator(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_ProgramAdministrator));
		return element;
	}

	public static WebElement Program_GenInfo_Sponsor(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Sponsor));
		return element;
	}

	public static WebElement Program_GenInfo_Status_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Status_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Track_OffSite_Coverage_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Track_OffSite_Coverage_Switch));
		return element;
	}

	public static WebElement Program_Track_offsite_Policy_Limits_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_Track_offsite_Policy_Limits_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Manage_CIP_Certificates_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Manage_CIP_Certificates_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Track_Insured_Cost_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Track_Insured_Cost_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Track_Change_Order_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Track_Change_Order_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Excluded_Contractors_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Excluded_Contractors_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_TrackFixedcost_Time_material_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_TrackFixedcost_Time_material_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Track_Rates_Fees_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Track_Rates_Fees_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_GLDeducn_Sir_Loss_Charge_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_GLDeducn_Sir_Loss_Charge_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Maintenance_Wrap_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Maintenance_Wrap_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Is_trade_Required_For_a_Contractor_package_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Is_trade_Required_For_a_Contractor_package_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Minimum_Requirements_Enrolled_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Minimum_Requirements_Enrolled_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_RequirecloseOut_for_Lower_tier_Contractors_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_RequirecloseOut_for_Lower_tier_Contractors_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Show_DBA_on_CIPCOIS_Reports_Switch(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Show_DBA_on_CIPCOIS_Reports_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Contractor_to_verified_Insurancee_Cost_Comparision_Switch(WebDriver driver) {
		element = driver
				.findElement(By.xpath(Program_GenInfo_Contractor_to_verified_Insurancee_Cost_Comparision_Switch));
		return element;
	}

	public static WebElement Program_GenInfo_Contact_name(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Contact_name));
		return element;
	}

	public static WebElement Program_GenInfo_EmailAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_EmailAddress));
		return element;
	}

	public static WebElement Program_GenInfo_Telephone_Number(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Telephone_Number));
		return element;
	}

	public static WebElement Program_GenInfo_Fax_Number(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Fax_Number));
		return element;
	}

	public static WebElement Program_GenInfo_Bid_Type(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Bid_Type));
		return element;
	}

	public static WebElement Program_GenInfo_Estimate_Program_Construction_Value(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Estimate_Program_Construction_Value));
		return element;
	}

	public static WebElement Program_GenInfo_Program_Begin_Date(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Program_Begin_Date));
		return element;
	}

	public static WebElement Program_GenInfo_Program_Estimated_Completion_date(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Program_Estimated_Completion_date));
		return element;
	}

	public static WebElement Program_GenInfo_SaveandContinue_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_SaveandContinue_btn));
		return element;
	}

	public static WebElement Program_GenInfo_SaveandClsoe_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_SaveandClsoe_btn));
		return element;
	}

	public static WebElement Program_GenInfo_Save_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Save_btn));
		return element;
	}

	public static WebElement Program_GenInfo_close_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_close_btn));
		return element;
	}

	public static WebElement Program_GenInfo_Note(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Note));
		return element;
	}

	public static WebElement Program_genInfo_Program_Maximum_Rate(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_genInfo_Program_Maximum_Rate));
		return element;
	}

	public static WebElement Program_GenInfo_Program_Minimum_Rate(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Program_Minimum_Rate));
		return element;
	}

	public static WebElement Program_GenInfo_Estimated_Hours(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Estimated_Hours));
		return element;
	}

	public static WebElement Program_GenInfo_Estimated_Payroll(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Estimated_Payroll));
		return element;
	}

	public static WebElement Program_GenInfo_Total_Program_Insurance_cost(WebDriver driver) {
		element = driver.findElement(By.xpath(Program_GenInfo_Total_Program_Insurance_cost));
		return element;
	}

	public static WebElement Program_GenInfo_projected_Losses(WebDriver driver) {
		return element;
	}

	// Raja wrote this from ProgrammValidations Page
	// Xpaths of WebElements
		//static String ProgrammeICon = "//span[@id='ctl00_ContentPlaceHolder1_spnProject']";
		static String Programmesearchbar = "//input[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_txtSearch']";
		static String EditBtnProgrammeICON = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
		static String AdvancesearchbarIcon = "//a[@class='tipB']//i[@class='fa fa-caret-down']";
		static String RefreshbBtnProgramme = "//i[@class='fa fa-refresh']";
		static String PlusBtnProgramme = "//i[@class='fa fa-plus']";
		static String DeletebBtnProgramme = "//li[@id = 'ctl00_ContentPlaceHolder1_ctrlProjectList_lidelete']//i[@class='fa fa-trash-o']";
		static String AdvsearchsearchBtn = "//input[@id='btnAdvanceSearch']";
		static String SelectProgramAdminGIPage = "//select[@id='ddlNodeAdministrator']";
		static String AdvsearchSelectStatus = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlStatus']";
		static String AdvsearchSelectPolicyType = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlProjectType']";
		static String AdvsearchSelectProgramAdmin = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlNodeAdministrator']";
		static String AdvsearchSelectProgramSponsor = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlOwner']";
		static String AdvsearchSelectProgramType = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlProgramType']";
		static String AdvsearchSelectBidType = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlBidType']";
		static String AdvSearchTrackInsurancecost = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlTrackCreditDeduct']";
		static String AdvSearchManageCIPcertificates = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlManageCIPCertificates']";
		static String AdvsearchSelectContractNumber = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlSelectContractNumber']";
		static String AdvsearchSelectActiveContractPortal = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlActiveContractorPortal']";
		static String AdvsearchSelectCateogory = "//button[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_btnDropdown']";
		static String AdvsearchSelectFlag = "//div[@id='changeFlag']";
		static String AdvsearchSortingExpressionProgramName = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlSortingExpression']";
		static String AdvsearchSortingOrder = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlSortingOrder']";
		static String AdvsearchCloseBtn = "//span[@class='flft']//button[@class='btn']";
		// General Information Page
		static String programmeNamefeild = "//input[@id='txtProjectName']";
		static String ErrorMessagefor_programmeNamefeild = "//label[@for='txtProjectName' and @class='error']";
		static String ProgrammeAdministartrfeildGIPage = "//select[@id='ddlNodeAdministrator']";
		static String ProgramDBASwitchGIPage = "//div[@id='uniform-chkIsShowDBA']/span//div[@class='ios-ui-select checked' or 'ios-ui-select ']";
		static String ProgramDBASwitchtextSeperatorGIPage = "//input[@id='txtDBAText']";
		static String ProgramSponsofeildGIPage = "//select[@id='ddlOwner']";
		static String AlertMessage_ProgrammeAdmin_feild_GI = "//ul[@id='divErrorMessage']/li";
		static String AlertMessage_ProgrammeSponsor_feild_GI = "//ul[@id='divErrorMessage']/li/../..";
		static String AlertMsgCloseBtn = "//ul[@id='divErrorMessage']";
		static String SaveandContinueBtn_GI = "//input[@id='btnNextGeneralInfomation']";
		static String ProgrammeNameErrormsg = "//label[@for='txtProjectName' and @class='error']";
		static String programmeNameAlertmsg = "//ul[@id='divErrorMessage']/li/..";
		static String CloseBtn = "//div[@class='modal-footer']//a";
		static String SearchProgrammeAdmin = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlNodeAdministrator']";
		static String selectProgrammeType = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlProgramType']";
		static String SaveBtn_GI = "//div[@class='fright']//input[@id='btnSaveGeneralInformation']";
		static String ErrorMsg_ProgAdminFeild_GI = "//span[@id='RequiredFieldValidator1']";
		static String ErrorMsg_ProgramponsorFeild_GI = "//span[@id='reqProject']";
		static String AlertCloseBtn = "//a[@class='btn']";
		// programme parameters
		static String EnablecontractNumber_Switch = "//div[@id='uniform-chkTrackContractNumber']//div[ @class='ios-ui-select checked']";
		static String ConfirmMessage_EnablecontractNumber_Switch = "//div[@class='modalConfirmMessage']";
		static String EnableLocationcode_Switch = "//div[@id='uniform-chkTrackLocationCode']//div[@class='ios-ui-select checked']";
		static String ConfirmMessage_EnableLocationCode = "//div[@class='modalConfirmMessage']";
		static String OKBtn_ConfirmMessage = "//div[@class='modal-footer']//button[@id='btnYes']";
		static String SaveandContinueBtn_ProgParameters = "//input[@value='Save and Continue'][1]";

		// Email Management page

		static String SaveandContinueBtn_EmailMangament = "//input[@id='btnNextGeneralInfomation']";

		// Contractor portal

		static String ActivateContractorPortalSwitch = "//div[@class='pull-left']//div[@class='ios-ui-select']";
		static String AlertMessage_Contractorportal_Switch = "//div[@class='modalAlertMessage']";
		static String OKBtn_AlertMessage_Contractorportal_Switch = "//div[@class='modal-footer']//button[@class='btn btn-primary pull-right']";
		static String SaveandContinueBtn_ContrcatorportalPage = "//input[@id='btnNextCPOption']";

		// User Access page

		static String saveandContinueBtn_UserAccess = "//input[@id='btnSaveandClose']";
		// Payroll and CV tracking

		static String Yes_ICon_forCV_tracking = "//button[@id='btnQuotaShareYes']";
		static String PayrollCV_Submission_Frequency_Dropdwon = "//select[@id='ddlFrequency']";
		static String PayrollCV_Reporting_Time_Period_Dropdwon = "//select[@id='ddlReporting']";
		static String ErrorMessgae_payrollCV_SubmissionFrequnbecy_Dropdown = "//span[@id='RequiredFieldValidator2' and @class='errormessage']";
		static String SaveandContinueBtn_PayrollandCV_page = "//input[@id='btnNextPayrollCVTrack']";
		static String Alertmsg_payrollCV_SubmissionFrequnbecy_Dropdown = "//ul[@id='divErrorMessage']";
		static String Alertmsg_Reporting_Time_Period_Dropdwon = "//ul[@id='divErrorMessage']/li";
		static String closebtn_Alertmsg_payrollandCVpage = "//div[@class='modal-footer']//a[@class='btn']";
		static String TrackCappedUncappedpayrollSwitchAlertNOBtn = "//button[@id='btnNoCapped']";
		static String TrackCappedUncappedpayrollSwitchAlertYESBtn = "//button[@id='btnYesCapped']";
		static String TrackCappedUncappedpayrollSwitch = "//div[@id='uniform-chkCapUnCapPayroll']//span//div[@class='ios-ui-select checked' or 'ios-ui-select ']";
		static String TrackCappedUncappedpayrollSwitchAlertMsg = "//div[@id='CustomConfirmCappedModel']//div[@class='modalAlertMessage']";
		// Non-CIP-Complinace

		static String NonCIPComplianceName_Feild = "//input[@id='txtComplianceName']";
		static String CloseBtn_NonCIP_page = "//button[@class='btn']";
		static String AlertMsg_NonCIP_name_feild = "//div[contains(text(), ' Enter Compliance Name.')]";
		static String SaveBtn_NonCIP_name_feild = "//input[@id='btnSave']";
		static String SaveandcloseBtn_NonCIP_name_feild = "//input[@id='btnSaveCompliance']";
		static String NonCIPComplianceNameErrMsg = "//span[@id='rfvComplianceName' and @class='errormessage']";
		static String SaveandContinueButton_Non_CIP_compliancePage = "//a[@id='btnSaveandContinueCompliance']";
		static String EditBtn_nonCIP_Compliance_Page = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
		static String NonCIPComplianceNameAlertMsgOKBtn = "//button[@class='btn btn-primary pull-right']";
		static String NonCIPComplianceEditpageAlertMsg = "//div[@class='modalAlertMessage']";
		static String NonCIPUpdatAlertOKBtn = "//button[@id='btnSaveModal']";
		static String NonCIPUdateAlertMsg = "//div[@id='DivBody']";
		// premium Modifications

		static String SaveandContinueBtn_PremiumModfications = "//input[@name='btnSaveContinue']";
		static String PremiumModificationsGenliablityFactorFeild = "//input[@id='rptGLUMBPremiumModification_ctl00_txtFactor']";
		static String PremiumModficationsGenLiabilityAlertMsg = "//div[@id='alertModalPopup']//div[@class='modalAlertMessage']";
		static String PremiumModficationsGenLiabilityAlertMsgOKBtn = "//button[@class='btn btn-primary pull-right']";
		static String PremiumModifcationsUMBFeild = "//input[@id='rptGLUMBPremiumModification_ctl01_txtFactor']";
		static String PremiumModifcationsPollutionChargeFeild = "//input[@id='txtPollutionChargefactor']";

		// Policy and Cerificates

		static String PolicyandCertificatessavenadContinueBtn = "//input[@id='btnNextPolicyManagement']";
		static String PolicyCertificatesGenLiabilityOpenPolicyBtn = "//a[@id='aGLEidt']";
		static String PolicyCertificatesWCOpenPolicyBtn = "//a[@id='aWCEdit']";
		static String PolicyCertificatesGLiablitySelectCarrier = "//select[@id='ctrlGLPolicy_ddlCarrier']";
		static String PolicyCertificatesGLSelectCarrierErrMsg = "//span[@id='ctrlGLPolicy_rfvCarrier']";
		static String PolicyCertificatesGLiabilityPolicyEffectiveDate = "//input[@id='ctrlGLPolicy_txtPolicyEffectiveDate1']";
		static String PolicyCertificatesGLiabilityPolicyExpiryDate = "//input[@id='ctrlGLPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesGLiabilitySaveBtn = "//input[@id='ctrlGLPolicy_btnSave']";
		static String PolicyCertificatesGLiabilityCloseBtn = "//button[@onclick='window.close(WebDriver driver);']";
		static String PolicyCertificatesGLiabilitySaveandCloseBtn = "//input[@id='ctrlGLPolicy_btnSaveandClose']";
		static String PolicyCertifcatesGLLiablityPolicyExpiryDateErrMsgonEffectiveDate = "//label[@for='ctrlGLPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesWCPolicyEffectiveDate = "//input[@id='ctrlWCPolicy_txtPolicyEffectiveDate1']";
		static String PolicyCertificatesWCPolicyExpiryDate = "//input[@id='ctrlWCPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesWCSelectCarrier = "//select[@id='ctrlWCPolicy_ddlCarrier']";
		static String PolicyCertificatesWCPolicyEffectiveDateErrmsg = "//label[@for='ctrlWCPolicy_txtPolicyEffectiveDate1']";
		static String PolicyCertificatesWCPolicyExpiryDateErrMsgonEffectiveDate = "//label[@for='ctrlWCPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesGLiabilityPolicyEffectiveDateErrMsg = "//label[@for='ctrlGLPolicy_txtPolicyEffectiveDate1']";
		static String PolicyCertificatesGLiabilityPolicyExpiryDateErrMsg = "//label[@for='ctrlGLPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesWCPolicySaveandCloseBtn = "//input[@id='ctrlWCPolicy_btnSaveandClose']";
		static String PolicyCertificatesWCPolicyCarrierErrMsg = "//span[@id='ctrlWCPolicy_rfvCarrier']";
		static String PolicyCertificatesWCPolicyExpiryDateErrMsg = "//label[@for='ctrlWCPolicy_txtPolicyExpirationDate1']";
		static String PolicyCertificatesSaveandCloseBtn="//input[@id='btnSaveandClose']";
		// Fixed rates

		static String FixedratesSaveandClsoeBtn = "//input[@id='btnSaveandCloseFixedCost']";
		static String FixedratesSaveandContinueBtn="//input[@id='btnSaveClose' and @class='btn btn-success']";
		static String FixedratesSaveBtn="//input[@id='btnSave']";
		static String FixedratesBackBtn="//input[@id='btnBack']";
		static String FixedratesCloseBtn="//button[@id='divClose']";

		// Claims

		static String ClaimsModule_Btn = "//a[@id='ctrlProjectAddUpdate_aClaims']";
		static String ClaimsModule_UploadBtn = "//input[@id='btnUpload']";
		static String ClaimsModule_ProgrammnameDropdown = "//select[@id='rptColumnMapping_ctl00_ddlExcelColumns']";
		static String ClaimsModule_ProjectNameDropdown = "//select[@id='rptColumnMapping_ctl01_ddlExcelColumns']";
		static String ClaimsModule_Tradename = "//select[@id='rptColumnMapping_ctl02_ddlExcelColumns']";
		static String ClaimsModule_tardenumber = "//select[@id='rptColumnMapping_ctl03_ddlExcelColumns']";
		static String ClaimsModule_Company_Name = "//select[@id='rptColumnMapping_ctl04_ddlExcelColumns']";
		static String ClaimsModule_Claim_Date = "//select[@id='rptColumnMapping_ctl05_ddlExcelColumns']";
		static String ClaimsModule_ClaimsDescriprtion = "//select[@id='rptColumnMapping_ctl06_ddlExcelColumns']";
		static String ClaimsModule_ClaimsAmount = "//select[@id='rptColumnMapping_ctl07_ddlExcelColumns']";
		static String ClaimsModule_ClaimsStatus = "//select[@id='rptColumnMapping_ctl08_ddlExcelColumns']";
		static String ClaimsModuleEnteredDate = "//select[@id='rptColumnMapping_ctl09_ddlExcelColumns']";
		static String ClaimsModule_CreatedDate = "//select[@id='rptColumnMapping_ctl10_ddlExcelColumns']";
		static String Claimsmodule_claimNumber = "//select[@id='rptColumnMapping_ctl11_ddlExcelColumns']";
		static String ClaimModule_ClaimType = "//select[@id='rptColumnMapping_ctl12_ddlExcelColumns']";
		static String ClaimModule_Claimantname = "//select[@id='rptColumnMapping_ctl13_ddlExcelColumns']";
		static String ClaimModule_Lossdate = "//select[@id='rptColumnMapping_ctl14_ddlExcelColumns']";
		static String ClaimModule_LossDays = "//select[@id='rptColumnMapping_ctl15_ddlExcelColumns']";
		static String ClaimModule_ReportDate = "//select[@id='rptColumnMapping_ctl16_ddlExcelColumns']";
		static String ClaimModule_ClosedDate = "//select[@id='rptColumnMapping_ctl17_ddlExcelColumns']";
		static String ClaimModule_Cause = "//select[@id='rptColumnMapping_ctl18_ddlExcelColumns']";
		static String ClaimModule_NatureofInquiery = "//select[@id='rptColumnMapping_ctl19_ddlExcelColumns']";
		static String ClaimModule_partofBody = "//select[@id='rptColumnMapping_ctl20_ddlExcelColumns']";
		static String ClaimModule_Insured_Outstanding_Medical_BI_Comp = "//select[@id='rptColumnMapping_ctl21_ddlExcelColumns']";
		static String ClaimModule_Insured_Outstanding_Expense = "//select[@id='rptColumnMapping_ctl22_ddlExcelColumns']";
		static String ClaimModule_Insured_Outstanding_Indemnity_PD_Coll = "//select[@id='rptColumnMapping_ctl23_ddlExcelColumns']";
		static String ClaimsModule_Insured_Outstanding_Legal = "//select[@id='rptColumnMapping_ctl24_ddlExcelColumns']";
		static String ClaimsModule_Insured_Paid_Medical_BI_Comp = "//select[@id='rptColumnMapping_ctl25_ddlExcelColumns']";
		static String ClaimsModule_Insured_Paid_Indemnity_PD_Coll = "//select[@id='rptColumnMapping_ctl26_ddlExcelColumns']";
		static String ClaimsModule_Insured_Paid_Expense = "//select[@id='rptColumnMapping_ctl27_ddlExcelColumns']";
		static String ClaimsModule_Insured_Paid_Legal = "//select[@id='rptColumnMapping_ctl28_ddlExcelColumns']";
		static String ClaimsModule_Recovery_Rec_Medical_BI_Comp = "//select[@id='rptColumnMapping_ctl29_ddlExcelColumns']";
		static String ClaimsModule_Recovery_Indemnity_PD_Coll = "//select[@id='rptColumnMapping_ctl30_ddlExcelColumns']";
		static String ClaimsModule_Recovery_Recovered_Expense = "//select[@id='rptColumnMapping_ctl31_ddlExcelColumns']";
		static String ClaimsModule_Net_Insured_Total = "//select[@id='rptColumnMapping_ctl32_ddlExcelColumns']";
		static String ClaimsModule_Claimant_Address_1 = "//select[@id='rptColumnMapping_ctl33_ddlExcelColumns']";
		static String ClaimsModule_Claimant_Address_2 = "//select[@id='rptColumnMapping_ctl34_ddlExcelColumns']";
		static String ClaimsModule_Claimant_City = "//select[@id='rptColumnMapping_ctl35_ddlExcelColumns']";
		static String ClaimsModule_Claimant_State = "//select[@id='rptColumnMapping_ctl36_ddlExcelColumns']";
		static String ClaimsModule_Claimant_ZIPCode_Postal_code = "//select[@id='rptColumnMapping_ctl37_ddlExcelColumns']";
		static String ClaimsModule_Claimant_Phone = "//select[@id='rptColumnMapping_ctl38_ddlExcelColumns']";
		static String ClaimsModule_Claims_Loss_Time = "//select[@id='rptColumnMapping_ctl39_ddlExcelColumns']";
		static String ClaimsModule_Total_Outstanding = "//select[@id='rptColumnMapping_ctl40_ddlExcelColumns']";
		static String ClaimsModule_Nextbtn = "//input[@id='btnNext']";
		static String ClaimsModule_saveandCloseBtn = "//input[@id='btnSaveClose']";

		// Custom Forms

		static String CustomFormsHeading = "//a[@id='ctrlProjectAddUpdate_aCustomForms']";
		static String CustomFormsSaveandCloseBtn = "//input[@id='btnSaveClose']";
		static String CustomFormsSaveancContinueBtn = "//input[@id='btnSaveContinue']";
		static String CustomFormsBackbtn = "//input[@id='btnBack']";
		static String CustomFormsCloseBtn = "//button[@onclick='closeWindow(0);']";

		// BenchMark

		static String BenchMarkSaveancCloseBtn = "//input[@id='btnSaveClose']";
		static String BenchMarkBackBtn = "//input[@id='btnBack']";
		static String BenchMarkCloseBtn = "//button[@onclick='closeWindow(0);']";

		// CustomFeild

		
		static String CustomfeildBackBtn = "//input[@id='ctrlProjectCustomField_btnBack']";
		static String CustomfeildSaveBtn = "//input[@id='ctrlProjectCustomField_btnSave']";
		static String CustomfeildFinishandCloseBtn = "//input[@id='ctrlProjectCustomField_btnSaveClose']";

		// MoreButon Options

		static String MoreBtnHeading = "//li[@class='greedy-dropdown']";
		static String MoreBtnNonCIPComplianceHeading = "//li[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_liCompliance']";
		static String MoreBtnPremiumModificationHeading = "//a[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_aPremiumModeProject']";
		static String MoreBtnPolicycyCertifcatesHeadings = "//a[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_aPolicyManagement']";
		static String MoreBtnFixedCostandRatesHeading = "//a[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_aFixedCosts']";
		static String MoreBtnClaimsHeading = "//a[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_aClaims']";
		static String MoreBtnCustomFormHeadings = "//a[@id='ctrlProjectCustomField_ctrlProjectAddUpdate_aCustomForms']";
		static String MoreBtnCustomfeildHeading = "//a[@id='ctrlProjectAddUpdate_aOtherInformation']";
		
		// Static String MoreBtn list
		
		static String MoreBtnListHeadings="//ul[@class='dropdown-menu-gridnav dropdown-menu-center greedy-menu']//li[@id]";
		
		
		
		public static List<WebElement>PolicyCertificatesSaveandCloseBtn(WebDriver driver){
			listElement = driver.findElements(By.xpath(PolicyCertificatesSaveandCloseBtn));
			return listElement;
		}
		public static List<WebElement>MoreBtnListHeadings(WebDriver driver){
			listElement = driver.findElements(By.xpath(MoreBtnListHeadings));
			return listElement;
		}
		
		public static WebElement FixedratesSaveandContinueBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(FixedratesSaveandContinueBtn));
			return element;
		}
		public static WebElement FixedratesSaveBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(FixedratesSaveBtn));
			return element;
		}
		
		public static WebElement FixedratesBackBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(FixedratesBackBtn));
			return element;
		}
		public static WebElement FixedratesCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(FixedratesCloseBtn));
			return element;
		}
		public static WebElement MoreBtnCustomfeildHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnCustomfeildHeading));
			return element;
		}
		public static WebElement MoreBtnCustomFormHeadings(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnCustomFormHeadings));
			return element;
		}

		public static WebElement MoreBtnClaimsHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnClaimsHeading));
			return element;
		}

		public static WebElement MoreBtnFixedCostandRatesHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnFixedCostandRatesHeading));
			return element;
		}

		public static WebElement MoreBtnPolicycyCertifcatesHeadings(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnPolicycyCertifcatesHeadings));
			return element;
		}

		public static WebElement MoreBtnHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnHeading));
			return element;
		}

		public static WebElement MoreBtnNonCIPComplianceHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnNonCIPComplianceHeading));
			return element;
		}

		public static WebElement MoreBtnPremiumModificationHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreBtnPremiumModificationHeading));
			return element;
		}

		public static WebElement CustomFormsBackbtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomFormsBackbtn));
			return element;
		}

		public static WebElement CustomFormsCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomFormsCloseBtn));
			return element;
		}

		public static WebElement BenchMarkSaveancCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(BenchMarkSaveancCloseBtn));
			return element;
		}

		public static WebElement CustomFormsSaveancContinueBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomFormsSaveancContinueBtn));
			return element;
		}

		public static WebElement CustomFormsSaveandCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomFormsSaveandCloseBtn));
			return element;
		}

		public static WebElement CustomFormsHeading(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomFormsHeading));
			return element;
		}

		public static WebElement BenchMarkBackBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(BenchMarkBackBtn));
			return element;
		}

		public static WebElement BenchMarkCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(BenchMarkCloseBtn));
			return element;
		}

		public static WebElement CustomfeildFinishandCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomfeildFinishandCloseBtn));
			return element;
		}

		public static WebElement CustomfeildSaveBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomfeildSaveBtn));
			return element;
		}

		public static WebElement CustomfeildBtnBackBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CustomfeildBackBtn));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyCarrierErrMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyCarrierErrMsg));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicySaveandCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicySaveandCloseBtn));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilityPolicyEffectiveDateErrMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilityPolicyEffectiveDateErrMsg));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyExpiryDateErrMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyExpiryDateErrMsg));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyExpiryDateErrMsgonEffectiveDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyExpiryDateErrMsgonEffectiveDate));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyEffectiveDateErrmsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyEffectiveDateErrmsg));
			return element;
		}

		public static WebElement PolicyCertificatesWCSelectCarrier(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCSelectCarrier));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyExpiryDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyExpiryDate));
			return element;
		}

		public static WebElement PolicyCertificatesWCPolicyEffectiveDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCPolicyEffectiveDate));
			return element;
		}

		public static WebElement PolicyCertifcatesGLLiablityPolicyExpiryDateErrMsgonEffectiveDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertifcatesGLLiablityPolicyExpiryDateErrMsgonEffectiveDate));
			return element;
		}

		public static WebElement PremiumModifcationsPollutionChargeFeild(WebDriver driver) {
			element = driver.findElement(By.xpath(PremiumModifcationsPollutionChargeFeild));
			return element;
		}

		public static WebElement PolicyCertificatesGenLiabilityOpenPolicyBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGenLiabilityOpenPolicyBtn));
			return element;
		}

		public static WebElement PolicyCertificatesWCOpenPolicyBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesWCOpenPolicyBtn));
			return element;
		}

		public static WebElement PolicyCertificatesGLiablitySelectCarrier(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiablitySelectCarrier));
			return element;
		}

		public static WebElement PolicyCertificatesGLSelectCarrierErrMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLSelectCarrierErrMsg));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilityPolicyEffectiveDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilityPolicyEffectiveDate));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilityPolicyExpiryDate(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilityPolicyExpiryDate));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilityCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilityCloseBtn));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilitySaveandCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilitySaveandCloseBtn));
			return element;
		}

		public static WebElement PolicyCertificatesGLiabilitySaveBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyCertificatesGLiabilitySaveBtn));
			return element;
		}

		public static WebElement PremiumModifcationsUMBFeild(WebDriver driver) {
			element = driver.findElement(By.xpath(PremiumModifcationsUMBFeild));
			return element;
		}

		public static WebElement PremiumModficationsGenLiabilityAlertMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(PremiumModficationsGenLiabilityAlertMsg));
			return element;
		}

		public static WebElement PremiumModficationsGenLiabilityAlertMsgOKBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PremiumModficationsGenLiabilityAlertMsgOKBtn));
			return element;
		}

		public static WebElement PremiumModificationsGenliablityFactorFeild(WebDriver driver) {
			element = driver.findElement(By.xpath(PremiumModificationsGenliablityFactorFeild));
			return element;
		}

		public static WebElement NonCIPUpdatAlertOKBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPUpdatAlertOKBtn));
			return element;
		}

		public static WebElement NonCIPUdateAlertMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPUdateAlertMsg));
			return element;
		}

		public static WebElement TrackCappedUncappedpayrollSwitchAlertMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(TrackCappedUncappedpayrollSwitchAlertMsg));
			return element;

		}

		public static WebElement NonCIPComplianceEditpageAlertMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPComplianceEditpageAlertMsg));
			return element;

		}

		public static WebElement TrackCappedUncappedpayrollSwitchAlertNOBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TrackCappedUncappedpayrollSwitchAlertNOBtn));
			return element;

		}

		public static WebElement TrackCappedUncappedpayrollSwitch(WebDriver driver) {
			element = driver.findElement(By.xpath(TrackCappedUncappedpayrollSwitch));
			return element;

		}

		public static WebElement TrackCappedUncappedpayrollSwitchAlertYESBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TrackCappedUncappedpayrollSwitchAlertYESBtn));
			return element;

		}

		public static WebElement AlertMsgCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertMsgCloseBtn));
			return element;

		}

		public static WebElement ProgramDBASwitchtextSeperatorGIPage(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgramDBASwitchtextSeperatorGIPage));
			return element;

		}

		public static WebElement ProgramDBASwitchGIPage(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgramDBASwitchGIPage));
			return element;

		}

		public static WebElement AdvsearchsearchBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchsearchBtn));
			return element;

		}

		public static WebElement AdvsearchCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchCloseBtn));
			return element;
		}

		public static WebElement AdvsearchSelectCateogory(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectCateogory));
			return element;
		}

		public static WebElement AdvsearchSelectFlag(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectFlag));
			return element;
		}

		public static WebElement AdvsearchSortingExpressionProgramName(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSortingExpressionProgramName));
			return element;
		}

		public static WebElement AdvsearchSortingOrder(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSortingOrder));
			return element;
		}

		public static WebElement AdvsearchSelectStatus(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectStatus));
			return element;
		}

		public static WebElement AdvsearchSelectPolicyType(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectPolicyType));
			return element;
		}

		public static WebElement AdvsearchSelectProgramAdmin(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectProgramAdmin));
			return element;
		}

		public static WebElement AdvsearchSelectProgramSponsor(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectProgramSponsor));
			return element;
		}

		public static WebElement AdvsearchSelectProgramType(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectProgramType));
			return element;
		}

		public static WebElement AdvsearchSelectBidType(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectBidType));
			return element;
		}

		public static WebElement AdvSearchTrackInsurancecost(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvSearchTrackInsurancecost));
			return element;
		}

		public static WebElement AdvSearchManageCIPcertificates(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvSearchManageCIPcertificates));
			return element;
		}

		public static WebElement AdvsearchSelectContractNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectContractNumber));
			return element;
		}

		public static WebElement AdvsearchSelectActiveContractPortal(WebDriver driver) {
			element = driver.findElement(By.xpath(AdvsearchSelectActiveContractPortal));
			return element;
		}

		public static WebElement AlertCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertCloseBtn));
			return element;
		}

		public static WebElement SaveandcloseBtn_NonCIP_name_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandcloseBtn_NonCIP_name_feild));
			return element;
		}

		public static WebElement ErrorMessagefor_programmeNamefeild(WebDriver driver) {
			element = driver.findElement(By.xpath(ErrorMessagefor_programmeNamefeild));
			return element;
		}

		public static WebElement ClaimsModule_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Btn));
			return element;
		}

		public static WebElement ClaimsModule_UploadBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_UploadBtn));
			return element;
		}

		public static WebElement ClaimsModule_ProgrammnameDropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_ProgrammnameDropdown));
			return element;
		}

		public static WebElement ClaimsModule_ProjectNameDropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_ProjectNameDropdown));
			return element;
		}

		public static WebElement ClaimsModule_Tradename(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Tradename));
			return element;
		}

		public static WebElement ClaimsModule_tardenumber(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_tardenumber));
			return element;
		}

		public static WebElement ClaimsModule_Company_Name(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Company_Name));
			return element;
		}

		public static WebElement ClaimsModule_Claim_Date(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claim_Date));
			return element;
		}

		public static WebElement ClaimsModule_ClaimsDescriprtion(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_ClaimsDescriprtion));
			return element;
		}

		public static WebElement ClaimsModule_ClaimsAmount(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_ClaimsAmount));
			return element;
		}

		public static WebElement ClaimsModule_ClaimsStatus(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_ClaimsStatus));
			return element;
		}

		public static WebElement ClaimsModuleEnteredDate(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModuleEnteredDate));
			return element;
		}

		public static WebElement ClaimsModule_CreatedDate(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_CreatedDate));
			return element;
		}

		public static WebElement ClaimModule_ClaimType(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_ClaimType));
			return element;
		}

		public static WebElement Claimsmodule_claimNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(Claimsmodule_claimNumber));
			return element;
		}

		public static WebElement ClaimModule_Claimantname(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Claimantname));
			return element;
		}

		public static WebElement ClaimModule_Lossdate(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Lossdate));
			return element;
		}

		public static WebElement ClaimModule_LossDays(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_LossDays));
			return element;
		}

		public static WebElement ClaimModule_ReportDate(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_ReportDate));
			return element;
		}

		public static WebElement ClaimModule_ClosedDate(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_ClosedDate));
			return element;
		}

		public static WebElement ClaimModule_Cause(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Cause));
			return element;
		}

		public static WebElement ClaimModule_NatureofInquiery(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_NatureofInquiery));
			return element;
		}

		public static WebElement ClaimModule_partofBody(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_partofBody));
			return element;
		}

		public static WebElement ClaimModule_Insured_Outstanding_Medical_BI_Comp(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Insured_Outstanding_Medical_BI_Comp));
			return element;
		}

		public static WebElement ClaimModule_Insured_Outstanding_Expense(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Insured_Outstanding_Expense));
			return element;
		}

		public static WebElement ClaimModule_Insured_Outstanding_Indemnity_PD_Coll(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimModule_Insured_Outstanding_Indemnity_PD_Coll));
			return element;
		}

		public static WebElement ClaimsModule_Insured_Outstanding_Legal(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Insured_Outstanding_Legal));
			return element;
		}

		public static WebElement ClaimsModule_Insured_Paid_Medical_BI_Comp(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Insured_Paid_Medical_BI_Comp));
			return element;
		}

		public static WebElement ClaimsModule_Insured_Paid_Indemnity_PD_Coll(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Insured_Paid_Indemnity_PD_Coll));
			return element;
		}

		public static WebElement ClaimsModule_Insured_Paid_Expense(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Insured_Paid_Expense));
			return element;
		}

		public static WebElement ClaimsModule_Insured_Paid_Legal(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Insured_Paid_Legal));
			return element;
		}

		public static WebElement ClaimsModule_Recovery_Rec_Medical_BI_Comp(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Recovery_Rec_Medical_BI_Comp));
			return element;
		}

		public static WebElement ClaimsModule_Recovery_Indemnity_PD_Coll(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Recovery_Indemnity_PD_Coll));
			return element;
		}

		public static WebElement ClaimsModule_Recovery_Recovered_Expense(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Recovery_Recovered_Expense));
			return element;
		}

		public static WebElement ClaimsModule_Net_Insured_Total(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Net_Insured_Total));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_Address_1(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_Address_1));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_Address_2(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_Address_2));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_City(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_City));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_State(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_State));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_ZIPCode_Postal_code(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_ZIPCode_Postal_code));
			return element;
		}

		public static WebElement ClaimsModule_Claimant_Phone(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claimant_Phone));
			return element;
		}

		public static WebElement ClaimsModule_Claims_Loss_Time(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Claims_Loss_Time));
			return element;
		}

		public static WebElement ClaimsModule_Total_Outstanding(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Total_Outstanding));
			return element;
		}

		public static WebElement ClaimsModule_Nextbtn(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_Nextbtn));
			return element;
		}

		public static WebElement ClaimsModule_saveandCloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(ClaimsModule_saveandCloseBtn));
			return element;
		}

		public static WebElement NonCIPComplianceNameAlertMsgOKBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPComplianceNameAlertMsgOKBtn));
			return element;
		}

		public static WebElement FixedratesSaveandClsoeBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(FixedratesSaveandClsoeBtn));
			return element;
		}

		public static WebElement PolicyandCertificatessavenadContinueBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PolicyandCertificatessavenadContinueBtn));
			return element;
		}

		public static WebElement EditBtn_nonCIP_Compliance_Page(WebDriver driver) {
			element = driver.findElement(By.xpath(EditBtn_nonCIP_Compliance_Page));
			return element;
		}

		public static WebElement SaveandContinueBtn_PremiumModfications(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_PremiumModfications));
			return element;
		}

		public static WebElement SaveandContinueButton_Non_CIP_compliancePage(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueButton_Non_CIP_compliancePage));
			return element;
		}

		public static WebElement NonCIPComplianceNameErrMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPComplianceNameErrMsg));
			return element;
		}

		public static WebElement NonCIPComplianceName_Feild(WebDriver driver) {
			element = driver.findElement(By.xpath(NonCIPComplianceName_Feild));
			return element;
		}

		public static WebElement AlertMsg_NonCIP_name_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertMsg_NonCIP_name_feild));
			return element;
		}

		public static WebElement CloseBtn_NonCIP_page(WebDriver driver) {
			element = driver.findElement(By.xpath(CloseBtn_NonCIP_page));
			return element;
		}

		public static WebElement SaveBtn_NonCIP_name_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveBtn_NonCIP_name_feild));
			return element;
		}

		public static WebElement closebtn_Alertmsg_payrollandCVpage(WebDriver driver) {
			element = driver.findElement(By.xpath(closebtn_Alertmsg_payrollandCVpage));
			return element;
		}

		public static WebElement Alertmsg_Reporting_Time_Period_Dropdwon(WebDriver driver) {
			element = driver.findElement(By.xpath(Alertmsg_Reporting_Time_Period_Dropdwon));
			return element;
		}

		public static WebElement Alertmsg_payrollCV_SubmissionFrequnbecy_Dropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(Alertmsg_payrollCV_SubmissionFrequnbecy_Dropdown));
			return element;
		}

		public static WebElement SaveandContinueBtn_PayrollandCV_page(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_PayrollandCV_page));
			return element;
		}

		public static WebElement ErrorMessgae_payrollCV_SubmissionFrequnbecy_Dropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(ErrorMessgae_payrollCV_SubmissionFrequnbecy_Dropdown));
			return element;
		}

		public static WebElement Yes_ICon_forCV_tracking(WebDriver driver) {
			element = driver.findElement(By.xpath(Yes_ICon_forCV_tracking));
			return element;
		}

		public static WebElement PayrollCV_Submission_Frequency_Dropdwon(WebDriver driver) {
			element = driver.findElement(By.xpath(PayrollCV_Submission_Frequency_Dropdwon));
			return element;
		}

		public static WebElement PayrollCV_Reporting_Time_Period_Dropdwon(WebDriver driver) {
			element = driver.findElement(By.xpath(PayrollCV_Reporting_Time_Period_Dropdwon));
			return element;
		}

		public static WebElement saveandContinueBtn_UserAccess(WebDriver driver) {
			element = driver.findElement(By.xpath(saveandContinueBtn_UserAccess));
			return element;
		}

		public static WebElement SaveandContinueBtn_ContrcatorportalPage(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_ContrcatorportalPage));
			return element;
		}

		public static WebElement AlertMessage_Contractorportal_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertMessage_Contractorportal_Switch));
			return element;
		}

		public static WebElement OKBtn_AlertMessage_Contractorportal_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(OKBtn_AlertMessage_Contractorportal_Switch));
			return element;
		}

		public static WebElement ActivateContractorPortalSwitch(WebDriver driver) {
			element = driver.findElement(By.xpath(ActivateContractorPortalSwitch));
			return element;
		}

		public static WebElement SaveandContinueBtn_EmailMangament(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_EmailMangament));
			return element;
		}

		public static WebElement ErrorMsg_ProgAdminFeild_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(ErrorMsg_ProgAdminFeild_GI));
			return element;
		}

		public static WebElement ErrorMsg_ProgramponsorFeild_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(ErrorMsg_ProgramponsorFeild_GI));
			return element;
		}

		public static WebElement SaveBtn_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveBtn_GI));
			return element;
		}

		public static WebElement AlertMessage_ProgrammeAdmin_feild_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertMessage_ProgrammeAdmin_feild_GI));
			return element;
		}

		public static WebElement AlertMessage_ProgrammeSponsor_feild_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(AlertMessage_ProgrammeSponsor_feild_GI));
			return element;
		}

		public static WebElement ProgramSponsofeildGIPage(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgramSponsofeildGIPage));
			return element;
		}

		public static WebElement ProgrammeAdministartrfeildGIPage(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgrammeAdministartrfeildGIPage));
			return element;
		}

		public static WebElement ConfirmMessage_EnableLocationCode(WebDriver driver) {
			element = driver.findElement(By.xpath(ConfirmMessage_EnableLocationCode));
			return element;
		}

		public static WebElement EnableLocationcode_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(EnableLocationcode_Switch));
			return element;
		}

		public static WebElement EnablecontractNumber_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(EnablecontractNumber_Switch));
			return element;
		}

		public static WebElement ConfirmMessage_EnablecontractNumber_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(ConfirmMessage_EnablecontractNumber_Switch));
			return element;
		}

		public static WebElement OKBtn_ConfirmMessage(WebDriver driver) {
			element = driver.findElement(By.xpath(OKBtn_ConfirmMessage));
			return element;
		}

		public static WebElement SaveandContinueBtn_ProgParameters(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_ProgParameters));
			return element;
		}

		public static WebElement SaveandContinueBtn_GI(WebDriver driver) {
			element = driver.findElement(By.xpath(SaveandContinueBtn_GI));
			return element;
		}

		public static WebElement CloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(CloseBtn));
			return element;
		}

		public static WebElement programmeNameAlertmsg(WebDriver driver) {
			element = driver.findElement(By.xpath(programmeNameAlertmsg));
			return element;
		}

		public static WebElement programmeNamefeild(WebDriver driver) {
			element = driver.findElement(By.xpath(programmeNamefeild));
			return element;
		}

		public static WebElement ProgrammeICon(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgrammeICon));
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

		public static WebElement SearchProgrammeAdmin(WebDriver driver) {
			element = driver.findElement(By.xpath(SearchProgrammeAdmin));
			return element;
		}

		public static WebElement selectProgrammeType(WebDriver driver) {
			element = driver.findElement(By.xpath(selectProgrammeType));
			return element;
		}

		public static WebElement ProgrammeNameErrormsg(WebDriver driver) {
			element = driver.findElement(By.xpath(ProgrammeNameErrormsg));
			return element;
		}


	
}
