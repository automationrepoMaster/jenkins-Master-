package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDivisonPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	// General Information tab xpaths
	static String addDivisionDivisionNameField = "//input[@id='cntrDivisionAddUpdate_txtDivisionName']";
	static String addDivisionDivisionCodeField = "//input[@id='cntrDivisionAddUpdate_txtDivisionCode']";
	static String addDivisionDivisionSponsorField = "//select[@id='cntrDivisionAddUpdate_ddlOwner']";// dropdown
	static String addDivisionDivisionAdministeratorField = "//select[@id='cntrDivisionAddUpdate_ddlNodeAdministrator']";// dropdown
	static String addDivisionContactNameField = "//input[@id='cntrDivisionAddUpdate_txtContactName']";
	static String addDivisionContactEmailField = "//input[@id='cntrDivisionAddUpdate_txtContactEmail']";
	static String addDivisionPhoneNoField = "//input[@id='cntrDivisionAddUpdate_txtPhone']";
	static String addDivisionDivisionNoteField = "//textarea[@id='cntrDivisionAddUpdate_txtDivisionNote']";// drop-down
	static String addDivisionRegionField = "//select[@id='cntrDivisionAddUpdate_ddlRegion']";// dropdown
	static String addDivisionEntityField = "//select[@id='cntrDivisionAddUpdate_ddlEntity']";// dropdown
	// add division page buttons
	static String addDivisionCloseBtn = "//button[@id='cntrDivisionAddUpdate_btnClose']";
	static String addDivisionSaveBtn = "//input[@id='cntrDivisionAddUpdate_btnSaveGeneralInformation']";
	static String addDivisionSaveAndCloseBtn = "//input[@id='cntrDivisionAddUpdate_btnSaveandCloseGeneralInformation']";
	static String addDivisionSaveAndContinueBtn = "//input[@id='cntrDivisionAddUpdate_btnNextGeneralInfomation']";
	// address tab xapths
	static String addDivisionGeneralInformationTab = "#//a[@id='cntrDivisionAddUpdate_cntrDivisionAddUpdate_aGeneralInformation']";// css
	static String addDivisionAddressTab = "//a[@id='cntrDivisionAddUpdate_cntrDivisionAddUpdate_aAddress']";
	static String addDivisionAddAddressBtn = "//div[@class='panel-body clearfix']//a[1]";
	// address tab save buttons
	static String addDivisionAddressTabNextBtn = "//input[@value='Next']";
	// add address fields
	static String addDivisionAdd_AddressLocationNameField = "//input[@id='cntrAddressAddUpdate_txtCampusName']";
	static String addDivisionAdd_AddresscContactNameField = "//input[@id='cntrAddressAddUpdate_txtContactName']";
	static String addDivisionAdd_AddressContactPhoneField = "//input[@id='cntrAddressAddUpdate_txtContactPhone']";
	static String addDivisionAdd_AddressAddressTypeField = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";// drowpDown
	static String addDivisionAdd_AddressAddress1Field = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String addDivisionAdd_AddressCity = "//input[@id='cntrAddressAddUpdate_txtCity']"; 
	static String addDivisionAdd_AddressState = "//select[@id='cntrAddressAddUpdate_ddlState']"; // dropdown
	static String addDivisionAdd_AddressZipCode = "//input[@id='cntrAddressAddUpdate_txtZipCode']";
	// add address save buttons
	static String addDivisionAdd_AddressSaveBtn = "//input[@title='Save']";
	static String addDivisionAdd_AddressSaveAndCloseBtn = "//input[@title='Save and Close']";
	static String addDivisionAdd_AddressCloseBtn = "//button[@id='cntrAddressAddUpdate_btnClose']";
	// contacts tab xpaths
	static String addDivisionContactsTab = "//a[text()='Contacts']";
	static String addDivisionContactsTabNextBtn = "//input[@value='Next']";
	static String addDivisionContactsTabBackBtn = "//input[@value='Back']";
	static String addDivisionContactsCloseBtn = "//button[@class='btn']";
	// user Access tab
	static String addDivisionUserAccessTabAddSponsorBtn = "//input[@title='Add Sponsor ']";
	static String addDivisionUserAccessSelectSponsorDropDown = "//select[@id='ddlOtherOwners']";// dropdown
	static String addDivisionUserAccessTabAddSponsorPlusBtn="//a[@id='btnAddOwner']";
	static String addDivisionUserAccessTabAddAdministratorBtn = "//input[@id='btnQuickNodeAdministratorAdd']";
	static String addDivisionUserAccessSelectAdminstratorDropDown = "//select[@id='ddlOtherNodeAdmininstrator']";
	static String addDivisionUserAccessTabFinishAndCloseBtn = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String addDivisionUserAccessTabCloseBtn = "//button[@class='btn']";

	
	public static WebElement addDivisionUserAccessTabAddSponsorPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessTabAddSponsorPlusBtn));
		return element;
	}
	
	public static WebElement addDivisionAdd_AddresscContactNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddresscContactNameField));
		return element;
	}
	
	public static WebElement addDivisionDivisionNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionDivisionNameField));
		return element;
	}
	public static WebElement addDivisionDivisionCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionDivisionCodeField));
		return element;
	}
	public static WebElement addDivisionDivisionSponsorField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionDivisionSponsorField));
		return element;
	}
	public static WebElement addDivisionDivisionAdministeratorField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionDivisionAdministeratorField));
		return element;
	}
	public static WebElement addDivisionContactNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactNameField));
		return element;
	}public static WebElement addDivisionContactEmailField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactEmailField));
		return element;
	}
	public static WebElement addDivisionPhoneNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionPhoneNoField));
		return element;
	}
	public static WebElement addDivisionDivisionNoteField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionDivisionNoteField));
		return element;
	}
	public static WebElement addDivisionRegionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionRegionField));
		return element;
	}
	public static WebElement addDivisionEntityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionEntityField));
		return element;
	}
	public static WebElement addDivisionCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionCloseBtn));
		return element;
	}
	public static WebElement addDivisionSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionSaveBtn));
		return element;
	}
	public static WebElement addDivisionSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionSaveAndCloseBtn));
		return element;
	}
	public static WebElement addDivisionSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionSaveAndContinueBtn));
		return element;
	}
	public static WebElement addDivisionGeneralInformationTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionGeneralInformationTab));
		return element;
	}
	public static WebElement addDivisionAddressTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAddressTab));
		return element;
	}public static WebElement addDivisionAddAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAddAddressBtn));
		return element;
	}public static WebElement addDivisionAddressTabNextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAddressTabNextBtn));
		return element;
	}
	public static WebElement addDivisionAdd_AddressLocationNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressLocationNameField));
		return element;
	}
	public static WebElement addDivisionAdd_AddressContactPhoneField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressContactPhoneField));
		return element;
	}
	public static WebElement addDivisionAdd_AddressAddressTypeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressAddressTypeField));
		return element;
	}
	public static WebElement addDivisionAdd_AddressAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressAddress1Field));
		return element;
	}
	public static WebElement addDivisionAdd_AddressCity(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressCity));
		return element;
	}public static WebElement addDivisionAdd_AddressState(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressState));
		return element;
	}public static WebElement addDivisionAdd_AddressZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressZipCode));
		return element;
	}public static WebElement addDivisionAdd_AddressSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressSaveBtn));
		return element;
	}public static WebElement addDivisionAdd_AddressSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressSaveAndCloseBtn));
		return element;
	}public static WebElement addDivisionAdd_AddressCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionAdd_AddressCloseBtn));
		return element;
	}
	public static WebElement addDivisionContactsTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactsTab));
		return element;
	}
	public static WebElement addDivisionContactsTabNextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactsTabNextBtn));
		return element;
	}
	public static WebElement addDivisionContactsTabBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactsTabBackBtn));
		return element;
	}
	public static WebElement addDivisionContactsCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionContactsCloseBtn));
		return element;
	}public static WebElement addDivisionUserAccessTabAddSponsorBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessTabAddSponsorBtn));
		return element;
	}
	public static WebElement addDivisionUserAccessSelectSponsorDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessSelectSponsorDropDown));
		return element;
	}
	public static WebElement addDivisionUserAccessTabAddAdministratorBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessTabAddAdministratorBtn));
		return element;
	}
	public static WebElement addDivisionUserAccessSelectAdminstratorDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessSelectAdminstratorDropDown));
		return element;
	}
	public static WebElement addDivisionUserAccessTabFinishAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessTabFinishAndCloseBtn));
		return element;
	}
	public static WebElement addDivisionUserAccessTabCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDivisionUserAccessTabCloseBtn));
		return element;
	}	
}
