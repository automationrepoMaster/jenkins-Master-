package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

	private static WebElement element;
	private static List<WebElement> listElement;
	
	// General Information tab xpaths
	static String addUserCompanyNameField = "//input[@name='txtCompany']";
	static String addUserLegalStatusField = "#ddlLegalStatus";// select from
																// drop-down
	static String addUserDBAField = "#txtDBACompany";
	static String addUserExtaDBA_Btn = "//button[@class='add_field_button btn btn-success marg-right-5']";
	static String addUserExtaDBA_2ndBtn ="//button[@class='button_add_field btn btn-success btnAdd marg-right-5']//i[@class='fa fa-plus']";
	static String addUserExtaDBA_3rdBtn ="//div[@class='col-md-12 addEditBtn marg-bottom-10']//div[3]//div[2]//button[1]";
	static String addUserExtaDBA_4thBtn ="//div[4]//div[2]//button[1]";
	
	static String addUserExtaDBA_Field = "//div[@class='row marg-top-10 divNewCompanyDBA']//input[@id='txtDBACompany']";//list
	static String addUserExta3rdDBA_Field = "//div[@class='col-md-12 addEditBtn marg-bottom-10']//div[3]//div[1]//input[1]";
	static String addUserExta4thDBA_Field = "//div[@class='col-md-12 addEditBtn marg-bottom-10']//div[4]//div[1]//input[1]";
	
	static String addUserLicenseNoField = "#txtLicenseCompany";
	static String addUserLicenseAddExtraBtn= "//button[@class='add_License_button btn btn-success marg-right-5']";
	static String addUser2ndLicenseNoField ="//div[@class='row divStaticCompanyLicense']/../div[2]/div[1]/input";
	static String addUserLicenseAddExtra2ndBtn="//div[@class='row divStaticCompanyLicense']/../div[2]/div[3]/button[1]";
	static String addUser3rdLicenseNoField ="//div[@class='row divStaticCompanyLicense']/../div[3]/div[1]/input";
	static String addUserLicenseAddExtra3rdBtn="//div[@class='row divStaticCompanyLicense']/../div[3]/div[3]/button[1]";
	static String addUserLicenseAddExtra4thBtn="//div[@class='row divStaticCompanyLicense']/../div[4]/div[3]/button[1]";
	static String addUser4thLicenseNoField ="//div[@class='row divStaticCompanyLicense']/../div[4]/div[1]/input";
	
	static String addUserContactTypeField = "//select[@id='ddlContactType']";// select
																			
	static String addUserFirstNameField = "#txtFirstName";
	static String addUserMiddleNameField = "#txtMiddleName";
	static String addUserLastNameField = "#txtLastName";
	static String addUserJobTitleField = "#txtJobTitle";
	static String addUserPhoneNoField = "#txtPhone";
	static String addUserMobileNoField = "#txtMobile";
	static String addUserFaxField = "#txtFax";
	static String addUserEmailField = "//input[@id='txtEmail']";
	static String addUserEmailError="//label[@class='error']";
	
	static String addUserSaveBtn = "//div[@class='fright']//button[1]";
	static String addUserSaveAndCloseBtn = "//div[@class='fright']//button[2]";
	static String addUserSaveAndContinueBtn = "//div[@class='fright']//button[3]";
	// address tab xapths
	static String addUserAddressTab = "#ctrlUserAddUpdate_aAddress";// css
	static String addUserAddAddressBtn = "//a[@data-original-title='Add Address']";
	// address tab save buttons
	static String addUserAddressTabSaveBtn = "//input[@value='Save']";
	static String addUserAddressTabSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addUserAddressTabSaveAndContinueBtn = "//input[@value='Save and Continue']";
	// add address fields
	static String addUserAddAddressSelectAddressType = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";
	static String addUserAddAddressAddress1Field = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String addUserAddAddressCityField = "//input[@id='cntrAddressAddUpdate_txtCity']";
	static String addUserAddAddressSelectState = "//select[@id='cntrAddressAddUpdate_ddlState']";// select
																									// drop
																									// down
	static String addUserAddAddressZipCode = "//input[@id='cntrAddressAddUpdate_txtZipCode']";
	// add address save buttons
	static String addUserAddAddressSaveBtn = "//input[@value='Save']";
	static String addUserAddAddressSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addUserAddAddressCloseBtn = "//button[@id='cntrAddressAddUpdate_btnClose']";
	// contacts tab xpaths
	static String addUserContactsTab = "//a[text()='Contacts']";
	static String addUserContactsTabFinishAndCloseBtn = "//input[@value='Finish and Close']";
	static String addUserContactsTabBackBtn = "//input[@value='Back']";
	static String addUserContactsCloseBtn = "//button[@class='btn']";

	// static methods of each elements
	public static WebElement addUserCompanyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserCompanyNameField));
		return element;
	}

	public static WebElement addUserLegalStatus(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserLegalStatusField));
