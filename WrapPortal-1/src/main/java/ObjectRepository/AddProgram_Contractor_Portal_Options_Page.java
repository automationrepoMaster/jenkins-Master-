package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Contractor_Portal_Options_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String switchActivateContractorPortalForThisProgram = "//div[@id='uniform-chkContractorPortalAccess']//div[@class='inner']";
	static String switchContractorPortal_GC_SUBS_AllSwitchs = "//table[@class='table blueTable']/tbody/tr/td//div[@class='inner']";// list
	
	static String switchRequestSubinfoAtEnrollment = "//div[@id='uniform-chkRequestSubInfoatEnrollment']//div[@class='inner']";
	static String switchAllowContractorToAddSub = "//div[@id='uniform-chkAllowContractorToAddSub']//div[@class='inner']";
	static String switchRequireDocEnrollment = "//div[@id='uniform-chkProjectReqDocEnrollment']//div[@class='inner']";
	static String switchAllow_GC_AddContractorNumber = "//div[@id='uniform-chkAllowGCAdd']//div[@class='inner']";
	static String switchAllow_SubContractor_AddContractorNumber = "//div[@id='uniform-chkAllowSCAdd']//div[@class='inner']";
	static String switchAllow_GCandSubContractor_EditContractorNumber = "//div[@id='uniform-chkAllowGCandSCEdit']//div[@class='inner']";
	static String fieldURLProgram = "//input[@id='txtURLProject']";
	static String addLogoImg = "//img[@id='imgProjectLogo']";
	static String linkRemoveLogo = "//a[contains(text(),'Remove logo')]";
	static String linkBackgroundImage = "//img[@id='imgContractorLogo']";
	static String linkRemoveBackgroundImage = "//a[@id='aProjectBackImg']";

	static String contractorPortalBackButton = "//input[@id='btnBackCPOption']";
	static String contractorPortalSaveButton = "//input[@id='btnSaveCPOption']";
	static String contractorPortalSaveAndCloseButton = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String contractorPortalSaveAndContinueButton = "//input[@id='btnNextCPOption']";
	static String contractorPortalCloseButton = "//button[@class='btn']";

	public static List<WebElement> switchContractorPortal_GC_SUBS_AllSwitchs(WebDriver driver) {
		listElement = driver.findElements(By.xpath(switchContractorPortal_GC_SUBS_AllSwitchs));
		return listElement;
	}

	public static WebElement switchActivateContractorPortalForThisProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(switchActivateContractorPortalForThisProgram));
		return element;
	}

	public static WebElement switchRequestSubinfoAtEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(switchRequestSubinfoAtEnrollment));
		return element;
	}

	public static WebElement switchAllowContractorToAddSub(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllowContractorToAddSub));
		return element;
	}

	public static WebElement switchRequireDocEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(switchRequireDocEnrollment));
		return element;
	}

	public static WebElement switchAllow_GC_AddContractorNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllow_GC_AddContractorNumber));
		return element;
	}

	public static WebElement switchAllow_SubContractor_AddContractorNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllow_SubContractor_AddContractorNumber));
		return element;
	}

	public static WebElement switchAllow_GCandSubContractor_EditContractorNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAllow_GCandSubContractor_EditContractorNumber));
		return element;
	}

	public static WebElement fieldURLProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldURLProgram));
		return element;
	}

	public static WebElement addLogoImg(WebDriver driver) {
		element = driver.findElement(By.xpath(addLogoImg));
		return element;
	}

	public static WebElement linkRemoveLogo(WebDriver driver) {
		element = driver.findElement(By.xpath(linkRemoveLogo));
		return element;
	}

	public static WebElement linkBackgroundImage(WebDriver driver) {
		element = driver.findElement(By.xpath(linkBackgroundImage));
		return element;
	}

	public static WebElement linkRemoveBackgroundImage(WebDriver driver) {
		element = driver.findElement(By.xpath(linkRemoveBackgroundImage));
		return element;
	}

	public static WebElement contractorPortalBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPortalBackButton));
		return element;
	}

	public static WebElement contractorPortalSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPortalSaveButton));
		return element;
	}

	public static WebElement contractorPortalSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPortalSaveAndCloseButton));
		return element;
	}

	public static WebElement contractorPortalSaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPortalSaveAndContinueButton));
		return element;
	}

	public static WebElement contractorPortalCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPortalCloseButton));
		return element;
	}

}
