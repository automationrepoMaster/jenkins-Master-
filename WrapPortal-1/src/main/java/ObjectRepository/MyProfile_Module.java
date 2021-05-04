package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfile_Module {

	private static WebElement element;
	private static List<WebElement> listElement;

	// My Information
	static String companyName = "//input[@id='ctl00_ContentPlaceHolder1_txtCompanyName']";
	static String firstName = "//input[@id='ctl00_ContentPlaceHolder1_txtFirstName']";
	static String lastName = "//input[@data-original-title='Last Name']";
	static String phoneNo = "//input[@data-original-title='Phone']";
	static String faxNo = "//input[@data-original-title='Fax']";
	static String email = "//input[@data-original-title='Email']";
	static String clickHeretoAddNewAddressLink = "//a[@id='aAddressType']";
	static String selectAddress = "//select[@id='ctl00_ContentPlaceHolder1_ddlAddress']";
	static String fieldContactType = "//*[contains(text(),'Contact Type')]/../../div[2]/div";
	static String selectContactType = "//*[contains(text(),'Contact Type')]/../../div[2]/select//*[contains(text(),'Contact Type')]/../../div[2]/select";
	static String selectprofilePicture = "//img[@id='ctl00_ContentPlaceHolder1_imgLogo']";
	// Theme
	static String removeThemeBtn = "//a[@id='ctl00_ContentPlaceHolder1_aRemoveTheme']";
	static String selectColorTheme = "//ul[@id='theme']/li[1]";// 2345
	static String selectImageForThemeLink = "//*[@title='Add Image to as a Theme']";
	static String selectImageForTheme = "//ul[@id='themeImg']/li[1]";// li[1]23456
	static String selectImageForThemeCancelIcon = "//div[@id='yourModalId']//i[@class='fa fa-times']";
	static String selectImageForThemeCancelBtn = "//div[@id='yourModalId']//a[@class='btn flft'][contains(text(),'Cancel')]";
	static String selectImageForThemeSelectBtn = "//div[@id='yourModalId']//a[@class='btn btn-success fltr'][contains(text(),'Select')]";
	// Video
	static String selectVideoForThemeLink = "//*[@title='Add Video For Theme']";
	static String selectVideoForTheme = "//ul[@id='themeVideo']/li[1]";
	static String selectVideoForThemeCancelBtn = "//div[@id='yourVidModalId']//a[@class='btn flft'][contains(text(),'Cancel')]";
	static String selectVideoForThemeSelectBtn = "//div[@id='yourVidModalId']//a[@class='btn btn-success fltr'][contains(text(),'Select')]";
	// General
	static String selectPaging = "//select[@id='ctl00_ContentPlaceHolder1_ddlPaging']";
	static String selectTimeZone = "//select[@id='ctl00_ContentPlaceHolder1_ddlTimeZone']";
	static String selectDefaultLandingPage = "//select[@id='ctl00_ContentPlaceHolder1_ddlHomePage']";
	// System Access
	static String userNameField = "//input[@id='ctl00_ContentPlaceHolder1_txtUserName']";
	static String passwordField = "//input[@id='ctl00_ContentPlaceHolder1_txtPassword']";
	static String reEnterPasswordField = "//input[@id='ctl00_ContentPlaceHolder1_txtReconfirmPassword']";
	// System Preferences
	static String selectContractorPkgListingPanelFirstOption = "//select[@id='ctl00_ContentPlaceHolder1_ddlContractorPackageListingOption1']";
	static String selectContractorPkgListingPanelSecondOption = "//select[@id='ctl00_ContentPlaceHolder1_ddlContractorPackageListingOption2']";
	static String profileSaveBtn = "//input[@id='ctl00_ContentPlaceHolder1_btnSaveProfile']";

	public static WebElement selectVideoForThemeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(selectVideoForThemeLink));
		return element;
	}

	public static WebElement companyName(WebDriver driver) {
		element = driver.findElement(By.xpath(companyName));
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

	public static WebElement phoneNo(WebDriver driver) {
		element = driver.findElement(By.xpath(phoneNo));
		return element;
	}

	public static WebElement faxNo(WebDriver driver) {
		element = driver.findElement(By.xpath(faxNo));
		return element;
	}

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.xpath(email));
		return element;
	}

	public static WebElement clickHeretoAddNewAddressLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHeretoAddNewAddressLink));
		return element;
	}

	public static WebElement selectAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAddress));
		return element;
	}

	public static WebElement fieldContactType(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldContactType));
		return element;
	}

	public static WebElement selectContactType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContactType));
		return element;
	}

	public static WebElement selectprofilePicture(WebDriver driver) {
		element = driver.findElement(By.xpath(selectprofilePicture));
		return element;
	}

	public static WebElement removeThemeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(removeThemeBtn));
		return element;
	}

	public static WebElement selectColorTheme(WebDriver driver) {
		element = driver.findElement(By.xpath(selectColorTheme));
		return element;
	}

	public static WebElement selectImageForThemeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(selectImageForThemeLink));
		return element;
	}

	public static WebElement selectImageForTheme(WebDriver driver) {
		element = driver.findElement(By.xpath(selectImageForTheme));
		return element;
	}

	public static WebElement selectImageForThemeCancelIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(selectImageForThemeCancelIcon));
		return element;
	}

	public static WebElement selectImageForThemeCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectImageForThemeCancelBtn));
		return element;
	}

	public static WebElement selectImageForThemeSelectBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectImageForThemeSelectBtn));
		return element;
	}

	public static WebElement selectVideoForTheme(WebDriver driver) {
		element = driver.findElement(By.xpath(selectVideoForTheme));
		return element;
	}

	public static WebElement selectVideoForThemeCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectVideoForThemeCancelBtn));
		return element;
	}

	public static WebElement selectVideoForThemeSelectBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(selectVideoForThemeSelectBtn));
		return element;
	}

	public static WebElement selectPaging(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPaging));
		return element;
	}

	public static WebElement selectTimeZone(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTimeZone));
		return element;
	}

	public static WebElement selectDefaultLandingPage(WebDriver driver) {
		element = driver.findElement(By.xpath(selectDefaultLandingPage));
		return element;
	}

	public static WebElement userNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(userNameField));
		return element;
	}

	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.xpath(passwordField));
		return element;
	}

	public static WebElement reEnterPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath(reEnterPasswordField));
		return element;
	}

	public static WebElement selectContractorPkgListingPanelFirstOption(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPkgListingPanelFirstOption));
		return element;
	}

	public static WebElement selectContractorPkgListingPanelSecondOption(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorPkgListingPanelSecondOption));
		return element;
	}

	public static WebElement profileSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(profileSaveBtn));
		return element;
	}

}
