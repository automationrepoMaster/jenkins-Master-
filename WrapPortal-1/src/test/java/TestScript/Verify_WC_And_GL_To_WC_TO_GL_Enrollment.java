package TestScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class Verify_WC_And_GL_To_WC_TO_GL_Enrollment extends BaseClass
{
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String contractorName = "Alex Comp3524";
	public String projectName = "Sony Projects3524";
	public String enrollmentType ="WC & GL Enrollment";
	public String status = "Incomplete Paperwork";                    //"Missing Payroll";//"Assigned";
	
	@Test
	public void WC_And_GL_To_WC_TO_GL_Enrollment() throws Throwable 
	{
		WebDriverWait webwait = new WebDriverWait(driver, 60);
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Clicked On Contracotr Package Icon");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		///js.executeScript("window.scrollBy(0,-350)", "");
		wb.scrollToTop();
		int x=2;
		do {
			try {
				js.executeScript("arguments[0].scrollIntoView();", ContractorPackageModule.advanceSearchIcon(driver));
				js.executeScript("arguments[0].click();", ContractorPackageModule.advanceSearchIcon(driver));
				//ContractorPackageModule.advanceSearchIcon(driver).click();
				test.log(LogStatus.PASS, "Clicked On Advance Search Icon");
				x=2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x==1);
		
		Thread.sleep(3000);
		do {
			try {
				wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProject(driver), projectName);
				test.log(LogStatus.PASS,projectName+ " Respective Project Selected Successfully");
				x=2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
				Thread.sleep(1000);
			}
		} while (x==1);

		Thread.sleep(1500);
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectEnrollmenttype(driver),enrollmentType );
		test.log(LogStatus.PASS,enrollmentType+ " Enrollment Type Selected Successfully");
		Thread.sleep(1500);		
		ContractorPackageModule.advanceSearchSelectContractorStatus(driver).click();
		test.log(LogStatus.PASS, " clicked on Contractor Status Field");
//		wb.selectSingleValueFromList(ContractorPackageModule.advanceSearchSelectStatusFromDropdownList(driver), "Missing Payroll");
		ContractorPackageModule.advanceSearchSelect_Single_StatusFromDropdown(driver, status).click();
		test.log(LogStatus.PASS,status+ " Status Selected Successfully");
		Thread.sleep(1500);
		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Advance Search Button");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-350)", "");
		
		driver.switchTo().frame(0);
		
		System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
		wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page");
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
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.radioBtnGLOnlyEnrollment(driver));
		Thread.sleep(2000);
		AddContractor_Pkg_Insurance_Enrollment_Page.radioBtnGLOnlyEnrollment(driver).click();
		Thread.sleep(2000);
		try {
	          wb.alertOk();
		}catch (Exception e) {
			System.out.println("No such alert");   // TODO: handle exception
		}
		Thread.sleep(2000);
		try {
		AddContractor_Pkg_Insurance_Enrollment_Page.alertEnrollmentChangeConfirmationBtn(driver).click();
		}catch (Exception e) {
			AddContractor_Pkg_Insurance_Enrollment_Page.PolicyOkBtn_Alert(driver).click();
			Thread.sleep(1000);
		}
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver));	
		try {
	          wb.alertOk();
		}catch (Exception e) {
			System.out.println("No such alert");   // TODO: handle exception
		}
		
		AddContractor_Pkg_Insurance_Enrollment_Page.btnSave(driver).click();
		
		try {
			// first common alert handled
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCoomman(driver).click();
			Thread.sleep(2000);
		} catch (Throwable e) {
			System.out.println("Alert issue  " + e);
		}
		try {

			AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(driver).click();
			Thread.sleep(2000);
			AddContractor_Pkg_Insurance_Enrollment_Page.alertUncappedPayrolToWorkclassUncappedPayroll(driver).click();
			Thread.sleep(2000);
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCappedPayrolToWorkclassCappedPayroll(driver).click();
		} catch (Throwable e)
		{
			System.out.println(e);
		}
		
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1050)", "");
		List<WebElement> lst = AddContractor_Pkg_Insurance_Enrollment_Page.enrollContractorPkgAllTab(driver);
		
		for(int i=0;i<=lst.size()-1;i++)
		{
			if(lst.get(i).getText().contains("WC PREMIUMS MODIFICATIONS"))//GL & UMBRELLA COVERAGE
			{
				System.err.println("Pacakge Enrollment type is not changed successfully");
				break;
			}else
			{
				System.out.println("Pacakge Enrollment type change successfully");
			}
		}
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver));	
		AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver).click();
		driver.switchTo().window(wb.map.get("parentID"));
		
		
Thread.sleep(7000);
		
		driver.switchTo().frame(0);
		System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
		wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page");
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
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.radioBtnGLOnlyEnrollment(driver));
		Thread.sleep(2000);
		AddContractor_Pkg_Insurance_Enrollment_Page.radioBtnWCOnlyEnrollment(driver).click();
		try {
			AddContractor_Pkg_Insurance_Enrollment_Page.alertEnrollmentChangeConfirmationBtn(driver).click();
			}catch (Exception e) {
				AddContractor_Pkg_Insurance_Enrollment_Page.PolicyOkBtn_Alert(driver).click();
				Thread.sleep(1000);
			}
			js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver));	
			try {
		          wb.alertOk();
			}catch (Exception e) {
				System.out.println("No such alert");   // TODO: handle exception
			}
			try {
				AddContractor_Pkg_Insurance_Enrollment_Page.alertEnrollmentChangeConfirmationBtn(driver).click();
			}catch (Exception e) {
				System.out.println("No such alert");
			}
		
		Thread.sleep(2000);
		try {
		AddContractor_Pkg_Insurance_Enrollment_Page.alertEnrollmentChangeConfirmationBtn(driver).click();
		}catch (Exception e) {
			System.out.println("No such alert ");
		}
		
		js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver));	
		AddContractor_Pkg_Insurance_Enrollment_Page.btnSave(driver).click();
		
		try {

			AddContractor_Pkg_Insurance_Enrollment_Page.alertCVtoPayroll(driver).click();
			Thread.sleep(2000);
			AddContractor_Pkg_Insurance_Enrollment_Page.alertUncappedPayrolToWorkclassUncappedPayroll(driver).click();
			Thread.sleep(2000);
			AddContractor_Pkg_Insurance_Enrollment_Page.alertCappedPayrolToWorkclassCappedPayroll(driver).click();
		} catch (Throwable e)
		{
			System.out.println(e);
		}
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1050)", "");
		List<WebElement> lst1 = AddContractor_Pkg_Insurance_Enrollment_Page.enrollContractorPkgAllTab(driver);
		
		for(int i=0;i<=lst1.size()-1;i++)
		{
			if(lst1.get(i).getText().contains("GL & UMBRELLA COVERAGE"))//GL & UMBRELLA COVERAGE WC PREMIUMS MODIFICATIONS
			{
				System.err.println("Pacakge Enrollment type is not changed successfully");
				break;
			}else
			{
				System.out.println("Pacakge Enrollment type change successfully");
			}
		}
		
		
		//js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver));	
		//AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndClose(driver).click();
		driver.close();
		Thread.sleep(4000);
        //wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("parentID"));
		wb.Switchtoparent();
	}
}
