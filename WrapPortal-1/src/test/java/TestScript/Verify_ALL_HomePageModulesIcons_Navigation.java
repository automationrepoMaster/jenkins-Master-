package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;


public class Verify_ALL_HomePageModulesIcons_Navigation extends BaseClass
{
	
	String SponsorsUrl="Sponsors - Wrap-Portal";
	String ProgramsUrl="Program - Wrap-Portal";
	String ProjectsUrl="Project - Wrap-Portal";
	String ContractorsUrl="Contractors - Wrap-Portal";
	String DestrictsUrl="Sub-Sponsor - Wrap-Portal";//"District - Wrap-Portal";
	String ContractorPackagesUrl="Contractor Packages - Wrap-Portal";
	String TradeUrl="Trades - Wrap-Portal";
	String WorkClassUrl="Class Code - Wrap-Portal";
	String EmailsUrl="Email - Wrap-Portal";
	String FaxesUrl="Fax - Wrap-Portal";
	String TaskUrl="Tasks - Wrap-Portal";
	String ReportsUrl="Reports - Wrap-Portal";
	String NotesUrl="Notes - Wrap-Portal";
	String DocumentsUrl="Documents - Wrap-Portal";
	String SettingsUrl="Settings - My Profile - Wrap-Portal";
	String HelpUrl="Wrap Portal Basics - Knowledge Base | HELP MATERIAL";
	
	String insuranceEnrollmentUrl="";
	String ContractDetailsUrl="";
	String ComplianceCategoriesUrl="";
//	String DocumentsUrl="";
	String CertificatesUrl="";
	String PayrollUrl="";
	String ChangeOrdersUrl="";
	String ClaimsUrl="";
	String LossControllsUrl="";
	String ColorCategoriesUrl="";
	String CompletionNotice="";
	
	WebDriverCommonLib	wb=new WebDriverCommonLib();
	
	@Test
	public void testHomePageModulesNavigation() throws Throwable
	{
		try 
		{
		SoftAssert softAssert = new SoftAssert();
		
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuSponsors(driver).click();
		softAssert.assertEquals(driver.getTitle(),SponsorsUrl); 
		test.log(LogStatus.PASS,"Clicked On Sponsors Module Icon " +driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(1500);
		
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuPrograms(driver).click();
		test.log(LogStatus.PASS,"Clicked On Programs Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),ProgramsUrl);
		Thread.sleep(1500);
		
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuProjects(driver).click();
		test.log(LogStatus.PASS,"Clicked On Projects Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),ProjectsUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuContractors(driver).click();
		test.log(LogStatus.PASS,"Clicked On Contractors Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),ContractorsUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuDistrict(driver).click();
		test.log(LogStatus.PASS,"Clicked On Districs Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),DestrictsUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS,"Clicked On Contractor Package Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),ContractorPackagesUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuTrade(driver).click();
		test.log(LogStatus.PASS,"Clicked On Trade Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),TradeUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuWorkClass(driver).click();
		test.log(LogStatus.PASS,"Clicked On WorkClass Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),WorkClassUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuEmails(driver).click();
		test.log(LogStatus.PASS,"Clicked On Emails Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),EmailsUrl);
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuFaxes(driver).click();
		test.log(LogStatus.PASS,"Clicked On Faxes Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),FaxesUrl);
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuTask(driver).click();
		test.log(LogStatus.PASS,"Clicked On Task Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),TaskUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuReports(driver).click();
		test.log(LogStatus.PASS,"Clicked On Reports Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),ReportsUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuNotes(driver).click();
		test.log(LogStatus.PASS,"Clicked On Notes Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),NotesUrl);
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuDocuments(driver).click();
		test.log(LogStatus.PASS,"Clicked On Documents Module Icon "+driver.getTitle());
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),DocumentsUrl);
		HomePage.controlMenuHomeIcon(driver).click();
		
		Thread.sleep(1500);
		HomePage.HomeMenuSettings(driver).click();
		System.out.println(driver.getTitle());
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS,"Clicked On Settings Module Icon "+driver.getTitle());
		Thread.sleep(3500);
		softAssert.assertEquals(driver.getTitle(),SettingsUrl);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		HomePage.controlMenuHomeIcon(driver).click();
		
		Thread.sleep(2500);
		HomePage.HomeMenuHelp(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(2500);
		System.out.println(driver.getTitle());
		test.log(LogStatus.PASS,"Clicked On Help Module Icon "+driver.getTitle());
		softAssert.assertEquals(driver.getTitle(),HelpUrl);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		
		
		
		softAssert.assertAll();
		
		} catch (Throwable e) 
		{
			System.out.println(e);
			
			test.log(LogStatus.FAIL,"Following Assertion got Failed \n "+e);
		}
		
		
	/*	Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuInsuranceEnrollment(driver).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuSettings(driver).click();
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuContractDetails(driver).click();
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(1500);
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuHelp(driver).click();
		System.out.println(driver.getTitle());
	*/	
		
		
		
		
		
		
	}
}
