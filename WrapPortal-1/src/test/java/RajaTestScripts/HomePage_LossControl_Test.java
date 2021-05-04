package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.Hompage_SubModules_Page;


public class HomePage_LossControl_Test  extends BaseClass{
	WebDriverCommonLib wb = new WebDriverCommonLib();
	
//	static String Progname = "RAUTOMATION123";
//	static String proName = "RAUT123";
//	static String tradename = "007";
//	static String Contractor_Type = "WC & GL Enrollment";
//	static String Contractor = " Ashley";
	
	
	 String Progname = "Hercules PG"; // "RAUTOMATION123";
	 String projName = "Hercules PJ"; // "RAUT123";
	 String tradename = "2085 | TradeDynam";
	 String Contractor_Type = "WC & GL Enrollment";
	 String Contractor = "Hercules"; // Roger Federer Hercules
	

	@Test 
	public  void LosscontrolValidationTitles() throws Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement icon = Hompage_SubModules_Page.HomePage_LossControl_Icon(driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		icon.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		System.out.println("clciked on Loss Control icon");
		test.log(LogStatus.PASS,"Loss control Icon is clicked succesfully");
		driver.switchTo().frame(Hompage_SubModules_Page.Homepage_Submodules_frame_btn(driver));
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_AdvancesearchICon(driver).click();
		System.out.println("Clicked on Advacne search button at certificates advacne search ");
		test.log(LogStatus.PASS, "Clicked onAdvace search button at Loss Control ");
		Thread.sleep(5000);
		wb.selectByVisibleText(Progname, Hompage_SubModules_Page.Homepage_Submodules_SelectProgramme(driver));
		test.log(LogStatus.PASS, "Program name is selcted from dropdown succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver)
				.sendKeys(Contractor);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Contractor name is selcted from dropdown succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver)
				.sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "contractor name is selcted from  succesfully to search");
		wb.selectByVisibleText(projName, Hompage_SubModules_Page.Homepage_Submodules_SelectProject(driver));
		test.log(LogStatus.PASS, "Project name is selcted from dropdown succesfully");
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(tradename);
		Thread.sleep(2000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Trade name is selcted from dropdown succesfully");
		wb.selectByVisibleText(Contractor_Type, Hompage_SubModules_Page.Homepage_Submodules_ContractorType(driver));
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "Contractor Type is selcted from dropdown succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_Advance_SearchBtn_DOwn(driver).click();
		Thread.sleep(4000);
		System.out.println(driver.getWindowHandles());
		Hompage_SubModules_Page.Homepage_Submodules_RadioBtn(driver).click();
		Thread.sleep(3000);
		Hompage_SubModules_Page.Homepage_Submodules_NextBtn(driver).click();
		System.out.println("next btn is cliekd after radio button");
		test.log(LogStatus.PASS, "next button is clicked after Radio button");
		System.out.println(driver.getWindowHandles());
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		// System.out.println("Moved to second window to claims page");
		test.log(LogStatus.PASS, "Moved to claims page succesfully");
		Thread.sleep(2000);
		System.out.println("Default content");
	//	wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("parentID"));
		wb.SwitchtoChild1();
		Thread.sleep(5000);
		//wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("childID"));
		//wb.Maximizewindow();
		wb.SwitchtoChild1();
		Thread.sleep(2000);
 		String ActualWindowtile = driver.getTitle();
 		String ExpWindowTitle= "Safety Contractors";
 		if(ActualWindowtile.contains(ExpWindowTitle)) {
 	 		System.out.println("both are matching and the window tile is  :" +ActualWindowtile );
			test.log(LogStatus.PASS, "Act and Exp are matching for the window title ");

 	 		}else{
 	 	 		System.out.println("both are  not matching and the window tile is  :" +ActualWindowtile );
 				test.log(LogStatus.FAIL , "Act and Exp are  not matching for the window title ");

 	 		}
 		Thread.sleep(2000);
 		wb.scrollToEndt();
 		Thread.sleep(2000);
 		Hompage_SubModules_Page.CloseBtnLosscontrol(driver).click();
 		Thread.sleep(3000);
 	   
// 		wb.getWindowIDs();
//		driver.switchTo().window(wb.map.get("parentID"));
//		test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)));
 	   wb.Switchtoparent();
//	   wb.getWindowIDs();
//		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(3000);
		try {
			wb.scrollToTop();
			test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "LosscontrolValidationTitles")));
		}catch (Exception e) {
			System.out.println("already scrolled up");
			test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "LosscontrolValidationTitles")));
		}
 	 		
	}
	

}
