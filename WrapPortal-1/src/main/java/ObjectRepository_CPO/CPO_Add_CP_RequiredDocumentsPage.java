package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_RequiredDocumentsPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String btnClose = "//button[@id='ctrlProofofInsurance_divClose']";
	static String btnSaveAndContinue = "//a[contains(text(),'Save and Continue')]";
//			+ "//a[@id='ctrlProofofInsurance_btnNext']";
	static String btnSaveAndContinueSubContractor = "//input[@value='Save and Continue']";
	
	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}
	public static WebElement btnSaveAndContinueSubContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinueSubContractor));
		return element;
	}
}
