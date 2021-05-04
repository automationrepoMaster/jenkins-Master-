package TestScript;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Enrollment_Summary_Page;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.AddContractor_Pkg_OSHA_EMR_Page;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddContractor_Pkg_Required_Documents_Page;
import ObjectRepository.AddContractor_Pkg_SubContractorInfo;
import ObjectRepository.AddContractor_WC_Premiums_Modifications_Page;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class Enroll_CP_WC_Only extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String contractorName = "Alex Comp3524";
	public String projectName = "Sony Projects3524";
	public String tradeNumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	String contractorCompany = "Alex Comp2273";// "Alex Comp3524";// "sony";
	String contactName = "Jimmy Smith";
	public String trade = "OCP001- | 007";
	
	public String  enrollmentType ="WC Only Enrollment";
	// Raja

	AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC();
	public String ContactName = "Jimmy Smith";
	public String submissionFrequency = "Quarterly";
	public String reportTime = "Quarterly";
	String programName = "Sony Programs3524"; // raja
	public String status ="Assigned";

	// @Test()
	public void add_CP_Via_Project() throws Throwable {

		HomePage.controlMenuHomeIcon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Home Icon");
		/*
		 * HomePage.HomeMenuProjects(driver).click(); test.log(LogStatus.PASS,
		 * "Clicked on Project Module Icon");
		 * ProjectModule.projectSearchEditBox(driver).sendKeys(projectName);
		 * test.log(LogStatus.PASS, "Search for Project "+projectName);
		 * Thread.sleep(1000); ProjectModule.projectSearchIcon(driver).click();
		 * test.log(LogStatus.PASS, "Clicked on Search Project Icon");
		 * Thread.sleep(3000); ProjectModule.projectEditIcon(driver).click();
		 * test.log(LogStatus.PASS, "Clicked on Edit Project Icon"); Thread.sleep(3000);
		 * wb.getWindowIDs(); driver.switchTo().window(wb.map.get("childID"));
		 * Thread.sleep(2000); driver.manage().window().maximize();
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)", "");//Scroll down
		 * AddProject_General_Information_Page.linkCreateContractorPkg(driver).click();
		 * test.log(LogStatus.PASS, "Clicked Create Contractor Package Link");
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * Thread.sleep(2000); driver.manage().window().maximize();
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.controlMenuContractorPackage(driver).click();
		Thread.sleep(6000);
		test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");

		// js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("arguments[0].click();", ContractorPackageModule.addIcon(driver));
		test.log(LogStatus.INFO, "Clicked On Add Contractor Package Icon");
		Thread.sleep(2000);
		// ContractorPackageModule.addIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();

		Thread.sleep(5000);
		// Select program
		wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(programName);

		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver), programName);
//			AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower Test",Keys.TAB);
		System.out.println("Program Added Successfully");
		test.log(LogStatus.PASS, programName + " Program  added successfully");
		Thread.sleep(2500);
		// select project
		AddContractor_Pkg_Page.selectProject(driver).click();
		AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver), projectName);
		System.out.println("Project Added Successfully");
		test.log(LogStatus.PASS, projectName + " Project added successfully");

		// select enrollment type
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		Thread.sleep(1500); //
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(driver).sendKeys("WC Only Enrollment");
		Thread.sleep(500);
		System.out.println("Enrollment Type Added Successfully");
		test.log(LogStatus.PASS, "Enrollment Type added successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
				"WC Only Enrollment");
		Thread.sleep(2000);

		/*
		 * // non cip
		 * 
		 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
		 * Thread.sleep(1000);
		 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(driver),
		 * "Compliance29"); test.log(LogStatus.PASS, " Compliance added successfully");
		 * Thread.sleep(5000);
		 */
		// select contractor
		AddContractor_Pkg_Page.selectContractor(driver).click();
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(contractorCompany);
		Thread.sleep(2000);
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
		System.out.println("Contractor Added Successfully");
		test.log(LogStatus.PASS, "Contractor added successfully");
		Thread.sleep(2000);

		// select contact
		AddContractor_Pkg_Page.SelectContact(driver).click();
		AddContractor_Pkg_Page.SelectContactSearchBox(driver).click();
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.SelectContactAutoCompllete(driver), contactName);
		test.log(LogStatus.PASS, contactName + " Contact added successfully");
		Thread.sleep(2500);

		/*
		 * //trade String tradeName=RandomClass.randomTradeDescription();
		 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		 * test.log(LogStatus.PASS, "Click on Add New Trade Link"); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); Thread.sleep(2000);
		 * driver.manage().window().maximize();
		 * 
		 * AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(RandomClass.
		 * randomTradeDescription()); test.log(LogStatus.PASS,
		 * "Trade Description Added Successfully");
		 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
		 * test.log(LogStatus.PASS, "Trade Number Added Successfully");
		 * wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver),
		 * "Active"); test.log(LogStatus.PASS, "Trade Status Selected Successfully");
		 * AddTradePage.addTradeSaveAndCloseBtn(driver).click();
		 */

		// Trade
		AddContractor_Pkg_Page.selectTrade(driver).click();
		test.log(LogStatus.PASS, "Trade dropdown is clicked succesfully");
		Thread.sleep(2000);
		AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(trade);
		test.log(LogStatus.PASS, "Trade dropdown is clicked succesfully");
		Thread.sleep(2000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), trade);

		/*
		 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		 * test.log(LogStatus.PASS, "Trade added succesfully"); Thread.sleep(2000);
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * driver.manage().window().maximize(); Thread.sleep(1000);
		 */

		/*
		 * int x=1; do { try { Alert alt=driver.switchTo().alert(); Thread.sleep(2000);
		 * alt.accept(); Random ran = new Random(); int rNo = ran.nextInt(100000);
		 * String newtradeNumber="TNO"+rNo; tradeNumber=newtradeNumber;
		 * Thread.sleep(1000); AddTradePage.addTrade_TradeNumberField(driver).clear();
		 * Thread.sleep(1000);
		 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
		 * test.log(LogStatus.PASS, "Trade Number Added Successfully");
		 * AddTradePage.addTradeSaveAndCloseBtn(driver).click(); } catch (Throwable e) {
		 * System.out.println("Alert Not Present"+e); x=2; } } while (x==1);
		 */

		// driver.switchTo().window(wb.map.get("childID"));
		System.out.println("Trade Added Successfully");
		test.log(LogStatus.PASS, trade + " Trade added successfully");

		Thread.sleep(2000);
		AddContractor_Pkg_Page.btnNext(driver).click();
		test.log(LogStatus.PASS, "Clicked On Next Button");
		Thread.sleep(1000);
		/*
		 * AddContractor_Pkg_Page.btnNext(driver).click(); test.log(LogStatus.INFO,
		 * "Clicked On Next Button");
		 */
		Thread.sleep(2000);
		try {
			AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();// newly added alert for compliance
																						// button 20/01/2020
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No alert  was found at Non CIP");
		}
		Thread.sleep(3000);
		try {
			AddContractor_Pkg_Page.ContractNumber_Feild(driver).click();
			AddContractor_Pkg_Page.ContractNumber_Feild(driver).clear();
			AddContractor_Pkg_Page.ContractNumberExists_AlertOKbtn(driver).click();
		} catch (Exception e) {
			System.out.println("No such alert at Contractor number feild");
		}
		try {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			AddContractor_Pkg_Page.btnNext(driver).click();
			test.log(LogStatus.INFO, "Clicked On Next Button");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such trade alert at next button ");
		}
		try {
			AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();// newly added alert for compliance
																						// button 20/01/2020
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No alert  was found at Non CIP");
		}

		AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
		driver.switchTo().window(wb.map.get("parentID"));
		System.out.println("Contractor Package Created Successfully");
		test.log(LogStatus.PASS, "Contractor Package Created successfully");

	}

	@Test // (dependsOnMethods //= { "add_CP_Via_Project" })
	public void enrollContractor_Pkg_WC_OnlyTest() throws Throwable {
		
		
		add_CP_Via_Project();
		WebDriverWait webwait = new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");
		Thread.sleep(10000);
		/*
		 * wb.waitForElemnet(ContractorPackageModule.searchEditBox(driver));
		 * 
		 * js.executeScript("window.scrollBy(0,-350)", "");
		 * ContractorPackageModule.searchEditBox(driver).sendKeys(contractorName,
		 * Keys.TAB); Thread.sleep(3000); test.log(LogStatus.INFO,
		 * "Search For Respective Company"); js.executeScript("window.scrollBy(0,-350)",
		 * ""); // js.executeScript("window.scrollBy(0,-350)", "");
		 * js.executeScript("arguments[0].click();",
		 * ContractorPackageModule.searchIcon(driver)); test.log(LogStatus.INFO,
		 * "Clicked on Search Icon"); Thread.sleep(10000);
		 */
		/*
		 * WebElement ele = driver.findElement(By.
		 * xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'Alex Comp2273')]/../..//div[@class='workSite']/span[contains(text(),'Sony Projects3524')]/../../../div[2]/div[3]/..//../..//div[@class='statusType']/../..//div[@class='statusType']//div[3]/span"
		 * )); //js.executeScript("arguments[0].click();", //
		 * ContractorPackageModule.selectDynamicContractorPkg(driver, contractorName,
		 * projectName, trade)); js.executeScript("arguments[0].click();",ele);
		 * js.executeScript("window.scrollBy(0,-250)", ""); // search for respective
		 * contractor pkg and click on it js.executeScript("arguments[0].click();",
		 * ContractorPackageModule.selectDynamicContractorPkg(driver, contractorName,
		 * projectName, trade));
		 */
		
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		js.executeScript("arguments[0].click();", ContractorPackageModule.advanceSearchIcon(driver));
		Thread.sleep(2000);
		//ContractorPackageModule.advanceSearchIcon(driver).click();
		Thread.sleep(4000);
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProgram(driver), programName);
		test.log(LogStatus.PASS, programName + " Respective Project Selected Successfully");
		Thread.sleep(1500);
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectEnrollmenttype(driver), enrollmentType);
		test.log(LogStatus.PASS, enrollmentType + " Enrollment Type Selected Successfully");
		Thread.sleep(1500);
		ContractorPackageModule.advanceSearchSelectContractorStatus(driver).click();
		test.log(LogStatus.PASS, " clicked on Contractor Status Field");
