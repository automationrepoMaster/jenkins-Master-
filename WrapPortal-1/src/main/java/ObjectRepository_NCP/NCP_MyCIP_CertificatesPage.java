package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_MyCIP_CertificatesPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectProgramField = "//label[contains(text(),'Select Program :')]/../div/div//input[@type='text']";
	static String selectProgramFrmList = "//label[contains(text(),'Select Program :')]/../div/div/ul/li[*]";// list
	static String downloadCertificatesBtn = "//a[@onclick='downloadCertificates();']";
	static String selectAllCheckBox = "//input[@id='check-all']";
	static String selectLastTwoCheckBox = "//input[@id='check-all']/../..//parent::ul/li[position()>2]//input";// list
	static String downloadCertificatesAlertOKBtn ="//button[contains(text(),'OK')]";
	
	
	public static WebElement downloadCertificatesAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(downloadCertificatesAlertOKBtn));
		return element;
	}
	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramField));
		return element;
	}

	public static List<WebElement> selectProgramFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramFrmList));
		return listElement;
	}

	public static WebElement downloadCertificatesBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(downloadCertificatesBtn));
		return element;
	}

	public static List<WebElement> selectLastTwoCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectLastTwoCheckBox));
		return listElement;
	}

	public static WebElement selectAllCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAllCheckBox));
		return element;
	}

}
