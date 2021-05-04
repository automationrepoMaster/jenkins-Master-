package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCarriersPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	// General Information tab xpaths
	static String addCarrierCarrierNameField = "//input[@id='txtCarrierName']";
	static String addCarrierShortNameField = "//input[@id='txtCarrierCode']";
	static String addCarrierNAICField = "//input[@id='txtNAIC']";
	static String addCarrierContactFirstNameField = "//input[@id='txtSubContratorFirstName']";
	static String addCarrierContactLastNameField = "//input[@id='txtSubContractorLastName']";
	static String addCarrierContactEmailField = "//input[@id='txtSubContractorEmail']";
	static String addCarrierContactPhoneField = "//input[@id='txtSubContractorPhone']";
	static String addCarrierAddress1Field = "//input[@id='txtAddress1']";
	static String addCarrierAddress2Field = "//input[@id='txtAddress2']";
	static String addCarrierCityField = "//input[@id='txtCity']";
	static String addCarrierStateField = "//select[@id='ddlState']";// dropdown
	static String addCarrierZipCodeField = "//input[@id='txtZip']";
	static String addCarrierSaveBtn ="//input[@id='btnSave']";
	static String addCarrierSaveAndCloseBtn = "//input[@id='btnSaveandClose']";
	static String addCarrierCloseBtn = "//button[@id='btnClose']";
	static String addCarrierActiveRedioBtn = "//div[@id='uniform-chkIsActive']//span";
	static String duplicateCarrierAlertOKBtn ="//iframe[@name='_iframe-EmailBox12']";
	
	
	public static WebElement duplicateCarrierAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(duplicateCarrierAlertOKBtn));
		return element;
	}
	public static WebElement addCarrierSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierSaveBtn));
		return element;
	}
	
	public static WebElement addCarrierCarrierNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierCarrierNameField));
		return element;
	}

	public static WebElement addCarrierShortNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierShortNameField));
		return element;
	}

	public static WebElement addCarrierNAICField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierNAICField));
		return element;
	}

	public static WebElement addCarrierContactFirstNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierContactFirstNameField));
		return element;
	}

	public static WebElement addCarrierContactLastNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierContactLastNameField));
		return element;
	}

	public static WebElement addCarrierContactEmailField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierContactEmailField));
		return element;
	}

	public static WebElement addCarrierContactPhoneField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierContactPhoneField));
		return element;
	}

	public static WebElement addCarrierAddress1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierAddress1Field));
		return element;
	}

	public static WebElement addCarrierAddress2Field(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierAddress2Field));
		return element;
	}

	public static WebElement addCarrierCityField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierCityField));
		return element;
	}

	public static WebElement addCarrierStateField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierStateField));
		return element;
	}

	public static WebElement addCarrierZipCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierZipCodeField));
		return element;
	}

	public static WebElement addCarrierSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierSaveAndCloseBtn));
		return element;
	}

	public static WebElement addCarrierCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierCloseBtn));
		return element;
	}

	public static WebElement addCarrierActiveRedioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addCarrierActiveRedioBtn));
		return element;
	}

}
