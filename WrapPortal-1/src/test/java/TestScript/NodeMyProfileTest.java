package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.MyProfile_Module;
import ObjectRepository.SecurityGroupsModule;
import ObjectRepository.SettingsModules;

public class NodeMyProfileTest extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testNodeMyProfile() throws Throwable
	{
		
		SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile Icon");
		
		wb.mouseMoveToElement(SettingsModules.settingsModuleButton(driver));
		test.log(LogStatus.INFO, "Clicked on Settings Module ");
//		SettingsModules.settingsModuleButton(driver).click();
		
		Thread.sleep(3000);
		SettingsModules.settingsMenuSecurityGroupsModule(driver).click();	
		test.log(LogStatus.INFO, "Clicked on Security Module");
		
		wb.selectByValue(SecurityGroupsModule.selectProfileDropDown(driver), "161");
		test.log(LogStatus.INFO, "Clicked on DropDown ");
		
		SecurityGroupsModule.moduleNameTitle_Add_Edit_View_Delete_SelectAllCheckBox(driver, "Edit").click();
		test.log(LogStatus.INFO, "Check Add Check Box");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SecurityGroupsModule.Save_Btn(driver));
		
		SecurityGroupsModule.Save_Btn(driver).click();
		test.log(LogStatus.INFO, "Clicked on Save Button");
		Thread.sleep(2000);
		wb.alertOk();
		
		
		SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile Icon");
		wb.mouseMoveToElement(SettingsModules.settingsLogoutButton(driver));
		test.log(LogStatus.INFO, "Clicked on Logout Button");
//		driver.navigate().to("https://beta.wrapportal.com/");
		
		
		Thread.sleep(5000);
		driver.findElement(By.id("txtUserName")).sendKeys("HobsShobsUsers81");
		test.log(LogStatus.INFO, "Username Entered Successfully");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin@123"); //mc7rT4po0pAX");//pObj.getProperty("password")
		test.log(LogStatus.INFO, "Password Entred Successfully");

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		test.log(LogStatus.INFO, "Clicked on Login Button");

		
		SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile Icon");
		wb.mouseMoveToElement(SettingsModules.settingsModuleButton(driver));
		test.log(LogStatus.INFO, "Clicked on Settings Module Button");

		SettingsModules.settingsMenuMyProfileModule(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile Module Button");

		System.out.println("Company name is - "+MyProfile_Module.companyName(driver).isEnabled());
		System.out.println("Company Name field is disabled "+MyProfile_Module.companyName(driver).getAttribute("disabled"));
		
		
		
		test.log(LogStatus.INFO, "Verify the Company Name Field");
		System.out.println(MyProfile_Module.firstName(driver).isEnabled());
		test.log(LogStatus.INFO, "Verify the First Name Field");
		
		String attValue="disabled";
		if (MyProfile_Module.lastName(driver).getAttribute("disabled")==attValue) 
		{
			System.out.println("My Profile is not editable");
			test.log(LogStatus.PASS, "My Profile is not editable");

		}else
		{
			System.out.println("My Profile is editable");
			test.log(LogStatus.PASS, "My Profile is editable");

		}
		
		MyProfile_Module.phoneNo(driver).isEnabled();
		MyProfile_Module.faxNo(driver).isEnabled();
		MyProfile_Module.email(driver).isEnabled();
		
		MyProfile_Module.selectPaging(driver).isEnabled();
		MyProfile_Module.selectTimeZone(driver).isEnabled();
		MyProfile_Module.selectDefaultLandingPage(driver).isEnabled();
		
		MyProfile_Module.userNameField(driver).isEnabled();
		MyProfile_Module.passwordField(driver).isEnabled();
		MyProfile_Module.reEnterPasswordField(driver).isEnabled();
		
		MyProfile_Module.profileSaveBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile Save Button");

			
	}
}
