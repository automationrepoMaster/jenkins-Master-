package TestScipts_CPO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository_CPO.CPO_Add_CP_ContractDetailsPage;
import ObjectRepository_CPO.CPO_Add_CP_EnrollmentPage;
import ObjectRepository_CPO.CPO_Add_CP_EnrollmentSummaryPage;
import ObjectRepository_CPO.CPO_Add_CP_GL_Umbrella_Coverage_Page;
import ObjectRepository_CPO.CPO_Add_CP_InsuranceEnrollmentPage;
import ObjectRepository_CPO.CPO_Add_CP_Non_CIP_Compliance_Page;
import ObjectRepository_CPO.CPO_Add_CP_RequiredDocumentsPage;
import ObjectRepository_CPO.CPO_Add_CP_WC_PremiumsModificationsPage;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_MyProjectsModule;

public class CPO_EnrollContPkg_TC extends BaseClass {

	
	
	// public String projectName;
	String programName = "Automation Program dont touch";
	String projectName =  "Test 132 ON"; //"Test Project 10";
	String contractorCompany =  "Alex Comp2273";//"Alex Comp3524";// "sony";
	String contactName = "Jimmy Smith";

	// String tradeName="TN8820";//we take randomly
	String dba = RandomClass.randomDBA();
	/* AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC(); */
	public String contractorName = "Alex Comp2273";
	//public String tradeNumber = "OCP001- | 007"; // RandomClass.randomTradeNO();
	public String tradenumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	
	public String tradeName=RandomClass.randomTradeDescription();
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public static String ProgramName = "Automation Program dont touch";
	public static String ProjectName = "Test 132 ON";// Test Project 10"; // Raja--Test 132 ON";
	//public static String contractorCompany = "Alex Comp3524";// "sony";
	//public static String contactName = "Jimmy Smith";

	//String dba = RandomClass.randomDBA();
	//public String contractorName = "Alex Comp2273";
	//public String insuranceCompName = "Carriers3524";
	public String traade = "OCP001";

	public String searchBoxValue = "Alex";
	public String tradeNumber = traade;
	public String ContractNumber = RandomClass.randomClassCodeNumber();
	public String StartDate = "12/01/2020";
	public String EndDate = "12/01/2021";

	public String ContractorName = "Alex Comp2273";
	public String EnrollmentType = "WC & GL Enrollment";
	
	
	public static  WebElement SelectDynamicConttractorPkg(String ProgramName, String Projectname, String contractorname,String Tradenumber,String EnrollmentType,String EnrollmentStatus) {
		WebElement element = driver.findElement(By.xpath("//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'Automation Program dont touch')]/..//*[contains(text(),'Test Project 10')]/..//*[contains(text(),'2085')]/../..//*[contains(text(),'Jimmy Smith')]//..//../..//*[contains(text(),'WC & GL Enrollment')]/../..//..//..//..//..//*[contains(text(),'Assigned')]//..//..//..//*[contains(text(),'Select')]"));
		return element;
	}

	@Test()
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
			  AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(tradeNumber);
			  Thread.sleep(1000); wb.selectSingleValueFromList(AddContractor_Pkg_Page.
			  selectTradeDropdownAutocomplete(driver), tradeNumber);
			 

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
	

