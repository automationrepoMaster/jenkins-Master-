package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddContractorPage {
	private static WebElement element;
	private static List<WebElement> listElement;

	// General Information tab xpaths
	static String addContractorCompanyNameField = "//input[@name='txtCompany']";
	static String addContractorFEINField = "#txtFEIN";
	static String addContractorLegalStatusField = "#ddlLegalStatus";// dropdown
	static String addContractorCompayGroupField = "#ddlCompanyGroup";// dropdown
	static String addContractorDBAField = "#txtDBACompany";
	static String addContractorLicenseNoField = "#txtLicenseCompany";
	static String addContractorExtaDBA_Btn = "//button[@class='add_field_button btn btn-success marg-right-5']";
	static String addContractorExtaDBA_Field = "//div[@class='row marg-top-10 divNewCompanyDBA']//input[@id='txtDBACompany']";

	static String addContractorContactTypeField = "//select[@id='ddlContactType']";// dropdown
	static String addContractorFirstNameField = "#txtFirstName";
	static String addContractorMiddleNameField = "#txtMiddleName";
	static String addContractorLastNameField = "#txtLastName";
	static String addContractorJobTitleField = "#txtJobTitle";
	static String addContractorPhoneNoField = "#txtPhone";
	static String addContractorMobileNoField = "#txtMobile";
	static String addContractorFaxField = "#txtFax";
	static String addContractorEmailField = "#txtEmail";
	static String addContractorSaveBtn = "//div[@class='fright']//button[1]";
	static String addContractorSaveAndCloseBtn = "//div[@class='fright']//button[2]";
	static String addContractorSaveAndContinueBtn = "//div[@class='fright']//button[3]";
	static String alertOKBtnSameComapnyName = "//button[text()='OK']";

	// address tab xapths
	static String addContractorAddressTab = "#ctrlUserAddUpdate_aAddress";// css
	static String addContractorAddAddressBtn = "//a[@data-original-title='Add Address']";
	// address tab save buttons

	static String addContractorAddressTabSaveBtn = "//input[@value='Save']";
	static String addContractorAddressTabSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addContractorAddressTabSaveAndContinueBtn = "//input[@value='Save and Continue']";
	// add address fields
	static String addContractorAddAddressSelectAddressType = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";
	static String addContractorAddAddressAddress1Field = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String addContractorAddAddressCityField = "//input[@id='cntrAddressAddUpdate_txtCity']";
	static String addContractorAddAddressSelectState = "//select[@id='cntrAddressAddUpdate_ddlState']";// dropdown
	static String addContractorAddAddressZipCode = "//input[@id='cntrAddressAddUpdate_txtZipCode']";
	// add address save buttons
	static String addContractorAddAddressSaveBtn = "//input[@value='Save']";
	static String addContractorAddAddressSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addContractorAddAddressCloseBtn = "//button[@id='cntrAddressAddUpdate_btnClose']";
	// contacts tab xpaths
	static String addContractorContactsTab = "//a[text()='Contacts']";
	static String addContractorContactsTabFinishAndCloseBtn = "//input[@value='Finish and Close']";
	static String addContractorContactsTabBackBtn = "//input[@value='Back']";
	static String addContractorContactsCloseBtn = "//button[@class='btn']";
	// Contractor Request From Contractor Portal Tab
	static String addContractorRequestFromContractorPortalTab = "//a[text()='Request from Contractor Portal']";
	static String addContractorRequestFromContractorPortalTabCloseBtn = "//button[@id='ctrlContractorRequestList_btnClose']";

	// static methods of each elements
	public static WebElement addContractorCompanyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorCompanyNameField));
		return element;
	}

	public static WebElement alertOKBtnSameComapnyName(WebDriver driver) {
		element = driver.findElement(By.xpath(alertOKBtnSameComapnyName));
		return element;
	}

	public static WebElement addContractorFEINField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorFEINField));
		return element;
	}

	public static WebElement addContractorLegalStatus(WebDriver driver, int index) {
		element = driver.findElement(By.cssSelector(addContractorLegalStatusField));
		Select select = new Select(element);
		select.selectByIndex(index);
		return element;
	}

	public static WebElement addContractorCompayGroupField(WebDriver driver, String status) {
		element = driver.findElement(By.cssSelector(addContractorCompayGroupField));
		Select select = new Select(element);
		select.selectByVisibleText(status);
		return element;
	}

	public static WebElement addContractorDBAField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorDBAField));
		return element;
	}

	public static WebElement addContractorExtaDBA_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorExtaDBA_Btn));
		return element;
	}

	public static WebElement addContractorExtaDBA_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorExtaDBA_Field));
		return element;
	}

	public static WebElement addContractorLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorLicenseNoField));
		return element;
	}

	public static WebElement addContractorContactTypeField(WebDriver driver, int index) {
		element = driver.findElement(By.xpath(addContractorContactTypeField));
		Select select = new Select(element);
		select.selectByIndex(index);
		return element;
	}

	public static WebElement addContractorFirstNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorFirstNameField));
		return element;
	}

	public static WebElement addContractorMiddleNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorMiddleNameField));
		return element;
	}

	public static WebElement addContractorLastNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorLastNameField));
		return element;
	}

	public static WebElement addContractorJobTitleField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorJobTitleField));
		return element;
	}

	public static WebElement addContractorPhoneNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorPhoneNoField));
		return element;
	}

	public static WebElement addContractorMobileNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorMobileNoField));
		return element;
	}

	public static WebElement addContractorFaxField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorFaxField));
		return element;
	}

	public static WebElement addContractorEmailField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorEmailField));
		return element;
	}

	public static WebElement addContractorSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorSaveBtn));
		return element;
	}

	public static WebElement addContractorSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorSaveAndCloseBtn));
		return element;
	}

	public static WebElement addContractorSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorSaveAndContinueBtn));
		return element;
	}

	public static WebElement addContractoraddressTab(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addContractorAddressTab));
		return element;
	}

	public static WebElement addContractorAddAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressBtn));
		return element;
	}

	public static WebElement addContractorAddressTabSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddressTabSaveBtn));
		return element;
	}

	public static WebElement addContractorAddressTabSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddressTabSaveAndCloseBtn));
		return element;
	}

	public static WebElement addContractorAddressTabSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddressTabSaveAndContinueBtn));
		return element;
	}

	public static WebElement addContractorAddAddressSelectAddressType(WebDriver driver, String selectAddressType) {
		element = driver.findElement(By.xpath(addContractorAddAddressSelectAddressType));
		Select select = new Select(element);
		select.selectByVisibleText(selectAddressType);
		return element;
	}

	public static WebElement addContractorAddAddressAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressAddress1Field));
		return element;
	}

	public static WebElement addContractorAddAddressCityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressCityField));
		return element;
	}

	public static WebElement addContractorAddAddressSelectState(WebDriver driver, String selectState) {
		element = driver.findElement(By.xpath(addContractorAddAddressSelectState));
		Select select = new Select(element);
		select.selectByVisibleText(selectState);
		return element;
	}

	public static WebElement addContractorAddAddressZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressZipCode));
		return element;
	}

	public static WebElement addContractorAddAddressSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressSaveBtn));
		return element;
	}

	public static WebElement addContractorAddAddressSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressSaveAndCloseBtn));
		return element;
	}

	public static WebElement addContractorAddAddressCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorAddAddressCloseBtn));
		return element;
	}

	public static WebElement addContractorContactsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorContactsTab));
		return element;
	}

	public static WebElement addContractorContactsTabFinishAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorContactsTabFinishAndCloseBtn));
		return element;
	}

	public static WebElement addContractorContactsTabBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorContactsTabBackBtn));
		return element;
	}

	public static WebElement addContractorContactsCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorContactsCloseBtn));
		return element;
	}

	public static WebElement addContractorRequestFromContractorPortalTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorRequestFromContractorPortalTab));
		return element;
	}

	public static WebElement addContractorRequestFromContractorPortalTabCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorRequestFromContractorPortalTabCloseBtn));
		return element;
	}

	// Raja wrote this for contractor merging

	static String contractorsIcon = "//span[@id='ctl00_ContentPlaceHolder1_spnContractor']";
	static String ContractorsAddIcon  ="//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liadd']/a/i";
	static String ContractorsEditicon ="//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_liedit']/a/i";
	static String ContractorsDeleteIcon ="//li[@id='ctl00_ContentPlaceHolder1_ctrlUserList_lidelete']/a/i";
	static String contractors_Merge_SearchIcon = "//input[@id='ctl00_ContentPlaceHolder1_ctrlUserList_txtSearch']";
	static String Contractors_ContractorsList = "//ul[@class='userListing subListing']/li/../..//ul[@class='ContactPreview']/li[*]";
	static String contractors_Merge_frame = "//iframe[@id='ifrmPreview']";
	static String MergeFrameComapany = "//a[@id='ctrlContractorsPreview_aMerge']/i[@class='fa fa-compress']";
	static String contractors_Merge_SearchCompany_Feild = "//input[@id='token-input-ctrlMergeCompany_txtSubCompanyName']";
	static String contractors_Merge_Contact1_ChkBox = "//input[@id='ctrlMergeContact_rptContact_ctl00_chkUser']";
	static String contractors_Merge_Contact2_ChkBox = "//input[@id='ctrlMergeContact_rptContact_ctl01_chkUser']";
	static String contractors_Merge_ContinueToMergeBtn = "//a[@id='ctrlMergeContact_lnkYes']";

	public static WebElement ContractorsAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsAddIcon));
		return element;
	}
	public static WebElement ContractorsEditicon(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsEditicon));
		return element;
	}
	public static WebElement ContractorsDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsDeleteIcon));
		return element;
	}
	
	public static WebElement contractors_Merge_ContinueToMergeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContinueToMergeBtn));
		return element;
	}

	public static WebElement MergeFrameComapany(WebDriver driver) {
		element = driver.findElement(By.xpath(MergeFrameComapany));
		return element;
	}

	public static WebElement contractors_Merge_SearchCompany_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SearchCompany_Feild));
		return element;
	}

	public static WebElement contractors_Merge_Contact2_ChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_Contact2_ChkBox));
		return element;
	}

	public static WebElement contractors_Merge_Contact1_ChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_Contact1_ChkBox));
		return element;
	}

	static String contractors_Merge_FirstNameRadioBtn1 = "//li[@class='liFirstName clearfix']//div/span[@class='rdoFirstName']/div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_rdoFirstName']/span";
	static String contractors_Merge_FirstNameRadioBtn2 = "//li[@class='liFirstName clearfix']//div/span[@class='rdoFirstName']/div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_rdoFirstName']/span";
	static String contractors_Merge_MiddleNameRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoMiddleName']/..";
	static String contractors_Merge_MiddleNameRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoMiddleName']/..";
	static String contractors_Merge_LastNameRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoLastName']/..";
	static String contractors_Merge_LastNameRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoLastName']/..";
	static String contractors_Merge_DsiplayAsRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoDisplayAs']/..";
	static String contractors_Merge_DisplayAsRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoDisplayAs']/..";
	static String contractors_Merge_JobTitleRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoJobTitle']/..";
	static String contractors_Merge_JobTitleRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoJobTitle']/..";
	static String contractors_Merge_AddressRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoAddress']/..";
	static String contractors_Merge_AddressRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoAddress']/..";
	static String contractors_Merge_LogoRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoProfilePic']/..";
	static String contractors_Merge_LogoRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoProfilePic']/..";
	static String contractors_Merge_AddImage1 = "//img[@id='ctrlMergeContactList_rptContactList_ctl00_imgLogo']/..";
	static String contractors_Merge_AddImage2 = "//img[@id='ctrlMergeContactList_rptContactList_ctl01_imgLogo']/..";
	static String contractors_Merge_NoteRadioBtn1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoUserNotes']/..";
	static String contractors_Merge_NoteRadioBtn2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rdoUserNotes']/..";
	static String contractors_Merge_PhoneRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_chkPhone']/span";
	static String contractors_Merge_PhoneRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_chkPhone']/span";
	static String contractors_Merge_MobileRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_chkCell']/span";
	static String contractors_Merge_MobileRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_chkCell']/span";
	static String contractors_Merge_FaxRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_chkFax']/span";
	static String contractors_Merge_FaxRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_chkFax']/span";
	static String contractors_Merge_FaxTypeRadioBtn1 = "uniform-ctrlMergeContactList_rptContactList_ctl00_rptCompanyFax_ctl00_chkFax";
	static String contractors_Merge_FaxTypeRadioBtn2 = "uniform-ctrlMergeContactList_rptContactList_ctl01_rptCompanyFax_ctl00_chkFax";
	static String contractors_Merge_EmailRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_rdoEmail']/span";
	static String contractors_Merge_EmailRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_rdoEmail']/span";
	static String contractors_Merge_ContactTypeRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_chkContactType']/span";
	static String contractors_Merge_ContactTypeRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01	_chkContactType']/span";
	static String contractors_Merge_UsernameRadioBtn1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_rdoUserName']";
	static String contractors_Merge_UsernameRadioBtn2 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl01_rdoUserName']";
	static String contractors_Merge_EnrollmentAdminChkBox = "//div[@id='uniform-ctrlMergeContactList_chkEnrollmentAdmin']";
	static String contractors_Merge_PasswordFeild = "//input[@id='ctrlMergeContactList_txtPassword']";
	static String contractors_Merge_ReEnterPassword_Feild = "//input[@id='ctrlMergeContactList_txtReconfirmPassword']";

	public static WebElement contractors_Merge_FirstNameRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FirstNameRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_FirstNameRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FirstNameRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_MiddleNameRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MiddleNameRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_MiddleNameRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MiddleNameRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_LastNameRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LastNameRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_LastNameRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LastNameRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_DsiplayAsRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_DsiplayAsRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_DsiplayAsRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_DisplayAsRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_JobTitleRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_JobTitleRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_JobTitleRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_JobTitleRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_AddressRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_AddressRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_AddressRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_AddressRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_LogoRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LogoRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_LogoRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LogoRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_AddImage1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_AddImage1));
		return element;
	}

	public static WebElement contractors_Merge_AddImage2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_AddImage2));
		return element;
	}

	public static WebElement contractors_Merge_NoteRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_NoteRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_NoteRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_NoteRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_PhoneRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_PhoneRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_PhoneRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_PhoneRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_MobileRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MobileRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_MobileRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MobileRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_FaxRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FaxRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_FaxRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FaxRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_FaxTypeRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FaxTypeRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_FaxTypeRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FaxTypeRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_EmailRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_EmailRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_EmailRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_EmailRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_ContactTypeRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContactTypeRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_ContactTypeRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContactTypeRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_UsernameRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_UsernameRadioBtn1));
		return element;
	}

	public static WebElement contractors_Merge_UsernameRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_UsernameRadioBtn2));
		return element;
	}

	public static WebElement contractors_Merge_EnrollmentAdminChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_EnrollmentAdminChkBox));
		return element;
	}

	public static WebElement contractors_Merge_PasswordFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_PasswordFeild));
		return element;
	}

	public static WebElement contractors_Merge_ReEnterPassword_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ReEnterPassword_Feild));
		return element;
	}

	// Text Feilds

	static String contractors_Merge_FirnameTextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtFirstName']";
	static String contractors_Merge_FirnameTextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtFirstName']";
	static String contractors_Merge_MiddleNameTextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtMiddleName']";
	static String contractors_Merge_MiddleNameTextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtMiddleName']";
	static String contractors_Merge_LastNameTextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtLastName']";
	static String contractors_Merge_LastNameTextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtLastName']";
	static String contractors_Merge_DisplayAsTextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtDisplayAs']";
	static String contractors_Merge_DisplayAsTextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtDisplayAs']";
	static String contractors_Merge_JobTitle_TextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtJobTitle']";
	static String contractors_Merge_JobTitle_TextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtJobTitle']";
	static String contractors_Merge_SelectAddressType1 = "//select[@id='ctrlMergeContactList_rptContactList_ctl00_ddlAddress']";
	static String contractors_Merge_SelectAddressType2 = "//select[@id='ctrlMergeContactList_rptContactList_ctl01_ddlAddress']";
	static String contractors_Merge_NoteTextFeild_1 = "//textarea[@id='ctrlMergeContactList_rptContactList_ctl00_txtUserNotes']";
	static String contractors_Merge_NoteTextFeild_2 = "//textarea[@id='ctrlMergeContactList_rptContactList_ctl01_txtUserNotes']";
	static String contractors_Merge_PhoneTextFeild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtPhone']";
	static String contractors_Merge_PhoneTextFeild_2 = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_txtPhone']";
	static String contractors_Merge_MobileTextFeild_1 = "/input[@id='ctrlMergeContactList_rptContactList_ctl00_txtMobile']";
	static String contractors_Merge_MobileTextFeild_2 = "/input[@id='ctrlMergeContactList_rptContactList_ctl00_txtMobile']";
	static String contractors_Merge_SelectFaxTypeDropDown1 = "//select[@id='ctrlMergeContactList_rptContactList_ctl00_rptCompanyFax_ctl00_ddlContactType']";
	static String contractors_Merge_SelectFaxTypeDropDown2 = "//select[@id='ctrlMergeContactList_rptContactList_ctl01_rptCompanyFax_ctl00_ddlContactType']";
	static String contractors_Merge_SelectFaxTypeDropDown2_Text_Feild = "//input[@id='ctrlMergeContactList_rptContactList_ctl01_rptCompanyFax_ctl00_txtFax']";
	static String contractors_Merge_SelectFaxTypeDropDown1_Text_Feild = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rptCompanyFax_ctl00_txtFax']";
	static String contractors_Merge_ContractTypeDropDown1 = "//div[@id='s2id_ctrlMergeContactList_rptContactList_ctl00_lbContactType']/ul[@class='select2-choices']";
	static String contractors_Merge_ContracTTypeDropDown2 = "//div[@id='s2id_ctrlMergeContactList_rptContactList_ctl01_lbContactType']/ul[@class='select2-choices']";
	static String contractors_Merge_ContracTTypeDropDown_List1 = "//div[@class='select2-drop select2-drop-multi select2-display-none select2-drop-active select2-drop-above']/ul/li";
	static String contractors_Merge_ContracTTypeDropDown_List2 = "//div[@class='select2-drop select2-drop-multi select2-display-none select2-drop-active']/ul/li";
	static String contractors_Merge_YesIconfirmYesBtn = "//a[@id='ctrlMergeCompanyConfirm_lnkYes']";//a[@id='ctrlMergeCompany_lnkYes']
	static String contractors_Merge_BackBtn = "//button[@class='btn btn-border pull-left marg-right-24' and contains(text(),'Go Back')]";

	public static WebElement contractors_Merge_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_BackBtn));
		return element;
	}

	public static WebElement contractors_Merge_YesIconfirmYesBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_YesIconfirmYesBtn));
		return element;
	}

	public static WebElement contractors_Merge_ContractTypeDropDown1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContractTypeDropDown1));
		return element;
	}

	public static WebElement contractors_Merge_ContracTTypeDropDown2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContracTTypeDropDown2));
		return element;
	}

	public static List<WebElement> contractors_Merge_ContracTTypeDropDownn_List1(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractors_Merge_ContracTTypeDropDown_List1));
		return listElement;
	}

	public static List<WebElement> contractors_Merge_ContracTTypeDropDown_List2(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractors_Merge_ContracTTypeDropDown_List2));
		return listElement;
	}

	public static WebElement contractors_Merge_SelectFaxTypeDropDown1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectFaxTypeDropDown1));
		return element;
	}

	public static WebElement contractors_Merge_SelectFaxTypeDropDown2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectFaxTypeDropDown2));
		return element;
	}

	public static WebElement contractors_Merge_SelectFaxTypeDropDown2_Text_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectFaxTypeDropDown2_Text_Feild));
		return element;
	}

	public static WebElement contractors_Merge_SelectFaxTypeDropDown1_Text_Feild(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectFaxTypeDropDown1_Text_Feild));
		return element;
	}

	public static WebElement contractors_Merge_FirnameTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FirnameTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_FirnameTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_FirnameTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_MiddleNameTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MiddleNameTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_MiddleNameTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MiddleNameTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_LastNameTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LastNameTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_LastNameTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_LastNameTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_DisplayAsTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_DisplayAsTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_DisplayAsTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_DisplayAsTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_JobTitle_TextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_JobTitle_TextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_JobTitle_TextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_JobTitle_TextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_SelectAddressType1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectAddressType1));
		return element;
	}

	public static WebElement contractors_Merge_SelectAddressType2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SelectAddressType2));
		return element;
	}

	public static WebElement contractors_Merge_NoteTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_NoteTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_NoteTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_NoteTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_PhoneTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_PhoneTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_PhoneTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_PhoneTextFeild_2));
		return element;
	}

	public static WebElement contractors_Merge_MobileTextFeild_1(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MobileTextFeild_1));
		return element;
	}

	public static WebElement contractors_Merge_MobileTextFeild_2(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MobileTextFeild_2));
		return element;
	}
 
	static String contractors_Merge_MergeContact = "//a[@id='ctrlContractorsPreview_aMerge']";
	static String contractors_Merge_StartOver_RadioBtn = "//input[@id='ctrlCompanyMerge_rdbStartOver']";
	static String contractors_Merge_Continue_RadioBtn = "//input[@id='ctrlCompanyMerge_rdbContinue']";
	static String contractors_Merge_CloseBtn = "//button[@id='btnClose']";
	static String contractors_Merge_CancelBtn = "//button[@id='ctrlCompanyMerge_btnCancel']";
	static String contractors_Merge_NextBtn = "//input[@id='ctrlMergeCompany_btnNext']";// input[@id='ctrlMergeCompany_btnNext']
	static String contractors_Merge_panelHeading = "//div[@class]/div[@class='icon1']";
	static String contractors_Merge_startOverRadioBtn_Txtdown = "//span[contains(text(),'Start the Merge Company process over from the begi')]";
	static String contractors_Merge_StartOverRadioBtn_Txt = "//label[contains(text(),'Start Over')]";
	static String contractors_Merge_ContinueRadioBtn_Txt = "//label[contains(text(),'Continue')]";
	static String contractors_Merge_ContinueRadioBtn_Txtdown = "//span[@id='ctrlCompanyMerge_lblContinueMessage']";
	static String Contractors_merge_EliminateDuplicates_Text = "//div[contains(text(),'Eliminate duplicates in the system by combining th')]";
	static String Contractors_merge_WhichContactsdoyouwanttomergewith_Chk_Boxes = "//div[@class='roudedBoxRadius']//ul/li//input[@class='chkUser']";
	static String Contractors_merge_GoBackBtn = "//input[@id='ctrlMergeContactList_btnBack']";
