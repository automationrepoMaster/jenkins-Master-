package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_ReportPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectProgramField = "//div[@class='select-wrapper mdb-select md-form colorful-select dropdown-primary ddl-report-project']";
	static String selectProgramFromList = "//div[@id='ctrlBuildReport_divProject']/div//select[@name='ctrlBuildReport$lbProject']/option";// list
	static String selectCategoriesField = "//div[@class='select-wrapper mdb-select md-form colorful-select dropdown-primary ddl-report-category disabled']//input[@class='select-dropdown']";
	static String selectCategoriesFromList = "//div[@class='select-wrapper mdb-select md-form colorful-select dropdown-primary ddl-report-category disabled']//input[@class='select-dropdown']/../ul/li";// list
	static String selectReportNameFromList = "//div[@class='row report-item']/div/div//a/div[2]/span";// list

	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramField));
		return element;
	}

	public static List<WebElement> selectProgramFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramFromList));
		return listElement;
	}

	public static WebElement selectCategoriesField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectCategoriesField));
		return element;
	}

	public static List<WebElement> selectCategoriesFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectCategoriesFromList));
		return listElement;
	}

	public static List<WebElement> selectReportNameFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectReportNameFromList));
		return listElement;
	}

}
