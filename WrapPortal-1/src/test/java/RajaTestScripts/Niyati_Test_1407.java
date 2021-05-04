package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;

public class Niyati_Test_1407 extends BaseClass {
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
	String pdfurl = "https://beta.wrapportal.com/images/Report/Superintendent_Report/Superintendent_Report_1603424843.pdf";

	@Test
	public void Testcase_1412() throws Throwable {
		AddContractor_Pkg_MonthlyPayroll_Page.ProgrammeICon(driver).click();
		test.log(LogStatus.PASS, "priogramme Icon is cliked");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.AdvancesearchbarIcon(driver).click();
		test.log(LogStatus.PASS, "Advance search  Icon is cliked");
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
		wb.mouseOverElement(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver));
		test.log(LogStatus.PASS, "Mouse Hocern Icon is cliked");
		wb.CompareTextandClick(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver), Hierarcytext,
				AddContractor_Pkg_MonthlyPayroll_Page.HierarchyBtn_txt_graph(driver));
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Programme_Frame(driver));
		test.log(LogStatus.PASS, "Moved to frame at programme  Icon ");
		Thread.sleep(2000);
		wb.CP_status_filters(AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_list_frame,AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_Status_list_frame,CP_Contains_text, Cp_Contains_text_status);
		test.log(LogStatus.PASS, "Contractor package filters are done");
		wb.SwitchtonewTab();
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,50)");
		Thread.sleep(2000);
		wb.switchToFrameById("ifrmPreview");
		test.log(LogStatus.PASS, "Moved to frame at CP level enrollment");
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Insurance_enrollment(driver));
		test.log(LogStatus.PASS, "Insurance Enrollment");
		System.out.println(driver.getWindowHandles());
		wb.SwitchtoChild2();
		System.out.println(driver.getWindowHandles());
		js.executeScript("window.scrollTo(0,0)");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Insurance_Heading(driver));
		test.log(LogStatus.PASS, "Insurance tab is clciekd after openeing enrollment page cliked");
		Thread.sleep(2000);
		wb.selectByVisibleText(contracot_DBA, AddContractor_Pkg_MonthlyPayroll_Page.SelctDBA_DropDown(driver));
		System.out.println(contracot_DBA);
		test.log(LogStatus.PASS, "DBA contractor is selected ");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Close_btn(driver));
		test.log(LogStatus.PASS, "Close button  is cliked at enrollment page");
		Thread.sleep(2000);
		wb.Switchtoparent();
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit button  is cliked");
		wb.SwitchtonewTab();
		Thread.sleep(2000);
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.Manage_CIP_Certificates_Switch);
		test.log(LogStatus.PASS, "manage CIP button is cclicked turend on");
		System.out.println(
				"CIP___________________________________________________________________________________________________");
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		System.out.println("clicked on tool tip");
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.ShowDBA_COI_Switch);
		test.log(LogStatus.PASS, "DBA switch is turned on ");
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).clear();
		wb.Compare(AddContractor_Pkg_MonthlyPayroll_Page.DBA_feild_Error_txt(driver), DBA_err_Msg_txt);
		test.log(LogStatus.PASS, "DBA switch is turned on  and read the error message");
		AddContractor_Pkg_MonthlyPayroll_Page.SeperatorText_DBA_Switch(driver).sendKeys("DBA_" + contracot_DBA);
		test.log(LogStatus.PASS, "DBA switch is turned on and entered the DBA text at DBA seperator feild ");
		js.executeScript("window.scrollTo(0,200)");
		AddContractor_Pkg_MonthlyPayroll_Page.saveandCloseBtn(driver).click();
		test.log(LogStatus.PASS, "save and close button is clicked ");
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
		test.log(LogStatus.PASS, "Programme list report Icon id filtered");
		wb.selectByVisibleText(Contractorname, AddContractor_Pkg_MonthlyPayroll_Page.Contractor_list_Report(driver));
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Contarctor list ar report section is selected");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Build_Report_Btn(driver));
		test.log(LogStatus.PASS, "Build reporty button is  clicked succesfully");
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
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.PDF_Icon_report(driver));
		Thread.sleep(2000);
		driver.navigate().to(pdfurl);
		wb.PDFDataRead(pdfurl,Contractorname, contracot_DBA);
		Thread.sleep(2000);
		wb.Switchtoparent();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "1407")));

	}

}
