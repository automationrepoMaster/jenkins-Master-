/*
 * package RajaTestScripts;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.Keys; import org.openqa.selenium.WebElement;
 * import org.testng.annotations.Test;
 * 
 * import com.relevantcodes.extentreports.LogStatus;
 * 
 * import CommonLibrary.WebDriverCommonLib; import GenericLibrary.BaseClass;
 * import GenericLibrary.FileUtils1; import
 * ObjectRepository.AddContractor_Pkg_Page;
 * 
 * 
 * public class ContractorPkgStatusMergingTest extends BaseClass {
 * 
 * WebDriverCommonLib wb = new WebDriverCommonLib(); String programName =
 * "Hercules PG"; String projectName = "Hercules PJ"; String Enrollment =
 * "WC & GL Enrollment"; String EnrollmentStatus = "Excluded Contractor"; String
 * Contractor = "Mark Boucher"; String Contactname = "Hercules"; String Trade =
 * "2085 | TradeDynamic-"; String UpperTierContractor =
 * "| Roger Federer | Hercules Contac | Trade Description Trade Number-007 -";
 * String NonCIPInsuranceCompanyname = "Carrier Name-1234"; // Trade
 * Description"; String NonCIP_Compliance = "Hercules-Test-1"; String
 * classcodeDescription = "1234 | Class Code Description"; String
 * ContractorStatus_Assigned = "Assigned"; String ContractorStatus_Cancelled =
 * "Cancelled"; String ContractorStatus_Closed_Out = "Closed-Out"; String
 * ContractorStatus_Enrolled = "Enrolled"; String
 * ContractorStatus_Enrolled_Pending_Certificates =
 * "Enrolled Pending Certificates"; String
 * ContractorStatus_Enrollment_Pending_Review = "Enrollment Pending Review";
 * String ContractorStatus_Excluded = "Excluded"; String
 * ContractorStatus_Excluded_Closed = "Excluded - Closed"; String
 * ContractorStatus_Expired_Offsite_Coverage = "Expired Offsite Coverage";
 * String ContractorStatus_Expired_Offsite_Incomplete =
 * "Expired Offsite Incomplete"; String
 * ContractorStatus_Expired_Offsite_Pending_Review =
 * "Expired Offsite Pending Review"; String
 * ContractorStatus_Expiring_Offsite_Coverage = "Expiring Offsite Coverage";
 * String ContractorStatus_Incomplete_Paperwork = "Incomplete Paperwork"; String
 * ContractorStatus_Incomplete_Paperwork_Conditionally =
 * " Conditionally Enrolled | Incomplete Paperwork"; String
 * ContractorStatus_Missing_Payroll_ = "Missing Payroll"; String
 * ContractorStatus_Not_Awarded_ = "Not Awarded"; String
 * ContractorStatus_Pending_Closeout = "Pending Closeout"; String
 * ContractorStatus_Pending_Review = "Pending Review"; String
 * ContractorStatus_Pending_Review_Conditionally =
 * "Pending Review | Conditionally Enrolled"; String Winodw_Title_Cpkg =
 * "Contractor Packages - Wrap-Portal"; String Window_Tilte_InsuranceEnrollment
 * = " INSURANCE ENROLLMENT"; String Window_Tilte_NonCip_Compliance =
 * "NON-CIP COMPLIANCE"; String Window_Title_WC_PremModification =
 * "WORKER'S COMPENSATION PREMIUM MODIFICATIONS"; String
 * Window_Tilte_GL_UMbrella = "GENERAL LIABILITY UMBRELLA"; String
 * Window_Title_SuBContractor_Info = " SUB CONTRACTOR INFO"; String
 * Window_Tilte_EnrollmentSummary = " ENROLLMENT SUMMARY"; String
 * Window_Tilte_EnrollmentConfirmation = "ENROLLMENT CONFIRMATION"; String
 * contractorName = "Roger Federer"; String projectName1 = "Hercules PJ"; String
 * tradeNo = "2085 | TradeDynamic-";
 * 
 * public static WebElement selectDynamicContractorPkg() { // element = //
 * driver.findElement(By.xpath("//ul[@id='ulNoteList']/li[*]//div[@class='
 * companytitle' // and
 * contains(text(),'"+contractorName+"')]/..//div[@class='workSite' and //
 * contains(text(),'"+projectName+"')]/../../div[2]/div[3 and //
 * contains(text(),'"+tradeNo+"')]")); String xpaths =
 * "//ul[@id='ulNoteList']//li[*]//div[@class='companytitle']/span[contains(text(),'Roger Federer')]/../../..//div[@class='workSite']/span[contains(text(),'Hercules PJ')]/../../../div[2]/div[3]/span[contains(text(),'2085 | TradeDynamic-')]/../../.."
 * ; WebElement DynamicContractorPkg = driver.findElement(By.xpath(xpaths));
 * 
 * // driver // .findElement(By.xpath(
 * "//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),'"
 * // + contractorName +
 * "')]/../..//div[@class='workSite']/span[contains(text(),'" + projectName1 //
 * + "')]/../../../div[2]/div[3]/span[contains(text(),'" + tradeNo +
 * "')]/../../.."));
 * 
 * // WebElement DynamicContractorPkg = driver.findElement(By.xpath( //
 * "//ul[@id='ulNoteList']/li[*]//div[@class='companytitle']/span[contains(text(),"
 * +'Roger
 * Federer')]/../..//div[@class='workSite']/span[contains(text(),'Hercules
 * PJ')]/../../../div[2]/div[3]/span[contains(text(),'2085 |
 * TradeDynamic-')]/../../..")); return DynamicContractorPkg;
 * 
 * }
 * 
 * public static WebElement statusesEnrollment() {
 * 
 * WebElement enrollmentstatus =
 * driver.findElement(By.xpath("//div[@class='top-bar-wrap clearfix']"));//
 * div[@class='vertical-middle']/./div[1][@class='status-name'][*]")); return
 * enrollmentstatus; }
 * 
 * @Test(priority = 1) public void ContractorPkgCreation() throws Throwable { //
 * Createing a Contractor Package and Fill ALl the data from Insurance Page to
 * // GL and WC prem Modifications page will make Status as Enrolled Missing //
 * Payroll JavascriptExecutor js = (JavascriptExecutor) driver;
 * AddContractor_Pkg_Page .CP_Icon(driver).click(); Thread.sleep(5000);
 * test.log(LogStatus.PASS, "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * js.executeScript("window.scrollTo(0, 0)");
 * System.out.println("scrolled to the top");
 * AddContractor_Pkg_Page.plus_Btn(driver).click();
 * System.out.println("scrolled to the top and clicked on Plus button");
 * test.log(LogStatus.PASS, "plus button is clicked succesfully");
 * Thread.sleep(4000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched to child window 1 to enroll a  contractor package");
 * AddContractor_Pkg_Page.selectProgram(driver).click();
 * test.log(LogStatus.PASS,
 * "Switched to selct programme searchbar is clicked succesfully at   contractor package"
 * ); wb.type(AddContractor_Pkg_Page.selectProgramSearchBox(driver),
 * programName);
 * wb.ListOflist(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver
 * ), programName); test.log(LogStatus.PASS,
 * "programme  from dropdown bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectProject(driver).click();
 * test.log(LogStatus.PASS, "Select porjrct bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectProjectSearchBox(driver), projectName);
 * test.log(LogStatus.PASS,
 * "Select porjrct bar is clicked  and typed  succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver
 * ), projectName); test.log(LogStatus.PASS,
 * "project  from drop down bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
 * test.log(LogStatus.PASS, "Select Enrollment bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver),
 * Enrollment); test.log(LogStatus.PASS,
 * "Select Enrollment is clicked  and typed succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete
 * (driver), Enrollment); test.log(LogStatus.PASS,
 * "Enrollemnt type is selcetd from dropdown"); Thread.sleep(4000);
 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
 * //AddContractor_Pkg_Page.nonCIPCompliancename(NonCIP_Compliance).click();
 * test.log(LogStatus.PASS, "Non cip compliance is selected  + it is ::::" +
 * NonCIP_Compliance); Thread.sleep(3000); wb.typeBySendkeys(Contractor,
 * AddContractor_Pkg_Page.selectContractor(driver)); test.log(LogStatus.PASS,
 * "Contractor is selclted succesfully"); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.SelectContact(driver));
 * wb.typeBySendkeys(Contactname,
 * AddContractor_Pkg_Page.SelectContactSearchBox(driver));
 * test.log(LogStatus.PASS, "Contarctor is selcted succesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.ContactsListDropdown(driver),
 * Contactname); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.selectTrade(driver));
 * wb.type(AddContractor_Pkg_Page.selectTradeSearchBox(driver), Trade);
 * Thread.sleep(2000);
 * wb.ListOflist(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver),
 * Trade); test.log(LogStatus.PASS, "Trade is selcted succesfully");
 * Thread.sleep(2000); wb.click(AddContractor_Pkg_Page.btnNext(driver));
 * test.log(LogStatus.PASS, "Next is clicked succesfully"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Clsoe button is clicked succesfully at Send Email page");
 * System.out.println("close button is clicked succesfully");
 * Thread.sleep(2000); wb.Switchtoparent(); test.log(LogStatus.PASS,
 * "switched to main tab"); test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "ContractorPkgCreation")));
 * 
 * }
 * 
 * @Test(priority = 2)
 * 
 * public void AssignedTOEnrolledMissingpayrollStatus() throws Throwable {
 * 
 * try { wb.Switchtoparent(); test.log(LogStatus.PASS, "switched to main tab");
 * selectDynamicContractorPkg().click(); Thread.sleep(2000); String
 * CpkgstatusText = selectDynamicContractorPkg().getText();
 * System.out.println(CpkgstatusText +
 * "it is the text when dynamic contractorpkg  status  after creating contractor package "
 * + CpkgstatusText); } catch (Throwable e) {
 * selectDynamicContractorPkg().click();
 * System.out.println("Dynamicx contractor package is selected succesfully"); }
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1"); String
 * Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus + "AssignedStatus text");
 * AddContractor_Pkg_Page.CloseBtn_CIPAgreement(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent();
 * System.out.println("switched to parent tab to get the text");
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * test.log(LogStatus.PASS,
 * "Dynamic Contractor package is clicked at Contractor packages list");
 * System.out.
 * println("Dynamic Contractor package is clicked at Contractor packages list");
 * Thread.sleep(3000);
 * System.out.println("refresh button is clicked succesfully"); String
 * CpkgstatusText = selectDynamicContractorPkg().getText();
 * System.out.println(CpkgstatusText); if
 * (CpkgstatusText.contains(ContractorStatus_Assigned) &&
 * Enrollmentstatus.contains(ContractorStatus_Assigned)) { System.out.
 * println("status after creating a contractor package and the status is========= "
 * + ContractorStatus_Assigned); test.log(LogStatus.PASS,
 * "It is the first status after creating a contractor pkg============" +
 * CpkgstatusText); } else { test.log(LogStatus.FAIL,
 * "The status text is not Assigned. The Actual staus is ===========" +
 * CpkgstatusText);
 * System.out.println("contractor status is not assigned the actual status is" +
 * CpkgstatusText); }
 * System.out.println("It is the method for validating Assigned status");
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.NextBtn_CIPAgreement(driver).click();
 * System.out.println("next button at CIP Agreement is clicked successfully");
 * System.out.println(driver.getTitle());
 * wb.Alert_Click(AddContractor_Pkg_Page.CancelBtn_CIPAgreement(driver));
 * System.out.println("cancel button for the alert is clicked succesfully");
 * js.executeScript("window.scrollTo(0,0)"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).click();
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).clear();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).
 * sendKeys("Roger Federer"); test.log(LogStatus.PASS,
 * "Contract name is enetered"); js.executeScript("window.scrollBy(0,600)");
 * System.out.println("Scroled to Contact Information ");
 * AddContractor_Pkg_Page.ContractValue(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "contract value  is enetered");
 * AddContractor_Pkg_Page.SelfperformedContractValue(driver).sendKeys("90000");
 * test.log(LogStatus.PASS, "SelfperformedContractValue is entered");
 * AddContractor_Pkg_Page.EstimatedcappedPayroll(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "Estimated capped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedUncappedPayroll(driver).sendKeys("80000");
 * test.log(LogStatus.PASS, "Estimated Uncapped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedManHours(driver).sendKeys("1000");
 * test.log(LogStatus.PASS, "Estimated ManHours is enetred");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys("01/01/2020");
 * test.log(LogStatus.PASS, "Estimated start date  is enetred");
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.BrieflyDescribetheScopeoftheWork(driver)
 * .sendKeys("BrieflyDescribetheScopeoftheWork"); test.log(LogStatus.PASS,
 * "BrieflyDescribetheScopeoftheWork is enetred at Insurance enrollment page");
 * js.executeScript("window.scrollBy(0,100)");
 * wb.click(AddContractor_Pkg_Page.workclassDropdown(driver));
 * test.log(LogStatus.PASS, "workclassDropdown is clicked ");
 * wb.ListSearch(AddContractor_Pkg_Page.WorkclassDropDownList(driver),
 * "1234 - Class Code Description"); test.log(LogStatus.PASS,
 * "class code is seleccted succesfully"); Thread.sleep(4000);
 * wb.click(AddContractor_Pkg_Page.WorkclassOKBtn(driver));
 * AddContractor_Pkg_Page.WorkclassWorkHours(driver).sendKeys("1000");
 * test.log(LogStatus.PASS, "Workhours is Entered "); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WorkclassPayRoll(driver).sendKeys("10000");
 * test.log(LogStatus.PASS, "WorkclassPayRoll is Entered ");
 * AddContractor_Pkg_Page.WorkclassWCRate(driver).sendKeys("10");
 * test.log(LogStatus.PASS, "WorkclassWCRate is Entered "); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WorkclassAddworkclassBtn(driver).click();
 * System.out.println("Work class update button is cicked syccesfully");
 * test.log(LogStatus.PASS, "WorkclassAddworkclassBtn is clicked ");
 * Thread.sleep(3000); js.executeScript("window.scrollBy(0,200)");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.InsuranceEnrollmentMarkasConfirmedBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "InsuranceEnrollmentMarkasConfirmedBtn is clicked ");
 * AddContractor_Pkg_Page.InsuranceEnrollmentSaveandCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "InsuranceEnrollment save and close button  is clicked ");
 * System.out.println("InsuranceEnrollment save and close button  is clicked ");
 * Thread.sleep(4000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * test.log(LogStatus.PASS, "Ok button for payroll alert   is clicked ");
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000); try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); } catch (Throwable e) { try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked ");
 * 
 * } catch (Throwable D) { System.out.println("no alert is presne to click "); }
 * Thread.sleep(4000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(0,0)"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.refreshBtn(driver).click(); test.log(LogStatus.PASS,
 * "Refresh button after Enrollment is clicked succesafully");
 * Thread.sleep(5000); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * System.out.println(
 * "Dynamic contractor package after refresh is selcted to cancel the contractor pkg after editing it"
 * ); js.executeScript("window.scrollTo(0,0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.InsurancePagelink(driver).click();
 * wb.SwitchtoChild1();
 * System.out.println("again Swicthed to Insurance Enrollment "); String
 * Incompletepaperworkstatus = statusesEnrollment().getText();
 * System.out.println(Incompletepaperworkstatus + "::: Incomplete paper work");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * wb.moveToElement(
 * AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver));
 * AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(0,0)"); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); System.out.println(
 * "Dynamic contractor package is selected to get the status at Incomplete status paper work"
 * ); String CpkgstatusText_ICPW = selectDynamicContractorPkg().getText();
 * System.out.println(CpkgstatusText_ICPW +
 * "it is the contractor package  text at save and cotinur button"); if
 * (CpkgstatusText_ICPW.contains("Incomplete Paperwork") &&
 * Enrollmentstatus.contains("Not Enrolled | Incomplete Paperwork")) {
 * System.out.
 * println("It is the First Status after creating a contractor package and the status is "
 * + ContractorStatus_Incomplete_Paperwork); test.log(LogStatus.PASS,
 * "It is the first status after creating a contractor pkg" +
 * ContractorStatus_Incomplete_Paperwork); } else { test.log(LogStatus.FAIL,
 * "The status text is not" + ContractorStatus_Incomplete_Paperwork +
 * " The Actual staus is " + ContractorStatus_Incomplete_Paperwork); } }
 * 
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.
 * println("swictehd to window 1 after Insurance paeg enrollment link to get missing payroll"
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); try {
 * AddContractor_Pkg_Page.NextBtn_CIPAgreement(driver).click();
 * System.out.println("next button at CIP Agreement is clicked successfully"); }
 * catch (Throwable e) {
 * System.out.println("next button at CIP Agreement is not available to click");
 * } System.out.println(driver.getTitle()); try {
 * AddContractor_Pkg_Page.CancelBtn_CIPAgreement(driver).click();
 * System.out.println("cancel button for the alert is clicked succesfully"); }
 * catch (Throwable e) {
 * System.out.println("cancel button is not available to click"); }
 * js.executeScript("window.scrollBy(0,200)");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.InsuranceEnrollmentSaveandContinueBtn(driver).click();
 * Thread.sleep(2000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * test.log(LogStatus.PASS, "Ok button for payroll alert   is clicked ");
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000); try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); } catch (Throwable e) { try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked ");
 * 
 * } catch (Throwable D) { System.out.println("no alert is presne to click "); }
 * } js.executeScript("window.scrollTo(0,0)");
 * System.out.println(driver.getTitle() + "::it is the title at Non CIP");
 * wb.moveToElement(AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver));
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(
 * NonCIPInsuranceCompanyname); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(Keys.ENTER
 * ); System.out.println(NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name"); test.log(LogStatus.PASS,
 * NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name");
 * js.executeScript("window.scrollBy(0,300)");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys("08/01/2020");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy start date is selected succesfully");
 * System.out.println("Non cip policy start date is selected succesfully");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * System.out.
 * println("Non cip policy Expiry start  date is selected succesfully");
 * Thread.sleep(2000); test.log(LogStatus.PASS,
 * "Non cip policy Expiry  date is selected succesfully");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandContinueBtn(driver).click(); System.out.
 * println("save and continue button at Non CiP Compliance page is clikced succesfully"
 * ); Thread.sleep(4000); System.out.println(driver.getTitle() +
 * " :It is the title at Wc and premium Modification page");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.WcPremiumModificationsMarkasConfirmedBtn(driver).click
 * (); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WcPremiumModificationssaveandContinueBtn(driver).click
 * (); System.out.
 * println("save and continue button at Wc Premium Modifications  page is clikced succesfully"
 * ); Thread.sleep(5000); System.out.println(driver.getTitle() +
 * "==== It is the tilte of the page at GL and Umbrella page");
 * js.executeScript("window.scrollBy(0,150)");
 * AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalityClasscodeSearcbox(driver).
 * click(); Thread.sleep(2000);
 * System.out.println("GL search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalitySeachBoxfeild(driver).
 * sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalityClassCodeList(
 * driver), classcodeDescription); System.out.println(
 * "class code description is selcted as " + classcodeDescription +
 * "at General liabilty dropdown"); Thread.sleep(2000); try {
 * js.executeScript("window.scrollBy(0,500)"); } catch (Throwable e) {
 * System.out.println("cannot be scrolled dpown"); } wb
 * .scrollByVisibilityOfElement(AddContractor_Pkg_Page.
 * GLUmbrellaUmbrellaLibalitysearchbox(driver));
 * AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalitysearchbox(driver).click();
 * Thread.sleep(2000);
 * System.out.println("Umbrealla  search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalitySeachBoxfeild(driver).
 * sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalityClasscodeList(
 * driver), classcodeDescription); System.out.println(
 * "class code description is selcted as " + classcodeDescription +
 * "at Umbrella liabilty dropdown"); Thread.sleep(2000); try {
 * js.executeScript("window.scrollBy(0,500)"); } catch (Throwable e) {
 * System.out.println("cannot be scrolled dpown"); } wb.moveToElement(
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(
 * driver));
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(
 * driver).click(); Thread.sleep(2000);
 * System.out.println("GL search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild(
 * driver) .sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.
 * GLUmbrellaPolluctionchargeLiabilityclasscodeList(driver),
 * classcodeDescription);
 * System.out.println("class code description is selcted as " +
 * classcodeDescription + "at Pollution charge  liabilty dropdown");
 * Thread.sleep(2000);
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellaMarkasConfirmedButton(driver).click();
 * AddContractor_Pkg_Page.GLUmbrellasaveandcontinueBtn(driver).click();
 * Thread.sleep(5000); System.out.println(driver.getTitle() +
 * "it is the title at Subcontractor page"); String Missingpayrolltstatus =
 * statusesEnrollment().getText(); System.out.println(Missingpayrolltstatus +
 * "::: Enrolled and Missing payroll");
 * AddContractor_Pkg_Page.SubcontractorCloseBtn(driver).click(); System.out.
 * println("close button at Sub contractor page is selcted succesfully");
 * Thread.sleep(2000); wb.Switchtoparent();
 * System.out.println(driver.getTitle()); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String Enrolledstatus =
 * selectDynamicContractorPkg().getText(); if
 * (Enrolledstatus.contains("Missing Payroll") &&
 * Enrollmentstatus.contains("Missing Payroll")) {
 * System.out.println("The status at Missing payroll status check is  " +
 * ContractorStatus_Missing_Payroll_); test.log(LogStatus.PASS,
 * "It is the status after enrolling  a contractor package" +
 * ContractorStatus_Missing_Payroll_); } else { test.log(LogStatus.FAIL,
 * "The status text is not" + Enrolledstatus + " The Actual staus is " +
 * ContractorStatus_Missing_Payroll_); } System.out.
 * println("we are at the end of Assigned to Enroled Missing Payroll status");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "AssignedTOEnrolledMissingpayrollStatus")));
 * 
 * }
 * 
 * @Test(priority = 3) public void Enrolled() throws Throwable { // Adding a
 * payroll will make the status as Enrolled pending Certificates
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver; wb.scrollToTop(); try {
 * wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.PayrollLink(driver).click();
 * test.log(LogStatus.PASS, "Payroll link is clicked at lisitng panel ");
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000);
 * System.out.println(driver.getTitle() + "It is the tile at Add payroll page");
 * wb.selectByVisibleText("January 2020",
 * AddContractor_Pkg_Page.SelectPayrollperiod(driver));
 * System.out.println("january 2020 is selected from the drop down succesfully"
 * );
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for jan-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); }
 * 
 * test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Jan-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click();
 * System.out.println("continue for next month button is clicked succesfully");
 * // February-2020
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Feb-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Feb-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Feb-2020"
 * ); // March-2020
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Mar-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Mar-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Mar-2020"
 * ); // April-2020
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Apr-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Apr-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Apr-2020"
 * ); // May
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for May-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for may-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for May-2020"
 * ); // June-2020
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for June-2020"); try
 * { AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for June-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for June-2020"
 * ); // July
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Jul-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Jul-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Jul-2020"
 * ); // Aug
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Aug-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Aug-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Aug-2020"
 * ); // September
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Sep-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Sep-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContinuefornxtmnthBtn(driver).click(); System.out.
 * println("continue for next month button is clicked succesfully for Sep-2020"
 * ); // October
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Oct-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Oct-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.PayrollFinalpayrollBtn(driver).click(); System.out.
 * println("Final button is clicked for the last payroll month Oct-2020");
 * AddContractor_Pkg_Page.PayrollSaveandcloseBtn(driver).click(); System.out.
 * println("save and close button  is clicked succesfully for Oct-2020");
 * Thread.sleep(4000); wb.Switchtoparent(); System.out.
 * println("switched to contractor panel after adding payroll toi checkn the status"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.PayrollLink(driver).click();
 * test.log(LogStatus.PASS, "Payroll link is clicked at lisitng panel ");
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); String
 * EnrolledStatus = statusesEnrollment().getText();
 * System.out.println(EnrolledStatus + "::: Enrolled");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollCloseBtn(driver).click(); wb.Switchtoparent();
 * System.out.
 * println("switched to contractor panel after adding payroll toi checkn the status"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * EnrolledPendingcertificatestatus = selectDynamicContractorPkg().getText(); if
 * (EnrolledPendingcertificatestatus.contains(
 * ContractorStatus_Enrolled_Pending_Certificates) &&
 * EnrolledStatus.contains(ContractorStatus_Enrolled)) { System.out.
 * println("It is the status after adding payrollto  a contractor package and the status is "
 * + ContractorStatus_Enrolled_Pending_Certificates); test.log(LogStatus.PASS,
 * "It is the status after adding payrollto  a contractor package" +
 * ContractorStatus_Enrolled_Pending_Certificates); } else {
 * test.log(LogStatus.FAIL, "The status text is not" +
 * EnrolledPendingcertificatestatus + " The Actual staus is " +
 * ContractorStatus_Enrolled_Pending_Certificates); }
 * 
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "Enrolled"))); }
 * 
 * // @Test(priority = 4) public void EnrolledPendingCertificateStatus() throws
 * Throwable { // Adding Certificates next to adding payroll will make the
 * Status as Enrolled JavascriptExecutor js = (JavascriptExecutor) driver;
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.CertificatesLink(driver).click();
 * System.out.println("Certificates page is opened"); wb.SwitchtoChild1();
 * System.out.println(driver.getTitle() +
 * "It is the tilte of the View certificates page"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.viewCertificatesAutoGenerate(driver).click();
 * System.out.println("Auto generate button is clicked at " +
 * driver.getTitle()); Thread.sleep(2000);
 * wb.Alert_Click(AddContractor_Pkg_Page.cancelContractorPkgBtnAlertOKBtn(driver
 * )); test.log(LogStatus.PASS,
 * "Ok button is clicked at Auto genereate certificstes ");
 * System.out.println("Ok button is clicked at Auto Generate certificates");
 * Thread.sleep(4000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.ViewCertificatesFrame(driver))
 * ; System.out.
 * println("swicthed to frame at Auto genereate certificstes at  view certificates page"
 * ); AddContractor_Pkg_Page.ViewCertificatesGLPolicyNumber(driver).sendKeys(
 * "GLPolicyNumber_Hercules");
 * AddContractor_Pkg_Page.ViewCertificatesExcessUmbrellaPolicyNumber(driver)
 * .sendKeys("ViewCertificatesExcessUmbrellaPolicyNumber_Hercules");
 * AddContractor_Pkg_Page.ViewCertificatesWcPolicyNumber(driver)
 * .sendKeys("ViewCertificatesWcPolicyNumber_Hercules");
 * wb.moveToElement(AddContractor_Pkg_Page.ViewCertificatesaveandClosebtn(driver
 * )); AddContractor_Pkg_Page.ViewCertificatesaveandClosebtn(driver).click();
 * System.out.println(
 * "save and close button at View certificates page is clicked succesfully after enetering the data"
 * ); try {
 * 
 * AddContractor_Pkg_Page.ReturnBackLink(driver).click(); Thread.sleep(2000);
 * System.out.println("Website under construction error is appeared");
 * wb.Alert_Click(AddContractor_Pkg_Page.cancelContractorPkgBtnAlertOKBtn(driver
 * )); test.log(LogStatus.PASS,
 * "Ok button is clicked at Auto genereate certificstes ");
 * System.out.println("Ok button is clicked at Auto Generate certificates");
 * Thread.sleep(4000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.ViewCertificatesFrame(driver))
 * ; System.out.
 * println("swicthed to frame at Auto genereate certificstes at  view certificates page"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ViewCertificatesGLPolicyNumber(driver).sendKeys(
 * "GLPolicyNumber_Hercules");
 * AddContractor_Pkg_Page.ViewCertificatesExcessUmbrellaPolicyNumber(driver)
 * .sendKeys("ViewCertificatesExcessUmbrellaPolicyNumber_Hercules");
 * AddContractor_Pkg_Page.ViewCertificatesWcPolicyNumber(driver)
 * .sendKeys("ViewCertificatesWcPolicyNumber_Hercules");
 * wb.moveToElement(AddContractor_Pkg_Page.ViewCertificatesaveandClosebtn(driver
 * )); AddContractor_Pkg_Page.ViewCertificatesaveandClosebtn(driver).click();
 * System.out.println(
 * "save and close button at View certificates page is clicked succesfully after enetering the data"
 * );
 * 
 * } catch (Throwable e) { System.out.
 * println("No error so moved furtehr at website under consctrutction error"); }
 * 
 * try { driver.switchTo().defaultContent();
 * AddContractor_Pkg_Page.ViewCertificatesFinishandCloseBtn(driver).click();
 * System.out.println(
 * "Finish and close button at View certificates button is clicked succesfully after swicthuing to default content"
 * ); } catch (Throwable e) { try {
 * AddContractor_Pkg_Page.ViewCertificatesFinishandCloseBtn(driver).click();
 * System.out.
 * println("Finish and close button at View certificates button is clicked succesfully"
 * ); } catch (Throwable t) {
 * System.out.println("Not avaialble of Finish and close button to click"); } }
 * 
 * wb.Switchtoparent(); System.out.
 * println("switched to parent after generating the certificates at View Certificates page"
 * ); js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * selectDynamicContractorPkg().click(); System.out.
 * println("Dynamic contractor is selcted sucessfully at view certificates status"
 * ); js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.CertificatesLink(driver).click();
 * test.log(LogStatus.PASS, "Payroll link is clicked at lisitng panel ");
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000); String
 * Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus +
 * "::: Enrolled at view add payroll page");
 * AddContractor_Pkg_Page.ViewCertificatesFinishandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent(); System.out.
 * println("switched to parent after generating the certificates at View Certificates page"
 * ); js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * selectDynamicContractorPkg().click(); System.out.
 * println("Dynamic contractor is selcted sucessfully at view certificates status"
 * ); Thread.sleep(5000); String Enrolledstatus =
 * selectDynamicContractorPkg().getText(); if
 * (Enrolledstatus.contains(ContractorStatus_Enrolled) &&
 * Enrollmentstatus.contains(ContractorStatus_Enrolled)) { System.out.
 * println("It is the status after adding certificates a contractor package and the status is "
 * + ContractorStatus_Enrolled); test.log(LogStatus.PASS,
 * "It is the status after adding certificates  a contractor package" +
 * ContractorStatus_Enrolled); } else { test.log(LogStatus.FAIL,
 * "The status text is not" + ContractorStatus_Enrolled +
 * " The Actual staus is " + ContractorStatus_Enrolled); }
 * System.out.println("Certificates adding is done to Contractor package");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "EnrolledPendingCertificateStatus"))); }
 * 
 * @Test(priority = 5)
 * 
 * public void ExpiredOffsiteCoverageStatus() throws Throwable { // After ading
 * payroll and Generating a certifcate If we NonCIP policy end date // is less
 * than the current date and Greater the Policy end start it will show // the
 * status as Expired Offsite coverage JavascriptExecutor js =
 * (JavascriptExecutor) driver; wb.scrollToTop(); try { wb.Switchtoparent();
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); } catch (Exception
 * e) { selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * test.log(LogStatus.PASS,
 * "Dynamic contractor package is clicked at Expired offiste status method");
 * Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip page link is clicked at Expired offiste status method");
 * wb.SwitchtoChild1(); System.out.println(driver.getTitle() +
 * "It is the title at Non CIP page for Expire offsite coverage status ");
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.NonCIPPolicyStartDate(
 * driver)); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).click();
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).clear();
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys("01/01/2019");
 * test.log(LogStatus.PASS,
 * "Non cip policy start date  is clicked at Expired offiste status method");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * 
 * try { AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).click();
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).clear();
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys("01/01/2020");
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy Expiry date  is clicked at Expired offiste status method");
 * 
 * } catch (Throwable e) {
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy Expiry date  is clicked at Expired offiste status method ");
 * } js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip Mark as confirmed button  is clicked at Expired offiste status method"
 * ); System.out.
 * println("Mark as confirmed button at Non cip compliance page for Expired offisite coverage status"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip policy save and close button  is clicked at Expired offiste status method"
 * ); System.out.
 * println("Non cip save and close and close button is clicked at Epired offisite coverage"
 * ); Thread.sleep(2000); wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); wb.scrollToTop();
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.InsurancePagelink(driver).click();
 * wb.SwitchtoChild1(); wb.scrollToEndt();
 * AddContractor_Pkg_Page.InsuranceEnrollmentMarkasConfirmedBtn(driver).click();
 * AddContractor_Pkg_Page.InsuranceEnrollmentSaveandCloseBtn(driver).click();
 * //wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * test.log(LogStatus.PASS, "Ok button for payroll alert   is clicked ");
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000); try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); } catch (Throwable e) { try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked ");
 * 
 * } catch (Throwable D) { System.out.println("no alert is presne to click "); }
 * } Thread.sleep(4000); wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); wb.scrollToTop();
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * wb.SwitchtoChild1(); Thread.sleep(2000); wb.scrollToTop(); String
 * Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus +
 * "It is the enrollmentnstatus at Expired offisite coverage");
 * wb.scrollToEndt(); AddContractor_Pkg_Page.NonCIPCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * Expireoffsitecoverage = selectDynamicContractorPkg().getText();
 * System.out.println( Expireoffsitecoverage +
 * "status at contractor packages level for Expired offiste coverage status");
 * test.log(LogStatus.PASS, Expireoffsitecoverage); if
 * (Expireoffsitecoverage.contains("Expired Offsite Coverage") &&
 * Enrollmentstatus.contains("Expired Offsite Certificate")) { System.out.
 * println("It is the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expired_Offsite_Coverage); test.log(LogStatus.PASS,
 * "It is the status at Expired offisite coverage method and the status is " +
 * ContractorStatus_Expired_Offsite_Coverage); } else { System.out.
 * println("It is the not the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expired_Offsite_Coverage); test.log(LogStatus.FAIL,
 * "It is not the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expired_Offsite_Coverage); }
 * System.out.println("we are at Expire offisite coverage page method ");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "ExpiredOffsiteCoverageStatus")));
 * 
 * }
 * 
 * @Test(priority = 6)
 * 
 * public void ExpiringOffsiteCoverageStatus() throws Throwable { // After ading
 * payroll and Generating a certifcate If we NonCIP policy end date // is
 * greater than the current date but near about the current date /month and //
 * also Greater the Policy start date it will show // the status as Expiring
 * Offsite coverage JavascriptExecutor js = (JavascriptExecutor) driver;
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * test.log(LogStatus.PASS,
 * "Dynamic contractor package is clicked at Expired offiste status method");
 * Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip page link is clicked at Expired offiste status method");
 * wb.SwitchtoChild1(); System.out.println(driver.getTitle() +
 * "It is the title at Non CIP page for Expire offsite coverage status ");
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(
 * driver)); Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).click();
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).clear();
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys("11/25/2020");
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy Expiry date  is clicked at Expired offiste status method");
 * 
 * } catch (Throwable e) {
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy Expiry date  is clicked at Expired offiste status method ");
 * } js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip Mark as confirmed button  is clicked at Expired offiste status method"
 * ); System.out.
 * println("Mark as confirmed button at Non cip compliance page for Expired offisite coverage status"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Non cip policy save and close button  is clicked at Expired offiste status method"
 * ); System.out.
 * println("Non cip save and close and close button is clicked at Epired offisite coverage"
 * ); Thread.sleep(2000); wb.Switchtoparent();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); wb.scrollToTop();
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); Thread.sleep(2000);
 * wb.scrollToTop(); String Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus +
 * ":::It is the enrollmentnstatus at Expiring offisite coverage");
 * wb.scrollToEndt(); AddContractor_Pkg_Page.NonCIPCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * Expireoffsitecoverage = selectDynamicContractorPkg().getText();
 * System.out.println( Expireoffsitecoverage +
 * "status at contractor packages level for Expiring offiste coverage status");
 * 
 * test.log(LogStatus.PASS, Expireoffsitecoverage); if
 * (Expireoffsitecoverage.contains("Expiring Offsite Coverage")) { System.out.
 * println("It is the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expiring_Offsite_Coverage); test.log(LogStatus.PASS,
 * "It is the status at Expired offisite coverage method and the status is " +
 * ContractorStatus_Expiring_Offsite_Coverage); } else { System.out.
 * println("It is the not the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expiring_Offsite_Coverage); test.log(LogStatus.FAIL,
 * "It is not the status at Expired offisite coverage method and the status is "
 * + ContractorStatus_Expiring_Offsite_Coverage); } System.out.
 * println("we are at Expiring offsite coverage page coverage page method ");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "ExpiringOffsiteCoverageStatus"))); }
 * 
 * @Test(priority = 7) public void PendingReviewStatus() throws Throwable { //
 * Pending Review status will appear if we select the pending review radio //
 * button in Enrollment section for the contractor package
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); try {
 * wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * System.out.println("Non cip page is clicked "); wb.SwitchtoChild1();
 * Thread.sleep(2000); wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPPendingReviewBtn(driver).click();
 * Thread.sleep(2000);
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(
 * driver)); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * System.out.
 * println("Swictehd to parent after marking the insurance enrollment as pending review"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * System.out.println("Non cip page is clicked "); wb.SwitchtoChild1();
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000); wb.scrollToTop();
 * Thread.sleep(2000); String Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus +
 * "::: Enrolled at view add payroll page"); Thread.sleep(2000);
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * System.out.
 * println("Swictehd to parent after marking the insurance enrollment as pending review"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * Pendingreviewstatus = selectDynamicContractorPkg().getText(); if
 * (Pendingreviewstatus.contains(ContractorStatus_Pending_Review) &&
 * Enrollmentstatus.contains("Pending Review")) { System.out.
 * println("It is the status after adding certificates a contractor package and the status is "
 * + ContractorStatus_Pending_Review); test.log(LogStatus.PASS,
 * "It is the status after adding certificates  a contractor package" +
 * ContractorStatus_Pending_Review); } else { test.log(LogStatus.FAIL,
 * "The status text is not" + ContractorStatus_Pending_Review +
 * " The Actual staus is " + ContractorStatus_Pending_Review); }
 * System.out.println(
 * "Pending review button is clicked suiccesfully at enrollment and validate the text at contractor packages panel"
 * ); driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * System.out.println("Non cip page is clicked "); wb.SwitchtoChild1();
 * Thread.sleep(2000); wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * Thread.sleep(2000);
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(
 * driver)); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent();
 * System.out.println("we are at the end of PendingBReview mehtros");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "PendingReviewStatus")));
 * 
 * }
 * 
 * @Test(priority = 8)
 * 
 * public void closeOutPendingStatus() throws Throwable { // Closed Out pending
 * status will come if We fill the Completion Notice page and // mark as //
 * confirmed button is not selected after all the Enrollment things,Payroll and
 * // Certificate generation done
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * ContractorPackage_Page.CP_Icon().click(); // test.log(LogStatus.PASS,
 * "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); Thread.sleep(2000); try { wb.Switchtoparent();
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); } catch (Exception
 * e) { selectDynamicContractorPkg().click(); }
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop();
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * "10/31/2020");
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * Keys.TAB); Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeSaveBtn(driver).click();
 * Thread.sleep(2000); wb.scrollToEndt();
 * wb.moveToElement(AddContractor_Pkg_Page.
 * CompletionNoticeTermsandConditionspage(driver));
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver).click()
 * ; Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop(); String
 * Enrolledstatus = statusesEnrollment().getText();
 * System.out.println(Enrolledstatus +
 * "It is the status at Enrollement page for closed out  method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String pendingcloseOut =
 * selectDynamicContractorPkg().getText(); if
 * (pendingcloseOut.contains("Pending Closeout") &&
 * Enrolledstatus.contains("Pending Closeout")) { System.out.
 * println("The status is  Pending Closeout  for  enrolled contractor package" +
 * pendingcloseOut); test.log(LogStatus.PASS,
 * "The status is Pending Closeout for  enrolled contractor package" +
 * pendingcloseOut); } else { System.out
 * .println("The status is not  Pending Closeout  for  enrolled contractor package"
 * + pendingcloseOut); test.log(LogStatus.FAIL,
 * "The status is  not  Pending Closeout for  enrolled contractor package .It is actually "
 * + pendingcloseOut); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "closeOutPendingStatus")));
 * 
 * }
 * 
 * @Test(priority = 9)
 * 
 * public void closeOutStatus() throws Throwable {
 * 
 * // Closed Out status will come if We fill the Completion Notice page and mark
 * as // confirmed button is selected after all the Enrollment things,Payroll
 * and // Certificate generation done JavascriptExecutor js =
 * (JavascriptExecutor) driver; // ContractorPackage_Page.CP_Icon().click(); //
 * test.log(LogStatus.PASS, "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToEndt(); try {
 * wb.moveToElement(
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver));
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver).click()
 * ; } catch (Exception e) {
 * System.out.println("No such radio button to click"); }
 * 
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticemarkasConfirmedBtn(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop(); String
 * Enrolledstatus = statusesEnrollment().getText();
 * System.out.println(Enrolledstatus +
 * "It is the status at Enrollement page for closed out  method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String closeOut = selectDynamicContractorPkg().getText();
 * if (closeOut.contains("Closed-Out") &&
 * Enrolledstatus.contains("Enrolled | Closed-Out")) { System.out.
 * println("The status is Exlcued closed out for Exclued enrolled contractor package"
 * + closeOut); test.log(LogStatus.PASS,
 * "The status is Exlcued closed out for Exclued enrolled contractor package" +
 * closeOut); } else { System.out.
 * println("The status is not  closed out for Exclued enrolled contractor package"
 * + closeOut); test.log(LogStatus.FAIL,
 * "The status is  not  closed out for Exclued enrolled contractor package .It is actually "
 * + closeOut); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "closeOutPendingStatus")));
 * 
 * }
 * 
 * @Test(priority = 10) public void ContractorPkgCreationExcluded() throws
 * Throwable { // Enrolled with Enrollment Type- Excluded contractor //
 * contractor package needs to be created with Excluded contractor for the //
 * Excluded status
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); System.out.println("scrolled to the top");
 * Thread.sleep(2000); AddContractor_Pkg_Page.plusBtn(driver).click();
 * System.out.println("scrolled to the top and clicked on Plus button");
 * test.log(LogStatus.PASS, "plus button is clicked succesfully");
 * Thread.sleep(4000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched to child window 1 to enroll a  contractor package");
 * AddContractor_Pkg_Page.selectProgram(driver).click();
 * test.log(LogStatus.PASS,
 * "Switched to selct programme searchbar is clicked succesfully at   contractor package"
 * ); wb.type(AddContractor_Pkg_Page.selectProgramSearchBox(driver),
 * programName);
 * wb.ListOflist(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver
 * ), programName); test.log(LogStatus.PASS,
 * "programme  from dropdown bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectProject(driver).click();
 * test.log(LogStatus.PASS, "Select porjrct bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectProjectSearchBox(driver), projectName);
 * test.log(LogStatus.PASS,
 * "Select porjrct bar is clicked  and typed  succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver
 * ), projectName); test.log(LogStatus.PASS,
 * "project  from drop down bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
 * test.log(LogStatus.PASS, "Select Enrollment bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver),
 * EnrollmentStatus); test.log(LogStatus.PASS,
 * "Select Enrollment is clicked  and typed succcesfully " + EnrollmentStatus);
 * wb.ListOflist(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete
 * (driver), EnrollmentStatus); test.log(LogStatus.PASS,
 * "Enrollemnt type is selcetd from dropdown"); Thread.sleep(4000);
 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
 * AddContractor_Pkg_Page.nonCIPCompliancename(driver,NonCIP_Compliance).click()
 * ; test.log(LogStatus.PASS, "Non cip compliance is selected  + it is ::::" +
 * NonCIP_Compliance); Thread.sleep(3000); wb.typeBySendkeys(Contractor,
 * AddContractor_Pkg_Page.selectContractor(driver)); test.log(LogStatus.PASS,
 * "Contractor is selclted succesfully"); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.SelectContact(driver));
 * wb.typeBySendkeys(Contactname,
 * AddContractor_Pkg_Page.SelectContactSearchBox(driver));
 * test.log(LogStatus.PASS, "Contarctor is selcted succesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.ContactsListDropdown(driver),
 * Contactname); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.selectTrade(driver));
 * wb.type(AddContractor_Pkg_Page.selectTradeSearchBox(driver), Trade);
 * Thread.sleep(2000);
 * wb.ListOflist(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver),
 * Trade); test.log(LogStatus.PASS, "Trade is selcted succesfully");
 * Thread.sleep(2000); wb.click(AddContractor_Pkg_Page.btnNext(driver));
 * test.log(LogStatus.PASS, "Next is clicked succesfully"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Clsoe button is clicked succesfully at Send Email page");
 * System.out.println("close button is clicked succesfully");
 * Thread.sleep(2000); wb.Switchtoparent(); test.log(LogStatus.PASS,
 * "switched to main tab"); test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "ContractorPkgCreationExcluded")));
 * 
 * }
 * 
 * @Test(priority = 11)
 * 
 * public void Excludestatus() throws Throwable { JavascriptExecutor js =
 * (JavascriptExecutor) driver; System.out.println(driver.getTitle() +
 * "it is the title of the  page"); wb.scrollToTop(); try { wb.Switchtoparent();
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); } catch (Exception
 * e) { selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1");
 * AddContractor_Pkg_Page.NextBtn_CIPAgreement(driver).click();
 * System.out.println("next button at CIP Agreement is clicked successfully");
 * System.out.println(driver.getTitle());
 * wb.Alert_Click(AddContractor_Pkg_Page.CancelBtn_CIPAgreement(driver));
 * System.out.println("cancel button for the alert is clicked succesfully");
 * js.executeScript("window.scrollTo(0,0)"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).click();
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).clear();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).
 * sendKeys("Roger Federer"); test.log(LogStatus.PASS,
 * "Contract name is enetered"); js.executeScript("window.scrollBy(0,600)");
 * System.out.println("Scroled to Contact Information ");
 * AddContractor_Pkg_Page.ContractValue(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "contract value  is enetered");
 * AddContractor_Pkg_Page.SelfperformedContractValue(driver).sendKeys("90000");
 * test.log(LogStatus.PASS, "SelfperformedContractValue is entered");
 * AddContractor_Pkg_Page.EstimatedcappedPayroll(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "Estimated capped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedUncappedPayroll(driver).sendKeys("80000");
 * test.log(LogStatus.PASS, "Estimated Uncapped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedManHours(driver).sendKeys("1000");
 * test.log(LogStatus.PASS, "Estimated ManHours is enetred");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys("01/01/2020");
 * test.log(LogStatus.PASS, "Estimated start date  is enetred");
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.BrieflyDescribetheScopeoftheWork(driver)
 * .sendKeys("BrieflyDescribetheScopeoftheWork"); test.log(LogStatus.PASS,
 * "BrieflyDescribetheScopeoftheWork is enetred at Insurance enrollment page");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.InsuranceEnrollmentMarkasConfirmedBtn(driver).click();
 * System.out.println("mark as confirmed button is clicked succesfully");
 * AddContractor_Pkg_Page.InsuranceEnrollmentSaveandContinueBtn(driver).click();
 * System.out.
 * println("Save and continue button is clicked at insurance Enrollment page");
 * Thread.sleep(2000); System.out.println(driver.getTitle() +
 * "It is title at NonCIP page");
 * 
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(
 * NonCIPInsuranceCompanyname); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(Keys.ENTER
 * ); System.out.println(NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name"); test.log(LogStatus.PASS,
 * NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name");
 * js.executeScript("window.scrollBy(0,300)");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys("08/01/2020");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * Thread.sleep(2000); // test.log(LogStatus.PASS,
 * "Non cip policy start date is selected succesfully"); //
 * AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys("08/01/2021");
 * // AddContractor_Pkg_Page.NonCIPPolicyExpiryDate(driver).sendKeys(Keys.TAB);
 * // Thread.sleep(2000); test.log(LogStatus.PASS,
 * "Non cip policy Expiry  date is selected succesfully");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * System.out.println("Marked as confirmed button is clicked at NonCIP page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandCloseBtn(driver).click(); System.out.
 * println("save and close button at Non CiP Compliance page is clikced succesfully"
 * ); Thread.sleep(3000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * selectDynamicContractorPkg().click(); Thread.sleep(4000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1");
 * wb.scrollToTop(); Thread.sleep(2000); String Enrollmentstatus =
 * statusesEnrollment().getText(); System.out.println(Enrollmentstatus +
 * "It is the status at Enrollment page for Excluded Method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver).click();
 * System.out.println("Insurance Enrollment page close button ");
 * Thread.sleep(2000); wb.Switchtoparent(); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * Excludedsatus = selectDynamicContractorPkg().getText(); if
 * (Excludedsatus.contains(ContractorStatus_Excluded) &&
 * Enrollmentstatus.contains(ContractorStatus_Excluded)) { System.out.println(
 * "It is the status after a contractor package created with Excluded contractor Enrollment and Enrolled with the status  "
 * + ContractorStatus_Excluded); } else { System.out.println(
 * "It is the not the  status after a contractor package created with Excluded contractor Enrollment and Enrolled "
 * + ContractorStatus_Excluded); }
 * System.out.println("we are Excluded  contractor package status ");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "Excludestatus"))); }
 * 
 * @Test(priority = 12) public void ExcludeClosed() throws Throwable {
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * wb.SwitchtoChild1(); System.out.println(driver.getTitle() +
 * "It is the title at Non CIP page ");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.NonCIPsaveandContinueBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Non CIP save and Continue Button clicked at Non CIP page");
 * Thread.sleep(2000); System.out.println(driver.getTitle() +
 * "It is the title at Sub contractor page ");
 * AddContractor_Pkg_Page.SubcontractorSaveandContinueBtn(driver).click();
 * System.out.println("save and continue button at subcontractor is clicked");
 * Thread.sleep(3000);
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.EnrollmentsummaryAgreeChkBox(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.EnrollmentsummaryConfirmandContinueBtn(driver).click()
 * ; test.log(LogStatus.PASS,
 * "Confirm and continue button is clicked succesfully at Enrollmenmt summary page"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.EnrollmentsummaryNoLossStatementchkBox(driver).click()
 * ; test.log(LogStatus.PASS,
 * "No Loss satetement check box is clicked succesfully");
 * AddContractor_Pkg_Page.EnrollmentsummaryNoLossStatementConfirmandContinueBtn(
 * driver).click(); test.log(LogStatus.PASS,
 * "No Loss satetement confirm and continue  box is clicked succesfully");
 * Thread.sleep(3000);
 * wb.moveToElement(AddContractor_Pkg_Page.sendEmailCloseBtn(driver));
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
 * test.log(LogStatus.INFO,
 * "Send EMail clsoe button at Enrollement summary is clicked for Excluded contractor"
 * ); Thread.sleep(2000); wb.Switchtoparent();
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); test.log(LogStatus.INFO,
 * "Completion notice frame link is clicked succesfully");
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * "10/31/2020");
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * Keys.TAB);
 * System.out.println("Completion date at Completion notice tab is selected");
 * AddContractor_Pkg_Page.CompletionNoticeSaveBtn(driver).click();
 * Thread.sleep(2000);
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver).click()
 * ; test.log(LogStatus.INFO,
 * "Terms and conditions Agree button is clicked at Completion notice page for Excluded contractor"
 * ); System.out.println(
 * "Terms and conditions Agree button is clicked at Completion notice page for Excluded contractor"
 * ); AddContractor_Pkg_Page.CompletionNoticemarkasConfirmedBtn(driver).click();
 * test.log(LogStatus.INFO,
 * "Mark as confirmed button is clicked at Completion notice page for Excluded contractor"
 * ); System.out.
 * println("Mark as confirmed button is clicked at Completion notice page for Excluded contractor"
 * ); AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * test.log(LogStatus.INFO,
 * "save and continue button is clicked at Completion notice page for Excluded contractor"
 * ); System.out.
 * println("save and continue button is clicked at Completion notice page for Excluded contractor"
 * ); Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * System.out.
 * println("Alert Ok  button is clicked at Completion notice page for Excluded contractor"
 * ); Thread.sleep(2000);
 * wb.moveToElement(AddContractor_Pkg_Page.sendEmailCloseBtn(driver));
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop();
 * Thread.sleep(2000); String Enrolledstatus = statusesEnrollment().getText();
 * System.out.println(Enrolledstatus +
 * "It is the status at Enrollement page for Excluded closed method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click();
 * System.out.
 * println("Alert Ok  button is clicked at Completion notice page for Excluded contractor"
 * ); } catch (Throwable e) {
 * System.out.println("No such alert present at Excluded contractor page"); }
 * Thread.sleep(2000); wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * ExcludedClosedOut = selectDynamicContractorPkg().getText(); if
 * (ExcludedClosedOut.contains(ContractorStatus_Excluded_Closed) &&
 * Enrolledstatus.contains(ContractorStatus_Excluded_Closed)) {
 * System.out.println(
 * "The status is Exlcued closed out for Exclued enrolled contractor package" +
 * ExcludedClosedOut); test.log(LogStatus.PASS,
 * "The status is Exlcued closed out for Exclued enrolled contractor package" +
 * ExcludedClosedOut); } else { System.out.println(
 * "The status is not Exlcued closed out for Exclued enrolled contractor package"
 * + ExcludedClosedOut); test.log(LogStatus.FAIL,
 * "The status is  not Exlcued closed out for Exclued enrolled contractor package .It is actually "
 * + ExcludedClosedOut); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "ExcludeClosed")));
 * 
 * }
 * 
 * @Test(priority = 13)
 * 
 * public void CancelledStatus() throws Throwable {
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000); wb.scrollToTop();
 * Thread.sleep(2000); AddContractor_Pkg_Page.EditBrn(driver).click();
 * wb.SwitchtoChild1(); Thread.sleep(2000);
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.cancelContractorPkgBtn(driver).click();
 * Thread.sleep(2000);
 * wb.Alert_Click(AddContractor_Pkg_Page.cancelContractorPkgBtnAlertOKBtn(driver
 * )); Thread.sleep(3000);
 * AddContractor_Pkg_Page.ContarctorpkgsaveAndCloseBtn(driver).click();
 * System.out.
 * println("save and close button at contractor package creation is clicked");
 * Thread.sleep(4000); wb.Switchtoparent(); Thread.sleep(3000);
 * js.executeScript("window.scrollTo(0,0)"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.refreshBtn(driver).click(); test.log(LogStatus.PASS,
 * "Refresh button after Enrollment is clicked succesafully");
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); Thread.sleep(2000);
 * String CpkgstatusText = selectDynamicContractorPkg().getText();
 * System.out.println(
 * "Dynamic contractor package after refresh is selcted to cancel the contractor pkg after cancelling it"
 * ); if (CpkgstatusText.contains(ContractorStatus_Cancelled)) { System.out.
 * println("It is the First Status after creating a contractor package and the status is "
 * + ContractorStatus_Cancelled); test.log(LogStatus.PASS, "The status text is "
 * + ContractorStatus_Cancelled + "  and also the" + " The Actual staus is " +
 * CpkgstatusText); } else { test.log(LogStatus.FAIL, "The status text is not" +
 * ContractorStatus_Cancelled + " The Actual staus is " + CpkgstatusText); }
 * System.out.println("Contractor package status is cancelled now");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "CancelledStatus")));
 * }
 * 
 * @Test(priority = 14) public void NotAwaredStatus() throws Throwable {
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * ContractorPackage_Page.CP_Icon().click(); // test.log(LogStatus.PASS,
 * "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * Thread.sleep(5000); wb.scrollToTop();
 * System.out.println("scrolled to the top");
 * AddContractor_Pkg_Page.plusBtn(driver).click();
 * System.out.println("scrolled to the top and clicked on Plus button");
 * test.log(LogStatus.PASS, "plus button is clicked succesfully");
 * Thread.sleep(4000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched to child window 1 to enroll a  contractor package");
 * AddContractor_Pkg_Page.selectProgram(driver).click();
 * test.log(LogStatus.PASS,
 * "Switched to selct programme searchbar is clicked succesfully at   contractor package"
 * ); wb.type(AddContractor_Pkg_Page.selectProgramSearchBox(driver),
 * programName);
 * wb.ListOflist(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver
 * ), programName); test.log(LogStatus.PASS,
 * "programme  from dropdown bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectProject(driver).click();
 * test.log(LogStatus.PASS, "Select porjrct bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectProjectSearchBox(driver), projectName);
 * test.log(LogStatus.PASS,
 * "Select porjrct bar is clicked  and typed  succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver
 * ), projectName); test.log(LogStatus.PASS,
 * "project  from drop down bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
 * test.log(LogStatus.PASS, "Select Enrollment bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver),
 * Enrollment); test.log(LogStatus.PASS,
 * "Select Enrollment is clicked  and typed succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete
 * (driver), Enrollment); test.log(LogStatus.PASS,
 * "Enrollemnt type is selcetd from dropdown"); Thread.sleep(4000);
 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
 * AddContractor_Pkg_Page.nonCIPCompliancename(driver,NonCIP_Compliance).click()
 * ; test.log(LogStatus.PASS, "Non cip compliance is selected  + it is ::::" +
 * NonCIP_Compliance); Thread.sleep(3000); wb.typeBySendkeys(Contractor,
 * AddContractor_Pkg_Page.selectContractor(driver)); test.log(LogStatus.PASS,
 * "Contractor is selclted succesfully"); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.SelectContact(driver));
 * wb.typeBySendkeys(Contactname,
 * AddContractor_Pkg_Page.SelectContactSearchBox(driver));
 * test.log(LogStatus.PASS, "Contarctor is selcted succesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.ContactsListDropdown(driver),
 * Contactname); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.selectTrade(driver));
 * wb.type(AddContractor_Pkg_Page.selectTradeSearchBox(driver), Trade);
 * Thread.sleep(2000);
 * wb.ListOflist(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver),
 * Trade); test.log(LogStatus.PASS, "Trade is selcted succesfully");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.MoreBtnContractorPackage(driver).click();
 * Thread.sleep(2000);
 * wb.moveToElement(AddContractor_Pkg_Page.ContractorPkgContractorTypeDropdown(
 * driver)); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorPkgContractorTypeDropdown(driver).click();
 * test.log(LogStatus.PASS, "Contractor Type is clicked");
 * System.out.println("Contractor Type is clicked"); Thread.sleep(2000);
 * wb.ListOflist(AddContractor_Pkg_Page.ContractorPkgContractTypeList(driver),
 * "Pre Bid"); test.log(LogStatus.PASS,
 * "Pre Bid  is selcted succesfully from Contractor Type list"); System.out.
 * println("Pre Bid  is selcted succesfully from Contractor Type list");
 * Thread.sleep(2000);
 * wb.moveToElement(AddContractor_Pkg_Page.ContractorPkgDuedate(driver));
 * AddContractor_Pkg_Page.ContractorPkgDuedate(driver).sendKeys("08/01/2020");
 * AddContractor_Pkg_Page.ContractorPkgDuedate(driver).sendKeys(Keys.TAB);
 * Thread.sleep(3000);
 * AddContractor_Pkg_Page.ContractorPkgContractStatusDropdown(driver).click();
 * test.log(LogStatus.PASS, "Contractor status  is clicked");
 * System.out.println("Contractor status  is clicked"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorPkgContractStatusList_NotAwarded(driver).
 * click(); System.out.println("Not Awarded as  status list   is clicked");
 * test.log(LogStatus.PASS,
 * "Not Awarded is selected succesfully Type is clicked"); Thread.sleep(2000);
 * wb.scrollToEndt(); wb.moveToElement(AddContractor_Pkg_Page.btnNext(driver));
 * wb.click(AddContractor_Pkg_Page.btnNext(driver)); test.log(LogStatus.PASS,
 * "Next is clicked succesfully");
 * System.out.println("Next is clicked succesfully"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Clsoe button is clicked succesfully at Send Email page");
 * System.out.println("close button is clicked succesfully");
 * Thread.sleep(2000); wb.Switchtoparent(); test.log(LogStatus.PASS,
 * "switched to main tab");
 * AddContractor_Pkg_Page.PreBidContractorPkgs(driver).click();
 * Thread.sleep(4000); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * String DynamicText = selectDynamicContractorPkg().getText();
 * System.out.println("It is the dymaic text " + DynamicText); if
 * (DynamicText.contains(ContractorStatus_Not_Awarded_)) {
 * System.out.println("It is the status at Not Awarded method " + DynamicText);
 * } else { System.out.
 * println("It is not at the status Not Awarded status.The Actual status is " +
 * DynamicText); } System.out.
 * println("we are at the end of Assigned to Enroled Missing Payroll status");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "NotAwaredStatus")));
 * }
 * 
 * @Test(priority = 15)
 * 
 * public void ConditionallyEnrolledContractorPkg() throws Throwable {
 * 
 * // If we Enroll and Adding payroll,Generating Certifcates While in the //
 * Completion Notice if we didnt select it as Mark as confirmed it will show the
 * // status as Pending closeout JavascriptExecutor js = (JavascriptExecutor)
 * driver; try { AddContractor_Pkg_Page.cancelContractorPkgBtn(driver).click();
 * // wb.Switchtoparent(); // Thread.sleep(2000); //
 * AddContractor_Pkg_Page.Contractorpkgsbtn().click(); Thread.sleep(5000); }
 * catch (Exception e) {
 * AddContractor_Pkg_Page.Contractorpkgsbtn(driver).click();
 * Thread.sleep(10000); } // test.log(LogStatus.PASS,
 * "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * js.executeScript("window.scrollTo(0, 0)");
 * System.out.println("scrolled to the top");
 * AddContractor_Pkg_Page.plusBtn(driver).click();
 * System.out.println("scrolled to the top and clicked on Plus button");
 * test.log(LogStatus.PASS, "plus button is clicked succesfully");
 * Thread.sleep(4000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched to child window 1 to enroll a  contractor package");
 * AddContractor_Pkg_Page.selectProgram(driver).click();
 * test.log(LogStatus.PASS,
 * "Switched to selct programme searchbar is clicked succesfully at   contractor package"
 * ); wb.type(AddContractor_Pkg_Page.selectProgramSearchBox(driver),
 * programName);
 * wb.ListOflist(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver
 * ), programName); test.log(LogStatus.PASS,
 * "programme  from dropdown bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectProject(driver).click();
 * test.log(LogStatus.PASS, "Select porjrct bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectProjectSearchBox(driver), projectName);
 * test.log(LogStatus.PASS,
 * "Select porjrct bar is clicked  and typed  succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver
 * ), projectName); test.log(LogStatus.PASS,
 * "project  from drop down bar is clciked"); Thread.sleep(3000);
 * AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
 * test.log(LogStatus.PASS, "Select Enrollment bar is clicked ");
 * wb.type(AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver),
 * Enrollment); test.log(LogStatus.PASS,
 * "Select Enrollment is clicked  and typed succcesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete
 * (driver), Enrollment); test.log(LogStatus.PASS,
 * "Enrollemnt type is selcetd from dropdown"); Thread.sleep(4000);
 * AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
 * AddContractor_Pkg_Page.nonCIPCompliancename(driver,NonCIP_Compliance).click()
 * ; test.log(LogStatus.PASS, "Non cip compliance is selected  + it is ::::" +
 * NonCIP_Compliance); Thread.sleep(3000); wb.typeBySendkeys(Contractor,
 * AddContractor_Pkg_Page.selectContractor(driver)); test.log(LogStatus.PASS,
 * "Contractor is selclted succesfully"); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.SelectContact(driver));
 * wb.typeBySendkeys(Contactname,
 * AddContractor_Pkg_Page.SelectContactSearchBox(driver));
 * test.log(LogStatus.PASS, "Contarctor is selcted succesfully");
 * wb.ListOflist(AddContractor_Pkg_Page.ContactsListDropdown(driver),
 * Contactname); Thread.sleep(3000);
 * wb.click(AddContractor_Pkg_Page.selectTrade(driver));
 * wb.type(AddContractor_Pkg_Page.selectTradeSearchBox(driver), Trade);
 * Thread.sleep(2000);
 * wb.ListOflist(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver),
 * Trade); test.log(LogStatus.PASS, "Trade is selcted succesfully");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.MoreBtnContractorPackage(driver).click();
 * test.log(LogStatus.INFO, "More button is clicked "); Thread.sleep(2000);
 * wb.moveToElement(AddContractor_Pkg_Page.
 * ContractorPKgMinimumRequirementsSwitch(driver));
 * System.out.println("Moved in to  Switch webElement");
 * wb.TurnONSwitch(AddContractor_Pkg_Page.ContractorPKgMinimumRequirementsSwitch
 * (driver));
 * System.out.println("Minimum Enrollments required switched is turned on ");
 * Thread.sleep(2000);
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.btnNext(driver));
 * wb.click(AddContractor_Pkg_Page.btnNext(driver)); test.log(LogStatus.PASS,
 * "Next is clicked succesfully");
 * System.out.println("Next is clicked succesfully"); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "Clsoe button is clicked succesfully at Send Email page");
 * System.out.println("close button is clicked succesfully");
 * Thread.sleep(4000); System.out.println(driver.getWindowHandles());
 * wb.Switchtoparent(); test.log(LogStatus.PASS, "switched to main tab");
 * test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "ConditionallyEnrolledContractorPkg"))); }
 * 
 * @Test(priority = 16) //@Test(priority = 2) public void
 * AssignedToMissingPayrollCOnditionallyEnrolled() throws Throwable {
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * 
 * try { // wb.Switchtoparent(); System.out.println(driver.getTitle() +
 * "it is the title of the  page"); wb.scrollToTop();
 * System.out.println(driver.getWindowHandles());
 * selectDynamicContractorPkg().click();
 * System.out.println("Dynamic contractor package is clicked succcesfully");
 * Thread.sleep(5000); } catch (Exception e) { //
 * AddContractor_Pkg_Page.Contractorpkgsbtn().click(); // Thread.sleep(5000);
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); test.log(LogStatus.PASS,
 * "Dynamic contractor package is clicked at Expired offiste status method");
 * Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1");
 * wb.scrollToTop(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NextBtn_CIPAgreement(driver).click();
 * System.out.println("next button at CIP Agreement is clicked successfully");
 * System.out.println(driver.getTitle());
 * wb.Alert_Click(AddContractor_Pkg_Page.CancelBtn_CIPAgreement(driver));
 * Thread.sleep(2000); wb.scrollToTop(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).click();
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).clear();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.ContractorNameLegalEntityName(driver).
 * sendKeys("Roger Federer"); test.log(LogStatus.PASS,
 * "Contract name is enetered"); js.executeScript("window.scrollBy(0,600)");
 * System.out.println("Scroled to Contact Information ");
 * AddContractor_Pkg_Page.ContractValue(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "contract value  is enetered");
 * AddContractor_Pkg_Page.SelfperformedContractValue(driver).sendKeys("90000");
 * test.log(LogStatus.PASS, "SelfperformedContractValue is entered");
 * AddContractor_Pkg_Page.EstimatedcappedPayroll(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "Estimated capped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedUncappedPayroll(driver).sendKeys("80000");
 * test.log(LogStatus.PASS, "Estimated Uncapped payroll is enetred");
 * AddContractor_Pkg_Page.EstimatedManHours(driver).sendKeys("1000");
 * test.log(LogStatus.PASS, "Estimated ManHours is enetred");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys("10/01/2020");
 * test.log(LogStatus.PASS, "Estimated start date  is enetred");
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.EstimatedStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.BrieflyDescribetheScopeoftheWork(driver)
 * .sendKeys("BrieflyDescribetheScopeoftheWork"); test.log(LogStatus.PASS,
 * "BrieflyDescribetheScopeoftheWork is enetred at Insurance enrollment page");
 * try { js.executeScript("window.scrollBy(0,100)"); } catch (Throwable e) {
 * System.out.println("can not be scrolled down"); }
 * wb.scrollByVisibilityOfElement(AddContractor_Pkg_Page.workclassDropdown(
 * driver)); wb.click(AddContractor_Pkg_Page.workclassDropdown(driver));
 * test.log(LogStatus.PASS, "workclassDropdown is clicked ");
 * wb.ListSearch(AddContractor_Pkg_Page.WorkclassDropDownList(driver),
 * "1234 - Class Code Description"); test.log(LogStatus.PASS,
 * "class code is seleccted succesfully"); Thread.sleep(4000); try {
 * wb.Alert_Click(AddContractor_Pkg_Page.WorkclassOKBtn(driver));
 * Thread.sleep(2000); } catch (Throwable e) {
 * System.out.println("No such alert present to click at Work class"); }
 * AddContractor_Pkg_Page.WorkclassWorkHours(driver).sendKeys("1000");
 * test.log(LogStatus.PASS, "Workhours is Entered "); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WorkclassPayRoll(driver).sendKeys("100000");
 * test.log(LogStatus.PASS, "WorkclassPayRoll is Entered ");
 * AddContractor_Pkg_Page.WorkclassWCRate(driver).sendKeys("10");
 * test.log(LogStatus.PASS, "WorkclassWCRate is Entered "); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WorkclassAddworkclassBtn(driver).click();
 * System.out.println("Work class update button is cicked syccesfully");
 * test.log(LogStatus.PASS, "WorkclassAddworkclassBtn is clicked ");
 * Thread.sleep(3000); try {
 * wb.Alert_Click(AddContractor_Pkg_Page.WorkclassOKBtn(driver));
 * Thread.sleep(2000); } catch (Throwable e) { System.out.
 * println("No such alert present to click at Work class after confirmation ");
 * } js.executeScript("window.scrollBy(0,200)");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.InsuranceEnrollmentConfirmandEnrolledBtn(driver).click
 * (); test.log(LogStatus.PASS,
 * "Insurance Enrollmen tMarkasConfirmed and enrolled Btn is clicked ");
 * AddContractor_Pkg_Page.InsuranceEnrollmentSaveandCloseBtn(driver).click();
 * test.log(LogStatus.PASS,
 * "InsuranceEnrollment save and close button  is clicked ");
 * System.out.println("InsuranceEnrollment save and close button  is clicked ");
 * Thread.sleep(3000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000);
 * test.log(LogStatus.PASS, "Ok button for payroll alert   is clicked ");
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); Thread.sleep(2000); try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked "); } catch (Throwable e) {
 * System.out.println("No such alert"); } try {
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked ");
 * wb.fluentWait(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver
 * ), 3000);
 * wb.Alert_Click(AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(
 * driver)); test.log(LogStatus.PASS,
 * "Ok button for payroll alert   is clicked ");
 * 
 * } catch (Throwable D) { System.out.println("no alert is presne to click "); }
 * Thread.sleep(4000); wb.Switchtoparent(); Thread.sleep(2000);
 * wb.scrollToTop(); Thread.sleep(2000); selectDynamicContractorPkg().click();
 * test.log(LogStatus.PASS,
 * "Dynamic contractor package is clicked at Conditionally Enrolled status method"
 * ); Thread.sleep(5000); wb.scrollToTop(); Thread.sleep(2000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * wb.click(AddContractor_Pkg_Page.InsurancePagelink(driver));
 * test.log(LogStatus.PASS, "Insurance page is clicked"); Thread.sleep(2000);
 * wb.SwitchtoChild1(); System.out.println("swictehd to window 1");
 * wb.scrollToTop(); String Enrollmentstatus = statusesEnrollment().getText();
 * System.out.println( Enrollmentstatus +
 * "   :::::  It is the status at Conditionally Enrolled Incomplete paper work method"
 * ); test.log(LogStatus.INFO, Enrollmentstatus +
 * "   :::::  It is the status at Conditionally Enrolled Incomplete paper work method"
 * ); Thread.sleep(2000); wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver).click();
 * System.out.
 * println("Close button at Insurance Enrollment page for Econtionally ENrolled incomplete work"
 * ); Thread.sleep(2000); wb.Switchtoparent(); Thread.sleep(2000);
 * wb.scrollToTop(); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * String DynamicText = selectDynamicContractorPkg().getText();
 * System.out.println(DynamicText +
 * "It is the text at Contractor Pkg level for Conditioned enrolled Incomplete paper work mehtod"
 * ); Thread.sleep(2000); if
 * (DynamicText.contains("Incomplete Paperwork | Conditionally Enrolled ") &&
 * Enrollmentstatus.contains("Conditionally Enrolled | Incomplete Paperwork")) {
 * System.out.println(
 * "It is the status at ContractorStatus_Incomplete_Paperwork_Conditionally after enrolling a contractor pkg conditionally::: "
 * + DynamicText); test.log(LogStatus.PASS,
 * "It is the status at ContractorStatus_Incomplete_Paperwork_Conditionally after enrolling a contractor pkg conditionally::: "
 * + DynamicText); } else { System.out.println(
 * "It is not the status at ContractorStatus_Incomplete_Paperwork_Conditionally after enrolling a contractor pkg conditionally::: "
 * + DynamicText); test.log(LogStatus.PASS,
 * "It is not the status at ContractorStatus_Incomplete_Paperwork_Conditionally after enrolling a contractor pkg conditionally::: "
 * + DynamicText); } System.out.
 * println("We are at the end of Incomplete paper work conditionally enrolled");
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.NonCIP_frameLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); Thread.sleep(2000);
 * js.executeScript("window.scrollTo(0,0)");
 * System.out.println(driver.getTitle() + "::it is the title at Non CIP");
 * wb.moveToElement(AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver));
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(
 * NonCIPInsuranceCompanyname); Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPInsuranceCompanyname(driver).sendKeys(Keys.ENTER
 * ); System.out.println(NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name"); test.log(LogStatus.PASS,
 * NonCIPInsuranceCompanyname +
 * "is enetered at Noncip Compliance company name");
 * js.executeScript("window.scrollBy(0,300)");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys("08/01/2020");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * test.log(LogStatus.PASS,
 * "Non cip policy start date is selected succesfully");
 * System.out.println("Non cip policy start date is selected succesfully");
 * AddContractor_Pkg_Page.NonCIPPolicyStartDate(driver).sendKeys(Keys.TAB);
 * System.out.
 * println("Non cip policy Expiry start  date is selected  automatic succesfully"
 * ); Thread.sleep(2000); test.log(LogStatus.PASS,
 * "Non cip policy Expiry  date is selected  automatic succesfully");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.NonCIPMarkasConfirmedBtn(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.NonCIPsaveandContinueBtn(driver).click(); System.out.
 * println("save and continue button at Non CiP Compliance page is clikced succesfully"
 * ); Thread.sleep(3000); System.out.println(driver.getTitle() +
 * " :It is the title at Wc and premium Modification page");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.WcPremiumModificationsMarkasConfirmedBtn(driver).click
 * (); Thread.sleep(2000);
 * AddContractor_Pkg_Page.WcPremiumModificationssaveandContinueBtn(driver).click
 * (); System.out.
 * println("save and continue button at Wc Premium Modifications  page is clikced succesfully"
 * ); Thread.sleep(5000); System.out.println(driver.getTitle() +
 * "==== It is the tilte of the page at GL and Umbrella page"); try {
 * js.executeScript("window.scrollBy(0,150)"); } catch (Throwable e) {
 * System.out.println("cannot be scrolled dpown"); }
 * wb.scrollByVisibilityOfElement(
 * AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalityClasscodeSearcbox(driver));
 * AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalityClasscodeSearcbox(driver).
 * click(); Thread.sleep(2000);
 * System.out.println("GL search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalitySeachBoxfeild(driver).
 * sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.GLUmbrellaGeneraLLibalityClassCodeList(
 * driver), classcodeDescription); System.out.println(
 * "class code description is selcted as " + classcodeDescription +
 * "at General liabilty dropdown"); Thread.sleep(2000); try {
 * js.executeScript("window.scrollBy(0,400)"); } catch (Throwable e) {
 * System.out.println("cannot be scrolled dpown"); } wb
 * .scrollByVisibilityOfElement(AddContractor_Pkg_Page.
 * GLUmbrellaUmbrellaLibalitysearchbox(driver));
 * AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalitysearchbox(driver).click();
 * Thread.sleep(2000);
 * System.out.println("Umbrealla  search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalitySeachBoxfeild(driver).
 * sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.GLUmbrellaUmbrellaLibalityClasscodeList(
 * driver), classcodeDescription); System.out.println(
 * "class code description is selcted as " + classcodeDescription +
 * "at Umbrella liabilty dropdown"); Thread.sleep(2000); try {
 * js.executeScript("window.scrollBy(0,400)"); } catch (Throwable e) {
 * System.out.println("cannot be scrolled dpown"); } wb.moveToElement(
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(
 * driver));
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilityclasscodesearchbox(
 * driver).click(); Thread.sleep(2000);
 * System.out.println("GL search box is clicked succesfully");
 * AddContractor_Pkg_Page.GLUmbrellaPolluctionchargeLiabilitySeachBoxfeild(
 * driver) .sendKeys(classcodeDescription);
 * wb.ListOflist(AddContractor_Pkg_Page.
 * GLUmbrellaPolluctionchargeLiabilityclasscodeList(driver),
 * classcodeDescription);
 * System.out.println("class code description is selcted as " +
 * classcodeDescription + "at Pollution charge  liabilty dropdown");
 * Thread.sleep(2000);
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellaPendingReviewBtn(driver).click();
 * System.out.println("pending review button at GL umbrella page is clicked ");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellasaveandCloseBtn(driver).click(); System.out.
 * println("save and close button at GL Umbrella save and close button click");
 * Thread.sleep(3000); wb.Switchtoparent(); System.out.println(driver.getTitle()
 * + "it is the title at GL Umbrella save and Close Btn page");
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.InsurancePagelink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); Thread.sleep(2000);
 * wb.scrollToTop(); String Enrollmentstatus1 = statusesEnrollment().getText();
 * System.out.println(Enrollmentstatus1 +
 * "::: Conditionally Enrolled pending Review"); wb.scrollToEndt();
 * Thread.sleep(2000);
 * wb.moveToElement(AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver));
 * AddContractor_Pkg_Page.InsuranceEnrollmentCloseBtn(driver).click();
 * System.out.
 * println("close button at insurance enrollment page is clicked succesfully");
 * Thread.sleep(3000); wb.Switchtoparent(); Thread.sleep(2000);
 * wb.scrollToTop(); Thread.sleep(2000); selectDynamicContractorPkg().click();
 * System.out.println("Dynamic contractor package is clicked succesfully");
 * test.log(LogStatus.INFO,
 * "Dynamic Contractor package is clicked succesfully at Pending Review confitionally Enrolled"
 * ); Thread.sleep(5000); String DyanamicText =
 * selectDynamicContractorPkg().getText(); System.out.println( DyanamicText +
 * "It is the text  for Contract pkg at pending review Condtionally ENrolled methiod "
 * ); if (DyanamicText.contains("Pending Review | Conditionally Enrolled") &&
 * Enrollmentstatus.contains("Conditionally Enrolled | Pending Review")) {
 * System.out.
 * println("It is the status at Pending Review and Conditionally Enrolled and the status is::::"
 * + " " + "Pending Review | Conditionally Enrolled"); test.log(LogStatus.PASS,
 * "It is the status at Pending Review and Conditionally Enrolled and the status is::::"
 * + " " + "Pending Review | Conditionally Enrolled"); } else { System.out
 * .println("It is the  not status at Pending Review and Conditionally Enrolled and the status is::::"
 * + " " + "Pending Review | Conditionally Enrolled"); test.log(LogStatus.PASS,
 * "It is  not the status at Pending Review and Conditionally Enrolled and the status is::::"
 * + " " + "Pending Review | Conditionally Enrolled"); } System.out.
 * println("We are at the end of PendingReviewConditionallyEnrolledstatus method "
 * ); wb.scrollToTop();
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellapageLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); Thread.sleep(2000);
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.GLUmbrellaMarkasConfirmedButton(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellasaveandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent(); System.out.println(driver.getTitle()
 * + " It is the title at Pending review for the Minimum enrolment switch");
 * Thread.sleep(2000); wb.scrollToTop(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellapageLink(driver).click();
 * Thread.sleep(2000); wb.SwitchtoChild1(); Thread.sleep(2000);
 * wb.scrollToTop(); String EnrollText = statusesEnrollment().getText();
 * System.out.println(EnrollText +
 * "It is the status at Enrollmemnt page for condtionally enroled");
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.GLUmbrellasaveandCloseBtn(driver).click();
 * Thread.sleep(2000); wb.Switchtoparent(); System.out.println(driver.getTitle()
 * + " It is the title at Pending review for the Minimum enrolment switch");
 * Thread.sleep(2000); wb.scrollToTop(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String dynamictxt =
 * selectDynamicContractorPkg().getText(); System.out.println(dynamictxt +
 * "It is the text at Dynamic contractor package "); if
 * (dynamictxt.contains("Missing Payroll") && EnrollText.contains("Enrolled")) {
 * 
 * System.out.println("It is the status at Conditioanluyy enrolled + "); } else
 * { System.out.println("it is not the status at Missing payroll"); }
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.PayrollLink(driver).click();
 * test.log(LogStatus.PASS, "Payroll link is clicked at lisitng panel ");
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000);
 * System.out.println(driver.getTitle() + "It is the tile at Add payroll page");
 * wb.selectByVisibleText("October 2020",
 * AddContractor_Pkg_Page.SelectPayrollperiod(driver));
 * System.out.println("October 2020 is selected from the drop down succesfully"
 * );
 * wb.moveToElement(AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver));
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeHoursfeild(driver).sendKeys("100");
 * System.out.println("class code hours are entered at payroll page");
 * test.log(LogStatus.PASS, "class code hours are entered at payroll page");
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).click();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).clear();
 * AddContractor_Pkg_Page.PayrollClasscodeUncappedpayroll(driver).sendKeys(
 * "10000"); test.log(LogStatus.PASS,
 * "class code Uncapped payroll is entered at payroll page for Oct-2020"); try {
 * AddContractor_Pkg_Page.PayrollAgreeTermsandConditions(driver).click(); }
 * catch (Throwable e) { System.out.println(
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); } test.log(LogStatus.INFO,
 * "I agree that the Payroll I am submitting is for Roger Federer with the FEIN Hercules-FE-1."
 * ); js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollMarkasconfirmedBtn(driver).click(); System.out.
 * println("mark as confirmed button is cliked succesfully at payroll page for Oct-2020"
 * ); Thread.sleep(2000);
 * AddContractor_Pkg_Page.PayrollFinalpayrollBtn(driver).click(); System.out.
 * println("Final button is clicked for the last payroll month Oct-2020");
 * AddContractor_Pkg_Page.PayrollSaveandcloseBtn(driver).click(); System.out.
 * println("save and close button  is clicked succesfully for Oct-2020");
 * Thread.sleep(2000); wb.Switchtoparent(); System.out.
 * println("switched to contractor panel after adding payroll toi checkn the status"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * test.log(LogStatus.PASS, "switched to frame at Enrollment page");
 * Thread.sleep(2000); AddContractor_Pkg_Page.PayrollLink(driver).click();
 * test.log(LogStatus.PASS, "Payroll link is clicked at lisitng panel ");
 * Thread.sleep(2000); wb.SwitchtoChild1(); test.log(LogStatus.PASS,
 * "Switched Enrollment payroll page"); Thread.sleep(2000);
 * js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); String
 * EnrolledStatus = statusesEnrollment().getText();
 * System.out.println(EnrolledStatus + "::: Enrolled");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * AddContractor_Pkg_Page.PayrollCloseBtn(driver).click(); wb.Switchtoparent();
 * System.out.
 * println("switched to contractor panel after adding payroll toi checkn the status"
 * ); selectDynamicContractorPkg().click(); Thread.sleep(5000); String
 * EnrolledPendingcertificatestatus = selectDynamicContractorPkg().getText(); if
 * (EnrolledPendingcertificatestatus.contains(
 * ContractorStatus_Enrolled_Pending_Certificates) &&
 * EnrolledStatus.contains(ContractorStatus_Enrolled)) { System.out.
 * println("It is the status after adding payrollto  a contractor package and the status is "
 * + ContractorStatus_Enrolled_Pending_Certificates); test.log(LogStatus.PASS,
 * "It is the status after adding payrollto  a contractor package" +
 * ContractorStatus_Enrolled_Pending_Certificates); } else {
 * test.log(LogStatus.PASS, "The status text is not" +
 * EnrolledPendingcertificatestatus + " The Actual staus is " +
 * ContractorStatus_Enrolled_Pending_Certificates); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "AssignedToMissingPayrollCOnditionallyEnrolled")));
 * 
 * }
 * 
 * @Test(priority = 17) //@Test(priority = 3)
 * 
 * public void pendingCloseoutStatusCondtionallyEnrolled() throws Throwable { //
 * If we Enroll and Adding payroll,Generating Certifcates While in the //
 * Completion Notice if we didnt select it as Mark as confirmed it will show the
 * // status as Pending closeout JavascriptExecutor js = (JavascriptExecutor)
 * driver; System.out.println(driver.getTitle() +
 * "it is the title of the  page"); wb.scrollToTop(); try { wb.Switchtoparent();
 * Thread.sleep(2000); selectDynamicContractorPkg().click(); } catch (Exception
 * e) { selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * js.executeScript("window.scrollTo(0, 0)");
 * System.out.println("scrolled to the top");
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop();
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * "10/31/2020");
 * AddContractor_Pkg_Page.CompletionNoticeSelectCompletionDate(driver).sendKeys(
 * Keys.TAB); Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeSaveBtn(driver).click();
 * Thread.sleep(2000); wb.scrollToEndt();
 * wb.moveToElement(AddContractor_Pkg_Page.
 * CompletionNoticeTermsandConditionspage(driver));
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver).click()
 * ; Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop(); String
 * Enrolledstatus = statusesEnrollment().getText();
 * System.out.println(Enrolledstatus +
 * "It is the status at Enrollement page for closed out  method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(2000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String pendingcloseOut =
 * selectDynamicContractorPkg().getText(); if
 * (pendingcloseOut.contains("Pending Closeout") &&
 * Enrolledstatus.contains("Pending Closeout")) { System.out.
 * println("The status is  Pending Closeout  for  enrolled contractor package" +
 * pendingcloseOut); test.log(LogStatus.PASS,
 * "The status is Pending Closeout for  enrolled contractor package" +
 * pendingcloseOut); } else { System.out
 * .println("The status is not  Pending Closeout  for  enrolled contractor package"
 * + pendingcloseOut); test.log(LogStatus.FAIL,
 * "The status is  not  Pending Closeout for  enrolled contractor package .It is actually "
 * + pendingcloseOut); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver,
 * "pendingCloseoutStatusCondtionallyEnrolled")));
 * 
 * }
 * 
 * @Test(priority = 18) //@Test(priority = 4) public void pendingCloseout()
 * throws Throwable { // Closed Out status will come if We fill the Completion
 * Notice page and mark as // confirmed button is selected after all the
 * Enrollment things,Payroll and // Certificate generation done
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * ContractorPackage_Page.CP_Icon().click(); // test.log(LogStatus.PASS,
 * "contractor icon is clicked succesfully");
 * System.out.println(driver.getTitle() + "it is the title of the  page");
 * wb.scrollToTop(); try { wb.Switchtoparent(); Thread.sleep(2000);
 * selectDynamicContractorPkg().click(); } catch (Exception e) {
 * selectDynamicContractorPkg().click(); } Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToEndt(); try {
 * wb.moveToElement(
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver));
 * AddContractor_Pkg_Page.CompletionNoticeTermsandConditionspage(driver).click()
 * ; } catch (Exception e) {
 * System.out.println("No such radio button to click"); }
 * 
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticemarkasConfirmedBtn(driver).click();
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(5000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); Thread.sleep(2000); wb.scrollToTop();
 * selectDynamicContractorPkg().click(); Thread.sleep(5000);
 * driver.switchTo().frame(AddContractor_Pkg_Page.Enrollment_frame(driver));
 * Thread.sleep(2000);
 * AddContractor_Pkg_Page.CompletionNoticeFrameLink(driver).click();
 * System.out.println("Completion Notice frame link is selected sucessfully");
 * Thread.sleep(2000); wb.SwitchtoChild1(); System.out.println(driver.getTitle()
 * + "It is the title at Completion Notice page"); wb.scrollToTop(); String
 * Enrolledstatus = statusesEnrollment().getText();
 * System.out.println(Enrolledstatus +
 * "It is the status at Enrollement page for closed out  method");
 * wb.scrollToEndt();
 * AddContractor_Pkg_Page.CompletionNoticesaveandContinueBtn(driver).click();
 * System.out.
 * println("save and continue button at completion notice page is clicked ");
 * Thread.sleep(4000); try {
 * AddContractor_Pkg_Page.CompletionNoticeAlertOkBtn(driver).click(); } catch
 * (Exception e) { System.out.
 * println("OK button is not aviable to click at Completion notice alert"); }
 * wb.scrollToEndt(); Thread.sleep(2000);
 * AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click(); Thread.sleep(2000);
 * wb.Switchtoparent(); selectDynamicContractorPkg().click();
 * Thread.sleep(5000); String closeOut = selectDynamicContractorPkg().getText();
 * if (closeOut.contains("Closed-Out") && Enrolledstatus.contains("Closed-Out"))
 * { System.out.
 * println("The status is Exlcued closed out for Exclued enrolled contractor package"
 * + closeOut); test.log(LogStatus.PASS,
 * "The status is Exlcued closed out for Exclued enrolled contractor package" +
 * closeOut); } else { System.out.
 * println("The status is not  closed out for Exclued enrolled contractor package"
 * + closeOut); test.log(LogStatus.FAIL,
 * "The status is  not  closed out for Exclued enrolled contractor package .It is actually "
 * + closeOut); } test.log(LogStatus.PASS,
 * test.addScreenCapture(FileUtils1.captureScreen(driver, "pendingCloseout")));
 * 
 * }
 * 
 * }
 */