package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddProgramPage;


public class ProgrammeValidationsTest extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	String ProgramAdministrator = "Thanos Contac - Thanos_F- L-N";
	String ProgrammeSponsor = "Thanos Pvt Ltd - Thanos  FN-LN";
	String ProgrammeType = "OCIP ";
	String ProgramName = "THANOS PG Name";
	String NonCIPComplianceName = "Thanos Non-CIP";
	String ProgramNameActualErrText = "This field is required.";
	String ProgramNameAlertMsg = "Program Name must be entered.";
	String ProgramAdminActualErrText = "Project Administrator Required";
	String ProgramAdmninAlertActmsg = "Program  Administrator must be selected. ";
	String ProgramSponsorActualErrMsg = "Sponsor Required ";
	String ProgramSponsorAlertActmsg = "Sponsor  must be selected. ";
	String SelectStatus = "Active";
	String PolicyTpe = "WC and GL";
	String DBATextAlertActMsg = "DBA Text must be enter.";
	String TrackCappedUnCappedPayrollSwitchAlertActMsg = "Warning! Turning off this switch will cause all WC calculations to utilize the Uncapped Payroll values. This will also turn off all Capped/Uncapped switches at the Project level. Are you sure you want to proceed?";
	String NonCIPComplianceNameActErrMsg = "Required";
	String NonCIPComplianceNameActAlertMsg = "Please Enter Compliance Name.";
	String NonCIPUpdateAlertActmsg = "Non-CIP Compliance Updated Successfully";
	String premiumModifcationGenLiablityActAlertMsg = "General Liability Factor must be greater than Zero";
	String premiumModifcationUMBActAlertMsg = "Umbrella Factor must be greater than Zero.";
	String premiumModifcationPollutionChargectAlertMsg = "Pollution Charge Factor must be greater than Zero.";
	String GLiablitySelectCarrierName = "Carrier Name-1234";
	String GLiabilityPolicyEffectiveDate = "01/01/2020";
	String GLiabilityPolicyExpiryeDate = "01/01/2025";
	String CarrierNameErrMsg = "Please select carrier";
	String ExpiryActErrMsgonEffectiveMsg = "Policy Expiration Date must be greater than Policy Effective Date.";
	String MoreBtnNonCIP = "Non-CIP Compliance";
	String MoreBtnPremiumModificcations = "Premium Modification";
	String MoreBtnPolicycertificates = "Policy & Certificates";
	String MoreBtnClaims = "Claims";
	String MoreBtnCustomForms = "Custom Forms";
	String MoreBtnBenchMark = "Benchmark";
	String MoreBtnCustomFeilds = "Custom Fields";

	@Test
	public void programValidations() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		AddProgramPage.ProgrammeICon(driver).click();
		test.log(LogStatus.PASS, "Program Icon button is clicked ");
		AddProgramPage.AdvancesearchbarIcon(driver).click();
		test.log(LogStatus.PASS, "Advacne search button is clicked ");
		Thread.sleep(2000);
		wb.selectByVisibleText(ProgramAdministrator, AddProgramPage.AdvsearchSelectProgramAdmin(driver));
		test.log(LogStatus.PASS, ProgramAdministrator + "is Selected ");
		Thread.sleep(2000);
		wb.selectByVisibleText(PolicyTpe, AddProgramPage.AdvsearchSelectPolicyType(driver));
		test.log(LogStatus.PASS, PolicyTpe + "is Selected ");
		Thread.sleep(2000);
		wb.selectByVisibleText(ProgrammeSponsor, AddProgramPage.AdvsearchSelectProgramSponsor(driver));
		test.log(LogStatus.PASS, ProgrammeSponsor + "is Selected ");
		Thread.sleep(2000);
		wb.selectByVisibleText(ProgrammeType, AddProgramPage.AdvsearchSelectProgramType(driver));
		test.log(LogStatus.PASS, ProgrammeType + "is Selected ");
		Thread.sleep(2000);
		wb.scrollToEndt();
		Thread.sleep(2000);
		AddProgramPage.AdvsearchsearchBtn(driver).click();
		test.log(LogStatus.PASS, "Advance Search button is Clicked ");
		Thread.sleep(2000);
		wb.scrollToTop();
		AddProgramPage.EditBtnProgrammeICON(driver).click();
		test.log(LogStatus.PASS, "Edit  button is Clicked ");
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		AddProgramPage.programmeNamefeild(driver).click();
		AddProgramPage.programmeNamefeild(driver).clear();
		test.log(LogStatus.PASS, "Program name feild  is cleared ");
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.ProgrammeNameErrormsg(driver), ProgramNameActualErrText);
		Thread.sleep(2000);
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_GI(driver));
		AddProgramPage.SaveandContinueBtn_GI(driver).click();
		test.log(LogStatus.PASS, "save and continue button is Clicked at GI page ");
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.AlertMsgCloseBtn(driver), ProgramNameAlertMsg);
		wb.Alert_Click(AddProgramPage.AlertCloseBtn(driver));
		Thread.sleep(2000);
		wb.scrollToTop();
		Thread.sleep(2000);
		AddProgramPage.programmeNamefeild(driver).sendKeys(ProgramName);
		test.log(LogStatus.PASS, "ProgramName is entered again  at GI page ");
		Thread.sleep(2000);
		wb.selectByIndex(AddProgramPage.ProgrammeAdministartrfeildGIPage(driver), 0);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.ErrorMsg_ProgAdminFeild_GI(driver), ProgramAdminActualErrText);
		test.log(LogStatus.PASS, "Error message is validated and Comapred at Program Admin");
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_GI(driver));
		AddProgramPage.SaveandContinueBtn_GI(driver).click();
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.AlertMsgCloseBtn(driver), ProgramAdmninAlertActmsg);
		test.log(LogStatus.PASS, "Error message is validated and Comapred at program Alert ");
		wb.Alert_Click(AddProgramPage.AlertCloseBtn(driver));
		Thread.sleep(2000);
		wb.scrollToTop();
		Thread.sleep(2000);
		wb.selectByVisibleText(ProgramAdministrator,
				AddProgramPage.ProgrammeAdministartrfeildGIPage(driver));
		Thread.sleep(2000);
		wb.selectByIndex(AddProgramPage.ProgramSponsofeildGIPage(driver), 0);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.ErrorMsg_ProgramponsorFeild_GI(driver), ProgramSponsorActualErrMsg);
		test.log(LogStatus.PASS, "Error message is validated and Comapred at Sponsor dropdown ");
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_GI(driver));
		AddProgramPage.SaveandContinueBtn_GI(driver).click();
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.AlertMsgCloseBtn(driver), ProgramSponsorAlertActmsg);
		test.log(LogStatus.PASS, "Error message is validated and Comapred at sponsor alert");
		wb.Alert_Click(AddProgramPage.AlertCloseBtn(driver));
		Thread.sleep(2000);
		wb.scrollToTop();
		Thread.sleep(2000);
		wb.selectByVisibleText(ProgrammeSponsor, AddProgramPage.ProgramSponsofeildGIPage(driver));
		wb.scrollByVisibilityOfElement( AddProgramPage.ProgramDBASwitchGIPage(driver));
		wb.TurnONSwitch(AddProgramPage.ProgramDBASwitchGIPage(driver));
		Thread.sleep(2000);
		AddProgramPage.ProgramDBASwitchtextSeperatorGIPage(driver).click();
		AddProgramPage.ProgramDBASwitchtextSeperatorGIPage(driver).clear();
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.ProgrammeNameErrormsg(driver), ProgramNameActualErrText);
		test.log(LogStatus.PASS, "Error message is validated and Comapred at DBA switch");
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_GI(driver));
		AddProgramPage.SaveandContinueBtn_GI(driver).click();
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.AlertMsgCloseBtn(driver), DBATextAlertActMsg);
		wb.Alert_Click(AddProgramPage.AlertCloseBtn(driver));
		Thread.sleep(2000);
		AddProgramPage.ProgramDBASwitchtextSeperatorGIPage(driver).sendKeys("DBA");
		test.log(LogStatus.PASS, "Error message is validated and Comapred at DBA Seperartor text is enetrerd");
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_GI(driver));
		AddProgramPage.SaveandContinueBtn_GI(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked after DBA  Seperator text validation");
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_ProgParameters(driver));
		AddProgramPage.SaveandContinueBtn_ProgParameters(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked at Program parameters page ");
		Thread.sleep(4000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_EmailMangament(driver));
		AddProgramPage.SaveandContinueBtn_EmailMangament(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked at Email Management page ");
		Thread.sleep(4000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_ContrcatorportalPage(driver));
		AddProgramPage.SaveandContinueBtn_ContrcatorportalPage(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked at Contractor portal  page ");
		Thread.sleep(4000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.saveandContinueBtn_UserAccess(driver));
		AddProgramPage.saveandContinueBtn_UserAccess(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked at User Access  page ");
		Thread.sleep(4000);
		wb.TurnOFFSwitch(AddProgramPage.TrackCappedUncappedpayrollSwitch(driver));
		wb.Compare(AddProgramPage.TrackCappedUncappedpayrollSwitchAlertMsg(driver),
				TrackCappedUnCappedPayrollSwitchAlertActMsg);
		Thread.sleep(2000);
		wb.Alert_Click(AddProgramPage.TrackCappedUncappedpayrollSwitchAlertYESBtn(driver));
		Thread.sleep(2000);
		wb.TurnONSwitch(AddProgramPage.TrackCappedUncappedpayrollSwitch(driver));
		test.log(LogStatus.PASS, "Track Capped payroll and CV swith is clicked at Payroll page ");
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_PayrollandCV_page(driver));
		AddProgramPage.SaveandContinueBtn_PayrollandCV_page(driver).click();
		test.log(LogStatus.PASS, "Save and continue button at GI page is clicked at Payroll and CV  page ");
		Thread.sleep(4000);
		wb.scrollToTop();
		Thread.sleep(2000);
		AddProgramPage.EditBtn_nonCIP_Compliance_Page(driver).click();
		wb.SwitchtoChild2();
		AddProgramPage.NonCIPComplianceName_Feild(driver).click();
		AddProgramPage.NonCIPComplianceName_Feild(driver).clear();
		wb.Compare(AddProgramPage.NonCIPComplianceNameErrMsg(driver), NonCIPComplianceNameActErrMsg);
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandcloseBtn_NonCIP_name_feild(driver));
		AddProgramPage.SaveandcloseBtn_NonCIP_name_feild(driver).click();
		test.log(LogStatus.PASS, "Save and close button at GI page is clicked at Non cip compliance edit   page ");
		Thread.sleep(4000);
		wb.Compare(AddProgramPage.NonCIPComplianceEditpageAlertMsg(driver),
				NonCIPComplianceNameActAlertMsg);
		wb.Alert_Click(AddProgramPage.NonCIPComplianceNameAlertMsgOKBtn(driver));
		wb.scrollToTop();
		Thread.sleep(2000);
		AddProgramPage.NonCIPComplianceName_Feild(driver).sendKeys(NonCIPComplianceName);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandcloseBtn_NonCIP_name_feild(driver));
		AddProgramPage.SaveandcloseBtn_NonCIP_name_feild(driver).click();
		test.log(LogStatus.PASS,
				"Save and close button at GI page is clicked at Non cip compliance edit page  after entering nonCIp name again");
		Thread.sleep(4000);
		wb.Compare(AddProgramPage.NonCIPUdateAlertMsg(driver), NonCIPUpdateAlertActmsg);
		wb.Alert_Click(AddProgramPage.NonCIPUpdatAlertOKBtn(driver));
		test.log(LogStatus.PASS,
				" Non cip compliance edit page update alert Ok button clicked   after entering nonCIp name again");
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueButton_Non_CIP_compliancePage(driver));
		AddProgramPage.SaveandContinueButton_Non_CIP_compliancePage(driver).click();
		test.log(LogStatus.PASS,
				"Save and close button  at Non cip compliance   after entering nonCIp name again and validating the Text");
		Thread.sleep(5000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.SaveandContinueBtn_PremiumModfications(driver));
		AddProgramPage.SaveandContinueBtn_PremiumModfications(driver).click();
		test.log(LogStatus.PASS,
				"Save and close button  at Premium Modifications   page is clicked after clearing the Genernal libality ");
		Thread.sleep(2000);
		wb.scrollToTop();
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesGenLiabilityOpenPolicyBtn(driver));
		AddProgramPage.PolicyCertificatesGenLiabilityOpenPolicyBtn(driver).click();
		System.out.println("Open policy is clicked at GL policy");
		Thread.sleep(2000);
		wb.SwitchtoChild2();
		Thread.sleep(2000);
		wb.scrollToTop();
		wb.selectByIndex(AddProgramPage.PolicyCertificatesGLiablitySelectCarrier(driver), 0);
		wb.Compare(AddProgramPage.PolicyCertificatesGLSelectCarrierErrMsg(driver), CarrierNameErrMsg);
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesGLiabilitySaveandCloseBtn(driver));
		AddProgramPage.PolicyCertificatesGLiabilitySaveandCloseBtn(driver).click();
		test.log(LogStatus.PASS,
				"Save and close button  at Premium Modifications page is clicked after De selecting Carrier  ");
		Thread.sleep(2000);
		try {
			wb.Alert();
		} catch (Throwable e) {
			Thread.sleep(2000);
			System.out.println("We are at Catch block as no handle present");
		}
		wb.scrollToTop();
		wb.selectByVisibleText(GLiablitySelectCarrierName,
				AddProgramPage.PolicyCertificatesGLiablitySelectCarrier(driver));
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement(
				AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver));
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).click();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).clear();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDateErrMsg(driver),
				ProgramNameActualErrText);
		wb.Compare(AddProgramPage.PolicyCertifcatesGLLiablityPolicyExpiryDateErrMsgonEffectiveDate(driver),
				ExpiryActErrMsgonEffectiveMsg);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).click();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver)
				.sendKeys(GLiabilityPolicyEffectiveDate);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).click();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).clear();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver),
				ProgramNameActualErrText);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).click();
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).sendKeys(GLiabilityPolicyExpiryeDate);
		AddProgramPage.PolicyCertificatesGLiabilityPolicyExpiryDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesGLiabilitySaveandCloseBtn(driver));
		AddProgramPage.PolicyCertificatesGLiabilitySaveandCloseBtn(driver).click();
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesWCOpenPolicyBtn(driver));
		AddProgramPage.PolicyCertificatesWCOpenPolicyBtn(driver).click();
		Thread.sleep(2000);
		wb.SwitchtoChild2();
		Thread.sleep(2000);
		wb.scrollToTop();
		wb.selectByIndex(AddProgramPage.PolicyCertificatesWCSelectCarrier(driver), 0);
		wb.Compare(AddProgramPage.PolicyCertificatesWCPolicyCarrierErrMsg(driver), CarrierNameErrMsg);
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesWCPolicySaveandCloseBtn(driver));
		AddProgramPage.PolicyCertificatesWCPolicySaveandCloseBtn(driver).click();
		test.log(LogStatus.PASS,
				"Save and close button  at Wc Premium Modifications   page is clicked after De selecting Carrier  ");
		Thread.sleep(2000);
		try {
			wb.Alert();
		} catch (Exception e) {
			Thread.sleep(2000);
			System.out.println("We are at Catch block as no handle present");
		}
		wb.scrollToTop();
		wb.selectByVisibleText(GLiablitySelectCarrierName,
				AddProgramPage.PolicyCertificatesWCSelectCarrier(driver));
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement(AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver));
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).click();
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).clear();
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.PolicyCertificatesWCPolicyEffectiveDateErrmsg(driver),
				ProgramNameActualErrText);
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).click();
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).sendKeys(GLiabilityPolicyEffectiveDate);
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		AddProgramPage.PolicyCertificatesWCPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).click();
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).clear();
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.Compare(AddProgramPage.PolicyCertificatesWCPolicyExpiryDateErrMsg(driver),
				ProgramNameActualErrText);
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).click();
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).sendKeys(GLiabilityPolicyExpiryeDate);
		AddProgramPage.PolicyCertificatesWCPolicyExpiryDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyCertificatesWCPolicySaveandCloseBtn(driver));
		AddProgramPage.PolicyCertificatesWCPolicySaveandCloseBtn(driver).click();
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.scrollByVisibilityOfElement( AddProgramPage.PolicyandCertificatessavenadContinueBtn(driver));
		AddProgramPage.PolicyandCertificatessavenadContinueBtn(driver).click();
		System.out.println("Policy certifcates save and close button is clicked succesfully");
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.FixedratesSaveandContinueBtn(driver));
		AddProgramPage.FixedratesSaveandContinueBtn(driver).click();
		Thread.sleep(2000);
		wb.scrollToEndt();
		wb.scrollByVisibilityOfElement( AddProgramPage.ClaimsModule_saveandCloseBtn(driver));
		AddProgramPage.ClaimsModule_saveandCloseBtn(driver).click();
		Thread.sleep(2000);
		wb.Switchtoparent();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "programValidations")));

	}

}
