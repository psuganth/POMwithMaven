package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadpage extends ProjectMethods {

	public ViewLeadpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleverifyCName;
	public ViewLeadpage verifyCompanyName(String data) {
		verifyPartialText(eleverifyCName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleverifyFirstName;
	public ViewLeadpage verifyFirstName(String data) {
		verifyPartialText(eleverifyFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="viewLead_lastName_sp")
	private WebElement eleverifyLastName;
	public ViewLeadpage verifyLastName(String data) {
		verifyPartialText(eleverifyLastName, data);
		return this;
	}
	@FindBy(how=How.LINK_TEXT, using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
		
	}

	@FindBy(how=How.LINK_TEXT, using="Edit")
	private WebElement eleEditLead;
	public EditLeadPage clickEditLead() {
		click(eleEditLead);
		return new EditLeadPage();
		
	}

	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleDeleteead;
	public MyleadsPage clickDeleteLead() {
		click(eleDeleteead);
		return new MyleadsPage();
		
	}
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	private WebElement eleclickFindLeadfromViewLead;
	public FindLeadPage clickfindLeadfromViewLead() {
		click(eleclickFindLeadfromViewLead);
		return new FindLeadPage();
		
	}

}
