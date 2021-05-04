package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Fixed_Costs_Rates_Page
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	static String programFixedCostsClickHereLink = "//tr[@id='trAddNewFixedCost']//a[1]";
	static String programFixedCostsInvoiceNumber= "//input[@id='txtTempInvoiceNumber']";
	static String programFixedCostsInvoiceStartDate="//input[@id='txtTempInvoiceStartDate']";
	static String programFixedCostsInvoiceEndDate="//input[@id='txtTempInvoiceEndDate']";
	static String programFixedCostsSelectTerm="//select[@id='ddlTempTerm']";//list
	static String programFixedCostsSelectCostType="//select[@id='ddlTempCostType']";//list
	static String programFixedCostsAmount="//input[@id='txtTempAmount']";
	static String programFixedCostsAddPlusBtn="//a[@id='btnAdd']";
	static String programFixedCostsRemoveBtn="//button[@id='btnCancel']";
	static String programFixedCostsFirstDeleteIcon="//tr[1]//td[7]//a[1]//i[1]";
	static String programFixedCostsSecondDeleteIcon="//tr[2]//td[7]//a[1]//i[1]";
	//Above Xpath use for multiple line while entering the value.
	//Rates and deductibles
	static String programRatesAndDeductiblesClickHereLink ="//tr[@id='trAddNewProgramRate']//a[1]";
	static String programRatesAndDeductiblesSelectRateDescription ="//select[@id='ddlTempRateType']";//list
	static String programRatesAndDeductiblesRateField ="//input[@id='txtTempRate']";
	static String programRatesAndDeductiblesSelectRateBase ="//select[@id='ddlTempRateBase']";//list
	static String programRatesAndDeductiblesSelectRateBaseType ="//select[@id='ddlTempRateBaseType']";
	static String programRatesAndDeductiblesAmountField ="//input[@id='txtTempDeductibleAmount']";
	static String programRatesAndDeductiblesAddPlusBtn="//a[@id='btnProgramRatesAdd']//i[@class='icon i-plus']";
	static String programRatesAndDeductiblesRemoveBtn="//a[@id='A1']//i[@class='icon i-minus']";	
	static String programRatesAndDeductiblesFirstDeleteIcon="//tr[1]//td[6]//a[1]//i[1]";
	static String programRatesAndDeductiblesSecondDeleteIcon="//tr[2]//td[6]//a[1]//i[1]";
	//Fees
	static String programFeesClickHereLink ="//tr[@id='trAddNewFees']//a[1]";
	static String programFeeStartDate ="//input[@id='txtTempFeeStartDate']";
	static String programFeeEndDate ="//input[@id='txtFeeTempEndDate']";
	static String programFeeSelectFeeType ="//select[@id='ddlTempFeesType']";//list
	static String programFeeAmountfield ="//input[@id='txtFeeTempAmount']";
	static String programFeeAddPlusBtn ="//a[@id='btnProgramFeesAdd']//i[@class='icon i-plus']";
	static String programFeeRemoveBtn ="//a[@id='A2']//i[@class='icon i-minus']";
	static String programFeeFirstDeleteIcon="//tr[1]//td[5]//a[1]//i[1]";
	static String programFeeSecondDeleteIcon="//tr[2]//td[5]//a[1]//i[1]";
	//bottom buttons
	static String fixedCostsAndRatesCloseBtn ="//button[@id='divClose']";
	static String fixedCostsAndRatesBackBtn ="//input[@value='Back']";
	static String fixedCostsAndRatesSaveBtn ="//input[@value='Save']";
	static String fixedCostsAndRatesSaveAndCloseBtn ="//input[@value='Save and Close']";
	static String fixedCostsAndRatesSaveAndContinueBtn ="//input[@value='Save and Continue']";
	
	static String programFixedCostsFetchAllValues ="//div[@id='divFixedCosts']//table[@class='table blueTable addEditBtn']/tbody/tr[*]/td[*]//input[@type='text' or @type='hidden']";
	static String programRatesAndDeductibleFetchAllValues ="//div[@id='divRates']//table[@class='table blueTable addEditBtn']/tbody/tr[*]/td[*]//input[@type='text' or @type='hidden']";
	static String programFeesFetchAllValues ="//div[@id='divFees']//table[@class='table blueTable addEditBtn']/tbody/tr[*]/td[*]//input[@type='text' or @type='hidden']";
	
	public static List<WebElement> programFixedCostsFetchAllValues(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programFixedCostsFetchAllValues));
		return listElement;
	}public static List<WebElement> programRatesAndDeductibleFetchAllValues(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programRatesAndDeductibleFetchAllValues));
		return listElement;
	}public static List<WebElement> programFeesFetchAllValues(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programFeesFetchAllValues));
		return listElement;
	}
	
	public static WebElement programFixedCostsClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsClickHereLink));
		return element;
	}public static WebElement programFixedCostsInvoiceNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsInvoiceNumber));
		return element;
	}public static WebElement programFixedCostsInvoiceStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsInvoiceStartDate));
		return element;
	}public static WebElement programFixedCostsInvoiceEndDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsInvoiceEndDate));
		return element;
	}public static WebElement programFixedCostsSelectTerm(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsSelectTerm));
		return element;
	}public static WebElement programFixedCostsSelectCostType(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsSelectCostType));
		return element;
	}public static WebElement programFixedCostsAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsAmount));
		return element;
	}public static WebElement programFixedCostsAddPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsAddPlusBtn));
		return element;
	}public static WebElement programFixedCostsRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsRemoveBtn));
		return element;
	}public static WebElement programFixedCostsFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsFirstDeleteIcon));
		return element;
	}public static WebElement programFixedCostsSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programFixedCostsSecondDeleteIcon));
		return element;
	}public static WebElement programRatesAndDeductiblesClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesClickHereLink));
		return element;
	}public static WebElement programRatesAndDeductiblesSelectRateDescription(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesSelectRateDescription));
		return element;
	}public static WebElement programRatesAndDeductiblesRateField(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesRateField));
		return element;
	}public static WebElement programRatesAndDeductiblesSelectRateBase(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesSelectRateBase));
		return element;
	}public static WebElement programRatesAndDeductiblesSelectRateBaseType(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesSelectRateBaseType));
		return element;
	}public static WebElement programRatesAndDeductiblesAmountField(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesAmountField));
		return element;
	}public static WebElement programRatesAndDeductiblesAddPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesAddPlusBtn));
		return element;
	}public static WebElement programRatesAndDeductiblesRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesRemoveBtn));
		return element;
	}public static WebElement programRatesAndDeductiblesFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesFirstDeleteIcon));
		return element;
	}public static WebElement programRatesAndDeductiblesSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programRatesAndDeductiblesSecondDeleteIcon));
		return element;
	}public static WebElement programFeesClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeesClickHereLink));
		return element;
	}public static WebElement programFeeStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeStartDate));
		return element;
	}public static WebElement programFeeEndDate(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeEndDate));
		return element;
	}public static WebElement programFeeSelectFeeType(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeSelectFeeType));
		return element;
	}public static WebElement programFeeAmountfield(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeAmountfield));
		return element;
	}public static WebElement programFeeAddPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeAddPlusBtn));
		return element;
	}public static WebElement programFeeRemoveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeRemoveBtn));
		return element;
	}public static WebElement programFeeFirstDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeFirstDeleteIcon));
		return element;
	}public static WebElement programFeeSecondDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programFeeSecondDeleteIcon));
		return element;
	}public static WebElement fixedCostsAndRatesCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(fixedCostsAndRatesCloseBtn));
		return element;
	}public static WebElement fixedCostsAndRatesBackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(fixedCostsAndRatesBackBtn));
		return element;
	}public static WebElement fixedCostsAndRatesSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(fixedCostsAndRatesSaveBtn));
		return element;
	}public static WebElement fixedCostsAndRatesSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(fixedCostsAndRatesSaveAndCloseBtn));
		return element;
	}public static WebElement fixedCostsAndRatesSaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(fixedCostsAndRatesSaveAndContinueBtn));
		return element;
	}
	
	
	
	
	
}
