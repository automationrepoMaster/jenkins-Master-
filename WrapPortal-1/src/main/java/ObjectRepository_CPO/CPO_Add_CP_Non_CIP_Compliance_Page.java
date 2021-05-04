package ObjectRepository_CPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_Add_CP_Non_CIP_Compliance_Page {
	
	
	private static WebElement element;
	
	//kp compliance
	//Automobile Liability
	
	static String InsuranceCompanyName_feild_AL="//input[@id='token-input-txtCarrier791264']";
	static String BrokerAgencyName_AL="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_txtAgentName']";
	static String PolicyNumber_AL ="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_txtPolicyNumber']";
	static String Broker_Agency_ContactName_AL="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_txtAgentContact']";
	static String PolicyStartDate_Feild_AL="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_startdatetimepicker']";
    static String Policy_ExpirationDate_AL="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl00_enddatetimepicker']";
    
    public static WebElement SelectDynamicLiabilityByname(WebDriver driver,String liabilityType) {
    	element = driver.findElement(By.xpath("//div[@class='contractorstep2']//span[contains(text(),'"+ liabilityType  +"')]//..//..//..//..//..//ul/li/input"));
    	return element;
    }
    
    public static WebElement InsuranceCompanyName_feild_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceCompanyName_feild_AL));
		return element;
	}
    public static WebElement BrokerAgencyName_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(BrokerAgencyName_AL));
		return element;
	}
    public static WebElement PolicyNumber_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyNumber_AL));
		return element;
	}
    public static WebElement Broker_Agency_ContactName_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(Broker_Agency_ContactName_AL));
		return element;
	}
    public static WebElement PolicyStartDate_Feild_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyStartDate_Feild_AL));
		return element;
	}
    public static WebElement Policy_ExpirationDate_AL(WebDriver driver) {
		element = driver.findElement(By.xpath(Policy_ExpirationDate_AL));
		return element;
	}
    
    //General Liability
    
    static String InsuranceCompanyName_GL ="//input[@id='token-input-txtCarrier791265']";
    static String policyStartDate_GL ="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl01_startdatetimepicker']";
    static String  PolicyExpiryDate_GL="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl01_enddatetimepicker']";
    
    
    public static WebElement InsuranceCompanyName_GL(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceCompanyName_GL));
		return element;
	}
    
    public static WebElement policyStartDate_GL(WebDriver driver) {
		element = driver.findElement(By.xpath(policyStartDate_GL));
		return element;
	}
    
    public static WebElement PolicyExpiryDate_GL(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDate_GL));
		return element;
	}
    
    //Umbrella / Excess
    
    static String InsuranceCompanyName_Umbrella ="//input[@id='token-input-txtCarrier791266']";
    static String policyStartDate_Umbrella ="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl02_startdatetimepicker']";
    static String  PolicyExpiryDate_Umbrella="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl02_enddatetimepicker']";
    
    public static WebElement InsuranceCompanyName_Umbrella(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceCompanyName_Umbrella));
		return element;
	}
    
    public static WebElement policyStartDate_Umbrella(WebDriver driver) {
		element = driver.findElement(By.xpath(policyStartDate_Umbrella));
		return element;
	}
    
    public static WebElement PolicyExpiryDate_Umbrella(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDate_Umbrella));
		return element;
	}
    
    
   
    
    //worker's compensation
    
    
    static String InsuranceCompanyName_WC ="//input[@id='token-input-txtCarrier791267']";
    static String policyStartDate_WC ="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl03_startdatetimepicker']";
    static String  PolicyExpiryDate_WC="//input[@id='ctrlTrackComplianceContractor_rptComplianceCoverage_ctl03_enddatetimepicker']";
    
    public static WebElement InsuranceCompanyName_WC(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceCompanyName_WC));
		return element;
	}
    
    public static WebElement policyStartDate_WC(WebDriver driver) {
		element = driver.findElement(By.xpath(policyStartDate_WC));
		return element;
	}
    
    public static WebElement PolicyExpiryDate_WC(WebDriver driver) {
		element = driver.findElement(By.xpath(PolicyExpiryDate_WC));
		return element;
	}	
    
    static String saveandContinueBtn ="//button[@class='btn btn-success']";
    static String SaveandCloseBtn ="//input[@id='ctrlTrackComplianceContractor_btnSaveAndClose']";
    static String SaveBtn ="//input[@id='ctrlTrackComplianceContractor_btnSaveCompliance']";
    
    public static WebElement saveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(saveandContinueBtn));
		return element;
	}
    
    public static WebElement SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveandCloseBtn));
		return element;
	}
    
    public static WebElement SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SaveBtn));
		return element;
	}
    
    static String NotesFeild ="//textarea[@id='ctrlTrackComplianceContractor_txtDontMatchNotes']";
    
    public static WebElement NotesFeild(WebDriver driver) {
		element = driver.findElement(By.xpath(NotesFeild));
		return element;
	}	


}
