package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject_General_Information_Page  {
	private static WebElement element;
	private static List<WebElement> listElement;

	static String selectProgramField = "//select[@id='cntrWorkSiteAddUpdate_ddlProject']";// dropdown
	static String selectProjectStatusField = "//select[@id='cntrWorkSiteAddUpdate_ddlWorkSiteStatus']";// dropdown
//Add Project Status Code 17-08/20
	static String addNewProjectStatusLink="//a[@id='aWorkSiteStatus']";
	static String addProjectStatusLink="//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
	static String addProjectStatusListCloseButton="//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
	static String addProjectStatusNameField="//input[@id='ctrlMasterItemCategoryList_txtName']";
	static String addProjectStatusDescriptionField="//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
	static String addProjectStatusSaveButton="//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
	static String addProjectStatusSaveAndCloseButton="//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
	static String addProjectStatusCloseButton="//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";
	
	
	
	
	
	public static WebElement addNewProjectStatusLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewProjectStatusLink));
		return element;
	}
	public static WebElement addProjectStatusLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusLink));
		return element;
	}public static WebElement addProjectStatusListCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusListCloseButton));
		return element;
	}public static WebElement addProjectStatusNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusNameField));
		return element;
	}public static WebElement addProjectStatusDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusDescriptionField));
		return element;
	}public static WebElement addProjectStatusSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusSaveButton));
		return element;
	}public static WebElement addProjectStatusSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusSaveAndCloseButton));
		return element;
	}
	public static WebElement addProjectStatusCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectStatusCloseButton));
		return element;
	}
	
	static String projectNameField = "//input[@id='cntrWorkSiteAddUpdate_txtWorkSiteName']";
	static String projectCodeField = "//input[@id='cntrWorkSiteAddUpdate_txtWorkSiteCode']";
	static String duplicateProjectCodeAlertOKBtn ="//button[@id='btnOk']";
	
	static String parentProjectField = "//select[@id='cntrWorkSiteAddUpdate_ddlParentWorksite']";// dropdown
	static String divisionField = "//select[@id='cntrWorkSiteAddUpdate_ddlDivisionAdmin']";// dropdown
	static String contractValueField = "//input[@id='cntrWorkSiteAddUpdate_txtContractorPrice']";
	static String selectStateField = "//select[@id='cntrWorkSiteAddUpdate_ddlState']";// dropdown
	static String estimatedPayrollField = "//input[@id='cntrWorkSiteAddUpdate_txtEstimatedPayroll']";
	static String estimatedHoursField = "//input[@id='cntrWorkSiteAddUpdate_txtEstimatedHours']";
	static String beginDate = "//input[@id='cntrWorkSiteAddUpdate_txtEstStartDate']";
	static String endDate = "//input[@id='cntrWorkSiteAddUpdate_txtEstComplDate']";
	static String selectProjectAdministrator = "//select[@id='cntrWorkSiteAddUpdate_ddlNodeAdministrator']";// dropdown
	static String requiredDocumentsforEnrollmentSwitch = "//input[@id='cntrWorkSiteAddUpdate_chkWorksiteReqDocEnrollment']";
														  //div[@id='uniform-cntrWorkSiteAddUpdate_chkWorksiteReqDocEnrollment']//div[@class='ios-ui-select checked']
	static String activateContractorPortalForThisProjectSwitch = "//input[@id='cntrWorkSiteAddUpdate_chkCPO']";
	static String singlePrimeRedioButton = "//input[@id='cntrWorkSiteAddUpdate_rdoSinglePrime']";
	static String multiPrimeRedioButton = "//input[@id='cntrWorkSiteAddUpdate_rdoMultiPrime']";
	static String searchGeneralContractorCompanyField = "//input[@id='token-input-txtCompany']";
	static String searchContactField = "//input[@id='token-input-txtContractor']";
	static String GeneralContractorSaveButton = "//a[@id='divAddnewComapanyy']";
	static String GeneralContractorRemoveButton = "//a[@id='divAddnewComapanyyRemove']";
	static String contactNameField = "//input[@id='cntrWorkSiteAddUpdate_txtContactName']";
	static String contactEmailField = "//input[@id='cntrWorkSiteAddUpdate_txtContactEmail']";
	static String contactPhoneNoField = "//input[@id='cntrWorkSiteAddUpdate_txtPhone']";
	static String address1Field = "//input[@id='cntrWorkSiteAddUpdate_txtAddress1']";
	static String cityField = "//input[@id='cntrWorkSiteAddUpdate_txtCity']";
	static String zipField = "//input[@id='cntrWorkSiteAddUpdate_txtZip']";
	
	static String selectProjectType = "//select[@id='cntrWorkSiteAddUpdate_ddlWorksiteType']";// dropdown
