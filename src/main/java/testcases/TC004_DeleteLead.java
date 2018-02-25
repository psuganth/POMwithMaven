package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void enterData() {
		testCaseName= "TC004_DeleteLead";
		testDescription= "Deleting a Lead";
		testNodes="Leads";
		category="smoke";
		authors="balasuriya";
		browserName="chrome";
		dataSheetName= "TC005";
	}

	@Test(dataProvider="fetchData")
	public void DeleteLead(String UName, String Pwd, String IDNum, String IDNum1 )
	{
	     new LoginPage() 
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickfindLead()
		.enterLeadID(IDNum)
		.clickFindLeadButt()
		.FirstResult()
		.clickDeleteLead()
		.clickfindLead()
		.enterLeadID(IDNum1)
		.clickFindLeadButt()
		.verifyNoRecords();
}
}