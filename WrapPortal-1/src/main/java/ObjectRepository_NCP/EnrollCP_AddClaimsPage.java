package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_AddClaimsPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	// Claim Information
	static String addCliamsCloseIcon = "//div[@id='modal-claims-data']//div[@class='modal-header']//div[@class='row']/div[3]//button/span";
	static String addCliamsBtn = "//div[@id='modal-claims-data']//div[@class='modal-header']//div[@class='row']/div[2]//a";
	static String addCliamsClickHereLink = "//span[@class='no-record-found']//a[contains(text(),'click here')]";

	static String claimDate = "//input[@id='ClaimDate']";
	static String claimNumber = "#ClaimNumber";
	static String claimAmount = "//input[@id='ClaimAmount']";
	static String ClaimStatusField = "//label[contains(text(),'Claims Status')]/../div/input";
	static String selectClaimStatusFromList = "//label[contains(text(),'Claims Status')]/../div/ul/li";// list
	static String ClaimTypeField = "//label[contains(text(),'Claims Type')]/../div/input";
	static String selectClaimTypeFromList = "//label[contains(text(),'Claims Type')]/../div/ul/li";
	static String reportDate = "//input[@id='ReportDate']";
	static String CloseDate = "//input[@id='ClosedDate']";
	static String LossDate = "//input[@id='LossDate']";
	static String LossTime = "//input[@id='LossTime']";
	static String cliamDescriptionField = "//textarea[@id='ClaimDesc']";

	// Claimant Information
	static String cliamantNameField = "//input[@id='ClaimantName']";
	static String cliamantAddress1 = "//input[@id='ClaimantAddress1']";
	static String cliamantAddress2 = "//input[@id='ClaimantAddress2']";
	static String cliamantCity = "//input[@id='ClaimantCity']";
	static String cliamantCountryField = "//label[contains(text(),'Country')]/../div/input";
	static String cliamantSelectCountyFromList = "//label[contains(text(),'Country')]/../div/ul/li";// list
	static String cliamantStateField = "//label[contains(text(),'Claimant State')]/../div/input";
	static String cliamantSelectStateFromList = "//label[contains(text(),'Claimant State')]/../div/ul/li";
	static String cliamantZIPCode = "//input[@id='ClaimantZip']";
	static String cliamantPhone = "//input[@id='ClaimantPhone']";
	static String cliamantLostDays = "//label[contains(text(),'Lost Days')]/../input";
	static String cliamantPartOfBody = "//label[contains(text(),'Part Of Body')]/../input";
	static String cliamantNatureOfInjury = "//input[@id='NatureOfInjury']";
	static String cliamantCauseDescription = "//textarea[@id='Cause']";

	// Financial Data
	static String InsurerOSMedicalComp = "//input[@id='Ins_OS_Med_BI_Comp']";
	static String InsurerPaidComp = "//input[@id='Ins_Paid_Med_BI_Comp']";
	static String RecoveryReceivedComp = "//input[@id='Recovery_Rec_Med_BI_Comp']";

	static String InsurerOSMedicalColl = "//input[@id='Ins_OS_Indemnity_PD_Coll']";
	static String InsurerPaidCompColl = "//input[@id='Ins_Paid_Indemnity_PD_Coll']";
	static String RecoveryReceivedColl = "//input[@id='Recovery_Rec_Indemnity_PD_Coll']";

	static String InsurerOSMedicalExpence = "//input[@id='Ins_OS_Expense']";
	static String InsurerPaidExpence = "//input[@id='Ins_Paid_Expense']";
	static String RecoveryReceivedExpence = "//input[@id='Recovery_Rec_Expense']";

	static String InsurerOSLegal = "//input[@id='Ins_OS_Legal']";
	static String InsurerPaidLegal = "//input[@id='Ins_Paid_Legal']";

	static String netOSTotal = "//input[@id='Net_OS_Total']";
	static String netIncurredTotal = "//input[@id='Net_Insurred_Total']";
	static String netRecoveryTotal = "//input[@id='NetRecoveryTotal']";
	static String saveBtn = "//a[@id='aSaveClaim']";

	public static WebElement addCliamsCloseIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addCliamsCloseIcon));
		return element;
	}

	public static WebElement addCliamsBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addCliamsBtn));
		return element;
	}

	public static WebElement addCliamsClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addCliamsClickHereLink));
		return element;
	}

	public static WebElement claimDate(WebDriver driver) {
		element = driver.findElement(By.xpath(claimDate));
		return element;
	}

	public static WebElement claimNumber(WebDriver driver) {
		element = driver.findElement(By.cssSelector(claimNumber));
		return element;
	}

	public static WebElement claimAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(claimAmount));
		return element;
	}

	public static WebElement ClaimStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimStatusField));
		return element;
	}

	public static List<WebElement> selectClaimStatusFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectClaimStatusFromList));
		return listElement;
	}

	public static WebElement ClaimTypeField(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimTypeField));
		return element;
	}

	public static List<WebElement> selectClaimTypeFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectClaimTypeFromList));
		return listElement;
	}

	public static WebElement reportDate(WebDriver driver) {
		element = driver.findElement(By.xpath(reportDate));
		return element;
	}

	public static WebElement CloseDate(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseDate));
		return element;
	}

	public static WebElement LossDate(WebDriver driver) {
		element = driver.findElement(By.xpath(LossDate));
		return element;
	}

	public static WebElement LossTime(WebDriver driver) {
		element = driver.findElement(By.xpath(LossTime));
		return element;
	}

	public static WebElement cliamDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamDescriptionField));
		return element;
	}

	public static WebElement cliamantNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantNameField));
		return element;
	}

	public static WebElement cliamantAddress1(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantAddress1));
		return element;
	}

	public static WebElement cliamantAddress2(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantAddress2));
		return element;
	}

	public static WebElement cliamantCity(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantCity));
		return element;
	}

	public static WebElement cliamantCountryField(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantCountryField));
		return element;
	}

	public static List<WebElement> cliamantSelectCountyFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(cliamantSelectCountyFromList));
		return listElement;
	}

	public static WebElement cliamantStateField(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantStateField));
		return element;
	}

	public static WebElement cliamantSelectStateFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantSelectStateFromList));
		return element;
	}

	public static WebElement cliamantZIPCode(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantZIPCode));
		return element;
	}

	public static WebElement cliamantPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantPhone));
		return element;
	}

	public static WebElement cliamantLostDays(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantLostDays));
		return element;
	}

	public static WebElement cliamantPartOfBody(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantPartOfBody));
		return element;
	}

	public static WebElement cliamantNatureOfInjury(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantNatureOfInjury));
		return element;
	}

	public static WebElement cliamantCauseDescription(WebDriver driver) {
		element = driver.findElement(By.xpath(cliamantCauseDescription));
		return element;
	}

	public static WebElement InsurerOSMedicalComp(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerOSMedicalComp));
		return element;
	}

	public static WebElement InsurerPaidComp(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerPaidComp));
		return element;
	}

	public static WebElement RecoveryReceivedComp(WebDriver driver) {
		element = driver.findElement(By.xpath(RecoveryReceivedComp));
		return element;
	}

	public static WebElement InsurerOSMedicalColl(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerOSMedicalColl));
		return element;
	}

	public static WebElement InsurerPaidCompColl(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerPaidCompColl));
		return element;
	}

	public static WebElement RecoveryReceivedColl(WebDriver driver) {
		element = driver.findElement(By.xpath(RecoveryReceivedColl));
		return element;
	}

	public static WebElement InsurerOSMedicalExpence(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerOSMedicalExpence));
		return element;
	}

	public static WebElement InsurerPaidExpence(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerPaidExpence));
		return element;
	}

	public static WebElement RecoveryReceivedExpence(WebDriver driver) {
		element = driver.findElement(By.xpath(RecoveryReceivedExpence));
		return element;
	}

	public static WebElement InsurerOSLegal(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerOSLegal));
		return element;
	}

	public static WebElement InsurerPaidLegal(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurerPaidLegal));
		return element;
	}

	public static WebElement netOSTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(netOSTotal));
		return element;
	}

	public static WebElement netIncurredTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(netIncurredTotal));
		return element;
	}

	public static WebElement netRecoveryTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(netRecoveryTotal));
		return element;
	}

	public static WebElement saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveBtn));
		return element;
	}

}
