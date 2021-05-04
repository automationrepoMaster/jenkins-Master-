package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractorPackageModule {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String addIcon = "//i[@class='fa fa-plus']";
	static String editIcon = "//i[@class='fa fa-pencil-square-o']";
	static String deleteIcon = "//i[@class='fa fa-trash-o']";
	static String searchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_txtSearch']";
	static String searchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	static String advanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String advanceSearchSelectProgram = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlProject']";// select
	static String advanceSearchSelectProject = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlWorkSite']";// select
	static String advanceSearchSelectEnrollmenttype = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlEnrollmentType']";// select
	static String advanceSearchSelectContractorStatus = "//div[@class='dropMain']//a";
	static String advanceSearchSelectStatusFromDropdownList = "//div[@class='mutliSelect']/ul/li[*]//input[@type='checkbox']";// list
	static String advanceSearchSelectContractorType = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlContractorType']";
	static String advanceSearchSelectDivision = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlDivision']";
	static String advanceSearchSearchForTrade = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntrlContractorList_txtTradePackages']";
	static String advanceSearchSearchByCntractor = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntrlContractorList_txt_Contractor']";
	static String advanceSearchSearchByPolicyNumber = "//input[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_txtPolicyNumber']";
	static String advanceSearchSearchByContractorNumber = "//input[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_txtContractNumber']";
	static String advanceSearchSelectCategory = "//button[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_btnDropdown']";
	static String advanceSearchSelectFlag = "//i[@class='icon20 i-flag lightredflag']";
	static String advanceSearchSelectSortingExpression = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlSortingExpression']";
	static String advanceSearchSelectSortingOrder = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlSortingOrder']";
	static String advanceSearchCloseBtn = "//button[@class='btn']";
	static String advanceSearchSearchBtn = "//input[@id='btnAdvanceSearch']";

	static String clearIcon = "//i[@class='fa fa-refresh']";
	static String viewProjectDetailsIcon = "//div[@class='rightButtonGroup']//li[2]//a[1]//i[1]";
	static String seeMoreLink = "//a[@id='aSeeMore']";
	static String displayingAllCountOfContractorPkg = "//span[contains(text(),'Displaying')]";
	static String displayingTotalCountOfContractorPkg ="//span[contains(text(),'Displaying')]//span[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_lblTotalRecord']";
	
	static String contractorPkgSelectFirstContractorPkgFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]";
	static String contractorPkgSelectAllContractorPkgFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]";// list
	static String selectDynamicContractorPkg="//ul[@id='ulNoteList']/li[*]//div[@class='companytitle' and contains(text(),'Sony Contractor 29')]/..//div[@class='workSite' and contains(text(),'Sony Project Five')]/../../div[2]/div[3 and contains(text(),'524114')]";
	static String contractorPkgSelectAllContractorNameFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[1]/div[1]";
	static String contractorPkgSelectAllProjectNameFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[1]/div[2]";
	static String contractorPkgSelectAllEnrollmentTypeFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[1]/div[3]";
	static String contractorPkgSelectAllStatusFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[2]/div[1]";
	static String contractorPkgSelectAllProgramNameFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[2]/div[2]";
	static String contractorPkgSelectAllTradeNameFrmList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='listingMain flft']/div[2]/div[3]";
	
	static String singleContractorPkgStatus ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]//div[@class='listingMain flft']/div[2]/div[1]";
	public static WebElement singleContractorPkgStatus(WebDriver driver)
	{
		element = driver.findElement(By.xpath(singleContractorPkgStatus));
		return element;
	}
	
	// Preview Panel elements
	static String notesToAppearOnReportIconPriviewP = "//i[contains(@class,'fa fa-commenting')]";
	static String reassignIconPriviewP = "//i[contains(@class,'fa fa-retweet')]";
	static String automationOnOffIconPriviewP = "//i[contains(@class,'fa fa-cog')]";
	static String categoryIconPriviewP = "//a[@id='btnDropdown']//i[contains(@class,'fa fa-th-large')]";
	static String flagIconPriviewP = "//i[contains(@class,'i-flag')]";
	
	static String fetchContratoraAndComapanyNamePriviewP = "//a[contains(@href,'frmUser.aspx?')]";//div[@class='headingGroup clearfix']";
	static String fetchProjectNamePriviewP = "//span[@id='ltrWorkSite']";
	static String fetchProgramNamePriviewP = "//a[contains(@href,'frmProject.aspx?')]";//span[@id='lblDivisionName']";
	static String fetchDistrictNamePriviewP ="//a[contains(@href,'frmDivision.aspx?')]";
	static String fetchTradeNamePriviewP = "//a[contains(@href,'frmTrade.aspx?')]";//span[@id='lblTrade']";
	
	
	static String fetchContractorPkgNumberPriviewP = "//span[@id='lblPackageID']";
	static String fetchContractorPkgTypePriviewP = "//span[@id='lblContractorType']";
	static String fetchContractorPkgAllStatusPriviewP = "//ul[@class='form-wizardTab']/li[*]/div[*]";// list
	
	
	static String NonCIP_CompliancePriviewP ="//a[@id='aTrackingComplianceLimit']";
	static String InsuranceEnrollmentPagePriviewP = "//a[@id='aInsuranceEnrollment']";//a[@id='aInsuranceEnrollment']
	static String ContractDetailPagePriviewP = "//a[@id='aInsuranceCost']";
	static String WCPremiumModificationsPagePriviewP = "//a[@id='aWCPremiums']";
	static String GLandUmbrellaCoveragePagePriviewP = "//a[@id='aGLUmbrellaCoverage']";
	static String RequiredDocumentsPagePriviewP = "//a[@id='aRequiredInsuranceDocument']";
	static String RequiredDocumentsCountPriviewP = "//span[@id='spnRequiredInsuranceDocumentCount']";
	
	static String RequiredDocumentsSeeMorePriviewP = "//span[@id='imgRIDSee']";
	static String fetchAllRequiredDocumentsValuePriviewP = "//div[@id='divRID']//table[@class='table darkTable']/tbody/tr[*]/td";// list
	static String SubContractorPagePriviewP = "//a[@id='aSubContractorList']";
	static String AddSubContractorBtnPriviewP = "//a[contains(text(),'Add Sub Contractor')]";

