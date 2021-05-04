package TestScript;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddCarriersPage;
import ObjectRepository.AddClassCodePage;
import ObjectRepository.AddContractorPage;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.AddDivisonPage;
import ObjectRepository.AddProgram_Claims_Page;
import ObjectRepository.AddProgram_Compliance_Page;
import ObjectRepository.AddProgram_Contractor_Portal_Options_Page;
import ObjectRepository.AddProgram_Email_Management_Page;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.AddProgram_PayrollCVTracking;
import ObjectRepository.AddProgram_Policy_Certificates_Page;
import ObjectRepository.AddProgram_Premium_Modification_Page;
import ObjectRepository.AddProgram_Program_Parameters_Page;
import ObjectRepository.AddProgram_User_Access;
import ObjectRepository.AddProject_Address_Page;
import ObjectRepository.AddProject_Certificate_Page;
import ObjectRepository.AddProject_Change_Order_Page;
import ObjectRepository.AddProject_Compliance_Page;
import ObjectRepository.AddProject_Contact_Page;
import ObjectRepository.AddProject_Email_Management_Page;
import ObjectRepository.AddProject_Enrollment_Setup_Page;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.AddProject_PayrollCVTracking;
import ObjectRepository.AddProject_Premium_Modification_Page;
import ObjectRepository.AddProject_Project_Administrator_Access_Page;
import ObjectRepository.AddSponsorPage;
import ObjectRepository.AddTradePage;
import ObjectRepository.AddUserPage;
import ObjectRepository.CarriersModule;
import ObjectRepository.ClassCodeModule;
import ObjectRepository.ContractorModule;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.DivisionModule;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;
import ObjectRepository.ProjectModule;
import ObjectRepository.SettingsModules;
import ObjectRepository.SponsorsModule;
import ObjectRepository.TradesModule;
import ObjectRepository.UsersModule;

public class WPCreateDBTestCase extends BaseClass {
	String usercompanyName = RandomClass.randomUserName();
	String divisionName = RandomClass.randomDivisionName();
	String sponsorName = RandomClass.randomSponsorName();
	String carrierName = RandomClass.randomCarrierName();
	String programName = RandomClass.randomProgram();
	// String contactNameForProject="alex";
	String ContractorCompanyName = RandomClass.randomContractorCompanyName();
	String tradeName = RandomClass.randomTradeDescription();
	String classCodeName = RandomClass.randomClassCodeDescription();
	String selectProgramAdministrator = "" + usercompanyName + " - John1 Tom1";
	String EnrollmentType = "WC & GL Enrollment";
	String projectName = RandomClass.randomProject();
	String ContrContactFirstName = "Jimmy";
	String ContractorContactLastName = "Smith";

