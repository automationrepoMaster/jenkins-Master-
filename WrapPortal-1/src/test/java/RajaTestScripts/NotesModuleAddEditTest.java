package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ObjectRepository.Hompage_SubModules_Page;

public class NotesModuleAddEditTest extends BaseClass{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();


	String NoteTitle = "Raja";
	String NotesDescription = "Raja Note Description";
	String TitleErrorMsg = "This field is required.";

	@Test(priority = 1)
	public void AddNotes() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,200)");
		wb.scrollByVisibilityOfElement(Hompage_SubModules_Page.Notes_Icon(driver));
		Thread.sleep(2000);
		Hompage_SubModules_Page.Notes_Icon(driver).click();
		Thread.sleep(2000);
		System.out.println("Notes Icon is cliked succesfully");
		test.log(LogStatus.PASS, "Notes ICon is clicked  succesfully");
		wb.scrollToTop();
		Thread.sleep(2000);
		Hompage_SubModules_Page.Plus_btn(driver).click();
		System.out.println("plus button is cliked succesfully");
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		System.out.println("Moved to second window");
		test.log(LogStatus.PASS, "Moved to second window  succesfully");
		Hompage_SubModules_Page.Notes_Module_Note_Title_feild(driver).sendKeys(NoteTitle);
		System.out.println("title is entered successfully");
		test.log(LogStatus.PASS, "Title  is entered succesfully");
		Thread.sleep(3000);
		driver.switchTo().frame(Hompage_SubModules_Page.Notes_Module_Note_Desctiption_frame(driver));
		System.out.println("switched to frame at Description feild");
		test.log(LogStatus.PASS, "TSwitched ton frame at Description feild succesfully");
		Hompage_SubModules_Page.Notes_Module_Note_Desctiption(driver).sendKeys(NotesDescription);
		driver.switchTo().defaultContent();
		System.out.println("switched back from frame to window");
		test.log(com.relevantcodes.extentreports.LogStatus.PASS, "Swicthed back to window is done succesfully");
		Thread.sleep(3000);
		Hompage_SubModules_Page.Notes_Module_Saveandclose_Btn(driver).click();
		System.out.println("save and close btn is clicked at Add note module ");
		test.log(LogStatus.PASS, "Save and close button is clicked  succesfully at Add note module");
		wb.Switchtoparent();
		System.out.println("Switched to parent window");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Switched to parent window succesfully");
		System.out.println("flag button is clicked succesfully");
		test.log(LogStatus.PASS, "Falg button is clicked succesfully");
		driver.switchTo().frame(Hompage_SubModules_Page.frame_btn(driver));
		System.out.println("Switched to frame");
		test.log(LogStatus.PASS, "Switched to frame at Notes module to get text succesfully");
		System.out.println(Hompage_SubModules_Page.Createbytext(driver).getText());
		System.out.println(Hompage_SubModules_Page.ModifiedByText(driver).getText());
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "AddNotes")));

	}

	@Test(priority = 2)
	public void EditNotes() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			wb.scrollToTop();
			// Hompage_SubModules_Page.NotesList().click();
			wb.ListOflist(Hompage_SubModules_Page.SelectDynamicNotes(driver), NoteTitle);
			Thread.sleep(2000);
			System.out.println("we are in try");
		} catch (Throwable e) {
			wb.ListOflist(Hompage_SubModules_Page.SelectDynamicNotes(driver), NoteTitle);
			Thread.sleep(2000);
			System.out.println("clicked here");
		}
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Search notes date  entered succesfully to search the notes ");
		Thread.sleep(2000);
		wb.scrollToTop();
		Hompage_SubModules_Page.Edit_btn(driver).click();
		Thread.sleep(4000);
		wb.SwitchtoChild1();
		System.out.println("Moved to second window");
		test.log(LogStatus.PASS, "Moved to second window is succesfully");
		Hompage_SubModules_Page.Notes_Module_Note_Title_feild(driver).click();
		System.out.println("title is entered successfully");
		test.log(LogStatus.PASS, "title is entered succesfully");
		Hompage_SubModules_Page.Notes_Module_Note_Title_feild(driver).clear();
		Thread.sleep(3000);
		wb.Compare(Hompage_SubModules_Page.Notes_Module_Note_Title_ErrorMsg(driver), TitleErrorMsg);
		Thread.sleep(3000);
		Hompage_SubModules_Page.Notes_Module_Note_Title_feild(driver).sendKeys(NoteTitle);
		test.log(LogStatus.PASS, "Notes title is entered succesfully");
		Hompage_SubModules_Page.Notes_Module_Saveandclose_Btn(driver).click();
		wb.Switchtoparent();
		System.out.println("moved to parent window");
		test.log(LogStatus.PASS, "Moved to parent window succesfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "EditNotes")));

	}

	@Test(priority = 3)
	public void Remove_Notes() throws Throwable {

		try {
			wb.Switchtoparent();
			wb.ListOflist(Hompage_SubModules_Page.SelectDynamicNotes(driver), NoteTitle);
			Thread.sleep(4000);
		} catch (Exception e) {
			wb.ListOflist(Hompage_SubModules_Page.SelectDynamicNotes(driver), NoteTitle);
			Thread.sleep(4000);
		}
		Thread.sleep(2000);
		Hompage_SubModules_Page.Delet_btn(driver).click();
		Thread.sleep(2000);
		System.out.println("Delete button is clicked successfully");
		test.log(LogStatus.PASS, "Delete button  is Clicked  succesfully");
		wb.isAlertPresent();
		Thread.sleep(2000);
		wb.Alert();
		Thread.sleep(2000);
		wb.Alert();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Remove Notes")));

	}

}
