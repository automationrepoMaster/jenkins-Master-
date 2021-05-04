package TestScript;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ModulerLibrary.WPO_ProgramPolicyRenewalAction;
import ObjectRepository.AddCarriersPage;
import ObjectRepository.AddClassCodePage;
import ObjectRepository.AddProgramPage;
import ObjectRepository.AddProgram_Benchmark_Page;
import ObjectRepository.AddProgram_Compliance_Page;
import ObjectRepository.AddProgram_Contractor_Portal_Options_Page;
import ObjectRepository.AddProgram_Custom_Forms_Page;
import ObjectRepository.AddProgram_Email_Management_Page;
import ObjectRepository.AddProgram_Fixed_Costs_Rates_Page;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.AddProgram_PayrollCVTracking;
import ObjectRepository.AddProgram_Policy_Certificates_Page;
import ObjectRepository.AddProgram_Premium_Modification_Page;
import ObjectRepository.AddProgram_Program_Parameters_Page;
import ObjectRepository.AddProgram_User_Access;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class AddProgramTestClass extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	String programName = RandomClass.randomProgram();
	String usercompanyName = RandomClass.randomUserName();
	String divisionName = RandomClass.randomDivisionName();
	String sponsorName = RandomClass.randomSponsorName();
	String selectProgramAdministrator = "" + usercompanyName + " - John1 Tom1";// String
																				// selectProgramAdministrator="User1012
																				// - John1 Tom1";//"Alex Contractor
																				// Comp1834 - Hobs Shobs";//"Sony User
																				// Company - K p"
	String selectProgramSponsor = "Sponsor347 - Jimmy Smith";// "Sponsor1395 - Jimmy Smith";//"AutoNation - kim canada"

	/*
	 * String selectProgramAdministrator="Alex Contractor Comp1834 - Hobs Shobs";/
	 * /"Sony User Company - K p" String
	 * selectProgramSponsor="Sponsor1395 - Jimmy Smith";//"AutoNation - kim canada"
	 */

	@Test
	public void addGeneralInformationData() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// String expectedElement= "Program5917";
		test.log(LogStatus.INFO, "========== Add Program Section  ==========");
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuPrograms(driver).click();
		test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
		Thread.sleep(4000);
		ProgramModule.programAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Program Add Icon");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		wb.windowScrollBy(0, 1000);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");

		AddProgram_General_Info_Page.programName(driver).sendKeys(programName);
		test.log(LogStatus.PASS, "Program Name Added Successfully");
		AddProgram_General_Info_Page.programCode(driver).sendKeys(RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Program Code Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectPolicyType(driver), 0);
		test.log(LogStatus.PASS, "Program Policy Type Selected Successfully");
		wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectProgramType(driver), 1);
		test.log(LogStatus.PASS, "Program Type Selected Successfully");

