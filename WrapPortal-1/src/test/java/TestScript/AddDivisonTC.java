package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddDivisonPage;
import ObjectRepository.DivisionModule;
import ObjectRepository.HomePage;

public class AddDivisonTC extends BaseClass 
{
	String divisionName=RandomClass.randomDivisionName();
	@Test
	public void addDivisionTestScript() throws InterruptedException {
		
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuDistrict(driver).click();
		test.log(LogStatus.INFO, "Clicked on Division Module Icon");
		DivisionModule.divisionAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked Add Division Icon");
		WebDriverCommonLib wb = new WebDriverCommonLib();
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
		Thread.sleep(2000);
		AddDivisonPage.addDivisionContactNameField(driver).sendKeys("Dave John");
		test.log(LogStatus.PASS, "Division Contact Name Added Successfully");
		AddDivisonPage.addDivisionContactEmailField(driver).sendKeys("kiran@nourtek.net");
		test.log(LogStatus.PASS, "Division Email ID Added Successfully");
		AddDivisonPage.addDivisionPhoneNoField(driver).sendKeys(RandomClass.randomPhoneNo());
		test.log(LogStatus.PASS, "Division Phone No Added Successfully");
		AddDivisonPage.addDivisionDivisionNoteField(driver).sendKeys("Testing");
		test.log(LogStatus.PASS, "Division Note Added Successfully");
		wb.selectSingleValueByIndex(AddDivisonPage.addDivisionRegionField(driver),2);
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
		Thread.sleep(2000);
		AddDivisonPage.addDivisionAddressTabNextBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Address Tab Next Button");
		AddDivisonPage.addDivisionContactsTabNextBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contacts Tab Next Button");
		AddDivisonPage.addDivisionUserAccessTabAddSponsorBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Sponsors Add Button");
		wb.selectSingleValueByIndex(AddDivisonPage.addDivisionUserAccessSelectSponsorDropDown(driver),5);
		test.log(LogStatus.PASS, "Sponsor Selected Successfully");
		AddDivisonPage.addDivisionUserAccessTabAddSponsorPlusBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Plus Button Button");
		AddDivisonPage.addDivisionUserAccessTabFinishAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked On Finish And Close Button");
		test.log(LogStatus.PASS, divisionName+ " Division Added Successfully");
		System.out.println("Division Added Successfully");  
		driver.switchTo().window(wb.map.get("parentID"));
		
		
	}
}
