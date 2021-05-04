package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddProgram_Compliance_Page;
import ObjectRepository.AddProgram_Contractor_Portal_Options_Page;
import ObjectRepository.AddProgram_Email_Management_Page;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.AddProgram_PayrollCVTracking;
import ObjectRepository.AddProgram_Premium_Modification_Page;
import ObjectRepository.AddProgram_Program_Parameters_Page;
import ObjectRepository.AddProgram_User_Access;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class Verify_All_ToolTips extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testVerifyToolTip() throws Throwable
	{
		HomePage.controlMenuProgram(driver).click();
		Thread.sleep(2000);
		ProgramModule.programSearchEditBox(driver).sendKeys("Automation Program dont touch");
		Thread.sleep(3000);
		ProgramModule.programSearchIcon(driver).click();
		Thread.sleep(7000);
		ProgramModule.programEditIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Program Edit Icon");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Actions act = new Actions(BaseClass.driver);
		
		/*act.moveToElement(AddProgram_General_Info_Page.programCodeToolTip(driver)).build().perform();
		Thread.sleep(4000);
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.getScreenshot(driver)));    
		Thread.sleep(3000);
		
		System.out.println(AddProgram_General_Info_Page.programCodeToolTip(driver).getAttribute("oldtitle"));
		test.log(LogStatus.PASS,"Tool Tip Data "+AddProgram_General_Info_Page.programCodeToolTip(driver).getAttribute("oldtitle"));
		*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		List<WebElement> lst = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======General Information Page Tool Tips=======");
		for(int i=0;i<lst.size();i++)
		{
			try {
					WebElement a = lst.get(i);
				act.moveToElement(a).build().perform();
//				test.log(LogStatus.PASS,"Tool Tip Data "+a.getAttribute("oldtitle"));
				Thread.sleep(5000);
				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				
				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
			} catch (Throwable e) {
				System.out.println(e);
			}
			
		}
		
		act.moveToElement(AddProgram_General_Info_Page.programMinimumRateToolTip(driver)).build().perform();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,"Program Minimum Rate Tool Tip"+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		
		act.moveToElement(AddProgram_General_Info_Page.programMaximumRateToolTip(driver)).build().perform();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,"Program Maximum Rate Tool Tip"+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
		Thread.sleep(1000);
		AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Save And Continue Button");	

		// Program Setting new page 26-11-2020

		// AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
		test.log(LogStatus.INFO, "Clicked On Program settings Save And Continue Button");
		Thread.sleep(4000);
		
		//program parameter page
		List<WebElement> lst1 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======Program Parameter  Page Tool Tips=======");
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
		AddProgram_Program_Parameters_Page.programParameterSaveAndContinueButton(driver).click();
//Email page
		List<WebElement> lst2 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======Email Management Page Tool Tips=======");
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
		}////i[@oldtitle]
		
		
		
		AddProgram_Email_Management_Page.emailManagementSaveAndContinueButton(driver).click();
		Thread.sleep(3000);
		List<WebElement> lst3 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======Contractor Portal Options Page Tool Tips=======");
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
		
		AddProgram_Contractor_Portal_Options_Page.contractorPortalSaveAndContinueButton(driver).click();
		Thread.sleep(3000);
		List<WebElement> lst4 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======User Access Page Tool Tips=======");
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
		
		AddProgram_User_Access.userAccessPortalSaveAndContinueButton(driver).click();
		Thread.sleep(3000);
		
		
		List<WebElement> lst8 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======Payroll CV Tracking Page Tool Tips=======");
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
		
		AddProgram_PayrollCVTracking.saveAndContinueBtn(driver).click();
		Thread.sleep(3000);
		
		AddProgram_Compliance_Page.saveAndContinueButton(driver).click();
		Thread.sleep(3000);

		List<WebElement> lst5 = AddProgram_General_Info_Page.allStatusToolTip(driver);
		test.log(LogStatus.INFO, "=======Premium Modification Page Tool Tips=======");
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
		
		
		AddProgram_Premium_Modification_Page.premiumModificationSaveAndCloseButton(driver).click();

		driver.switchTo().window(wb.map.get("parentID"));
		
		
		
	}
}
