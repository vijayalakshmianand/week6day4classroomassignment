package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecficationMethod;

public class CreateLeadPage extends ProjectSpecficationMethod {
	
	
		public CreateLeadPage(RemoteWebDriver driver) {
			this.driver=driver;
	}


		public CreateLeadPage enterCompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
		
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
       return this;
	}

	
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
return this;
	}
	
	
	public CreateLeadPage enterPhno() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
	}
}

