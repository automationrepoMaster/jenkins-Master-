package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContractor_Pkg_Enrollment_Summary_Page
{
	
	
	private static WebElement element;
	private static List<WebElement> listElement;

	// Add GL xpath

	static String checkBoxEnrollmentSummaryPageFinalTermsAndCondition="//input[@type='checkbox']";
	static String checkBoxEnrollmentSummaryPageAcceptNoLossStmt="//input[@id='ctrlLossLetter_chkContractDocument']";
	static String btnEnrollmentSummaryPageAcceptNoLossStmt="//input[@value='Confirm and Continue']";
	static String btnEnrollmentSummaryPageConfirmAndContinue="//input[@class='btn btn-success']" ; //"//input[@value='Confirm and Continue']";
	static String btnEnrollmentConfirmationPageFinishAndClose= "//input[@value='Finish and Close']";
	
	
	public static WebElement checkBoxEnrollmentSummaryPageFinalTermsAndCondition(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxEnrollmentSummaryPageFinalTermsAndCondition));
		return element;
	}
	public static WebElement btnEnrollmentSummaryPageConfirmAndContinue(WebDriver driver) {
		element = driver.findElement(By.xpath(btnEnrollmentSummaryPageConfirmAndContinue));
		return element;
	}public static WebElement btnEnrollmentConfirmationPageFinishAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnEnrollmentConfirmationPageFinishAndClose));
		return element;
	}
	
	public static WebElement checkBoxEnrollmentSummaryPageAcceptNoLossStmt(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxEnrollmentSummaryPageAcceptNoLossStmt));
		return element;
	}public static WebElement btnEnrollmentSummaryPageAcceptNoLossStmt(WebDriver driver) {
		element = driver.findElement(By.xpath(btnEnrollmentSummaryPageAcceptNoLossStmt));
		return element;
	}
	

	
}
