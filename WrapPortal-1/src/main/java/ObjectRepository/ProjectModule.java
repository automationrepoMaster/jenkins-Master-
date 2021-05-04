package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProjectModule {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String projectAddIcon = "//i[@class='fa fa-plus']";
	static String projectEditIcon = "//i[@class='fa fa-pencil-square-o']";
	static String projectDeleteIcon = "//i[@class='fa fa-trash-o']";
	static String projectSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_cntWorkList_txtSearch']";
	static String projectSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	static String projectSearchAutoCompleteList = "//ul[@id='ui-id-1']/li";//list
	
	static String projectSelectFirstProjectFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]";
	static String projectSelectProgramNameFrmProjectList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='col-md-6 col-sm-6 col-xs-6']/div";//list
	static String projectSelectAllProjectFrmList = "//div[@class='mail_list twoIconset userListLeft divisionList']/ul/li[*]";// elements
	static String projectSelectContractorNameFrmProjectList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[@class='col-md-6 col-sm-6 col-xs-6 boldText status rightAlign']/div";//list
	static String projectSelectStatusNameFrmProjectList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[*]//div[contains(text(),'Active')]";//list
	static String projectCount = "//span[@id='ctl00_ContentPlaceHolder1_cntWorkList_lblTotalRecord']";
	static String projectSelectSingleContractorNameFrmProjectList ="//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]//div[@class='col-md-6 col-sm-6 col-xs-6 boldText status rightAlign']/div";
	
	static String selectAllProjectNameFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[1]/div[1]/div";
	static String selectAllProjectStatusFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[1]/div[2]/div";
	static String selectAllProjectProgramFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[2]/div[1]/div";
	static String selectAllProjectAdminFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[2]/div[2]/div";
	static String displayTotalCountOfProject ="//span[contains(text(),'Displaying')]//span[@id='ctl00_ContentPlaceHolder1_cntWorkList_lblTotalRecord']";
	static String seeMoreBtnProject ="//a[@id='aSeeMore']";
	
	public static List<WebElement> selectAllProjectNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProjectNameFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProjectStatusFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProjectStatusFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProjectProgramFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProjectProgramFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProjectAdminFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProjectAdminFrmList));
		return listElement;
	}
	public static WebElement displayTotalCountOfProject(WebDriver driver) {
		element = driver.findElement(By.xpath(displayTotalCountOfProject));
		return element;
	}
	public static WebElement seeMoreBtnProject(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreBtnProject));
		return element;
	}
	
	// Advance Search Box Xpaths
	static String projectAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String projectAdvanceSearchDropdown ="//div[@style='display: block;' and @id='divAdvanceSearch']";
	
	static String projectAdvanceSearchSelectProgram = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlProject']";// dropdown
	static String projectAdvanceSearchSelectProgramAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlNodeAdministrator']";// dropdown
	static String projectAdvanceSearchSelectProjectAdmin = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlWorkSiteAdministrator']";// dropdown
	static String projectAdvanceSearchSelectProgramSponsor = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlOwner']";// dropdown
	static String projectAdvanceSearchSearchByContractor = "//input[@id='token-input-ctl00_ContentPlaceHolder1_cntWorkList_txt_Contractor']";// dropdown
	static String projectAdvanceSearchSelectProjectStatus = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlWorkSiteStatus']";// dropdown
	static String projectAdvanceSearchSelectDevision = "//select[@id='ctl00_ContentPlaceHolder1_cntWorkList_ddlDivision']";// dropdown
	static String projectAdvanceSearchSelectCategory = "//button[@id='ctl00_ContentPlaceHolder1_cntWorkList_btnDropdown']";
	static String projectAdvanceSearchSelectFlag = "//div[@id='changeFlag']";
	static String projectAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String projectAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String projectClearIcon = "//i[@class='fa fa-refresh']";

	// contractor Module Preview Panel xpaths

	static String projectFetchProjectNamePreviewP ="//span[@id='ctl19_ltrWorkSiteName']";
	static String projectFetchContractorNamePreviewP ="//span[@id='ctl19_ltrGeneralContractor']";
	static String projectFetchProgramNamePreviewP ="//div[@class='previewHeading']//a";
	static String projectFetchProjectStatusPreviewP ="//span[@id='ctl19_lblWorkSiteStatusText']";
	static String projectFetchProjectBeginDatePreviewP = "//div[contains(text(),'Begin Date')]";
//			"//div[@class='width100per']/div[2]/br";
			//"//div[contains(text(),'Begin Date')]";
	static String projectFetchProjectEndDatePreviewP = "//span[contains(text(),'End Date')]";
	static String projectFetchContractValuePreviewP = "//div[@id='divContractorValue']/div[1]/div/span";
