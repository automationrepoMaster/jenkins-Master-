package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Compliance_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String addCompliancePlusIcon = "//i[@class='fa fa-plus']";
	static String editComplianceIcon = "//i[@class='fa fa-pencil-square-o']";
	static String deleteComplianceIcon = "//i[@class='fa fa-trash-o']";
	static String searchField = "//input[@id='txtSearch']";
	static String searchIcon = "//div[@class='controllGroup']//a";
	static String advanceSearchIcon = "//i[@class='fa fa-caret-down']";
	static String ClearSearchIcon = "//i[@class='fa fa-refresh']";
	static String closeButton = "//button[@id='divClose']";
	static String backButton = "//input[@id='btnBackCompliance']";
	static String saveAndContinueButton = "//a[@id='btnSaveandContinueCompliance']";
	// a[contains(text(),'Save and Continue')]
	// Advance Search
	static String advanceSearchCreatedDateFrom = "//input[@id='datepicker4']";
	static String advanceSearchCreatedDateTo = "//input[@id='datepicker1']";
	static String advanceSearchDateFrom = "//input[@id='datepicker2']";
	static String advanceSearchDateTo = "//input[@id='datepicker3']";
	static String advanceSearchSearchButton = "//input[@id='btnAdvanceSearch']";
	static String advanceSearchCloseButton = "//span[@class='flft']//button[@class='btn'][contains(text(),'Close')]";
	// Add compliance
	static String addComplianceComplianceName = "//input[@id='txtComplianceName']";
	static String addCompliancenoteTextArea = "//textarea[@id='txtComplianceNote']";
	static String addComplianceAddAdditionalisuredCheckBox = "//input[@id='chkAdditionalInsured']";
	static String addComplianceWaiverofSubrogationCheckBox = "//input[@id='chkWaiverofSabrogation']";
	static String addComplianceCloseButton = "//button[@class='btn']";
	static String addComplianceSaveAndCloseButton = "//input[@id='btnSaveCompliance']";
	// Add coverage
	static String addComplianceAddNewCoverageLink = "//a[@id='btnAddNewCoverage']";
	static String addComplianceCoverageName = "//input[@id='txtCoverageName']";
	static String addComplianceCoverageCode = "//input[@id='txtCoverageCode']";
	static String addComplianceCoverageNextBtn = "//input[@id='btnNextAddLimitsName']";

	static String addComplianceAddFirstLimitName = "//input[@id='rptOperation_ctl00_txtStringValue']";
	static String addComplianceSelectFirstLimitType = "//select[@id='rptOperation_ctl00_ddlValueType']";// list
	static String addComplianceAddButtonFirstRow = "//input[@id='rptOperation_ctl00_btnAdd']";
	static String addComplianceDeleteButtonFirstRow = "//input[@id='rptOperation_ctl00_btnDelete']";
	static String addComplianceAddSecondLimitName = "//input[@id='rptOperation_ctl01_txtStringValue']";
	static String addComplianceSelectSecondLimitType = "//select[@id='rptOperation_ctl01_ddlValueType']";
	static String addComplianceAddButtonSecondRow = "//input[@id='rptOperation_ctl01_btnAdd']";
	static String addComplianceDeleteButtonSecondRow = "//input[@id='rptOperation_ctl01_btnDelete']";
	static String addComplianceAlertOkBtn = "//button[@id='btnSaveModal']";// "//button[@class='btn btn-primary
																			// pull-right']";

	static String addComplianceCoverageCloseButton = "//button[@class='btn']";
	static String addComplianceCoverageSaveAndCloseButton = "//input[@id='btnSaveandClose']";

	public static WebElement selectCheckBoxForCompliance(WebDriver driver, String liabilityName) {
		element = driver.findElement(By.xpath("//div[@class='fleft contractheadlink']/span[contains(text(),'"
				+ liabilityName + "')]/../../div//input[@type='checkbox']"));
		return element;
	}
	// static String selectCheckBoxForCompliance="//div[@class='fleft
	// contractheadlink']/span[contains(text(),'Automobile
	// Liability')]/../../div//input[@type='checkbox']";

	public static WebElement addFirstRowLimitText(WebDriver driver, String liabilityName) {
		element = driver.findElement(By.xpath("//div[@class='fleft contractheadlink']/span[contains(text(),'"
				+ liabilityName
				+ "')]/../../div//input[@type='checkbox']/../../../../../../../following-sibling::div[1]//table/tbody/tr[1]/td[3]//input"));
		return element;
	}

	public static WebElement addSecondRowLimitText(WebDriver driver, String liabilityName) {
		element = driver.findElement(By.xpath("//div[@class='fleft contractheadlink']/span[contains(text(),'"
				+ liabilityName
				+ "')]/../../div//input[@type='checkbox']/../../../../../../../following-sibling::div[1]//table/tbody/tr[2]/td[3]//input"));
		return element;
	}

	// div[@class='fleft contractheadlink']/span[contains(text(),'Automobile
	// Liability')]/../../div//input[@type='checkbox']/../../../../../../../following-sibling::div[1]//table/tbody/tr[1]/td[3]//input

	public static WebElement addComplianceAlertOkBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAlertOkBtn));
		return element;
	}

	public static WebElement addComplianceCoverageCode(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCoverageCode));
		return element;
	}

	public static WebElement addComplianceCoverageNextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCoverageNextBtn));
		return element;
	}

	// edit compliance and fetching values will be design as per test cases coz
	// its not predictable

	public static WebElement addCompliancePlusIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addCompliancePlusIcon));
		return element;
	}

	public static WebElement editComplianceIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(editComplianceIcon));
		return element;
	}

	public static WebElement deleteComplianceIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteComplianceIcon));
		return element;
	}

	public static WebElement searchField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchField));
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

	public static WebElement ClearSearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ClearSearchIcon));
		return element;
	}

	public static WebElement closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath(closeButton));
		return element;
	}

	public static WebElement backButton(WebDriver driver) {
		element = driver.findElement(By.xpath(backButton));
		return element;
	}

	public static WebElement saveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(saveAndContinueButton));
		return element;
	}

	public static WebElement advanceSearchCreatedDateFrom(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchCreatedDateFrom));
		return element;
	}

	public static WebElement advanceSearchCreatedDateTo(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchCreatedDateTo));
		return element;
	}

	public static WebElement advanceSearchDateFrom(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchDateFrom));
		return element;
	}

	public static WebElement advanceSearchDateTo(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchDateTo));
		return element;
	}

	public static WebElement advanceSearchSearchButton(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchSearchButton));
		return element;
	}

	public static WebElement advanceSearchCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(advanceSearchCloseButton));
		return element;
	}

	public static WebElement addComplianceComplianceName(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceComplianceName));
		return element;
	}

	public static WebElement addCompliancenoteTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(addCompliancenoteTextArea));
		return element;
	}

	public static WebElement addComplianceAddAdditionalisuredCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddAdditionalisuredCheckBox));
		return element;
	}

	public static WebElement addComplianceWaiverofSubrogationCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceWaiverofSubrogationCheckBox));
		return element;
	}

	public static WebElement addComplianceCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCloseButton));
		return element;
	}

	public static WebElement addComplianceSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceSaveAndCloseButton));
		return element;
	}

	public static WebElement addComplianceAddNewCoverageLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddNewCoverageLink));
		return element;
	}

	public static WebElement addComplianceCoverageName(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCoverageName));
		return element;
	}

	public static WebElement addComplianceAddFirstLimitName(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddFirstLimitName));
		return element;
	}

	public static WebElement addComplianceSelectFirstLimitType(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceSelectFirstLimitType));
		return element;
	}

	public static WebElement addComplianceAddButtonFirstRow(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddButtonFirstRow));
		return element;
	}

	public static WebElement addComplianceDeleteButtonFirstRow(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceDeleteButtonFirstRow));
		return element;
	}

	public static WebElement addComplianceAddSecondLimitName(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddSecondLimitName));
		return element;
	}

	public static WebElement addComplianceSelectSecondLimitType(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceSelectSecondLimitType));
		return element;
	}

	public static WebElement addComplianceAddButtonSecondRow(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceAddButtonSecondRow));
		return element;
	}

	public static WebElement addComplianceDeleteButtonSecondRow(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceDeleteButtonSecondRow));
		return element;
	}

	public static WebElement addComplianceCoverageCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCoverageCloseButton));
		return element;
	}

	public static WebElement addComplianceCoverageSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addComplianceCoverageSaveAndCloseButton));
		return element;
	}

	// Compliance New -Raja

	static String ComplianceName_SaveandContinueBtn = "//a[@id='lbSaveAndContinue']";
	static String ComplianceName_SaveandCloseBtn = "//a[@id='lbSaveAndClose']";
	static String ComplianceName_SaveBtn = "//a[@id='lbSave']";

	public static WebElement ComplianceName_SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ComplianceName_SaveandContinueBtn));
		return element;
	}

	public static WebElement ComplianceName_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ComplianceName_SaveandCloseBtn));
		return element;
	}

	public static WebElement ComplianceName_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(ComplianceName_SaveBtn));
		return element;
	}

	// CoverageType

	static String CoverageType_saveandcontinueBtn = "//a[@id='lbCTSaveAndContinue']";
	static String CoverageType_saveandcloseBtn = "//a[@id='lbCTSaveAndClose']";
	static String CoverageType_saveBtn = "//a[@id='lbCTSave']";
	static String CoverageType_BackBtn = "//a[@id='lbCTPrevious']";
	static String CoverageType_Cancelbtn = "//div[@id='divCoverageTypeNext']//a[@title='Cancel']";

	public static WebElement CoverageType_Cancelbtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_Cancelbtn));
		return element;
	}

	public static WebElement CoverageType_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_BackBtn));
		return element;
	}

	public static WebElement CoverageType_saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_saveBtn));
		return element;
	}

	public static WebElement CoverageType_saveandcloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_saveandcloseBtn));
		return element;
	}

	public static WebElement CoverageType_saveandcontinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_saveandcontinueBtn));
		return element;
	}

	static String CoverageType_Automobile_TrackBrokerandBasicPolicy_Chkbox = "//input[@name='rptComplianceCoverage$ctl00$chkUseBasicInfo']";
	static String CoverageType_PolicyandEndorsements_ChkBox = "//input[@name='rptComplianceCoverage$ctl00$chkUsePolicyLimit']";
	static String CoverageType_SaveandContinueBtn = "//a[@id='lbCTSaveAndContinue']";
	static String CoverageType_SaveandCloseBtn = "//a[@id='lbCTSaveAndClose']";
	static String CoverageType_SaveBtn = "//a[@id='lbCTSave']";
	// static String CoverageType_BackBtn="//a[@id='lbCTPrevious']";

	

	

	public static WebElement CoverageType_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_SaveBtn));
		return element;
	}

	public static WebElement CoverageType_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_SaveandCloseBtn));
		return element;
	}

	public static WebElement CoverageType_SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_SaveandContinueBtn));
		return element;
	}

	public static WebElement CoverageType_PolicyandEndorsements_ChkBox(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_PolicyandEndorsements_ChkBox));
		return element;
	}

	public static WebElement CoverageType_Automobile_TrackBrokerandBasicPolicy_Chkbox(WebDriver driver) {
		element = driver.findElement(By.xpath(CoverageType_Automobile_TrackBrokerandBasicPolicy_Chkbox));
		return element;
	}

	// Criteria

	static String Criteria_SelectBasedonDropdown = "//select[@id='ddlBasedOn']";
	static String Criteria_SelectRangeDropdown = "//select[@id='ddlRange']";
	static String Criteria_ValueFeild = "//input[@id='txtContractValue']";
	static String Criteria_SaveandCloseBtn = "//a[@id='lbCRSaveAndClose']";
	static String Criteria_SaveBtn = "//a[@id='lbCRSave']";
	static String Criteria_BackBtn = "//a[@id='lbCRPrevious']";
	static String Criteria_Cancelbtn = "//div[@id='divCoverageTypeNext']//a[@title='Cancel']";
	
	
	public static WebElement Criteria_Cancelbtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_Cancelbtn));
		return element;
	}
	public static WebElement Criteria_SelectBasedonDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_SelectBasedonDropdown));
		return element;
	}

	public static WebElement Criteria_SelectRangeDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_SelectRangeDropdown));
		return element;
	}

	public static WebElement Criteria_ValueFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_ValueFeild));
		return element;
	}

	public static WebElement Criteria_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_SaveandCloseBtn));
		return element;
	}

	public static WebElement Criteria_SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_SaveBtn));
		return element;
	}

	public static WebElement Criteria_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Criteria_BackBtn));
		return element;
	}

}
