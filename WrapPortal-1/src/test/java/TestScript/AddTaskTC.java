package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelLibraray_Hashmap;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.Hompage_SubModules_Page;

public class AddTaskTC extends BaseClass{
	

	WebDriverCommonLib wb = new WebDriverCommonLib();
	String statuss = "In Progress";
	String priority = "Normal";
	String Excelpath = "D:\\NOURTEK\\Nourtek\\Configuration\\NourTek-Excel_HASHMAP.xlsx";
	String SheetName = "Nourtek";
	ExcelLibraray_Hashmap excel = new ExcelLibraray_Hashmap();
	String Subject =  RandomClass.SubjectName(); // "Blindspot123";
	String Assignedto = "Patterson Blindspot";
	String RelatedTo = "Patterson Blindspot";
	String taskBeginDate = "01/01/2021";
	String taskEndDate = "01/01/2025";
	String sorting="Task Subject";

	// Edit
	String Admin_name = "Roger Federer - Patterson Blindspot";
	
	String selectSorting = "Task Subject";
	
	
	@Test
	public void Add_Task() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Hompage_SubModules_Page.Tasks_Icon(driver));
		js.executeScript("arguments[0].click();", Hompage_SubModules_Page.Tasks_Icon(driver));
		//Hompage_SubModules_Page.Tasks_Icon(driver).click();
		test.log(LogStatus.INFO, "Task Icon is Clicked Succesfully");
		System.out.println("Task Icon is clcked succesfully");
		Thread.sleep(4000);
		Hompage_SubModules_Page.PlusBtn(driver).click();
		Thread.sleep(5000);
		System.out.println("Plus button is clicked succesfully");
		test.log(LogStatus.PASS, "Plus button is clicked succesfully");
		wb.SwitchtoChild1();
		wb.scrollToTop();
		System.out.println("Moved to second window");
		test.log(LogStatus.PASS, "Moved to second window");
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).click();
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).sendKeys(Subject);
		System.out.println("Subject at add task is entered suvvesfully");
		test.log(LogStatus.PASS, Subject + "Subject at add task is entered suvvesfully");
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Assignedto);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " entered succesfully data is " + Assignedto);
		Thread.sleep(1000);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.TAB);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(RelatedTo);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Patterson is entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_BeginDate_feild(driver).sendKeys(taskBeginDate);
		Hompage_SubModules_Page.TaskModule_AddTask_BeginDate_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Task begin date  is entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_EndDate_feild(driver).sendKeys(taskEndDate);
		Hompage_SubModules_Page.TaskModule_AddTask_EndDate_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Task End  date  is entered again succesfully");
		wb.selectByVisibleText(statuss,Hompage_SubModules_Page.TaskModule_AddTask_SelectaStatus_Dropdown(driver));
		test.log(LogStatus.PASS, "Selct LogStatus dropdown is selected succesfully");
		wb.selectByVisibleText(priority,Hompage_SubModules_Page.TaskModule_AddTask_SelectPriority_DropDown(driver));
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		driver.switchTo().frame(Hompage_SubModules_Page.TaskModule_AddTask_FrameBtn(driver));
		Thread.sleep(3000);
		System.out.println("Swictehd to frame ");
		test.log(LogStatus.PASS, "Switched to frame is done  succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_Decriptionfeild(driver).sendKeys("Description to add it");
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollTo(0,300)");
		Hompage_SubModules_Page.TaskModule_AddTask_SendEmailNotificationofDueDate_feild(driver).click();
		Thread.sleep(2000);
		System.out.println("Selct it mark as confirmed ");
		test.log(LogStatus.PASS, "Selct it mark as confirmed");
		Hompage_SubModules_Page.TaskModule_AddTask_SaveandcontinueBtn(driver).click();
		System.out.println("save and continue buttton is cliked at Add module page ");
		test.log(LogStatus.PASS, "save and continue buttton is cliked at Add module page");
		Thread.sleep(4000);
		Hompage_SubModules_Page.TaskModule_AddTask_Closebtn(driver).click();
		System.out.println("Close button is clicked succesfully");
		test.log(LogStatus.PASS, "Close button is clicked succesfully");
		wb.Switchtoparent();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "AddTaskmodule")));


		
		
		
		
		
		
		
	}

}