//			"//div[@class='whiteMainBox divContractPrice clearfix']/div/span";
	static String projectFetchDivisionNamePreviewP = "//div[@id='ctl20_divDivision']";
	static String projectFetchContactNamePreviewP = "//div[@id='ctl20_divContactDetails']";
	static String projectFetchEmailIdPreviewP = "//span[@id='ctl20_lblContactEmail']";
	static String projectFetchPhoneNoPreviewP = "//div[@id='ctl20_divTelephoneNumber']";
	static String projectFetchAddressPreviewP = "//div[@class='middelAlign']";
	static String projectDownloadContracotCertificateLinkPreviewP = "//a[@id='ctl20_hlDownloadCertificate']";
	static String projectMultiPrimeBtnPreviewP = "//a[@id='ctl20_aPrimeIcon']";
	static String projectProjectStatusBtnPreviewP = "//a[@id='ctl20_aProjectStatus']";
	static String projectFlagBtnPreviewP = "//i[@class='i-flag']";
	static String projectFetchContractorPackagesNoPreviewP = "//div[@class='txt clearfix']";
	static String projectFetchAllContractorsNoPreviewP = "//div[@id='ctl20_ctrlContractorPackageChart_divContractTypeCharts']";
	static String projectFetchAwardedContractorsNoPreviewP = "//div[@id='ctl20_ctrlContractorPackageChart_divStatustypeCharts']";
	
	static String projectFetchUserAccessDistrictPreviewP ="//div[contains(@id,'_divDivision')]//a";
	static String projectFetchUserAccessSponsorsPreviewP = "//div[contains(@id,'_divOwnerAdministrator')]/div[1]/ul/li[1]/a";
	static String projectFetchUserAccessAdministratorPreviewP = "//div[contains(@id,'divOwnerAdministrator')]/div[2]/ul/li[1]/a";
	static String projectFetchUserAccessGeneralContractorPreviewP = "//div[contains(@id,'_divGeneralContractor')]/ul/li[1]/a";
	static String projectFetchUserAccessProjectAdministratorPreviewP = "//div[contains(@id,'_divWorkSiteAdministrator')]/ul/li[1]/a";
	static String projectFetchCreatedByPreviewP = "//span[@class='createddate']";
	static String projectFetchModifiedByPreviewP = "//span[@class='modifydate']";
	static String contractorDownloadContractorCertificateLinkCloseBtn = "//a[@class='btn']";
	static String reportBar="//div[@class='panelbar beefup-head']";
	static String reportBarRightArrow="//a[@class='carousel-button-right']";
	
	static String selectRandomReport="//div[@class='carousel-wrapper']//span[contains(text(),'Payroll Audit Summary')]/..";
	static String allToolTip="//i[@oldtitle]";
	
	public static List<WebElement> allToolTip(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allToolTip));
		return listElement;
	}
	
	public static WebElement selectReport(WebDriver driver,String reportName) {
		element = driver.findElement(By.xpath("//div[@class='carousel-wrapper']//span[contains(text(),'"+reportName+"')]/.."));
		return element;
	}
	
	public static WebElement reportBarRightArrow(WebDriver driver) {
		element = driver.findElement(By.xpath(reportBarRightArrow));
		return element;
	}
	public static WebElement reportBar(WebDriver driver) {
		element = driver.findElement(By.xpath(reportBar));
		return element;
	}
	public static WebElement projectFetchUserAccessDistrictPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchUserAccessDistrictPreviewP));
		return element;
	}
	public static WebElement projectSelectSingleContractorNameFrmProjectList(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSelectSingleContractorNameFrmProjectList));
		return element;
	}
	public static WebElement projectFetchProjectNamePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchProjectNamePreviewP));
		return element;
	}public static WebElement projectFetchContractorNamePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchContractorNamePreviewP));
		return element;
	}public static WebElement projectFetchProgramNamePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchProgramNamePreviewP));
		return element;
	}public static WebElement projectFetchProjectStatusPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchProjectStatusPreviewP));
		return element;
	}
	
	
	public static List<WebElement> projectSelectStatusNameFrmProjectList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(projectSelectStatusNameFrmProjectList));
		return listElement;
	}
	public static List<WebElement> projectSelectContractorNameFrmProjectList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(projectSelectContractorNameFrmProjectList));
		return listElement;
	}
	public static List<WebElement> projectSelectProgramNameFrmProjectList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(projectSelectProgramNameFrmProjectList));
		return listElement;
	}
	
	public static WebElement projectAdvanceSearchDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdvanceSearchDropdown));
		return element;
	}
	public static List<WebElement> projectSearchAutoCompleteList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(projectSearchAutoCompleteList));
		return listElement;
	}

	
	public static WebElement projectCount(WebDriver driver) {
		element = driver.findElement(By.xpath(projectCount));
		return element;
	}

	public static WebElement projectSelectFirstProjectFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSelectFirstProjectFrmList));
		return element;
	}

	public static WebElement projectSelectAllProjectFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSelectAllProjectFrmList));
		return element;
	}

	public static WebElement projectAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAddIcon));
		return element;
	}

	public static WebElement projectEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectEditIcon));
		return element;
	}

	public static WebElement projectDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectDeleteIcon));
		return element;
	}

	public static WebElement projectSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSearchEditBox));
		return element;
	}

	public static WebElement projectSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSearchIcon));
		return element;
	}

	public static WebElement projectAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdvanceSearchIcon));
		return element;
	}

	public static WebElement projectAdvanceSearchSelectProgram(WebDriver driver, String selectProgram) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectProgram));
		Select select = new Select(element);
		select.selectByVisibleText(selectProgram);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectProgramAdmin(WebDriver driver, String selectProgramAdmin) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectProgramAdmin));
		Select select = new Select(element);
		select.selectByVisibleText(selectProgramAdmin);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectProjectAdmin(WebDriver driver, String selectProjectAdmin) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectProjectAdmin));
		Select select = new Select(element);
		select.selectByVisibleText(selectProjectAdmin);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectProgramSponsor(WebDriver driver, String selectProgramSponsor) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectProgramSponsor));
		Select select = new Select(element);
		select.selectByVisibleText(selectProgramSponsor);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectProjectStatus(WebDriver driver, String selectProjectState) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectProjectStatus));
		Select select = new Select(element);
		select.selectByVisibleText(selectProjectState);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectDevision(WebDriver driver, String selectDivision) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectDevision));
		Select select = new Select(element);
		select.selectByVisibleText(selectDivision);
		return element;
	}

	public static WebElement projectAdvanceSearchSelectCategory(WebDriver driver, String selectCategory) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectCategory));
		Select select = new Select(element);
		select.selectByVisibleText(selectCategory);
		return element;
	}

	public static WebElement projectAdvanceSearchSearchByContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSearchByContractor));
		return element;
	}

	public static WebElement projectAdvanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdvanceSearchSelectFlag));
		return element;
	}

	public static WebElement projectAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(projectAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement projectAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(projectAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement projectClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(projectClearIcon));
		return element;
	}

	public static WebElement projectFetchContractValuePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchContractValuePreviewP));
		return element;
	}

	public static WebElement projectFetchProjectBeginDatePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchProjectBeginDatePreviewP));
		return element;
	}

	public static WebElement projectFetchProjectEndDatePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchProjectEndDatePreviewP));
		return element;
	}

	public static WebElement projectFetchDivisionNamePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchDivisionNamePreviewP));
		return element;
	}

	public static WebElement projectFetchContactNamePreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchContactNamePreviewP));
		return element;
	}

	public static WebElement projectFetchEmailIdPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchEmailIdPreviewP));
		return element;
	}

	public static WebElement projectFetchPhoneNoPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchPhoneNoPreviewP));
		return element;
	}

	public static WebElement projectFetchAddressPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchAddressPreviewP));
		return element;
	}

	public static WebElement projectDownloadContracotCertificateLinkPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectDownloadContracotCertificateLinkPreviewP));
		return element;
	}

	public static WebElement projectMultiPrimeBtnPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectMultiPrimeBtnPreviewP));
		return element;
	}

	public static WebElement projectProjectStatusBtnPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectProjectStatusBtnPreviewP));
		return element;
	}

	public static WebElement projectFlagBtnPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFlagBtnPreviewP));
		return element;
	}

	public static WebElement projectFetchContractorPackagesNoPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchContractorPackagesNoPreviewP));
		return element;
	}

	public static WebElement projectFetchAllContractorsNoPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchAllContractorsNoPreviewP));
		return element;
	}

	public static WebElement projectFetchAwardedContractorsNoPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchAwardedContractorsNoPreviewP));
		return element;
	}

	public static WebElement projectFetchCreatedByPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchCreatedByPreviewP));
		return element;
	}

	public static WebElement projectFetchModifiedByPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchModifiedByPreviewP));
		return element;
	}

	public static WebElement projectFetchUserAccessSponsorsPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchUserAccessSponsorsPreviewP));
		return element;
	}

	public static WebElement projectFetchUserAccessAdministratorPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchUserAccessAdministratorPreviewP));
		return element;
	}

	public static WebElement projectFetchUserAccessGeneralContractorPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchUserAccessGeneralContractorPreviewP));
		return element;
	}

	public static WebElement projectFetchUserAccessProjectAdministratorPreviewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectFetchUserAccessProjectAdministratorPreviewP));
		return element;
	}

	public static WebElement contractorDownloadContractorCertificateLinkCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorDownloadContractorCertificateLinkCloseBtn));
		return element;
	}

}
