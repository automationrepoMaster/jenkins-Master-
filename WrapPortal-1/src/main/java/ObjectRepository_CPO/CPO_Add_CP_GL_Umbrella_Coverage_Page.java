package ObjectRepository_CPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_GL_Umbrella_Coverage_Page 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;

	//dynamic Xpath accepting a value direct from method
	static String selectTableAndRateBaseForGeneralLiability ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[3]//tbody/tr[8]//td[1]//*[@class='radio']";
	static String selectRatePerGeneralLiability ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[3]//tbody/tr[*]//td[position()=4]/div/div[1]//*[@type='radio']";
	static String GLClassCodeField ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[1]//tbody/tr[*]//td[position()=3]/div[2]//*[@title='Class Code']";
	static String GLDescriptionField ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[1]//tbody/tr[*]//td[position()=3]/div[2]//*[@placeholder='Description']";
	static String enterRateFieldGeneralLiability ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[1]//tbody/tr[*]//td[position()=5]//input[@type='text']";
	static String generalLiabilitySubmitButton ="//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table[3]//tbody/tr[2]/td/div[1]/input[@type='submit']";
	static String addAdditionalGLBtn="//a[@class='blue-border-btn marg-left-10 a-add-additional-gl']";
	
	static String selectTableAndRateBaseForUmbrellaLiability ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[1]//tbody/tr[*]//td[1]//*[@class='radio']";
	static String selectRatePerUmbrellaLiability ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[1]//tbody/tr[*]//td[position()=4]/div/div[4]//*[@type='radio']";
	static String umbrellaLiabilitySubmitButton ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[3]//tbody/tr[2]";
	static String UMBClassCodeField ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[1]//tbody/tr[*]//td[position()=3]/div[2]//*[@title='Class Code']";
	static String UMBDescriptionField ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[1]//tbody/tr[*]//td[position()=3]/div[2]//*[@placeholder='Description']";
	static String enterRateFieldUMB ="//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table[1]//tbody/tr[*]//td[position()=5]//input[@type='text']";
	static String addAdditionalUMBBtn="//a[@class='blue-border-btn a-add-additional-umbrella']";

	// Add GL xpath
	
	static String fetchAmountValue = "//div[@class='div-additional-gl overflowHide']//input[@class='form-control tip textenabled txt-amount']";

	static String LiabilityPremiumCost_GL_UMB = "//input[@class='form-control textenabled flftnone tip txt-liability-premium-cost date-process-done']";
	static String TotalPremiumCostWC_GL_UMB = "//input[@class='form-control textenabled flftnone tip txt-total-premium-cost']";
	static String ProfitAndOverHeadPercentage = "//input[@class='form-control textenabled flftnone tip flft specialCharNotAllowed isonlynumber txt-profit-overhead-rate date-process-done']";
	static String ProfitAndOverHeadAmount = "//input[@class='form-control textenabled flftnone tip txt-profit-overhead-amount']";
	static String costForInsurance_WC = "//input[@class='form-control textenabled flftnone txt-cost-for-insurance']";
	static String removeEstimatedInsuranceCostOverride = "//a[@class='remove-override']";
	static String subEnteredInsuranceCost = "//input[@class='form-control textenabled flftnone txt-verified-deduct']";
	static String estimatedInsuranceCostOverride = "//input[@class='form-control textenabled flftnone txt-accepted-deduct']";
	
	// buttons
	static String btnClose = "//input[@class='btn btn-close-window']";
	static String btnSave = "//div[@class='fright']//input[1]";
	static String btnSaveAndClose = "//div[@class='col-md-12 smallDevice clearfix']//input[2]";
	static String btnSaveAndContinue = "//input[@class='btn btn-success btn-save']";

	
	public static WebElement selectTableAndRateBaseForGeneralLiability(WebDriver driver, int GLNo, int radioBtnNoforRateBaseOn) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr["+radioBtnNoforRateBaseOn+"]//td[1]//*[@class='radio']"));
		return element;
	}
	
	public static WebElement selectTableAndRateBaseForumbrellaLiability(WebDriver driver, int UMBNO,int radioBtnNoforRateBaseOn ) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNO+"]//tbody/tr[*]//td["+radioBtnNoforRateBaseOn+"]//*[@class='radio']"));
		return element;
	}
	
	public static WebElement selectRatePerGeneralLiability(WebDriver driver, int GLNo,int selectRatePerBtn) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr[*]//td[position()=4]/div/div["+selectRatePerBtn+"]//*[@type='radio']"));
		return element;
	}
	public static WebElement selectRatePerUmbrellaLiability(WebDriver driver, int UMBNO,int selectRatePerBtn) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNO+"]//tbody/tr[*]//td[position()=4]/div/div["+selectRatePerBtn+"]//*[@type='radio']"));
		return element;
	}
	
	public static WebElement umbrellaLiabilitySubmitButton(WebDriver driver, int UMBNO) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNO+"]//tbody/tr[2]/td/div[1]/input[@type='submit']"));
		return element;
	}
	
	public static WebElement generalLiabilitySubmitButton(WebDriver driver, int GLNo) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr[2]/td/div[1]/input[@type='submit']"));
		return element;
	}
	
	public static WebElement enterRateFieldGeneralLiability(WebDriver driver, int GLNo) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr[*]//td[position()=5]//input[@type='text']"));
		return element;
	}
	public static WebElement GLClassCodeField(WebDriver driver, int GLNo) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr[*]//td[position()=3]/div[2]//*[@title='Class Code']"));
		return element;
	}
	public static WebElement GLDescriptionField(WebDriver driver, int GLNo) {
		element = driver.findElement(By.xpath("//div[@id='ctrlGLUmbrella_divAddSecondaryGL']/div/table["+GLNo+"]//tbody/tr[*]//td[position()=3]/div[2]//*[@placeholder='Description']"));
		return element;
	}
	public static WebElement UMBClassCodeField(WebDriver driver, int UMBNo) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNo+"]//tbody/tr[*]//td[position()=3]/div[2]//*[@title='Class Code']"));
		return element;
	}
	public static WebElement UMBDescriptionField(WebDriver driver, int UMBNo) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNo+"]//tbody/tr[*]//td[position()=3]/div[2]//*[@placeholder='Description']"));
		return element;
	}
	
	public static WebElement enterRateFieldUMB(WebDriver driver, int UMBNo) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Umbrella Liability')]/../div[2]/div[1]/table["+UMBNo+"]//tbody/tr[*]//td[position()=5]//input[@type='text']"));
		return element;
	}
	

	public static WebElement fetchAmountValue(WebDriver driver) {
		element = driver.findElement(By.xpath(fetchAmountValue));
		return element;
	}

	public static WebElement LiabilityPremiumCost_GL_UMB(WebDriver driver) {
		element = driver.findElement(By.xpath(LiabilityPremiumCost_GL_UMB));
		return element;
	}

	public static WebElement TotalPremiumCostWC_GL_UMB(WebDriver driver) {
		element = driver.findElement(By.xpath(TotalPremiumCostWC_GL_UMB));
		return element;
	}

	public static WebElement ProfitAndOverHeadPercentage(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfitAndOverHeadPercentage));
		return element;
	}

	public static WebElement ProfitAndOverHeadAmount(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfitAndOverHeadAmount));
		return element;
	}

	public static WebElement costForInsurance_WC(WebDriver driver) {
		element = driver.findElement(By.xpath(costForInsurance_WC));
		return element;
	}

	public static WebElement removeEstimatedInsuranceCostOverride(WebDriver driver) {
		element = driver.findElement(By.xpath(removeEstimatedInsuranceCostOverride));
		return element;
	}

	public static WebElement subEnteredInsuranceCost(WebDriver driver) {
		element = driver.findElement(By.xpath(subEnteredInsuranceCost));
		return element;
	}

	public static WebElement estimatedInsuranceCostOverride(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedInsuranceCostOverride));
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
	public static WebElement addAdditionalGLBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdditionalGLBtn));
		return element;
	}
	public static WebElement addAdditionalUMBBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(addAdditionalUMBBtn));
		return element;
	}
}

