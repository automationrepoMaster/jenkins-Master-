package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Project_Administrator_Access_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String projectAdminAccessSwitch = "//div[@class='inner']";
	static String clickHereToAddAdminAccessLink = "//input[@id='cntrWorkSiteAddUpdateAdministrator_Button2']";
	static String selectNodeAdminFromDdropdown = "//select[@id='cntrWorkSiteAddUpdateAdministrator_ddlOtherNodeAdmininstrator']";// dropdown
	static String selectNodeAdminAddButton = "//a[@id='cntrWorkSiteAddUpdateAdministrator_btnAddOtherNodeAdministrator']";
	static String fetchNodeAdminName = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[1]";
	static String loginCheckBox = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[2]/div";
	static String reciveSystemNotificationEmailCheckBox = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[3]/div";
	static String reciveAutomatedEmailCheckBox = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[4]/div";
	static String openActionItemCheckBox = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[5]/div";
	static String deleteNodeAdmin = "//table[@class='table grayTableDotted']//tbody/tr[1]/td[6]/div";

	static String projectAdminAccessAddButton = "//input[@value='Add']";
	static String projectAddNewAdditionalNodeAdminLink ="//a[@class='alinkText']";
	
	
	static String saveAndContinueButton = "//input[@value='Save and Continue']";
	static String saveAndCloseButton = "//input[@value='Save and Close']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";

	public static WebElement projectAddNewAdditionalNodeAdminLink(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAddNewAdditionalNodeAdminLink));
		return element;
	}
	public static WebElement projectAdminAccessSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdminAccessSwitch));
		return element;
	}
	public static WebElement clickHereToAddAdminAccessLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereToAddAdminAccessLink));
		return element;
	}

	public static WebElement selectNodeAdminFromDdropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectNodeAdminFromDdropdown));
		return element;
	}

	public static WebElement selectNodeAdminAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(selectNodeAdminAddButton));
		return element;
	}

	public static WebElement fetchNodeAdminName(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchNodeAdminName));
		return element;
	}

	public static WebElement loginCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(loginCheckBox));
		return element;
	}

	public static WebElement reciveSystemNotificationEmailCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(reciveSystemNotificationEmailCheckBox));
		return element;
	}

	public static WebElement reciveAutomatedEmailCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(reciveAutomatedEmailCheckBox));
		return element;
	}

	public static WebElement openActionItemCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(openActionItemCheckBox));
		return element;
	}

	public static WebElement deleteNodeAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteNodeAdmin));
		return element;
	}

	public static WebElement projectAdminAccessAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdminAccessAddButton));
		return element;
	}

	public static WebElement saveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueButton));
		return element;
	}

	public static WebElement saveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseButton));
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
	
//Link Add New Admin 19/08/20
	
	static String contractorCompanyNameField = "//input[@id='token-input-txtSubCompanyName']";
	static String contactFirstName = "//input[@id='txtSubContratorFirstName']";
	static String contactLastName = "//input[@id='txtSubContractorLastName']";
	static String contactEmail = "//input[@id='txtSubContractorEmail']";
	static String contactCellPhone = "//input[@id='txtSubContractorPhone']";
	static String MoreButton = "//a[@id='divAdvance']";
	static String jobTitle = "//input[@id='txtJobTitle']";
	static String businessPhone = "//input[@id='txtBusinessPhone']";
	static String businessFax = "//input[@id='txtBusinessFax']";
	static String addContractorSaveAndCloseButton = "//button[@class='btn btn-success']";	
	
	public static WebElement contractorCompanyNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorCompanyNameField));
		return element;
	}public static WebElement contactFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactFirstName));
		return element;
	}public static WebElement contactLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(contactLastName));
		return element;
	}public static WebElement contactEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(contactEmail));
		return element;
	}public static WebElement contactCellPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(contactCellPhone));
		return element;
	}public static WebElement MoreButton(WebDriver driver) {
		element = driver.findElement(By.xpath(MoreButton));
		return element;
	}public static WebElement jobTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(jobTitle));
		return element;
	}public static WebElement businessPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(businessPhone));
		return element;
	}public static WebElement businessFax(WebDriver driver) {
		element = driver.findElement(By.xpath(businessFax));
		return element;
	}public static WebElement addContractorSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addContractorSaveAndCloseButton));
		return element;
	}
	
	

}
