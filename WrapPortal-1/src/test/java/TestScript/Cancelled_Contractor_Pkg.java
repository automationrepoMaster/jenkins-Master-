package TestScript;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class Cancelled_Contractor_Pkg extends BaseClass {
	//WebDriverCommonLib wb = new WebDriverCommonLib();
	public String contractorName = "Alex Comp3524";
	//public String projectName = "Sony Projects3524";
	public String tradeNumber = RandomClass.randomTradeNO();
	//public String programName = "Sony Programs3524";
	public String enrollmentType = "GL Only Enrollment";
	public String status = "Assigned";

	/*
	 * @Test() public void add_CP_Via_Project() throws InterruptedException {
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
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	//public String contractorName = "Alex Comp3524";
	//public String projectName = "Sony Projects3524";
	//public String tradeNumber = RandomClass.randomTradeNO();
	//public String insuranceCompName = "Carriers3524";
	//WebDriverCommonLib wb = new WebDriverCommonLib();
	//public String contractorName = "Alex Comp3524";
	//public String projectName = "Sony Projects3524";
	//public String tradeNumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	String ProgramName="Sony Programs3524";
	//public String ContactName ="Jimmy Smith";
	public String submissionFrequency = "Quarterly";
	public String reportTime = "Quarterly";
	
	//WebDriverCommonLib wb = new WebDriverCommonLib();
	//public String contractorName = "Alex Comp3524";
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
	 * @Test() public void add_CP_Via_Project() throws InterruptedException {
	 * 
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
	 * Thread.sleep(2000); driver.manage().window().maximize(); Thread.sleep(5000);
	 * // select enrollment type
	 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
	 * Thread.sleep(1500); //
	 * AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
	 * AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(
	 * driver).sendKeys("Excluded"); Thread.sleep(500);
	 * System.out.println("Enrollment Type Added Successfully");
	 * test.log(LogStatus.PASS, "Enrollment Type added successfully");
	 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
	 * selectEnrollmentTypeDropdownAutocomplete(driver), "Excluded Contractor");
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
	 * tradeName + " Trade added successfully"); Thread.sleep(2000);
	 * AddContractor_Pkg_Page.btnNext(driver).click(); test.log(LogStatus.PASS,
	 * "Clicked On Next Button"); Thread.sleep(1000); try {
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
	 * driver.close(); driver.switchTo().window(wb.map.get("parentID"));
	 * 
	 * }
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

		Thread.sleep(4000);
		// select enrollment type
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		Thread.sleep(1500); //
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(driver).sendKeys("Excluded Contractor");
		Thread.sleep(500);
		System.out.println("Enrollment Type Added Successfully");
		test.log(LogStatus.PASS, "Enrollment Type added successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
				"Excluded Contractor");
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
	
	

	@Test(dependsOnMethods = { "add_CP_Via_Project" })
	public void enrollContractor_Pkg_GL_OnlyTest() throws InterruptedException, IOException {
		WebDriverWait webwait = new WebDriverWait(driver, 60);
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Clicked On Contracotr Package Icon");
		Thread.sleep(5000);
//		checkPageIsReady();
//		wb.waitForElemnet(ContractorPackageModule.searchEditBox(driver));
//		test.log(LogStatus.PASS, "Clicked On Edit Icon");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		/*
		 * int x = 2; do { try {
		 * ContractorPackageModule.advanceSearchIcon(driver).click();
		 * test.log(LogStatus.PASS, "Clicked On Advance Search Icon"); x = 2; } catch
		 * (Throwable e) { System.out.println(e);
		 * js.executeScript("window.scrollBy(0,-350)", ""); } } while (x == 1);
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
		ContractorPackageModule.advanceSearchSelect_Single_StatusFromDropdown(driver, status).click();
		test.log(LogStatus.PASS, status + " Status Selected Successfully");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@class='dropMain']/a/span/i"));
		Thread.sleep(1500);
		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Advance Search Button");
		Thread.sleep(10000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		 int x = 2;
		do {
			try {
				js.executeScript("arguments[0].click();", ContractorPackageModule.editIcon(driver));
				test.log(LogStatus.PASS, " Clicked On Contractor Package Edit Icon Button");
				x = 2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x == 1);

		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		js.executeScript("arguments[0].click();", AddContractor_Pkg_Page.cancelContractorPkgBtn(driver));
		test.log(LogStatus.PASS, " Clicked On Canceled Contractor Package Button");
		Thread.sleep(2000);
		try {
		AddContractor_Pkg_Page.cancelContractorPkgBtnAlertOKBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked On Canceled Contractor Package Alert Ok Button");
		Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println("No suc alert to cancel");
		}
		
		try {
		js.executeScript("arguments[0].click();", AddContractor_Pkg_Page.saveAndCloseBtn(driver));
		test.log(LogStatus.PASS, " Clicked On Contractor Package Save And Close Button");
		}catch (Exception e) {
			System.out.println("it is already closed");
		}
		try {

			AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();
			test.log(LogStatus.PASS, " Clicked On Contractor Package Compliance Alert OK Button");
//			AddContractor_Pkg_Page.saveAndCloseBtn(driver).click();
		} catch (Throwable e) {
			System.out.println(e);
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(wb.map.get("parentID"));

		System.out.println(ContractorPackageModule.singleContractorPkgStatus(driver).getText());
		if (ContractorPackageModule.singleContractorPkgStatus(driver).getText().contains("Cancelled")) {
			System.out.println("Status Matched and Contractor Package get Cancelled Successfully");
			test.log(LogStatus.PASS, " Status Matched and Contractor Package get Cancelled Successfully");
		} else {
			System.err.println("Status Not Matched");
			test.log(LogStatus.FAIL, " Status Not Matched and Contractor Package not get Cancelled Successfully");
		}

		Thread.sleep(5000);
	}

	public void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Initially bellow given if condition will check ready state of page.
		if (js.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page Is loaded.");
			return;
		}
	}
}