//Certificate section
	static String CertificatePagePriviewP = "//a[@id='aCertificates']";
	static String CertificateAutoGenerateBtnPriviewP ="//a[@id='btnGenerateCertificate']";
	static String CertificateManageBtnPriviewP ="//a[@id='aCertificateAutoManage']";
	static String AutoMobileCertificateNoPriviewP ="//td[contains(text(),'Automobile Liability')]/../td[2]";
	
	public static WebElement AutoMobileCertificateNoPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(AutoMobileCertificateNoPriviewP));
		return element;
	}
	
	
	
	public static WebElement CertificateAutoGenerateBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateAutoGenerateBtnPriviewP));
		return element;
	}
	
	public static WebElement CertificateManageBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateManageBtnPriviewP));
		return element;
	}
	
	
	
	static String CertificateCountPriviewP = "//span[@id='spnCertificatesCount']";
	static String CertificateSeeMorePriviewP = "//span[@id='imgCertificatessee']";
	static String fetchAllCertificateValuePriviewP = "//div[@id='divCertificates']//table[@class='table darkTable']/tbody/tr[*]/td";//list
	static String CertificateDownloadCertificatePriviewP = "//span[contains(text(),'Download Certificate')]";
	static String CertificateEmailCertificatePriviewP = "//span[contains(text(),'Email Certificate')]";
	static String CertificateManagePriviewP = "//span[contains(text(),'Manage')]";
	static String PolicyPagePriviewP = "//a[@id='aPolicyDocuments']";
	static String PolicyCountPriviewP = "//span[@id='spnPolicyDocumentCount']";
	static String PolicySeeMorePriviewP = "//span[@id='imgPolicyDocument']";
	static String fetchAllPolicyNamePriviewP = "//div[@id='accordion']//h3[*]";

	static String MonthlyPayrollPagePriviewP = "//a[@id='aMonthlyPayroll']";
	static String MonthlyPayrollCountPriviewP = "//span[@id='spnMontlyPayrollCount']";
	static String fetchTotalPayrollPriviewP = "//span[@id='spnTotalPayroll']";
	static String MonthlyPayrollSeeMorePriviewP = "//span[@id='imgMPsee']";
	static String MonthlyPayrollTotalRowPriviewP ="//td[contains(text(),'Grand Total:')]/../td[position()>1 and position()<4]/span";
	
	static String ChangeOrderInsuranceCostAdjustmentPriviewP = "//a[@id='aChangeOrderAdjustment']";
	static String SeeMoreLinkChngOrdrInsuCostPriviewP ="//span[@id='imgCOAsee']";
	static String totalAdjustmentValueChngOrdrInsuCostPriviewP ="//span[@id='spnTotalAdjustmentPrice']";
	
	
	static String ClaimsPagePriviewP = "//a[@id='aClaim']";
	static String SafetyObservationPagePriviewP = "//a[@id='aSafety']";
	static String CompletionNoticePagePriviewP = "//a[@id='aCompletionNotice']";
	static String fetchCompletionNoticeDatePriviewP = "//span[@id='lblActualEndDate']";

	static String provideContractorAccessBtnPriviewP = "//a[@class='abutton pull-right']";
	static String fetchContractorAccessContractorNamePriviewP = "//div[@id='divUserAccessData']/div/div[1]";
	static String reportsPanelLinkPriviewP = "//div[@class='panelbar beefup-head']";
	static String allReportsCountPriviewP = "//div[@class='carousel-wrapper']/div/div[*]";//list
	static String createdByPriviewP = "//span[@class='createddate']";
	static String modifiedByPriviewP = "//span[@class='modifydate']";
	static String contractorProfileReportPriviewP = "//div[@id='divContractorProfile']";
	static String contractorInsuranceCostReportPriviewP = "//a[@id='aContractorDeduct']";
	static String subContractorStatusReportPriviewP = "//a[@id='aSubContractorstatus']";
	static String missingPayrollReportPriviewP = "//a[@id='aMissingPayroll']";
	static String financialAnalysisReportPriviewP = "//a[@id='aFinancialAnalysis']";
	static String contractorPayrollManHoursRatePriviewP = "//a[@id='aContractorPayrollManHours']";
	static String reportNextArrowBtnPriviewP = "//a[contains(@class,'carousel-button-right')]";
	static String reportBackArrowBtnPriviewP = "//a[contains(@class,'carousel-button-left')]";
	
	static String eachContrPkgProgramToastMsg = "//ul[@id='ulNoteList']/li[*]/div/div[1]/div/div[2]/div[2]/div";
			//"//div[starts-with(@id,'divProject')]";
			//"//ul[@id='ulNoteList']//div[starts-with(@id,'divProject')]";
	static String eachContrPkg="//ul[@id='ulNoteList']/li[*]";
	
	

	// selecting all enrollment objects
	// div[@id='divUserActivity']//div[@class='contractorstep1
	// clearfix']/div/div/div[*]
	// div[@id='divUserActivity']/div[*]/div[@class='col-md-12']/div/div[*]/div[*]/div

	public static WebElement selectDynamicContractorPkg(WebDriver driver,String contractorName,String projectName,String tradeNo) {
		//element = driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle' and contains(text(),'"+contractorName+"')]/..//div[@class='workSite' and contains(text(),'"+projectName+"')]/../../div[2]/div[3 and contains(text(),'"+tradeNo+"')]"));
		element = driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'"+contractorName+"')]/../..//div[@class='workSite']/span[contains(text(),'"+projectName+"')]/../../../div[2]/div[3]/span[contains(text(),'"+tradeNo+"')]"));		
		return element;
		
		//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'Alex Comp3524')]/../..//div[@class='workSite']/span[contains(text(),'Sony Projects3524')]/../../../div[2]/div[3]/span[contains(text(),'TRNO4627')]
	}
	