/*static String radioBtnPayroll = "//span[@class='checked']//input[@name='rbRateBasedOn-1']";
static String checkBoxEstimatedPayrollBtn = "//span[@class='checked']//input[@name='rbPayrollSub-1']";
static String checkBoxFirstClassCode = "//div[@class='pull-left']//div[@class='checker']//input[@name='rbPayrollSub-1']";
static String checkBoxFirstClassCodeEnterValue = "//input[@class='txt-amount-entered-by-user']";
static String radioBtnContractValue = "//div[@class='radio hover']//input[@name='rbRateBasedOn-1']";
static String radioBtnSelfPerformedPrice = "//div[@class='div-additional-gl overflowHide']//table[@class='div-rate-based-on']//tr[3]//input[@type='radio']";
static String radioBtnWorkersCompensationPremium = "//div[@class='radio hover']//input[@name='rbRateBasedOn-1']";
static String radioBtnFlatPremium = "//div[@class='radio hover']//input[@name='rbRateBasedOn-1']";
static String radioBtnPerUnit = "//span[@class='checked']//input[@name='rbRateBasedOn-1']";
static String radioBtnPerUnitTextBox = "//td[@class='div-per-unit-input pull-right']//input[@class='form-control marg-left-5 txt-per-unit']";
static String radioBtnOther = "//div[@class='radio hover']//input[@name='rbRateBasedOn-1']";
static String radioBtnOtherDescription = "//td[@class='div-other-input']//input[@placeholder='Description']";
static String radioBtnOtherValue = "//td[@class='div-other-input']//input[@class='form-control marg-left-5 txt-other']";
static String enterClassCode = "//div[@class='div-additional-gl overflowHide']//table[@class='table blueTable table-Border no-Even marg-top-10']//tbody//tr//td[@class='table-Border-left']//div//input[@placeholder='Class Code']";
static String enterClassCodeDescription = "//div[@class='div-additional-gl overflowHide']//table[@class='table blueTable table-Border no-Even marg-top-10']//tbody//tr//td[@class='table-Border-left']//div//input[@placeholder='Description']";
static String ratePer = "//div[@class='div-additional-gl overflowHide']//table[@class='table blueTable table-Border no-Even marg-top-10']/tbody/tr[1]/td[4]//input[@type='radio']";// list
static String rate = "//div[@class='div-additional-gl overflowHide']//input[@class='form-control tip required txt-rate']";
*/

