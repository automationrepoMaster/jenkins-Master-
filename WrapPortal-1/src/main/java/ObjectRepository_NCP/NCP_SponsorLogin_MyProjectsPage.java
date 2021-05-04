package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NCP_SponsorLogin_MyProjectsPage {

	private static WebElement element;
	private static List<WebElement> listElement;

	// Filter
	static String searchField = "//input[@id='txt-search']";
	static String searchIcon = "//input[@id='txt-search']/../div/a";
	static String btnFilterBy = "//a[@class='filter-btn']";
	static String refreshIcon = "//a[@data-original-title='Refresh']";

	static String selectProgramField = "//div[@class='advance-search']/div/div[1]//input[@type='text']";
	static String selectProgramFromList = "//div[@class='advance-search']/div/div[1]//ul/li[*]";// list
	static String contractValueField = "//input[@id='txtContractValue']";

	static String selectStateField = "//div[@class='advance-search']/div[1]/div[3]/div/div[1]/input[@type='text']";
	static String selectStateFromList = "//div[@class='advance-search']/div[1]/div[3]/div/div[1]//ul/li[*]";// list

	static String selectProjectStatusField = "//div[@class='advance-search']/div[1]/div[4]/div/div[1]/input[@type='text']";
	static String selectProjectStatusFromList = "//div[@class='advance-search']/div[1]/div[4]/div/div[1]//ul/li[*]";// list

	static String sortDistrictField = "//div[@class='advance-search']/div[1]/div[5]/div/div[1]/input[@type='text']";
	static String selectDistrictFromList = "//div[@class='advance-search']/div[1]/div[5]/div/div[1]//ul/li[*]";// list

	static String sortingExpressionField = "//select[@id='ddlSortingExpression']/../input[@type='text']";
	static String selectSortingExpressionFromList = "//select[@id='ddlSortingExpression']";// select
																							// class

	static String selectSortingOrderField = "//select[@id='ddlSortingOrder']/../input[@type='text']";
	static String selectSortingOrderFromList = "//select[@id='ddlSortingOrder']";// select
																					// class

	static String btnSearch = "//a[contains(text(),'Search')]";
	static String btnSaveFilter = "//a[contains(text(),'Save Filter')]";
	static String btnClose = "//a[contains(text(),'Close')]";
	static String btnClearFilter = "//a[contains(text(),'Clear Filter')]";

	
	public static WebElement searchField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchField));
		return element;
	}

	public static WebElement searchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(searchIcon));
		return element;
	}

	public static WebElement btnFilterBy(WebDriver driver) {
		element = driver.findElement(By.xpath(btnFilterBy));
		return element;
	}

	public static WebElement refreshIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(refreshIcon));
		return element;
	}

	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramField));
		return element;
	}

	public static List<WebElement> selectProgramFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProgramFromList));
		return listElement;
	}

	public static WebElement contractValueField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractValueField));
		return element;
	}

	public static WebElement selectStateField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectStateField));
		return element;
	}

	public static List<WebElement> selectStateFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectStateFromList));
		return listElement;
	}

	public static WebElement selectProjectStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectStatusField));
		return element;
	}

	public static List<WebElement> selectProjectStatusFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectProjectStatusFromList));
		return listElement;
	}

	public static WebElement sortDistrictField(WebDriver driver) {
		element = driver.findElement(By.xpath(sortDistrictField));
		return element;
	}

	public static List<WebElement> selectDistrictFromList(WebDriver driver) {
		listElement = driver.findElements(By.xpath(selectDistrictFromList));
		return listElement;
	}

	public static WebElement sortingExpressionField(WebDriver driver) {
		element = driver.findElement(By.xpath(sortingExpressionField));
		return element;
	}

	public static WebElement selectSortingExpressionFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSortingExpressionFromList));
		return element;
	}

	public static WebElement selectSortingOrderField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSortingOrderField));
		return element;
	}

	public static WebElement selectSortingOrderFromList(WebDriver driver) {
		element = driver.findElement(By.xpath(selectSortingOrderFromList));
		return element;
	}

	public static WebElement btnSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSearch));
		return element;
	}

	public static WebElement btnSaveFilter(WebDriver driver) {
		element = driver.findElement(By.xpath(btnSaveFilter));
		return element;
	}

	public static WebElement btnClose(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClose));
		return element;
	}

	public static WebElement btnClearFilter(WebDriver driver) {
		element = driver.findElement(By.xpath(btnClearFilter));
		return element;
	}

	//select searched project 
		static String clickOnSelectedProject ="//div[@id='accordionEx']/div[1]";//"//div[@id='accordionEx']/div[1]//div[@class='card-header pointer worksite-header collapsed']";
		
	//Download Certificate Page and functionality	
		static String downloadContractorCertificateLink ="//div[@id='accordionEx']/div[1]//u[contains(text(),'Download Contractor Certificates')]";
		static String downloadCurrentCertificatesRadioBtn ="//div[@id='bodyEnrollment']/div/div[2]/ul[1]/li[1]/div/label";
		static String downloadCertificatesForSpecificPeriodRadioBtn ="//div[@id='bodyEnrollment']/div/div[2]/ul[1]/li[2]/div/label";
		static String downloadCertificatesForSpecificPeriod_StartDate="//input[@id='txtFromDate']";
		static String downloadCertificatesForSpecificPeriod_EndDate="//input[@id='txtToDate']";
		
		static String downloadForAllContracctorRadioBtn ="//div[@id='bodyEnrollment']/div/div[2]/ul[2]/li[1]/div/label";
		static String downloadForSpecificContractorRadioBtn ="//div[@id='bodyEnrollment']/div/div[2]/ul[2]/li[2]/div/label";
		static String downloadForSpecificContractorSearchBar ="//input[@id='txtSearch']";
		static String downloadForSpecificContractorSearchIcon ="//input[@id='txtSearch']/../div/a";
		static String downloadForSpecificContractor_SelectFirstContractor_FrmList="//input[@id='txtSearch']/../../../div[2]/ul/li[1]/div//input";
		static String downloadCertificactesBtn="//a[@onclick='generateCertificates();']";
		static String downloadCertificactesAlertOKBtn="//button[contains(text(),'OK')]";
		static String downloadCertificactesAlertMessage="//p[contains(text(),'There are no Certificates available.')]";
		static String downloadCertificactesExitBtn="//a[@onclick='SaveAndExit();']";
		
		
		public static WebElement downloadCertificactesAlertMessage(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificactesAlertMessage));
			return element;
		}
		public static WebElement downloadCertificactesAlertOKBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificactesAlertOKBtn));
			return element;
		}
		public static WebElement clickOnSelectedProject(WebDriver driver) {
			element = driver.findElement(By.xpath(clickOnSelectedProject));
			return element;
		}
		public static WebElement downloadContractorCertificateLink(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadContractorCertificateLink));
			return element;
		}
		public static WebElement downloadCurrentCertificatesRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCurrentCertificatesRadioBtn));
			return element;
		}
		public static WebElement downloadCertificatesForSpecificPeriodRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificatesForSpecificPeriodRadioBtn));
			return element;
		}
		public static WebElement downloadCertificatesForSpecificPeriod_StartDate(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificatesForSpecificPeriod_StartDate));
			return element;
		}
		public static WebElement downloadCertificatesForSpecificPeriod_EndDate(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificatesForSpecificPeriod_EndDate));
			return element;
		}
		public static WebElement downloadForAllContracctorRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadForAllContracctorRadioBtn));
			return element;
		}
		public static WebElement downloadForSpecificContractorRadioBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadForSpecificContractorRadioBtn));
			return element;
		}
		public static WebElement downloadForSpecificContractorSearchBar(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadForSpecificContractorSearchBar));
			return element;
		}
		public static WebElement downloadForSpecificContractorSearchIcon(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadForSpecificContractorSearchIcon));
			return element;
		}
		public static WebElement downloadForSpecificContractor_SelectFirstContractor_FrmList(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadForSpecificContractor_SelectFirstContractor_FrmList));
			return element;
		}
		public static WebElement downloadCertificactesBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificactesBtn));
			return element;
		}
		public static WebElement downloadCertificactesExitBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(downloadCertificactesExitBtn));
			return element;
		}

	
//View Hierarchy Functionality
		static String viewHirarchyLink="//div[@id='accordionEx']/div[1]//u[contains(text(),'View Hierarchy')]";
		static String viewHirarchySelectFirstContractor ="//div[@id='bodyEnrollment']//ul[@class='sub-one']/li[1]/a";
		static String viewHirarchyExitBtn="//a[@onclick='SaveAndExit();']";
		
		static String getAllGeneralContractorsName="//div[@class='heading'][contains(text(),'General Contractor')]/../ul/li/div";//list
		
		public static WebElement viewHirarchyLink(WebDriver driver) {
			element = driver.findElement(By.xpath(viewHirarchyLink));
			return element;
		}
		public static WebElement viewHirarchySelectFirstContractor(WebDriver driver) {
			element = driver.findElement(By.xpath(viewHirarchySelectFirstContractor));
			return element;
		}
		public static WebElement viewHirarchyExitBtn(WebDriver driver) {
			element = driver.findElement(By.xpath(viewHirarchyExitBtn));
			return element;
		}
		public static List<WebElement> getAllGeneralContractorsName(WebDriver driver) {
			listElement = driver.findElements(By.xpath(getAllGeneralContractorsName));
			return listElement;
		}
		
		
		
		
}
