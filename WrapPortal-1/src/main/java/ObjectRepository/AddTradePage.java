package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTradePage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String addTrade_TradeDescriptionField = "//input[@id='cntrTradeAddUpdate_txtTradeDescription']";
	static String addTrade_TradeNumberField = "//input[@id='cntrTradeAddUpdate_txtSICCode']";
	static String addTrade_TradeStatusField = "//select[@id='cntrTradeAddUpdate_ddlStatus']";//dropdown
	static String addTrade_TradeNotesField = "//div[@class='mce-edit-area mce-container mce-panel mce-stack-layout-item']";
	static String addTradeSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addTradeCloseBtn = "//button[@class='btn']";

	public static WebElement addTrade_TradeDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addTrade_TradeDescriptionField));
		return element;
	}

	public static WebElement addTrade_TradeNumberField(WebDriver driver) {
		element = driver.findElement(By.xpath(addTrade_TradeNumberField));
		return element;
	}

	public static WebElement addTrade_TradeStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(addTrade_TradeStatusField));
		return element;
	}

	public static WebElement addTrade_TradeNotesField(WebDriver driver) {
		element = driver.findElement(By.xpath(addTrade_TradeNotesField));
		return element;
	}

	public static WebElement addTradeSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeSaveAndCloseBtn));
		return element;
	}

	public static WebElement addTradeCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeCloseBtn));
		return element;
	}

}
