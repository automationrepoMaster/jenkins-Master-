package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_ChangrOrdr_Adjustment_Page 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String radioBtnChangeOrder ="//input[@id='cntrlChangeOrder_rdoChangeOrder']";
	static String radioBtnAdjustment="//input[@id='cntrlChangeOrder_rdoAdjustment']";
	static String fieldAdjustmentValue="//input[@id='cntrlChangeOrder_ctrlAdjustments_txtValue']";
	static String fieldAdjustmentDate="//input[@id='cntrlChangeOrder_ctrlAdjustments_txtAdjustmentDate']";
	static String checkBoxEstimatedCalculation="//input[@id='cntrlChangeOrder_ctrlAdjustments_chkEstimateCalc']";
	static String checkBoxToDateCalculation="//input[@id='cntrlChangeOrder_ctrlAdjustments_chkToDateCalc']";
	static String fieldDescription="//textarea[@id='cntrlChangeOrder_ctrlAdjustments_txtDescription']";
	static String checkBoxFlagThisPage="//input[@id='cntrlChangeOrder_ctrlAdjustments_ChkAction']";
	static String checkBoxMarkAsConfirm= "//input[@id='cntrlChangeOrder_ctrlAdjustments_chkConfirmation']";
//			"//input[@id='cntrlAdjustments_chkConfirmation']";
	static String closeButtonAdjustment="//span[@id='cntrlChangeOrder_ctrlAdjustments_divClose']//button[@class='btn'][contains(text(),'Close')]";
	static String saveAndCloseBtnAdjustment="//input[@id='cntrlChangeOrder_ctrlAdjustments_btnSaveandClose']";
	
	public static WebElement radioBtnChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnChangeOrder));
		return element;
	}public static WebElement radioBtnAdjustment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnAdjustment));
		return element;
	}public static WebElement fieldAdjustmentValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAdjustmentValue));
		return element;
	}public static WebElement fieldAdjustmentDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAdjustmentDate));
		return element;
	}public static WebElement checkBoxEstimatedCalculation(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxEstimatedCalculation));
		return element;
	}public static WebElement checkBoxToDateCalculation(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxToDateCalculation));
		return element;
	}public static WebElement fieldDescription(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldDescription));
		return element;
	}public static WebElement checkBoxFlagThisPage(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxFlagThisPage));
		return element;
	}public static WebElement checkBoxMarkAsConfirm(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxMarkAsConfirm));
		return element;
	}public static WebElement closeButtonAdjustment(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButtonAdjustment));
		return element;
	}public static WebElement saveAndCloseBtnAdjustment(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtnAdjustment));
		return element;
	}
	
}
