package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class VerifyToastMessageContrPkg_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void verifyToastMessageContractorPkgTest() throws Throwable
	{
		//for toast msg
		//ul[@id='ulNoteList']/li[*]/div/div[1]/div/div[2]/div[2]/div
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		//eventFiringWebDriver.executeScript("scroll(<pixel-to-scroll-in-horizontal>,<pixel-to-scroll-in-vertical>)");
		HomePage.HomeMenuContractorPackage(driver).click();
		ContractorPackageModule.advanceSearchIcon(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValue(ContractorPackageModule.advanceSearchSelectProgram(driver), "Sony Tower Test");
		ContractorPackageModule.advanceSearchSearchBtn(driver).click();
		//ul[@id='ulNoteList']//div[starts-with(@id,'divProject')]
		
		Actions act = new Actions(BaseClass.driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		List<WebElement> lst1 = ContractorPackageModule.eachContrPkg(driver);
		List<WebElement> lst = ContractorPackageModule.eachContrPkgProgramToastMsg(driver);
		test.log(LogStatus.INFO, "=======General Information Page Tool Tips=======");
		
		for(int i=0;i<=lst.size()-1;i++)
		{
			try {
				WebElement a = lst.get(i);
//				a.click();
//				Thread.sleep(3000);
				act.moveToElement(a).perform();
//				test.log(LogStatus.PASS,"Tool Tip Data "+a.getAttribute("oldtitle"));
				Thread.sleep(5000);
//				test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				eventFiringWebDriver.executeScript("scroll(0,50)");
//				js.executeScript("window.scrollBy(0,50)", "");//Scroll down
				Thread.sleep(1500);
				
			} catch (Throwable e) 
			{
				System.out.println(e);
			}
		}
		
		/*for(int j=0 ;j<lst1.size();j++)
		{
			WebElement b = lst1.get(j);
			act.moveToElement(b).perform();
			for(int i=0;i<=j;i++)
			{
				try {
					WebElement a = lst.get(i);
//					a.click();
//					Thread.sleep(3000);
					act.moveToElement(a).perform();
//					test.log(LogStatus.PASS,"Tool Tip Data "+a.getAttribute("oldtitle"));
					Thread.sleep(5000);
//					test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
					eventFiringWebDriver.executeScript("scroll(0,50)");
//					js.executeScript("window.scrollBy(0,50)", "");//Scroll down
					Thread.sleep(1500);
					
				} catch (Throwable e) 
				{
					System.out.println(e);
				}
			}
		}*/
		
	}
}
