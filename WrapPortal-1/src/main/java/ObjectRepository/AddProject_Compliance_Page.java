package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Compliance_Page 
{
	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String nextButton ="//input[@id='cntrWorkSiteCompliance_btnNext']";   //"//input[@value='Next']";------Raja
	static String backButton = "//input[@id='cntrWorkSiteCompliance_btnBack']";  //---Raja//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";
	
	public static WebElement nextButton(WebDriver driver) {
		element = driver.findElement(By.xpath(nextButton));
		return element;
	}

	public static WebElement backButton(WebDriver driver) {
		element = driver.findElement(By.xpath(backButton));
		return element;
	}

	public static WebElement closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButton));
		return element;
	}
	
	static String viewNonCIPCertificactes ="//table[@class='table grayTableDotted']//tbody/tr/td[2]//a";
	
	public static List<WebElement> viewNonCIPCertificactes(WebDriver driver) {
		listElement = driver.findElements(By.xpath(viewNonCIPCertificactes));
		return listElement ;
	}
	
	
	
	
}
