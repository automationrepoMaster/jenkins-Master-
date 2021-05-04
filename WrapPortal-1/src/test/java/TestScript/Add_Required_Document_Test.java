package TestScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractor_Pkg_Required_Documents_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class Add_Required_Document_Test extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String tradeSearch="TN4553";
	String programSearch="Automation Program dont touch";
	
	@Test
	public void addRequiredDocumentTest() throws InterruptedException, IOException
	{
		
		HomePage.controlMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		
		int x = 1;
		do {
			try {
				ContractorPackageModule.advanceSearchIcon(driver).click();
				test.log(LogStatus.PASS, "Clicked on Advance Search Icon");
				x=2;
			} catch (Throwable e) {
				System.out.println("Search icon not found " +e);
				js.executeScript("window.scrollBy(0,-350)", "");
			}
		} while (x==1);		
		
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProgram(driver), programSearch);
		test.log(LogStatus.PASS, programSearch+"Program Selected From Dropdown");
		ContractorPackageModule.advanceSearchSearchForTrade(driver).click();
		ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys(tradeSearch);
		test.log(LogStatus.PASS, "Trade Selected Successfully");
		Thread.sleep(2000);
		ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys(Keys.TAB);
		js.executeScript("arguments[0].click();",ContractorPackageModule.advanceSearchSearchBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Search Button");
		Thread.sleep(7000);
		
		driver.switchTo().frame(0);
//		wb.waitForElemnet(ContractorPackageModule.fetchTradeNamePriviewP(driver));
		//System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
		
		wb.waitForElemnet(ContractorPackageModule.RequiredDocumentsPagePriviewP(driver));
		 Thread.sleep(3000);
		test.log(LogStatus.INFO, "Clicked on Required Document Page");
		// switch focus to child window
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		Thread.sleep(7000);
		AddContractor_Pkg_Required_Documents_Page.btnAddNewDocument(driver).click();	
		test.log(LogStatus.PASS, "Clicked on Add Document Button");
		List<WebElement> checkBoxCount = AddContractor_Pkg_Required_Documents_Page.selectAllDocumentcheckBoxWhatAreYouUploadingPage(driver);
		
		for(int i=0;i<checkBoxCount.size();i++)
		{
			checkBoxCount.get(i).click();
			Thread.sleep(500);
		}
		test.log(LogStatus.PASS, "Document Checkbox selected Successfully");
		js.executeScript("window.scrollBy(0,150)", "");
		js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.clickHereToUploadManualyLink(driver));
		test.log(LogStatus.PASS, "Clicked on Click Here to upload manually Link ");
		AddContractor_Pkg_Required_Documents_Page.addDocNameOfTheFileField(driver).sendKeys("TestFile");
		test.log(LogStatus.PASS, "Document Name Added Successfully");
		AddContractor_Pkg_Required_Documents_Page.addDocPlusBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Document Plus Button");
		//add file through AutoIT
		//Runtime.getRuntime().exec("E:\\kp workspace selenium\\Wrap Portal\\AutoIT Script\\FileUpload.exe");
		 //Runtime.getRuntime().exec("D:\\NOURTEK\\Wrap Portal\\AutoIT Script\\Raja\\AddDocumnet.exe");
		Runtime.getRuntime().exec("D:\\NOURTEK\\InjalaProject\\AutoIT\\AddDocumnet.exe");
		test.log(LogStatus.PASS, "Documnet Added Successfully");
		Thread.sleep(3000);
		AddContractor_Pkg_Required_Documents_Page.addDocAddBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked on Alert Add Document Button");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.markedAsConfirmedRadioBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Mark As Confirmed");
		js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.addDocsaveAndCloseBtn(driver));
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Clicked on Save And Close button");
		driver.switchTo().window(wb.map.get("parentID"));
	}
}
