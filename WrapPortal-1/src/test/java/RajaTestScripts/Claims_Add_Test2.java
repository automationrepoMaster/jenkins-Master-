package RajaTestScripts;

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
import GenericLibrary.ExcelLibraray_Hashmap;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg__Claim_Page;
import ObjectRepository.ClaimPage_NewFunctionality;

public class Claims_Add_Test2 extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	 GenericLibrary.ExcelLibraray_Hashmap excel = new GenericLibrary.ExcelLibraray_Hashmap();
		String sheetname = "wb2";
	String Program = "Automation Program dont touch";// "Hercules PG";
	String Project = "Test 132 ON"; // Sony Projects3385 "; //Hercules PJ";
	String Contractor = "Alex Comp2273"; // Hercules";
	String trade = "2085 | TradeDynamic-";
	String EnrollmenType = "WC & GL Enrollment";
	String ClassCodeDescription = "Class Code Description";
	String ClassCodeNumbe = "1122";
	String alphaurl = "https://alpha.wrapportal.com/Login.aspx"; // https://alpha.wrapportal.com/login
	String uername = "nourTest";
	String password = "NOUR5uccess#1";
	String ClaimType_GL = "General Liability";
	String ClaimType_WC ="Workers' Compensation";
	String ClaimReportedDate = "01/11/2020";
	String Reportedtime = "400";
	String lossdate = "01/09/2019"; // Loss date must be date before Reported date
	String Losstime = "1500";
	String ClientSpecificClasscode = "7412 - Test GL Claim";
	String ClientSpecificClasscode_WC  ="7894 - Test WC Claim";
	String ClaimantLossTypeCode = "Injury";
	String claimNumber = "ClaimNumber-1234";
	String ClaimDescription = "This is heights of emotion";
	String MedicalAttentionProvided = "Hospitalized > 24 Hours";
	String OccuredonCompanyPremises = "P(on Premises)";
	String providerTypecode = "Hospital";
