package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_PayrollCVTracking 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String trackPayrollYesButton ="//button[@id='btnQuotaShareYes']";
	static String trackCappedUncappedPayrollSwitch ="//div[@id='uniform-chkCapUnCapPayroll']//div[@class='inner']";
	static String trackReceiptValueSwitch ="//div[@id='uniform-chkTrackMonthlyCV']//div[@class='inner']";
	static String trackPayrollGLOnlyContractsSwitch ="//div[@id='uniform-chkTrackLiabilityPayroll']//div[@class='inner']";
	static String selectPayrollmModeSubmissionFrequency ="//select[@id='ddlFrequency']";
	static String selectPayrollmModeReportingTimePeriod="//select[@id='ddlReporting']";
	static String radioBtnStandardCalenderPeriods="//input[@id='rdoStandard']";
	static String radioBtnCustomCalenderPeriods="//input[@id='rdoCustom']";
	static String radioBtnContractorEstStartDate="//input[@id='rdoCustomReportingPeriod_0']";
	static String radioBtnContractorEnrollmentDate="//input[@id='rdoCustomReportingPeriod_1']";
	static String radioBtnContractorProgramStartDate="//input[@id='rdoCustomReportingPeriod_2']";
	static String radioBtnContractorProjectStartDate="//input[@id='rdoCustomReportingPeriod_3']";
	static String radioBtnReportPeriodEndsTheSameAsBeginningOfPeriod="//input[@id='rdoCustomReportingPeriod_0']";
	static String radioBtnReportPeriodEndsAtEndsOfMonth="//input[@id='rdoEndOfMonth']";
	
	static String closeBtn="//button[@class='btn']";
	static String backBtn="//input[@id='btnBackPayrollCVTrack']";
	static String saveBtn="//input[@id='btnSavePayrollCVTrack']";
	static String saveAndCloseBtn="//input[@id='btnSaveandClosePayrollCVTrack']";
	static String saveAndContinueBtn="//input[@id='btnNextPayrollCVTrack']";
	
	public static WebElement trackPayrollYesButton(WebDriver driver) {
		element = driver.findElement(By.xpath(trackPayrollYesButton));
		return element;
	}
	public static WebElement trackCappedUncappedPayrollSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackCappedUncappedPayrollSwitch));
		return element;
	}public static WebElement trackReceiptValueSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackReceiptValueSwitch));
		return element;
	}
	public static WebElement trackPayrollGLOnlyContractsSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackPayrollGLOnlyContractsSwitch));
		return element;
	}public static WebElement selectPayrollmModeSubmissionFrequency(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollmModeSubmissionFrequency));
		return element;
	}
	public static WebElement selectPayrollmModeReportingTimePeriod(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollmModeReportingTimePeriod));
		return element;
	}public static WebElement radioBtnStandardCalenderPeriods(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnStandardCalenderPeriods));
		return element;
	}
	public static WebElement radioBtnCustomCalenderPeriods(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnCustomCalenderPeriods));
		return element;
	}public static WebElement radioBtnContractorEstStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnContractorEstStartDate));
		return element;
	}
	public static WebElement radioBtnContractorEnrollmentDate(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnContractorEnrollmentDate));
		return element;
	}public static WebElement radioBtnContractorProgramStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnContractorProgramStartDate));
		return element;
	}
	public static WebElement radioBtnContractorProjectStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnContractorProjectStartDate));
		return element;
	}public static WebElement radioBtnReportPeriodEndsTheSameAsBeginningOfPeriod(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnReportPeriodEndsTheSameAsBeginningOfPeriod));
		return element;
	}
	public static WebElement radioBtnReportPeriodEndsAtEndsOfMonth(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnReportPeriodEndsAtEndsOfMonth));
		return element;
	}
	public static WebElement closeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeBtn));
		return element;
	}public static WebElement backBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(backBtn));
		return element;
	}public static WebElement saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveBtn));
		return element;
	}public static WebElement saveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtn));
		return element;
	}public static WebElement saveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueBtn));
		return element;
	}
	
	
}
