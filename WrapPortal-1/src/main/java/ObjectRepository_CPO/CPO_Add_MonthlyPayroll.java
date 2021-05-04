package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_MonthlyPayroll 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String addPayrollCVField = "//input[@id='cntrlMissingPayroll_txtContractValue']";
	static String addPayrollSelfCVField = "//input[@id='cntrlMissingPayroll_txtSelfContractValue']";
	static String addPayrollSubContractorCostField = "//input[@id='cntrlMissingPayroll_txtSubContractorCost']";
	// add payroll including hours and capped and uncapped values
	static String addPayrollForALLWorkClass = "//table[@class='table blueTable']/tbody/tr[position()>1 and position()<last()-1]/td[position()>1]/input[@type!='hidden']";// list
	static String addPayrollGrandTotalHours = "//input[@id='cntrlMissingPayroll_txtHoursTotal']";
	static String addPayrollGrandTotalUncappedPayroll = "//input[@id='cntrlMissingPayroll_txtPayrollTotal']";
	static String addPayrollGrandTotalCappedPayroll = "//input[@id='cntrlMissingPayroll_txtUnCapPayrollTotal']";
	
	static String addPayrollFinalPayrollCheckBox = "//input[@id='cntrlMissingPayroll_chkFinalPayroll']";
	static String addPayrollNextMonthBtn = "//input[contains(@value,'Continue for')]";//continue next month payroll button
	static String addPayrollSaveBtn = "//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	static String addPayrollCloseBtn = "//button[@id='cntrlMissingPayroll_divClose']";
	
	static String selectPayrollPeriodFromList ="//select[@id='cntrlMissingPayroll_ddlPayrollMonths']";
	static String unusualPayrolSaveBtn ="//a[@onclick='SaveComment()']";
	static String unusualPayrolExplinationTextArea ="//textarea[@id='txtComment']";
	
	
	public static WebElement addPayrollCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollCVField));
		return element;
	}

	public static WebElement addPayrollSelfCVField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSelfCVField));
		return element;
	}

	public static WebElement addPayrollSubContractorCostField(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSubContractorCostField));
		return element;
	}

	public static List<WebElement> addPayrollForALLWorkClass(WebDriver driver) {
		listElement = driver.findElements(By.xpath(addPayrollForALLWorkClass));
		return listElement;
	}

	public static WebElement addPayrollGrandTotalHours(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalHours));
		return element;
	}

	public static WebElement addPayrollGrandTotalUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalUncappedPayroll));
		return element;
	}

	public static WebElement addPayrollGrandTotalCappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollGrandTotalCappedPayroll));
		return element;
	}

	public static WebElement addPayrollFinalPayrollCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollFinalPayrollCheckBox));
		return element;
	}

	public static WebElement addPayrollNextMonthBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollNextMonthBtn));
		return element;
	}

	public static WebElement addPayrollSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollSaveBtn));
		return element;
	}

	public static WebElement addPayrollCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollCloseBtn));
		return element;
	}
	public static WebElement selectPayrollPeriodFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollPeriodFromList));
		return element;
	}
	
}