//	static String Contractors_merge_FirstName_txt_feild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtFirstName']";
//	static String Contractors_merge_FirstName_RadioBtn_1 = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_rdoFirstName']";
//	static String Contractors_merge_MiddleName_RadioBtn_1 = "//span//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoMiddleName']";
//	static String Contractors_merge_MiddleName_txt_feild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtMiddleName']";
//	static String Contractors_merge_LastName_txt_feild_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtLastName']";
//	static String Contractors_merge_LastName_RadioBtn_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoLastName']";
//	static String Contractors_merge_Email_txt_feild = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_txtEmail']";
//	static String Contractors_merge_Email_RadioBtn_1 = "//input[@id='ctrlMergeContactList_rptContactList_ctl00_rdoEmail']";
//	static String Contractors_merge_ContactType_List = "//div[@id='select2-drop']//ul/li";
//	static String Contractors_merge_ContactType_SearchBar = "//div[@id='s2id_ctrlMergeContactList_rptContactList_ctl00_lbContactType']";
//	static String Contractors_merge_ContactType_Chk_Box = "//div[@id='uniform-ctrlMergeContactList_rptContactList_ctl00_chkContactType']";
//	static String Contractors_merge_ContactType_Enrollment_Admin_ChkBox = "//div[@id='uniform-ctrlMergeContactList_chkEnrollmentAdmin']";

	static String Contractors_merge_ContactType_ContinuetoMergeBtn = "//button[@id='btnSave']";
	static String CompleteMerge_Btn = "//input[@id='ctrlMergeContactConfirm_btnCompleteMerge']";
	static String AlertMsg_CompleteMerge_Btn = "//div[@class='noteText']";
	static String Contractors_merge_CompanyMergeNextBt="//input[@id='ctrlCompanyMerge_btnNext']";

	public static WebElement Contractors_merge_CompanyMergeNextBt(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractors_merge_CompanyMergeNextBt));
		return element;
	}
	
	public static WebElement contractorsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorsIcon));
		return element;
	}

	public static List<WebElement> Contractors_ContractorsList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Contractors_ContractorsList));
		return listElement;
	}

	public static WebElement contractors_Merge_SearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_SearchIcon));
		return element;
	}

	public static WebElement contractors_Merge_frame(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_frame));
		return element;
	}

	public static WebElement contractors_Merge_MergeContact(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_MergeContact));
		return element;
	}

	public static WebElement contractors_Merge_StartOver_RadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_StartOver_RadioBtn));
		return element;
	}

	public static WebElement contractors_Merge_Continue_RadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_Continue_RadioBtn));
		return element;
	}

	public static WebElement contractors_Merge_CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_CloseBtn));
		return element;
	}

	public static WebElement contractors_Merge_CancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_CancelBtn));
		return element;
	}

	public static WebElement contractors_Merge_NextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_NextBtn));
		return element;
	}

	public static WebElement contractors_Merge_panelHeading(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_panelHeading));
		return element;
	}

	public static WebElement contractors_Merge_startOverRadioBtn_Txtdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_startOverRadioBtn_Txtdown));
		return element;
	}

	public static WebElement contractors_Merge_StartOverRadioBtn_Txt(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_StartOverRadioBtn_Txt));
		return element;
	}

	public static WebElement contractors_Merge_ContinueRadioBtn_Txt(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContinueRadioBtn_Txt));
		return element;
	}

	public static WebElement contractors_Merge_ContinueRadioBtn_Txtdown(WebDriver driver) {
		element = driver.findElement(By.xpath(contractors_Merge_ContinueRadioBtn_Txtdown));
		return element;
	}

	public static WebElement Contractors_merge_EliminateDuplicates_Text(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractors_merge_EliminateDuplicates_Text));
		return element;
	}

