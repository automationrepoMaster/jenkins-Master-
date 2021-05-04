package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;


public class Niyati_Test_1373 extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	String Admin = "Roger Federer - Bella Jee";
	String Sponsor = "HSBC-Sponsor - Vincent John";
	String Switch_text = "Track Offsite Coverage";
	// String attribue_Txt = "ios-ui-select";
	String DBA_err_Msg_txt = "This field is required.";
	String DBA_Switch_Tip_Act_txt = "Activating this switch will cause DBA names to appear after Contractor Company Names on Reports and CIP COIs.";
	String DBA_Seperator = "DBA";

	@Test
	public void ViewCertificates() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		AddContractor_Pkg_MonthlyPayroll_Page.ProgrammeICon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Prrogramme Icon is clicked succesfully");
		wb.scrollToTop();
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.AdvancesearchbarIcon(driver).click();
		wb.selectByVisibleText(Admin, AddContractor_Pkg_MonthlyPayroll_Page.Select_Programme_Admin(driver));
		test.log(LogStatus.PASS, "Programme Admin is selected from DropDown");
		wb.selectByVisibleText(Sponsor, AddContractor_Pkg_MonthlyPayroll_Page.Select_Programme_SPonsor(driver));
		test.log(LogStatus.PASS, "Programme Sponsor  is selected from DropDown");
		AddContractor_Pkg_MonthlyPayroll_Page.searchBtnDownProgramme(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Search btn is clicked succesfully");
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit Icon is clicked succesfully");
		wb.SwitchtonewTab();
		Thread.sleep(2000);
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.Manage_CIP_Certificates_Switch);
		test.log(LogStatus.PASS, "Manage CIP certificates Switch is turned on");
		js.executeScript("window.scrollTo(0,400)");
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.ShowDBA_COI_Switch);
		test.log(LogStatus.PASS, "Show DBA Switch is turned ON");
		wb.isDisplayed(AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver));
		test.log(LogStatus.PASS, "Seperatot text is present and validated");
		wb.isDisplayed(AddContractor_Pkg_MonthlyPayroll_Page.DBA_Switch_TolTip(driver));
		test.log(LogStatus.PASS, "Tooltip is present and read the text");
		wb.mouseOverElement(AddContractor_Pkg_MonthlyPayroll_Page.DBA_Switch_TolTip(driver));
		test.log(LogStatus.PASS, "Moveover action is performed succcesfullyand text is displayed succesfully");
		wb.Compare(AddContractor_Pkg_MonthlyPayroll_Page.DBA_Switch_TolTip_txt(driver), DBA_Switch_Tip_Act_txt);
		test.log(LogStatus.PASS, "Comapring the text at tool tip succesfully");
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).clear();
		wb.Compare(AddContractor_Pkg_MonthlyPayroll_Page.DBA_feild_Error_txt(driver), DBA_err_Msg_txt);
		test.log(LogStatus.PASS,
				"Error msg is vlaidated succesfully and comapred act and Exp at DBA Switch succesfully");
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).sendKeys(DBA_Seperator);
		js.executeScript("window.scrollTo(0,200)");
		AddContractor_Pkg_MonthlyPayroll_Page.saveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Save and close btn is clicked");
		Thread.sleep(2000);
		wb.Switchtoparent();
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit Btn  btn is clicked");
		Thread.sleep(2000);
		wb.SwitchtonewTab();
		wb.TurnOFF_Switch(AddContractor_Pkg_MonthlyPayroll_Page.Manage_CIP_Certificates_Switch);
		test.log(LogStatus.PASS, "Manage CIP  switched is turned on and now it is turned off");
		js.executeScript("window.scrollTo(0,200)");
		wb.TurnOFF_Switch(AddContractor_Pkg_MonthlyPayroll_Page.ShowDBA_COI_Switch);
		test.log(LogStatus.PASS, "DBA switched is turned on and now it is turned off");
		wb.idDisplayed(AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver));
		js.executeScript("window.scrollTo(0,200)");
		AddContractor_Pkg_MonthlyPayroll_Page.saveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Save and close button is clicked succesfully");
		Thread.sleep(2000);
		wb.Switchtoparent();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "ViewCertificates")));

	}
}