/*public static WebElement radioBtnPayroll(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnPayroll));
	return element;
}

public static WebElement checkBoxEstimatedPayrollBtn(WebDriver driver) {
	element = driver.findElement(By.xpath(checkBoxEstimatedPayrollBtn));
	return element;
}

public static WebElement checkBoxFirstClassCode(WebDriver driver) {
	element = driver.findElement(By.xpath(checkBoxFirstClassCode));
	return element;
}

public static WebElement checkBoxFirstClassCodeEnterValue(WebDriver driver) {
	element = driver.findElement(By.xpath(checkBoxFirstClassCodeEnterValue));
	return element;
}

public static WebElement radioBtnContractValue(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnContractValue));
	return element;
}

public static WebElement radioBtnSelfPerformedPrice(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnSelfPerformedPrice));
	return element;
}

public static WebElement radioBtnWorkersCompensationPremium(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnWorkersCompensationPremium));
	return element;
}

public static WebElement radioBtnFlatPremium(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnFlatPremium));
	return element;
}

public static WebElement radioBtnPerUnit(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnPerUnit));
	return element;
}

public static WebElement radioBtnPerUnitTextBox(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnPerUnitTextBox));
	return element;
}

public static WebElement radioBtnOther(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnOther));
	return element;
}

public static WebElement radioBtnOtherDescription(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnOtherDescription));
	return element;
}

public static WebElement radioBtnOtherValue(WebDriver driver) {
	element = driver.findElement(By.xpath(radioBtnOtherValue));
	return element;
}

public static WebElement enterClassCode(WebDriver driver) {
	element = driver.findElement(By.xpath(enterClassCode));
	return element;
}

public static WebElement enterClassCodeDescription(WebDriver driver) {
	element = driver.findElement(By.xpath(enterClassCodeDescription));
	return element;
}

public static WebElement ratePer(WebDriver driver) {
	element = driver.findElement(By.xpath(ratePer));
	return element;
}

public static WebElement rate(WebDriver driver) {
	element = driver.findElement(By.xpath(rate));
	return element;
}
*/