//		wb.selectSingleValueFromList(ContractorPackageModule.advanceSearchSelectStatusFromDropdownList(driver), "Missing Payroll");
		Thread.sleep(500);
		ContractorPackageModule.advanceSearchSelect_Single_StatusFromDropdown(driver, status).click();
		test.log(LogStatus.PASS, status + " Status Selected Successfully");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='dropMain']/a/span/i"));
		Thread.sleep(1500);
		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Advance Search Button");
		//Thread.sleep(10000)
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
		wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		// AddContractor_Pkg_Insurance_Enrollment_Page.InsuranceEnrollmentTab(driver).click();
		Thread.sleep(7000);

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.popUpCloneCancelBtn(driver).click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}

		try {
// Insurance Enrollment page
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.contactInformationEmail(driver));

			js.executeScript("arguments[0].scrollIntoView();",
					AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver));
			wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver).sendKeys("5600000");
			test.log(LogStatus.PASS, "Contract Value Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldSelfPerformedContractValue(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldSelfPerformedContractValue(driver).sendKeys("560000");
			test.log(LogStatus.PASS, "Self Performed Contract Value Added Successfully");

			/*
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(
			 * driver).clear();
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(
			 * driver).sendKeys("100000"); test.log(LogStatus.PASS,
			 * "Estimated Uncapped Payroll Added Successfully");
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(
			 * driver).clear();
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(
			 * driver).sendKeys("100000"); test.log(LogStatus.PASS,
			 * "Estimated Capped Payroll Added Successfully");
			 */
			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(driver).clear();
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(driver).sendKeys("100000");
				test.log(LogStatus.PASS, "Estimated Uncapped Payroll Added Successfully");
			} catch (Throwable e) {
				System.out.println("Exception in Uncapped payroll" + e);
			}

			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(driver).clear();
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(driver).sendKeys("100000");
				test.log(LogStatus.PASS, "Estimated Capped Payroll Added Successfully");

			} catch (Throwable e) {
				System.out.println("Exception in Capped payroll" + e);
			}

			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedManHours(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedManHours(driver).sendKeys("1000");
			test.log(LogStatus.PASS, "Estimated Man Hours Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedStartDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedStartDate(driver).sendKeys("09/02/2019",
					Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Start Date Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).sendKeys("12/31/2020",
					Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Completion Date Added Successfully");
			Thread.sleep(2000);
			System.out.println("Program Radio Button is Selected \t"
					+ AddContractor_Pkg_Insurance_Enrollment_Page.redioBtnProgram(driver).isSelected());

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver).sendKeys("Testing");

			/*
			 * wb.waitForElemnet(AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClass
			 * (driver)); try {
			 * AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClass(driver).click();
			 * }catch (Exception e) { System.out.println("already cicked"); }
			 * 
			 * Thread.sleep(4000);
			 * AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClassSearchBox(driver).
			 * sendKeys("Test"); wb.selectSingleValueFromList(
			 * AddContractor_Pkg_Insurance_Enrollment_Page.
			 * selectAllWorkClassFromAutoCompleteDropDown(driver), "Test");
			 * Thread.sleep(5000); test.log(LogStatus.PASS,
			 * "Work Class Selected Successfully"); //
			 * wb.selectSingleValueFromList(AddContractor_Pkg_Insurance_Enrollment_Page.
			 * selectAllWorkClassFromAutoCompleteDropDown(driver),"Technicians");
			 * 
			 * try {
			 * AddContractor_Pkg_Insurance_Enrollment_Page.cappedPayrollAlertOkBtn(driver).
			 * click(); Thread.sleep(1500); } catch (Throwable e) {
			 * System.out.println("Capped Alert is not present Exception" + e); } //
			 * wb.selectSingleValueFromList(AddContractor_Pkg_Insurance_Enrollment_Page.
			 * selectAllWorkClassFromAutoCompleteDropDown(driver),"Technicians");
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassWorkHoursField(driver
			 * ).sendKeys("100"); test.log(LogStatus.PASS,
			 * "Work Class Hours Added Successfully");
			 * 
			 * try {
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassUnCappedPayrollField(
			 * driver).sendKeys("5000"); test.log(LogStatus.PASS,
			 * "Work Class Uncapped Payroll Added Successfully"); } catch (Throwable e) {
			 * System.out.println("Exception in Uncapped payroll" + e); }
			 * 
			 * try {
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassCappedPayrollField(
			 * driver).sendKeys("5000"); test.log(LogStatus.PASS,
			 * "Work Class Capped Payroll Added Successfully");
			 * 
			 * } catch (Throwable e) { System.out.println("Exception in Capped payroll" +
			 * e); }
			 * 
			 * 
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassWorkHoursField(driver
			 * ).sendKeys("100"); test.log(LogStatus.PASS,
			 * "Work Class Hours Added Successfully");
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassUnCappedPayrollField(
			 * driver).sendKeys("5000"); test.log(LogStatus.PASS,
			 * "Work Class Uncapped Payroll Added Successfully");
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassCappedPayrollField(
			 * driver).sendKeys("5000"); test.log(LogStatus.PASS,
			 * "Work Class Capped Payroll Added Successfully");
			 * 
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassRateField(driver).
			 * sendKeys("15"); test.log(LogStatus.PASS,
			 * "Work Class Rate Added Successfully");
			 * js.executeScript("arguments[0].click();",
			 * AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassAddWorkClassBtn(
			 * driver)); test.log(LogStatus.INFO, "Clicked On Add Work Class Button");
			 * Thread.sleep(10000);
			 */
			
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On Contract Details Mark As Confirmed Radio Button");

			AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver)
					.sendKeys(RandomClass.randomDivisionCode());

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
			Thread.sleep(3500);

		} catch (Throwable e) {
			System.out.println(e);
		}
		int x = 1;
		do {
			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.locationCodeDuplicateAlertOKBtn(driver).click();
				Thread.sleep(2000);
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String NewLocationCode = "LOC" + rNo;
				Thread.sleep(1000);
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).clear();
				Thread.sleep(1000);
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).sendKeys(NewLocationCode);
				js.executeScript("arguments[0].click();",
						AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
				test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
				Thread.sleep(2000);
			} catch (Throwable e) {
				System.out.println("Alert Not Present" + e);
				x = 2;
			}
		} while (x == 1);

		try {
			// first common alert handled
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.alertUncappedPayrolToWorkclassUncappedPayroll(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCappedPayrolToWorkclassCappedPayroll(driver).click();
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}

		Thread.sleep(7000);

		/*
		 * // Thread.sleep(7000); js.executeScript("window.scrollBy(0,3500)");
		 * js.executeScript("arguments[0].scrollIntoView();",
		 * AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver))
		 * ;
		 * AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver).
		 * click(); test.log(LogStatus.INFO,
		 * "Cliced On WC Premium Modification Page Mark As Confirmed Radio Button ");
		 * js.executeScript("window.scrollBy(0,1000)");
		 * AddContractor_WC_Premiums_Modifications_Page.btnSaveAndContinue(driver).click
		 * (); test.log(LogStatus.INFO,
		 * "Clicked On WC Premium Modificaction Page Save And Continue Button");
		 * Thread.sleep(5000);
		 */
		
		try {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver).click();
	   
	   WebElement  ele1 =	driver.findElement(By.xpath("//input[@id='ctrlPremiumModes_btnNext']"));
	  js.executeScript("arguments[0].scrollIntoView();", ele1);
	  ele1.click();
		}catch (Exception e) {
			Thread.sleep(6000);
		}
		

