package TestScript;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddTradePage;
import ObjectRepository.HomePage;
import ObjectRepository.TradesModule;

public class EditTradeDuplicateTradeNumberTC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void editTradeAddDuplicateTradeNO() throws InterruptedException
	{	
		
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuTrade(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Menu Trade Module Icon");
		TradesModule.tradesSearchEditBox(driver).sendKeys("325520");
		test.log(LogStatus.PASS, "Searched For Trade Number '325520'");
		TradesModule.tradesSearchIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Search Icon");
		Thread.sleep(3000);
		TradesModule.tradesEditIcon(driver).click();
		test.log(LogStatus.PASS, "Clicked on Edit Trade Icon");
		Thread.sleep(5000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		AddTradePage.addTrade_TradeNumberField(driver).clear();
		AddTradePage.addTrade_TradeNumberField(driver).sendKeys("32552");
		test.log(LogStatus.PASS, "'32552'Duplicate Trade Number Added Successfully");
		AddTradePage.addTradeSaveAndCloseBtn(driver).click();
		try {
			
			Alert alt=driver.switchTo().alert();
			String altmsg=alt.getText();
			System.out.println(altmsg);
			test.log(LogStatus.PASS,altmsg +" Duplicate Alert Message Displayed");
			alt.accept();
		} catch (Throwable e) {
			test.log(LogStatus.FAIL, "Duplicate Alert Message is not Displayed");
		}
		
		AddTradePage.addTradeCloseBtn(driver).click();
		test.log(LogStatus.INFO," Clicked on Close Button");
		driver.switchTo().window(wb.map.get("parentID"));
		
		//test.log(LogStatus.PASS," "+tradeName+" Added Successfully");
		
	}
}
