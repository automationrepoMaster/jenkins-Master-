package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hompage_SubModules_Page {

	public static WebElement element;
	public static List<WebElement>listelement;
	
	static String HomePage_Certificates_ICon = "//span[@id='ctl00_ContentPlaceHolder1_spnCertificates']";
	static String HomePage_PayRoll_ICon = "//span[@id='ctl00_ContentPlaceHolder1_spnPayroll']";
	static String Homepage_ChangeOrders_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnChangeOrder']";
	static String HomePage_Claims_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnClaim']";
	static String HomePage_LossControl_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnLC']";
	static String HomePage_CompletionNotice_ICon = "//span[@id='ctl00_ContentPlaceHolder1_spnCN']";
	static String ListPayroll="//div[@class='container']//div[@id='divContractorPackage']/..//tbody//tr";
	static String RadioButton ="//div[@class='container']//div[@id='divContractorPackage']/..//tbody//tr//div";
	static String SaveandCloseBtnLosscontrol="//input[@id='cntrlContractorSafety_btnSaveandClose']";
	static String CloseBtnLosscontrol="//button[@class='btn']";
	
	
	public static WebElement CloseBtnLosscontrol(WebDriver driver) {

		element = driver.findElement(By.xpath(CloseBtnLosscontrol));
		return element;
	}
	public static WebElement SaveandCloseBtnLosscontrol(WebDriver driver) {

		element = driver.findElement(By.xpath(SaveandCloseBtnLosscontrol));
		return element;
	}
	public static WebElement RadioButton(WebDriver driver) {

		element = driver.findElement(By.xpath(RadioButton));
		return element;
	}
	public static List<WebElement>ListPayroll(WebDriver driver){
		 listelement = driver.findElements(By.xpath(ListPayroll));
		return listelement;
	}

	public static WebElement HomePage_Certificates_ICon(WebDriver driver) {

		element = driver.findElement(By.xpath(HomePage_Certificates_ICon));
		return element;
	}

	public static WebElement HomePage_PayRoll_ICon(WebDriver driver) {

		element = driver.findElement(By.xpath(HomePage_PayRoll_ICon));
		return element;
	}

	public static WebElement Homepage_ChangeOrders_Icon(WebDriver driver) {

		element = driver.findElement(By.xpath(Homepage_ChangeOrders_Icon));
		return element;
	}

	public static WebElement HomePage_Claims_Icon(WebDriver driver) {

		element = driver.findElement(By.xpath(HomePage_Claims_Icon));
		return element;
	}

	public static WebElement HomePage_LossControl_Icon(WebDriver driver) {

		element = driver.findElement(By.xpath(HomePage_LossControl_Icon));
		return element;
	}

	public static WebElement HomePage_CompletionNotice_ICon(WebDriver driver) {

		element = driver.findElement(By.xpath(HomePage_CompletionNotice_ICon));
		return element;

	}
	
	// Raja wrote this
	
	//Certificates window 
		static String ProgrammeTilte ="//div[@id='cntlViewMonthlyPayroll_divrowPad25']//..//li[@class='project-name']//div[2]";
		static String projectnameTilte  = "//div[@id='cntlViewMonthlyPayroll_divrowPad25']//..//li[@class='program-name']//div[2]";
		static String EnrollmentTypeTilte= "//div[@id='cntlViewMonthlyPayroll_divrowPad25']//..//li[@class='enrollment-type']//div[2]";
		static String TradeNameTilte =  "//div[@id='cntlViewMonthlyPayroll_divrowPad25']//..//li[@class='trade-name']//div[2]";
		static String FinishCloseBtn="//button[@id='cntlViewMonthlyPayroll_btnFinishandClose']";
		
		
		// Changeorder
		static String ProgrammeTilteChangorder ="//div[@id='cntlucViewChangeOrder_divrowPad25']//..//li[@class='project-name']//div[2]";
		static String projectnameTilteChangorder  = "//div[@id='cntlucViewChangeOrder_divrowPad25']//..//li[@class='program-name']//div[2]";
		static String EnrollmentTypeTilteChangorder= "//div[@id='cntlucViewChangeOrder_divrowPad25']//..//li[@class='enrollment-type']//div[2]";
		static String TradeNameTilteChangorder =  "//div[@id='cntlucViewChangeOrder_divrowPad25']//..//li[@class='trade-name']//div[2]";
		static String FinishCloseBtnChangorder="//button[@id='cntlucViewChangeOrder_btnFinishandClose']";
		
		// Cliams
		
		static String ProgrammeTilteClaims ="//div[@id='cntrlucViewClaim_divrowPad25']//..//li[@class='project-name']//div[2]";
		static String projectnameTilteClaims  = "//div[@id='cntrlucViewClaim_divrowPad25']//..//li[@class='program-name']//div[2]";
		static String EnrollmentTypeTilteClaims= "//div[@id='cntrlucViewClaim_divrowPad25']//..//li[@class='enrollment-type']//div[2]";
		static String TradeNameTilteClaims =  "//div[@id='cntrlucViewClaim_divrowPad25']//..//li[@class='trade-name']//div[2]";
		static String FinishCloseBtnClaims="//button[@id='cntrlucViewClaim_btnFinishandClose']";
		
		// Certificates
		
		static String ProgrammeTilteCertificates ="//div[@id='cntrlViewCertificates_divrowPad25']//..//li[@class='project-name']//div[2]";
		static String projectnameTilteCertificates  = "//div[@id='cntrlViewCertificates_divrowPad25']//..//li[@class='program-name']//div[2]";
		static String EnrollmentTypeTilteCertificates= "//div[@id='cntrlViewCertificates_divrowPad25']//..//li[@class='enrollment-type']//div[2]";
		static String TradeNameTilteCertificates =  "//div[@id='cntrlViewCertificates_divrowPad25']//..//li[@class='trade-name']//div[2]";
		static String FinishCloseBtnCertificates="//button[@id='cntrlViewCertificates_btnFinishandClose']";
		
		public static WebElement ProgrammeTilteCertificates(WebDriver driver)
		{
			element = driver.findElement(By.xpath(ProgrammeTilteCertificates));
			return element;
		}
		public static WebElement projectnameTilteCertificates(WebDriver driver)
		{
			element = driver.findElement(By.xpath(projectnameTilteCertificates));
			return element;
		}
		public static WebElement EnrollmentTypeTilteCertificates(WebDriver driver)
		{
			element = driver.findElement(By.xpath(EnrollmentTypeTilteCertificates));
			return element;
		}
		public static WebElement TradeNameTilteCertificates(WebDriver driver)
		{
			element = driver.findElement(By.xpath(TradeNameTilteCertificates));
			return element;
		}
		
		public static WebElement FinishCloseBtnCertificates(WebDriver driver)
		{
			element = driver.findElement(By.xpath(FinishCloseBtnCertificates));
			return element;
		}
		
		
		
		
		public static WebElement ProgrammeTilteClaims(WebDriver driver)
		{
			element = driver.findElement(By.xpath(ProgrammeTilteClaims));
			return element;
		}
		public static WebElement projectnameTilteClaims(WebDriver driver)
		{
			element = driver.findElement(By.xpath(projectnameTilteClaims));
			return element;
		}
		public static WebElement EnrollmentTypeTilteClaims(WebDriver driver)
		{
			element = driver.findElement(By.xpath(EnrollmentTypeTilteClaims));
			return element;
		}
		public static WebElement TradeNameTilteClaims(WebDriver driver)
		{
			element = driver.findElement(By.xpath(TradeNameTilteClaims));
			return element;
		}
		public static WebElement FinishCloseBtnClaims(WebDriver driver)
		{
			element = driver.findElement(By.xpath(FinishCloseBtnClaims));
			return element;
		}
		public static WebElement ProgrammeTilteChangorder(WebDriver driver)
		{
			element = driver.findElement(By.xpath(ProgrammeTilteChangorder));
			return element;
		}
		public static WebElement projectnameTilteChangorder(WebDriver driver)
		{
			element = driver.findElement(By.xpath(projectnameTilteChangorder));
			return element;
		}
		public static WebElement EnrollmentTypeTilteChangorder(WebDriver driver)
		{
			element = driver.findElement(By.xpath(EnrollmentTypeTilteChangorder));
			return element;
		}
		public static WebElement TradeNameTilteChangorder(WebDriver driver)
		{
			element = driver.findElement(By.xpath(TradeNameTilteChangorder));
			return element;
		}
		public static WebElement FinishCloseBtnChangorder(WebDriver driver)
		{
			element = driver.findElement(By.xpath(FinishCloseBtnChangorder));
			return element;
		}
		 
		public static String  getMyWindowTitle(WebDriver driver) {
			String certificates=driver.getTitle();
			return certificates;
		}
		
		public static WebElement FinishCloseBtn(WebDriver driver)
		{
			element = driver.findElement(By.xpath(FinishCloseBtn));
			return element;
		}
		
		public static WebElement Prograname(WebDriver driver)
		{
			element = driver.findElement(By.xpath(ProgrammeTilte));
			return element;
		}
		public static WebElement projectname(WebDriver driver)
		{
			element = driver.findElement(By.xpath(projectnameTilte));
			return element;
		}
		public static WebElement EnrollmentType(WebDriver driver)
		{
			element = driver.findElement(By.xpath(EnrollmentTypeTilte));
			return element;
		}
		public static WebElement TradeName(WebDriver driver)
		{
			element = driver.findElement(By.xpath(TradeNameTilte));
			return element;
		}
		
		// Raja wrote this  from Homepage_SubModules_AdvSearch_Page
		
		static String Homepage_Submodules_AdvancesearchICon = "//a[@id='aAdvancedSearch']"; 
		static String Homepage_Submodules_SelectProgramme = "//select[@id='ddlProject']";
		static String Homepage_Submodules_SelectTrade = "//input[@id='token-input-txtTradePackages']";
		static String Homepage_Submodules_SelectProject = "//select[@id='ddlWorkSite']";
		static String Homepage_Submodules_SearchforContractor = "//input[@id='token-input-txtGeneralContractor']";
		static String Homepage_Submodules_EditBtn = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";
		static String Homepage_Submodules_Advance_SearchBtn_DOwn = "//input[@id='btnSearch']";
	    static String Homepage_Submodules_frame_btn ="//iframe[@name='_iframe-EmailBox12']"; //body/div[@id='dhtmlwindowholder']/div[@id='EmailBox12']/div[2]/iframe[1]";
	    static String Homepage_Submodules_Search_Contractor_feild="//input[@id='txtSearch']";
	    static String Homepage_Submodules_CloseBtn="//button[@id='btnClose']";
	    static String Homepage_Submodules_SearchBtn_Homepage = "//input[@id='btnAdvanceSearch']";
	    static String Homepage_Submodules_ContractorType="//select[@id='ddlContractorType']";
	    static String Homepage_Submodules_RadioBtn ="//input[@id='rptContractor_ctl00_rdoSelect']";
	    static String Homepage_Submodules_NextBtn= "//input[@id='btnNext']"	;
	    
	    
	    
	    
	    public static WebElement Homepage_Submodules_NextBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_NextBtn));
			return element;
		}
	    
	    
	    public static WebElement Homepage_Submodules_RadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_RadioBtn));
			return element;
		}
	    
	    
	    public static WebElement Homepage_Submodules_ContractorType(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_ContractorType));
			return element;
		}
	    
	    public static WebElement Homepage_Submodules_SearchBtn_Homepage(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_SearchBtn_Homepage));
			return element;
		}
	    
	    
	    public static WebElement Homepage_Submodules_CloseBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_CloseBtn));
			return element;
		}
	    
	    public static WebElement Homepage_Submodules_Search_Contractor_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_Search_Contractor_feild));
			return element;
		}
	    public static WebElement Homepage_Submodules_frame_btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_frame_btn));
			return element;
		}
	    
		public static WebElement Homepage_Submodules_AdvancesearchICon(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_AdvancesearchICon));
			return element;
		}

		public static WebElement Homepage_Submodules_SelectProgramme(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_SelectProgramme));
			return element;
		}

		public static WebElement Homepage_Submodules_SelectTrade(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_SelectTrade));
			return element;
		}

		public static WebElement Homepage_Submodules_SelectProject(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_SelectProject));
			return element;
		}

		

		public static WebElement Homepage_Submodules_SearchforContractor(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_SearchforContractor));
			return element;
		}

		public static WebElement Homepage_Submodules_Advance_SearchBtn_DOwn(WebDriver driver) {
			element = driver.findElement(By.xpath(Homepage_Submodules_Advance_SearchBtn_DOwn));
			return element;
		}
		
		// Raja wrote this
		
		static String Notes_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnNotes']//img[@src='images/map/notes.png']";
		static String Plus_btn = "//i[@class='fa fa-plus']";
		static String Edit_btn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlNoteList_liedit']//i";
		static String Delet_btn = "//i[@class='fa fa-trash-o']";
		static String Search_Notes = "//input[@id='ctl00_ContentPlaceHolder1_cntrlNoteList_txtSearch']";
		static String Adv_Search_Notes = "//a[@data-original-title='Advanced Search']";
		static String Select_category = "//button[@id='ctl00_ContentPlaceHolder1_cntrlNoteList_btnDropdown']";
		static String Select_flag = "//div[@id='changeFlag']//i";
		static String Close_Btn = " //button[@class='btn']";
		static String Adv_Search_Btndown = "//input[@id='btnAdvanceSearch']";
		static String Refresh_Btn = "//i[@class='fa fa-refresh']";
		static String frame_btn = "//iframe[@id='ifrmPreview']";
		static String Remove_link = "td[class='centerAlign'] a";
		static String Flag ="//a[@id='aAction11']//i[@class='i-flag']"; 
		static String Adv_search_flag_Btn ="//div[@id='changeFlag']//i";


		static String Notes_Module_Note_Title_feild ="//input[@id='cntrlNoteAddUpdate_txtTitle']";
		static String Notes_Module_Note_Title_ErrorMsg = "//label[@for='cntrlNoteAddUpdate_txtTitle']";
		static String Notes_Module_Note_Desctiption ="//body[@id='tinymce']";
	    static String Notes_Module_Note_Desctiption_frame ="//iframe[@id='cntrlNoteAddUpdate_txtDesc_ifr']";
	    static String Notes_Module_Saveandclose_Btn ="//input[@id='cntrlNoteAddUpdate_btnSaveandClose']";
	   
	    static String Createbytext ="//span[ @class='createddate']";
	    static String ModifiedByText="//span[@class='modifydate']";
	    static String Searchbar_suggetionsList ="//ul[@id='ui-id-1']";
	    static String NotesList="//div[@class='mail_list twoIconset']//ul[@id='ulNoteList']/..//div[@class='mailDetails']//div[contains(text(),'Raja')]";
	    
	    
	  //String ContractorNote = "//div[@class='mail_list twoIconset']//ul[@id='ulNoteList']//li//div[@class='userName' and contains(text(),'Raja')]/../..";

	  	static String ContractorNote="//div[@class='mail_list twoIconset']//ul[@id='ulNoteList']//li//div[@class='userName' and contains(text(),'Raja')]";
	  	
	  	public static List<WebElement> SelectDynamicNotes(WebDriver driver) {
	  		listelement = driver.findElements(By.xpath(NotesList));
	  		return listelement;
	  	}
	    
	  	 public static WebElement NotesList(WebDriver driver) {
	 		element = driver.findElement(By.xpath(NotesList));
	 		return element;
	 	}
	    public static List<WebElement>  Searchbar_suggetionsList(WebDriver driver) {
	    	listelement = driver.findElements(By.xpath(Searchbar_suggetionsList));
			return listelement;
		}
	    public static WebElement ModifiedByText(WebDriver driver) {
			element = driver.findElement(By.xpath(ModifiedByText));
			return element;
		}
	    public static WebElement Createbytext(WebDriver driver) {
			element = driver.findElement(By.xpath(Createbytext));
			return element;
		}
	    public static WebElement Adv_search_flag_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Adv_search_flag_Btn));
			return element;
		}
	    public static WebElement Flag(WebDriver driver) {
			element = driver.findElement(By.xpath(Flag));
			return element;
		}
	    public static WebElement Notes_Module_Note_Title_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Module_Note_Title_feild));
			return element;
		}
	    public static WebElement Notes_Module_Note_Title_ErrorMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Module_Note_Title_ErrorMsg));
			return element;
		}
	    public static WebElement Notes_Module_Note_Desctiption(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Module_Note_Desctiption));
			return element;
		}
	    public static WebElement Notes_Module_Note_Desctiption_frame(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Module_Note_Desctiption_frame));
			return element;
		}
	    public static WebElement Notes_Module_Saveandclose_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Module_Saveandclose_Btn));
			return element;
		}
				
		public static WebElement Notes_Icon(WebDriver driver) {
			element = driver.findElement(By.xpath(Notes_Icon));
			return element;
		}
		public static WebElement Plus_btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Plus_btn));
			return element;
		}
		public static WebElement Edit_btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Edit_btn));
			return element;
		}
		public static WebElement Delet_btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Delet_btn));
			return element;
		}
		public static WebElement Search_Notes(WebDriver driver) {
			element = driver.findElement(By.xpath(Search_Notes));
			return element;
		}
		public static WebElement Adv_Search_Notes(WebDriver driver) {
			element = driver.findElement(By.xpath(Adv_Search_Notes));
			return element;
		}
		public static WebElement Select_category(WebDriver driver) {
			element = driver.findElement(By.xpath(Select_category));
			return element;
		}
		public static WebElement Select_flag(WebDriver driver) {
			element = driver.findElement(By.xpath(Select_flag));
			return element;
		}
		public static WebElement Close_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Close_Btn));
			return element;
		}
		public static WebElement Adv_Search_Btndown(WebDriver driver) {
			element = driver.findElement(By.xpath(Adv_Search_Btndown));
			return element;
		}
		public static WebElement Refresh_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(Refresh_Btn));
			return element;
		}
		public static WebElement frame_btn(WebDriver driver) {
			element = driver.findElement(By.xpath(frame_btn));
			return element;
		}
		public static WebElement Remove_link(WebDriver driver) {
			element = driver.findElement(By.xpath(Remove_link));
			return element;
		}

		// Raja wrote this from Task Module page
		
		static String Tasks_Icon = "//span[@id='ctl00_ContentPlaceHolder1_spnTasks']//a[@id='ctl00_ContentPlaceHolder1_aTask']";

		static String PlusBtn = "//div[@class='leftButtonGroup']//i[@class='fa fa-plus']";
		static String EditBtn = "//i[@class='fa fa-pencil-square-o']";
		static String DeleteBtn = "//div[@class='leftButtonGroup']//i[@class='fa fa-trash-o']";
		static String TaskModule_Searchbar = "//input[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_txtSearch']";
		static String TaskModule_RefreshBtn = "//div[@class='rightButtonGroup']//i[@class='fa fa-refresh']";
		// Advance Search Btn
		static String TaskModule_AdvsearchBtn = "//i[@class='fa fa-caret-down']";
		static String TaskModule_AdvsearchBtn_SelectAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_ddlNodeAdministrator']";
		static String TaskModule_AdvsearchBtn_frameBtn = "//iframe[@id='ifrmPreview']";
		static String TaskModule_AdvsearchBtn_SelectStatus = "//select[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_ddlStatus']";
		static String TTaskModule_AdvsearchBtn_SelectSorting = "//select[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_ddlSort']";
		static String TaskModule_AdvsearchBtn_Asc = "//select[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_ddlSortType']";
		static String TaskModule_AdvsearchBtn_SelectCateogery = "//button[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_btnDropdown']";
		static String TaskModule_AdvsearchBtn_SearchBtnDown = "//input[@id='btnAdvanceSearch']";
		static String TaskModule_Closebtn = "//button[@class='btn']";
		static String TaskModule_AdvsearchBtn_BenginDate_Feild = "//input[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_startdatetimepicker']";
		static String TaskModule_AdvsearchBtn_Flag_Btn = "//div[@id='changeFlag']";
		static String TaskModule_AdvsearchBtn_EndDate_feild = "//input[@id='ctl00_ContentPlaceHolder1_cntrlTaskList_enddatetimepicker']";

		// mail Body List
		static String TaskModule_AllmailList = "//div[@class='panel-body']//div[@class='mail_list twoIconset']";
		static String TaskModule_AllmailList_Seemore = "//a[@id='aSeeMore']";

		// PanelBody

		static String TaskBarBegindate_Text = "//span[@id='ltrTaskStart']";
		static String TaskModule_Enddate_text = "//span[@id='ltrTaskEnd']";
		static String TaskModule_AssignedBy_Text = "//span[@id='lblAssignedBy']";
		static String TaskModule_Priority_Text = "//span[@id='ltrPriority2']";
		static String TaskModule_Assigned_to_Text = "//div[contains(text(),'Tasks Assigned To')]";
		static String TaskModule_TaskAssignedtoname_Text = "//table[@class='table blueTable']/tbody/tr/td[2]//a[contains(text(),'Brad pitle')]";
		static String TaskModule_TaskRelatedTO_Text = "//div[contains(text(),'Tasks Related To')]";
		static String TaskModule_TaskRealtedto_name_Text = " //table[@class='table blueTable']/tbody/tr/td[2]//a[contains(text(),'David beckham')]";
		static String Tasbar_CreatedBy_DateandText = "//div[@class='general_date']//span[ @class='createddate']";
		static String TaskModule_ModifiedBy_Text = "//div[@class='general_date']//span[ @class='modifydate']";

		// Listing panel

		static String TaskModule_AllSeeALL_ICon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon0 tipB']//i[@class='fa fa-tachometer']";
		static String TaskModule_EmailIcon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon1 tipB']//i[@class='fa fa-envelope']";
		static String TaskModule_FaxICon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon2 tipB']//i[@class='fa fa-fax']";
		static String TaskModule_CalenderIcon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon3 tipB']//i[@class='fa fa-calendar']";
		static String TaskModule_Documnets_Icon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon4 tipB']//i[@class='fa fa-file-text-o']";
		static String TaskModule_Stickynotes_Icon = "//div[@class='taskIcon pad-top10 ']//li[@class='icon5 tipB']//i[@class='fa fa-sticky-note-o']";

		// ClipboardICon
		static String TaskModule_Clipboard_Icon = "//div[@class='taskIcon pad-top10 ']//i[@class='fa fa-clipboard']";

		// taskbar Lsting panel Common Subfeilds
		static String TaskModule_Listingpanel_Subject = "//*[@id='form1']/div[@id='dragandrophandler']//input[@id='txtSubject']";
		static String TaskModule_Listingpanel_SubjectTo = "//*[@id='form1']/div[@id='dragandrophandler']//input[@id='token-input-txtAssignedTo']";
		static String TaskModule_Listingpanel_Begin = "//*[@id='form1']/div[@id='dragandrophandler']//input[@id='txtStartDate']";
		static String TaskModule_Listingpanel_SelectTaskstatusDropdown = "//select[@id='ctrlActivity_ddlTaskStatus']";
		static String TaskModule_Listingpanel_WriteyourMessage = "//textarea[@id='txtWriteYourMessage']";
		static String TaskModule_Listingpanel_PressEntertosendChkBox = "//input[@id='chkPressEnterToSend']";
		// EvenLog ICon
		static String TaskModule_EventlogIcon = "//div[@class='taskIcon pad-top10 ']//i[@class='fa fa-book']";

		// submit btn
		static String TaskModule_Listingpanel_SubmitBtn = "//span[@id='spnSubmit']";

		// Add Task

		static String TaskModule_AddTask_subject_feild = "//input[@id='cntrlTaskAddUpdate_txtTitle']";
		static String TaskModule_AddTask__AssignedTo_feild = "//input[@id='token-input-cntrlTaskAddUpdate_txtAssignedTo']";
		static String TaskModule_AddTask_RelatedTo_feild = "//input[@id='token-input-cntrlTaskAddUpdate_txtRelatedTo']";
		static String TaskModule_AddTask_BeginDate_feild = "//input[@id='cntrlTaskAddUpdate_startdatetimepicker']";
		static String TaskModule_AddTask_EndDate_feild = "//input[@id='cntrlTaskAddUpdate_enddatetimepicker']";
		static String TaskModule_AddTask_SelectaStatus_Dropdown = "//select[@id='cntrlTaskAddUpdate_ddlStatus']";
		static String TaskModule_AddTask_SelectPriority_DropDown = "//select[@id='cntrlTaskAddUpdate_ddlPriority']";
		static String TaskModule_AddTask_FrameBtn = "//iframe[@id='cntrlTaskAddUpdate_txtDesc_ifr']";
		static String TaskModule_AddTask_Decriptionfeild = "//body[@class='mce-content-body ']";
		static String TaskModule_AddTask_SendEmailNotificationofDueDate_feild = "//input[@id='UserList-2']";
		static String TaskModule_AddTask_Would_you_like_to_add_a_Task_Estimate_Switch = "//div[@class='ios-ui-select']";
		static String TaskModule_AddTask_TaskEstimate_EstimatedDays_feild = "//input[@id='cntrlTaskAddUpdate_txtEstimatedDays']";
		static String TaskModule_AddTask_TaskEstimate_ActualDays_feild = "//input[@id='cntrlTaskAddUpdate_txtActualWorkingDays']";
		static String TaskModule_AddTask_TaskEstimate_EstimatedHours_feild = "//input[@id='cntrlTaskAddUpdate_txtEstimtedHours']";
		static String TaskModule_AddTask_TaskEstimate_ActualHours_feild = "//input[@id='cntrlTaskAddUpdate_txtActualHours']";
		static String TaskModule_AddTask_TaskEstimate_Completed_feild = "//input[@id='cntrlTaskAddUpdate_txtCompleted']";
		static String TaskModule_AddTask_SaveandcontinueBtn = "//input[@id='cntrlTaskAddUpdate_btnSaveandClose']";
		static String TaskModule_AddTask_Closebtn = "//button[@class='btn']";

		// ErrorMessage for Task Module

		static String TaskModule_AddTask_Subject_ErrorMsg = "//label[@for='cntrlTaskAddUpdate_txtTitle' and @class='error']";
		static String TaskModule_AddTask_AssignedTO_ErrorMsg = "//label[@for='cntrlTaskAddUpdate_txtAssignedTo' and @class='error']";
		
		
		//DynamicTaskList=
		
		static String DynamicTaskList="//div[@class='mail_list twoIconset']//ul//div[@class='mailDetails']/div[@class='userName' and contains(text(),'Blindspot123')]";
		
		
		
		public static List<WebElement> DynamicTaskList(WebDriver driver) {
			listelement = driver.findElements(By.xpath(DynamicTaskList));
			return listelement;
		}
		
		
		
		
		public static WebElement TaskModule_Searchbar(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Searchbar));
			return element;
		}
		public static WebElement DeleteBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(DeleteBtn));
			return element;
		}
		public static WebElement EditBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(EditBtn));
			return element;
		}
		
		
		public static WebElement PlusBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(PlusBtn));
			return element;
		}
		
		public static WebElement Tasks_Icon(WebDriver driver) {
			element = driver.findElement(By.xpath(Tasks_Icon));
			return element;
		}
		
		public static WebElement TaskModule_RefreshBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_RefreshBtn));
			return element;
		}

		public static WebElement TaskModule_AdvsearchBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn));
			return element;
		}
		
		public static WebElement TaskModule_AdvsearchBtn_SelectAdmin(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_SelectAdmin));
			return element;
		}
		
		public static WebElement TaskModule_AdvsearchBtn_frameBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_frameBtn));
			return element;
		}
		
		public static WebElement TaskModule_AdvsearchBtn_SelectStatus(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_SelectStatus));
			return element;
		}
		
		public static WebElement TTaskModule_AdvsearchBtn_SelectSorting(WebDriver driver) {
			element = driver.findElement(By.xpath(TTaskModule_AdvsearchBtn_SelectSorting));
			return element;
		}
		
		public static WebElement TaskModule_AdvsearchBtn_Asc(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_Asc));
			return element;
		}
		
		
		
		public static WebElement TaskModule_AdvsearchBtn_SelectCateogery(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_SelectCateogery));
			return element;
		}
		
		
		public static WebElement TaskModule_AdvsearchBtn_SearchBtnDown(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_SearchBtnDown));
			return element;
		}
		
		public static WebElement TaskModule_Closebtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Closebtn));
			return element;
		}
		
		
		public static WebElement TaskModule_AdvsearchBtn_BenginDate_Feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_BenginDate_Feild));
			return element;
		}
		
		public static WebElement TaskModule_AdvsearchBtn_Flag_Btn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_Flag_Btn));
			return element;
		}
		public static WebElement TaskModule_AdvsearchBtn_EndDate_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AdvsearchBtn_EndDate_feild));
			return element;
		}
		
		
		public static WebElement TaskModule_AllmailList(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AllmailList));
			return element;
		}
		
		public static WebElement TaskModule_AllmailList_Seemore(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AllmailList_Seemore));
			return element;
		}
		
		public static WebElement TaskBarBegindate_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskBarBegindate_Text));
			return element;
		}
		
		public static WebElement TaskModule_Enddate_text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Enddate_text));
			return element;
		}
		
		public static WebElement TaskModule_AssignedBy_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AssignedBy_Text));
			return element;
		}
		
		public static WebElement TaskModule_Priority_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Priority_Text));
			return element;
		}
		
		public static WebElement TaskModule_Assigned_to_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Assigned_to_Text));
			return element;
		}
		public static WebElement TaskModule_TaskAssignedtoname_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_TaskAssignedtoname_Text));
			return element;
		}
		
		public static WebElement TaskModule_TaskRelatedTO_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_TaskRelatedTO_Text));
			return element;
		}
		
		public static WebElement TaskModule_TaskRealtedto_name_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_TaskRealtedto_name_Text));
			return element;
		}
		
		public static WebElement Tasbar_CreatedBy_DateandText(WebDriver driver) {
			element = driver.findElement(By.xpath(Tasbar_CreatedBy_DateandText));
			return element;
		}
		
		public static WebElement TaskModule_ModifiedBy_Text(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_ModifiedBy_Text));
			return element;
		}
		
		public static WebElement TaskModule_AllSeeALL_ICon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AllSeeALL_ICon));
			return element;
		}
		public static WebElement TaskModule_EmailIcon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_EmailIcon));
			return element;
		}
		
		public static WebElement TaskModule_FaxICon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_FaxICon));
			return element;
		}
		
		
		public static WebElement TaskModule_CalenderIcon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_CalenderIcon));
			return element;
		}
		
		public static WebElement TaskModule_Documnets_Icon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Documnets_Icon));
			return element;
		}
		
		public static WebElement TaskModule_Stickynotes_Icon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Stickynotes_Icon));
			return element;
		}
		
		public static WebElement TaskModule_Clipboard_Icon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Clipboard_Icon));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_Subject(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_Subject));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_SubjectTo(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_SubjectTo));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_Begin(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_Begin));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_SelectTaskstatusDropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_SelectTaskstatusDropdown));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_WriteyourMessage(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_WriteyourMessage));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_PressEntertosendChkBox(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_PressEntertosendChkBox));
			return element;
		}

		public static WebElement TaskModule_EventlogIcon(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_EventlogIcon));
			return element;
		}

		public static WebElement TaskModule_Listingpanel_SubmitBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_Listingpanel_SubmitBtn));
			return element;
		}

		public static WebElement TaskModule_AddTask_subject_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_subject_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask__AssignedTo_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask__AssignedTo_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_RelatedTo_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_RelatedTo_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_BeginDate_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_BeginDate_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_EndDate_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_EndDate_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_SelectaStatus_Dropdown(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_SelectaStatus_Dropdown));
			return element;
		}

		public static WebElement TaskModule_AddTask_SelectPriority_DropDown(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_SelectPriority_DropDown));
			return element;
		}

		public static WebElement TaskModule_AddTask_FrameBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_FrameBtn));
			return element;
		}

		public static WebElement TaskModule_AddTask_Decriptionfeild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_Decriptionfeild));
			return element;
		}

		public static WebElement TaskModule_AddTask_SendEmailNotificationofDueDate_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_SendEmailNotificationofDueDate_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_Would_you_like_to_add_a_Task_Estimate_Switch(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_Would_you_like_to_add_a_Task_Estimate_Switch));
			return element;
		}

		public static WebElement TaskModule_AddTask_TaskEstimate_EstimatedDays_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_TaskEstimate_EstimatedDays_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_TaskEstimate_ActualDays_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_TaskEstimate_ActualDays_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_TaskEstimate_EstimatedHours_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_TaskEstimate_EstimatedHours_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_TaskEstimate_ActualHours_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_TaskEstimate_ActualHours_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_TaskEstimate_Completed_feild(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_TaskEstimate_Completed_feild));
			return element;
		}

		public static WebElement TaskModule_AddTask_SaveandcontinueBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_SaveandcontinueBtn));
			return element;
		}

		public static WebElement TaskModule_AddTask_Closebtn(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_Closebtn));
			return element;
		}

		public static WebElement TaskModule_AddTask_Subject_ErrorMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_Subject_ErrorMsg));
			return element;
		}

		public static WebElement TaskModule_AddTask_AssignedTO_ErrorMsg(WebDriver driver) {
			element = driver.findElement(By.xpath(TaskModule_AddTask_AssignedTO_ErrorMsg));
			return element;
		}
		
		
		

		
}
