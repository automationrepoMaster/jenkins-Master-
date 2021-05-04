package TestScript;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddContractor_Pkg__Claim_Page;
import ObjectRepository.ClaimPage_NewFunctionality;
import ObjectRepository.HomePage;

public class Add_Claim extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	GenericLibrary.ExcelLibraray_Hashmap excel = new GenericLibrary.ExcelLibraray_Hashmap();
	String sheetname = "wb2";
	// RandomClass ra = new RandomClass();

	String Program = "Automation Program dont touch";
	String Project = "Test Project 10";
	String EnrollmenType = "WC & GL Enrollment";
	String contractor = "Alex comp2273";
	String Status = "Missing Payroll";
	String Locationcode = "RREG-AXBXYZ-123";
	String ClassCodeDescription = RandomClass.randomClassCodeDescription(); // "Class Code Description";
	String ClassCodeNumbe = "1122";
	String alphaurl = "https://alpha.wrapportal.com/Login.aspx"; // https://alpha.wrapportal.com/login
	String uername = "nourTest";
	String password = "NOUR5uccess#1";
	String ClaimType_GL = "General Liability";
	String ClaimReportedDate = "01/11/2020";
	String Reportedtime = "400";
	String lossdate = "01/09/2019"; // Loss date must be date before Reported date
	String Losstime = "1500";
	String ClientSpecificClasscode = "7412 - Test GL Claim";
	String ClaimantLossTypeCode = "Injury";
	String claimNumber = "ClaimNumber-1234";
	String ClaimDescription = "This is heights of emotion";
	String MedicalAttentionProvided = "Hospitalized > 24 Hours";
	String OccuredonCompanyPremises = "P(on Premises)";
	String providerTypecode = "Hospital";
	String providerFirstName = RandomClass.randomName();
	String providerLastName = RandomClass.randomName();
	String providerOrganizationname = RandomClass.randomContractorCompanyName();
	String InjuryEventcode = "Flammable fabrics";
	String InjuryExtentcode = "Amputation/loss of body part";
	String AccidentAddressline = RandomClass.randomSponsorName();
	String AccidentAddressCityName = "Texas";
	String AccidentAddressCountry = "United States (USA)";
	String AccidentAddressState = "Texas (TX)";
	String AccidentAddressPostcode = "22222-2222";
	String cause = RandomClass.randomClassCodeDescription();
	String ActionNotes = RandomClass.randomClassCodeDescription(); // "This is heights of emotion";
	String CompanyName = RandomClass.randomContractorCompanyName(); // "Aristotle the great";
	String ContactFirstName = RandomClass.randomCarrierName(); // "Raja";
	String ContactLastName = RandomClass.randomContractorCompanyName(); // "Reddy";
	String PhoneNumber = "12341234123412";
	String Email = "raja.reddy@nourtek.com";
	String FinancialData = "1000";
	String OtherinfoPreparedByFirstName = RandomClass.randomDivisionName(); // "Thalaiva";
	String OtherinfoPreparedByLastName = RandomClass.randomProgramName(); // "Victory";

	@Test
	public void AddGLClaim() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "contractor Packages Icon is clicked");
		Thread.sleep(5000);
		// js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2500);
		/*
		 * js.executeScript("arguments[0].scrollIntoView();",
		 * AddContractor_Pkg_Page.plusBtn(driver)); test.log(LogStatus.PASS,
		 * "Add butto is scrolled into"); js.executeScript("arguments[0].click();",
		 * AddContractor_Pkg_Page.plusBtn(driver));
		 * //AddContractor_Pkg__Claim_Page.ClaimModule_AddBtn(driver).click();
		 * test.log(LogStatus.PASS, "Add butto is clicked");
		 */
		Thread.sleep(5000);

		// Adavcne search
		js.executeScript("arguments[0].scrollIntoView();", AddContractor_Pkg_Page.Adv_search_Btn(driver));
		js.executeScript("arguments[0].click();", AddContractor_Pkg_Page.Adv_search_Btn(driver));

		// AddContractor_Pkg_Page.Adv_search_Btn(driver).click();
		test.log(LogStatus.PASS, "Advance search button is clicked");
		Thread.sleep(1500);
		wb.selectByVisibleText(Program, AddContractor_Pkg_Page.AdvSearchSelectprogramme(driver));
		wb.selectByVisibleText(Project, AddContractor_Pkg_Page.AdvSearchSelectproject(driver));
		wb.selectByVisibleText(EnrollmenType, AddContractor_Pkg_Page.AdvSearchSelectEnrollment(driver));
		AddContractor_Pkg_Page.AdvsearchSelectcontractstatusDropdown(driver).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",
				AddContractor_Pkg_Page.AdvsearchSelectCheckboxBystatus(driver, Status));
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Page.AdvsearchSelectCheckboxBystatus(driver, Status));
		Thread.sleep(2000);
		AddContractor_Pkg_Page.AdvSearch_SearchBtn_down(driver).click();
		Thread.sleep(7000);
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number " + f.size());
		driver.switchTo().frame(AddContractor_Pkg__Claim_Page.Claim_frame(driver));
		AddContractor_Pkg__Claim_Page.Claims_Link(driver).click();
		wb.SwitchtoChild1();
		wb.selectByVisibleText(ClaimType_GL, ClaimPage_NewFunctionality.SelectClaimType(driver));
		test.log(LogStatus.PASS, ClaimType_GL + "it text of Claim Type is selected");
		Thread.sleep(1000);
		wb.selectByVisibleText(ClientSpecificClasscode,
				ClaimPage_NewFunctionality.SelectClientSpecificClassCode(driver));
		test.log(LogStatus.PASS, ClientSpecificClasscode + "ClientSpecificClasscode is selected");
		Thread.sleep(1000);
		wb.selectByVisibleText(ClaimantLossTypeCode, ClaimPage_NewFunctionality.SelectClaimantLossTypeCode(driver));
		test.log(LogStatus.PASS, ClaimantLossTypeCode + "ClaimantLossTypeCode is selected");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.ReportedClaimDate(driver).sendKeys(ClaimReportedDate);
		ClaimPage_NewFunctionality.ReportedClaimDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, ClaimReportedDate + "ClaimReportedDate is entered");
		ClaimPage_NewFunctionality.ReportedClaimTime(driver).click();
		ClaimPage_NewFunctionality.ReportedClaimTime(driver).sendKeys(Reportedtime);
		ClaimPage_NewFunctionality.ReportedClaimTime(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, Reportedtime + "Reportedtime is entered");
		ClaimPage_NewFunctionality.Lossdate(driver).click();
		ClaimPage_NewFunctionality.Lossdate(driver).sendKeys(lossdate);
		ClaimPage_NewFunctionality.Lossdate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, lossdate + "lossdate is entered");
		ClaimPage_NewFunctionality.LossTime(driver).click();
		ClaimPage_NewFunctionality.LossTime(driver).sendKeys(Losstime);
		ClaimPage_NewFunctionality.LossTime(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, Losstime + "Losstime is entered");
		ClaimPage_NewFunctionality.ClaimNumber(driver).click();
		// ClaimPage_NewFunctionality.ClaimNumber(driver).sendKeys(claimNumber);
		ClaimPage_NewFunctionality.ClaimNumber(driver).sendKeys(RandomClass.randomName());
		test.log(LogStatus.PASS, RandomClass.randomName() + "claimNumber is entered");
		Thread.sleep(1000);
		wb.selectByIndex(ClaimPage_NewFunctionality.SelectPolicyNumber(driver), 1);
		// ClaimPage_NewFunctionality.ClaimDescription(driver).sendKeys(ClaimDescription);
		ClaimPage_NewFunctionality.ClaimDescription(driver).sendKeys(ClassCodeDescription);
		test.log(LogStatus.PASS, RandomClass.randomClassCodeDescription() + "ClaimDescription is entered");
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and conitnue button is clicked at Claim information page");
		Thread.sleep(4000);
		try {
		ClaimPage_NewFunctionality.ClaimInformation_AlertOKBtn(driver).click();
		test.log(LogStatus.PASS, "Alert Ok button is clicked");
		Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e);
		}
		try {
		ClaimPage_NewFunctionality.ClaimInformation_AlertOKBtn(driver).click();
		test.log(LogStatus.PASS, "Alert Ok button is clicked");
		}catch (Exception e) {
			System.out.println(e + "exception2");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Injury damage page

		wb.selectByVisibleText(MedicalAttentionProvided,
				ClaimPage_NewFunctionality.InjuryDamage_SelectMedicalAttentioProvided(driver));
		test.log(LogStatus.PASS, MedicalAttentionProvided + "is selected as Meedical Attention provided");
		Thread.sleep(1000);
		wb.selectByVisibleText(OccuredonCompanyPremises,
				ClaimPage_NewFunctionality.InjuryDamage_SelectOCcuredonCompanypremisesIndicator(driver));
		test.log(LogStatus.PASS, OccuredonCompanyPremises + "is selected as Company premises indiucator");
		Thread.sleep(1000);
		wb.selectByVisibleText(providerTypecode,
				ClaimPage_NewFunctionality.InjuryDamage_SelectProviderTypeCode(driver));
		test.log(LogStatus.PASS, providerTypecode + " is selected as provider type code");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.InjuryDamage_ProviderFirstName(driver).sendKeys(providerFirstName);
		test.log(LogStatus.PASS, providerFirstName + "is entered  at provider firstname ");
		ClaimPage_NewFunctionality.InjuryDamage_ProviderLastName(driver).sendKeys(providerLastName);
		test.log(LogStatus.PASS, providerLastName + "is entered  at provider last name ");
		ClaimPage_NewFunctionality.InjuryDamage_ProviderOrganizationName(driver).sendKeys(providerOrganizationname);
		test.log(LogStatus.PASS, providerOrganizationname + "is entered at organization name");
		Thread.sleep(3000);
		
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdown(driver).click();
		test.log(LogStatus.PASS, "Injury Event code drop down is clicked");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdownTxtBox(driver).sendKeys(InjuryEventcode);
		System.out.println("Injury eventcode dropdown is clicked");
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdownTxtBox(driver).sendKeys(Keys.ENTER);
		//ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdownbytext(driver, InjuryEventcode).click();
		test.log(LogStatus.PASS, InjuryEventcode + "is selected as Event code dropdown");
		Thread.sleep(3000);
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropDown(driver).click();
		test.log(LogStatus.PASS, "Injury extent  code drop down is clicked");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropdownTxtBox(driver).sendKeys(InjuryExtentcode);
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropdownTxtBox(driver).sendKeys(Keys.ENTER);
		//ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropdownbytext(driver, InjuryExtentcode).click();
		test.log(LogStatus.PASS, InjuryExtentcode + "is selected as Extent  code dropdown");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("scrolled by 300 ");
		try {
		ClaimPage_NewFunctionality.InjuryDamage_AccidentAddressLine1Name(driver).click();
		ClaimPage_NewFunctionality.InjuryDamage_AccidentAddressLine1Name(driver).sendKeys(AccidentAddressline);
		test.log(LogStatus.PASS, AccidentAddressCountry + "is as accident address country");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.InjuryDamage_AccidentAddressCityName(driver).sendKeys(AccidentAddressCityName);
		test.log(LogStatus.PASS, AccidentAddressCityName + "is entered as city name");
		wb.selectByVisibleText(AccidentAddressCountry,
				ClaimPage_NewFunctionality.InjuryDamage_selectAccidentAddressCountry(driver));
		test.log(LogStatus.PASS, AccidentAddressCountry + "Accident address country  name is Selected ");
		wb.selectByVisibleText(AccidentAddressState,
				ClaimPage_NewFunctionality.InjuryDamage_selectAccidentAddressState(driver));
		test.log(LogStatus.PASS, AccidentAddressState + "Accident address State  name is Selected ");
		ClaimPage_NewFunctionality.InjuryDamage_AccidentAddressPostCode(driver).sendKeys(AccidentAddressPostcode);
		test.log(LogStatus.PASS, AccidentAddressPostcode + "Accident address post code  is entered ");
		ClaimPage_NewFunctionality.InjuryDamage_Cause(driver).sendKeys(cause);
		test.log(LogStatus.PASS, cause + "is selected at injury damage page");
		}catch (Exception e) {
			System.out.println(e + "Exception 3");
		}
		wb.scrollToEndt();
//		try {
//		ClaimPage_NewFunctionality.InjuryDamage_MarkasConfirmedChkBox(driver).click();
//		test.log(LogStatus.PASS, "Mark as confirmed check box is clicked at injury damage page ");
//		}catch (Exception e) {
//			System.out.println("mark as confirm buttonj is not displayed");
//			test.log(LogStatus.PASS, "mark as confirmed button is not avaialble or displayed at injury and damage page");
//		}
//		try {
//		wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//		test.log(LogStatus.PASS, "Mark as confirmed check box  Alert is clicked at injury damage page");
//		}catch (Exception e) {
//			System.out.println("Alert is not avaialable ");
//			test.log(LogStatus.PASS, "Mark as confirmed check box  Alert is  not available to be clicked at injury damage page");
//		}
//		try {
//		ClaimPage_NewFunctionality.InjuryDamage_ActionNotes(driver).sendKeys(ActionNotes);
//		test.log(LogStatus.PASS, ActionNotes + "Action notes is selected ");
//		Thread.sleep(2000);
//		}catch (Exception e) {
//			System.out.println("Action notes is not avavialble");
//			test.log(LogStatus.PASS," Action Notes is not aviabale and not displayed at injury damage page");
//		}
		ClaimPage_NewFunctionality.InjuryDamage_SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continue button is clicked at insurancce damage page ");
		Thread.sleep(5000);

		// Claiamant information

		wb.Alert_Click(ClaimPage_NewFunctionality.ClaimantInformation_ClaimantType_BusinessEntityRadioBtn(driver));
		test.log(LogStatus.PASS, "Business Entity radio button is clicked at Claimant information page");
		Thread.sleep(2000);
		try {
		ClaimPage_NewFunctionality.ClaimantInformation_CompanyName(driver).sendKeys(CompanyName);
		test.log(LogStatus.PASS,
				"Company name is entered at claimant information  as " + CompanyName + "at claimant information page ");
		}catch (Exception e) {
			System.out.println("cannot enter company name");
		}
		ClaimPage_NewFunctionality.ClaimantInformation_ContactFirstname(driver).sendKeys(ContactFirstName);
		test.log(LogStatus.PASS,
				"Contact first name is entered as  " + ContactFirstName + "at claimant information page ");
		ClaimPage_NewFunctionality.ClaimantInformation_ContactLastName(driver).sendKeys(ContactLastName);
		test.log(LogStatus.PASS,
				"Contact Last name is entered as  " + ContactLastName + "at claimant information page ");
		ClaimPage_NewFunctionality.ClaimantInformation_ContactPhone(driver).sendKeys(PhoneNumber);
		test.log(LogStatus.PASS,
				"Contact Phone number  is entered as  " + PhoneNumber + "at claimant information page ");
		ClaimPage_NewFunctionality.ClaimantInformation_ContactEmail(driver).sendKeys(Email);
		test.log(LogStatus.PASS, "email id is entered as  " + Email + "at claimant information page ");
		try {
			ClaimPage_NewFunctionality.ClaimantInformation_JobTitle(driver).sendKeys("Admin");
			System.out.println("Admin is entered as job title");
		}catch (Exception e) {
			System.out.println(e+ "Exception3");
		}
		js.executeScript("arguments[0].scrollIntoView();", ClaimPage_NewFunctionality.ClaimantInformation_AddressLine(driver));
		ClaimPage_NewFunctionality.ClaimantInformation_AddressLine(driver).sendKeys(AccidentAddressline);
		test.log(LogStatus.PASS,
				"Address line 1 is enetred as   " + AccidentAddressline + "at claimant information page ");
		ClaimPage_NewFunctionality.ClaimantInformation_City(driver).sendKeys(AccidentAddressCityName);
		test.log(LogStatus.PASS, "Claimant city name is entered as  " + AccidentAddressCityName);
		Thread.sleep(1000);
		wb.selectByVisibleText(AccidentAddressCountry,
				ClaimPage_NewFunctionality.ClaimantInformation_SelectCountry(driver));
		test.log(LogStatus.PASS,
				"Cliamant  country at claiamant information page is Selected as  " + AccidentAddressCountry);
		Thread.sleep(1000);
		wb.selectByVisibleText(AccidentAddressState,
				ClaimPage_NewFunctionality.ClaimantInformation_SelectState(driver));
		test.log(LogStatus.PASS, AccidentAddressState + "::: " + " " + "Claimanat state is selected at claimant page ");
		ClaimPage_NewFunctionality.ClaimantInformation_ZIP(driver).sendKeys(AccidentAddressPostcode);
		test.log(LogStatus.PASS, AccidentAddressPostcode + "ZIp code enetred at Claimant information page");
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continure button at Claiamant information page is clicked");
		Thread.sleep(3000);

		// Financial data
//
//		ClaimPage_NewFunctionality.FinancialData_InsurerOSMedicalBIComp(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "medical OS BI Comp is entered as " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerPaidMedicalBIComp(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "InsurerPaidMedicalBIComp  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_RecoveryreceivedMedicalBIComp(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS,
//				"FinancialDataRecovery received Medical BIComp  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerOSIndemnityPDColl(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData_Insurer OS Indemnity PD Coll   " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerpaidIndemnityPDColl(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS,
//				"FinancialData_Insurer paid Indemnity PD Coll   " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_RecoveryRecievedIndemnityPDColl(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS,
//				"FinancialData Recovery received Indemnity PD Coll  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerOSExpense(driver).sendKeys(FinancialData);
//		Thread.sleep(2000);
//		test.log(LogStatus.PASS, "FinancialData Insurer OS Expense  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerpaidExpense(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData Insurer paid  Expense  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_RecoveryReceivedExpense(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData Recovery received  Expense  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerOSLegal(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData Insurer OS  legal  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_InsurerPaidLegal(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData Insurer paid  legal  " + "is entered as   " + FinancialData);
//		ClaimPage_NewFunctionality.FinancialData_NetpaidTotal(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "FinancialData net  paid " + "is entered as   " + FinancialData);
//		Thread.sleep(2000);
//		ClaimPage_NewFunctionality.FinancialData_ClaimAmount(driver).sendKeys(FinancialData);
//		test.log(LogStatus.PASS, "Financila data claim amount is enetred as " + FinancialData);
//		try {
//		ClaimPage_NewFunctionality.FinancialData_markasConfirmedChkBox(driver).click();
//		test.log(LogStatus.PASS, "Mark as confirmed check box is clicked at financial data page");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Mark as confirmed check box is not displayed and not avaialbe to be clicked at financial data page");
//			System.out.println("Mark as confirmed check box is not displayed and not avaialbe to be clicked at financial data page");
//		}
//		try {
//		wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//		test.log(LogStatus.PASS, "Mark as confimred ccheck box alert is handled ");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Mark as confimred ccheck box alert is handled ");
//			System.out.println("Mark as confimred ccheck box alert is handled ");
//		}
//		try {
//		ClaimPage_NewFunctionality.FinancialData_ActionNotes(driver).click();
//		ClaimPage_NewFunctionality.FinancialData_ActionNotes(driver).sendKeys(ActionNotes);
//		test.log(LogStatus.PASS, "Action notes is entered at fiancial data page is as " + ActionNotes);
//		Thread.sleep(2000);
//		}catch (Exception e) {
//			System.out.println("Action notes is displayed and so not entered at fiancial data page is as " + ActionNotes);
//		}

		List<WebElement> FianaceData = ClaimPage_NewFunctionality.FinancialDataFeildsList(driver);
		for (WebElement b : FianaceData) {
			Actions act = new Actions(driver);
			act.moveToElement(b).doubleClick().build().perform();
			Thread.sleep(1500);
			b.sendKeys("1000");
			js.executeScript("window.scrollBy(0,10)");
			test.log(LogStatus.PASS, " Payroll and hours added Successfully");
		}
		ClaimPage_NewFunctionality.FinancialData_SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continue button is clicked at financial data page");
		Thread.sleep(4000);

		// Other information
		ClaimPage_NewFunctionality.Other_Information_PreparedByTitile(driver).sendKeys("MR");
		ClaimPage_NewFunctionality.Other_Information_PreparedByFirstname(driver).sendKeys(OtherinfoPreparedByFirstName);
		test.log(LogStatus.PASS, "other info prepared by first name is " + OtherinfoPreparedByFirstName);
		ClaimPage_NewFunctionality.Other_Information_PreparedByLastName(driver).sendKeys(OtherinfoPreparedByLastName);
		test.log(LogStatus.PASS, "other info prepared by Last name is " + OtherinfoPreparedByLastName);
		ClaimPage_NewFunctionality.Other_Information_PreparedByTelephone(driver).sendKeys(PhoneNumber);
		test.log(LogStatus.PASS, "other info prepared by phone number  is " + PhoneNumber);
		Thread.sleep(2000);
		wb.scrollToEndt();
		ClaimPage_NewFunctionality.Other_Information_UploadDocument(driver).click();
		test.log(LogStatus.PASS, "Add documnet at other info is clicked");
		Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal-2\\AutoIT Script\\ScriptFile.exe");
		test.log(LogStatus.PASS, "Documnet uploaded succesfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add WC Claim")));
		Thread.sleep(5000);
		wb.scrollToEndt();
		Thread.sleep(2000);