//		Select select = new Select(element);
//		select.selectByVisibleText(status);
		return element;
	}

	public static WebElement addUserDBAField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserDBAField));
		return element;
	}
	
	public static WebElement addUserExtaDBA_2ndBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExtaDBA_2ndBtn));
		return element;
	}
	public static WebElement addUserExtaDBA_3rdBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExtaDBA_3rdBtn));
		return element;
	}
	public static WebElement addUserExtaDBA_4thBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExtaDBA_4thBtn));
		return element;
	}
	public static WebElement addUserExtaDBA_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExtaDBA_Btn));
		return element;
	}
	
	public static WebElement addUserExta3rdDBA_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExta3rdDBA_Field));
		return element;
	}
	
	public static WebElement addUserExta4thDBA_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExta4thDBA_Field));
		return element;
	}

	public static WebElement addUserExtaDBA_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserExtaDBA_Field));
		return element;
	}
//	public static List<WebElement> addUserExtaDBA_Field(WebDriver driver) {
//		listElement = driver.findElements(By.xpath(addUserExtaDBA_Field));
//		return listElement;
//	}

	public static WebElement addUserLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserLicenseNoField));
		return element;
	}
	public static WebElement addUserLicenseAddExtraBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserLicenseAddExtraBtn));
		return element;
	}
	public static WebElement addUser2ndLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUser2ndLicenseNoField));
		return element;
	}
	public static WebElement addUserLicenseAddExtra2ndBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserLicenseAddExtra2ndBtn));
		return element;
	}
	public static WebElement addUser3rdLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUser3rdLicenseNoField));
		return element;
	}
	public static WebElement addUserLicenseAddExtra3rdBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserLicenseAddExtra3rdBtn));
		return element;
	}
	public static WebElement addUserLicenseAddExtra4thBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserLicenseAddExtra4thBtn));
		return element;
	}
	public static WebElement addUser4thLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUser4thLicenseNoField));
		return element;
	}
	

	public static WebElement addUserContactTypeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserContactTypeField));
		return element;
	}

	public static WebElement addUserFirstNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserFirstNameField));
		return element;
	}

	public static WebElement addUserMiddleNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserMiddleNameField));
		return element;
	}

	public static WebElement addUserLastNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserLastNameField));
		return element;
	}

	public static WebElement addUserJobTitleField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserJobTitleField));
		return element;
	}

	public static WebElement addUserPhoneNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserPhoneNoField));
		return element;
	}

	public static WebElement addUserMobileNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserMobileNoField));
		return element;
	}

	public static WebElement addUserFaxField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserFaxField));
		return element;
	}
	
	public static WebElement addUserEmailError(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserEmailError));
		return element;
	}
	public static WebElement addUserEmailField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserEmailField));
		return element;
	}

	public static WebElement addUserSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserSaveBtn));
		return element;
	}

	public static WebElement addUserSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserSaveAndCloseBtn));
		return element;
	}

	public static WebElement addUserSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserSaveAndContinueBtn));
		return element;
	}

	public static WebElement addUserAddressTab(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addUserAddressTab));
		return element;
	}

	public static WebElement addUserAddAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressBtn));
		return element;
	}

	public static WebElement addUserAddressTabSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddressTabSaveBtn));
		return element;
	}

	public static WebElement addUserAddressTabSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddressTabSaveAndCloseBtn));
		return element;
	}

	public static WebElement addUserAddressTabSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddressTabSaveAndContinueBtn));
		return element;
	}

	public static WebElement addUserAddAddressSelectAddressType(WebDriver driver, String selectAddressType) {
		element = driver.findElement(By.xpath(addUserAddAddressSelectAddressType));
		Select select = new Select(element);
		select.selectByVisibleText(selectAddressType);
		return element;
	}

	public static WebElement addUserAddAddressAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressAddress1Field));
		return element;
	}

	public static WebElement addUserAddAddressCityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressCityField));
		return element;
	}

	public static WebElement addUserAddAddressSelectState(WebDriver driver, String selectState) {
		element = driver.findElement(By.xpath(addUserAddAddressSelectState));
		Select select = new Select(element);
		select.selectByVisibleText(selectState);
		return element;
	}

	public static WebElement addUserAddAddressZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressZipCode));
		return element;
	}

	public static WebElement addUserAddAddressSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressSaveBtn));
		return element;
	}

	public static WebElement addUserAddAddressSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressSaveAndCloseBtn));
		return element;
	}

	public static WebElement addUserAddAddressCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserAddAddressCloseBtn));
		return element;
	}

	public static WebElement addUserContactsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserContactsTab));
		return element;
	}

	public static WebElement addUserContactsTabFinishAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserContactsTabFinishAndCloseBtn));
		return element;
	}

	public static WebElement addUserContactsTabBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserContactsTabBackBtn));
		return element;
	}

	public static WebElement addUserContactsCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addUserContactsCloseBtn));
		return element;
	}

}
