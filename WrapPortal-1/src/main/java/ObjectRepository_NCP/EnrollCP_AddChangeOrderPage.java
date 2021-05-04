package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_AddChangeOrderPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String closeChangeOrderWindow="//div[@id='modal-change-order-list']//span[contains(text(),'×')]";
	static String addChangeOrderBtn="//a[@data-text='Add Change Order']";
	static String addChangeOrderClickHereLink="//a[contains(@class,'a-add-change-order')]";
	static String additionalContractValueField="//input[@id='ChangeContrPrice']";
	static String additionalSelfPerformedValueField="//input[@id='ChangeSelfValue']";
	static String additionalSubContractorCostField="//input[@id='ChangeSubContrCost']";
	
	static String addUncappedPayrollForWCClasCode="//td[contains(text(),'Additional Uncapped Payroll') and @class='openSans-medium']/..//following-sibling::tr[@class='bg-gray']/td[2]/input";//list
	static String effectiveDate="//input[@id='ApprovedDate']";
	static String newEstimatedCompletionDate="//input[@id='NewEstCompletionDate']";
	static String selectStatusField="//label[contains(text(),'Status')]/../div/input[@type='text']";
	static String selectStatusFromList="//label[contains(text(),'Status')]/../div/ul/li";//list
	static String changeOrderTypeInsurance="//label[contains(text(),'Insurance')]";
	static String changeOrderTypeConstruction="//label[contains(text(),'Construction')]";
	static String descriptionField="//textarea[@id='Description']";
	static String saveBtn="//a[@id='aSaveChangeOrder']";
	
	
	public static WebElement closeChangeOrderWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath(closeChangeOrderWindow));
		return element;
	}public static WebElement addChangeOrderBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(addChangeOrderBtn));
		return element;
	}public static WebElement addChangeOrderClickHereLink(WebDriver driver)
	{
		element=driver.findElement(By.xpath(addChangeOrderClickHereLink));
		return element;
	}public static WebElement additionalContractValueField(WebDriver driver)
	{
		element=driver.findElement(By.xpath(additionalContractValueField));
		return element;
	}public static WebElement additionalSelfPerformedValueField(WebDriver driver)
	{
		element=driver.findElement(By.xpath(additionalSelfPerformedValueField));
		return element;
	}public static WebElement additionalSubContractorCostField(WebDriver driver)
	{
		element=driver.findElement(By.xpath(additionalSubContractorCostField));
		return element;
	}public static List<WebElement> addUncappedPayrollForWCClasCode(WebDriver driver)
	{
		listElement=driver.findElements(By.xpath(addUncappedPayrollForWCClasCode));
		return listElement;
	}public static WebElement effectiveDate(WebDriver driver)
	{
		element=driver.findElement(By.xpath(effectiveDate));
		return element;
	}public static WebElement newEstimatedCompletionDate(WebDriver driver)
	{
		element=driver.findElement(By.xpath(newEstimatedCompletionDate));
		return element;
	}public static WebElement selectStatusField(WebDriver driver)
	{
		element=driver.findElement(By.xpath(selectStatusField));
		return element;
	}public static List<WebElement> selectStatusFromList(WebDriver driver)
	{
		listElement=driver.findElements(By.xpath(selectStatusFromList));
		return listElement;
	}public static WebElement changeOrderTypeInsurance(WebDriver driver)
	{
		element=driver.findElement(By.xpath(changeOrderTypeInsurance));
		return element;
	}public static WebElement changeOrderTypeConstruction(WebDriver driver)
	{
		element=driver.findElement(By.xpath(changeOrderTypeConstruction));
		return element;
	}public static WebElement descriptionField(WebDriver driver)
	{
		element=driver.findElement(By.xpath(descriptionField));
		return element;
	}public static WebElement saveBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(saveBtn));
		return element;
	}
	
	
}
