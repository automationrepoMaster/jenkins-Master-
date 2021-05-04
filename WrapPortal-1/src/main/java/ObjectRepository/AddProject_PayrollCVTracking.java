package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_PayrollCVTracking 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String trackPayrollForGLOnlyContractorSwitch="//div[@id='uniform-chkTrackLiabilityPayroll']//div[@class='inner']";
	static String confirmationAlertTurningOnBtn="//button[@id='btnGLPayrollContinue']";
	static String confirmationAlertCloseBtn="//button[@id='btnGLPayrollClose']";	

	static String payrollCVTrackConfiguredAtProgramLevelSwitch="//div[@id='uniform-chkPauytollCvTrack']//div[@class='inner']";
	static String trackCppedUncappedPayrollSwitch="//input[@id='chkCapUnCapPayroll']/../div/div[@class='inner']";
	
	
	static String closeBtn="//button[@id='divClose']";
	static String backBtn="//input[@id='btnBackWorkSitePayrollTrack']";
	static String saveAndCloseBtn="//input[@id='btnSaveandClose']";
	static String saveAndContinueBtn="//input[@id='btnNextWorkSitePayrollTrack']";
	
	public static WebElement trackCppedUncappedPayrollSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackCppedUncappedPayrollSwitch));
		return element;
	}
	public static WebElement trackPayrollForGLOnlyContractorSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(trackPayrollForGLOnlyContractorSwitch));
		return element;
	}public static WebElement confirmationAlertTurningOnBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(confirmationAlertTurningOnBtn));
		return element;
	}public static WebElement confirmationAlertCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(confirmationAlertCloseBtn));
		return element;
	}public static WebElement payrollCVTrackConfiguredAtProgramLevelSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(payrollCVTrackConfiguredAtProgramLevelSwitch));
		return element;
	}
	public static WebElement closeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeBtn));
		return element;
	}public static WebElement backBtn(WebDriver driver) {
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
