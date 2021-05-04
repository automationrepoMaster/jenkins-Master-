package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Premium_Modification_Page {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String switchGeneralLaibility = "//div[@id='uniform-rptGLUMBPremiumModification_ctl00_chkIsMasterCategoryItemIDEnable']//div[@class='inner']";
	static String GL_factorField = "//input[@id='rptGLUMBPremiumModification_ctl00_txtFactor']";
	static String GL_SelectRateBased = "//select[@id='rptGLUMBPremiumModification_ctl00_ddlRateBased']";// select
	static String GL_SelectRatePer = "//select[@id='rptGLUMBPremiumModification_ctl00_ddlRatePer']";// list
	static String GL_redioBtnApplyCalculationLoadingPage = "//input[@id='rptGLUMBPremiumModification_ctl00_rdbCalculationLoading']";
	static String GL_redioBtnFactorReadOnly = "//input[@id='rptGLUMBPremiumModification_ctl00_rdbIsFactorEditable_0']";
	static String GL_redioBtnAllowToChangeFactor = "//input[@id='rptGLUMBPremiumModification_ctl00_rdbIsFactorEditable_1']";
	static String GL_redioBtnApplyCalculationInputZeroFactor = "//input[@id='rptGLUMBPremiumModification_ctl00_rdbCalculationZero']";

	static String switchUMB = "//div[@id='uniform-rptGLUMBPremiumModification_ctl01_chkIsMasterCategoryItemIDEnable']//div[@class='inner']";
	static String UMB_factorField = "//input[@id='rptGLUMBPremiumModification_ctl01_txtFactor']";
	static String UMB_SelectRateBased = "//select[@id='rptGLUMBPremiumModification_ctl01_ddlRateBased']";// select
	static String UMB_SelectRatePer = "//select[@id='rptGLUMBPremiumModification_ctl01_ddlRatePer']";// select
	static String UMB_redioBtnApplyCalculationLoadingPage = "//input[@id='rptGLUMBPremiumModification_ctl01_rdbCalculationLoading']";
	static String UMB_redioBtnFactorReadOnly = "//input[@id='rptGLUMBPremiumModification_ctl01_rdbIsFactorEditable_0']";
	static String UMB_redioBtnAllowToChangeFactor = "//input[@id='rptGLUMBPremiumModification_ctl01_rdbIsFactorEditable_1']";
	static String UMB_redioBtnApplyCalculationInputZeroFactor = "//input[@id='rptGLUMBPremiumModification_ctl01_rdbCalculationZero']";

	static String switchPollutionCharge = "//div[@id='uniform-chkPollutionCharge']//div[@class='inner']";
	static String Pollution_factorField = "//input[@id='txtPollutionChargefactor']";
	static String Pollution_SelectRateBased = "//select[@id='ddlRateBased']";// list
	static String Pollution_SelectRatePer = "//select[@id='ddlRatePer']";// list

	static String switchGLCodesRequired = "//div[@id='uniform-chkRequiredGLClassCode']//div[@class='inner']";
	static String switchUMBCodesRequired = "//div[@id='uniform-chkRequiredUMBClassCode']//div[@class='inner']";
	static String switchPollutionCodesRequired = "//div[@id='uniform-chkRequiredPollClassCode']//div[@class='inner']";
	static String switchGLDropDown = "//div[@id='uniform-chkPrefieldTextBox']//div[@class='inner']";
	static String switchGLDeductibleSIRLoss = "//div[@id='uniform-chkGLLossCharge']//div[@class='inner']";
	static String switchCaptureWCDeductible = "//div[@id='uniform-chkCaptureWCDeductible']//div[@class='inner']";
	static String switchCaptureGLDeductible = "//div[@id='uniform-chkCaptureGLDeductible']//div[@class='inner']";
	static String switchProfitOverhead = "//div[@id='uniform-chkProfitOverhead']//div[@class='inner']";
	static String radioBtnManualProfitOverhead = "//input[@id='rdoManaulPrfotOverhead']";
	static String radioBtnAutomaticProfitOverhead = "//input[@id='rdoAutomaticPrfotOverhead']";
	static String switchEditableProfitOverhead = "//div[@id='uniform-chkIsEditableProfitOverheadRate']//div[@class='inner']";

	static String fetchWorkerCompensationPremiumModifiRateAllValues = "//table[@class='table blueTable']/tbody/tr[*]/td//input[@type='text']";// list
	static String fetchFirstPremiumModiTypeValue = "//table[@class='table blueTable']/tbody/tr[1]/td[1]";
	static String selectFirstEditableCheckbox = "//table[@class='table blueTable']/tbody/tr[1]/td[2]//input";
	static String fetchFirstFactorValue = "//input[@id='rptPremiumModeProject_ctl00_txtFactor']";
	static String selectFirstDiscountCheckbox = "//table[@class='table blueTable']/tbody/tr[1]/td[4]//input";
	static String selectFirstPayrollCheckbox = "//table[@class='table blueTable']/tbody/tr[1]/td[5]//input";
	static String selectFirstEMRCheckbox = "//table[@class='table blueTable']/tbody/tr[1]/td[6]//input";
	static String selectFirstRunningTotalCheckbox = "//table[@class='table blueTable']/tbody/tr[1]/td[7]//input";
	static String deleteFirstPremiumModifictionType = "//table[@class='table blueTable']/tbody/tr[1]/td[8]/a";

	static String premiumModificationBackButton = "//input[@id='btnBack']";
	static String premiumModificationSaveButton = "//input[@id='btnSave']";
	static String premiumModificationSaveAndCloseButton = "//input[@id='btnSaveandCloseGeneralInformation']";
	static String premiumModificationSaveAndContinueButton = "//input[@id='btnSaveContinue']";
	static String premiumModificationCloseButton = "//button[@id='divClose']";

//	wc premium modification dynamic xpaths 24/07/20
	static String allFactorField="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[3]//input";//list
	static String allDiscountCheckBox="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[4]/div//input";//list
	static String allBasedOnCheckBox="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[5]/div//input";//list
	static String allEMRCheckBox="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[6]//input";//list
	static String allRunningTotalCheckBox="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[7]/div//input";//list
	static String allDeleteTypes="//tbody[contains(@class,'sortable-list ui-sortable')]/tr[contains(@class,'sortable-item')]/td[8]/a[2]";//list
	
	static String clickHereToAddNewPreiumModificationLink="//a[contains(text(),'Click here')]";
	static String addPremiumModificationName="//input[@id='txtTempTypeName']";
	static String addPremiumModificationFactor="//input[@id='txtTempFactor']";
	static String addPM_SelectBasedOnRedioBtn="//td[contains(@class,'td-temp-based-on control-disabled-pointer')]/div/div//input";//list
	static String addPM_SelectDirectRunningTotalRedioBtn="//input[@id='rdoDirectTotal']";
	static String addPM_PlusBtn="//a[@id='btnAdd']//i[contains(@class,'icon i-plus')]";
	
	public static List<WebElement> allFactorField(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allFactorField));
		return listElement;
	}public static List<WebElement> allDiscountCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allDiscountCheckBox));
		return listElement;
	}public static List<WebElement> allBasedOnCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allBasedOnCheckBox));
		return listElement;
	}public static List<WebElement> allEMRCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allEMRCheckBox));
		return listElement;
	}public static List<WebElement> allRunningTotalCheckBox(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allRunningTotalCheckBox));
		return listElement;
	}public static List<WebElement> allDeleteTypes(WebDriver driver) {
		listElement = driver.findElements(By.xpath(allDeleteTypes));
		return listElement;
	}public static WebElement clickHereToAddNewPreiumModificationLink(WebDriver driver) {
		element = driver.findElement(By.xpath(clickHereToAddNewPreiumModificationLink));
		return element;
	}public static WebElement addPremiumModificationName(WebDriver driver) {
		element = driver.findElement(By.xpath(addPremiumModificationName));
		return element;
	}public static WebElement addPremiumModificationFactor(WebDriver driver) {
		element = driver.findElement(By.xpath(addPremiumModificationFactor));
		return element;
	}public static WebElement addPM_SelectBasedOnRedioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPM_SelectBasedOnRedioBtn));
		return element;
	}public static WebElement addPM_SelectDirectRunningTotalRedioBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPM_SelectDirectRunningTotalRedioBtn));
		return element;
	}public static WebElement addPM_PlusBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addPM_PlusBtn));
		return element;
	}
	
	
	
	
	
	public static WebElement GL_SelectRateBased(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_SelectRateBased));
		return element;
	}

	public static WebElement GL_SelectRatePer(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_SelectRatePer));
		return element;
	}

	public static WebElement UMB_SelectRateBased(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_SelectRateBased));
		return element;
	}

	public static WebElement UMB_SelectRatePer(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_SelectRatePer));
		return element;
	}

	public static WebElement Pollution_SelectRateBased(WebDriver driver) {
		element = driver.findElement(By.xpath(Pollution_SelectRateBased));
		return element;
	}

	public static WebElement Pollution_SelectRatePer(WebDriver driver) {
		element = driver.findElement(By.xpath(Pollution_SelectRatePer));
		return element;
	}

	public static List<WebElement> fetchWorkerCompensationPremiumModifiRateAllValues(WebDriver driver) {
		listElement = driver.findElements(By.xpath(fetchWorkerCompensationPremiumModifiRateAllValues));
		return listElement;
	}

	public static WebElement switchGeneralLaibility(WebDriver driver) {
		element = driver.findElement(By.xpath(switchGeneralLaibility));
		return element;
	}

	public static WebElement GL_factorField(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_factorField));
		return element;
	}

	public static WebElement GL_redioBtnApplyCalculationLoadingPage(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_redioBtnApplyCalculationLoadingPage));
		return element;
	}

	public static WebElement GL_redioBtnFactorReadOnly(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_redioBtnFactorReadOnly));
		return element;
	}

	public static WebElement GL_redioBtnAllowToChangeFactor(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_redioBtnAllowToChangeFactor));
		return element;
	}

	public static WebElement GL_redioBtnApplyCalculationInputZeroFactor(WebDriver driver) {
		element = driver.findElement(By.xpath(GL_redioBtnApplyCalculationInputZeroFactor));
		return element;
	}

	public static WebElement switchUMB(WebDriver driver) {
		element = driver.findElement(By.xpath(switchUMB));
		return element;
	}

	public static WebElement UMB_factorField(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_factorField));
		return element;
	}

	public static WebElement UMB_redioBtnApplyCalculationLoadingPage(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_redioBtnApplyCalculationLoadingPage));
		return element;
	}

	public static WebElement UMB_redioBtnFactorReadOnly(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_redioBtnFactorReadOnly));
		return element;
	}

	public static WebElement UMB_redioBtnAllowToChangeFactor(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_redioBtnAllowToChangeFactor));
		return element;
	}

	public static WebElement UMB_redioBtnApplyCalculationInputZeroFactor(WebDriver driver) {
		element = driver.findElement(By.xpath(UMB_redioBtnApplyCalculationInputZeroFactor));
		return element;
	}

	public static WebElement switchPollutionCharge(WebDriver driver) {
		element = driver.findElement(By.xpath(switchPollutionCharge));
		return element;
	}

	public static WebElement Pollution_factorField(WebDriver driver) {
		element = driver.findElement(By.xpath(Pollution_factorField));
		return element;
	}

	public static WebElement switchGLCodesRequired(WebDriver driver) {
		element = driver.findElement(By.xpath(switchGLCodesRequired));
		return element;
	}

	public static WebElement switchUMBCodesRequired(WebDriver driver) {
		element = driver.findElement(By.xpath(switchUMBCodesRequired));
		return element;
	}

	public static WebElement switchPollutionCodesRequired(WebDriver driver) {
		element = driver.findElement(By.xpath(switchPollutionCodesRequired));
		return element;
	}

	public static WebElement switchGLDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath(switchGLDropDown));
		return element;
	}

	public static WebElement switchGLDeductibleSIRLoss(WebDriver driver) {
		element = driver.findElement(By.xpath(switchGLDeductibleSIRLoss));
		return element;
	}

	public static WebElement switchCaptureWCDeductible(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCaptureWCDeductible));
		return element;
	}

	public static WebElement switchCaptureGLDeductible(WebDriver driver) {
		element = driver.findElement(By.xpath(switchCaptureGLDeductible));
		return element;
	}

	public static WebElement switchProfitOverhead(WebDriver driver) {
		element = driver.findElement(By.xpath(switchProfitOverhead));
		return element;
	}

	public static WebElement radioBtnManualProfitOverhead(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnManualProfitOverhead));
		return element;
	}

	public static WebElement radioBtnAutomaticProfitOverhead(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnAutomaticProfitOverhead));
		return element;
	}

	public static WebElement switchEditableProfitOverhead(WebDriver driver) {
		element = driver.findElement(By.xpath(switchEditableProfitOverhead));
		return element;
	}

	public static WebElement fetchFirstPremiumModiTypeValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchFirstPremiumModiTypeValue));
		return element;
	}

	public static WebElement selectFirstEditableCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstEditableCheckbox));
		return element;
	}

	public static WebElement fetchFirstFactorValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchFirstFactorValue));
		return element;
	}

	public static WebElement selectFirstDiscountCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstDiscountCheckbox));
		return element;
	}

	public static WebElement selectFirstPayrollCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstPayrollCheckbox));
		return element;
	}

	public static WebElement selectFirstEMRCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstEMRCheckbox));
		return element;
	}

	public static WebElement selectFirstRunningTotalCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFirstRunningTotalCheckbox));
		return element;
	}

	public static WebElement deleteFirstPremiumModifictionType(WebDriver driver) {
		element = driver.findElement(By.xpath(deleteFirstPremiumModifictionType));
		return element;
	}

	public static WebElement premiumModificationBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(premiumModificationBackButton));
		return element;
	}

	public static WebElement premiumModificationSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(premiumModificationSaveButton));
		return element;
	}

	public static WebElement premiumModificationSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(premiumModificationSaveAndCloseButton));
		return element;
	}

	public static WebElement premiumModificationSaveAndContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(premiumModificationSaveAndContinueButton));
		return element;
	}

	public static WebElement premiumModificationCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(premiumModificationCloseButton));
		return element;
	}

}