//Add New Project Type Link	
	static String addNewProjectTypeLink="//a[@id='aWorkSiteType']";
	static String addProjectTypeLink="//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
	static String addProjectTypeListCloseButton="//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
	static String addProjectTypeNameField="//input[@id='ctrlMasterItemCategoryList_txtName']";
	static String addProjectTypeDescriptionField="//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
	static String addProjectTypeSaveButton="//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
	static String addProjectTypeSaveAndCloseButton="//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
	static String addProjectTypeCloseButton="//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";
	
	
	public static WebElement duplicateProjectCodeAlertOKBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(duplicateProjectCodeAlertOKBtn));
		return element;
	}
	
	public static WebElement addNewProjectTypeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewProjectTypeLink));
		return element;
	}
	public static WebElement addProjectTypeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeLink));
		return element;
	}public static WebElement addProjectTypeListCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeListCloseButton));
		return element;
	}public static WebElement addProjectTypeNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeNameField));
		return element;
	}public static WebElement addProjectTypeDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeDescriptionField));
		return element;
	}public static WebElement addProjectTypeSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeSaveButton));
		return element;
	}public static WebElement addProjectTypeSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeSaveAndCloseButton));
		return element;
	}
	public static WebElement addProjectTypeCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addProjectTypeCloseButton));
		return element;
	}
	
	static String selectBuildingType = "//select[@id='cntrWorkSiteAddUpdate_ddlBuildingType']";// dropdown
//Add New Building Type Link	
		static String addNewBuildingTypeLink="//a[@id='aBuildingType']";
		static String addBuildingTypeLink="//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
		static String addBuildingTypeListCloseButton="//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
		static String addBuildingTypeNameField="//input[@id='ctrlMasterItemCategoryList_txtName']";
		static String addBuildingTypeDescriptionField="//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
		static String addBuildingTypeSaveButton="//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
		static String addBuildingTypeSaveAndCloseButton="//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
		static String addBuildingTypeCloseButton="//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";
		public static WebElement addNewBuildingTypeLink(WebDriver driver) {
			element = driver.findElement(By.xpath(addNewBuildingTypeLink));
			return element;
		}
		public static WebElement addBuildingTypeLink(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeLink));
			return element;
		}public static WebElement addBuildingTypeListCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeListCloseButton));
			return element;
		}public static WebElement addBuildingTypeNameField(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeNameField));
			return element;
		}public static WebElement addBuildingTypeDescriptionField(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeDescriptionField));
			return element;
		}public static WebElement addBuildingTypeSaveButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeSaveButton));
			return element;
		}public static WebElement addBuildingTypeSaveAndCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeSaveAndCloseButton));
			return element;
		}
		public static WebElement addBuildingTypeCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addBuildingTypeCloseButton));
			return element;
		}	
		
	static String selectConstructionType = "//select[@id='cntrWorkSiteAddUpdate_ddlConstructionType']";// dropdown	
