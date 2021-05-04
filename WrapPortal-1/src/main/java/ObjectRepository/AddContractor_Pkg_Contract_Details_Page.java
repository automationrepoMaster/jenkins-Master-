package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Contract_Details_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	//pop up for wc work class
	static String estimatedPayrollWorkClassPayrollAlertContinueBtn ="//button[@id='btnSaveModal']";
	// Contractor insurance cost
	static String fieldContractValue = "//input[@id='ctrlInsuranceEnrollment_txtContractPrice']";
	static String fieldSelfPerformedContractValue = "//input[@id='ctrlInsuranceEnrollment_txtSelfContractValue']";
	static String fieldEstimatedCappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtEstCapPayroll']";
	static String fieldEstimatedUncappedPayroll ="//input[@id='ctrlInsuranceEnrollment_txtPayrolls']";
	static String fieldEstimatedManHours = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String fieldEstimatedStartDate = "//input[@id='ctrlInsuranceEnrollment_txtStartDate']";
	static String fieldEstimatedCompletionDate = "//input[@id='ctrlInsuranceEnrollment_txtEndDate']";
	static String selectTypeOfContract = "//select[@id='ctrlInsuranceEnrollment_ddlFixedOrUnitPrice']";
	
	static String estimatedNoOfEmployees = "//input[@id='ctrlInsuranceEnrollment_txtEmployeesAtSite']";
	static String estimatedNoOfSubContractors ="//input[@id='ctrlInsuranceEnrollment_txtEstContractorsNumber']";
	// Briefly Describe the Scope of the Work
	static String redioBtnProgram = "//input[@id='ctrlInsuranceEnrollment_rdoProject']";
	static String redioBtnMaintenance = "//input[@id='ctrlInsuranceEnrollment_rdoMaintenance']";
	static String textAreaBrieflyDescribetheScopeWork = "//textarea[@id='ctrlInsuranceEnrollment_txtBrieflyDescribetheScopeWork']";
	
	// Worker's Compensation - Work Classes
	static String selectWorkClassHamburgericon = "//div[@id='ctrlInsurance_pnlWorkClassWC']/div/div/i[@class='icon20 i-menu-6']";
	static String selectWorkClass = "//div[@id='select2-drop-mask']";
	static String selectWorkClassSearchBox ="//input[@id='s2id_autogen1_search']";
	//static String selectWorkClassAutoCompleteTextField = "//input[@id='s2id_autogen1_search']";
	
	static String selectAllWorkClassFromAutoCompleteDropDown = "//div[@id='select2-drop']/ul/li[*]";// list
	static String fetchAllselectWorkClassFromDropdown = "//ul[@id='select2-results-1']/li[*]";// list
	static String addWorkClassWorkHoursField="//input[@id='ctrlInsuranceEnrollment_txtWCHours']";
	static String addWorkClassUnCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtWCPayroll']";
	static String addWorkClassCappedPayrollField="//input[@id='ctrlInsuranceEnrollment_txtCapPayroll']";
	
	static String addWorkClassRateField="//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
	static String addWorkClassCloseBtn="//div[@id='ctrlInsuranceEnrollment_Div1']//div[@class='panel-body clearfix']/div[8]//button";
	
	static String addWorkClassAddWorkClassBtn="//input[@id='ctrlInsuranceEnrollment_btnAddWC']";
	
	static String editOrDeleteIconSelectedWorkClass = "//table[@id='tblWorkclass']/tbody/tr/td[@class='tableIcon centerAlign']/a[1]";
	static String fetchAllWorkClassList = "//table[@id='tblWorkclass']/tbody/tr[*]";// list
	static String WorkClassWorkersCompensationValue = "//input[@id='ctrlInsuranceEnrollment_TxtTotalWCPremium']";
	static String fetchAllEnrollmentComparisionValue = "//div[@class='col-md-12']//table[@class='table blueTable']/tbody/tr/td";// list
	static String radioBtnWCAndGLEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnOCIP']";
	static String radioBtnWCOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtWCOnly']";
	static String radioBtnGLOnlyEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnGLOnly']";
	static String radioBtnExcludedContractorEnrollment = "//input[@id='ctrlInsuranceEnrollment_rbtnNoCIP']";
	
	
	//Sub contractor info
	
	static String switchSubContractorPerformWorkOnSite = "//div[@class='inner']";
	
	// for Admin use only xpaths
	static String flagThisPageChechkBox = "//input[@id='ctrlInsurance_chkAction']";
	static String formSignedChechkBox = "//input[@id='ctrlInsurance_chkFormsSigned']";
	static String pendingReviewRadioBtn = "//input[@id='ctrlInsurance_rdoPendingReview']";
	static String markAsConfirmedRadioBtn = "//input[@id='ctrlInsurance_rdoConfirm']";
	static String markAsIncompleteRadioBtn = "//input[@id='ctrlInsurance_rdoMarkasComplete']";
	static String enrollmentDate = "//input[@id='ctrlInsurance_txtEnrollmentDate']";
	static String initialFollowupDate = "//input[@id='ctrlInsurance_txtInitFollowup']";
	static String secondFollowupDate = "//input[@id='ctrlInsurance_txtSecondFollowup']";
	static String thirdFollowupDate = "//input[@id='ctrlInsurance_txtThirdFollowup']";
	static String noticeToProceed = "//input[@id='ctrlInsurance_txtNoticeToProceed']";
	static String notesToAppearOnReportsTextArea = "//textarea[@id='ctrlInsurance_txtReasonForIncomplete']";
	static String actionNotesTextArea = "//textarea[@id='ctrlInsurance_txtActionNotes']";
	static String CreatedDate = "//span[@class='createddate']";
	static String ModifyDate = "//span[@class='modifydate']";
	static String seeMoreModifyByDatesUpArrow = "//i[@class='fa fa-angle-up']";
	static String seeMoreModifyByDatesList = "//div[@id='divModified']/div";// list

	static String btnClose = "//button[@id='ctrlInsurance_divClose']";
	static String btnSave = "//input[@value='Save']";
	static String btnSaveAndClose = "//input[@id='ctrlInsurance_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@value='Save and Continue']";
	
	
	public static WebElement addWorkClassCappedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassCappedPayrollField));
		return element;
	}
	public static WebElement fieldEstimatedUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedUncappedPayroll));
		return element;
	}
	public static WebElement estimatedPayrollWorkClassPayrollAlertContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollWorkClassPayrollAlertContinueBtn));
		return element;
	}
	public static WebElement switchSubContractorPerformWorkOnSite(WebDriver driver) {
		element = driver.findElement(By.xpath(switchSubContractorPerformWorkOnSite));
		return element;
	}
	public static WebElement selectWorkClassHamburgericon(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClassHamburgericon));
		return element;
	}
	public static WebElement addWorkClassWorkHoursField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassWorkHoursField));
		return element;
	}/*public static WebElement addWorkClassPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassPayrollField));
		return element;
	}*/public static WebElement addWorkClassRateField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassRateField));
		return element;
	}public static WebElement addWorkClassAddWorkClassBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassAddWorkClassBtn));
		return element;
	}
	
	
	public static WebElement selectWorkClassSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClassSearchBox));
		return element;
	}
	public static WebElement fieldContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldContractValue));
		return element;
	}

	public static WebElement fieldSelfPerformedContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldSelfPerformedContractValue));
		return element;
	}

	/*public static WebElement fieldEstimatedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedPayroll));
		return element;
	}*/

	public static WebElement fieldEstimatedManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedManHours));
		return element;
	}

	public static WebElement fieldEstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedStartDate));
		return element;
	}

	public static WebElement fieldEstimatedCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedCompletionDate));
		return element;
	}

	public static WebElement selectTypeOfContract(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTypeOfContract));
		return element;
	}

	public static WebElement redioBtnProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(redioBtnProgram));
		return element;
	}

	public static WebElement redioBtnMaintenance(WebDriver driver) {
		element = driver.findElement(By.xpath(redioBtnMaintenance));
		return element;
	}

	public static WebElement textAreaBrieflyDescribetheScopeWork(WebDriver driver) {
		element = driver.findElement(By.xpath(textAreaBrieflyDescribetheScopeWork));
		return element;
	}

	public static WebElement selectWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkClass));
		return element;
	}

	//	public static WebElement selectWorkClassAutoCompleteTextField(WebDriver driver) {
	//		element = driver.findElement(By.xpath(selectWorkClassAutoCompleteTextField));
	//		return element;
	//	}

	public static List<WebElement> selectAllWorkClassFromAutoCompleteDropDown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllWorkClassFromAutoCompleteDropDown));
		return listElement;
	}

	public static WebElement fetchAllselectWorkClassFromDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllselectWorkClassFromDropdown));
		return element;
	}

	public static WebElement editOrDeleteIconSelectedWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(editOrDeleteIconSelectedWorkClass));
		return element;
	}

	public static WebElement fetchAllWorkClassList(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllWorkClassList));
		return element;
	}

	public static WebElement WorkClassWorkersCompensationValue(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkClassWorkersCompensationValue));
		return element;
	}

	public static WebElement fetchAllEnrollmentComparisionValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllEnrollmentComparisionValue));
		return element;
	}

	public static WebElement radioBtnWCAndGLEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnWCAndGLEnrollment));
		return element;
	}

	public static WebElement radioBtnWCOnlyEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnWCOnlyEnrollment));
		return element;
	}

	public static WebElement radioBtnGLOnlyEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnGLOnlyEnrollment));
		return element;
	}

	public static WebElement radioBtnExcludedContractorEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnExcludedContractorEnrollment));
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
