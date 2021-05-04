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


public class NodeAdmin_SidePanel_validations_Test extends BaseClass{
	
	String Excelpath ="D:\\NOURTEK\\Nourtek\\Configuration\\NourTek-Excel_HASHMAP.xlsx";
	String SheeetName = "Nourtek";
	WebDriverCommonLib wb = new WebDriverCommonLib();
	GenericLibrary.ExcelLibraray_Hashmap excel = new GenericLibrary.ExcelLibraray_Hashmap();
	//excel.setExcelFile(Excelpath, SheeetName);
	@Test

	public void Sidepanel_validations() throws Throwable {
         excel.setExcelFile(Excelpath, SheeetName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wb.explicitWait(SecurityGroupsModule.programme_Icon(driver), 4000);
		SecurityGroupsModule.programme_Icon(driver).click();
		test.log(LogStatus.PASS, "Programme Icon is clicked succesfully");
		Thread.sleep(3000);
		wb.click(SecurityGroupsModule.SecurityGroups_Icon(driver));
		test.log(LogStatus.PASS, "Security Groups Tab is clicked succesfully");
		wb.selectByVisibleText("Node Administrator | Node_Admin",
				SecurityGroupsModule.SelectProfile_Dropdown(driver));
		wb.UN_Tick_List_of_ChkBoxes(SecurityGroupsModule.View_list_CheckBoxes(driver));
		// SecurityGroupsModule.ViewModule_Chk_Box().click();
		// SecurityGroupsModule.ViewModule_Chk_Box().click();
		// test.log(LogStatus.PASS, "Add Icon Chk bok is clicked succesfully");
		wb.scrollToEndt();
		Thread.sleep(3000);
		SecurityGroupsModule.Save_Btn(driver).click();
		test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
		wb.Alert();
		Thread.sleep(2000);
		Thread.sleep(2000);
		SecurityGroupsModule.LOgout_Icon(driver).click();
		SecurityGroupsModule.LogOut_Btn(driver).click();
		Thread.sleep(5000);
		SecurityGroupsModule.Node_Admin_UN_Feild(driver).sendKeys(SecurityGroupsModule.Node_Admin_UN);
		SecurityGroupsModule.NodeAdmin_PW_Feild(driver).sendKeys(SecurityGroupsModule.NodeAdmin_PW);
		SecurityGroupsModule.login_Btn_Node_Admin(driver).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='nav nav-list']//li"));
		System.out.println(list.size());
		try {
			if (list.contains(SecurityGroupsModule.SidePanel_DashBoard(driver))) {
				wb.mouseOverElement(SecurityGroupsModule.SidePanel_DashBoard(driver));
				wb.Compare(SecurityGroupsModule.SidePanel_DashBoard_txt(driver), "Dashboard");
				test.log(LogStatus.PASS, "Act and Exp are matching at DashBoard icon");
				SecurityGroupsModule.LOgout_Icon(driver).click();
				SecurityGroupsModule.LogOut_Btn(driver).click();
				Thread.sleep(3000);
				System.out.println("logout is done  succcesfully");
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
				Thread.sleep(2000);
				wb.scrollToTop();
				Thread.sleep(2000);
				wb.Tick_List_of_ChkBoxes(SecurityGroupsModule.View_list_CheckBoxes(driver));
				wb.scrollToEndt();
				Thread.sleep(3000);
				SecurityGroupsModule.Save_Btn(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Save Btn   is clicked succesfully");
				try {
					driver.switchTo().alert().accept();
					test.log(LogStatus.PASS, "alert is hanlded");
				} catch (Throwable e) {
					System.out.println("no such alert");
				}

			} else {
				test.log(LogStatus.FAIL, "Dash board also not present");
			}
		} catch (Exception e) {
			if (list.contains(SecurityGroupsModule.SidePanel_Open_Action_items(driver))) {
				wb.mouseOverElement(SecurityGroupsModule.SidePanel_Open_Action_items(driver));
				wb.Compare(SecurityGroupsModule.SidePanel_Open_Action_items_txt(driver), "Open Action Items");
				test.log(LogStatus.PASS, "Act and Exp are matching at Open Actions icon");
				if (list.contains(SecurityGroupsModule.SidePanel_Pre_Bid_CPkg(driver))) {
					wb.mouseOverElement(SecurityGroupsModule.SidePanel_Pre_Bid_CPkg(driver));
					wb.Compare(SecurityGroupsModule.SidePanel_Pre_Bid_CPkg_txt(driver),
							"Pre-Bid Contractor Packages");
					test.log(LogStatus.PASS, "Act and Exp are matching at Pre-Bid Contractor Packages icon");
					if (list.contains(SecurityGroupsModule.SidePanel_Contractors_panel(driver))) {
						wb.mouseOverElement(SecurityGroupsModule.SidePanel_Contractors_panel(driver));
						wb.Compare(SecurityGroupsModule.SidePanel_Contractors_panel_txt(driver),
								"Contractors");
						test.log(LogStatus.PASS, "Act and Exp are matching at contractors icon");
						if (list.contains(SecurityGroupsModule.SidePanel_Contr_pks(driver))) {
							wb.mouseOverElement(SecurityGroupsModule.SidePanel_Contr_pks(driver));
							wb.Compare(SecurityGroupsModule.SidePanel_Contr_pks_txt(driver),
									"Contractor Packages");
							test.log(LogStatus.PASS, "Act and Exp are matching at  Contractor Packages icon");
							if (list.contains(SecurityGroupsModule.SidePanel_Program(driver))) {
								wb.mouseOverElement(SecurityGroupsModule.SidePanel_Program(driver));
								wb.Compare(SecurityGroupsModule.SidePanel_Program_txt(driver), "Programs ");
								test.log(LogStatus.PASS, "Act and Exp are matching at Programs icon");
								if (list.contains(SecurityGroupsModule.SidePanel_Project(driver))) {
									wb.mouseOverElement(SecurityGroupsModule.SidePanel_Project(driver));
									wb.Compare(SecurityGroupsModule.SidePanel_Project_txt(driver), "Projects");
									test.log(LogStatus.PASS, "Act and Exp are matching at Projects icon");
									if (list.contains(SecurityGroupsModule.SidePanel_Claims(driver))) {
										wb.mouseOverElement(SecurityGroupsModule.SidePanel_Claims(driver));
										wb.Compare(SecurityGroupsModule.SidePanel_Claims_txt(driver),
												"Claims");
										test.log(LogStatus.PASS, "Act and Exp are matching at Claims icon");
										wb.Compare(SecurityGroupsModule.SidePanel_Claims_Upload_txt(driver),
												"Claims Upload");
										test.log(LogStatus.PASS, "Act and Exp are matching at Claims upload icon");
										if (list.contains(SecurityGroupsModule.SidePanel_Claims(driver))) {
											wb.mouseOverElement(SecurityGroupsModule.SidePanel_Claims(driver));
											wb.Compare(SecurityGroupsModule.SidePanel_Claims_txt(driver),
													"Claims");
											test.log(LogStatus.PASS, "Act and Exp are matching at Claims icon");
											wb.Compare(
													SecurityGroupsModule.SidePanel_Claims_Upload_txt(driver),
													"Claims Upload");
											test.log(LogStatus.PASS, "Act and Exp are matching at Claims upload icon");
											if (list.contains(SecurityGroupsModule.SidePanel_mail(driver))) {
												wb
														.mouseOverElement(SecurityGroupsModule.SidePanel_mail(driver));
												Thread.sleep(2000);
												wb.Compare(SecurityGroupsModule.SidePanel_mail_txt(driver),
														"Email");
												test.log(LogStatus.PASS, "Act and Exp are matching at mails icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Inbox_txt(driver), "Inbox");
												test.log(LogStatus.PASS, "Act and Exp are matching at Inbox icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Archive_txt(driver),
														"Archive");
												test.log(LogStatus.PASS, "Act and Exp are matching at Archive icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Junk_txt(driver), "Junk");
												test.log(LogStatus.PASS, "Act and Exp are matching at Junk icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Draft_txt(driver), "Draft");
												test.log(LogStatus.PASS, "Act and Exp are matching at Draft icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Sent_txt(driver), "Sent");
												test.log(LogStatus.PASS, "Act and Exp are matching at Sent icon");
												wb.Compare(
														SecurityGroupsModule.SidePanel_mail_Deleted_txt(driver),
														"Deleted");
												test.log(LogStatus.PASS, "Act and Exp are matching at Deleted icon");
												if (list.contains(SecurityGroupsModule.SidePanel_Fax(driver))) {
													wb.mouseOverElement(
															SecurityGroupsModule.SidePanel_Fax(driver));
													wb.Compare(SecurityGroupsModule.SidePanel_Fax_txt(driver),
															"Fax");
													test.log(LogStatus.PASS, "Act and Exp are matching at Fax icon");
													if (list.contains(SecurityGroupsModule.SidePanel_Notes(driver))) {
														wb.mouseOverElement(
																SecurityGroupsModule.SidePanel_Notes(driver));
														wb.Compare(
																SecurityGroupsModule.SidePanel_Notes_txt(driver),
																"Notes");
														test.log(LogStatus.PASS,
																"Act and Exp are matching at Notes icon");
														if (list.contains(
																SecurityGroupsModule.SidePanel_Documnets(driver))) {
															wb.mouseOverElement(
																	SecurityGroupsModule.SidePanel_Documnets(driver));
															wb.Compare(SecurityGroupsModule
																	.SidePanel_Documnets_txt(driver), "Documents");
															test.log(LogStatus.PASS,
																	"Act and Exp are matching at Documnets icon");
															if (list.contains(
																	SecurityGroupsModule.SidePanel_Tasks(driver))) {
																wb.mouseOverElement(
																		SecurityGroupsModule.SidePanel_Tasks(driver));
																wb.Compare(SecurityGroupsModule
																		.SidePanel_Tasks_txt(driver), "Tasks");
																test.log(LogStatus.PASS,
																		"Act and Exp are matching at Tasks icon");
																if (list.contains(SecurityGroupsModule
																		.SidePanel_Calender(driver))) {
																	wb
																			.mouseOverElement(SecurityGroupsModule
																					.SidePanel_Calender(driver));
																	wb.Compare(
																			SecurityGroupsModule
																					.SidePanel_Calender_txt(driver),
																			"Calendar");
																	test.log(LogStatus.PASS,
																			"Act and Exp are matching at Calender icon");
																	if (list.contains(SecurityGroupsModule
																			.SidePanel_Calender(driver))) {
																		wb.mouseOverElement(
																				SecurityGroupsModule
																						.SidePanel_Reports(driver));
																		wb.Compare(
																				SecurityGroupsModule
																						.SidePanel_Calender_txt(driver),
																				"Reports");
																		test.log(LogStatus.PASS,
																				"Act and Exp are matching at Reports icon");
																		SecurityGroupsModule.LOgout_Icon(driver)
																				.click();
																		SecurityGroupsModule.LogOut_Btn(driver).click();
																		Thread.sleep(3000);
																		System.out.println(
																				"logout is done  succcesfully");
																		SecurityGroupsModule.Node_Admin_UN_Feild(driver)
																				.sendKeys(excel
																						.getCellData("username", 1));
																		SecurityGroupsModule.NodeAdmin_PW_Feild(driver)
																				.sendKeys(excel
																						.getCellData("password", 1));
																		SecurityGroupsModule
																				.login_Btn_Node_Admin(driver).click();
																		Thread.sleep(2000);
																		SecurityGroupsModule.programme_Icon(driver)
																				.click();
																		Thread.sleep(3000);
																		wb.click(SecurityGroupsModule
																				.SecurityGroups_Icon(driver));
																		test.log(LogStatus.PASS,
																				"Security Groups Tab is clicked succesfully");
																		wb.selectByVisibleText(
																				"Node Administrator | Node_Admin",
																				SecurityGroupsModule
																						.SelectProfile_Dropdown(driver));

																		wb.scrollToEndt();
																		Thread.sleep(3000);
																		SecurityGroupsModule.Save_Btn(driver).click();
																		test.log(LogStatus.PASS,
																				"Save Btn   is clicked succesfully");
																		try {
																			driver.switchTo().alert().accept();
																			test.log(LogStatus.PASS,
																					"alert is hanlded");
																		} catch (Throwable T) {
																			System.out.println("no such alert");
																		}
																		

																	}

																}

															}

														}
													}
												}
											}

										}
									}
								}
							}
						}
					}
				}

			} else {
				test.log(LogStatus.PASS, "came to else loop");
				test.log(LogStatus.PASS, "No items are displayed as Check boxes are uncked at node admin");
			}
		
		}
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "NodeAdmin_SidePanel__Validations_Test")));
	}

}