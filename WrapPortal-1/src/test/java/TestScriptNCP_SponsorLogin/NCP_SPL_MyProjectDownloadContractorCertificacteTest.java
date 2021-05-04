package TestScriptNCP_SponsorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.NCP_SponsorLoginAction;
import ObjectRepository_NCP.NCP_SponsorLoginHomePage;
import ObjectRepository_NCP.NCP_SponsorLogin_MyProjectsPage;

public class NCP_SPL_MyProjectDownloadContractorCertificacteTest extends BaseClass
{
	
	WebDriverCommonLib wb= new WebDriverCommonLib();
	public String contractorName = "Alex Comp2273";
	String programName="Automation Program dont touch";
	String projectName="Test Project 10";
	String tradeName="TRNO295";
	@Test
	public void testDownloadCertificate() throws Throwable
	{
		String BaseUrl=driver.getCurrentUrl();
		NCP_SponsorLoginAction.logInNCP(driver);
		test.log(LogStatus.PASS, " Login to the Application");
		NCP_SponsorLoginHomePage.moduleMyProjects(driver).click();
		test.log(LogStatus.PASS, " Click on My Projects Tab");
		Thread.sleep(3000);
		NCP_SponsorLogin_MyProjectsPage.btnFilterBy(driver).click();
		test.log(LogStatus.PASS, " Click on My Projects Filter By Button");
		NCP_SponsorLogin_MyProjectsPage.selectProgramField(driver).click();
		Thread.sleep(1500);
		wb.selectSingleValueFromList(NCP_SponsorLogin_MyProjectsPage.selectProgramFromList(driver), programName);
		Thread.sleep(1500);
		test.log(LogStatus.PASS, " Respective program Selected From the list");
		NCP_SponsorLogin_MyProjectsPage.sortDistrictField(driver).click();
		Thread.sleep(1200);
		wb.selectSingleValueFromList(NCP_SponsorLogin_MyProjectsPage.selectDistrictFromList(driver), "Duston");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Respective program District From the list");
		NCP_SponsorLogin_MyProjectsPage.btnSearch(driver).click();
		Thread.sleep(1500);
		test.log(LogStatus.PASS, " Click on Search Button");
		NCP_SponsorLogin_MyProjectsPage.clickOnSelectedProject(driver).click();
		test.log(LogStatus.PASS, " Searched project Selected Successfully");
		NCP_SponsorLogin_MyProjectsPage.downloadContractorCertificateLink(driver).click();
		test.log(LogStatus.PASS, " Click on Download Contractor Certificate Link");
		wb.waitForElemnet(NCP_SponsorLogin_MyProjectsPage.downloadCertificactesBtn(driver));
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Clicked on Download Certificate Button");
		try {
			NCP_SponsorLogin_MyProjectsPage.downloadCertificactesAlertOKBtn(driver).click();
			test.log(LogStatus.PASS, " Alert Accepted");
		} catch (Throwable e) {
		System.out.println(e);			
		}
		// wb.getWindowIDs();
		 //driver.switchTo().window(wb.map.get(""));
		wb.SwitchtoChild1();
		 Thread.sleep(2000);
		 driver.close();
		 wb.Switchtoparent();
	  
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", NCP_SponsorLogin_MyProjectsPage.downloadCertificactesExitBtn(driver));
		js.executeScript("arguments[0].click();", NCP_SponsorLogin_MyProjectsPage.downloadCertificactesExitBtn(driver));
		//NCP_SponsorLogin_MyProjectsPage.downloadCertificactesExitBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Download Certificate Exit Button");
		driver.navigate().to(BaseUrl);//navigate to base url
	}
}
