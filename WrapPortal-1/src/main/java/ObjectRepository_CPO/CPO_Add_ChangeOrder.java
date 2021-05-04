package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_ChangeOrder
{
	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String additionalContractValueField="//input[@id='cntrlChangeOrder_txtContractPriceValue']";
	static String additionalSelfPerformContractValueField="//input[@id='cntrlChangeOrder_txtSelfValueChange']";
	static String additionalSubContractorCostField="//input[@id='cntrlChangeOrder_txtSubContractorCost']";
	static String payrollAndHoursFields="//span[@id='cntrlChangeOrder_spnTotalAdditionalPayrollHeader']/../../following-sibling::tr[@class='trgrayLight']/td[2]//input";//list
	static String effectiveDate="//input[@id='cntrlChangeOrder_txtEffectiveDate']";
	static String newEstCompletionDate="//input[@id='cntrlChangeOrder_txtCompletionDate']";
	static String descriptionField="//textarea[@id='cntrlChangeOrder_txtDescription']";
	static String nextBtn="//input[@id='cntrlChangeOrder_btnSaveandClose']";
	static String closeBtn="//button[@class='btn']";
	
	public static WebElement additionalContractValueField(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalContractValueField));
		return element;
	}public static WebElement additionalSelfPerformContractValueField(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalSelfPerformContractValueField));
		return element;
	}public static WebElement additionalSubContractorCostField(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalSubContractorCostField));
		return element;
	}public static List<WebElement> payrollAndHoursFields(WebDriver driver) {
		listElement = driver.findElements(By.xpath(payrollAndHoursFields));
		return listElement;
	}public static WebElement effectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(effectiveDate));
		return element;
	}public static WebElement newEstCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(newEstCompletionDate));
		return element;
	}public static WebElement descriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionField));
		return element;
	}public static WebElement nextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(nextBtn));
		return element;
	}public static WebElement closeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeBtn));
		return element;
	}
	
	
	
	
}