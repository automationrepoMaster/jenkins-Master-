package TestScript_NCP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ModulerLibrary.NCP_LoginAction;
import ObjectRepository.AddContractor_Pkg_GL_Umbrella_Coverage_Page;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddContractor_WC_Premiums_Modifications_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository_CPO.CPO_Add_CP_EnrollmentPage;
import ObjectRepository_CPO.CPO_Add_CP_InsuranceEnrollmentPage;
import ObjectRepository_NCP.EnrollCP_Enrollment_Page;
import ObjectRepository_NCP.NCP_HomePage;

public class EnrollContractorPackageWC_GL_Test extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
	// public String projectName;
	String programName = "Automation Program dont touch";
	String projectName = "Test 132 ON"; // "Test Project 10";
	String contractorCompany = "Alex Comp2273";// "Alex Comp3524";// "sony";
	String contactName = "Jimmy Smith";

	// String tradeName="TN8820";//we take randomly
	String dba = RandomClass.randomDBA();
	/* AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC(); */
	//public String contractorName = "Alex Comp2273";
	// public String tradeNumber = "OCP001- | 007"; // RandomClass.randomTradeNO();
	public String tradenumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	public String traade = "OCP001";

	public String searchBoxValue = "Alex";
	//public String tradeNumber = traade;

	//public String tradeName = RandomClass.randomTradeDescription();

	public void add_CP_Via_Project() throws Throwable {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * HomePage.controlMenuContractorPackage(driver).click(); Thread.sleep(6000);
		 * test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");
		 * 
		 * // js.executeScript("window.scrollBy(0,-250)", "");
		 * js.executeScript("arguments[0].click();",
		 * ContractorPackageModule.addIcon(driver)); test.log(LogStatus.INFO,
		 * "Clicked On Add Contractor Package Icon"); Thread.sleep(2000); //
		 * ContractorPackageModule.addIcon(driver).click(); wb.getWindowIDs();
		 * driver.switchTo().window(wb.map.get("childID"));
		 * driver.manage().window().maximize();
		 * 
		 * // Select program
		 * wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
		 * AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(programName);
		 * 
		 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * selectProgramDropdownAutocomplete(driver), programName); //
		 * AddContractor_Pkg_Page.selectProgramSearchBox(driver).
		 * sendKeys("Sony Tower Test",Keys.TAB);
		 * System.out.println("Program Added Successfully"); test.log(LogStatus.PASS,
		 * programName + " Program  added successfully"); Thread.sleep(2500); // select
		 * project AddContractor_Pkg_Page.selectProject(driver).click();
		 * AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
		 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * selectProjectDropdownAutocomplete(driver), projectName);
		 * System.out.println("Project Added Successfully"); test.log(LogStatus.PASS,
		 * projectName + " Project added successfully");
		 * 
		 * Thread.sleep(2000); // select enrollment type
		 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		 * AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).
		 * sendKeys("WC & GL");
		 * System.out.println("Enrollment Type Added Successfully");
		 * test.log(LogStatus.PASS, "Enrollment Type added successfully");
		 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * selectEnrollmentTypeDropdownAutocomplete(driver), "WC & GL Enrollment"); //
		 * select contractor AddContractor_Pkg_Page.selectContractor(driver).click();
		 * AddContractor_Pkg_Page.selectContractor(driver).sendKeys(contractorCompany);
		 * Thread.sleep(2000);
		 * AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
		 * System.out.println("Contractor Added Successfully"); test.log(LogStatus.PASS,
		 * "Contractor added successfully"); Thread.sleep(2000);
		 * 
		 * // select contact AddContractor_Pkg_Page.SelectContact(driver).click();
		 * AddContractor_Pkg_Page.SelectContactSearchBox(driver).click();
		 * wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * SelectContactAutoCompllete(driver), contactName); test.log(LogStatus.PASS,
		 * contactName + " Contact added successfully"); Thread.sleep(2500);
		 * 
		 * 
		 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		 * test.log(LogStatus.PASS, "Trade added succesfully"); Thread.sleep(2000);
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * driver.manage().window().maximize(); Thread.sleep(1000);
		 * 
		 * 
		 * // Select Trade
		 * 
		 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		 * test.log(LogStatus.PASS, "Click on Add New Trade Link"); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); Thread.sleep(2000);
		 * driver.manage().window().maximize();
		 * AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(tradeName);
		 * test.log(LogStatus.PASS, "Trade Description Added Successfully");
		 * System.out.println(tradeName);
		 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradenumber);
		 * test.log(LogStatus.PASS, "Tradenumber added succesfully");
		 * wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver),
		 * "Active"); test.log(LogStatus.PASS, "Trade Status Selected Successfully");
		 * AddTradePage.addTradeSaveAndCloseBtn(driver).click(); Thread.sleep(4000);
		 * wb.getWindowIDs(); driver.switchTo().window(wb.map.get("childID"));
		 * 
		 * 
		 * // Select Trade
		 * 
		 * AddContractor_Pkg_Page.selectTrade(driver).click(); test.log(LogStatus.PASS,
		 * "Trade dropdown is clicked successfully"); Thread.sleep(1000);
		 * AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(tradeNumber);
		 * Thread.sleep(1000); wb.selectSingleValueFromList(AddContractor_Pkg_Page.
		 * selectTradeDropdownAutocomplete(driver), tradeNumber);
		 * 
		 * 
		 * AddContractor_Pkg_Page.btnNext(driver).click(); test.log(LogStatus.INFO,
		 * "Clicked On Next Button"); Thread.sleep(2000); try {
		 * AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();//
		 * newly added alert for compliance // button 20/01/2020 } catch (Exception e) {
		 * test.log(LogStatus.PASS, "No alert  was found at Non CIP"); }
		 * Thread.sleep(3000); try {
		 * AddContractor_Pkg_Page.ContractNumber_Feild(driver).click();
		 * AddContractor_Pkg_Page.ContractNumber_Feild(driver).clear();
		 * AddContractor_Pkg_Page.ContractNumberExists_AlertOKbtn(driver).click(); }
		 * catch (Exception e) {
		 * System.out.println("No such alert at Contractor number feild"); } try {
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * Thread.sleep(1000); AddContractor_Pkg_Page.btnNext(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Next Button"); Thread.sleep(2000); }
		 * catch (Exception e) { test.log(LogStatus.PASS,
		 * "No such trade alert at next button "); } try {
		 * AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();//
		 * newly added alert for compliance // button 20/01/2020 } catch (Exception e) {
		 * test.log(LogStatus.PASS, "No alert  was found at Non CIP"); }
		 * 
		 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
		 * driver.switchTo().window(wb.map.get("parentID"));
		 * System.out.println("Contractor Package Created Successfully");
		 * test.log(LogStatus.PASS, "Contractor Package Created successfully");
		 */
		
		
		
		//@Test()
		//public void add_CP_Via_Project() throws Throwable {

			
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
				
				/*
				 * // Select Trade
				 * 
				 * AddContractor_Pkg_Page.addNewTradeLink(driver).click();
				 * test.log(LogStatus.PASS, "Click on Add New Trade Link"); wb.getWindowID3();
				 * driver.switchTo().window(wb.map.get("subchildID")); Thread.sleep(2000);
				 * driver.manage().window().maximize();
				 * AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(tradeName);
				 * test.log(LogStatus.PASS, "Trade Description Added Successfully");
				 * System.out.println(tradeName);
				 * AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradenumber);
				 * test.log(LogStatus.PASS, "Tradenumber added succesfully");
				 * wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver),
				 * "Active"); test.log(LogStatus.PASS, "Trade Status Selected Successfully");
				 * AddTradePage.addTradeSaveAndCloseBtn(driver).click(); Thread.sleep(4000);
				 * wb.getWindowIDs(); driver.switchTo().window(wb.map.get("childID"));
				 */

				
				  // Select Trade
				  
				  AddContractor_Pkg_Page.selectTrade(driver).click(); 
				  test.log(LogStatus.PASS, "Trade dropdown is clicked successfully"); 
				  Thread.sleep(1000);
				  AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(traade);
				  Thread.sleep(1000); wb.selectSingleValueFromList(AddContractor_Pkg_Page.
				  selectTradeDropdownAutocomplete(driver), traade);
				 

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
				}catch (Exception e) {
					System.out.println("No such alert at Contractor number feild");
				}
				try {
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        Thread.sleep(1000);
				AddContractor_Pkg_Page.btnNext(driver).click();
				test.log(LogStatus.INFO, "Clicked On Next Button");
				Thread.sleep(2000);
				}catch (Exception e) {
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
	

	@Test

	public void enrollCPWC_GL() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		add_CP_Via_Project();
		Thread.sleep(3000);

//		System.out.println(dba);
		String BaseUrl = driver.getCurrentUrl();
		NCP_LoginAction.logInNCP(driver);

		NCP_HomePage.btnFilterBy(driver).click();
		test.log(LogStatus.PASS, " Clicked On Filter Button");

		NCP_HomePage.selectProgramField(driver).click();
		test.log(LogStatus.PASS, " Clicked On Select Program Field");
		Thread.sleep(2000);
		wb.selectSingleValueFromList(NCP_HomePage.selectProgramFromList(driver), programName);
		test.log(LogStatus.PASS, programName + " Program Name successfully selected form drop down");
		Thread.sleep(2500);

		NCP_HomePage.selectProjectField(driver).click();
		test.log(LogStatus.PASS, " Clicked On Select Project Field");
		Thread.sleep(2000);
		wb.selectSingleValueFromList(NCP_HomePage.selectProjectFromList(driver), projectName);
		test.log(LogStatus.PASS, projectName + " Project Name successfully selected form drop down");
		Thread.sleep(2900);

		/*
		 * NCP_HomePage.selectTradeField(driver).click(); test.log(LogStatus.PASS,
		 * " Clicked On Select Trade Field"); Thread.sleep(1500);
		 * NCP_HomePage.searchForTradeField(driver).click(); Thread.sleep(1500);
		 * NCP_HomePage.searchForTradeField(driver).sendKeys(tradenumber);
		 * Thread.sleep(1500); System.out.println(tradenumber); //
		 * wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
		 * tradeName); test.log(LogStatus.PASS,
		 * tradeName+" Trade successfully selected form drop down");
		 */
		
		//Select trade
		
		
		  NCP_HomePage.selectTradeField(driver).click(); 
		  test.log(LogStatus.PASS,
		  "Trade dropdown is clicked"); Thread.sleep(2000);
		  NCP_HomePage.searchForTradeField(driver).sendKeys("OCP001");
		  Thread.sleep(1000);
		  wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
		  traade); //NCP_HomePage.selectTradeFromList(driver) Thread.sleep(2000);
		 
		NCP_HomePage.ContractorStatusDropDown(driver).click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", NCP_HomePage.SelectbyStatusName(driver, "Assigned"));
		NCP_HomePage.SelectbyStatusName(driver, "Assigned").click();
		Thread.sleep(2500);
		NCP_HomePage.btnSearch(driver).click();
		test.log(LogStatus.PASS, " Clicked on Search Button");

		Thread.sleep(5000);
		/*
		 * NCP_HomePage.searchForContractorPkgField(driver).sendKeys("Automation");
		 * Thread.sleep(2000);
		 * NCP_HomePage.searchForContractorPkgSearchIcon(driver).click();
		 * Thread.sleep(4000);
		 */

		NCP_HomePage.selectPreviewPanelProjectDropdown(driver, projectName).click();
		test.log(LogStatus.PASS, " Clicked on Selected Contractor Package");
		Thread.sleep(1000);
		NCP_HomePage.selectEnrollmentTab(driver, "Enrollment").click();
		test.log(LogStatus.PASS, " Clicked on Enrollment View");
		Thread.sleep(3000);
//		EnrollCP_Enrollment_Page.CompanyInformationEditBtn(driver).click();

		try {
			EnrollCP_Enrollment_Page.cipAgreementContinueButton(driver).click();
		} catch (Throwable e) {
			System.out.println(e);
		}

		// Add New DBA
		EnrollCP_Enrollment_Page.addNewContractorDBALink(driver).click();
		test.log(LogStatus.PASS, " Clicked Add New DBA link");
		Thread.sleep(1000);
		EnrollCP_Enrollment_Page.addNewDBAField(driver).click();
		test.log(LogStatus.PASS, " Clicked on add new DBA Field");
		EnrollCP_Enrollment_Page.addNewDBAField(driver).sendKeys(dba);
		test.log(LogStatus.PASS, " DBA Added Successfully");
		EnrollCP_Enrollment_Page.addNewDBASaveBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on DBA Save Button");
		// Thread.sleep(1500);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.EMR_Field(driver));
		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.EMR_Field(driver));
		test.log(LogStatus.PASS, " Clicked on DBA Save Button");
		// EnrollCP_Enrollment_Page.EMR_Field(driver).click();
		Thread.sleep(2000);
		EnrollCP_Enrollment_Page.EMR_Field(driver).clear();
		EnrollCP_Enrollment_Page.EMR_Field(driver).sendKeys("10");
		test.log(LogStatus.PASS, " EMR Added Successfully");
		Thread.sleep(2000);
		EnrollCP_Enrollment_Page.EMR_EndDateField(driver).click();
		EnrollCP_Enrollment_Page.EMR_EndDateField(driver).sendKeys("12/15/2021"); // Raja 12/15/2020
		EnrollCP_Enrollment_Page.EMR_EndDateField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, " End Date Added Successfully");
		Thread.sleep(1000);
		// Raja
		/*
		 * EnrollCP_Enrollment_Page.legalStatusField(driver).click();
		 * wb.selectSingleValueFromList(EnrollCP_Enrollment_Page.selectLegalStatus(
		 * driver), "Joint Venture"); test.log(LogStatus.PASS,
		 * " Select Legarl Status Joint Venture From DropDown");
		 */
		EnrollCP_Enrollment_Page.btnContinue(driver).click();
		test.log(LogStatus.PASS, " Clicked on Continue Button");
		Thread.sleep(4000);

