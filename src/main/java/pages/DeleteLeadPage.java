package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

public class DeleteLeadPage extends ProjectMethods{
	
	public DeleteLeadPage() {
		
	}
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleVerifyCName;
	public ViewLeadpage verifyCName() {
		String CName = eleVerifyCName.getText();
		System.out.println(CName);
		return new ViewLeadpage();
	}
	/*
	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleDelete;
	public MyleadsPage DeleteLead() {
		click(eleDelete);
		return new MyleadsPage();
	}*/
}
