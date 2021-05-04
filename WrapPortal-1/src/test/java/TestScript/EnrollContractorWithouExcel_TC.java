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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddClassCodePage;
import ObjectRepository.AddContractor_Pkg_Enrollment_Summary_Page;
import ObjectRepository.AddContractor_Pkg_GL_Umbrella_Coverage_Page;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;
import ObjectRepository.AddContractor_Pkg_NonCIP_Compliance_Page;
import ObjectRepository.AddContractor_Pkg_OSHA_EMR_Page;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddContractor_Pkg_Required_Documents_Page;
import ObjectRepository.AddContractor_Pkg_SubContractorInfo;
import ObjectRepository.AddContractor_Pkg_ViewCertificatePage;
import ObjectRepository.AddContractor_WC_Premiums_Modifications_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;


//@Listeners(GenericLibrary.SampleListener.class)



   public class EnrollContractorWithouExcel_TC extends BaseClass {
	   
	   
	WebDriverCommonLib wb = new WebDriverCommonLib();
	AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC();
	public String contractorName = "Alex Comp3524";
	public String ContactName ="Jimmy Smith";
	public String projectName = "Sony Projects3524";
	public String tradeNumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	public String submissionFrequency = "Quarterly";
	public String reportTime = "Quarterly";
	String ProgramName="Sony Programs3524"; // raja 

	/*
	 * Username: JimmySmith114540 Password: aF9H7y2N9XaO
	 */
	
	public WebElement DynamicCpkg() {
		WebElement element =driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/../..//div[@class='companytitle']/span[contains(text(),'Alex Comp3524')]/../../..//div[@class='workSite']/..//div/span[contains(text(),'WC & GL Enrollment')]/../..//..//div[@class='statusType']/div/span[contains(text(),'TRNO4751 | Trades4751')]/../../.."));
		return element;
		
	}

	@Test()
	public void add_CP_Via_Project() throws Throwable {
		
		HomePage.controlMenuHomeIcon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clicked on Home Icon");
		
		/*
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
		 */		
		
//	raja wrote 01072021 release chaange in functionality
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1500);
		HomePage.controlMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Contractor package icon in side panel is clicked");
		Thread.sleep(3500);
		wb.scrollToTop();
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView();", AddContractor_Pkg_Page.plus_Btn(driver));
		js.executeScript("arguments[0].click();", AddContractor_Pkg_Page.plus_Btn(driver));
		//AddContractor_Pkg_Page.plus_Btn(driver).click();
		test.log(LogStatus.PASS, "Plus button is clicked");
		wb.SwitchtoChild1();
//		// Select Program 
		Thread.sleep(4000);
		AddContractor_Pkg_Page.selectProgram(driver).click();
		test.log(LogStatus.PASS, "Select Program dropdown is clicked");
		Thread.sleep(1000);
		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(ProgramName);
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Program name is entered as " + ProgramName);
		Thread.sleep(1000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver), ProgramName );
		test.log(LogStatus.PASS, "Program Name is selected as ===>    " + ProgramName +  " " +  "from drop down") ;
		Thread.sleep(2000);
		
		// Select project
		
		AddContractor_Pkg_Page.selectProject(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Select Project dropdown is clicked");
		AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "project name is entered as " + projectName);
		Thread.sleep(1000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver), projectName );
		test.log(LogStatus.PASS, "project Name is selected as ===>    " + projectName +  " " +  "from drop down") ;
		Thread.sleep(3000);
		
		// select enrollment type
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		Thread.sleep(1500);
	     AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
	     Thread.sleep(1000);
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(driver).sendKeys("WC & GL");
		Thread.sleep(500);
		System.out.println("Enrollment Type Added Successfully");
		test.log(LogStatus.PASS, "Enrollment Type added successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
				"WC & GL Enrollment");

		Thread.sleep(2000);

		// Raja wrote 
		
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(contractorName);
		test.log(LogStatus.PASS, "Contractor name is entered as " + contractorName);
		Thread.sleep(1000);
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contractor name is entered");
		Thread.sleep(2000);
		AddContractor_Pkg_Page.SelectContact(driver).click();
		Thread.sleep(1000);
		AddContractor_Pkg_Page.SelectContactSearchBox(driver).sendKeys(ContactName);
		test.log(LogStatus.PASS, "Contact Name is entered as " + ContactName);
		Thread.sleep(1000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.SelectContactAutoCompllete(driver), ContactName);
		test.log(LogStatus.PASS, "contact name is selected from drop down list \t" + ContactName );
		
		AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
		Thread.sleep(1000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(driver), "Compliance29");
		test.log(LogStatus.PASS, " Compliance added successfully");

		Thread.sleep(2000);
		
		String tradeName = RandomClass.randomTradeDescription();
		AddContractor_Pkg_Page.addNewTradeLink(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Click on Add New Trade Link");
		
//		wb.getWindowID4();
//		driver.switchTo().window(wb.map.get("subsubchildID"));
		
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		Thread.sleep(2000);
		driver.manage().window().maximize();

		AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(RandomClass.randomTradeDescription());
		test.log(LogStatus.PASS, "Trade Description Added Successfully");
		AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
		test.log(LogStatus.PASS, "Trade Number Added Successfully");
		wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
		test.log(LogStatus.PASS, "Trade Status Selected Successfully");
		AddTradePage.addTradeSaveAndCloseBtn(driver).click();

		//int x = 1;
		//do {
			try {
				Alert alt = driver.switchTo().alert();
				Thread.sleep(2000);
				alt.accept();
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String newtradeNumber = "TNO" + rNo;
				tradeNumber = newtradeNumber;
				Thread.sleep(1000);
				AddTradePage.addTrade_TradeNumberField(driver).clear();
				Thread.sleep(1000);
				AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
				test.log(LogStatus.PASS, "Trade Number Added Successfully");
				AddTradePage.addTradeSaveAndCloseBtn(driver).click();
			} catch (Throwable e) {
				System.out.println("Alert Not Present" + e);
				//x = 2;
			}
		//} while (x == 1);

		//driver.switchTo().window(wb.map.get("subchildID"));
		driver.switchTo().window(wb.map.get("childID")); // raja 
		System.out.println("Trade Added Successfully");
		test.log(LogStatus.PASS, tradeName + " Trade added successfully");
		Thread.sleep(2000);

      // select submission and reporting month
		AddContractor_Pkg_Page.moreBtn(driver).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		wb.selectSingleValue(AddContractor_Pkg_Page.selectPayrollSubmissionFrequency(driver), submissionFrequency);
		Thread.sleep(1500);
		wb.selectSingleValue(AddContractor_Pkg_Page.selectreportedTimePeriod(driver), reportTime);

		AddContractor_Pkg_Page.btnNext(driver).click();
		test.log(LogStatus.PASS, "Clicked On Next Button");
		Thread.sleep(1000);
		try {

			AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();

		} catch (Throwable e) {
			System.out.println(e);
		}

		AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
		//driver.switchTo().window(wb.map.get("childID"));parentID
		driver.switchTo().window(wb.map.get("parentID")); // raja wrote 
		
		/*
		 * // rajaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * System.out.println("Contractor Package Created Successfully");
		 * test.log(LogStatus.PASS, "Contractor Package Created successfully");
		 * 
		 * driver.close(); driver.switchTo().window(wb.map.get("parentID"));
		 * 
		 * // rajaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 */
	}

	@Test(dependsOnMethods = { "add_CP_Via_Project" })
	public void enrollContractorTest() throws InterruptedException, IOException , Throwable{
		WebDriverWait webwait = new WebDriverWait(driver, 60);

		// tc.addContractorPackage();
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		Thread.sleep(2000);
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");

		// search for contractor package
		Thread.sleep(28000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-350)", "");
		wb.scrollToTop();
		int x = 1;
		do {
			try {
				wb.waitForElemnet(ContractorPackageModule.searchEditBox(driver));
				test.log(LogStatus.INFO, "Clicked in Search Edit Box");
				x = 2;
			} catch (Throwable e) {
				System.out.println("Search icon not found " + e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x == 1);

		//ContractorPackageModule.searchEditBox(driver).sendKeys(contractorName, Keys.TAB);
		ContractorPackageModule.searchEditBox(driver).sendKeys(contractorName, Keys.ENTER);
		Thread.sleep(30000);
		test.log(LogStatus.INFO, "Search For Respective Company");
		js.executeScript("window.scrollBy(0,-350)", "");
//		int x = 1;
		do {
			try {
				js.executeScript("arguments[0].click();", ContractorPackageModule.searchIcon(driver));
				test.log(LogStatus.INFO, "Clicked on Search Icon");
				x = 2;
			} catch (Throwable e) {
				System.out.println("Search icon not found " + e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x == 1);

		Thread.sleep(10000);

		js.executeScript("window.scrollBy(0,-250)", "");
		
		// search for respective contractor pkg and click on it
//		js.executeScript("arguments[0].click();",
//				ContractorPackageModule.selectDynamicContractorPkg(driver, contractorName, projectName, tradeNumber));
//		js.executeScript("arguments[0].click();",DynamicCpkg());
		AddContractor_Pkg_Page.AdvSearchBtn(driver).click();
		test.log(LogStatus.PASS, "Advance search button is clicked");
		Thread.sleep(1500);
		//wb.selectByVisibleText(contractorName, AddContractor_Pkg_Page.AdvSearchSelectprogramme(driver));
		AddContractor_Pkg_Page.AdvSearchSearchContractor(driver).click();
		Thread.sleep(1000);
		AddContractor_Pkg_Page.AdvSearchSearchContractor(driver).sendKeys(contractorName);
		test.log(LogStatus.PASS, "Advance search button is clicked and contractor name selected");
		Thread.sleep(1500);
		AddContractor_Pkg_Page.AdvSearchSearchContractor(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		AddContractor_Pkg_Page.AdvSearch_SearchBtn_down(driver).click();
		test.log(LogStatus.PASS, "Adv search button is clickedd down");
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());

		// insurance enrollment page
		wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page");
		// switch focus to child window
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

		// Insurance Enrollment page
		/*
		 * AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractorName(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "Contractor Name Added Successfully");
		 * 
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldContractorLicense(driver).isDisplayed(); test.log(LogStatus.PASS,
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldContractorLicense(driver).getText()+
		 * "Contractor License Added Successfully");
		 * 
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldNCCIExperienceModifireRate(driver).clear();
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldNCCIExperienceModifireRate(driver).sendKeys("10.12");
		 * test.log(LogStatus.PASS, "Modifier Rate Added Successfully");
		 * 
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldNCCIExperienceModifireDate(driver).sendKeys("09/20/2019");
		 * test.log(LogStatus.PASS, "Modifier Date Added Successfully");
		 * 
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldCIP_WC_PolicyNumber(driver).clear();
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * fieldCIP_WC_PolicyNumber(driver).sendKeys("Policy No 1234");
		 * test.log(LogStatus.PASS, "CIP WC Policy Number Added Successfully");
		 */

		/*
		 * js.executeScript("arguments[0].click();",
		 * AddContractor_Pkg_Insurance_Enrollment_Page.contactInformationEmail(driver));
		 */

		// Contact Details Page
		js.executeScript("arguments[0].scrollIntoView();",
				AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver));
		wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver));
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver).clear();
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractValue(driver).sendKeys("5600000");
		test.log(LogStatus.PASS, "Contract Value Added Successfully");
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldSelfPerformedContractValue(driver).clear();
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldSelfPerformedContractValue(driver).sendKeys("560000");
		test.log(LogStatus.PASS, "Self Performed Contract Value Added Successfully");

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
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedStartDate(driver).sendKeys("08/02/2020", Keys.TAB);
		test.log(LogStatus.PASS, "Estimated Start Date Added Successfully");
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).clear();
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldEstimatedCompletionDate(driver).sendKeys("12/31/2022",
				Keys.TAB);
		test.log(LogStatus.PASS, "Estimated Completion Date Added Successfully");

		System.out.println("Program Radio Button is Selected \t"
				+ AddContractor_Pkg_Insurance_Enrollment_Page.redioBtnProgram(driver).isSelected());

		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver));
		AddContractor_Pkg_Insurance_Enrollment_Page.textAreaBrieflyDescribetheScopeWork(driver).sendKeys("Testing");
         
		js.executeScript("arguments[0].scrollIntoView();", AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClass(driver));
		wb.waitForElemnet(AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClass(driver));
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClass(driver));
		Thread.sleep(4000);
		AddContractor_Pkg_Insurance_Enrollment_Page.selectWorkClassSearchBox(driver).sendKeys("Test");
		wb.selectSingleValueFromList(
				AddContractor_Pkg_Insurance_Enrollment_Page.selectAllWorkClassFromAutoCompleteDropDown(driver), "Test");
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Work Class Selected Successfully");

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.cappedPayrollAlertOkBtn(driver).click();
			Thread.sleep(1500);
		} catch (Throwable e) {
			System.out.println("Capped Alert is not present Exception" + e);
		}
		// wb.selectSingleValueFromList(AddContractor_Pkg_Insurance_Enrollment_Page.selectAllWorkClassFromAutoCompleteDropDown(driver),"Technicians");
		AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassWorkHoursField(driver).sendKeys("100");
		test.log(LogStatus.PASS, "Work Class Hours Added Successfully");

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassUnCappedPayrollField(driver).sendKeys("5000");
			test.log(LogStatus.PASS, "Work Class Uncapped Payroll Added Successfully");
		} catch (Throwable e) {
			System.out.println("Exception in Uncapped payroll" + e);
		}

		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassCappedPayrollField(driver).sendKeys("5000");
			test.log(LogStatus.PASS, "Work Class Capped Payroll Added Successfully");

		} catch (Throwable e) {
			System.out.println("Exception in Capped payroll" + e);
		}

		AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassRateField(driver).sendKeys("15");
		test.log(LogStatus.PASS, "Work Class Rate Added Successfully");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Insurance_Enrollment_Page.addWorkClassAddWorkClassBtn(driver));
		test.log(LogStatus.INFO, "Clicked On Add Work Class Button");
		Thread.sleep(10000);
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
		test.log(LogStatus.INFO, "Clicked On Contract Details Mark As Confirmed Radio Button");

		AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver).clear();
		AddContractor_Pkg_Insurance_Enrollment_Page.fieldLocationNumber(driver)
				.sendKeys(RandomClass.randomDivisionCode());

		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
		test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
		Thread.sleep(3000);

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
				System.out.println("Location Code Alert Not Present" + e);
				x = 2;
			}
		} while (x == 1);

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

		try {
			// first common alert handled
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}

		try {
			// first common alert handled
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}
		Thread.sleep(7000);

		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println("Alert data: " +
		 * alert.getText()); alert.accept(); test.log(LogStatus.PASS, "Alert Accepted");
		 * Thread.sleep(1500); try { AddContractor_Pkg_Insurance_Enrollment_Page.
		 * estimatedPayrollWorkClassPayrollAlertContinueBtn(driver).click(); //
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * estimatedPayrollWorkClassPayrollAlertContinueBtn(driver).click(); } catch
		 * (NoSuchElementException e) { System.out.println(e); }
		 * 
		 * // alert.accept(); // test.log(LogStatus.PASS, "Alert Accepted"); //
		 * alert.accept(); // test.log(LogStatus.PASS, "Alert Accepted");
		 * 
		 * 
		 * js.executeScript("arguments[0].click();",
		 * AddContractor_Pkg_Insurance_Enrollment_Page.
		 * markAsConfirmedRadioBtn(driver)); test.log(LogStatus.PASS,
		 * "Mark As Confirmed Radio Button Selected Successfully");
		 * 
		 * 
		 * js.executeScript("arguments[0].click();",
		 * AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue( driver));
		 * test.log(LogStatus.PASS,
		 * "Clicked On Insurance Enrollment Save And Continue Button");
		 * 
		 * 
		 * 
		 * // Non-CIP Compliance Page
		 * 
		 * 
		 * // WebDriverWait webwait=new WebDriverWait(driver, 60); /*
		 * webwait.until(ExpectedConditions.visibilityOf(
		 * AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver)));
		 * webwait.until(ExpectedConditions.elementToBeClickable(
		 * AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver)));
		 */
		try {
			List<WebElement> lst1 = AddContractor_Pkg_NonCIP_Compliance_Page.allPolicyTabPresent(driver);
			System.out.println("size of the policy is =  " + lst1.size());
			for (int i = 0; i <= lst1.size() - 1; i++) {
				String result = lst1.get(i).getText();
				System.out.println("Liability Name" + result);
				switch (result) {
				case "Automobile Liability":

					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerName(driver).click();
					// js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerName(driver).sendKeys("Wick");
					test.log(LogStatus.PASS, "Automobile Liability Broker Name Added Successfully");

					// js.executeScript("arguments[0].click();",AddContractor_Pkg_NonCIP_Compliance_Page.AL_InsuranceCompanyName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_InsuranceCompanyName(driver).click();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_InsuranceCompanyName(driver)
							.sendKeys(insuranceCompName);
					Thread.sleep(3000);
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_InsuranceCompanyName(driver).sendKeys(Keys.TAB);
					test.log(LogStatus.PASS, "Automobile Liability Insurance Company Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyNumber(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyNumber(driver).sendKeys("Policy No 126");
					test.log(LogStatus.PASS, "Automobile Liability Policy NALer  Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerContactName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerContactName(driver).sendKeys("Shetty");
					test.log(LogStatus.PASS, "Automobile Liability Broker Contact Name Added Successfully");

					// AddContractor_Pkg_NonCIP_Compliance_Page.AL_InsuranceCompanyName(driver);

					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyStartDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyStartDate(driver).sendKeys("05/15/2019",
							Keys.TAB);
					test.log(LogStatus.PASS, "Automobile Liability Insurance Start Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerContactPhone(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerContactPhone(driver)
							.sendKeys(RandomClass.randomPhoneNo());
					test.log(LogStatus.PASS, "Automobile Liability Insurance Contact Phone No Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyExpirationDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_PolicyExpirationDate(driver).sendKeys("09/05/2021",
							Keys.TAB);
					test.log(LogStatus.PASS, "Automobile Liability Insurance End Date Added Successfully");
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_BrokerEmail(driver).sendKeys("kiran@nourtek.com");
					test.log(LogStatus.PASS, "Automobile Liability Insurance Email Added Successfully");
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_AddFirstLimitValue(driver).sendKeys("1100");
					AddContractor_Pkg_NonCIP_Compliance_Page.AL_AddSecondLimitValue(driver).sendKeys("1100");

					break;

				case "Workers' Compensation":

					System.out.println("Enter Workers Compensastion");
					Thread.sleep(3000);
					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver).click();
					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerName(driver).sendKeys("Wick");
					test.log(LogStatus.PASS, "WC Broker Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_InsuranceCompanyName(driver).click();
					;
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_InsuranceCompanyName(driver)
							.sendKeys(insuranceCompName);
					Thread.sleep(3000);
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_InsuranceCompanyName(driver).sendKeys(Keys.TAB);
					test.log(LogStatus.PASS, "WC Insurance Company Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyNumber(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyNumber(driver).sendKeys("Policy No 126");
					test.log(LogStatus.PASS, "WC Policy Number  Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerContactName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerContactName(driver).sendKeys("Shetty");
					test.log(LogStatus.PASS, "WC Broker Contact Name Added Successfully");

					//
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyStartDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyStartDate(driver).sendKeys("05/15/2019",
							Keys.TAB);
					test.log(LogStatus.PASS, "WC Insurance Start Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerContactPhone(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerContactPhone(driver)
							.sendKeys(RandomClass.randomPhoneNo());
					test.log(LogStatus.PASS, "WC Insurance Contact Phone No Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyExpirationDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_PolicyExpirationDate(driver).sendKeys("09/05/2021",
							Keys.TAB);
					test.log(LogStatus.PASS, "WC Insurance End Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_BrokerEmail(driver).sendKeys("kiran@nourtek.com");
					test.log(LogStatus.PASS, "WC Insurance Email Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.WC_AddFirstLimitValue(driver).sendKeys("1100");
					AddContractor_Pkg_NonCIP_Compliance_Page.WC_AddSecondLimitValue(driver).sendKeys("1100");

					break;

				case "Umbrella / Excess":

					System.out.println("Enter Umbrella");
					js.executeScript("window.scrollBy(0,150)", "");// Scroll
																	// down
					js.executeScript("arguments[0].scrollIntoView;",
							AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerName(driver).click();
					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerName(driver).sendKeys("Wick");
					test.log(LogStatus.PASS, "UMB Broker Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_InsuranceCompanyName(driver).click();
					;
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_InsuranceCompanyName(driver)
							.sendKeys(insuranceCompName);
					Thread.sleep(3000);
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_InsuranceCompanyName(driver).sendKeys(Keys.TAB);
					test.log(LogStatus.PASS, "UMB Insurance Company Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyNumber(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyNumber(driver).sendKeys("Policy No 126");
					test.log(LogStatus.PASS, "UMB Policy Number  Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerContactName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerContactName(driver).sendKeys("Shetty");
					test.log(LogStatus.PASS, "UMB Broker Contact Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyStartDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyStartDate(driver).sendKeys("05/15/2019",
							Keys.TAB);
					test.log(LogStatus.PASS, "UMB Insurance Start Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerContactPhone(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerContactPhone(driver)
							.sendKeys(RandomClass.randomPhoneNo());
					test.log(LogStatus.PASS, "UMB Insurance Contact Phone No Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyExpirationDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_PolicyExpirationDate(driver).sendKeys("09/05/2021",
							Keys.TAB);
					test.log(LogStatus.PASS, "UMB Insurance End Date Added Successfully");
					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_BrokerEmail(driver).sendKeys("kiran@nourtek.com");
					test.log(LogStatus.PASS, "UMB Insurance Email Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.UMB_AddFirstLimitValue(driver).sendKeys("1100");
					// AddContractor_Pkg_NonCIP_Compliance_Page.UMB_AddLimitValue(driver,
					// 2).sendKeys("1100");

					break;

				case "General Liability":

					System.out.println("Enter General");
					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerName(driver).click();
					js.executeScript("arguments[0].scrollIntoView();",
							AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerName(driver));
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerName(driver).sendKeys("Wick");
					test.log(LogStatus.PASS, "GL Broker Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_InsuranceCompanyName(driver).click();
					;
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_InsuranceCompanyName(driver)
							.sendKeys(insuranceCompName);
					Thread.sleep(3000);
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_InsuranceCompanyName(driver).sendKeys(Keys.TAB);
					test.log(LogStatus.PASS, "GL Insurance Company Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyNumber(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyNumber(driver).sendKeys("Policy No 126");
					test.log(LogStatus.PASS, "GL Policy NGLer  Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerContactName(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerContactName(driver).sendKeys("Shetty");
					test.log(LogStatus.PASS, "GL Broker Contact Name Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyStartDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyStartDate(driver).sendKeys("05/15/2019",
							Keys.TAB);
					test.log(LogStatus.PASS, "GL Insurance Start Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerContactPhone(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerContactPhone(driver)
							.sendKeys(RandomClass.randomPhoneNo());
					test.log(LogStatus.PASS, "GL Insurance Contact Phone No Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyExpirationDate(driver).clear();
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_PolicyExpirationDate(driver).sendKeys("09/05/2021",
							Keys.TAB);
					test.log(LogStatus.PASS, "GL Insurance End Date Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_BrokerEmail(driver).sendKeys("kiran@nourtek.com");
					test.log(LogStatus.PASS, "GL Insurance Email Added Successfully");

					AddContractor_Pkg_NonCIP_Compliance_Page.GL_AddFirstLimitValue(driver).sendKeys("1100");
					AddContractor_Pkg_NonCIP_Compliance_Page.GL_AddSecondLimitValue(driver).sendKeys("1100");

					break;
				}
			}

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_NonCIP_Compliance_Page.markAsConfirmedRadioBtn(driver));
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_NonCIP_Compliance_Page.btnSaveAndContinue(driver));

			// wb.windowScrollBy(0,500);
			// wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			Thread.sleep(9000);
		} catch (Throwable e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, e + "Something Went Wrong");
		}

		// Thread.sleep(7000);
		js.executeScript("window.scrollBy(0,3500)");
		js.executeScript("arguments[0].scrollIntoView();",
				AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver));
		AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver).click();
		test.log(LogStatus.INFO, "Cliced On WC Premium Modification Page Mark As Confirmed Radio Button ");
		js.executeScript("window.scrollBy(0,1000)");
		AddContractor_WC_Premiums_Modifications_Page.btnSaveAndContinue(driver).click();
		test.log(LogStatus.INFO, "Clicked On WC Premium Modificaction Page Save And Continue Button");
		Thread.sleep(7000);

		// if you switch on the switches at program level premium modification
		// page then below code is not working

		/*
		 * js.executeScript("window.scrollBy(0,1100)");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectTableAndRateBaseForGeneralLiability(driver, 1, 2).click();
		 * test.log(LogStatus.PASS,
		 * "First GL Rate Based On Radio Button Selected Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver,
		 * 1).sendKeys("123ab"); test.log(LogStatus.PASS,
		 * "First GL Class Code Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField( driver,
		 * 1).sendKeys("Testing"); test.log(LogStatus.PASS,
		 * "First GL Description Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectRatePerGeneralLiability(driver, 1, 2).click(); test.log(LogStatus.PASS,
		 * "First GL Rate Per Radio Button Selected Succesfully ");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * enterRateFieldGeneralLiability(driver, 1).sendKeys("10");
		 * test.log(LogStatus.PASS, "First GL Rate Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver
		 * ).click(); test.log(LogStatus.INFO,
		 * " Clicked On Add Additional General Liability Button");
		 * test.log(LogStatus.PASS, "====== First GL Added Successfully ======");
		 * Thread.sleep(2000); AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectTableAndRateBaseForGeneralLiability(driver, 2, 3).click();
		 * test.log(LogStatus.PASS,
		 * "Second GL Rate Based On Radio Button Selected Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver,
		 * 2).sendKeys("123abcdf"); test.log(LogStatus.PASS,
		 * "Second GL Class Code Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField( driver,
		 * 2).sendKeys("Testing"); test.log(LogStatus.PASS,
		 * "Second GL Description Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectRatePerGeneralLiability(driver, 2, 2).click(); test.log(LogStatus.PASS,
		 * "Second GL Rate Per Radio Button Selected Succesfully ");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * enterRateFieldGeneralLiability(driver, 2).sendKeys("1");
		 * test.log(LogStatus.PASS, "Second GL Rate Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * generalLiabilitySubmitButton(driver, 2).click(); test.log(LogStatus.INFO,
		 * "Clicked On Submit Button Successfully"); test.log(LogStatus.PASS,
		 * "====== Second GL Added Successfully ======"); //
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver
		 * ).click(); Thread.sleep(2000); js.executeScript("window.scrollBy(0,500)"); //
		 * js.executeScript("arguments[0].click();",
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectTableAndRateBaseForumbrellaLiability(driver, // 1, 2));
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectTableAndRateBaseForumbrellaLiability(driver, 1, 2).click();
		 * test.log(LogStatus.PASS,
		 * "First UMB Rate Based On Radio Button Selected Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver,
		 * 1).sendKeys("456Abc"); test.log(LogStatus.PASS,
		 * "First UMB Class Code Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBDescriptionField( driver,
		 * 1).sendKeys("Testing"); test.log(LogStatus.PASS,
		 * "First UMB Description Added Successfully");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.
		 * selectRatePerUmbrellaLiability(driver, 1, 3).click();
		 * test.log(LogStatus.PASS,
		 * "First UMB Rate Per Radio Button Selected Succesfully ");
		 * AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldUMB(driver,
		 * 1).sendKeys("5"); test.log(LogStatus.PASS,
		 * "First UMB Rate Added Successfully"); test.log(LogStatus.PASS,
		 * "====== First UMB Added Successfully ======");
		 */

		try {
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.AddNewGLClassCodeLink(driver).click();
			Thread.sleep(2000);
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			Thread.sleep(2000);
			driver.manage().window().maximize();
			AddClassCodePage.addClassCodeWorkClassDescriptionField(driver)
					.sendKeys(RandomClass.randomClassCodeDescription());
			test.log(LogStatus.PASS, "Class Code Description Added Successfully");
			AddClassCodePage.addClassCodeWorkClassNumberField(driver).sendKeys(RandomClass.randomClassCodeNumber());
			test.log(LogStatus.PASS, "Class Code Number Added Successfully");
			AddClassCodePage.stateSpecificCodeButtonYes(driver).click();
			test.log(LogStatus.PASS, "State Specific Code Yes Button Clicked");
			wb.selectSingleValue(AddClassCodePage.addClassCodeWorkClassStateField(driver), RandomClass.randomState());
			test.log(LogStatus.PASS, "Class Code State Selected Successfully");
			/*
			 * AddClassCodePage.checkBox_WC_ClassCode(driver).click();
			 * test.log(LogStatus.INFO, "WC Class Code Check Box Selected");
			 * AddClassCodePage.checkBox_GL_ClassCode(driver).click();
			 * test.log(LogStatus.INFO, "GL Class Code Check Box Selected");
			 */
			AddClassCodePage.addClassCodeSaveAndCloseBtn(driver).click();
			test.log(LogStatus.INFO, "Clicked on Save And Close Button");
			driver.switchTo().window(wb.map.get("childID"));
			Thread.sleep(4000);

		} catch (Throwable e) {
			System.out.println("class code Exception" + e);
		}

		js.executeScript("window.scrollBy(0,5000)");
		js.executeScript("arguments[0].scrollIntoView();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
		test.log(LogStatus.INFO, "Clicked On GL Umbrella Mark as Confirmed Radio Button");
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_GL_Umbrella_Coverage_Page.btnSaveAndContinue(driver));
		test.log(LogStatus.INFO, "Clicked On GL Umbrella Save And Continue Button");
		Thread.sleep(6000);

// now sub contractor page come before the documents page
		wb.waitForElemnet(AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver));
		// AddContractor_Pkg_SubContractorInfo.btnSaveAndContinue(driver).click();
		Thread.sleep(5000);

//document switch is off 
//		js.executeScript("window.scrollBy(0,1000)");
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
		// Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal\\AutoIT
		// Script\\Raja\\ProgramLogo.exe");
		Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal-2\\AutoIT Script\\DOCs\\AUTOIT_PKG.exe");
		test.log(LogStatus.PASS, "Documnet Added Successfully");
		Thread.sleep(4000);
		AddContractor_Pkg_Required_Documents_Page.addDocAddBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Alert Add Document Button");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("arguments[0].click();",
				AddContractor_Pkg_Required_Documents_Page.markedAsConfirmedRadioBtn(driver));
//		js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.addDocsaveAndCloseBtn(driver));
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

		AddContractor_Pkg_OSHA_EMR_Page.checkBoxA(driver).click();
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("arguments[0].click();", AddContractor_Pkg_OSHA_EMR_Page.radioBtnMarkAsConfirmed(driver));
		js.executeScript("arguments[0].click();", AddContractor_Pkg_OSHA_EMR_Page.btnSaveAndContinue(driver));

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

	@Test(dependsOnMethods = { "enrollContractorTest" })
	public void addMonthlyPayroll() throws InterruptedException {
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Clicked On Contracotr Package Icon");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		int x = 1;
		do {
			try {
				ContractorPackageModule.advanceSearchIcon(driver).click();
				test.log(LogStatus.PASS, "Clicked On Advance Search Icon");
				x = 2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x == 1);

		Thread.sleep(3000);
		do {
			try {
				wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProject(driver), projectName);
				test.log(LogStatus.PASS, projectName + " Respective Project Selected Successfully");
				x = 2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
				Thread.sleep(1000);
			}
		} while (x == 1);

		Thread.sleep(1500);

		/*
		 * wb.selectSingleValue(ContractorPackageModule.
		 * advanceSearchSelectEnrollmenttype(driver), enrollmentType);
		 * test.log(LogStatus.PASS, enrollmentType +
		 * " Enrollment Type Selected Successfully"); Thread.sleep(1500);
		 */

		/*
		 * ContractorPackageModule.advanceSearchSelectContractorStatus(driver).click();
		 * Thread.sleep(2000);
		 * 
		 * ContractorPackageModule.advanceSearchSelect_Single_StatusFromDropdown(driver,
		 * status).click(); test.log(LogStatus.PASS, status +
		 * " Status Selected Successfully"); Thread.sleep(1500);
		 */
		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Advance Search Button");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-350)", "");
		driver.switchTo().frame(0);
		ContractorPackageModule.MonthlyPayrollPagePriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Monthly Payroll Page");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(7000);

		wb.selectSingleValueByIndex(AddContractor_Pkg_MonthlyPayroll_Page.selectPayrollMonthYear(driver), 1);
		test.log(LogStatus.PASS, " Payroll Month Selected Successfully");
		Thread.sleep(1500);
		// Raja write this try catch block
		try {
			
			ContractorPackageModule.AlertOKBtnPayroll(driver).click();
			System.out.println("ALert handled at Selecting payrollmonth");
			test.log(LogStatus.PASS, " ALert handled at Selecting payrollmonth");
		} catch (Throwable e) {
			System.out.println("No such alert present after selecting payroll by index");
		}
		Thread.sleep(2000);
		try {
			ContractorPackageModule.AlertOKBtnPayroll(driver).click();
			test.log(LogStatus.PASS, " ALert 2  handled at Selecting payrollmonth");
		} catch (Throwable e) {
			System.out.println("No such  second alert present after selecting payroll by index");
		}
		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(3000);
		fillPayroll();
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("parentID"));
		test.log(LogStatus.INFO, " Monthly Payroll Added Successfully");
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "addMonthlyPayroll" })
	public void testGenerateCOI() throws Throwable {

		driver.switchTo().frame(0);
		ContractorPackageModule.CertificatePagePriviewP(driver).click();
		Thread.sleep(7000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		Thread.sleep(5000);
		AddContractor_Pkg_ViewCertificatePage.btnAutoGenerateCertificate(driver).click();
		Thread.sleep(7000);
		System.out.println(AddContractor_Pkg_ViewCertificatePage.GL_PolicyNo(driver).getText());
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));

		/*
		 * driver.switchTo().frame(0);
		 * ContractorPackageModule.CertificatePagePriviewP(driver).click();
		 * Thread.sleep(3000); wb.getWindowIDs();
		 * driver.switchTo().window(wb.map.get("childID"));
		 * AddContractor_Pkg_ViewCertificatePage.btnAutoGenerateCertificate(driver).
		 * click(); Thread.sleep(8000); // DateTimeFormatter dtf =
		 * DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"); DateTimeFormatter dtf =
		 * DateTimeFormatter.ofPattern("MM/dd/yyyy"); LocalDateTime now =
		 * LocalDateTime.now(); System.out.println(dtf.format(now)); String nowDate=
		 * dtf.format(now);
		 * 
		 * 
		 * String
		 * GLdate=AddContractor_Pkg_ViewCertificatePage.GL_PolicyDateTime(driver).
		 * getText(); String[] dateSplit=GLdate.split(" "); for(int
		 * j=0;j<dateSplit.length;j++) { System.out.println(dateSplit[j]);
		 * if(dateSplit[j].contains(nowDate)) { System.out.println("Date Matched"); } }
		 * 
		 * String
		 * str1=AddContractor_Pkg_ViewCertificatePage.GL_PolicyNo(driver).getText();
		 * System.out.println(AddContractor_Pkg_ViewCertificatePage.GL_PolicyNo(driver).
		 * getText()); String polNo="POLP3524"; String [] str2=str1.split(" "); for(int
		 * i=0 ; i<str2.length;i++) { if(str2[i].contains(polNo)) {
		 * System.out.println("Policy No Matched"); break; }
		 * System.out.println(str2[i]); } Thread.sleep(5000); driver.close();
		 * driver.switchTo().window(wb.map.get("parentID")); Thread.sleep(1500);
		 * driver.switchTo().frame(0);
		 * 
		 * ContractorPackageModule.CertificateSeeMorePriviewP(driver).click();
		 * Thread.sleep(1500);
		 * 
		 * String
		 * autoMobilePolNoActual=ContractorPackageModule.AutoMobileCertificateNoPriviewP
		 * (driver).getText(); String autoMobilePolNoExpected="MASTER AUTO POL 545121";
		 * if(autoMobilePolNoActual.contains(autoMobilePolNoExpected)) {
		 * System.out.println("Automobile policy matched"); }
		 */
	}

	public void fillPayroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			// js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver));
			wb.waitForElemnet(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver));
			Thread.sleep(1500);
			// js.executeScript("window.scrollBy(0,150)");
			Actions act = new Actions(driver);
			act.moveToElement(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver)).doubleClick().build()
					.perform();
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver).sendKeys("1000");
			test.log(LogStatus.PASS, " Payroll Contract Value Added Successfully");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,50)");
			act.moveToElement(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSelfCVField(driver)).doubleClick().build()
					.perform();
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSelfCVField(driver).sendKeys("1000");
			test.log(LogStatus.PASS, " Payroll Self Performed Contract Value Added Successfully");
		} catch (Throwable e) {
			System.out.println("No such  feilds");
		}
		List<WebElement> payroll = AddContractor_Pkg_MonthlyPayroll_Page.addPayrollForALLWorkClass(driver);
		for (WebElement b : payroll) {
			Actions act = new Actions(driver);
			act.moveToElement(b).doubleClick().build().perform();
			Thread.sleep(1500);
			b.sendKeys("100");
			js.executeScript("window.scrollBy(0,10)");
			test.log(LogStatus.PASS, " Payroll and hours added Successfully");
		}
		Thread.sleep(4000);
		// js.executeScript("window.scrollTo(0,300)");

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("sccroll to the End");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.checkBoxMarkAsConfirmed(driver).click();
		test.log(LogStatus.PASS, " Clicked on Mark As Confirmed Radio Button");
		Thread.sleep(2000);
		/*
		 * try { js.executeScript("window.scrollBy(0,400)");
		 * System.out.println("Scrolled at try block for mark as confirmed button");
		 * }catch (Throwable e) { js.executeScript("window.scrollBy(0,200)"); }
		 */
		System.out.println("Scrolled at mark as confirmed button");

		try {
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollNextMonthBtn(driver).click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, " Clicked on Continue Next Month Payroll Button");
			js.executeScript("window.scrollBy(0,300)");
			fillPayroll();

		} catch (Throwable e1) {

			System.out.println(e1);
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSaveBtn(driver).click();
			test.log(LogStatus.PASS, " Clicked on Payroll Save Button");
			Thread.sleep(2000);
			// Raja Wrote this
			try {
				ContractorPackageModule.AlertOKBtnPayroll(driver).click();
			} catch (Throwable F) {
				System.out.println("No such  second alert present after selecting payroll by index");

			}

		}
	}
}