//Contact Information Page
		js.executeScript("arguments[0].scrollIntoView();",
				EnrollCP_Enrollment_Page.sameAsPrimaryContactCheckBox(driver));
		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.sameAsPrimaryContactCheckBox(driver));
		test.log(LogStatus.PASS, " Same As Primary Contact Check box selected successfully");
		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
		test.log(LogStatus.PASS, " Clicked on Continue Button");
		Thread.sleep(3000);

//Contract Details Page
		EnrollCP_Enrollment_Page.contractPriceField(driver).clear();
		EnrollCP_Enrollment_Page.contractPriceField(driver).sendKeys("6100000");
		test.log(LogStatus.PASS, " Contract Value Added Successfully");
		EnrollCP_Enrollment_Page.selefPerformContractValue(driver).clear();
		EnrollCP_Enrollment_Page.selefPerformContractValue(driver).sendKeys("610000");
		test.log(LogStatus.PASS, " Self Perform Contract Value Added Successfully");
		EnrollCP_Enrollment_Page.estimatedManhours(driver).clear();
		EnrollCP_Enrollment_Page.estimatedManhours(driver).sendKeys("6100");
		test.log(LogStatus.PASS, " Estimated Hours Added Successfully");

		try {
			EnrollCP_Enrollment_Page.estimatedUncappedPayroll(driver).clear();
			EnrollCP_Enrollment_Page.estimatedUncappedPayroll(driver).sendKeys("955000");
			test.log(LogStatus.PASS, " Uncapped Payroll Added Successfully");
		} catch (Throwable e) {
			System.out.println(e);
		}
