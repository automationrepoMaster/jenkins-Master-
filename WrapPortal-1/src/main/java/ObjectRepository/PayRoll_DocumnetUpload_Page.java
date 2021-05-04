package ObjectRepository;

public class PayRoll_DocumnetUpload_Page {

	// Program settings

	static String Contractor_Pkg_CompanyTxt_List = "//div[@class='companySubText']//span[*]";
	static String ProgramSettings_DocumnetUpload_CompletionNoticeSubmission_Switch = "//div[@id='uniform-chkDocumentUploadForCompletionNoticeSub']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
	static String ProgramSettings_DocumnetUpload_CompletionNoticeSubmission__Info_tooltip = "//div[@class='infoIcon']//i[@class='font20 i-info']";
	static String ProgramSettings_DocumnentUpload_Continue_Alert_Switch = "//button[@id='btnYes']";
	static String ProgramSettings_DocumnentUpload_Cancel_Alert_Switch = "//button[@id='btnNo']";
	static String ProgramSettings_CloseBtn = "//button[@class='btn']";
	static String ProgramSettings_BackBtn = "//input[@id='btnBackProjectSettings']";
	static String ProgramSettings_SaveBtn = "//input[@id='btnSaveProjectSettings']";
	static String ProgramSettings_SaveandCloseBtn = "//input[@id='btnSaveandCloseProjectSettings']";
	static String ProgramSettings_SaveandContinueBtn = "//input[@id='btnNextProjectSettings']";

	// Document type select
	static String ProgramSettings__test1_Chk_Box = "//div[@id='uniform-rptCompletionNoticeSubDocSelect_ctl00_chkPayrollSubDoc']";
	static String ProgramSettings__test3_Chk_Box = "//div[@id='uniform-rptCompletionNoticeSubDocSelect_ctl01_chkPayrollSubDoc']";
	static String ProgramSettings__test1_OptionalDoc_Chk_Box = "//input[@id='rptCompletionNoticeSubDocSelect_ctl00_chkIsExcludedReqDoc']";
	static String ProgramSettings__test1_ReqDoc_Chk_Box = "//input[@id='rptCompletionNoticeSubDocSelect_ctl00_chkIsReqDoc']";
	static String ProgramSettings__test1_EditBtn = "//a[@id='rptCompletionNoticeSubDocSelect_ctl00_lnkEdit']//i[@class='fa fa-pencil-square-o']";
	static String ProgramSettings__test1_Delete_Btn = "//a[@id='rptCompletionNoticeSubDocSelect_ctl00_lnkDelete']//i[@class='fa fa-trash-o']";

	// Add new Documnet link and Feilds
	static String ProgramSettings_AddNewDocumnetTypeLink = "//div[@id='divDocumentType']//a[@class='panelinfoIcon']";
	static String ProgramSettings__frame_AddNewDocumentTypeLink = "//div[@id='dhtmlwindowholder']/div[@id='EmailBox12']/div[2]/iframe[@name='_iframe-EmailBox12']";
	static String ProgramSettings__DocumentName_feild = "//input[@id='txtRequriedDocumentName']";
	static String ProgramSettings__DocumentDescription = "//iframe[@id='txtDocDescription_ifr']";
	static String ProgramSettings__DocumentDescription_SaveandCloseBtn = "//input[@id='btnSaveDcoument']";
	static String ProgramSettings__DocumentDescription_CancelBtn = "//button[@id='Button1' and @class='btn']";

	// Dynamic contractor package

	static String Contractorpkg = "//div[@class='mail_list']/ul[@id='ulNoteList']/li//div[@class='mailDetails']/div[@class='companytitle']/span[contains(text(),'Roger Federer')]/../..//div/span[contains(text(),'WC & GL Enrollment')]/../../..//div[@class='statusType']/div/span[contains(text(),'Assigned')]/../../..";
	// div[@class='mail_list']/ul[@id='ulNoteList']/li//div[@class='mailDetails']/div[@class='companytitle']/span[contains(text(),'Roger
	// Federer')]/../..//div/span[contains(text(),'WC & GL
	// Enrollment')]/../../..//div[@class='statusType']/div/span[contains(text(),'Assigned')]/../../div[2]/span[contains(text(),'RAUT123
	// - RAUTOMATION123')]/../../div[4]/span[contains(text(),'2085 |
	// TradeDynamic-')]/../../..
	
	
	static String RequiredConfirmationChkBoxPayRoll_Switch ="//div[@id='uniform-ChkRequiredForMothlyPayroll']//div[@class ='ios-ui-select checked' or 'ios-ui-select']";
	static String RequiredConfirmationChkBoxPayRoll_Alert_ContinueBtn ="//button[@id='btnYes']";
	static String RequiredConfirmationChkBoxPayRoll_Alert_Cancel_Btn ="//button[@id='btnNo']";
	static String RequiredConfirmationChkBox_Confirm_Msg_txt ="//div[@class='modalConfirmMessage']";
	
	
	//Project level Document for payRoll Switch
	
	
	
	
}
