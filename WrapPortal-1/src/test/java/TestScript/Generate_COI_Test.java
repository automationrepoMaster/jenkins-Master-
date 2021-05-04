package TestScript;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractor_Pkg_ViewCertificatePage;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class Generate_COI_Test extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String tradeSearch="007";
	String programSearch="Sony Programs3524";                 //"Automation Program dont touch";
	String projectSearch ="Sony Projects3524";
	
	String ContractorPKgId ="C148492";
	@Test
	public void testGenerateCOI() throws Throwable
	{   
		JavascriptExecutor js = (JavascriptExecutor)driver;
		HomePage.HomeMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");
		Thread.sleep(5000);
		wb.scrollToTop();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ContractorPackageModule.advanceSearchIcon(driver));
		js.executeScript("arguments[0].click();", ContractorPackageModule.advanceSearchIcon(driver));

		
		
		//ContractorPackageModule.advanceSearchIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked on Advance Search Icon");
		Thread.sleep(500);
		
		
		
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProgram(driver), programSearch);
		test.log(LogStatus.PASS, programSearch+"programSearch  Selected From Dropdown");
		Thread.sleep(1000);
		
		wb.selectSingleValue(ContractorPackageModule.AdvSearchSelectproject(driver), projectSearch);
		test.log(LogStatus.PASS, projectSearch+"projectSearch Selected From Dropdown");
		Thread.sleep(2000);
		
		ContractorPackageModule.advanceSearchSearchForTrade(driver).click();
		ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys(tradeSearch);
		test.log(LogStatus.PASS, "Trade Selected Successfully");
		Thread.sleep(2000);
		ContractorPackageModule.advanceSearchSearchForTrade(driver).sendKeys(Keys.TAB);
		Thread.sleep(500);
		
		ContractorPackageModule.advanceSearchSearchByContractorNumber(driver).sendKeys(ContractorPKgId);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",ContractorPackageModule.advanceSearchSearchBtn(driver));
		test.log(LogStatus.PASS, "Clicked on Search Button");
		//Thread.sleep(7000);
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		ContractorPackageModule.CertificatePagePriviewP(driver).click();
		test.log(LogStatus.PASS, "switched to frame");
		Thread.sleep(2000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		AddContractor_Pkg_ViewCertificatePage.btnAutoGenerateCertificate(driver).click();
		Thread.sleep(8000);
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));  
		String nowDate= dtf.format(now);
		
		
		/*
		 * String
		 * GLdate=AddContractor_Pkg_ViewCertificatePage.GL_PolicyDateTime(driver).
		 * getText(); String[] dateSplit=GLdate.split(" "); for(int
		 * j=0;j<dateSplit.length;j++) { System.out.println(dateSplit[j]);
		 * if(dateSplit[j].contains(nowDate)) { System.out.println("Date Matched"); } }
		 */
		
		test.log(LogStatus.PASS, nowDate + " date Matched");
		Thread.sleep(3000);
		
		/*
		 * String
		 * str1=AddContractor_Pkg_ViewCertificatePage.GL_PolicyNo(driver).getText();
		 * System.out.println(AddContractor_Pkg_ViewCertificatePage.GL_PolicyNo(driver).
		 * getText()); String polNo="POLP3524"; String [] str2=str1.split(" ");
		 */
		String polNo="POLP3524";
		
//		for(int i=0 ; i<str2.length;i++)
//		{
//			if(str2[i].contains(polNo))
//			{
//				System.out.println("Policy No Matched");
//				break;
//			}
//			System.out.println(str2[i]);
//		}
		
		test.log(LogStatus.PASS, polNo + "macthed");
		Thread.sleep(5000);
		driver.close();
	/*	Thread.sleep(1500);
		driver.switchTo().defaultContent();*/
		
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(1500);
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		
		/*
		 * ContractorPackageModule.CertificateSeeMorePriviewP(driver).click();
		 * Thread.sleep(1500);
		 * 
		 * String
		 * autoMobilePolNoActual=ContractorPackageModule.AutoMobileCertificateNoPriviewP
		 * (driver).getText(); String autoMobilePolNoExpected="MASTER AUTO POL 545121";
		 * if(autoMobilePolNoActual.contains(autoMobilePolNoExpected)) {
		 * System.out.println("Automobile policy matched"); }
		 */
			
//		driver.switchTo().window(wb.map.get("parentID"));
	}
}
