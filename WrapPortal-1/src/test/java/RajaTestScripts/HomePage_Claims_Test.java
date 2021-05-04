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

public class HomePage_Claims_Test extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();
//	static String Progname = "RAUTOMATION123";
//	static String projName = "RAUT123";
//	static String tradename = "007";
//	static String Contractor_Type = "WC & GL Enrollment";
//	static String Contractor = " Ashley";

	static String Progname = "Hercules PG"; // "RAUTOMATION123";
	static String projName = "Hercules PJ"; // "RAUT123";
	static String tradename = "2085 | TradeDynam";
	static String Contractor_Type = "WC & GL Enrollment";
	static String Contractor = "Hercules"; // Roger Federer Hercules

	@Test
	public void Claims_validation_of_Titles() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement icon = Hompage_SubModules_Page.HomePage_Claims_Icon(driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		icon.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		// System.out.println("clciked on claims icon");
		test.log(LogStatus.PASS, "Clicked on Claims ICON");
		driver.switchTo().frame(Hompage_SubModules_Page.Homepage_Submodules_frame_btn(driver));
		Thread.sleep(6000);
		Hompage_SubModules_Page.Homepage_Submodules_AdvancesearchICon(driver).click();
		// System.out.println("Clicked on Advacne search button at claims advacne search
		// ");
		test.log(LogStatus.PASS, "Clicked onAdvace search button at claims ");
		Thread.sleep(5000);
//		WebElement selectprogrammeDropDown = PageObjects.Homepage_AdvacneSearch_Page
//				.Homepage_Submodules_SelectProgramme();
//		Select SselectprogrammeDropDown = new Select(selectprogrammeDropDown);
//		SselectprogrammeDropDown.selectByVisibleText(Progname);
		wb.selectByVisibleText(Progname, Hompage_SubModules_Page.Homepage_Submodules_SelectProgramme(driver));
		test.log(LogStatus.PASS, "Program name is selcted from dropdown succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Contractor);
		test.log(LogStatus.PASS, "COntractor  name is selcted from dropdown succesfully");
		Thread.sleep(2000);
		Hompage_SubModules_Page.Homepage_Submodules_SearchforContractor(driver).sendKeys(Keys.ENTER);
//		WebElement selectprojectDropDown = PageObjects.Homepage_AdvacneSearch_Page
//				.Homepage_Submodules_SelectProject();
//		Select SselectprojectDropDown = new Select(selectprojectDropDown);
//		SselectprojectDropDown.selectByVisibleText(projName);
		wb.selectByVisibleText(projName, Hompage_SubModules_Page.Homepage_Submodules_SelectProject(driver));
		test.log(LogStatus.PASS, "Project name is selcted from dropdown succesfully");
		Thread.sleep(5000);
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(tradename);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "trade  name is selcted from dropdown succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_SelectTrade(driver).sendKeys(Keys.ENTER);
//		WebElement selectContractortypeDropDown = PageObjects.Homepage_AdvacneSearch_Page
//				.Homepage_Submodules_ContractorType();
//		Select SselectContractortypeDropDown = new Select(selectContractortypeDropDown);
//		SselectContractortypeDropDown.selectByIndex(1);
		wb.selectByIndex(Hompage_SubModules_Page.Homepage_Submodules_ContractorType(driver), 1);
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "contractorType is selcted from dropdown succesfully");
		Hompage_SubModules_Page.Homepage_Submodules_Advance_SearchBtn_DOwn(driver).click();
		Thread.sleep(4000);
		System.out.println(driver.getWindowHandles());
		Hompage_SubModules_Page.Homepage_Submodules_RadioBtn(driver).click();
		Thread.sleep(3000);
		Hompage_SubModules_Page.Homepage_Submodules_NextBtn(driver).click();
		System.out.println("next btn is cliekd after radio button");
		test.log(LogStatus.PASS, "Next button is clicked succesfully");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println("Moved to second window to claims page");
		test.log(LogStatus.PASS, "Moved to claims page succesfully");
		Thread.sleep(2000);
		System.out.println("Default content");
		// wb.getWindowIDs();
		// driver.switchTo().window(wb.map.get("parentID"));
		wb.Switchtoparent();
		Thread.sleep(5000);
		// wb.getWindowIDs();
		// driver.switchTo().window(wb.map.get("childID"));
		// wb.Maximizewindow();
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		String ActualWindowtile = driver.getTitle();
		String ExpWindowTitle = "ViewClaim(s)";

		if (ActualWindowtile.contains(ExpWindowTitle)) {
			System.out.println("both are matching and the window tile is :" + ActualWindowtile);
			test.log(LogStatus.PASS, ActualWindowtile + " " + "is Act" + " and Exp " + " " + "is" + ExpWindowTitle
					+ "are matching for the window title ");

		} else {
			System.out.println("both are not matching and the window tile is :" + ActualWindowtile);
			test.log(LogStatus.FAIL, ActualWindowtile + "is " + ActualWindowtile + " and the expected title is "
					+ ExpWindowTitle + " " + "are not matching");

		}
		// Programme
		WebElement Certificate_programmTitle = Hompage_SubModules_Page.ProgrammeTilteClaims(driver);
		String Actual_Certificate_programmTitle = Certificate_programmTitle.getText();
		if (Actual_Certificate_programmTitle.equalsIgnoreCase(Progname)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_programmTitle);
			test.log(LogStatus.PASS, "Both Act and Exp are  matching for the program Title");

		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_programmTitle);
			test.log(LogStatus.FAIL, "Act and Exp titles are not matching  for the peorgramme name");

		}

		// project

		WebElement Certificate_projectTitle = Hompage_SubModules_Page.projectnameTilteClaims(driver);
		String Actual_Certificate_projectTitle = Certificate_projectTitle.getText();
		if (Actual_Certificate_projectTitle.equalsIgnoreCase(projName)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_projectTitle);
			test.log(LogStatus.PASS, "Act and Exp titles are  matching  for the project name");
		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_projectTitle);
			test.log(LogStatus.FAIL, "Act and Exp titles are not matching  for the project name");
		}

		// Enrollment Type

		WebElement Certificate_EnrollmentType = Hompage_SubModules_Page.EnrollmentTypeTilteClaims(driver);
		String Actual_Certificate_EnrollmentType = Certificate_EnrollmentType.getText();
		if (Actual_Certificate_EnrollmentType.equalsIgnoreCase(Contractor_Type)) {
			System.out.println("Both are matching and the tilte is" + Actual_Certificate_EnrollmentType);
			test.log(LogStatus.PASS, "Act and Exp titles are  matching  for the Enrollment  name");

		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_EnrollmentType);
			test.log(LogStatus.FAIL, "Act and Exp titles are  not matching  for the Enrollment name");

		}

		// Trade Description

		WebElement Certificate_TradeDescription = Hompage_SubModules_Page.TradeNameTilteClaims(driver);
		String Actual_Certificate_TradeDescription = Certificate_TradeDescription.getText();
		if (Actual_Certificate_TradeDescription.contains(tradename)) {
			System.out.println("Both " + " " + Actual_Certificate_TradeDescription + "and Expected " + tradename
					+ " are matching and the tilte is" + Actual_Certificate_TradeDescription);
			test.log(com.relevantcodes.extentreports.LogStatus.PASS,
					"Act and Exp titles are  matching  for the Trade name");
			test.log(LogStatus.INFO, Actual_Certificate_TradeDescription);

		} else {
			System.out.println("Both are not matching and the tilte is" + Actual_Certificate_TradeDescription);
			test.log(LogStatus.PASS, "Act and Exp titles are  not matching  for the Trade name");

		}
		Hompage_SubModules_Page.FinishCloseBtnClaims(driver).click();
		Thread.sleep(3000);
		wb.Switchtoparent();
//		wb.getWindowIDs();
//		driver.switchTo().window(wb.map.get("parentID"));
		try {
			wb.scrollToTop();
			test.log(LogStatus.PASS,
					test.addScreenCapture(FileUtils1.captureScreen(driver, "Claims_validation_of_Titles")));
		} catch (Exception e) {
			System.out.println("It is alread scroled up");
			test.log(LogStatus.PASS,
					test.addScreenCapture(FileUtils1.captureScreen(driver, "Claims_validation_of_Titles")));
		}

	}

}
