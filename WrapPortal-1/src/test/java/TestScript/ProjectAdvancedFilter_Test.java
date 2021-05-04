package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;
import ObjectRepository.ProjectModule;

public class ProjectAdvancedFilter_Test extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void testProjectAdvanceFilter() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Home Icon");
		HomePage.HomeMenuProjects(driver).click();
		test.log(LogStatus.INFO, "Clicked On Project Module Icon");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Advance Search Icon");
		Thread.sleep(2000);
		
		String programNameForSearch="Automation Program dont touch";
		ProjectModule.projectAdvanceSearchSelectProgram(driver, programNameForSearch);
		test.log(LogStatus.PASS, "Respective Program Selected From Dropdown");
		ProjectModule.projectAdvanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Project Advance Search Search Button");
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> programName = ProjectModule.selectAllProjectProgramFrmList(driver);
		System.out.println(programName.size());
		test.log(LogStatus.PASS, "Count Of Matched Program" + programName.size());
		for(int i=0 ;i<programName.size();i++)
		{
			if(programName.get(i).getText().contains(programNameForSearch))
			{
				System.out.println("Program Name Matched");
				test.log(LogStatus.PASS, "Program Name Matched");
			}else
			{
				System.err.println("Program Name Not Matched");
				test.log(LogStatus.FAIL, "Program Name Not Matched");
			}
		}
		
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProjectModule.projectClearIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Clear Icon");
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Advance Search Icon");
		Thread.sleep(2000);
		ProjectModule.projectAdvanceSearchSelectProgram(driver, programNameForSearch);
		test.log(LogStatus.PASS, "Program Selected Successfully from the Dropdown");
		ProjectModule.projectAdvanceSearchSelectProjectStatus(driver, "Active");
		test.log(LogStatus.PASS, "Status Selected From DropDown");
		Thread.sleep(3000);     //Raja 
		ProjectModule.projectAdvanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Advance Search Search Button");
		Thread.sleep(4000);
		seeMoreClick();
		List<WebElement> status = ProjectModule.selectAllProjectStatusFrmList(driver);
		System.out.println(status.size());
		test.log(LogStatus.PASS, "Count Of Matched Status" + status.size());
		for(int i=0 ;i<status.size();i++)
		{
			
			if(status.get(i).getText().contains("Active")  )
			{
				System.out.println("Status Matched");
				test.log(LogStatus.PASS, "Status Matched");
			}else
			{
				System.err.println("Status Not Matched");
				test.log(LogStatus.FAIL, "Status Not Matched");
			}
		}
		
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up
		ProjectModule.projectClearIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Clear Icon");
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked On Advance Search Icon");
		Thread.sleep(2000);
		ProjectModule.projectAdvanceSearchSelectProgram(driver, programNameForSearch);
		test.log(LogStatus.PASS, "Program Selected Successfully From DropDown");
		ProjectModule.projectAdvanceSearchSearchByContractor(driver).sendKeys("Alex Comp1903");
		test.log(LogStatus.PASS, "Search For Contractor");
		Thread.sleep(1500);
		ProjectModule.projectAdvanceSearchSearchByContractor(driver).sendKeys(Keys.TAB);
		ProjectModule.projectAdvanceSearchSearchBtn(driver).click();
		test.log(LogStatus.PASS, "Clicked On Advance Search Search Button");
		Thread.sleep(4000);
		seeMoreClick();
		
		List<WebElement> contractor= ProjectModule.selectAllProjectAdminFrmList(driver);
		System.out.println(contractor.size());
		test.log(LogStatus.PASS, "Count Of Matched Contractor" + contractor.size());
		for(int i=0 ;i<contractor.size();i++)
		{
			//if(contractor.get(i).getText().contains("Alex Comp1100 - David Warner")) //Raja commneted it 
			if(contractor.get(i).getText().contains("Alex Comp2273 - Jimmy Smith"))
			{
				System.out.println("Contractor Name Matched");
				test.log(LogStatus.PASS, "Contractor Name Matched");
			}else
			{
				System.err.println("Status Not Matched");
				test.log(LogStatus.FAIL, "Contractor Package Contractor Name Not Matched");
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
				test.log(LogStatus.PASS, "Clicked On See More Link");
			} catch (Throwable e) {
				System.out.println(e);
				x=2;
			}
			
		} while (x==1);
	}
}
