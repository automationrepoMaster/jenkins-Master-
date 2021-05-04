package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_User_Access {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String addSponsorAddButton = "//input[@id='btnQuickOwnerAdd']";
	static String selectSponsorDropdown = "//select[@id='ddlOtherOwners']";//list
	static String addSponsorPlusButton = "//a[@title='Add']";
	static String addAdditionalSponsorLink = "//a[@class='alinkText']";
	static String inviteSponsorFirstLink = "//tr[1]//td[2]//a[1]";
	static String inviteSponsorSecondLink = "//tr[2]//td[2]//a[1]";
	static String inviteSponsorThirdLink = "//tr[3]//td[2]//a[1]";
	static String deleteSecondSponsorIcon = "//td[@id='rptOtherOwners_ctl01_divWorkSiteDelete']//i[@class='fa fa-trash-o']";
	static String deleteThirdSponsorIcon = "//td[@id='rptOtherOwners_ctl02_divWorkSiteDelete']//i[@class='fa fa-trash-o']";

	static String addAdministratorAddButton = "//input[@id='btnQuickNodeAdministratorAdd']";
	static String selectNodeAdministratorDropdown = "//select[@id='ddlOtherNodeAdmininstrator']";//list
	static String addAdministratorPlusButton = "//a[@id='btnAddOtherNodeAdministrator']";
	static String addAdditionalNodeAdministratorLink = "//a[@class='alinkText']";
	static String deleteSecondAdministratorIcon = "//td[@id='rptOtherNodeAdministrator_ctl01_divWorkSiteDelete']//i[@class='fa fa-trash-o']";
	static String selectLoginCheckBox = "//div[@id='UpdatePanel1']//table[@class='table grayTableDotted']/tbody/tr[2]/td[2]//input[@type='checkbox']";
	static String selectReceiveNotificationEmailCheckBox = "//div[@id='UpdatePanel1']//table[@class='table grayTableDotted']/tbody/tr[2]/td[3]//input[@type='checkbox']";
	static String selectReceiveAutoEmailCheckBox = "//div[@id='UpdatePanel1']//table[@class='table grayTableDotted']/tbody/tr[2]/td[4]//input[@type='checkbox']";
	static String selectOpenActionItemCheckBox = "//div[@id='UpdatePanel1']//table[@class='table grayTableDotted']/tbody/tr[2]/td[5]//input[@type='checkbox']";

	static String userAccessCloseButton = "//button[@class='btn']";
	static String userAccessPortalBackButton = "//input[@id='btnBackCPOption']";
	static String userAccessPortalSaveAndContinueButton = "//input[@value='Save and Continue']";
	static String userAccessFinishAndCloseButton = "//input[@id='btnSaveandCloseGeneralInformation']";

	public static WebElement addSponsorAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorAddButton));
		return element;
	}

	public static WebElement selectSponsorDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSponsorDropdown));
		return element;
	}

	public static WebElement addSponsorPlusButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addSponsorPlusButton));
		return element;
	}

	public static WebElement addAdditionalSponsorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdditionalSponsorLink));
		return element;
	}

	public static WebElement inviteSponsorFirstLink(WebDriver driver) {
		element = driver.findElement(By.xpath(inviteSponsorFirstLink));
		return element;
	}

	public static WebElement inviteSponsorSecondLink(WebDriver driver) {
		element = driver.findElement(By.xpath(inviteSponsorSecondLink));
		return element;
	}

	public static WebElement inviteSponsorThirdLink(WebDriver driver) {
		element = driver.findElement(By.xpath(inviteSponsorThirdLink));
		return element;
	}

	public static WebElement deleteSecondSponsorIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteSecondSponsorIcon));
		return element;
	}

	public static WebElement deleteThirdSponsorIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteThirdSponsorIcon));
		return element;
	}

	public static WebElement addAdministratorAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdministratorAddButton));
		return element;
	}

	public static WebElement selectNodeAdministratorDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(selectNodeAdministratorDropdown));
		return element;
	}

	public static WebElement addAdministratorPlusButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdministratorPlusButton));
		return element;
	}

	public static WebElement addAdditionalNodeAdministratorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdditionalNodeAdministratorLink));
		return element;
	}

	public static WebElement deleteSecondAdministratorIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteSecondAdministratorIcon));
		return element;
	}

	public static WebElement selectLoginCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLoginCheckBox));
		return element;
	}

	public static WebElement selectReceiveNotificationEmailCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectReceiveNotificationEmailCheckBox));
		return element;
	}

	public static WebElement selectReceiveAutoEmailCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectReceiveAutoEmailCheckBox));
		return element;
	}

	public static WebElement selectOpenActionItemCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectOpenActionItemCheckBox));
		return element;
	}

	public static WebElement userAccessCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(userAccessCloseButton));
		return element;
	}

	public static WebElement userAccessPortalBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(userAccessPortalBackButton));
		return element;
	}

	public static WebElement userAccessPortalSaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(userAccessPortalSaveAndContinueButton));
		return element;
	}

	public static WebElement userAccessFinishAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(userAccessFinishAndCloseButton));
		return element;
	}

}
