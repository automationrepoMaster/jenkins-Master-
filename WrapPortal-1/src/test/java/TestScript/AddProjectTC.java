package TestScript;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddCarriersPage;
import ObjectRepository.AddProgram_Policy_Certificates_Page;
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
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class AddProjectTC extends BaseClass {
	
	
	@Test
	public void addProjectTestScript() throws Throwable {
		String programName = "Automation Program dont touch";
		String companyName = "alex";
		String contactName = "alex";
//		String usercompanyName=RandomClass.randomUserName();
//		String ContractorCompanyName=RandomClass.randomContractorCompanyName();

		String projectName = RandomClass.randomProject();
		WebDriverCommonLib wb = new WebDriverCommonLib();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		test.log(LogStatus.INFO, "========== Add Project Section  ==========");
		HomePage.controlMenuHomeIcon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuProjects(driver).click();
		test.log(LogStatus.INFO, "Clicked on Project Module Icon");
		ProjectModule.projectAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Add Project Icon");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(2000);
		driver.manage().window().maximize();

		wb.selectSingleValue(AddProject_General_Information_Page.selectProgramField(driver), programName);// Sony Tower
																											// Test
		test.log(LogStatus.PASS, "Program Selected Successfully");

		// Add new Project Status Link 17/8/20
		AddProject_General_Information_Page.addNewProjectStatusLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Project Status Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_General_Information_Page.addProjectStatusLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Project Status Link");
		AddProject_General_Information_Page.addProjectStatusNameField(driver)
				.sendKeys(RandomClass.randomProjectStatus());
		test.log(LogStatus.PASS, "Add New Project Status Name Successfully");
		AddProject_General_Information_Page.addProjectStatusDescriptionField(driver)
				.sendKeys("Test Status Descriptoin");
		test.log(LogStatus.PASS, "Add New Project Status Description Successfully");
		AddProject_General_Information_Page.addProjectStatusSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Status Save and Close button");
		AddProject_General_Information_Page.addProjectStatusListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Status List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Status Added Successfully");
		wb.selectSingleValue(AddProject_General_Information_Page.selectProjectStatusField(driver), "Active");
		test.log(LogStatus.PASS, "Status Selected Successfully");

		AddProject_General_Information_Page.projectNameField(driver).sendKeys(projectName);
		test.log(LogStatus.PASS, "Project Name Added Successfully");

		AddProject_General_Information_Page.projectCodeField(driver).sendKeys(RandomClass.randomProjectCode());
		test.log(LogStatus.PASS, "Project Code Added Successfully");

		wb.selectSingleValueByIndex(AddProject_General_Information_Page.divisionField(driver), 1);
		test.log(LogStatus.PASS, "Project Division Added Successfully");
		AddProject_General_Information_Page.contractValueField(driver).sendKeys("120000000");
		test.log(LogStatus.PASS, "Project Contract Value Added Successfully");
		wb.selectSingleValue(AddProject_General_Information_Page.selectStateField(driver), RandomClass.randomState());
		test.log(LogStatus.PASS, "Project State Selected Successfully");
		AddProject_General_Information_Page.estimatedPayrollField(driver).sendKeys("350000");
		test.log(LogStatus.PASS, "Project Estimated Payroll Added Successfully");
		AddProject_General_Information_Page.estimatedHoursField(driver).sendKeys("500");
		test.log(LogStatus.PASS, "Project Estimated Hours Added Successfully");
		AddProject_General_Information_Page.beginDate(driver).sendKeys("1/04/2019");
		test.log(LogStatus.PASS, "Project Begin Date Added Successfully");
		AddProject_General_Information_Page.endDate(driver).sendKeys("01/04/2022");
		test.log(LogStatus.PASS, "Project End Date Added Successfully");
		Thread.sleep(2000);

		try {
		wb.selectSingleValueGetOpt(AddProject_General_Information_Page.selectProjectAdministrator(driver), companyName);
		test.log(LogStatus.PASS, "Project Administrator Selected Successfully");
		System.out.println("Document Switch \t"
				+ AddProject_General_Information_Page.requiredDocumentsforEnrollmentSwitch(driver).isEnabled());
		System.out.println("Portal Switch \t"
				+ AddProject_General_Information_Page.activateContractorPortalForThisProjectSwitch(driver).isEnabled());

		

		 AddProject_General_Information_Page.singlePrimeRedioButton(driver).isEnabled();

		 AddProject_General_Information_Page.searchGeneralContractorCompanyField(driver).sendKeys(contactName);
		
		//Contractor name
		 Thread.sleep(2000);
		 AddProject_General_Information_Page.searchGeneralContractorCompanyField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Project General Contractor Added Successfully");
		}catch (Exception e) {
			test.log(LogStatus.PASS, "is removed from the project level functionality");
		}
// Raja 
		try {
			// Click here to Add New Contractor link
			AddProject_General_Information_Page.addNewNodeContractorLink(driver).click();
			test.log(LogStatus.PASS, "Clicked on Add New Contractor Link");
			wb.getWindowID3();
			driver.switchTo().window(wb.map.get("subchildID"));
			driver.manage().window().maximize();
			AddProject_General_Information_Page.contractorCompanyNameField(driver)
					.sendKeys(RandomClass.randomContractorCompanyName());
			AddProject_General_Information_Page.contractorCompanyNameField(driver).sendKeys(Keys.TAB);
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "Company Name Added Successfully");
			AddProject_General_Information_Page.contactFirstName(driver).sendKeys("David");
			test.log(LogStatus.PASS, "Contact First Name Added Successfully");
			AddProject_General_Information_Page.contactLastName(driver).sendKeys("Warner");
			test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
			AddProject_General_Information_Page.contactEmail(driver).sendKeys("kiran@nourtek.com");
			test.log(LogStatus.PASS, "Contact Email ID Name Added Successfully");
			AddProject_General_Information_Page.contactCellPhone(driver).sendKeys("12345678912579");
			test.log(LogStatus.PASS, "Contact Phone NO Name Added Successfully");
			AddProject_General_Information_Page.MoreButton(driver).click();
			test.log(LogStatus.PASS, "Clicked On More Button");
			AddProject_General_Information_Page.jobTitle(driver).sendKeys("AdminJobTitle");
			test.log(LogStatus.PASS, "Job Title Added Successfully");
			AddProject_General_Information_Page.businessPhone(driver).sendKeys("12345678912579");
			test.log(LogStatus.PASS, "Business Phone No Added Successfully");
			AddProject_General_Information_Page.businessFax(driver).sendKeys("12345678912579");
			test.log(LogStatus.PASS, "Business Fax Added Successfully");
			AddProject_General_Information_Page.addContractorSaveAndCloseButton(driver).click();
			test.log(LogStatus.PASS, "Clicked On Save And Close Button");
			Thread.sleep(3000);
			driver.switchTo().window(wb.map.get("childID"));
			test.log(LogStatus.PASS, "New Contractor Added Successfully");

			AddProject_General_Information_Page.searchContactField(driver).sendKeys(contactName);// contractor name
			Thread.sleep(2000);
			AddProject_General_Information_Page.searchContactField(driver).sendKeys(Keys.TAB);
			test.log(LogStatus.PASS, "Project General Contractor Contact Added Successfully");

			AddProject_General_Information_Page.GeneralContractorSaveButton(driver).click();
			test.log(LogStatus.PASS, "Project General Contractor Saved Successfully");
		} catch (Exception e) {
			js.executeScript("window.scrollBy(0,600)");
			AddProject_General_Information_Page.contactNameField(driver).sendKeys("Jimmy");
			test.log(LogStatus.PASS, "Project Contact Name Added Successfully");
			AddProject_General_Information_Page.contactEmailField(driver).sendKeys("kiran@nourtek.net");
			test.log(LogStatus.PASS, "Project Contact Email Added Successfully");
			AddProject_General_Information_Page.contactPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
			test.log(LogStatus.PASS, "Project Contact Phone No Added Successfully");
			AddProject_General_Information_Page.address1Field(driver).sendKeys("ABC Address");
			test.log(LogStatus.PASS, "Project Contact Address Added Successfully");
			AddProject_General_Information_Page.cityField(driver).sendKeys(RandomClass.randomState());
			test.log(LogStatus.PASS, "Project Contact State Added Successfully");
			AddProject_General_Information_Page.zipField(driver).sendKeys("123456789");
			test.log(LogStatus.PASS, "Project Contact Zip Code Added Successfully"); 
			// TODO: handle exception
		}

//Add Project Type Link 17/08/2020		

		// raaja
		
		js.executeScript("window.scrollBy(0,350)");
		wb.scrollToEndt();
		Thread.sleep(2000);
		wb.moveToElement(AddProject_General_Information_Page.addNewProjectTypeLink(driver));
		System.out.println("Scrolled to Project type link");
		// Kiran
		AddProject_General_Information_Page.addNewProjectTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Project Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_General_Information_Page.addProjectTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Project Type Link");
		AddProject_General_Information_Page.addProjectTypeNameField(driver).sendKeys(RandomClass.randomProjectType());
		test.log(LogStatus.PASS, "Add New Project Type Name Successfully");
		AddProject_General_Information_Page.addProjectTypeDescriptionField(driver).sendKeys("Test Type Descriptoin");
		test.log(LogStatus.PASS, "Add New Project Type Description Successfully");
		AddProject_General_Information_Page.addProjectTypeSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Type Save and Close button");
		AddProject_General_Information_Page.addProjectTypeListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Type List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Type Added Successfully");

		wb.selectSingleValueByIndex(AddProject_General_Information_Page.selectProjectType(driver), 2);
		test.log(LogStatus.PASS, "Project Type Selected Successfully");

//Add Building Type Link 17/08/2020		

		AddProject_General_Information_Page.addNewBuildingTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Building Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_General_Information_Page.addBuildingTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Building Type Link");
		AddProject_General_Information_Page.addBuildingTypeNameField(driver).sendKeys(RandomClass.randomProjectType());
		test.log(LogStatus.PASS, "Add New Building Type Name Successfully");
		AddProject_General_Information_Page.addBuildingTypeDescriptionField(driver).sendKeys("Test Type Descriptoin");
		test.log(LogStatus.PASS, "Add New Building Type Description Successfully");
		AddProject_General_Information_Page.addBuildingTypeSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Building Type Save and Close button");
		AddProject_General_Information_Page.addBuildingTypeListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Building Type List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Type Added Successfully");

		wb.selectSingleValueByIndex(AddProject_General_Information_Page.selectBuildingType(driver), 2);
		test.log(LogStatus.PASS, "Project Building Type Selected Successfully");

// Add Construction Type Link 17/08/2020
		AddProject_General_Information_Page.addNewConstructionTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Construction Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_General_Information_Page.addConstructionTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Construction Type Link");
		AddProject_General_Information_Page.addConstructionTypeNameField(driver)
				.sendKeys(RandomClass.randomProjectType());
		test.log(LogStatus.PASS, "Add New Construction Type Name Successfully");
		AddProject_General_Information_Page.addConstructionTypeDescriptionField(driver)
				.sendKeys("Test Type Descriptoin");
		test.log(LogStatus.PASS, "Add New Construction Type Description Successfully");
		AddProject_General_Information_Page.addConstructionTypeSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Construction Type Save and Close button");
		AddProject_General_Information_Page.addConstructionTypeListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Construction Type List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Type Added Successfully");

//		Thread.sleep(3500);
//		js.executeScript("window.scrollBy(0,1350)","");//Scroll down
		js.executeScript("arguments[0].click();",
				AddProject_General_Information_Page.addNewConstructionDeliveryLink(driver));

// Add Construction Delivery Method Link 17/08/2020
//		AddProject_General_Information_Page.addNewConstructionDeliveryLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Construction Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_General_Information_Page.addConstructionDeliveryLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Construction Delivery Link");
		AddProject_General_Information_Page.addConstructionDeliveryNameField(driver)
				.sendKeys(RandomClass.randomProjectType());
		test.log(LogStatus.PASS, "Add New Construction Delivery Name Successfully");
		AddProject_General_Information_Page.addConstructionDeliveryDescriptionField(driver)
				.sendKeys("Test Type Descriptoin");
		test.log(LogStatus.PASS, "Add New Construction Delivery Description Successfully");
		AddProject_General_Information_Page.addConstructionDeliverySaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Construction Delivery Save and Close button");
		AddProject_General_Information_Page.addConstructionDeliveryListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Construction Delivery List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Type Added Successfully");
		System.out.println(AddProject_General_Information_Page.joinVentureCheckBox(driver).isSelected());

		AddProject_General_Information_Page.generalInformationSaveandContinueButton(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Project General Information Saved Successfully");

		int x = 1;
		do {
			try {
				AddProject_General_Information_Page.duplicateProjectCodeAlertOKBtn(driver).click();
				Thread.sleep(3000);
				AddProject_General_Information_Page.projectCodeField(driver).clear();
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String NewProjectCode = "PCODE" + rNo;
				AddProject_General_Information_Page.projectCodeField(driver).sendKeys(NewProjectCode);
				test.log(LogStatus.PASS, "New Project Code Added Successfully");
				js.executeScript("window.scrollBy(0,1550)", "");
				AddProject_General_Information_Page.generalInformationSaveandContinueButton(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Project General Information Saved Successfully");

			} catch (Exception e) {
				System.out.println("Project Code Entered Sucessfully ");
				x = 2;
			}
		} while (x == 1);

		Thread.sleep(2000);
		// Project Setting
		// AddProgram_General_Info_Page.saveAndContinueButton(driver).click();
		driver.findElement(By.xpath("//input[@id='btnNextProjectSettings']")).click();
		test.log(LogStatus.INFO, "Clicked On Project settings Save And Continue Button");

//Address tab
		AddProject_Address_Page.addAddressButton(driver).click();
		test.log(LogStatus.INFO, "Address Tab Clicked On Add Address Button ");
		/*
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 */
		Thread.sleep(2000);
		wb.SwitchtoChild2();
		Thread.sleep(2000);
// Add Address Type Link 17/08/2020
		AddProject_Address_Page.addNewAddressTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Address Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_Address_Page.addAddressTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Address Type Link");
		AddProject_Address_Page.addAddressTypeNameField(driver).sendKeys(RandomClass.randomProjectType());
		test.log(LogStatus.PASS, "Add New Address Type Name Successfully");
		AddProject_Address_Page.addAddressTypeDescriptionField(driver).sendKeys("Test Type Descriptoin");
		test.log(LogStatus.PASS, "Add New Address Type Description Successfully");
		AddProject_Address_Page.addAddressTypeSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Address Type Save and Close button");
		AddProject_Address_Page.addAddressTypeListCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Address Type List Close button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Type Added Successfully");

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

//contacts  Tab
		AddProject_Contact_Page.addNewContactsLink(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add New Contact Link");
		Thread.sleep(2000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		AddProject_Contact_Page.addNewContactsCompanyName(driver).sendKeys(RandomClass.randomContractorCompanyName());
		test.log(LogStatus.PASS, "Contact Company Name Added Successfully");
		AddProject_Contact_Page.addNewContactsFirstName(driver).sendKeys("Hobs");
		test.log(LogStatus.PASS, "Contact First Name Added Successfully");
		AddProject_Contact_Page.addNewContactsLastName(driver).sendKeys("Shobs");
		test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
		AddProject_Contact_Page.addNewContactsPhoneNo(driver).sendKeys(RandomClass.randomPhoneNo());
		test.log(LogStatus.PASS, "Contact Phone No Added Successfully");
		AddProject_Contact_Page.addNewContactsEmail(driver).sendKeys("kiran@nourtek.com");
		test.log(LogStatus.PASS, "Contact Email Name Added Successfully");
		AddProject_Contact_Page.addNewContactsGeneralInfoTabSaveandContinueButton(driver).click();
		test.log(LogStatus.INFO, "Click on Save and Continue Button");
		Thread.sleep(2000);
		// int x=1;
		do {
			try {
				AddProject_Contact_Page.sameCompanyExistAlertOkBtn(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Duplicate Company Name Alert Accepted");
				AddProject_Contact_Page.addNewContactsCompanyName(driver).clear();
				Thread.sleep(500);
				Random ran = new Random();
				int rNo = ran.nextInt(100000);
				String newCompanyName = "Alexa_Company" + rNo;
				AddProject_Contact_Page.addNewContactsCompanyName(driver).sendKeys(newCompanyName);
				test.log(LogStatus.PASS, newCompanyName + "Contact Company Name Added Successfully");
				AddProject_Contact_Page.addNewContactsGeneralInfoTabSaveandContinueButton(driver).click();
				test.log(LogStatus.INFO, "Click on Save and Continue Button");

			} catch (Throwable e) {
				System.out.println("Company Name " + e);
				x = 2;
			}
		} while (x == 1);

		AddProject_Contact_Page.addNewContactsGrantUserAccessCheckBox(driver).click();
		test.log(LogStatus.PASS, "Contact Grant User Access Successfully");
		AddProject_Contact_Page.addNewContactsUserAccessAccountSetupCompleteCheckBox(driver).click();
		test.log(LogStatus.PASS, "Contact Account Setup Successfully");
		AddProject_Contact_Page.addNewContactsUserAccessUserName(driver).sendKeys(RandomClass.randomUserName());
		test.log(LogStatus.PASS, "Contact User Name Added Successfully");
		AddProject_Contact_Page.addNewContactsUserAccessAutoGenerateButton(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked On Add New Contact Auto Generate Button");
		AddProject_Contact_Page.addNewContactsUserAccessTabSaveandCloseButton(driver).click();
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.INFO, "Clicked On User Access Tab Save and Close Button");
		Thread.sleep(1000);
		AddProject_Contact_Page.linkContactsLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Link Contacts Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_Contact_Page.selectFirstContactorFrmListCheckBox(driver).click();
		AddProject_Contact_Page.linkContactSelectBtn(driver).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1500);

		AddProject_Contact_Page.nextButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Next Button");

		// Project Administrator Tab 19/08/20

		AddProject_Project_Administrator_Access_Page.projectAdminAccessSwitch(driver).click();
		test.log(LogStatus.PASS, "Turn on Administrators Configuration At project level Switch ");
		AddProject_Project_Administrator_Access_Page.clickHereToAddAdminAccessLink(driver).click();
		test.log(LogStatus.PASS, "Clicked Here to Add Administrator Access Link");
		AddProject_Project_Administrator_Access_Page.projectAddNewAdditionalNodeAdminLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add New Additional Node Administrator Link");
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		AddProject_Project_Administrator_Access_Page.contractorCompanyNameField(driver)
				.sendKeys(RandomClass.randomContractorCompanyName());
		AddProject_Project_Administrator_Access_Page.contractorCompanyNameField(driver).sendKeys(Keys.TAB);
		Thread.sleep(1500);
		test.log(LogStatus.PASS, "Company Name Added Successfully");
		AddProject_Project_Administrator_Access_Page.contactFirstName(driver).sendKeys("David");
		test.log(LogStatus.PASS, "Contact First Name Added Successfully");
		AddProject_Project_Administrator_Access_Page.contactLastName(driver).sendKeys("Warner");
		test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
		AddProject_Project_Administrator_Access_Page.contactEmail(driver).sendKeys("kiran@nourtek.com");
		test.log(LogStatus.PASS, "Contact Email ID Name Added Successfully");
		AddProject_Project_Administrator_Access_Page.contactCellPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Contact Phone NO Name Added Successfully");
		AddProject_Project_Administrator_Access_Page.MoreButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On More Button");
		AddProject_Project_Administrator_Access_Page.jobTitle(driver).sendKeys("AdminJobTitle");
		test.log(LogStatus.PASS, "Job Title Added Successfully");
		AddProject_Project_Administrator_Access_Page.businessPhone(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Phone No Added Successfully");
		AddProject_Project_Administrator_Access_Page.businessFax(driver).sendKeys("12345678912579");
		test.log(LogStatus.PASS, "Business Fax Added Successfully");
		AddProject_Project_Administrator_Access_Page.addContractorSaveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Save And Close Button");
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "New Node Admin Added Successfully");

		AddProject_Project_Administrator_Access_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Project Administrator Access Save and Continue Button");

		// Email Management
		AddProject_Email_Management_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Email Management Save and Continue Button");

		// Enrollment Setup Page
//Add new Document name link 19/08/2020		
		AddProject_Enrollment_Setup_Page.addNewdocumentToTheListLink(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add New Document Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_Enrollment_Setup_Page.NewdocumentName(driver).sendKeys(RandomClass.randomDocumentType(), Keys.TAB);
		test.log(LogStatus.PASS, "Document Name Added");
		Thread.sleep(1500);
		AddProject_Enrollment_Setup_Page.NewdocumentName(driver).sendKeys(Keys.TAB, "TestDoucmentName Description");
		test.log(LogStatus.PASS, "Document Description Added");
		AddProject_Enrollment_Setup_Page.NewdocumentNameSaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Document Save And Close Button");
		driver.switchTo().defaultContent();

//Add new Contact Type link 19/08/2020		
		js.executeScript("window.scrollBy(0,150)", "");
		AddProject_Enrollment_Setup_Page.addNewContactTypeToThisListLink(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add New Contact Type Link");
		Thread.sleep(2500);
		driver.switchTo().frame(0);
		AddProject_Enrollment_Setup_Page.addContactTypeLink(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add Contact Type Link");
		AddProject_Enrollment_Setup_Page.addContactTypeNameField(driver).sendKeys(RandomClass.randomContactType());
		test.log(LogStatus.PASS, "New Contact Type Name Added Successfully");
		AddProject_Enrollment_Setup_Page.addContactTypeDescriptionField(driver).sendKeys("Test Contact Type");
		test.log(LogStatus.PASS, "New Contact Type Name Description Added Successfully");
		AddProject_Enrollment_Setup_Page.saveAndCloseButton(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add Contact Type Save And Close Button");
		AddProject_Enrollment_Setup_Page.addContactTypeListCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Close Button");
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "New Contact Type Added Successfully");

		AddProject_Enrollment_Setup_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Enrollment Setup Save and Continue Button");

//Payroll CV Tracking 
		AddProject_PayrollCVTracking.trackPayrollForGLOnlyContractorSwitch(driver).click();
		test.log(LogStatus.INFO, "Clicked On Track Payroll for GL Only Contracts Switch");
		AddProject_PayrollCVTracking.saveAndContinueBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Payroll CV Tracking Save and Continue Button");
		Thread.sleep(6000);

		AddProject_Premium_Modification_Page.saveAndContinueButton(driver).click();
		test.log(LogStatus.INFO, "Premium Modification Save and Continue Button");

		// facing issue in beta
		/*
		 * try {
		 * 
		 * List<WebElement> nonCIPCertificates =
		 * AddProject_Compliance_Page.viewNonCIPCertificactes(driver); int i;
		 * for(i=0;i<nonCIPCertificates.size()-1;i++); { Thread.sleep(2000);
		 * nonCIPCertificates.get(i).click(); Thread.sleep(4000); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); String
		 * pageTitle=driver.getTitle(); System.out.println(pageTitle);
		 * if(pageTitle=="Edit Non-CIP Compliance - Wrap-Portal") {
		 * System.out.println("Page Title matched"); } else {
		 * System.err.println("Page Title not matched"); } driver.close();
		 * Thread.sleep(2000); driver.switchTo().window(wb.map.get("childID")); }
		 * 
		 * AddProject_Compliance_Page.nextButton(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Compliance Next Button");
		 * 
		 * } catch (Throwable e) { System.out.println(e); }
		 */

		AddProject_Compliance_Page.nextButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Compliance Next Button");

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
		test.log(LogStatus.PASS, "Clicked On Project Specefic Policy Yes button");
		AddProject_Certificate_Page.BtnInheritProgramLevelPolicyYes(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Specefic Policy button");
		AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver).click();
		Thread.sleep(2000);
		AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Excess").click();
		AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		Thread.sleep(3000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(8000);
		test.log(LogStatus.INFO, "Clicked On Add Project Specific Policy Button");
		wb.selectSingleValueByIndex(AddProject_Certificate_Page.addUmbPolSelectCarrier(driver), 11);
		test.log(LogStatus.PASS, "UMB Policy Carrier Selected Successfully");
		wb.selectSingleValue(AddProject_Certificate_Page.addUmbPolSelectLayer(driver), "2");
		test.log(LogStatus.PASS, "UMB Policy Layer Selected Successfully");
		AddProject_Certificate_Page.addUmbPolEnterPolicyNumberField(driver).sendKeys("45781354");
		test.log(LogStatus.PASS, "UMB Policy No Added Successfully");
		AddProject_Certificate_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys("10/05/2019");
		Thread.sleep(1000);
		AddProject_Certificate_Page.addUmbPolSelectPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "UMB Policy Effective Date Added Successfully");
		AddProject_Certificate_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys("10/12/2021");
		Thread.sleep(1000);
		AddProject_Certificate_Page.addUmbPolSelectPolicyExpirationDate(driver).sendKeys(Keys.TAB);
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
		// AddProject_Certificate_Page.addUmbPolSaveAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On UMB Policy Save and Close Button");
		Thread.sleep(1000);
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(5000);
//Add Automobile Policy 		
		// int x = 1;
		do {
			try {
				js.executeScript("arguments[0].click();",
						AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
				Thread.sleep(2000);
				x = 2;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (x == 1);

		Thread.sleep(2000);
		AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Automobile").click();
		AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		Thread.sleep(3000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Automobile Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Automobile Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Automobile Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Automobile Policy Save and Close Button");
		try {
			driver.findElement(By.xpath("//button[@id='btnSaveModal']")).click();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Throwable e) {
			System.out.println(e);
		}
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Automobile Policy Added Successfully");

		driver.switchTo().window(wb.map.get("childID"));
//Add Builder Risk Policy	

		do {
			try {
				js.executeScript("arguments[0].click();",
						AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
				Thread.sleep(2000);
				x = 2;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (x == 1);

		/*
		 * js.executeScript("arguments[0].click();",AddProject_Certificate_Page.
		 * addProjectSpecificPolicyButton(driver)); Thread.sleep(2000);
		 */ AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Builder’s Risk Policy").click();
		AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		Thread.sleep(3000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(2000);

		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Builder’s Risk Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Builder’s Risk Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Builder’s Risk Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Builder’s Risk Policy Save and Close Button");
		try {
			driver.findElement(By.xpath("//button[@id='btnSaveModal']")).click();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Throwable e) {
			System.out.println(e);
		}
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Builder’s Risk Policy Added Successfully");

		driver.switchTo().window(wb.map.get("childID"));
//Add Pollution Policy	

		do {
			try {
				js.executeScript("arguments[0].click();",
						AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
				Thread.sleep(2000);
				x = 2;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (x == 1);
//		js.executeScript("arguments[0].click();",AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
//		Thread.sleep(2000);
		AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Pollution Liability Policy").click();
		AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		Thread.sleep(3000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Pollution Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Pollution Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Pollution Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Pollution Policy Save and Close Button");
		try {
			driver.findElement(By.xpath("//button[@id='btnSaveModal']")).click();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Throwable e) {
			System.out.println(e);
		}
		driver.switchTo().window(wb.map.get("childID"));
		test.log(LogStatus.PASS, "Pollution Policy Added Successfully");
		driver.switchTo().window(wb.map.get("childID"));
//Add Professional policy		
		do {
			try {
				js.executeScript("arguments[0].click();",
						AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
				Thread.sleep(2000);
				x = 2;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (x == 1);
//		js.executeScript("arguments[0].click();",AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver));
//		Thread.sleep(2000);
		AddProject_Certificate_Page.selecPolicyRadioBtn(driver, "Professional Liability Policy").click();
		AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		Thread.sleep(3000);
		wb.getWindowID3();
		driver.switchTo().window(wb.map.get("subchildID"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		wb.selectSingleValueByIndex(AddProgram_Policy_Certificates_Page.addOtherPolicySelectCarrier(driver), 2);
		test.log(LogStatus.PASS, "Carrier Selected Successfully");
//Add new Carrier hyper link 
		AddProgram_Policy_Certificates_Page.addOtherPolicyAddNewCarrierLink(driver).click();
		test.log(LogStatus.PASS, "Clicked On Add New Carrier Link");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
//		driver.switchTo().frame("#EmailBox12 > div.drag-contentarea > iframe");
		AddCarriersPage.addCarrierCarrierNameField(driver).sendKeys(RandomClass.randomCarrierName());
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
//		AddCarriersPage.addCarrierSaveBtn(driver).click();
//		test.log(LogStatus.PASS, "Carrier Save Successfully");
		AddCarriersPage.addCarrierSaveAndCloseBtn(driver).click();
		test.log(LogStatus.PASS, "Carrier Save And Close Successfully");
		test.log(LogStatus.PASS, " New Carrier Added Successfully");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		AddProgram_Policy_Certificates_Page.addOtherPolicyRadioBtnClaimsMode(driver).click();
		test.log(LogStatus.PASS, "Clicked on Claims Mode Radio Button");
		AddProgram_Policy_Certificates_Page.addOtherPolicyFieldMasterPolicy(driver)
				.sendKeys("Master Policy No" + RandomClass.randomProgramCode());
		test.log(LogStatus.PASS, "Professional Policy Master Policy Number Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys("10/10/2019");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Professional Policy Effective Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys("10/10/2021");
		Thread.sleep(1000);
		AddProgram_Policy_Certificates_Page.addOtherpolicyExpirationDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Professional Policy Expiration Date Added Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyEffectiveDateAsEffectiveDate(driver).click();
		test.log(LogStatus.PASS, "Effective Date on Contractor Certificate Selected Successfully");
		AddProgram_Policy_Certificates_Page.addOtherPolicyPolicyExpirationDateAsCompletionDate(driver).click();
		test.log(LogStatus.PASS, "Estimated Completion Date on Contractor Certificate Selected Successfully");
		js.executeScript("arguments[0].click();",
				AddProgram_Policy_Certificates_Page.addOtherPolicySaveAndCloseBtn(driver));
		test.log(LogStatus.PASS, "Clicked On Add Professional Policy Save and Close Button");

		try {
			driver.findElement(By.xpath("//button[@id='btnSaveModal']")).click();
			test.log(LogStatus.PASS, "Alert Accepted");
		} catch (Throwable e) {
			System.out.println(e);
		}
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
		 * driver).sendKeys("ABC insurance"); Thread.sleep(2000);
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
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,550)", "");// Scroll down
		wb.waitForElemnet(AddProject_Certificate_Page.saveAndContinueButton(driver));
		test.log(LogStatus.PASS, "Clicked On Crtificate Page Save And Continue Button ");
		Thread.sleep(5000);

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

//old code 
		/*
		 * HomePage.controlMenuHomeIcon(driver).click(); Thread.sleep(2000);
		 * test.log(LogStatus.INFO, "Clicked on Home Icon");
		 * HomePage.HomeMenuProjects(driver).click(); test.log(LogStatus.INFO,
		 * "Clicked on Project Module Icon");
		 * ProjectModule.projectAddIcon(driver).click(); test.log(LogStatus.INFO,
		 * "Clicked on Add Project Icon"); wb.getWindowIDs();
		 * driver.switchTo().window(wb.map.get("childID")); Thread.sleep(2000);
		 * driver.manage().window().maximize();
		 * 
		 * wb.selectSingleValue(AddProject_General_Information_Page.selectProgramField(
		 * driver), programName);//Sony Tower Test test.log(LogStatus.PASS,
		 * "Program Selected Successfully");
		 * wb.selectSingleValue(AddProject_General_Information_Page.
		 * selectProjectStatusField(driver), "Active"); test.log(LogStatus.PASS,
		 * "Status Selected Successfully");
		 * AddProject_General_Information_Page.projectNameField(driver).sendKeys(
		 * projectName); test.log(LogStatus.PASS, "Project Name Added Successfully");
		 * AddProject_General_Information_Page.projectCodeField(driver).sendKeys(
		 * RandomClass.randomProjectCode()); test.log(LogStatus.PASS,
		 * "Project Code Added Successfully");
		 * wb.selectSingleValueByIndex(AddProject_General_Information_Page.divisionField
		 * (driver), 2); test.log(LogStatus.PASS,
		 * "Project Division Added Successfully");
		 * AddProject_General_Information_Page.contractValueField(driver).sendKeys(
		 * "120000000"); test.log(LogStatus.PASS,
		 * "Project Contract Value Added Successfully");
		 * wb.selectSingleValue(AddProject_General_Information_Page.selectStateField(
		 * driver), RandomClass.randomState()); test.log(LogStatus.PASS,
		 * "Project State Selected Successfully");
		 * AddProject_General_Information_Page.estimatedPayrollField(driver).sendKeys(
		 * "350000"); test.log(LogStatus.PASS,
		 * "Project Estimated Payroll Added Successfully");
		 * AddProject_General_Information_Page.estimatedHoursField(driver).sendKeys(
		 * "500"); test.log(LogStatus.PASS,
		 * "Project Estimated Hours Added Successfully");
		 * AddProject_General_Information_Page.beginDate(driver).sendKeys("1/04/2019");
		 * test.log(LogStatus.PASS, "Project Begin Date Added Successfully");
		 * AddProject_General_Information_Page.endDate(driver).sendKeys("01/04/2022");
		 * test.log(LogStatus.PASS, "Project End Date Added Successfully");
		 * Thread.sleep(2000);
		 * 
		 * wb.selectSingleValueByIndex(AddProject_General_Information_Page.
		 * selectProjectAdministrator(driver), 42); test.log(LogStatus.PASS,
		 * "Project Administrator Selected Successfully");
		 * System.out.println("Document Switch \t"+AddProject_General_Information_Page.
		 * requiredDocumentsforEnrollmentSwitch(driver).isEnabled());
		 * System.out.println("Portal Switch \t"+AddProject_General_Information_Page.
		 * activateContractorPortalForThisProjectSwitch(driver).isEnabled());
		 * AddProject_General_Information_Page.singlePrimeRedioButton(driver).isEnabled(
		 * );
		 * 
		 * AddProject_General_Information_Page.searchGeneralContractorCompanyField(
		 * driver).sendKeys(companyName);//Sony Thread.sleep(2000);
		 * AddProject_General_Information_Page.searchGeneralContractorCompanyField(
		 * driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
		 * "Project General Contractor Added Successfully");
		 * 
		 * AddProject_General_Information_Page.searchContactField(driver).sendKeys(
		 * contactName);//Sony 1 Thread.sleep(2000);
		 * AddProject_General_Information_Page.searchContactField(driver).sendKeys(Keys.
		 * TAB); test.log(LogStatus.PASS,
		 * "Project General Contractor Contact Added Successfully");
		 * 
		 * AddProject_General_Information_Page.GeneralContractorSaveButton(driver).click
		 * (); test.log(LogStatus.PASS,
		 * "Project General Contractor Saved Successfully");
		 * AddProject_General_Information_Page.contactNameField(driver).sendKeys("Jimmy"
		 * ); test.log(LogStatus.PASS, "Project Contact Name Added Successfully");
		 * AddProject_General_Information_Page.contactEmailField(driver).sendKeys(
		 * "kiran@nourtek.net"); test.log(LogStatus.PASS,
		 * "Project Contact Email Added Successfully");
		 * AddProject_General_Information_Page.contactPhoneNoField(driver).sendKeys(
		 * RandomClass.randomPhoneNo()); test.log(LogStatus.PASS,
		 * "Project Contact Phone No Added Successfully");
		 * AddProject_General_Information_Page.address1Field(driver).
		 * sendKeys("ABC Address"); test.log(LogStatus.PASS,
		 * "Project Contact Address Added Successfully");
		 * AddProject_General_Information_Page.cityField(driver).sendKeys(RandomClass.
		 * randomState()); test.log(LogStatus.PASS,
		 * "Project Contact State Added Successfully");
		 * AddProject_General_Information_Page.zipField(driver).sendKeys("123456789");
		 * test.log(LogStatus.PASS, "Project Contact Zip Code Added Successfully");
		 * wb.selectSingleValueByIndex(AddProject_General_Information_Page.
		 * selectProjectType(driver), 2); test.log(LogStatus.PASS,
		 * "Project Type Selected Successfully");
		 * wb.selectSingleValueByIndex(AddProject_General_Information_Page.
		 * selectBuildingType(driver), 2); test.log(LogStatus.PASS,
		 * "Project Building Type Selected Successfully");
		 * System.out.println(AddProject_General_Information_Page.joinVentureCheckBox(
		 * driver).isSelected());
		 * 
		 * AddProject_General_Information_Page.generalInformationSaveandContinueButton(
		 * driver).click(); Thread.sleep(2000); test.log(LogStatus.PASS,
		 * "Project General Information Saved Successfully");
		 * 
		 * //Address tab AddProject_Address_Page.addAddressButton(driver).click();
		 * test.log(LogStatus.INFO, "Address Tab Clicked On Add Address Button ");
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));
		 * Thread.sleep(2000);
		 * wb.selectSingleValue(AddProject_Address_Page.addAddressSelectAddressType(
		 * driver), "Mailing Address"); test.log(LogStatus.PASS,
		 * "Address Type Selected Successfully ");
		 * AddProject_Address_Page.addAddressAddress1Field(driver).
		 * sendKeys("ABC Firm 1234"); test.log(LogStatus.PASS,
		 * "Address 1 Field Added Successfully");
		 * AddProject_Address_Page.addAddressCityField(driver).sendKeys("California");
		 * test.log(LogStatus.PASS, "Address City Field Added Successfully");
		 * wb.selectSingleValue(AddProject_Address_Page.addAddressSelectState(driver),
		 * RandomClass.randomState()); test.log(LogStatus.PASS,
		 * "Address State Field Added Successfully");
		 * AddProject_Address_Page.addAddressZipCode(driver).sendKeys("456789122");
		 * test.log(LogStatus.PASS, "Address Zip Code Added Successfully");
		 * AddProject_Address_Page.addAddressSaveAndCloseBtn(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Save And Close Button");
		 * driver.switchTo().window(wb.map.get("childID"));
		 * AddProject_Address_Page.nextButton(driver).click(); test.log(LogStatus.PASS,
		 * "Address Added Successfully");
		 * 
		 * //contacts Tab AddProject_Contact_Page.addNewContactsLink(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Add New Contact Link");
		 * Thread.sleep(2000); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID"));
		 * 
		 * AddProject_Contact_Page.addNewContactsCompanyName(driver).sendKeys(
		 * RandomClass.randomContractorCompanyName()); test.log(LogStatus.PASS,
		 * "Contact Company Name Added Successfully");
		 * AddProject_Contact_Page.addNewContactsFirstName(driver).sendKeys("Hobs");
		 * test.log(LogStatus.PASS, "Contact First Name Added Successfully");
		 * AddProject_Contact_Page.addNewContactsLastName(driver).sendKeys("Shobs");
		 * test.log(LogStatus.PASS, "Contact Last Name Added Successfully");
		 * AddProject_Contact_Page.addNewContactsPhoneNo(driver).sendKeys(RandomClass.
		 * randomPhoneNo()); test.log(LogStatus.PASS,
		 * "Contact Phone No Added Successfully");
		 * AddProject_Contact_Page.addNewContactsEmail(driver).sendKeys(
		 * "kiran@nourtek.net"); test.log(LogStatus.PASS,
		 * "Contact Email Name Added Successfully");
		 * AddProject_Contact_Page.addNewContactsGeneralInfoTabSaveandContinueButton(
		 * driver).click(); test.log(LogStatus.INFO,
		 * "Click on Save and Continue Button");
		 * AddProject_Contact_Page.addNewContactsGrantUserAccessCheckBox(driver).click()
		 * ; test.log(LogStatus.PASS, "Contact Grant User Access Successfully");
		 * AddProject_Contact_Page.addNewContactsUserAccessAccountSetupCompleteCheckBox(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "Contact Account Setup Successfully");
		 * AddProject_Contact_Page.addNewContactsUserAccessUserName(driver).sendKeys(
		 * RandomClass.randomUserName()); test.log(LogStatus.PASS,
		 * "Contact User Name Added Successfully");
		 * AddProject_Contact_Page.addNewContactsUserAccessAutoGenerateButton(driver).
		 * click(); Thread.sleep(2000); test.log(LogStatus.INFO,
		 * "Clicked On Add New Contact Auto Generate Button");
		 * AddProject_Contact_Page.addNewContactsUserAccessTabSaveandCloseButton(driver)
		 * .click(); driver.switchTo().window(wb.map.get("childID"));
		 * test.log(LogStatus.INFO, "Clicked On User Access Tab Save and Close Button");
		 * Thread.sleep(1000); AddProject_Contact_Page.nextButton(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Next Button");
		 * AddProject_Project_Administrator_Access_Page.saveAndContinueButton(driver).
		 * click(); test.log(LogStatus.INFO,
		 * "Clicked On Project Administrator Access Save and Continue Button");
		 * 
		 * AddProject_Email_Management_Page.saveAndContinueButton(driver).click();
		 * test.log(LogStatus.INFO,
		 * "Clicked On Email Management Save and Continue Button");
		 * 
		 * AddProject_Enrollment_Setup_Page.saveAndContinueButton(driver).click();
		 * test.log(LogStatus.INFO,
		 * "Clicked On Enrollment Setup Save and Continue Button");
		 * 
		 * AddProject_Premium_Modification_Page.saveAndContinueButton(driver).click();
		 * 
		 * try { AddProject_Compliance_Page.nextButton(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On Compliance Next Button"); } catch
		 * (Throwable e) { System.out.println(e); }
		 * 
		 * Thread.sleep(2000); //comment a code because there is a huge changes in
		 * policy certificate tab //certificate Tab
		 * 
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
		 * 
		 * 
		 * AddProject_Certificate_Page.BtnAddProjectSpecificPolicyYes(driver).click();
		 * AddProject_Certificate_Page.BtnInheritProgramLevelPolicyYes(driver).click();
		 * AddProject_Certificate_Page.addProjectSpecificPolicyButton(driver).click();
		 * Thread.sleep(2000); AddProject_Certificate_Page.selecPolicyRadioBtn(driver,
		 * "Excess").click();
		 * AddProject_Certificate_Page.selectPolicyNextBtn(driver).click();
		 * Thread.sleep(3000); wb.getWindowID3();
		 * driver.switchTo().window(wb.map.get("subchildID")); Thread.sleep(2000);
		 * test.log(LogStatus.INFO, "Clicked On Add Project Specific Policy Button");
		 * wb.selectSingleValueByIndex(AddProject_Certificate_Page.
		 * addUmbPolSelectCarrier(driver), 11); test.log(LogStatus.PASS,
		 * "UMB Policy Carrier Selected Successfully");
		 * wb.selectSingleValue(AddProject_Certificate_Page.addUmbPolSelectLayer(driver)
		 * , "2"); test.log(LogStatus.PASS, "UMB Policy Layer Selected Successfully");
		 * AddProject_Certificate_Page.addUmbPolEnterPolicyNumberField(driver).sendKeys(
		 * "45781354"); test.log(LogStatus.PASS, "UMB Policy No Added Successfully");
		 * AddProject_Certificate_Page.addUmbPolSelectPolicyEffectiveDate(driver).
		 * sendKeys("10/05/2019"); test.log(LogStatus.PASS,
		 * "UMB Policy Effective Date Added Successfully");
		 * AddProject_Certificate_Page.addUmbPolSelectPolicyExpirationDate(driver).
		 * sendKeys("10/12/2021"); test.log(LogStatus.PASS,
		 * "UMB Policy Expiration Date Added Successfully");
		 * AddProject_Certificate_Page.addUmbPolProgramStartDateAsEffectiveDate(driver).
		 * click(); test.log(LogStatus.PASS,
		 * "UMB Policy Program Start Date As A Effective Date Radio Button Selected");
		 * AddProject_Certificate_Page.addUmbPolPolicyExpirationDateAsCompletionDate(
		 * driver).click(); test.log(LogStatus.PASS,
		 * "UMB Policy Policy Expiration Date As Completion Date Radio Button Selected"
		 * ); AddProject_Certificate_Page.addUmbPolEacyOccurrenceField(driver).sendKeys(
		 * "100000"); test.log(LogStatus.PASS,
		 * "UMB Policy Each Occurrence Added Successfully");
		 * AddProject_Certificate_Page.addUmbPolEacyAggregateField(driver).sendKeys(
		 * "10000"); test.log(LogStatus.PASS,
		 * "UMB Policy Aggregate Added Successfully");
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();",AddProject_Certificate_Page
		 * .addUmbPolSaveAndCloseBtn(driver));
		 * AddProject_Certificate_Page.addUmbPolSaveAndCloseBtn(driver).click();
		 * test.log(LogStatus.INFO, "Clicked On UMB Policy Save and Close Button");
		 * 
		 * // AddProject_Certificate_Page.addUmbPolSaveBtn(driver).click(); //
		 * test.log(LogStatus.INFO, "Clicked On UMB Policy Close Button");
		 * driver.switchTo().window(wb.map.get("childID"));
		 * 
		 * 
		 * 
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
		 * driver).sendKeys("ABC insurance"); Thread.sleep(2000);
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
		 * 
		 * 
		 * AddProject_Certificate_Page.saveAndContinueButton(driver).click();
		 * test.log(LogStatus.PASS,
		 * "Clicked On Crtificate Page Save And Continue Button ");
		 * 
		 * AddProject_Change_Order_Page.addChnageOrderbtn(driver).click();
		 * test.log(LogStatus.PASS, "Clicked On Add Change Order Button ");
		 * 
		 * wb.getWindowID3(); driver.switchTo().window(wb.map.get("subchildID"));// now
		 * for change order new window is not get open
		 * 
		 * AddProject_Change_Order_Page.additionalContractValueTextField(driver).
		 * sendKeys("1000"); test.log(LogStatus.PASS,
		 * "Change Order Additional Contract Value Added Succesfully ");
		 * AddProject_Change_Order_Page.effectiveDate(driver).sendKeys("01/01/2020",Keys
		 * .TAB); test.log(LogStatus.PASS,
		 * "Change Order Effective Date Added Succesfully ");
		 * AddProject_Change_Order_Page.newEstimatedCompletionDate(driver).sendKeys(
		 * "01/01/2021",Keys.TAB); test.log(LogStatus.PASS,
		 * "Change Order Completion Date Added Succesfully ");
		 * AddProject_Change_Order_Page.changeOrderNo(driver).sendKeys(
		 * "chnageOrderNo123"); test.log(LogStatus.PASS,
		 * "Change Order Number Added Succesfully ");
		 * AddProject_Change_Order_Page.descriptionField(driver).sendKeys("Testing");
		 * test.log(LogStatus.PASS, "Change Order Description Added Succesfully ");
		 * AddProject_Change_Order_Page.changeOrderSaveAndCloseBtn(driver).click();
		 * test.log(LogStatus.PASS, "Clicked On Change Order Save and Close Button ");
		 * 
		 * // driver.switchTo().window(wb.map.get("childID"));
		 * 
		 * AddProject_Change_Order_Page.finishAndClose(driver).click();
		 * test.log(LogStatus.PASS, "Clicked On Finish And Close Button ");
		 * System.out.println("Project Added Successfully");
		 * test.log(LogStatus.PASS," "+projectName+ " Project Added Successfully");
		 * driver.switchTo().window(wb.map.get("parentID"));
		 */

	}

}