//sub contractor page come before the documents page
		wb.waitForElemnet(AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver));
		// AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver).click();
		Thread.sleep(5000);

//Document Page		
		AddContractor_Pkg_Required_Documents_Page.btnAddNewDocument(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Document Button");
		List<WebElement> checkBoxCount = AddContractor_Pkg_Required_Documents_Page
				.selectAllDocumentcheckBoxWhatAreYouUploadingPage(driver);

		for (int i = 0; i < checkBoxCount.size(); i++) {
			checkBoxCount.get(i).click();
			Thread.sleep(500);
		}
		test.log(LogStatus.PASS, "Document Checkbox selected Successfully");
		js.executeScript("window.scrollBy(0,150)", "");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Required_Documents_Page.clickHereToUploadManualyLink(driver));
		test.log(LogStatus.PASS, "Clicked on Click Here to upload manually Link ");
		AddContractor_Pkg_Required_Documents_Page.addDocNameOfTheFileField(driver).sendKeys("TestFile");
		test.log(LogStatus.PASS, "Document Name Added Successfully");
		AddContractor_Pkg_Required_Documents_Page.addDocPlusBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Document Plus Button");

		Thread.sleep(3000);
		// add file through AutoIT
		// Runtime.getRuntime().exec("E:\\kp workspace selenium\\Wrap Portal\\AutoIT
		// Script\\FileUpload.exe");
		Runtime.getRuntime().exec("D:\\NOURTEK\\InjalaProject\\AutoIT\\AddDocumnet.exe");
		test.log(LogStatus.PASS, "Documnet Added Successfully");
		Thread.sleep(5000);
		AddContractor_Pkg_Required_Documents_Page.addDocAddBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Alert Add Document Button");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Required_Documents_Page.markedAsConfirmedRadioBtn(driver));
		// js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.addDocsaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Mark As Confirmed");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Required_Documents_Page.addDocsaveAndContinueBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Save And Continue button");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", AddContractor_Pkg_Required_Documents_Page.btnSaveAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On required Documents Save And Continue Button");

		try {
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			Thread.sleep(3000);

		} catch (Throwable e) {
			System.out.println(e);
		}

		try {

			wb.mouseMoveToElement(
					AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
		} catch (Throwable e) {
			System.out.println(e);
		}

		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,4000)");

