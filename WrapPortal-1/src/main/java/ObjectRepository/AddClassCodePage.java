package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddClassCodePage {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String addClassCodeWorkClassDescriptionField = "//input[@id='cntrWorkClassAddUpdate_txtWCDescription']";
	static String addClassCodeWorkClassNumberField = "//input[@id='cntrWorkClassAddUpdate_txtWCCode']";
	static String addClassCodeWorkClassCodeField = "//input[@id='cntrWorkClassAddUpdate_txtWCCode']";
	static String addClassCodeWorkClassStatusField = "//select[@id='cntrWorkClassAddUpdate_ddlStatus']";
	static String addClassCodeWorkClassStateField = "//select[@id='cntrWorkClassAddUpdate_ddlState']";

	static String stateSpecificCodeButtonYes = "//button[@id='cntrWorkClassAddUpdate_btnYes']";
	static String checkBox_WC_ClassCode = "//input[@id='cntrWorkClassAddUpdate_chkWCClassType']";
	static String checkBox_GL_ClassCode = "//input[@id='cntrWorkClassAddUpdate_chkGLClassType']";

	static String cappedPayrollCheckBox = "//input[@id='cntrWorkClassAddUpdate_chkIsCappedPayroll']";

	static String addClassCodeSaveAndCloseBtn = "//input[@value='Save and Close']";
	static String addClassCodeCloseBtn = "//button[@class='btn']";

	public static WebElement cappedPayrollCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(cappedPayrollCheckBox));
		return element;
	}

	public static WebElement stateSpecificCodeButtonYes(WebDriver driver) {
		element = driver.findElement(By.xpath(stateSpecificCodeButtonYes));
		return element;
	}

	public static WebElement checkBox_WC_ClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBox_WC_ClassCode));
		return element;
	}

	public static WebElement checkBox_GL_ClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBox_GL_ClassCode));
		return element;
	}

	public static WebElement addClassCodeWorkClassDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeWorkClassDescriptionField));
		return element;
	}

	public static WebElement addClassCodeWorkClassNumberField(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeWorkClassNumberField));
		return element;
	}

	public static WebElement addClassCodeWorkClassCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeWorkClassCodeField));
		return element;
	}

	public static WebElement addClassCodeWorkClassStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeWorkClassStatusField));
		return element;
	}

	public static WebElement addClassCodeWorkClassStateField(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeWorkClassStateField));
		return element;
	}

	public static WebElement addClassCodeSaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeSaveAndCloseBtn));
		return element;
	}

	public static WebElement addClassCodeCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addClassCodeCloseBtn));
		return element;
	}

	// Raja
	
	static String ClassCode ="//li/a[@id='ctl00_ContentPlaceHolder1_ctrlGeneratSetting_aWorkClasses']";
	static String stateSpecificCodeButtonNo = "//button[@id='cntrWorkClassAddUpdate_btnNo']";
	static String claimCodeButtonNo = "//button[@id='cntrWorkClassAddUpdate_btnClaimsCodeNo']";
	static String claimCodeButtonYes = "//button[@id='cntrWorkClassAddUpdate_btnClaimsCodeYes']";
	static String ActiveSwitchClassCode = "//div[@id='uniform-cntrWorkClassAddUpdate_chkIsActive']//div[@class='ios-ui-select checked' or'ios-ui-select']";

	// Raja below 
	public static WebElement ClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(ClassCode));
		return element;
	}
	public static WebElement stateSpecificCodeButtonNo(WebDriver driver) {
		element = driver.findElement(By.xpath(stateSpecificCodeButtonNo));
		return element;
	}

	public static WebElement claimCodeButtonNo(WebDriver driver) {
		element = driver.findElement(By.xpath(claimCodeButtonNo));
		return element;
	}

	public static WebElement claimCodeButtonYes(WebDriver driver) {
		element = driver.findElement(By.xpath(claimCodeButtonYes));
		return element;
	}

	public static WebElement ActiveSwitchClassCode(WebDriver driver) {
		element = driver.findElement(By.xpath(ActiveSwitchClassCode));
		return element;
	}

}
