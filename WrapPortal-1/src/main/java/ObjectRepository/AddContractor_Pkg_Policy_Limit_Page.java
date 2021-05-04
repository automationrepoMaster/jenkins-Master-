package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Policy_Limit_Page
{

	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String btnClose = "//button[@class='btn'][contains(text(),'Close')]";
	static String btnSave = "//input[@value='Save']";
	//static String btnSaveAndClose = "//input[@id='ctrlInsuranceEnrollment_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@value='Save and Continue']";

	
	
	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}

	public static WebElement btnSave(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSave));
		return element;
	}

	public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}
}
