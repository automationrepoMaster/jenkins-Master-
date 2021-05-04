package TestScript;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;

public class Verify_ALL_HomeControlMenuIcons extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void testHomeControlMenuIcon() throws Throwable {

		String url = "";
		/*all modules name put in array and that array list operate through for loop and that 
		for loop operate through switch case so all module one by one get executed*/
		ArrayList<String> key = new ArrayList<String>();
		key.add("SponsorsUrl");
		key.add("ProgramsUrl");
		key.add("ProjectsUrl");
		key.add("ContractorsUrl");
		key.add("DestrictsUrl");
		key.add("ContractorPackagesUrl");
		key.add("TradeUrl");
		key.add("WorkClassUrl");
		key.add("EmailsUrl");
		key.add("FaxesUrl");
		key.add("TaskUrl");
		key.add("ReportsUrl");
		key.add("NotesUrl");
		key.add("DocumentsUrl");
		key.add("SettingsUrl");
//		key.add("ColorCategoryUrl");
		key.add("CM_DashboardUrl");
		key.add("CM_OpenActionItemUrl");
		key.add("Pre-BidContratorPackgaesUrl");
		key.add("CM_ContractorPackgaesUrl");
		key.add("CM_ContractorsUrl");
		key.add("CM_ProgramsUrl");
		key.add("CM_ProjectUrl");
//		key.add("CM_Claims");
//		key.add("CM_Emails");
		key.add("CM_Fax");
		key.add("CM_Notes");
		key.add("CM_Documents");
		key.add("CM_Tasks");
		key.add("CM_Calendars");
		key.add("CM_Reports");

