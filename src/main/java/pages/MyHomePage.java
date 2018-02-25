package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Create Lead")
	private WebElement eleCreatelead;
	public CreateLeadPage clickCreateLead() {
		click(eleCreatelead);
		return new CreateLeadPage();
	}

	@FindBy(how=How.LINK_TEXT, using= "Create Lead")
	private WebElement eleClickLeadead;
	public MyleadsPage clickLead() {
		click(eleClickLeadead);
		return new MyleadsPage();
	}
	
}
