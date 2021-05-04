package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

@Listeners(GenericLibrary.SampleListener.class)
public class ProjectPreviewPanelFunctionalTestClass extends BaseClass {
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test(enabled = true)
	public void previewPanelDisplay() throws InterruptedException {
		HomePage.controlMenuProject(driver).click();
		Thread.sleep(3000);
		String expectedContractorName = ProjectModule.projectSelectSingleContractorNameFrmProjectList(driver).getText();
		System.out.println(expectedContractorName);
		driver.switchTo().frame(0);
		String actualContractorName = ProjectModule.projectFetchContractorNamePreviewP(driver).getText();
		System.out.println(actualContractorName);
		try {
			Assert.assertEquals(expectedContractorName, actualContractorName);
			test.log(LogStatus.PASS,
					" Actual Result :: " + actualContractorName + "Verify Preview Panel display test has been passed");
		} catch (Throwable t) {
			System.out.println(t);
			test.log(LogStatus.FAIL, " Actual Result :: " + actualContractorName + " Expected Result :: "
					+ expectedContractorName + " Verify Preview Panel display test has been failed");

		}

		driver.switchTo().defaultContent();
	}

	
	@Test(enabled = false)//date can't compare 
	public void verifyProjectDate() throws InterruptedException {
		
		HomePage.controlMenuProject(driver).click();
		Thread.sleep(3000);
		
		ProjectModule.projectEditIcon(driver).click();
		Thread.sleep(5000);
		
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
//		js.executeScript("arguments[0].click();", AddProject_General_Information_Page.estimatedHoursField(driver));
//		wb.waitForElemnet(AddProject_General_Information_Page.beginDate(driver));
		String expectedBeginDate = AddProject_General_Information_Page.beginDate(driver).getAttribute("value");
		System.out.println("Expected Begin Date \t "+expectedBeginDate);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
		AddProject_General_Information_Page.generalInformationCloseButton(driver));
		AddProject_General_Information_Page.generalInformationCloseButton(driver).click();
		
		driver.switchTo().window(wb.map.get("parentID"));
		
		ProjectModule.projectSearchEditBox(driver).click();
		driver.switchTo().frame(0);
		String actualBeginDate = ProjectModule.projectFetchProjectBeginDatePreviewP(driver).getText();
		System.out.println("Actual Date is \t"+actualBeginDate);

		try {
			Assert.assertEquals(expectedBeginDate, actualBeginDate);
			test.log(LogStatus.PASS,
					" Actual Result :: " + actualBeginDate + "Verify Preview Panel display test has been passed");
		} catch (Throwable t) {
			test.log(LogStatus.FAIL, " Actual Result :: " + actualBeginDate + " Expected Result :: " + expectedBeginDate
					+ " Verify Preview Panel display test has been failed");
		}
		driver.switchTo().defaultContent();
	}

	
	@Test(enabled = true)
	public void verifyContractValue() throws InterruptedException {

		HomePage.controlMenuProject(driver).click();
		Thread.sleep(3000);
		
		ProjectModule.projectEditIcon(driver).click();		
		Thread.sleep(5000);
		
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(2000);
		driver.manage().window().maximize();

		String expectedContractValue = AddProject_General_Information_Page.contractValueField(driver).getText();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();",
		js.executeScript("arguments[0].scrollIntoView();",
				AddProject_General_Information_Page.generalInformationCloseButton(driver));
		AddProject_General_Information_Page.generalInformationCloseButton(driver).click();
		
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		String actualContractValue = ProjectModule.projectFetchContractValuePreviewP(driver).getText();
		System.out.println(actualContractValue);
		System.out.println(expectedContractValue);
		try {
			Assert.assertEquals(expectedContractValue, actualContractValue);
			test.log(LogStatus.FAIL, " Actual Result :: " + expectedContractValue + " Expected Result :: "
					+ actualContractValue + " Verify Preview Panel Contract test has been failed");

		} catch (Throwable e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, " Actual Result :: " + expectedContractValue + " Expected Result :: "
					+ actualContractValue + " Verify Preview Panel Contract test has been failed");
		}

		driver.switchTo().defaultContent();
	}
}
