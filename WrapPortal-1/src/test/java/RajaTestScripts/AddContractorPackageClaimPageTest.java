package RajaTestScripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg__Claim_Page;

public class AddContractorPackageClaimPageTest extends BaseClass {
	static String ProgrammeName = "Shelly Bhist";
	static String ProjectName = "Shelly Bhist-Project Name";
	static String EnrollmentName = "WC & GL Enrollment";
	static String Trade = "007";
	static String ContractName = "L&T";

	@Test
	public  void AddContractorPackage_Claim_Data_entering() throws Exception {
		AddContractor_Pkg__Claim_Page.ContractorPackage_ICon(driver).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Contractor package is cliked succesfully");
		test.log(LogStatus.PASS, "Contractor package is cliked succesfully");
		js.executeScript("window.scrollTo(0,0)");
		AddContractor_Pkg__Claim_Page.AdvancesearchICon(driver).click();
		System.out.println("Advance search icon is clikced succesfrully");
		test.log(LogStatus.PASS, "Advace Search is cliked succesfully");
		WebElement programme = AddContractor_Pkg__Claim_Page.SelectProgramme(driver);
		Select Sprogramme = new Select(programme);
		Sprogramme.selectByVisibleText(ProgrammeName);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "programe  is selcted succesfully");
		// System.out.println("programme is selected from Drop down");
		WebElement Project = AddContractor_Pkg__Claim_Page.SelectProject(driver);
		Select SProject = new Select(Project);
		SProject.selectByVisibleText(ProjectName);
		Thread.sleep(3000);
		// System.out.println("project is selected from Drop down");
		test.log(LogStatus.PASS, "project  is selcted succesfully");
		WebElement Tradelist = AddContractor_Pkg__Claim_Page.SelectTrade(driver);
		Tradelist.sendKeys(Trade);
		Tradelist.sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Trade  is selcted succesfully");
		// System.out.println("Trade is selected from Drop down");
		WebElement Enrollment = AddContractor_Pkg__Claim_Page.EnrollmentType(driver);
		Select SEnrollment = new Select(Enrollment);
		SEnrollment.selectByVisibleText(EnrollmentName);
		Thread.sleep(2000);
		// System.out.println("Enrollment is selected from Drop down");
		test.log(LogStatus.PASS, "Enrollment  is selcted succesfully");
		WebElement Contract = AddContractor_Pkg__Claim_Page.SearchByContractor(driver);
		Contract.click();
		Contract.sendKeys(ContractName);
		Contract.sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contract  is selcted succesfully");
		// System.out.println("Contract is selected from Drop down");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.Advance_SearchBtn_DOwn(driver).click();
		Thread.sleep(6000);
		// System.out.println("Contractor package is selected succesfully");
		test.log(LogStatus.PASS, "Contractor package  is selcted succesfully");
		Thread.sleep(2000);
		driver.switchTo().frame(AddContractor_Pkg__Claim_Page.Claim_frame(driver));
		// System.out.println("Moved to Claims frame");
		test.log(LogStatus.PASS, "Moved to claim frame");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.Claims_Link(driver).click();
		// System.out.println("clicked on claim frame and window of claims opened ");
		test.log(LogStatus.PASS, "Claim window is opened");
		Set<String> ids = driver.getWindowHandles();
		Object[] id = ids.toArray();
		String id1 = id[0].toString();
		String id2 = id[1].toString();
		driver.switchTo().window(id2);
		System.out.println("Moved to second window to claims page");
		test.log(LogStatus.PASS, "moved tos econd window succesfully");
		// System.out.println(driver.getWindowHandles(driver));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys("10/06/2020");
		// System.out.println("Claim date is entered ");
		test.log(LogStatus.PASS, "Claim Date is enetred succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).clear();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		// System.out.println("Claim ifno Claim date entered is cleared succesfully");
		test.log(LogStatus.PASS, "Claim Info claim Date ius cleared succesfully");
		Thread.sleep(2000);
		WebElement Claimdateerror = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_ClaimDate(driver);
		String ActualClaimDateError = Claimdateerror.getText();
		String ExpectedClaimDateError = "This field is required.";
		if (ActualClaimDateError.equals(ExpectedClaimDateError)) {
			// System.out.println("Both are matching at ClaimDate error");
			test.log(LogStatus.PASS, "Act and Exp Date errors are matching ");
		} else {
			// System.out.println("Notmatching with claimdate error");
			test.log(LogStatus.FAIL, "Act and Exp claim date errors are not amtching  ");
		}
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys("10/06/2020");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys(Keys.TAB);
		// System.out.println("Claim ifno Claim date entered is entered again
		// succesfully");
		test.log(LogStatus.PASS, "Claim info claim date in entered again  succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Number(driver).sendKeys("12345");
		// System.out.println("ClaimInfo_Claim number is entered ");
		test.log(LogStatus.PASS, "Claim info claim number  in entered   succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Policy_Number(driver).sendKeys("12345");
		// System.out.println("ClaimInfo_Policy number is entered ");
		test.log(LogStatus.PASS, "Claim info claim policy number  in entered   succesfully");
		WebElement ClaimInfoClaimtype = AddContractor_Pkg__Claim_Page.ClaimInfo_claim_Type(driver);
		Select SClaimInfoClaimtype = new Select(ClaimInfoClaimtype);
		SClaimInfoClaimtype.selectByIndex(1);
		// System.out.println("Claim_Info claim type is selected succesfully from drop
		// down list ");
		test.log(LogStatus.PASS, "Claim info claim type in entered   succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys("06/06/2020");
		// System.out.println("ClaimInfo_Loss date is selected succesfully");
		test.log(LogStatus.PASS, "Claim info Loss date  in entered   succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys(Keys.TAB);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).clear();
		System.out.println("ClaimInfo_Loss date is cleared succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement LossDateError = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_Loss_Date(driver);
		String ActualLosewDaterror = LossDateError.getText();
		String ExpectedLosewDaterror = "This field is required.";
		if (ActualLosewDaterror.equals(ExpectedLosewDaterror)) {
			// System.out.println("Actua and Exp error msgs are matching at loss date
			// error");
			test.log(LogStatus.PASS, "Both Act and Exp are matching at lose date error ");
		} else {
			// System.out.println("Not matching error msg at Loss Date");
			test.log(LogStatus.FAIL, "Not matching of Act and Exp  error msg at Loss Date");

		}
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys("06/06/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		// System.out.println("ClaimInfo_Loss date is entered again succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("This is for claimInfo_Claim description");
		// System.out.println("ClaimInfo_Claim Description is Entered succesfully");
		test.log(LogStatus.PASS, "ClaimInfo_Claim Description is Entered succesfully ");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver).clear();
		Thread.sleep(2000);
		WebElement ClaimantDescription = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_ClaimDescription(driver);
		String ActualDescription = ClaimantDescription.getText();
		String ExpClaimantDescription = "This field is required.";
		if (ActualDescription.equals(ExpClaimantDescription)) {
			// System.out.println("both Act and Exp are matching at Description");
			test.log(LogStatus.PASS, "Both Act and Exp are matching at Claimant Description error ");

		} else {
			// System.out.println("not matching at description");
			test.log(LogStatus.FAIL, "Both Act and Exp are not matching at Claimant Description error ");

		}
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("This is for claimInfo_Claim description");
		System.out.println("ClaimInfo_CalimDescription is entered again succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Primary_Physician_Used(driver).sendKeys("Primary physian Used");
		System.out.println("Primary physian used details entered");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_code(driver).sendKeys("1234");
		Thread.sleep(2000);
		// System.out.println("Loss code is enetred succesfully ");
		test.log(LogStatus.PASS, "Primary physian is entered succesfully ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).sendKeys("Raja the Claimant");
		System.out.println("Claimant name is entered");
		test.log(LogStatus.PASS, "Claimant name is entered succesfully ");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).clear();
		System.out.println("Claimant name is cleared ");
		WebElement ClaimantName = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimantInfo_Claimant_Name(driver);
		String ActuaalClaimnatmsg = ClaimantName.getText();
		String ExpClaimnatmsg = "This field is required.";
		if (ExpClaimnatmsg.equals(ActuaalClaimnatmsg)) {
			// System.out.println("Both act and Exp are matching at Claimant name");
			test.log(LogStatus.PASS, "Both act and Exp are matching at Claimant name");

		} else {
			// System.out.println("Not matching at Claimant name");
			test.log(LogStatus.FAIL, "Both act and Exp are not matching at Claimant name");
		}
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).sendKeys("Raja the Claimant");
		Thread.sleep(2000);
		// System.out.println("climant name is entered succesfully again");
		test.log(LogStatus.PASS, "Claimant is entered again");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Job_Title(driver).sendKeys("QA");
		// System.out.println("claimant job title is entered succesfully");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claimant Job title entered ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_1(driver).sendKeys("Texas");
		// System.out.println("claimant Address1 is entered succesfully");
		test.log(LogStatus.PASS, "Claimant Addr1 title entered ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_2(driver).sendKeys("USA");
		// System.out.println("claimant Address2 is entered succesfully");
		test.log(LogStatus.PASS, "Claimant Address2 title entered ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Phone(driver).sendKeys("99862520851234");
		// System.out.println("Claimant phone is enetred succesfully ");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Claimant phone is   entered ");
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_First_Name(driver).sendKeys("Raja the other info");
		// System.out.println("Other_Info_Prepared_by_First_Name is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Other_Info_Prepared_by_First_Name is enetred succesfully");
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_Last_Name(driver).sendKeys("Raja the last name");
		// .out.println("Other_Info_Prepared_by_Last_Name is enetred succesfully");
		test.log(LogStatus.PASS, "Other_Info_Prepared_by_Last_Name is enetred succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_OS_Medical_BI_Comp(driver).sendKeys("1000");
		// System.out.println("Insurer_OS_Medical_BI_Comp is enetred succesfully");
		test.log(LogStatus.PASS, "OS_Medical_BI_Compis enetred succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_Paid_Medical_BI_Comp(driver).sendKeys("500");
		// System.out.println("Financial_Data_Insurer_Paid_Medical_BI_Comp is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Financial_Data_Insurer_Paid_Medical_BI_Comp succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Recovery_Received_Medical_BI_Comp(driver).sendKeys("250");
		// System.out.println("Financial_Data_Recovery_Received_Medical_BI_Comp is
		// enetred succesfully");
		test.log(LogStatus.PASS, "Financial_Data_Recovery_Received_Medical_BI_Comp is enetered succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_paid_legal(driver).sendKeys("125");
		// System.out.println("Financial_Data_Insurer_paid_legal is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Financial_Data_Recovery_paid legal is enetered succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Claim_Amount(driver).sendKeys("1000");
		// System.out.println("Financial_Data_Claim_Amount is enetred succesfully");
		test.log(LogStatus.PASS, "Financial_Data_claim amoun  is enetered succesfully");
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AddContractor_Pkg__Claim_Page.Review_Admin_Markas_Confirm(driver).click();
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.Review_Admin_Action_Notes(driver).click();
		AddContractor_Pkg__Claim_Page.Review_Admin_Action_Notes(driver).sendKeys("this is for admin purpose only");
		// System.out.println("Action notes in the admin review tab is enetred
		// succesfully");
		test.log(com.relevantcodes.extentreports.LogStatus.PASS, "Actiion notes is enetered succesfully");
		AddContractor_Pkg__Claim_Page.CloseBtn_ClaimsTab(driver).click();
		// System.out.println("close button is cliked suucesfully");
		test.log(LogStatus.PASS, "close btn is clicked  succesfully");
		driver.switchTo().window(id1);
		// System.out.println("moved to parent window");
		test.log(LogStatus.PASS, "swicthed tom parent window succesfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "AddContractorPackage_Claim_Data_entering")));

	}

}
