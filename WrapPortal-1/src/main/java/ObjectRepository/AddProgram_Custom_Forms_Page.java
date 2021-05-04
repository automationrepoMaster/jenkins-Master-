package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Custom_Forms_Page 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectYourLossRunSheets = "//input[@id='fluUpload1']";
	static String checkBoxOshaAndEMR ="//div[@id='divClaims']//tbody/tr[1]/td[1]//div[1]//span/input";
	static String slectTierLevelForOshaAndEMR ="//div[@id='divClaims']//tbody/tr[1]/td[2]//div[@class='selector']//select";
	static String checkBoxSafetyQualificationForm="//div[@id='divClaims']//tbody/tr[2]/td[1]//div[1]//span/input";
	static String slectTierLevelForSafetyQualificationForm="//div[@id='divClaims']//tbody/tr[2]/td[2]//div[@class='selector']//select";
	static String CloseBtn ="//button[@id='divClose']";
	static String BackBtn ="//input[@value='Back']";
	static String SaveAndCloseBtn ="//input[@value='Save and Close']";
	static String SaveAndContinueBtn ="//input[@value='Save and Continue']";
	
	static String oshaEmrTierLevelField="//input[@id='rptCustomForms_ctl00_txtTierStartValue']";
	static String oshaEmrAdminReviewCheckBox="//input[@id='rptCustomForms_ctl00_chkIsShowAdminReview']";
	static String safetyQualificationTierLevelField="//input[@id='rptCustomForms_ctl01_txtTierStartValue']";
	static String safetyQualificationAdminReviewCheckBox="//input[@id='rptCustomForms_ctl01_chkIsShowAdminReview']";
	
	
	public static WebElement oshaEmrTierLevelField(WebDriver driver) {
		element = driver.findElement(By.xpath(oshaEmrTierLevelField));
		return element;
	}
	public static WebElement oshaEmrAdminReviewCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(oshaEmrAdminReviewCheckBox));
		return element;
	}
	public static WebElement safetyQualificationAdminReviewCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(safetyQualificationAdminReviewCheckBox));
		return element;
	}
	public static WebElement safetyQualificationTierLevelField(WebDriver driver) {
		element = driver.findElement(By.xpath(safetyQualificationTierLevelField));
		return element;
	}
	
	public static WebElement selectYourLossRunSheets(WebDriver driver) {
		element = driver.findElement(By.xpath(selectYourLossRunSheets));
		return element;
	}public static WebElement checkBoxOshaAndEMR(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxOshaAndEMR));
		return element;
	}public static WebElement slectTierLevelForOshaAndEMR(WebDriver driver) {
		element = driver.findElement(By.xpath(slectTierLevelForOshaAndEMR));
		return element;
	}public static WebElement checkBoxSafetyQualificationForm(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxSafetyQualificationForm));
		return element;
	}public static WebElement slectTierLevelForSafetyQualificationForm(WebDriver driver) {
		element = driver.findElement(By.xpath(slectTierLevelForSafetyQualificationForm));
		return element;
	}public static WebElement CloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtn));
		return element;
	}public static WebElement BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(BackBtn));
		return element;
	}public static WebElement SaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveAndCloseBtn));
		return element;
	}public static WebElement SaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveAndContinueBtn));
		return element;
	}
	
}
