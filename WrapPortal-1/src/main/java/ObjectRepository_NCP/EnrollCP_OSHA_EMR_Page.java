package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_OSHA_EMR_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String select_A_CheckBox = "//input[@id='option1']";
	static String select_B_CheckBox = "//input[@id='option2']";
	static String select_C_CheckBox = "//input[@id='option3']";

	static String subContractingCompanyName = "//input[@id='CompanyName']";
	static String californiaLicenseNo = "//input[@id='LicenseClassification']";
	static String companyAddress = "//label[contains(text(),'Company Address')]";
	static String estimatedStartDate = "//input[@id='Date']";
	static String printSignatureName = "//input[@id='PrintSignatureName']";
	static String title = "//label[contains(text(),'Title')]";
	static String continueBtn = "//a[@class='btn btn-dark-green btn-lg float-right']";

	public static WebElement select_A_CheckBox(WebDriver driver) {

		element = driver.findElement(By.xpath(select_A_CheckBox));
		return element;
	}

	public static WebElement select_B_CheckBox(WebDriver driver) {

		element = driver.findElement(By.xpath(select_B_CheckBox));
		return element;
	}

	public static WebElement select_C_CheckBox(WebDriver driver) {

		element = driver.findElement(By.xpath(select_C_CheckBox));
		return element;
	}

	public static WebElement subContractingCompanyName(WebDriver driver) {

		element = driver.findElement(By.xpath(subContractingCompanyName));
		return element;
	}

	public static WebElement californiaLicenseNo(WebDriver driver) {

		element = driver.findElement(By.xpath(californiaLicenseNo));
		return element;
	}

	public static WebElement companyAddress(WebDriver driver) {

		element = driver.findElement(By.xpath(companyAddress));
		return element;
	}

	public static WebElement estimatedStartDate(WebDriver driver) {

		element = driver.findElement(By.xpath(estimatedStartDate));
		return element;
	}

	public static WebElement printSignatureName(WebDriver driver) {

		element = driver.findElement(By.xpath(printSignatureName));
		return element;
	}

	public static WebElement title(WebDriver driver) {

		element = driver.findElement(By.xpath(title));
		return element;
	}

	public static WebElement continueBtn(WebDriver driver) {

		element = driver.findElement(By.xpath(continueBtn));
		return element;
	}

}