//	Reports/ContractorDeductTracking.aspx?
	public static WebElement selectReport(WebDriver driver,String reportName) {
		element = driver.findElement(By.xpath("//div[@class='carousel-wrapper']//a[contains(@href,'"+reportName+"')]"));
		return element;
	}
	
	public static List<WebElement> contractorPkgSelectAllContractorNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllContractorNameFrmList));
		return listElement;
	}
	public static List<WebElement> contractorPkgSelectAllProjectNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllProjectNameFrmList));
		return listElement;
	}public static List<WebElement> contractorPkgSelectAllEnrollmentTypeFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllEnrollmentTypeFrmList));
		return listElement;
	}public static List<WebElement> contractorPkgSelectAllStatusFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllStatusFrmList));
		return listElement;
	}public static List<WebElement> contractorPkgSelectAllProgramNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllProgramNameFrmList));
		return listElement;
	}public static List<WebElement> contractorPkgSelectAllTradeNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllTradeNameFrmList));
		return listElement;
	}
	
	public static List<WebElement> eachContrPkgProgramToastMsg(WebDriver driver) {
		listElement = driver.findElements(By.xpath(eachContrPkgProgramToastMsg));
		return listElement;
	}
	public static List<WebElement> eachContrPkg(WebDriver driver) {
		listElement = driver.findElements(By.xpath(eachContrPkg));
		return listElement;
	}

	public static WebElement totalAdjustmentValueChngOrdrInsuCostPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(totalAdjustmentValueChngOrdrInsuCostPriviewP));
		return element;
	}
	public static WebElement SeeMoreLinkChngOrdrInsuCostPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(SeeMoreLinkChngOrdrInsuCostPriviewP));
		return element;
	}

	public static WebElement addIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addIcon));
		return element;
	}

	public static WebElement editIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(editIcon));
		return element;
	}

	public static WebElement deleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteIcon));
		return element;
	}

	public static WebElement searchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(searchEditBox));
		return element;
	}

	public static WebElement searchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(searchIcon));
		return element;
	}

	public static WebElement advanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchIcon));
		return element;
	}

	public static WebElement advanceSearchSelectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectProgram));
		return element;
	}

	public static WebElement advanceSearchSelectProject(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectProject));
		return element;
	}

	public static WebElement advanceSearchSelectEnrollmenttype(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectEnrollmenttype));
		return element;
	}

	public static WebElement advanceSearchSelectContractorStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectContractorStatus));
		return element;
	}
	
	public static WebElement advanceSearchSelect_Single_StatusFromDropdown(WebDriver driver,String statusType) {
		element = driver.findElement(By.xpath("//div[@class='mutliSelect']/ul/li[*]//input[@type='checkbox' and @value='"+statusType+"']"));
		return element;
	}

	public static List<WebElement> advanceSearchSelectStatusFromDropdownList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(advanceSearchSelectStatusFromDropdownList));
		return listElement;
	}

	public static WebElement advanceSearchSelectContractorType(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectContractorType));
		return element;
	}

	public static WebElement advanceSearchSelectDivision(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectDivision));
		return element;
	}

	public static WebElement advanceSearchSearchForTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchForTrade));
		return element;
	}

	public static WebElement advanceSearchSearchByCntractor(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchByCntractor));
		return element;
	}

	public static WebElement advanceSearchSearchByPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchByPolicyNumber));
		return element;
	}

	public static WebElement advanceSearchSearchByContractorNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchByContractorNumber));
		return element;
	}

	public static WebElement advanceSearchSelectCategory(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectCategory));
		return element;
	}

	public static WebElement advanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectFlag));
		return element;
	}

	public static WebElement advanceSearchSelectSortingExpression(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectSortingExpression));
		return element;
	}

	public static WebElement advanceSearchSelectSortingOrder(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSelectSortingOrder));
		return element;
	}

	public static WebElement advanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchCloseBtn));
		return element;
	}

	public static WebElement advanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchBtn));
		return element;
	}

	public static WebElement clearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(clearIcon));
		return element;
	}

	public static WebElement viewProjectDetailsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(viewProjectDetailsIcon));
		return element;
	}

	public static WebElement seeMoreLink(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreLink));
		return element;
	}

	public static WebElement displayingALLCountOfContractorPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(displayingAllCountOfContractorPkg));
		return element;
	}

	public static WebElement displayingTotalCountOfContractorPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(displayingTotalCountOfContractorPkg));
		return element;
	}

	public static WebElement contractorPkgSelectFirstContractorPkgFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPkgSelectFirstContractorPkgFrmList));
		return element;
	}

	public static List<WebElement> contractorPkgSelectAllContractorPkgFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(contractorPkgSelectAllContractorPkgFrmList));
		return listElement;
	}

	public static WebElement notesToAppearOnReportIconPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(notesToAppearOnReportIconPriviewP));
		return element;
	}

	public static WebElement reassignIconPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(reassignIconPriviewP));
		return element;
	}

	public static WebElement automationOnOffIconPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(automationOnOffIconPriviewP));
		return element;
	}

	public static WebElement categoryIconPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(categoryIconPriviewP));
		return element;
	}

	public static WebElement flagIconPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(flagIconPriviewP));
		return element;
	}

	public static WebElement fetchContratoraAndComapanyNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchContratoraAndComapanyNamePriviewP));
		return element;
	}

	public static WebElement fetchProjectNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchProjectNamePriviewP));
		return element;
	}
	
	public static WebElement fetchDistrictNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchDistrictNamePriviewP));
		return element;
	}
	public static WebElement fetchProgramNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchProgramNamePriviewP));
		return element;
	}

	public static WebElement fetchTradeNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchTradeNamePriviewP));
		return element;
	}

	public static WebElement fetchContractorPkgNumberPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchContractorPkgNumberPriviewP));
		return element;
	}

	public static WebElement fetchContractorPkgTypePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchContractorPkgTypePriviewP));
		return element;
	}

	public static List<WebElement> fetchContractorPkgAllStatusPriviewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchContractorPkgAllStatusPriviewP));
		return listElement;
	}
	
	public static WebElement NonCIP_CompliancePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIP_CompliancePriviewP));
		return element;
	}
	
	public static WebElement InsuranceEnrollmentPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentPagePriviewP));
		return element;
	}

	public static WebElement ContractDetailPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractDetailPagePriviewP));
		return element;
	}

	public static WebElement WCPremiumModificationsPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(WCPremiumModificationsPagePriviewP));
		return element;
	}

	public static WebElement GLandUmbrellaCoveragePagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(GLandUmbrellaCoveragePagePriviewP));
		return element;
	}

	public static WebElement RequiredDocumentsSeeMorePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(RequiredDocumentsSeeMorePriviewP));
		return element;
	}

	public static List<WebElement> fetchAllRequiredDocumentsValuePriviewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchAllRequiredDocumentsValuePriviewP));
		return listElement;
	}

	public static WebElement SubContractorPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorPagePriviewP));
		return element;
	}

	public static WebElement AddSubContractorBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(AddSubContractorBtnPriviewP));
		return element;
	}

	public static WebElement CertificatePagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatePagePriviewP));
		return element;
	}

	public static WebElement CertificateCountPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateCountPriviewP));
		return element;
	}

	public static WebElement CertificateSeeMorePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateSeeMorePriviewP));
		return element;
	}

	public static List<WebElement> fetchAllCertificateValuePriviewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchAllCertificateValuePriviewP));
		return listElement;
	}

	public static WebElement CertificateDownloadCertificatePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateDownloadCertificatePriviewP));
		return element;
	}

	public static WebElement CertificateEmailCertificatePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateEmailCertificatePriviewP));
		return element;
	}

	public static WebElement CertificateManagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificateManagePriviewP));
		return element;
	}

	public static WebElement PolicyPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyPagePriviewP));
		return element;
	}

	public static WebElement PolicyCountPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyCountPriviewP));
		return element;
	}

	public static WebElement PolicySeeMorePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicySeeMorePriviewP));
		return element;
	}

	public static WebElement fetchAllPolicyNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAllPolicyNamePriviewP));
		return element;
	}

	public static WebElement MonthlyPayrollPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(MonthlyPayrollPagePriviewP));
		return element;
	}

	public static WebElement MonthlyPayrollCountPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(MonthlyPayrollCountPriviewP));
		return element;
	}

	public static WebElement fetchTotalPayrollPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchTotalPayrollPriviewP));
		return element;
	}

	public static WebElement MonthlyPayrollSeeMorePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(MonthlyPayrollSeeMorePriviewP));
		return element;
	}
	public static List<WebElement> MonthlyPayrollTotalRowPriviewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(MonthlyPayrollTotalRowPriviewP));
		return listElement;
	}
	
	
	
	public static WebElement ChangeOrderInsuranceCostAdjustmentPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(ChangeOrderInsuranceCostAdjustmentPriviewP));
		return element;
	}

	public static WebElement ClaimsPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(ClaimsPagePriviewP));
		return element;
	}

	public static WebElement SafetyObservationPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(SafetyObservationPagePriviewP));
		return element;
	}

	public static WebElement CompletionNoticePagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticePagePriviewP));
		return element;
	}

	public static WebElement fetchCompletionNoticeDatePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchCompletionNoticeDatePriviewP));
		return element;
	}

	public static WebElement provideContractorAccessBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(provideContractorAccessBtnPriviewP));
		return element;
	}

	public static WebElement fetchContractorAccessContractorNamePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchContractorAccessContractorNamePriviewP));
		return element;
	}

	public static WebElement reportsPanelLinkPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(reportsPanelLinkPriviewP));
		return element;
	}

	public static List<WebElement> allReportsCountPriviewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allReportsCountPriviewP));
		return listElement;
	}

	public static WebElement createdByPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(createdByPriviewP));
		return element;
	}

	public static WebElement modifiedByPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(modifiedByPriviewP));
		return element;
	}

	public static WebElement contractorProfileReportPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorProfileReportPriviewP));
		return element;
	}

	public static WebElement contractorInsuranceCostReportPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorInsuranceCostReportPriviewP));
		return element;
	}

	public static WebElement subContractorStatusReportPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(subContractorStatusReportPriviewP));
		return element;
	}

	public static WebElement missingPayrollReportPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(missingPayrollReportPriviewP));
		return element;
	}

	public static WebElement financialAnalysisReportPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(financialAnalysisReportPriviewP));
		return element;
	}

	public static WebElement contractorPayrollManHoursRatePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPayrollManHoursRatePriviewP));
		return element;
	}

	public static WebElement reportNextArrowBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(reportNextArrowBtnPriviewP));
		return element;
	}

	public static WebElement reportBackArrowBtnPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(reportBackArrowBtnPriviewP));
		return element;
	}
	
	public static WebElement RequiredDocumentsPagePriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(RequiredDocumentsPagePriviewP));
		return element;
	}
	public static WebElement RequiredDocumentsCountPriviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(RequiredDocumentsCountPriviewP));
		return element;
	}
	
	// Raja Xpath for Alert added at Payroll
	
	static String AlertOKBtnPayroll ="//button[@class='btn btn-primary pull-right']";
	
	public static WebElement AlertOKBtnPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(AlertOKBtnPayroll));
		return element;
	}
	
	// Raja wrote this from contractorStatusValidationpage 
	
	static String contractorName = "Mark Boucher";
	static String projectName = "Hercules PJ";
	static String tradeNo = "2085 | TradeDynamic-";

	

	static String plusBtn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liadd']//i[@class='fa fa-plus']"; // a/i[@class='fa
	static String EditBrn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_liedit']/a/i[@class='fa fa-pencil-square-o']";
	// fa-plus']";
	static String DeleteBtn = "//li[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_lidelete']/a/i[@class='fa fa-trash-o']";
	static String selectProgram = "//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']";
	// "//div[@id='s2id_cntrlAddUpdateContractor_ddlProject']//label[@class='select2-offscreen']";
	static String selectProgramSearchBox = "//input[@id='s2id_autogen4_search']";
	static String selectProgramDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	static String selectProject = "//div[@id='s2id_cntrlAddUpdateContractor_ddlWorkSite']";
	static String selectProjectSearchBox = "//input[@id='s2id_autogen5_search']";
	static String selectProjectDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	static String selectTrade = "//div[@id='s2id_cntrlAddUpdateContractor_ddlTrade']";
	static String selectTradeSearchBox = "//input[@id='s2id_autogen8_search']";// this xpath work for dev
