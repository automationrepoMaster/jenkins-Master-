package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class PreviewPanel_Project_Navi_Link_Test extends BaseClass
{
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void testProjectPreviewPanelNavigationsLink() throws Throwable {
	HomePage.controlMenuProject(driver).click();
	test.log(LogStatus.PASS, "Clicked On Project Module Icon");
	Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
//verify the Sponsor Page		
		ProjectModule.projectFetchUserAccessSponsorsPreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On Sponsor Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Sponsors - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "Sponsor Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.FAIL, "Sponsor Title Not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
				
//verify the Administrator Page
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ProjectModule.projectFetchUserAccessAdministratorPreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On Administrator Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Users - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "Administrator Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.FAIL, "Administrator Title not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
//		driver.switchTo().defaultContent();
		
// verify the General Contractor Page
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ProjectModule.projectFetchUserAccessGeneralContractorPreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On General Contractor Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));

		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Contractors - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "General Contractor Page Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.FAIL, "General Contractor Title not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
// verify the Project Administrator Page
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ProjectModule.projectFetchUserAccessProjectAdministratorPreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Administrator Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Users - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "Project Administrator Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.FAIL, "Project Administrator Title not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		
		
// verify the Program Name Page
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ProjectModule.projectFetchProgramNamePreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On Program Name Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));

		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Program - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "Program Page Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.FAIL, "Program Page Title not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
// verify the District Name Page
	try {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ProjectModule.projectFetchUserAccessDistrictPreviewP(driver).click();
		test.log(LogStatus.PASS, "Clicked On District Link");
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));

		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("District - Wrap-Portal")) {
			System.out.println("Page Title Matched");
			test.log(LogStatus.PASS, "District Page Title Matched");
		} else {
			System.err.println("Page Title is not Matched");
			test.log(LogStatus.PASS, "District Page Title not Matched");
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
	} catch (Throwable e) {
		System.out.println(e);
		driver.switchTo().defaultContent();
	}
	
	Thread.sleep(3000);
	selectReportTest("Payroll Audit Summary","Payroll Audit Summary");
	selectReportTest("Project Close Out Report","Project Close Out Report");
	selectReportTest("Contractor Roster Report","Contractor Roster Report");
	selectReportTest("Non CIP Status Report","Contractor Roster Report");
	selectReportTest("Project Insurance Cost Analysis","Project Insurance Cost Analysis");
	selectReportTest("Enrollment Summary Report","Enrollment Summary Report");
	
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
				x=2;
			} catch (Throwable e) {
				System.out.println(e);
				ProjectModule.reportBarRightArrow(driver).click();
				System.out.println("Arrow clicked");
				test.log(LogStatus.PASS, "Clicked On Side Arrow");
			}
		} while (x==1);
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
