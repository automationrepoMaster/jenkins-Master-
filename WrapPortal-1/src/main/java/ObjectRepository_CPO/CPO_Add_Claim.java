package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_Claim 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	// Claim Information

	static String claimDate = "//input[@id='cntrlClaim_txtClaimDate']";
	static String claimNumber = "//input[@id='cntrlClaim_txtClaimNumber']";
	static String claimAmount = "//input[@id='cntrlClaim_txtClaimAmount']";
	
	
	static String selectClaimStatusFromList = "//select[@id='cntrlClaim_ddlClaimStatus']";
	static String selectClaimTypeFromList = "//select[@id='cntrlClaim_ddlClaimType']";
	
	static String reportDate = "//input[@id='cntrlClaim_txtReportDate']";
	static String CloseDate = "//input[@id='cntrlClaim_txtClosedDate']";
	static String LossDate = "//input[@id='cntrlClaim_txtLosDate']";
	static String LossTime = "//input[@id='cntrlClaim_txtLossTime']";
	static String cliamDescriptionField = "//textarea[@id='cntrlClaim_txtClaimDescription']";

	// Claimant Information
	static String cliamantNameField = "//input[@id='cntrlClaim_txtClaimantName']";
	static String cliamantAddress1 = "//input[@id='cntrlClaim_txtClaimantAddress1']";
	static String cliamantAddress2 = "//input[@id='cntrlClaim_txtClaimantAddress2']";
	static String cliamantCity = "//input[@id='cntrlClaim_txtClaimantCity']";
	static String cliamantSelectCountyFromList = "//select[@id='cntrlClaim_ddlCountry']";
	static String cliamantSelectStateFromList = "//select[@id='cntrlClaim_ddlState']";
	static String cliamantZIPCode = "//input[@id='cntrlClaim_txtClaimantZip']";
	static String cliamantPhone = "//input[@id='cntrlClaim_txtClaimantPhone']";
	static String cliamantLostDays = "//input[@id='cntrlClaim_txtLostDays']";
	static String cliamantPartOfBody = "//input[@id='cntrlClaim_txtPartOfBody']";
	static String cliamantNatureOfInjury = "//input[@id='cntrlClaim_txtNatureInjury']";
	static String cliamantCauseDescription = "//textarea[@id='cntrlClaim_txtCause']";

	// Financial Data
	static String InsurerOSMedicalComp = "//input[@id='cntrlClaim_txtIns_OS_Med_BI_Comp']";
	static String InsurerPaidComp = "//input[@id='cntrlClaim_txtIns_Paid_Med_BI_Comp']";
	static String RecoveryReceivedComp = "//input[@id='cntrlClaim_txtRecovery_Rec_Med_BI_Comp']";

	static String InsurerOSMedicalColl = "//input[@id='cntrlClaim_txtIns_OS_Indemnity_PD_Coll']";
	static String InsurerPaidCompColl = "//input[@id='cntrlClaim_txtIns_Paid_Indemnity_PD_Coll']";
	static String RecoveryReceivedColl = "//input[@id='cntrlClaim_txtRecovery_Rec_Indemnity_PD_Coll']";

	static String InsurerOSMedicalExpence = "//input[@id='cntrlClaim_txtIns_OS_Expense']";
	static String InsurerPaidExpence = "//input[@id='cntrlClaim_txtIns_Paid_Expense']";
	static String RecoveryReceivedExpence = "//input[@id='cntrlClaim_txtRecovery_Rec_Expense']";

	static String InsurerOSLegal = "//input[@id='cntrlClaim_txtIns_OS_Legal']";
	static String InsurerPaidLegal = "//input[@id='cntrlClaim_txtIns_Paid_Legal']";

	static String netOSTotal = "//input[@id='cntrlClaim_txtNet_OS_Total']";
	static String netIncurredTotal = "//input[@id='cntrlClaim_txtNet_Insurred_Total']";
	static String netRecoveryTotal = "//input[@id='cntrlClaim_txtNet_Recovery_Total']";
	static String saveAndCloseBtn = "//input[@id='cntrlClaim_btnSaveandClose']";
	static String closeBtn ="//button[@class='btn']";
	
	public static WebElement closeBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(closeBtn));
		return element;
	}

	public static WebElement claimDate(WebDriver driver) {
		element = driver.findElement(By.xpath(claimDate));
		return element;
	}

	public static WebElement claimNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(claimNumber));
		return element;
	}

	public static WebElement claimAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(claimAmount));
		return element;
	}


	public static WebElement selectClaimStatusFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectClaimStatusFromList));
		return element;
	}

	public static WebElement selectClaimTypeFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectClaimTypeFromList));
		return element;
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

	public static List<WebElement> cliamantSelectCountyFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(cliamantSelectCountyFromList));
		return listElement;
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

	public static WebElement saveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndCloseBtn));
		return element;
	}

}
