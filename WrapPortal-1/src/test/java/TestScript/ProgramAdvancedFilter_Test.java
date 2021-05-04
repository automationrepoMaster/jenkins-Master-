package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class ProgramAdvancedFilter_Test extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testProgramAdvanceFilter() throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// String expectedElement= "Program5917";
		test.log(LogStatus.INFO, "========== Add Program Section  ==========");
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuPrograms(driver).click();
		test.log(LogStatus.INFO, "Clicked On Programs Module Icon");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProgramModule.programAdvanceSearchIcon(driver).click();
		Thread.sleep(2000);
		
		//search for WC and GL policy type
		wb.selectSingleValue(ProgramModule.programAdvanceSearchSelectPolicyType(driver), "WC and GL");
		ProgramModule.programAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> policyType = ProgramModule.selectAllProgramEnrollmentTypeFrmList(driver);
		System.out.println(policyType.size());
		for(int i=0 ;i<policyType.size();i++)
		{
			if(policyType.get(i).getText().contains("WC and GL"))
			{
				System.out.println("Program Policy Type Matched");
			}else
			{
				System.err.println("Program Policy Type Not Matched");
			}
		}
		
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProgramModule.programAdvanceSearchIcon(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValue(ProgramModule.programAdvanceSearchSelectPolicyType(driver), "GL Only");
		ProgramModule.programAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> policyType2 = ProgramModule.selectAllProgramEnrollmentTypeFrmList(driver);
		System.out.println(policyType2.size());
		for(int i=0 ;i<policyType2.size();i++)
		{
			if(policyType2.get(i).getText().contains("GL Only"))
			{
				System.out.println("Program Policy Type Matched 2");
			}else
			{
				System.err.println("Program Policy Type Not Matched 2");
			}
		}
		
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProgramModule.programAdvanceSearchIcon(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValue(ProgramModule.programAdvanceSearchSelectPolicyType(driver), "WC Only");
		ProgramModule.programAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> policyType3 = ProgramModule.selectAllProgramEnrollmentTypeFrmList(driver);
		System.out.println(policyType3.size());
		for(int i=0 ;i<policyType3.size();i++)
		{
			if(policyType3.get(i).getText().contains("WC Only"))
			{
				System.out.println("Program Policy Type Matched 3");
			}else
			{
				System.err.println("Program Policy Type Not Matched 3");
			}
		}

		//Sponsor Search
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProgramModule.programClearIcon(driver).click();
		Thread.sleep(2000);
		ProgramModule.programAdvanceSearchIcon(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValue(ProgramModule.programAdvanceSearchSelectProgramSponsor(driver), "Sponsor347 - Jimmy Smith");
		ProgramModule.programAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> sponsorNameList = ProgramModule.selectAllProgramSponsorNameFrmList(driver);
		System.out.println(sponsorNameList.size());
		for(int i=0 ;i<sponsorNameList.size();i++)
		{
			if(sponsorNameList.get(i).getText().contains("Sponsor347 - Jimmy Smith"))
			{
				System.out.println("Program Sponsor Name Matched");
			}else
			{
				System.err.println("Program Sponsor Name Not Matched");
			}
		}
		
		//Administrator Search
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProgramModule.programClearIcon(driver).click();
		Thread.sleep(2000);
		ProgramModule.programAdvanceSearchIcon(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValue(ProgramModule.programAdvanceSearchSelectProgramAdmin(driver), "User1902 - John1 Tom1");
		ProgramModule.programAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> adminNameList = ProgramModule.selectAllProgramAdminFrmList(driver);
		System.out.println(adminNameList.size());
		for(int i=0 ;i<adminNameList.size();i++)
		{
			if(adminNameList.get(i).getText().contains("User1902 - John1 Tom1"))
			{
				System.out.println("Program Administrator Name Type Matched");
			}else
			{
				System.err.println("Program Administrator Name Not Matched");
			}
		}
	}
	public void seeMoreClick()
	{
		int x= 1;
		do {
			try {
				ProgramModule.seeMoreBtnProgram(driver).click();
				Thread.sleep(4000);
				System.out.println("clicked");
			} catch (Throwable e) {
				System.out.println(e);
				x=2;
			}
			
		} while (x==1);
	}
}
