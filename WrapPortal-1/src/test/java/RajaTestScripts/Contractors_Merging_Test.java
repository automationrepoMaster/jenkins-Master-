package RajaTestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddContractorPage;
import ObjectRepository.ContractorModule;
import ObjectRepository.HomePage;




public class Contractors_Merging_Test extends BaseClass {
	String Contact1 = "CDE CDE123";
	String Company2Merge ="ANUMBA"; // "Alex Company";
	String LegalStatus = "Corporation";

	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void ContractorsMerging() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		AddContractorPage.contractorsIcon(driver).click();
		test.log(LogStatus.PASS, "Contractors Icon is clicked succesfully");
		//addContractorTestScript();
		Thread.sleep(1500);
		AddContractorPage.contractors_Merge_SearchIcon(driver).sendKeys("ABC");
		Thread.sleep(2000);
		
		AddContractorPage.contractors_Merge_SearchIcon(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contractor name is entered succesffuly as :::: ABC  ");
		Thread.sleep(4000);
		DynamicContractor();
		System.out.println("dynamic contractor is selected as ABC ROGER");
//		wb.ListOflist(AddContractorPage.Contractors_ContractorsList(driver), Contact1);
//		test.log(LogStatus.PASS, "Contact is selected as  " + Contact1  +  " to merge sub contacts " );
//		Thread.sleep(2000);
		driver.switchTo().frame(AddContractorPage.contractors_Merge_frame(driver));
		test.log(LogStatus.PASS, "Switched to frame at Contractor merge preview panel");
		wb.waitForElemnetMax(AddContractorPage.MergeFrameComapany(driver));
		AddContractorPage.MergeFrameComapany(driver).click();
		test.log(LogStatus.PASS, "Merge frame company is clicked");
		wb.SwitchtoChild1();
		try {
			test.log(LogStatus.PASS, "Switched to new tab for company selection");
			driver.switchTo().defaultContent();
			System.out.println("switched to default content");
			AddContractorPage.contractors_Merge_StartOver_RadioBtn(driver).click();
			AddContractorPage.Contractors_merge_CompanyMergeNextBt(driver).click();
			Thread.sleep(2000);
			System.out.println("next btn is clikced");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("no such element to click");
		}

		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).click();
		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).sendKeys(Company2Merge);
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Company2 is selected as " + Company2Merge + "to merge ");
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_NextBtn(driver).click();
		System.out.println("next btn is clikced");
		Thread.sleep(1000);
		try {
			AddContractorPage.ContinuetoMergeAlertOkBtn(driver).click();
		} catch (Exception e) {
			System.out.println("no such alert present");
		}
		try {
			AddContractorPage.contractors_Merge_Contact1_ChkBox(driver).click();
			test.log(LogStatus.PASS, "Tick check boces for contact 1 to merge");
			Thread.sleep(2000);
			wb.scrollToEndt();
			AddContractorPage.contractors_Merge_NextBtn(driver).click();
			test.log(LogStatus.PASS, "Next button is clicked at Company section page");
			Thread.sleep(2000);
			// wb.Alert_Click(AddContractorPage.continue(driver).click();
		} catch (Exception e) {
			System.out.println("no such elemnt to perform some operation");// TODO: handle exception
		}
		wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_CompanyRadioBtn1(driver));
		test.log(LogStatus.PASS, "Company name  radio button is handled based on status of it");
		wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_FEINRadioBtn1(driver));
		test.log(LogStatus.PASS, "FEIN radio button is handled based on status of it");
		wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_LegalStatusRadioBtn1(driver));
		test.log(LogStatus.PASS, "Legal status clicked  as radio button 1");
		Thread.sleep(2000);
		try {
			wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_CompanyGroupRadioBtn1(driver));
			test.log(LogStatus.PASS, "Company Group Radio button is clicked");
		} catch (Exception e) {
			System.out.println("no need to select");
		}
		js.executeScript("window.scrollBy(0,300)");
		AddContractorPage.ContractorsMerge_LegalStatusRadioBtn1(driver).click();
		Thread.sleep(1000);
		AddContractorPage.ContractorsMerge_LegalStatusRadioBtn1(driver).click();
		test.log(LogStatus.PASS, " Legal status Radio button is clicked");
		wb.selectByVisibleText(LegalStatus, AddContractorPage.ContractorsMerge_LegalStatusSelectText1(driver));
		test.log(LogStatus.PASS, "Legal status is selected as " + LegalStatus);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		// AddContractorPage.ContractorsMerge_AddressTypeChkBox1(driver).click();
		test.log(LogStatus.PASS, "Address type check box is selected");
		// wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_AddressSetMailingAddressRadioBtn1(driver));
		AddContractorPage.ContractorsMerge_AddressSetMailingAddressRadioBtn1(driver).click();
		test.log(LogStatus.PASS, "Addres set mailing Address is selected");
		// wb.CheckRadioBtn(AddContractorPage.ContractorsMerge_SetPrimaryAddressRadioBtn1(driver));
		AddContractorPage.ContractorsMerge_SetPrimaryAddressRadioBtn1(driver).click();
		test.log(LogStatus.PASS, "Set primasry address is selected");
		wb.scrollToEndt();
