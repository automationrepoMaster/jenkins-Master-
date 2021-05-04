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

public class AddClaimsViaCliamModuleTest extends BaseClass{

	static String Progname = "Hercules PG"; //"THANOS PG Name"; //"RAUTOMATION123";
	static String proName = "Hercules PJ";  //"Thanos PJ";  //"RAUT123";
	static String tradename = "2085";
	static String Contractor_Type = "WC & GL Enrollment";
	static String Contractor = "Hercules"; //" Ashley";
	
	WebDriverCommonLib wb=new WebDriverCommonLib();

	@Test

	public void ClaimAdditionModule() throws Throwable {

		AddContractor_Pkg__Claim_Page.ClaimModule_claimsICon(driver).click();
		
		Thread.sleep(2000);
		// System.out.println("Claim ICon is cliked succesfully");
		test.log(LogStatus.PASS, "Claim ICon is cliked succesfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.ClaimModule_AddBtn(driver).click();
		Thread.sleep(2000);
		// System.out.println("Claim AddBTn is cliked succesfully");
		test.log(LogStatus.PASS, "Claim Add Btn is cliked succesfully");
//		Set<String> ids = driver.getWindowHandles();
//		Object[] id = ids.toArray();
//		String id1 = id[0].toString();
//		String id2 = id[1].toString();
//		driver.switchTo().window(id2);
		//wb.SwitchtoChild1();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		 System.out.println("Moved to second window to claims page");
		test.log(LogStatus.PASS, "Moved to second Window on claims page succesfully");
		System.out.println(driver.getWindowHandles());
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		ClaimModule_page_Objects
//				.AddClaimsViaCliamModuleTest_Search_the_Contractor_Package_for_which_you_want_to_add_a_Claim()
//				.sendKeys(Contractor);
		Thread.sleep(2000);
//		ClaimModule_page_Objects.AddClaimsViaCliamModuleTest_SearchBtn().click();
		// System.out.println("Search button is clicked succesfully");
		test.log(LogStatus.PASS, "Search Button is cliked succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_AdvacneSearchBtn(driver).click();
		// System.out.println("Advanced Search button is clicked succesfully");
		test.log(LogStatus.PASS, "Advacne Search button  is cliked succesfully");
//		WebElement programme = AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SelectProgramme(driver);
//		Select Sprogramme = new Select(programme);
//		Sprogramme.selectByValue("1228");
		wb.selectSingleValue(AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SelectProgramme(driver),Progname);
		System.out.println("programme is selected succesfully from drop down list ");
		test.log(LogStatus.PASS, "Programme is selected from Drop down succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SearchContractor(driver).sendKeys(Contractor);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Contractor is selected from Drop down succesfully");
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SearchContractor(driver).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		WebElement project =AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_Selectproject(driver);
		Select Sproject = new Select(project);
		Sproject.selectByVisibleText(proName);
		test.log(LogStatus.PASS, "Project name  is selected from Drop down succesfully");
		System.out.println("project is selected succesfully from drop down list ");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SearchTrade(driver).sendKeys(tradename);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Trade name is selected from Drop down succesfully");
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SearchTrade(driver).sendKeys(Keys.ENTER);
		System.out.println("Trade is selected succesfully from drop down list ");
		WebElement Contractortype = AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_SelectContractor(driver);
		Select SContractortype = new Select(Contractortype);
		SContractortype.selectByVisibleText(Contractor_Type);
		test.log(LogStatus.PASS, "Contractor type  is selected from Drop down succesfully");
		// System.out.println("contractor type is selected succesfully from drop down
		// list ");
		Thread.sleep(4000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_Advacned_SearchBtnDown(driver).click();
		// System.out.println("Advnce search button at bottom is searched and selected
		// succesfully from drop down list ");
		test.log(LogStatus.PASS, "Adv sarch button is clicked  succesfully");
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_AdvacneSearch_radioBtn(driver).click();
		// System.out.println("contractor package is searched and selected succesfully
		// from drop down list ");
		test.log(LogStatus.PASS, "Contractorm package  is selected from Drop down succesfully");
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.AddClaimsViaCliamModuleTest_NextBtn(driver).click();
		Thread.sleep(3000);
		// System.out.println("Next button is cliked ");
		test.log(LogStatus.PASS, "nect button is clicked succesfully");
		Thread.sleep(4000);
//		Set<String> idss = driver.getWindowHandles();
//		Object[] idd = idss.toArray();
//		String idd2 = idd[1].toString();
//		driver.switchTo().window(idd2);
//		driver.manage().window().maximize();
		wb.SwitchtoChild1();
		System.out.println("Switched to child window1");
		Thread.sleep(3000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys("10/27/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_ClaimDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claim date is enetred succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Number(driver).sendKeys("1234");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Policy_Number(driver).sendKeys("1234");
		Thread.sleep(2000);
		WebElement claimLogStatus = AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Status(driver);
		Select SclaimLogStatus = new Select(claimLogStatus);
		SclaimLogStatus.selectByIndex(1);
		System.out.println("claim LogStatus   is Seelcted  ");
		test.log(LogStatus.PASS, "Claim LogStatus  is Selected  succesfully");
		Thread.sleep(2000);
		WebElement claimType = AddContractor_Pkg__Claim_Page.ClaimInfo_claim_Type(driver);
		Select SclaimType = new Select(claimType);
		SclaimType.selectByIndex(0);
		// System.out.println("claim type is Seelcted ");
		test.log(LogStatus.PASS, "Claim type is selected  succesfully");
		WebElement claimSpecificcode = AddContractor_Pkg__Claim_Page.claimInfo_Claim_Specific_Class_code(driver);
		Select SclaimSpecificcodee = new Select(claimSpecificcode);
		SclaimSpecificcodee.selectByIndex(1);
		// System.out.println("claim specific code is Seelcted ");
		test.log(LogStatus.PASS, "Claim Specificc date  is enetred succesfully");
		AddContractor_Pkg__Claim_Page.ClaimInfo_ReportDate(driver).sendKeys("10/06/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_ReportDate(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Closed_Date(driver).sendKeys("11/06/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Closed_Date(driver).sendKeys(Keys.TAB);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Primary_Physician_Used(driver).sendKeys("Raja the physian");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys("10/01/2020");
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Date(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Time(driver).sendKeys("16:30");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_Time(driver).sendKeys(Keys.TAB);

		AddContractor_Pkg__Claim_Page.ClaimInfo_Loss_code(driver).sendKeys("1234");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimInfo_Claim_Description(driver)
				.sendKeys("this is the claim description feild");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Name(driver).sendKeys("raja the claimant");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claimant name  is enetred succesfully");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_1(driver).sendKeys("Texas");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.ClaimantInfo_ClaimantAddress_2(driver).sendKeys("Texas");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claimant Address  is enetred succesfully");
		AddContractor_Pkg__Claim_Page.ClaimantInfo_Claimant_Phone(driver).sendKeys("99862520851234");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claimant  phone num  is enetred succesfully");
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_First_Name(driver).sendKeys("Raja");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_Last_Name(driver).sendKeys("Reddy");
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_Email(driver).sendKeys("raja.reddy@nourtek.com");
		test.log(LogStatus.PASS, "Claimant email is enetred succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Other_Info_Prepared_by_Telephone(driver).sendKeys("99862520851234");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_OS_Medical_BI_Comp(driver).sendKeys("1000");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Claimant Financial data is enetred succesfully");
		AddContractor_Pkg__Claim_Page.Financial_Data_Insurer_Paid_Medical_BI_Comp(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "Claimant Financial data Insurer paid medical BI comp is enetred succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Financial_Data_Recovery_Received_Medical_BI_Comp(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "Claimant Financial data recovery Medical BI comp paid medical BI comp is enetred succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Financial_Data_Claim_Amount(driver).sendKeys("1500");
		test.log(LogStatus.PASS, "Claimant Financial data recovery Medical BI comp paid medical BI comp is enetred succesfully");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(6000);
		AddContractor_Pkg__Claim_Page.Review_Admin_Markas_Confirm(driver).click();
		test.log(LogStatus.PASS, "Claimant Review Admin Marks Confirm   is clicked succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.Review_Admin_Action_Notes(driver)
				.sendKeys("This Action notes is for admin review only");
		test.log(LogStatus.PASS, "Admin review Action notes  is enetred succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg__Claim_Page.CloseBtn_ClaimsTab(driver).click();
		test.log(LogStatus.PASS, "cliams page close button is clicked succesfully ");
		//driver.switchTo().window(id1);
		wb.Switchtoparent();
		System.out.println("Switched to parent");
		//test.log(LogStatus.PASS, test.addScreenCapture(GenericLibrary.BaseClass.captureScreen(driver, "ClaimAdditionModule")));
		test.log(LogStatus.PASS, "Report Generated " + test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	}

}