//	String providerFirstName = "QuickGun";
//	String providerLastName = "Muragan";
	String providerFirstName = RandomClass.randomName();
	String providerLastName = RandomClass.randomName();
	//String providerOrganizationname = "TATA BIRLA";
	String providerOrganizationname = RandomClass.randomContractorCompanyName();
	//String AccidentAddressline = RandomClass.randomSponsorName();


	String InjuryEventcode = "Flammable fabrics";
    String InjuryExtentcode = "Cut/scrape";
	String InjuryEvenetCodeWC="Angina pectoris (chest pain)";
	String InjuryExtentcodeWC = "Abnormal Air Pressure";
	String partofBody ="Chest, ribs or sternum - Angina pectoris (chest pain)";
	String AccidentAddressline = "TwinTowers";
	String AccidentAddressCityName = "Texas";
	String AccidentAddressCountry = "United States (USA)";
	String AccidentAddressState = "Texas (TX)";
	String AccidentAddressPostcode = "22222-2222";
	String cause = "This is heights of emotion";
	String ActionNotes = "This is heights of emotion";
	String CompanyName = "Aristotle the great";
	String ContactFirstName = "Raja";
	String ContactLastName = "Reddy";
	String PhoneNumber = "12341234123412";
	String Email = "raja.reddy@nourtek.com";
	String FinancialData = "1000";
	String OtherinfoPreparedByFirstName = "Thalaiva";
	String OtherinfoPreparedByLastName = "Victory";
	
	
	//@Test(priority = 1)

	public void AddGLClaim() throws Throwable {
		excel.setExcelFile("D:\\NOURTEK\\Wrap Portal-2\\testData\\NourTek-Excel_HASHMAP.xlsx", sheetname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to(alphaurl);
		test.log(LogStatus.PASS, "<<<<+++++++  " + alphaurl + ">>>>>>>>>");
		Alphalogin();
		AddContractor_Pkg__Claim_Page.ClaimModule_claimsICon(driver).click();
		test.log(LogStatus.PASS, "Claims Icon is clicked");
		Thread.sleep(2000);
		wb.scrollToTop();
		AddContractor_Pkg__Claim_Page.ClaimModule_AddBtn(driver).click();
		test.log(LogStatus.PASS, "Add button is clicked at Class code");
		// wb.SwitchtoChild1();
		driver.switchTo().frame(AddContractor_Pkg__Claim_Page.ClaimFramePreviewBtn(driver));
		System.out.println("switched to frame");
		// driver.switchTo().frame(0);
		test.log(LogStatus.PASS, "Switched to frame at Add claim page ");
		Thread.sleep(2000);
		wb.selectByVisibleText(ExcelLibraray_Hashmap.getCellData("Program", 1), ClaimPage_NewFunctionality.SelectProgram(driver));
		test.log(LogStatus.PASS, ExcelLibraray_Hashmap.getCellData("Program", 1) + "is the Program is selected");
		Thread.sleep(1000);
		wb.selectByVisibleText(ExcelLibraray_Hashmap.getCellData("Project", 1), ClaimPage_NewFunctionality.SelectProject(driver));
		test.log(LogStatus.PASS, ExcelLibraray_Hashmap.getCellData("Project", 1) + "is the Project is selected");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.SearchContractor(driver).click();
		ClaimPage_NewFunctionality.SearchContractor(driver).sendKeys(ExcelLibraray_Hashmap.getCellData("Contractor", 1));
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.SearchContractor(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, ExcelLibraray_Hashmap.getCellData("Contractor", 1) + "is the Contractor is entered");
		Thread.sleep(1000);
		wb.selectByVisibleText(EnrollmenType, ClaimPage_NewFunctionality.SelectContractorType(driver));
		test.log(LogStatus.PASS, EnrollmenType + "is the EnrollmenType is Selected");
		ClaimPage_NewFunctionality.SearchBtn(driver).click();
		test.log(LogStatus.PASS, "search button is clicked at Claims");
		Thread.sleep(2000);
		// AddContractor_Pkg__Claim_Page.Radiobtn(driver).click();
		wb.CheckRadioBtn(AddContractor_Pkg__Claim_Page.Radiobtn(driver));
		test.log(LogStatus.PASS, "Radio button is clicked at add claims");
		wb.scrollToEndt();
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_NextBtn(driver).click();
		test.log(LogStatus.PASS, "Next button is clicked at add claims");
		driver.switchTo().defaultContent();
		System.out.println("Switched to default content");
		Thread.sleep(2000);
		wb.SwitchtoChild1();

		// Claim information page

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
		ClaimPage_NewFunctionality.ClaimNumber(driver).sendKeys(claimNumber);
		test.log(LogStatus.PASS, claimNumber + "claimNumber is entered");
		ClaimPage_NewFunctionality.ClaimDescription(driver).sendKeys(ClaimDescription);
		test.log(LogStatus.PASS, ClaimDescription + "ClaimDescription is entered");
//		try {
//			ClaimPage_NewFunctionality.ClaimInformation_MarkasConfirmedChkBox(driver).click();
//			test.log(LogStatus.PASS, "Mark as confirmed check box is clicked at Clam information page ");
//			wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//			test.log(LogStatus.PASS, "Mark as confirmed check box  Alert is clicked at claim information page");
//		} catch (Exception e) {
//			System.out.println("mark as confirmed check box is not present");
//			test.log(LogStatus.PASS, " mark as confirmed check box is not present");
//		}
//		try {
//			ClaimPage_NewFunctionality.ClaimInformation_ActionNotes(driver).sendKeys(ActionNotes);
//			test.log(LogStatus.PASS, ActionNotes + "It is the text of Action Notes is entered ");
//		} catch (Exception e) {
//			System.out.println("Action notes feild is not avvaialble at claim information page");
//			test.log(LogStatus.PASS, "Action notes feild is not available at Claim information page");
//		}
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and conitnue button is clicked at Claim information page");
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.ClaimInformation_AlertOKBtn(driver).click();
		test.log(LogStatus.PASS, "Alert Ok button is clicked");
		Thread.sleep(3000);

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
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdown(driver).click();
		test.log(LogStatus.PASS, "Injury Event code drop down is clicked");
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdownbytext(driver, InjuryEventcode).click();
		test.log(LogStatus.PASS, InjuryEventcode + "is selected as Event code dropdown");
		Thread.sleep(3000);
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropDown(driver).click();
		test.log(LogStatus.PASS, "Injury extent  code drop down is clicked");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@class='select2-search
		// select2-search-hidden
		// select2-offscreen']/..//ul/li/div[contains(text(),'Concussion')]")).click();
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropdownbytext(driver, InjuryExtentcode).click();
		test.log(LogStatus.PASS, InjuryExtentcode + "is selected as Extent  code dropdown");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("scrolled by 300 ");
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
		Thread.sleep(3000);

		// Claiamant information

		wb.Alert_Click(ClaimPage_NewFunctionality.ClaimantInformation_ClaimantType_BusinessEntityRadioBtn(driver));
		test.log(LogStatus.PASS, "Business Entity radio button is clicked at Claimant information page");
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.ClaimantInformation_CompanyName(driver).sendKeys(CompanyName);
		test.log(LogStatus.PASS,
				"Company name is entered at claimant information  as " + CompanyName + "at claimant information page ");
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
//		try {
//		ClaimPage_NewFunctionality.ClaimantInformation_MarkasConfirmedCjkBox(driver).click();
//		test.log(LogStatus.PASS, "Mark as confirmed button is clicked at Claiamant information page");
//		}catch (Exception e) {
//			System.out.println("Mark as confirmed chk box is not avaialble to click at Claimant information page");
//			test.log(LogStatus.PASS, "Mark as confirmed button is not avaialble to be  clicked at Claiamant information page");
//		}
//		try {
//		wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//		test.log(LogStatus.PASS, "Alert at mark as confirmed and cliked button at claimant information page");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Alert  not presernt at mark as confirmed and cliked button at claimant information page");
//			System.out.println( "Alert  not presernt at mark as confirmed and cliked button at claimant information page");
//		}
//		try {
//		ClaimPage_NewFunctionality.ClaimantInformation_ActionNotes(driver).click();
//		ClaimPage_NewFunctionality.ClaimantInformation_ActionNotes(driver).sendKeys(ActionNotes);
//		test.log(LogStatus.PASS, "Action notes at claimant information page is enetred as  " + ActionNotes);
//		Thread.sleep(2000);
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Action notes at claimant information page is not displayed and so not enetred as  " + ActionNotes);
//		}
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continure button at Claiamant information page is clicked");
		Thread.sleep(3000);

		// Financial data

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
//		List<WebElement> FianaceData = ClaimPage_NewFunctionality.FinancialDataFeildsList(driver);
//		for (WebElement ele : FianaceData) {
//			Actions act = new Actions(driver);
//			act.moveToElement(ele).doubleClick().build().perform();
//			Thread.sleep(1500);
//			ele.sendKeys("1000");
//			js.executeScript("window.scrollBy(0,10)");
//			test.log(LogStatus.PASS, " Financial data is added Successfully at financial information page");
//		}
//		ClaimPage_NewFunctionality.FinancialData_SaveandContinueBtn(driver).click();
//		test.log(LogStatus.PASS, "Save and continue button is clicked at financial data page");
//		Thread.sleep(4000);
		
		
		
		
		
		
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
		Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal-2\\AutoIT Script\\Raja\\AddDocumnet.exe");
		test.log(LogStatus.PASS, "Documnet uploaded succesfully");
		Thread.sleep(4000);
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
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.Other_Information_SaveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Other info save and close button is clicked");
		Thread.sleep(2000);
		wb.Switchtoparent();
		//AddWCClaim();
	}



	@Test

	public void AddWCClaim() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to(alphaurl);
		test.log(LogStatus.PASS, "<<<<+++++++  " + alphaurl + ">>>>>>>>>");
		Alphalogin();
		AddContractor_Pkg__Claim_Page.ClaimModule_claimsICon(driver).click();
		test.log(LogStatus.PASS, "Claims Icon is clicked");
		Thread.sleep(2000);
		wb.scrollToTop();
		AddContractor_Pkg__Claim_Page.ClaimModule_AddBtn(driver).click();
		test.log(LogStatus.PASS, "Add button is clicked at Class code");
		// wb.SwitchtoChild1();
		driver.switchTo().frame(AddContractor_Pkg__Claim_Page.ClaimFramePreviewBtn(driver));
		System.out.println("switched to frame");
		// driver.switchTo().frame(0);
		test.log(LogStatus.PASS, "Switched to frame at Add claim page ");
		Thread.sleep(2000);
		wb.selectByVisibleText(Program, ClaimPage_NewFunctionality.SelectProgram(driver));
		test.log(LogStatus.PASS, Program + "is the Program is selected");
		Thread.sleep(1000);
		wb.selectByVisibleText(Project, ClaimPage_NewFunctionality.SelectProject(driver));
		test.log(LogStatus.PASS, Project + "is the Project is selected");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.SearchContractor(driver).click();
		ClaimPage_NewFunctionality.SearchContractor(driver).sendKeys(Contractor);
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.SearchContractor(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, Contractor + "is the Contractor is entered");
		Thread.sleep(1000);
		wb.selectByVisibleText(EnrollmenType, ClaimPage_NewFunctionality.SelectContractorType(driver));
		test.log(LogStatus.PASS, EnrollmenType + "is the EnrollmenType is Selected");
		ClaimPage_NewFunctionality.SearchBtn(driver).click();
		test.log(LogStatus.PASS, "search button is clicked at Claims");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Radiobtn(driver).click();
		test.log(LogStatus.PASS, "Radio button is clicked at add claims");
		wb.scrollToEndt();
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_NextBtn(driver).click();
		test.log(LogStatus.PASS, "Next button is clicked at add claims");
		driver.switchTo().defaultContent();
		System.out.println("Switched to default content");
		Thread.sleep(2000);
		wb.SwitchtoChild1();

		// Claim information page

		wb.selectByVisibleText(ClaimType_WC, ClaimPage_NewFunctionality.SelectClaimType(driver));
		test.log(LogStatus.PASS, ClaimType_WC + "it text of Claim Type is selected");
		Thread.sleep(1000);
		wb.selectByVisibleText(ClientSpecificClasscode_WC,
				ClaimPage_NewFunctionality.SelectClientSpecificClassCode(driver));
		test.log(LogStatus.PASS, ClientSpecificClasscode_WC + "ClientSpecificClasscode is selected");
		Thread.sleep(1000);
//		wb.selectByVisibleText(ClaimantLossTypeCode, ClaimPage_NewFunctionality.SelectClaimantLossTypeCode(driver));
//		test.log(LogStatus.PASS, ClaimantLossTypeCode + "ClaimantLossTypeCode is selected");
//		Thread.sleep(1000);
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
		ClaimPage_NewFunctionality.ClaimNumber(driver).sendKeys(claimNumber);
		test.log(LogStatus.PASS, claimNumber + "claimNumber is entered");
		//---------------
		ClaimPage_NewFunctionality.ClaimInformationWC_IncidentReportedbyFirstName(driver).sendKeys(ContactFirstName);
		test.log(LogStatus.PASS, "Claim Information reported by first name at WC   is" + ContactFirstName );
		ClaimPage_NewFunctionality.ClaimInformationWC_IncidentReportedbyLastName(driver).sendKeys(ContactLastName);
		test.log(LogStatus.PASS, "Claim Information reported by last name  at WC is" + ContactLastName );
		ClaimPage_NewFunctionality.ClaimInformationWC_IncidentReportedbyEmail(driver).sendKeys(Email);
		test.log(LogStatus.PASS, "Claim Information reported by Email   at WC is" + Email );
		ClaimPage_NewFunctionality.ClaimInformationWC_IncidentReportedbyphone(driver).sendKeys(PhoneNumber);
		test.log(LogStatus.PASS, "Claim Information reported by phone number   at WC is" + PhoneNumber );
		
		ClaimPage_NewFunctionality.ClaimDescription(driver).sendKeys(ClaimDescription);
		test.log(LogStatus.PASS, ClaimDescription + "ClaimDescription is entered");
//		try {
//			ClaimPage_NewFunctionality.ClaimInformation_MarkasConfirmedChkBox(driver).click();
//			test.log(LogStatus.PASS, "Mark as confirmed check box is clicked at Clam information page ");
//			wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//			test.log(LogStatus.PASS, "Mark as confirmed check box  Alert is clicked at claim information page");
//		} catch (Exception e) {
//			System.out.println("mark as confirmed check box is not present");
//			test.log(LogStatus.PASS, " mark as confirmed check box is not present");
//		}
//		try {
//			ClaimPage_NewFunctionality.ClaimInformation_ActionNotes(driver).sendKeys(ActionNotes);
//			test.log(LogStatus.PASS, ActionNotes + "It is the text of Action Notes is entered ");
//		} catch (Exception e) {
//			System.out.println("Action notes feild is not avvaialble at claim information page");
//			test.log(LogStatus.PASS, "Action notes feild is not available at Claim information page");
//		}
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and conitnue button is clicked at Claim information page");
		Thread.sleep(4000);
		ClaimPage_NewFunctionality.ClaimInformation_AlertOKBtn(driver).click();
		test.log(LogStatus.PASS, "Alert Ok button is clicked");
		Thread.sleep(3000);
		
		
		// Injury damage page
		//----------------
		wb.selectByVisibleText("No", ClaimPage_NewFunctionality.InjuryDamage_SelectOtherClaimsInvolvedinAccidentLocator(driver));
		Thread.sleep(1000);
		wb.selectByVisibleText("No", ClaimPage_NewFunctionality.InjuryDamage_SelectLossTimeExpectedIndicator(driver));
		Thread.sleep(1000);
		
		wb.selectByVisibleText(MedicalAttentionProvided,
				ClaimPage_NewFunctionality.InjuryDamage_SelectMedicalAttentioProvided(driver));
		test.log(LogStatus.PASS, MedicalAttentionProvided + "is selected as Meedical Attention provided");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		wb.selectByVisibleText("Hospital", ClaimPage_NewFunctionality.InjuryDamage_SelectProviderTypeCode(driver));
		test.log(LogStatus.PASS, "provider type code is selected as Medical");
		ClaimPage_NewFunctionality.InjuryDamage_ProviderFirstName(driver).sendKeys(providerFirstName);
		test.log(LogStatus.PASS, providerFirstName + "is entered  at provider firstname ");
		ClaimPage_NewFunctionality.InjuryDamage_ProviderLastName(driver).sendKeys(providerLastName);
		test.log(LogStatus.PASS, providerLastName + "is entered  at provider last name ");
		ClaimPage_NewFunctionality.InjuryDamage_ProviderOrganizationName(driver).sendKeys(providerOrganizationname);
		test.log(LogStatus.PASS, providerOrganizationname + "is entered at organization name");
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.InjuryDamage_NatureofInjuryCodeDropDown(driver).click();
		test.log(LogStatus.PASS, "Injury  code drop down is clicked");
		ClaimPage_NewFunctionality.InjuryDamage_InjuryEventCodeDropdownbytextWC(driver, InjuryEvenetCodeWC).click();
		test.log(LogStatus.PASS, InjuryEvenetCodeWC + "is selected as Event code dropdown");
		Thread.sleep(3000);
		ClaimPage_NewFunctionality.InjuryDamage_NatureOfAccidentCode(driver).click();
		test.log(LogStatus.PASS, "nature of Accident code drop down is clicked");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@class='select2-search
		// select2-search-hidden
		// select2-offscreen']/..//ul/li/div[contains(text(),'Concussion')]")).click();
		ClaimPage_NewFunctionality.InjuryDamage_InjuryExtentCodeDropdownbytextWC(driver, InjuryExtentcodeWC).click();
		test.log(LogStatus.PASS, InjuryExtentcodeWC + "is selected as Extent  code dropdown");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.InjuryDamagePartofBodyCodeDropdownWC(driver).click();
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.InjuryDamage_PartofBodyCodeWC(driver, partofBody).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("scrolled by 300 ");
		
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
		Thread.sleep(3000);

		// Claiamant information

		wb.Alert_Click(ClaimPage_NewFunctionality.ClaimantInformation_ClaimantType_IndividualRadioBtn(driver));
		test.log(LogStatus.PASS, "Individual radio button is clicked at Claimant information page");
		Thread.sleep(2000);
//		ClaimPage_NewFunctionality.ClaimantInformation_CompanyName(driver).sendKeys(CompanyName);
//		test.log(LogStatus.PASS,
//				"Company name is entered at claimant information  as " + CompanyName + "at claimant information page ");
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
		//-------------------
		ClaimPage_NewFunctionality.ClaimantInformation_JobTitle(driver).sendKeys("Admin");
		test.log(LogStatus.PASS, "Job title for WC is entered");
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.ClaimantInformation_SocialSecurityNumber(driver).sendKeys("123456789");
		test.log(LogStatus.PASS, "Social security number is entered");
		wb.selectByVisibleText("Male",ClaimPage_NewFunctionality.ClaimantInformation_SelectGender(driver));
		test.log(LogStatus.PASS, "Male is selected as gender");
		Thread.sleep(1000);
		ClaimPage_NewFunctionality.ClaimantInformation_DOB(driver).sendKeys("01/01/1990");
		ClaimPage_NewFunctionality.ClaimantInformation_DOB(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "DOB is entered for claimant ");
		wb.selectByVisibleText("Married", ClaimPage_NewFunctionality.ClaimantInformation_SelectMartialStatus(driver));
		test.log(LogStatus.PASS, "Martial status is alloted as married");
		
		
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
//		try {
//		ClaimPage_NewFunctionality.ClaimantInformation_MarkasConfirmedCjkBox(driver).click();
//		test.log(LogStatus.PASS, "Mark as confirmed button is clicked at Claiamant information page");
//		}catch (Exception e) {
//			System.out.println("Mark as confirmed chk box is not avaialble to click at Claimant information page");
//			test.log(LogStatus.PASS, "Mark as confirmed button is not avaialble to be  clicked at Claiamant information page");
//		}
//		try {
//		wb.Alert_Click(ClaimPage_NewFunctionality.MarkasConfirmedChkBox_AlertOKBtn(driver));
//		test.log(LogStatus.PASS, "Alert at mark as confirmed and cliked button at claimant information page");
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Alert  not presernt at mark as confirmed and cliked button at claimant information page");
//			System.out.println( "Alert  not presernt at mark as confirmed and cliked button at claimant information page");
//		}
//		try {
//		ClaimPage_NewFunctionality.ClaimantInformation_ActionNotes(driver).click();
//		ClaimPage_NewFunctionality.ClaimantInformation_ActionNotes(driver).sendKeys(ActionNotes);
//		test.log(LogStatus.PASS, "Action notes at claimant information page is enetred as  " + ActionNotes);
//		Thread.sleep(2000);
//		}catch (Exception e) {
//			test.log(LogStatus.PASS, "Action notes at claimant information page is not displayed and so not enetred as  " + ActionNotes);
//		}
		ClaimPage_NewFunctionality.ClaimantInformation__SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continure button at Claiamant information page is clicked");
		Thread.sleep(3000);

		// Financial data

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
		
		List<WebElement> FianaceData = ClaimPage_NewFunctionality.FinancialDataFeildsList(driver);
		for (WebElement ele : FianaceData) {
			Actions act = new Actions(driver);
			act.moveToElement(ele).doubleClick().build().perform();
			Thread.sleep(1500);
			ele.sendKeys("1000");
			js.executeScript("window.scrollBy(0,10)");
			test.log(LogStatus.PASS, " Financial data is added Successfully at financial information page");
		}
		ClaimPage_NewFunctionality.FinancialData_SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Save and continue button is clicked at financial data page");
		Thread.sleep(4000);
		
		
		try {
		ClaimPage_NewFunctionality.FinancialData_markasConfirmedChkBox(driver).click();
		test.log(LogStatus.PASS, "Mark as confirmed check box is clicked at financial data page");
		}catch (Exception e) {
			test.log(LogStatus.PASS, "Mark as confirmed check box is not displayed and not avaialbe to be clicked at financial data page");
			System.out.println("Mark as confirmed check box is not displayed and not avaialbe to be clicked at financial data page");
		}
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
		Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal-2\\AutoIT Script\\Raja\\AddDocumnet.exe");
		test.log(LogStatus.PASS, "Documnet uploaded succesfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add GL liablity method")));
		Thread.sleep(4000);
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
		Thread.sleep(2000);
		ClaimPage_NewFunctionality.Other_Information_SaveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Other info save and close button is clicked");
		Thread.sleep(2000);
		wb.Switchtoparent();

	}


	

	public void Alphalogin() throws Throwable {

		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys(uername);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='commanBigButton darkBlueButton']")).click();
	}

}
