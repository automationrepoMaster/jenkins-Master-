package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Address_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String addAddressButton = "//a[@data-original-title='Add Address']";
	// address tab save buttons
	static String nextButton = "//input[@value='Next']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";
	// add address fields
	static String addAddressSelectAddressType = "//select[@id='cntrAddressAddUpdate_ddlAddressType']";
	static String addAddressAddress1Field = "//input[@id='cntrAddressAddUpdate_txtAddress1']";
	static String addAddressCityField = "//input[@id='cntrAddressAddUpdate_txtCity']";
	static String addAddressSelectState = "//select[@id='cntrAddressAddUpdate_ddlState']";// dropdown
	static String addAddressZipCode = "//input[@id='cntrAddressAddUpdate_txtZipCode']";
	// add address save buttons
	static String addAddressSaveBtn = "//input[@value='Save']";
	static String addAddressSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addAddressCloseBtn = "//button[@id='cntrAddressAddUpdate_btnClose']";

	public static WebElement addAddressButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressButton));
		return element;
	}

	public static WebElement nextButton(WebDriver driver) {
		element = driver.findElement(By.xpath(nextButton));
		return element;
	}

	public static WebElement backButton(WebDriver driver) {
		element = driver.findElement(By.xpath(backButton));
		return element;
	}

	public static WebElement closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButton));
		return element;
	}

	public static WebElement addAddressSelectAddressType(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressSelectAddressType));
		return element;
	}

	public static WebElement addAddressAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressAddress1Field));
		return element;
	}

	public static WebElement addAddressCityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressCityField));
		return element;
	}

	public static WebElement addAddressSelectState(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressSelectState));
		return element;
	}

	public static WebElement addAddressZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressZipCode));
		return element;
	}

	public static WebElement addAddressSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressSaveBtn));
		return element;
	}

	public static WebElement addAddressSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressSaveAndCloseBtn));
		return element;
	}

	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(addAddressCloseBtn));
		return element;
	}
	
//Add New Address Type Link	
		static String addNewAddressTypeLink = "//a[@id='aAddressType']";
		static String addAddressTypeLink = "//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
		static String addAddressTypeListCloseButton = "//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
		static String addAddressTypeNameField = "//input[@id='ctrlMasterItemCategoryList_txtName']";
		static String addAddressTypeDescriptionField = "//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
		static String addAddressTypeSaveButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
		static String addAddressTypeSaveAndCloseButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
		static String addAddressTypeCloseButton = "//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";

		public static WebElement addNewAddressTypeLink(WebDriver driver) {
			element = driver.findElement(By.xpath(addNewAddressTypeLink));
			return element;
		}

		public static WebElement addAddressTypeLink(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeLink));
			return element;
		}

		public static WebElement addAddressTypeListCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeListCloseButton));
			return element;
		}

		public static WebElement addAddressTypeNameField(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeNameField));
			return element;
		}

		public static WebElement addAddressTypeDescriptionField(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeDescriptionField));
			return element;
		}

		public static WebElement addAddressTypeSaveButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeSaveButton));
			return element;
		}

		public static WebElement addAddressTypeSaveAndCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeSaveAndCloseButton));
			return element;
		}

		public static WebElement addAddressTypeCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addAddressTypeCloseButton));
			return element;
		}
	
	
	

}
