package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyleadsPage extends ProjectMethods {
	
	public MyleadsPage() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how=How.LINK_TEXT, using="Merge Leads")
	private WebElement eleclickMergeLead;
	public MergeLeadPage clickmergeLead() {
		click(eleclickMergeLead);
		return new MergeLeadPage();
		
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	private WebElement eleclickFindLead;
	public FindLeadPage clickfindLead() {
		click(eleclickFindLead);
		return new FindLeadPage();
		
	}
	
	
}
