package TestScript;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;

public class LoginTC extends BaseClass 
{	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		HomePage.HomeMenuContractorPackage(driver).click();
		
		Thread.sleep(5000);
		HomePage.controlMenuHomeIcon(driver).click();
		
		Thread.sleep(5000);
		HomePage.HomeMenuProjects(driver).click();
		
		Thread.sleep(3000);
		HomePage.controlMenuHomeIcon(driver).click();
		
		Thread.sleep(3000);
		HomePage.controlMenuDocuments(driver).click();
		
		Thread.sleep(3000);
		HomePage.controlMenuHomeIcon(driver).click();
		
		
		Thread.sleep(3000);
		HomePage.controlMenuPreBidContractorPackage(driver).click();
	}
	
}
