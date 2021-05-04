package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Claims_Page 
{
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String selectYourLossRunSheets = "//input[@id='fluUpload1']";
	static String uploadButton ="//input[@id='btnUpload']";
	static String cliamsToDateFetchAllValues ="//table[@class='table blueTable']/tbody/tr[*]/td[*]";
	
	static String  closeBtn="//button[@class='btn']";
	static String  backBtn="//input[@value='Back']";
	static String  saveAndCloseBtn="//input[@value='Save and Close']";
	static String  saveAndContinueBtn="//input[@title='Save and Continue']";
	
	static String programFixedCostsInvoiceNumber = "//input[@id='txtTempInvoiceNumber']";
	static String AddCliamsPlusBtn="//input[@id='fluUpload1']";
	static String AddCliamsUploadBtn="//input[@id='btnUpload']";
	
	
	public static WebElement closeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeBtn));
		return element;
	}
	public static WebElement backBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(backBtn));
		return element;
	}
	public static WebElement saveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtn));
		return element;
	}public static WebElement saveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueBtn));
		return element;
	}
	
	
}
