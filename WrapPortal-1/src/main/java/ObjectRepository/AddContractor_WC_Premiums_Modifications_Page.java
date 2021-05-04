package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_WC_Premiums_Modifications_Page
{
	private static WebElement element;
	private static List<WebElement> listElement;

	static String enterAllFactorValues="//div[@class='contractorstep2 overflowHide']/table/tbody/tr[3]/td/table/tbody/tr/td[position()>1 and position()<3]";

	// Contractor insurance cost
	// "//span[contains(text(),'Experience Modifier Rate
	// (EMR)')]/ancestor::tbody[@class='sortable-list
	// ui-sortable']/tr[1]/td[2]/input[@type='text']";
	static String ExperienceModifierRateFactorValue = "//td[@class='pad0']//table[@class='table blueTable']/tbody/tr[@class='sortable-item trDelete trDelete0']/td[2]//input[@type='text']";
	static String PremiumDiscountFactorValue = "//td[@class='pad0']//table[@class='table blueTable']/tbody/tr[@class='sortable-item trDelete trDelete1']/td[2]//input[@type='text']";
	static String WaiverOfSubrogationFactorValue = "//input[@id='ctrlPremiumModes_rptPremiumMod_ctl02_txtFactor']";
	static String IncreasedLimitFactorValue = "//input[@id='ctrlPremiumModes_rptPremiumMod_ctl03_txtFactor']";
	static String ScheduledCreditsDebitsFactorValue = "//input[@id='ctrlPremiumModes_rptPremiumMod_ctl04_txtFactor']";
	static String TerrorismChargeFactorValue = "//input[@id='ctrlPremiumModes_rptPremiumMod_ctl05_txtFactor']";
	static String OtherCreditsDebitsFactorValue = "//input[@id='ctrlPremiumModes_rptPremiumMod_ctl06_txtFactor']";
	// for Admin use only xpaths
	static String flagThisPageChechkBox = "//input[@id='ctrlPremiumModes_chkAction']";
	static String formSignedChechkBox = "//input[@id='ctrlPremiumModes_chkFormsSigned']";
	static String pendingReviewRadioBtn = "//input[@id='ctrlPremiumModes_rdoPendingReview']";
	static String markAsConfirmedRadioBtn = "//input[@id='ctrlPremiumModes_rdoConfirm']";
	static String markAsIncompleteRadioBtn = "//input[@id='ctrlPremiumModes_rdoMarkasComplete']";
	static String enrollmentDate = "//input[@id='ctrlPremiumModes_txtEnrollmentDate']";
	static String initialFollowupDate = "//input[@id='ctrlPremiumModes_txtInitFollowup']";
	static String secondFollowupDate = "//input[@id='ctrlPremiumModes_txtSecondFollowup']";
	static String thirdFollowupDate = "//input[@id='ctrlPremiumModes_txtThirdFollowup']";
	static String noticeToProceed = "//input[@id='ctrlPremiumModes_txtNoticeToProceed']";
	static String notesToAppearOnReportsTextArea = "//textarea[@id='ctrlPremiumModes_txtReasonForIncomplete']";
	static String actionNotesTextArea = "//textarea[@id='ctrlPremiumModes_txtActionNotes']";

	static String CreatedDate = "//span[@class='createddate']";
	static String ModifyDate = "//span[@class='modifydate']";
	static String seeMoreModifyByDatesUpArrow = "//i[@class='fa fa-angle-up']";
	static String seeMoreModifyByDatesList = "//div[@id='divModified']/div";// list
	// buttons
	static String btnClose = "//button[@id='ctrlPremiumModes_divClose']";
	static String btnSave = "//input[@id='ctrlPremiumModes_btnSave']";
	static String btnSaveAndClose = "//input[@id='ctrlPremiumModes_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@value='Save and Continue']";

	
	public static List<WebElement> enterAllFactorValues(WebDriver driver) {
		listElement = driver.findElements(By.xpath(enterAllFactorValues));
		return listElement;
	}
	public static WebElement ExperienceModifierRateFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(ExperienceModifierRateFactorValue));
		return element;
	}

	public static WebElement PremiumDiscountFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumDiscountFactorValue));
		return element;
	}

	public static WebElement WaiverOfSubrogationFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(WaiverOfSubrogationFactorValue));
		return element;
	}

	public static WebElement IncreasedLimitFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(IncreasedLimitFactorValue));
		return element;
	}

	public static WebElement ScheduledCreditsDebitsFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(ScheduledCreditsDebitsFactorValue));
		return element;
	}

	public static WebElement TerrorismChargeFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(TerrorismChargeFactorValue));
		return element;
	}

	public static WebElement OtherCreditsDebitsFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(OtherCreditsDebitsFactorValue));
		return element;
	}

	public static WebElement flagThisPageChechkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(flagThisPageChechkBox));
		return element;
	}

	public static WebElement formSignedChechkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(formSignedChechkBox));
		return element;
	}

	public static WebElement pendingReviewRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(pendingReviewRadioBtn));
		return element;
	}

	public static WebElement markAsConfirmedRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markAsConfirmedRadioBtn));
		return element;
	}

	public static WebElement markAsIncompleteRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markAsIncompleteRadioBtn));
		return element;
	}

	public static WebElement enrollmentDate(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmentDate));
		return element;
	}

	public static WebElement initialFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(initialFollowupDate));
		return element;
	}

	public static WebElement secondFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(secondFollowupDate));
		return element;
	}

	public static WebElement thirdFollowupDate(WebDriver driver) {
		element = driver.findElement(By.xpath(thirdFollowupDate));
		return element;
	}

	public static WebElement noticeToProceed(WebDriver driver) {
		element = driver.findElement(By.xpath(noticeToProceed));
		return element;
	}

	public static WebElement notesToAppearOnReportsTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(notesToAppearOnReportsTextArea));
		return element;
	}

	public static WebElement actionNotesTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(actionNotesTextArea));
		return element;
	}

	public static WebElement CreatedDate(WebDriver driver) {
		element = driver.findElement(By.xpath(CreatedDate));
		return element;
	}

	public static WebElement ModifyDate(WebDriver driver) {
		element = driver.findElement(By.xpath(ModifyDate));
		return element;
	}

	public static WebElement seeMoreModifyByDatesUpArrow(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreModifyByDatesUpArrow));
		return element;
	}

	public static WebElement seeMoreModifyByDatesList(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreModifyByDatesList));
		return element;
	}

	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}

	public static WebElement btnSave(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSave));
		return element;
	}

	public static WebElement btnSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndClose));
		return element;
	}

	public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}

}
