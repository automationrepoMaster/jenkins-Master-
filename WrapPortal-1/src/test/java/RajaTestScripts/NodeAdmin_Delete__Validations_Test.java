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


public class NodeAdmin_Delete__Validations_Test extends BaseClass{
	
	String Excelpath ="D:\\NOURTEK\\Nourtek\\Configuration\\NourTek-Excel_HASHMAP.xlsx";
	String SheeetName = "Nourtek";
	WebDriverCommonLib wb = new WebDriverCommonLib();
	GenericLibrary.ExcelLibraray_Hashmap excel = new GenericLibrary.ExcelLibraray_Hashmap();
	//excel.setExcelFile(Excelpath, SheeetName);
	
	
	@Test
	public  void Edit_Validations() throws Throwable {
		excel.setExcelFile(Excelpath, SheeetName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wb.explicitWait( SecurityGroupsModule.programme_Icon(driver), 4000);
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
		Thread.sleep(4000);
		wb.UN_Tick_List_of_ChkBoxes(SecurityGroupsModule.Delete_list_CheckBoxes(driver));
//		SecurityGroupsModule.DelteModule_Chk_Box().click();
//		SecurityGroupsModule.DelteModule_Chk_Box().click();
		test.log(LogStatus.PASS, "Add Icon Chk bok  is clicked succesfully");
		wb.scrollToEndt();
		Thread.sleep(3000);
		SecurityGroupsModule.Save_Btn(driver).click();
		test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		SecurityGroupsModule.LOgout_Icon(driver).click();
		SecurityGroupsModule.LogOut_Btn(driver).click();
		Thread.sleep(3000);
		SecurityGroupsModule.Node_Admin_UN_Feild(driver).sendKeys(SecurityGroupsModule.Node_Admin_UN);
		SecurityGroupsModule.NodeAdmin_PW_Feild(driver).sendKeys(SecurityGroupsModule.NodeAdmin_PW);
		SecurityGroupsModule.login_Btn_Node_Admin(driver).click();
		Thread.sleep(3000);
		SecurityGroupsModule.Sponsor_Icon(driver).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='leftButtonGroup']//ul//li"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.size());
			System.err.println(list.get(i).getText());
		}
		if (list.equals(list1.size())) {
			System.out.println("both are matching ");
		} else {
			SecurityGroupsModule.Trade(driver).click();
			System.out.println("trade is clicked");
			Thread.sleep(3000);
			if (list.equals(list1.size())) {
				System.out.println("both are matching at trade");
			} else {
				SecurityGroupsModule.carrier(driver).click();
				Thread.sleep(3000);
				System.out.println("carrier is clicked succesfully");
				if (list.equals(list1.size())) {
					System.out.println("Both are matching at Carriers");
				} else {
					SecurityGroupsModule.Home_btn(driver).click();
					Thread.sleep(2000);
					SecurityGroupsModule.programme_Icon(driver).click();
					Thread.sleep(3000);
					SecurityGroupsModule.District(driver).click();
					Thread.sleep(3000);
					System.out.println("Districts is clicked succesfully");
					if (list.equals(list1.size())) {
						System.out.println("Both are matching at Disctricts");
					} else {
						SecurityGroupsModule.Home_btn(driver).click();
						Thread.sleep(2000);
						SecurityGroupsModule.Contractor_Icon(driver).click();
						if (list.equals(list1.size())) {
							System.out.println("Chkd at contractor ICon");
						} else {
							SecurityGroupsModule.Home_btn(driver).click();
							Thread.sleep(2000);
							SecurityGroupsModule.Contractor_packageIcon(driver).click();
							Thread.sleep(2000);
							if (list.equals(list1.size())) {
								System.out.println("contracor package is clicked succesfully");
							} else {
								SecurityGroupsModule.Home_btn(driver).click();
								Thread.sleep(2000);
								SecurityGroupsModule.Trades_Icon(driver).click();
								Thread.sleep(2000);
								if (list.equals(list1.size())) {
									System.out.println("match at trades icon");
								} else {
									SecurityGroupsModule.Home_btn(driver).click();
									Thread.sleep(2000);
									SecurityGroupsModule.Work_Class_Icon(driver).click();
									Thread.sleep(2000);
									if (list.equals(list1.size())) {
										System.out.println("work class is matched");
									} else {
										SecurityGroupsModule.LOgout_Icon(driver).click();
										SecurityGroupsModule.LogOut_Btn(driver).click();
									}
								}

							}

						}
						Thread.sleep(3000);
						System.out.println("logout is done  succcesfully");
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
						Thread.sleep(2000);
						wb.Tick_List_of_ChkBoxes(SecurityGroupsModule.Delete_list_CheckBoxes(driver));
						//SecurityGroupsModule.DelteModule_Chk_Box().click();
						test.log(LogStatus.PASS, "Add Icon Chk bok  is clicked succesfully");
						wb.scrollToEndt();
						Thread.sleep(3000);
						SecurityGroupsModule.Save_Btn(driver).click();
						test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
						try {
						driver.switchTo().alert().accept();
						test.log(LogStatus.PASS, "alert is hanlded");
						}catch (Exception e) {
							System.out.println("no such alert");
						}
					}
				}
			}
		}
		
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "NodeAdmin_Delete__Validations_Test")));
	}
}
