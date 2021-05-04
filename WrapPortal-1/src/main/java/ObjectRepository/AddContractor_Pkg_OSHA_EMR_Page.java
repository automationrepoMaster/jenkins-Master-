package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_OSHA_EMR_Page
{
	
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	static String checkBoxA = "//input[@id='cntrOshrAndEmr_chkOption1']";
	static String checkBoxB = "//input[@id='cntrOshrAndEmr_chkoption2']";
	static String checkBoxC = "//input[@id='cntrOshrAndEmr_chkoption3']";
	static String date ="//input[@id='cntrOshrAndEmr_txtDate']";
	static String printSignatureName ="//input[@id='cntrOshrAndEmr_txtPrintSingature']";
	static String Title ="//input[@id='cntrOshrAndEmr_txtTitle']";

	static String checkBoxFlagPage ="//input[@id='cntrOshrAndEmr_chkAction']";
	static String radioBtnPendingReview ="//input[@id='cntrOshrAndEmr_rdoPendingReview']";
	static String radioBtnMarkAsConfirmed="//input[@id='cntrOshrAndEmr_rdoConfirm']";
	static String radioBtnMarkAsIncomplete="//input[@id='cntrOshrAndEmr_rdoMarkasComplete']";
	static String enrollmenetDate="//input[@id='cntrOshrAndEmr_txtEnrollmentDate']";
	static String locationCode="//input[@id='cntrOshrAndEmr_txtLocationCode']";
	static String notesAppearOnReport="//textarea[@id='cntrOshrAndEmr_txtReasonForIncomplete']";
	static String downloadPDF="//span[@id='spnDownloadPDF']";
	
	static String btnClose = "//button[@id='cntrOshrAndEmr_divClose']";
	static String btnSaveAndContinue = "//input[@id='cntrOshrAndEmr_btnNext']";
//			+ "//a[@id='ctrlProofofInsurance_btnNext']";
	static String btnSaveAndClose = "//input[@id='cntrOshrAndEmr_btnSaveClose']";
	static String btnSave = "//input[@id='cntrOshrAndEmr_btnSave']";
	
	
	public static WebElement checkBoxA(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxA));
		return element;
	}public static WebElement checkBoxB(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxB));
		return element;
	}public static WebElement checkBoxC(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxC));
		return element;
	}public static WebElement date(WebDriver driver) {
		element = driver.findElement(By.xpath(date));
		return element;
	}public static WebElement printSignatureName(WebDriver driver) {
		element = driver.findElement(By.xpath(printSignatureName));
		return element;
	}public static WebElement Title(WebDriver driver) {
		element = driver.findElement(By.xpath(Title));
		return element;
	}
	
	public static WebElement checkBoxFlagPage(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxFlagPage));
		return element;
	}public static WebElement radioBtnPendingReview(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnPendingReview));
		return element;
	}public static WebElement radioBtnMarkAsConfirmed(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnMarkAsConfirmed));
		return element;
	}public static WebElement radioBtnMarkAsIncomplete(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnMarkAsIncomplete));
		return element;
	}public static WebElement enrollmenetDate(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmenetDate));
		return element;
	}public static WebElement locationCode(WebDriver driver) {
		element = driver.findElement(By.xpath(locationCode));
		return element;
	}public static WebElement notesAppearOnReport(WebDriver driver) {
		element = driver.findElement(By.xpath(notesAppearOnReport));
		return element;
	}public static WebElement downloadPDF(WebDriver driver) {
		element = driver.findElement(By.xpath(downloadPDF));
		return element;
	}
	
	
	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}public static WebElement btnSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndClose));
		return element;
	}public static WebElement btnSave(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSave));
		return element;
	}
}
