package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Required_Documents_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String btnClose = "//button[@id='ctrlProofofInsurance_divClose']";
	static String btnSaveAndContinue = "//a[@id='ctrlProofofInsurance_btnNext']";
	// + "//a[@id='ctrlProofofInsurance_btnNext']";
	static String btnAddNewDocument = "//input[@id='ctrlProofofInsurance_btnAddUpdate']";
	static String selectAllDocumentcheckBox = "//div[@class='overflowHide maxTabledata']/table/thead/tr/th[1]/div[@class='checker']";
	static String selectAllDocumentcheckBoxWhatAreYouUploadingPage = "//div[@id='ctrlAddUpdateInsuranceProofDocument_divFixpanel']//tr[*]//div[contains(@class,'checker')]";// list
	static String shareWithContractorSwitch = "//input[@id='ctrlAddUpdateInsuranceProofDocument_chkIsSharedWithContractor']/../div/div";
	static String haveExpirationDateSwitch = "//input[@id='ctrlAddUpdateInsuranceProofDocument_chkEndDates']/../div/div";
	static String clickHereToUploadManualyLink = "//a[contains(text(),'click here')]";
	static String addDocNameOfTheFileField = "//input[@id='ctrlAddUpdateInsuranceProofDocument_txtFileName']";
	static String addDocPlusBtn ="//input[@id='ctrlAddUpdateInsuranceProofDocument_fluUpload1']/..";
	static String addDocAddBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_btnAdd']";
	static String addDocCancelBtn = "//div[@id='ModalAdd']//button[@class='btn'][contains(text(),'Cancel')]";

	static String pendingReviewRadioBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_rdoPendingReview']";
	static String markedAsConfirmedRadioBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_rdoConfirm']";
	static String markedAsIncompleteRadioBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_rdoMarkasComplete']";
	static String enrollmentDateField = "//input[@id='ctrlAddUpdateInsuranceProofDocument_txtEnrollmentDate']";
	static String notesToBeAppearOnReportText = "//textarea[@id='ctrlAddUpdateInsuranceProofDocument_txtReasonForIncomplete']";
	static String actionNotesText = "//textarea[@id='ctrlAddUpdateInsuranceProofDocument_txtActionNotes']";

	static String addDocsaveBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_btnSave']";
	static String addDocsaveAndCloseBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_btnSaveClose']";
	static String addDocsaveAndContinueBtn = "//input[@id='ctrlAddUpdateInsuranceProofDocument_btnNext']";
	static String addDoccloseBtn = "//button[@id='ctrlAddUpdateInsuranceProofDocument_divClose']";

	public static WebElement btnAddNewDocument(WebDriver driver) {
		element = driver.findElement(By.xpath(btnAddNewDocument));
		return element;
	}

	public static WebElement selectAllDocumentcheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectAllDocumentcheckBox));
		return element;
	}

	public static List<WebElement> selectAllDocumentcheckBoxWhatAreYouUploadingPage(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllDocumentcheckBoxWhatAreYouUploadingPage));
		return listElement;
	}

	public static WebElement shareWithContractorSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(shareWithContractorSwitch));
		return element;
	}

	public static WebElement haveExpirationDateSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(haveExpirationDateSwitch));
		return element;
	}

	public static WebElement clickHereToUploadManualyLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereToUploadManualyLink));
		return element;
	}

	public static WebElement addDocNameOfTheFileField(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocNameOfTheFileField));
		return element;
	}

	public static WebElement addDocPlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocPlusBtn));
		return element;
	}

	public static WebElement addDocAddBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocAddBtn));
		return element;
	}

	public static WebElement addDocCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocCancelBtn));
		return element;
	}

	public static WebElement pendingReviewRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(pendingReviewRadioBtn));
		return element;
	}

	public static WebElement markedAsConfirmedRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markedAsConfirmedRadioBtn));
		return element;
	}

	public static WebElement markedAsIncompleteRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(markedAsIncompleteRadioBtn));
		return element;
	}

	public static WebElement enrollmentDateField(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmentDateField));
		return element;
	}

	public static WebElement notesToBeAppearOnReportText(WebDriver driver) {
		element = driver.findElement(By.xpath(notesToBeAppearOnReportText));
		return element;
	}

	public static WebElement actionNotesText(WebDriver driver) {
		element = driver.findElement(By.xpath(actionNotesText));
		return element;
	}

	public static WebElement addDocsaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocsaveBtn));
		return element;
	}

	public static WebElement addDocsaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocsaveAndCloseBtn));
		return element;
	}

	public static WebElement addDocsaveAndContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDocsaveAndContinueBtn));
		return element;
	}

	public static WebElement addDoccloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addDoccloseBtn));
		return element;
	}

	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}

	public static WebElement btnSaveAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndContinue));
		return element;
	}

}
