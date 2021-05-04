package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.AddProgram_Program_Parameters_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class zVerifyLocationCodeTest extends BaseClass
{	
		WebDriverCommonLib wb = new WebDriverCommonLib();
		String programName="Sony Tower 103";
		String selectProgramAdministrator="User1012 - John1 Tom1";//"Alex Contractor Comp1834 - Hobs Shobs";//"Sony User Company - K p"
		String selectProgramSponsor="Sponsor347 - Jimmy Smith";//"Sponsor1395 - Jimmy Smith";//"AutoNation - kim canada"
	

@Test
public void verifyLocationCodeTest() throws Throwable
{
	
	// String expectedElement= "Program5917";
	HomePage.controlMenuHomeIcon(driver).click();
	test.log(LogStatus.INFO, "Clicked On Home Icon");
	HomePage.HomeMenuPrograms(driver).click();
	test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
	Thread.sleep(2000);
	ProgramModule.programAddIcon(driver).click();
	test.log(LogStatus.INFO, "Clicked On Program Add Icon");
	wb.getWindowIDs();
	driver.switchTo().window(wb.map.get("childID"));
	wb.windowScrollBy(0, 1000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");

	AddProgram_General_Info_Page.programName(driver).sendKeys(programName);
	test.log(LogStatus.PASS, "Program Name Added Successfully");
	AddProgram_General_Info_Page.programCode(driver).sendKeys(RandomClass.randomProgramCode());
	test.log(LogStatus.PASS, "Program Code Added Successfully");
	wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectPolicyType(driver), 0);
	test.log(LogStatus.PASS, "Program Policy Type Selected Successfully");
	wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectProgramType(driver), 1);
	test.log(LogStatus.PASS, "Program Type Selected Successfully");
	wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectProgramAdministrator(driver),43);//9
	test.log(LogStatus.PASS, "Program Administrator Selected Successfully");
	wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectProgramSponsor(driver), 16);//14
	test.log(LogStatus.PASS, "Program Sponsor Selected Successfully");
	
	/*java.util.List<WebElement> lst = AddProgram_General_Info_Page.selectAllswitches(driver);
	for (int i = 0; i <= lst.size() - 1; i++) {
		lst.get(i).click();// select all switch one by one
	}*/
	
	List<WebElement> lst = AddProgram_General_Info_Page.selectAllStatusSwitch(driver);
	System.out.println("Size of Status Switch "+lst.size());
		for(int i=0;i<lst.size()-1;i++)
		{
			js.executeScript("arguments[0].click();",lst.get(i));
//			lst.get(i).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,50)");
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
	String programMinRate=AddProgram_General_Info_Page.programMinimumRate(driver).getText();
	test.log(LogStatus.PASS, ""+programMinRate+ "91.67 Program Minimum Rate Fetched");
	String programMaxRate=AddProgram_General_Info_Page.programMaximumRate(driver).getText();
	test.log(LogStatus.PASS, ""+programMaxRate+ "175.00 Program Maximum Rate Fetched");
	Thread.sleep(2000);
	AddProgram_General_Info_Page.saveButton(driver).click();
	test.log(LogStatus.INFO, "Clicked On Save Button");
	Thread.sleep(3000);
	AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
	test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
	
	try
	{
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
	
	// AddProgram_Program_Parameters_Page.addTradeClickHereLink(driver).click();
	// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys("test");
	// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.ARROW_DOWN);
	// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.TAB);
	// AddProgram_Program_Parameters_Page.descriptionTradeField(driver).sendKeys("Test
	// decription");
	// AddProgram_Program_Parameters_Page.addTradePlusButton(driver).click();

	// AddProgram_Program_Parameters_Page.addWorkClassClickHereLink(driver).click();
	// wb.selectSingleValue(AddProgram_Program_Parameters_Page.searchForWorkClassField(driver),"02120
	// | new wc 12 feb");
	// AddProgram_Program_Parameters_Page.addWorkClassPlusButton(driver).click();

//	JavascriptExecutor js = (JavascriptExecutor) driver;
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
	
//	System.out.println("Loaction Code is selected or Not :-"+AddProgram_Program_Parameters_Page.switchLocationCode(driver).isSelected());
	
	AddProgram_Program_Parameters_Page.switchLocationCode(driver).click();
	test.log(LogStatus.INFO, "Location Code Switch Selected Successfully");
//	System.out.println("Loaction Code is selected or Not :-"+AddProgram_Program_Parameters_Page.switchLocationCode(driver).isSelected());
//	test.log(LogStatus.PASS, "Contract Number Sequence Added Successfully");
	AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProgramCode(driver).click();
	test.log(LogStatus.PASS, "Location Code Token Program Code Token Added Successfully");
	AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProjectCode(driver).click();
	test.log(LogStatus.PASS, "Location Code Token Project Code Token Added Successfully");
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
	test.log(LogStatus.INFO, "Estimated Payroll to Self Performed Value Ratio High/Low Switch Turn On Successfully");
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
	
	//because of changes below code is comment	
	AddProgram_Program_Parameters_Page.addSuspendedPayrollLink(driver).click();
	test.log(LogStatus.INFO, "Clicked On Add Suspended Payroll Link");
	wb.getWindowID3();
	driver.switchTo().window(wb.map.get("subchildID"));
	AddProgram_Program_Parameters_Page.addSuspendedPayrollStartDate(driver).sendKeys("05/01/2019");
	test.log(LogStatus.PASS, "Suspended Payroll Start Date Added Successfully");
	AddProgram_Program_Parameters_Page.addSuspendedPayrollEndDate(driver).sendKeys("05/30/2019");
	test.log(LogStatus.PASS, "Suspended Payroll End Date Added Successfully");
	AddProgram_Program_Parameters_Page.addSuspendedPayrollNotes(driver).sendKeys("Testing Notes suspended payroll");
	test.log(LogStatus.PASS, "Suspended Payroll Notes Added Successfully");
	AddProgram_Program_Parameters_Page.addSuspendedPayrollSaveAndCloseButton(driver).click();
	Thread.sleep(1000);
	test.log(LogStatus.INFO, "Clicked On Suspended Payroll Save And Close Button");
	driver.switchTo().window(wb.map.get("childID"));
	js.executeScript("window.scrollBy(0,250)");
	AddProgram_Program_Parameters_Page.programParameterSaveAndCloseButton(driver).click();
	test.log(LogStatus.INFO, "Clicked On Program Parameter Save And Continue Button");
	
	}
	catch (Exception e) 
	{
	System.out.println(e);
	test.log(LogStatus.FAIL, "Program Parameter Test Has Been Failed");
	}
}
}