//	public static WebElement Contractors_merge_FirstName_RadioBtn_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_FirstName_RadioBtn_1));
//		return element;
//	}

	public static WebElement Contractors_merge_GoBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractors_merge_GoBackBtn));
		return element;
	}

//	public static WebElement Contractors_merge_FirstName_txt_feild_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_FirstName_txt_feild_1));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_MiddleName_RadioBtn_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_MiddleName_RadioBtn_1));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_MiddleName_txt_feild_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_MiddleName_txt_feild_1));
//		return element;
//	}

	public static WebElement Contractors_merge_WhichContactsdoyouwanttomergewith_Chk_Boxes(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractors_merge_WhichContactsdoyouwanttomergewith_Chk_Boxes));
		return element;
	}

//	public static WebElement Contractors_merge_LastName_txt_feild_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_LastName_txt_feild_1));
//		return element;
//	}

//	public static WebElement Contractors_merge_LastName_RadioBtn_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_LastName_RadioBtn_1));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_Email_txt_feild(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_Email_txt_feild));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_Email_RadioBtn_1(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_Email_RadioBtn_1));
//		return element;
//	}
//
//	public static List<WebElement> Contractors_merge_ContactType_List(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(Contractors_merge_ContactType_List));
//		return listElement;
//	}
//
//	public static WebElement Contractors_merge_ContactType_SearchBar(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_ContactType_SearchBar));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_ContactType_Chk_Box(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_ContactType_Chk_Box));
//		return element;
//	}
//
//	public static WebElement Contractors_merge_ContactType_Enrollment_Admin_ChkBox(WebDriver driver) {
//		element = driver.findElement(By.xpath(Contractors_merge_ContactType_Enrollment_Admin_ChkBox));
//		return element;
//	}

	public static WebElement CompleteMerge_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompleteMerge_Btn));
		return element;
	}

	// Contractors Merge

	static String ContractorsMerge_CompanyRadioBtn1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rdoCompanyName']/..";
	static String ContractorsMerge_CompanyRadioBtn2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rdoCompanyName']/..";
	static String ContractorsMerge_FEINRadioBtn1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rdoCompanyFEIN']/..";
	static String ContractorsMerge_FEINRadioBtn2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rdoCompanyFEIN']/..";
	static String ContractorsMerge_LegalStatusRadioBtn1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rdoLegalStatus']/..";
	static String ContractorsMerge_LegalStatusRadioBtn2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rdoLegalStatus']/..";
	static String ContractorsMerge_CompanyGroupRadioBtn1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rdoCompanyGroup']/..";
	static String ContractorsMerge_CompanyGroupRadioBtn2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rdoCompanyGroup']/..";
	static String ContractorsMerge_DBAChkBox1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rptCompanyDBA_ctl00_chkCompanyDBA']/..";
	static String ContractorsMerge_DBAChkBox2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rptCompanyDBA_ctl01_chkCompanyDBA']/..";
	static String ContractorsMerge_LicenseNumberChkbox1 = "//input[@id ='ctrlMergeCompanyList_rptCompanyList_ctl00_rptCompanyLicense_ctl00_chkCompanyLicense']/..";
	static String ContractorsMerge_LicenseNumberChkBox2 = "//input[@id ='ctrlMergeCompanyList_rptCompanyList_ctl01_rptCompanyLicense_ctl00_chkCompanyLicense']/..";
	static String ContractorsMerge_LogoRadioBtn1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rdoProfilePic']/..";
	static String ContractorsMerge_LogoRadioBtn2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rdoProfilePic']/..";
	static String ContractorsMerge_PhoneChkBox1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_chkCompanyPhone']/..";
	static String ContractorsMerge_PhoneChkBox2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_chkCompanyPhone']/..";
	static String ContractorsMerge_MobilehkBox1 = "//input[@id=ctrlMergeCompanyList_rptCompanyList_ctl00_chkCompanyCell']/..";
	static String ContractorsMerge_AddressTypeChkBox1 ="//div[@id='uniform-ctrlMergeCompanyList_rptCompanyList_ctl00_rptAddressList_ctl00_chkAddress']";
	static String ContractorsMerge_MobilehkBox2 = "//input[@id=ctrlMergeCompanyList_rptCompanyList_ctl01_chkCompanyCell']/..";
	static String ContractorsMerge_AddressSetMailingAddressRadioBtn1 ="//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rptAddressList_ctl00_rdoIsMailingAddress']/..";
	static String ContractorsMerge_AddressSetMailingAddressRadioBtn2 ="//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rptAddressList_ctl00_rdoIsMailingAddress']/..";
    static String ContractorsMerge_SetPrimaryAddressRadioBtn1 ="//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_rptAddressList_ctl00_rdoIsPrimaryAddress']/..";
    static String ContractorsMerge_SetPrimaryAddressRadioBtn2 ="//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_rptAddressList_ctl00_rdoIsPrimaryAddress']/..";

    public static WebElement ContractorsMerge_SetPrimaryAddressRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_SetPrimaryAddressRadioBtn1));
		return element;
	}
    public static WebElement ContractorsMerge_SetPrimaryAddressRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_SetPrimaryAddressRadioBtn2));
		return element;
	}
    
    public static WebElement ContractorsMerge_AddressTypeChkBox1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_AddressTypeChkBox1));
		return element;
	}
    
	public static WebElement ContractorsMerge_CompanyRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyRadioBtn2));
		return element;
	}
	public static WebElement ContractorsMerge_FEINRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_FEINRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_FEINRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_FEINRadioBtn2));
		return element;
	}
	public static WebElement ContractorsMerge_LegalStatusRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LegalStatusRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_LegalStatusRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LegalStatusRadioBtn2));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyGroupRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyGroupRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyGroupRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyGroupRadioBtn2));
		return element;
	}
	public static WebElement ContractorsMerge_DBAChkBox1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_DBAChkBox1));
		return element;
	}
	public static WebElement ContractorsMerge_DBAChkBox2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_DBAChkBox2));
		return element;
	}
	public static WebElement ContractorsMerge_LicenseNumberChkbox1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LicenseNumberChkbox1));
		return element;
	}
	public static WebElement ContractorsMerge_LicenseNumberChkBox2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LicenseNumberChkBox2));
		return element;
	}
	public static WebElement ContractorsMerge_LogoRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LogoRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_LogoRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LogoRadioBtn2));
		return element;
	}
	public static WebElement ContractorsMerge_PhoneChkBox1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_PhoneChkBox1));
		return element;
	}
	public static WebElement ContractorsMerge_PhoneChkBox2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_PhoneChkBox2));
		return element;
	}
	public static WebElement ContractorsMerge_MobilehkBox1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_MobilehkBox1));
		return element;
	}
	public static WebElement ContractorsMerge_MobilehkBox2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_MobilehkBox2));
		return element;
	}
	public static WebElement ContractorsMerge_AddressSetMailingAddressRadioBtn1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_AddressSetMailingAddressRadioBtn1));
		return element;
	}
	public static WebElement ContractorsMerge_AddressSetMailingAddressRadioBtn2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_AddressSetMailingAddressRadioBtn2));
		return element;
	}

	// Text feilds
 
	static String ContractorsMerge_CompanyTextFeild1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_txtCompany']";
	static String ContractorsMerge_CompanyTextFeild2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_txtCompany']";
	static String ContractorsMerge_FEINTextFeild1 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_txtCompanyFEIN']";
	static String ContractorsMerge_FEINTextFeild2 = "//input[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_txtCompanyFEIN']";
	static String ContractorsMerge_LegalStatusSelectText1 = "//select[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_ddlLegalStatus']";
	static String ContractorsMerge_LegalStatusSelectText2 = "//select[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_ddlLegalStatus']";
	static String ContractorsMerge_CompanyGroupTextFeild1 =  "//select[@id='ctrlMergeCompanyList_rptCompanyList_ctl00_ddlCompanyGroup']";
	static String ContractorsMerge_CompanyGroupTextFeild2 ="//select[@id='ctrlMergeCompanyList_rptCompanyList_ctl01_ddlCompanyGroup']";
	static String ContinuetoMergeAlertOkBtn ="//a[@id='ctrlMergeCompany_lnkYes']";
	static String ContractorsMerge_ContinueTomergeCOmaonies ="//button[@id='btnSave']";
	static String ContinuetoMerge_CompleteMergeBtn ="//input[@id='ctrlMergeCompanyConfirm_btnCompleteMerge']";
	
	public static WebElement ContinuetoMerge_CompleteMergeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContinuetoMerge_CompleteMergeBtn));
		return element;
	}
	
	public static WebElement ContractorsMerge_ContinueTomergeCOmaonies(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_ContinueTomergeCOmaonies));
		return element;
	}
	public static WebElement ContinuetoMergeAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContinuetoMergeAlertOkBtn));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyTextFeild1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyTextFeild1));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyTextFeild2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyTextFeild2));
		return element;
	}
	public static WebElement ContractorsMerge_FEINTextFeild1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_FEINTextFeild1));
		return element;
	}
	public static WebElement ContractorsMerge_FEINTextFeild2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_FEINTextFeild2));
		return element;
	}
	public static WebElement ContractorsMerge_LegalStatusSelectText1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LegalStatusSelectText1));
		return element;
	}
	public static WebElement ContractorsMerge_LegalStatusSelectText2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_LegalStatusSelectText2));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyGroupTextFeild1(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyGroupTextFeild1));
		return element;
	}
	public static WebElement ContractorsMerge_CompanyGroupTextFeild2(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsMerge_CompanyGroupTextFeild2));
		return element;
	}

	
	
	
	
	

}
