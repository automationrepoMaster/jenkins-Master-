package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurityGroupsModule
{
	
	private static WebElement element;
	private static List<WebElement>listElement;

	static String selectProfileDropDown = "//select[@id='ctl00_ContentPlaceHolder1_ddlUserProfile']";//select
	static String moduleNameTitle_Add_Edit_View_Delete_SelectAllCheckBox="//div[@class='maxTabledataLarge']//tr[@id='ctl00_ContentPlaceHolder1_divSecurityModule']//th[position()>1]//input";
	
	static String allowPermissionModuleWise="//div[@class='maxTabledataLarge']//tr[@id='ctl00_ContentPlaceHolder1_divSecurityModule']/../../tbody/tr[*]/td[position(WebDriver driver)>1]//input";//need to change row and data number, module name not take in the list coz its hide 
	
	static String reportNameTitle_View_PDF_Word_Excel_Email_SelectAllCheckBox="//table//tr[@id='ctl00_ContentPlaceHolder1_divSecurityLevelReport']//th[position(WebDriver driver)>1]//input";//list
	static String allowPermissionReportWise="//table//tr[@id='ctl00_ContentPlaceHolder1_divSecurityLevelReport']/../..//tbody/tr/td[position(WebDriver driver)>1]//input";//list
	//need to change row and column position, this xpath is for all checkbox
	
	static String checkBoxPublicAccess="//input[@id='ctl00_ContentPlaceHolder1_chkPublic']";
	static String checkBoxPrivateAccess="//input[@id='ctl00_ContentPlaceHolder1_chkPrivate']";
	static String checkBoxLimitedAccess="//input[@id='ctl00_ContentPlaceHolder1_chkLimited']";
	static String EmailGroupModuleAcessTitle_Add_Edit_View_Delete_SelectAllCheckBox="//table//tr[@id='ctl00_ContentPlaceHolder1_trEmailGroupsSecurityModule']//*[position(WebDriver driver)>1]//input";//list
	static String secutiryGroupsSaveBtn="//input[@id='ctl00_ContentPlaceHolder1_btnSaveSecurityProfile']";
	
	
	
	public static WebElement selectProfileDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProfileDropDown));
		return element;
	}

	public static WebElement moduleNameTitle_Add_Edit_View_Delete_SelectAllCheckBox(WebDriver driver, String permissionType) {
		element = driver.findElement(By.xpath("//div[@class='maxTabledataLarge']//tr[@id='ctl00_ContentPlaceHolder1_divSecurityModule']//th[position()>1 and contains(text(),'"+permissionType+"')]//input"));
		return element;
	}

	public static List<WebElement> allowPermissionModuleWise(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allowPermissionModuleWise));
		return listElement;
	}

	public static List<WebElement> reportNameTitle_View_PDF_Word_Excel_Email_SelectAllCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(reportNameTitle_View_PDF_Word_Excel_Email_SelectAllCheckBox));
		return listElement;
	}
	

	public static List<WebElement> allowPermissionReportWise(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allowPermissionReportWise));
		return listElement;
	}

	public static WebElement checkBoxPublicAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxPublicAccess));
		return element;
	}

	public static WebElement checkBoxPrivateAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxPrivateAccess));
		return element;
	}

	public static WebElement checkBoxLimitedAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxLimitedAccess));
		return element;
	}

	public static List<WebElement> EmailGroupModuleAcessTitle_Add_Edit_View_Delete_SelectAllCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(EmailGroupModuleAcessTitle_Add_Edit_View_Delete_SelectAllCheckBox));
		return listElement;
	}

	public static List<WebElement> secutiryGroupsSaveBtn(WebDriver driver) {
		listElement = driver.findElements(By.xpath(secutiryGroupsSaveBtn));
		return listElement;
	}
	
	// Raja wrote this from Node Admin validations page
	 public static String ADD_EDIT_DELETE_List = "//div[@class='leftButtonGroup']//ul//li";
	 public static String Add_Btn = "//a[@class='tipB']//i[@class='fa fa-plus']";
	 public static String Edit_Btn = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
	 public static String Delete_Btn = "//a[@class='tipB']//i[@class='fa fa-trash-o']";
	 public static String Reports_ICon = "//a[@id='ctl00_ContentPlaceHolder1_aReports']";
	 public static String SecurityGroups_Icon = "//div[@class='greedy-container']//ul/li[3]";
	 public static String SelectProfile_Dropdown = "//select[@id='ctl00_ContentPlaceHolder1_ddlUserProfile']";
	 public static String programme_Icon = "//li[@id='ctl00_ctrlMenu_liProjects']";
	 public static String URL = "https://beta.wrapportal.com/frmHome.aspx";
	 public static String AddModule_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkModuleAdd']";
	 public static String EditModule_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkModuleEdit']";
	 public static String DelteModule_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkModuleDelete']";
	 public static String ViewModule_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkModuleView']";
	 public static String Reports_View_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkReportView']";
	 public static String Reports_PDF_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkReportPDF']";
	 public static String Reports_Word_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkReportWord']";
	 public static String Reports_Excel_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkReportExcel']";
	 public static String Reports_Email_Chk_Box = "//input[@id='ctl00_ContentPlaceHolder1_chkReportEmail']";
     public static String Add_Chk_boxes_list_NodeAdmin ="//span//input[@class='checkboxA'and @id]/..";
	 public static String Node_Admin_Delete_Btn = "//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']//a[@data-original-title='Delete']";
	 public static String Node_Admin_Plus_Btn = "//a[@class='tipB']//i[@class='fa fa-plus']";
	 public static String Node_Admin_Edit_Btn = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
	 public static String Sponsor_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aOwner']";
	 public static String Programme_icon = "//a[@id='ctl00_ContentPlaceHolder1_aProject']";
	 public static String Contractor_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aContractor']";
	 public static String Project_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aWorksite']";
	 public static String Contractor_packageIcon = "//a[@id='ctl00_ContentPlaceHolder1_aCP']";
	 public static String carrier = "//*[@id='ctl00_ContentPlaceHolder1_cntrTradeList_ctrlGeneratSetting_liCarrier']";
	 public static String Trade = "//*[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ctrlGeneratSetting_liTrades']";
	 public static String District = "//span[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ctrlGeneratSetting_lblDivision']";
	 public static String Classcode = "//*[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ctrlGeneratSetting_liWorkClass']";
	 public static String users = "//a[@id='ctl00_ContentPlaceHolder1_cntDivisionList_ctrlGeneratSetting_aUsers']";
	 public static String Contractor = "//*[@id='ctl00_ContentPlaceHolder1_aContractor']";
	 public static String More_btn_programme = "//div[@class='dropdown-gridnav']";
	 public static String Save_Btn = "//input[@id='ctl00_ContentPlaceHolder1_btnSaveSecurityProfile']";
	 public static String Url = "https://beta.wrapportal.com/";
	 public static String Node_Admin_UN_Feild = "//input[@id='txtUserName']";
	 public static String NodeAdmin_PW_Feild = "//input[@id='txtPassword']";
	 public static String Node_Admin_UN = "HobsShobsUsers81"; //"BellaJee";
	 public static String NodeAdmin_PW = "mc7rT4po0pAX"; //"lH8Q0j6K2EbP";
	 public static String login_Btn_Node_Admin = "//a[contains(text(),'Login')]";
	 public static String newWindow = "WindowType.WINDOW";
	 public static String LOgout_Icon = "//a[@class='dropdown-toggle avatar']//i";
	 //LogoutIcon=//a[@class='dropdown-toggle avatar']//i
		///	 LogoutBtn=//a[@id='ctl00_ctrlHeader_aLogOut']
	 public static String LogOut_Btn = "//a[@id='ctl00_ctrlHeader_aLogOut']";
	 public static String Headings_list = "//ul[@class='ulGreedy clearfix']";
	 public static String Projects_Tab = "//*[@id='ctl00_ContentPlaceHolder1_ctrlUserList_ctrlGeneratSetting_lblWorkSite']";
	 public static String Home_btn = "//ul//li[@id='ctl00_ctrlMenu_liHome']";
	 public static String Districts_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aDivision']";
	 public static String Trades_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aTrade']";
	 public static String Work_Class_Icon = "//a[@id='ctl00_ContentPlaceHolder1_aWorkClass']";

	// Reports

	 public static String Track_Reports_txt = "//div[@class='row sortReport']//div[@id='ctl00_ContentPlaceHolder1_rptReport_ctl01_divNoReport']";
	 public static String OrganiZational_Reports_txt = "//div[@class='row sortReport']//div[@id='ctl00_ContentPlaceHolder1_rptReport_ctl02_divNoReport']";
	 public static String Financial_report_txt = "//div[@class='row sortReport']//div[@id='ctl00_ContentPlaceHolder1_rptReport_ctl03_divNoReport']";
	 public static String Claims_Report_txt = "//div[@class='row sortReport']//div[@id='ctl00_ContentPlaceHolder1_rptReport_ctl04_divNoReport']";
	 public static String OpenItems_Rpeorts_txt = "//div[@class='row sortReport']//div[@id='ctl00_ContentPlaceHolder1_rptReport_ctl05_divNoReport']";
	 public static String Select_programme_Report_Dropdown = "//select[@id='ctl00_ContentPlaceHolder1_ddlProject']";

	// Side panel

	  public static String SidePanel_Home_Icon = "//li[@id='ctl00_ctrlMenu_liHome']";
	  public static String SidePanel_DashBoard = "//li[@id='ctl00_ctrlMenu_liDashboard']";
	  public static String SidePanel_Open_Action_items = "//li[@id='ctl00_ctrlMenu_liOpenActionItems']";
     public static String SidePanel_Pre_Bid_CPkg = "//li[@id='ctl00_ctrlMenu_liPreBidContracts']";
	 public static String SidePanel_Contr_pks = "//li[@id='ctl00_ctrlMenu_liContracts']";
	 public static String SidePanel_Contractors_panel = "//li[@id='ctl00_ctrlMenu_liUser']";
	 public static String SidePanel_Program = "//li[@id='ctl00_ctrlMenu_liProjects']";
	 public static String SidePanel_Project = "//li[@id='ctl00_ctrlMenu_liWorksites']";
	 public static String SidePanel_Claims = "//li[@id='ctl00_ctrlMenu_liClaim']";
	 public static String SidePanel_mail = "//li[@id='ctl00_ctrlMenu_liInbox']";
	 public static String SidePanel_Fax = "//li[@id='ctl00_ctrlMenu_liFax']";
	 public static String SidePanel_Notes = "//li[@id='ctl00_ctrlMenu_liNote']";
	 public static String SidePanel_Documnets = "//li[@id='ctl00_ctrlMenu_liDocument']";
	 public static String SidePanel_Tasks = "//li[@id='ctl00_ctrlMenu_liTask']";
	 public static String SidePanel_Calender = "//li[@id='ctl00_ctrlMenu_liCalendar']";
	 public static String SidePanel_Reports = "//li[@id='ctl00_ctrlMenu_liReports']";
	 public static String SidePanel_Home_Icon_text = "//span[contains(text(),'Home')]";
     public static String Add_list_checkBoxes ="//span//input[@class='checkboxA'and @id]/..";
	 public static String SidePanel_DashBoard_txt = "//span[contains(text(),'Dashboard')]";
	 public static String SidePanel_Open_Action_items_txt = "//span[contains(text(),'Open Action Items')]";
	 public static String SidePanel_Pre_Bid_CPkg_txt = "//span[contains(text(),'Pre-Bid Contractor Packages')]";
	 public static String SidePanel_Contr_pks_txt = "//a[@id='ctl00_ctrlMenu_aCP']//span[contains(text(),'Contractor Packages')]";
	 public static String SidePanel_Contractors_panel_txt = "//span[contains(text(),'Contractors')]";
	 public static String SidePanel_Program_txt = "//span[@id='ctl00_ctrlMenu_lblProjects' and contains(text(),'Programs ')]";
	 public static String SidePanel_Project_txt = "//span[@id='ctl00_ctrlMenu_lblWorksites' and contains(text(),'Projects ')]";
	 public static String SidePanel_Claims_txt = "//span[contains(text(),'Claims')]";
	 public static String SidePanel_Claims_Upload_txt = "//a[@id='ctl00_ctrlMenu_aClaimUpload']";
	 public static String SidePanel_mail_txt = "//span[contains(text(),'Email')]";
	 public static String SidePanel_mail_Inbox_txt = "//ul[@id='ulFolder']//a[@id='1']";
	 public static String SidePanel_mail_Archive_txt = "//ul[@id='ulFolder']//a[@id='2']";
	 public static String SidePanel_mail_Junk_txt = "//ul[@id='ulFolder']//a[@id='3']";
	 public static String SidePanel_mail_Draft_txt = "//ul[@id='ulFolder']//a[@id='4']";
	 public static String SidePanel_mail_Sent_txt = "//ul[@id='ulFolder']//a[@id='5']";
	 public static String SidePanel_mail_Deleted_txt = "//ul[@id='ulFolder']//a[@id='6']";
	 public static String SidePanel_Fax_txt = "//span[contains(text(),'Fax')]";
	 public static String SidePanel_Notes_txt = "//span[contains(text(),'Notes')]";
	 public static String SidePanel_Documnets_txt = "//span[contains(text(),'Documents')]";
	 public static String SidePanel_Tasks_txt = "//span[contains(text(),'Tasks')]";
	 public static String SidePanel_Calender_txt = "//span[contains(text(),'Calendar')]";
	 public static String SidePanel_Reports_txt = "//span[contains(text(),'Reports')]";
     public static String Delete_list_CheckBoxes="//span//input[@class='checkboxD' and @id]/..";
     public static String Edit_list_CheckBoxes="//span//input[@class='checkboxE' and @id]/..";
     public static String ViewReports_list_CheckBoxes="//span//input[@class='checkboxRV' and @id]/..";
     public static String PDFReports_list_CheckBoxes="//span//input[@class='checkboxRP' and @id]/..";
     public static String View_list_CheckBoxes="//span//input[@class='checkboxV' and @id]/..";
     
     public static List<WebElement>View_list_CheckBoxes(WebDriver driver){
    		listElement = driver.findElements(By.xpath(View_list_CheckBoxes));
    		return listElement;
    	}
     public static List<WebElement>ViewReports_list_CheckBoxes(WebDriver driver){
   		listElement = driver.findElements(By.xpath(ViewReports_list_CheckBoxes));
   		return listElement;
   	}
     public static List<WebElement>PDFReports_list_CheckBoxes(WebDriver driver){
   		listElement = driver.findElements(By.xpath(PDFReports_list_CheckBoxes));
   		return listElement;
   	}
     
     public static List<WebElement>Edit_list_CheckBoxes(WebDriver driver){
  		listElement = driver.findElements(By.xpath(Edit_list_CheckBoxes));
  		return listElement;
  	}
     public static List<WebElement>Delete_list_CheckBoxes(WebDriver driver){
 		listElement = driver.findElements(By.xpath(Delete_list_CheckBoxes));
 		return listElement;
 	}
	public static List<WebElement>Add_list_checkBoxes(WebDriver driver){
		listElement = driver.findElements(By.xpath(Add_list_checkBoxes));
		return listElement;
	}
	 public static WebElement ViewModule_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewModule_Chk_Box));
		return element;
	}

	public static WebElement SidePanel_Open_Action_items_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Open_Action_items_txt));
		return element;
	}

	public static WebElement SidePanel_DashBoard_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_DashBoard_txt));
		return element;
	}

	public static WebElement SidePanel_Pre_Bid_CPkg_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Pre_Bid_CPkg_txt));
		return element;
	}

	public static WebElement SidePanel_Contr_pks_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Contr_pks_txt));
		return element;
	}

	public static WebElement SidePanel_Contractors_panel_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Contractors_panel_txt));
		return element;
	}

	public static WebElement SidePanel_Program_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Program_txt));
		return element;
	}

	public static WebElement SidePanel_Project_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Project_txt));
		return element;
	}

	public static WebElement SidePanel_Claims_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Claims_txt));
		return element;
	}

	public static WebElement SidePanel_Claims_Upload_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Claims_Upload_txt));
		return element;
	}

	public static WebElement SidePanel_mail_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Inbox_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Inbox_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Archive_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Archive_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Junk_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Junk_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Draft_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Draft_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Sent_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Sent_txt));
		return element;
	}

	public static WebElement SidePanel_mail_Deleted_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail_Deleted_txt));
		return element;
	}

	public static WebElement SidePanel_Fax_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Fax_txt));
		return element;
	}

	public static WebElement SidePanel_Notes_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Notes_txt));
		return element;
	}

	public static WebElement SidePanel_Documnets_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Documnets_txt));
		return element;
	}

	public static WebElement SidePanel_Tasks_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Tasks_txt));
		return element;
	}

	public static WebElement SidePanel_Calender_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Calender_txt));
		return element;
	}

	public static WebElement SidePanel_Reports_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Reports_txt));
		return element;
	}

	public static WebElement SidePanel_Reports(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Reports));
		return element;
	}

	public static WebElement SidePanel_Calender(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Calender));
		return element;
	}

	public static WebElement SidePanel_Tasks(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Tasks));
		return element;
	}

	public static WebElement SidePanel_Documnets(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Documnets));
		return element;
	}

	public static WebElement SidePanel_Notes(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Notes));
		return element;
	}

	public static WebElement SidePanel_Fax(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Fax));
		return element;
	}

	public static WebElement SidePanel_mail(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_mail));
		return element;
	}

	public static WebElement SidePanel_Claims(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Claims));
		return element;
	}

	public static WebElement SidePanel_Project(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Project));
		return element;
	}

	public static WebElement SidePanel_Program(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Program));
		return element;
	}

	public static WebElement SidePanel_Contractors_panel(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Contractors_panel));
		return element;
	}

	public static WebElement SidePanel_Contr_pks(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Contr_pks));
		return element;
	}

	public static WebElement SidePanel_Pre_Bid_CPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Pre_Bid_CPkg));
		return element;
	}

	public static WebElement SidePanel_Open_Action_items(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Open_Action_items));
		return element;
	}

	public static WebElement SidePanel_DashBoard(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_DashBoard));
		return element;
	}

	public static WebElement SidePanel_Home_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Home_Icon));
		return element;
	}

	public static WebElement SidePanel_Home_Icon_text(WebDriver driver) {
		element = driver.findElement(By.xpath(SidePanel_Home_Icon_text));
		return element;
	}

	public static List<WebElement> ADD_EDIT_DELETE_List(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ADD_EDIT_DELETE_List));
		return listElement;
	}

	public static WebElement Add_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Add_Btn));
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

	public static WebElement Select_programme_Report_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(Select_programme_Report_Dropdown));
		return element;
	}

	public static WebElement Reports_ICon(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_ICon));
		return element;
	}

	public static WebElement Track_Reports_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Track_Reports_txt));
		return element;
	}

	public static WebElement Reports_Email_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_Email_Chk_Box));
		return element;
	}

	public static WebElement OrganiZational_Reports_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(OrganiZational_Reports_txt));
		return element;
	}

	public static WebElement Financial_report_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Financial_report_txt));
		return element;
	}

	public static WebElement Claims_Report_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(Claims_Report_txt));
		return element;
	}

	public static WebElement OpenItems_Rpeorts_txt(WebDriver driver) {
		element = driver.findElement(By.xpath(OpenItems_Rpeorts_txt));
		return element;
	}

	public static WebElement Reports_Excel_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_Excel_Chk_Box));
		return element;
	}

	public static WebElement Reports_Word_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_Word_Chk_Box));
		return element;
	}

	public static WebElement Reports_PDF_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_PDF_Chk_Box));
		return element;
	}

	public static WebElement Reports_View_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(Reports_View_Chk_Box));
		return element;
	}

	public static WebElement EditModule_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(EditModule_Chk_Box));
		return element;
	}

	public static WebElement DelteModule_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(DelteModule_Chk_Box));
		return element;
	}

	public static WebElement Work_Class_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Work_Class_Icon));
		return element;
	}

	public static WebElement Trades_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Trades_Icon));
		return element;
	}

	public static WebElement Districts_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Districts_Icon));
		return element;
	}

	public static WebElement Contractor_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractor_Icon));
		return element;
	}

	public static WebElement Home_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Home_btn));
		return element;
	}

	public static WebElement Projects_Tab(WebDriver driver) {
		element = driver.findElement(By.xpath(Projects_Tab));
		return element;
	}

	public static WebElement login_Btn_Node_Admin(WebDriver driver) {
		element = driver.findElement(By.xpath(login_Btn_Node_Admin));
		return element;
	}

	public static WebElement NodeAdmin_PW_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(NodeAdmin_PW_Feild));
		return element;
	}

	public static WebElement Node_Admin_UN_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(Node_Admin_UN_Feild));
		return element;
	}

	public static WebElement LOgout_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(LOgout_Icon));
		return element;
	}

	public static WebElement LogOut_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(LogOut_Btn));
		return element;
	}

	public static WebElement More_btn_programme(WebDriver driver) {
		element = driver.findElement(By.xpath(More_btn_programme));
		return element;
	}

	public static WebElement Contractor(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractor));
		return element;
	}

	public static WebElement users(WebDriver driver) {
		element = driver.findElement(By.xpath(users));
		return element;
	}

	public static WebElement Classcode(WebDriver driver) {
		element = driver.findElement(By.xpath(Classcode));
		return element;
	}

	public static WebElement District(WebDriver driver) {
		element = driver.findElement(By.xpath(District));
		return element;
	}

	public static WebElement Trade(WebDriver driver) {
		element = driver.findElement(By.xpath(Trade));
		return element;
	}

	public static WebElement carrier(WebDriver driver) {
		element = driver.findElement(By.xpath(carrier));
		return element;
	}

	public static WebElement Contractor_packageIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractor_packageIcon));
		return element;
	}
	
	public static WebElement Project_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Project_Icon));
		return element;
	}
	
	public static WebElement Programme_icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Programme_icon));
		return element;
	}
	
	public static WebElement Sponsor_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Sponsor_Icon));
		return element;
	}

	public static WebElement Node_Admin_Edit_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Node_Admin_Edit_Btn));
		return element;
	}

	public static WebElement Node_Admin_Plus_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Node_Admin_Plus_Btn));
		return element;
	}
	
	public static WebElement Node_Admin_Delete_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Node_Admin_Delete_Btn));
		return element;
	}

	public static WebElement Save_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Save_Btn));
		return element;
	}

	public static WebElement SecurityGroups_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(SecurityGroups_Icon));
		return element;
	}

	public static WebElement SelectProfile_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectProfile_Dropdown));
		return element;
	}

	public static WebElement programme_Icon(WebDriver driver) {
		element = driver.findElement(By.xpath(programme_Icon));
		return element;
	}

	public static WebElement AddModule_Chk_Box(WebDriver driver) {
		element = driver.findElement(By.xpath(AddModule_Chk_Box));
		return element;
	}

	public static List<WebElement> Headings_list(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Headings_list));
		return listElement;
	}

