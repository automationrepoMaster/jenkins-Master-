package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Enrollment_Setup_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String saveAndContinueButton = "//input[@value='Save and Continue']";
	static String saveAndCloseButton = "//input[@value='Save and Close']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";

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
	
//Add New Document to the list	19/08/2020
	static String addNewdocumentToTheListLink ="//a[contains(text(),'Add new document to this list')]";
	static String NewdocumentName ="//input[@id='txtRequriedDocumentName']";
	static String NewdocumentNameSaveAndCloseBtn ="//input[@id='btnSaveDcoument']";
	
	static String addNewContactTypeToThisListLink ="//a[contains(text(),'Add new contact type to this list')]";
	static String addContactTypeLink ="//a[@class='panelinfoIcon']";
	static String addContactTypeNameField="//input[@id='txtContactTypeName']";
	static String addContactTypeDescriptionField="//textarea[@id='txtDescription']";
	static String addContactTypeSaveAndClose="//input[@id='btnSaveDcoument']";
	static String addContactTypeListCloseBtn="//button[contains(text(),'Close')]";
	
	public static WebElement addNewdocumentToTheListLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewdocumentToTheListLink));
		return element;
	}

	public static WebElement NewdocumentName(WebDriver driver) {
		element = driver.findElement(By.xpath(NewdocumentName));
		return element;
	}

	public static WebElement NewdocumentNameSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NewdocumentNameSaveAndCloseBtn));
		return element;
	}
	
	public static WebElement addNewContactTypeToThisListLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactTypeToThisListLink));
		return element;
	}public static WebElement addContactTypeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addContactTypeLink));
		return element;
	}public static WebElement addContactTypeNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addContactTypeNameField));
		return element;
	}public static WebElement addContactTypeDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addContactTypeDescriptionField));
		return element;
	}public static WebElement addContactTypeSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(addContactTypeSaveAndClose));
		return element;
	}public static WebElement addContactTypeListCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addContactTypeListCloseBtn));
		return element;
	}

	
	
	
}
