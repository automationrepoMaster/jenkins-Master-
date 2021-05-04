package RajaTestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelLibraray_Hashmap;
import GenericLibrary.FileUtils1;
import ObjectRepository.Hompage_SubModules_Page;


public class Task_Add_Test extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	String statuss = "In Progress";
	String priority = "Normal";
	String Excelpath = "D:\\NOURTEK\\Nourtek\\Configuration\\NourTek-Excel_HASHMAP.xlsx";
	String SheetName = "Nourtek";
	ExcelLibraray_Hashmap excel = new ExcelLibraray_Hashmap();
	String Subject = "Blindspot123";
	String Assignedto = "Patterson Blindspot";
	String RelatedTo = "Patterson Blindspot";
	String taskBeginDate = "01/01/2020";
	String taskEndDate = "01/01/2025";
	String sorting="Task Subject";

	// Edit
	String Admin_name = "Roger Federer - Patterson Blindspot";
	
	String selectSorting = "Task Subject";

	@Test(priority = 1)
	public void AddTaskmodule() throws Throwable {
        excel.setExcelFile(Excelpath, SheetName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,300)");
		Hompage_SubModules_Page.Tasks_Icon(driver).click();
		test.log(LogStatus.INFO, "Task Icon is Clicked Succesfully");
		System.out.println("Task Icon is clcked succesfully");
		test.log(LogStatus.PASS, "Task Icon is clcked succesfully");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(4000);
		System.out.println("Scrolled up to the Top");
		test.log(LogStatus.PASS, "Scrolled to the top");
		Hompage_SubModules_Page.PlusBtn(driver).click();
		Thread.sleep(10000);
		System.out.println("Plus button is clicked succesfully");
		test.log(LogStatus.PASS, "Plus button is clicked succesfully");
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		System.out.println("Moved to second window");
		test.log(LogStatus.PASS, "Moved to second window");
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).click();
		System.out.println(excel.getCellData("USER", 1));
		// Hompage_SubModules_Page.TaskModule_AddTask_subject_feild().sendKeys(ExcelLibraray_Hashmap.getCellData("USER",
		// 1));
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).sendKeys(Subject);
		test.log(LogStatus.PASS, "the Assigned name is " + excel.getCellData("USER", 1));
		System.out.println("Subject at add task is entered suvvesfully");
		test.log(LogStatus.PASS, "Subject at add task is entered suvvesfully");
		// Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild().sendKeys(ExcelLibraray_Hashmap.getCellData("Data",
		// 2));
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Assignedto);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " entered succesfully data is " + excel.getCellData("Data", 3));
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(RelatedTo);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Patterson is entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.TAB);
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

	@Test(priority = 2)
	public void EditTask() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		System.out.println("Scrolled up to the Top");
		test.log(LogStatus.PASS, "Scrolled up to the Top");
		Thread.sleep(3000);
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn(driver).click();
		Thread.sleep(3000);
		System.out.println("Advance search button is clicked succesfully");
		test.log(LogStatus.PASS, "Advance search button is clicked succesfully");
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_BenginDate_Feild(driver).click();
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_BenginDate_Feild(driver).sendKeys(taskBeginDate);
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_BenginDate_Feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_EndDate_feild(driver).click();
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_EndDate_feild(driver).clear();
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_EndDate_feild(driver).sendKeys(taskEndDate);
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_EndDate_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		wb.selectByVisibleText(Admin_name, Hompage_SubModules_Page.TaskModule_AdvsearchBtn_SelectAdmin(driver));
		Thread.sleep(1000);
		System.out.println("Admin is selcted from drop down succesfully");
		test.log(LogStatus.PASS, "Admin is selcted from drop down succesfully");
		wb.selectByVisibleText(statuss, Hompage_SubModules_Page.TaskModule_AdvsearchBtn_SelectStatus(driver));
		Thread.sleep(2000);
		System.out.println("LogStatuss  is selcted from drop down succesfully");
		test.log(LogStatus.PASS, "Statuss is selcted from drop down succesfully");
		wb.selectByVisibleText(sorting, Hompage_SubModules_Page.TTaskModule_AdvsearchBtn_SelectSorting(driver));
		Thread.sleep(2000);
		System.out.println("Sorting   is selcted from drop down succesfully");
		test.log(LogStatus.PASS, "sorting  is selcted from drop down succesfully");
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AdvsearchBtn_SearchBtnDown(driver).click();
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		wb.ListOflist(Hompage_SubModules_Page.DynamicTaskList(driver), Subject);
		Thread.sleep(2000);
		Hompage_SubModules_Page.EditBtn(driver).click();
		Thread.sleep(10000);
		System.out.println("Edit  button is clicked succesfully");
		test.log(LogStatus.PASS, "Edit button is clicked  succesfully");
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		System.out.println("Moved to second window");
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).click();
		Thread.sleep(3000);
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).clear();
		Thread.sleep(2000);
		WebElement Subject_feildError = Hompage_SubModules_Page.TaskModule_AddTask_Subject_ErrorMsg(driver);
		String Act_Subject_feildError = Subject_feildError.getText();
		String Exp_Subject_feildError = "This field is required.";
		try {
			if (Act_Subject_feildError.equalsIgnoreCase(Exp_Subject_feildError)) {
				// System.out.println("Actual Error msg and Exp Error msg at Subject feild are
				// macthing");
				test.log(LogStatus.PASS, "Actual and Exp msgs at subject feild are matching");

			} else {
				// System.out.println("No such error found");
				test.log(LogStatus.FAIL, "No Such alert present");
			}
		} catch (Exception e) {
			// System.out.println("didnt went into error feild try block");
			test.log(LogStatus.FAIL, "We are at catch block for Subject feild Error msg");

		}
		Hompage_SubModules_Page.TaskModule_AddTask_subject_feild(driver).sendKeys(Subject);
		System.out.println("Subject at add task is entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.BACK_SPACE);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_SaveandcontinueBtn(driver).click();
		js.executeScript("window.scrollTo(0,0)");
		try {
			WebElement AssignedTO_Errormsg = Hompage_SubModules_Page.TaskModule_AddTask_AssignedTO_ErrorMsg(driver);
			String Act_AssignedTO_Errormsg = AssignedTO_Errormsg.getText();
			String Exp_AssignedTO_Errormsg = "This field is required.";
			if (Act_AssignedTO_Errormsg.equalsIgnoreCase(Exp_AssignedTO_Errormsg)) {
				test.log(LogStatus.PASS, "Actual and Exp msgs at Assigned  feild are matching");
				// System.out.println("Actual Error msg and Exp Error msg at Assigned to feild
				// are macthing");
			} else {
				// System.out.println("No such error found");
				test.log(LogStatus.FAIL, "Actual and Exp msgs at Assigned  feild are  not matching");

			}
		} catch (Exception e) {
			// System.out.println("didnt went into error feild try block");
			test.log(LogStatus.FAIL, "Didnt went into the catch block for Assigned feild");

		}
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Assignedto);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Assigned feild is  entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask__AssignedTo_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys("Patterson");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Related to feild are entered again succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.ENTER);
		Hompage_SubModules_Page.TaskModule_AddTask_RelatedTo_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_BeginDate_feild(driver).sendKeys(taskBeginDate);
		Hompage_SubModules_Page.TaskModule_AddTask_BeginDate_feild(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Task Begin date at task is entered succesfully");
		Thread.sleep(2000);
		Hompage_SubModules_Page.TaskModule_AddTask_EndDate_feild(driver).sendKeys(taskEndDate);
		Hompage_SubModules_Page.TaskModule_AddTask_EndDate_feild(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Task End  date at task is entered succesfully");
		WebElement selectLogStatus = Hompage_SubModules_Page.TaskModule_AddTask_SelectaStatus_Dropdown(driver);
		Select SselectLogStatus = new Select(selectLogStatus);
		SselectLogStatus.selectByVisibleText(statuss);
		Thread.sleep(2000);
		 System.out.println("Selct LogStatus dropdown is selected succesfully");
		test.log(LogStatus.PASS, "LogStatus dropdown is selected succesfully");
		WebElement SelectPriority = Hompage_SubModules_Page.TaskModule_AddTask_SelectPriority_DropDown(driver);
		Select SSelectPriority = new Select(SelectPriority);
		SSelectPriority.selectByIndex(1);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		driver.switchTo().frame(Hompage_SubModules_Page.TaskModule_AddTask_FrameBtn(driver));
		Thread.sleep(3000);
	     System.out.println("Swictehd to frame ");
		test.log(LogStatus.PASS, "Switched to frame at Task module succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_Decriptionfeild(driver).sendKeys("Description to add it");
		// System.out.println("Description is added succesfully");
		test.log(LogStatus.PASS, "Description is added  succesfully");
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollTo(0,300)");
		Hompage_SubModules_Page.TaskModule_AddTask_SendEmailNotificationofDueDate_feild(driver).click();
		Thread.sleep(2000);
		System.out.println("Selct it mark as confirmed ");
		test.log(LogStatus.PASS, "Selected it as mark as confirmed  succesfully");
		Hompage_SubModules_Page.TaskModule_AddTask_SaveandcontinueBtn(driver).click();
		Thread.sleep(4000);
		Hompage_SubModules_Page.TaskModule_AddTask_Closebtn(driver).click();
		wb.Switchtoparent();
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "EditTask")));
	}

}
