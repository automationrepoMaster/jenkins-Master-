package ModulerLibrary;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;

public class WPO_ToolTipAction extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	public static void toolTipAction(List<WebElement> wele)
	{
		Actions act = new Actions(BaseClass.driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		List<WebElement> lst2 = SettingsModules.myProfileToolTips(driver);
//		test.log(LogStatus.INFO, "       =======Company Module Tool Tip=======");
		for(int i=0;i<wele.size();i++)
		{
			try {
				WebElement a = wele.get(i);
			act.moveToElement(a).build().perform();
			Thread.sleep(4000);
			test.log(LogStatus.PASS,a.getAttribute("oldtitle")+ test.addScreenCapture(FileUtils1.getScreenshot(driver)));
			js.executeScript("window.scrollBy(0,50)", "");//Scroll down
			Thread.sleep(1500);
			} catch (Throwable e) {
			System.out.println(e);
			}
		}
	}
	
}