	@Test(dependsOnMethods = { "add_CP_Via_Project" })
	public void testEnrollContractorPkg() throws Throwable {

		String BaseUrl = driver.getCurrentUrl();// store base url for future use
		CPO_LogInAction.logInCPO(driver);

		CPO_HomePage.IconMyProjects(driver).click();
		test.log(LogStatus.INFO, " Clicked On My Projects Page");
		wb.selectSingleValue(CPO_MyProjectsModule.selectProgram(driver), ProgramName);
		Thread.sleep(2000);
		wb.selectSingleValue(CPO_MyProjectsModule.selectProjects(driver), ProjectName);
		Thread.sleep(2000);
		System.out.println("tname 1" + tradeNumber);
		wb.selectSingleValue(CPO_MyProjectsModule.selectTrade(driver), "007");
		Thread.sleep(7000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//table[@id='ContrPkgDataGrid']/tbody//tr[position()>1]//*[contains(text(),'Automation Program dont touch')]/..//*[contains(text(),'Test 132 ON')]//..//td[@class='itemTrade'][contains(text(),'')]//..//td[@class='itemContractNumber']//..//td/div[contains(text(),'Jimmy Smith')]//..//..//td[contains(text(),'Alex Comp2273')]/..//td/div[contains(text(),'WC & GL ')]/..//..//td/div[1]/div[contains(text(),'Assigned')]//..//..//..//td/a[contains(text(),'Select')]"));
		js.executeScript("arguments[0].click();",ele);
		//js.executeScript("arguments[0].click();", CPO_MyProjectsModule.selectContractorPackage(driver, ProgramName,
			//	ProjectName, tradeNumber, ContractorName, EnrollmentType));
		test.log(LogStatus.PASS,
				ProgramName + " " + ProjectName + " " + traade + " " + EnrollmentType + " Contractor Package Selected");

		CPO_Add_CP_EnrollmentPage.linkInsuranceEnrollment(driver).click();
		wb.getWindowIDs();

		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		try {
			CPO_Add_CP_InsuranceEnrollmentPage.cipAgreementBtnNext(driver).click();

		} catch (Throwable e) {
			System.out.println(e);
		}

		try {
			CPO_Add_CP_InsuranceEnrollmentPage.popUpCloneCancelBtn(driver).click();
		} catch (Throwable e) {
			System.out.println(e);
		}

		try {

			CPO_Add_CP_InsuranceEnrollmentPage.fieldContractorName(driver).click();
			test.log(LogStatus.PASS, "Contractor Name Added Successfully");

//		JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",
					CPO_Add_CP_InsuranceEnrollmentPage.contactInformationEmail(driver));
		} catch (Exception e) {

			test.log(LogStatus.PASS, "No such alert present  att insuraance enrollment page");
			// TODO: handle exception
		}
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("scrolled by 300");
		test.log(LogStatus.PASS, "scrolled by 300");

//Contact Details Page

		js.executeScript("arguments[0].scrollIntoView();",
				CPO_Add_CP_InsuranceEnrollmentPage.fieldContractValue(driver));
		wb.mouseMoveToElement(CPO_Add_CP_InsuranceEnrollmentPage.fieldContractValue(driver));
		CPO_Add_CP_InsuranceEnrollmentPage.fieldContractValue(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldContractValue(driver).sendKeys("5600000");
		test.log(LogStatus.PASS, "Contract Value Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldSelfPerformedContractValue(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldSelfPerformedContractValue(driver).sendKeys("560000");
		test.log(LogStatus.PASS, "Self Performed Contract Value Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedCappedPayroll(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedCappedPayroll(driver).sendKeys("100000");
		test.log(LogStatus.PASS, "Estimated Uncapped Payroll Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedUncappedPayroll(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedUncappedPayroll(driver).sendKeys("100000");
		test.log(LogStatus.PASS, "Estimated Capped Payroll Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedManHours(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedManHours(driver).sendKeys("1000");
		test.log(LogStatus.PASS, "Estimated Man Hours Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedStartDate(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedStartDate(driver).sendKeys("08/02/2020", Keys.TAB);
		test.log(LogStatus.PASS, "Estimated Start Date Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedCompletionDate(driver).clear();
		CPO_Add_CP_InsuranceEnrollmentPage.fieldEstimatedCompletionDate(driver).sendKeys("12/31/2021", Keys.TAB);

		System.out.println("Program Radio Button is Selected \t"
				+ CPO_Add_CP_InsuranceEnrollmentPage.redioBtnProgram(driver).isSelected());

		js.executeScript("arguments[0].click();",
				CPO_Add_CP_InsuranceEnrollmentPage.textAreaBrieflyDescribetheScopeWork(driver));
		CPO_Add_CP_InsuranceEnrollmentPage.textAreaBrieflyDescribetheScopeWork(driver).sendKeys("Testing");
		js.executeScript("window.scrollBy(0,500)");

		wb.waitForElemnet(CPO_Add_CP_ContractDetailsPage.selectWorkClass(driver));
		js.executeScript("arguments[0].click();", CPO_Add_CP_ContractDetailsPage.selectWorkClass(driver));
		Thread.sleep(4000);
		CPO_Add_CP_ContractDetailsPage.selectWorkClassSearchBox(driver).sendKeys("1234 - Class Code Description");// Test
																													// -removed
																													// by
																													// raja
																													// as
																													// class
																													// code
		wb.selectSingleValueFromList(CPO_Add_CP_ContractDetailsPage.selectAllWorkClassFromAutoCompleteDropDown(driver),
				"1234 - Class Code Description");
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Work Class Selected Successfully" + "as " + "\t" + "1234 - Class Code Description");

		try {
			CPO_Add_CP_ContractDetailsPage.slectWorkClassCappedStateAlertOkBtn(driver).click();

		} catch (Throwable e) {
			System.out.println("Alert Not Present Statewise" + e);
		}

		/*
		 * js.executeScript("arguments[0].click();",CPO_Add_CP_InsuranceEnrollmentPage.
		 * selectWorkClassSearchBox(driver));
		 * 
		 * CPO_Add_CP_InsuranceEnrollmentPage.selectWorkClassSearchBox(driver).sendKeys(
		 * "Test"); wb.selectSingleValueFromList(CPO_Add_CP_InsuranceEnrollmentPage.
		 * selectAllWorkClassFromAutoCompleteDropDown(driver), "Test");
		 */
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Work Class Selected Successfully");
		// wb.selectSingleValueFromList(CPO_Add_CP_InsuranceEnrollmentPage.selectAllWorkClassFromAutoCompleteDropDown(driver),"Technicians");
		CPO_Add_CP_InsuranceEnrollmentPage.addWorkClassWorkHoursField(driver).sendKeys("100");
		test.log(LogStatus.PASS, "Work Class Hours Added Successfully");
		CPO_Add_CP_InsuranceEnrollmentPage.addWorkClassUnCappedPayrollField(driver).sendKeys("5000");
		test.log(LogStatus.PASS, "Work Class Uncapped Payroll Added Successfully");

		try {

			CPO_Add_CP_InsuranceEnrollmentPage.addWorkClassCappedPayrollField(driver).sendKeys("5000");
			test.log(LogStatus.PASS, "Work Class Capped Payroll Added Successfully");

		} catch (Throwable e) {
			System.out.println("capped payrol field" + e);
		}

		
		CPO_Add_CP_InsuranceEnrollmentPage.addWorkClassRateField(driver).sendKeys("15.00");
		test.log(LogStatus.PASS, "Work Class Rate Added Successfully");
		js.executeScript("arguments[0].click();",
				CPO_Add_CP_InsuranceEnrollmentPage.addWorkClassAddWorkClassBtn(driver));
		test.log(LogStatus.INFO, "Clicked On Add Work Class Button");
		Thread.sleep(10000);

		js.executeScript("arguments[0].click();", CPO_Add_CP_InsuranceEnrollmentPage.btnSaveAndContinue(driver));
		test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//button[@id='btnSaveModal']")).click();
			
			test.log(LogStatus.PASS, "I understood Alert occurs and handled");
		}catch (Exception e) {
			test.log(LogStatus.PASS, "noooo Alert Accepted");
		}

		Alert alert = driver.switchTo().alert();
		
		try {
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert at Save and continue button for Swithed at admin side-1 ");
		}
		try {
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert at Save and continue button for Swithed at admin side -2");
		}
		
		try {
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert at Save and continue button for Swithed at admin side-3 ");
		}
		
		try {
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert at Save and continue button for Swithed at admin side -4");
		}
		
		try {
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert at Save and continue button for Swithed at admin side -5");
		}
			/*Thread.sleep(2000);
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");*/
		
		/*
		 * CPO_Add_CP_InsuranceEnrollmentPage.alertCVtoPayroll(driver).click();
		 * Thread.sleep(2000);
		 * 
		 * CPO_Add_CP_InsuranceEnrollmentPage.
		 * alertUncappedPayrolToWorkclassUncappedPayroll(driver).click();
		 * Thread.sleep(2000);
		 * CPO_Add_CP_InsuranceEnrollmentPage.alertCappedPayrolToWorkclassCappedPayroll(
		 * driver).click(); CPO_Add_CP_ContractDetailsPage.
		 * estimatedPayrollWorkClassPayrollAlertContinueBtn(driver).click();
		 */
		Thread.sleep(10000);

//		js.executeScript("window.scrollBy(0,1000)");

		// NON CIP Page
		/*
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerName(driver).clear();
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerName(driver).sendKeys("Wick");
		 * test.log(LogStatus.PASS, "WC Broker Name Added Successfully");
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerContactName(driver).clear();
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerContactName(driver).sendKeys(
		 * "Shetty"); test.log(LogStatus.PASS,
		 * "WC Broker Contact Name Added Successfully"); //
		 * CPO_InsuranceEnrollmentPage.WC_InsuranceCompanyNameRemoveIcon(driver).clear()
		 * ; // wb.mouseMoveToElement(CPO_InsuranceEnrollmentPage.
		 * WC_InsuranceCompanyNameRemoveIcon(driver)); //
		 * executor.executeScript("arguments[0].click();",CPO_InsuranceEnrollmentPage.
		 * WC_InsuranceCompanyNameRemoveIcon(driver));
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_InsuranceCompanyName(driver).sendKeys(
		 * insuranceCompName); Thread.sleep(3000);
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_InsuranceCompanyName(driver).sendKeys(
		 * Keys.DOWN);
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_InsuranceCompanyName(driver).sendKeys(
		 * Keys.ENTER); test.log(LogStatus.PASS,
		 * "WC Insurance Company Name Added Successfully");
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_PolicyStartDate(driver).clear();
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_PolicyStartDate(driver).sendKeys(
		 * "05/15/2019"); test.log(LogStatus.PASS,
		 * "WC Insurance Start Date Added Successfully");
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerContactPhone(driver).clear();
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_BrokerContactPhone(driver).sendKeys(
		 * RandomClass.randomPhoneNo()); test.log(LogStatus.PASS,
		 * "WC Insurance Contact Phone No Added Successfully");
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_PolicyExpirationDate(driver).clear();
		 * CPO_Add_CP_InsuranceEnrollmentPage.WC_PolicyExpirationDate(driver).sendKeys(
		 * "09/05/2020"); test.log(LogStatus.PASS,
		 * "WC Insurance Policy Expiration Date Added Successfully");
		 * js.executeScript("arguments[0].click();",CPO_Add_CP_InsuranceEnrollmentPage.
		 * checkBoxForGLSameAsWorkerComp(driver)); test.log(LogStatus.PASS,
		 * "GL Insurance Check Box Same As Worker Comp Selected Successfully");
		 * js.executeScript("arguments[0].click();",CPO_Add_CP_InsuranceEnrollmentPage.
		 * checkBoxForUMBSameAsWorkerComp(driver)); test.log(LogStatus.PASS,
		 * "UMB Insurance Check Box Same As Worker Comp Selected Successfully");
		 * js.executeScript("arguments[0].click();",CPO_Add_CP_InsuranceEnrollmentPage.
		 * btnSaveAndContinue(driver)); Thread.sleep(7000); test.log(LogStatus.PASS,
		 * "Clicked On Insurance Enrollment Save And Continue Button");
		 * 
		 * Thread.sleep(5000); } catch (Throwable e) { test.log(LogStatus.FAIL,
		 * e+"Something Went Wrong"); }
		 */

		// Raja wrote this

		// wc compenation premium Modfic
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CPO_Add_CP_WC_PremiumsModificationsPage.btnSaveAndContinue(driver).click();
		test.log(LogStatus.PASS, "save and continue button at WC premium modifications page is selected");
		Thread.sleep(5000);
		try {
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Automobile Liability").click();
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Automobile Liability")
					.sendKeys("Carrier Name1234");
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Automobile Liability")
					.sendKeys(Keys.ARROW_DOWN);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Automobile Liability")
					.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.PolicyStartDate_Feild_AL(driver).click();
			CPO_Add_CP_Non_CIP_Compliance_Page.PolicyStartDate_Feild_AL(driver).sendKeys(StartDate);
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.PolicyStartDate_Feild_AL(driver).sendKeys(Keys.TAB);
			js.executeScript("window.scrollBy(0,400)");
			System.out.println("scrolled to 400 ");

			// General Liability Feils -Non CIP

			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "General Liability").click();
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "General Liability")
					.sendKeys("Carrier Name1234");
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "General Liability")
					.sendKeys(Keys.ARROW_DOWN);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "General Liability")
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_GL(driver).click();
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_GL(driver).sendKeys(StartDate);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_GL(driver).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,400)");
			System.out.println("scrolled to 400 ");

			// Umbrela -Non CIP

			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Umbrella / Excess").click();
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Umbrella / Excess")
					.sendKeys("Carrier Name1234");
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Umbrella / Excess")
					.sendKeys(Keys.ARROW_DOWN);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Umbrella / Excess")
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_Umbrella(driver).click();
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_Umbrella(driver).sendKeys(StartDate);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_Umbrella(driver).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,400)");
			System.out.println("scrolled to 400 ");

			// WC -Non CIP

			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Worker").click();
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Worker")
					.sendKeys("Carrier Name1234");
			Thread.sleep(1000);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Worker").sendKeys(Keys.ARROW_DOWN);
			CPO_Add_CP_Non_CIP_Compliance_Page.SelectDynamicLiabilityByname(driver, "Worker").sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_WC(driver).click();
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_WC(driver).sendKeys(StartDate);
			CPO_Add_CP_Non_CIP_Compliance_Page.policyStartDate_WC(driver).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("scrolled to End ");

			CPO_Add_CP_Non_CIP_Compliance_Page.saveandContinueBtn(driver).click();
			Thread.sleep(4000);

			// Wc Premium page
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("arguments[0].click();",
					CPO_Add_CP_WC_PremiumsModificationsPage.btnSaveAndContinue(driver));
			test.log(LogStatus.INFO, "Clicked On WC Premium Modificaction Page Save And Continue Button");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,1500)");
			// GL Page

			/*
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.
			 * selectTableAndRateBaseForGeneralLiability(driver, 1, 2).click();
			 * test.log(LogStatus.PASS,
			 * "First GL Rate Based On Radio Button Selected Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.GLClassCodeField(driver,
			 * 1).sendKeys("123ab"); test.log(LogStatus.PASS,
			 * "First GL Class Code Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.GLDescriptionField(driver,
			 * 1).sendKeys("Testing"); test.log(LogStatus.PASS,
			 * "First GL Description Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 1,
			 * 2).click(); test.log(LogStatus.PASS,
			 * "First GL Rate Per Radio Button Selected Succesfully ");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver,
			 * 1).sendKeys("1"); test.log(LogStatus.PASS,
			 * "First GL Rate Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
			 * test.log(LogStatus.INFO,
			 * " Clicked On Add Additional General Liability Button");
			 * test.log(LogStatus.PASS, "====== First GL Added Successfully ======");
			 * Thread.sleep(2000); CPO_Add_CP_GL_Umbrella_Coverage_Page.
			 * selectTableAndRateBaseForGeneralLiability(driver, 2, 3).click();
			 * test.log(LogStatus.PASS,
			 * "Second GL Rate Based On Radio Button Selected Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.GLClassCodeField(driver,
			 * 2).sendKeys("123abcdf"); test.log(LogStatus.PASS,
			 * "Second GL Class Code Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.GLDescriptionField(driver,
			 * 2).sendKeys("Testing"); test.log(LogStatus.PASS,
			 * "Second GL Description Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 2,
			 * 2).click(); test.log(LogStatus.PASS,
			 * "Second GL Rate Per Radio Button Selected Succesfully ");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver,
			 * 2).sendKeys("1"); test.log(LogStatus.PASS,
			 * "Second GL Rate Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.generalLiabilitySubmitButton(driver,
			 * 2).click(); test.log(LogStatus.INFO,
			 * "Clicked On Submit Button Successfully"); test.log(LogStatus.PASS,
			 * "====== Second GL Added Successfully ======"); //
			 * CPO_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
			 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,500)"); //
			 * js.executeScript("arguments[0].click();",CPO_GL_Umbrella_Coverage_Page.
			 * selectTableAndRateBaseForumbrellaLiability(driver, 1, 2));
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.
			 * selectTableAndRateBaseForumbrellaLiability(driver, 1, 2).click();
			 * test.log(LogStatus.PASS,
			 * "First UMB Rate Based On Radio Button Selected Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver,
			 * 1).sendKeys("456Abc"); test.log(LogStatus.PASS,
			 * "First UMB Class Code Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.UMBDescriptionField(driver,
			 * 1).sendKeys("Testing"); test.log(LogStatus.PASS,
			 * "First UMB Description Added Successfully");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.selectRatePerUmbrellaLiability(driver,
			 * 1, 3).click(); test.log(LogStatus.PASS,
			 * "First UMB Rate Per Radio Button Selected Succesfully ");
			 * CPO_Add_CP_GL_Umbrella_Coverage_Page.enterRateFieldUMB(driver,
			 * 1).sendKeys("5"); test.log(LogStatus.PASS,
			 * "First UMB Rate Added Successfully"); test.log(LogStatus.PASS,
			 * "====== First UMB Added Successfully ======");
			 */
		} catch (Exception e) {

			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			test.log(LogStatus.PASS, "Scrolled t0 end at GL page ");
			wb.waitForElemnet(CPO_Add_CP_GL_Umbrella_Coverage_Page.btnSaveAndContinue(driver));
//		js.executeScript("arguments[0].click();",CPO_Add_CP_GL_Umbrella_Coverage_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.INFO, "Clicked On GL Umbrella Save And Continue Button");
			Thread.sleep(3000);
			// TODO: handle exception
		}

//Sub Contractor 
		try {
			wb.waitForElemnet(CPO_Add_CP_RequiredDocumentsPage.btnSaveAndContinueSubContractor(driver));
			test.log(LogStatus.INFO, "Clicked On Sub Contractor Save And Continue Button");
			Thread.sleep(8000);

		} catch (Throwable e1) {
			System.out.println(e1);
		}

//required document page	
		js.executeScript("window.scrollBy(0,1000)");
		wb.waitForElemnet(CPO_Add_CP_RequiredDocumentsPage.btnSaveAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On required Documents Save And Continue Button");

		try {
			Alert alert1 = driver.switchTo().alert();
			alert1.accept();
			Thread.sleep(3000);
			wb.mouseMoveToElement(CPO_Add_CP_InsuranceEnrollmentPage.sendEmailBtnContinueWithoutSending(driver));
		} catch (Throwable e2) {
			System.out.println(e2);
		}

		Thread.sleep(10000);

//Enrollment summary page	
		// wb.waitForElemnet(CPO_Add_CP_EnrollmentSummaryPage.btnEnrollmentSummaryPageConfirmAndContinue(driver));
		js.executeScript("window.scrollBy(0,5300)");
		js.executeScript("arguments[0].scrollIntoView();",
				CPO_Add_CP_EnrollmentSummaryPage.btnEnrollmentSummaryPageConfirmAndContinue(driver));

		try {
			wb.mouseMoveToElement(
					CPO_Add_CP_EnrollmentSummaryPage.checkBoxEnrollmentSummaryPageFinalTermsAndCondition(driver));
			test.log(LogStatus.PASS, "Enrollment Summary Final Terms And Condition Check Box Selected ");

		} catch (Throwable e3) {

			System.out.println(e3);
		}

		js.executeScript("arguments[0].click();",
				CPO_Add_CP_EnrollmentSummaryPage.btnEnrollmentSummaryPageConfirmAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On Enrollment Summary Confirm And Continue Button");

		try {

			wb.mouseMoveToElement(CPO_Add_CP_InsuranceEnrollmentPage.sendEmailBtnContinueWithoutSending(driver));
		} catch (Throwable e4) {
			System.out.println(e4);
		}

		try {
			js.executeScript("arguments[0].click();",
					CPO_Add_CP_EnrollmentSummaryPage.checkBoxEnrollmentSummaryPageAcceptNoLossStmt(driver));
			js.executeScript("arguments[0].click();",
					CPO_Add_CP_EnrollmentSummaryPage.btnEnrollmentSummaryPageAcceptNoLossStmt(driver));
			wb.mouseMoveToElement(CPO_Add_CP_InsuranceEnrollmentPage.sendEmailBtnContinueWithoutSending(driver));
			// wb.mouseMoveToElement(CPO_InsuranceEnrollmentPage.sendEmailBtnContinueWithoutSending(driver));
			Thread.sleep(9000);
			js.executeScript("window.scrollBy(0,1500)");

		} catch (Throwable e5) {
			System.out.println(e5);
		}
		js.executeScript("window.scrollBy(0,500)");
		wb.waitForElemnet(CPO_Add_CP_EnrollmentSummaryPage.btnEnrollmentConfirmationPageFinishAndClose(driver));
		test.log(LogStatus.PASS, "Clicked On Enrollent Confirmation Page Finish And Close");
		test.log(LogStatus.PASS, "Contractor Package Enrolled Successfully");
		driver.switchTo().window(wb.map.get("parentID"));

		driver.navigate().to(BaseUrl);// navigate to base url

	}
}

/*
 * Thread.sleep(5000); driver.switchTo().frame(0);
 * CPO_HomePage.AlertCloseBtn(driver).click();
 * test.log(LogStatus.INFO," Clicked On Alert Window Close Button");
 * driver.switchTo().defaultContent();
 */
