package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Email_Management_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String emailManagementSelectAllCheckBox = "//div[@class='row']//div[1]//div[1]//div[2]//div[1]//table[1]/tbody/tr[*]/td//input[@type='checkbox']";// list
	static String lossControllEmailManagementSelectAllCheckBox = "//div[@id='divLossControlEmail']//table[@class='table blueTable']/tbody/tr/td//input[@type='checkbox']";// list

	static String emailManagementBackButton = "//input[@id='btnBackEmailManagement']";
	static String emailManagementSaveButton = "//input[@id='btnSaveGeneralInformation']";
	static String emailManagementSaveAndCloseButton = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String emailManagementSaveAndContinueButton = "//input[@id='btnNextGeneralInfomation']";
	static String emailManagementCloseButton = "//button[@class='btn']";

	public static List<WebElement> emailManagementSelectAllCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(emailManagementSelectAllCheckBox));
		return listElement;
	}

	public static List<WebElement> lossControllEmailManagementSelectAllCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(lossControllEmailManagementSelectAllCheckBox));
		return listElement;
	}

	public static WebElement emailManagementBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(emailManagementBackButton));
		return element;
	}

	public static WebElement emailManagementSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(emailManagementSaveButton));
		return element;
	}

	public static WebElement emailManagementSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(emailManagementSaveAndCloseButton));
		return element;
	}

	public static WebElement emailManagementSaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(emailManagementSaveAndContinueButton));
		return element;
	}

	public static WebElement emailManagementCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(emailManagementCloseButton));
		return element;
	}
	
	
	//Raja 
	
	static String AssignedStatusFollowup_EmailFeild ="//td/input[@id='dgEmailsAutomated_ctl00_txtOther']";
	
	public static WebElement  AssignedStatusFollowup_EmailFeild(WebDriver driver) {
		 element = driver.findElement(By.xpath(AssignedStatusFollowup_EmailFeild));
		return element ;
		
	}

}