//alert occurred first time
		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " click on Alert Continue");
		} catch (Throwable e) {
			System.out.println(e);
		}

		// alert occurred second time

		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " click on Alert Continue");
		} catch (Throwable e) {
			System.out.println(e);
		}
		/*
		 * EnrollCP_Enrollment_Page.SPCVtoPayrollRatio_Alert_OKBtn(driver).click();
		 */
		try {
			EnrollCP_Enrollment_Page.estimatedCappedPayroll(driver).clear();
			EnrollCP_Enrollment_Page.estimatedCappedPayroll(driver).sendKeys("955000");
			test.log(LogStatus.PASS, " Capped Payroll Added Successfully");
		} catch (Throwable e) {
			System.out.println(e);
		}
//		EnrollCP_Enrollment_Page.estimatedCappedPayroll(driver).sendKeys(Keys.TAB);

		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.estimatedStartDate(driver));
		EnrollCP_Enrollment_Page.estimatedStartDate(driver).clear();
		EnrollCP_Enrollment_Page.estimatedStartDate(driver).sendKeys("12/20/2019");
		Thread.sleep(1000);
		test.log(LogStatus.PASS, " Estimated Strt Date Added Successfully");
		EnrollCP_Enrollment_Page.estimatedStartDate(driver).sendKeys(Keys.TAB);
		EnrollCP_Enrollment_Page.estimatedEndDate(driver).sendKeys("12/20/2023");
		Thread.sleep(1000);
		EnrollCP_Enrollment_Page.estimatedEndDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, " Estimated End Date Added Successfully");
		EnrollCP_Enrollment_Page.selectUnitCostSwitch(driver).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.selectFixedCostSwitch(driver));
		EnrollCP_Enrollment_Page.selectFixedCostSwitch(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, " Fixed Cost Switch Selected Successfully");
		EnrollCP_Enrollment_Page.ScopeOfWorkTestArea(driver).sendKeys("Testing scope of Work");
		test.log(LogStatus.PASS, " Scope of Work Description Added Successfully");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
		test.log(LogStatus.PASS, " Clicked on Continue Button at Contract Details Page ");
		Thread.sleep(3000);

