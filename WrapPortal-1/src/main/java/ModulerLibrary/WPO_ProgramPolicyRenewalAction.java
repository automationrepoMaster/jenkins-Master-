package ModulerLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProgramPage;
import ObjectRepository.AddProgram_Policy_Certificates_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class WPO_ProgramPolicyRenewalAction extends BaseClass {
	public static void testPolicyRenewal(WebDriver driver, String programName) throws InterruptedException {
		WebDriverCommonLib wb = new WebDriverCommonLib();
//Policy Renewal
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuPrograms(driver).click();
		test.log(LogStatus.PASS, "Clicked On Programs Module Icon");
		Thread.sleep(2000);
		ProgramModule.programSearchEditBox(driver).sendKeys(programName);
		test.log(LogStatus.PASS, " Searching for Program "+programName);
		Thread.sleep(2000);
		ProgramModule.programSearchIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Program Search Icon");
		Thread.sleep(7000);
		ProgramModule.programEditIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Program Edit Icon");

		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		wb.windowScrollBy(0, 1000);
	
		AddProgramPage.addProgramMoreTab(driver).click();
		test.log(LogStatus.PASS, "Clicked On Edit Program More Tab");
		Thread.sleep(1000);
		AddProgramPage.addProgramPolicyAndCertificatesTab(driver).click();
		test.log(LogStatus.PASS, "Clicked On Policy and Certifiate Tab");
		wb.waitForElemnet(AddProgram_Policy_Certificates_Page.btnRenewalPolicy(driver));
		test.log(LogStatus.PASS, "Clicked On Policy Renewal Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		try {
			AddProgram_Policy_Certificates_Page.renewalPolicyRadioBtnStartOver(driver).click();
			test.log(LogStatus.PASS, "Select Policy Start Over Redio Button");
			AddProgram_Policy_Certificates_Page.renewalPolicySaveAndContinueBtn(driver).click();
			test.log(LogStatus.PASS, "Clicked Policy Renewal Save And Continue Button");
		} catch (Throwable e) {
			System.out.println("Exception handle" + e);
		}
		AddProgram_Policy_Certificates_Page.selectPolicyTypeToRenew(driver, "General Liability Policy").click();
		test.log(LogStatus.PASS, " Policy Type Selected Successfully for Renewal");
		AddProgram_Policy_Certificates_Page.renewPolicySaveAndContinueButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Renew Policy Save And Continue Button");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.GL_RenewPolicySaveAndContinueButton(driver));
		test.log(LogStatus.PASS, "Clicked On Renew Policy Save And Continue Button");
		AddProgram_Policy_Certificates_Page.selectAllContractorPackageForRenewalCheckBox(driver).click();
		test.log(LogStatus.PASS, "All Contractor Packges Selected Successfully For Renewal");
		Thread.sleep(4000);
		AddProgram_Policy_Certificates_Page.selectContractorPackageRenewalSaveAndContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Renew Policy Save And Continue Button");
		Thread.sleep(5000);
		AddProgram_Policy_Certificates_Page.newPolicyNumberGenerateCertificatesSendEmailBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Generate Certificate and Send Email Button");
		AddProgram_Policy_Certificates_Page.newPolicyNumberGenerateCertificatesSendEmailToTextField(driver)
				.sendKeys("kiran@nourtek.com");
		test.log(LogStatus.PASS, "Email Id Entered into the To Field ");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.newPolicyNumberGenerateCertificatesSendEmailSendBtn(driver));
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Clicked On Email Send Button");
		AddProgram_Policy_Certificates_Page.newPolicyNumberGenerateCertificatesSendEmailSendBtn_OK_Alert(driver)
				.click();
		test.log(LogStatus.PASS, "Clicked On Alert Ok");
		driver.switchTo().window(wb.map.get("childID"));
		AddProgram_Policy_Certificates_Page.policyAndCertificateTabSaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Policy Tab Save and Close Button");
		test.log(LogStatus.PASS, programName + " Program Policy Renewed Successfully");

		driver.switchTo().window(wb.map.get("parentID"));
	}
}