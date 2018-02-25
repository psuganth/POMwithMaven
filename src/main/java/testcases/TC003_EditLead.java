package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void enterData() {
		testCaseName= "TC003_EditLead";
		testDescription= "Editing a lead";
		testNodes="Leads";
		category="smoke";
		authors="balasuriya";
		browserName="chrome";
		dataSheetName= "TC004";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String UName, String Pwd, String FName, String NewCName, String NewFName )
	{
		 new LoginPage()
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickfindLead()
		.enterFirstName(FName)
		.clickFindLeadButt()
		.FirstResult()
		.clickEditLead()
		.editComName(NewCName)
		.editFirstName(NewFName)
		.clickUpdate();
		
		
		
		
		
		
	}
}
