package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public FindLeadPage() {
		PageFactory.initElements(driver, this);
		
	}



@FindBy(how=How.XPATH, using="//span[text()='Phone']")
private WebElement elephone;
public FindLeadPage clickPhone() {
	click(elephoneNum);
	return this;
}

@FindBy(how=How.NAME, using="phoneNumber")
private WebElement elephoneNum;
public FindLeadPage enterPhoneNum(String data) {
	type(elephoneNum, data);
	return this;
	
}

@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
private WebElement eleenter1stName;
public FindLeadPage enterFirstName(String data) {
	type(eleenter1stName, data);
	return this;
}

@FindBy(how=How.XPATH, using="(//input[@name='companyName'])[2]")
private WebElement eleenterCompanyName;
public FindLeadPage enterCompanyName(String data) {
	type(eleenterCompanyName, data);
	return this;
}

@FindBy(how=How.XPATH, using="//input[@name='id']")
private WebElement eleenterLeadID;
public FindLeadPage enterLeadID(String iDNum) {
	type(eleenterLeadID, iDNum);
	return this;
}
@FindBy(how=How.XPATH, using="//span[text()='Email']")
private WebElement eleEmailbuttn;
public FindLeadPage clickEmailButton() {
	click(eleEmailbuttn);
	return this;
	
}

@FindBy(how=How.XPATH, using="//input[@name='emailAddress']")
private WebElement eleEnterEmail;
public FindLeadPage enterEmail(String data) {
	type(eleEnterEmail, data);
	return this;
	
}

@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
private WebElement eleCaptureFName;
public FindLeadPage captureFirstName() {
	String Capturing1stName = eleCaptureFName.getText();
	System.out.println(Capturing1stName);
	return this;
	
}

@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
private WebElement eleFindLead;
public FindLeadPage clickFindLeadButt() {
	click(eleFindLead);
	return this;
}
@FindBy(how=How.XPATH, using = "//div[text()='No records to display']")
private WebElement eleNoRecords;
public void verifyNoRecords() {
	String value = eleNoRecords.getText();
	System.out.println(value);
}


@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
private WebElement ele1stResult;
public MergeLeadPage selectFirstResult() {
	clickWithNoSnap(ele1stResult);
	switchToWindow(0);
	return new MergeLeadPage();
	
}


@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
private WebElement eleFirstResult;
public ViewLeadpage FirstResult() {
	click(ele1stResult);
	return new ViewLeadpage();
}
}