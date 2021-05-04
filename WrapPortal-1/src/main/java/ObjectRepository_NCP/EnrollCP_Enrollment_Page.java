package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_Enrollment_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectMainPageFromLeftSidebar= "//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'My Company Information')]";
	
	public static WebElement selectMainPageFromLeftSidebar(WebDriver driver,String MainPageName) {
		element = driver.findElement(By.xpath("//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'"+MainPageName+"')]"));
		return element;
	}
	
	static String selectMainPageAndSubPageFromLeftSidebar="//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'My Company Information')]/../ul/li/div[contains(text(),'Company Information')]";
	
	public static WebElement selectMainPageAndSubPageFromLeftSidebar(WebDriver driver,String MainPageName,String SubPageName) {
		element = driver.findElement(By.xpath("//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'"+MainPageName+"')]/../ul/li/div[contains(text(),'"+SubPageName+"')]"));
		return element;
	}
	
	//input[@id='previousURL']/../div[2]/div/div[1]//ul[@id='ulMenu']/li
	/*
	 * String MyPolicyInformation =
	 * "//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'My Policy Information')]"
	 * ; String ContractorCostWorksheet =
	 * "//div[@class='treeview-colorful custom-treeview']/ul/li[*]/a[contains(text(),'Contract Cost Worksheet')]"
	 * ; String SubContracotrs =
	 * "//div[@class='treeview-colorful custom-treeview']/ul/li[@id!='liSubContractorSummary']/*[contains(text(),'Sub Contractors')]"
	 * ; String OSHA_EMR =
	 * "//div[@class='treeview-colorful custom-treeview']/ul/li[* and @id!='liOSHAEMRSummary']/*[contains(text(),'OSHA & EMR')]"
	 * ; String ReviewEnrollment =
	 * "//div[@class='treeview-colorful custom-treeview']/ul/li[*]/*[contains(text(),'Review Enrollment')]"
	 * ;
	 */
	
	static String cipAgreementContinueButton ="//a[contains(text(),'Agree and Continue')]";//"//a[@onclick='ContinueEnrollement()']";
	static String cipAgreementConfirmationSubmitDegitalEnrollmentButton ="//a[contains(text(),'Submit Digital Enrollment')]";
	public static WebElement cipAgreementContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(cipAgreementContinueButton));
		return element;
	}
	public static WebElement cipAgreementConfirmationSubmitDegitalEnrollmentButton(WebDriver driver) {
		element = driver.findElement(By.xpath(cipAgreementConfirmationSubmitDegitalEnrollmentButton));
		return element;
	}
	
	// Company Information
	static String updateContractorCompanyLink = "//span[@id='divContractorUpdateLink']//a[@class='link-text'][contains(text(),'Update Contractor Name')]";
	static String contractorNameField = "//label[contains(text(),'Contractor Name')]";
	static String addNewContractorDBALink = "//a[contains(text(),'Click here to add new Contractor DBA')]";
	static String addNewDBAField ="//input[@id='CompanyDBA']";//"//form[@id='frmContractorDBA']//label[contains(text(),'Contractor DBA')]";
	static String addNewDBASaveBtn ="//a[@class='btn btn-dark-green btn-lg float-right']";
	static String selectDBAField = "//label[@class='fix-label'][contains(text(),'Contractor DBA')]";
	static String selectDBAFromList = "//label[@class='fix-label'][contains(text(),'Contractor DBA')]/../div/ul/li";// list
	static String addNewContractorLicenseLink = "//a[contains(text(),'Click here to add new Contractor License')]";
	static String selectContractorLicenseField = "//label[@class='fix-label'][contains(text(),'Contractor License')]";
	static String selectLicenseNoFromList = "//label[@class='fix-label'][contains(text(),'Contractor License')]/../div/ul/li";// list
	static String addNewAddressLink = "//a[contains(text(),'Click here to add new Address')]";
	static String addNewAddressField = "//label[@class='fix-label'][contains(text(),'Contractor Address')]";
	static String selectAddressFromList = "//label[@class='fix-label'][contains(text(),'Contractor Address')]/../div/ul/li";// list
	static String contractorPhoneField = "//label[contains(text(),'Contractor Phone')]/../input";
	static String FEINField = "//label[contains(text(),'Federal ID Number')]/../input[@type='text']";
	static String EMR_Field = "//input[@id='wp.companysection.NCCIExperienceModifierRate']";
	static String EMR_EndDateField = "//input[@id='wp.companysection.NCCIExperienceModifierDate']";
	static String legalStatusField ="//label[@class='fix-label'][contains(text(),'Legal Status')]/..//input";
	static String selectLegalStatus = "//label[@class='fix-label'][contains(text(),'Legal Status')]/..//ul/li";// list
	static String btnContinue = "//a[contains(text(),'Continue')]";
	static String btnSaveAndExit = "//a[contains(text(),'Save and Exit')]";

	public static WebElement updateContractorCompanyLink(WebDriver driver) {
		element = driver.findElement(By.xpath(updateContractorCompanyLink));
		return element;
	}

	public static WebElement contractorNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorNameField));
		return element;
	}

	public static WebElement addNewContractorDBALink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContractorDBALink));
		return element;
	}

	public static WebElement addNewDBAField(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewDBAField));
		return element;
	}
	public static WebElement addNewDBASaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewDBASaveBtn));
		return element;
	}
	
	public static WebElement selectDBAField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectDBAField));
		return element;
	}

	public static List<WebElement> selectDBAFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectDBAFromList));
		return listElement;
	}

	public static WebElement addNewContractorLicenseLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContractorLicenseLink));
		return element;
	}

	public static WebElement selectContractorLicenseField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorLicenseField));
		return element;
	}

	public static List<WebElement> selectLicenseNoFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectLicenseNoFromList));
		return listElement;
	}

	public static WebElement addNewAddressLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewAddressLink));
		return element;
	}

	public static WebElement addNewAddressField(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewAddressField));
		return element;
	}

	public static List<WebElement> selectAddressFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAddressFromList));
		return listElement;
	}

	public static WebElement contractorPhoneField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPhoneField));
		return element;
	}

	public static WebElement FEINField(WebDriver driver) {
		element = driver.findElement(By.xpath(FEINField));
		return element;
	}

	public static WebElement EMR_Field(WebDriver driver) {
		element = driver.findElement(By.xpath(EMR_Field));
		return element;
	}

	public static WebElement EMR_EndDateField(WebDriver driver) {
		element = driver.findElement(By.xpath(EMR_EndDateField));
		return element;
	}

	public static WebElement legalStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(legalStatusField));
		return element;
	}
	public static List<WebElement> selectLegalStatus(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectLegalStatus));
		return listElement;
	}

	public static WebElement btnContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnContinue));
		return element;
	}

	public static WebElement btnSaveAndExit(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndExit));
		return element;
	}

	// Primary Contact
	static String primaryContactFirstName = "//label[contains(text(),'First Name')]/../input";
	static String primaryContactLastName = "//label[contains(text(),'Last Name')]/../input";
	static String primaryContactPhone = "//label[contains(text(),'Phone')]/../input";
	static String primaryContactEmail = "//label[contains(text(),'Email')]/../input";
	static String primaryContactFax = "//label[contains(text(),'Fax')]/../input";
	static String sameAsPrimaryContactCheckBox = "//label[@class='form-check-label']";
	static String addNewContactLink = "//a[@class='link-text aNewContact']";
	static String selectPayrollContactField = "//label[contains(text(),'Contact')]/span[contains(text(),'1')]/../../div/input";
	static String selectPayrollContactFromList = "//label[contains(text(),'Contact')]/span[contains(text(),'1')]/../../div/ul/li";// list
	static String btnBack = "//a[contains(text(),'Continue')]/../../div[1]//a";

	public static WebElement primaryContactFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath(primaryContactFirstName));
		return element;
	}

	public static WebElement primaryContactLastName(WebDriver driver) {
		element = driver.findElement(By.xpath(primaryContactLastName));
		return element;
	}

	public static WebElement primaryContactPhone(WebDriver driver) {
		element = driver.findElement(By.xpath(primaryContactPhone));
		return element;
	}

	public static WebElement primaryContactEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(primaryContactEmail));
		return element;
	}

	public static WebElement primaryContactFax(WebDriver driver) {
		element = driver.findElement(By.xpath(primaryContactFax));
		return element;
	}

	public static WebElement sameAsPrimaryContactCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(sameAsPrimaryContactCheckBox));
		return element;
	}

	public static WebElement addNewContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContactLink));
		return element;
	}

	public static WebElement selectPayrollContactField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectPayrollContactField));
		return element;
	}

	public static List<WebElement> selectPayrollContactFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectPayrollContactFromList));
		return listElement;
	}

	public static WebElement btnBack(WebDriver driver) {
		element = driver.findElement(By.xpath(btnBack));
		return element;
	}

	// Contract Details
	static String contractPriceField = "//input[@id='wp.contractorcost.contrprice']";
	static String selefPerformContractValue = "//input[@id='wp.contractorcost.contrselfvalue']";
	static String estimatedManhours = "//input[@id='wp.contractorcost.contrhours']";
	static String estimatedUncappedPayroll = "//input[@id='wp.contractorcost.contrpayroll']";
	static String contractNumber = "//input[@id='wp.contractorcost.contractnumber']";
	static String estimatedCappedPayroll = "//input[@id='wp.contractorcost.contrcappayroll']";
	static String estimatedStartDate = "//input[@id='wp.contractorcost.contrstartdate']";
	static String estimatedEndDate = "//input[@id='wp.contractorcost.contrenddate']";
	static String selectFixedCostSwitch = "//input[@id='wp.contractorcost.isfixedpriceorunitprice']/../label[1]";
	static String selectUnitCostSwitch = "//input[@id='wp.contractorcost.isfixedpriceorunitprice']/../label[2]";
	static String radioBtnProgram = "//input[@id='rdoProject']";
	static String radioBtnMaintenance = "//input[@id='rdoMaintenance']";
	static String ScopeOfWorkTestArea = "//textarea[@id='wp.contractorcost.brieflydescribework']";
	static String selectUpperTierContractorField = "//label[@class='fix-label']/../div/input";
	static String selectUpperTierContractorFromList = "//label[@class='fix-label']/../div/ul/li";// list
	static String company_Minority_Owned_Business_Yes = "//div[@id='divCustomField']//div[contains(text(),'Certified DBE')]/../div[2]//label[1]";
	static String company_Minority_Owned_Business_No = "//div[@id='divCustomField']//div[contains(text(),'Certified DBE')]/../div[2]//label[2]";
	static String company_Local_DisAdv_BusinessEnterprise_Yes = "//div[@id='divCustomField']//div[contains(text(),'Certified LDBE')]/../div[2]//label[1]";
	static String company_Local_DisAdv_BusinessEnterprise_No = "//div[@id='divCustomField']//div[contains(text(),'Certified LDBE')]/../div[2]//label[2]";
	static String does_Your_Work_Involve_Handling_Yes = "//div[@id='divCustomField']//div[contains(text(),'Does your work involve handling')]/../div[2]//label[1]";
	static String does_Your_Work_Involve_Handling_No = "//div[@id='divCustomField']//div[contains(text(),'Does your work involve handling')]/../div[2]//label[2]";
	static String does_Your_Work_Involve_Removing_Asbestos_Yes = "//div[@id='divCustomField']//div[contains(text(),'Does your work involes removing asbestos materials')]/../div[2]//label[1]";
	static String does_Your_Work_Involve_Removing_Asbestos_No = "//div[@id='divCustomField']//div[contains(text(),'Does your work involes removing asbestos materials')]/../div[2]//label[2]";
	static String does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_Yes = "//div[@id='divCustomField']//div[contains(text(),'employee leasing service or temporary staffing')]/../div[2]//label[1]";
	static String does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_No = "//div[@id='divCustomField']//div[contains(text(),'employee leasing service or temporary staffing')]/../div[2]//label[2]";

	public static WebElement contractPriceField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractPriceField));
		return element;
	}

	public static WebElement selefPerformContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(selefPerformContractValue));
		return element;
	}

	public static WebElement estimatedManhours(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedManhours));
		return element;
	}

	public static WebElement estimatedUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedUncappedPayroll));
		return element;
	}

	public static WebElement contractNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(contractNumber));
		return element;
	}

	public static WebElement estimatedCappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedCappedPayroll));
		return element;
	}

	public static WebElement estimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedStartDate));
		return element;
	}

	public static WebElement estimatedEndDate(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedEndDate));
		return element;
	}

	public static WebElement selectFixedCostSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFixedCostSwitch));
		return element;
	}

	public static WebElement selectUnitCostSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUnitCostSwitch));
		return element;
	}

	public static WebElement radioBtnProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnProgram));
		return element;
	}

	public static WebElement radioBtnMaintenance(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnMaintenance));
		return element;
	}

	public static WebElement ScopeOfWorkTestArea(WebDriver driver) {
		element = driver.findElement(By.xpath(ScopeOfWorkTestArea));
		return element;
	}

	public static WebElement selectUpperTierContractorField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUpperTierContractorField));
		return element;
	}

	public static List<WebElement> selectUpperTierContractorFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectUpperTierContractorFromList));
		return listElement;
	}

	public static WebElement company_Minority_Owned_Business_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(company_Minority_Owned_Business_Yes));
		return element;
	}

	public static WebElement company_Minority_Owned_Business_No(WebDriver driver) {
		element = driver.findElement(By.xpath(company_Minority_Owned_Business_No));
		return element;
	}

	public static WebElement company_Local_DisAdv_BusinessEnterprise_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(company_Local_DisAdv_BusinessEnterprise_Yes));
		return element;
	}

	public static WebElement company_Local_DisAdv_BusinessEnterprise_No(WebDriver driver) {
		element = driver.findElement(By.xpath(company_Local_DisAdv_BusinessEnterprise_No));
		return element;
	}

	public static WebElement does_Your_Work_Involve_Handling_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Work_Involve_Handling_Yes));
		return element;
	}

	public static WebElement does_Your_Work_Involve_Handling_No(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Work_Involve_Handling_No));
		return element;
	}

	public static WebElement does_Your_Work_Involve_Removing_Asbestos_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Work_Involve_Removing_Asbestos_Yes));
		return element;
	}

	public static WebElement does_Your_Work_Involve_Removing_Asbestos_No(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Work_Involve_Removing_Asbestos_No));
		return element;
	}

	public static WebElement does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_Yes));
		return element;
	}

	public static WebElement does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_No(WebDriver driver) {
		element = driver.findElement(By.xpath(does_Your_Company_Utilize_Employee_Leasing_Temp_Staff_Service_No));
		return element;
	}

	// Alert
	static String CVtoPayrollRatio_Alert_LetContinueBtn = "//button[contains(@class,'confirm btn btn-primary')]";
	static String CVtoPayrollRatio_Alert_GoBackReviewBtn = "//button[contains(@class,'cancel btn btn-default')]";
	static String SPCVtoPayrollRatio_Alert_OKBtn = "//button[contains(@class,'confirm btn btn-primary')]";
	static String SPCVtoPayrollRatio_Alert_CancelBtn = "//button[contains(@class,'cancel btn btn-default')]";

	public static WebElement CVtoPayrollRatio_Alert_LetContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CVtoPayrollRatio_Alert_LetContinueBtn));
		return element;
	}

	public static WebElement CVtoPayrollRatio_Alert_GoBackReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CVtoPayrollRatio_Alert_GoBackReviewBtn));
		return element;
	}

	public static WebElement SPCVtoPayrollRatio_Alert_OKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SPCVtoPayrollRatio_Alert_OKBtn));
		return element;
	}

	public static WebElement SPCVtoPayrollRatio_Alert_CancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SPCVtoPayrollRatio_Alert_CancelBtn));
		return element;
	}

	/*
	 * String btnExit="//a[contains(text(),'Exit')]"; String
	 * calenderStartDateClick="//input[@id='wp.contractorcost.contrstartdate']";
	 * String calenderSelectStartYear=
	 * "//div[@id='wp.contractorcost.contrstartdate_root']//div[@class='picker__wrap']//select[1]";
	 * String calenderSelectStartMonth=
	 * "//div[@id='wp.contractorcost.contrstartdate_root']//div[@class='picker__wrap']//select[2]";
	 * String calenderSelectStartDay=
	 * "//div[@id='wp.contractorcost.contrstartdate_root']//div[@class='picker__wrap']//table/tbody//tr//td/div[contains(text(),'10')]";
	 * String
	 * calenderEndaDateClick="//input[@id='wp.contractorcost.contrenddate']";
	 * String calenderSelectEndYear=
	 * "//div[@id='wp.contractorcost.contrenddate_root']//select[@class='picker__select--year']";
	 * String calenderSelectEndMonth=
	 * "//div[@id='wp.contractorcost.contrenddate_root']//select[@class='picker__select--month']";
	 * String calenderSelectEndDay=
	 * "//div[@id='wp.contractorcost.contrenddate_root']//div[@class='picker__wrap']//table/tbody//tr//td/div[contains(text(),'13')]";
	 */
	static String btnAddWorkClass = "//*[contains(@class,'add-new-work-class')]";
	static String WCClassCodeField = "//div[@class='div-new-work-class-data']/div[1]//label[@class='fix-label-input']/../ul/li/input";
			//"//div[@class='div-new-work-class-data']/div[1]//label[@class='fix-label-input'][contains(text(),'Work Class & Work Class Code')]/../ul/li/input";