//		
//		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_NoteRadioBtn1(driver));
//		test.log(LogStatus.PASS, "Notes Radio button is handled");
//		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).click();
//		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).click();
//		Thread.sleep(1500);
//		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).sendKeys("This for merging");
//		test.log(LogStatus.PASS, "Notes text feild is entered");
//		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_PhoneRadioBtn1(driver));
//		test.log(LogStatus.PASS, "Phone1 check box is handled");
//		Thread.sleep(2000);
//		AddContractorPage.contractors_Merge_PhoneTextFeild_1(driver).sendKeys("1234567891234");
//		test.log(LogStatus.PASS, "Phone number at text feild 1 is entered ");
//		Thread.sleep(1500);
//		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_MobileRadioBtn1(driver));
//		test.log(LogStatus.PASS, "Mobile numnber chyeck box is handled");
//		AddContractorPage.contractors_Merge_MobileTextFeild_1(driver).sendKeys("1234567891");
//		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_FaxTypeRadioBtn1(driver));
//		wb.selectByVisibleText("Home",AddContractorPage .contractors_Merge_SelectFaxTypeDropDown1(driver));
//		test.log(LogStatus.PASS, "Select Fax Type Dropsdown is selected");
//		Thread.sleep(2000);
//		AddContractorPage.contractors_Merge_SelectFaxTypeDropDown1_Text_Feild(driver).sendKeys("12345678912345");
//		wb.scrollToEndt();
//		Thread.sleep(2000);
//		wb.ScrollIntoView(AddContractorPage.contractors_Merge_ContactTypeRadioBtn1(driver));
//		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_ContactTypeRadioBtn1(driver));
//		test.log(LogStatus.PASS, "Contact Type radio Button 1 is clicked");
//		AddContractorPage.contractors_Merge_ContractTypeDropDown1(driver).click();
//		Thread.sleep(2000);
//		AddContractorPage.contractors_Merge_ContractTypeDropDown1(driver).sendKeys("ABC");
//		wb.ListOflist(AddContractorPage.contractors_Merge_ContracTTypeDropDownn_List1(driver), "ABC");
//		Thread.sleep(2000);
		AddContractorPage.ContractorsMerge_ContinueTomergeCOmaonies(driver).click();
		test.log(LogStatus.PASS, "Conitnue to merge radio button is clicked");
		Thread.sleep(7000);
		try {
			AddContractorPage.ContinuetoMergeAlertOkBtn(driver).click();
			test.log(LogStatus.PASS, "Alert is present at before  Merging final");
		} catch (Exception e) {
			test.log(LogStatus.PASS, "No such alert present");
		}

		AddContractorPage.ContinuetoMerge_CompleteMergeBtn(driver).click();
		test.log(LogStatus.PASS, "Complete merge button is clicked");
		
		Thread.sleep(3000);
		try {
			AddContractorPage.contractors_Merge_YesIconfirmYesBtn(driver).click();
			test.log(LogStatus.PASS, "Yes I confirm Yes Btn is clicked to merge contacts ");
		} catch (Exception e) {
			test.log(LogStatus.PASS,
					"no such alert at Complete merge button and directly confiirmed without nay alert");
		}
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add contractor")));
		driver.close();
		Thread.sleep(5000);
		wb.Switchtoparent();

	}

	public WebElement DynamicContractor() {

		WebElement contractor = driver.findElement(By.xpath(
				"//div[@class='mailDetails']/div[@class='companytitle']/span[contains(text(),'ABC Roger')]/../..//div[@data-original-title ='FEIN: ABC-FEIN']/../.."));
		return contractor;
	}

	
	
	public void addContractorTestScript() throws InterruptedException
	{
		//HomePage.controlMenuHomeIcon(driver).click();
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
		AddContractorPage.addContractorCompanyNameField(driver).sendKeys(RandomClass.randomContractorCompanyName());
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
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add contractor")));
		driver.switchTo().window(parent1);
		Thread.sleep(2000);
	}
}