		for (int i = 0; i <= key.size() - 1; i++) {

			switch (key.get(i)) {
			case "SponsorsUrl":
				url = "Sponsors - Wrap-Portal";

				HomePage.controlMenuHomeIcon(driver).click();

				HomePage.HomeMenuSponsors(driver).click();
				test.log(LogStatus.INFO, "Clicked On Sponsors Module Icon");
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "ProgramsUrl":
				url = "Program - Wrap-Portal";

				Thread.sleep(1500);
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuPrograms(driver).click();
				test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "ProjectsUrl":
				url = "Project - Wrap-Portal";

				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuProjects(driver).click();
				test.log(LogStatus.INFO, "Clicked On Projects Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "ContractorsUrl":
				url = "Contractors - Wrap-Portal";

				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuContractors(driver).click();
				test.log(LogStatus.INFO, "Clicked On Contractors Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "DestrictsUrl":
				url = "District - Wrap-Portal";

				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuDistrict(driver).click();
				test.log(LogStatus.INFO, "Clicked On Districts Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "ContractorPackagesUrl":
				url = "Contractor Packages - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuContractorPackage(driver).click();
				test.log(LogStatus.INFO, "Clicked On Contractor Packages Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "TradeUrl":
				url = "Trades - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuTrade(driver).click();
				test.log(LogStatus.INFO, "Clicked On Trade Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "WorkClassUrl":
				url = "Class Code - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuWorkClass(driver).click();
				test.log(LogStatus.INFO, "Clicked On Work Class Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "EmailsUrl":
				url = "Email - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuEmails(driver).click();
				test.log(LogStatus.INFO, "Clicked On Email Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
				/*
				 * case "FaxesUrl": url = "Fax - Wrap-Portal";
				 * HomePage.controlMenuHomeIcon(driver).click();
				 * HomePage.HomeMenuFaxes(driver).click(); test.log(LogStatus.INFO,
				 * "Clicked On Faxes Module Icon"); System.out.println(driver.getTitle()); if
				 * (driver.getTitle().equals(url)) { test.log(LogStatus.PASS,
				 * "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url +
				 * " Title Matched"); } else { test.log(LogStatus.FAIL, "Actual Page Title:- " +
				 * driver.getTitle() + " and Expected:- " + url + "  Title Not Matched"); }
				 */

				//break;
			case "TaskUrl":
				url = "Tasks - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuTask(driver).click();
				test.log(LogStatus.INFO, "Clicked On Task Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "ReportsUrl":
				url = "Reports - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuReports(driver).click();
				test.log(LogStatus.INFO, "Clicked On Reports Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "NotesUrl":
				url = "Notes - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuNotes(driver).click();
				test.log(LogStatus.INFO, "Clicked On Notes Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "DocumentsUrl":
				url = "Documents - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuDocuments(driver).click();
				test.log(LogStatus.INFO, "Clicked On Documents Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "SettingsUrl":
				url = "Settings - My Profile - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuSettings(driver).click();
				test.log(LogStatus.INFO, "Clicked On Settings Module Icon");
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				Thread.sleep(3500);
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				driver.close();
				driver.switchTo().window(wb.map.get("parentID"));
				HomePage.controlMenuHomeIcon(driver).click();

				break;
				
			case "ColorCategoryUrl":
				url = "Reports - Wrap-Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuColorCategories(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Color Category Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_DashboardUrl":
				url = "Dashboard - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuDashboard(driver).click();
				test.log(LogStatus.INFO, "Clicked On Dashboard Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "CM_OpenActionItemUrl":
				url = "Open Action Items - Wrap-Portal";

//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuOpenActionItem(driver).click();
				test.log(LogStatus.INFO, "Clicked On Open Action Items Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;
			case "Pre-BidContratorPackgaesUrl":
				url = "Contractor Packages - Wrap-Portal";

//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuPreBidContractorPackage(driver).click();
				test.log(LogStatus.INFO, "Clicked On Pre-Bid Contractor Packages Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_ContractorPackgaesUrl":
				url = "Contractor Packages - Wrap-Portal";

//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuContractorPackage(driver).click();
				test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Packages Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "CM_ContractorsUrl":
				url = "Contractors - Wrap-Portal";

//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuContractor(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}

				break;

			case "CM_ProgramsUrl":
				url = "Program - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuProgram(driver).click();
				Thread.sleep(1500);
				test.log(LogStatus.INFO, "Clicked On Control Menu Program Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_ProjectUrl":
				url = "Project - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuProject(driver).click();
				Thread.sleep(1500);
				test.log(LogStatus.INFO, "Clicked On Control Menu Project Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;
			case "CM_Claims":
				url = "Wrap Portal";
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuClaims(driver).click();
				Thread.sleep(2500);
				test.log(LogStatus.INFO, "Clicked On Control Menu Claims Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;
			case "CM_Emails":
				url = "Email - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				// HomePage.controlMenu;
				test.log(LogStatus.INFO, "Clicked On Control Menu Email Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			/*
			 * case "CM_Fax": url = "Fax - Wrap-Portal"; //
			 * HomePage.controlMenuHomeIcon(driver).click();
			 * HomePage.controlMenuFax(driver).click(); Thread.sleep(1500);
			 * test.log(LogStatus.INFO, "Clicked On Control Menu Fax Module Icon");
			 * System.out.println(driver.getTitle()); if (driver.getTitle().equals(url)) {
			 * test.log(LogStatus.PASS, "Actual Page Title:- " + driver.getTitle() +
			 * " and Expected:- " + url + " Title Matched"); } else {
			 * test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() +
			 * " and Expected:- " + url + "  Title Not Matched"); } break;
			 */
			case "CM_Notes":
				url = "Notes - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuNote(driver).click();
				Thread.sleep(1500);
				test.log(LogStatus.INFO, "Clicked On Control Menu Notes Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_Documents":
				url = "Documents - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuDocuments(driver).click();
				Thread.sleep(1500);
				test.log(LogStatus.INFO, "Clicked On Control Menu Documents Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_Tasks":
				url = "Tasks - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuTask(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Tasks Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			case "CM_Calendars":
				url = "Calendars - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuCalender(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Calendars Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;
			case "CM_Reports":
				url = "Reports - Wrap-Portal";
//				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.controlMenuReports(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Reports Module Icon");
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals(url)) {
					test.log(LogStatus.PASS,
							"Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url + " Title Matched");
				} else {
					test.log(LogStatus.FAIL, "Actual Page Title:- " + driver.getTitle() + " and Expected:- " + url
							+ "  Title Not Matched");
				}
				break;

			default:
				System.out.println("please enter the valid Credentials");
				break;
			}

		}

		

	}

}
