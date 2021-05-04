package ObjectRepository_NCP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_LoginPage 
{
	
	private static WebElement element;

	
	static String userName = "//input[@id='UserName']";
	static String password = "//input[@id='Password']";
	static String loginBtn = "//button[contains(text(),'SIGN IN')]";
	static String errorMessage = "//form[@id='login-form']//div[3]";
	static String forgetPasswordLink ="//form[@id='login-form']//div[4]//a";
	

	public static WebElement userName(WebDriver driver) {
		element = driver.findElement(By.xpath(userName));
		return element;
	}
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath(password));
		return element;
	}
	public static WebElement loginBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(loginBtn));
		return element;
	}
	public static WebElement errorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath(errorMessage));
		return element;
	}
	public static WebElement forgetPasswordLink(WebDriver driver) {
		element = driver.findElement(By.xpath(forgetPasswordLink));
		return element;
	}
}
