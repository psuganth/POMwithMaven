package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	
	@BeforeTest
	public void enterData() {
		testCaseName= "TC005_MergeLead";
		testDescription= "Merging 2 Leads";
		testNodes="Leads";
		category="smoke";
		authors="balasuriya";
		browserName="chrome";
		dataSheetName= "TC006";
	}

	@Test(dataProvider="fetchData")
	public void mergeLead(String UName, String Pwd, String IDNum, String IDNum1, String IDNum2) {
		 new LoginPage() 
			.enterUserName(UName)
			.enterPassword(Pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLead()
			.clickmergeLead()
			.clickFromLead()
			.enterLeadID(IDNum)
			.clickFindLeadButt()
			.selectFirstResult()
			.clickToLead()
			.enterLeadID(IDNum1)
			.clickFindLeadButt()
			.selectFirstResult()
			.clickMergeButtn()
			.clickfindLeadfromViewLead()
			.enterLeadID(IDNum2)
			.clickFindLeadButt()
			.verifyNoRecords();
			
			
			
			
			
			
			
	}
}