//	static String WCClassCodeDropDown="//div[@class='select-wrapper mdb-select md-form colorful-select dropdown-primary form-control-dynamic ddlWorkClass']//ul/li[*]";
	static String WCClassCodeDeleteBtn = "//div[@class='div-new-work-class-data']/div[1]//label[@class='fix-label-input'][contains(text(),'Work Class & Work Class Code')]/../ul/../../following-sibling::div[1]/a";
	static String WCHoursField = "//div[@class='div-new-work-class-data']/div[1]//label[@class='active'][contains(text(),'Hours')]/../input[@type='text']";
	static String WCUncappedPayrollField = "//div[@class='div-new-work-class-data']/div[1]//label[@class='active'][contains(text(),'Uncapped Payroll')]/../input[@type='text']";
	static String WCCappedPayrollField = "//div[@class='div-new-work-class-data']/div[1]//label[@class='active'][contains(text(),'Capped Payroll')]/../input[@type='text']";
	static String WCRateField = "//div[@class='div-new-work-class-data']/div[1]/div[4]/div/div[4]//input[@type='text']";
	static String WCPremiumField = "//div[@class='div-new-work-class-data']/div[1]/div[4]/div/div[5]//input[@type='text']";
	static String WCTotalManulPremiumField = "//input[@class='form-control form-control-dynamic form-control-decimal txt-amount-work-class txtTotalManualPremium']";
	static String WCRateGreaterThenAlertOK = "//button[@class='confirm btn btn-primary']";
	static String WCRateGreaterThenAlertCancel = "//button[@class='cancel btn btn-default']";
	// My Company Information preview screen and edit option while enrolling
	static String CompanyInformationEditBtn = "//h5[contains(text(),'Company Information')]/../a[contains(text(),'Edit')]";
	static String PrimaryContactEditBtn = "//h5[contains(text(),'Primary Contact')]/../a[contains(text(),'Edit')]";
	static String PayrollContactEditBtn = "//h5[contains(text(),'Payroll Contact')]/../a[contains(text(),'Edit')]";
	static String ContactorDetailsEditBtn = "//h5[contains(text(),'Contractor Details')]/../a[contains(text(),'Edit')]";
	static String StartAndEndDateEditBtn = "//h5[contains(text(),'Start & End Dates')]/../a[contains(text(),'Edit')]";
	static String TypeOfContractEditBtn = "//h5[contains(text(),'Type of Contract')]/../a[contains(text(),'Edit')]";
	static String BrieflyDescribeScopeOfWorkEditBtn = "//h5[contains(text(),'Briefly Describe the Scope of Work')]/../a[contains(text(),'Edit')]";
	static String TotalManualCostEditBtn = "//*[contains(text(),'Total Manual Cost')]/../../../..//a[contains(text(),'Edit')]";

	
	static String cappedUncappedAlertOKBtn ="//button[contains(text(),'OK')]";
	
	public static WebElement cappedUncappedAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cappedUncappedAlertOKBtn));
		return element;
	}
	public static WebElement btnAddWorkClass(WebDriver driver) {
		element = driver.findElement(By.xpath(btnAddWorkClass));
		return element;
	}

	public static WebElement WCClassCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCClassCodeField));
		return element;
	}

	public static WebElement WCClassCodeDeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WCClassCodeDeleteBtn));
		return element;
	}

	public static WebElement WCHoursField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCHoursField));
		return element;
	}

	public static WebElement WCUncappedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCUncappedPayrollField));
		return element;
	}

	public static WebElement WCCappedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCCappedPayrollField));
		return element;
	}

	public static WebElement WCRateField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCRateField));
		return element;
	}

	public static WebElement WCPremiumField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCPremiumField));
		return element;
	}

	public static WebElement WCTotalManulPremiumField(WebDriver driver) {
		element = driver.findElement(By.xpath(WCTotalManulPremiumField));
		return element;
	}

	public static WebElement WCRateGreaterThenAlertOK(WebDriver driver) {
		element = driver.findElement(By.xpath(WCRateGreaterThenAlertOK));
		return element;
	}

	public static WebElement WCRateGreaterThenAlertCancel(WebDriver driver) {
		element = driver.findElement(By.xpath(WCRateGreaterThenAlertCancel));
		return element;
	}

	public static WebElement CompanyInformationEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompanyInformationEditBtn));
		return element;
	}

	public static WebElement PrimaryContactEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PrimaryContactEditBtn));
		return element;
	}

	public static WebElement PayrollContactEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollContactEditBtn));
		return element;
	}

	public static WebElement ContactorDetailsEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContactorDetailsEditBtn));
		return element;
	}

	public static WebElement StartAndEndDateEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(StartAndEndDateEditBtn));
		return element;
	}

	public static WebElement TypeOfContractEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TypeOfContractEditBtn));
		return element;
	}

	public static WebElement BrieflyDescribeScopeOfWorkEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(BrieflyDescribeScopeOfWorkEditBtn));
		return element;
	}

	public static WebElement TotalManualCostEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(TotalManualCostEditBtn));
		return element;
	}

	// Premium Modifications//need to create dynamic through script with div tag
	static String FactorField = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div[1]/div[2]/div/div[1]//input[@type='text']";
	static String BasedOnField = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div[1]/div[2]/div/div[2]//input[@type='text']";
	static String AddToBtn = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div[1]/div[2]/div/div[3]/a[contains(text(),'Add to')]";
	static String AdjustmentValue = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div[1]/div[2]/div/div[4]/div[@id='divAmount']";
	static String PremiumValue = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div[1]/div[2]/div/div[5]//div[@id='divPremium']";

	static String PremiumModificationWCPremiumField = "//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[2]/div[2]/div[1]/../div/div[2]//input[@type='text']";
	static String PremiumModificationDeductibleRedionBtn = "//label[contains(text(),'Deductible')]/../input[@type='radio']";
	static String PremiumModificationRetentionRedionBtn = "//label[contains(text(),'Retention')]/../input[@type='radio']";
	static String PremiumModificationDeductibleRateField = "//label[contains(text(),'Retention')]/../../../div[2]//input";

	public static WebElement FactorField(WebDriver driver, int modificationRateNo) {
		element = driver.findElement(By
				.xpath("//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div['"
						+ modificationRateNo + "']/div[2]/div/div[1]//input[@type='text']"));
		return element;
	}

	public static WebElement BasedOnField(WebDriver driver, int modificationRateNo) {
		element = driver.findElement(By
				.xpath("//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div['"
						+ modificationRateNo + "']/div[2]/div/div[2]//input[@type='text']"));
		return element;
	}

	public static WebElement AddToBtn(WebDriver driver, int modificationRateNo) {
		element = driver.findElement(By
				.xpath("//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div['"
						+ modificationRateNo + "']/div[2]/div/div[3]/a[contains(text(),'Add to')]"));
		return element;
	}

	public static WebElement AdjustmentValue(WebDriver driver, int modificationRateNo) {
		element = driver.findElement(By
				.xpath("//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div['"
						+ modificationRateNo + "']/div[2]/div/div[4]/div[@id='divAmount']"));
		return element;
	}

	public static WebElement PremiumValue(WebDriver driver, int modificationRateNo) {
		element = driver.findElement(By
				.xpath("//h1[contains(text(),'Let’s look over your Rates and Premium Modifications')]/../form/div[1]/div[2]/div['"
						+ modificationRateNo + "']/div[2]/div/div[5]//div[@id='divPremium']"));
		return element;
	}

	public static WebElement PremiumModificationWCPremiumField(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumModificationWCPremiumField));
		return element;
	}

	public static WebElement PremiumModificationDeductibleRedionBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumModificationDeductibleRedionBtn));
		return element;
	}

	public static WebElement PremiumModificationRetentionRedionBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumModificationRetentionRedionBtn));
		return element;
	}

	public static WebElement PremiumModificationDeductibleRateField(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumModificationDeductibleRateField));
		return element;
	}

	// gl dynamic xpath with table
	static String selectGLClassCode = "//div[@class='div-additional-gl overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div";
	static String selectGLClassCodeFromList = "//div[@class='div-additional-gl overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li";// list
	static String glradioBtnUncappedPayroll = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label";
	static String glradioBtnContractValue = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label";
	static String glradioBtnSelfPerformPrice = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label";
	static String glradioBtnSubContractorCost = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label";
	static String glradioBtnWorkerCompensation = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label";
	static String glradioBtnFlatPremium = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label";
	static String glradioBtnPerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label";
	static String glradioBtnOther = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label";
	static String glselectRatePerUnitField = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[3]/td[1]//input";
	static String glselectRatePerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[3]/td[1]//ul/li";
	static String glselectRateField = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[1]/tbody/tr[4]/td[1]//input";
	static String btnAddGeneralLiability = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/../div[2]//a";
	static String AddGeneralLiabilitySaveBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[2]/tbody/tr[5]/td//button[2]";
	static String AddGeneralLiabilityCancelBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table[2]/tbody/tr[5]/td//button[1]";

	static String glSIRLossChargeField = "//div[@id='div-general-liability-loss-charge']/div[1]/div/div[2]/input";
	static String glDeductibleRadioBtn = "//label[contains(text(),'Deductible')]";
	static String glRetentionRadioBtn = "//label[contains(text(),'Retention')]";
	static String glDeductibleField = "//input[@class='form-control textenabled flftnone tip txt-captured-deductible']";

	public static WebElement selectGLClassCode(WebDriver driver, int GL_No) {
		element = driver.findElement(By.xpath("//div[@class='div-additional-gl overflow-auto']/table['" + GL_No
				+ "']//label[@class='active'][contains(text(),'Class Code')]/../div"));
		return element;
	}

	public static List<WebElement> selectGLClassCodeFromList(WebDriver driver, int GL_No) {
		listElement = driver.findElements(By.xpath("//div[@class='div-additional-gl overflow-auto']/table['" + GL_No
				+ "']//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li"));
		return listElement;
	}

	public static WebElement glradioBtnUncappedPayroll(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnContractValue(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnSelfPerformPrice(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnSubContractorCost(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnWorkerCompensation(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnFlatPremium(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnPerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label"));
		return element;
	}

	public static WebElement glradioBtnOther(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label"));
		return element;
	}

	public static WebElement glselectRatePerUnitField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//input"));
		return element;
	}

	public static WebElement glselectRatePerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//ul/li"));
		return element;
	}

	public static WebElement glselectRateField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[4]/td[1]//input"));
		return element;
	}

	public static WebElement btnAddGeneralLiability(WebDriver driver, int GL_No) {
		element = driver.findElement(By.xpath(
				"//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/../div[2]//a"));
		return element;
	}

	public static WebElement AddGeneralLiabilitySaveBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[2]"));
		return element;
	}

	public static WebElement AddGeneralLiabilityCancelBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-gl overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[1]"));
		return element;
	}

	public static WebElement glSIRLossChargeField(WebDriver driver) {
		element = driver.findElement(By.xpath(glSIRLossChargeField));
		return element;
	}

	public static WebElement glDeductibleRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(glDeductibleRadioBtn));
		return element;
	}

	public static WebElement glRetentionRadioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(glRetentionRadioBtn));
		return element;
	}

	public static WebElement glDeductibleField(WebDriver driver) {
		element = driver.findElement(By.xpath(glDeductibleField));
		return element;
	}

	// umb dynamic xpath with table
	static String selectUMBClassCode = "//div[@class='div-additional-umbrella overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div";

	public static WebElement selectUMBClassCode(WebDriver driver, int GL_No) {
		element = driver.findElement(By.xpath("//div[@class='div-additional-umbrella overflow-auto']/table['"+GL_No+"']//label[@class='active'][contains(text(),'Class Code')]/../div"));
		return element;
	}

	static String selectUMBClassCodeFromList = "//div[@class='div-additional-umbrella overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li";

	public static List<WebElement> selectUMBClassCodeFromList(WebDriver driver, int GL_No) {
		listElement = driver.findElements(By.xpath("//div[@class='div-additional-umbrella overflow-auto']/table['"
				+ GL_No + "']//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li"));
		return listElement;
	}

	static String umbradioBtnUncappedPayroll = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label";

	public static WebElement umbradioBtnUncappedPayroll(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnContractValue = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label";

	public static WebElement umbradioBtnContractValue(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnSelfPerformPrice = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label";

	public static WebElement umbradioBtnSelfPerformPrice(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnSubContractorCost = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label";

	public static WebElement umbradioBtnSubContractorCost(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnWorkerCompensation = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label";

	public static WebElement umbradioBtnWorkerCompensation(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnFlatPremium = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label";

	public static WebElement umbradioBtnFlatPremium(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnPerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label";

	public static WebElement umbradioBtnPerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label"));
		return element;
	}

	static String umbradioBtnOther = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label";

	public static WebElement umbradioBtnOther(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label"));
		return element;
	}

	static String umbselectRatePerUnitField = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[3]/td[1]//input";

	public static WebElement umbselectRatePerUnitField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//input"));
		return element;
	}

	static String umbselectRatePerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[3]/td[1]//ul/li";

	public static WebElement umbselectRatePerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//ul/li"));
		return element;
	}

	static String umbselectRateField = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[1]/tbody/tr[4]/td[1]//input";

	public static WebElement umbselectRateField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[4]/td[1]//input"));
		return element;
	}

	static String btnAddUmbrellaLiability = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/../div[2]//a";

	public static WebElement btnAddUmbrellaLiability(WebDriver driver, int GL_No) {
		element = driver.findElement(By.xpath(
				"//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/../div[2]//a"));
		return element;
	}

	static String AddUmbrellaLiabilitySaveBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[2]/tbody/tr[5]/td//button[2]";

	public static WebElement AddUmbrellaLiabilitySaveBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[2]"));
		return element;
	}

	static String AddUmbrellaLiabilityCancelBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table[2]/tbody/tr[5]/td//button[1]";

	public static WebElement AddUmbrellaLiabilityCancelBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-umbrella overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[1]"));
		return element;
	}

	// pollution dynamic Xpath
	static String selectPollClassCode = "//div[@class='div-additional-pollution overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div";

	public static WebElement selectPollClassCode(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='div-additional-pollution overflow-auto']/table['"+GL_No+"']//label[@class='active'][contains(text(),'Class Code')]/../div"));
		return element;
	}

	static String selectPollClassCodeFromList = "//div[@class='div-additional-pollution overflow-auto']/table[1]//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li";

	public static List<WebElement> selectPollClassCodeFromList(WebDriver driver, int GL_No) {
		listElement = driver.findElements(By.xpath("//div[@class='div-additional-pollution overflow-auto']/table['"
				+ GL_No + "']//label[@class='active'][contains(text(),'Class Code')]/../div/ul/li"));
		return listElement;
	}

	static String pollradioBtnUncappedPayroll = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label";

	public static WebElement pollradioBtnUncappedPayroll(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnContractValue = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label";

	public static WebElement pollradioBtnContractValue(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnSelfPerformPrice = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label";

	public static WebElement pollradioBtnSelfPerformPrice(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnSubContractorCost = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label";

	public static WebElement pollradioBtnSubContractorCost(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnWorkerCompensation = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label";

	public static WebElement pollradioBtnWorkerCompensation(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnFlatPremium = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label";

	public static WebElement pollradioBtnFlatPremium(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnPerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label";

	public static WebElement pollradioBtnPerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]/div/label"));
		return element;
	}

	static String pollradioBtnOther = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label";

	public static WebElement pollradioBtnOther(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[1]/div/label"));
		return element;
	}

	static String pollselectRatePerUnitField = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[3]/td[1]//input";

	public static WebElement pollselectRatePerUnitField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//input"));
		return element;
	}

	static String pollselectRatePerUnit = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[3]/td[1]//ul/li";

	public static WebElement pollselectRatePerUnit(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[3]/td[1]//ul/li"));
		return element;
	}

	static String pollselectRateField = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[1]/tbody/tr[4]/td[1]//input";

	public static WebElement pollselectRateField(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[4]/td[1]//input"));
		return element;
	}

	static String btnAddPollutionLiability = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/../div[2]//a";

	public static WebElement btnAddPollutionLiability(WebDriver driver, int GL_No) {
		element = driver.findElement(By.xpath(
				"//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/../div[2]//a"));
		return element;
	}

	static String AddPollutionLiabilitySaveBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[2]/tbody/tr[5]/td//button[2]";

	public static WebElement AddPollutionLiabilitySaveBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[2]"));
		return element;
	}

	static String AddPollutionLiabilityCancelBtn = "//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table[2]/tbody/tr[5]/td//button[1]";

	public static WebElement AddPollutionLiabilityCancelBtn(WebDriver driver, int GL_No) {
		element = driver.findElement(By
				.xpath("//div[@class='row div-liability-details']//div[@class='div-additional-pollution overflow-auto']/table['"
						+ GL_No + "']/tbody/tr[5]/td//button[1]"));
		return element;
	}

	// premium modifiers edit
	static String WCEditBtn = "//h5[contains(text(),'Workers' Compensation Cost')]/../../div[3]//a";
	static String GLEditBtn = "//h5[contains(text(),'General Liability Cost')]/../../div[3]//a";
	static String GL_SIREditBtn = "//h5[contains(text(),'General Liability Deductible/SIR Loss Charge')]/../../div[3]//a";
	static String UMBEditBtn = "//h5[contains(text(),'Umbrella Liability Cost')]/../../div[3]//a";
	static String PollEditBtn = "//h5[contains(text(),'Pollution Liability Cost')]/../../div[3]//a";

	static String PremiumModificationTotal = "//input[@class='form-control txt-cost-for-insurance']";
	static String lookGoodContinueBtn = "//a[contains(text(),'Looks Good, Continue')]";

	public static WebElement WCEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WCEditBtn));
		return element;
	}

	public static WebElement GLEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLEditBtn));
		return element;
	}

	public static WebElement GL_SIREditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_SIREditBtn));
		return element;
	}

	public static WebElement UMBEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(UMBEditBtn));
		return element;
	}

	public static WebElement PollEditBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PollEditBtn));
		return element;
	}

	public static WebElement PremiumModificationTotal(WebDriver driver) {
		element = driver.findElement(By.xpath(PremiumModificationTotal));
		return element;
	}

	public static WebElement lookGoodContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(lookGoodContinueBtn));
		return element;
	}

	// SubContractor Cost Page
	static String subContractorCostYesBtn = "//div[contains(@class,'btn-group custom-btn-group')]/label[1]";
	static String subContractorCostNoBtn = "//div[contains(@class,'btn-group custom-btn-group')]/label[2]";
	static String subContractorCostAddNewContractorLink = "//a[contains(@class,'link-text')]";
	static String subContractorCostSearchContractorField = "//label[contains(text(),'Contractor Name')]/../input";
	static String subContractorCostSelectContractorFromList = "//label[contains(text(),'Contractor Name')]/../ul/li";// list
	static String subContractorCostContractorNoField = "//div[@id='divContractNumber']//label[contains(text(),'Contract Number')]";
	static String subContractorCostTradeField = "//input[@id='token-input-TradeIdEncrypted']";
	static String subContractorCostSelectTradeFromList = "//input[@id='token-input-TradeIdEncrypted']/..";// ;list
	static String subContractorCostEstmitedStartDate = "//input[@id='ContrPackageStartDate']";
	static String subContractorCostSaveBtn = "//*[contains(text(),'Save a Subcontractor')]";

	static String letMeOutBtn = "//a[contains(text(),'Let Me Out')]";
	static String checkMyInfoBtn = "//a[contains(text(),'Check My Info')]";
	static String submitEnrollmentBtn = "//a[contains(text(),'Submit Enrollment')]";
	static String CompleteBtn = "//a[contains(text(),'Complete')]";

	public static WebElement subContractorCostYesBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostYesBtn));
		return element;
	}

	public static WebElement subContractorCostNoBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostNoBtn));
		return element;
	}

	public static WebElement subContractorCostAddNewContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostAddNewContractorLink));
		return element;
	}

	public static WebElement subContractorCostSearchContractorField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostSearchContractorField));
		return element;
	}

	public static List<WebElement> subContractorCostSelectContractorFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(subContractorCostSelectContractorFromList));
		return listElement;
	}

	public static WebElement subContractorCostContractorNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostContractorNoField));
		return element;
	}

	public static WebElement subContractorCostTradeField(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostTradeField));
		return element;
	}

	public static List<WebElement> subContractorCostSelectTradeFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(subContractorCostSelectTradeFromList));
		return listElement;
	}

	public static WebElement subContractorCostEstmitedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostEstmitedStartDate));
		return element;
	}

	public static WebElement subContractorCostSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorCostSaveBtn));
		return element;
	}

	public static WebElement letMeOutBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(letMeOutBtn));
		return element;
	}

	public static WebElement checkMyInfoBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(checkMyInfoBtn));
		return element;
	}

	public static WebElement submitEnrollmentBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(submitEnrollmentBtn));
		return element;
	}

	public static WebElement CompleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompleteBtn));
		return element;
	}

}