//		try {
//		ClaimPage_NewFunctionality.Other_Information_MarkasConfirmedChkBox(driver).click();
//		test.log(LogStatus.PASS, "mark as confirmed button at Other info page is clicked");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "mark as confirmed button is not avaialble at Other info page is clicked");
//			System.out.println("mark as confirmed button is not avaiable at Other info page is clicked");
//		}
//		try {
//		wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//		test.log(LogStatus.PASS, "Alert is clicked at Other info mark as confirmed check box");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Alert is clicked as no alert present at Other info mark as confirmed check box");
//		}
//		try {
//		ClaimPage_NewFunctionality.Other_Information_ActionNotes(driver).click();
//		ClaimPage_NewFunctionality.Other_Information_ActionNotes(driver).sendKeys(ActionNotes);
//		test.log(LogStatus.PASS, "Action noted at other info page is entered as " + ActionNotes);
//	}catch (Exception e) {
//		test.log(LogStatus.PASS, "Action notes is not displayed  at other info page is entered as " + ActionNotes);
//		System.out.println("Action notes is not displayed  at other info page is entered as " + ActionNotes);
//	}
		//Thread.sleep(2000);
		ClaimPage_NewFunctionality.Other_Information_SaveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Other info save and close button is clicked");
		Thread.sleep(2000);
		wb.Switchtoparent();

	}

}