//Add New Construction Type Link	
	static String addNewConstructionTypeLink = "//a[@id='aConstructionType']";
	static String addConstructionTypeLink = "//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
	static String addConstructionTypeListCloseButton = "//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
	static String addConstructionTypeNameField = "//input[@id='ctrlMasterItemCategoryList_txtName']";
	static String addConstructionTypeDescriptionField = "//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
	static String addConstructionTypeSaveButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
	static String addConstructionTypeSaveAndCloseButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
	static String addConstructionTypeCloseButton = "//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";

	public static WebElement addNewConstructionTypeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewConstructionTypeLink));
		return element;
	}

	public static WebElement addConstructionTypeLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeLink));
		return element;
	}

	public static WebElement addConstructionTypeListCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeListCloseButton));
		return element;
	}

	public static WebElement addConstructionTypeNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeNameField));
		return element;
	}

	public static WebElement addConstructionTypeDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeDescriptionField));
		return element;
	}

	public static WebElement addConstructionTypeSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeSaveButton));
		return element;
	}

	public static WebElement addConstructionTypeSaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeSaveAndCloseButton));
		return element;
	}

	public static WebElement addConstructionTypeCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionTypeCloseButton));
		return element;
	}
	
	static String selectConstructionDeliveryMethod = "//select[@id='cntrWorkSiteAddUpdate_ddlConstructionDeliveryMethod']";// dropdown
//Add New Construction Delivery Method Link	
	static String addNewConstructionDeliveryLink = "//a[@id='aConstructionDeliveryMethod']";
	static String addConstructionDeliveryLink = "//span[@id='ctrlMasterItemCategoryList_lblAddButtonTitle']";
	static String addConstructionDeliveryListCloseButton = "//div[@id='divMasterCategoryItemList']//button[@class='btn'][contains(text(),'Close')]";
	static String addConstructionDeliveryNameField = "//input[@id='ctrlMasterItemCategoryList_txtName']";
	static String addConstructionDeliveryDescriptionField = "//textarea[@id='ctrlMasterItemCategoryList_txtDescription']";
	static String addConstructionDeliverySaveButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveGeneralInformation']";
	static String addConstructionDeliverySaveAndCloseButton = "//input[@id='ctrlMasterItemCategoryList_btnSaveandCloseGeneralInformation']";
	static String addConstructionDeliveryCloseButton = "//div[@id='divMasterCategoryItem']//button[@class='btn'][contains(text(),'Close')]";

	public static WebElement addNewConstructionDeliveryLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addNewConstructionDeliveryLink));
		return element;
	}

	public static WebElement addConstructionDeliveryLink(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliveryLink));
		return element;
	}

	public static WebElement addConstructionDeliveryListCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliveryListCloseButton));
		return element;
	}

	public static WebElement addConstructionDeliveryNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliveryNameField));
		return element;
	}

	public static WebElement addConstructionDeliveryDescriptionField(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliveryDescriptionField));
		return element;
	}

	public static WebElement addConstructionDeliverySaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliverySaveButton));
		return element;
	}

	public static WebElement addConstructionDeliverySaveAndCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliverySaveAndCloseButton));
		return element;
	}

	public static WebElement addConstructionDeliveryCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(addConstructionDeliveryCloseButton));
		return element;
	}
	
	static String selectBidType = "//select[@id='cntrWorkSiteAddUpdate_ddlBidType']";// dropdown
	static String joinVentureCheckBox = "//input[@id='cntrWorkSiteAddUpdate_chkJointVenture']";
	static String carrierApprovedCheckBox = "//input[@id='cntrWorkSiteAddUpdate_chkIsApprovalDate']";
	static String generalInformationSaveButton = "//input[@value='Save']";
	static String generalInformationSaveandCloseButton = "//input[@value='Save and Close']";
	static String generalInformationSaveandContinueButton = "//input[@value='Save and Continue']";
	static String generalInformationCloseButton ="//button[@id='cntrWorkSiteAddUpdate_btnClose']";
	
	static String verifyLinkisAvailableOrNot ="//a";
	static String linkCreateContractorPkg ="//a[contains(text(),'Create Contractor Package')]";
	static String linkExistingContractorPkg ="//a[contains(text(),'Link existing Contractor Package')]";
	
