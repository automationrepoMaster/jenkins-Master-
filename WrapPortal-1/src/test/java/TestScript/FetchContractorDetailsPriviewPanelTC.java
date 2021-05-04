package TestScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.ContractorModule;
import ObjectRepository.HomePage;

public class FetchContractorDetailsPriviewPanelTC extends BaseClass {
	@Test
	public void fetchContractorDetailsFromPriviewPanel() throws InterruptedException {

		HomePage.HomeMenuContractors(driver).click();
		driver.switchTo().frame("ifrmPreview");// switch focus from window to
												// frame
		System.out.println(ContractorModule.contractorFetchContactsCountPrivewP(driver).getText());
		ContractorModule.contractorDownloadContracotCertificateLinkPrivewP(driver).click();

		driver.switchTo().defaultContent();// switch back focus to main window from frame
		Thread.sleep(3000);
		// switch focus to child window and perform the operation
		
		WebDriverCommonLib wb = new WebDriverCommonLib();// used a common library method to get a window id's
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));// shift focus on child-window												
		Thread.sleep(2000);
		
		ContractorModule.contractorDownloadContractorCertificateLinkCloseBtn(driver).click();
		driver.switchTo().window(wb.map.get("parentID"));// shift focus from child to parent
		Thread.sleep(2000);													
		
		driver.switchTo().frame("ifrmPreview");
		
		List<WebElement> lst1 = ContractorModule.contractorFetchAllPrimaryContractorPackagesDetailsPrivewP(driver);
		System.out.println("\n ===primary Contractor Packges List=== \n");
		wb.printListData(lst1);//print values through common library method
		Thread.sleep(1000);
		
		ContractorModule.contractorFetchSecondaryContractorPackagesNoPrivewP(driver).click();
		
		List<WebElement> lst2 =ContractorModule.contractorFetchAllSecondaryContractorPackagesDetailsPrivewP(driver);
		System.out.println("\n ===Secondary Contractor Packges List=== \n");
		wb.printListData(lst2);
		Thread.sleep(1000);
		
		List<WebElement> lst3 =ContractorModule.contractorFetchAllContactsDetailsPrivewP(driver);
		System.out.println("\n ===Contacts List=== \n");
		wb.printListData(lst3);
		
		driver.switchTo().defaultContent();
	}
}
