package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_NonCIP_Compliance_Page 
{
	private static WebElement element;
	private static List<WebElement> listElement;
		
	//input[@placeholder='Search for the Insurance Company']
	//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']/div/div[2]//input[@placeholder='Search for the Insurance Company']
	
	// workers compensation
		static String WorkerCompensastionTabPresent="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]";
		static String GeneralLiabilityTabPresent="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]";
		static String AutomobileLiabilityTabPresent="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]";
		static String Umbrella_ExcessTabPresent="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]";
		static String allPolicyTabPresent="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']/div/div[position()>1]/div/div/div[1]/div//div[starts-with(@class,'heading')]/span";
				//"//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']/div/div[position()>1]/div/div/div[1]//div[@class='heading']/span";
				//"//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']/div/div[position()>1]/div[*]/div[1]//span";
		//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']/div/div[position()>1]/div/div/div/div[position()=1]	
		static String WC_InsuranceCompanyName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@placeholder='Search for the Insurance Company']";
		static String WC_InsuranceCompanyNameRemoveIcon ="//div[@id='divAutomation']/ul/li/span[contains(text(),'×')]";
		static String WC_BrokerName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']";
		static String WC_PolicyNumber = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Policy Number']";
		static String WC_PolicyStartDate ="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Policy Start Date']";
		static String WC_PolicyExpirationDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Policy Expiration Date']";
		//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../..//input[@data-original-title='Broker/Agency Name']
		static String WC_BrokerContactName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Name']";
		static String WC_BrokerContactPhone = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Phone']";
		static String WC_BrokerEmail = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Email']";
		static String WC_RatingBoardNumber = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Rating Board Number']";
		static String WC_ExperianceRatingDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Experience Rating Date']";
		public static WebElement WC_AddFirstLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[1]/td[3]//input"));
			return element;
		}
		public static WebElement WC_AddSecondLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Worker')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[2]/td[3]//input"));
			return element;
		}
		
		// general liability
		static String GL_InsuranceCompanyName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@placeholder='Search for the Insurance Company']";
		static String GL_BrokerName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']";
		static String GL_PolicyNumber = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Policy Number']";
		static String GL_PolicyStartDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Policy Start Date']";
		static String GL_PolicyExpirationDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Policy Expiration Date']";
		static String GL_BrokerContactName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Name']";
		static String GL_BrokerContactPhone = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Phone']";
		static String GL_BrokerEmail = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Email']";
		public static WebElement GL_AddFirstLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[1]/td[3]//input"));
			return element;
		}
		public static WebElement GL_AddSecondLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'General Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[2]/td[3]//input"));
			return element;
		}
		
		
		// umbrell liability
		static String UMB_InsuranceCompanyName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@placeholder='Search for the Insurance Company']";
		static String UMB_BrokerName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']";
		static String UMB_PolicyNumber = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Policy Number']";
		static String UMB_PolicyStartDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Policy Start Date']";
		static String UMB_PolicyExpirationDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Policy Expiration Date']";
		static String UMB_BrokerContactName ="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Name']";
		static String UMB_BrokerContactPhone ="//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Phone']";
		static String UMB_BrokerEmail = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Email']";
		public static WebElement UMB_AddFirstLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[1]/td[3]//input"));
			return element;
		}
		public static WebElement UMB_AddSecondLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Umbrella')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[2]/td[3]//input"));
			return element;
		}
		
		
		
		// automobile liability
		static String AL_InsuranceCompanyName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@placeholder='Search for the Insurance Company']";
		static String AL_BrokerName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']";
		//"//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../div[2]//input[@data-original-title='Broker/Agency Name']";
		static String AL_PolicyNumber = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Policy Number']";
		static String AL_PolicyStartDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Policy Start Date']";
		static String AL_PolicyExpirationDate = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Policy Expiration Date']";
		static String AL_BrokerContactName = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Name']";
		static String AL_BrokerContactPhone = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Contact Phone']";
		static String AL_BrokerEmail = "//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Email']";

		public static WebElement AL_AddFirstLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[1]/td[3]//input"));			return element;
		}

		public static WebElement AL_AddSecondLimitValue(WebDriver driver)
		{
			element=driver.findElement(By.xpath("//div[@id='ctrlTrackComplianceContractor_divRepetarCompliance']//span[contains(text(),'Automobile Liability')]/../../../../../div[2]//input[@data-original-title='Broker/Agency Name']/../../../../../../../..//table/tbody/tr[2]/td[3]//input"));
			return element;
		}
		
		
		
		public static List<WebElement> allPolicyTabPresent(WebDriver driver) {
			listElement = driver.findElements(By.xpath(allPolicyTabPresent));
			return listElement;
		}
		
		public static WebElement WorkerCompensastionTabPresent(WebDriver driver) {
			element = driver.findElement(By.xpath(WorkerCompensastionTabPresent));
			return element;
		}
		public static WebElement GeneralLiabilityTabPresent(WebDriver driver) {
			element = driver.findElement(By.xpath(GeneralLiabilityTabPresent));
			return element;
		}
		public static WebElement AutomobileLiabilityTabPresent(WebDriver driver) {
			element = driver.findElement(By.xpath(AutomobileLiabilityTabPresent));
			return element;
		}
		public static WebElement Umbrella_ExcessTabPresent(WebDriver driver) {
			element = driver.findElement(By.xpath(Umbrella_ExcessTabPresent));
			return element;
		}
		public static WebElement WC_InsuranceCompanyNameRemoveIcon(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_InsuranceCompanyNameRemoveIcon));
			return element;
		}
		public static WebElement WC_InsuranceCompanyName(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_InsuranceCompanyName));
			return element;
		}

		public static WebElement WC_PolicyNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_PolicyNumber));
			return element;
		}

		public static WebElement WC_PolicyStartDate(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_PolicyStartDate));
			return element;
		}

		public static WebElement WC_PolicyExpirationDate(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_PolicyExpirationDate));
			return element;
		}

		public static WebElement WC_BrokerName(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_BrokerName));
			return element;
		}

		public static WebElement WC_BrokerContactName(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_BrokerContactName));
			return element;
		}

		public static WebElement WC_BrokerContactPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_BrokerContactPhone));
			return element;
		}

		public static WebElement WC_BrokerEmail(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_BrokerEmail));
			return element;
		}

		public static WebElement WC_RatingBoardNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_RatingBoardNumber));
			return element;
		}

		public static WebElement WC_ExperianceRatingDate(WebDriver driver) {
			element = driver.findElement(By.xpath(WC_ExperianceRatingDate));
			return element;
		}

		
		public static WebElement GL_InsuranceCompanyName(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_InsuranceCompanyName));
			return element;
		}

		public static WebElement GL_PolicyNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_PolicyNumber));
			return element;
		}

		public static WebElement GL_PolicyStartDate(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_PolicyStartDate));
			return element;
		}

		public static WebElement GL_PolicyExpirationDate(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_PolicyExpirationDate));
			return element;
		}

		public static WebElement GL_BrokerName(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_BrokerName));
			return element;
		}

		public static WebElement GL_BrokerContactName(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_BrokerContactName));
			return element;
		}

		public static WebElement GL_BrokerContactPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_BrokerContactPhone));
			return element;
		}

		public static WebElement GL_BrokerEmail(WebDriver driver) {
			element = driver.findElement(By.xpath(GL_BrokerEmail));
			return element;
		}

		public static WebElement UMB_InsuranceCompanyName(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_InsuranceCompanyName));
			return element;
		}

		public static WebElement UMB_PolicyNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_PolicyNumber));
			return element;
		}

		public static WebElement UMB_PolicyStartDate(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_PolicyStartDate));
			return element;
		}

		public static WebElement UMB_PolicyExpirationDate(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_PolicyExpirationDate));
			return element;
		}

		public static WebElement UMB_BrokerName(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_BrokerName));
			return element;
		}

		public static WebElement UMB_BrokerContactName(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_BrokerContactName));
			return element;
		}

		public static WebElement UMB_BrokerContactPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_BrokerContactPhone));
			return element;
		}

		public static WebElement UMB_BrokerEmail(WebDriver driver) {
			element = driver.findElement(By.xpath(UMB_BrokerEmail));
			return element;
		}

		

		public static WebElement AL_InsuranceCompanyName(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_InsuranceCompanyName));
			return element;
		}

		public static WebElement AL_PolicyNumber(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_PolicyNumber));
			return element;
		}

		public static WebElement AL_PolicyStartDate(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_PolicyStartDate));
			return element;
		}

		public static WebElement AL_PolicyExpirationDate(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_PolicyExpirationDate));
			return element;
		}

		public static WebElement AL_BrokerName(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_BrokerName));
			return element;
		}

		public static WebElement AL_BrokerContactName(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_BrokerContactName));
			return element;
		}

		public static WebElement AL_BrokerContactPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_BrokerContactPhone));
			return element;
		}

		public static WebElement AL_BrokerEmail(WebDriver driver) {
			element = driver.findElement(By.xpath(AL_BrokerEmail));
			return element;
		}
		
		
		
		// for Admin use only xpaths
		static String flagThisPageChechkBox = "//input[@id='ctrlTrackComplianceContractor_chkAction']";
		static String formSignedChechkBox = "//input[@id='ctrlTrackComplianceContractor_chkFormsSigned']";
		static String pendingReviewRadioBtn = "//input[@id='ctrlTrackComplianceContractor_rdoPendingReview']";
		static String markAsConfirmedRadioBtn = "//input[@id='ctrlTrackComplianceContractor_rdoConfirm']";
		static String markAsIncompleteRadioBtn = "//input[@id='ctrlTrackComplianceContractor_rdoMarkasComplete']";
		static String enrollmentDate = "//input[@id='ctrlTrackComplianceContractor_txtEnrollmentDate']";
		static String initialFollowupDate = "//input[@id='ctrlTrackComplianceContractor_txtInitFollowup']";
		static String secondFollowupDate = "//input[@id='ctrlTrackComplianceContractor_txtSecondFollowup']";
		static String thirdFollowupDate = "//input[@id='ctrlTrackComplianceContractor_txtThirdFollowup']";
		static String noticeToProceed = "//input[@id='ctrlTrackComplianceContractor_txtNoticeToProceed']";
		static String notesToAppearOnReportsTextArea = "//textarea[@id='ctrlTrackComplianceContractor_txtReasonForIncomplete']";
		static String actionNotesTextArea = "//textarea[@id='ctrlTrackComplianceContractor_txtActionNotes']";
		
		static String insuranceEnrollmentCreatedDate = "//span[@class='createddate']";
		static String insuranceEnrollmentModifyDate = "//span[@class='modifydate']";
		static String seeMoreModifyByDatesUpArrow = "//i[@class='fa fa-angle-up']";
		static String seeMoreModifyByDatesList = "//div[@id='divModified']/div";// list
		
		// buttons
		static String btnClose = "//button[@class='btn'][contains(text(),'Close')]";
		static String btnSave = "//input[@value='Save']";
		static String btnSaveAndClose = "//input[@id='ctrlTrackComplianceContractor_btnSaveCloseCompliance']";
		static String btnSaveAndContinue = "//input[@id='ctrlTrackComplianceContractor_btnNext']";
		
		static String sendEmailBtnContinueWithoutSending = "//input[@id='btnNext']";
		
		public static WebElement sendEmailBtnContinueWithoutSending(WebDriver driver) {
			element = driver.findElement(By.xpath(sendEmailBtnContinueWithoutSending));
			return element;
		}

		public static WebElement flagThisPageChechkBox(WebDriver driver) {
			element = driver.findElement(By.xpath(flagThisPageChechkBox));
			return element;
		}

		public static WebElement formSignedChechkBox(WebDriver driver) {
			element = driver.findElement(By.xpath(formSignedChechkBox));
			return element;
		}

		public static WebElement pendingReviewRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(pendingReviewRadioBtn));
			return element;
		}

		public static WebElement markAsConfirmedRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(markAsConfirmedRadioBtn));
			return element;
		}

		public static WebElement markAsIncompleteRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(markAsIncompleteRadioBtn));
			return element;
		}

		public static WebElement enrollmentDate(WebDriver driver) {
			element = driver.findElement(By.xpath(enrollmentDate));
			return element;
		}

		public static WebElement initialFollowupDate(WebDriver driver) {
			element = driver.findElement(By.xpath(initialFollowupDate));
			return element;
		}

		public static WebElement secondFollowupDate(WebDriver driver) {
			element = driver.findElement(By.xpath(secondFollowupDate));
			return element;
		}

		public static WebElement thirdFollowupDate(WebDriver driver) {
			element = driver.findElement(By.xpath(thirdFollowupDate));
			return element;
		}

		public static WebElement noticeToProceed(WebDriver driver) {
			element = driver.findElement(By.xpath(noticeToProceed));
			return element;
		}

		public static WebElement notesToAppearOnReportsTextArea(WebDriver driver) {
			element = driver.findElement(By.xpath(notesToAppearOnReportsTextArea));
			return element;
		}

		public static WebElement actionNotesTextArea(WebDriver driver) {
			element = driver.findElement(By.xpath(actionNotesTextArea));
			return element;
		}

		public static WebElement insuranceEnrollmentCreatedDate(WebDriver driver) {
			element = driver.findElement(By.xpath(insuranceEnrollmentCreatedDate));
			return element;
		}

		public static WebElement insuranceEnrollmentModifyDate(WebDriver driver) {
			element = driver.findElement(By.xpath(insuranceEnrollmentModifyDate));
			return element;
		}

		public static WebElement seeMoreModifyByDatesUpArrow(WebDriver driver) {
			element = driver.findElement(By.xpath(seeMoreModifyByDatesUpArrow));
			return element;
		}

		public static List<WebElement> seeMoreModifyByDatesList(WebDriver driver) {
			listElement = driver.findElements(By.xpath(seeMoreModifyByDatesList));
			return listElement;
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
