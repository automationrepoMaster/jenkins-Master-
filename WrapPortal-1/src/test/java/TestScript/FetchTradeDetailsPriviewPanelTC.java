package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.TradesModule;

public class FetchTradeDetailsPriviewPanelTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void fetchTradeDetails() throws Throwable
	{
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuTrade(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Menu Trade Module Icon");
		
		TradesModule.seeMoreLink(driver).click();
		Thread.sleep(1000);
		TradesModule.seeMoreLink(driver).click();
		Thread.sleep(1000);
		//TradesModule.seeMoreLink(driver).click();
		
		wb.printListData(TradesModule.tradesSelectAllTradeFrmList(driver));
		
		TradesModule.tradesSelectFirstTradeFrmList(driver).click();
		test.log(LogStatus.PASS, "First Trade Selected");
		driver.switchTo().frame("ifrmPreview");
		System.out.println("Trade Status");
		test.log(LogStatus.INFO, "Trade Status Are :- ");
		for(int i=0;i<=TradesModule.tradesStatusPrivewP(driver).size()-1;i++)
		{
			System.out.println(TradesModule.tradesStatusPrivewP(driver).get(i).getText());
			test.log(LogStatus.PASS, TradesModule.tradesStatusPrivewP(driver).get(i).getText()+"");
		}
		test.log(LogStatus.INFO, "Trade Associated Contractor Packages Are :- ");
		System.out.println();
		System.out.println("Contractor Packages");
		for(int i=0;i<=TradesModule.tradesFetchContracotrPackagesPrivewP(driver).size()-1;i++)
		{
			System.out.println(TradesModule.tradesFetchContracotrPackagesPrivewP(driver).get(i).getText());
			test.log(LogStatus.PASS, TradesModule.tradesFetchContracotrPackagesPrivewP(driver).get(i).getText()+"");
		}
		driver.switchTo().defaultContent();
		test.log(LogStatus.PASS, "All Information Related With Respective Trade Got Fetched Successfully");
	}
}
