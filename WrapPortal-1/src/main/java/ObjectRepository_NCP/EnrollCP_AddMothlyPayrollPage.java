package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_AddMothlyPayrollPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String PayrollTextClick ="//*[@data-text='Add Payroll']/../../div[1]//i[1]";
	static String addPayrollButton = "//*[@data-text='Add Payroll']";
	static String monthalyPayrollCloseIcon = "//*[@data-text='Add Payroll']/../../div[3]/button/span";
	static String missingPayrollMonthsList = "//table[@class='table table-gray last-border-none']/tbody/tr[1]/td//tbody/tr/td[1]//a";// list
	static String uncappedPayrollTotal = "//table[@class='table table-gray last-border-none']/tbody/tr[2]//tbody/tr[1]/td[position()>1 and position()<3]";
	static String contractValueTotal = "//table[@class='table table-gray last-border-none']/tbody/tr[2]//tbody/tr[1]/td[position()>2 and position()<4]";

	static String addMonthlyPayrollPolicyAlertOkBtn="//button[contains(text(),'OK')]";
	static String addPayrollCVField = "//input[@id='ContractValue']";
	static String addPayrollSelfCVField = "//input[@id='SelfContractValue']";
	static String addPayrollSubContractorCostField = "//input[@id='SubcontractorCost']";
	// add payroll including hours and capped and uncapped values
	static String addPayrollForALLWorkClass = "//tbody[@class='table-bg-gray border-top-dark']//tr[position()<=last()-1]/td[position()>1]//input";// list
	static String addPayrollGrandTotalHours = "//tbody[@class='table-bg-gray border-top-dark']//tr[last()]/td[position()=2]//input";
	static String addPayrollGrandTotalUncappedPayroll = "//tbody[@class='table-bg-gray border-top-dark']//tr[last()]/td[position()=3]//input";
	static String addPayrollGrandTotalCappedPayroll = "//tbody[@class='table-bg-gray border-top-dark']//tr[last()]/td[position()=4]//input";
	static String addPayrollFinalPayrollYesBtn = "//label[contains(text(),'Final Payroll')]/../div/label[1]";
	static String addPayrollFinalPayrollNoBtn = "//label[contains(text(),'Final Payroll')]/../div/label[2]";
	static String addPayrollNextMonthBtn = "//a[@id='aSaveNextMonthlyPayroll']";
	static String addPayrollSaveBtn = "//a[@id='aSaveMonthlyPayroll']";
	static String addPayrollCloseIcon = "//button[@class='close']//span[contains(text(),'×')]";

	static String unusualPayrolSaveBtn ="//a[@onclick='SaveComment()']";
	static String unusualPayrolExplinationTextArea ="//textarea[@id='txtComment']";
	static String selectPayrollPeriodField ="//h5[contains(text(),'Update information for the month of')]/../div[1]/div/div/input[@type='text']";
	static String selectPayrollPeriodFromList ="//h5[contains(text(),'Update information for the month of')]/../div[1]/div/div/input[@type='text']/../ul/li[position()>1]";
	
	
	public static WebElement addMonthlyPayrollPolicyAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addMonthlyPayrollPolicyAlertOkBtn));
		return element;
	}
	public static WebElement selectPayrollPeriodField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollPeriodField));
		return element;
	}
	public static List<WebElement> selectPayrollPeriodFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectPayrollPeriodFromList));
		return listElement;
	}
	
	public static WebElement PayrollTextClick(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollTextClick));
		return element;
	}
	public static WebElement unusualPayrolSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(unusualPayrolSaveBtn));
		return element;
	}public static WebElement unusualPayrolExplinationTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(unusualPayrolExplinationTextArea));
		return element;
	}
	public static WebElement addPayrollButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollButton));
		return element;
	}

	public static WebElement monthalyPayrollCloseIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(monthalyPayrollCloseIcon));
		return element;
	}

	public static List<WebElement> missingPayrollMonthsList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(missingPayrollMonthsList));
		return listElement;
	}

	public static WebElement uncappedPayrollTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(uncappedPayrollTotal));
		return element;
	}

	public static WebElement contractValueTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(contractValueTotal));
		return element;
	}

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

	public static WebElement addPayrollFinalPayrollYesBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollFinalPayrollYesBtn));
		return element;
	}

	public static WebElement addPayrollFinalPayrollNoBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollFinalPayrollNoBtn));
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

	public static WebElement addPayrollCloseIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addPayrollCloseIcon));
		return element;
	}
	
	//Raja 
	
	static String ClasscodeHrsFeild="//tbody/tr[1]/td[2]/input[1]";
	static String ClasscodeuncappedPayrollFeild="//tbody/tr[1]/td[3]/input[1]";
	
	public static WebElement ClasscodeHrsFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(ClasscodeHrsFeild));
		return element;
	}
	
	public static WebElement ClasscodeuncappedPayrollFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(ClasscodeuncappedPayrollFeild));
		return element;
	}
	
	
}
