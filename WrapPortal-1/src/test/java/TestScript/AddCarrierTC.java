package TestScript;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddCarriersPage;
import ObjectRepository.CarriersModule;
import ObjectRepository.HomePage;
import ObjectRepository.SettingsModules;




public class AddCarrierTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String carrierName=RandomClass.randomCarrierName();
	@Test
	public void addCarrierTC() throws Throwable
	{	
		
		
		
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home icon");
		Thread.sleep(3000);
		HomePage.HomeMenuSettings(driver).click();
		Thread.sleep(1000);
		wb.SwitchtoChild1();
		//SettingsModules.profileDropDown(driver).click();
		test.log(LogStatus.INFO, "Clicked on Profile icon");
		//SettingsModules.settingsModuleButton(driver).click();
		test.log(LogStatus.INFO, "Clicked on Settings icon");
		wb.waitForElemnet(SettingsModules.settingsMenuCarriersModule(driver));
		test.log(LogStatus.INFO, "Clicked on Carrier Module");
		CarriersModule.carriersAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Carrier add icon");
		Thread.sleep(2000);
		//wb.getWindowIDs();
		//driver.switchTo().window(wb.map.get("childID"));
		wb.SwitchtoChild2();
		Thread.sleep(1000);
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
		test.log(LogStatus.PASS," "+carrierName+" Carrier Added Successfully");
		Thread.sleep(1000);
		wb.SwitchtoChild1();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		//driver.switchTo().window(wb.map.get("parentID"));
		wb.Switchtoparent();
//		test.log(LogStatus.FATAL,);
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add Carrier")));

	  
		
		
	}
}
