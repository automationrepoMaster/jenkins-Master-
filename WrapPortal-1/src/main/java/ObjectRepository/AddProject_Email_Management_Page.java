package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Email_Management_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String saveAndContinueButton = "//input[@id='cntrWorkSiteAddUpdateEmail_btnNextGeneralInfomation']"; //input[@id='cntrWorkClassAddUpdate_btnSaveandClose']"; //input[@value='Save and Continue']";
	static String saveAndCloseButton = "//input[@value='Save and Close']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";
	static String projectLevelEmailManagementSwitch ="//div[@id='uniform-cntrWorkSiteAddUpdateEmail_chkWorksiteEmailAccess']//div[@class='inner']";
	
	public static WebElement projectLevelEmailManagementSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(projectLevelEmailManagementSwitch));
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
}
