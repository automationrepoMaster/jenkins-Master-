package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_AddCloseoutPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String closeoutDate = "//input[@id='txtCloseOutDate']";
	static String SaveBtn = "//*[@onclick='SaveCloseOutDate()']";
	static String changeCompletionDateBtn = "//a[@id='btnChangeDate']";
	static String totalActualCVField = "//input[@id='ActContrPrice']";
	static String totalActualSPCVField = "//input[@id='ActSelfValue']";
	static String totalActualSubContractorField = "//input[@id='ActSubContrCost']";
	static String auditCompanyName = "//input[@id='AuditCompany']";
	static String auditIndividual = "//input[@id='AuditContact']";
	static String auditTelephone = "//input[@id='AuditPhone']";
	static String auditEmail = "//input[@id='AuditEmail']";
	static String termsAndConditionCheckBox = "//label[@class='form-check-label']";
	static String CloseoutSaveBtn = "//a[@id='aSaveCompletionNotice']";
	static String CloseoutFailParameterAlertTextArea ="//textarea[@id='txtComment']";
	static String CloseoutFailParameterAlertSaveBtn ="//form[@id='frmCloseoutComment']//a[contains(text(),'Save')]";
	

	public static WebElement CloseoutFailParameterAlertTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseoutFailParameterAlertTextArea));
		return element;
	}
	public static WebElement CloseoutFailParameterAlertSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseoutFailParameterAlertSaveBtn));
		return element;
	}
	
	public static WebElement closeoutDate(WebDriver driver) {
		element = driver.findElement(By.xpath(closeoutDate));
		return element;
	}

	public static WebElement SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtn));
		return element;
	}

	public static WebElement changeCompletionDateBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(changeCompletionDateBtn));
		return element;
	}

	public static WebElement totalActualCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(totalActualCVField));
		return element;
	}

	public static WebElement totalActualSPCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(totalActualSPCVField));
		return element;
	}

	public static WebElement totalActualSubContractorField(WebDriver driver) {
		element = driver.findElement(By.xpath(totalActualSubContractorField));
		return element;
	}

	public static WebElement auditCompanyName(WebDriver driver) {
		element = driver.findElement(By.xpath(auditCompanyName));
		return element;
	}

	public static WebElement auditIndividual(WebDriver driver) {
		element = driver.findElement(By.xpath(auditIndividual));
		return element;
	}

	public static WebElement auditTelephone(WebDriver driver) {
		element = driver.findElement(By.xpath(auditTelephone));
		return element;
	}

	public static WebElement auditEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(auditEmail));
		return element;
	}

	public static WebElement termsAndConditionCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(termsAndConditionCheckBox));
		return element;
	}

	public static WebElement CloseoutSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseoutSaveBtn));
		return element;
	}

}
