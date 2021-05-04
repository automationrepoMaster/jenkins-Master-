package TestScriptNCP_SponsorLogin;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.NCP_SponsorLoginAction;
import ObjectRepository_NCP.NCP_MyCIP_CertificatesPage;
import ObjectRepository_NCP.NCP_SponsorLoginHomePage;

public class NCP_SPL_MyCIP_Certificate_Test extends BaseClass
{

	WebDriverCommonLib wb= new WebDriverCommonLib();
	public String contractorName = "Alex Comp2273";
	String programName="Automation Program dont touch";
	String projectName="Test Project 10";
	String tradeName="TRNO295";
	@Test
	public void testDownloadCIPCertificate() throws Throwable
	{
		String BaseUrl=driver.getCurrentUrl();
		NCP_SponsorLoginAction.logInNCP(driver);
		test.log(LogStatus.PASS, " Login to the Application");
		
		NCP_SponsorLoginHomePage.moduleMyCIPCertificates(driver).click();
		test.log(LogStatus.PASS, " Click on My CIP Certificate  Tab");
		Thread.sleep(3000);
		NCP_MyCIP_CertificatesPage.selectProgramField(driver).click();
		Thread.sleep(1500);
		wb.selectSingleValueFromList(NCP_MyCIP_CertificatesPage.selectProgramFrmList(driver), programName);
		Thread.sleep(1500);
		test.log(LogStatus.PASS, " Respective Program Selected Successfully");
		NCP_MyCIP_CertificatesPage.downloadCertificatesBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Download Certificate Button");
		try {
			NCP_MyCIP_CertificatesPage.downloadCertificatesAlertOKBtn(driver).click();	
		} catch (Throwable e) 
		{
		System.out.println(e);
		}
		driver.navigate().to(BaseUrl);//navigate to base url
		
	}
}
