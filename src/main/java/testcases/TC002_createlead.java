package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_createlead extends ProjectMethods {
	@BeforeTest
	public void enterData() {
		testCaseName= "TC002_createlead";
		testDescription= "Creating a new lead";
		testNodes="Leads";
		category="smoke";
		authors="balasuriya";
		browserName="firefox";
		dataSheetName= "TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void creatingLead(String uName,String pwd, String CompanyName, String FirstName, String LastName, String VCompanyName, String VFirstName, String VLastName )
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickCreateLead()
		.verifyCompanyName(VCompanyName)
		.verifyFirstName(VFirstName)
		.verifyLastName(VLastName);
	}
}
