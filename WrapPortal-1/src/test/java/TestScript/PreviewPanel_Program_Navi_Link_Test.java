package TestScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class PreviewPanel_Program_Navi_Link_Test extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testProgramPanelNavigationsLink() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// String expectedElement= "Program5917";
		test.log(LogStatus.INFO, "========== Add Program Section  ==========");
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuPrograms(driver).click();
		test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.click(ProgramModule.contractorPkgTypeLinkPrivewP(driver)).build().perform();

		//Verify the project module navigation link
		act.moveToElement(ProgramModule.projectsLinkPrivewP(driver)).click().build().perform();
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
		
		// Verify the Sponsor module navigation link
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		act.moveToElement(ProgramModule.sponsorLinkPrivewP(driver)).click().build().perform();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Sponsors - Wrap-Portal")) {
			System.out.println("Navigate Successfully On Sponsor Module Page");
		} else {
			System.out.println("Not Navigate On Sponsors Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));

		// Verify the Administrator module navigation link
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		act.moveToElement(ProgramModule.administratorLinkPrivewP(driver)).click().build().perform();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Users - Wrap-Portal")) {
			System.out.println("Navigate Successfully On Administrator Module Page");
		} else {
			System.out.println("Not Navigate On Administrator Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));		
		
		// Verify the Add Project button navigation link
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		act.moveToElement(ProgramModule.programAddProjectButtonPrivewP(driver)).click().build().perform();
		Thread.sleep(2000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Add Project - Wrap-Portal")) {
			System.out.println("Navigate Successfully to Add Project Module Page");
		} else {
			System.out.println("Not Navigate to Add Project Module Page");
		}
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		
	}
}
