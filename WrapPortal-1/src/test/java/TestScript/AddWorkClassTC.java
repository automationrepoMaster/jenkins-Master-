package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddClassCodePage;
import ObjectRepository.ClassCodeModule;
import ObjectRepository.HomePage;

public class AddWorkClassTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void addWorkClass() throws InterruptedException
	{
		String classCodeName=RandomClass.randomClassCodeDescription();
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuWorkClass(driver).click();
		test.log(LogStatus.INFO, "Clicked on Class Code Icon");
		Thread.sleep(3000);
		ClassCodeModule.classCodeAddIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Add Class Code Icon");
		Thread.sleep(3000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		AddClassCodePage.addClassCodeWorkClassDescriptionField(driver).sendKeys(classCodeName);
		test.log(LogStatus.PASS, "Class Code Description Added Successfully");
		AddClassCodePage.addClassCodeWorkClassNumberField(driver).sendKeys(RandomClass.randomClassCodeNumber());
		test.log(LogStatus.PASS, "Class Code Number Added Successfully");
		//wb.selectSingleValue(AddClassCodePage.addClassCodeWorkClassStateField(driver), RandomClass.randomState());
		//test.log(LogStatus.PASS, "Class Code State Selected Successfully");
		AddClassCodePage.checkBox_WC_ClassCode(driver).click();
		test.log(LogStatus.INFO, "WC Class Code Check Box Selected");
		AddClassCodePage.checkBox_GL_ClassCode(driver).click();
		test.log(LogStatus.INFO, "GL Class Code Check Box Selected");
		AddClassCodePage.addClassCodeSaveAndCloseBtn(driver).click();
		test.log(LogStatus.INFO, "Clicked on Save And Close Button");
		driver.switchTo().window(wb.map.get("parentID"));
		
		test.log(LogStatus.PASS, "" +classCodeName+" Added Successfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add Work Class")));

		
	}
}
