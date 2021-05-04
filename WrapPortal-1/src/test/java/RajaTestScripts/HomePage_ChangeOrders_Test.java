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

public class HomePage_ChangeOrders_Test extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

//	static String Progname = "RAUTOMATION123";
//	static String proName = "RAUT123";
//	static String tradename = "007";
//	static String Contractor_Type = "WC & GL Enrollment";
//	static String Contractor = " Ashley";

	 String Progname =  "RAUTOMATION123";  //"Hercules PG";
	 String projName =    "RAUT123";  //"Hercules PJ";  
	 String tradename = "2085 | TradeDynam";
	 String Contractor_Type = "WC & GL Enrollment";
	 String Contractor = "Hercules"; // Roger Federer Hercules

	@Test
	public void ChangeOrders_validation_of_Titles() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement icon = Hompage_SubModules_Page.Homepage_ChangeOrders_Icon(driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		icon.click();
		Thread.sleep(3000);
		System.out.println("clciked on certificates icon");
		test.log(LogStatus.PASS, "Clicked on Certificates Icon");
		driver.switchTo().frame(Hompage_SubModules_Page.Homepage_Submodules_frame_btn(driver));
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_AdvancesearchICon(driver).click();
		System.out.println("Clicked on Advacne search button at certificates advacne search ");
		test.log(LogStatus.PASS, "Clicked on Advance search button at Certificates page");
		Thread.sleep(5000);
		wb.selectByVisibleText(Progname, Hompage_SubModules_Page.Homepage_Submodules_SelectProgramme(driver));
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "programme from dropdown is selected  succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Contractor);
		Thread.sleep(2000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contractor is selected  succesfully");
		wb.selectByVisibleText(projName, Hompage_SubModules_Page.Homepage_Submodules_SelectProject(driver));
		test.log(LogStatus.PASS, "Project from dropdown is selected  succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(tradename);
		Thread.sleep(2000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(Keys.ENTER);
		wb.selectByIndex(Hompage_SubModules_Page.Homepage_Submodules_SelectProject(driver), 1);
		test.log(LogStatus.PASS, "contractorType from dropdown is selected  succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_Advance_SearchBtn_DOwn(driver).click();
		Thread.sleep(4000);
		System.out.println(driver.getWindowHandles());
		Hompage_SubModules_Page.Homepage_Submodules_RadioBtn(driver).click();
		Thread.sleep(7000);
		Hompage_SubModules_Page.Homepage_Submodules_NextBtn(driver).click();
		System.out.println("next btn is cliekd after radio button");
		test.log(LogStatus.PASS, "next button is clicked succesfully");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		 System.out.println("Moved to second window to claims page");
		test.log(LogStatus.PASS, "Moved to claims page succesfully");
		Thread.sleep(2000);
		System.out.println("Default content");
		//wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("parentID"));
		wb.Switchtoparent();
		Thread.sleep(5000);
		//wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("childID"));
		//wb.Maximizewindow();
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		String ActualWindowtile = driver.getTitle();
		String ExpWindowTitle = "View Change Order(s)";
		if (ActualWindowtile.contains(ExpWindowTitle)) {
			System.out.println("both are matching and the window tile is  :" + ActualWindowtile);
			test.log(LogStatus.PASS, "Both are matching and the window title is " + ActualWindowtile);

		} else {
			System.out.println("both are not matching and the window tile is :" + ActualWindowtile);
			test.log(LogStatus.FAIL, "Both are not matching ");
		}
		// Programme
		WebElement Certificate_programmTitle = Hompage_SubModules_Page.ProgrammeTilteChangorder(driver);
		String Actual_Certificate_programmTitle = Certificate_programmTitle.getText();
		if (Actual_Certificate_programmTitle.equalsIgnoreCase(Progname)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_programmTitle);
			test.log(LogStatus.PASS,
					"Act and Exp at programme Title are matching and the text is" + Actual_Certificate_programmTitle);
		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_programmTitle);
			test.log(LogStatus.FAIL, "Act and Exp at programme Title are not matching ");
		}
		// project
		WebElement Certificate_projectTitle = Hompage_SubModules_Page.projectnameTilteChangorder(driver);
		String Actual_Certificate_projectTitle = Certificate_projectTitle.getText();
		if (Actual_Certificate_projectTitle.equalsIgnoreCase(projName)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_projectTitle);
			test.log(LogStatus.PASS,
					"Act and Exp at programme Title are matching and the text is" + Actual_Certificate_projectTitle);

		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_projectTitle);
			test.log(LogStatus.PASS,
					"Act and Exp at programme Title are matching and the text is" + Actual_Certificate_projectTitle);
		}

		// Enrollment Type

		WebElement Certificate_EnrollmentType = Hompage_SubModules_Page
				.EnrollmentTypeTilteChangorder(driver);
		String Actual_Certificate_EnrollmentType = Certificate_EnrollmentType.getText();
		if (Actual_Certificate_EnrollmentType.equalsIgnoreCase(Contractor_Type)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_EnrollmentType);
			test.log(LogStatus.PASS,
					"Act and Exp at programme Title are matching and the text is" + Actual_Certificate_EnrollmentType);
		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_EnrollmentType);
			test.log(LogStatus.FAIL,
					"Act and Exp at programme Title are matching and the text is" + Actual_Certificate_EnrollmentType);
		}

		// Trade Description

		WebElement Certificate_TradeDescription = Hompage_SubModules_Page.TradeNameTilteChangorder(driver);
		String Actual_Certificate_TradeDescription = Certificate_TradeDescription.getText();
		if (Actual_Certificate_TradeDescription.contains(tradename)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_TradeDescription);
			test.log(LogStatus.PASS, "Act and Exp at programme Title are matching and the text is"
					+ Actual_Certificate_TradeDescription);
		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_TradeDescription);
			test.log(LogStatus.FAIL, "Act and Exp at programme Title are matching and the text is"
					+ Actual_Certificate_TradeDescription);
		}
		Hompage_SubModules_Page.FinishCloseBtnChangorder(driver).click();
		Thread.sleep(3000);
		 wb.Switchtoparent();
//			wb.getWindowIDs();
//			driver.switchTo().window(wb.map.get("parentID"));
			try {
				wb.scrollToTop();
				test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "ChangeOrders_validation_of_Titles")));
			}catch (Exception e) {
				System.out.println("It is alread scroled up");
				test.log(LogStatus.INFO, test.addScreenCapture(FileUtils1.captureScreen(driver, "ChangeOrders_validation_of_Titles")));
			}
	}

}
