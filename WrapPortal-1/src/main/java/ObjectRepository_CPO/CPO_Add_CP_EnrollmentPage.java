package ObjectRepository_CPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_EnrollmentPage 
{
	
	private static WebElement element;

	
	static String linkInsuranceEnrollment= "//a[@id='aInsuranceEnrollment']";
	static String linkContractDetails="//a[@id='aInsuranceCost']";
	static String linkWCPremiumsModifications="//a[@id='aWCPremiums']";
	static String linkGLUmbrellaCoverage="//a[@id='aGLUmbrellaCoverage']";
	static String linkRequiredDocument="//a[@id='aRequiredInsuranceDocument']";
	static String linkSubContractor="//a[@id='aSubContractorList']";
	static String EnroolmentBackButton="//input[@class='btn']";
	static String linkChangeOrder="//a[@id='aChangeOrder']";
	static String linkClaims="//a[@id='aClaim']";
	static String linkcloseout="//a[@id='aCompletionNotice']";
	static String linkMonthlyPayroll="//a[@id='aMonthlyPayroll']";
	
	public static WebElement linkMonthlyPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(linkMonthlyPayroll));
		return element;
	}
	public static WebElement linkcloseout(WebDriver driver) {
		element = driver.findElement(By.xpath(linkcloseout));
		return element;
	}
	public static WebElement linkClaims(WebDriver driver) {
		element = driver.findElement(By.xpath(linkClaims));
		return element;
	}
	public static WebElement linkChangeOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(linkChangeOrder));
		return element;
	}
	public static WebElement linkInsuranceEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(linkInsuranceEnrollment));
		return element;
	}public static WebElement linkContractDetails(WebDriver driver) {
		element = driver.findElement(By.xpath(linkContractDetails));
		return element;
	}public static WebElement linkWCPremiumsModifications(WebDriver driver) {
		element = driver.findElement(By.xpath(linkWCPremiumsModifications));
		return element;
	}public static WebElement linkGLUmbrellaCoverage(WebDriver driver) {
		element = driver.findElement(By.xpath(linkGLUmbrellaCoverage));
		return element;
	}public static WebElement linkRequiredDocument(WebDriver driver) {
		element = driver.findElement(By.xpath(linkRequiredDocument));
		return element;
	}public static WebElement linkSubContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(linkSubContractor));
		return element;
	}public static WebElement EnroolmentBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(EnroolmentBackButton));
		return element;
	}
	
}
