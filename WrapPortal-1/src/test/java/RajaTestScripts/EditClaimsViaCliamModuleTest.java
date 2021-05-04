package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg__Claim_Page;

public class EditClaimsViaCliamModuleTest extends BaseClass {

//	static String Progname = "RAUTOMATION123";
//	static String proName = "RAUT123";
//	static String tradename = "007";
//	static String Contractor_Type = "WC & GL Enrollment";
//	static String Contractor = " Ashley";
	
	
	static String Progname = "Hercules PG"; //"THANOS PG Name"; //"RAUTOMATION123";
	static String proName = "Hercules PJ";  //"Thanos PJ";  //"RAUT123";
	static String tradename = "2085";
	static String Contractor_Type = "WC & GL Enrollment";
	static String Contractor = "Hercules"; //" Ashley";
	WebDriverCommonLib wb=new WebDriverCommonLib();

	@Test
	public  void EditClaimsViaclaimsModule() throws Throwable {

		AddContractor_Pkg__Claim_Page.ClaimModule_claimsICon(driver).click();
		Thread.sleep(2000);
		// System.out.println("Claim ICon is cliked succesfully");
		//test.log(LogStatus.PASS, "Claim Add Btn is cliked succesfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.AdvancesearchICon(driver).click();
		// System.out.println("Advance search icon is clikced succesfrully");
		test.log(LogStatus.PASS, "Adv search  Btn is cliked succesfully");
//		WebElement SelctprogrammeClaimserach = AddContractor_Pkg__Claim_Page.ClaimSearch_SelectPrograme_(driver);
//		Select SSelctprogrammeClaimserach = new Select(SelctprogrammeClaimserach);
//		SSelctprogrammeClaimserach.selectByValue("1239");
		wb.selectByVisibleText(Progname, AddContractor_Pkg__Claim_Page.ClaimSearch_SelectPrograme_(driver));
		Thread.sleep(2000);
		System.out.println("programmeselected succesfully from Advqance searchbar ");
		test.log(LogStatus.PASS, "programmeselected succesfully from Advqance searchbar");
		AddContractor_Pkg__Claim_Page.ClaimsSerach_Advancesearch_Btn_Downn(driver).click();
		Thread.sleep(6000);
		//js.executeScript("window.scrollTo(0,0)");
		wb.scrollToTop();
		Thread.sleep(1000);
		AddContractor_Pkg__Claim_Page.ClaimModule_EditBtn(driver).click();
		Thread.sleep(4000);
		System.out.println("Claim Edit btn is cliked succesfully");
		test.log(LogStatus.PASS, "Claim Edit btn  succesfully");
//		Set<String> ids = driver.getWindowHandles();
//		Object[] id = ids.toArray();
//		String id1 = id[0].toString();
//		String id2 = id[1].toString();
//		driver.switchTo().window(id2);
		// System.out.println("Moved to second window to claims page");
		wb.SwitchtoChild1();
		test.log(LogStatus.PASS, "Moved to second window ");
		System.out.println(driver.getWindowHandles());
		//driver.manage().window().maximize();
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).clear();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys("10/06/2020");
		// System.out.println("Claim date is entered ");
		test.log(LogStatus.PASS, "Claim date is entered ");
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		// System.out.println("Claim ifno Claim date entered is cleared succesfully");
		test.log(LogStatus.PASS, "Claim info is entered and cleared ");
		Thread.sleep(3000);
		WebElement Claimdateerror = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_ClaimDate(driver);
		String ActualClaimDateError = Claimdateerror.getText();
		String ExpectedClaimDateError = "This field is required.";
		if (ActualClaimDateError.equals(ExpectedClaimDateError)) {
			System.out.println("Both are matching at ClaimDate error");
			test.log(LogStatus.PASS, "Act and Exp text at Claim date error  is matching  ");
		} else {
			System.out.println("Notmatching with claimdate error");
			test.log(LogStatus.PASS, "Act and Exp text at Claim date error  is matching  ");
		}
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Number(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Number(driver).sendKeys("12345");
		System.out.println("ClaimInfo_Claim number is entered ");
		System.out.println("ClaimInfo_policy number is entered ");
		Thread.sleep(2000);
		WebElement ClaimInfoClaimtype = AddContractor_Pkg__Claim_Page.ClaimInfo_claim_Type(driver);
		Select SClaimInfoClaimtype = new Select(ClaimInfoClaimtype);
		SClaimInfoClaimtype.selectByIndex(4);
		System.out.println("Claim_Info claim type is selected succesfully from drop down list ");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).clear();
		System.out.println("ClaimInfo_Loss date is cleared succesfully");
		WebElement LossDateError = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_Loss_Date(driver);
		String ActualLosewDaterror = LossDateError.getText();
		String ExpectedLosewDaterror = "This field is required.";
		if (ActualLosewDaterror.equals(ExpectedLosewDaterror)) {
			test.log(LogStatus.PASS, "Act and Exp text at Loss date error  is matching  ");
			// System.out.println("Actua and Exp error msgs are matching at loss date
			// error");
		} else {
			// System.out.println("Not matching error msg at Loss Date");
			test.log(LogStatus.FAIL, "Act and Exp text at Loss date error  is matching  ");

		}
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys("06/06/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Time(driver).sendKeys("18:30");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Time(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_code(driver).sendKeys("1234");
		Thread.sleep(2000);
		// System.out.println("Loss code is enetred succesfully ");
		test.log(LogStatus.PASS, "Loss code is entered ");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Incident_Reported_by_phone(driver).sendKeys("99862520851234");
		System.out.println("Incident phone number is enetred  succesfully ");
		// System.out.println("Loss code is enetred succesfully ");
		test.log(LogStatus.PASS, "Incident phone number is entered ");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Nature_of_Injury(driver).sendKeys("Accident");
		Thread.sleep(2000);
		// System.out.println("natre of injury is enetred");
		test.log(LogStatus.PASS, "Nature of injury is entered ");
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("This is for claimInfo_Claim description");
		test.log(LogStatus.PASS, "NClaim description  is entered ");
		// System.out.println("ClaimInfo_Claim Description is Entered succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver).clear();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("This is for claimInfo_Claim description");
		System.out.println("ClaimInfo_CalimDescription is entered again succesfully");
		test.log(LogStatus.PASS, "NClaim description  is entered again after clearing it  ");
		Thread.sleep(2000);
		WebElement ClaimantDescription = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimInfo_ClaimDescription(driver);
		String ActualDescription = ClaimantDescription.getText();
		String ExpClaimantDescription = "This field is required.";
		if (ActualDescription.equals(ExpClaimantDescription)) {
			// System.out.println("both Act and Exp are matching at Description");
			test.log(LogStatus.PASS, "Actual and Exp Claim description error msg  is matching ");
		} else {
			// System.out.println("not matching at description");
			test.log(LogStatus.FAIL, "Actual and Exp Claim description error msg  is not  matching ");
		}
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("This is for claimInfo_Claim description");
		// System.out.println("ClaimInfo_Claim Description is Entered succesfully");
		test.log(LogStatus.PASS, "Claim description  is entered ");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).click();
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).clear();
		// System.out.println("Claimant name is cleared ");
		test.log(LogStatus.PASS, "claimant name   is entered ");
		Thread.sleep(2000);
		WebElement ClaimantName = AddContractor_Pkg__Claim_Page.ErrorMessage_ClaimantInfo_Claimant_Name(driver);
		String ActuaalClaimnatmsg = ClaimantName.getText();
		String ExpClaimnatmsg = "This field is required.";
		if (ExpClaimnatmsg.equals(ActuaalClaimnatmsg)) {
			// System.out.println("Both act and Exp are matching at Claimant name");
			test.log(LogStatus.PASS, "Actual and Exp Claimant name  error msg  is   matching ");

		} else {
			// System.out.println("Not matching at Claimant name");
			test.log(LogStatus.FAIL, "Actual and Exp Claimant  Name error msg  is not  matching ");

		}
		test.log(LogStatus.PASS, "Claimant name is entered again ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).sendKeys("Raja the Claimant");
		// System.out.println("Claimant name is entered");
		test.log(LogStatus.PASS, "Claimant name is entered again ");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Job_Title(driver).sendKeys("QA");
		// System.out.println("claimant job title is entered succesfully");
		test.log(LogStatus.PASS, "Claimant job title is entered  ");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_1(driver).sendKeys("Texas");
		// System.out.println("claimant Address1 is entered succesfully");
		test.log(LogStatus.PASS, "Claimant Address1 is entered  ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_2(driver).sendKeys("USA");
		// System.out.println("claimant Address2 is entered succesfully");
		test.log(LogStatus.PASS, "Claimant Address2 is entered  ");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Phone(driver).sendKeys("99862520851234");
		System.out.println("Claimant phone is enetred succesfully ");
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_First_Name(driver).sendKeys("Raja the other info");
		// System.out.println("Other_Info_Prepared_by_First_Name is enetred
		// succesfully");
		test.log(LogStatus.PASS, "other info at first name  entered  ");
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_Last_Name(driver).sendKeys("Raja the last name");
		// System.out.println("Other_Info_Prepared_by_Last_Name is enetred
		// succesfully");
		test.log(LogStatus.PASS, "other info by last name  is entered  ");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_OS_Medical_BI_Comp(driver).sendKeys("1000");
		// System.out.println("Insurer_OS_Medical_BI_Comp is enetred succesfully");
		test.log(LogStatus.PASS, "Medical BI is entered  ");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_Paid_Medical_BI_Comp(driver).sendKeys("500");
		// System.out.println("Financial_Data_Insurer_Paid_Medical_BI_Comp is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Paid Medical BI  is entered  ");
		AddContractor_Pkg__Claim_Page.Financial_Data_Recovery_Received_Medical_BI_Comp(driver).sendKeys("250");
		// System.out.println("Financial_Data_Recovery_Received_Medical_BI_Comp is
		// enetred succesfully");
		test.log(LogStatus.PASS, "Data Recovery Received Medical Bi is entered  ");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_paid_legal(driver).sendKeys("125");
		// System.out.println("Financial_Data_Insurer_paid_legal is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Insurance paid Legal  Bi is entered  ");
		AddContractor_Pkg__Claim_Page.Financial_Data_Claim_Amount(driver).sendKeys("1000");
		// System.out.println("Financial_Data_Claim_Amount is enetred succesfully");
		test.log(LogStatus.PASS, "Claim AMount is entered  ");
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AddContractor_Pkg__Claim_Page.Review_Admin_Markas_Confirm(driver).click();
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.Review_Admin_Action_Notes(driver).click();
		AddContractor_Pkg__Claim_Page.Review_Admin_Action_Notes(driver).sendKeys("this is for admin purpose only");
		// System.out.println("Action notes in the admin review tab is enetred
		// succesfully");
		test.log(LogStatus.PASS, "Action notes is entered  ");
		AddContractor_Pkg__Claim_Page.CloseBtn_ClaimsTab(driver).click();
		// System.out.println("close button is cliked suucesfully");
		test.log(LogStatus.PASS, "Close btn  is clciked   ");
		//driver.switchTo().window(id1);
		wb.Switchtoparent();
		// System.out.println("moved to parent window");
		test.log(LogStatus.PASS, "Moved to parent window");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "EditClaimsViaclaimsModule")));

	}

}
