package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_ViewCertificatePage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String btnAutoGenerateCertificate="//input[@id='cntrlViewCertificates_btnGenerateCertificate']";
	static String btnManuallyGenerateCertificate="//a[@id='cntrlViewCertificates_aAddCertificates']";
	static String generateCOIBtn="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]//div[@class='viewCerti clearfix']/ul//li/a[@data-original-title='COI']";
	static String FinishAndCloseBtn="//button[@id='cntrlViewCertificates_btnFinishandClose']";
	static String GL_PolicyNo="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]/td[1]";
	static String GL_PolicyDateTime="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]/td[4]";
	
	static String UMB_PolicyNo="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]/td[2]/br[1]";
	static String WC_PolicyNo="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]/td[3]/br[1]";
	static String allPolicyNoAndDate="//div[@id='cntrlViewCertificates_divCertificateMain']/table/tbody/tr[1]/td/br";//list
	
	public static WebElement GL_PolicyDateTime(WebDriver driver)
	{
		element = driver.findElement(By.xpath(GL_PolicyDateTime));
		return element;
	}
	public static WebElement btnAutoGenerateCertificate(WebDriver driver)
	{
		element = driver.findElement(By.xpath(btnAutoGenerateCertificate));
		return element;
	}
	public static WebElement btnManuallyGenerateCertificate(WebDriver driver)
	{
		element = driver.findElement(By.xpath(btnManuallyGenerateCertificate));
		return element;
	}
	public static WebElement generateCOIBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(generateCOIBtn));
		return element;
	}
	public static WebElement FinishAndCloseBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(FinishAndCloseBtn));
		return element;
	}
	public static WebElement GL_PolicyNo(WebDriver driver)
	{
		element = driver.findElement(By.xpath(GL_PolicyNo));
		return element;
	}
	public static WebElement UMB_PolicyNo(WebDriver driver)
	{
		element = driver.findElement(By.xpath(UMB_PolicyNo));
		return element;
	}
	public static WebElement WC_PolicyNo(WebDriver driver)
	{
		element = driver.findElement(By.xpath(WC_PolicyNo));
		return element;
	}
	public static List<WebElement> allPolicyNoAndDate(WebDriver driver)
	{
		listElement = driver.findElements(By.xpath(allPolicyNoAndDate));
		return listElement;
	}
	
	
}
