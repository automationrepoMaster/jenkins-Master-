package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsModules {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String profileDropDown = "//img[@id='ctl00_ctrlHeader_imgAvatars']";
	static String settingsModuleButton =  "//li[@class='dropdown user open']/ul/li[1]";
	static String settingsLogoutButton = "//li[@class='dropdown user open']/ul/li[2]";
	static String settingsMenuMyProfileModule = "//ul[@class='ulGreedy clearfix']/li[1]";
	static String settingsMenuCompanyModule = "//ul[@class='ulGreedy clearfix']/li[2]";
	static String settingsMenuSecurityGroupsModule = "//ul[@class='ulGreedy clearfix']/li[3]";
	static String settingsMenuUsersModule = "//ul[@class='ulGreedy clearfix']/li[4]";
	static String settingsMenuEmailsModule = "//ul[@class='ulGreedy clearfix']/li[5]";
	static String settingsMenuFaxesModule = "//ul[@class='ulGreedy clearfix']/li[6]";
	static String settingsMenuMySponsorsModule = "//ul[@class='ulGreedy clearfix']/li[7]";
	static String settingsMenuProgramsModule = "//ul[@class='ulGreedy clearfix']/li[8]";
	static String settingsMenuDivisionsModule = "//ul[@class='ulGreedy clearfix']/li[9]";
	static String settingsMenuProjectModule = "//ul[@class='ulGreedy clearfix']/li[10]";
	static String settingsMenuClassCodeModule = "//ul[@class='ulGreedy clearfix']/li[11]";
	static String settingsMenuTradesModule = "//ul[@class='ulGreedy clearfix']/li[12]";
	static String settingsMenuCarriersModule = "//ul//li//a[text()='Carriers']";
	static String settingsMenuCategoriesModule = "//ul[@class='ulGreedy clearfix']/li[14]";
	static String settingsMenuCustomFieldsModule = "//ul[@class='ulGreedy clearfix']/li[15]";
	static String settingsMenuMoreModule = "//ul[@class='ulGreedy clearfix']/li[16]";

	// Raja write this 2  Xpaths  and WebElement return methods == 

	static String profileDropDownArrowDown = "//li[@class='dropdown user']//a[@class='dropdown-toggle avatar']//i";
	static String SettingsModuleBtn="//ul[@class='dropdown-menu']/li/a/i[@class='icon16 i-cogs']";

	public static WebElement profileDropDownArrowDown(WebDriver driver) {
		element = driver.findElement(By.xpath(profileDropDownArrowDown));
		return element;
	}
	
	public static WebElement SettingsModuleBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SettingsModuleBtn));
		return element;
	}

	// a[@id='ctl00_ContentPlaceHolder1_ctrlGeneratSetting_aMyProfile']
	// a[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ctrlGeneratSetting_aCompany']

	static String myProfileToolTips = "//a[@oldtitle]";

	public static List<WebElement> myProfileToolTips(WebDriver driver) {
		listElement = driver.findElements(By.xpath(myProfileToolTips));
		return listElement;
	}

	public static WebElement profileDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(profileDropDown));
		return element;
	}
	
	
	public static WebElement settingsModuleButton(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsModuleButton));
		return element;
	}

	public static WebElement settingsLogoutButton(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsLogoutButton));
		return element;
	}

	public static WebElement settingsMenuMyProfileModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuMyProfileModule));
		return element;
	}

	public static WebElement settingsMenuCompanyModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuCompanyModule));
		return element;
	}

	public static WebElement settingsMenuSecurityGroupsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuSecurityGroupsModule));
		return element;
	}

	public static WebElement settingsMenuUsersModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuUsersModule));
		return element;
	}

	public static WebElement settingsMenuEmailsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuEmailsModule));
		return element;
	}

	public static WebElement settingsMenuFaxesModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuFaxesModule));
		return element;
	}

	public static WebElement settingsMenuMySponsorsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuMySponsorsModule));
		return element;
	}

	public static WebElement settingsMenuProgramsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuProgramsModule));
		return element;
	}

	public static WebElement settingsMenuDivisionsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuDivisionsModule));
		return element;
	}

	public static WebElement settingsMenuProjectModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuProjectModule));
		return element;
	}

	public static WebElement settingsMenuClassCodeModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuClassCodeModule));
		return element;
	}

	public static WebElement settingsMenuTradesModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuTradesModule));
		return element;
	}

	public static WebElement settingsMenuCarriersModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuCarriersModule));
		return element;
	}

	public static WebElement settingsMenuCategoriesModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuCategoriesModule));
		return element;
	}

	public static WebElement settingsMenuCustomFieldsModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuCustomFieldsModule));
		return element;
	}

	public static WebElement settingsMenuMoreModule(WebDriver driver) {
		element = driver.findElement(By.xpath(settingsMenuMoreModule));
		return element;
	}

}
