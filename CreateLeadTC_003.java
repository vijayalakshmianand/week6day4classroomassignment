package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecficationMethod;
import pages.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecficationMethod{
    @Test
	public void runCreatelead() {
	
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadstab()
		.clickCreateLead()
		.enterCompanyname()
		.enterFirstName()
		.enterLastName()
		.enterPhno()
		.clickSubmitButton();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
