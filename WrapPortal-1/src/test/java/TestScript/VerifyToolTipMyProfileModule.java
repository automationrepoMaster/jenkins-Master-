package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import ModulerLibrary.WPO_ToolTipAction;
import ObjectRepository.Company_Module;
import ObjectRepository.HomePage;
import ObjectRepository.SettingsModules;

public class VerifyToolTipMyProfileModule extends BaseClass
{
		WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void verifyMyProfilePageToolTip() throws InterruptedException
	{
		/*HomePage.controlMenuHomeIcon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "       =======Emails Module Tool Tip=======");
		Actions act = new Actions(BaseClass.driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		List<WebElement> lst7 = HomePage.HomePageAllToolTips(driver);
		
		for (int i = 0; i < lst7.size(); i++) {
			try {
				WebElement a = lst7.get(i);
				act.moveToElement(a).sendKeys("").build().perform();
				// js.executeScript("arguments[a].scrollIntoView();",a);
				// js.executeScript("a.focus();");
				// a.sendKeys(Keys.SHIFT);
				// js.executeScript("document.getElementById('a').focus();");
				Thread.sleep(3000);
				// test.log(LogStatus.PASS,a.getAttribute("oldtitle")+
				// test.addScreenCapture(FileUtils1.getScreenshot(driver)));
				js.executeScript("window.scrollBy(0,15)", "");// Scroll down
				Thread.sleep(1500);

			} catch (Throwable e) {
				System.out.println(e);
			}
		}		
*/		
		
		HomePage.HomeMenuSettings(driver).click();
		test.log(LogStatus.INFO, "Clicked On Settings");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		SettingsModules.settingsMenuMyProfileModule(driver).click();
		test.log(LogStatus.INFO, "Clicked On My Company Module");
		Actions act = new Actions(BaseClass.driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		List<WebElement> lst = SettingsModules.myProfileToolTips(driver);
		test.log(LogStatus.INFO, "        =======My Profile Module Tool Tip=======");
		for(int i=0;i<lst.size();i++)
		{	
			try {
				WebElement a = lst.get(i);
			act.moveToElement(a).build().perform();
			Thread.sleep(4000);
			test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			js.executeScript("window.scrollBy(0,50)", "");//Scroll down
			Thread.sleep(1500);
			} catch (Throwable e) {
			System.out.println(e);
			}
		}//li[@data-original-title][position()<9] for user module
		
		js.executeScript("window.scrollBy(0,-350)", "");
		SettingsModules.settingsMenuCompanyModule(driver).click();
		test.log(LogStatus.INFO, "Clicked on Company Module");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "       =======Company Module Tool Tip=======");
		WPO_ToolTipAction.toolTipAction(Company_Module.myProfileToolTips(driver));//creating a module and executing same for every time
		
		js.executeScript("window.scrollBy(0,-1200)", "");
		SettingsModules.settingsMenuSecurityGroupsModule(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Company Module");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "       =======Security Groups Module Tool Tip=======");
		WPO_ToolTipAction.toolTipAction(Company_Module.myProfileToolTips(driver));//creating a module and executing same for every time

		js.executeScript("window.scrollBy(0,-1550)", "");
		SettingsModules.settingsMenuEmailsModule(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Company Module");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "       =======Emails Module Tool Tip=======");
		WPO_ToolTipAction.toolTipAction(Company_Module.myProfileToolTips(driver));//creating a module and executing same for every time

//		js.executeScript("window.scrollBy(0,-1550)", "");
//		
		
		
	
		
		
		
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
			
		
		
		
	}
	
}
/*		List<WebElement> lst1 = SettingsModules.myProfileToolTips(driver);
test.log(LogStatus.INFO, "       =======Company Module Tool Tip=======");
for(int i=0;i<lst1.size();i++)
{
	try {
		WebElement a = lst1.get(i);
	act.moveToElement(a).build().perform();
	Thread.sleep(4000);
	test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	js.executeScript("window.scrollBy(0,50)", "");//Scroll down
	Thread.sleep(1500);
	} catch (Throwable e) {
	System.out.println(e);
	}
}
js.executeScript("window.scrollBy(0,-250)", "");
SettingsModules.settingsMenuSecurityGroupsModule(driver).click();
Thread.sleep(2000);
List<WebElement> lst2 = SettingsModules.myProfileToolTips(driver);
test.log(LogStatus.INFO, "       =======Company Module Tool Tip=======");
for(int i=0;i<lst2.size();i++)
{
	try {
		WebElement a = lst2.get(i);
	act.moveToElement(a).build().perform();
	Thread.sleep(4000);
	test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
	js.executeScript("window.scrollBy(0,50)", "");//Scroll down
	Thread.sleep(1500);
	} catch (Throwable e) {
	System.out.println(e);
	}
}*/
