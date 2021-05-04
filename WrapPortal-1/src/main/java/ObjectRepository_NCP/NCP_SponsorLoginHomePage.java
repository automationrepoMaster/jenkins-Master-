package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_SponsorLoginHomePage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String moduleDashboard = "//div[@id='navbarSupportedContent']/ul/li//span[contains(text(),'Dashboard')]";
	static String moduleMyProjects = "//div[@id='navbarSupportedContent']/ul//li//span[contains(text(),'My Projects')]";
	static String moduleMyContracts = "//div[@id='navbarSupportedContent']/ul//li//span[contains(text(),'My Contracts')]";
	static String moduleMyDocuments = "//div[@id='navbarSupportedContent']/ul//li//span[contains(text(),'My Documents')]";
	static String moduleMyCIPCertificates = "//div[@id='navbarSupportedContent']/ul//li//span[contains(text(),'My CIP Certificates')]";
	static String moduleReports = "//div[@id='navbarSupportedContent']/ul//li//span[contains(text(),'Reports')]";
	static String selectProgramDropDown = "//label[contains(text(),'Program :')]/../../div[2]//ul/li[*]";// list
	static String selectProjectDropDown = "//label[contains(text(),'Project :')]/../../div[2]//ul/li[*]";// list

	public static WebElement moduleDashboard(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleDashboard));
		return element;
	}

	public static WebElement moduleMyProjects(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleMyProjects));
		return element;
	}

	public static WebElement moduleMyContracts(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleMyContracts));
		return element;
	}

	public static WebElement moduleMyDocuments(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleMyDocuments));
		return element;
	}

	public static WebElement moduleMyCIPCertificates(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleMyCIPCertificates));
		return element;
	}

	public static WebElement moduleReports(WebDriver driver) {
		element = driver.findElement(By.xpath(moduleReports));
		return element;
	}

	public static List<WebElement> selectProgramDropDown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramDropDown));
		return listElement;
	}

	public static List<WebElement> selectProjectDropDown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProjectDropDown));
		return listElement;
	}

}