//Add Work Class

		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.WCClassCodeField(driver));
		test.log(LogStatus.PASS, " Clicked on Add Work Class Button");
		Thread.sleep(4000);
		EnrollCP_Enrollment_Page.WCClassCodeField(driver).sendKeys("Test");
		test.log(LogStatus.PASS, " Work Class Selected Successfully");
		Thread.sleep(2000);
		EnrollCP_Enrollment_Page.WCClassCodeField(driver).sendKeys(Keys.TAB);
		Thread.sleep(1500);
		try {
			EnrollCP_Enrollment_Page.cappedUncappedAlertOKBtn(driver).click();
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert present at Workers Comoensation Class code feild");
		}
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.WCHoursField(driver));
		EnrollCP_Enrollment_Page.WCHoursField(driver).click();
		EnrollCP_Enrollment_Page.WCHoursField(driver).sendKeys("150");
		EnrollCP_Enrollment_Page.WCHoursField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, " Work Hours Added Successfully");

		try {
			EnrollCP_Enrollment_Page.WCUncappedPayrollField(driver).sendKeys("15000", Keys.TAB);
			test.log(LogStatus.PASS, " Work Class Uncapped Payroll Added Successfully");

		} catch (Throwable e) {
			System.out.println(e);
		}

		try {
			EnrollCP_Enrollment_Page.WCCappedPayrollField(driver).sendKeys("15000", Keys.TAB);
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Work Class Capped Payroll Added Successfully");
		} catch (Throwable e) {
			System.out.println(e);
		}