// Osha EMR Page
		try {
			AddContractor_Pkg_OSHA_EMR_Page.checkBoxA(driver).click();
			js.executeScript("window.scrollBy(0,2000)");
			js.executeScript("arguments[0].click();", AddContractor_Pkg_OSHA_EMR_Page.radioBtnMarkAsConfirmed(driver));
			js.executeScript("arguments[0].click();", AddContractor_Pkg_OSHA_EMR_Page.btnSaveAndContinue(driver));

		} catch (Throwable e) {
			System.out.println(e);
		}
		try {
			wb.mouseMoveToElement(AddContractor_Pkg_Enrollment_Summary_Page
					.checkBoxEnrollmentSummaryPageFinalTermsAndCondition(driver));
			test.log(LogStatus.PASS, "Enrollment Summary Final Terms And Condition Check Box Selected ");

		} catch (Throwable e) {

			System.out.println(e);
		}

		try {
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentSummaryPageConfirmAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On Enrollment Summary Confirm And Continue Button");
		}catch (Exception e) {
			System.out.println("cannot move to check box");
		}

		try {

			wb.moveToElement(
					AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver).click();
			test.log(LogStatus.PASS, "Mouse move to element is performed on continue withou sending");
		} catch (Throwable e) {
			System.out.println(e);
		}

		try {
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Enrollment_Summary_Page.checkBoxEnrollmentSummaryPageAcceptNoLossStmt(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentSummaryPageAcceptNoLossStmt(driver));
			wb.mouseMoveToElement(
					AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			// wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			Thread.sleep(6000);
			js.executeScript("window.scrollBy(0,1500)");

		} catch (Throwable e) {
			System.out.println(e);
		}

		wb.moveToElement(
				AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentConfirmationPageFinishAndClose(driver));
		AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentConfirmationPageFinishAndClose(driver).click();
		test.log(LogStatus.PASS, "Clicked On Enrollent Confirmation Page Finish And Close");
		test.log(LogStatus.PASS, "Contractor Package Enrolled Successfully");
		Thread.sleep(2000);
		driver.switchTo().window(wb.map.get("parentID"));

	}

}
