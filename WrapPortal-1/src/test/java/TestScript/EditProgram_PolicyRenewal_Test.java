package TestScript;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ModulerLibrary.WPO_ProgramPolicyRenewalAction;

public class EditProgram_PolicyRenewal_Test extends BaseClass
{
	@Test
	public void testPolicyRenewal() throws InterruptedException
	{
	WPO_ProgramPolicyRenewalAction.testPolicyRenewal(driver, "Program7852");
	
	}
}
