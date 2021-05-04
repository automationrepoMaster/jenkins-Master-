package RajaTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractorPage;

public class Contacts_Merging_Test extends BaseClass{
	
	String Contact1 ="conract 1";
	
	String Company2Merge ="ANUMBA";
	WebDriverCommonLib wb = new WebDriverCommonLib();
	
	
	@Test
	public void ContactosMerging() throws Throwable {
		
		JavascriptExecutor js  =(JavascriptExecutor)driver;
		AddContractorPage.contractorsIcon(driver).click();
		test.log(LogStatus.PASS	, "Contractors Icon is clicked succesfully");
		AddContractorPage.contractors_Merge_SearchIcon(driver).sendKeys("ABC");
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_SearchIcon(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Contractor name is entered succesffuly as :::: ABC  ");
		Thread.sleep(4000);
		DynamicContractor();
		System.out.println("dynamic contractor is selected as ABC ROGER");
		wb.ListOflist(AddContractorPage.Contractors_ContractorsList(driver), Contact1);
		test.log(LogStatus.PASS, "Contact is selected as  " + Contact1  +  " to merge sub contacts " );
		Thread.sleep(2000);
		driver.switchTo().frame(AddContractorPage.contractors_Merge_frame(driver));
		test.log(LogStatus.PASS, "Switched to frame at Contractor merge preview panel");
		wb.waitForElemnetMax(AddContractorPage.MergeFrameComapany(driver));
		AddContractorPage.MergeFrameComapany(driver).click();
		test.log(LogStatus.PASS, "Merge frame company is clicked");
		wb.SwitchtoChild1();
		test.log(LogStatus.PASS, "Switched to new tab for company selection");
		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).click();
		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).sendKeys(Company2Merge);
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_SearchCompany_Feild(driver).sendKeys(Keys.ENTER);
		test.log(LogStatus.PASS, "Company2 is selected as " + Company2Merge + "to merge ");
		Thread.sleep(2000);
		try {
		driver.switchTo().defaultContent();
		System.out.println("switched to default content");
		
		AddContractorPage.contractors_Merge_NextBtn(driver).click();
		
		}catch (Exception e) {
			
			AddContractorPage.contractors_Merge_StartOver_RadioBtn(driver).click();
			Thread.sleep(2000);
			System.out.println("we are in catch block ");
			AddContractorPage.contractors_Merge_Contact1_ChkBox(driver).click();
			Thread.sleep(2000);
			wb.scrollToEndt();
			
		}
//		AddContractorPage.contractors_Merge_Contact1_ChkBox(driver).click();
//		test.log(LogStatus.PASS, "Tick check boces for contact 1 to merge");
		Thread.sleep(2000);
		wb.scrollToEndt();
		AddContractorPage.contractors_Merge_NextBtn(driver).click();
		test.log(LogStatus.PASS, "Next button is clicked at Company section page");
		Thread.sleep(2000);
		try {
			wb.Alert_Click(AddContractorPage.contractors_Merge_ContinueToMergeBtn(driver));
		}catch (Exception e) {
			System.out.println("No such alert present");
		}
		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_FirstNameRadioBtn1(driver));
		test.log(LogStatus.PASS, "Firstname radio button is handled based on status of it");
		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_LastNameRadioBtn2(driver));
		test.log(LogStatus.PASS, "Last name radio button is handled based on status of it");
		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_DsiplayAsRadioBtn1(driver));
		test.log(LogStatus.PASS, "Display as radio button 1");
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_DisplayAsTextFeild_1(driver).click();
		AddContractorPage.contractors_Merge_DisplayAsTextFeild_1(driver).clear();
		Thread.sleep(1000);
		AddContractorPage.contractors_Merge_DisplayAsTextFeild_1(driver).sendKeys("CDEEFG123");
		test.log(LogStatus.PASS, "Display as text is enetred at Radio button1");
		js.executeScript("window.scrollTo(0, 300)");
		wb.ScrollIntoView(AddContractorPage.contractors_Merge_NoteRadioBtn1(driver));
		Thread.sleep(1000);
		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_NoteRadioBtn1(driver));
		test.log(LogStatus.PASS, "Notes Radio button is handled");
		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).click();
		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).click();
		Thread.sleep(1500);
		AddContractorPage.contractors_Merge_NoteTextFeild_1(driver).sendKeys("This for merging");
		test.log(LogStatus.PASS, "Notes text feild is entered");
		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_PhoneRadioBtn1(driver));
		test.log(LogStatus.PASS, "Phone1 check box is handled");
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_PhoneTextFeild_1(driver).sendKeys("1234567891234");
		test.log(LogStatus.PASS, "Phone number at text feild 1 is entered ");
		Thread.sleep(1500);
		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_MobileRadioBtn1(driver));
		test.log(LogStatus.PASS, "Mobile numnber chyeck box is handled");
		AddContractorPage.contractors_Merge_MobileTextFeild_1(driver).sendKeys("1234567891");
		wb.Tick_CheckBox(AddContractorPage.contractors_Merge_FaxTypeRadioBtn1(driver));
		wb.selectByVisibleText("Home",AddContractorPage .contractors_Merge_SelectFaxTypeDropDown1(driver));
		test.log(LogStatus.PASS, "Select Fax Type Dropsdown is selected");
		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_SelectFaxTypeDropDown1_Text_Feild(driver).sendKeys("12345678912345");
		wb.scrollToEndt();
		Thread.sleep(2000);
//		wb.ScrollIntoView(AddContractorPage.contractors_Merge_ContactTypeRadioBtn1(driver));
//		wb.CheckRadioBtn(AddContractorPage.contractors_Merge_ContactTypeRadioBtn1(driver));
//		test.log(LogStatus.PASS, "Contact Type radio Button 1 is clicked");
//		AddContractorPage.contractors_Merge_ContractTypeDropDown1(driver).click();
//		Thread.sleep(2000);
//		AddContractorPage.contractors_Merge_ContractTypeDropDown1(driver).sendKeys("ABC");
//		wb.ListOflist(AddContractorPage.contractors_Merge_ContracTTypeDropDownn_List1(driver), "ABC");
//		Thread.sleep(2000);
		AddContractorPage.contractors_Merge_Continue_RadioBtn(driver).click();
		test.log(LogStatus.PASS, "Conitnue to merge radio button is clicked");
		Thread.sleep(7000);
		AddContractorPage.CompleteMerge_Btn(driver).click();
		test.log(LogStatus.PASS, "Complete merge button is clicked");
		Thread.sleep(3000);
		AddContractorPage.contractors_Merge_YesIconfirmYesBtn(driver).click();
		test.log(LogStatus.PASS, "Yes I confirm Yes Btn is clicked to merge contacts ");
		Thread.sleep(5000);
		wb.Switchtoparent();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement DynamicContractor() {
		
		WebElement contractor = driver.findElement(By.xpath("//div[@class='mailDetails']/div[@class='companytitle']/span[contains(text(),'ABC Roger')]/../..//div[@data-original-title ='FEIN: ABC-FEIN']/../.."));
		return contractor;
	}

}
