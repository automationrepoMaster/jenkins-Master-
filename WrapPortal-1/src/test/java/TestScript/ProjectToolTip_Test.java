package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddProject_Address_Page;
import ObjectRepository.AddProject_Certificate_Page;
import ObjectRepository.AddProject_Change_Order_Page;
import ObjectRepository.AddProject_Compliance_Page;
import ObjectRepository.AddProject_Contact_Page;
import ObjectRepository.AddProject_Email_Management_Page;
import ObjectRepository.AddProject_Enrollment_Setup_Page;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddProject_PayrollCVTracking;
import ObjectRepository.AddProject_Premium_Modification_Page;
import ObjectRepository.AddProject_Project_Administrator_Access_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class ProjectToolTip_Test extends BaseClass 
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testProjectToolTip() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuProjects(driver).click();
		test.log(LogStatus.INFO, "Clicked On Project Module Icon");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProjectModule.projectEditIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Eidt Icon");
		Thread.sleep(2000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Actions act = new Actions(BaseClass.driver);
		
		List<WebElement> lst1 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======General Information Page Tool Tips=======");
		for(int i=0;i<lst1.size();i++)
		{
			try {
					WebElement a = lst1.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		AddProject_General_Information_Page.generalInformationSaveandContinueButton(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Project General Information Saved Successfully");
		
		//Project Setting		
		//AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
		test.log(LogStatus.INFO, "Clicked On Project settings Save And Continue Button");

	//Address	
		List<WebElement> lst2 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Address Page Tool Tips=======");
		for(int i=0;i<lst2.size();i++)
		{
			try {
					WebElement a = lst2.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		AddProject_Address_Page.nextButton(driver).click();
		test.log(LogStatus.PASS, "Address Added Successfully");
		Thread.sleep(5000);
		
		List<WebElement> lst3 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Contact Page Tool Tips=======");
		for(int i=0;i<lst3.size();i++)
		{
			try {
					WebElement a = lst3.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		AddProject_Contact_Page.nextButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Next Button");
		Thread.sleep(5000);
		
		List<WebElement> lst4 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Project Administrator Access Page Tool Tips=======");
		for(int i=0;i<lst4.size();i++)
		{
			try {
					WebElement a = lst4.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		
		AddProject_Project_Administrator_Access_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Project Administrator Access Save and Continue Button");
		Thread.sleep(5000);
		
		AddProject_Email_Management_Page.projectLevelEmailManagementSwitch(driver).click();
		Thread.sleep(4000);
		
		List<WebElement> lst5 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Email Management Page Tool Tips=======");
		for(int i=0;i<lst5.size();i++)
		{
			try {
					WebElement a = lst5.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		AddProject_Email_Management_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Email Management Save and Continue Button");
		Thread.sleep(5000);
		
		
		List<WebElement> lst6 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Enrollment Setup Page Tool Tips=======");
		for(int i=0;i<lst6.size();i++)
		{
			try {
					WebElement a = lst6.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		
		AddProject_Enrollment_Setup_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Enrollment Setup Save and Continue Button");
		Thread.sleep(5000);
		
		AddProject_PayrollCVTracking.payrollCVTrackConfiguredAtProgramLevelSwitch(driver).click();
		Thread.sleep(4000);
		
		List<WebElement> lst7 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Payroll And CV Tracking Page Tool Tips=======");
		for(int i=0;i<lst7.size();i++)
		{
			try {
					WebElement a = lst7.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		AddProject_PayrollCVTracking.saveAndContinueBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Payroll CV Tracking Save and Continue Button");
		Thread.sleep(6000);
		
		AddProject_Premium_Modification_Page.PremiumModificatonAtProjectlevelSwitch(driver).click();
		Thread.sleep(3000);
		List<WebElement> lst8 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Premium Modification Page Tool Tips=======");
		for(int i=0;i<lst8.size();i++)
		{
			try {
					WebElement a = lst8.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		AddProject_Premium_Modification_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Premium Modification Save and Continue Button");
		
		
		List<WebElement> lst9 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Compliance Page Tool Tips=======");
		for(int i=0;i<lst9.size();i++)
		{
			try {
					WebElement a = lst9.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
				System.out.println("we are in try block at lst9");
			}
		}
		
		  System.out.println("We are here before complaince page");
		//Raja
		
		js.executeScript("arguments[0].scrollIntoView();", AddProject_Compliance_Page.nextButton(driver));
		
		
		AddProject_Compliance_Page.nextButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Compliance Next Button");
		Thread.sleep(5000);
		
		List<WebElement> lst10 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Policy And Crtificate Page Tool Tips=======");
		for(int i=0;i<lst10.size();i++)
		{
			try {
					WebElement a = lst10.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		wb.waitForElemnet(AddProject_Certificate_Page.saveAndContinueButton(driver));
		test.log(LogStatus.PASS, "Clicked On Crtificate Page Save And Continue Button ");
		Thread.sleep(5000);
		
		List<WebElement> lst11 = ProjectModule.allToolTip(driver);
		test.log(LogStatus.INFO, "=======Change Order Page Tool Tips=======");
		for(int i=0;i<lst11.size();i++)
		{
			try {
					WebElement a = lst11.get(i);
				act.moveToElement(a).build().perform();
				Thread.sleep(4000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		
		
		AddProject_Change_Order_Page.finishAndClose(driver).click();
		test.log(LogStatus.PASS, "Clicked On Chnage Order Finish And Close Button ");
		Thread.sleep(5000);
		
		driver.switchTo().window(wb.map.get("parentID"));
		
	}
}
