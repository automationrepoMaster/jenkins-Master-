package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_Closeout
{
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String closeOutDateField="//input[@id='cntrlCompletionNotice_TxtCloseoutDate']";
	static String closeOutDateSaveBtn="//input[@id='cntrlCompletionNotice_BtnSubmit']";
	
	static String companyName="//input[@id='cntrlCompletionNotice_txtAuditCompany']";
	static String IndividualName="//input[@id='cntrlCompletionNotice_txtAuditContact']";
	static String Telephone="//input[@id='cntrlCompletionNotice_txtAuditPhone']";
	static String Email="//input[@id='cntrlCompletionNotice_txtAuditEmail']";
	static String CheckBox="//input[@id='cntrlCompletionNotice_chkAgree']";
	static String saveAndCloseBtn="//input[@id='cntrlCompletionNotice_btnSaveandClose']";
	static String CloseBtn="//button[@id='cntrlCompletionNotice_divClose']";
	static String CloseOutAlertTextArea="//textarea[@id='cntrlCompletionNotice_txtInvalidExplanation']";
	static String CloseOutAlertSaveBtn="//a[@id='cntrlCompletionNotice_lbSaveNext']";
	
	
	public static WebElement closeOutDateSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeOutDateSaveBtn));
		return element;
	}
	public static WebElement closeOutDateField(WebDriver driver) {
		element = driver.findElement(By.xpath(closeOutDateField));
		return element;
	}public static WebElement companyName(WebDriver driver) {
		element = driver.findElement(By.xpath(companyName));
		return element;
	}public static WebElement IndividualName(WebDriver driver) {
		element = driver.findElement(By.xpath(IndividualName));
		return element;
	}public static WebElement Telephone(WebDriver driver) {
		element = driver.findElement(By.xpath(Telephone));
		return element;
	}public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.xpath(Email));
		return element;
	}public static WebElement CheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(CheckBox));
		return element;
	}public static WebElement saveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtn));
		return element;
	}public static WebElement CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtn));
		return element;
	}
	public static WebElement CloseOutAlertTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseOutAlertTextArea));
		return element;
	}public static WebElement CloseOutAlertSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseOutAlertSaveBtn));
		return element;
	}
	
	
}