//				"//input[@id='s2id_autogen7_search']";//this xpath work for beta
	static String selectTradeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";
	static String addNewTradeLink = "//div[@id='cntrlAddUpdateContractor_divAddTrade']//a[@class='alinkText'][contains(text(),'click here to add')]";

	static String selectUpperTierContractor = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorUpperTier']";
	static String selectUpperTierContractorSearchBox = "//div[@id='select2-drop']//div[@class='select2-search']//input";
	static String selectUpperTierContractorDropdownAutocomplete = "//ul[@id='select2-results-9']/li[*]";// list
	static String UpperTierContractorlist = "//ul[@id='select2-results-15']/li";
	static String selectContractor = "//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
	// "//ul[@class='token-input-list-facebook']";
//				"//div[@id='cntrlAddUpdateContractor_divContractor']/ul/li/input[@type='text']";
//				"//input[@id='token-input-cntrlAddUpdateContractor_txtGeneralContractor']";
	static String editSelectedContractorLink = "//a[@id='aEditContractors']";
	static String addNewContractorLink = "//a[@id='aContractorPackages']";

	static String SelectContact = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContacts']";
	static String SelectContactSearchBox = "//input[@id='s2id_autogen6_search']";
	static String SelectContactAutoCompllete = "//input[@id='s2id_autogen6_search']/../../ul/li[*]";