//		EnrollCP_Enrollment_Page.WCUncappedPayrollField(driver).sendKeys("15000");
		EnrollCP_Enrollment_Page.WCRateField(driver).sendKeys("15");
		test.log(LogStatus.PASS, " Work Class Rate Added Successfully");
		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
		test.log(LogStatus.PASS, " Clicked on Continue Button");
		Thread.sleep(2000);
		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
			test.log(LogStatus.PASS, " Alert Accepted");
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}
		Thread.sleep(3000);

		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}

//		EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
		test.log(LogStatus.PASS, " Alert Accepted");
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.btnContinue(driver));
		js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
		test.log(LogStatus.PASS, " Clicked on Continue Buttonat Work class");

		Thread.sleep(3000);
		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
			test.log(LogStatus.PASS, " Alert Accepted");
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}
		Thread.sleep(3000);

		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}

		// contract Details Summary

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		EnrollCP_Enrollment_Page.btnContinue(driver).click();
		test.log(LogStatus.PASS, "Continue button at Contract Details summary page is clicked");

//Premium modification Page

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.btnContinue(driver));
		test.log(LogStatus.PASS, " Clicked on Premium Modification Page Continue Button");
		Thread.sleep(3000);
		try {
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			test.log(LogStatus.PASS, " Clicked on Continue Button");

			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
			test.log(LogStatus.PASS, " Alert Accepted");
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}
		Thread.sleep(3000);

		try {
			EnrollCP_Enrollment_Page.CVtoPayrollRatio_Alert_LetContinueBtn(driver).click();
		} catch (Throwable e) {
			System.out.println("Alert Not Present" + e);
		}

//GL Page
		try {
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.selectGLClassCode(driver, 1));
			EnrollCP_Enrollment_Page.selectGLClassCode(driver, 1).click();
			test.log(LogStatus.PASS, " Clicked on GL Class Code Field");
			Thread.sleep(1000);
			wb.selectSingleValueFromList(EnrollCP_Enrollment_Page.selectGLClassCodeFromList(driver, 1),
					"Airport runaway");
			test.log(LogStatus.PASS, " GL Class Code Selected Successfully");
			EnrollCP_Enrollment_Page.glSIRLossChargeField(driver).click();
			EnrollCP_Enrollment_Page.glSIRLossChargeField(driver).sendKeys("100");
			test.log(LogStatus.PASS, " GL Sir Loss Charge Added Successfully");
			EnrollCP_Enrollment_Page.glDeductibleField(driver).click();
			EnrollCP_Enrollment_Page.glDeductibleField(driver).sendKeys("100");
			test.log(LogStatus.PASS, " GL Deductible Added Successfully");
		} catch (Exception e) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			test.log(LogStatus.PASS, " Clicked on Continue Button at  gl class code");
			Thread.sleep(12000);
		}