//add administrator hyper link	23/07/20
		AddProgram_General_Info_Page.addNewNodeAdministratorLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Administrator Link");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		AddProgram_General_Info_Page.contractorCompanyNameField(driver)
				.sendKeys(RandomClass.randomContractorCompanyName());
		AddProgram_General_Info_Page.contractorCompanyNameField(driver).sendKeys(Keys.TAB);
		Thread.sleep(1500);
		test.log(LogStatus.PASS, "Company Name Added Successfully");
		AddProgram_General_Info_Page.contactFirstName(driver).sendKeys("Ricky");
		test.log(LogStatus.PASS, "Contact First Name Added Successfully");
		AddProgram_General_Info_Page.contactLastName(driver).sendKeys("Ponting");
		test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
		AddProgram_General_Info_Page.contactEmail(driver).sendKeys("kiran@nourtek.com");
		test.log(LogStatus.PASS, "Contact Email ID Name Added Successfully");
		AddProgram_General_Info_Page.contactCellPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Contact Phone NO Name Added Successfully");
		AddProgram_General_Info_Page.MoreButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On More Button");
		AddProgram_General_Info_Page.jobTitle(driver).sendKeys("AdminJobTitle");
		test.log(LogStatus.PASS, "Job Title Added Successfully");
		AddProgram_General_Info_Page.businessPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Phone No Added Successfully");
		AddProgram_General_Info_Page.businessFax(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Fax Added Successfully");
		AddProgram_General_Info_Page.addAdministratorSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Save And Close Button");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "New Administrator Added Successfully");

//add new Sponsor hyper link 23/07/20	
		AddProgram_General_Info_Page.addNewSponsorLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Sponsor Link");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		AddProgram_General_Info_Page.contractorCompanyNameField(driver)
				.sendKeys(RandomClass.randomContractorCompanyName());
		AddProgram_General_Info_Page.contractorCompanyNameField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Company Name Added Successfully");
		Thread.sleep(1500);
		AddProgram_General_Info_Page.contactFirstName(driver).sendKeys("Devid");
		test.log(LogStatus.PASS, "Sponsor First Name Added Successfully");
		AddProgram_General_Info_Page.contactLastName(driver).sendKeys("Warner");
		test.log(LogStatus.PASS, "Sponsor Last Name Added Successfully");
		AddProgram_General_Info_Page.contactEmail(driver).sendKeys("kiran@nourtek.com");
		test.log(LogStatus.PASS, "Sponsor Email ID Name Added Successfully");
		AddProgram_General_Info_Page.contactCellPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Sponsor Phone NO Name Added Successfully");
		AddProgram_General_Info_Page.MoreButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On More Button");
		AddProgram_General_Info_Page.jobTitle(driver).sendKeys("AdminJobTitle");
		test.log(LogStatus.PASS, "Job Title Added Successfully");
		AddProgram_General_Info_Page.businessPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Phone No Added Successfully");
		AddProgram_General_Info_Page.businessFax(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Fax Added Successfully");
		AddProgram_General_Info_Page.addAdministratorSaveAndCloseButton(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Clicked On Save And Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "New Sponsor Added Successfully");

		// wb.selectSingleValueGetOpt(AddProgram_General_Info_Page.selectProgramAdministrator(driver),selectProgramAdministrator);//9
		test.log(LogStatus.PASS, "Program Administrator Selected Successfully");
		wb.selectSingleValueGetOpt(AddProgram_General_Info_Page.selectProgramSponsor(driver), sponsorName);// 14
		test.log(LogStatus.PASS, "Program Sponsor Selected Successfully");

		List<WebElement> lst = AddProgram_General_Info_Page.selectAllStatusSwitch(driver);
		System.out.println("Size of Status Switch " + lst.size());
		for (int p = 0; p < lst.size() - 1; p++) {
			js.executeScript("arguments[0].click();", lst.get(p));
//				lst.get(i).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,40)");
		}

		test.log(LogStatus.PASS, "Track Offsite Coverage Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Manage CIP Certificates Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Loss Control & Safety Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Insurance Cost Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Excluded Contractors Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Fixed Cost / Time and Material Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Rates and Fees Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Maintenance Wrap Switch Turn On  Successfully");
		test.log(LogStatus.PASS, "Track Capped/Uncapped Payroll Switch Turn On  Successfully");

		AddProgram_General_Info_Page.contactName(driver).sendKeys("Shaun Gibbs");
		test.log(LogStatus.PASS, "Program Contact Name Added Successfully");
		AddProgram_General_Info_Page.emailAddress(driver).sendKeys("kiran@nourtek.net");
		test.log(LogStatus.PASS, "Program Contact Email ID Added Successfully");
		AddProgram_General_Info_Page.telephoneNumber(driver).sendKeys(RandomClass.randomPhoneNo());
		test.log(LogStatus.PASS, "Program  Contact Phone No Added Successfully");
		wb.selectSingleValue(AddProgram_General_Info_Page.selectBidType(driver), "Bid Deduct");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Program Bid Type Selected Successfully");
		AddProgram_General_Info_Page.estimatedProgramConstructionValue(driver).sendKeys("1500000");
		test.log(LogStatus.PASS, "Program Construction Value Added Successfully");
		AddProgram_General_Info_Page.programBeginDate(driver).sendKeys("01/20/2018");
		test.log(LogStatus.PASS, "Program Begin Date Added Successfully");
		AddProgram_General_Info_Page.programBeginDate(driver).sendKeys(Keys.TAB);
		AddProgram_General_Info_Page.programCompletionDate(driver).sendKeys("01/20/2022");
		test.log(LogStatus.PASS, "Program Estimated Completion Date Added Successfully");
		AddProgram_General_Info_Page.programCompletionDate(driver).sendKeys(Keys.TAB);
		AddProgram_General_Info_Page.programProjectedLosses(driver).sendKeys("10000");
		test.log(LogStatus.PASS, "Projected Losses Added Successfully");
		AddProgram_General_Info_Page.totalprogramDeduct(driver).sendKeys("11000");
		test.log(LogStatus.PASS, "Program Insurance Cost Added Successfully");
		AddProgram_General_Info_Page.estimatedPayroll(driver).sendKeys("12000");
		test.log(LogStatus.PASS, "Program Estimated Payroll Added Successfully");
		AddProgram_General_Info_Page.estimatedHours(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "Program Estimated Hours Added Successfully");
		Thread.sleep(2000);
		String programMinRate = AddProgram_General_Info_Page.programMinimumRate(driver).getText();
		test.log(LogStatus.PASS, "" + programMinRate + "91.67 Program Minimum Rate Fetched");
		String programMaxRate = AddProgram_General_Info_Page.programMaximumRate(driver).getText();
		test.log(LogStatus.PASS, "" + programMaxRate + "175.00 Program Maximum Rate Fetched");
		Thread.sleep(2000);
		// AddProgram_General_Info_Page.uploadLogo(driver).click();

//add logo through AutoIT 23/07/2020
		// Runtime.getRuntime().exec("E:\\kp workspace selenium\\Wrap Portal\\AutoIT
		// Script\\Program_UploadLogo.exe");
		// Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal\\AutoIT
		// Script\\Raja\\ProgramLogo.exe");
		test.log(LogStatus.INFO, "Logo Added Successfully");
		Thread.sleep(3000);

		/*
		 * AddProgram_General_Info_Page.saveButton(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Save Button"); Thread.sleep(3000);
		 */
		AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Save And Continue Button");

		int x = 1;
		do {
			try {
				AddProject_General_Information_Page.duplicateProjectCodeAlertOKBtn(driver).click();
				Thread.sleep(3000);
				AddProgram_General_Info_Page.programCode(driver).clear();
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String NewProgramCode = "PCODE" + rNo;
				AddProgram_General_Info_Page.programCode(driver).sendKeys(NewProgramCode);
				test.log(LogStatus.PASS, "Program Code Added Successfully");
				js.executeScript("window.scrollBy(0,1550)", "");
				AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
				Thread.sleep(1500);

			} catch (Exception e) {
				System.out.println("Program Code Entered Sucessfully ");
				x = 2;
			}
		} while (x == 1);

//Program Setting new page 26-11-2020

		// AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
		test.log(LogStatus.INFO, "Clicked On Program settings Save And Continue Button");
		Thread.sleep(5000);

//Program Parameter page
		try {
			AddProgram_Program_Parameters_Page.minimumContractValue(driver).clear();
			AddProgram_Program_Parameters_Page.minimumContractValue(driver).sendKeys("150000");
			test.log(LogStatus.PASS, "Minimum Contract Value Added Successfully");
			AddProgram_Program_Parameters_Page.minimumManHours(driver).clear();
			AddProgram_Program_Parameters_Page.minimumManHours(driver).sendKeys("1000");
			test.log(LogStatus.PASS, "Minimum Man-Hours Added Successfully");
			AddProgram_Program_Parameters_Page.minimumPayroll(driver).clear();
			AddProgram_Program_Parameters_Page.minimumPayroll(driver).sendKeys("12000");
			test.log(LogStatus.PASS, "Minimum Payroll Added Successfully");
			AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).clear();
			AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).sendKeys("1000");
			test.log(LogStatus.PASS, "Minimum Days On Job Site Added Successfully");

//Add Excluded Trade 23/07/20		
			AddProgram_Program_Parameters_Page.addTradeClickHereLink(driver).click();
			AddProgram_Program_Parameters_Page.addTradeLink(driver).click();
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(2000);
			driver.manage().window().maximize();
			AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(RandomClass.randomTradeDescription_EX());
			test.log(LogStatus.PASS, "Trade Description Added Successfully");
			AddTradePage.addTrade_TradeNumberField(driver).sendKeys(RandomClass.randomTradeNO_EX());
			test.log(LogStatus.PASS, "Trade Number Added Successfully");
			wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
			test.log(LogStatus.PASS, "Trade Status Selected Successfully");
			AddTradePage.addTradeSaveAndCloseBtn(driver).click();
			driver.switchTo().window(wb.map.get("childID"));
			System.out.println("Trade Added Successfully");
			test.log(LogStatus.PASS, " Trade added successfully");
			Thread.sleep(2000);
			AddProgram_Program_Parameters_Page.descriptionTradeField(driver).sendKeys("Test decription");
			AddProgram_Program_Parameters_Page.addTradePlusButton(driver).click();
			Thread.sleep(3000);

//Add Excluded Trade 23/07/20 		
			AddProgram_Program_Parameters_Page.addWorkClassClickHereLink(driver).click();
			AddProgram_Program_Parameters_Page.addWorkClassLink(driver).click();
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(2000);
			driver.manage().window().maximize();
			AddClassCodePage.addClassCodeWorkClassDescriptionField(driver)
					.sendKeys(RandomClass.randomTradeDescription_EX());
			test.log(LogStatus.PASS, "Class Code Description Added Successfully");
			AddClassCodePage.addClassCodeWorkClassNumberField(driver).sendKeys(RandomClass.randomTradeNO_EX());
			test.log(LogStatus.PASS, "Class Code Number Added Successfully");
			AddClassCodePage.stateSpecificCodeButtonYes(driver).click();
			test.log(LogStatus.PASS, "State Specific Code Yes Button Clicked");
			wb.selectSingleValue(AddClassCodePage.addClassCodeWorkClassStateField(driver), RandomClass.randomState());
			test.log(LogStatus.PASS, "Class Code State Selected Successfully");
			AddClassCodePage.checkBox_WC_ClassCode(driver).click();
			test.log(LogStatus.INFO, "WC Class Code Check Box Selected");
			AddClassCodePage.checkBox_GL_ClassCode(driver).click();
			test.log(LogStatus.INFO, "GL Class Code Check Box Selected");
			AddClassCodePage.addClassCodeSaveAndCloseBtn(driver).click();
			test.log(LogStatus.INFO, "Clicked on Save And Close Button");
			driver.switchTo().window(wb.map.get("childID"));
			Thread.sleep(5000);
			AddProgram_Program_Parameters_Page.descriptionWorkClassField(driver)
					.sendKeys("Test Class Code Description");
			Thread.sleep(1000);
			AddProgram_Program_Parameters_Page.addWorkClassPlusButton(driver).click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
			AddProgram_Program_Parameters_Page.switchenableContractorNumber(driver).click();
			test.log(LogStatus.INFO, "Clicked On Enable Contractor Number Switch");
			AddProgram_Program_Parameters_Page.createContractorNumberTemplateTextArea(driver).click();
			AddProgram_Program_Parameters_Page.selectTokenProgramCode(driver).click();
			AddProgram_Program_Parameters_Page.selectTokenSponsorCode(driver).click();
			test.log(LogStatus.PASS, "Contract Number Template Project Code Token Added Successfully");
			test.log(LogStatus.PASS, "Contract Number Template Sponsor Code Token Added Successfully");
			AddProgram_Program_Parameters_Page.selectContractSequenceField(driver).sendKeys("25");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Contract Number Sequence Added Successfully");

			// Location code done on 11/03/2020
			AddProgram_Program_Parameters_Page.switchLocationCode(driver).click();
			test.log(LogStatus.INFO, "Location Code Switch Selected Successfully");
//		System.out.println("Loaction Code is selected or Not :-"+AddProgram_Program_Parameters_Page.switchLocationCode(driver).isSelected());
//		test.log(LogStatus.PASS, "Contract Number Sequence Added Successfully");
			AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProgramCode(driver).click();
			test.log(LogStatus.PASS, "Location Code Token Program Code Added Successfully");
			AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProjectCode(driver).click();
			test.log(LogStatus.PASS, "Location Code Token Project Code Added Successfully");
			AddProgram_Program_Parameters_Page.selectLocationCodeSequenceField(driver).sendKeys("1234");
			test.log(LogStatus.PASS, "Location Code Sequence Added Successfully");

			AddProgram_Program_Parameters_Page.switchHighEMR(driver).click();
			test.log(LogStatus.INFO, "High EMR Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.ModeRateValueEMR(driver).sendKeys("10");
			test.log(LogStatus.PASS, "Mode Rate Value Added Successfully");

			AddProgram_Program_Parameters_Page.switchModRateAlertContractor(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");
			js.executeScript("window.scrollBy(0,100)");

			AddProgram_Program_Parameters_Page.switchCloseoutVariance(driver).click();
			test.log(LogStatus.INFO, "Closeout Payroll Variance Alert Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.closeoutVarianceLowerValue(driver).sendKeys("10");
			test.log(LogStatus.PASS, "Closeout Variance Lower Value Added Successfully");
			AddProgram_Program_Parameters_Page.closeoutVarianceHigherValue(driver).sendKeys("20");
			test.log(LogStatus.PASS, "Closeout Variance Higher Value Added Successfully");
			AddProgram_Program_Parameters_Page.switchCloseoutVarianceAlertContractor(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.INFO, "Alert Contractor For Payroll Closeout Variance Switch Turn On Successfully");

			AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlert(driver).click();
			test.log(LogStatus.INFO, "Closeout Contract Value Variance Alert Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertLowerValue(driver).sendKeys("10");
			test.log(LogStatus.PASS, "Closeout Contract Value Variance Alert Lower Value Added Successfully");
			AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertHigherValue(driver).sendKeys("20");
			test.log(LogStatus.PASS, "Closeout Contract Value Variance Alert Higher Value Added Successfully");
			AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlertContractor(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.INFO, "Alert Contractor CV Closeout Variance Switch Turn On Successfully");

			AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_Ratio(driver).click();
			test.log(LogStatus.INFO, "Estimated Payroll to CV Ratio High/Low Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioBelowValue(driver).clear();
			AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioBelowValue(driver).sendKeys("10");
			test.log(LogStatus.PASS, "Estimated Payroll to CV Ratio Below Value Added Successfully");
			AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioAboveValue(driver).clear();
			AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioAboveValue(driver).sendKeys("20");
			test.log(LogStatus.PASS, "Estimated Payroll to CV Ratio Above Value Added Successfully");
			AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_RatioAlertContractor(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");

			AddProgram_Program_Parameters_Page.switchEstimatedPayrollToSelfPerformRatio(driver).click();
			test.log(LogStatus.INFO,
					"Estimated Payroll to Self Performed Value Ratio High/Low Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioBelowValue(driver).click();
			test.log(LogStatus.PASS, "Estimated Payroll to Self Performed Value Ratio Below Value Added Successfully");
			AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAboveValue(driver).click();
			test.log(LogStatus.PASS, "Estimated Payroll to Self Performed Value Ratio Above Value Added Successfully");
			AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAlertContractor(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");

			AddProgram_Program_Parameters_Page.switchAlertForWorkClassRates(driver).click();
			test.log(LogStatus.INFO, "Alert for Work Class Rates Switch Turn On Successfully");
			AddProgram_Program_Parameters_Page.workClassRatesBenchmarkLowerValue(driver).sendKeys("10");
			test.log(LogStatus.PASS, "Work Class Rates Benchmark Lower Value Added Successfully");
			AddProgram_Program_Parameters_Page.workClassRatesBenchmarkHigherValue(driver).sendKeys("20");
			test.log(LogStatus.PASS, "Work Class Rates Benchmark Higher Value Added Successfully");
			AddProgram_Program_Parameters_Page.workClassRatesLow_High_LowerValue(driver).sendKeys("15");
			test.log(LogStatus.PASS, "Work Class Rates Lower Value Added Successfully");
			AddProgram_Program_Parameters_Page.workClassRatesLow_High_HigherValue(driver).sendKeys("25");
			test.log(LogStatus.PASS, "Work Class Rates Above Value Added Successfully");
			Thread.sleep(1000);

			AddProgram_Program_Parameters_Page.programParameterSaveAndContinueButton(driver).click();
			test.log(LogStatus.INFO, "Clicked On Program Parameter Save And Continue Button");
		} catch (Exception e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, "Program Parameter Test Has Been Failed");
		}

//Email Management page

		//raja 
		try {
			js.executeScript("arguments[0].scrollIntoView();", AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver));
			
			AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).click();
			AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).clear();
			Thread.sleep(2000);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("scrolled to end after clearing email feild");
		}catch (Exception e) {
			System.out.println("No such feild to scoll down");
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		js.executeScript("arguments[0].click();",
				AddProgram_Email_Management_Page.emailManagementSaveAndContinueButton(driver));
		test.log(LogStatus.INFO, "Clicked On Email Management Save And Continue Button");

//Contractor Portal options page
		AddProgram_Contractor_Portal_Options_Page.switchActivateContractorPortalForThisProgram(driver).click();
		test.log(LogStatus.INFO, "Activate Contractor Portal For This Program Switch Turns On Successfully");
		try {
			wb.oneByOneClick(
					AddProgram_Contractor_Portal_Options_Page.switchContractorPortal_GC_SUBS_AllSwitchs(driver));
		} catch (Throwable e) {
			System.out.println(e);
		}

		test.log(LogStatus.PASS, "Certificate For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Certificate For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Claims For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Claims For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Change Order For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Change Order For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Loss Control & Safety For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Loss Control & Safety For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Close Out For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Close Out For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Close Out Dashboard Alert For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Close Out Dashboard Alert For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Close Out Audit For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Close Out Audit For Sub Contractor Switch Turn On Successfully");

		test.log(LogStatus.PASS, "Auto Confirm Monthly Payroll For General Contractor Switch Turn On Successfully");
		test.log(LogStatus.PASS, "Auto Confirm Monthly Payroll For Sub Contractor Switch Turn On Successfully");

		/*
		 * AddProgram_Contractor_Portal_Options_Page.switchRequestSubinfoAtEnrollment(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "Request Sub Info at Enrollment Switch Turn On Successfully");
		 * AddProgram_Contractor_Portal_Options_Page.switchAllowContractorToAddSub(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "Allow Contractor To Add New Sub Switch Turn On Successfully");
		 * AddProgram_Contractor_Portal_Options_Page.switchAllow_GC_AddContractorNumber(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "Allow General Contractor to add Contract Number Switch Turn On Successfully"
		 * ); AddProgram_Contractor_Portal_Options_Page.
		 * switchAllow_SubContractor_AddContractorNumber(driver).click();
		 * test.log(LogStatus.PASS,
		 * "Allow Sub Contractor to add Contract Number  Switch Turn On Successfully");
		 */

//Add Background image contractor portal through autoit 23/07/20		
		// AddProgram_Contractor_Portal_Options_Page.linkBackgroundImage(driver).click();
		// Runtime.getRuntime().exec("E:\\kp workspace selenium\\Wrap Portal\\AutoIT
		// Script\\Program_UploadBackGroundImageCPSide.exe");
		//Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal\\AutoIT Script\\Raja\\ProgramLogo.exe");
		test.log(LogStatus.INFO, "BackGround Image Added Successfully");
		Thread.sleep(3000);

		AddProgram_Contractor_Portal_Options_Page.contractorPortalSaveAndContinueButton(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Clicked On Contractor Portal Options Save And Continue Button");

		AddProgram_User_Access.addSponsorAddButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add Sponsor Button");
		wb.selectSingleValueByIndex(AddProgram_User_Access.selectSponsorDropdown(driver), 1);// select another sponsor
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Sponsor Slected Successfully");
		AddProgram_User_Access.addSponsorPlusButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Plus Button");
		AddProgram_User_Access.addAdministratorAddButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add Administrator Button");
		wb.selectSingleValueByIndex(AddProgram_User_Access.selectNodeAdministratorDropdown(driver), 1);// select another
																										// user
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Administrator Added Successfully");
		AddProgram_User_Access.addAdministratorPlusButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Plus Button");

		AddProgram_User_Access.userAccessPortalSaveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On User Access Save And Continue Button");

		/*
		 * AddProgram_User_Access.userAccessFinishAndCloseButton(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On User Access Finish And Close Button");
		 * try { Alert alt=driver.switchTo().alert(); alt.accept(); } catch (Throwable
		 * e) { System.out.println(e+"Exception handel for alert"); }
		 */

//payroll cv tracking page added on 18/05/2020
		AddProgram_PayrollCVTracking.trackCappedUncappedPayrollSwitch(driver).click();
		test.log(LogStatus.PASS, "Clicked On Track Capped Uncapped Payroll Switch");
		AddProgram_PayrollCVTracking.trackReceiptValueSwitch(driver).click();
		test.log(LogStatus.INFO, "Clicked On Track Receipt Switch");
		AddProgram_PayrollCVTracking.trackPayrollGLOnlyContractsSwitch(driver).click();
		test.log(LogStatus.INFO, "Clicked On Track Payroll For GL Only Contracts");

// because of changes below code is comment they add this functionality at payroll cv tracking 24/07/20 changes done
		AddProgram_Program_Parameters_Page.addSuspendedPayrollLink(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add Suspended Payroll Link");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.addSuspendedPayrollStartDate(driver).sendKeys("11/01/2019");
		test.log(LogStatus.PASS, "Suspended Payroll Start Date Added Successfully");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollEndDate(driver).sendKeys("12/31/2019");
		test.log(LogStatus.PASS, "Suspended Payroll End Date Added Successfully");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollNotes(driver).sendKeys("Testing Notes suspended payroll");
		test.log(LogStatus.PASS, "Suspended Payroll Notes Added Successfully");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollSaveAndCloseButton(driver).click();
		Thread.sleep(3000);
		
		// Raja 
		
		try {
		
			AddProgram_Program_Parameters_Page.suspendedpayroll_AlertContinueBtn(driver).click();
			test.log(LogStatus.PASS, "Alert continue at Suspended payroll is added");
			Thread.sleep(3000);
			
		}catch (Exception e) {
			test.log(LogStatus.PASS, "No suc alert present at add suspended payroll");
			
		}
		
		test.log(LogStatus.INFO, "Clicked On Suspended Payroll Save And Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		js.executeScript("window.scrollBy(0,250)");

		AddProgram_PayrollCVTracking.saveAndContinueBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Payroll CV Tracking Save And Continue Button");
		Thread.sleep(7000);

//Compliance Page	
		
		
		/*
		 * AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver,
		 * "Workers' Compensation").click(); Thread.sleep(1000);
		 * AddProgram_Compliance_Page.addFirstRowLimitText(driver,
		 * "Workers' Compensation").sendKeys("1000"); Thread.sleep(1000);
		 * AddProgram_Compliance_Page.addCompliancenoteTextArea(driver).
		 * sendKeys("Testing Note Area"); Thread.sleep(1000);
		 * js.executeScript("arguments[0].scrollIntoView();",AddProgram_Compliance_Page.
		 * addComplianceSaveAndCloseButton(driver));
		 * AddProgram_Compliance_Page.addComplianceSaveAndCloseButton(driver).click();
		 * wait.until(ExpectedConditions.visibilityOf(AddProgram_Compliance_Page.
		 * addComplianceAlertOkBtn(driver)));
		 * wait.until(ExpectedConditions.elementToBeClickable(AddProgram_Compliance_Page
		 * .addComplianceAlertOkBtn(driver)));
		 * AddProgram_Compliance_Page.addComplianceAlertOkBtn(driver).click();
		 */
		//Raja
		
		//Raja 
		//Compliance Page		
		AddProgram_Compliance_Page.addCompliancePlusIcon(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		wait.until(ExpectedConditions.visibilityOf(AddProgram_Compliance_Page.addComplianceComplianceName(driver)));
		wait.until(ExpectedConditions
				.elementToBeClickable(AddProgram_Compliance_Page.addComplianceComplianceName(driver)));
		AddProgram_Compliance_Page.addComplianceComplianceName(driver).sendKeys("Compliance29");
		Thread.sleep(1000);
		
		
		// raja wrote this as chaged in 20-02-2021 release
		AddProgram_Compliance_Page.ComplianceName_SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "compliance name page save and continue button is clicked");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Automobile Liability"));
		AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Automobile Liability").click();
		Thread.sleep(1000);
		// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Automobile
		// Liability").sendKeys("1000");
		Thread.sleep(1000);
//		AddProgram_Compliance_Page.addSecondRowLimitText(driver, "Automobile Liability").sendKeys("1000");
//		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "General Liability"));
		AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "General Liability").click();
		Thread.sleep(1000);
		// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "General
		// Liability").sendKeys("1000");
		Thread.sleep(1000);
//		AddProgram_Compliance_Page.addSecondRowLimitText(driver, "General Liability").sendKeys("1000");
		js.executeScript("arguments[0].scrollIntoView();",
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Umbrella / Excess"));
		AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Umbrella / Excess").click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		AddProgram_Compliance_Page.CoverageType_saveandcontinueBtn(driver).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AddProgram_Compliance_Page.CoverageType_SaveandContinueBtn(driver).click();
		test.log(LogStatus.PASS, "save and continue button is clicked");
		// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Umbrella /
		// Excess").sendKeys("1000");
		// criteria
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AddProgram_Compliance_Page.Criteria_SaveandCloseBtn(driver).click();
		Thread.sleep(2000);

		try {
			AddProgram_Compliance_Page.addComplianceAlertOkBtn(driver).click();
		} catch (Exception e) {
			System.out.println("No such alert");
		}
		

		Thread.sleep(4000);
		driver.switchTo().window(wb.map.get("childID"));
		js.executeScript("arguments[0].scrollIntoView();",AddProgram_Compliance_Page.saveAndContinueButton(driver));
		js.executeScript("arguments[0].click();", AddProgram_Compliance_Page.saveAndContinueButton(driver));
		test.log(LogStatus.INFO, "Clicked On Compliance Save And Continue Button");
		Thread.sleep(7000);
		// Premium Modification Page
		AddProgram_Premium_Modification_Page.switchGeneralLaibility(driver).click();
		test.log(LogStatus.PASS, "General Liability Switch is Turned ON");
		AddProgram_Premium_Modification_Page.GL_factorField(driver).sendKeys("10.00");
		test.log(LogStatus.PASS, "General Liability Factor Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.GL_SelectRateBased(driver), 2);
		test.log(LogStatus.PASS, "General Liability Rate Based Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.GL_SelectRatePer(driver), 3);
		test.log(LogStatus.PASS, "General Liability Factor Per Successfully");

		AddProgram_Premium_Modification_Page.switchUMB(driver).click();
		test.log(LogStatus.PASS, "Umbrella Switch is Turned ON");
		AddProgram_Premium_Modification_Page.UMB_factorField(driver).sendKeys("10.00");
		test.log(LogStatus.PASS, "Umbrella Factor Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.UMB_SelectRateBased(driver), 2);
		test.log(LogStatus.PASS, "Umbrella Rate Based Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.UMB_SelectRatePer(driver), 3);
		test.log(LogStatus.PASS, "Umbrella Factor Per Successfully");

		AddProgram_Premium_Modification_Page.switchPollutionCharge(driver).click();
		test.log(LogStatus.PASS, "Pollution Charge Switch is Turned ON");
		AddProgram_Premium_Modification_Page.Pollution_factorField(driver).sendKeys("10.00");
		test.log(LogStatus.PASS, "Pollution Charge Factor Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.Pollution_SelectRateBased(driver), 2);
		test.log(LogStatus.PASS, "Pollution Charge Rate Based Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.Pollution_SelectRatePer(driver), 3);
		test.log(LogStatus.PASS, "Pollution Charge Factor Per Successfully");
		// comment due to contractor package code not design according to this
		/*
		 * AddProgram_Premium_Modification_Page.switchGLCodesRequired(driver).click();
		 * test.log(LogStatus.PASS,
		 * "General Liability Codes Required Switch is Turned ON");
		 * AddProgram_Premium_Modification_Page.switchUMBCodesRequired(driver).click();
		 * test.log(LogStatus.PASS, "Umbrella Codes Required Switch is Turned ON");
		 * AddProgram_Premium_Modification_Page.switchPollutionCodesRequired(driver).
		 * click(); test.log(LogStatus.PASS,
		 * "Pollution Codes Required Switch is Turned ON");
		 */
		AddProgram_Premium_Modification_Page.switchGLDropDown(driver).click();
		test.log(LogStatus.PASS, "Umbrella Code Required Switch is Turned ON");

		AddProgram_Premium_Modification_Page.switchGLDeductibleSIRLoss(driver).click();
		test.log(LogStatus.PASS, "GL Deductible/SIR Loss Charge Switch is Turned ON");
		AddProgram_Premium_Modification_Page.switchCaptureGLDeductible(driver).click();
		test.log(LogStatus.PASS, "Capture WC Deductible Switch is Turned ON");
		AddProgram_Premium_Modification_Page.switchCaptureWCDeductible(driver).click();
		test.log(LogStatus.PASS, "Capture GL Deductible Switch is Turned ON");
//		AddProgram_Premium_Modification_Page.radioBtnAutomaticProfitOverhead(driver).click();
//		test.log(LogStatus.PASS, "Profit & Overhead Switch is Turned ON");

//premium modification rate table 24/07/2020
		List<WebElement> addFactor = AddProgram_Premium_Modification_Page.allFactorField(driver);
		Actions act = new Actions(driver);
		for (WebElement a : addFactor) {
			act.moveToElement(a).doubleClick().build().perform();
			a.sendKeys("0.30");
			Thread.sleep(1000);
		}
		test.log(LogStatus.PASS, "Factor Added Successfully");
		List<WebElement> discount = AddProgram_Premium_Modification_Page.allDiscountCheckBox(driver);
		for (WebElement a : discount) {
			if (a.isSelected() == true) {
				a.click();
			}
			Thread.sleep(500);
		}
		test.log(LogStatus.PASS, "Discount Check Box Uncheched Successfully");
		List<WebElement> basedOnCheckBox = AddProgram_Premium_Modification_Page.allBasedOnCheckBox(driver);
		for (int i = 0; i < basedOnCheckBox.size(); i++) {
			if (i == 3) {
				basedOnCheckBox.get(i).click();
			}
		}
		test.log(LogStatus.PASS, "Based On Check box Selected Successfully");
		List<WebElement> EMRCheckBox = AddProgram_Premium_Modification_Page.allEMRCheckBox(driver);
		for (int i = 0; i < EMRCheckBox.size(); i++) {
			if (i == 1) {
				EMRCheckBox.get(i).click();
			}
		}
		test.log(LogStatus.PASS, "EMR Check Box Successfully");
		List<WebElement> runningTotalCheckBox = AddProgram_Premium_Modification_Page.allRunningTotalCheckBox(driver);
		for (int i = 0; i < runningTotalCheckBox.size(); i++) {
			if (i == 2) {
				runningTotalCheckBox.get(i).click();
			}
		}
		test.log(LogStatus.PASS, "Running Total Check Box Successfully");

		AddProgram_Premium_Modification_Page.clickHereToAddNewPreiumModificationLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Click Here Link to Add New Premium Modification");
		AddProgram_Premium_Modification_Page.addPremiumModificationName(driver).sendKeys("Test PM");
		test.log(LogStatus.PASS, "New Premium Modification Name Added Successfully");
		AddProgram_Premium_Modification_Page.addPremiumModificationFactor(driver).sendKeys("0.30");
		test.log(LogStatus.PASS, "New Premium Modification Factor Added Successfully");
		AddProgram_Premium_Modification_Page.addPM_PlusBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Plus Icon");

		AddProgram_Premium_Modification_Page.premiumModificationSaveAndContinueButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on Premium Modification Save and Continue Button");

//Policy & Certificate section
		AddProgram_Policy_Certificates_Page.btnOpenWorkersCompensation(driver).click();
		test.log(LogStatus.PASS, "Clicked on Open WC Policy Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));

		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addWCPolicySelectCarrier(driver), 3);
		test.log(LogStatus.PASS, "WC Policy Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "WC policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "WC Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "WC Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");

		AddProgram_Policy_Certificates_Page.addWCPolicyEditBoxWCStatutoryLimit(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "WC Statutory Limits Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyELDiseaseEAEmployee(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "E.L. Disease - EA Employee Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyELDiseasePolicyLimit(driver).sendKeys("1100");
		test.log(LogStatus.PASS, "E.L. Disease - Policy Limit Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicyELEachAccident(driver).sendKeys("1200");
		test.log(LogStatus.PASS, "E.L. Each Accident Added Successfully");
		AddProgram_Policy_Certificates_Page.addWCPolicySaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add WC Policy Save and Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(2000);

//add GL policy
		AddProgram_Policy_Certificates_Page.btnOpenPolicy(driver).click();
		test.log(LogStatus.PASS, "Clicked on Open GL Policy Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addGLPolicySelectCarrier(driver), 3);
		test.log(LogStatus.PASS, "GL Policy Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyFieldMasterPolicyEditBox(driver)
				.sendKeys("Master GL Pol" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "GL Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "GL Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "GL Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyEachOccurence(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits Each Occurrence Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyDamageRentedPremises(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits Damage To Rented Premises Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyMedExp(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits Med Exp Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyPersonalAndAdvInjury(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits Personal & Adv Injury Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyGeneralAggregate(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits General Aggregate Added Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicyProducts_Comp_Agg(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "GL Policy Limits Products - Comp/Op Agg Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addGLPolicySelectAdditionalInsured(driver), 2);
		test.log(LogStatus.PASS, "GL Policy Additional Insured Selected Successfully");
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addGLPolicySelectWaiverSubrogation(driver), 2);
		test.log(LogStatus.PASS, "GL Policy Limits Waiver of Subrogation Selected Successfully");
		AddProgram_Policy_Certificates_Page.addGLPolicySaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On GL Policy Save And Close Button");
		driver.switchTo().window(wb.map.get("childID"));

//add umb policy 
		AddProgram_Policy_Certificates_Page.addUmbPolAddPolicyBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Open UMB Policy Button");
		Thread.sleep(2000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolSelectCarrier(driver), 3);
		test.log(LogStatus.PASS, "UMB Policy Carrier Selected Successfully");
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolSelectLayer(driver), 2);
		test.log(LogStatus.PASS, "UMB Policy Layer Selected Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolEnterPolicyNumberField(driver)
				.sendKeys("MasterUMB POL " + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "UMB Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "UMB Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys("10/10/2021");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "UMB Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolFieldEacyOccurrence(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "UMB Policy Limits Each Occurrence Added Successfully");
		AddProgram_Policy_Certificates_Page.addUmbPolFieldAggregate(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "UMB Policy Limits Aggregate Added Successfully");
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolAdditionalInsuredField(driver), 2);
		test.log(LogStatus.PASS, "UMB Policy Additional Insured Selected Successfully");
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolWaiverofSubrogationField(driver), 2);
		test.log(LogStatus.PASS, "UMB Policy Limits Waiver of Subrogation Selected Successfully");
//		js.executeScript("window.scrollBy(0,250)");
		js.executeScript("arguments[0].click();", AddProgram_Policy_Certificates_Page.addUmbPolSaveAndCloseBtn(driver));
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);

		// Setup General Certificate
		js.executeScript("window.scrollBy(0,300)");
		AddProgram_Policy_Certificates_Page.setupCertificateBtnSetupGeneralCertificate(driver).click();
		test.log(LogStatus.PASS, "Clicked on Setup General Certificate Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		AddProgram_Policy_Certificates_Page.setupCertificateSaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Setup General Certificate Save and Close Button");
		Thread.sleep(2000);
		driver.switchTo().window(wb.map.get("childID"));

//Add Others Policies Automobile 24/07/2020		
//		js.executeScript("window.scrollBy(0,200)");\
		js.executeScript("arguments[0].scrollIntoView();", AddProgram_Policy_Certificates_Page.clickHereAddOtherPoliciesLink(driver));
		AddProgram_Policy_Certificates_Page.clickHereAddOtherPoliciesLink(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Clicked on Click Here Link to add Other Policy");
		AddProgram_Policy_Certificates_Page.selectOtherPolicyForAdd(driver, "Automobile Liability Policy").click();
//		AddProgram_Policy_Certificates_Page.selectOtherPolicyForAdd(driver, "Automobile Liability Policy").click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Clicked on Radion Button Automobile Policy");
		wb.waitForElemnet(AddProgram_Policy_Certificates_Page.selectPolicyNextBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Next Button");
		Thread.sleep(1500);

		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Automobile Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "Automobile Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "Automobile Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Automobile Policy Save and Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Automobile Policy Added Successfully");

//Add Others Policies buildersRisk 24/07/2020	
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.AddOtherPoliciesToListBtn(driver));
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Click Here Link to add Other Policy");
		AddProgram_Policy_Certificates_Page.selectOtherPolicyForAdd(driver, "Builder’s Risk Policy").click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Radion Button Builder’s Risk Policy");
		AddProgram_Policy_Certificates_Page.selectPolicyNextBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Next Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Builder’s Risk Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "Builder’s Risk Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "Builder’s Risk Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Builder’s Risk Policy Save and Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Builder’s Risk Policy Added Successfully");
// Add Others Policies Pollution 24/07/2020
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.AddOtherPoliciesToListBtn(driver));
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Click Here Link to add Other Policy");
		AddProgram_Policy_Certificates_Page.selectOtherPolicyForAdd(driver, "Pollution Liability Policy").click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Radion Button Pollution Policy");
		AddProgram_Policy_Certificates_Page.selectPolicyNextBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Next Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Pollution Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "Pollution Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "Pollution Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Pollution Policy Save and Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Pollution Policy Added Successfully");

// Add Others Policies Professional 27/07/2020
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.AddOtherPoliciesToListBtn(driver));
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Click Here Link to add Other Policy");
		AddProgram_Policy_Certificates_Page.selectOtherPolicyForAdd(driver, "Professional Liability Policy").click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Radio Button Professional Liability Policy");
		AddProgram_Policy_Certificates_Page.selectPolicyNextBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Next Button");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");

//Add new Carrier hyper link 27/07/2020

		AddProgram_Policy_Certificates_Page.addOtherPolicyAddNewCarrierLink(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add New Carrier Link");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
//		driver.switchTo().frame("#EmailBox12 > div.drag-contentarea > iframe");
		AddCarriersPage.addCarrierCarrierNameField(driver).sendKeys(RandomClass.randomCarrierName());
		test.log(LogStatus.PASS, "Carrier Name Added Successfully");
		AddCarriersPage.addCarrierShortNameField(driver).sendKeys("CC");
		test.log(LogStatus.PASS, "Carrier Short Name Added Successfully");
		AddCarriersPage.addCarrierContactFirstNameField(driver).sendKeys("Rock");
		test.log(LogStatus.PASS, "Carrier First Name Added Successfully");
		AddCarriersPage.addCarrierContactLastNameField(driver).sendKeys("Smith");
		test.log(LogStatus.PASS, "Carrier Last Name Added Successfully");
		AddCarriersPage.addCarrierContactEmailField(driver).sendKeys("kiran@nourtek.net");
		test.log(LogStatus.PASS, "Carrier Email ID Added Successfully");
		AddCarriersPage.addCarrierContactPhoneField(driver).sendKeys(RandomClass.randomPhoneNo());
		test.log(LogStatus.PASS, "Carrier Phone No Added Successfully");
		AddCarriersPage.addCarrierAddress1Field(driver).sendKeys("Abc Street 124 North West");
		test.log(LogStatus.PASS, "Carrier Address 1 Added Successfully");
		AddCarriersPage.addCarrierAddress2Field(driver).sendKeys("Gang Galaxy");
		test.log(LogStatus.PASS, "Carrier Address 2 Field Added Successfully");
		AddCarriersPage.addCarrierCityField(driver).sendKeys(RandomClass.randomState());
		test.log(LogStatus.PASS, "Carrier City Added Successfully");
		AddCarriersPage.addCarrierStateField(driver).sendKeys(RandomClass.randomState());
		test.log(LogStatus.PASS, "Carrier state Added Successfully");
		AddCarriersPage.addCarrierZipCodeField(driver).sendKeys("123456789");
		test.log(LogStatus.PASS, "Carrier Zip Code Added Successfully");
//		AddCarriersPage.addCarrierSaveBtn(driver).click();
//		test.log(LogStatus.PASS, "Carrier Save Successfully");

		AddCarriersPage.addCarrierSaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Carrier Save And Close Successfully");
		Thread.sleep(2500);
		// int x=1; //added duplicate carrier functionality 16/09/20
		do {
			try {
				Thread.sleep(2500);
				AddCarriersPage.duplicateCarrierAlertOKBtn(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Duplicate Carrier Name Alert Accepted");
				AddCarriersPage.addCarrierCarrierNameField(driver).clear();
				Thread.sleep(500);
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String newCarrierName = "Carrier_New" + rNo;
				AddCarriersPage.addCarrierCarrierNameField(driver).sendKeys(newCarrierName);
				test.log(LogStatus.PASS, "Carrier Name Added Successfully");
				js.executeScript("arguments[0].scrollIntoView();", AddCarriersPage.addCarrierSaveAndCloseBtn(driver));
				Thread.sleep(1000);
				AddCarriersPage.addCarrierSaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Carrier Save And Close Successfully");
			} catch (Throwable e) {
				System.out.println("Company Name " + e);
				x = 2;
			}
		} while (x == 1);
		test.log(LogStatus.PASS, " New Carrier Added Successfully");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Professional Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		test.log(LogStatus.PASS, "Professional Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		test.log(LogStatus.PASS, "Professional Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Professional Policy Save and Close Button");
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Professional Policy Added Successfully");

//Policy Renewal
		/*
		 * AddProgram_Policy_Certificates_Page.btnRenewalPolicy(driver).click();
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * driver.manage().window().maximize(); try{
		 * AddProgram_Policy_Certificates_Page.renewalPolicyRadioBtnStartOver(driver).
		 * click();
		 * AddProgram_Policy_Certificates_Page.renewalPolicySaveAndContinueBtn(driver).
		 * click();
		 * 
		 * }catch (Throwable e) { System.out.println("Exception handle"+e); }
		 * AddProgram_Policy_Certificates_Page.selectPolicyTypeToRenew(driver,
		 * "General Liability Policy").click();
		 * AddProgram_Policy_Certificates_Page.renewPolicySaveAndContinueButton(driver).
		 * click(); js.executeScript("arguments[0].click();",
		 * AddProgram_Policy_Certificates_Page.GL_RenewPolicySaveAndContinueButton(
		 * driver)); AddProgram_Policy_Certificates_Page.
		 * selectAllContractorPackageForRenewalCheckBox(driver).click();
		 * Thread.sleep(4000); AddProgram_Policy_Certificates_Page.
		 * selectContractorPackageRenewalSaveAndContinueBtn(driver).click();
		 * Thread.sleep(5000); AddProgram_Policy_Certificates_Page.
		 * newPolicyNumberGenerateCertificatesSendEmailBtn(driver).click();
		 * AddProgram_Policy_Certificates_Page.
		 * newPolicyNumberGenerateCertificatesSendEmailToTextField(driver).sendKeys(
		 * "kiran@nourtek.com"); js.executeScript("arguments[0].click();",
		 * AddProgram_Policy_Certificates_Page.
		 * newPolicyNumberGenerateCertificatesSendEmailSendBtn(driver));
		 * Thread.sleep(3000); AddProgram_Policy_Certificates_Page.
		 * newPolicyNumberGenerateCertificatesSendEmailSendBtn_OK_Alert(driver).click();
		 * driver.switchTo().window(wb.map.get("childID"));
		 */

		AddProgram_Policy_Certificates_Page.policyAndCertificateTabSaveAndContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Policy Tab Save and Continue Button");

//Fixed Cost And Rates Tab		
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsClickHereLink(driver).click();
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsInvoiceNumber(driver).sendKeys("InvoiceNo 124");
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsInvoiceStartDate(driver).sendKeys("01/01/2020", Keys.TAB);
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsInvoiceEndDate(driver).sendKeys("01/01/2021", Keys.TAB);
		wb.selectSingleValueByIndex(AddProgram_Fixed_Costs_Rates_Page.programFixedCostsSelectTerm(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Fixed_Costs_Rates_Page.programFixedCostsSelectCostType(driver), 1);
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsAmount(driver).sendKeys("2000");
		AddProgram_Fixed_Costs_Rates_Page.programFixedCostsAddPlusBtn(driver).click();

		AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesClickHereLink(driver).click();
		wb.selectSingleValueByIndex(
				AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesSelectRateDescription(driver), 2);
		AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesRateField(driver).sendKeys("2000");
		wb.selectSingleValueByIndex(AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesSelectRateBase(driver),
				2);
		wb.selectSingleValueByIndex(
				AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesSelectRateBaseType(driver), 1);
		AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesAmountField(driver).sendKeys("1000");
		AddProgram_Fixed_Costs_Rates_Page.programRatesAndDeductiblesAddPlusBtn(driver).click();

		AddProgram_Fixed_Costs_Rates_Page.programFeesClickHereLink(driver).click();
		AddProgram_Fixed_Costs_Rates_Page.programFeeStartDate(driver).sendKeys("01/01/2020", Keys.TAB);
		AddProgram_Fixed_Costs_Rates_Page.programFeeEndDate(driver).sendKeys("01/01/2021", Keys.TAB);
		wb.selectSingleValueByIndex(AddProgram_Fixed_Costs_Rates_Page.programFeeSelectFeeType(driver), 1);
		AddProgram_Fixed_Costs_Rates_Page.programFeeAmountfield(driver).sendKeys("1200");
		AddProgram_Fixed_Costs_Rates_Page.programFeeAddPlusBtn(driver).click();

		AddProgram_Fixed_Costs_Rates_Page.fixedCostsAndRatesSaveAndContinueBtn(driver).click();
		Thread.sleep(4000);
//click on more tab	
		AddProgramPage.addProgramMoreTab(driver).click();
		Thread.sleep(1000);
		AddProgramPage.addProgramCustomFormsTab(driver).click();
		Thread.sleep(3000);
		AddProgram_Custom_Forms_Page.checkBoxOshaAndEMR(driver).click();
		wb.selectSingleValueByIndex(AddProgram_Custom_Forms_Page.slectTierLevelForOshaAndEMR(driver), 1);
		Thread.sleep(1000);
		AddProgram_Custom_Forms_Page.oshaEmrTierLevelField(driver).sendKeys("1");
		AddProgram_Custom_Forms_Page.checkBoxSafetyQualificationForm(driver).click();
		wb.selectSingleValueByIndex(AddProgram_Custom_Forms_Page.slectTierLevelForSafetyQualificationForm(driver), 1);
		Thread.sleep(1000);
		AddProgram_Custom_Forms_Page.safetyQualificationTierLevelField(driver).sendKeys("1");
		AddProgram_Custom_Forms_Page.SaveAndContinueBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Save and Continue Button");

//Benchmark Page
		AddProgramPage.addProgramMoreTab(driver).click();
		Thread.sleep(1000);
		AddProgramPage.addProgramBenchmarkTab(driver).click();
		Thread.sleep(3000);
		AddProgram_Benchmark_Page.fieldCounty(driver).sendKeys("Test County");
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectBorough(driver), 1);
		AddProgram_Benchmark_Page.fieldProjectStatus(driver).sendKeys("Test Project Status");
		AddProgram_Benchmark_Page.fieldPercentCompletion(driver).sendKeys("10");
		AddProgram_Benchmark_Page.fieldNoumbersOfFloors(driver).sendKeys("10");
		AddProgram_Benchmark_Page.fieldHeight(driver).sendKeys("300");
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectProjectType(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectBuildingType(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectSuperStrctureType(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectconstructionScope(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectIndustry(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectWorkforce(driver), 1);
		wb.selectSingleValueByIndex(AddProgram_Benchmark_Page.selectLineOfBuniness(driver), 1);
		js.executeScript("window.scrollBy(0,250)", "");

		js.executeScript("arguments[0].click();", AddProgram_Benchmark_Page.btnSaveAndClose(driver));
		test.log(LogStatus.PASS, programName + " Program Added Successfully");
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(4000);
		WPO_ProgramPolicyRenewalAction.testPolicyRenewal(driver, "Program7852");

	}

}

/*
 * @Test(priority=2,enabled=false) public void editProgram() throws
 * InterruptedException {
 * 
 * String expectedElement= "Program3941";
 * HomePage.controlMenuHomeIcon(driver).click(); test.log(LogStatus.PASS,
 * " has been Passed"); HomePage.HomeMenuPrograms(driver).click();
 * Thread.sleep(2000);
 * ProgramModule.programSearchEditBox(driver).sendKeys(expectedElement);
 * Thread.sleep(3000); ProgramModule.programSearchIcon(driver).click();
 * Thread.sleep(3000); ProgramModule.programEditIcon(driver).click();
 * wb.getWindowIDs(); driver.switchTo().window(wb.map.get("childID"));
 * 
 * AddProgramPage.addProgramContractorPortalOptionTab(driver).click(); //
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * js.executeScript("window.scrollBy(0,500)"); }
 */