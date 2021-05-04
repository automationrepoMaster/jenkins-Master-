package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class AddContractor_Pkg_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String ranTrade=RandomClass.randomTrade();
	String programName="Automation Testing";//"Sony Tower One Prog";
	String projectName="Automation Testing- Project 1";//"Sony Project1834";
	String contractorCompany="Dont Touch Me General ";//"sony";
	String contactName="General Contracting";//"Rock Smith";//jonty rod

	@Test
	public void addContractorPackage() throws InterruptedException
	{
		HomePage.controlMenuContractorPackage(driver).click();
		Thread.sleep(6000);
		test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("arguments[0].click();",ContractorPackageModule.addIcon(driver));
		test.log(LogStatus.INFO, "Clicked On Add Contractor Package Icon");
		Thread.sleep(2000);
		//ContractorPackageModule.addIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		
		//Select program 
		wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(programName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver), programName);
//		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower Test",Keys.TAB);
		System.out.println("Program Added Successfully");
		test.log(LogStatus.PASS, programName+" Program  added successfully");
		//select project
		AddContractor_Pkg_Page.selectProject(driver).click();
		AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver), projectName);
		System.out.println("Project Added Successfully");
		test.log(LogStatus.PASS, projectName+ " Project added successfully");
		Thread.sleep(2000);
		//select enrollment type
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).sendKeys("WC & GL");
		System.out.println("Enrollment Type Added Successfully");
		test.log(LogStatus.PASS, "Enrollment Type added successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver), "WC & GL Enrollment");
		//select contractor
		AddContractor_Pkg_Page.selectContractor(driver).click();
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(contractorCompany);
		Thread.sleep(2000);
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
		System.out.println("Contractor Added Successfully");
		test.log(LogStatus.PASS, "Contractor added successfully");
		Thread.sleep(2000);
		//select contact
		AddContractor_Pkg_Page.SelectContact(driver).click();
		AddContractor_Pkg_Page.SelectContactSearchBox(driver).click();
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.SelectContactAutoCompllete(driver), contactName);
		test.log(LogStatus.PASS, contactName+" Contact added successfully");
		//select Trade
		AddContractor_Pkg_Page.selectTrade(driver).click();
		System.out.println(ranTrade);
//		AddContractor_Pkg_Page.selectTradeSearchBox(driver).click();
//		wb.printListData(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver));
		AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(ranTrade);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), ranTrade);
		Thread.sleep(2000);
		System.out.println("Trade Added Successfully");
		test.log(LogStatus.PASS, "Trade added successfully");
		
		AddContractor_Pkg_Page.btnNext(driver).click();
		test.log(LogStatus.INFO, "Clicked On Next Button");
		Thread.sleep(1000);
		AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();//newly added alert for compliance button 20/01/2020
		
		AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
		driver.switchTo().window(wb.map.get("parentID"));
		System.out.println("Contractor Package Created Successfully");
		test.log(LogStatus.PASS, "Contractor Package Created successfully");
		
	}
}
