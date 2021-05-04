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


public class HomePage_PayRoll_Test extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	static String Progname = "Hercules PG"; // "RAUTOMATION123";
	static String projName = "Hercules PJ"; // "RAUT123";
	static String tradename = "2085 | TradeDynam";
	static String Contractor_Type = "WC & GL Enrollment";
	static String Contractor = "Hercules"; // Roger Federer Hercules

	@Test
	public void PayRollValidationTitles() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		Hompage_SubModules_Page.HomePage_PayRoll_ICon(driver).click();
		Thread.sleep(3000);
		System.out.println("clciked on Payroll icon");
		test.log(LogStatus.PASS, "payroll Icon is clicked succesfully");
		driver.switchTo().frame(Hompage_SubModules_Page.Homepage_Submodules_frame_btn(driver));
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_AdvancesearchICon(driver).click();
		test.log(LogStatus.PASS, "Clicked onAdvace search button at Payroll ");
		System.out.println("Clicked on Advacne search button at certificates advacne search ");
		Thread.sleep(5000);
		wb.selectByVisibleText(Progname, Hompage_SubModules_Page.Homepage_Submodules_SelectProgramme(driver));
		test.log(LogStatus.PASS, "Program name is selcted from dropdown succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Contractor);
		Thread.sleep(2000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contractor name is selcted from dropdown succesfully");
		wb.selectByVisibleText(projName,
				Hompage_SubModules_Page.Homepage_Submodules_SelectProject(driver));
		test.log(LogStatus.PASS, "Project name is selcted from dropdown succesfully");
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(tradename);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Trade name is selcted from dropdown succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(Keys.ENTER);
		wb.selectByIndex(Hompage_SubModules_Page.Homepage_Submodules_ContractorType(driver), 1);
		test.log(LogStatus.PASS, "Contractor Type is selcted from dropdown succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_Advance_SearchBtn_DOwn(driver).click();
		Thread.sleep(4000);
		System.out.println(driver.getWindowHandles());
		Hompage_SubModules_Page.Homepage_Submodules_RadioBtn(driver).click();
		Thread.sleep(3000);
		Hompage_SubModules_Page.Homepage_Submodules_NextBtn(driver).click();
		// System.out.println("next btn is cliekd after radio button");
		test.log(LogStatus.PASS, "next button is clicked after Radio button");
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
		System.out.println(ActualWindowtile + "it is the title of payroll page");
		String ExpWindowTitle = "MONTHLY PAYROLL(S)";
		if (ActualWindowtile.contains(ExpWindowTitle)) {
			// System.out.println("both are matching and the window tile is :"
			// +ActualWindowtile );
			test.log(LogStatus.PASS, "Act and Exp are matching for the window title ");
		} else {
			// System.out.println("both are not matching and the window tile is :"
			// +ActualWindowtile );
			test.log(LogStatus.FAIL, "Act and Exp are  not matching for the window title ");
		}
		// Programme
		WebElement Certificate_programmTitle = Hompage_SubModules_Page.Prograname(driver);
		String Actual_Certificate_programmTitle = Certificate_programmTitle.getText();
		// String Exp_Certificate_programmTitle = "RAUTOMATION123";
		if (Actual_Certificate_programmTitle.equalsIgnoreCase(Progname)) {
			// System.out.println("Both are matching and the tilte is" +
			// Actual_Certificate_programmTitle);
			test.log(LogStatus.PASS, "Act and Exp are matching for the Program title ");
		} else {
			// System.out.println("Both are not matching and the tilte is" +
			// Actual_Certificate_programmTitle);
			test.log(LogStatus.FAIL, "Act and Exp are matching for the program title ");
		}

		// project
		WebElement Certificate_projectTitle = Hompage_SubModules_Page.projectname(driver);
		String Actual_Certificate_projectTitle = Certificate_projectTitle.getText();
		if (Actual_Certificate_projectTitle.contains(projName)) {
			// System.out.println("Both are matching and the tilte is" +
			// Actual_Certificate_projectTitle);
			test.log(LogStatus.PASS, "Act and Exp are matching for the project title ");

		} else {
			test.log(LogStatus.FAIL, "Act and Exp are  not matching for the project title ");

			// System.out.println("Both are not matching and the tilte is" +
			// Actual_Certificate_projectTitle);
		}

		// Enrollment Type

		WebElement Certificate_EnrollmentType = Hompage_SubModules_Page.EnrollmentType(driver);
		String Actual_Certificate_EnrollmentType = Certificate_EnrollmentType.getText();
		String Exp_Certificate_EnrollmentType = "WC & GL Enrollment";
		if (Actual_Certificate_EnrollmentType.equalsIgnoreCase(Contractor_Type)) {
			// System.out.println("Both are matching and the tilte is" +
			// Actual_Certificate_EnrollmentType);
			test.log(LogStatus.PASS, "Act and Exp are matching for the Enrollment title ");
		} else {
			// System.out.println("Both are not matching and the tilte is" +
			// Actual_Certificate_EnrollmentType);
			test.log(LogStatus.FAIL, "Act and Exp are matching for the Enrolment title ");

		}

		// Trade Description

		WebElement Certificate_TradeDescription = Hompage_SubModules_Page.TradeName(driver);
		String Actual_Certificate_TradeDescription = Certificate_TradeDescription.getText();
		// String Exp_Certificate_TradeDescription = " Trade Description Trade
		// Number-007 | Trade Description";
		if (Actual_Certificate_TradeDescription.equalsIgnoreCase(tradename)) {
			// System.out.println("Both are matching and the tilte is" +
			// Actual_Certificate_TradeDescription);
			test.log(LogStatus.PASS, "Act and Exp are matching for the Trade Description title ");

		} else {
			// System.out.println("Both are not matching and the tilte is" +
			// Actual_Certificate_TradeDescription);
			test.log(LogStatus.PASS, "Act and Exp are not matching for the Trade Description title ");

		}
		Hompage_SubModules_Page.FinishCloseBtn(driver).click();
		wb.Switchtoparent();
//		   wb.getWindowIDs();
//			driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(5000);
		try {
			wb.scrollToTop();
		} catch (Exception e) {
			System.out.println("already scrolled up");
		}
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "PayRollValidationTitles")));

	}

}
