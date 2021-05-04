package ObjectRepository_CPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_LoginPage {

	private static WebElement element;

	// Login Page
	static String userName = "//input[@id='UserName']";
	static String password = "//input[@id='Password']";
	static String loginBtn = "//input[@id='btnLogin']";
	static String errorMessage = "//span[@id='LoginCheck']";

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

}
