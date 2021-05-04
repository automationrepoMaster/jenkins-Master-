package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Contact_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String nextButton = "//input[@value='Next']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";

//Link Contact Link Functionlity 17/08/20
	static String linkContactsLink = "//a[contains(text(),'Link Contacts')]";
	static String linkContactSearchButton ="//input[@id='btnAdvanceSearch']";
	static String linkContactAdvSearchArrow ="//input[@id='btnAdvanceSearch']/../a/i";
	static String linkContactSelectProgramFromDropDown ="//select[@id='ctrlSelect_ddlProject']";
	static String linkContactSelectProjectFromDropDown ="//iframe[@name='_iframe-EmailBox12']";
	static String linkContactSelectTradeFromDropDown ="//select[@id='ctrlSelect_ddlTradePackages']";
	static String linkContactAdvSearchCloseBtn ="//a[@class='btn fltr']";
	static String linkContactAdvSearchSeeMoreLink ="//a[@id='aSeeMore']";
	
	static String selectAllContactorCheckBox="//input[@id='chkSelectAll']";
	static String selectFirstContactorFrmListCheckBox="//ul[@id='divNoteList']/li[1]//input[@type='checkbox']";
	static String linkContactSelectBtn="//input[@id='ctrlSelect_btnUserSelect']";
	static String linkContactCloseBtn="//button[@id='ctrlSelect_btnCancel']";
	
	
	public static WebElement linkContactsLink(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactsLink));
		return element;
	}public static WebElement linkContactSearchButton(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactSearchButton));
		return element;
	}public static WebElement linkContactAdvSearchArrow(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactAdvSearchArrow));
		return element;
	}public static WebElement linkContactSelectProgramFromDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactSelectProgramFromDropDown));
		return element;
	}public static WebElement linkContactSelectProjectFromDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactSelectProjectFromDropDown));
		return element;
	}public static WebElement linkContactSelectTradeFromDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactSelectTradeFromDropDown));
		return element;
	}public static WebElement linkContactAdvSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactAdvSearchCloseBtn));
		return element;
	}public static WebElement selectAllContactorCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAllContactorCheckBox));
		return element;
	}public static WebElement selectFirstContactorFrmListCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstContactorFrmListCheckBox));
		return element;
	}public static WebElement linkContactSelectBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactSelectBtn));
		return element;
	}public static WebElement linkContactCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactCloseBtn));
		return element;
	}
	public static WebElement linkContactAdvSearchSeeMoreLink(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContactAdvSearchSeeMoreLink));
		return element;
	}
	static String addNewContactsLink = "//a[contains(text(),'Add New Contacts')]";
	static String addNewContactsCompanyName = "//input[@id='txtCompanyName']";
	static String addNewContactsFirstName = "//input[@id='txtFirstName']";
	static String addNewContactsMiddleName = "//input[@id='txtMiddleName']";
	static String addNewContactsLastName = "//input[@id='txtLastName']";
	static String addNewContactsDisplayAs = "//input[@id='txtDisplayAs']";
	static String addNewContactsJobTitle = "//input[@id='txtJobTitle']";
	static String addNewContactsSelectAddress = "//select[@id='ddlAddress']";
	static String addNewContactsSelectSecurityGroup = "//select[@id='ddlSecurity']";
	
	static String sameCompanyExistAlertOkBtn ="//button[@class='btn btn-primary pull-right']";
	static String addNewContactsPhoneNo = "//input[@id='txtPhone']";
	static String addNewContactsMobileNo = "//input[@id='txtMobile']";
	static String addNewContactsEmail = "//input[@id='txtEmail']";
	static String addNewContactsType = "//input[@id='s2id_autogen1']";

	static String addNewContactsGeneralInfoTabSaveButton = "//input[@value='Save']";
	static String addNewContactsGeneralInfoTabSaveandCloseButton = "//input[@value='Save and Close']";
	static String addNewContactsGeneralInfoTabSaveandContinueButton = "//input[@value='Save and Continue']";

	static String addNewContactsUserAccessTab = "//a[contains(text(),'User Access')]";
	static String addNewContactsGrantUserAccessCheckBox = "//input[@id='chkUserAccess']";
	static String addNewContactsUserAccessAccountSetupCompleteCheckBox = "//input[@id='chkAccountSetupComplete']";
	static String addNewContactsUserAccessAutoGenerateButton = "//a[@id='aAutoGenerate']";
	static String addNewContactsUserAccessUserName ="//input[@id='txtUserName']";

	static String addNewContactsFromDateRestriction = "//input[@id='txtFrom']";
	static String addNewContactsToDateRestriction = "//input[@id='txtTo']";
	static String addNewContactsDateRestrictionAddButton = "//a[@id='btnAdd']";
	static String addNewContactsUserAccessTabSaveButton = "//input[@value='Save']";
	static String addNewContactsUserAccessTabSaveandCloseButton = "//input[@value='Save and Close']";

	static String allContactslist = "//div[@id='divContactList']/table[@class='table blueTable']//tr[*]/td";// list

	
	public static WebElement sameCompanyExistAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sameCompanyExistAlertOkBtn));
		return element;
	}
	public static WebElement addNewContactsUserAccessUserName(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessUserName));
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


	public static WebElement addNewContactsLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsLink));
		return element;
	}

	public static WebElement addNewContactsCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsCompanyName));
		return element;
	}

	public static WebElement addNewContactsFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsFirstName));
		return element;
	}

	public static WebElement addNewContactsMiddleName(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsMiddleName));
		return element;
	}

	public static WebElement addNewContactsLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsLastName));
		return element;
	}

	public static WebElement addNewContactsDisplayAs(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsDisplayAs));
		return element;
	}

	public static WebElement addNewContactsJobTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsJobTitle));
		return element;
	}

	public static WebElement addNewContactsSelectAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsSelectAddress));
		return element;
	}

	public static WebElement addNewContactsSelectSecurityGroup(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsSelectSecurityGroup));
		return element;
	}

	public static WebElement addNewContactsPhoneNo(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsPhoneNo));
		return element;
	}

	public static WebElement addNewContactsMobileNo(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsMobileNo));
		return element;
	}

	public static WebElement addNewContactsEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsEmail));
		return element;
	}

	public static WebElement addNewContactsType(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsType));
		return element;
	}

	public static WebElement addNewContactsGeneralInfoTabSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsGeneralInfoTabSaveButton));
		return element;
	}

	public static WebElement addNewContactsGeneralInfoTabSaveandCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsGeneralInfoTabSaveandCloseButton));
		return element;
	}

	public static WebElement addNewContactsGeneralInfoTabSaveandContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsGeneralInfoTabSaveandContinueButton));
		return element;
	}

	public static WebElement addNewContactsUserAccessTab(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessTab));
		return element;
	}

	public static WebElement addNewContactsGrantUserAccessCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsGrantUserAccessCheckBox));
		return element;
	}

	public static WebElement addNewContactsUserAccessAccountSetupCompleteCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessAccountSetupCompleteCheckBox));
		return element;
	}

	public static WebElement addNewContactsUserAccessAutoGenerateButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessAutoGenerateButton));
		return element;
	}

	public static WebElement addNewContactsFromDateRestriction(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsFromDateRestriction));
		return element;
	}

	public static WebElement addNewContactsToDateRestriction(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsToDateRestriction));
		return element;
	}

	public static WebElement addNewContactsDateRestrictionAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsDateRestrictionAddButton));
		return element;
	}

	public static WebElement addNewContactsUserAccessTabSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessTabSaveButton));
		return element;
	}

	public static WebElement addNewContactsUserAccessTabSaveandCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactsUserAccessTabSaveandCloseButton));
		return element;
	}

	public static List<WebElement> allContactslist(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allContactslist));
		return listElement;
	}

}
