package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_SafetyObservationPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	static String addSafetyObservationBtn = "//div[@class='modal-dialog modal-lg modal-full-height modal-right']//div[@class='row']/div[2]/a";
	static String SafetyObservationCloseIcon = "//div[@class='modal-dialog modal-lg modal-full-height modal-right']//div[@class='row']/div[3]/button/span";

	static String administrativeField = "//form[@id='frmSafetyObservation']/div/div[1]/div[1]/div/div/input";
	static String selectAdministrativeFromList = "//form[@id='frmSafetyObservation']/div/div[1]/div[1]/div/div/ul/li";// list

	static String selectObservationTypeField = "//form[@id='frmSafetyObservation']/div/div[1]/div[2]/div/div/input";
	static String selectObservationTypeFromList = "//form[@id='frmSafetyObservation']/div/div[1]/div[2]/div/div/ul/li";// list

	static String selectStatusField = "//form[@id='frmSafetyObservation']/div/div[1]/div[3]/div/div/input";
	static String selectStatusFromList = "//form[@id='frmSafetyObservation']/div/div[1]/div[3]/div/div/ul/li";// list

	static String selectPriorityField = "//form[@id='frmSafetyObservation']/div/div[1]/div[4]/div/div/input";
	static String selectPriorityFromList = "//form[@id='frmSafetyObservation']/div/div[1]/div[4]/div/div/ul/li";// list

	static String Location = "//form[@id='frmSafetyObservation']/div/div[1]/div[5]/div/input";
	static String RepetedViolationCheckBox = "//label[contains(text(),'Repeated Violation')]";
	static String AcknowledgeByCheckBox = "//label[contains(text(),'Acknowledge By')]";

	static String descriptionTextArea = "//textarea[@id='Description']";
	static String correctiveAction = "//textarea[@id='CorrAction']";

	static String contractorResponse = "//textarea[@id='ContractorResponse']";
	static String notes = "//textarea[@id='ObservationActionNotes']";

	static String addDocument = "//input[@class='custom-file-input position-absolute']";
	static String saveBtn = "//a[@id='aSaveSafetyObservation']";

	public static WebElement addSafetyObservationBtn(WebDriver driver) {

		element = driver.findElement(By.xpath(addSafetyObservationBtn));
		return element;
	}

	public static WebElement SafetyObservationCloseIcon(WebDriver driver) {

		element = driver.findElement(By.xpath(SafetyObservationCloseIcon));
		return element;
	}

	public static WebElement administrativeField(WebDriver driver) {

		element = driver.findElement(By.xpath(administrativeField));
		return element;
	}

	public static List<WebElement> selectAdministrativeFromList(WebDriver driver) {

		listElement = driver.findElements(By.xpath(selectAdministrativeFromList));
		return listElement;
	}

	public static WebElement selectObservationTypeField(WebDriver driver) {

		element = driver.findElement(By.xpath(selectObservationTypeField));
		return element;
	}

	public static WebElement selectObservationTypeFromList(WebDriver driver) {

		element = driver.findElement(By.xpath(selectObservationTypeFromList));
		return element;
	}

	public static WebElement selectStatusField(WebDriver driver) {

		element = driver.findElement(By.xpath(selectStatusField));
		return element;
	}

	public static WebElement selectStatusFromList(WebDriver driver) {

		element = driver.findElement(By.xpath(selectStatusFromList));
		return element;
	}

	public static WebElement selectPriorityField(WebDriver driver) {

		element = driver.findElement(By.xpath(selectPriorityField));
		return element;
	}

	public static WebElement selectPriorityFromList(WebDriver driver) {

		element = driver.findElement(By.xpath(selectPriorityFromList));
		return element;
	}

	public static WebElement Location(WebDriver driver) {

		element = driver.findElement(By.xpath(Location));
		return element;
	}

	public static WebElement RepetedViolationCheckBox(WebDriver driver) {

		element = driver.findElement(By.xpath(RepetedViolationCheckBox));
		return element;
	}

	public static WebElement AcknowledgeByCheckBox(WebDriver driver) {

		element = driver.findElement(By.xpath(AcknowledgeByCheckBox));
		return element;
	}

	public static WebElement descriptionTextArea(WebDriver driver) {

		element = driver.findElement(By.xpath(descriptionTextArea));
		return element;
	}

	public static WebElement correctiveAction(WebDriver driver) {

		element = driver.findElement(By.xpath(correctiveAction));
		return element;
	}

	public static WebElement notes(WebDriver driver) {

		element = driver.findElement(By.xpath(notes));
		return element;
	}

	public static WebElement contractorResponse(WebDriver driver) {

		element = driver.findElement(By.xpath(contractorResponse));
		return element;
	}

	public static WebElement addDocument(WebDriver driver) {

		element = driver.findElement(By.xpath(addDocument));
		return element;
	}

	public static WebElement saveBtn(WebDriver driver) {

		element = driver.findElement(By.xpath(saveBtn));
		return element;
	}

}
