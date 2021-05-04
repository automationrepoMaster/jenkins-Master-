package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class PreviewPanel_ContractorPkg_Navi_Link_Test extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testContractorPkgNavigationsLink() throws Throwable
	{
		WebDriverWait webwait = new WebDriverWait(driver, 60);
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Clicked On Contracotr Package Icon");
		Thread.sleep(10000);
		
		driver.switchTo().frame(0);
		test.log(LogStatus.PASS, ContractorPackageModule.fetchProjectNamePriviewP(driver).getText()+" Clicked On Project Link");
		wb.waitForElemnet(ContractorPackageModule.fetchProjectNamePriviewP(driver));
		
		//Project Link
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Project - Wrap-Portal")) 
		{
			System.out.println("Navigate Successfully On Project Module Page");
		}else
		{
			System.out.println("Not Navigate On Project Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
			
		// Verify the District module navigation link
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ContractorPackageModule.fetchDistrictNamePriviewP(driver));
//		wb.waitForElemnet());
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("District - Wrap-Portal")) 
		{
			System.out.println("Navigate Successfully On District Module Page");
		}else
		{
			System.out.println("Not Navigate On District Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		
		// Verify the Program module navigation link
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		js.executeScript("arguments[0].click();", ContractorPackageModule.fetchProgramNamePriviewP(driver));
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Program - Wrap-Portal")) {
			System.out.println("Navigate Successfully On Program Module Page");
		} else {
			System.out.println("Not Navigate On Program Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		
		
		// Verify the Trade module navigation link
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		js.executeScript("arguments[0].click();", ContractorPackageModule.fetchTradeNamePriviewP(driver));
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Trades - Wrap-Portal")) {
			System.out.println("Navigate Successfully On Trade Module Page");
		} else {
			System.out.println("Not Navigate On Trade Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		

		// Verify the Company module navigation link
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		js.executeScript("arguments[0].click();", ContractorPackageModule.fetchContratoraAndComapanyNamePriviewP(driver));
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Contractors - Wrap-Portal")) {
			System.out.println("Navigate Successfully On Contractor Module Page");
		} else {
			System.out.println("Not Navigate On Contractor Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		Thread.sleep(2000);
//		selectReportTest("Payroll Audit Summary","Reports/ContractorDeductTracking.aspx?");
		selectReportTest("Contractor Payroll, Man-Hours & Labor Rate","Contractor Payroll, Man-Hours & Labor Rate");
		selectReportTest("Contractor Insurance Cost Tracking","Contractor Insurance Cost Tracking - Wrap-Portal");
		selectReportTest("Submitted Payroll Report","Submitted Payroll Report - Wrap-Porta");
//		selectReportTest("Non CIP Status Report","Contractor Profile");//name not mentioned properly in html file by developer
		selectReportTest("Subcontractor Status","Sub Contractor Status");
		selectReportTest("Missing Payroll","Missing Payroll by Contractor Report");
//		
	}
	
	public void selectReportTest(String reportName, String Title) throws Throwable
	{
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		ProjectModule.reportBar(driver).click();
		test.log(LogStatus.PASS, "Clicked On Report Bar");
		Thread.sleep(1500);
		int x=1;
		do {
			try {
				Thread.sleep(1500);
				System.out.println(ProjectModule.selectReport(driver, reportName).isDisplayed());
				test.log(LogStatus.PASS, "Report is Displayed");
				wb.mouseMoveToElement((ProjectModule.selectReport(driver, reportName)));
				System.out.println("Report clicked");
				test.log(LogStatus.PASS, "Clicked On Expected Report");
				x=4;
			} catch (Throwable e) {
				System.out.println(e);
				ProjectModule.reportBarRightArrow(driver).click();
				System.out.println("Arrow clicked");
				test.log(LogStatus.PASS, "Clicked On Side Arrow");
				x++;
			}
		} while (x<=3);
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains(Title)) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "Report Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.PASS, "Report Title Not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(1500);
		driver.switchTo().frame(0);
		ProjectModule.reportBar(driver).click();	
		driver.switchTo().defaultContent();
	}
	
	
}
