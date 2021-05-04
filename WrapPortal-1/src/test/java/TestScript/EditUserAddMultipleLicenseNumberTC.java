package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddUserPage;
import ObjectRepository.SettingsModules;
import ObjectRepository.UsersModule;

public class EditUserAddMultipleLicenseNumberTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void editUserAddMultipleLicenseNO() throws InterruptedException
	{
		
//		String companyName=RandomClass.randomUserName();
//		String dba=RandomClass.randomDBA();
//		
		SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked On Profile Icon");
		SettingsModules.settingsModuleButton(driver).click();
		test.log(LogStatus.INFO, "Clicked On Settings Module");
		SettingsModules.settingsMenuUsersModule(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Cliced On User Module");
		
		UsersModule.userSearchEditBox(driver).sendKeys("User3462");//AddUserTC.companyName
		UsersModule.userSearchIcon(driver).click();
		Thread.sleep(4000);
		UsersModule.userEditIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Edit User Icon");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		AddUserPage.addUserCompanyNameField(driver).click();
		
		AddUserPage.addUserLicenseAddExtraBtn(driver).click();
		
//		AddUserPage.addUserLicenseAddExtraBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add License No Button");
		AddUserPage.addUser2ndLicenseNoField(driver).sendKeys("123131");
		test.log(LogStatus.PASS, "123131 License No Added Successfully");
		AddUserPage.addUserLicenseAddExtra2ndBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add License No Button");
		AddUserPage.addUser3rdLicenseNoField(driver).sendKeys("1245^%$ssdL");
		test.log(LogStatus.PASS, "1245^%$ssdL License No Added Successfully");
		AddUserPage.addUserLicenseAddExtra3rdBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add License No Button");
		AddUserPage.addUser4thLicenseNoField(driver).sendKeys("0LIC45%%KP//*4545sd54");
		test.log(LogStatus.PASS, "0LIC45%%KP//*4545sd54 License No Added Successfully");
		AddUserPage.addUserLicenseAddExtra4thBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Add License No Button");
		
		AddUserPage.addUserSaveAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Save And Close Button");
		test.log(LogStatus.PASS, "License Numbers Updated Successfully");
		driver.switchTo().window(wb.map.get("parentID"));
		
//		String legalStatusName=AddUserPage.addUserLegalStatus(driver).getText();
//		test.log(LogStatus.PASS, legalStatusName+ " Company Legal Status Fetched Successfully");
//		wb.selectSingleValue(AddUserPage.addUserLegalStatus(driver), "Partnership");//using common library method for selecting particular value 
//		test.log(LogStatus.PASS, "Company Legal Status Changed To Partnership Successfully");
//		AddUserPage.addUserExtaDBA_Btn(driver).click();
//		test.log(LogStatus.INFO, "Clicked On Add DBA Button");
//		AddUserPage.addUserExtaDBA_Field(driver).sendKeys("DBA#11@2*-/");
//		test.log(LogStatus.PASS, "DBA#11@2*-/ Company DBA Added Successfully");		
//		AddUserPage.addUserExtaDBA_2ndBtn(driver).click();
//		test.log(LogStatus.INFO, "Clicked On Add DBA Button");
//		AddUserPage.addUserExta3rdDBA_Field(driver).sendKeys("/*/*#^%%#");
//		test.log(LogStatus.PASS, "/*/*#^%%# Company DBA Added Successfully");
//		AddUserPage.addUserExtaDBA_3rdBtn(driver).click();
//		test.log(LogStatus.INFO, "Clicked On Add DBA Button");		
//		AddUserPage.addUserExta4thDBA_Field(driver).sendKeys("87987/^%^&");
//		test.log(LogStatus.PASS, "87987/^%^& Company DBA Added Successfully");
//		AddUserPage.addUserExtaDBA_4thBtn(driver).click();
//		test.log(LogStatus.INFO, "Clicked On Add DBA Button");
//		
//		AddUserPage.addUserEmailField(driver).clear();
//		AddUserPage.addUserEmailField(driver).sendKeys("kiran@nourtek.net@123");
//		test.log(LogStatus.PASS, "kiran@nourtek.net@123 Wrong Email Address Entered");
//		AddUserPage.addUserCompanyNameField(driver).click();
//		Thread.sleep(2000);
//		//AddUserPage.addUserSaveBtn(driver).click();
//		String expectedErroMsg="Please enter a valid email address.";
//		String errorMsg=AddUserPage.addUserEmailError(driver).getText();
//		System.out.println("Error Massage"+errorMsg);
//		
//			if(expectedErroMsg.contains(errorMsg))
//			{	
//				System.out.println("Enter into if loop");
//				test.log(LogStatus.PASS, errorMsg+ " Error Massage Displayed");   
//			}
//			else
//			{
//			test.log(LogStatus.FAIL, errorMsg+ " Error Massage Not Displayed");
//			}
//			Thread.sleep(3000);
//			
//		AddUserPage.addUserEmailField(driver).sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		AddUserPage.addUserEmailField(driver).sendKeys(Keys.chord(Keys.BACK_SPACE));
//		AddUserPage.addUserEmailField(driver).sendKeys("kiran@nourtek.net");
//		test.log(LogStatus.PASS, "kiran@nourtek.net Entered Correct Email Address");
//		AddUserPage.addUserSaveAndCloseBtn(driver).click();
//		test.log(LogStatus.INFO, "Clicked On Save And Close Button");
//		test.log(LogStatus.PASS, "DBA Updated Successfully");
//		driver.switchTo().window(wb.map.get("parentID"));
	
	}
}
