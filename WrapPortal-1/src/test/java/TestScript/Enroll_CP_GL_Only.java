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
import ObjectRepository.AddContractor_Pkg_GL_Umbrella_Coverage_Page;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.AddContractor_Pkg_OSHA_EMR_Page;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddContractor_Pkg_Required_Documents_Page;
import ObjectRepository.AddContractor_Pkg_SubContractorInfo;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class Enroll_CP_GL_Only extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	//public String contractorName = "Alex Comp3524";
	//public String projectName = "Sony Projects3524";
	public String tradeNumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	String ProgramName="Sony Programs3524";
	//public String ContactName ="Jimmy Smith";
	public String submissionFrequency = "Quarterly";
	public String reportTime = "Quarterly";
	
	//WebDriverCommonLib wb = new WebDriverCommonLib();
	public String contractorName = "Alex Comp3524";
	public String projectName = "Sony Projects3524";
	//public String tradeNumber = RandomClass.randomTradeNO();
	//public String insuranceCompName = "Carriers3524";
	String contractorCompany = "Alex Comp2273";// "Alex Comp3524";// "sony";
	String contactName = "Jimmy Smith";
	public String trade = "OCP001- | 007";
	// Raja

	AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC();
	public String ContactName = "Jimmy Smith";
	//public String submissionFrequency = "Quarterly";
	//public String reportTime = "Quarterly";
	String programName = "Sony Programs3524"; // raja
	
	
	/*
	 * @Test() public void add_CP_Via_Project() throws Throwable {
	 * 
	 * HomePage.controlMenuHomeIcon(driver).click(); Thread.sleep(2000);
	 * test.log(LogStatus.PASS, "Clicked on Home Icon");
	 * HomePage.HomeMenuProjects(driver).click(); test.log(LogStatus.PASS,
	 * "Clicked on Project Module Icon");
	 * ProjectModule.projectSearchEditBox(driver).sendKeys(projectName);
	 * test.log(LogStatus.PASS, "Search for Project " + projectName);
	 * Thread.sleep(1000); ProjectModule.projectSearchIcon(driver).click();
	 * test.log(LogStatus.PASS, "Clicked on Search Project Icon");
	 * Thread.sleep(3000); ProjectModule.projectEditIcon(driver).click();
	 * test.log(LogStatus.PASS, "Clicked on Edit Project Icon"); wb.getWindowIDs();
	 * driver.switchTo().window(wb.map.get("childID")); Thread.sleep(2000);
	 * driver.manage().window().maximize();
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0,250)", "");// Scroll down
	 * AddProject_General_Information_Page.linkCreateContractorPkg(driver).click();
	 * test.log(LogStatus.PASS, "Clicked Create Contractor Package Link");
	 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
	 * Thread.sleep(2000); driver.manage().window().maximize();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * // select enrollment type
	 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
	 * Thread.sleep(1500); //
	 * AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
	 * AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(
	 * driver).sendKeys("GL Only"); Thread.sleep(500);
	 * System.out.println("Enrollment Type Added Successfully");
	 * test.log(LogStatus.PASS, "Enrollment Type added successfully");
	 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
	 * selectEnrollmentTypeDropdownAutocomplete(driver), "GL Only Enrollment");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * 
	 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
	 * Thread.sleep(1000);
	 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(
	 * driver), "Compliance29");
	 * test.log(LogStatus.PASS," Compliance added successfully");
	 * 
	 * 
	 * String tradeName = RandomClass.randomTradeDescription();
	 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
	 * test.log(LogStatus.PASS, "Click on Add New Trade Link"); wb.getWindowID4();
	 * driver.switchTo().window(wb.map.get("subsubchildID")); Thread.sleep(2000);
	 * driver.manage().window().maximize();
	 * 
	 * AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(RandomClass.
	 * randomTradeDescription()); test.log(LogStatus.PASS,
	 * "Trade Description Added Successfully");
	 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
	 * test.log(LogStatus.PASS, "Trade Number Added Successfully");
	 * wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver),
	 * "Active"); test.log(LogStatus.PASS, "Trade Status Selected Successfully");
	 * AddTradePage.addTradeSaveAndCloseBtn(driver).click(); int x = 1; do { try {
	 * Alert alt = driver.switchTo().alert(); Thread.sleep(2000); alt.accept();
	 * Random ran = new Random(); int rNo = ran.nextInt(100000); String
	 * newtradeNumber = "TNO" + rNo; tradeNumber = newtradeNumber;
	 * Thread.sleep(1000); AddTradePage.addTrade_TradeNumberField(driver).clear();
	 * Thread.sleep(1000);
	 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
	 * test.log(LogStatus.PASS, "Trade Number Added Successfully");
	 * AddTradePage.addTradeSaveAndCloseBtn(driver).click(); } catch (Throwable e) {
	 * System.out.println("Alert Not Present" + e); x = 2; } } while (x == 1);
	 * 
	 * driver.switchTo().window(wb.map.get("subchildID"));
	 * System.out.println("Trade Added Successfully"); test.log(LogStatus.PASS,
	 * tradeName + " Trade added successfully");
	 * 
	 * // select submission and reporting month
	 * AddContractor_Pkg_Page.moreBtn(driver).click(); Thread.sleep(2000);
	 * js.executeScript("window.scrollBy(0,250)", "");
	 * wb.selectSingleValue(AddContractor_Pkg_Page.selectPayrollSubmissionFrequency(
	 * driver), submissionFrequency); Thread.sleep(1500);
	 * wb.selectSingleValue(AddContractor_Pkg_Page.selectreportedTimePeriod(driver),
	 * reportTime);
	 * 
	 * 
	 * Thread.sleep(2000); AddContractor_Pkg_Page.btnNext(driver).click();
	 * test.log(LogStatus.PASS, "Clicked On Next Button"); Thread.sleep(1000); try {
	 * 
	 * AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();
	 * 
	 * } catch (Throwable e) { System.out.println(e); }
	 * 
	 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
	 * driver.switchTo().window(wb.map.get("childID"));
	 * System.out.println("Contractor Package Created Successfully");
	 * test.log(LogStatus.PASS, "Contractor Package Created successfully");
	 * 
	 * driver.close(); driver.switchTo().window(wb.map.get("parentID")); }
	 */
	
	 @Test()
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
//				AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower Test",Keys.TAB);
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
			AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(driver).sendKeys("GL Only Enrollment");
			Thread.sleep(500);
			System.out.println("Enrollment Type Added Successfully");
			test.log(LogStatus.PASS, "Enrollment Type added successfully");
			wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
					"GL Only Enrollment");
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
	@Test (dependsOnMethods = { "add_CP_Via_Project" })

	public void enrollContractor_Pkg_GL_OnlyTest() throws Throwable {
		WebDriverWait webwait = new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");
		// Thread.sleep(10000);
		/*
		 * wb.waitForElemnet(ContractorPackageModule.searchEditBox(driver));
		 * 
		 * js.executeScript("window.scrollBy(0,-350)", "");
		 * ContractorPackageModule.searchEditBox(driver).sendKeys(contractorName,
		 * Keys.TAB); Thread.sleep(3000); test.log(LogStatus.INFO,
		 * "Search For Respective Company");
		 */
		js.executeScript("window.scrollBy(0,-350)", "");
		// js.executeScript("window.scrollBy(0,-350)", "");
		//js.executeScript("arguments[0].click();", ContractorPackageModule.searchIcon(driver));
		test.log(LogStatus.INFO, "Clicked on Search Icon");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-250)", "");
		// search for respective contractor pkg and click on it
		WebElement ele = driver.findElement(By.xpath("//ul[@id='ulNoteList']//div[@class='mailDetails']//..//div[@class='companytitle']/span[contains(text(),'Alex Comp2273')]/..//../..//..//div[@class='statusType']/div/span[contains(text(),'Assigned')]/../../..//div[@class='statusType']/div[3]/span[contains(text(),'OCP001- | 007')]/../../.."));
		//js.executeScript("arguments[0].click();",
		//		ContractorPackageModule.selectDynamicContractorPkg(driver, contractorName, projectName, trade));
		js.executeScript("arguments[0].click();",ele);
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		//System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
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
			//js.executeScript("arguments[0].click();",
				//	AddContractor_Pkg_Insurance_Enrollment_Page.contactInformationEmail(driver));

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
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(
			 * driver).clear();
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(
			 * driver).sendKeys("100000"); test.log(LogStatus.PASS,
			 * "Estimated Uncapped Payroll Added Successfully");
			 * 
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(
			 * driver).clear();
			 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(
			 * driver).sendKeys("100000"); test.log(LogStatus.PASS,
			 * "Estimated Capped Payroll Added Successfully");
			 */
			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(driver).clear();
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedUncappedPayroll(driver).sendKeys("100000");
				test.log(LogStatus.PASS, "Estimated Capped Payroll Added Successfully");

			} catch (Throwable e) {
				System.out.println("Exception in Capped payroll" + e);
			}
			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(driver).clear();
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCappedPayroll(driver).sendKeys("100000");
				test.log(LogStatus.PASS, "Estimated Uncapped Payroll Added Successfully");
			} catch (Throwable e) {
				System.out.println("Exception in Uncapped payroll" + e);
			}

			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedManHours(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedManHours(driver).sendKeys("1000");
			test.log(LogStatus.PASS, "Estimated Man Hours Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedStartDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedStartDate(driver).sendKeys("09/02/2019",
					Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Start Date Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).sendKeys("12/31/2021",
					Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Completion Date Added Successfully");

			//js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.redioBtnProgram(driver));
			//System.out.println("Program Radio Button is Selected \t"
			//		+ AddContractor_Pkg_Insurance_Enrollment_Page.redioBtnProgram(driver).isSelected());
			//AddContractor_Pkg_Insurance_Enrollment_Page.redioBtnProgram(driver).click();
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver).sendKeys("Testing");
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On Contract Details Mark As Confirmed Radio Button");
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).click();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver)
					.sendKeys(RandomClass.randomDivisionCode());
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
			Thread.sleep(4000);

			int x = 1;
			do {
				try {
					AddContractor_Pkg_Insurance_Enrollment_Page.locationCodeDuplicateAlertOKBtn(driver).click();
					Thread.sleep(1000);
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

			/*
			 * AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(
			 * driver).click(); Thread.sleep(2000);
			 * 
			 * AddContractor_Pkg_Insurance_Enrollment_Page.
			 * alertUncappedPayrolToWorkclassUncappedPayroll(driver).click();
			 * Thread.sleep(2000); AddContractor_Pkg_Insurance_Enrollment_Page.
			 * alertCappedPayrolToWorkclassCappedPayroll(driver).click();
			 */

			Thread.sleep(7000);
		} catch (Throwable e) {
			System.out.println(e);
		}

		// GL Page
		js.executeScript("window.scrollBy(0,270)", "");
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForGeneralLiability(driver,
		// 1, 2).click();
		// test.log(LogStatus.PASS,"First GL Rate Based On Radio Button Selected
		// Successfully");
		AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver, 1).sendKeys("123ab");
		test.log(LogStatus.PASS, "First GL Class Code Added Successfully");
		AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField(driver, 1).sendKeys("Testing");
		test.log(LogStatus.PASS, "First GL Description Added Successfully");
		AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 1, 2).click();
		test.log(LogStatus.PASS, "First GL Rate Per Radio Button Selected Succesfully ");

		
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver,
		// 1).sendKeys("10");
		// test.log(LogStatus.PASS, "First GL Rate Added Successfully");
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked On Add Additional General Liability Button");
		test.log(LogStatus.PASS, "====== First GL Added Successfully ======");
		Thread.sleep(2000);
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForGeneralLiability(driver, 2, 3).click();
		//test.log(LogStatus.PASS, "Second GL Rate Based On Radio Button Selected Successfully");
		
		
		
		//js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver, 2));
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver, 2).sendKeys("123abcdf");
		test.log(LogStatus.PASS, "Second GL Class Code Added Successfully");
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField(driver, 2).sendKeys("Testing");
		test.log(LogStatus.PASS, "Second GL Description Added Successfully");
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 2, 2).click();
		//test.log(LogStatus.PASS, "Second GL Rate Per Radio Button Selected Succesfully ");
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver,
		// 2).sendKeys("1");
		// test.log(LogStatus.PASS, "Second GL Rate Added Successfully");
		Thread.sleep(2000);
		//AddContractor_Pkg_GL_Umbrella_Coverage_Page.generalLiabilitySubmitButton(driver, 2).click();
		//test.log(LogStatus.INFO, "Clicked On Submit Button Successfully");
		test.log(LogStatus.PASS, "====== Second GL Added Successfully ======");

		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		// js.executeScript("arguments[0].click();",
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForumbrellaLiability(driver,
		// 1, 2));

		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForumbrellaLiability(driver,
		// 1, 2).click();
		// test.log(LogStatus.PASS,"First UMB Rate Based On Radio Button
		// Selected Successfully");
		//js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver, 1));
		//js.executeScript("arguments[0].click();",
			//	AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver, 1));
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver, 1));
		AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver, 1).sendKeys("456Abc");
		test.log(LogStatus.PASS, "First UMB Class Code Added Successfully");

		AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBDescriptionField(driver, 1).sendKeys("Testing");
		test.log(LogStatus.PASS, "First UMB Description Added Successfully");
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerUmbrellaLiability(driver,
		// 1, 3).click();
		// test.log(LogStatus.PASS,"First UMB Rate Per Radio Button Selected
		// Succesfully ");
		// AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldUMB(driver,1).sendKeys("5");
		// test.log(LogStatus.PASS,"First UMB Rate Added Successfully");
		test.log(LogStatus.PASS, "====== First UMB Added Successfully ======");

		
		
		
		// Pollution Policy
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.PLClassCodeField(driver, 1));
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.PLClassCodeField(driver, 1));
		AddContractor_Pkg_GL_Umbrella_Coverage_Page.PLClassCodeField(driver, 1).sendKeys("456Abc");
		test.log(LogStatus.PASS, "First UMB Class Code Added Successfully");

		AddContractor_Pkg_GL_Umbrella_Coverage_Page.PLDescriptionField(driver, 1).sendKeys("Testing");
		test.log(LogStatus.PASS, "First UMB Description Added Successfully");
		test.log(LogStatus.PASS, "====== First Pollution Added Successfully ======");

		//js.executeScript("window.scrollBy(0,5000)");
		
		wb.scrollToEndt();
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));

		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
		test.log(LogStatus.INFO, "Clicked On GL Umbrella Mark as Confirmed Radio Button");
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.btnSaveAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On GL Umbrella Save And Continue Button");
		Thread.sleep(8000);

		// sub contractor page come before the documents page
		wb.waitForElemnet(AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver));
		// AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver).click();
		Thread.sleep(5000);

		// Document Page
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
		// add file through AutoIT
		// Runtime.getRuntime().exec("E:\\kp workspace selenium\\Wrap Portal\\AutoIT
		// Script\\FileUpload.exe");
		Runtime.getRuntime().exec("D:\\NOURTEK\\InjalaProject\\AutoIT\\AddDocumnet.exe");
		//Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal\\AutoIT Script\\Raja\\AddDocumnet.exe");
		test.log(LogStatus.PASS, "Documnet Added Successfully");
		Thread.sleep(5000);
		AddContractor_Pkg_Required_Documents_Page.addDocAddBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Alert Add Document Button");
		Thread.sleep(2000);
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

		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentSummaryPageConfirmAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On Enrollment Summary Confirm And Continue Button");

		try {

			wb.mouseMoveToElement(
					AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
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

		wb.waitForElemnet(
				AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentConfirmationPageFinishAndClose(driver));
		test.log(LogStatus.PASS, "Clicked On Enrollent Confirmation Page Finish And Close");
		test.log(LogStatus.PASS, "Contractor Package Enrolled Successfully");
		driver.switchTo().window(wb.map.get("parentID"));

	}

}
