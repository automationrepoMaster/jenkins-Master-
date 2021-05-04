package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_AddSubContractorPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String closeSubContractorWindow="//button[contains(@class,'close sub-contractor-modal-close')]/span";
	static String addSubContractorsBtn="//div[@id='modal-contractor-package-sub-contractor-data']//h5[@id='exampleModalLabel']/../../div[2]/a";
	static String subcontractorsInfo="//div[contains(@class,'subcontractor-list')]/div/div[2]/div/div[*]";//list
	static String subcontractorsNameList="//div[contains(@class,'subcontractor-list')]/div/div[1]//h6";//list
	
	public static WebElement closeSubContractorWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath(closeSubContractorWindow));
		return element;
	}
	public static WebElement addSubContractorsBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(addSubContractorsBtn));
		return element;
	}public static List<WebElement> subcontractorsInfo(WebDriver driver)
	{
		listElement=driver.findElements(By.xpath(subcontractorsInfo));
		return listElement;
	}
	public static List<WebElement> subcontractorsNameList(WebDriver driver)
	{
		listElement=driver.findElements(By.xpath(subcontractorsNameList));
		return listElement;
	}
	
	// SubContractor Cost Page
	static String subContractorCostAddNewContractorLink = "//a[contains(@class,'link-text')]";
	static String subContractorCostSearchContractorField = "//input[@id='token-input-ContractorIdEncrypted']";//"//label[contains(text(),'Contractor Name')]/../input";
	static String subContractorCostSelectContractorFromList = "//label[contains(text(),'Contractor Name')]/../ul/li";// list
	static String subContractorCostContractorNoField = "//div[@id='divContractNumber']//label[contains(text(),'Contract Number')]";
	static String subContractorCostTradeField = "//input[@id='token-input-TradeIdEncrypted']";
	static String subContractorCostSelectTradeFromList = "//input[@id='token-input-TradeIdEncrypted']/..";// ;list
	static String subContractorCostEstmitedStartDate = "//input[@id='ContrPackageStartDate']";
	static String subContractorCostSaveBtn = "//*[contains(text(),'Save a Subcontractor')]";
	static String subContractorCostContractvalueField ="//input[@id='ContractorValue']";
	
	public static WebElement subContractorCostContractvalueField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostContractvalueField));
		return element;
	}
	public static WebElement subContractorCostAddNewContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostAddNewContractorLink));
		return element;
	}

	public static WebElement subContractorCostSearchContractorField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostSearchContractorField));
		return element;
	}

	public static List<WebElement> subContractorCostSelectContractorFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(subContractorCostSelectContractorFromList));
		return listElement;
	}

	public static WebElement subContractorCostContractorNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostContractorNoField));
		return element;
	}

	public static WebElement subContractorCostTradeField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostTradeField));
		return element;
	}

	public static List<WebElement> subContractorCostSelectTradeFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(subContractorCostSelectTradeFromList));
		return listElement;
	}

	public static WebElement subContractorCostEstmitedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostEstmitedStartDate));
		return element;
	}

	public static WebElement subContractorCostSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostSaveBtn));
		return element;
	}		
	
	
}
