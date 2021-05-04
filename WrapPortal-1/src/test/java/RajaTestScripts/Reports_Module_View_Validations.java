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
import ObjectRepository.SecurityGroupsModule;

public class Reports_Module_View_Validations extends BaseClass {
	String Excelpath = "D:\\NOURTEK\\Nourtek\\Configuration\\NourTek-Excel_HASHMAP.xlsx";
	String SheeetName = "Nourtek";
	String programName = "RAUTOMATION123";
	WebDriverCommonLib wb = new WebDriverCommonLib();
	GenericLibrary.ExcelLibraray_Hashmap excel = new GenericLibrary.ExcelLibraray_Hashmap();

	@Test
	public void Reports_ViewValidations() throws Throwable {
		excel.setExcelFile(Excelpath, SheeetName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (!SecurityGroupsModule.programme_Icon(driver).isDisplayed()) {
			System.out.println("programme-------------------------------");
		} else {
			SecurityGroupsModule.programme_Icon(driver).click();
		}
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='leftButtonGroup']//ul//li"));
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.size());
			System.out.println(list1.get(i).getText());
		}
		test.log(LogStatus.PASS, "Programme Icon is clicked succesfully");
		Thread.sleep(3000);
		wb.click(SecurityGroupsModule.SecurityGroups_Icon(driver));
		test.log(LogStatus.PASS, "Security Groups Tab is clicked succesfully");
		wb.selectByVisibleText("Node Administrator | Node_Admin", SecurityGroupsModule.SelectProfile_Dropdown(driver));
		Thread.sleep(3000);
		wb.UN_Tick_List_of_ChkBoxes(SecurityGroupsModule.ViewReports_list_CheckBoxes(driver));
//		SecurityGroupsModule.Reports_View_Chk_Box(driver).click();
//		SecurityGroupsModule.Reports_View_Chk_Box(driver).click();
		test.log(LogStatus.PASS, "Add Icon Chk bok  is clicked succesfully");
		wb.scrollToEndt();
		Thread.sleep(3000);
		SecurityGroupsModule.Save_Btn(driver).click();
		test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
		Thread.sleep(2000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No such alert present after saving button");
		}
		Thread.sleep(2000);
		SecurityGroupsModule.LOgout_Icon(driver).click();
		SecurityGroupsModule.LogOut_Btn(driver).click();
		Thread.sleep(3000);
		SecurityGroupsModule.Node_Admin_UN_Feild(driver).sendKeys(excel.getCellData("NodeAdmin_UN", 1));
		SecurityGroupsModule.NodeAdmin_PW_Feild(driver).sendKeys(excel.getCellData("NodeAdmin_PW", 1));
