package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.FileUtils1;
import GenericLibrary.RandomClass;
import ObjectRepository.AddTradePage;
import ObjectRepository.HomePage;
import ObjectRepository.TradesModule;

public class AddTradeTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void addTrade() throws Throwable
	{	
		String tradeName=RandomClass.randomTradeDescription();
		
		HomePage.controlMenuHomeIcon(driver).click();
		HomePage.HomeMenuTrade(driver).click();
		test.log(LogStatus.PASS, "Clicked on Add Trade Icon");
		TradesModule.tradesAddIcon(driver).click();
		Thread.sleep(5000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		AddTradePage.addTrade_TradeDescriptionField(driver).sendKeys(tradeName);
		test.log(LogStatus.PASS, "Trade Description Added Successfully");
		AddTradePage.addTrade_TradeNumberField(driver).sendKeys(RandomClass.randomTradeNO());
		test.log(LogStatus.PASS, "Trade Number Added Successfully");
		wb.selectSingleValue(AddTradePage.addTrade_TradeStatusField(driver), "Active");
		test.log(LogStatus.PASS, "Trade Status Selected Successfully");
		wb.scrollToEndt();
		Thread.sleep(1000);
		AddTradePage.addTradeSaveAndCloseBtn(driver).click();
		Thread.sleep(1000);
		driver.switchTo().window(wb.map.get("parentID"));
		test.log(LogStatus.PASS," "+tradeName+" Added Successfully");
		test.log(LogStatus.PASS, test.addScreenCapture(FileUtils1.captureScreen(driver, "Add Trade")));

		
	}
	
}
