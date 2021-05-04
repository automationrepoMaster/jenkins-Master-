package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class AddMonthlyPayroll_TC extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String ProgramName = "Automation Program dont touch";
	public String contractorName = "Alex Comp2273"; // "Alex Comp3524";
	public String projectName = "Test 132 ON"; // Sony Projects3524";
	public String enrollmentType = "WC & GL Enrollment";
	public String status = "Missing Payroll";// "Assigned";

	@Test
	public void testAdminMonthlyPayroll() throws Throwable {

		/*
		 * String ProjectName = "Test 132 ON"; String TradeNo = "465"; String TradeName
		 * = "Trade for test"; String ContractorName = "Alex Comp1903"; String
		 * EnrollmentType = "WC & GL Enrollment";
		 */

		WebDriverWait webwait = new WebDriverWait(driver, 60);
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Home Icon");
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.PASS, "Clicked On Contracotr Package Icon");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		int x = 1;
		do {
			try {
				ContractorPackageModule.advanceSearchIcon(driver).click();
				test.log(LogStatus.PASS, "Clicked On Advance Search Icon");
				x = 2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x == 1);

		Thread.sleep(3000);
		do {
			try {
				wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProgram(driver), ProgramName);
				test.log(LogStatus.PASS, ProgramName + " Respective program Selected Successfully");
				x = 2;
			} catch (Throwable e) {
				System.out.println(e);
				js.executeScript("window.scrollBy(0,-350)", "");
				Thread.sleep(1000);
			}
		} while (x == 1);

		try {
			wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProject(driver), projectName);
			test.log(LogStatus.PASS, projectName + " Respective Project Selected Successfully");
			x = 2;
		} catch (Throwable e) {
			System.out.println(e);
			js.executeScript("window.scrollBy(0,-350)", "");
			Thread.sleep(1000);
		}

		Thread.sleep(1500);
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectEnrollmenttype(driver), enrollmentType);
		test.log(LogStatus.PASS, enrollmentType + " Enrollment Type Selected Successfully");
		Thread.sleep(1500);

		ContractorPackageModule.advanceSearchSelectContractorStatus(driver).click();
		Thread.sleep(2000);
		ContractorPackageModule.advanceSearchSelect_Single_StatusFromDropdown(driver, status).click();
		test.log(LogStatus.PASS, status + " Status Selected Successfully");
		Thread.sleep(1500);

		/*
		 * HomePage.controlMenuContractorPackage(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Contractor Package Icon");
		 * Thread.sleep(10000); JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,-350)", ""); do { try {
		 * ContractorPackageModule.searchEditBox(driver).clear();
		 * ContractorPackageModule.searchEditBox(driver).sendKeys(ContractorName
		 * );//Sony 1 test.log(LogStatus.PASS,
		 * ContractorName+"Searched for respective Contractor Package");
		 * ContractorPackageModule.searchIcon(driver).click(); test.log(LogStatus.INFO,
		 * "Clicked On Search Icon"); x=2; } catch (Throwable e) {
		 * System.out.println(e); js.executeScript("window.scrollBy(0,-350)", ""); } }
		 * while (x==1);
		 */

		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Advance Search Button");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-350)", "");
		driver.switchTo().frame(0);
		ContractorPackageModule.MonthlyPayrollPagePriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Monthly Payroll Page");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(7000);

		wb.selectSingleValueByIndex(AddContractor_Pkg_MonthlyPayroll_Page.selectPayrollMonthYear(driver), 1);
		test.log(LogStatus.PASS, " Payroll Month Selected Successfully");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(3000);
		// fillPayroll();
		AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver).sendKeys("1000");
		AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSelfCVField(driver).sendKeys("1000");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",
				AddContractor_Pkg_MonthlyPayroll_Page.btnSaveAndClose(driver));
		js.executeScript("arguments[0].click();", AddContractor_Pkg_MonthlyPayroll_Page.btnSaveAndClose(driver));

		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("parentID"));

		test.log(LogStatus.INFO, " Monthly Payroll Added Successfully");
	}

	public void fillPayroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();",AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver));
		wb.waitForElemnet(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver));
		Thread.sleep(1500);
		// js.executeScript("window.scrollBy(0,150)");
		Actions act = new Actions(driver);
		act.moveToElement(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver)).doubleClick().build()
				.perform();
		AddContractor_Pkg_MonthlyPayroll_Page.addPayrollCVField(driver).sendKeys("1000");
		test.log(LogStatus.PASS, " Payroll Contract Value Added Successfully");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,50)");
		act.moveToElement(AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSelfCVField(driver)).doubleClick().build()
				.perform();
		AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSelfCVField(driver).sendKeys("1000");
		test.log(LogStatus.PASS, " Payroll Self Performed Contract Value Added Successfully");

		List<WebElement> payroll = AddContractor_Pkg_MonthlyPayroll_Page.addPayrollForALLWorkClass(driver);
		for (WebElement b : payroll) {
			act.moveToElement(b).doubleClick().build().perform();
			Thread.sleep(1500);
			b.sendKeys("100");
			js.executeScript("window.scrollBy(0,10)");
			test.log(LogStatus.PASS, " Payroll and hours added Successfully");
		}
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);

		AddContractor_Pkg_MonthlyPayroll_Page.checkBoxMarkAsConfirmed(driver).click();
		test.log(LogStatus.PASS, " Clicked on Mark As Confirmed Radio Button");

		js.executeScript("window.scrollBy(0,200)");
		try {
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollNextMonthBtn(driver).click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, " Clicked on Continue Next Month Payroll Button");
			js.executeScript("window.scrollBy(0,300)");
			fillPayroll();

		} catch (Throwable e) {

			System.out.println(e);
			AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSaveBtn(driver).click();
			test.log(LogStatus.PASS, " Clicked on Payroll Save Button");
			Thread.sleep(5000);

		}

		/*
		 * else { AddContractor_Pkg_MonthlyPayroll_Page.addPayrollSaveBtn(driver).click
		 * (); test.log(LogStatus.PASS, " Clicked on Payroll Save Button");
		 * Thread.sleep(5000); }
		 */
	}

	@Test(enabled = false)
	public void testMonthlyPayroll() throws InterruptedException {
		// throw new SkipException("Testing skip");

		HomePage.controlMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contractor Package Icon");
		ContractorPackageModule.searchEditBox(driver).sendKeys("alex contractor comp9905");// Sony
																							// 1
		test.log(LogStatus.PASS, "Searched for respective Contractor Package");
		ContractorPackageModule.searchIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Search Icon");
		Thread.sleep(5000);

		driver.switchTo().frame(0);
		ContractorPackageModule.MonthlyPayrollPagePriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Monthly Payroll Page");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(8000);
		//
		WebElement we = AddContractor_Pkg_MonthlyPayroll_Page.selectPayrollMonthYear(driver);
		Select sel = new Select(we);
		List<WebElement> lst = sel.getOptions();
		System.out.println(lst.size());
		int temp = 0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i <= lst.size(); i++) {
			if (lst.get(i).equals(lst.get(1)))// select moth from drop down only
												// first time
			{
				lst.get(i).click();
				test.log(LogStatus.PASS, " First Month Selected From Drop Down");
			}
			Thread.sleep(2000);
			List<WebElement> emptyField = AddContractor_Pkg_MonthlyPayroll_Page
					.enterAllHoursAndMonthlyPayrollValue(driver);
			System.out.println(emptyField.size());

			js.executeScript("window.scrollBy(0,300)", "");// Scroll down
			// js.executeScript("arguments[0].scrollIntoView();",emptyField);
			for (int j = 0; j <= emptyField.size() - 1; j++) {
				emptyField.get(j).sendKeys("100");
				if (emptyField.get(j).equals(emptyField.get(0))) {
					test.log(LogStatus.PASS, " Hours Entered Successfully");
				} else {
					test.log(LogStatus.PASS, " Payroll Entered Successfully");
				}
			}
			if (lst.get(i).equals(lst.get(3)))// when there is last last payroll
												// then break the loop and click
												// on save and close button
			{
				System.out.println("enter in to if block");
				temp = 1;
				break;
			}

			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_MonthlyPayroll_Page.checkBoxMarkAsConfirmed(driver));
			test.log(LogStatus.INFO, " Marked as Confirmed Check Box Selected");
			js.executeScript("arguments[0].click();", AddContractor_Pkg_MonthlyPayroll_Page.btnSave(driver));
			test.log(LogStatus.INFO, " Clicked On Save Button");
			Thread.sleep(4000);
			js.executeScript("arguments[0].click();",
					AddContractor_Pkg_MonthlyPayroll_Page.btnContinueForNextMonth(driver));
			test.log(LogStatus.INFO, " Clicked On Continue to Next Month Button");
			test.log(LogStatus.INFO, " Monthly Payroll Added Successfully");
			Thread.sleep(3000);
		}

		if (temp == 1) {
			js.executeScript("arguments[0].click();", AddContractor_Pkg_MonthlyPayroll_Page.btnSaveAndClose(driver));
			test.log(LogStatus.INFO, " Monthly Payroll Added Successfully");
			test.log(LogStatus.INFO, " Clicked On Save and Close Button");

		}
		Thread.sleep(5000);
		driver.switchTo().window(wb.map.get("parentID"));
	}

}