//		SecurityGroupsModule.Node_Admin_UN_Feild(driver).sendKeys(SecurityGroupsModule.Node_Admin_UN);
//		SecurityGroupsModule.NodeAdmin_PW_Feild(driver).sendKeys(SecurityGroupsModule.NodeAdmin_PW);
		SecurityGroupsModule.login_Btn_Node_Admin(driver).click();
		test.log(LogStatus.PASS, "Login as nod admin i n wrapportal");
		Thread.sleep(3000);
		try {
			js.executeScript("window.scrollTo(0,600)");
			SecurityGroupsModule.Reports_ICon(driver).click();
			test.log(LogStatus.PASS, "Reports Icon is clicked succesfully");
			Thread.sleep(3000);
			wb.selectByVisibleText(programName, SecurityGroupsModule.Select_programme_Report_Dropdown(driver));
			System.out.println(SecurityGroupsModule.Track_Reports_txt(driver).getText());
			System.out.println(SecurityGroupsModule.OrganiZational_Reports_txt(driver).getText());
			System.out.println(SecurityGroupsModule.Financial_report_txt(driver).getText());
			System.out.println(SecurityGroupsModule.OrganiZational_Reports_txt(driver).getText());
			System.out.println(SecurityGroupsModule.Claims_Report_txt(driver).getText());
			System.out.println(SecurityGroupsModule.OpenItems_Rpeorts_txt(driver).getText());
			Thread.sleep(3000);
			String Actual = "No Report assign for this category.";
			if (SecurityGroupsModule.OpenItems_Rpeorts_txt(driver).getText().equals(Actual)) {
				test.log(LogStatus.PASS, " Act and Exp texts are Matched at Open Items  tab reports");
				if (SecurityGroupsModule.Claims_Report_txt(driver).getText().equals(Actual)) {
					test.log(LogStatus.PASS, " Act and Exp texts are Matched at Open Items  tab reports");
					if (SecurityGroupsModule.OrganiZational_Reports_txt(driver).getText().equals(Actual)) {
						test.log(LogStatus.PASS, " Act and Exp texts are Matched at Open Items  tab reports");
						if (SecurityGroupsModule.Financial_report_txt(driver).getText().equals(Actual)) {
							test.log(LogStatus.PASS, " Act and Exp texts are Matched at Open Items  tab reports");
							if (SecurityGroupsModule.OrganiZational_Reports_txt(driver).getText().equals(Actual)) {
								test.log(LogStatus.PASS, " Act and Exp texts are Matched at Open Items  tab reports");
								if (SecurityGroupsModule.Track_Reports_txt(driver).getText().equals(Actual)) {
									test.log(LogStatus.PASS,
											" Act and Exp texts are Matched at Open Items  tab reports");
									SecurityGroupsModule.LOgout_Icon(driver).click();
									SecurityGroupsModule.LogOut_Btn(driver).click();
									SecurityGroupsModule.Node_Admin_UN_Feild(driver)
											.sendKeys(excel.getCellData("username", 1));
									SecurityGroupsModule.NodeAdmin_PW_Feild(driver)
											.sendKeys(excel.getCellData("password", 1));
									SecurityGroupsModule.login_Btn_Node_Admin(driver).click();
									Thread.sleep(2000);
									SecurityGroupsModule.programme_Icon(driver).click();
									Thread.sleep(3000);
									wb.click(SecurityGroupsModule.SecurityGroups_Icon(driver));
									test.log(LogStatus.PASS, "Security Groups Tab is clicked succesfully");
									wb.selectByVisibleText("Node Administrator | Node_Admin",
											SecurityGroupsModule.SelectProfile_Dropdown(driver));
									wb.Tick_List_of_ChkBoxes(SecurityGroupsModule.ViewReports_list_CheckBoxes(driver));
									// SecurityGroupsModule.Reports_View_Chk_Box(driver).click();
									test.log(LogStatus.PASS, "View Reports Icon Chk boxes  are clicked succesfully");
									wb.scrollToEndt();
									Thread.sleep(3000);
									SecurityGroupsModule.Save_Btn(driver).click();
									test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
									Thread.sleep(2000);
									try {
										driver.switchTo().alert().accept();
										test.log(LogStatus.PASS, "alert is hanlded");
										test.log(LogStatus.PASS, test.addScreenCapture(
												FileUtils1.captureScreen(driver, "Report Module View_Test")));
									} catch (Exception e) {
										System.out.println("no such alert");
										test.log(LogStatus.PASS, test.addScreenCapture(
												FileUtils1.captureScreen(driver, "Report Module View_Test")));
									}

								}
							}
						}
					}
				}

			}else {
				test.log(LogStatus.FAIL, "Report list is already present");
				
				test.log(LogStatus.PASS,
						test.addScreenCapture(FileUtils1.captureScreen(driver, "Report Module View_Test")));	
			}
		} catch (Exception e) {
			System.out.println(
					"Reports icon is not present we have made it disable at Node Admin by unticking check boxes");
			test.log(LogStatus.PASS,
					"Reports icon is not present we have made it disable at Node Admin by unticking  reports view module check boxes");
			test.log(LogStatus.PASS,
					test.addScreenCapture(FileUtils1.captureScreen(driver, "Report Module View_Test")));
			SecurityGroupsModule.LOgout_Icon(driver).click();
			SecurityGroupsModule.LogOut_Btn(driver).click();
			SecurityGroupsModule.Node_Admin_UN_Feild(driver).sendKeys(excel.getCellData("username", 1));
			SecurityGroupsModule.NodeAdmin_PW_Feild(driver).sendKeys(excel.getCellData("password", 1));
			SecurityGroupsModule.login_Btn_Node_Admin(driver).click();
			Thread.sleep(2000);
			SecurityGroupsModule.programme_Icon(driver).click();
			Thread.sleep(3000);
			wb.click(SecurityGroupsModule.SecurityGroups_Icon(driver));
			test.log(LogStatus.PASS, "Security Groups Tab is clicked succesfully");
			wb.selectByVisibleText("Node Administrator | Node_Admin",
					SecurityGroupsModule.SelectProfile_Dropdown(driver));
			wb.Tick_List_of_ChkBoxes(SecurityGroupsModule.ViewReports_list_CheckBoxes(driver));
           //SecurityGroupsModule.Reports_View_Chk_Box(driver).click();
			test.log(LogStatus.PASS, "View Reports Icon Chk boxes  are clicked succesfully");
			wb.scrollToEndt();
			Thread.sleep(3000);
			SecurityGroupsModule.Save_Btn(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
//			test.log(LogStatus.PASS,
//					test.addScreenCapture(FileUtils1.captureScreen(driver, "Report Module View_Test")));
			try {
				driver.switchTo().alert().accept();
				test.log(LogStatus.PASS, "alert is hanlded");
				test.log(LogStatus.PASS,
						test.addScreenCapture(FileUtils1.captureScreen(driver, "Report Module View_Test")));
			} catch (Throwable t) {
				System.out.println("no such alert");
				test.log(LogStatus.PASS,
						test.addScreenCapture(FileUtils1.captureScreen(driver, "Report Module View_Test")));
			}
		}
	}
}
