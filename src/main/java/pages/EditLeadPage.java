package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement eleEditCName;
	public EditLeadPage editComName(String data) {
		type(eleEditCName, data);
		return this;
	}

	@FindBy(how=How.ID, using="updateLeadForm_firstName")
	private WebElement eleEditFName;
	public EditLeadPage editFirstName(String data) {
		type(eleEditFName, data);
		return this;
	}
	@FindBy(how=How.ID, using="updateLeadForm_lastName")
	private WebElement eleEditLName;
	public EditLeadPage editLastName(String data) {
		type(eleEditLName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_description")
	private WebElement eleEditDesc;
	public EditLeadPage editDecriptiom(String data) {
		type(eleEditDesc, data);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using ="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdate;
	public ViewLeadpage clickUpdate() {
	click(eleUpdate);
	return new ViewLeadpage();
		
	}
	
	
}