//Link Add New Contractor 17/08/20	
		static String addNewNodeContractorLink = "//a[@id='aContractorPackage']";
		static String contractorCompanyNameField = "//input[@id='token-input-txtSubCompanyName']";
		static String contactFirstName = "//input[@id='txtSubContratorFirstName']";
		static String contactLastName = "//input[@id='txtSubContractorLastName']";
		static String contactEmail = "//input[@id='txtSubContractorEmail']";
		static String contactCellPhone = "//input[@id='txtSubContractorPhone']";
		static String MoreButton = "//a[@id='divAdvance']";
		static String jobTitle = "//input[@id='txtJobTitle']";
		static String businessPhone = "//input[@id='txtBusinessPhone']";
		static String businessFax = "//input[@id='txtBusinessFax']";
		static String addContractorSaveAndCloseButton = "//button[@class='btn btn-success']";	
		
		public static WebElement addNewNodeContractorLink(WebDriver driver) {
			element = driver.findElement(By.xpath(addNewNodeContractorLink));
			return element;
		}public static WebElement contractorCompanyNameField(WebDriver driver) {
			element = driver.findElement(By.xpath(contractorCompanyNameField));
			return element;
		}public static WebElement contactFirstName(WebDriver driver) {
			element = driver.findElement(By.xpath(contactFirstName));
			return element;
		}public static WebElement contactLastName(WebDriver driver) {
			element = driver.findElement(By.xpath(contactLastName));
			return element;
		}public static WebElement contactEmail(WebDriver driver) {
			element = driver.findElement(By.xpath(contactEmail));
			return element;
		}public static WebElement contactCellPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(contactCellPhone));
			return element;
		}public static WebElement MoreButton(WebDriver driver) {
			element = driver.findElement(By.xpath(MoreButton));
			return element;
		}public static WebElement jobTitle(WebDriver driver) {
			element = driver.findElement(By.xpath(jobTitle));
			return element;
		}public static WebElement businessPhone(WebDriver driver) {
			element = driver.findElement(By.xpath(businessPhone));
			return element;
		}public static WebElement businessFax(WebDriver driver) {
			element = driver.findElement(By.xpath(businessFax));
			return element;
		}public static WebElement addContractorSaveAndCloseButton(WebDriver driver) {
			element = driver.findElement(By.xpath(addContractorSaveAndCloseButton));
			return element;
		}
	
	
	public static WebElement linkCreateContractorPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(linkCreateContractorPkg));
		return element;
	}
	public static WebElement linkExistingContractorPkg(WebDriver driver) {
		element = driver.findElement(By.xpath(linkExistingContractorPkg));
		return element;
	}
	
	public static WebElement generalInformationCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(generalInformationCloseButton));
		return element;
	}

	public static WebElement verifyLinkisAvailableOrNot(WebDriver driver) {
		element = driver.findElement(By.xpath(verifyLinkisAvailableOrNot));
		return element;
	}
	
	public static WebElement selectProgramField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProgramField));
		return element;
	}

	public static WebElement selectProjectStatusField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectStatusField));
		return element;
	}

	public static WebElement projectNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(projectNameField));
		return element;
	}

	public static WebElement projectCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath(projectCodeField));
		return element;
	}

	public static WebElement parentProjectField(WebDriver driver) {
		element = driver.findElement(By.xpath(parentProjectField));
		return element;
	}

	public static WebElement divisionField(WebDriver driver) {
		element = driver.findElement(By.xpath(divisionField));
		return element;
	}

	public static WebElement contractValueField(WebDriver driver) {
		element = driver.findElement(By.xpath(contractValueField));
		return element;
	}

	public static WebElement selectStateField(WebDriver driver) {
		element = driver.findElement(By.xpath(selectStateField));
		return element;
	}

	public static WebElement estimatedPayrollField(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedPayrollField));
		return element;
	}

	public static WebElement estimatedHoursField(WebDriver driver) {
		element = driver.findElement(By.xpath(estimatedHoursField));
		return element;
	}

	public static WebElement beginDate(WebDriver driver) {
		element = driver.findElement(By.xpath(beginDate));
		return element;
	}

	public static WebElement endDate(WebDriver driver) {
		element = driver.findElement(By.xpath(endDate));
		return element;
	}

	public static WebElement selectProjectAdministrator(WebDriver driver) {
		element = driver.findElement(By.xpath(selectProjectAdministrator));
		return element;
	}

	public static WebElement requiredDocumentsforEnrollmentSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(requiredDocumentsforEnrollmentSwitch));
		return element;
	}

	public static WebElement activateContractorPortalForThisProjectSwitch(WebDriver driver) {
		element = driver.findElement(By.xpath(activateContractorPortalForThisProjectSwitch));
		return element;
	}

	public static WebElement singlePrimeRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(singlePrimeRedioButton));
		return element;
	}

	public static WebElement multiPrimeRedioButton(WebDriver driver) {
		element = driver.findElement(By.xpath(multiPrimeRedioButton));
		return element;
	}

	public static WebElement searchGeneralContractorCompanyField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchGeneralContractorCompanyField));
		return element;
	}

	public static WebElement searchContactField(WebDriver driver) {
		element = driver.findElement(By.xpath(searchContactField));
		return element;
	}

	public static WebElement GeneralContractorSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorSaveButton));
		return element;
	}

	public static WebElement GeneralContractorRemoveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(GeneralContractorRemoveButton));
		return element;
	}

	public static WebElement contactNameField(WebDriver driver) {
		element = driver.findElement(By.xpath(contactNameField));
		return element;
	}

	public static WebElement contactEmailField(WebDriver driver) {
		element = driver.findElement(By.xpath(contactEmailField));
		return element;
	}

	public static WebElement contactPhoneNoField(WebDriver driver) {
		element = driver.findElement(By.xpath(contactPhoneNoField));
		return element;
	}

	public static WebElement address1Field(WebDriver driver) {
		element = driver.findElement(By.xpath(address1Field));
		return element;
	}

	public static WebElement cityField(WebDriver driver) {
		element = driver.findElement(By.xpath(cityField));
		return element;
	}

	public static WebElement zipField(WebDriver driver) {
		element = driver.findElement(By.xpath(zipField));
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

	public static WebElement selectConstructionType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectConstructionType));
		return element;
	}

	public static WebElement selectConstructionDeliveryMethod(WebDriver driver) {
		element = driver.findElement(By.xpath(selectConstructionDeliveryMethod));
		return element;
	}

	public static WebElement selectBidType(WebDriver driver) {
		element = driver.findElement(By.xpath(selectBidType));
		return element;
	}

	public static WebElement joinVentureCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(joinVentureCheckBox));
		return element;
	}

	public static WebElement carrierApprovedCheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath(carrierApprovedCheckBox));
		return element;
	}

	public static WebElement generalInformationSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(generalInformationSaveButton));
		return element;
	}

	public static WebElement generalInformationSaveandCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath(generalInformationSaveandCloseButton));
		return element;
	}

	public static WebElement generalInformationSaveandContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath(generalInformationSaveandContinueButton));
		return element;
	}
	
	// Raja 
	
	static String projectSettings_BackBtn="//input[@id='btnBackWorkSiteSettings']";
	static String projectSettings_SaveandCloseBtn="//input[@id='btnSaveandCloseWorkSiteSettings']";
	static String projectSettings_SaveandContinueBtn="//input[@id='btnNextProjectSettings']";
	
	public static WebElement projectSettings_BackBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSettings_BackBtn));
		return element;
	}
	public static WebElement projectSettings_SaveandCloseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSettings_SaveandCloseBtn));
		return element;
	}
	public static WebElement projectSettings_SaveandContinueBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(projectSettings_SaveandContinueBtn));
		return element;
	}
	
}
