package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddSponsorPage {
	private static WebElement element;
	private static List<WebElement> listElement;

	// General Information tab xpaths
	static String addSponsorCompanyNameField = "//input[@name='txtCompany']";
	static String addSponsorFEINField = "#txtFEIN";
	static String addSponsorLegalStatusField = "#ddlLegalStatus";// dropdown
	static String addSponsorSponsorCodeField = "#txtOwnerCode";
	static String addSponsorDBAField = "#txtDBACompany";
	static String addSponsorExtaDBA_Btn = "//button[@class='add_field_button btn btn-success marg-right-5']";
	static String addSponsorExtaDBA_Field = "//div[@class='row marg-top-10 divNewCompanyDBA']//input[@id='txtDBACompany']";
	static String addSponsorLicenseNoField = "#txtLicenseCompany";
	static String addSponsorContactTypeField = "//select[@id='ddlContactType']";// dropdown
	static String addSponsorFirstNameField = "#txtFirstName";
	static String addSponsorMiddleNameField = "#txtMiddleName";
	static String addSponsorLastNameField = "#txtLastName";
	static String addSponsorJobTitleField = "#txtJobTitle";
	static String addSponsorPhoneNoField = "#txtPhone";
	static String addSponsorMobileNoField = "#txtMobile";
	static String addSponsorFaxField = "#txtFax";
	static String addSponsorEmailField = "#txtEmail";
	static String addSponsorSaveBtn = "//div[@class='fright']//button[1]";
	static String addSponsorSaveAndCloseBtn = "//div[@class='fright']//button[2]";
	static String addSponsorSaveAndContinueBtn = "//div[@class='fright']//button[3]";
	// address tab xapths
	static String addSponsorAddressTab = "#ctrlUserAddUpdate_aAddress";// css
	static String addSponsorAddAddressBtn = "//a[@data-original-title='Add Address']";
	// address tab save buttons
	static String addSponsorAddressTabSaveBtn = "//input[@value='Save']";
	static String addSponsorAddressTabSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addSponsorAddressTabSaveAndContinueBtn = "//input[@value='Save and Continue']";
	// add address fields
	static String addSponsorAddAddressSelectAddressType = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";
	static String addSponsorAddAddressAddress1Field = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String addSponsorAddAddressCityField = "//input[@id='cntrAddressAddUpdate_txtCity']";
	static String addSponsorAddAddressSelectState = "//select[@id='cntrAddressAddUpdate_ddlState']";// dropdown
	static String addSponsorAddAddressZipCode = "//input[@id='cntrAddressAddUpdate_txtZipCode']";
	// add address save buttons
	static String addSponsorAddAddressSaveBtn = "//input[@value='Save']";
	static String addSponsorAddAddressSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addSponsorAddAddressCloseBtn = "//button[@id='cntrAddressAddUpdate_btnClose']";
	// contacts tab xpaths
	static String addSponsorContactsTab = "//a[text()='Contacts']";
	static String addSponsorContactsTabFinishAndCloseBtn = "//input[@value='Finish and Close']";
	static String addSponsorContactsTabBackBtn = "//input[@value='Back']";
	static String addSponsorContactsCloseBtn = "//button[@class='btn']";

	// static methods of each elements
	public static WebElement addSponsorCompanyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorCompanyNameField));
		return element;
	}

	public static WebElement addSponsorFEINField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorFEINField));
		return element;
	}

	public static WebElement addSponsorLegalStatus(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorLegalStatusField));
		return element;
	}

	public static WebElement addSponsorSponsorCodeField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorSponsorCodeField));
		return element;
	}

	public static WebElement addSponsorDBAField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorDBAField));
		return element;
	}

	public static WebElement addSponsorExtaDBA_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorExtaDBA_Btn));
		return element;
	}

	public static WebElement addSponsorExtaDBA_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorExtaDBA_Field));
		return element;
	}

	public static WebElement addSponsorLicenseNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorLicenseNoField));
		return element;
	}

	public static WebElement addSponsorContactTypeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorContactTypeField));
		return element;
	}

	public static WebElement addSponsorFirstNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorFirstNameField));
		return element;
	}

	public static WebElement addSponsorMiddleNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorMiddleNameField));
		return element;
	}

	public static WebElement addSponsorLastNameField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorLastNameField));
		return element;
	}

	public static WebElement addSponsorJobTitleField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorJobTitleField));
		return element;
	}

	public static WebElement addSponsorPhoneNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorPhoneNoField));
		return element;
	}

	public static WebElement addSponsorMobileNoField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorMobileNoField));
		return element;
	}

	public static WebElement addSponsorFaxField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorFaxField));
		return element;
	}

	public static WebElement addSponsorEmailField(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorEmailField));
		return element;
	}

	public static WebElement addSponsorSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorSaveBtn));
		return element;
	}

	public static WebElement addSponsorSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorSaveAndCloseBtn));
		return element;
	}

	public static WebElement addSponsorSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorSaveAndContinueBtn));
		return element;
	}

	public static WebElement addSponsoraddressTab(WebDriver driver) {
		element = driver.findElement(By.cssSelector(addSponsorAddressTab));
		return element;
	}

	public static WebElement addSponsorAddAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressBtn));
		return element;
	}

	public static WebElement addSponsorAddressTabSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddressTabSaveBtn));
		return element;
	}

	public static WebElement addSponsorAddressTabSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddressTabSaveAndCloseBtn));
		return element;
	}

	public static WebElement addSponsorAddressTabSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddressTabSaveAndContinueBtn));
		return element;
	}

	public static WebElement addSponsorAddAddressSelectAddressType(WebDriver driver, String selectAddressType) {
		element = driver.findElement(By.xpath(addSponsorAddAddressSelectAddressType));
		Select select = new Select(element);
		select.selectByVisibleText(selectAddressType);
		return element;
	}

	public static WebElement addSponsorAddAddressAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressAddress1Field));
		return element;
	}

	public static WebElement addSponsorAddAddressCityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressCityField));
		return element;
	}

	public static WebElement addSponsorAddAddressSelectState(WebDriver driver, String selectState) {
		element = driver.findElement(By.xpath(addSponsorAddAddressSelectState));
		Select select = new Select(element);
		select.selectByVisibleText(selectState);
		return element;
	}

	public static WebElement addSponsorAddAddressZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressZipCode));
		return element;
	}

	public static WebElement addSponsorAddAddressSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressSaveBtn));
		return element;
	}

	public static WebElement addSponsorAddAddressSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressSaveAndCloseBtn));
		return element;
	}

	public static WebElement addSponsorAddAddressCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddAddressCloseBtn));
		return element;
	}

	public static WebElement addSponsorContactsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorContactsTab));
		return element;
	}

	public static WebElement addSponsorContactsTabFinishAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorContactsTabFinishAndCloseBtn));
		return element;
	}

	public static WebElement addSponsorContactsTabBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorContactsTabBackBtn));
		return element;
	}

	public static WebElement addSponsorContactsCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorContactsCloseBtn));
		return element;
	}

}
