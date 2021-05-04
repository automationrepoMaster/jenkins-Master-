package TestScript;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddProgram_Contractor_Portal_Options_Page;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.AddProgram_Program_Parameters_Page;
import ObjectRepository.AddProject_Email_Management_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class AddProgramTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String selectProgramAdministrator="User1012 - John1 Tom1";//"Alex Contractor Comp1834 - Hobs Shobs";//"Sony User Company - K p"
	String selectProgramSponsor="Sponsor347 - Jimmy Smith";//"Sponsor1395 - Jimmy Smith";//"AutoNation - kim canada"
	
	@Test
	public void addProgramTC() throws InterruptedException
	{
		//String expectedElement= "Program5917";
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuPrograms(driver).click();
		Thread.sleep(2000);
//		ProgramModule.programSearchEditBox(driver).sendKeys("Program5917");
//		ProgramModule.programSearchIcon(driver).click();
//		Thread.sleep(3000);
//		ProgramModule.programEditIcon(driver).click();
		ProgramModule.programAddIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		wb.windowScrollBy(0, 1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		AddProgram_General_Info_Page.programName(driver).sendKeys(RandomClass.randomProgramName());
		AddProgram_General_Info_Page.programCode(driver).sendKeys(RandomClass.randomProgramCode());
		
		wb.selectSingleValue(AddProgram_General_Info_Page.selectPolicyType(driver),"WC and GL");
		wb.selectSingleValue(AddProgram_General_Info_Page.selectProgramType(driver),"OCIP");
		wb.selectSingleValue(AddProgram_General_Info_Page.selectProgramAdministrator(driver), selectProgramAdministrator);		
		wb.selectSingleValue(AddProgram_General_Info_Page.selectProgramSponsor(driver),selectProgramSponsor );
		
		java.util.List<WebElement> lst = AddProgram_General_Info_Page.selectAllswitches(driver);
		for(int i=0;i<=lst.size()-1;i++)
		{
				lst.get(i).click();//select all switch one by one
		}
		wb.selectSingleValue(AddProgram_General_Info_Page.selectBidType(driver), "Bid Deduct");
		
		Thread.sleep(2000);

		Thread.sleep(2000);
		AddProgram_General_Info_Page.saveButton(driver).click();
		Thread.sleep(3000);
		AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		
		AddProgram_Program_Parameters_Page.minimumContractValue(driver).clear();
		AddProgram_Program_Parameters_Page.minimumContractValue(driver).sendKeys("150000");
		AddProgram_Program_Parameters_Page.minimumManHours(driver).clear();
		AddProgram_Program_Parameters_Page.minimumManHours(driver).sendKeys("1000");
		
		AddProgram_Program_Parameters_Page.minimumPayroll(driver).clear();
		AddProgram_Program_Parameters_Page.minimumPayroll(driver).sendKeys("12000");
		
		AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).clear();
		AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).sendKeys("1000");
		
//		AddProgram_Program_Parameters_Page.addTradeClickHereLink(driver).click();
//		AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys("test");
//		AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.ARROW_DOWN);
//		AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.TAB);
//		AddProgram_Program_Parameters_Page.descriptionTradeField(driver).sendKeys("Test decription");
//		AddProgram_Program_Parameters_Page.addTradePlusButton(driver).click();
		
//		AddProgram_Program_Parameters_Page.addWorkClassClickHereLink(driver).click();
//		wb.selectSingleValue(AddProgram_Program_Parameters_Page.searchForWorkClassField(driver),"02120 | new wc 12 feb");
//		AddProgram_Program_Parameters_Page.addWorkClassPlusButton(driver).click();
		
	
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.switchenableContractorNumber(driver).click();
		AddProgram_Program_Parameters_Page.createContractorNumberTemplateTextArea(driver).click();
		AddProgram_Program_Parameters_Page.selectTokenProgramCode(driver).click();
		AddProgram_Program_Parameters_Page.selectTokenSponsorCode(driver).click();
		AddProgram_Program_Parameters_Page.selectContractSequenceField(driver).sendKeys("25");
		Thread.sleep(1000);
		
		AddProgram_Program_Parameters_Page.switchHighEMR(driver).click();
		AddProgram_Program_Parameters_Page.ModeRateValueEMR(driver).sendKeys("10");;
		AddProgram_Program_Parameters_Page.switchModRateAlertContractor(driver).click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,100)");

		AddProgram_Program_Parameters_Page.switchCloseoutVariance(driver).click();	
		AddProgram_Program_Parameters_Page.closeoutVarianceLowerValue(driver).sendKeys("10");
		AddProgram_Program_Parameters_Page.closeoutVarianceHigherValue(driver).sendKeys("20");
		AddProgram_Program_Parameters_Page.switchCloseoutVarianceAlertContractor(driver).click();
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlert(driver).click();
		AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertLowerValue(driver).sendKeys("10");
		AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertHigherValue(driver).sendKeys("20");
		AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlertContractor(driver).click();
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_Ratio(driver).click();
		AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioBelowValue(driver).sendKeys("10");
		AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioAboveValue(driver).sendKeys("20");
		AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_RatioAlertContractor(driver).click();
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.switchEstimatedPayrollToSelfPerformRatio(driver).click();
		AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioBelowValue(driver).click();
		AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAboveValue(driver).click();
		AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAlertContractor(driver).click();
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.switchAlertForWorkClassRates(driver).click();
		AddProgram_Program_Parameters_Page.workClassRatesBenchmarkLowerValue(driver).sendKeys("10");
		AddProgram_Program_Parameters_Page.workClassRatesBenchmarkHigherValue(driver).sendKeys("20");
		AddProgram_Program_Parameters_Page.workClassRatesLow_High_LowerValue(driver).sendKeys("15");
		AddProgram_Program_Parameters_Page.workClassRatesLow_High_HigherValue(driver).sendKeys("25");
		Thread.sleep(1000);
		AddProgram_Program_Parameters_Page.addSuspendedPayrollLink(driver).click();
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		AddProgram_Program_Parameters_Page.addSuspendedPayrollStartDate(driver).sendKeys("05/01/2019");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollEndDate(driver).sendKeys("05/30/2019");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollNotes(driver).sendKeys("Testing Notes suspended payroll");
		AddProgram_Program_Parameters_Page.addSuspendedPayrollSaveAndCloseButton(driver).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(wb.map.get("childID"));
		js.executeScript("window.scrollBy(0,250)");
		AddProgram_Program_Parameters_Page.programParameterSaveAndContinueButton(driver).click();
		
		AddProject_Email_Management_Page.saveAndContinueButton(driver).click();
		
		AddProgram_Contractor_Portal_Options_Page.switchActivateContractorPortalForThisProgram(driver).click();
		
		wb.oneByOneClick(AddProgram_Contractor_Portal_Options_Page.switchContractorPortal_GC_SUBS_AllSwitchs(driver));
		
		
	}
	
	
}