package RajaTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.AddContractor_Pkg_MonthlyPayroll_Page;

public class Niyati_Test_1498 extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();

	String programmeName = "Program Name-PN-1";
	String Admin = "Roger Federer - Bella Jee";
	String Sponsor = "HSBC-Sponsor - Vincent John";
	String Switch_text = "Track Offsite Coverage";
	String attribue_Txt = "ios-ui-select";
	String DBA_err_Msg_txt = "This field is required.";
	String DBA_Switch_Tip_Act_txt = "Activating this switch will cause DBA names to appear after Contractor Company Names on Reports and CIP COIs.";
	String Hierarcytext = "Click here to view the Key Performance Indicators(KPIs) ";
	// String CP_Contains_text = "Mark Boucher";
	String CP_Contains_text = "Roger Federer";
	String Cp_Contains_text_status = "Enrolled";
	String contracot_DBA = "Contractor DBA1234";
	String Contractorname = "Roger Federer - Roger Federer";
	String ActCinttext = CP_Contains_text + "DBAContractor D" + contracot_DBA;
	String Carriername = "Carrier Name-1234";
	String Policy_Eff_date = "02/01/2020";
	String policy_Exp_date = "02/01/2021";
	String EachOCCValue = "100,000";
	String DamageToRentedPremises = "100000";
	String MedExp = "100000";
	String perAdvinjry = "100000";
	String GenAggr = "100000";
	String prodcomOpAgg = "100000";
	String Insured = "Contractor ";
	String Certifcate_Holder = "Contractor ";
	String frame_Id = "ifrmPreview";
	String GL_Num = "GL_NUM_456789";
	String Excess_Umbrella_num = "UMbrella_GL_456789";
	String Filepath = "C:\\Users\\User\\Downloads\\mentalhealth-160301085212.pdf";

	@Test
	public void ReadPDFText_COI() throws Throwable {

		AddContractor_Pkg_MonthlyPayroll_Page.ProgrammeICon(driver).click();
		test.log(LogStatus.PASS, "Programme ICon is cicked succesfully");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.AdvancesearchbarIcon(driver).click();
		test.log(LogStatus.PASS, "Adv search ICon is cicked succesfully");
		wb.selectByVisibleText(Admin, AddContractor_Pkg_MonthlyPayroll_Page.Select_Programme_Admin(driver));
		test.log(LogStatus.PASS, "Programme Admin is selected from DropDown");
		wb.selectByVisibleText(Sponsor, AddContractor_Pkg_MonthlyPayroll_Page.Select_Programme_SPonsor(driver));
		test.log(LogStatus.PASS, "Programme Sponsor  is selected from DropDown");
		AddContractor_Pkg_MonthlyPayroll_Page.searchBtnDownProgramme(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Search btn is clicked succesfully after adv search filters");
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit btn is clicked ");
		wb.SwitchtonewTab();
		test.log(LogStatus.PASS, "Switched to new Tab");
		Thread.sleep(2000);
		wb.TurnON_Switch(AddContractor_Pkg_MonthlyPayroll_Page.Manage_CIP_Certificates_Switch);
		test.log(LogStatus.PASS, "Mange CIP switch is handled succesfully");
		System.out.println("CIP button is handled succesfully");
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.saveandCloseBtn(driver));
		test.log(LogStatus.PASS, "save and close btn is cliked succesfully");
		wb.Switchtoparent();
		test.log(LogStatus.PASS, "Switched to Parent Tab");
		AddContractor_Pkg_MonthlyPayroll_Page.Edit_btn(driver).click();
		test.log(LogStatus.PASS, "Edit btn is clicked again after switch to main tab");
		wb.SwitchtonewTab();
		test.log(LogStatus.PASS, "switch to new  tab 2nd time");
		Thread.sleep(2000);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.More_ICOn_Heading(driver));
		Thread.sleep(2000);
		wb.Find_Click(AddContractor_Pkg_MonthlyPayroll_Page.policy_Certificates(driver));
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "clicked on policy and certifcates");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Open_Polict_Btn(driver));
		test.log(LogStatus.PASS, "Clicked on Open policy btn");
		wb.SwitchtoChild2();
		test.log(LogStatus.PASS, "Moved to child window on Open policy btn");
		wb.getTitle();
		Thread.sleep(2000);
		wb.selectByVisibleText(Carriername, AddContractor_Pkg_MonthlyPayroll_Page.Carrier_DropDown(driver));
		test.log(LogStatus.PASS, "Selected carrier name");
		js.executeScript("window.scrollTo(0,100)");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.policy_Eff_date(driver), Policy_Eff_date);
		test.log(LogStatus.PASS, "Entered effective date  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.Policy_Exp_date(driver), policy_Exp_date);
		test.log(LogStatus.PASS, "Entered Exp date  on Open policy page");
		js.executeScript("window.scrollTo(0,200)");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.EachOccurance(driver), EachOCCValue);
		test.log(LogStatus.PASS, "Entered Each occurance value  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.DamaageToRentedPremeises(driver),
				DamageToRentedPremises);
		test.log(LogStatus.PASS, "Entered Damange value  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.MedExp(driver), MedExp);
		test.log(LogStatus.PASS, "Entered Mexp value  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.Personal_AdvInjur(driver), perAdvinjry);
		test.log(LogStatus.PASS, "Entered Personal AdvInjury value  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.GeneralAggregate(driver), GenAggr);
		test.log(LogStatus.PASS, "General Aggregate value  on Open policy page");
		wb.SenKeyskeys_TAB(AddContractor_Pkg_MonthlyPayroll_Page.Products_Comp_op(driver), prodcomOpAgg);
		test.log(LogStatus.PASS, "Entered prodcomOpAgg value  on Open policy page");
		js.executeScript("window.scrollTo(0,300)");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.saveandClose_Btn_policy(driver));
		test.log(LogStatus.PASS, "save and close btn is clicked succesfully");
		wb.Switchtoparent();
		test.log(LogStatus.PASS, "moved to second tab again");
		js.executeScript("window.scrollTo(0,500)");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.SetUpGneralCertificate(driver));
		test.log(LogStatus.PASS, "moved to setup and general certifcates ");
		// wb.click(AddContractor_Pkg_MonthlyPayroll_Page.SetUpGneralCertificate(driver));
		// AddContractor_Pkg_MonthlyPayroll_Page.SetUpGneralCertificate(driver).click();
		test.log(LogStatus.PASS, "moved to second tab again");
		test.log(LogStatus.PASS, "Certificates button is clicked");
		Thread.sleep(2000);
		wb.SwitchtoChild2();
		wb.getTitle();
		wb.selectByVisibleText(Insured, AddContractor_Pkg_MonthlyPayroll_Page.Select_Insured_String(driver));
		Thread.sleep(2000);
		wb.selectByVisibleText(Certifcate_Holder,
				AddContractor_Pkg_MonthlyPayroll_Page.Certificate_Holder_setupCertifc(driver));
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		wb.moveToElement(AddContractor_Pkg_MonthlyPayroll_Page.SaveandClose_InsuCert(driver));
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.SaveandClose_InsuCert(driver));
		Thread.sleep(3000);
		wb.Switchtoparent();
		wb.switchToFrameById(frame_Id);
		wb.mouseOverElement(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver));
		wb.CompareTextandClick(AddContractor_Pkg_MonthlyPayroll_Page.HierachyButton(driver), Hierarcytext,
				AddContractor_Pkg_MonthlyPayroll_Page.HierarchyBtn_txt_graph(driver));
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Programme_Frame(driver));
		Thread.sleep(4000);
		wb.CP_status_filters(AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_list_frame,
				AddContractor_Pkg_MonthlyPayroll_Page.Contrctr_Status_list_frame, CP_Contains_text,
				Cp_Contains_text_status);
		Thread.sleep(3000);
		// js.executeScript("window.scrollTo(0,0)");
		wb.scrollToTop();
		Thread.sleep(2000);
		wb.switchToFrameById(frame_Id);
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.Certifcates_frame(driver));
		System.out.println(driver.getWindowHandles());
		System.out.println("we are at certificates frame");
		Thread.sleep(2000);
		wb.SwitchtoChild4();
		// wb.SwitchtoChild2(driver);
		System.out.println(driver.getWindowHandle() + driver.getTitle());
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.AutoGenerateCetificate(driver));
		test.log(LogStatus.PASS, "Auto geenrate  certificates is clicked ");
		Thread.sleep(2000);
		wb.Alert_Click(AddContractor_Pkg_MonthlyPayroll_Page.Ok_Btn(driver));
		wb.switchToFrameByName(AddContractor_Pkg_MonthlyPayroll_Page.Frame_Viewcertciates);
		test.log(LogStatus.PASS, "view certificates button  is clicked ");
		wb.type(AddContractor_Pkg_MonthlyPayroll_Page.GL_Policy_Number(driver), "RAUT_GL_14490");
		test.log(LogStatus.PASS, "view certificates button  is clicked ");
		wb.type(AddContractor_Pkg_MonthlyPayroll_Page.Excess_Umbrella(driver), "RAUT_EXCESS_14490");
		test.log(LogStatus.PASS, "view certificates button  is clicked ");
		wb.click(AddContractor_Pkg_MonthlyPayroll_Page.SavenadCloseBtn_GLpolicy(driver));
		Thread.sleep(2000);
		wb.getText(AddContractor_Pkg_MonthlyPayroll_Page.View_Certificates(driver));
		WebElement body = driver.findElement(By.xpath("//tbody"));
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//tbody/tr/td"));
		List<WebElement> view = body.findElements(By.xpath("//i[@class='fa fa-eye']"));
		for (int i = 0; i < list.size(); i++) {
			String roww = list.get(i).getText();
			String vieww = list.get(i).getText();
			String coll = list.get(i).getText();
			wb.getText(AddContractor_Pkg_MonthlyPayroll_Page.Auto_gen_Table_Table(driver));
			if (roww.contains("RAUT_GL_14490") && roww.contains("RAUT_EXCESS_14490")) {
				if (vieww.contains("COI")) {
					list.get(i).getText();
					System.out.println(roww);
					System.out.println("we are here");
					view.get(i).click();
					break;
				}
			}
		}
//		wb.SwitchtoChild5(driver);
//		String pdfurl = driver.getCurrentUrl(driver);
////		String windowtitle = driver.getTitle(driver);
////		System.out.println(windowtitle);
////		String url = "https://beta.wrapportal.com/Content/Certificates/";
////		String pdf = url + windowtitle;
////		System.out.println(pdf);
//		System.out.println(
//				driver.getWindowHandles(driver) + driver.getCurrentUrl(driver) + driver.getTitle(driver) + driver.getWindowHandle());
//		System.out.println("we are here at PDF ");
//		System.out.println(driver.getTitle(driver));
//		//wb.PDFDataRead(pdfurl, "Roger Federer DBA Contractor D", "DBA1234");
//		wb.PDF(Filepath);
		wb.Switchtoparent();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "1498")));

	}
}
