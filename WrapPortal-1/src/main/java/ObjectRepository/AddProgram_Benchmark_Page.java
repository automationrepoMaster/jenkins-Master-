package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProgram_Benchmark_Page {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String fieldCounty = "//input[@data-original-title='County/Parish']";
	static String fieldProjectStatus = "//input[@data-original-title='Project Status']";
	static String selectBorough = "//div[text()='Borough']/..//select";
	static String fieldPercentCompletion = "//input[@data-original-title='Percent Completion']";
	static String fieldNoumbersOfFloors = "//input[@data-original-title='Number of Floors']";
	static String fieldHeight = "//input[@data-original-title='Height (ft)']";
	static String selectProjectType = "//div[contains(text(),'Project Type')]/..//select";
	static String selectBuildingType = "//div[contains(text(),'Building Type')]/..//select";
	static String selectSuperStrctureType = "//div[contains(text(),'Superstructure Type')]/..//select";
	static String selectconstructionScope = "//div[contains(text(),'Construction Scope')]/..//select";
	static String selectIndustry = "//div[contains(text(),'Industry')]/..//select";
	static String selectWorkforce = "//div[contains(text(),'Workforce')]/..//select";
	static String selectLineOfBuniness = "//div[contains(text(),'Line of Business')]/..//select";
	static String selectUnbundledVendorPartner = "//div[contains(text(),'Unbundled Vendor Partner')]/..//select";
	static String selectADR = "//div[contains(text(),'ADR')]/..//select";
	static String selectReturnToWork = "//div[contains(text(),'Return to Work')]/..//select";
	static String selectFallProtection = "//div[text()='Fall Protection']/..//select";
	static String radioBtnCocoonYes = "//div[contains(text(),'Cocoon')]/../div[2]/div[1]//input";
	static String radioBtnCocoonNo = "//div[contains(text(),'Cocoon')]/../div[2]/div[2]//input";
	static String selectToolTethering = "//div[text()='Tool Tethering']/..//select";
	static String selectOwnerSafetyStaffing = "//div[contains(text(),'Owner Safety Staffing')]/..//select";
	static String selectOwnerClaimsStaffing = "//div[contains(text(),'Owner Claims Staffing')]/..//select";
	static String selectContractorStaffing = "//div[text()='Contractor Staffing']/..//select";
	static String selectContractorStaffingEmployement = "//div[text()='Contractor Staffing Employment']/..//select";
	static String selectSubContractorStaffingRequirement = "//div[text()='Subcontractor Full Time Staffing Requirement']/..//select";
	static String selectFallProtectionMonitoringSystem = "//div[text()='Fall Protection Monitoring System']/..//select";
	static String checkBoxLadderMinimizationProgram = "//div[@class='checker']//span//input";
	static String fieldTestingType = "//div[text()='Testing Type']/..//input";
	static String radioBtnThirPartyClaimInvestigationServiceYes = "//div[text()='Third Party Claim Investigation Service']/../div[2]/div[1]//input";
	static String radioBtnThirPartyClaimInvestigationServiceNo = "//div[text()='Third Party Claim Investigation Service']/../div[2]/div[2]//input";
	static String radioBtnThirPartyClaimInvestigationServiceField = "//div[text()='Third Party Claim Investigation Service']/../div[2]/div[3]//input";
	static String selectSecurityStaff = "//div[text()='Security Staff']/..//select";
	static String fieldSecurityStaff = "//div[text()='Security Staff']/..//input";
	static String radioBtnSecurityIDBadgingYes = "//div[text()='Security ID Badging']/../div[2]/div[1]//input";
	static String radioBtnSecurityIDBadgingNo = "//div[text()='Security ID Badging']/../div[2]/div[2]//input";
	static String radioBtnSecurityTurnstyleYes = "//div[contains(text(),'Security Turnstyle')]/../div[2]/div[1]//input";
	static String radioBtnSecurityTurnstyleNo = "//div[contains(text(),'Security Turnstyle')]/../div[2]/div[2]//input";
	static String fieldAvarageNoOFCarpenters = "//div[contains(text(),'Average # of Carpenters (Peak Workforce)')]/..//input";
	static String fieldAvarageNoOFLaboreres = "//div[contains(text(),'Avg # of Laborers (Peak Workforce)')]/..//input";
	static String fieldAvarageNoOFWorkers = "//div[contains(text(),'Average # of Workers for Every Foreman')]/..//input";
	static String radioBtnTPA_Yes = "//div[contains(text(),'TPA')]/../div[2]/div[1]//input";
	static String selectTPA_Yes = "//div[contains(text(),'TPA')]/../div[2]/div[2]//select";
	static String radioBtnTPA_No = "//div[contains(text(),'TPA')]/../div[2]/div[3]//input";
	static String selectTPA_No = "//div[contains(text(),'TPA')]/../div[2]/div[4]//select";
	static String btnSaveAndClose = "//input[@id='btnSaveClose']";
	static String btnBack = "//input[@id='btnBack']";

	/*
	 * public static List<WebElement> allReportList(WebDriver driver) {
	 * listElement = driver.findElements(By.xpath(allReportList)); return
	 * listElement; }
	 */
	
	public static WebElement selectWorkforce(WebDriver driver) {
		element = driver.findElement(By.xpath(selectWorkforce));
		return element;
	}
	public static WebElement fieldCounty(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldCounty));
		return element;
	}

	public static WebElement fieldProjectStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldProjectStatus));
		return element;
	}

	public static WebElement selectBorough(WebDriver driver) {
		element = driver.findElement(By.xpath(selectBorough));
		return element;
	}

	public static WebElement fieldPercentCompletion(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldPercentCompletion));
		return element;
	}

	public static WebElement fieldNoumbersOfFloors(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldNoumbersOfFloors));
		return element;
	}

	public static WebElement fieldHeight(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldHeight));
		return element;
	}

	public static WebElement selectProjectType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectType));
		return element;
	}

	public static WebElement selectBuildingType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectBuildingType));
		return element;
	}

	public static WebElement selectSuperStrctureType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSuperStrctureType));
		return element;
	}

	public static WebElement selectconstructionScope(WebDriver driver) {
		element = driver.findElement(By.xpath(selectconstructionScope));
		return element;
	}

	public static WebElement selectIndustry(WebDriver driver) {
		element = driver.findElement(By.xpath(selectIndustry));
		return element;
	}

	public static WebElement selectLineOfBuniness(WebDriver driver) {
		element = driver.findElement(By.xpath(selectLineOfBuniness));
		return element;
	}

	public static WebElement selectUnbundledVendorPartner(WebDriver driver) {
		element = driver.findElement(By.xpath(selectUnbundledVendorPartner));
		return element;
	}

	public static WebElement selectADR(WebDriver driver) {
		element = driver.findElement(By.xpath(selectADR));
		return element;
	}

	public static WebElement selectReturnToWork(WebDriver driver) {
		element = driver.findElement(By.xpath(selectReturnToWork));
		return element;
	}

	public static WebElement selectFallProtection(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFallProtection));
		return element;
	}

	public static WebElement radioBtnCocoonYes(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnCocoonYes));
		return element;
	}

	public static WebElement radioBtnCocoonNo(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnCocoonNo));
		return element;
	}

	public static WebElement selectToolTethering(WebDriver driver) {
		element = driver.findElement(By.xpath(selectToolTethering));
		return element;
	}

	public static WebElement selectOwnerSafetyStaffing(WebDriver driver) {
		element = driver.findElement(By.xpath(selectOwnerSafetyStaffing));
		return element;
	}

	public static WebElement selectOwnerClaimsStaffing(WebDriver driver) {
		element = driver.findElement(By.xpath(selectOwnerClaimsStaffing));
		return element;
	}

	public static WebElement selectContractorStaffing(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorStaffing));
		return element;
	}

	public static WebElement selectContractorStaffingEmployement(WebDriver driver) {
		element = driver.findElement(By.xpath(selectContractorStaffingEmployement));
		return element;
	}

	public static WebElement selectSubContractorStaffingRequirement(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSubContractorStaffingRequirement));
		return element;
	}

	public static WebElement selectFallProtectionMonitoringSystem(WebDriver driver) {
		element = driver.findElement(By.xpath(selectFallProtectionMonitoringSystem));
		return element;
	}

	public static WebElement checkBoxLadderMinimizationProgram(WebDriver driver) {
		element = driver.findElement(By.xpath(checkBoxLadderMinimizationProgram));
		return element;
	}

	public static WebElement fieldTestingType(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldTestingType));
		return element;
	}

	public static WebElement radioBtnThirPartyClaimInvestigationServiceYes(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnThirPartyClaimInvestigationServiceYes));
		return element;
	}

	public static WebElement radioBtnThirPartyClaimInvestigationServiceNo(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnThirPartyClaimInvestigationServiceNo));
		return element;
	}

	public static WebElement radioBtnThirPartyClaimInvestigationServiceField(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnThirPartyClaimInvestigationServiceField));
		return element;
	}

	public static WebElement selectSecurityStaff(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSecurityStaff));
		return element;
	}

	public static WebElement fieldSecurityStaff(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldSecurityStaff));
		return element;
	}

	public static WebElement radioBtnSecurityIDBadgingYes(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnSecurityIDBadgingYes));
		return element;
	}

	public static WebElement radioBtnSecurityIDBadgingNo(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnSecurityIDBadgingNo));
		return element;
	}

	public static WebElement radioBtnSecurityTurnstyleYes(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnSecurityTurnstyleYes));
		return element;
	}

	public static WebElement radioBtnSecurityTurnstyleNo(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnSecurityTurnstyleNo));
		return element;
	}

	public static WebElement fieldAvarageNoOFCarpenters(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAvarageNoOFCarpenters));
		return element;
	}

	public static WebElement fieldAvarageNoOFLaboreres(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAvarageNoOFLaboreres));
		return element;
	}

	public static WebElement fieldAvarageNoOFWorkers(WebDriver driver) {
		element = driver.findElement(By.xpath(fieldAvarageNoOFWorkers));
		return element;
	}

	public static WebElement radioBtnTPA_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnTPA_Yes));
		return element;
	}

	public static WebElement selectTPA_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTPA_Yes));
		return element;
	}

	public static WebElement radioBtnTPA_No(WebDriver driver) {
		element = driver.findElement(By.xpath(radioBtnTPA_No));
		return element;
	}

	public static WebElement selectTPA_No(WebDriver driver) {
		element = driver.findElement(By.xpath(selectTPA_No));
		return element;
	}

	public static WebElement btnSaveAndClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveAndClose));
		return element;
	}

	public static WebElement btnBack(WebDriver driver) {
		element = driver.findElement(By.xpath(btnBack));
		return element;
	}

}
