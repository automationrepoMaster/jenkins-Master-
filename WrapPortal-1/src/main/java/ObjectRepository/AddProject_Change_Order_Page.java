package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_Change_Order_Page {
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String addChnageOrderbtn = "//a[@id='aAddChangeOrder']";
	static String addChnageOrderLinkClickHere = "//a[@id='aChangeOrder']";
	static String additionalContractValueTextField = "//input[@id='ctrlModuleChangeOrder_txtContractPriceValue']";
	static String effectiveDate = "//input[@id='ctrlModuleChangeOrder_txtEffectiveDate']";
	static String newEstimatedCompletionDate = "//input[@id='ctrlModuleChangeOrder_txtCompletionDate']";
	static String changeOrderNo = "//input[@id='ctrlModuleChangeOrder_txtChangeOrderNo']";
	static String selectStatus = "//select[@id='ctrlModuleChangeOrder_ddlStatus']";
	static String descriptionField = "//textarea[@id='ctrlModuleChangeOrder_txtDescription']";
	static String changeOrderSaveAndCloseBtn = "//input[@id='ctrlModuleChangeOrder_btnSaveandClose']";
	static String changeOrdercloseBtn = "//button[@id='btnCloseAdd']";

	static String finishAndClose = "//button[@id='btnSaveClose']";
	static String backButton = "//input[@value='Back']";
	static String closeButton = "//button[@class='btn']";

	public static WebElement addChnageOrderbtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addChnageOrderbtn));
		return element;
	}

	public static WebElement addChnageOrderLinkClickHere(WebDriver driver) {
		element = driver.findElement(By.xpath(addChnageOrderLinkClickHere));
		return element;
	}

	public static WebElement additionalContractValueTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(additionalContractValueTextField));
		return element;
	}

	public static WebElement effectiveDate(WebDriver driver) {
		element = driver.findElement(By.xpath(effectiveDate));
		return element;
	}

	public static WebElement newEstimatedCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(newEstimatedCompletionDate));
		return element;
	}

	public static WebElement changeOrderNo(WebDriver driver) {
		element = driver.findElement(By.xpath(changeOrderNo));
		return element;
	}

	public static WebElement selectStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(selectStatus));
		return element;
	}

	public static WebElement descriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionField));
		return element;
	}

	public static WebElement changeOrderSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(changeOrderSaveAndCloseBtn));
		return element;
	}

	public static WebElement changeOrdercloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(changeOrdercloseBtn));
		return element;
	}

	public static WebElement finishAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(finishAndClose));
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
}
