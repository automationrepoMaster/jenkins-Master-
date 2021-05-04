package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_SubContractorInfo 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String btnClose = "//button[@id='cntrSubContractor_divClose']";
	static String btnSaveAndContinue = "//input[@id='cntrSubContractor_btnNext']";   //input[@id='cntrSubContractor_btnNext']
//			+ "//a[@id='ctrlProofofInsurance_btnNext']";
	static String SwitchSubContractorWorkOnSite ="//div[@class='inner']";
	
	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}
}
