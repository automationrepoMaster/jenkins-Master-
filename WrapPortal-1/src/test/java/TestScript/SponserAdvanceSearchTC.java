package TestScript;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.SponsorsModule;

public class SponserAdvanceSearchTC extends BaseClass
{
	@Test
	public void sponserAdvanceSearch() throws InterruptedException
	{
		HomePage.HomeMenuSponsors(driver).click();
		Thread.sleep(3000);
		SponsorsModule.sponsorSearchEditBox(driver).click();
		SponsorsModule.sponsorAdvanceSearchIcon(driver).click();
		Thread.sleep(3000);
		SponsorsModule.sponsorAdvanceSearchPhoneNo(driver).sendKeys("(951) 753-8544");
		
		SponsorsModule.sponsorAdvanceSearchSearchBtn(driver).click();
		
	}
}
