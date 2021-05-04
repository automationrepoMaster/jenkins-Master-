package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class FetchProjectPriviewPanelTC extends BaseClass {
	@Test
	public void fetchProjectPreviewDetailsTC() throws InterruptedException {
		
		HomePage.controlMenuHomeIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuProjects(driver).click();
		test.log(LogStatus.INFO, "Clicked on Home Menu Project Module Icon");
		driver.switchTo().frame("ifrmPreview");// switch focus from window to
												// frame

		System.out.println(
				"\n Project Begin Date is :- \t" + ProjectModule.projectFetchProjectBeginDatePreviewP(driver).getText());
		test.log(LogStatus.PASS, "Project :- "+ProjectModule.projectFetchProjectBeginDatePreviewP(driver).getText());
		System.out.println(
				"\n Project End Date is :- \t" + ProjectModule.projectFetchProjectEndDatePreviewP(driver).getText());
		test.log(LogStatus.PASS, "Project :- "+ProjectModule.projectFetchProjectEndDatePreviewP(driver).getText());
		System.out.println(
				"\n Project Contact Phone no is :- \t" + ProjectModule.projectFetchPhoneNoPreviewP(driver).getText());
		test.log(LogStatus.PASS, "Project Contact Phone No is :- "+ProjectModule.projectFetchPhoneNoPreviewP(driver).getText());
		
		WebDriverCommonLib wb = new WebDriverCommonLib();//Creating Object off common library class
															
															
		/*List<WebElement> lst1 = ProjectModule.projectFetchUserAccessSponsorsPreviewP(driver);
		System.out.println("\n === User Access Sponsors List=== \n");
		test.log(LogStatus.INFO,"         ===== User Access Sponsors List ===== ");
//		wb.printListData(lst1);// print values through common library method
		Thread.sleep(1000);
		for (int i = 0; i <= lst1.size() - 1; i++) 
			{
				System.out.println(lst1.get(i).getText());
				test.log(LogStatus.PASS,"Sponsor :- "+lst1.get(i).getText());
			}

		System.out.println("\n === User Access Administrator List=== \n");
		test.log(LogStatus.INFO,"         ===== User Access Administrator List ===== ");
//		wb.printListData(ProjectModule.projectFetchUserAccessAdministratorPreviewP(driver));
		List<WebElement> lst2 = ProjectModule.projectFetchUserAccessAdministratorPreviewP(driver);
		for (int i = 0; i <= lst2.size() - 1; i++) 
		{
			System.out.println(lst2.get(i).getText());
			test.log(LogStatus.PASS,"Administrator :- "+lst2.get(i).getText());
		}
		
		System.out.println("\n === User Access General Contractor List=== \n");
		test.log(LogStatus.INFO,"         ===== User Access General Contractor List ===== ");
//		wb.printListData(ProjectModule.projectFetchUserAccessGeneralContractorPreviewP(driver));
		List<WebElement> lst3 = ProjectModule.projectFetchUserAccessGeneralContractorPreviewP(driver);
		for (int i = 0; i <= lst3.size() - 1; i++) 
		{
			System.out.println(lst3.get(i).getText());
			test.log(LogStatus.PASS,"General Contractor :- "+lst3.get(i).getText());
		}
		
		System.out.println("\n === User Access Project Administrator List=== \n");
		test.log(LogStatus.INFO,"         ===== User Access Project Administrator List ===== ");
//		wb.printListData(ProjectModule.projectFetchUserAccessProjectAdministratorPreviewP(driver));
		List<WebElement> lst4 = ProjectModule.projectFetchUserAccessProjectAdministratorPreviewP(driver);
		for (int i = 0; i <= lst4.size() - 1; i++) 
		{
			System.out.println(lst4.get(i).getText());
			test.log(LogStatus.PASS,"Project Administrator :- "+lst4.get(i).getText());
		}
		
		
		System.out.println("\n Modified By \t" + ProjectModule.projectFetchModifiedByPreviewP(driver).getText());
		test.log(LogStatus.PASS,ProjectModule.projectFetchModifiedByPreviewP(driver).getText());
		System.out.println("\n Flag On/Off \t" + ProjectModule.projectFlagBtnPreviewP(driver).isSelected());
		test.log(LogStatus.PASS,"Project Flag ON/OFF Status :- "+ProjectModule.projectFlagBtnPreviewP(driver).isSelected());
		
		driver.switchTo().defaultContent();
*/	}

}

/*
 Project Begin Date is :- 	Begin Date
12/24/2016

 Project End Date is :- 	End Date
12/25/2016

 Project Contact Phone no is :- 	(111) 111-1111 Ext 98

 === User Access Sponsors List=== 

TesitngSV - TesitngSV TesitngSV1
AutoNation - John Doe
AutoNation - kim canada

 === User Access Administrator List=== 

Flashspan - Chrissy Paskell
Flashspan - Chrissy Paskell
City of Charlotte - Sarah Poulton

 === User Access General Contractor List=== 

Glod Corporation - aaaa aaa
Glod Corporation - Test aaa
Rick_GC - Rick Scola

 === User Access Project Administrator List=== 

ABCD Company - demo user2
ABCD Company - demo user1
Info_NodeAdmin - Rick Scola

 Modified By 	Modified By : John Smith on 08/07/2019 08:59 AM

 Flag On/Off 	false
PASSED: fetchProjectPriviewDetailsTC

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================
 */






