package TestScript;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddTradePage;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class AddContractorPkgQuarterlyPayroll extends BaseClass
{
	WebDriverCommonLib wb = new WebDriverCommonLib();
	AddContractor_Pkg_TC tc = new AddContractor_Pkg_TC();
	public String contractorName = "Alex Comp3524";
	public String projectName = "Sony Projects3524";
	public String tradeNumber = RandomClass.randomTradeNO();
	public String insuranceCompName = "Carriers3524";
	public String submissionFrequency = "Quarterly";
	public String reportTime = "Quarterly";
	
	/*
	 * Username: JimmySmith114540 Password: aF9H7y2N9XaO
	 */
	
	@Test()
	public void add_CP_Via_Project() throws InterruptedException
	{
	HomePage.controlMenuHomeIcon(driver).click();
	Thread.sleep(2000);
	test.log(LogStatus.PASS, "Clicked on Home Icon");
	HomePage.HomeMenuProjects(driver).click();
	test.log(LogStatus.PASS, "Clicked on Project Module Icon");
	ProjectModule.projectSearchEditBox(driver).sendKeys(projectName);
	test.log(LogStatus.PASS, "Search for Project "+projectName);
	Thread.sleep(1000);
	ProjectModule.projectSearchIcon(driver).click();
	test.log(LogStatus.PASS, "Clicked on Search Project Icon");
	Thread.sleep(3000);
	ProjectModule.projectEditIcon(driver).click();
	test.log(LogStatus.PASS, "Clicked on Edit Project Icon");
	wb.getWindowIDs();
	driver.switchTo().window(wb.map.get("childID"));
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");//Scroll down
	AddProject_General_Information_Page.linkCreateContractorPkg(driver).click();
	test.log(LogStatus.PASS, "Clicked Create Contractor Package Link");
	wb.getWindowID3();
	driver.switchTo().window(wb.map.get("subchildID"));
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
//select enrollment type
	AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
	Thread.sleep(1500);
//	AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).click();
	AddContractor_Pkg_Page.selectEnrollmentTypeSearchBoxWhileAddFromProjectLevel(driver).sendKeys("WC & GL");
	Thread.sleep(500);
	System.out.println("Enrollment Type Added Successfully");
	test.log(LogStatus.PASS, "Enrollment Type added successfully");
	wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver), "WC & GL Enrollment");
	
	Thread.sleep(2000);
	
	AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
	Thread.sleep(1000);
	wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(driver), "Compliance29");
	test.log(LogStatus.PASS," Compliance added successfully");		
	
	String tradeName=RandomClass.randomTradeDescription();
	AddContractor_Pkg_Page.addNewTradeLink(driver).click();
	test.log(LogStatus.PASS, "Click on Add New Trade Link");
	wb.getWindowID4();
	driver.switchTo().window(wb.map.get("subsubchildID"));
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(RandomClass.randomTradeDescription());
	test.log(LogStatus.PASS, "Trade Description Added Successfully");
	AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
	test.log(LogStatus.PASS, "Trade Number Added Successfully");
	wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
	test.log(LogStatus.PASS, "Trade Status Selected Successfully");
	AddTradePage.addTradeSaveAndCloseBtn(driver).click();

	int x=1;
	do {
		try {	
				Alert alt=driver.switchTo().alert();
				Thread.sleep(2000);
				alt.accept();
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String newtradeNumber="TNO"+rNo;
				tradeNumber=newtradeNumber;
				Thread.sleep(1000);
				AddTradePage.addTrade_TradeNumberField(driver).clear();
				Thread.sleep(1000);
				AddTradePage.addTrade_TradeNumberField(driver).sendKeys(tradeNumber);
				test.log(LogStatus.PASS, "Trade Number Added Successfully");
				AddTradePage.addTradeSaveAndCloseBtn(driver).click();
		} catch (Throwable e) 
		{
			System.out.println("Alert Not Present"+e);
			x=2;
		}
	} while (x==1);
	
	driver.switchTo().window(wb.map.get("subchildID"));
	System.out.println("Trade Added Successfully");
	test.log(LogStatus.PASS, tradeName+" Trade added successfully");
	Thread.sleep(2000);

	
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
	
	} catch (Throwable e) 
	{
		System.out.println(e);
	}
			
	AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
	driver.switchTo().window(wb.map.get("childID"));
	System.out.println("Contractor Package Created Successfully");
	test.log(LogStatus.PASS, "Contractor Package Created successfully");
	
	
	driver.close();
	driver.switchTo().window(wb.map.get("parentID"));
}

}
