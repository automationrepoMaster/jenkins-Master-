package TestScript;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

//for utilized Listeners in test class we have to write below line for each Test Class
//@Listeners(GenericLibrary.SampleListener.class)
public class ProjectListingPanelFunctionalTestClass extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test(enabled=true)
	public void projectListingPanelTestScript1() throws InterruptedException {
		// BasicConfigurator.configure();//use this code to remove the warning
		// message display on console about log 4g

		HomePage.HomeMenuProjects(driver).click();
		String currentUrl = driver.getCurrentUrl();
		// 1 TC //verify title of the webpage
		String ActualName = driver.getTitle();
		String ExpectedName = "Project - Wrap-Portal";
		test.log(LogStatus.PASS, " The current URL of the web page " + currentUrl);

		try {
			Assert.assertEquals(ActualName, ExpectedName);
			test.log(LogStatus.PASS, " Actual Result :: " + ActualName + " Verify Project Module test has been passed");
		} catch (Throwable e) {
			test.log(LogStatus.FAIL,
					" Actual Result :: " + ActualName + " Expected Result :: " + ExpectedName + " Verify Project Module test has been failed");

		}

		// 2 TC verify the count of the project
		Thread.sleep(2000);
		String projectActualCount = ProjectModule.projectCount(driver).getText();
		System.out.println("Project Count is \t" + ProjectModule.projectCount(driver).getText());
		String projectExpectedCount = "74";
		try {
			Assert.assertEquals(projectActualCount, projectExpectedCount);
			test.log(LogStatus.PASS, " Actual Result :: " + projectActualCount +" Verify Project Count test has been passed");

		} catch (Throwable e) {
			test.log(LogStatus.FAIL,
					" Actual Result :: " + projectActualCount + " Expected Result :: " + projectExpectedCount +" Verify Project Count test has been failed");

		}

		// TC3 verify contractor name 
		System.out.println("\n projectDetails is\n" + ProjectModule.projectSelectFirstProjectFrmList(driver).getText());
		boolean val = ProjectModule.projectSelectFirstProjectFrmList(driver).isDisplayed();
		System.out.println(val);
		if (val == true) {
			test.log(LogStatus.PASS, "Project,Program,Contractor Name Displayed Appropriately");
		} else {
			test.log(LogStatus.FAIL, "Project,Program,Contractor Name is not Displayed Appropriately");
		}

		// TC4
		ProjectModule.projectAddIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		String ActualPageTitle = driver.getTitle();
		String ExpectedPageTitle = "Add Project - Wrap-Portal";
		try {
			Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
			test.log(LogStatus.PASS, " Actual Result :: " + ActualPageTitle + " Verify Add icon test has been passed");
			// System.out.println("\n To check the functionality of Add symbol
			// whether new page open or not is Passed");
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, " Actual Result :: " + ActualPageTitle + " Expected Result :: " + ExpectedPageTitle
					+ " Verify Add icon test has been failed");
		}

		wb.mouseMoveToElement(AddProject_General_Information_Page.generalInformationCloseButton(driver));
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(3000);

		// TC5
		ProjectModule.projectEditIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		String ActualEditPageTitle = driver.getTitle();
		String ExpectedEditPageTitle = "Edit Project - Wrap-Portal";
		try {
			Assert.assertEquals(ActualEditPageTitle, ExpectedEditPageTitle);
			test.log(LogStatus.PASS,
					" Actual Result :: " + ActualEditPageTitle + " Verify edit icon test has been passed");
			// System.out.println("\n To check the functionality of Edit symbol
			// whether new page open or not is Passed");
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, " Actual Result :: " + ActualEditPageTitle + " Expected Result :: "
					+ ExpectedEditPageTitle + " Verify edit icon test has been failed");
			// System.out.println(e+"To check the functionality of Edit symbol
			// whether new page open or not is Fail");
		}
		wb.mouseMoveToElement(AddProject_General_Information_Page.generalInformationCloseButton(driver));
		driver.switchTo().window(wb.map.get("parentID"));

		// TC6
		ProjectModule.projectDeleteIcon(driver).click();
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		alt.dismiss();
		String actualAlertMsg = alertMsg;
		String expectedAlertMsg = "Are you sure you want to delete selected Project?";

		if (actualAlertMsg.contains(expectedAlertMsg)) {
			test.log(LogStatus.PASS,
					" Actual Result :: " + actualAlertMsg + " Verify Delete icon test has been passed");
		} else {
			test.log(LogStatus.FAIL, " Actual Result :: " + actualAlertMsg + " Expected Result :: " + expectedAlertMsg
					+ " Verify Delete icon test has been failed");

		}
		
		//TC7
		ProjectModule.projectSearchEditBox(driver).sendKeys("test");	
		List<WebElement> lst=ProjectModule.projectSearchAutoCompleteList(driver);
		Thread.sleep(2000);
		int count=lst.size();	
		String countOfProject=Integer.toString(count);
		ProjectModule.projectSearchIcon(driver).click();
		Thread.sleep(3000);
		String displayProjectCont=ProjectModule.projectCount(driver).getText();
		
		if(countOfProject.equals(displayProjectCont))
		{
			test.log(LogStatus.PASS," Actual Result :: " + countOfProject + " Verify Search Text box test has been passed");	
		}else
		{
			test.log(LogStatus.FAIL," Actual Result :: " + countOfProject + " Expected Result :: " + displayProjectCont+ " Verify Search Text box test has been failed");
		}
		ProjectModule.projectSearchEditBox(driver).clear();
	}
	
	
	
	
	@Test
	public void verifyAdvanceSearch() throws InterruptedException
	{
		//TC8
		HomePage.controlMenuProject(driver).click();
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		boolean advSearchDropdown=ProjectModule.projectAdvanceSearchCloseBtn(driver).isDisplayed();
		if(advSearchDropdown==true)
		{
			test.log(LogStatus.PASS," Actual Result :: Verify Advance search dropdown test has been passed");
		}
		else {
			test.log(LogStatus.FAIL," Actual Result :: Verify Advance search dropdown test has been failed");
		}

		Thread.sleep(2000);
		
		//TC9
		ProjectModule.projectAdvanceSearchSelectProgram(driver, "ABC_4");//select ABC_4 Program from dropdown		
		ProjectModule.projectAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(2000);
	
		String expectedsearchCount=ProjectModule.projectCount(driver).getText();
		System.out.println("TC9"+expectedsearchCount);
		int pCount=0;
		List<WebElement>programList=ProjectModule.projectSelectProgramNameFrmProjectList(driver);
		System.out.println(programList.size());
		for(int i=0;i<=programList.size()-1;i++)
		{
			if(programList.get(i).getText().contains("ABC_4"))
			{
				pCount++;
			}
		}
		String actualSearchCount=Integer.toString(pCount);
		System.out.println(actualSearchCount);
		if(expectedsearchCount.equals(actualSearchCount))
		{
			test.log(LogStatus.PASS," Actual Result :: Verify Adv search Select Program frm dropdown test has been passed");
		}
		else {
			test.log(LogStatus.FAIL," Actual Result :: Verify Adv search Select Program frm dropdown test has been failed");
		}
		
		//TC13
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-250)", "");
		ProjectModule.projectClearIcon(driver).click();
		Thread.sleep(3000);
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		ProjectModule.projectAdvanceSearchSearchByContractor(driver).sendKeys("aa construnction [John Smith]");
		Thread.sleep(2000);
		ProjectModule.projectAdvanceSearchSearchByContractor(driver).sendKeys(Keys.TAB);
		ProjectModule.projectAdvanceSearchSearchBtn(driver).click();
		Thread.sleep(3000);
		String expectedContractorCount=ProjectModule.projectCount(driver).getText();
		System.out.println("TC11"+expectedContractorCount);
		int cCount=0;
		String expString="aa construnction - John Smith";
		List<WebElement>contractorList=ProjectModule.projectSelectContractorNameFrmProjectList(driver);
		System.out.println(contractorList.size());
		for(int i=0;i<=contractorList.size()-1;i++)
		{
				String str =contractorList.get(i).getText();
				System.out.println(str);
			if(str.equals(expString))
			{
				cCount++;
			}
		}
		String actualContraCount=Integer.toString(cCount);
		System.out.println(actualContraCount);
		try
		{
			Assert.assertEquals(expectedContractorCount, actualContraCount);
			test.log(LogStatus.PASS," Actual Result :: Verify Adv search Select Contractor frm dropdown test has been passed");
		}
		catch (Exception t) {
			test.log(LogStatus.FAIL," Actual Result :: Verify Adv search Select Contractor frm dropdown test has been failed");
		}
		Thread.sleep(3000);
		//TC14
		js.executeScript("window.scrollBy(0,-250)", "");
		ProjectModule.projectClearIcon(driver).click();
		ProjectModule.projectClearIcon(driver).click();
		Thread.sleep(5000);
		ProjectModule.projectAdvanceSearchIcon(driver).click();
		ProjectModule.projectAdvanceSearchSelectProjectStatus(driver, "Active");
		
		js.executeScript("arguments[0].click();",ProjectModule.projectAdvanceSearchSearchBtn(driver));
		Thread.sleep(3000);
		String expectedStatusCount=ProjectModule.projectCount(driver).getText();
		System.out.println("TC14 "+expectedStatusCount);
		int sCount=0;
		String expStausString="Active";
		List<WebElement>statusList=ProjectModule.projectSelectStatusNameFrmProjectList(driver);
		System.out.println(statusList.size());
		for(int k=0;k<=statusList.size()-1;k++)
		{
				String str1 =statusList.get(k).getText();
				System.out.println(str1);
			if(str1.equals(expStausString))
			{
				sCount++;
			}
		}
		String actualStatusCount=Integer.toString(sCount);
		System.out.println(actualStatusCount);
		try
		{
			Assert.assertEquals(expectedStatusCount, actualStatusCount);
			test.log(LogStatus.PASS," Actual Result :: Verify Adv search Select Status frm dropdown test has been passed");
		}
		catch (Throwable t) {
			test.log(LogStatus.FAIL," Actual Result :: Verify Adv search Select Status frm dropdown test has been failed");
		}
		
		
	}
	
	

}