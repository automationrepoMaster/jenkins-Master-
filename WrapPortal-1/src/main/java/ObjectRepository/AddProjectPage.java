package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String addProjectGeneralInformationTab = "//a[text(WebDriver driver)='General Information']";
	static String addProjectAddressTab = "//a[text(WebDriver driver)='Address']";
	static String addProjectContactsTab = "//a[text(WebDriver driver)='Contacts']";
	static String addProjectProjectAdministratorAccessTab = "//li[@id='cntrWorkSiteAddUpdate_cntrWorkSiteAddUpdate_liAdministratorAccess']";
	static String addProjectEmailManagementTab = "//a[text(WebDriver driver)='Email Management']";
	static String addProjectEnrollmentSetupTab = "//a[text(WebDriver driver)='Enrollment Setup']";
	static String addProjectComplianceTab = "//a[text(WebDriver driver)='Compliance']";
	static String addProjectCertificatesTab = "//a[text(WebDriver driver)='Certificates']";
	static String addProjectMoreTab = "//a[text(WebDriver driver)='More ']";
	static String addProjectChangeOrderTab = "//a[text(WebDriver driver)='Change Order']";

	// static String addProjectChangeOrderTab
	// ="//select[@id='cntrWorkSiteAddUpdate_ddlProject']";

	public static WebElement addProjectGeneralInformationTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectGeneralInformationTab));
		return element;
	}

	public static WebElement addProjectAddressTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectAddressTab));
		return element;
	}

	public static WebElement addProjectContactsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectContactsTab));
		return element;
	}

	public static WebElement addProjectProjectAdministratorAccessTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectProjectAdministratorAccessTab));
		return element;
	}

	public static WebElement addProjectEmailManagementTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectEmailManagementTab));
		return element;
	}

	public static WebElement addProjectEnrollmentSetupTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectEnrollmentSetupTab));
		return element;
	}

	public static WebElement addProjectComplianceTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectComplianceTab));
		return element;
	}

	public static WebElement addProjectCertificatesTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectCertificatesTab));
		return element;
	}

	public static WebElement addProjectMoreTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectMoreTab));
		return element;
	}

	public static WebElement addProjectChangeOrderTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectChangeOrderTab));
		return element;
	}
	
	// Raja Copied this from ProjectValidationsPage
	
	static String ProjectSidePanel = "//li[@id='ctl00_ctrlMenu_liWorksites']";
	static String AdvancesearchbarIcon = "//a[@data-original-title='Advanced Search']/i";
	static String AdvSearchProgramName = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlProject']";
	static String AdvSearchProgAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlNodeAdministrator']";
	static String AdvSearchProjAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlWorkSiteAdministrator']";
	static String AdvSearchProgramSponsor = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlOwner']";
	static String AdvSearchSearchBtnDown = "//input[@id='btnAdvanceSearch']";
	static String EditBtnProjectICON = "//a[@class='tipB']//i[@class='fa fa-pencil-square-o']";

	public static WebElement ProjectSidePanel(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectSidePanel));
		return element;
	}

	public static WebElement AdvancesearchbarIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvancesearchbarIcon));
		return element;
	}

	public static WebElement AdvSearchProgramName(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchProgramName));
		return element;
	}

	public static WebElement AdvSearchProgAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchProgAdmin));
		return element;
	}

	public static WebElement AdvSearchProjAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchProjAdmin));
		return element;
	}

	public static WebElement AdvSearchProgramSponsor(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchProgramSponsor));
		return element;
	}

	public static WebElement AdvSearchSearchBtnDown(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSearchBtnDown));
		return element;
	}

	public static WebElement EditBtnProjectICON(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBtnProjectICON));
		return element;
	}

	// General Information Page

	static String SelectprogramGIpage = "//select[@id='cntrWorkSiteAddUpdate_ddlProject']";
	static String ProjectNameGIpage = "//input[@id='cntrWorkSiteAddUpdate_txtWorkSiteName']";
	static String ProjectNameErrMsgGIpage = "//label[@for='cntrWorkSiteAddUpdate_txtWorkSiteName']";
	static String SelectParentProjectGIpage = "//select[@id='cntrWorkSiteAddUpdate_ddlParentWorksite']";
	static String ContractValueGIPage = "//input[@id='cntrWorkSiteAddUpdate_txtContractorPrice']";
	static String AlertCloseBtn = "//a[@class='btn']";
	static String ProgramAlertMsgGIPage = "//ul[@id='cntrWorkSiteAddUpdate_divErrorMessage']/li";
	static String ProjectAlertMsgGIPage = "//ul[@id='cntrWorkSiteAddUpdate_divErrorMessage']/li";
	static String SelectStateGIPage = "//Select[@id='cntrWorkSiteAddUpdate_ddlState']";
	static String SaveandContinueBtnGIPage = "//input[@id='cntrWorkSiteAddUpdate_btnNextGeneralInfomation']";
	static String SaveandCloseBtnGIPage = "//input[@id='cntrWorkSiteAddUpdate_btnSaveandCloseGeneralInformation']";
	static String SaveBtnGIPage = "//input[@id='cntrWorkSiteAddUpdate_btnSaveGeneralInformation']";
	static String CloseBtnGIPage = "//button[@id='btnClose']";
	static String SelectStateErrMsgGIPage = "//span[@id='cntrWorkSiteAddUpdate_rfvState']";
	static String SelectStateAlertMsgGIPage = "//div[@id='alertModalPopup']//div[2]/div";
	static String EndDateGIPage = "//input[@id='cntrWorkSiteAddUpdate_txtEstComplDate']";
	static String EndDateErrMsgGIPage = "//label[@for='cntrWorkSiteAddUpdate_txtEstComplDate']";
	static String EndDateAlertMsgGIPage = "//ul[@id='cntrWorkSiteAddUpdate_divErrorMessage']/li";
	static String GeneralContractorDeleteBtnGIPage = "//div[@class='addEditIcon pull-right']//a/i";
	static String GeneralContractorDeleteSuccessAlertMsgGIPage = "//div[@id='alertModalPopup']//div[2]/div";
	static String GeneralContractorDeleteSuccessAlertMsgOKBtnGIPage = "//div[@id='alertModalPopup']//div[2]/div/../..//button";
	static String GeneralContractorCompanyAlertGIPage = "//ul[@id='cntrWorkSiteAddUpdate_divErrorMessage']/li";
	static String GeneralContractorContacErrMsgGIPage = "//ul[@id='cntrWorkSiteAddUpdate_divErrorMessage']/li";
	static String GeneralContractorCompanyErrMsgGIPage = "//label[@for='txtCompany']";
	static String GeneralContractorCompanyFeildGIPage = "//input[@id='token-input-txtCompany']";
	static String GeneralContractorContactfeildGIPage = "//input[@id='token-input-txtContractor']";
	static String GeneralContractorSaveBtnGIPage = "//a[@id='divAddnewComapanyy']";
	static String GeneralContractorRemoveBtnGIPage = "//a[@id='divAddnewComapanyyRemove']";
	static String GeneralContractorContactAlertMsgGIPageatSaveandRemoveBtn = "//div[@id='alertModalPopup']//div[2]/div[@class]";

	public static WebElement GeneralContractorContactAlertMsgGIPageatSaveandRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorContactAlertMsgGIPageatSaveandRemoveBtn));
		return element;
	}

	public static WebElement GeneralContractorRemoveBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorRemoveBtnGIPage));
		return element;
	}

	public static WebElement GeneralContractorSaveBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorSaveBtnGIPage));
		return element;
	}

	public static WebElement GeneralContractorContactfeildGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorContactfeildGIPage));
		return element;
	}

	public static WebElement GeneralContractorCompanyFeildGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorCompanyFeildGIPage));
		return element;
	}

	public static WebElement GeneralContractorCompanyErrMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorCompanyErrMsgGIPage));
		return element;
	}

	public static WebElement GeneralContractorContacErrMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorContacErrMsgGIPage));
		return element;
	}

	public static WebElement GeneralContractorCompanyAlertGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorCompanyAlertGIPage));
		return element;
	}

	public static WebElement GeneralContractorDeleteSuccessAlertMsgOKBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorDeleteSuccessAlertMsgOKBtnGIPage));
		return element;
	}

	public static WebElement GeneralContractorDeleteSuccessAlertMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorDeleteSuccessAlertMsgGIPage));
		return element;
	}

	public static WebElement GeneralContractorDeleteBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorDeleteBtnGIPage));
		return element;
	}

	public static WebElement EndDateAlertMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EndDateAlertMsgGIPage));
		return element;
	}

	public static WebElement EndDateErrMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EndDateErrMsgGIPage));
		return element;
	}

	public static WebElement EndDateGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EndDateGIPage));
		return element;
	}

	public static WebElement SelectStateAlertMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectStateAlertMsgGIPage));
		return element;
	}

	public static WebElement SelectStateErrMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectStateErrMsgGIPage));
		return element;
	}

	public static WebElement CloseBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnGIPage));
		return element;
	}

	public static WebElement SaveBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtnGIPage));
		return element;
	}

	public static WebElement SaveandCloseBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnGIPage));
		return element;
	}

	public static WebElement SaveandContinueBtnGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnGIPage));
		return element;
	}

	public static WebElement SelectStateGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectStateGIPage));
		return element;
	}

	public static WebElement ProjectAlertMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectAlertMsgGIPage));
		return element;
	}

	public static WebElement ProgramAlertMsgGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(ProgramAlertMsgGIPage));
		return element;
	}

	public static WebElement AlertCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(AlertCloseBtn));
		return element;
	}

	public static WebElement ContractValueGIPage(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractValueGIPage));
		return element;
	}

	public static WebElement SelectParentProjectGIpage(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectParentProjectGIpage));
		return element;
	}

	public static WebElement ProjectNameErrMsgGIpage(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectNameErrMsgGIpage));
		return element;
	}

	public static WebElement ProjectNameGIpage(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectNameGIpage));
		return element;
	}

	public static WebElement SelectprogramGIpage(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectprogramGIpage));
		return element;
	}
	
	
	// Address Page

	static String EditBtnAddressPage = "//div[@class='editLink']/a[1]";
	static String DeleteBtnAddressPage = "//div[@class='editLink']/a[2]";
	static String AddnewBtnAddressPage = "//li[@class='addAddressDiv']//a/i[1]";
	static String BackBtnAddressPage = "//input[@id='cntrAddressList_btnBack']";
	static String NextBtnAddressPage = "//input[@id='cntrAddressList_btnNextAddress']";
	static String EditSelectAddressTypeAddressPage = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";
	static String EditAddress1AddressPage = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String EditSelectStateAddresspage = "//select[@id='cntrAddressAddUpdate_ddlState']";
	static String EditAddressSaveBtnAddressPage = "//input[@id='cntrAddressAddUpdate_btnSaveGeneralInformation']";
	static String EditAddressSaveandCloseBtnAddressPage = "//input[@id='cntrAddressAddUpdate_btnSaveandCloseGeneralInformation']";
	static String EditSelectAddressTypeErrMsgAddressPage = "//span[@id='cntrAddressAddUpdate_rfvAddressType']";
	static String EditSelectAddressTypeAlertMsgAddressPage = "//ul[@id='cntrAddressAddUpdate_divErrorMessage']//li";
	static String EditAddress1ErrMsgAddressPage = "//span[@id='cntrAddressAddUpdate_RequiredFieldValidator1']";
	static String EditAddress1AlertMsgAddressPage = "//ul[@id='cntrAddressAddUpdate_divErrorMessage']//li";
	static String EditAddressSelectStateErrMsgAddressPage = "//span[@id='cntrAddressAddUpdate_rfvState']";
	static String EditAddressSelectStateAlertMsgAddresPage = "//ul[@id='cntrAddressAddUpdate_divErrorMessage']//li";

	public static WebElement EditBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBtnAddressPage));
		return element;
	}

	public static WebElement DeleteBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtnAddressPage));
		return element;
	}

	public static WebElement AddnewBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(AddnewBtnAddressPage));
		return element;
	}

	public static WebElement BackBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnAddressPage));
		return element;
	}

	public static WebElement NextBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(NextBtnAddressPage));
		return element;
	}

	public static WebElement EditSelectAddressTypeAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditSelectAddressTypeAddressPage));
		return element;
	}

	public static WebElement EditAddress1AddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddress1AddressPage));
		return element;
	}

	public static WebElement EditSelectStateAddresspage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditSelectStateAddresspage));
		return element;
	}

	public static WebElement EditAddressSaveBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddressSaveBtnAddressPage));
		return element;
	}

	public static WebElement EditAddressSaveandCloseBtnAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddressSaveandCloseBtnAddressPage));
		return element;
	}

	public static WebElement EditSelectAddressTypeErrMsgAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditSelectAddressTypeErrMsgAddressPage));
		return element;
	}

	public static WebElement EditSelectAddressTypeAlertMsgAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditSelectAddressTypeAlertMsgAddressPage));
		return element;
	}

	public static WebElement EditAddress1ErrMsgAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddress1ErrMsgAddressPage));
		return element;
	}

	public static WebElement EditAddress1AlertMsgAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddress1AlertMsgAddressPage));
		return element;
	}

	public static WebElement EditAddressSelectStateErrMsgAddressPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddressSelectStateErrMsgAddressPage));
		return element;
	}

	public static WebElement EditAddressSelectStateAlertMsgAddresPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditAddressSelectStateAlertMsgAddresPage));
		return element;
	}

	// Contacts Page

	static String EditBtnContactsPage = "//a[@id='rptAdditionalContact_ctl00_aEditUserIDContact']//i";
	static String DeleteBtnContactsPage = "//a[@id='rptAdditionalContact_ctl00_aDeleteModuleContact']//i";
	static String BackBtnContactsPage = "//input[@id='btnBackAdditionalContracts']";
	static String NextBtnContactsPage = "//input[@id='btnNextAdditionalContracts']";
	static String CompanyNameContactsFeild = "//input[@id='txtCompanyName']";
	static String CompanyNameContactsErrMsg = "//span[@id='rfvCompanyName']";
	static String CompanyNameContactsAlertMsg = "//ul[@id='divErrorMessage']/li";
	static String CompanyFirstNameContactsFeild = "//input[@id='txtFirstName']";
	static String CompanyFirstNameContactsErrMsg = "//label[@for='txtFirstName']";
	static String CompanyFirstNameContactsAlertMsg = "//ul[@id='divErrorMessage']/li";
	static String CompanyLastNameContactsFeild = "//input[@id='txtLastName']";
	static String CompanyLastNameContactsErrMsg = "//label[@for='txtLastName']";
	static String CompanyLastNameContactsAlertMsg = "//ul[@id='divErrorMessage']/li";
	static String EmailIdContactsFeild = "//input[@id='txtEmail']";
	static String EmailIdContactsErrMsg = "//label[@for='txtEmail']";
	static String EmailIdContactsAlertMsg = "//ul[@id='divErrorMessage']/li";
	static String SaveBtnContactsPage = "//input[@id='btnSaveGeneralInformation']";
	static String SaveandCloseBtnContactsPage = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String SaveandContinueBtnContactsPage = "//input[@id='btnNextGeneralInfomation']";

	public static WebElement EditBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBtnContactsPage));
		return element;
	}

	public static WebElement DeleteBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtnContactsPage));
		return element;
	}

	public static WebElement BackBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnContactsPage));
		return element;
	}

	public static WebElement NextBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(NextBtnContactsPage));
		return element;
	}

	public static WebElement CompanyNameContactsFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyNameContactsFeild));
		return element;
	}

	public static WebElement CompanyNameContactsErrMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyNameContactsErrMsg));
		return element;
	}

	public static WebElement CompanyNameContactsAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyNameContactsAlertMsg));
		return element;
	}

	public static WebElement CompanyFirstNameContactsFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyFirstNameContactsFeild));
		return element;
	}

	public static WebElement CompanyFirstNameContactsErrMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyFirstNameContactsErrMsg));
		return element;
	}

	public static WebElement CompanyFirstNameContactsAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyFirstNameContactsAlertMsg));
		return element;
	}

	public static WebElement CompanyLastNameContactsFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyLastNameContactsFeild));
		return element;
	}

	public static WebElement CompanyLastNameContactsErrMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyLastNameContactsErrMsg));
		return element;
	}

	public static WebElement CompanyLastNameContactsAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyLastNameContactsAlertMsg));
		return element;
	}

	public static WebElement EmailIdContactsFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailIdContactsFeild));
		return element;
	}

	public static WebElement EmailIdContactsErrMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailIdContactsErrMsg));
		return element;
	}

	public static WebElement EmailIdContactsAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailIdContactsAlertMsg));
		return element;
	}

	public static WebElement SaveBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtnContactsPage));
		return element;
	}

	public static WebElement SaveandCloseBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnContactsPage));
		return element;
	}

	public static WebElement SaveandContinueBtnContactsPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnContactsPage));
		return element;
	}

	// Project Administraction Acces

	static String AccessSwitchProjectAdministractionAccess = "//div[@id='uniform-cntrWorkSiteAddUpdateAdministrator_chkWorksiteAdminAccess']//div[@class='ios-ui-select checked' or 'ios-ui-select ']";
	static String DeleteBtnProjectAdministractionAccess = "//input[@id='cntrWorkSiteAddUpdateAdministrator_rptOtherNodeAdministrator_ctl00_hdnProjectAccessID']//../a//i";
	static String SaveandContinueBtnProjectAdministractionAccess = "//input[@id='cntrWorkSiteAddUpdateAdministrator_btnNextGeneralContractor']";
	static String SaveandCloseBtnProjectAdministractionAccess = "//input[@id='cntrWorkSiteAddUpdateAdministrator_btnSaveandClose']";
	static String BackBtnProjectAdministractionAccess = "//input[@id='cntrWorkSiteAddUpdateAdministrator_btnBackWorkSiteGeneralContractor']";

	public static WebElement AccessSwitchProjectAdministractionAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(AccessSwitchProjectAdministractionAccess));
		return element;
	}

	public static WebElement DeleteBtnProjectAdministractionAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtnProjectAdministractionAccess));
		return element;
	}

	public static WebElement SaveandContinueBtnProjectAdministractionAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnProjectAdministractionAccess));
		return element;
	}

	public static WebElement SaveandCloseBtnProjectAdministractionAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnProjectAdministractionAccess));
		return element;
	}

	public static WebElement BackBtnProjectAdministractionAccess(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnProjectAdministractionAccess));
		return element;
	}

	// Email Management

	static String SaveandContinueBtnEmailManagement = "//input[@id='cntrWorkSiteAddUpdateEmail_btnNextGeneralInfomation']";
	static String SaveandCloseBtnEmailManagement = "//input[@id='cntrWorkSiteAddUpdateEmail_btnSaveandCloseGeneralInformation']";
	static String SaveBtnEmailManagement = "//input[@id='cntrWorkSiteAddUpdateEmail_btnSaveGeneralInformation']";
	static String BackBtnEmailManagement = "//input[@id='cntrWorkSiteAddUpdateEmail_btnBackEmailManagement']";
	static String CloseBtnEmailManagement = "//button[@id='cntrWorkSiteAddUpdateEmail_btnClose']";
	static String EmailManagementSwitch = "//div[@id='uniform-cntrWorkSiteAddUpdateEmail_chkWorksiteEmailAccess']//div[@class]";

	public static WebElement SaveandContinueBtnEmailManagement(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnEmailManagement));
		return element;
	}

	public static WebElement SaveandCloseBtnEmailManagement(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnEmailManagement));
		return element;
	}

	public static WebElement SaveBtnEmailManagement(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtnEmailManagement));
		return element;
	}

	public static WebElement BackBtnEmailManagement(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnEmailManagement));
		return element;
	}

	public static WebElement CloseBtnEmailManagement(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnEmailManagement));
		return element;
	}

	public static WebElement EmailManagementSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailManagementSwitch));
		return element;
	}

	// Enrollment SetUp page

	static String BackBtnEnrollmentSetUp = "//input[@id='cntrWorkSiteRequiredDocument_btnBackWorkSiteRequiredDocument']";
	static String SaveandContinueBtnEnrollmentSetUp = "//input[@id='cntrWorkSiteRequiredDocument_btnNextWorkSiteRequiredDocument']";
	static String SaveandCloseBtnEnrollmentSetUP = "//input[@id='cntrWorkSiteRequiredDocument_btnSaveandClose']";
	static String CloseBtnEnrollmentSetUP = "//button[@id='cntrWorkSiteRequiredDocument_btnClose']";

	public static WebElement BackBtnEnrollmentSetUp(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnEnrollmentSetUp));
		return element;
	}

	public static WebElement SaveandContinueBtnEnrollmentSetUp(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnEnrollmentSetUp));
		return element;
	}

	public static WebElement SaveandCloseBtnEnrollmentSetUP(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnEnrollmentSetUP));
		return element;
	}

	public static WebElement CloseBtnEnrollmentSetUP(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnEnrollmentSetUP));
		return element;
	}

	// Pay Roll Page

	static String TrackCappedUncappedPayrollSwitch = "//div[@id='uniform-chkCapUnCapPayroll']//div";
	static String TrackpayrollforGLOnlySwitch = "//div[@id='uniform-chkTrackLiabilityPayroll']//div";
	static String TrackCappedUncappedPayrollAlertMsg = "//div[@id='CustomConfirmCappedModel']//div[2]/div";
	static String TrackCappedUncappedPayrollNOBtn = "//button[@id='btnNo']";
	static String TrackCappedUncappedPayrollOKBtn = "//button[@id='btnYes']";
	static String TrackGLpayrollAlertMsg = "//div[@id='CustomGLPayrollConfirmModel']//div[2]/div";
	static String TrackGLPayrollAlertContinueTurnONBtn = "//button[@id='btnGLPayrollContinue']";
	static String TrackGLPayrollAlertCloseBtn = "//button[@id='btnGLPayrollClose']";
	static String SaveandCloseBtnPayrollPage = "//input[@id='btnSaveandClose']";
	static String SaveandContinueBtnPayrollPage = "//input[@id='btnNextWorkSitePayrollTrack']";
	static String BackBtnPayrollPage = "//input[@id='btnBackWorkSitePayrollTrack']";
	static String CloseBtnPayrollPage = "//button[@id='divClose']";

	public static WebElement TrackCappedUncappedPayrollSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackCappedUncappedPayrollSwitch));
		return element;
	}

	public static WebElement TrackpayrollforGLOnlySwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackpayrollforGLOnlySwitch));
		return element;
	}

	public static WebElement TrackCappedUncappedPayrollAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackCappedUncappedPayrollAlertMsg));
		return element;
	}

	public static WebElement TrackCappedUncappedPayrollNOBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackCappedUncappedPayrollNOBtn));
		return element;
	}

	public static WebElement TrackCappedUncappedPayrollOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackCappedUncappedPayrollOKBtn));
		return element;
	}

	public static WebElement TrackGLpayrollAlertMsg(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackGLpayrollAlertMsg));
		return element;
	}

	public static WebElement TrackGLPayrollAlertContinueTurnONBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackGLPayrollAlertContinueTurnONBtn));
		return element;
	}

	public static WebElement SaveandCloseBtnPayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnPayrollPage));
		return element;
	}

	public static WebElement SaveandContinueBtnPayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnPayrollPage));
		return element;
	}

	public static WebElement BackBtnPayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnPayrollPage));
		return element;
	}

	public static WebElement TrackGLPayrollAlertCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TrackGLPayrollAlertCloseBtn));
		return element;
	}

	public static WebElement CloseBtnPayrollPage(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnPayrollPage));
		return element;
	}

	// Premium Modifications

	static String ModifiersPremModificationSwitch = "//div[@id='uniform-chkWorksitePremMod']//div";
	static String BackBtnPremiumModifications = "//input[@id='btnBackWorkSitePremiumMod']";
	static String SaveandCloseBtnPremiumModifications = "//input[@id='btnSaveandClose']";
	static String SaveandContinueBtnPremiumModifications = "//input[@id='btnNextWorkSitePremiumMod']";
	static String CloseBtnPremiumModifications = "//button[@id='divClose']";

	public static WebElement projectPremModificationSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnPayrollPage));
		return element;
	}

	public static WebElement ModifiersPremModificationSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(ModifiersPremModificationSwitch));
		return element;
	}

	public static WebElement SaveandCloseBtnPremiumModifications(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnPremiumModifications));
		return element;
	}

	public static WebElement SaveandContinueBtnPremiumModifications(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnPremiumModifications));
		return element;
	}

	public static WebElement CloseBtnPremiumModifications(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnPremiumModifications));
		return element;
	}

	// Non CIP Compliance

	static String EyeBtnNonCIPPage = "//td[@id='cntrWorkSiteCompliance_rptCompliance_ctl00_divWorkSiteDelete']//div//i";
	static String BackBtnNonCIPPage = "//input[@id='cntrWorkSiteCompliance_btnBack']";
	static String NextBtnNonCIPPage = "//input[@id='cntrWorkSiteCompliance_btnNext']";
	static String CloseBtnNonCIPPage = "//button[@id='cntrWorkSiteCompliance_btnClose']";

	public static WebElement EyeBtnNonCIPPage(WebDriver driver) {
		element = driver.findElement(By.xpath(EyeBtnNonCIPPage));
		return element;
	}

	public static WebElement BackBtnNonCIPPage(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnNonCIPPage));
		return element;
	}

	public static WebElement NextBtnNonCIPPage(WebDriver driver) {
		element = driver.findElement(By.xpath(NextBtnNonCIPPage));
		return element;
	}

	public static WebElement CloseBtnNonCIPPage(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnNonCIPPage));
		return element;
	}

	// Policy Certificates

	static String ExcessUmbrellaPolicyEditBtnPolicyandCertifcates = "//div[@id='cntrWorkSiteCertificates_divExcessUmbrellaLiability']//i[@class='fa fa-pencil-square-o']";
	static String ExcessUmbrellaPolicyDeleteBtnPolicyandCertifcates = "//div[@id='cntrWorkSiteCertificates_divExcessUmbrellaLiability']//i[@class='fa fa-trash-o']";
    static String AutomobilePolicyEditBtnPolicyandCertifcates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[1]//i[@class='fa fa-pencil-square-o']";
    static String AutomobilePolicyDeleteBtnPolicyandCertifcates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[1]//i[@class='fa fa-trash-o']";
    static String BuildersRiskPolicyEditBtnPolicyandCertifcates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[2]//i[@class='fa fa-pencil-square-o']";
    static String BuildersRiskPolicyDeleteBtnPolicyandcertifcates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[2]//i[@class='fa fa-trash-o']";
    static String PollutionLiabitlyPolicyEditBtnPolicyCertificates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[3]//i[@class='fa fa-pencil-square-o']";
    static String PollutionLiabilityPolicyDeleteBtnPolicyCertificates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[3]//i[@class='fa fa-trash-o']";
    static String ProfessionLiabiltyDeleteBtnPolicycertificates="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[4]//i[@class='fa fa-trash-o']"	;
    static String ProfessionLiabiltyEditBtnPolicycertificates ="//div[@id='cntrWorkSiteCertificates_DivOtherPolicy']//tbody//tr[4]//i[@class='fa fa-pencil-square-o']";
    static String PreviewCertificatesBtnPolicyCertificates="//a[@id='cntrWorkSiteCertificates_aPreviewCertificate']";
    static String SaveandCloseBtnPolicyCertificates="//input[@id='cntrWorkSiteCertificates_btnSaveandClose']";
    static String SaveandContinueBtnPolicyandCertificates="//input[@id='cntrWorkSiteCertificates_btnSaveandContinue']";
    static String BackBtnPolicyCertifcates="//input[@id='cntrWorkSiteCertificates_btnBackWorkSiteGeneralContractor']";
    static String CloseBtnPolicyCertificates="//button[@id='cntrWorkSiteCertificates_btnClose']";
    
    public static WebElement ExcessUmbrellaPolicyEditBtnPolicyandCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(ExcessUmbrellaPolicyEditBtnPolicyandCertifcates));
		return element;
	}
    public static WebElement ExcessUmbrellaPolicyDeleteBtnPolicyandCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(ExcessUmbrellaPolicyDeleteBtnPolicyandCertifcates));
		return element;
	}
    public static WebElement AutomobilePolicyEditBtnPolicyandCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(AutomobilePolicyEditBtnPolicyandCertifcates));
		return element;
	}
    public static WebElement AutomobilePolicyDeleteBtnPolicyandCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(AutomobilePolicyDeleteBtnPolicyandCertifcates));
		return element;
	}
    public static WebElement BuildersRiskPolicyEditBtnPolicyandCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(BuildersRiskPolicyEditBtnPolicyandCertifcates));
		return element;
	}
    public static WebElement BuildersRiskPolicyDeleteBtnPolicyandcertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(BuildersRiskPolicyDeleteBtnPolicyandcertifcates));
		return element;
	}
    public static WebElement PollutionLiabitlyPolicyEditBtnPolicyCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(PollutionLiabitlyPolicyEditBtnPolicyCertificates));
		return element;
	}
    public static WebElement PollutionLiabilityPolicyDeleteBtnPolicyCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(PollutionLiabilityPolicyDeleteBtnPolicyCertificates));
		return element;
	}
    public static WebElement ProfessionLiabiltyDeleteBtnPolicycertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfessionLiabiltyDeleteBtnPolicycertificates));
		return element;
	}
    public static WebElement ProfessionLiabiltyEditBtnPolicycertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfessionLiabiltyEditBtnPolicycertificates));
		return element;
	}
    public static WebElement CloseBtnPolicyCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnPolicyCertificates));
		return element;
	}
    
    public static WebElement SaveandCloseBtnPolicyCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnPolicyCertificates));
		return element;
	}
    public static WebElement SaveandContinueBtnPolicyandCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueBtnPolicyandCertificates));
		return element;
	}
    public static WebElement BackBtnPolicyCertifcates(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnPolicyCertifcates));
		return element;
	}
    
    public static WebElement PreviewCertificatesBtnPolicyCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(PreviewCertificatesBtnPolicyCertificates));
		return element;
	}
    
    
    
    // Excesss Umbrella Policy certifcate page of policy liability
    
    static String SelectCarrierExcessUmbrellaPolicy ="//select[@id='ctrlEULPolicy_ddlCarrier']";
    static String SelectLayerExcessUmbrellaPolicy="//select[@id='ctrlEULPolicy_ddlLayer']";
    static String PolicyEffectiveDateExcessUmbrellaPolicy="//input[@id='ctrlEULPolicy_txtPolicyEffectiveDate1']";
    static String PolicyExpiryDateExcessUmbrellaPolicy="//input[@id='ctrlEULPolicy_txtPolicyExpirationDate1']";
    static String SaveandCloseBtnExcessUmbrellaPolicy="//input[@id='ctrlEULPolicy_btnSaveandClose']";
    static String SaveBtnExcessUmbrellaPolicy ="//input[@id='ctrlEULPolicy_btnSave']";
    static String CloseBtnExcessUmbrellaPolicy ="//input[@id='ctrlEULPolicy_hdnSaveExtendedPolicyDate']/..//button[1]";
    static String SelectCarrierErrMsgExcessUmbrellaPolicy="//span[@id='ctrlEULPolicy_rfvCarrier']";
    static String SelectLayerErrMsgExcessUmbrellaPolicy="//span[@id='ctrlEULPolicy_RequiredFieldValidator1']";
    static String PolicyEffectiveDateErrMsgExcessUmbrellaPolicy="//label[@for='ctrlEULPolicy_txtPolicyEffectiveDate1']";
    static String PolicyExpiryDateErrMsgExcessUmbrellaPolicy="//label[@for='ctrlEULPolicy_txtPolicyExpirationDate1']";
    static String PolicyExpiryDateonEffectivedateExcessUmbrellaPolicy="//label[@for='ctrlEULPolicy_txtPolicyExpirationDate1']";
    
    public static WebElement SelectCarrierExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectCarrierExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement SelectLayerExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectLayerExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement PolicyEffectiveDateExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyEffectiveDateExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement PolicyExpiryDateExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDateExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement SaveandCloseBtnExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement SelectCarrierErrMsgExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectCarrierErrMsgExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement CloseBtnExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement SaveBtnExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtnExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement SelectLayerErrMsgExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectLayerErrMsgExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement PolicyEffectiveDateErrMsgExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyEffectiveDateErrMsgExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement PolicyExpiryDateErrMsgExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDateErrMsgExcessUmbrellaPolicy));
		return element;
	}
    public static WebElement PolicyExpiryDateonEffectivedateExcessUmbrellaPolicy(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDateonEffectivedateExcessUmbrellaPolicy));
		return element;
	}
    
    // CHange Orders
    
    static String EditBtnChangeOrder="//a[@id='ctrlModuleChangeOrder_rptChangeOrder_ctl00_lnkEdit']//i[@class='fa fa-pencil-square-o']";
    static String DeleteBtnChangeOrder="//a[@id='ctrlModuleChangeOrder_rptChangeOrder_ctl00_lnkDelete']//i[@class='fa fa-trash-o']";
    static String AdditionalContractValueChangeOrder="//input[@id='ctrlModuleChangeOrder_txtContractPriceValue']";
    static String EstimatedCompletionDateChangeOrder="//input[@id='ctrlModuleChangeOrder_txtCompletionDate']";
    static String EstimatedCompletionDateErrMsgChangeOrder="//label[@for='ctrlModuleChangeOrder_txtCompletionDate']";
    static String DescriptionChnageOrder="//textarea[@id='ctrlModuleChangeOrder_txtDescription']";
    static String DescriptionErrMsgChangeOrder="//label[@for='ctrlModuleChangeOrder_txtDescription']";
    static String SaveandCloseBtnChangeOrder="//input[@id='ctrlModuleChangeOrder_btnSaveandClose']";
    static String CloseBtnChangeOrder="//button[@id='btnCloseAdd']";
    static String FinishandCloseBtnChangeOrder="//button[@id='btnSaveClose']";
    static String BackBtnChnageOrder="//input[@id='ctrlModuleChangeOrder_btnBackWorkSiteChangeorder']";
    
    
    
    public static WebElement FinishandCloseBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(FinishandCloseBtnChangeOrder));
		return element;
	}
    public static WebElement BackBtnChnageOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnChnageOrder));
		return element;
	}
    public static WebElement EditBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBtnChangeOrder));
		return element;
	}
    public static WebElement DeleteBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtnChangeOrder));
		return element;
	}
    public static WebElement AdditionalContractValueChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(AdditionalContractValueChangeOrder));
		return element;
	}
    public static WebElement EstimatedCompletionDateChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedCompletionDateChangeOrder));
		return element;
	}
    public static WebElement EstimatedCompletionDateErrMsgChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedCompletionDateErrMsgChangeOrder));
		return element;
	}
    public static WebElement DescriptionChnageOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(DescriptionChnageOrder));
		return element;
	}
    public static WebElement DescriptionErrMsgChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(DescriptionErrMsgChangeOrder));
		return element;
	}
    public static WebElement SaveandCloseBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtnChangeOrder));
		return element;
	}
    public static WebElement CloseBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnChangeOrder));
		return element;
	}
    
 // New Functionality 
    
    
    //Project Settings page
	
 	static String SaveandContinueProjectSettings= "//input[@id='btnNextProjectSettings']";
 	static String SaveandcloseProjectSettings = "//input[@id='btnSaveandCloseWorkSiteSettings']";
 	static String BackBtnProjectSettings ="//input[@id='btnBackWorkSiteSettings']";
 	static String CloseBtnProjectSettings ="//button[@class='btn']";
 	static String DocumentUploadforCompletionNoticeSubmission ="//div[@id='uniform-chkDocumentUploadForCompletionNoticeSub']//div[@class='ios-ui-select' or 'ios-ui-select checked']";
    static String DocumentUploadforCompletionNoticeSubmissionToolTip ="//i[@class='font20 i-info']";
    
    
    
    public static WebElement SaveandContinueProjectSettings(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandContinueProjectSettings));
		return element;
	}
    public static WebElement SaveandcloseProjectSettings(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandcloseProjectSettings));
		return element;
	}
    public static WebElement BackBtnProjectSettings(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtnProjectSettings));
		return element;
	}
    public static WebElement CloseBtnProjectSettings(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtnProjectSettings));
		return element;
	}
    public static WebElement DocumentUploadforCompletionNoticeSubmission(WebDriver driver) {
		element = driver.findElement(By.xpath(DocumentUploadforCompletionNoticeSubmission));
		return element;
	}
    public static WebElement DocumentUploadforCompletionNoticeSubmissionToolTip(WebDriver driver) {
		element = driver.findElement(By.xpath(DocumentUploadforCompletionNoticeSubmissionToolTip));
		return element;
	}

}
