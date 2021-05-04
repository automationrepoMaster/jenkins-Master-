package TestScript;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddSponsorPage;
import ObjectRepository.AddUserPage;
import ObjectRepository.HomePage;
import ObjectRepository.SettingsModules;
import ObjectRepository.UsersModule;

public class AddUserTC extends BaseClass {

	static String companyName=RandomClass.randomUserName();
	WebDriverCommonLib wb=new WebDriverCommonLib();

	@Test(priority = 0)
	public void selectUserModule() throws Throwable 
	{
	
		HomePage.HomeMenuSettings(driver).click();
		//SettingsModules.profileDropDown(driver).click();
		//test.log(LogStatus.INFO, "Clicked On Profile Icon");
		//SettingsModules.settingsModuleButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Settings Module");
		wb.SwitchtoChild1();
		Thread.sleep(3000);
		SettingsModules.settingsMenuUsersModule(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Cliced On User Module");
		UsersModule.userAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add User Icon");
		
		//Set<String> set = driver.getWindowHandles();
		//Iterator<String> str1 = set.iterator();
		//String parent = str1.next();
		//String child = str1.next();
		//driver.switchTo().window(child);
		wb.SwitchtoChild2();
		Thread.sleep(2000);
		
		AddUserPage.addUserCompanyNameField(driver).sendKeys(companyName);
		test.log(LogStatus.PASS,companyName+ " Company Name Added Successfully");
		wb.selectSingleValueByIndex(AddUserPage.addUserLegalStatus(driver), 2);//using common library method for selecting particular value 
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
		test.log(LogStatus.INFO, "Clicked On Save And Continue Button at GI page");	
     	AddSponsorPage.addSponsorAddAddressBtn(driver).click();
     	test.log(LogStatus.INFO, "Clicked On Add Address Button");
     	
     	
//		
//		Set<String> set1 = driver.getWindowHandles();
//		Iterator<String> str2 = set1.iterator();
//		String parent1 = str2.next();
//		String child1 = str2.next();
//		String subChild = str2.next();
//		
//		driver.switchTo().window(subChild);
		Thread.sleep(2000);
		wb.SwitchtoChild3();
		Thread.sleep(1000);
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

		//driver.switchTo().window(child1);
		Thread.sleep(2000);
	     wb.SwitchtoChild2();
		AddUserPage.addUserAddressTabSaveAndContinueBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Save And Continue Button");	
		AddUserPage.addUserContactsTabFinishAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Finish And Close Button");
		Thread.sleep(2000);
		wb.SwitchtoChild1();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		wb.Switchtoparent();
		//driver.switchTo().window(parent);//shift focus return to parent window
		test.log(LogStatus.INFO, companyName+" User Added Successfully");
		
//		driver.switchTo().frame(0);
//		test.log(LogStatus.INFO, "User Added Successfully");
//		System.out.println(UsersModule.userFetchContactsCountPrivewP(driver).getText());
//		test.log(LogStatus.INFO, "User Added Successfully");
//		System.out.println(UsersModule.userFetchModifiedByPrivewP(driver).getText());
//
//		System.out.println(UsersModule.userFetchCreatedByPrivewP(driver).getText());
//		driver.switchTo().defaultContent();
		System.out.println("User Added Successfully");  
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "AddUser")));

	}

}


/*Contacts (2)
Modified By : John Smith on 06/13/2019 01:15 AM
Created By : John Smith on 07/28/2018 02:05 AM
PASSED: selectUserModule

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


 */
