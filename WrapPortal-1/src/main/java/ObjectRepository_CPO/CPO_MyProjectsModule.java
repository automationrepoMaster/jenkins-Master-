package ObjectRepository_CPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_MyProjectsModule 
{
	

	private static WebElement element;

	// Login Page
	static String selectProgram = "//select[@id='DrpDnProject']";
	static String selectProjects = "//select[@id='DrpDnWorkSite']";
	static String selectTrade ="//select[@id='DrpDnTrade']";
	static String searchContractorPackage ="//input[@id='txtContrSearch']";
	static String ContractorPackageSearchBtn ="//a[@id='btnContrSearch']";
	static String ContractorPackageResetBtn ="//a[@id='btnAllContractors']";
	
	static String selectContractorPackage ="//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'Sony Tower Test')]/..//*[contains(text(),'Sony project Three')]/..//*[contains(text(),'48811')]/../..//*[contains(text(),'WC & GL Enrollment')]/../..//*[contains(text(),'Select')]";
	//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'Sony Tower Test')]/..//*[contains(text(),'Sony project Three')]/..//*[contains(text(),'48811')]/../..//*[contains(text(),'Sony 1 Contractor Company')]/..//*[contains(text(),'WC & GL Enrollment')]/../..//*[contains(text(),'Select')]
	
	public static WebElement selectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgram));
		return element;
	}public static WebElement selectProjects(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjects));
		return element;
	}public static WebElement selectTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTrade));
		return element;
	}public static WebElement searchContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(searchContractorPackage));
		return element;
	}public static WebElement ContractorPackageSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPackageSearchBtn));
		return element;
	}public static WebElement ContractorPackageResetBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPackageResetBtn));
		return element;
	}
	public static WebElement selectContractorPackage(WebDriver driver, String programName,String projectName,String tradeNo,String contractorName,String enrollmentType) {
		element = driver.findElement(By.xpath("//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'"+programName+"')]/..//*[contains(text(),'"+projectName+"')]/..//*[contains(text(),'"+tradeNo+"')]/../..//*[contains(text(),'"+contractorName+"')]/..//*[contains(text(),'"+enrollmentType+"')]/../..//*[contains(text(),'Select')]"));
		return element;
	}
	
	//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'Automation Program dont touch')]/..//*[contains(text(),'Test 132 ON')]/..//*[contains(text(),'4226 | Special Warehousing and Storage, Nec')]/../..//*[contains(text(),'Alex Comp2273')]/..//*[contains(text(),'GL Only')]/../..//*[contains(text(),'Select')]
}