//UMB Page
		try {
			// wb.waitForElemnet(EnrollCP_Enrollment_Page.selectUMBClassCode(driver, 1));
			js.executeScript("window.scrollBy(0,250)", "");
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.selectUMBClassCode(driver, 1));
			test.log(LogStatus.PASS, " Clicked on UMB Class Code Field");
			EnrollCP_Enrollment_Page.selectUMBClassCode(driver, 1).click();
			Thread.sleep(1000);
			wb.selectSingleValueFromList(EnrollCP_Enrollment_Page.selectUMBClassCodeFromList(driver, 1),
					"Airport runaway");
			test.log(LogStatus.PASS, " UMB Class Code Selected Successfully");
		} catch (Exception e) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.btnContinue(driver));
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			test.log(LogStatus.PASS, " Clicked on Continue Button");
		}
		Thread.sleep(9000);

		// Pollution liability

		try {
			wb.waitForElemnet(EnrollCP_Enrollment_Page.selectPollClassCode(driver, 1));
			js.executeScript("window.scrollBy(0,350)", "");
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.selectPollClassCode(driver, 1));
			EnrollCP_Enrollment_Page.selectPollClassCode(driver, 1).click();
			test.log(LogStatus.PASS, " Clicked on POll Class Code Field");
			Thread.sleep(1000);
			wb.selectSingleValueFromList(EnrollCP_Enrollment_Page.selectPollClassCodeFromList(driver, 1),
					"Airport runaway");
			test.log(LogStatus.PASS, " Poll Class Code Selected Successfully");
		} catch (Exception e) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.btnContinue(driver));
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			Thread.sleep(9000);

			test.log(LogStatus.PASS, " Clicked on Continue Button at Pollution liability page ");

			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			try {
				js.executeScript("arguments[0].scrollIntoView();",
						EnrollCP_Enrollment_Page.lookGoodContinueBtn(driver));
				EnrollCP_Enrollment_Page.lookGoodContinueBtn(driver).click();
				test.log(LogStatus.PASS, " Clicked on Looks Good Continue Button");
				Thread.sleep(5000);
			} catch (Exception e11) {
				test.log(LogStatus.PASS, "No such button at ollution liability page");
			}

			/*
			 * // pollution liability try {
			 * 
			 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 * js.executeScript("arguments[0].click();",
			 * EnrollCP_Enrollment_Page.btnContinue(driver)); test.log(LogStatus.PASS,
			 * " Clicked on Continue Button at 2nd time "); Thread.sleep(12000);
			 * }catch(Exception e) { Thread.sleep(4000);
			 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 * js.executeScript("arguments[0].click();",
			 * EnrollCP_Enrollment_Page.btnContinue(driver)); test.log(LogStatus.PASS,
			 * " Clicked on Continue Button at 2nd time in catch block at UMB page ");
			 * System.out.println("No such buttoon at Lok good");
			 * 
			 * }
			 */

//sub Contractor 
			EnrollCP_Enrollment_Page.subContractorCostNoBtn(driver).click();
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			test.log(LogStatus.PASS, " Clicked on SubContractor Continue Button");
			Thread.sleep(3000);
//sub summary page
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.lookGoodContinueBtn(driver));
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.lookGoodContinueBtn(driver));
			Thread.sleep(3000);
			test.log(LogStatus.PASS, " Clicked on Sub Summary Looks Good Continue Button");
