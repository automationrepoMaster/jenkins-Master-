package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgramModule {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String programAddIcon = "//i[@class='fa fa-plus']";
	static String programEditIcon = "//i[@class='fa fa-pencil-square-o']";
	static String programDeleteIcon = "//i[@class='fa fa-trash-o']";
	static String programSearchEditBox = "//input[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_txtSearch']";
	static String programSearchIcon = "//div[@class='controllGroup']//i[@class='fa fa-search']";
	static String programSelectFirstprogramFrmList = "//div[@class='panel panel-default inbox_list marg-0']/div[2]/div[1]/ul/li[1]";
	static String programSelectAllprogramFrmList = "//div[@class='mail_list twoIconset userListLeft']/ul/li[*]";// list
	
	// Advance Search Box Xpaths
	static String programAdvanceSearchIcon = "//a[@data-original-title='Advanced Search']";
	static String programAdvanceSearchSelectStaus = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlStatus']";//list
	static String programAdvanceSearchSelectPolicyType = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlProjectType']";//list
	static String programAdvanceSearchSelectProgramAdmin = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlNodeAdministrator']";//list
	static String programAdvanceSearchSelectProgramSponsor = "//select[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_ddlOwner']";//list
	static String programAdvanceSearchSelectCategory = "//button[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_btnDropdown']";
	static String programAdvanceSearchSelectFlag = "//div[@id='changeFlag']";
	static String programAdvanceSearchCloseBtn = "//button[contains(text(),'Close')]";
	static String programAdvanceSearchSearchBtn = "#btnAdvanceSearch";// css
	static String programClearIcon = "//i[@class='fa fa-refresh']";
//	static String programAdvanceSearchSelectPolicyType = "//select[contains(@id,'_ContentPlaceHolder1_ctrlProjectList_ddlProjectType')]";
	
	
	// contractor Module Preview Panel xpaths
	static String programFetchProgramAndSponsorNamePrivewP = "//div[@class='headingGroup clearfix']";
	static String programStatusButtonPrivewP = "//i[@class='fa fa-street-view']";
	static String programDetailsButtonPrivewP = "//i[@class='fa fa-sitemap']";
	static String programDetailsKPI_HierarchyButtonPrivewP ="//a[contains(@id,'_aHierarchyKPI')]";
	static String programRequiresAdditionlpreviewButtonPrivewP = "//a[@id='ctl21_btnDropdown']//i[@class='fa fa-th-large']";
	static String programFlagButtonPrivewP = "//a[@id='ctl21_spnflag']//i[@class='fa fa-flag']";
	static String programFetchPolicyTypePrivewP = "//span[@id='ctl21_lblPolicyType']";
	static String programFetchProgramAdminNamePrivewP = "//div[@class='overflowTxt']";
	static String programConfigurationLinkPrivewP = "//a[contains(text(),'Configuration')]";
	static String programFetchConfigurationDropdownPrivewP = "//div[@id='ctl21_divConfiguration']//div[@class='dropDownShow pull-right']";
	static String programFetchProgramBeginDatePrivewP = "//span[@id='ctl21_lblBeginDate']";
	static String programFetchProgramEndDatePrivewP = "//span[@id='ctl21_lblEndDate']";
	static String programAddCloseoutLinkPrivewP = "//span[@id='ctl21_spnCloseout']";
	
	
//Navigations Links Xpaths of Preview Panel 10/08/2020
	//span[contains(@id,'_lblWorksite')]
	static String projectsLinkPrivewP ="//a[contains(@href,'frmWorkSite.aspx')]";
	static String contractorPkgTypeLinkPrivewP ="//div[@id='ctl21_ctrlContractorPackageChart_divStatustypeCharts']//*[local-name()='svg']//*[name()='g' and contains(@class,'donut-stat')]//*[name()='path'][2]";
	//static String contractorPkgTypeLinkPrivewP ="//div[contains(@class,'donut-contracttype-charts divContractTypeCharts')]//*[name()='svg']/*[name()='g']//*[name()='path' and @style='fill: rgb(36, 110, 175);']";
	
	
	//"//div[contains(@class,'donut-contracttype-charts divContractTypeCharts')]//*[name()='svg']/*[name()='g']";
	//"//div[contains(@class,'donut-contracttype-charts divContractTypeCharts')]//*[name()='svg']/*[name()='g']//*[name()='path' and @style='fill: rgb(36, 110, 175);']";//blue color
	//div[contains(@class,'donut-contracttype-charts divContractTypeCharts')]
	static String sponsorLinkPrivewP ="//span[contains(text(),'Sponsors')]/../ul/li[1]";
	static String administratorLinkPrivewP ="//span[contains(text(),'Administrator')]/../ul/li[1]";
	
	public static WebElement projectsLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(projectsLinkPrivewP));
		return element;
	}
	public static WebElement contractorPkgTypeLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(contractorPkgTypeLinkPrivewP));
		return element;
	}
	public static WebElement sponsorLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(sponsorLinkPrivewP));
		return element;
	}
	public static WebElement administratorLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(administratorLinkPrivewP));
		return element;
	}
	public static WebElement programDetailsKPI_HierarchyButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programDetailsKPI_HierarchyButtonPrivewP));
		return element;
	}
	
	
	// remaining code in ProgramAddCloseotPage
	static String programfetchAllProjectsCountPrivewP = "//div[@id='divWorksiteBorderBox']//div[@class='txt clearfix']";
	static String programfetchAllContractorsCountPrivewP = "//div[@id='ctl21_ctrlContractorPackageChart_divContractTypeCharts']";
	static String programfetchOffsiteCertificateTrackedPercentPrivewP = "//span[@id='spnPercentCertificateProject']";
	static String programfetchOffsiteCertificateTrackedPrivewP = "//span[@id='spnCertificatesTracked']";
	static String programfetchAllSponsorsNamePrivewP = "//div[@id='ctl21_divOwner']/ul/li";// list
	static String programfetchAllAdministratorNamePrivewP = "//div[@id='ctl21_divNodeAdministrator']/ul/li";// list
	static String programAddProjectButtonPrivewP = "//span[@id='ctl21_lblAddWorkSite']";
	static String programFetchAllProjectNamesPrivewP = "//div[@id='divWorksite']//table[@class='table darkTable']/tbody/tr[*]";// list
	static String programFetchCreatedByPrivewP = "//span[@id='ctl21_spnCreatedDate']";
	static String programFetchModifiedByPrivewP = "//span[@id='ctl21_spnModifiedDate']";

	
	static String selectAllProgramNameFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[1]/div[1]/div";
	static String selectAllProgramEnrollmentTypeFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[1]/div[2]/div";
	static String selectAllProgramSponsorNameFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[2]/div[1]/div";
	static String selectAllProgramAdminFrmList ="//div[@class='mail_list twoIconset userListLeft']/ul/li[*]/div//div[@class='listingMain flft']/div/div[2]/div[2]/div";
	static String displayTotalCountOfProgram ="//span[contains(text(),'Displaying')]//span[@id='ctl00_ContentPlaceHolder1_ctrlProjectList_lblTotalRecord']";
	static String seeMoreBtnProgram ="//a[@id='aSeeMore']";
	
	
	
	public static List<WebElement> selectAllProgramNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProgramNameFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProgramEnrollmentTypeFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProgramEnrollmentTypeFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProgramSponsorNameFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProgramSponsorNameFrmList));
		return listElement;
	}
	public static List<WebElement> selectAllProgramAdminFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectAllProgramAdminFrmList));
		return listElement;
	}
	public static WebElement displayTotalCountOfProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(displayTotalCountOfProgram));
		return element;
	}
	public static WebElement seeMoreBtnProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(seeMoreBtnProgram));
		return element;
	}
	
	
	
	
	public static WebElement programAddIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programAddIcon));
		return element;
	}

	public static WebElement programEditIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programEditIcon));
		return element;
	}

	public static WebElement programDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programDeleteIcon));
		return element;
	}

	public static WebElement programSearchEditBox(WebDriver driver) {
		element = driver.findElement(By.xpath(programSearchEditBox));
		return element;
	}

	public static WebElement programSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programSearchIcon));
		return element;
	}

	public static List<WebElement> programSelectAllprogramFrmList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programSelectAllprogramFrmList));
		return listElement;
	}

	public static WebElement programSelectFirstprogramFrmList(WebDriver driver) {
		element = driver.findElement(By.xpath(programSelectFirstprogramFrmList));
		return element;
	}

	public static WebElement programAdvanceSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchIcon));
		return element;
	}

	public static WebElement programAdvanceSearchSelectStaus(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchSelectStaus));
		return element;
	}

	public static WebElement programAdvanceSearchSelectPolicyType(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchSelectPolicyType));
		return element;
	}

	public static WebElement programAdvanceSearchSelectProgramAdmin(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchSelectProgramAdmin));
		return element;
	}

	public static WebElement programAdvanceSearchSelectProgramSponsor(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchSelectProgramSponsor));
		return element;
	}

	public static List<WebElement> programAdvanceSearchSelectCategory(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programAdvanceSearchSelectCategory));
		return listElement;
	}

	public static WebElement programAdvanceSearchSelectFlag(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchSelectFlag));
		return element;
	}

	public static WebElement programAdvanceSearchCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(programAdvanceSearchCloseBtn));
		return element;
	}

	public static WebElement programAdvanceSearchSearchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(programAdvanceSearchSearchBtn));
		return element;
	}

	public static WebElement programClearIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(programClearIcon));
		return element;
	}

	public static WebElement programFetchProgramAndSponsorNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchProgramAndSponsorNamePrivewP));
		return element;
	}

	public static WebElement programStatusButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programStatusButtonPrivewP));
		return element;
	}

	public static WebElement programDetailsButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programDetailsButtonPrivewP));
		return element;
	}

	public static WebElement programRequiresAdditionlpreviewButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programRequiresAdditionlpreviewButtonPrivewP));
		return element;
	}

	public static WebElement programFlagButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFlagButtonPrivewP));
		return element;
	}

	public static WebElement programFetchPolicyTypePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchPolicyTypePrivewP));
		return element;
	}

	public static WebElement programFetchProgramAdminNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchProgramAdminNamePrivewP));
		return element;
	}

	public static WebElement programConfigurationLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programConfigurationLinkPrivewP));
		return element;
	}

	public static WebElement programFetchConfigurationDropdownPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchConfigurationDropdownPrivewP));
		return element;
	}

	public static WebElement programFetchProgramBeginDatePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchProgramBeginDatePrivewP));
		return element;
	}

	public static WebElement programFetchProgramEndDatePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchProgramEndDatePrivewP));
		return element;
	}

	public static WebElement programAddCloseoutLinkPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programAddCloseoutLinkPrivewP));
		return element;
	}

	public static WebElement programfetchAllProjectsCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchAllProjectsCountPrivewP));
		return element;
	}

	public static WebElement programfetchAllContractorsCountPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchAllContractorsCountPrivewP));
		return element;
	}

	public static WebElement programfetchOffsiteCertificateTrackedPercentPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchOffsiteCertificateTrackedPercentPrivewP));
		return element;
	}

	public static WebElement programfetchOffsiteCertificateTrackedPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchOffsiteCertificateTrackedPrivewP));
		return element;
	}

	public static WebElement programfetchAllSponsorsNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchAllSponsorsNamePrivewP));
		return element;
	}

	public static WebElement programfetchAllAdministratorNamePrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programfetchAllAdministratorNamePrivewP));
		return element;
	}

	public static WebElement programAddProjectButtonPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programAddProjectButtonPrivewP));
		return element;
	}

	public static List<WebElement> programFetchAllProjectNamesPrivewP(WebDriver driver) {
		listElement = driver.findElements(By.xpath(programFetchAllProjectNamesPrivewP));
		return listElement;
	}

	public static WebElement programFetchCreatedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchCreatedByPrivewP));
		return element;
	}

	public static WebElement programFetchModifiedByPrivewP(WebDriver driver) {
		element = driver.findElement(By.xpath(programFetchModifiedByPrivewP));
		return element;
	}

}
