package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_MyProfilePage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String updateCompanyLegalName = "//*[@onclick='UpdateCompanyLegalName();']";
	static String currentCompanyLegalName = "//input[@class='form-control form-control-dynamic valid']";
	static String newCompanyLegalName = "//input[@id='RequestedComoany']";
	static String reasonNameChnageRequest = "//input[@id='RequestReason']";
	static String btnFEINChnageYes = "//label[contains(text(),'Did the FEIN # change?')]/../div/label[1]";
	static String btnFEINChnageNo = "//label[contains(text(),'Did the FEIN # change?')]/../div/label[2]";
	static String newFEINNo = "//input[@id='RequestedFEIN']";
	static String effectiveDate = "//input[@id='EffectedDate']";
	static String addDocumentBtn = "//input[@class='custom-file-input position-absolute']";
	static String saveBtn = "//a[@class='btn btn-dark-green btn-lg float-right a-save-contractor-request']";
	static String contractorRequestCancelBtn = "//span[contains(text(),'×')]";
	static String firstName = "//input[@id='UserFirstName']";
	static String lastName = "//input[@id='UserLastName']";
	static String phone = "//input[@id='UserPhone']";
	static String fax = "//input[@id='wp.users.userfax']";
	static String Email = "//input[@id='UserEmail']";
	static String addressField = "//input[@class='select-dropdown']";
	static String selectAddressFromList = "//input[@class='select-dropdown']/../ul/li";// list
	static String jobTitle = "//input[@id='wp.users.jobtitle']";
	static String changePasswordBtn = "//a[contains(text(),'Change Password')]";
	static String currentPasswordField = "//input[@id='CurrentPassword']";
	static String newPasswordField = "//input[@id='Password']";
	static String reEnter_newPasswordField = "//label[contains(text(),'Re-enter Password')]";
	static String savePasswordBtn = "//button[contains(text(),'Save')]";
	static String changePasswordCloseIcon = "//h5[contains(text(),'Change Password')]/..//button/span";

	public static WebElement updateCompanyLegalName(WebDriver driver) {
		element = driver.findElement(By.xpath(updateCompanyLegalName));
		return element;
	}

	public static WebElement currentCompanyLegalName(WebDriver driver) {
		element = driver.findElement(By.xpath(currentCompanyLegalName));
		return element;
	}

	public static WebElement newCompanyLegalName(WebDriver driver) {
		element = driver.findElement(By.xpath(newCompanyLegalName));
		return element;
	}

	public static WebElement reasonNameChnageRequest(WebDriver driver) {
		element = driver.findElement(By.xpath(reasonNameChnageRequest));
		return element;
	}

	public static WebElement btnFEINChnageYes(WebDriver driver) {
		element = driver.findElement(By.xpath(btnFEINChnageYes));
		return element;
	}

	public static WebElement btnFEINChnageNo(WebDriver driver) {
		element = driver.findElement(By.xpath(btnFEINChnageNo));
		return element;
	}

	public static WebElement newFEINNo(WebDriver driver) {
		element = driver.findElement(By.xpath(newFEINNo));
		return element;
	}

	public static WebElement effectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(effectiveDate));
		return element;
	}

	public static WebElement addDocumentBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocumentBtn));
		return element;
	}

	public static WebElement saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveBtn));
		return element;
	}

	public static WebElement contractorRequestCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorRequestCancelBtn));
		return element;
	}

	public static WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.xpath(firstName));
		return element;
	}

	public static WebElement lastName(WebDriver driver) {
		element = driver.findElement(By.xpath(lastName));
		return element;
	}

	public static WebElement phone(WebDriver driver) {
		element = driver.findElement(By.xpath(phone));
		return element;
	}

	public static WebElement fax(WebDriver driver) {
		element = driver.findElement(By.xpath(fax));
		return element;
	}

	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.xpath(Email));
		return element;
	}

	public static WebElement addressField(WebDriver driver) {
		element = driver.findElement(By.xpath(addressField));
		return element;
	}

	public static WebElement selectAddressFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAddressFromList));
		return element;
	}

	public static WebElement jobTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(jobTitle));
		return element;
	}

	public static WebElement changePasswordBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(changePasswordBtn));
		return element;
	}

	public static WebElement currentPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath(currentPasswordField));
		return element;
	}

	public static WebElement newPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath(newPasswordField));
		return element;
	}

	public static WebElement reEnter_newPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath(reEnter_newPasswordField));
		return element;
	}

	public static WebElement savePasswordBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(savePasswordBtn));
		return element;
	}

	public static WebElement changePasswordCloseIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(changePasswordCloseIcon));
		return element;
	}

}
