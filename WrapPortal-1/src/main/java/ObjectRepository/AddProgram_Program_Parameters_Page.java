package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Program_Parameters_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String minimumContractValue = "//input[@id='txtMinimumContractPrice']";
	static String minimumManHours = "//input[@id='txtMinimumManHours']";
	static String minimumPayroll = "//input[@id='txtMinimumPayroll']";
	static String minimumDaysonJobSite = "//input[@id='txtMinimumDaysonJobSite']";
	// Add Trade xpath
	static String addTradeClickHereLink = "//a[@id='btnQuickAdd']";
	static String searchForTradeField = "//input[@id='token-input-txtTradePackages']";
	static String descriptionTradeField = "//input[@id='txtTradeNote']";
	static String addTradePlusButton = "//a[@id='btnAddTrade']";
	static String addTradeAddButton = "//input[@id='btnQuickTradeAdd']";
	static String addTradeDeleteIcon = "//i[@class='fa fa-trash-o']";
	static String addTradeLink = "//span[@id='lblTradeClick']";
	// Add Work Class xpath
	static String addWorkClassClickHereLink = "//a[@id='btnQuickAddWorkclass']";
	static String searchForWorkClassField = "//select[@id='ddlWorkclass']";// list
	static String descriptionWorkClassField = "//input[@id='txtWorkclassNote']";
	static String addWorkClassPlusButton = "//a[@id='btnAddWorkclass']";
	static String addWorkClassAddButton = "//input[@id='btnQuickWorkClassAdd']";
	static String addWorkClassDeleteIcon = "//td[@id='rptWorkclass_ctl00_divWorkSiteDelete']//i[@class='fa fa-trash-o']";
	static String addWorkClassLink = "//a[contains(text(),'click here to add Class Code.)')]";
	// Contractor Number xpath
	static String switchenableContractorNumber = "//div[@id='uniform-chkTrackContractNumber']//div[@class='inner']";
	static String createContractorNumberTemplateTextArea = "//textarea[@id='txtCNFormat']";
	static String selectTokenProgramCode = "//span[@id='lblProjectCode']";
	static String selectTokenProjectCode = "//span[@id='lblWorkSiteCode']";
	static String selectTokenSponsorCode = "//span[@id='lblOwnerCode']";
	static String selectTokenDivisionCode = "//span[@id='lblDivisionCode']";
	static String selectTokenContractorLicense = "//span[@id='lblContractorLicense']";
	static String selectTokenContractorFEIN = "//span[@id='lblContractorFEIN']";
	static String selectTokenSequence = "//span[@id='lblSequence']";
	static String selectContractSequenceField = "//input[@id='txtCNSequence']";
	//Location Code Xpath
	static String switchLocationCode="//input[@id='chkTrackLocationCode' and @type='checkbox']/../div[starts-with(@class,'ios-ui-select')]/div";
	static String selectLocationCodeToken_ProgramCode="//span[@id='lblLCProjectCode']";
	static String selectLocationCodeToken_ProjectCode="//span[@id='lblLCWorkSiteCode']";
	static String selectLocationCodeToken_SponsorCode="//span[@id='lblLCOwnerCode']";
	static String selectLocationCodeToken_Sub_SponsorCode="//span[@id='lblLCDivisionCode']";
	static String selectLocationCodeSequenceField="//input[@id='txtLocationCodeSequence']";
	
	
	public static WebElement switchLocationCode(WebDriver driver) {
		element = driver.findElement(By.xpath(switchLocationCode));
		return element;
	}public static WebElement selectLocationCodeToken_ProgramCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLocationCodeToken_ProgramCode));
		return element;
	}public static WebElement selectLocationCodeToken_ProjectCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLocationCodeToken_ProjectCode));
		return element;
	}public static WebElement selectLocationCodeToken_SponsorCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLocationCodeToken_SponsorCode));
		return element;
	}public static WebElement selectLocationCodeToken_Sub_SponsorCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLocationCodeToken_Sub_SponsorCode));
		return element;
	}public static WebElement selectLocationCodeSequenceField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLocationCodeSequenceField));
		return element;
	}
	
	
	// Project Alert parameter
	static String switchHighEMR = "//div[@id='uniform-chkHighModRate']//div[@class='inner']";
	static String ModeRateValueEMR = "//input[@id='txtHighModRate']";
	static String switchModRateAlertContractor = "//div[@id='uniform-chkIsAlertContractorForModRate']//div[@class='inner']";
	static String switchCloseoutVariance = "//div[@id='uniform-chkCloseoutVariance']//div[@class='inner']";
	static String closeoutVarianceLowerValue = "//input[@id='txtCloseoutVarianceLower']";
	static String closeoutVarianceHigherValue = "//input[@id='txtCloseoutVarianceHigher']";
	static String switchCloseoutVarianceAlertContractor = "//div[@id='uniform-chkAlertContractorCloseout']//div[@class='inner']";
	static String switchCloseout_CV_VarianceAlert = "//div[@id='uniform-chkCloseoutVarianceForCV']//div[@class='inner']";
	static String closeout_CV_VarianceAlertLowerValue = "//input[@id='txtCloseoutVarianceLowerForCV']";
	static String closeout_CV_VarianceAlertHigherValue = "//input[@id='txtCloseoutVarianceHigherForCV']";
	static String switchCloseout_CV_VarianceAlertContractor = "//div[@id='uniform-chkAlertContractorCloseoutForCV']//div[@class='inner']";
	static String switchEstimatedPayrollTo_CV_Ratio = "//div[@id='uniform-chkContractorDuringEnrollment']//div[@class='inner']";
	static String estimatedPayrollTo_CV_RatioBelowValue = "//input[@id='txtBelow']";
	static String estimatedPayrollTo_CV_RatioAboveValue = "//input[@id='txtAbove']";
	static String switchEstimatedPayrollTo_CV_RatioAlertContractor = "//div[@id='uniform-chkIsAlertContractorForCVRatio']//div[@class='inner']";
	static String switchEstimatedPayrollToSelfPerformRatio = "//div[@id='uniform-chkContractorDuringSelfPerformedCV']//div[@class='inner']";
	static String estimatedPayrollToSelfPerformRatioBelowValue = "//input[@id='txtSPCVBelow']";
	static String estimatedPayrollToSelfPerformRatioAboveValue = "//input[@id='txtSPCVAbove']";
	static String estimatedPayrollToSelfPerformRatioAlertContractor = "//div[@id='uniform-chkIsAlertContractorForSPCVRatio']//div[@class='inner']";
	static String switchAlertForWorkClassRates = "//div[@id='uniform-chkWorkClassRates']//div[@class='inner']";
	static String workClassRatesBenchmarkLowerValue = "//input[@id='txtLower']";
	static String workClassRatesBenchmarkHigherValue = "//input[@id='txtHigher']";
	static String workClassRatesLow_High_LowerValue = "//input[@id='txtWCLowerRate']";
	static String workClassRatesLow_High_HigherValue = "//input[@id='txtWCHigherRate']";
	static String selectPendingCloseoutStandsFor = "//select[@id='ddlPendingClosOut']";
	// SuspendedPayroll
	static String addSuspendedPayrollLink = "//a[@class='fright']";
	static String addSuspendedPayrollClickHereLink = "//span[@class='norecordfound']//a[contains(text(),'click here')]";
	static String addSuspendedPayrollStartDate = "//input[@id='txtstartdate']";
	static String addSuspendedPayrollEndDate = "//input[@id='txtenddate']";
	static String addSuspendedPayrollNotes = "//textarea[@id='txtSuspendPayrollNote']";
	static String addSuspendedPayrollSaveAndCloseButton = "//a[@id='btnSavesuspendedInformation']"; //Raja----//input[@id='btnSavesuspendedInformation']";
	static String addSuspendedPayrollCancelButton = "//button[@id='btnCancle']";
	static String radioButtonRequiredPhysicalSignature = "//input[@id='rdoDigitalSignature']";
	static String radioButtonRequiredDigitalSignature = "//input[@id='rdoPysicalSignature']";
	static String switchRequiredCheckboxFinalTermsAndCondition = "//div[@id='uniform-chkRequiredFinalTermsAndCondition']//div[@class='inner']";
	static String enrollmentConfirmationCheckBoxBoldButton = "//div[@id='mce_73']//i[@class='mce-ico mce-i-bold']";
	static String enrollmentConfirmationTextArea = "//iframe[@id='txtEnrollmentSummaryConfirmation_ifr']";
	static String switchRequiredNoLossStatement = "//div[@id='uniform-chkRequiredLossStatement']//div[@class='inner']";
	static String requiredNoLossStatementBoldButton = "//div[@id='mce_95']//i[@class='mce-ico mce-i-bold']";
	static String requiredNoLossStatementTextArea = "//iframe[@id='txtLossLetter_ifr']";
	static String requiredNoLossStmtCompanyAddressToken = "//span[@id='rptEmailTokens_ctl00_Label17']";
	static String requiredNoLossStmtContractorCompanyToken = "//span[@id='rptEmailTokens_ctl01_Label17']";
	static String requiredNoLossStmtContractorContactNameToken = "//span[@id='rptEmailTokens_ctl02_Label17']";
	static String requiredNoLossStmtContractorDBAToken = "//span[@id='rptEmailTokens_ctl03_Label17']";
	static String requiredNoLossStmtContractorFEINToken = "//span[@id='rptEmailTokens_ctl04_Label17']";
	
	static String programParameterBackButton = "//input[@value='Back']";
	static String programParameterSaveButton = "//input[@value='Save']";
	static String programParameterSaveAndCloseButton = "//input[@value='Save and Close']";
	static String programParameterSaveAndContinueButton = "//div[@class='container-fluid']//input[4]";//need to find proper
	static String programParameterCloseButton = "//button[@class='btn']";

	public static WebElement minimumContractValue(WebDriver driver) {
		element = driver.findElement(By.xpath(minimumContractValue));
		return element;
	}

	public static WebElement minimumManHours(WebDriver driver) {
		element = driver.findElement(By.xpath(minimumManHours));
		return element;
	}

	public static WebElement minimumPayroll(WebDriver driver) {
		element = driver.findElement(By.xpath(minimumPayroll));
		return element;
	}

	public static WebElement minimumDaysonJobSite(WebDriver driver) {
		element = driver.findElement(By.xpath(minimumDaysonJobSite));
		return element;
	}

	public static WebElement addTradeClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeClickHereLink));
		return element;
	}

	public static WebElement searchForTradeField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchForTradeField));
		return element;
	}

	public static WebElement descriptionTradeField(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionTradeField));
		return element;
	}

	public static WebElement addTradePlusButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradePlusButton));
		return element;
	}

	public static WebElement addTradeAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeAddButton));
		return element;
	}

	public static WebElement addTradeDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeDeleteIcon));
		return element;
	}

	public static WebElement addTradeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addTradeLink));
		return element;
	}

	public static WebElement addWorkClassClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassClickHereLink));
		return element;
	}

	public static WebElement searchForWorkClassField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchForWorkClassField));
		return element;
	}

	public static WebElement descriptionWorkClassField(WebDriver driver) {
		element = driver.findElement(By.xpath(descriptionWorkClassField));
		return element;
	}

	public static WebElement addWorkClassPlusButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassPlusButton));
		return element;
	}

	public static WebElement addWorkClassAddButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassAddButton));
		return element;
	}

	public static WebElement addWorkClassDeleteIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassDeleteIcon));
		return element;
	}

	public static WebElement addWorkClassLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addWorkClassLink));
		return element;
	}

	public static WebElement switchenableContractorNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(switchenableContractorNumber));
		return element;
	}

	public static WebElement createContractorNumberTemplateTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(createContractorNumberTemplateTextArea));
		return element;
	}

	public static WebElement selectTokenProgramCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenProgramCode));
		return element;
	}

	public static WebElement selectTokenProjectCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenProjectCode));
		return element;
	}

	public static WebElement selectTokenSponsorCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenSponsorCode));
		return element;
	}

	public static WebElement selectTokenDivisionCode(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenDivisionCode));
		return element;
	}

	public static WebElement selectTokenContractorLicense(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenContractorLicense));
		return element;
	}

	public static WebElement selectTokenContractorFEIN(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenContractorFEIN));
		return element;
	}

	public static WebElement selectTokenSequence(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTokenSequence));
		return element;
	}

	public static WebElement selectContractSequenceField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractSequenceField));
		return element;
	}

	public static WebElement switchHighEMR(WebDriver driver) {
		element = driver.findElement(By.xpath(switchHighEMR));
		return element;
	}

	public static WebElement ModeRateValueEMR(WebDriver driver) {
		element = driver.findElement(By.xpath(ModeRateValueEMR));
		return element;
	}

	public static WebElement switchModRateAlertContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(switchModRateAlertContractor));
		return element;
	}

	public static WebElement switchCloseoutVariance(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCloseoutVariance));
		return element;
	}

	public static WebElement closeoutVarianceLowerValue(WebDriver driver) {
		element = driver.findElement(By.xpath(closeoutVarianceLowerValue));
		return element;
	}

	public static WebElement closeoutVarianceHigherValue(WebDriver driver) {
		element = driver.findElement(By.xpath(closeoutVarianceHigherValue));
		return element;
	}

	public static WebElement switchCloseoutVarianceAlertContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCloseoutVarianceAlertContractor));
		return element;
	}

	public static WebElement switchCloseout_CV_VarianceAlert(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCloseout_CV_VarianceAlert));
		return element;
	}

	public static WebElement closeout_CV_VarianceAlertLowerValue(WebDriver driver) {
		element = driver.findElement(By.xpath(closeout_CV_VarianceAlertLowerValue));
		return element;
	}

	public static WebElement closeout_CV_VarianceAlertHigherValue(WebDriver driver) {
		element = driver.findElement(By.xpath(closeout_CV_VarianceAlertHigherValue));
		return element;
	}

	public static WebElement switchCloseout_CV_VarianceAlertContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCloseout_CV_VarianceAlertContractor));
		return element;
	}

	public static WebElement switchEstimatedPayrollTo_CV_Ratio(WebDriver driver) {
		element = driver.findElement(By.xpath(switchEstimatedPayrollTo_CV_Ratio));
		return element;
	}

	public static WebElement estimatedPayrollTo_CV_RatioBelowValue(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollTo_CV_RatioBelowValue));
		return element;
	}

	public static WebElement estimatedPayrollTo_CV_RatioAboveValue(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollTo_CV_RatioAboveValue));
		return element;
	}

	public static WebElement switchEstimatedPayrollTo_CV_RatioAlertContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(switchEstimatedPayrollTo_CV_RatioAlertContractor));
		return element;
	}

	public static WebElement switchEstimatedPayrollToSelfPerformRatio(WebDriver driver) {
		element = driver.findElement(By.xpath(switchEstimatedPayrollToSelfPerformRatio));
		return element;
	}

	public static WebElement estimatedPayrollToSelfPerformRatioBelowValue(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollToSelfPerformRatioBelowValue));
		return element;
	}

	public static WebElement estimatedPayrollToSelfPerformRatioAboveValue(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollToSelfPerformRatioAboveValue));
		return element;
	}

	public static WebElement estimatedPayrollToSelfPerformRatioAlertContractor(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollToSelfPerformRatioAlertContractor));
		return element;
	}

	public static WebElement switchAlertForWorkClassRates(WebDriver driver) {
		element = driver.findElement(By.xpath(switchAlertForWorkClassRates));
		return element;
	}

	public static WebElement workClassRatesBenchmarkLowerValue(WebDriver driver) {
		element = driver.findElement(By.xpath(workClassRatesBenchmarkLowerValue));
		return element;
	}

	public static WebElement workClassRatesBenchmarkHigherValue(WebDriver driver) {
		element = driver.findElement(By.xpath(workClassRatesBenchmarkHigherValue));
		return element;
	}

	public static WebElement workClassRatesLow_High_LowerValue(WebDriver driver) {
		element = driver.findElement(By.xpath(workClassRatesLow_High_LowerValue));
		return element;
	}

	public static WebElement workClassRatesLow_High_HigherValue(WebDriver driver) {
		element = driver.findElement(By.xpath(workClassRatesLow_High_HigherValue));
		return element;
	}

	public static List<WebElement> selectPendingCloseoutStandsFor(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectPendingCloseoutStandsFor));
		return listElement;
	}

	public static WebElement addSuspendedPayrollLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollLink));
		return element;
	}

	public static WebElement addSuspendedPayrollClickHereLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollClickHereLink));
		return element;
	}

	public static WebElement addSuspendedPayrollStartDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollStartDate));
		return element;
	}

	public static WebElement addSuspendedPayrollEndDate(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollEndDate));
		return element;
	}

	public static WebElement addSuspendedPayrollNotes(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollNotes));
		return element;
	}

	public static WebElement addSuspendedPayrollSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollSaveAndCloseButton));
		return element;
	}

	public static WebElement addSuspendedPayrollCancelButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addSuspendedPayrollCancelButton));
		return element;
	}

	public static WebElement radioButtonRequiredPhysicalSignature(WebDriver driver) {
		element = driver.findElement(By.xpath(radioButtonRequiredPhysicalSignature));
		return element;
	}

	public static WebElement radioButtonRequiredDigitalSignature(WebDriver driver) {
		element = driver.findElement(By.xpath(radioButtonRequiredDigitalSignature));
		return element;
	}

	public static WebElement switchRequiredCheckboxFinalTermsAndCondition(WebDriver driver) {
		element = driver.findElement(By.xpath(switchRequiredCheckboxFinalTermsAndCondition));
		return element;
	}

	public static WebElement enrollmentConfirmationCheckBoxBoldButton(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmentConfirmationCheckBoxBoldButton));
		return element;
	}

	public static WebElement enrollmentConfirmationTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(enrollmentConfirmationTextArea));
		return element;
	}

	public static WebElement switchRequiredNoLossStatement(WebDriver driver) {
		element = driver.findElement(By.xpath(switchRequiredNoLossStatement));
		return element;
	}

	public static WebElement requiredNoLossStatementBoldButton(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStatementBoldButton));
		return element;
	}

	public static WebElement requiredNoLossStatementTextArea(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStatementTextArea));
		return element;
	}

	public static WebElement requiredNoLossStmtCompanyAddressToken(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStmtCompanyAddressToken));
		return element;
	}

	public static WebElement requiredNoLossStmtContractorCompanyToken(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStmtContractorCompanyToken));
		return element;
	}

	public static WebElement requiredNoLossStmtContractorContactNameToken(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStmtContractorContactNameToken));
		return element;
	}

	public static WebElement requiredNoLossStmtContractorDBAToken(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStmtContractorDBAToken));
		return element;
	}

	public static WebElement requiredNoLossStmtContractorFEINToken(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredNoLossStmtContractorFEINToken));
		return element;
	}

	public static WebElement programParameterBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(programParameterBackButton));
		return element;
	}

	public static WebElement programParameterSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(programParameterSaveButton));
		return element;
	}

	public static WebElement programParameterSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(programParameterSaveAndCloseButton));
		return element;
	}

	public static WebElement programParameterSaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(programParameterSaveAndContinueButton));
		return element;
	}

	public static WebElement programParameterCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(programParameterCloseButton));
		return element;
	}

	
	// raja
	
	static String suspendedpayroll_AlertContinueBtn ="//button[@id='btnYes']";
	static String suspendedpayroll_AlertCanceBtn ="//button[@id='btnNo']";
	
	
	public static WebElement suspendedpayroll_AlertContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(suspendedpayroll_AlertContinueBtn));
		return element;
	}
	
	public static WebElement suspendedpayroll_AlertCanceBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(suspendedpayroll_AlertCanceBtn));
		return element;
	}
	
	
	
}
