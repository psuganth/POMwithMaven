package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void enterData() {
		testCaseName= "TC006_Duplicate Lead";
		testDescription= "Duplicating a Lead";
		testNodes="Leads";
		category="smoke";
		authors="balasuriya";
		browserName="chrome";
		dataSheetName= "TC007";
	}

	@Test(dataProvider="fetchData")
	public void DuplicateLead(String UName, String Pwd, String Email , String title) {
		new LoginPage()
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickfindLead()
		.clickEmailButton()
		.enterEmail(Email)
		.clickFindLeadButt()
		.captureFirstName()
		.FirstResult()
		.clickDuplicateLead()
		.VerifyTitleOfDuplicateLead(title)
		.clickCreateLeadbuttn();
		
		
		
		
		
	}
}
