package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_ContractDetailsPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	//pop up for wc work class
	static String estimatedPayrollWorkClassPayrollAlertContinueBtn ="//button[@id='btnSaveModal']";
	// Contractor insurance cost
	static String fieldContractValue = "//input[@id='ctrlInsurance_txtContractPrice']";
	static String fieldSelfPerformedContractValue = "//input[@id='ctrlInsurance_txtSelfContractValue']";
	static String fieldEstimatedPayroll = "//input[@id='ctrlInsurance_txtPayrolls']";
	static String fieldEstimatedManHours = "//input[@id='ctrlInsurance_txtManHours']";
	static String fieldEstimatedStartDate = "//input[@id='ctrlInsurance_txtStartDate']";
	static String fieldEstimatedCompletionDate = "//input[@id='ctrlInsurance_txtEndDate']";
	static String selectTypeOfContract = "//select[@id='ctrlInsurance_ddlFixedOrUnitPrice']";
	// Briefly Describe the Scope of the Work
	static String redioBtnProgram = "//input[@id='ctrlInsurance_rdoProject']";
	static String redioBtnMaintenance = "//input[@id='ctrlInsurance_rdoMaintenance']";
	static String textAreaBrieflyDescribetheScopeWork = "//textarea[@id='ctrlInsurance_txtBrieflyDescribetheScopeWork']";
	// Worker's Compensation - Work Classes
	static String selectWorkClassHamburgericon = "//div[@id='ctrlInsurance_pnlWorkClassWC']/div/div/i[@class='icon20 i-menu-6']";
	static String selectWorkClass = "//div[@id='s2id_ctrlInsuranceEnrollment_DrpDnWClass']";//input[@id='s2id_autogen1']";//"//div[@id='s2id_ctrlInsurance_DrpDnWClass']";
	//div[@id='ctrlInsuranceEnrollment_pnlAddWorkClass']//div[contains(@class,'pull-left marg')]//div[@id='s2id_ctrlInsuranceEnrollment_DrpDnWClass']
	static String selectWorkClassSearchBox ="//input[@id='s2id_autogen1_search']";//"//input[@id='s2id_autogen1_search']";
//	static String selectWorkClassAutoCompleteTextField = "//input[@id='s2id_autogen1_search']";
	static String selectAllWorkClassFromAutoCompleteDropDown = "//div[@id='select2-drop']/ul/li[*]";// list
	static String fetchAllselectWorkClassFromDropdown = "//ul[@id='select2-results-1']/li[*]";// list
	static String addWorkClassWorkHoursField="//input[@id='ctrlInsurance_txtWCHours']";
	static String addWorkClassPayrollField="//input[@id='ctrlInsurance_txtWCPayroll']";
	static String addWorkClassRateField="//input[@id='ctrlInsurance_txtWCRate']";
	static String addWorkClassAddWorkClassBtn="//input[@id='ctrlInsurance_btnAddWC']";
	static String editOrDeleteIconSelectedWorkClass = "//table[@id='tblWorkclass']/tbody/tr/td//span[contains(text(),'Concrete')]/../../..//a[1]";
	static String fetchAllWorkClassList = "//table[@id='tblWorkclass']/tbody/tr[*]";// list
	static String WorkClassWorkersCompensationValue = "//input[@id='ctrlInsurance_TxtTotalWCPremium']";
	static String fetchAllEnrollmentComparisionValue = "//div[@class='col-md-12']//table[@class='table blueTable']/tbody/tr/td";// list
	static String radioBtnWCAndGLEnrollment = "//input[@id='ctrlInsurance_rbtnOCIP']";
	static String radioBtnWCOnlyEnrollment = "//input[@id='ctrlInsurance_rbtWCOnly']";
	static String radioBtnGLOnlyEnrollment = "//input[@id='ctrlInsurance_rbtnGLOnly']";
	static String radioBtnExcludedContractorEnrollment = "//input[@id='ctrlInsurance_rbtnNoCIP']";
//Sub contractor info
	
	static String switchSubContractorPerformWorkOnSite = "//div[@class='inner']";
	static String btnClose = "//button[@id='ctrlInsurance_divClose']";
	static String btnSave = "//input[@value='Save']";
	static String btnSaveAndClose = "//input[@id='ctrlInsurance_btnSaveClose']";
	static String btnSaveAndContinue = "//input[@value='Save and Continue']";
	
	
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
	}public static WebElement addWorkClassPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassPayrollField));
		return element;
	}public static WebElement addWorkClassRateField(WebDriver driver) {
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

	public static WebElement fieldEstimatedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldEstimatedPayroll));
		return element;
	}

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
	
	//new Alert state wise class code
	static String slectWorkClassCappedStateAlertOkBtn = "//button[@id='btnYes']";
	
	public static WebElement slectWorkClassCappedStateAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(slectWorkClassCappedStateAlertOkBtn));
		return element;
	}
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