//	@Test
//
//	public void Sidepanel_validations(WebDriver driver) throws Throwable {
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		CodeLibrary.explicitWait(driver, NodeAdmin_Validations_Page.programme_Icon(WebDriver driver), 4000);
//		NodeAdmin_Validations_Page.programme_Icon(WebDriver driver).click(WebDriver driver);
//		test.log(LogStatus.PASS, "Programme Icon is clicked succesfully");
//		Thread.sleep(3000);
//		CodeLibrary.click(NodeAdmin_Validations_Page.SecurityGroups_Icon(WebDriver driver));
//		test.log(LogStatus.PASS, "Security Groups Tab is clicked succesfully");
//		CodeLibrary.selectByVisibleText("Node Administrator | Node_Admin",
//				NodeAdmin_Validations_Page.SelectProfile_Dropdown(WebDriver driver));
//		// NodeAdmin_Validations_Page.ViewModule_Chk_Box(WebDriver driver).click(WebDriver driver);
//		// NodeAdmin_Validations_Page.ViewModule_Chk_Box(WebDriver driver).click(WebDriver driver);
//		// test.log(LogStatus.PASS, "Add Icon Chk bok is clicked succesfully");
//		CodeLibrary.scrollToEndt(WebDriver driver);
//		Thread.sleep(3000);
//		NodeAdmin_Validations_Page.Save_Btn(WebDriver driver).click(WebDriver driver);
//		test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
//		CodeLibrary.Alert(WebDriver driver);
//		Thread.sleep(2000);
//		Thread.sleep(2000);
//		NodeAdmin_Validations_Page.LOgout_Icon(WebDriver driver).click(WebDriver driver);
//		NodeAdmin_Validations_Page.LogOut_Btn(WebDriver driver).click(WebDriver driver);
//		Thread.sleep(3000);
//		NodeAdmin_Validations_Page.Node_Admin_UN_Feild(WebDriver driver).sendKeys(NodeAdmin_Validations_Page.Node_Admin_UN);
//		NodeAdmin_Validations_Page.NodeAdmin_PW_Feild(WebDriver driver).sendKeys(NodeAdmin_Validations_Page.NodeAdmin_PW);
//		NodeAdmin_Validations_Page.login_Btn_Node_Admin(WebDriver driver).click(WebDriver driver);
//		Thread.sleep(3000);
//		List<WebElement> list = driver.findElement(By.xpath("//ul[@class='nav nav-list']//li"));
//		System.out.println(list.size(WebDriver driver));
//		if (list.contains(SidePanel_Home_Icon(WebDriver driver))) {
//			CodeLibrary.mouseOverElement(SidePanel_Home_Icon(WebDriver driver));
//			CodeLibrary.Compare(SidePanel_Home_Icon_text(), "Home");
//			test.log(LogStatus.PASS, "Act and Exp are matching at Home icon");
//			if (list.contains(SidePanel_DashBoard(WebDriver driver))) {
//				CodeLibrary.mouseOverElement(SidePanel_DashBoard(WebDriver driver));
//				CodeLibrary.Compare(SidePanel_DashBoard_txt(WebDriver driver), "Dashboard");
//				test.log(LogStatus.PASS, "Act and Exp are matching at DashBoard icon");
//				if (list.contains(SidePanel_Open_Action_items(WebDriver driver))) {
//					CodeLibrary.mouseOverElement(SidePanel_Open_Action_items(WebDriver driver));
//					CodeLibrary.Compare(SidePanel_Open_Action_items_txt(WebDriver driver), "Open Action Items");
//					test.log(LogStatus.PASS, "Act and Exp are matching at Open Actions icon");
//					if (list.contains(SidePanel_Pre_Bid_CPkg(WebDriver driver))) {
//						CodeLibrary.mouseOverElement(SidePanel_Pre_Bid_CPkg(WebDriver driver));
//						CodeLibrary.Compare(SidePanel_Pre_Bid_CPkg_txt(WebDriver driver), "Pre-Bid Contractor Packages");
//						test.log(LogStatus.PASS, "Act and Exp are matching at Pre-Bid Contractor Packages icon");
//						if (list.contains(SidePanel_Contractors_panel(WebDriver driver))) {
//							CodeLibrary.mouseOverElement(SidePanel_Contractors_panel(WebDriver driver));
//							CodeLibrary.Compare(SidePanel_Contractors_panel_txt(WebDriver driver), "Contractors");
//							test.log(LogStatus.PASS, "Act and Exp are matching at contractors icon");
//							if (list.contains(SidePanel_Contr_pks(WebDriver driver))) {
//								CodeLibrary.mouseOverElement(SidePanel_Contr_pks(WebDriver driver));
//								CodeLibrary.Compare(SidePanel_Contr_pks_txt(WebDriver driver), "Contractor Packages");
//								test.log(LogStatus.PASS, "Act and Exp are matching at  Contractor Packages icon");
//								if (list.contains(SidePanel_Program(WebDriver driver))) {
//									CodeLibrary.mouseOverElement(SidePanel_Program(WebDriver driver));
//									CodeLibrary.Compare(SidePanel_Program_txt(WebDriver driver), "Programs ");
//									test.log(LogStatus.PASS, "Act and Exp are matching at Programs icon");
//									if (list.contains(SidePanel_Project(WebDriver driver))) {
//										CodeLibrary.mouseOverElement(SidePanel_Project(WebDriver driver));
//										CodeLibrary.Compare(SidePanel_Project_txt(WebDriver driver), "Projects");
//										test.log(LogStatus.PASS, "Act and Exp are matching at Projects icon");
//										if (list.contains(SidePanel_Claims(WebDriver driver))) {
//											CodeLibrary.mouseOverElement(SidePanel_Claims(WebDriver driver));
//											CodeLibrary.Compare(SidePanel_Claims_txt(WebDriver driver), "Claims");
//											test.log(LogStatus.PASS, "Act and Exp are matching at Claims icon");
//											CodeLibrary.Compare(SidePanel_Claims_Upload_txt(WebDriver driver), "Claims Upload");
//											test.log(LogStatus.PASS, "Act and Exp are matching at Claims upload icon");
//											if (list.contains(SidePanel_Claims(WebDriver driver))) {
//												CodeLibrary.mouseOverElement(SidePanel_Claims(WebDriver driver));
//												CodeLibrary.Compare(SidePanel_Claims_txt(WebDriver driver), "Claims");
//												test.log(LogStatus.PASS, "Act and Exp are matching at Claims icon");
//												CodeLibrary.Compare(SidePanel_Claims_Upload_txt(WebDriver driver),
//														"Claims Upload");
//												test.log(LogStatus.PASS,
//														"Act and Exp are matching at Claims upload icon");
//												if (list.contains(SidePanel_mail(WebDriver driver))) {
//													CodeLibrary.mouseOverElement(SidePanel_mail(WebDriver driver));
//													Thread.sleep(2000);
//													CodeLibrary.Compare(SidePanel_mail_txt(WebDriver driver), "Email");
//													test.log(LogStatus.PASS, "Act and Exp are matching at mails icon");
//													CodeLibrary.Compare(SidePanel_mail_Inbox_txt(WebDriver driver), "Inbox");
//													test.log(LogStatus.PASS, "Act and Exp are matching at Inbox icon");
//													CodeLibrary.Compare(SidePanel_mail_Archive_txt(WebDriver driver), "Archive");
//													test.log(LogStatus.PASS,
//															"Act and Exp are matching at Archive icon");
//													CodeLibrary.Compare(SidePanel_mail_Junk_txt(WebDriver driver), "Junk");
//													test.log(LogStatus.PASS, "Act and Exp are matching at Junk icon");
//													CodeLibrary.Compare(SidePanel_mail_Draft_txt(WebDriver driver), "Draft");
//													test.log(LogStatus.PASS, "Act and Exp are matching at Draft icon");
//													CodeLibrary.Compare(SidePanel_mail_Sent_txt(WebDriver driver), "Sent");
//													test.log(LogStatus.PASS, "Act and Exp are matching at Sent icon");
//													CodeLibrary.Compare(SidePanel_mail_Deleted_txt(WebDriver driver), "Deleted");
//													test.log(LogStatus.PASS,
//															"Act and Exp are matching at Deleted icon");
//													if (list.contains(SidePanel_Fax(WebDriver driver))) {
//														CodeLibrary.mouseOverElement(SidePanel_Fax(WebDriver driver));
//														CodeLibrary.Compare(SidePanel_Fax_txt(WebDriver driver), "Fax");
//														test.log(LogStatus.PASS,
//																"Act and Exp are matching at Fax icon");
//														if (list.contains(SidePanel_Notes(WebDriver driver))) {
//															CodeLibrary.mouseOverElement(SidePanel_Notes(WebDriver driver));
//															CodeLibrary.Compare(SidePanel_Notes_txt(WebDriver driver), "Notes");
//															test.log(LogStatus.PASS,
//																	"Act and Exp are matching at Notes icon");
//															if (list.contains(SidePanel_Documnets(WebDriver driver))) {
//																CodeLibrary
//																		.mouseOverElement(SidePanel_Documnets(WebDriver driver));
//																CodeLibrary.Compare(SidePanel_Documnets_txt(WebDriver driver),
//																		"Documents");
//																test.log(LogStatus.PASS,
//																		"Act and Exp are matching at Documnets icon");
//																if (list.contains(SidePanel_Tasks(WebDriver driver))) {
//																	CodeLibrary
//																			.mouseOverElement(SidePanel_Tasks(WebDriver driver));
//																	CodeLibrary.Compare(SidePanel_Tasks_txt(WebDriver driver),
//																			"Tasks");
//																	test.log(LogStatus.PASS,
//																			"Act and Exp are matching at Tasks icon");
//																	if (list.contains(SidePanel_Calender(WebDriver driver))) {
//																		CodeLibrary
//																				.mouseOverElement(SidePanel_Calender(WebDriver driver));
//																		CodeLibrary.Compare(
//																				SidePanel_Calender_txt(WebDriver driver), "Calendar");
//																		test.log(LogStatus.PASS,
//																				"Act and Exp are matching at Calender icon");
//																		if (list.contains(SidePanel_Calender(WebDriver driver))) {
//																			CodeLibrary.mouseOverElement(
//																					SidePanel_Reports(WebDriver driver));
//																			CodeLibrary.Compare(
//																					SidePanel_Calender_txt(WebDriver driver),
//																					"Reports");
//																			test.log(LogStatus.PASS,
//																					"Act and Exp are matching at Reports icon");
//																			NodeAdmin_Validations_Page.LOgout_Icon(WebDriver driver)
//																					.click(WebDriver driver);
//																			NodeAdmin_Validations_Page.LogOut_Btn(WebDriver driver)
//																					.click(WebDriver driver);
//																			Thread.sleep(3000);
//																			System.out.println(
//																					"logout is done  succcesfully");
//																			NodeAdmin_Validations_Page
//																					.Node_Admin_UN_Feild(WebDriver driver)
//																					.sendKeys(ExcelLibraray_Hashmap
//																							.getCellData("username",
//																									1));
//																			NodeAdmin_Validations_Page
//																					.NodeAdmin_PW_Feild(WebDriver driver)
//																					.sendKeys(ExcelLibraray_Hashmap
//																							.getCellData("password",
//																									1));
//																			NodeAdmin_Validations_Page
//																					.login_Btn_Node_Admin(WebDriver driver).click(WebDriver driver);
//																			Thread.sleep(2000);
//																			NodeAdmin_Validations_Page.programme_Icon(WebDriver driver)
//																					.click(WebDriver driver);
//																			Thread.sleep(3000);
//																			CodeLibrary
//																					.click(NodeAdmin_Validations_Page
//																							.SecurityGroups_Icon(WebDriver driver));
//																			test.log(LogStatus.PASS,
//																					"Security Groups Tab is clicked succesfully");
//																			CodeLibrary.selectByVisibleText(
//																					"Node Administrator | Node_Admin",
//																					NodeAdmin_Validations_Page
//																							.SelectProfile_Dropdown(WebDriver driver));
//																			
//																			CodeLibrary.scrollToEndt(WebDriver driver);
//																			Thread.sleep(3000);
//																			NodeAdmin_Validations_Page.Save_Btn(WebDriver driver)
//																					.click(WebDriver driver);
//																			test.log(LogStatus.PASS,
//																					"Save Btn   is clicked succesfully");
//																			driver.switchTo(WebDriver driver).alert(WebDriver driver).accept(WebDriver driver);
//																			
//																					
//																		}
//
//																	}
//
//																}
//
//															}
//														}
//													}
//												}
//
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		} else {
//			test.log(LogStatus.FAIL, "came to else loop");
//		}
//		test.log(LogStatus.PASS, test.addScreenCapture(CodeLibrary.captureScreen(driver, "Node Admin")));
//
//	}
//	
}
