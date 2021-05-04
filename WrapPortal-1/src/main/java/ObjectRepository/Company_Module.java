package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Company_Module {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String myProfileToolTips = "//*[@oldtitle]";

	// Company Information
	static String company = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtCompanyName']";
	static String contact = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtContact']";
	static String phone = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtPhone']";
	static String fax = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtFax']";
	static String email = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtEmail']";
	// Portal Information
	static String URLContractorPortal = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtURL']";
	static String URLAdminPortal = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtUrlAP']";
	static String logo = "//img[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_imgClientLogo']";
	static String Removelogo = "//a[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_aRemoveClientLogo']";
	static String Reportlogo = "//img[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_imgLogo']";
	static String RemoveReportlogo = "//a[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_aRemoveLogo']";
	static String contractorThemeSet = "//ul[@id='theme']/li[1]";
	// Theme
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
	// Label
	static String labelProject = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl00_txtLabel']";
	static String labelWorksite = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl01_txtLabel']";
	static String labelTrade = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl02_txtLabel']";
	static String labelSponsor = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl03_txtLabel']";
	static String labelDivision = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl04_txtLabel']";
	static String labelLocation = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_rptLabel_ctl05_txtLabel']";
	// Address
	static String address1 = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtAddress1']";
	static String address2 = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtAddress2']";
	static String city = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtCity']";
	static String selectCountry = "//select[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_ddlCountry']";
	static String selectState = "//select[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_ddlState']";
	static String zipcode = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtZip']";
	// Global Setting
	static String switchAllowEnventLog = "//ul[@class='iosListing infoIcon']/li/div/div[@class='titles' and contains(text(),'Allow')]/..//*[@class='inner']";
	static String switchRequireDocumentsforEnrollment = "//ul[@class='iosListing infoIcon']/li/div/div[@class='titles' and contains(text(),'Require Documents for Enrollment')]/..//*[@class='inner']";
	static String switchShowDistrict = "//ul[@class='iosListing infoIcon']/li[3]//*[@class='inner']";
	static String switchShowTaskOnOpenActionItems = "//ul[@class='iosListing infoIcon']/li[4]//*[@class='inner']";
	static String switchAutoConfirmMonthlyPayroll = "//ul[@class='iosListing infoIcon']/li[5]//*[@class='inner']";
	static String switchAlertForAbnormalPayrollEntry = "//ul[@class='iosListing infoIcon']/li[6]//*[@class='inner']";
	static String alertForAbnormalPayrollLowerField = "//ul[@class='iosListing infoIcon']/li[7]//div[contains(text(),'Lower')]/../../div[2]/input";
	static String alertForAbnormalPayrollHigherField = "//ul[@class='iosListing infoIcon']/li[7]//div[contains(text(),'Higher')]/../../div[2]/input";
	static String switchShowPreBidContractorPackage = "//ul[@class='iosListing infoIcon']/li[8]//*[@class='inner']";
	static String switchTrackGLCode = "//ul[@class='iosListing infoIcon']/li[9]//*[@class='inner']";
	static String adminPasswordResetField = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtAdminPasswordResetDay']";
	static String contractorPasswordResetField = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_txtContractorPasswordResetDay']";
	static String companySaveBtn = "//input[@id='ctl00_ContentPlaceHolder1_cntGlobalSettings_btnSaveCompany']";

	public static List<WebElement> myProfileToolTips(WebDriver driver) {
		listElement = driver.findElements(By.xpath(myProfileToolTips));
		return listElement;
	}

	public static WebElement company(WebDriver driver) {
		element = driver.findElement(By.xpath(company));
		return element;
	}

	public static WebElement contact(WebDriver driver) {
		element = driver.findElement(By.xpath(contact));
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

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.xpath(email));
		return element;
	}

	public static WebElement URLContractorPortal(WebDriver driver) {
		element = driver.findElement(By.xpath(URLContractorPortal));
		return element;
	}

	public static WebElement URLAdminPortal(WebDriver driver) {
		element = driver.findElement(By.xpath(URLAdminPortal));
		return element;
	}

	public static WebElement logo(WebDriver driver) {
		element = driver.findElement(By.xpath(logo));
		return element;
	}

	public static WebElement Removelogo(WebDriver driver) {
		element = driver.findElement(By.xpath(Removelogo));
		return element;
	}

	public static WebElement Reportlogo(WebDriver driver) {
		element = driver.findElement(By.xpath(Reportlogo));
		return element;
	}

	public static WebElement RemoveReportlogo(WebDriver driver) {
		element = driver.findElement(By.xpath(RemoveReportlogo));
		return element;
	}

	public static WebElement contractorThemeSet(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorThemeSet));
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

	public static WebElement selectVideoForThemeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(selectVideoForThemeLink));
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

	public static WebElement labelProject(WebDriver driver) {
		element = driver.findElement(By.xpath(labelProject));
		return element;
	}

	public static WebElement labelWorksite(WebDriver driver) {
		element = driver.findElement(By.xpath(labelWorksite));
		return element;
	}

	public static WebElement labelTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(labelTrade));
		return element;
	}

	public static WebElement labelSponsor(WebDriver driver) {
		element = driver.findElement(By.xpath(labelSponsor));
		return element;
	}

	public static WebElement labelDivision(WebDriver driver) {
		element = driver.findElement(By.xpath(labelDivision));
		return element;
	}

	public static WebElement labelLocation(WebDriver driver) {
		element = driver.findElement(By.xpath(labelLocation));
		return element;
	}

	public static WebElement address1(WebDriver driver) {
		element = driver.findElement(By.xpath(address1));
		return element;
	}

	public static WebElement address2(WebDriver driver) {
		element = driver.findElement(By.xpath(address2));
		return element;
	}

	public static WebElement city(WebDriver driver) {
		element = driver.findElement(By.xpath(city));
		return element;
	}

	public static WebElement selectCountry(WebDriver driver) {
		element = driver.findElement(By.xpath(selectCountry));
		return element;
	}

	public static WebElement selectState(WebDriver driver) {
		element = driver.findElement(By.xpath(selectState));
		return element;
	}

	public static WebElement zipcode(WebDriver driver) {
		element = driver.findElement(By.xpath(zipcode));
		return element;
	}

	public static WebElement switchAllowEnventLog(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllowEnventLog));
		return element;
	}

	public static WebElement switchRequireDocumentsforEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(switchRequireDocumentsforEnrollment));
		return element;
	}

	public static WebElement switchShowDistrict(WebDriver driver) {
		element = driver.findElement(By.xpath(switchShowDistrict));
		return element;
	}

	public static WebElement switchShowTaskOnOpenActionItems(WebDriver driver) {
		element = driver.findElement(By.xpath(switchShowTaskOnOpenActionItems));
		return element;
	}

	public static WebElement switchAutoConfirmMonthlyPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAutoConfirmMonthlyPayroll));
		return element;
	}

	public static WebElement switchAlertForAbnormalPayrollEntry(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAlertForAbnormalPayrollEntry));
		return element;
	}

	public static WebElement alertForAbnormalPayrollLowerField(WebDriver driver) {
		element = driver.findElement(By.xpath(alertForAbnormalPayrollLowerField));
		return element;
	}

	public static WebElement alertForAbnormalPayrollHigherField(WebDriver driver) {
		element = driver.findElement(By.xpath(alertForAbnormalPayrollHigherField));
		return element;
	}

	public static WebElement switchShowPreBidContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(switchShowPreBidContractorPackage));
		return element;
	}

	public static WebElement switchTrackGLCode(WebDriver driver) {
		element = driver.findElement(By.xpath(switchTrackGLCode));
		return element;
	}

	public static WebElement adminPasswordResetField(WebDriver driver) {
		element = driver.findElement(By.xpath(adminPasswordResetField));
		return element;
	}

	public static WebElement contractorPasswordResetField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPasswordResetField));
		return element;
	}

	public static WebElement companySaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(companySaveBtn));
		return element;
	}

}