	@Test
	public void testCreateDB_WP() throws Throwable {
		WebDriverCommonLib wb = new WebDriverCommonLib();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> moduleName = new ArrayList<String>();

		moduleName.add("AddDistrict");
		moduleName.add("AddUser");
		moduleName.add("AddSponsors");
		moduleName.add("AddContractors");
		moduleName.add("AddCarrier");
		moduleName.add("AddProgram");
		moduleName.add("AddProject");
		moduleName.add("AddTrade");
		moduleName.add("AddWorkClass");
		moduleName.add("Create_Contractor_Pkg");

		// need to add scripts - enroll cp, payroll, change order, closeout.
		for (int i = 0; i <= moduleName.size() - 1; i++) {
			switch (moduleName.get(i)) {
			case "AddDistrict":
				test.log(LogStatus.INFO, "========== Add District Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked on Home Icon");
				HomePage.HomeMenuDistrict(driver).click();
				test.log(LogStatus.INFO, "Clicked on Division Module Icon");
				DivisionModule.divisionAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked Add Division Icon");
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddDivisonPage.addDivisionDivisionNameField(driver).sendKeys(divisionName);
				test.log(LogStatus.PASS, "Division Name Added Successfully");
				AddDivisonPage.addDivisionDivisionCodeField(driver).sendKeys(RandomClass.randomDivisionCode());
				test.log(LogStatus.PASS, "Division Code Added Successfully");
				wb.selectSingleValueByIndex(AddDivisonPage.addDivisionDivisionSponsorField(driver), 7);
				test.log(LogStatus.PASS, "Division Sponsor Added Successfully");
				wb.selectSingleValueByIndex(AddDivisonPage.addDivisionDivisionAdministeratorField(driver), 25);
				test.log(LogStatus.PASS, "Division Administrator Added Successfully");
				Thread.sleep(4000);
				AddDivisonPage.addDivisionContactNameField(driver).sendKeys("Dave John");
				test.log(LogStatus.PASS, "Division Contact Name Added Successfully");
				AddDivisonPage.addDivisionContactEmailField(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Division Email ID Added Successfully");
				AddDivisonPage.addDivisionPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Division Phone No Added Successfully");
				AddDivisonPage.addDivisionDivisionNoteField(driver).sendKeys("Testing");
				test.log(LogStatus.PASS, "Division Note Added Successfully");
				wb.selectSingleValueByIndex(AddDivisonPage.addDivisionRegionField(driver), 2);
				test.log(LogStatus.PASS, "Division Region Added Successfully");
				wb.selectSingleValueByIndex(AddDivisonPage.addDivisionEntityField(driver), 2);
				test.log(LogStatus.PASS, "Division Entity Added Successfully");
				AddDivisonPage.addDivisionSaveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
				AddDivisonPage.addDivisionAddAddressBtn(driver).click();
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				test.log(LogStatus.INFO, "Clicked On Add Address Button");
				AddDivisonPage.addDivisionAdd_AddressLocationNameField(driver).sendKeys("New York");
				test.log(LogStatus.PASS, "Location Name Added Successfully");
				AddDivisonPage.addDivisionAdd_AddresscContactNameField(driver).sendKeys("abc");
				test.log(LogStatus.PASS, "Contact Name Added Successfully");
				AddDivisonPage.addDivisionAdd_AddressContactPhoneField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Contact Phone Added Successfully");
				wb.selectSingleValue(AddDivisonPage.addDivisionAdd_AddressAddressTypeField(driver), "Mailing Address");
				test.log(LogStatus.PASS, "Address Type Selected Successfully");
				AddDivisonPage.addDivisionAdd_AddressAddress1Field(driver).sendKeys("Mainroad 1234 north Street");
				test.log(LogStatus.PASS, "Address1 Field  Added Successfully");
				AddDivisonPage.addDivisionAdd_AddressCity(driver).sendKeys("New York");
				test.log(LogStatus.PASS, "Address City Added Successfully");
				wb.selectSingleValue(AddDivisonPage.addDivisionAdd_AddressState(driver), RandomClass.randomState());
				test.log(LogStatus.PASS, "Address State  Added Successfully");
				AddDivisonPage.addDivisionAdd_AddressZipCode(driver).sendKeys("123456789");
				test.log(LogStatus.PASS, "Address Zip Code Added Successfully");
				AddDivisonPage.addDivisionAdd_AddressSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Close Button");
				driver.switchTo().window(wb.map.get("childID"));
				Thread.sleep(4000);
				AddDivisonPage.addDivisionAddressTabNextBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Address Tab Next Button");
				AddDivisonPage.addDivisionContactsTabNextBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Contacts Tab Next Button");
				AddDivisonPage.addDivisionUserAccessTabAddSponsorBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Sponsors Add Button");
				wb.selectSingleValueByIndex(AddDivisonPage.addDivisionUserAccessSelectSponsorDropDown(driver), 5);
				test.log(LogStatus.PASS, "Sponsor Selected Successfully");
				AddDivisonPage.addDivisionUserAccessTabAddSponsorPlusBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Plus Button Button");
				AddDivisonPage.addDivisionUserAccessTabFinishAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Finish And Close Button");
				test.log(LogStatus.PASS, divisionName + " Division Added Successfully");
				System.out.println("Division Added Successfully");
				driver.switchTo().window(wb.map.get("parentID"));

				break;

			case "AddUser":

				test.log(LogStatus.INFO, "========== Add User Section  ==========");
				// Add user
				SettingsModules.profileDropDown(driver).click();
				test.log(LogStatus.INFO, "Clicked On Profile Icon");
				js.executeScript("arguments[0].click();", SettingsModules.settingsModuleButton(driver));
//				js.executeScript("arguments[0].click();",SettingsModules.settingsModuleButton(driver));
				test.log(LogStatus.INFO, "Clicked On Settings Module");
				SettingsModules.settingsMenuUsersModule(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.INFO, "Cliced On User Module");
				UsersModule.userAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add User Icon");
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddUserPage.addUserCompanyNameField(driver).sendKeys(usercompanyName);
				test.log(LogStatus.PASS, usercompanyName + " Company Name Added Successfully");
				wb.selectSingleValueByIndex(AddUserPage.addUserLegalStatus(driver), 2);
				test.log(LogStatus.PASS, "Company Legal Status Added Successfully");
				AddUserPage.addUserDBAField(driver).sendKeys(RandomClass.randomDBA());
				test.log(LogStatus.PASS, "Company DBA Added Successfully");
				AddUserPage.addUserLicenseNoField(driver).sendKeys("456546787");
				test.log(LogStatus.PASS, "Company Licence No Added Successfully");
				wb.selectSingleValueByIndex(AddUserPage.addUserContactTypeField(driver), 2);
				test.log(LogStatus.PASS, "Contact Type Added Successfully");
				AddUserPage.addUserFirstNameField(driver).sendKeys("John1");
				test.log(LogStatus.PASS, "Contact First Name Added Successfully");
				AddUserPage.addUserMiddleNameField(driver).sendKeys("M");
				test.log(LogStatus.PASS, "Contact Middle Name Added Successfully");
				AddUserPage.addUserLastNameField(driver).sendKeys("Tom1");
				test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
				AddUserPage.addUserJobTitleField(driver).sendKeys("ABCS");
				test.log(LogStatus.PASS, "Display As Name Added Successfully");
				AddUserPage.addUserJobTitleField(driver).sendKeys("Admin");
				test.log(LogStatus.PASS, "Contact Job Title Added Successfully");
				AddUserPage.addUserPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Contact Phone No Added Successfully");
				AddUserPage.addUserEmailField(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Company Name Added Successfully");
				AddUserPage.addUserSaveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
				AddSponsorPage.addSponsorAddAddressBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add Address Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				AddSponsorPage.addSponsorAddAddressSelectAddressType(driver, "Mailing Address");
				test.log(LogStatus.PASS, "Address Type Selected Successfully");
				AddSponsorPage.addSponsorAddAddressAddress1Field(driver).sendKeys(RandomClass.randomAddress1Field());
				test.log(LogStatus.PASS, "Address 1 Added Successfully");
				AddSponsorPage.addSponsorAddAddressCityField(driver).sendKeys(RandomClass.randomState());
				test.log(LogStatus.PASS, "Address City Added Successfully");
				AddSponsorPage.addSponsorAddAddressSelectState(driver, RandomClass.randomState());
				test.log(LogStatus.PASS, "Address State Added Successfully");
				AddSponsorPage.addSponsorAddAddressZipCode(driver).sendKeys("789654123");
				test.log(LogStatus.PASS, "Address Zip Code Added Successfully");
				AddSponsorPage.addSponsorAddAddressSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Close Button");
				driver.switchTo().window(wb.map.get("childID"));
				AddUserPage.addUserAddressTabSaveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
				AddUserPage.addUserContactsTabFinishAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Finish And Close Button");
				driver.switchTo().window(wb.map.get("parentID"));// shift focus return to parent window
				test.log(LogStatus.INFO, usercompanyName + " User Added Successfully");
				System.out.println("User Added Successfully");

				break;

			case "AddSponsors":
				test.log(LogStatus.INFO, "========== Add Sponsors Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				Thread.sleep(5000);
				test.log(LogStatus.INFO, "Clicked On Home Icon");
				HomePage.HomeMenuSponsors(driver).click();
				Thread.sleep(6000);
				test.log(LogStatus.INFO, "Clicked On Sponsor Module Icon");
				SponsorsModule.SponsorAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add Sponsor Icon");
				Thread.sleep(4000);
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				Thread.sleep(5000);
				AddSponsorPage.addSponsorCompanyNameField(driver).sendKeys(sponsorName);
				test.log(LogStatus.PASS, sponsorName + " Sponsor Company Added Successfully");
				AddSponsorPage.addSponsorFEINField(driver).sendKeys(RandomClass.randomFEIN());
				test.log(LogStatus.PASS, "Sponsor FEIN Added Successfully");
				wb.selectSingleValueByIndex(AddSponsorPage.addSponsorLegalStatus(driver), 2);
				test.log(LogStatus.PASS, "Sponsor Legal Status Selected Successfully");
				AddSponsorPage.addSponsorSponsorCodeField(driver).sendKeys(RandomClass.randomSponsorName());
				test.log(LogStatus.PASS, "Sponsor Code Added Successfully");
				AddSponsorPage.addSponsorDBAField(driver).sendKeys(RandomClass.randomDBA());
				test.log(LogStatus.PASS, "Sponsor DBA Added Successfully");
				AddSponsorPage.addSponsorLicenseNoField(driver).sendKeys(RandomClass.randomDBA());
				test.log(LogStatus.PASS, "Sponsor Licence No Added Successfully");
				wb.selectSingleValueByIndex(AddSponsorPage.addSponsorContactTypeField(driver), 2);
				test.log(LogStatus.PASS, "Sponsor Contact Type Selected Successfully");
				AddSponsorPage.addSponsorFirstNameField(driver).sendKeys("Jimmy");
				test.log(LogStatus.PASS, "Sponsor First Name Added Successfully");
				AddSponsorPage.addSponsorMiddleNameField(driver).sendKeys("BV");
				test.log(LogStatus.PASS, "Sponsor Middle Name Added Successfully");
				AddSponsorPage.addSponsorLastNameField(driver).sendKeys("Smith");
				test.log(LogStatus.PASS, "Sponsor Last Name Added Successfully");
				AddSponsorPage.addSponsorJobTitleField(driver).sendKeys("Admin");
				test.log(LogStatus.PASS, "Sponsor Job Title Added Successfully");
				AddSponsorPage.addSponsorPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Sponsor Phone No Added Successfully");
				AddSponsorPage.addSponsorMobileNoField(driver).sendKeys(RandomClass.randomMobileNo());
				test.log(LogStatus.PASS, "Sponsor Mobile No Added Successfully");
				AddSponsorPage.addSponsorFaxField(driver).sendKeys("78454131");
				test.log(LogStatus.PASS, "Sponsor Fax No Added Successfully");
				AddSponsorPage.addSponsorEmailField(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Sponsor Email ID Added Successfully");
				AddSponsorPage.addSponsorSaveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");
				AddSponsorPage.addSponsorAddAddressBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add Address Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				AddSponsorPage.addSponsorAddAddressSelectAddressType(driver, "Mailing Address");
				test.log(LogStatus.PASS, "Address Type Selected Successfully");
				AddSponsorPage.addSponsorAddAddressAddress1Field(driver).sendKeys(RandomClass.randomAddress1Field());
				test.log(LogStatus.PASS, "Address 1 Added Successfully");
				AddSponsorPage.addSponsorAddAddressCityField(driver).sendKeys(RandomClass.randomState());
				test.log(LogStatus.PASS, "Address City Added Successfully");
				AddSponsorPage.addSponsorAddAddressSelectState(driver, RandomClass.randomState());
				test.log(LogStatus.PASS, "Address State Added Successfully");
				AddSponsorPage.addSponsorAddAddressZipCode(driver).sendKeys("789654123");
				test.log(LogStatus.PASS, "Address Zip Code Added Successfully");
				AddSponsorPage.addSponsorAddAddressSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Close Button");
				driver.switchTo().window(wb.map.get("childID"));
				AddSponsorPage.addSponsorAddressTabSaveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Address Tab Save And Continue Button");
				AddSponsorPage.addSponsorContactsTabFinishAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Finish And Close Button");
				System.out.println("Sponsor Added Successfully");
				test.log(LogStatus.PASS, sponsorName + " Sponosor Added Successfully");
				driver.switchTo().window(wb.map.get("parentID"));
				Thread.sleep(4000);

				break;

			case "AddContractors":
				test.log(LogStatus.INFO, "========== Add Contractors Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuContractors(driver).click();
				test.log(LogStatus.PASS, "Click on Contractor Module From Home Page");
				Thread.sleep(6000);
				ContractorModule.contractorAddIcon(driver).click();
				Thread.sleep(4000);
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddContractorPage.addContractorCompanyNameField(driver).sendKeys(ContractorCompanyName);
				test.log(LogStatus.PASS, "Company Name added successfully");
				Thread.sleep(4000);
				AddContractorPage.addContractorFEINField(driver).sendKeys(RandomClass.randomFEIN());
				test.log(LogStatus.PASS, "FEIN added successfully");
				AddContractorPage.addContractorLegalStatus(driver, 2);
				test.log(LogStatus.PASS, "Status get selected successfully");
				AddContractorPage.addContractorDBAField(driver).sendKeys(RandomClass.randomDBA());
				test.log(LogStatus.PASS, "DBA added successfully");
				AddContractorPage.addContractorLicenseNoField(driver).sendKeys(RandomClass.randomDBA());
				test.log(LogStatus.PASS, "License No added successfully");
				AddContractorPage.addContractorContactTypeField(driver, 2);
				test.log(LogStatus.PASS, "Contractor Type select successfully");
				AddContractorPage.addContractorFirstNameField(driver).sendKeys(ContrContactFirstName);
				test.log(LogStatus.PASS, "Contractor Name added successfully");
				AddContractorPage.addContractorMiddleNameField(driver).sendKeys("BV");
				test.log(LogStatus.PASS, "Contractor Middle Name added successfully");
				AddContractorPage.addContractorLastNameField(driver).sendKeys(ContractorContactLastName);
				test.log(LogStatus.PASS, "Contractor Last Name added successfully");
				AddContractorPage.addContractorJobTitleField(driver).sendKeys("Admin");
				test.log(LogStatus.PASS, "Contractor Job Title selected successfully");
				AddContractorPage.addContractorPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Phone No added successfully");
				AddContractorPage.addContractorMobileNoField(driver).sendKeys(RandomClass.randomMobileNo());
				test.log(LogStatus.PASS, "Contractor Mobile No added successfully");
				AddContractorPage.addContractorFaxField(driver).sendKeys("78454131");
				test.log(LogStatus.PASS, "Contractor Fax No added successfully");
				AddContractorPage.addContractorEmailField(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Contractor Email_ID added successfully");
				AddContractorPage.addContractorSaveAndContinueBtn(driver).click();
				test.log(LogStatus.PASS, "Click on Save And Continue Button");
				// AddContractorPage.alertOKBtnSameComapnyName(driver).click();

//				try {
//					Alert alt=driver.switchTo().alert();
//					String altString= alt.getText();
//					alt.accept();
//					test.log(LogStatus.PASS, "Alert Accepted");
//					System.out.println(altString);
//					test.log(LogStatus.PASS,altString +" Alert Message Displayed");
//					
//				} catch (Throwable e) {
//					
//					test.log(LogStatus.PASS, " Alert Message is not Displayed");
//				}
				AddContractorPage.addContractorAddAddressBtn(driver).click();
				Thread.sleep(4000);
				test.log(LogStatus.PASS, "Click on Add Address Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				AddContractorPage.addContractorAddAddressSelectAddressType(driver, "Mailing Address");
				test.log(LogStatus.PASS, "Address Type selected successfully");
				AddContractorPage.addContractorAddAddressAddress1Field(driver)
						.sendKeys(RandomClass.randomAddress1Field());
				test.log(LogStatus.PASS, "Address 1 Field added successfully");
				AddContractorPage.addContractorAddAddressCityField(driver).sendKeys(RandomClass.randomState());
				test.log(LogStatus.PASS, "Address City added successfully");
				AddContractorPage.addContractorAddAddressSelectState(driver, RandomClass.randomState());
				test.log(LogStatus.PASS, "Address State Selected successfully");
				AddContractorPage.addContractorAddAddressZipCode(driver).sendKeys("789654123");
				test.log(LogStatus.PASS, "Zip Code added successfully");
				AddContractorPage.addContractorAddAddressSaveAndCloseBtn(driver).click();
				driver.switchTo().window(wb.map.get("childID"));
				AddContractorPage.addContractorAddressTabSaveAndContinueBtn(driver).click();
				AddContractorPage.addContractorContactsTabFinishAndCloseBtn(driver).click();
				System.out.println("Contractor Added Successfully");
				test.log(LogStatus.PASS, "Contractor added successfully");
				driver.switchTo().window(wb.map.get("parentID"));
				Thread.sleep(4000);

				break;

			case "AddCarrier":
				test.log(LogStatus.INFO, "========== Add Carrier Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked on Home icon");
				Thread.sleep(3000);
				SettingsModules.profileDropDown(driver).click();
				test.log(LogStatus.INFO, "Clicked on Profile icon");
				wb.mouseMoveToElement(SettingsModules.settingsModuleButton(driver));
//				js.executeScript("arguments[0].click();",SettingsModules.settingsModuleButton(driver));
				test.log(LogStatus.INFO, "Clicked on Settings icon");

				Thread.sleep(3000);
				wb.waitForElemnet(SettingsModules.settingsMenuCarriersModule(driver));
				test.log(LogStatus.INFO, "Clicked on Carrier Module");
				CarriersModule.carriersAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked on Carrier add icon");
				Thread.sleep(4000);
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddCarriersPage.addCarrierCarrierNameField(driver).sendKeys(carrierName);
				test.log(LogStatus.PASS, "Carrier Name Added Successfully");
				AddCarriersPage.addCarrierShortNameField(driver).sendKeys("CC");
				test.log(LogStatus.PASS, "Carrier Short Name Added Successfully");
				AddCarriersPage.addCarrierContactFirstNameField(driver).sendKeys("Rock");
				test.log(LogStatus.PASS, "Carrier First Name Added Successfully");
				AddCarriersPage.addCarrierContactLastNameField(driver).sendKeys("Smith");
				test.log(LogStatus.PASS, "Carrier Last Name Added Successfully");
				AddCarriersPage.addCarrierContactEmailField(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Carrier Email ID Added Successfully");
				AddCarriersPage.addCarrierContactPhoneField(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Carrier Phone No Added Successfully");
				AddCarriersPage.addCarrierAddress1Field(driver).sendKeys("Abc Street 124 North West");
				test.log(LogStatus.PASS, "Carrier Address 1 Added Successfully");
				AddCarriersPage.addCarrierAddress2Field(driver).sendKeys("Gang Galaxy");
				test.log(LogStatus.PASS, "Carrier Address 2 Field Added Successfully");
				AddCarriersPage.addCarrierCityField(driver).sendKeys(RandomClass.randomState());
				test.log(LogStatus.PASS, "Carrier City Added Successfully");
				AddCarriersPage.addCarrierStateField(driver).sendKeys(RandomClass.randomState());
				test.log(LogStatus.PASS, "Carrier state Added Successfully");
				AddCarriersPage.addCarrierZipCodeField(driver).sendKeys("123456789");
				test.log(LogStatus.PASS, "Carrier Zip Code Added Successfully");
				AddCarriersPage.addCarrierSaveBtn(driver).click();
				test.log(LogStatus.PASS, "Carrier Save Successfully");
				AddCarriersPage.addCarrierSaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Carrier Save And Close Successfully");
				test.log(LogStatus.PASS, " " + carrierName + " Carrier Added Successfully");
				driver.switchTo().window(wb.map.get("parentID"));

				break;

			case "AddProject":
				test.log(LogStatus.INFO, "========== Add Project Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "Clicked on Home Icon");
				HomePage.HomeMenuProjects(driver).click();
				test.log(LogStatus.INFO, "Clicked on Project Module Icon");
				ProjectModule.projectAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked on Add Project Icon");
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				Thread.sleep(4000);
				driver.manage().window().maximize();

				wb.selectSingleValue(AddProject_General_Information_Page.selectProgramField(driver), programName);// Sony
																													// Tower
																													// Test
				test.log(LogStatus.PASS, "Program Selected Successfully");
				wb.selectSingleValue(AddProject_General_Information_Page.selectProjectStatusField(driver), "Active");
				test.log(LogStatus.PASS, "Status Selected Successfully");
				AddProject_General_Information_Page.projectNameField(driver).sendKeys(projectName);
				test.log(LogStatus.PASS, "Project Name Added Successfully");

//				AddProject_General_Information_Page.projectCodeField(driver).sendKeys(RandomClass.randomProjectCode());
//				test.log(LogStatus.PASS, "Project Code Added Successfully");

				wb.selectSingleValueByIndex(AddProject_General_Information_Page.divisionField(driver), 2);
				test.log(LogStatus.PASS, "Project Division Added Successfully");
				AddProject_General_Information_Page.contractValueField(driver).sendKeys("120000000");
				test.log(LogStatus.PASS, "Project Contract Value Added Successfully");
				wb.selectSingleValue(AddProject_General_Information_Page.selectStateField(driver),
						RandomClass.randomState());
				test.log(LogStatus.PASS, "Project State Selected Successfully");
				AddProject_General_Information_Page.estimatedPayrollField(driver).sendKeys("350000");
				test.log(LogStatus.PASS, "Project Estimated Payroll Added Successfully");
				AddProject_General_Information_Page.estimatedHoursField(driver).sendKeys("500");
				test.log(LogStatus.PASS, "Project Estimated Hours Added Successfully");
				AddProject_General_Information_Page.beginDate(driver).sendKeys("1/04/2019");
				test.log(LogStatus.PASS, "Project Begin Date Added Successfully");
				AddProject_General_Information_Page.endDate(driver).sendKeys("01/04/2022");
				test.log(LogStatus.PASS, "Project End Date Added Successfully");
				Thread.sleep(4000);
//Raja 
				/*
				 * try { wb.selectSingleValueGetOpt(AddProject_General_Information_Page.
				 * selectProjectAdministrator(driver), usercompanyName);
				 * test.log(LogStatus.PASS, "Project Administrator Selected Successfully");
				 * System.out.println("Document Switch \t"+AddProject_General_Information_Page.
				 * requiredDocumentsforEnrollmentSwitch(driver).isEnabled());
				 * System.out.println("Portal Switch \t"+AddProject_General_Information_Page.
				 * activateContractorPortalForThisProjectSwitch(driver).isEnabled());
				 */
				/*
				 * AddProject_General_Information_Page.singlePrimeRedioButton(driver).isEnabled(
				 * );
				 * 
				 * AddProject_General_Information_Page.searchGeneralContractorCompanyField(
				 * driver).sendKeys(ContractorCompanyName);//Contractor name Thread.sleep(4000);
				 * AddProject_General_Information_Page.searchGeneralContractorCompanyField(
				 * driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
				 * "Project General Contractor Added Successfully");
				 * 
				 * AddProject_General_Information_Page.searchContactField(driver).sendKeys(
				 * ContractorCompanyName);//contractor name Thread.sleep(4000);
				 * AddProject_General_Information_Page.searchContactField(driver).sendKeys(Keys.
				 * TAB); test.log(LogStatus.PASS,
				 * "Project General Contractor Contact Added Successfully");
				 */

//				try {
//					wb.selectSingleValueGetOpt(AddProject_General_Information_Page.selectProjectAdministrator(driver),
//							usercompanyName);
//					test.log(LogStatus.PASS, "Project Administrator Selected Successfully");
//					System.out.println("Document Switch \t" + AddProject_General_Information_Page
//							.requiredDocumentsforEnrollmentSwitch(driver).isEnabled());
//					System.out.println("Portal Switch \t" + AddProject_General_Information_Page
//							.activateContractorPortalForThisProjectSwitch(driver).isEnabled());
//
//					AddProject_General_Information_Page.singlePrimeRedioButton(driver).isEnabled();
//
//					AddProject_General_Information_Page.searchGeneralContractorCompanyField(driver)
//							.sendKeys(ContractorCompanyName);
//
//					// Contractor name
//					Thread.sleep(2000);
//					AddProject_General_Information_Page.searchGeneralContractorCompanyField(driver).sendKeys(Keys.TAB);
//					test.log(LogStatus.PASS, "Project General Contractor Added Successfully");
//				} catch (Exception e) {
//					test.log(LogStatus.PASS, "is removed from the project level functionality in 07012021 release");
//				}
//
//				try {
//					AddProject_General_Information_Page.GeneralContractorSaveButton(driver).click();
//					test.log(LogStatus.PASS, "Project General Contractor Saved Successfully");
//				} catch (Exception e) {
//					// TODO: handle exception
//					test.log(LogStatus.PASS,
//							"is removed from the project level functionality in 07012021 release for contractor ");
//				}

				try {
					js.executeScript("window.scrollBy(0,650)");
					AddProject_General_Information_Page.contactNameField(driver).sendKeys("Jimmy");
					test.log(LogStatus.PASS, "Project Contact Name Added Successfully");
					AddProject_General_Information_Page.contactEmailField(driver).sendKeys("kiran@nourtek.net");
					test.log(LogStatus.PASS, "Project Contact Email Added Successfully");
					AddProject_General_Information_Page.contactPhoneNoField(driver)
							.sendKeys(RandomClass.randomPhoneNo());
					test.log(LogStatus.PASS, "Project Contact Phone No Added Successfully");
					AddProject_General_Information_Page.address1Field(driver).sendKeys("ABC Address");
					test.log(LogStatus.PASS, "Project Contact Address Added Successfully");
					AddProject_General_Information_Page.cityField(driver).sendKeys(RandomClass.randomState());
					test.log(LogStatus.PASS, "Project Contact State Added Successfully");
					AddProject_General_Information_Page.zipField(driver).sendKeys("123456789");
					test.log(LogStatus.PASS, "Project Contact Zip Code Added Successfully");
					wb.selectSingleValueByIndex(AddProject_General_Information_Page.selectProjectType(driver), 2);
					test.log(LogStatus.PASS, "Project Type Selected Successfully");
					wb.selectSingleValueByIndex(AddProject_General_Information_Page.selectBuildingType(driver), 2);
					test.log(LogStatus.PASS, "Project Building Type Selected Successfully");
					System.out.println(AddProject_General_Information_Page.joinVentureCheckBox(driver).isSelected());
				} catch (Exception e) {
					System.out.println("it is not availabel");
				}
				wb.scrollToEndt();
				AddProject_General_Information_Page.generalInformationSaveandContinueButton(driver).click();
				Thread.sleep(4000);
				test.log(LogStatus.PASS, "Project General Information Saved Successfully");

				// Project Setting

				// AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
				js.executeScript("arguments[0].scrollIntoView();",AddProject_General_Information_Page.projectSettings_SaveandContinueBtn(driver));
				AddProject_General_Information_Page.projectSettings_SaveandContinueBtn(driver).click();
				//driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
				test.log(LogStatus.INFO, "Clicked On Project settings Save And Continue Button");
                 Thread.sleep(2000);
				// Address tab
				AddProject_Address_Page.addAddressButton(driver).click();
				test.log(LogStatus.INFO, "Address Tab Clicked On Add Address Button ");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				Thread.sleep(4000);
				wb.selectSingleValue(AddProject_Address_Page.addAddressSelectAddressType(driver), "Mailing Address");
				test.log(LogStatus.PASS, "Address Type Selected Successfully ");
				AddProject_Address_Page.addAddressAddress1Field(driver).sendKeys("ABC Firm 1234");
				test.log(LogStatus.PASS, "Address 1 Field Added Successfully");
				AddProject_Address_Page.addAddressCityField(driver).sendKeys("California");
				test.log(LogStatus.PASS, "Address City Field Added Successfully");
				wb.selectSingleValue(AddProject_Address_Page.addAddressSelectState(driver), RandomClass.randomState());
				test.log(LogStatus.PASS, "Address State Field Added Successfully");
				AddProject_Address_Page.addAddressZipCode(driver).sendKeys("456789122");
				test.log(LogStatus.PASS, "Address Zip Code Added Successfully");
				AddProject_Address_Page.addAddressSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Close Button");
				driver.switchTo().window(wb.map.get("childID"));
				AddProject_Address_Page.nextButton(driver).click();
				test.log(LogStatus.PASS, "Address Added Successfully");

				// contacts Tab
				AddProject_Contact_Page.addNewContactsLink(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add New Contact Link");
				Thread.sleep(4000);
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));

				AddProject_Contact_Page.addNewContactsCompanyName(driver)
						.sendKeys(RandomClass.randomContractorCompanyName());
				test.log(LogStatus.PASS, "Contact Company Name Added Successfully");
				AddProject_Contact_Page.addNewContactsFirstName(driver).sendKeys("Hobs");
				test.log(LogStatus.PASS, "Contact First Name Added Successfully");
				AddProject_Contact_Page.addNewContactsLastName(driver).sendKeys("Shobs");
				test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
				AddProject_Contact_Page.addNewContactsPhoneNo(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Contact Phone No Added Successfully");
				AddProject_Contact_Page.addNewContactsEmail(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Contact Email Name Added Successfully");
				AddProject_Contact_Page.addNewContactsGeneralInfoTabSaveandContinueButton(driver).click();
				test.log(LogStatus.INFO, "Click on Save and Continue Button");
				AddProject_Contact_Page.addNewContactsGrantUserAccessCheckBox(driver).click();
				test.log(LogStatus.PASS, "Contact Grant User Access Successfully");
				AddProject_Contact_Page.addNewContactsUserAccessAccountSetupCompleteCheckBox(driver).click();
				test.log(LogStatus.PASS, "Contact Account Setup Successfully");
				AddProject_Contact_Page.addNewContactsUserAccessUserName(driver).sendKeys(RandomClass.randomUserName());
				test.log(LogStatus.PASS, "Contact User Name Added Successfully");
				AddProject_Contact_Page.addNewContactsUserAccessAutoGenerateButton(driver).click();
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "Clicked On Add New Contact Auto Generate Button");
				AddProject_Contact_Page.addNewContactsUserAccessTabSaveandCloseButton(driver).click();
				driver.switchTo().window(wb.map.get("childID"));
				test.log(LogStatus.INFO, "Clicked On User Access Tab Save and Close Button");
				Thread.sleep(1000);
				AddProject_Contact_Page.nextButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Next Button");
				AddProject_Project_Administrator_Access_Page.saveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Project Administrator Access Save and Continue Button");

				// Email Management
				
				try {
					js.executeScript("arguments[0].scrollIntoView();", AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver));
					
					AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).click();
					AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).clear();
					Thread.sleep(2000);
					js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					System.out.println("scrolled to end after clearing email feild");
				}catch (Exception e) {
					System.out.println("No such feild to scoll down");
					js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				}
				AddProject_Email_Management_Page.saveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Email Management Save and Continue Button");

				// Enrollment Setup Page
				AddProject_Enrollment_Setup_Page.saveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Enrollment Setup Save and Continue Button");

				// Payroll CV Tracking
				AddProject_PayrollCVTracking.trackPayrollForGLOnlyContractorSwitch(driver).click();
				test.log(LogStatus.INFO, "Clicked On Track Payroll for GL Only Contracts Switch");
				AddProject_PayrollCVTracking.saveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Payroll CV Tracking Save and Continue Button");
				Thread.sleep(6000);

				AddProject_Premium_Modification_Page.saveAndContinueButton(driver).click();

				try {
					AddProject_Compliance_Page.nextButton(driver).click();
					test.log(LogStatus.INFO, "Clicked On Compliance Next Button");
				} catch (Throwable e) {
					System.out.println(e);
				}

				Thread.sleep(4000);
				// comment a code because there is a huge changes in policy certificate tab
				// certificate Tab

				/*
				 * AddProject_Certificate_Page.descriptionOperationsTextAreaBold(driver).click()
				 * ; AddProject_Certificate_Page.selectCompanyNameToken(driver).click();
				 * test.log(LogStatus.PASS,
				 * "Certificate Company Name Token Added Successfully");
				 * AddProject_Certificate_Page.selectProgramNameToken(driver).click();
				 * test.log(LogStatus.PASS,
				 * "Certificate Program Name Token Added Successfully");
				 * AddProject_Certificate_Page.selectProjectStartDateToken(driver).click();
				 * test.log(LogStatus.PASS, "Certificate Start Date Token Added Successfully");
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("arguments[0].click();",AddProject_Certificate_Page.
				 * projectSpecificPolicyRadioBtn(driver)); test.log(LogStatus.INFO,
				 * "Selected Project Specific Policy Radio Button"); // WebElement
				 * element=AddProject_Certificate_Page.projectSpecificPolicyRadioBtn(driver);//
				 * now change to radio button // WebDriverWait wait = new WebDriverWait(driver,
				 * 10); // wait.until(ExpectedConditions.visibilityOf(element)); //
				 * wait.until(ExpectedConditions.elementToBeClickable(element)); //
				 * element.click();
				 */

				AddProject_Certificate_Page.BtnAddProjectSpecificPolicyYes(driver).click();
				AddProject_Certificate_Page.BtnInheritProgramLevelPolicyYes(driver).click();
				AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver).click();
				Thread.sleep(4000);
				AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Excess").click();
				AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
				Thread.sleep(3000);
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				driver.manage().window().maximize();
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "Clicked On Add Project Specific Policy Button");
				wb.selectSingleValueByIndex(AddProject_Certificate_Page.addUmbPolSelectCarrier(driver), 11);
				test.log(LogStatus.PASS, "UMB Policy Carrier Selected Successfully");
				wb.selectSingleValue(AddProject_Certificate_Page.addUmbPolSelectLayer(driver), "2");
				test.log(LogStatus.PASS, "UMB Policy Layer Selected Successfully");
				AddProject_Certificate_Page.addUmbPolEnterPolicyNumberField(driver).sendKeys("45781354");
				test.log(LogStatus.PASS, "UMB Policy No Added Successfully");
				AddProject_Certificate_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys("10/05/2019");
				test.log(LogStatus.PASS, "UMB Policy Effective Date Added Successfully");
				AddProject_Certificate_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys("10/12/2021");
				test.log(LogStatus.PASS, "UMB Policy Expiration Date Added Successfully");
				AddProject_Certificate_Page.addUmbPolProgramStartDateAsEffectiveDate(driver).click();
				test.log(LogStatus.PASS, "UMB Policy Program Start Date As A Effective Date Radio Button Selected");
				AddProject_Certificate_Page.addUmbPolPolicyExpirationDateAsCompletionDate(driver).click();
				test.log(LogStatus.PASS, "UMB Policy Policy Expiration Date As Completion Date Radio Button Selected");
				AddProject_Certificate_Page.addUmbPolEacyOccurrenceField(driver).sendKeys("100000");
				test.log(LogStatus.PASS, "UMB Policy Each Occurrence Added Successfully");
				AddProject_Certificate_Page.addUmbPolEacyAggregateField(driver).sendKeys("10000");
				test.log(LogStatus.PASS, "UMB Policy Aggregate Added Successfully");

				js.executeScript("arguments[0].click();", AddProject_Certificate_Page.addUmbPolSaveAndCloseBtn(driver));
//				AddProject_Certificate_Page.addUmbPolSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On UMB Policy Save and Close Button");
				Thread.sleep(4000);
				driver.switchTo().window(wb.map.get("childID"));

				/*
				 * WebElement element1=AddProject_Certificate_Page.
				 * enterSecondPageCertificateTextifrequiredSwitch(driver); WebDriverWait wait1 =
				 * new WebDriverWait(driver, 10);
				 * wait1.until(ExpectedConditions.visibilityOf(element1));
				 * wait1.until(ExpectedConditions.elementToBeClickable(element1));
				 * element1.click(); test.log(LogStatus.INFO,
				 * "Clicked On Second Page Certificate Switch");
				 * AddProject_Certificate_Page.secondCertificateTypeAccord101(driver).click();
				 * test.log(LogStatus.PASS, "Select Cirtificate Type As Acord 101 ");
				 * AddProject_Certificate_Page.secondCertificateDetailsTextAreaBold(driver).
				 * click();
				 * AddProject_Certificate_Page.secondCertificateSelectProgramNameToken(driver).
				 * click(); test.log(LogStatus.PASS, "Program Name Token Added Successfully");
				 * AddProject_Certificate_Page.secondCertificateSelectProjectNameToken(driver).
				 * click(); Thread.sleep(1000); test.log(LogStatus.PASS,
				 * "Project Name Token Added Successfully");
				 * AddProject_Certificate_Page.additionalNameInsuredClickHereLink(driver).click(
				 * ); //
				 * AddProject_Certificate_Page.additionalNameInsuredAddbutton(driver).click();
				 * test.log(LogStatus.INFO, "Click on Add Additional Name Isured Button");
				 * wb.selectSingleValueByIndex(AddProject_Certificate_Page.
				 * additionalNameInsuredSelectAdditionalNameInsured(driver), 9);
				 * test.log(LogStatus.PASS, "Insured Additional Name Selected Successfully");
				 * AddProject_Certificate_Page.additionalNameInsuredSearchForInsuranceCompany(
				 * driver).sendKeys("ABC insurance"); Thread.sleep(4000);
				 * AddProject_Certificate_Page.additionalNameInsuredSearchForInsuranceCompany(
				 * driver).sendKeys(Keys.TAB);
				 * AddProject_Certificate_Page.additionalNameInsuredSearchForInsuranceCompany(
				 * driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
				 * "Additional Name Insurance Company Added Successfully"); //
				 * AddProject_Certificate_Page.additionalNameInsuredTextAreaBold(driver).click()
				 * ; AddProject_Certificate_Page.additionalNameInsuredSelectCompanyNameToken(
				 * driver).click(); test.log(LogStatus.PASS,
				 * "Additional Insured Company Name Token Added Successfully");
				 * AddProject_Certificate_Page.additionalNameInsuredSelectProgramNameToken(
				 * driver).click(); test.log(LogStatus.PASS,
				 * "Additional Insured Program Name Token Added Successfully");
				 * AddProject_Certificate_Page.additionalNameInsuredSaveButton(driver).click();
				 * test.log(LogStatus.INFO, "Clicked On Additional Insured Save Button");
				 * 
				 */
				Thread.sleep(7000);
				js.executeScript("window.scrollBy(0,450)", "");// Scroll down
				wb.waitForElemnet(AddProject_Certificate_Page.saveAndContinueButton(driver));
				test.log(LogStatus.PASS, "Clicked On Crtificate Page Save And Continue Button ");
				Thread.sleep(7000);

//change order				
				wb.waitForElemnet(AddProject_Change_Order_Page.addChnageOrderbtn(driver));
				test.log(LogStatus.PASS, "Clicked On Add Change Order Button ");
				AddProject_Change_Order_Page.additionalContractValueTextField(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "Change Order Additional Contract Value Added Succesfully ");
				AddProject_Change_Order_Page.effectiveDate(driver).sendKeys("01/01/2020", Keys.TAB);
				test.log(LogStatus.PASS, "Change Order Effective Date Added Succesfully ");
				AddProject_Change_Order_Page.newEstimatedCompletionDate(driver).sendKeys("01/01/2021", Keys.TAB);
				test.log(LogStatus.PASS, "Change Order Completion Date Added Succesfully ");
				AddProject_Change_Order_Page.changeOrderNo(driver).sendKeys("chnageOrderNo123");
				test.log(LogStatus.PASS, "Change Order Number Added Succesfully ");
				AddProject_Change_Order_Page.descriptionField(driver).sendKeys("Testing");
				test.log(LogStatus.PASS, "Change Order Description Added Succesfully ");
				AddProject_Change_Order_Page.changeOrderSaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Change Order Save and Close Button ");

				AddProject_Change_Order_Page.finishAndClose(driver).click();
				test.log(LogStatus.PASS, "Clicked On Finish And Close Button ");
				System.out.println("Project Added Successfully");
				test.log(LogStatus.PASS, " " + projectName + " Project Added Successfully");
				driver.switchTo().window(wb.map.get("parentID"));
				Thread.sleep(4000);

				break;

			case "AddProgram":
				test.log(LogStatus.INFO, "========== Add Program Section  ==========");
				HomePage.controlMenuHomeIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked On Home Icon");
				HomePage.HomeMenuPrograms(driver).click();
				test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
				Thread.sleep(4000);
				ProgramModule.programAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked On Program Add Icon");
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				wb.windowScrollBy(0, 1000);

				// JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollBy(0,500)");

				AddProgram_General_Info_Page.programName(driver).sendKeys(programName);
				test.log(LogStatus.PASS, "Program Name Added Successfully");
//				AddProgram_General_Info_Page.programCode(driver).sendKeys(RandomClass.randomProgramCode());
//				test.log(LogStatus.PASS, "Program Code Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectPolicyType(driver), 0);
				test.log(LogStatus.PASS, "Program Policy Type Selected Successfully");
				wb.selectSingleValueByIndex(AddProgram_General_Info_Page.selectProgramType(driver), 1);
				test.log(LogStatus.PASS, "Program Type Selected Successfully");
				wb.selectSingleValueGetOpt(AddProgram_General_Info_Page.selectProgramAdministrator(driver),
						usercompanyName);// 9
				test.log(LogStatus.PASS, "Program Administrator Selected Successfully");
				wb.selectSingleValueGetOpt(AddProgram_General_Info_Page.selectProgramSponsor(driver), sponsorName);// 14
				test.log(LogStatus.PASS, "Program Sponsor Selected Successfully");

				List<WebElement> lst = AddProgram_General_Info_Page.selectAllStatusSwitch(driver);
				System.out.println("Size of Status Switch " + lst.size());
				for (int p = 0; p < lst.size() - 1; p++) {
					js.executeScript("arguments[0].click();", lst.get(p));
//						lst.get(i).click();
					Thread.sleep(1000);
					js.executeScript("window.scrollBy(0,50)");
				}

				test.log(LogStatus.PASS, "Track Offsite Coverage Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Manage CIP Certificates Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Loss Control & Safety Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Insurance Cost Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Excluded Contractors Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Fixed Cost / Time and Material Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Rates and Fees Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Maintenance Wrap Switch Turn On  Successfully");
				test.log(LogStatus.PASS, "Track Capped/Uncapped Payroll Switch Turn On  Successfully");

				AddProgram_General_Info_Page.contactName(driver).sendKeys("Shaun Gibbs");
				test.log(LogStatus.PASS, "Program Contact Name Added Successfully");
				AddProgram_General_Info_Page.emailAddress(driver).sendKeys("kiran@nourtek.net");
				test.log(LogStatus.PASS, "Program Contact Email ID Added Successfully");
				AddProgram_General_Info_Page.telephoneNumber(driver).sendKeys(RandomClass.randomPhoneNo());
				test.log(LogStatus.PASS, "Program  Contact Phone No Added Successfully");
				wb.selectSingleValue(AddProgram_General_Info_Page.selectBidType(driver), "Bid Deduct");
				Thread.sleep(4000);
				test.log(LogStatus.PASS, "Program Bid Type Selected Successfully");
				AddProgram_General_Info_Page.estimatedProgramConstructionValue(driver).sendKeys("1500000");
				test.log(LogStatus.PASS, "Program Construction Value Added Successfully");
				AddProgram_General_Info_Page.programBeginDate(driver).sendKeys("01/20/2018");
				test.log(LogStatus.PASS, "Program Begin Date Added Successfully");
				AddProgram_General_Info_Page.programBeginDate(driver).sendKeys(Keys.TAB);
				AddProgram_General_Info_Page.programCompletionDate(driver).sendKeys("01/20/2022");
				test.log(LogStatus.PASS, "Program Estimated Completion Date Added Successfully");
				AddProgram_General_Info_Page.programCompletionDate(driver).sendKeys(Keys.TAB);
				AddProgram_General_Info_Page.programProjectedLosses(driver).sendKeys("10000");
				test.log(LogStatus.PASS, "Projected Losses Added Successfully");
				AddProgram_General_Info_Page.totalprogramDeduct(driver).sendKeys("11000");
				test.log(LogStatus.PASS, "Program Insurance Cost Added Successfully");
				AddProgram_General_Info_Page.estimatedPayroll(driver).sendKeys("12000");
				test.log(LogStatus.PASS, "Program Estimated Payroll Added Successfully");
				AddProgram_General_Info_Page.estimatedHours(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "Program Estimated Hours Added Successfully");
				Thread.sleep(4000);
				String programMinRate = AddProgram_General_Info_Page.programMinimumRate(driver).getText();
				test.log(LogStatus.PASS, "" + programMinRate + "91.67 Program Minimum Rate Fetched");
				String programMaxRate = AddProgram_General_Info_Page.programMaximumRate(driver).getText();
				test.log(LogStatus.PASS, "" + programMaxRate + "175.00 Program Maximum Rate Fetched");
				Thread.sleep(4000);
				AddProgram_General_Info_Page.saveButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save Button");
				Thread.sleep(3000);
				AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Save And Continue Button");

				// Program Setting new page 26-11-2020

				// AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
				driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
				test.log(LogStatus.INFO, "Clicked On Program settings Save And Continue Button");
				Thread.sleep(4000);

				try {
					AddProgram_Program_Parameters_Page.minimumContractValue(driver).clear();
					AddProgram_Program_Parameters_Page.minimumContractValue(driver).sendKeys("150000");
					test.log(LogStatus.PASS, "Minimum Contract Value Added Successfully");
					AddProgram_Program_Parameters_Page.minimumManHours(driver).clear();
					AddProgram_Program_Parameters_Page.minimumManHours(driver).sendKeys("1000");
					test.log(LogStatus.PASS, "Minimum Man-Hours Added Successfully");
					AddProgram_Program_Parameters_Page.minimumPayroll(driver).clear();
					AddProgram_Program_Parameters_Page.minimumPayroll(driver).sendKeys("12000");
					test.log(LogStatus.PASS, "Minimum Payroll Added Successfully");
					AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).clear();
					AddProgram_Program_Parameters_Page.minimumDaysonJobSite(driver).sendKeys("1000");
					test.log(LogStatus.PASS, "Minimum Days On Job Site Added Successfully");

					// AddProgram_Program_Parameters_Page.addTradeClickHereLink(driver).click();
					// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys("test");
					// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.ARROW_DOWN);
					// AddProgram_Program_Parameters_Page.searchForTradeField(driver).sendKeys(Keys.TAB);
					// AddProgram_Program_Parameters_Page.descriptionTradeField(driver).sendKeys("Test
					// decription");
					// AddProgram_Program_Parameters_Page.addTradePlusButton(driver).click();

					// AddProgram_Program_Parameters_Page.addWorkClassClickHereLink(driver).click();
					// wb.selectSingleValue(AddProgram_Program_Parameters_Page.searchForWorkClassField(driver),"02120
					// | new wc 12 feb");
					// AddProgram_Program_Parameters_Page.addWorkClassPlusButton(driver).click();

//				JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					Thread.sleep(1000);
					AddProgram_Program_Parameters_Page.switchenableContractorNumber(driver).click();
					test.log(LogStatus.INFO, "Clicked On Enable Contractor Number Switch");
					AddProgram_Program_Parameters_Page.createContractorNumberTemplateTextArea(driver).click();
					AddProgram_Program_Parameters_Page.selectTokenProgramCode(driver).click();
					AddProgram_Program_Parameters_Page.selectTokenSponsorCode(driver).click();
					test.log(LogStatus.PASS, "Contract Number Template Project Code Token Added Successfully");
					test.log(LogStatus.PASS, "Contract Number Template Sponsor Code Token Added Successfully");
					AddProgram_Program_Parameters_Page.selectContractSequenceField(driver).sendKeys("25");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, "Contract Number Sequence Added Successfully");

					// Location code done on 11/03/2020
					AddProgram_Program_Parameters_Page.switchLocationCode(driver).click();
					test.log(LogStatus.INFO, "Location Code Switch Selected Successfully");
//				System.out.println("Loaction Code is selected or Not :-"+AddProgram_Program_Parameters_Page.switchLocationCode(driver).isSelected());
//				test.log(LogStatus.PASS, "Contract Number Sequence Added Successfully");
					AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProgramCode(driver).click();
					test.log(LogStatus.PASS, "Location Code Token Program Code Added Successfully");
					AddProgram_Program_Parameters_Page.selectLocationCodeToken_ProjectCode(driver).click();
					test.log(LogStatus.PASS, "Location Code Token Project Code Added Successfully");
					AddProgram_Program_Parameters_Page.selectLocationCodeSequenceField(driver).sendKeys("1234");
					test.log(LogStatus.PASS, "Location Code Sequence Added Successfully");

					AddProgram_Program_Parameters_Page.switchHighEMR(driver).click();
					test.log(LogStatus.INFO, "High EMR Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.ModeRateValueEMR(driver).sendKeys("10");
					test.log(LogStatus.PASS, "Mode Rate Value Added Successfully");

					AddProgram_Program_Parameters_Page.switchModRateAlertContractor(driver).click();
					Thread.sleep(1000);
					test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");
					js.executeScript("window.scrollBy(0,100)");

					AddProgram_Program_Parameters_Page.switchCloseoutVariance(driver).click();
					test.log(LogStatus.INFO, "Closeout Payroll Variance Alert Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.closeoutVarianceLowerValue(driver).sendKeys("10");
					test.log(LogStatus.PASS, "Closeout Variance Lower Value Added Successfully");
					AddProgram_Program_Parameters_Page.closeoutVarianceHigherValue(driver).sendKeys("20");
					test.log(LogStatus.PASS, "Closeout Variance Higher Value Added Successfully");
					AddProgram_Program_Parameters_Page.switchCloseoutVarianceAlertContractor(driver).click();
					Thread.sleep(1000);
					test.log(LogStatus.INFO,
							"Alert Contractor For Payroll Closeout Variance Switch Turn On Successfully");

					AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlert(driver).click();
					test.log(LogStatus.INFO, "Closeout Contract Value Variance Alert Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertLowerValue(driver).sendKeys("10");
					test.log(LogStatus.PASS, "Closeout Contract Value Variance Alert Lower Value Added Successfully");
					AddProgram_Program_Parameters_Page.closeout_CV_VarianceAlertHigherValue(driver).sendKeys("20");
					test.log(LogStatus.PASS, "Closeout Contract Value Variance Alert Higher Value Added Successfully");
					AddProgram_Program_Parameters_Page.switchCloseout_CV_VarianceAlertContractor(driver).click();
					Thread.sleep(1000);
					test.log(LogStatus.INFO, "Alert Contractor CV Closeout Variance Switch Turn On Successfully");

					AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_Ratio(driver).click();
					test.log(LogStatus.INFO, "Estimated Payroll to CV Ratio High/Low Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioBelowValue(driver).clear();
					AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioBelowValue(driver).sendKeys("10");
					test.log(LogStatus.PASS, "Estimated Payroll to CV Ratio Below Value Added Successfully");
					AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioAboveValue(driver).clear();
					AddProgram_Program_Parameters_Page.estimatedPayrollTo_CV_RatioAboveValue(driver).sendKeys("20");
					test.log(LogStatus.PASS, "Estimated Payroll to CV Ratio Above Value Added Successfully");
					AddProgram_Program_Parameters_Page.switchEstimatedPayrollTo_CV_RatioAlertContractor(driver).click();
					Thread.sleep(1000);
					test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");

					AddProgram_Program_Parameters_Page.switchEstimatedPayrollToSelfPerformRatio(driver).click();
					test.log(LogStatus.INFO,
							"Estimated Payroll to Self Performed Value Ratio High/Low Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioBelowValue(driver).click();
					test.log(LogStatus.PASS,
							"Estimated Payroll to Self Performed Value Ratio Below Value Added Successfully");
					AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAboveValue(driver).click();
					test.log(LogStatus.PASS,
							"Estimated Payroll to Self Performed Value Ratio Above Value Added Successfully");
					AddProgram_Program_Parameters_Page.estimatedPayrollToSelfPerformRatioAlertContractor(driver)
							.click();
					Thread.sleep(1000);
					test.log(LogStatus.INFO, "Alert Contractor During Enrollment Switch Turn On Successfully");

					AddProgram_Program_Parameters_Page.switchAlertForWorkClassRates(driver).click();
					test.log(LogStatus.INFO, "Alert for Work Class Rates Switch Turn On Successfully");
					AddProgram_Program_Parameters_Page.workClassRatesBenchmarkLowerValue(driver).sendKeys("10");
					test.log(LogStatus.PASS, "Work Class Rates Benchmark Lower Value Added Successfully");
					AddProgram_Program_Parameters_Page.workClassRatesBenchmarkHigherValue(driver).sendKeys("20");
					test.log(LogStatus.PASS, "Work Class Rates Benchmark Higher Value Added Successfully");
					AddProgram_Program_Parameters_Page.workClassRatesLow_High_LowerValue(driver).sendKeys("15");
					test.log(LogStatus.PASS, "Work Class Rates Lower Value Added Successfully");
					AddProgram_Program_Parameters_Page.workClassRatesLow_High_HigherValue(driver).sendKeys("25");
					test.log(LogStatus.PASS, "Work Class Rates Above Value Added Successfully");
					Thread.sleep(1000);

					// because of changes below code is comment they add this functionality at
					// payroll cv tracking

					/*
					 * AddProgram_Program_Parameters_Page.addSuspendedPayrollLink(driver).click();
					 * test.log(LogStatus.INFO, "Clicked On Add Suspended Payroll Link");
					 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
					 * AddProgram_Program_Parameters_Page.addSuspendedPayrollStartDate(driver).
					 * sendKeys("05/01/2019"); test.log(LogStatus.PASS,
					 * "Suspended Payroll Start Date Added Successfully");
					 * AddProgram_Program_Parameters_Page.addSuspendedPayrollEndDate(driver).
					 * sendKeys("05/30/2019"); test.log(LogStatus.PASS,
					 * "Suspended Payroll End Date Added Successfully");
					 * AddProgram_Program_Parameters_Page.addSuspendedPayrollNotes(driver).
					 * sendKeys("Testing Notes suspended payroll"); test.log(LogStatus.PASS,
					 * "Suspended Payroll Notes Added Successfully");
					 * AddProgram_Program_Parameters_Page.addSuspendedPayrollSaveAndCloseButton(
					 * driver).click(); Thread.sleep(1000); test.log(LogStatus.INFO,
					 * "Clicked On Suspended Payroll Save And Close Button");
					 * driver.switchTo().window(wb.map.get("childID"));
					 * js.executeScript("window.scrollBy(0,250)");
					 */

					AddProgram_Program_Parameters_Page.programParameterSaveAndContinueButton(driver).click();
					test.log(LogStatus.INFO, "Clicked On Program Parameter Save And Continue Button");
				} catch (Exception e) {
					System.out.println(e);
					test.log(LogStatus.FAIL, "Program Parameter Test Has Been Failed");
				}

				// Email Management page
				Thread.sleep(5000);
				
				try {
					js.executeScript("arguments[0].scrollIntoView();", AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver));
					AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).click();
					AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).clear();
					Thread.sleep(2000);
					//AddProgram_Email_Management_Page.AssignedStatusFollowup_EmailFeild(driver).sendKeys(null);
				}catch (Exception e) {
					System.out.println("can not use java script for Senckeys");
				}
				
				js.executeScript("arguments[0].scrollIntoView();",AddProgram_Email_Management_Page.emailManagementSaveAndContinueButton(driver));
				//js.executeScript("window.scrollBy(0,4000)");
				// js.executeScript("arguments[0].click();",AddProject_Email_Management_Page.saveAndContinueButton(driver));
				js.executeScript("arguments[0].click();",
						AddProgram_Email_Management_Page.emailManagementSaveAndContinueButton(driver));// raja
				test.log(LogStatus.INFO, "Clicked On Email Management Save And Continue Button");

				// Contractor Portal options page
				AddProgram_Contractor_Portal_Options_Page.switchActivateContractorPortalForThisProgram(driver).click();
				test.log(LogStatus.INFO, "Activate Contractor Portal For This Program Switch Turns On Successfully");
				try {
					wb.oneByOneClick(AddProgram_Contractor_Portal_Options_Page
							.switchContractorPortal_GC_SUBS_AllSwitchs(driver));
				} catch (Throwable e) {
					System.out.println(e);
				}

				test.log(LogStatus.PASS, "Certificate For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Certificate For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS, "Claims For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Claims For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS, "Change Order For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Change Order For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS, "Loss Control & Safety For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Loss Control & Safety For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS, "Close Out For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Close Out For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS,
						"Close Out Dashboard Alert For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Close Out Dashboard Alert For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS, "Close Out Audit For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Close Out Audit For Sub Contractor Switch Turn On Successfully");

				test.log(LogStatus.PASS,
						"Auto Confirm Monthly Payroll For General Contractor Switch Turn On Successfully");
				test.log(LogStatus.PASS, "Auto Confirm Monthly Payroll For Sub Contractor Switch Turn On Successfully");

				// swtich remove might be need to check 05/11/2020
				/*
				 * AddProgram_Contractor_Portal_Options_Page.switchRequestSubinfoAtEnrollment(
				 * driver).click(); test.log(LogStatus.PASS,
				 * "Request Sub Info at Enrollment Switch Turn On Successfully");
				 * 
				 * AddProgram_Contractor_Portal_Options_Page.switchAllowContractorToAddSub(
				 * driver).click(); test.log(LogStatus.PASS,
				 * "Allow Contractor To Add New Sub Switch Turn On Successfully");
				 * AddProgram_Contractor_Portal_Options_Page.switchAllow_GC_AddContractorNumber(
				 * driver).click(); test.log(LogStatus.PASS,
				 * "Allow General Contractor to add Contract Number Switch Turn On Successfully"
				 * ); AddProgram_Contractor_Portal_Options_Page.
				 * switchAllow_SubContractor_AddContractorNumber(driver).click();
				 * test.log(LogStatus.PASS,
				 * "Allow Sub Contractor to add Contract Number  Switch Turn On Successfully");
				 */
				AddProgram_Contractor_Portal_Options_Page.contractorPortalSaveAndContinueButton(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.INFO, "Clicked On Contractor Portal Options Save And Continue Button");

				AddProgram_User_Access.addSponsorAddButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add Sponsor Button");
				wb.selectSingleValueByIndex(AddProgram_User_Access.selectSponsorDropdown(driver), 1);// select another
																										// sponsor
				Thread.sleep(4000);
				test.log(LogStatus.PASS, "Sponsor Slected Successfully");
				AddProgram_User_Access.addSponsorPlusButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Plus Button");
				AddProgram_User_Access.addAdministratorAddButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Add Administrator Button");
				wb.selectSingleValueByIndex(AddProgram_User_Access.selectNodeAdministratorDropdown(driver), 1);// select
																												// another
																												// user
				Thread.sleep(4000);
				test.log(LogStatus.PASS, "Administrator Added Successfully");
				AddProgram_User_Access.addAdministratorPlusButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On Plus Button");

				AddProgram_User_Access.userAccessPortalSaveAndContinueButton(driver).click();
				test.log(LogStatus.INFO, "Clicked On User Access Save And Continue Button");

				/*
				 * AddProgram_User_Access.userAccessFinishAndCloseButton(driver).click();
				 * test.log(LogStatus.INFO, "Clicked On User Access Finish And Close Button");
				 * try { Alert alt=driver.switchTo().alert(); alt.accept(); } catch (Throwable
				 * e) { System.out.println(e+"Exception handel for alert"); }
				 */

				// payroll cv tracking page added on 18/05/2020
				AddProgram_PayrollCVTracking.trackCappedUncappedPayrollSwitch(driver).click();
				test.log(LogStatus.PASS, "Clicked On Track Capped Uncapped Payroll Switch");
				AddProgram_PayrollCVTracking.trackReceiptValueSwitch(driver).click();
				test.log(LogStatus.INFO, "Clicked On Track Receipt Switch");
				AddProgram_PayrollCVTracking.trackPayrollGLOnlyContractsSwitch(driver).click();
				test.log(LogStatus.INFO, "Clicked On Track Payroll For GL Only Contracts");
				AddProgram_PayrollCVTracking.saveAndContinueBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked On Payroll CV Tracking Save And Continue Button");
				Thread.sleep(7000);

				/*
				 * // Compliance Page
				 * 
				 * AddProgram_Compliance_Page.addCompliancePlusIcon(driver).click();
				 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
				 * wait.until(ExpectedConditions
				 * .visibilityOf(AddProgram_Compliance_Page.addComplianceComplianceName(driver))
				 * ); wait.until(ExpectedConditions
				 * .elementToBeClickable(AddProgram_Compliance_Page.addComplianceComplianceName(
				 * driver)));
				 * AddProgram_Compliance_Page.addComplianceComplianceName(driver).sendKeys(
				 * "Compliance29"); Thread.sleep(1000);
				 * AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver,
				 * "Automobile Liability").click(); Thread.sleep(1000); //
				 * AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Automobile //
				 * Liability").sendKeys("1000"); Thread.sleep(1000); //
				 * AddProgram_Compliance_Page.addSecondRowLimitText(driver,
				 * "Automobile Liability").sendKeys("1000"); // Thread.sleep(1000);
				 * AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver,
				 * "General Liability").click(); Thread.sleep(1000); //
				 * AddProgram_Compliance_Page.addFirstRowLimitText(driver, "General //
				 * Liability").sendKeys("1000"); Thread.sleep(1000); //
				 * AddProgram_Compliance_Page.addSecondRowLimitText(driver,
				 * "General Liability").sendKeys("1000");
				 * 
				 * AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver,
				 * "Umbrella / Excess").click(); Thread.sleep(1000); //
				 * AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Umbrella / //
				 * Excess").sendKeys("1000");
				 * 
				 * 
				 * AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver,
				 * "Workers' Compensation").click(); Thread.sleep(1000);
				 * AddProgram_Compliance_Page.addFirstRowLimitText(driver,
				 * "Workers' Compensation").sendKeys("1000"); Thread.sleep(1000);
				 * 
				 * AddProgram_Compliance_Page.addCompliancenoteTextArea(driver).
				 * sendKeys("Testing Note Area"); Thread.sleep(1000);
				 * js.executeScript("arguments[0].scrollIntoView();",
				 * AddProgram_Compliance_Page.addComplianceSaveAndCloseButton(driver));
				 * AddProgram_Compliance_Page.addComplianceSaveAndCloseButton(driver).click();
				 * wait.until(ExpectedConditions.visibilityOf(AddProgram_Compliance_Page.
				 * addComplianceAlertOkBtn(driver))); wait.until(ExpectedConditions
				 * .elementToBeClickable(AddProgram_Compliance_Page.addComplianceAlertOkBtn(
				 * driver)));
				 * AddProgram_Compliance_Page.addComplianceAlertOkBtn(driver).click();
				 * driver.switchTo().window(wb.map.get("childID"));
				 */

				
				//Raja 
				//Compliance Page		
				AddProgram_Compliance_Page.addCompliancePlusIcon(driver).click();
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				wait.until(ExpectedConditions.visibilityOf(AddProgram_Compliance_Page.addComplianceComplianceName(driver)));
				wait.until(ExpectedConditions
						.elementToBeClickable(AddProgram_Compliance_Page.addComplianceComplianceName(driver)));
				AddProgram_Compliance_Page.addComplianceComplianceName(driver).sendKeys("Compliance29");
				Thread.sleep(1000);
				
				
				// raja wrote this as chaged in 20-02-2021 release
				AddProgram_Compliance_Page.ComplianceName_SaveandContinueBtn(driver).click();
				test.log(LogStatus.PASS, "compliance name page save and continue button is clicked");
				Thread.sleep(2000);
				js.executeScript("arguments[0].scrollIntoView();",
						AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Automobile Liability"));
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Automobile Liability").click();
				Thread.sleep(1000);
				// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Automobile
				// Liability").sendKeys("1000");
				Thread.sleep(1000);
//				AddProgram_Compliance_Page.addSecondRowLimitText(driver, "Automobile Liability").sendKeys("1000");
//				Thread.sleep(1000);
				js.executeScript("arguments[0].scrollIntoView();",
						AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "General Liability"));
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "General Liability").click();
				Thread.sleep(1000);
				// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "General
				// Liability").sendKeys("1000");
				Thread.sleep(1000);
//				AddProgram_Compliance_Page.addSecondRowLimitText(driver, "General Liability").sendKeys("1000");
				js.executeScript("arguments[0].scrollIntoView();",
						AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Umbrella / Excess"));
				AddProgram_Compliance_Page.selectCheckBoxForCompliance(driver, "Umbrella / Excess").click();
				Thread.sleep(1000);
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(1000);
				AddProgram_Compliance_Page.CoverageType_saveandcontinueBtn(driver).click();
				Thread.sleep(1000);
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				AddProgram_Compliance_Page.CoverageType_SaveandContinueBtn(driver).click();
				test.log(LogStatus.PASS, "save and continue button is clicked");
				// AddProgram_Compliance_Page.addFirstRowLimitText(driver, "Umbrella /
				// Excess").sendKeys("1000");
				// criteria
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				AddProgram_Compliance_Page.Criteria_SaveandCloseBtn(driver).click();
				Thread.sleep(2000);

				try {
					AddProgram_Compliance_Page.addComplianceAlertOkBtn(driver).click();
				} catch (Exception e) {
					System.out.println("No such alert");
				}
				

				Thread.sleep(4000);
				driver.switchTo().window(wb.map.get("childID"));
				js.executeScript("arguments[0].scrollIntoView();",AddProgram_Compliance_Page.saveAndContinueButton(driver));
				js.executeScript("arguments[0].click();", AddProgram_Compliance_Page.saveAndContinueButton(driver));
				test.log(LogStatus.INFO, "Clicked On Compliance Save And Continue Button");
				Thread.sleep(7000);

				// Premium Modification Page
				AddProgram_Premium_Modification_Page.switchGeneralLaibility(driver).click();
				test.log(LogStatus.PASS, "General Liability Switch is Turned ON");
				AddProgram_Premium_Modification_Page.GL_factorField(driver).sendKeys("10.00");
				test.log(LogStatus.PASS, "General Liability Factor Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.GL_SelectRateBased(driver), 2);
				test.log(LogStatus.PASS, "General Liability Rate Based Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.GL_SelectRatePer(driver), 3);
				test.log(LogStatus.PASS, "General Liability Factor Per Successfully");

				AddProgram_Premium_Modification_Page.switchUMB(driver).click();
				test.log(LogStatus.PASS, "Umbrella Switch is Turned ON");
				AddProgram_Premium_Modification_Page.UMB_factorField(driver).sendKeys("10.00");
				test.log(LogStatus.PASS, "Umbrella Factor Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.UMB_SelectRateBased(driver), 2);
				test.log(LogStatus.PASS, "Umbrella Rate Based Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.UMB_SelectRatePer(driver), 3);
				test.log(LogStatus.PASS, "Umbrella Factor Per Successfully");

				AddProgram_Premium_Modification_Page.switchPollutionCharge(driver).click();
				test.log(LogStatus.PASS, "Pollution Charge Switch is Turned ON");
				AddProgram_Premium_Modification_Page.Pollution_factorField(driver).sendKeys("10.00");
				test.log(LogStatus.PASS, "Pollution Charge Factor Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.Pollution_SelectRateBased(driver), 2);
				test.log(LogStatus.PASS, "Pollution Charge Rate Based Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Premium_Modification_Page.Pollution_SelectRatePer(driver), 3);
				test.log(LogStatus.PASS, "Pollution Charge Factor Per Successfully");
				// comment due to contractor package code not design according to this
				/*
				 * AddProgram_Premium_Modification_Page.switchGLCodesRequired(driver).click();
				 * test.log(LogStatus.PASS,
				 * "General Liability Codes Required Switch is Turned ON");
				 * AddProgram_Premium_Modification_Page.switchUMBCodesRequired(driver).click();
				 * test.log(LogStatus.PASS, "Umbrella Codes Required Switch is Turned ON");
				 * AddProgram_Premium_Modification_Page.switchPollutionCodesRequired(driver).
				 * click(); test.log(LogStatus.PASS,
				 * "Pollution Codes Required Switch is Turned ON");
				 */
				AddProgram_Premium_Modification_Page.switchGLDropDown(driver).click();
				test.log(LogStatus.PASS, "Umbrella Code Required Switch is Turned ON");

				AddProgram_Premium_Modification_Page.switchGLDeductibleSIRLoss(driver).click();
				test.log(LogStatus.PASS, "GL Deductible/SIR Loss Charge Switch is Turned ON");
				AddProgram_Premium_Modification_Page.switchCaptureGLDeductible(driver).click();
				test.log(LogStatus.PASS, "Capture WC Deductible Switch is Turned ON");
				AddProgram_Premium_Modification_Page.switchCaptureWCDeductible(driver).click();
				test.log(LogStatus.PASS, "Capture GL Deductible Switch is Turned ON");
//				AddProgram_Premium_Modification_Page.radioBtnAutomaticProfitOverhead(driver).click();
//				test.log(LogStatus.PASS, "Profit & Overhead Switch is Turned ON");

				AddProgram_Premium_Modification_Page.premiumModificationSaveAndContinueButton(driver).click();
				test.log(LogStatus.PASS, "Clicked on Premium Modification Save and Continue Button");

				// Policy & Certificate section
				AddProgram_Policy_Certificates_Page.btnOpenWorkersCompensation(driver).click();
				test.log(LogStatus.PASS, "Clicked on Open WC Policy Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));

				wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addWCPolicySelectCarrier(driver), 3);
				test.log(LogStatus.PASS, "WC Policy Carrier Selected Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyFieldMasterPolicy(driver)
						.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
				test.log(LogStatus.PASS, "WC Policy Master Policy Number Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
				test.log(LogStatus.PASS, "WC Policy Effective Date Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCpolicyExpirationDate(driver).sendKeys("10/10/2021");
				test.log(LogStatus.PASS, "WC Policy Expiration Date Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
				test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyPolicyExpirationDateAsCompletionDate(driver).click();
				test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");

				AddProgram_Policy_Certificates_Page.addWCPolicyEditBoxWCStatutoryLimit(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "WC Statutory Limits Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyELDiseaseEAEmployee(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "E.L. Disease - EA Employee Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyELDiseasePolicyLimit(driver).sendKeys("1100");
				test.log(LogStatus.PASS, "E.L. Disease - Policy Limit Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicyELEachAccident(driver).sendKeys("1200");
				test.log(LogStatus.PASS, "E.L. Each Accident Added Successfully");
				AddProgram_Policy_Certificates_Page.addWCPolicySaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Add WC Policy Save and Close Button");

				driver.switchTo().window(wb.map.get("childID"));
				Thread.sleep(4000);
				// add GL policy
				AddProgram_Policy_Certificates_Page.btnOpenPolicy(driver).click();
				test.log(LogStatus.PASS, "Clicked on Open GL Policy Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addGLPolicySelectCarrier(driver), 3);
				test.log(LogStatus.PASS, "GL Policy Carrier Selected Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyFieldMasterPolicyEditBox(driver)
						.sendKeys("Master GL Pol" + RandomClass.randomProgramCode());
				test.log(LogStatus.PASS, "GL Policy Master Policy Number Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
				test.log(LogStatus.PASS, "GL Policy Effective Date Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLpolicyExpirationDate(driver).sendKeys("10/10/2021");
				test.log(LogStatus.PASS, "GL Policy Expiration Date Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
				test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyPolicyExpirationDateAsCompletionDate(driver).click();
				test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyEachOccurence(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits Each Occurrence Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyDamageRentedPremises(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits Damage To Rented Premises Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyMedExp(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits Med Exp Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyPersonalAndAdvInjury(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits Personal & Adv Injury Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyGeneralAggregate(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits General Aggregate Added Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicyProducts_Comp_Agg(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "GL Policy Limits Products - Comp/Op Agg Added Successfully");
				wb.selectSingleValueByIndex(
						AddProgram_Policy_Certificates_Page.addGLPolicySelectAdditionalInsured(driver), 2);
				test.log(LogStatus.PASS, "GL Policy Additional Insured Selected Successfully");
				wb.selectSingleValueByIndex(
						AddProgram_Policy_Certificates_Page.addGLPolicySelectWaiverSubrogation(driver), 2);
				test.log(LogStatus.PASS, "GL Policy Limits Waiver of Subrogation Selected Successfully");
				AddProgram_Policy_Certificates_Page.addGLPolicySaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On GL Policy Save And Close Button");

				driver.switchTo().window(wb.map.get("childID"));

				// add umb policy
				AddProgram_Policy_Certificates_Page.addUmbPolAddPolicyBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked on Open UMB Policy Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolSelectCarrier(driver), 2);
				test.log(LogStatus.PASS, "UMB Policy Carrier Selected Successfully");
				wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolSelectLayer(driver), 2);
				test.log(LogStatus.PASS, "UMB Policy Layer Selected Successfully");
				AddProgram_Policy_Certificates_Page.addUmbPolEnterPolicyNumberField(driver)
						.sendKeys("MasterUMB POL " + RandomClass.randomProgramCode());
				test.log(LogStatus.PASS, "UMB Policy Master Policy Number Added Successfully");
				AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys("10/10/2019");
				Thread.sleep(1500);
				AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
				test.log(LogStatus.PASS, "UMB Policy Effective Date Added Successfully");
				AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys("10/10/2021");
				Thread.sleep(1500);
				AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys(Keys.TAB);
				test.log(LogStatus.PASS, "UMB Policy Expiration Date Added Successfully");
//click intercepted exception handled				
				int a = 1;
				do {
					try {
						AddProgram_Policy_Certificates_Page.addUmbPolPolicyEffectiveDateAsEffectiveDate(driver).click();
						test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
						a = 2;
					} catch (Throwable e) {
						System.out.println(e);
						AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyEffectiveDate(driver)
								.sendKeys(Keys.TAB);
						Thread.sleep(1500);
						AddProgram_Policy_Certificates_Page.addUmbPolSelectPolicyExpirationDate(driver)
								.sendKeys(Keys.TAB);
						Thread.sleep(1500);
					}

				} while (a == 1);

				AddProgram_Policy_Certificates_Page.addUmbPolPolicyExpirationDateAsCompletionDate(driver).click();
				test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
				AddProgram_Policy_Certificates_Page.addUmbPolFieldEacyOccurrence(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "UMB Policy Limits Each Occurrence Added Successfully");
				AddProgram_Policy_Certificates_Page.addUmbPolFieldAggregate(driver).sendKeys("1000");
				test.log(LogStatus.PASS, "UMB Policy Limits Aggregate Added Successfully");
				wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addUmbPolAdditionalInsuredField(driver),
						2);
				test.log(LogStatus.PASS, "UMB Policy Additional Insured Selected Successfully");
				wb.selectSingleValueByIndex(
						AddProgram_Policy_Certificates_Page.addUmbPolWaiverofSubrogationField(driver), 2);
				test.log(LogStatus.PASS, "UMB Policy Limits Waiver of Subrogation Selected Successfully");

//				js.executeScript("window.scrollBy(0,250)");
				js.executeScript("arguments[0].scrollIntoView();",
						AddProgram_Policy_Certificates_Page.addUmbPolSaveAndCloseBtn(driver));
				driver.switchTo().window(wb.map.get("childID"));

				// Setup General Certificate
				AddProgram_Policy_Certificates_Page.setupCertificateBtnSetupGeneralCertificate(driver).click();
				test.log(LogStatus.PASS, "Clicked on Setup General Certificate Button");
				wb.getWindowID3();
				driver.switchTo().window(wb.map.get("subchildID"));
				AddProgram_Policy_Certificates_Page.setupCertificateSaveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked on Setup General Certificate Save and Close Button");

				driver.switchTo().window(wb.map.get("childID"));

				AddProgram_Policy_Certificates_Page.policyAndCertificateTabSaveAndContinueBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Policy Tab Save and Continue Button");

				AddProgram_Claims_Page.saveAndCloseBtn(driver).click();
				test.log(LogStatus.PASS, "Clicked On Claims Save and Close Button");
				test.log(LogStatus.PASS, programName + " Program Added Successfully");

				driver.switchTo().window(wb.map.get("parentID"));

				break;

			case "AddTrade":

				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuTrade(driver).click();
				test.log(LogStatus.PASS, "Clicked on Add Trade Icon");
				TradesModule.tradesAddIcon(driver).click();
				Thread.sleep(5000);
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(tradeName);
				test.log(LogStatus.PASS, "Trade Description Added Successfully");

				AddTradePage.addTrade_TradeNumberField(driver).sendKeys(RandomClass.randomTradeNO());
				test.log(LogStatus.PASS, "Trade Number Added Successfully");
				wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
				test.log(LogStatus.PASS, "Trade Status Selected Successfully");
				AddTradePage.addTradeSaveAndCloseBtn(driver).click();

				int x = 1;
				do {
					try {
						Alert alt = driver.switchTo().alert();
						Thread.sleep(4000);
						alt.accept();
						Random ran = new Random();
						int rNo = ran.nextInt(100000);
						String newtradeNumber = "TNO" + rNo;
						Thread.sleep(1000);
						AddTradePage.addTrade_TradeNumberField(driver).clear();
						Thread.sleep(1000);
						AddTradePage.addTrade_TradeNumberField(driver).sendKeys(newtradeNumber);
						test.log(LogStatus.PASS, "Trade Number Added Successfully");
						AddTradePage.addTradeSaveAndCloseBtn(driver).click();
					} catch (Throwable e) {
						System.out.println("Alert Not Present" + e);
						x = 2;
					}
				} while (x == 1);

				driver.switchTo().window(wb.map.get("parentID"));

				test.log(LogStatus.PASS, " " + tradeName + " Added Successfully");

				break;

			case "AddWorkClass":

				HomePage.controlMenuHomeIcon(driver).click();
				HomePage.HomeMenuWorkClass(driver).click();
				test.log(LogStatus.INFO, "Clicked on Class Code Icon");
				Thread.sleep(3000);
				ClassCodeModule.classCodeAddIcon(driver).click();
				test.log(LogStatus.INFO, "Clicked on Add Class Code Icon");
				Thread.sleep(3000);
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				AddClassCodePage.addClassCodeWorkClassDescriptionField(driver).sendKeys(classCodeName);
				test.log(LogStatus.PASS, "Class Code Description Added Successfully");
				AddClassCodePage.addClassCodeWorkClassNumberField(driver).sendKeys(RandomClass.randomClassCodeNumber());
				test.log(LogStatus.PASS, "Class Code Number Added Successfully");
				AddClassCodePage.stateSpecificCodeButtonYes(driver).click();
				test.log(LogStatus.PASS, "State Specific Code Yes Button Clicked");
				wb.selectSingleValue(AddClassCodePage.addClassCodeWorkClassStateField(driver),
						RandomClass.randomState());
				test.log(LogStatus.PASS, "Class Code State Selected Successfully");
				AddClassCodePage.checkBox_WC_ClassCode(driver).click();
				test.log(LogStatus.INFO, "WC Class Code Check Box Selected");
				AddClassCodePage.checkBox_GL_ClassCode(driver).click();
				test.log(LogStatus.INFO, "GL Class Code Check Box Selected");
				try {
					AddClassCodePage.cappedPayrollCheckBox(driver).click();
					test.log(LogStatus.INFO, "Capped Payroll Check Box Selected");

				} catch (Throwable e) {
					System.out.println("Exception in class code capped payroll" + e);
				}

				AddClassCodePage.addClassCodeSaveAndCloseBtn(driver).click();
				test.log(LogStatus.INFO, "Clicked on Save And Close Button");
				driver.switchTo().window(wb.map.get("parentID"));

				test.log(LogStatus.PASS, "" + classCodeName + " Added Successfully");
				break;

			case "Create_Contractor_Pkg":

//				WebDriverWait wait=new WebDriverWait(driver, 60);
				System.out.println("Program Name-" + programName + "\t Project Name-" + projectName
						+ "\t EnrollmentType-" + EnrollmentType + "\t ContractorName-" + ContractorCompanyName
						+ "\t tradeName-" + tradeName);
				HomePage.controlMenuContractorPackage(driver).click();
				Thread.sleep(6000);
				test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");

				// js.executeScript("window.scrollBy(0,-250)", "");
				js.executeScript("arguments[0].click();", ContractorPackageModule.addIcon(driver));
				test.log(LogStatus.INFO, "Clicked On Add Contractor Package Icon");
				Thread.sleep(4000);
				// ContractorPackageModule.addIcon(driver).click();
				wb.getWindowIDs();
				driver.switchTo().window(wb.map.get("childID"));
				driver.manage().window().maximize();

				// Select program
				wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
				AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(programName);
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver),
						programName);
				// AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower
				// Test",Keys.TAB);
				System.out.println("Program Added Successfully");
				test.log(LogStatus.PASS, programName + " Program  added successfully");

				// select project
				Thread.sleep(4000);
				AddContractor_Pkg_Page.selectProject(driver).click();
				Thread.sleep(500);
				AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(projectName);
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver),
						projectName);
				System.out.println("Project Added Successfully");
				test.log(LogStatus.PASS, projectName + " Project added successfully");

				Thread.sleep(4000);
				// select enrollment type
				wait.until(
						ExpectedConditions.elementToBeClickable(AddContractor_Pkg_Page.selectEnrollmentType(driver)));
				AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
				Thread.sleep(1000);
				AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).sendKeys(EnrollmentType);
				System.out.println("Enrollment Type Added Successfully");
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver),
						EnrollmentType);
				test.log(LogStatus.PASS, EnrollmentType + " Enrollment Type added successfully");

				Thread.sleep(4000);
				// select Compliance
				AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
				Thread.sleep(4000);
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(driver), "Compliance29");
				test.log(LogStatus.PASS, " Compliance added successfully");

				Thread.sleep(4000);
				// select contractor
				AddContractor_Pkg_Page.selectContractor(driver).click();
				AddContractor_Pkg_Page.selectContractor(driver).sendKeys(ContractorCompanyName);
				Thread.sleep(4000);
				AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
				System.out.println("Contractor Added Successfully");
				test.log(LogStatus.PASS, "Contractor added successfully");
				Thread.sleep(4000);

				Thread.sleep(4000);
				// select contact
				AddContractor_Pkg_Page.SelectContact(driver).click();
				AddContractor_Pkg_Page.SelectContactSearchBox(driver).click();
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.SelectContactAutoCompllete(driver),
						ContrContactFirstName + " " + ContractorContactLastName);
				test.log(LogStatus.PASS,
						ContrContactFirstName + ContractorContactLastName + " Contact added successfully");

				Thread.sleep(4000);
				// select Trade
				AddContractor_Pkg_Page.selectTrade(driver).click();
//				System.out.println(ranTrade);
//				AddContractor_Pkg_Page.selectTradeSearchBox(driver).click();
//				wb.printListData(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver));
				Thread.sleep(4000);
				AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(tradeName);
				// take a trade name from excel
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), tradeName);
				// take a random trade from random class
				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), tradeName);
				Thread.sleep(4000);
				System.out.println("Trade Added Successfully");
				test.log(LogStatus.PASS, tradeName + " Trade added successfully");

				// Select Upper Tier Contractor
//				
//				AddContractor_Pkg_Page.selectUpperTierContractor(driver).click();
//				AddContractor_Pkg_Page.selectUpperTierContractorSearchBox(driver).click();
//				Thread.sleep(4000);
//				wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectUpperTierContractorDropdownAutocomplete(driver), "Glod Corporation");

				Thread.sleep(4000);
				AddContractor_Pkg_Page.btnNext(driver).click();
				test.log(LogStatus.INFO, "Clicked On Next Button");
				Thread.sleep(1000);

				try {

					AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();// newly added alert for
																								// compliance button
																								// 20/01/2020

				} catch (Throwable e) {
					System.out.println(e);
				}

				AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();

				driver.switchTo().window(wb.map.get("parentID"));
				System.out.println("Contractor Package Created Successfully");
				test.log(LogStatus.PASS, "Contractor Package Created successfully");

				break;

			default:
				break;
			}

		}

	}

}
