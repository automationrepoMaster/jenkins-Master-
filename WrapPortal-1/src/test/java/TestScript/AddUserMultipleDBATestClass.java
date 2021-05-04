package TestScript;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddSponsorPage;
import ObjectRepository.AddUserPage;
import ObjectRepository.SettingsModules;
import ObjectRepository.UsersModule;

public class AddUserMultipleDBATestClass extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	static String companyName=RandomClass.randomUserName();
	@Test
	public void addUserWithMultipleDBATest() throws InterruptedException
	{
		
		String dba=RandomClass.randomDBA();
		
		SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked On Profile Icon");
		SettingsModules.settingsModuleButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Settings Module");
		SettingsModules.settingsMenuUsersModule(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Cliced On User Module");
		UsersModule.userAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add User Icon");
		
		
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
	
		AddUserPage.addUserCompanyNameField(driver).sendKeys(companyName);
		test.log(LogStatus.PASS,companyName+ "Company Name Added Successfully");
		wb.selectSingleValueByIndex(AddUserPage.addUserLegalStatus(driver), 2);//using common library method for selecting particular value 
		test.log(LogStatus.PASS, "LLC Company Legal Status Added Successfully");
		
		AddUserPage.addUserDBAField(driver).sendKeys(dba);
		test.log(LogStatus.PASS, dba+" Company DBA Added Successfully");
		
		AddUserPage.addUserExtaDBA_Btn(driver).click();
		AddUserPage.addUserExtaDBA_Field(driver).sendKeys("DBA#11@2*-/");
		test.log(LogStatus.PASS, "DBA#11@2*-/ Company DBA Added Successfully");	
		AddUserPage.addUserExtaDBA_2ndBtn(driver).click();
		
		AddUserPage.addUserExtaDBA_Field(driver).click();
		AddUserPage.addUserLicenseNoField(driver).sendKeys("456546787");
		test.log(LogStatus.PASS, "Company Licence No Added Successfully");
		
		
		Thread.sleep(10000);
		
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
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> str2 = set1.iterator();
		String parent1 = str2.next();
		String child1 = str2.next();
		String subChild = str2.next();
		
		driver.switchTo().window(subChild);

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

		driver.switchTo().window(child1);
	
		AddUserPage.addUserAddressTabSaveAndContinueBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Save And Continue Button");	
		AddUserPage.addUserContactsTabFinishAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Finish And Close Button");
		driver.switchTo().window(wb.map.get("parentID"));//shift focus return to parent window
		test.log(LogStatus.INFO, "User Added Successfully");
		
//		driver.switchTo().frame(0);
//		test.log(LogStatus.INFO, "User Added Successfully");
//		System.out.println(UsersModule.userFetchContactsCountPrivewP(driver).getText());
//		test.log(LogStatus.INFO, "User Added Successfully");
//		System.out.println(UsersModule.userFetchModifiedByPrivewP(driver).getText());
//
//		System.out.println(UsersModule.userFetchCreatedByPrivewP(driver).getText());
//		driver.switchTo().defaultContent();
		System.out.println("User Added Successfully"); 
	}
}
