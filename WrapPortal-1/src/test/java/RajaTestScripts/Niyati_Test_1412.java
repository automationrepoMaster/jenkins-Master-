package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;


public class Niyati_Test_1412 extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	String programmeName = "Program Name-PN-1";
	String Admin = "Roger Federer - Bella Jee";
	String Sponsor = "HSBC-Sponsor - Vincent John";
	String Switch_text = "Track Offsite Coverage";
	// String attribue_Txt = "ios-ui-select";
	String DBA_err_Msg_txt = "This field is required.";
	String DBA_Switch_Tip_Act_txt = "Activating this switch will cause DBA names to appear after Contractor Company Names on Reports and CIP COIs.";
	String Hierarcytext = "Click here to view the Key Performance Indicators(KPIs) ";
	String CP_Contains_text = "Roger Federer";
	String Cp_Contains_text_status = "Enrolled";
	String contracot_DBA = "Contractor DBA1234";
	String Contractorname = "Roger Federer - Roger Federer";
	String ActCinttext = CP_Contains_text + "DBAContractor D" + contracot_DBA;

	@Test
	public void DBAName_Superintendent_Report() throws Throwable {
		AddContractor_Pkg_MonthlyPayroll_Page.ProgrammeICon(driver).click();
		test.log(LogStatus.PASS, "Programme ICon is clicked ");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
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
		wb.switchToFrameById("ifrmPreview");
		test.log(LogStatus.PASS, "Switched to frame at Listing panel");
		wb.mouseOverElement(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver));
		wb.CompareTextandClick(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver), Hierarcytext,
				AddContractor_Pkg_MonthlyPayroll_Page.HierarchyBtn_txt_graph(driver));
		test.log(LogStatus.PASS, "Programme Admin is selected from DropDown");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Programme_Frame(driver));
		test.log(LogStatus.PASS, "Programme frame  is selected from DropDown");
		Thread.sleep(2000);
		wb.CP_status_filters(AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_list_frame,AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_Status_list_frame,CP_Contains_text, Cp_Contains_text_status);
		test.log(LogStatus.PASS, "Respective COntractor Packagre is selected");
		wb.SwitchtonewTab();
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,50)");
		Thread.sleep(2000);
		wb.switchToFrameById("ifrmPreview");
		test.log(LogStatus.PASS, "Swictehd to frame at Enrollment");
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Insurance_enrollment(driver));
		test.log(LogStatus.PASS, "Clciked on Insurenacne enrolment pagee");
		System.out.println(driver.getWindowHandles());
		wb.SwitchtoChild2();
		System.out.println(driver.getWindowHandles());
		js.executeScript("window.scrollTo(0,0)");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Insurance_Heading(driver));
		Thread.sleep(2000);
		wb.selectByVisibleText(contracot_DBA, AddContractor_Pkg_MonthlyPayroll_Page.SelctDBA_DropDown(driver));
		System.out.println(contracot_DBA);
		test.log(LogStatus.PASS, "contracot_DBA is selected from DropDown");
		//js.executeScript("window.scrollTo(0,1100)");
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Close_btn(driver));
		test.log(LogStatus.PASS, "cclose button is clciked succesfully");
		Thread.sleep(2000);
		wb.Switchtoparent();
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit button is clike succesfully");
		wb.SwitchtonewTab();
		Thread.sleep(2000);
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.Manage_CIP_Certificates_Switch);
		test.log(LogStatus.PASS, "Turned on the swicth at CIP ");
		System.out.println(
				"CIP___________________________________________________________________________________________________");
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		System.out.println("clicked on tool tip");
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.ShowDBA_COI_Switch);
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).clear();
		wb.Compare(AddContractor_Pkg_MonthlyPayroll_Page.DBA_feild_Error_txt(driver), DBA_err_Msg_txt);
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).sendKeys("DBA_" + contracot_DBA);
		js.executeScript("window.scrollTo(0,200)");
		AddContractor_Pkg_MonthlyPayroll_Page.saveandCloseBtn(driver).click();
		Thread.sleep(2000);
		wb.Switchtoparent();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500)");
		AddContractor_Pkg_MonthlyPayroll_Page.Reports_Icon(driver).click();
		test.log(LogStatus.PASS, "Reports Icon is clicked succesfully");
		Thread.sleep(4000);
		wb.selectByVisibleText(programmeName, AddContractor_Pkg_MonthlyPayroll_Page.SelectProgramme_Report(driver));
		test.log(LogStatus.PASS, "Selected the programe name : " + programmeName + "from droppdown");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500)");
		// ReUsable_Actions.moveToElement(driver,
		// Niyati_TestPage.Superindent_programme_Report());
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Superindent_programme_Report(driver));
		test.log(LogStatus.PASS, "Superindent report is selected succesfully");
		System.out.println("superindent");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandles());
		wb.SwitchtonewTab();
		wb.Filter(AddContractor_Pkg_MonthlyPayroll_Page.Programme_LIst_Report, programmeName);
		wb.selectByVisibleText(Contractorname, AddContractor_Pkg_MonthlyPayroll_Page.Contractor_list_Report(driver));
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Build_Report_Btn(driver));
		String head = AddContractor_Pkg_MonthlyPayroll_Page.Report_Heading(driver).getText();
		System.out.println(head);
		test.log(LogStatus.PASS, head);
		String progHead = AddContractor_Pkg_MonthlyPayroll_Page.program_Heading_report(driver).getText();
		System.out.println(progHead);
		test.log(LogStatus.PASS, progHead);
		String text = AddContractor_Pkg_MonthlyPayroll_Page.Contract_Name_text(driver).getText();
		wb.Compare(AddContractor_Pkg_MonthlyPayroll_Page.Contract_Name_text(driver), ActCinttext);
		test.log(LogStatus.PASS, text);
		System.out.println(text);
		wb.Switchtoparent();
        test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "1412")));
	}
}
