package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class AddContractor_Pkg_Via_ProjectTC extends BaseClass {
	
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	// public String projectName;
	String programName = "Automation Program dont touch";
	String projectName = "Test 132 ON"; // "Test Project 10";
	String contractorCompany = "Alex Comp2273";// "Alex Comp3524";// "sony";
	String contactName = "Jimmy Smith";

	// String tradeName="TN8820";//we take randomly
	String dba = RandomClass.randomDBA();
	/* AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC(); */
	public String contractorName = "Alex Comp2273";
	// public String tradeNumber = "OCP001- | 007"; // RandomClass.randomTradeNO();
	public String tradenumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";

	public String tradeName = RandomClass.randomTradeDescription();

	@Test
	public void add_CP_Via_Project() throws Throwable {
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

		// Select program
		wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(programName);

		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver), programName);
//		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower Test",Keys.TAB);
		System.out.println("Program Added Successfully");
		test.log(LogStatus.PASS, programName + " Program  added successfully");
		Thread.sleep(2500);
		// select project
		AddContractor_Pkg_Page.selectProject(driver).click();
		AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver), projectName);
		System.out.println("Project Added Successfully");
		test.log(LogStatus.PASS, projectName + " Project added successfully");

		Thread.sleep(2000);
		// select enrollment type
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).sendKeys("WC & GL");
		System.out.println("Enrollment Type Added Successfully");
		test.log(LogStatus.PASS, "Enrollment Type added successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
				"WC & GL Enrollment");
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
		 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		 * test.log(LogStatus.PASS, "Trade added succesfully"); Thread.sleep(2000);
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * driver.manage().window().maximize(); Thread.sleep(1000);
		 */

		// Select Trade

		AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		test.log(LogStatus.PASS, "Click on Add New Trade Link");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(tradeName);
		test.log(LogStatus.PASS, "Trade Description Added Successfully");
		System.out.println(tradeName);
		AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradenumber);
		test.log(LogStatus.PASS, "Tradenumber added succesfully");
		wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
		test.log(LogStatus.PASS, "Trade Status Selected Successfully");
		AddTradePage.addTradeSaveAndCloseBtn(driver).click();
		Thread.sleep(4000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));

		/*
		 * // Select Trade
		 * 
		 * AddContractor_Pkg_Page.selectTrade(driver).click(); test.log(LogStatus.PASS,
		 * "Trade dropdown is clicked successfully"); Thread.sleep(1000);
		 * AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(tradeNumber);
		 * Thread.sleep(1000); wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * selectTradeDropdownAutocomplete(driver), tradeNumber);
		 */

		AddContractor_Pkg_Page.btnNext(driver).click();
		test.log(LogStatus.INFO, "Clicked On Next Button");
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

}