//				"//input[@id='s2id_autogen6_search']/../../ul/li[*]";
    static String PreBidContractorPkgs="//li[@id='ctl00_ctrlMenu_liPreBidContracts']";
	static String selectEnrollmentType = "//div[@id='s2id_cntrlAddUpdateContractor_ddlContractorType']";
	static String selectEnrollmentTypeSearchBox = "//input[@id='s2id_autogen7_search']";
	// below xpath is use while adding cp from project level
	static String selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel = "//div[@id='select2-drop']//div[@class='select2-search']/input[contains(@id,'s2id_autogen')]";

	static String selectEnrollmentTypeDropdownAutocomplete = "//div[@id='select2-drop']//div[@class='select2-search']/../ul/li[*]";// list

	static String selectOffsiteInsuranceCompliance = "//select[@id='cntrlAddUpdateContractor_ddlCompliance']";
	static String clickHereToComplianceLink = "//a[contains(text(),'click here to add Compliance)')]";
	static String btnNext = "//input[@id='cntrlAddUpdateContractor_btnNext']";
	static String alertConfirmComplianceContinueBtn = "//*[@class='btn btn-success pull-right'  and @id='btnSaveModal']";

	static String non_CIP_Compliance = "//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']";
	static String non_CIP_ComplianceList = "//div[@id='uniform-cntrlAddUpdateContractor_ddlCompliance']//select//../option";
	// "//div[@id='s2id_cntrlAddUpdateContractor_ddlCompliance']/../div[2]/select";
	static String nonCIPCompliancename = "//div[@class='select2-drop select2-display-none select2-drop-active']//ul//li//div[contains(text(),'Hercules-Non-CIP')]"; // ul[@id='select2-results-1']//li//div[@class]//span[@class]
	// ul[@id='select2-results-1']/li"; //ul[@id='select2-results-1']/li[2]";
	static String ContarctorpkgsaveAndCloseBtn = "//input[@id='cntrlAddUpdateContractor_btnSaveandClose']";
	static String sendEmailCloseBtn = "//button[@id='btnCloseWindow']";
	static String sendEmailSendAndCloseBtn = "//input[@id='btnSend']";
	static String cancelContractorPkgBtn = "//input[@id='cntrlAddUpdateContractor_btncancel']";
	static String cancelContractorPkgBtnAlertOKBtn = "//button[@id='btnSaveModal']";
	static String cancelContractorPkgBtnAlertCancelBtn = "//button[@id='btnCloseModal']";
	static String StatusesList_Enrollment = "//div[@class='col-md-12 clearfix']//ul//li";
	static String Enrollment_frame = "//iframe[@id='ifrmPreview']";
	static String CompletionNoticeFrameLink = "//a[@id='aCompletionNotice']";
	static String SelectPayrollperiod = "//select[@id='cntrlMissingPayroll_ddlPayrollMonths']";
	static String InsurancePagelink = "//a[@id='aInsuranceEnrollment']";
	static String MoreBtnContractorPackage = "//a//span//i[@class='marg-right-10 fa fa-caret-down' or 'marg-right-10 fa fa-caret-up']";
	static String ContractorPKgMinimumRequirementsSwitch = "//div[@id='uniform-cntrlAddUpdateContractor_chkConditionalEnrollment']//div[@class='ios-ui-select checked' or 'ios-ui-select']";
	static String ContractorPKgContractNumber = "//input[@id='cntrlAddUpdateContractor_txtContractNumber']";
	static String ContractorPkgEstimatedStartDate = "//input[@id='cntrlAddUpdateContractor_txtStartDate']";
	static String ContractorPkgContractStatusDropdown="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractStatus']";
	static String ContractorPkgContractorTypeDropdown="//div[@id='s2id_cntrlAddUpdateContractor_ddlContractType']";
	static String ContractorPkgContractTypeList = "//ul[@id='select2-results-2']//li[*]";
	static String ContractorPkgContractStatusList = "//ul[@id='select2-results-3']//li[*]";
	static String ContractorPkgContractStatusList_NotAwarded="//ul[@id='select2-results-3']//li[2]";
	static String ContractorPkgBrieflyDescribeTheScope = "//textarea[@id='cntrlAddUpdateContractor_txtBriefDescription']";
	static String ContractorPkgNotes = "//textarea[@id='cntrlAddUpdateContractor_txtCommentsOrNotes']";
	static String ContractorPkgPayRollCvSubmission = "//select[@id='cntrlAddUpdateContractor_ddlFrequency']";
	static String ContractorPkgReportingTimePeriod = "//select[@id='cntrlAddUpdateContractor_ddlReporting']";
	static String ContractorPkgDuedate = "//input[@id='cntrlAddUpdateContractor_txtDueDate']";
	static String PrebidContractorPkgs="//a[@id='ctl00_ctrlMenu_aPostCP']";
    static String Contractorpkgsbtn ="//a[@id='ctl00_ctrlMenu_aCP']";
	// Payroll Add
	static String PayrollLink = "//a[@id='aMonthlyPayroll']";
	static String PayrollClasscodeHoursfeild = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_HoursText']";
	static String PayrollClasscodeUncappedpayroll = "//input[@id='cntrlMissingPayroll_rptVersion_ctl00_PayrollText']";
	static String PayrollAgreeTermsandConditions = "//input[@id='cntrlMissingPayroll_chkPayrollSubmit']";
	static String PayrollMarkasconfirmedBtn = "//input[@id='cntrlMissingPayroll_chkConfirmation']";
	static String PayrollLockThispayrollBtn = "//input[@id='cntrlMissingPayroll_chkLockPayroll']";
	static String PayrollFlagThispage = "//input[@id='cntrlMissingPayroll_ChkAction']";
	static String PayrollFinalpayrollBtn = "//input[@id='cntrlMissingPayroll_chkFinalPayroll']";
	static String PayrollSaveBtn = "//input[@id='cntrlMissingPayroll_btnSave']";
	static String PayrollSaveandcloseBtn = "//input[@id='cntrlMissingPayroll_btnSaveandClose']";
	static String ContinuefornxtmnthBtn = "//input[@id='cntrlMissingPayroll_btnContinueWithoutSending']";
	static String PayrollCloseBtn = "//button[@id='cntrlMissingPayroll_divClose']";

	// Certificates frame

	static String CertificatesLink = "//a[@id='aCertificates']";
	static String CertificatesAutoGenerate = "//a[@id='btnGenerateCertificate']";
	static String CertificatesManage = "//a[@id='aCertificateAutoManage']";
	static String viewCertificatesAutoGenerate = "//input[@id='cntrlViewCertificates_btnGenerateCertificate']";
	static String viewCertificatesManuallyGenerate = "//a[@id='cntrlViewCertificates_aAddCertificates']";
	static String ViewCertificatesFrame = "//iframe[@name='_iframe-EmailBox12']";
	static String ViewCertificatesGLPolicyNumber = "//input[@id='txtGLPolicyNumber']";
	static String ViewCertificatesExcessUmbrellaPolicyNumber = "//input[@id='rptUMBList_ctl00_txtUMBPolicyNumberNew']";
	static String ViewCertificatesWcPolicyNumber = "//input[@id='txtWCPolicyNumber']";
	static String ViewCertificatesaveandClosebtn = "//input[@id='btnSavePolicyNumber']";
	static String ViewCertificatesFinishandCloseBtn = "//button[@id='cntrlViewCertificates_btnFinishandClose']";

	// Completion Notice

	static String CompletionNoticeSelectCompletionDate = "//input[@id='cntrlCompletionNotice_TxtCloseoutDate']";
	static String CompletionNoticeSaveBtn = "//input[@id='cntrlCompletionNotice_BtnSubmit']";
	static String CompletionNoticemarkasConfirmedBtn = "//input[@id='cntrlCompletionNotice_chkConfirm']";
	static String CompletionNoticeFlagThispage = "//input[@id='cntrlCompletionNotice_chkAction']";
	static String CompletionNoticeTermsandConditionspage = "//input[@id='cntrlCompletionNotice_chkAgree']";
	static String CompletionNoticesaveandContinueBtn = "//input[@id='cntrlCompletionNotice_btnSaveandClose']";
	static String CompletionNoticeAlertOkBtn = "//button[@id='btnOKCompletionModel']";
    static String ReturnBackLink ="//a[@id='aBack']";
    static String ReturnHomeLink ="//a[text()='Return to the homepage ']";
    static String GLUmbrellapageLink ="//a[@id='aGLUmbrellaCoverage']";
    
    
    public static WebElement Contractorpkgsbtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Contractorpkgsbtn));
		return element;
	}
    public static WebElement GLUmbrellapageLink(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellapageLink));
		return element;
	}
    public static WebElement PreBidContractorPkgs(WebDriver driver) {
		element = driver.findElement(By.xpath(PreBidContractorPkgs));
		return element;
	}
    public static WebElement ContractorPkgContractStatusList_NotAwarded(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractStatusList_NotAwarded));
		return element;
	}
    public static WebElement ReturnBackLink(WebDriver driver) {
		element = driver.findElement(By.xpath(ReturnBackLink));
		return element;
	}
	public static WebElement ContractorPKgMinimumRequirementsSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPKgMinimumRequirementsSwitch));
		return element;
	}
	
	public static List<WebElement> PrebidContractorPkgs(WebDriver driver) {
		listElement = driver.findElements(By.xpath(PrebidContractorPkgs));
		return listElement;
	}
	public static List<WebElement> ContractorPkgContractTypeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContractorPkgContractTypeList));
		return listElement;
	}
	public static List<WebElement> ContractorPkgContractStatusList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContractorPkgContractStatusList));
		return listElement;
	}
	public static WebElement ContractorPkgDuedate(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgDuedate));
		return element;
	}

	public static WebElement ContractorPkgContractorTypeDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractorTypeDropdown));
		return element;
	}

	public static WebElement ContractorPkgContractStatusDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgContractStatusDropdown));
		return element;
	}

	public static WebElement ContractorPkgReportingTimePeriod(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgReportingTimePeriod));
		return element;
	}

	public static WebElement ContractorPkgPayRollCvSubmission(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgPayRollCvSubmission));
		return element;
	}

	public static WebElement ContractorPkgNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgNotes));
		return element;
	}

	public static WebElement ContractorPkgBrieflyDescribeTheScope(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgBrieflyDescribeTheScope));
		return element;
	}

	public static WebElement ContractorPkgEstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPkgEstimatedStartDate));
		return element;
	}

	public static WebElement ContractorPKgContractNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorPKgContractNumber));
		return element;
	}

	public static WebElement PayrollCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollCloseBtn));
		return element;
	}

	public static WebElement CompletionNoticeAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeAlertOkBtn));
		return element;
	}

	public static WebElement CompletionNoticesaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticesaveandContinueBtn));
		return element;
	}

	public static WebElement CompletionNoticeTermsandConditionspage(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeTermsandConditionspage));
		return element;
	}

	public static WebElement CompletionNoticeFlagThispage(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeFlagThispage));
		return element;
	}

	public static WebElement CompletionNoticemarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticemarkasConfirmedBtn));
		return element;
	}

	public static WebElement CompletionNoticeSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeSaveBtn));
		return element;
	}

	public static WebElement CompletionNoticeSelectCompletionDate(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeSelectCompletionDate));
		return element;
	}

	public static WebElement CompletionNoticeFrameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(CompletionNoticeFrameLink));
		return element;
	}

	public static WebElement ViewCertificatesFinishandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesFinishandCloseBtn));
		return element;
	}

	public static WebElement ViewCertificatesGLPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesGLPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesExcessUmbrellaPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesExcessUmbrellaPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesWcPolicyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesWcPolicyNumber));
		return element;
	}

	public static WebElement ViewCertificatesaveandClosebtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesaveandClosebtn));
		return element;
	}

	public static WebElement ViewCertificatesFrame(WebDriver driver) {
		element = driver.findElement(By.xpath(ViewCertificatesFrame));
		return element;
	}

	public static WebElement viewCertificatesAutoGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(viewCertificatesAutoGenerate));
		return element;
	}

	public static WebElement viewCertificatesManuallyGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(viewCertificatesManuallyGenerate));
		return element;
	}

	public static WebElement CertificatesLink(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesLink));
		return element;
	}

	public static WebElement CertificatesManage(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesManage));
		return element;
	}

	public static WebElement CertificatesAutoGenerate(WebDriver driver) {
		element = driver.findElement(By.xpath(CertificatesAutoGenerate));
		return element;
	}

	public static WebElement PayrollSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollSaveBtn));
		return element;
	}

	public static WebElement PayrollSaveandcloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollSaveandcloseBtn));
		return element;
	}

	public static WebElement ContinuefornxtmnthBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContinuefornxtmnthBtn));
		return element;
	}

	public static WebElement PayrollFlagThispage(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollFlagThispage));
		return element;
	}

	public static WebElement PayrollFinalpayrollBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollFinalpayrollBtn));
		return element;
	}

	public static WebElement PayrollClasscodeHoursfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollClasscodeHoursfeild));
		return element;
	}

	public static WebElement PayrollClasscodeUncappedpayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollClasscodeUncappedpayroll));
		return element;
	}

	public static WebElement PayrollAgreeTermsandConditions(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollAgreeTermsandConditions));
		return element;
	}

	public static WebElement PayrollMarkasconfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollMarkasconfirmedBtn));
		return element;
	}

	public static WebElement PayrollLockThispayrollBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollLockThispayrollBtn));
		return element;
	}

	public static WebElement SelectPayrollperiod(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectPayrollperiod));
		return element;
	}

	public static WebElement nonCIPCompliancename(WebDriver driver,String text) {
		element = driver.findElement(By.xpath(
				"//div[@class='select2-drop select2-display-none select2-drop-active']//ul//li//div[contains(text(),'"
						+ text + "')]"));
		return element;
	}

	public static WebElement PayrollLink(WebDriver driver) {
		element = driver.findElement(By.xpath(PayrollLink));
		return element;
	}

	public static WebElement DeleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(DeleteBtn));
		return element;
	}

	public static WebElement EditBrn(WebDriver driver) {
		element = driver.findElement(By.xpath(EditBrn));
		return element;
	}

	public static WebElement MoreBtnContractorPackage(WebDriver driver) {
		element = driver.findElement(By.xpath(MoreBtnContractorPackage));
		return element;
	}

	public static WebElement InsurancePagelink(WebDriver driver) {
		element = driver.findElement(By.xpath(InsurancePagelink));
		return element;
	}

	public static WebElement Enrollment_frame(WebDriver driver) {
		element = driver.findElement(By.xpath(Enrollment_frame));
		return element;
	}

	public static List<WebElement> StatusesList_Enrollment(WebDriver driver) {
		listElement = driver.findElements(By.xpath(StatusesList_Enrollment));
		return listElement;
	}

	public static List<WebElement> UpperTierContractorlist(WebDriver driver) {
		listElement = driver.findElements(By.xpath(UpperTierContractorlist));
		return listElement;
	}

	public static WebElement plusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(plusBtn));
		return element;
	}

	public static WebElement ContarctorpkgsaveAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ContarctorpkgsaveAndCloseBtn));
		return element;
	}

	public static WebElement cancelContractorPkgBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtn));
		return element;
	}

	public static WebElement cancelContractorPkgBtnAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertOKBtn));
		return element;
	}

	public static WebElement cancelContractorPkgBtnAlertCancelBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(cancelContractorPkgBtnAlertCancelBtn));
		return element;
	}

	public static WebElement selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel));
		return element;
	}

	public static WebElement addNewTradeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewTradeLink));
		return element;
	}

	public static WebElement SelectContact(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectContact));
		return element;
	}

	public static WebElement SelectContactSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(SelectContactSearchBox));
		return element;
	}

	public static List<WebElement> SelectContactAutoCompllete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(SelectContactAutoCompllete));
		return listElement;
	}

	public static WebElement selectProgramSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramSearchBox));
		return element;
	}

	public static WebElement selectProjectSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectSearchBox));
		return element;
	}

	public static WebElement selectTradeSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTradeSearchBox));
		return element;
	}

	public static WebElement selectEnrollmentTypeSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentTypeSearchBox));
		return element;
	}

	public static WebElement selectEnrollmentType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectEnrollmentType));
		return element;
	}

	public static WebElement selectProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgram));
		return element;
	}

	public static List<WebElement> selectProgramDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectProject(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProject));
		return element;
	}

	public static List<WebElement> selectProjectDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProjectDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectTrade(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTrade));
		return element;
	}

	public static List<WebElement> selectTradeDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectTradeDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectUpperTierContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUpperTierContractor));
		return element;
	}

	public static WebElement selectUpperTierContractorSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUpperTierContractorSearchBox));
		return element;
	}

	public static List<WebElement> selectUpperTierContractorDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectUpperTierContractorDropdownAutocomplete));
		return listElement;
	}

	public static WebElement selectContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractor));
		return element;
	}

	public static List<WebElement> selectEnrollmentTypeDropdownAutocomplete(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectEnrollmentTypeDropdownAutocomplete));
		return listElement;
	}

	public static WebElement editSelectedContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(editSelectedContractorLink));
		return element;
	}

	public static WebElement addNewContractorLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewContractorLink));
		return element;
	}

	public static WebElement selectOffsiteInsuranceCompliance(WebDriver driver) {
		element = driver.findElement(By.xpath(selectOffsiteInsuranceCompliance));
		return element;
	}

	public static WebElement clickHereToComplianceLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereToComplianceLink));
		return element;
	}

	public static WebElement btnNext(WebDriver driver) {
		element = driver.findElement(By.xpath(btnNext));
		return element;
	}

	public static WebElement sendEmailCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailCloseBtn));
		return element;
	}

	public static WebElement sendEmailSendAndCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(sendEmailSendAndCloseBtn));
		return element;
	}

	public static WebElement alertConfirmComplianceContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(alertConfirmComplianceContinueBtn));
		return element;
	}

	public static WebElement non_CIP_Compliance(WebDriver driver) {
		element = driver.findElement(By.xpath(non_CIP_Compliance));
		return element;
	}

	public static List<WebElement> non_CIP_ComplianceList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(non_CIP_ComplianceList));
		return listElement;
	}

	static String AdvSearchBtn = "//div[@class='rightButtonGroup']//i[@class='fa fa-caret-down']";
	static String AdvSearchSelectprogramme = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlProject']";
	static String AdvSearchSelectproject = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlWorkSite']";
	static String AdvSearchSelectEnrollment = "//select[@id='ctl00_ContentPlaceHolder1_cntrlContractorList_ddlEnrollmentType']";
	static String AdvSearchContractorstatus = "//span[@class='fltr']/i[@class='fa fa-caret-down']";
	static String AdvSearch_SelectContractorStatus_List = "//div[@class='mutliSelect']/ul/li";
	static String Advsearch_ContractorStatusList_cp_chkBox = "//div[@class='titles']//div//span";
	static String AdvSearch_SearchBtn_down = "//input[@id='btnAdvanceSearch']";
	static String AdvanceSearch_SeeMore = "//a[@id='aSeeMore']";
	static String ContactsListDropdown = "//ul[@class='select2-results overflow-hidden']/li";
	static String statuslist_Enrollment = "//div[@class='top-bar-wrap clearfix']/ul/li[*]";
	static String statusList_Cpkg = "//div[@class='statusType']/div[1]";

	// CIP Agreement page
	static String CloseBtn_CIPAgreement = "//button[contains(text(),'Close')]";
	static String NextBtn_CIPAgreement = "//input[@id='cntrlContractorAggreement_btnNext']";
	static String CancelBtn_CIPAgreement = "//div[@class='ui-dialog-buttonset']//button[text()='Cancel']";
	static String OKBtn_CIPAgreement = "//div[@class='ui-dialog-buttonset']//button[text()='OK']";
	static String refreshBtn = "//a[@class='tipB']/i[@class='fa fa-refresh']";
	static String AdvSearchSearchContractor = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntrlContractorList_txt_Contractor']";
	static String ContractorNameLegalEntityName = "//input[@id='ctrlInsuranceEnrollment_txtContractorName']";
	static String ContractValue = "//input[@id='ctrlInsuranceEnrollment_txtContractPrice']";
	static String SelfperformedContractValue = "//input[@id='ctrlInsuranceEnrollment_txtSelfContractValue']";
	static String EstimatedUncappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtPayrolls']";
	static String EstimatedcappedPayroll = "//input[@id='ctrlInsuranceEnrollment_txtEstCapPayroll']";
	static String EstimatedManHours = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String EstimatedStartDate = "//input[@id='ctrlInsuranceEnrollment_txtStartDate']";
	static String BrieflyDescribetheScopeoftheWork = "//div/textarea[@id='ctrlInsuranceEnrollment_txtBrieflyDescribetheScopeWork']";
	static String workclassDropdown = "//div[@id='s2id_ctrlInsuranceEnrollment_DrpDnWClass']";
	static String WorkclassDropDownList = "//ul[@id='select2-results-1']/li[*]/.";
	static String WorkclassOKBtn = "//button[@id='btnYes']";
	static String WorkclassWorkHours = "//input[@id='ctrlInsuranceEnrollment_txtWCHours']";
	static String WorkclassPayRoll = "//input[@id='ctrlInsuranceEnrollment_txtWCPayroll']";
	static String WorkclassWCRate = "//input[@id='ctrlInsuranceEnrollment_txtWCRate']";
	static String WorkclassAddworkclassBtn = "//input[@id='ctrlInsuranceEnrollment_btnAddWC']";
	static String InsuranceEnrollmentMarkasConfirmedBtn = "//input[@id='ctrlInsuranceEnrollment_rdoConfirm']";
	static String InsuranceEnrollmentPendingReviewBtn = "//input[@id='ctrlInsuranceEnrollment_rdoPendingReview']";
	static String InsuranceEnrollmentSaveandCloseBtn = "//input[@name='ctrlInsuranceEnrollment$btnSaveClose']";
	static String CancelBtn_ENrollment = "//div[@class='ui-dialog-buttonset']//button[text()='Cancel']";
	static String InsuranceEnrollmentSaveBtn = "//input[@name='ctrlInsuranceEnrollment$btnSave']";
	static String Enrollmentstatuslist = "//div[@class='top-bar-wrap clearfix']/ul/li/../li[*][1]";
	static String InsuranceEnrollmentSaveandContinueBtn = "//input[@name='ctrlInsuranceEnrollment$btnNext']";
	static String InsuranceEnrollmentEstimatedManHrs = "//input[@id='ctrlInsuranceEnrollment_txtManHours']";
	static String InsuranceEnrollmentCloseBtn = "//button[@id='ctrlInsuranceEnrollment_divClose']";
	static String InsuranceEnrollmentConfirmandEnrolledBtn="//input[@id='ctrlInsuranceEnrollment_rdoConfirmEnrolled']";
	static String InsuranceEnrollmentNotifyCarrierBtn="//input[@id='ctrlInsuranceEnrollment_btnNotifyCarrier']";
	
	
	// button[@class='btn btn-success pull-right' and @id='btnSaveModal']

	// NonCIP

	static String NonCIPInsuranceCompanyname = "//input[@id='token-input-txtCarrier109']";
	static String NonCIPPolicyStartDate = "//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_startdatetimepicker']";
	static String NonCIPPolicyExpiryDate = "//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_enddatetimepicker']";
	static String NonCIPMarkasConfirmedBtn = "//input[@id='ctrlTrackComplianceContractor_rdoConfirm']";
	static String NonCIPPendingReviewBtn = "//input[@id='ctrlTrackComplianceContractor_rdoPendingReview']";
	static String NonCIPMarkasIncomplete = "//input[@id='ctrlTrackComplianceContractor_rdoMarkasComplete']";
	static String NonCIPFlagthispage = "//input[@id='ctrlTrackComplianceContractor_chkAction']";
	static String NonCIPsaveandCloseBtn = "//input[@id='ctrlTrackComplianceContractor_btnSaveCloseCompliance']";
	static String NonCIPsaveBtn = "//input[@id='ctrlTrackComplianceContractor_btnSaveCompliance']";
	static String NonCIPsaveandContinueBtn = "//input[@id='ctrlTrackComplianceContractor_btnNext']";
	static String NonCIP_frameLink = "//a[@id='aTrackingComplianceLimit']";
	static String NonCIPCloseBtn = "//div[@class='col-md-12 marg-bottom-10 clearfix']//button[@class='btn']";

	// WC Premium Modifications

	static String WcPremiumModificationsMarkasConfirmedBtn = "//input[@id='ctrlPremiumModes_rdoConfirm']";
	static String WcPremiumModificationsPendingReviewBtn = "//input[@id='ctrlPremiumModes_rdoPendingReview']";
	static String WcPremiumModificationsSaveaBtn = "//input[@name='ctrlPremiumModes$btnSave']";
	static String WcPremiumModificationssaveandCloseBtn = "//input[@name='ctrlPremiumModes$btnSaveClose']";
	static String WcPremiumModificationssaveandContinueBtn = "//input[@name='ctrlPremiumModes$btnNext']";
	static String WcPremiumModificationAmountBtn = "//input[@id='ctrlPremiumModes_txtWCLossCharge']";

	// GL &Umbrella Coverage

	static String GLUmbrellaGeneraLLibalityClasscodeSearcbox = "//div[@id='s2id_autogen3']";
	static String GLUmbrellaGeneraLLibalityClassCodeList = "//ul[@class='select2-results']/li[*]";
	static String GLUmbrellaUmbrellaLibalitysearchbox = "//div[@id='s2id_autogen5']";
	static String GLUmbrellaUmbrellaLibalityClasscodeList = "//ul[@id='select2-results-6']/li";
	static String GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox = "//div[@id='s2id_autogen7']";
	static String GLUmbrellaPolluctionchargeLiabilityclasscodeList = "//ul[@id='select2-results-8']/li";
	static String GLUmbrellaMarkasConfirmedButton = "//input[@id='rb-mark-as-confirmed']";
	static String GLUmbrellaPendingReviewBtn = "//input[@id='rb-pending-review']";
	static String GLUmbrellaMarkasCompleteBtn = "//input[@id='rb-mark-as-incomplete']";
	static String GLUmbrellaFlagthispageBtn = "//input[@class='chk-flag-this-page']";
	static String GLUmbrellasaveBtn = "//input[@class='btn btn-primary btn-save' and @value='Save']";
	static String GLUmbrellasaveandCloseBtn = "//input[@class='btn btn-primary btn-save' and @value='Save and Close']";
	static String GLUmbrellasaveandcontinueBtn = "//input[@class='btn btn-success btn-save' and @value='Save and Continue']";
	static String GLUmbrellaUmbrellaLibalitySeachBoxfeild = "//input[@id='s2id_autogen6_search']";
	static String GLUmbrellaGeneraLLibalitySeachBoxfeild = "//input[@id='s2id_autogen4_search']";
	static String GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild = "//input[@id='s2id_autogen8_search']";

	// Subcontractor
	static String SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No = "//button[@id='cntrSubContractor_btnNo']";
	static String SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes = "//button[@id='cntrSubContractor_btnYes']";
	static String SubcontractorSaveandContinueBtn = "//input[@id='cntrSubContractor_btnNext']";
	static String SubcontractorCloseBtn = "//button[@id='cntrSubContractor_divClose']";
	static String SubContractorFrameLink = "//a[@id='aSubContractorList']";

	// Enrollment sumary

	static String EnrollmentsummaryAgreeChkBox = "//input[@id='ctl20_chkContractDocument']";
	static String EnrollmentsummaryPrintBtn = "//input[@id='ctl20_btnPrint']";
	static String EnrollmentsummaryConfirmandContinueBtn = "//input[@id='ctl20_btnNext']";
	static String EnrollmentsummaryNoLossStatementchkBox = "//input[@id='ctrlLossLetter_chkContractDocument']";
	static String EnrollmentsummaryNoLossStatementConfirmandContinueBtn = "//input[@id='ctrlLossLetter_btnNext']";
	
	
	public static WebElement InsuranceEnrollmentNotifyCarrierBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentNotifyCarrierBtn));
		return element;
	}
	public static WebElement InsuranceEnrollmentConfirmandEnrolledBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentConfirmandEnrolledBtn));
		return element;
	}
	
	public static WebElement NonCIPCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPCloseBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentCloseBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryNoLossStatementchkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryNoLossStatementchkBox));
		return element;
	}

	public static WebElement EnrollmentsummaryNoLossStatementConfirmandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryNoLossStatementConfirmandContinueBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryConfirmandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryConfirmandContinueBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryPrintBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryPrintBtn));
		return element;
	}

	public static WebElement EnrollmentsummaryAgreeChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(EnrollmentsummaryAgreeChkBox));
		return element;
	}

	public static WebElement SubContractorFrameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorFrameLink));
		return element;
	}

	public static WebElement NonCIP_frameLink(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIP_frameLink));
		return element;
	}

	public static WebElement InsuranceEnrollmentEstimatedManHrs(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentEstimatedManHrs));
		return element;
	}

	public static WebElement SubcontractorCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SubcontractorCloseBtn));
		return element;
	}

	public static WebElement NonCIPsaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveandContinueBtn));
		return element;
	}

	public static WebElement NonCIPsaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveBtn));
		return element;
	}

	public static WebElement NonCIPsaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPsaveandCloseBtn));
		return element;
	}

	public static WebElement NonCIPFlagthispage(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPFlagthispage));
		return element;
	}

	public static WebElement NonCIPMarkasIncomplete(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPMarkasIncomplete));
		return element;
	}

	public static WebElement NonCIPPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPendingReviewBtn));
		return element;
	}

	public static WebElement NonCIPMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPMarkasConfirmedBtn));
		return element;
	}

	public static WebElement NonCIPPolicyStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPolicyStartDate));
		return element;
	}

	public static WebElement NonCIPPolicyExpiryDate(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPPolicyExpiryDate));
		return element;
	}

	public static WebElement NonCIPInsuranceCompanyname(WebDriver driver) {
		element = driver.findElement(By.xpath(NonCIPInsuranceCompanyname));
		return element;
	}

	public static WebElement CloseBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(CloseBtn_CIPAgreement));
		return element;
	}

	public static WebElement WcPremiumModificationAmountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationAmountBtn));
		return element;
	}

	public static WebElement GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild));
		return element;
	}

	public static WebElement GLUmbrellaGeneraLLibalitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaGeneraLLibalitySeachBoxfeild));
		return element;
	}

	public static WebElement GLUmbrellaUmbrellaLibalitySeachBoxfeild(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaUmbrellaLibalitySeachBoxfeild));
		return element;
	}

	public static WebElement SubcontractorSaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SubcontractorSaveandContinueBtn));
		return element;
	}

	public static WebElement SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_No));
		return element;
	}

	public static WebElement SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(SubContractorDoyouhaveSubContractorsPerformingWorkOnsite_Yes));
		return element;
	}

	public static WebElement GLUmbrellasaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveBtn));
		return element;
	}

	public static WebElement GLUmbrellasaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveandCloseBtn));
		return element;
	}

	public static WebElement GLUmbrellasaveandcontinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellasaveandcontinueBtn));
		return element;
	}

	public static List<WebElement> GLUmbrellaGeneraLLibalityClassCodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaGeneraLLibalityClassCodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaGeneraLLibalityClasscodeSearcbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaGeneraLLibalityClasscodeSearcbox));
		return element;
	}

	public static WebElement GLUmbrellaUmbrellaLibalitysearchbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaUmbrellaLibalitysearchbox));
		return element;
	}

	public static List<WebElement> GLUmbrellaUmbrellaLibalityClasscodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaUmbrellaLibalityClasscodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox));
		return element;
	}

	public static List<WebElement> GLUmbrellaPolluctionchargeLiabilityclasscodeList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(GLUmbrellaPolluctionchargeLiabilityclasscodeList));
		return listElement;
	}

	public static WebElement GLUmbrellaMarkasConfirmedButton(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaMarkasConfirmedButton));
		return element;
	}

	public static WebElement GLUmbrellaPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaPendingReviewBtn));
		return element;
	}

	public static WebElement GLUmbrellaMarkasCompleteBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaMarkasCompleteBtn));
		return element;
	}

	public static WebElement GLUmbrellaFlagthispageBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(GLUmbrellaFlagthispageBtn));
		return element;
	}

	public static WebElement WcPremiumModificationssaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationssaveandContinueBtn));
		return element;
	}

	public static WebElement WcPremiumModificationssaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationssaveandCloseBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsSaveaBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsSaveaBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsPendingReviewBtn));
		return element;
	}

	public static WebElement WcPremiumModificationsMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WcPremiumModificationsMarkasConfirmedBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentSaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveandContinueBtn));
		return element;
	}

	public static List<WebElement> Enrollmentstatuslist(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Enrollmentstatuslist));
		return listElement;
	}

	public static WebElement InsuranceEnrollmentSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveBtn));
		return element;
	}

	public static WebElement CancelBtn_ENrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(CancelBtn_ENrollment));
		return element;
	}

	public static WebElement ContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractValue));
		return element;
	}

	public static WebElement ContractorNameLegalEntityName(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorNameLegalEntityName));
		return element;
	}

	public static WebElement WorkclassAddworkclassBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassAddworkclassBtn));
		return element;
	}

	public static WebElement WorkclassWCRate(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassWCRate));
		return element;
	}

	public static WebElement WorkclassPayRoll(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassPayRoll));
		return element;
	}

	public static WebElement WorkclassWorkHours(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassWorkHours));
		return element;
	}

	public static WebElement WorkclassOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(WorkclassOKBtn));
		return element;
	}

	public static List<WebElement> WorkclassDropDownList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(WorkclassDropDownList));
		return listElement;
	}

	public static WebElement workclassDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(workclassDropdown));
		return element;
	}

	public static WebElement BrieflyDescribetheScopeoftheWork(WebDriver driver) {
		element = driver.findElement(By.xpath(BrieflyDescribetheScopeoftheWork));
		return element;
	}

	public static WebElement EstimatedStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedStartDate));
		return element;
	}

	public static WebElement EstimatedManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedManHours));
		return element;
	}

	public static WebElement EstimatedcappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedcappedPayroll));
		return element;
	}

	public static WebElement EstimatedUncappedPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(EstimatedUncappedPayroll));
		return element;
	}

	public static WebElement SelfperformedContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(SelfperformedContractValue));
		return element;
	}

	public static WebElement InsuranceEnrollmentMarkasConfirmedBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentMarkasConfirmedBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentPendingReviewBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentPendingReviewBtn));
		return element;
	}

	public static WebElement InsuranceEnrollmentSaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceEnrollmentSaveandCloseBtn));
		return element;
	}

	public static WebElement selectDynamicContractorPkg(WebDriver driver) {
		// element =
		// driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle'
		// and contains(text(),'"+contractorName+"')]/..//div[@class='workSite' and
		// contains(text(),'"+projectName+"')]/../../div[2]/div[3 and
		// contains(text(),'"+tradeNo+"')]"));
		element = driver
				.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'"
						+ contractorName + "')]/../..//div[@class='workSite']/span[contains(text(),'" + projectName
						+ "')]/../../../div[2]/div[3]/span[contains(text(),'" + tradeNo + "')]"));
		return element;
	}

	public static WebElement AdvSearchSearchContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSearchContractor));
		return element;
	}

	public static WebElement refreshBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(refreshBtn));
		return element;
	}

	public static WebElement CancelBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(CancelBtn_CIPAgreement));
		return element;
	}

	public static WebElement OKBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(OKBtn_CIPAgreement));
		return element;
	}

	public static WebElement NextBtn_CIPAgreement(WebDriver driver) {
		element = driver.findElement(By.xpath(NextBtn_CIPAgreement));
		return element;
	}

	public static List<WebElement> statuslist_Enrollment(WebDriver driver) {
		listElement = driver.findElements(By.xpath(statuslist_Enrollment));
		return listElement;
	}

	public static WebElement statusList_Cpkg(WebDriver driver) {
		element = driver.findElement(By.xpath(statusList_Cpkg));
		return element;
	}

	public static List<WebElement> ContactsListDropdown(WebDriver driver) {
		listElement = driver.findElements(By.xpath(ContactsListDropdown));
		return listElement;
	}

	public static WebElement AdvanceSearch_SeeMore(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvanceSearch_SeeMore));
		return element;
	}

	public static WebElement AdvSearch_SearchBtn_down(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearch_SearchBtn_down));
		return element;
	}

	public static List<WebElement> Advsearch_ContractorStatusList_cp_chkBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(Advsearch_ContractorStatusList_cp_chkBox));
		return listElement;
	}

	public static List<WebElement> AdvSearch_SelectContractorStatus_List(WebDriver driver) {
		listElement = driver.findElements(By.xpath(AdvSearch_SelectContractorStatus_List));
		return listElement;
	}

	public static WebElement AdvSearchContractorstatus(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchContractorstatus));
		return element;
	}

	public static WebElement AdvSearchSelectEnrollment(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectEnrollment));
		return element;
	}

	public static WebElement AdvSearchSelectprogramme(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectprogramme));
		return element;
	}

	public static WebElement AdvSearchBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchBtn));
		return element;
	}

	public static WebElement AdvSearchSelectproject(WebDriver driver) {
		element = driver.findElement(By.xpath(AdvSearchSelectproject));
		return element;
	}

}
