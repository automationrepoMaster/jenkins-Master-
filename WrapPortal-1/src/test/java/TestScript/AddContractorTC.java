package TestScript;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractorPage;
import ObjectRepository.ContractorModule;
import ObjectRepository.HomePage;

public class AddContractorTC extends BaseClass
{
	@Test
	public void addContractorTestScript() throws InterruptedException
	{
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuContractors(driver).click();
		test.log(LogStatus.PASS, "Click on Contractor Module From Home Page");
		Thread.sleep(6000);
		ContractorModule.contractorAddIcon(driver).click();

		Thread.sleep(2000);

		Set<String> set = driver.getWindowHandles();
		Iterator<String> str1 = set.iterator();
		String parent = str1.next();
		String child = str1.next();
		driver.switchTo().window(child);
		
		
		AddContractorPage.addContractorCompanyNameField(driver).sendKeys(RandomClass.randomContractorCompanyNames());
		test.log(LogStatus.PASS, "Company Name added successfully");
		Thread.sleep(2000);
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
		AddContractorPage.addContractorFirstNameField(driver).sendKeys("Jimmy");
		test.log(LogStatus.PASS, "Contractor Name added successfully");
		AddContractorPage.addContractorMiddleNameField(driver).sendKeys("BV");
		test.log(LogStatus.PASS, "Contractor Middle Name added successfully");
		AddContractorPage.addContractorLastNameField(driver).sendKeys("Smith");
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
		
	//	AddContractorPage.alertOKBtnSameComapnyName(driver).click();
		
//		try {
//			Alert alt=driver.switchTo().alert();
//			String altString= alt.getText();
//			alt.accept();
//			test.log(LogStatus.PASS, "Alert Accepted");
//			System.out.println(altString);
//			test.log(LogStatus.PASS,altString +" Alert Message Displayed");
//			
//		} catch (Throwable e) {
//			
//			test.log(LogStatus.PASS, " Alert Message is not Displayed");
//		}
		
		AddContractorPage.addContractorAddAddressBtn(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Click on Add Address Button");
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> str2 = set1.iterator();
		String parent1 = str2.next();
		String child1 = str2.next();
		String subChild = str2.next();
		driver.switchTo().window(subChild);

		AddContractorPage.addContractorAddAddressSelectAddressType(driver, "Mailing Address");
		test.log(LogStatus.PASS, "Address Type selected successfully");
		AddContractorPage.addContractorAddAddressAddress1Field(driver).sendKeys(RandomClass.randomAddress1Field());
		test.log(LogStatus.PASS, "Address 1 Field added successfully");
		AddContractorPage.addContractorAddAddressCityField(driver).sendKeys(RandomClass.randomState());
		test.log(LogStatus.PASS, "Address City added successfully");
		AddContractorPage.addContractorAddAddressSelectState(driver, RandomClass.randomState());
		test.log(LogStatus.PASS, "Address State Selected successfully");
		AddContractorPage.addContractorAddAddressZipCode(driver).sendKeys("789654123");
		test.log(LogStatus.PASS, "Zip Code added successfully");
		AddContractorPage.addContractorAddAddressSaveAndCloseBtn(driver).click();

		driver.switchTo().window(child1);
		AddContractorPage.addContractorAddressTabSaveAndContinueBtn(driver).click();
		AddContractorPage.addContractorContactsTabFinishAndCloseBtn(driver).click();
		System.out.println("Contractor Added Successfully");  
		test.log(LogStatus.PASS, "Contractor added successfully");
		driver.switchTo().window(parent1);
		Thread.sleep(2000);
	}
}
