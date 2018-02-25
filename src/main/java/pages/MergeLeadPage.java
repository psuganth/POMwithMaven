package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLead;
	public FindLeadPage clickFromLead() {
		click(eleFromLead);
		switchToWindow(1);
		return new FindLeadPage();
	}
	
	@FindBy(how=How.XPATH, using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLead;
	public FindLeadPage clickToLead() {
		clickWithNoSnap(eleToLead);
		switchToWindow(1);
		return new FindLeadPage();
	}
	
	
	
	@FindBy(how = How.LINK_TEXT, using="Merge")
	private WebElement eleMerge;
	public ViewLeadpage clickMergeButtn() {
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return new ViewLeadpage();
	}
	}
	
	
	
	
	
	
	