//Documents

			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			test.log(LogStatus.PASS, " Clicked on Documents Continue Button");
			Thread.sleep(3000);
			try {
				js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.btnContinue(driver));
			} catch (NoSuchElementException e1111) {
				System.out.println(e1111);
			}

			Thread.sleep(5000);
			js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.letMeOutBtn(driver));
			test.log(LogStatus.PASS, " Clicked on Let Me Out Button");
			Thread.sleep(3000);

			try {
				EnrollCP_Enrollment_Page.cipAgreementConfirmationSubmitDegitalEnrollmentButton(driver).click();
				Thread.sleep(6000);
			} catch (Throwable e2222) {
				System.out.println(e2222);
			}

			try {
				js.executeScript("arguments[0].click();", EnrollCP_Enrollment_Page.submitEnrollmentBtn(driver));
				test.log(LogStatus.PASS, " Clicked on Submit Enroll Button");
				Thread.sleep(6000);
			} catch (Throwable e3333) {
				System.out.println(e3333);
			}

			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_Enrollment_Page.CompleteBtn(driver));

			EnrollCP_Enrollment_Page.CompleteBtn(driver).click();
			test.log(LogStatus.PASS, " Clicked Complete Button");

			// Confirm From Admin

			driver.navigate().to(BaseUrl);
			test.log(LogStatus.PASS, " Contractor Package Enrolled Successfully");
			// navigate to base url
			Thread.sleep(5000);

			HomePage.controlMenuHomeIcon(driver).click();
			test.log(LogStatus.INFO, "Clicked On Home Icon");
			HomePage.HomeMenuContractorPackage(driver).click();
			test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");
			wb.scrollToTop();
			test.log(LogStatus.PASS, "scrolled to top at Contractor Pkgs Icon ++++");

			// search for contractor package Thread.sleep(8000); //
			// JavascriptExecutor js= (JavascriptExecutor) driver;
			/*
			 * js.executeScript("window.scrollBy(0,-350)", ""); int x = 1; do { try {
			 * wb.waitForElemnet(ContractorPackageModule.searchEditBox(driver));
			 * test.log(LogStatus.INFO, "Clicked in Search Edit Box"); x = 2; } catch
			 * (Throwable e1) { System.out.println("Search icon not found " + e);
			 * js.executeScript("window.scrollBy(0,-350)", ""); } } while (x == 1);
			 */
			ContractorPackageModule.advanceSearchIcon(driver).click();
			Thread.sleep(2000);
			wb.selectByVisibleText(programName, ContractorPackageModule.advanceSearchSelectProgram(driver));
			test.log(LogStatus.PASS, "progrM Selected from dropdown in adv search contractor pkg");
			Thread.sleep(1500);
			wb.selectByVisibleText(projectName, ContractorPackageModule.advanceSearchSelectProject(driver));
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "project Selected from dropdown in adv search contractor pkg");
			wb.selectByVisibleText("WC & GL Enrollment", ContractorPackageModule.advanceSearchSelectEnrollmenttype(driver));
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "Enrollment  Selected from dropdown in adv search contractor pkg");
			WebElement element = driver.findElement(By.xpath("//span[@class='fltr']/i"));
			element.click();
			Thread.sleep(2000);
			WebElement chbox = driver.findElement(By.xpath("//input[@id='54']"));
			js.executeScript("arguments[0].scrollIntoView();", chbox);
			js.executeScript("arguments[0].click();",chbox);
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",element);
			js.executeScript("arguments[0].click();",element);
			//element.click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",ContractorPackageModule.advanceSearchSearchForTrade(driver));
			js.executeScript("arguments[0].click();",ContractorPackageModule.advanceSearchSearchForTrade(driver)); //.click();
			Thread.sleep(1000);
			ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys("OCP00");
			Thread.sleep(1500);
			ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys(Keys.ENTER);
			
			//ContractorPackageModule.searchEditBox(driver).sendKeys(contractorName, Keys.ENTER);
			//Thread.sleep(10000);
			test.log(LogStatus.INFO, "Search For Respective Company");
		
			js.executeScript("arguments[0].scrollIntoView();",ContractorPackageModule.AdvSearch_SearchBtn_down(driver));
			js.executeScript("arguments[0].click();",ContractorPackageModule.AdvSearch_SearchBtn_down(driver));
			test.log(LogStatus.PASS, "Adv search search btn is clicked");
			Thread.sleep(10000);
			
			//js.executeScript("window.scrollBy(0,-350)", ""); // int x = 1;
			/*
			 * do { try { js.executeScript("arguments[0].click();",
			 * ContractorPackageModule.searchIcon(driver)); test.log(LogStatus.INFO,
			 * "Clicked on Search Icon"); x = 2; } catch (Throwable e2) {
			 * System.out.println("Search icon not found " + e);
			 * js.executeScript("window.scrollBy(0,-350)", ""); } } while (x == 1);
			 */
			Thread.sleep(10000);

		//	js.executeScript("window.scrollBy(0,-250)", ""); // search for respective contractor pkg and click on it
			
			wb.scrollToTop();
			test.log(LogStatus.PASS, "scrolled to top");
			
			// //String trade ="";
			WebElement ele = driver.findElement(By.xpath(
					"//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'Alex Comp2273')]/../..//div[@class='workSite']/span[contains(text(),'Test 132 ON')]/../../../div[2]/div[3]/span[contains(text(),'')]//../..//..//div[@class='statusType']//span[contains(text(),'Pending Review')]")); 
			// js.executeScript("arguments[0].click();",
			ele.click();
			test.log(LogStatus.PASS, ele.getText() + "is clicked");
			Thread.sleep(7000);
			
			// //
			// ContractorPackageModule.selectDynamicContractorPkg(driver, contractorName,
			// projectName, trade)); js.executeScript("arguments[0].click();",ele);
			Thread.sleep(10000);
			driver.switchTo().frame(0);
			//System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());

			// insurance enrollment page
			wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page"); // switch focus to child window
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.manage().window().maximize(); //
			AddContractor_Pkg_Insurance_Enrollment_Page.InsuranceEnrollmentTab(driver).click();
			Thread.sleep(7000);
			
			
			//CPO_Add_CP_EnrollmentPage.linkInsuranceEnrollment(driver).click();
			wb.getWindowIDs();

			driver.switchTo().window(wb.map.get("childID"));
			driver.manage().window().maximize();
			try {
				CPO_Add_CP_InsuranceEnrollmentPage.cipAgreementBtnNext(driver).click();

			} catch (Throwable e11) {
				System.out.println(e);
			}

			try {
				CPO_Add_CP_InsuranceEnrollmentPage.popUpCloneCancelBtn(driver).click();
			} catch (Throwable e1) {
				System.out.println(e);
			}

			
			
			
			
			
			
			
			
			
			
			
			

			js.executeScript("arguments[0].scrollIntoView();",
					AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On Contract Details Mark As Confirmed Radio Button");

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
			Thread.sleep(3000);

			try { // first common alert handled
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e3) {
				System.out.println("Alert issue  " + e3);
			}
			
			try { // first common alert handled
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e3) {
				System.out.println("Alert issue  " + e3);
			}
			
			try { // first common alert handled
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e3) {
				System.out.println("Alert issue  " + e3);
			}
			
			try { // first common alert handled
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e3) {
				System.out.println("Alert issue  " + e3);
			}
			try { // first common alert handled
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e3) {
				System.out.println("Alert issue  " + e3);
			}

			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e4) {
				System.out.println("Alert issue  " + e4);
			}

			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(driver).click();
				Thread.sleep(2000);
			} catch (Throwable e5) {
				System.out.println("Alert issue  " + e5);
			}

			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.alertUncappedPayrolToWorkclassUncappedPayroll(driver)
						.click();
				Thread.sleep(2000);
			} catch (Throwable e6) {
				System.out.println("Alert issue  " + e6);
			}

			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.alertCappedPayrolToWorkclassCappedPayroll(driver).click();
			} catch (Throwable e7) {
				System.out.println("Alert issue  " + e7);
				
			} 
			
			
			// WC modification page
			js.executeScript("window.scrollBy(0,3500)");
			js.executeScript("arguments[0].scrollIntoView();",
					AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver));
			
			js.executeScript("arguments[0].click();",AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver)); //.click();
			test.log(LogStatus.INFO, "Cliced On WC Premium Modification Page Mark As Confirmed Radio Button ");
			
			js.executeScript("window.scrollBy(0,100)");
			
			js.executeScript("arguments[0].scrollIntoView();",
			AddContractor_WC_Premiums_Modifications_Page.btnSaveAndContinue(driver)); 
			//.click();
			js.executeScript("arguments[0].click();",AddContractor_WC_Premiums_Modifications_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.INFO, "Clicked On WC Premium Modificaction Page Save And Continue Button");
			Thread.sleep(7000); 
			
			// GL Page js.executeScript("window.scrollBy(0,5000)");
			js.executeScript("arguments[0].scrollIntoView();",
					AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On GL Umbrella Mark as Confirmed Radio Button");
			js.executeScript("window.scrollBy(0,300)");
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_GL_Umbrella_Coverage_Page.btnSaveAndClose(driver));
			test.log(LogStatus.INFO, "Clicked On GL Umbrella Save And Continue Button");
			Thread.sleep(6000);

		}

		/*
		 * @Test(dependsOnMethods={"enrollCPWC_GL"}) public void
		 * testConfirmCP_AddPayroll() {
		 * 
		 * 
		 * 
		 * }
		 */
	}
}
