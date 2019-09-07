package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AlertsTest extends BaseTest {
	BaseTest baseTest;
	WebDriver driver;
	By image=By.xpath("//img[@id='enterimg']");
	By switchTo=By.linkText("SwitchTo");
	By switchToMenu = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']");
	By alertLink = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']/li//a[contains(text(),'Alerts')]");
	
	By alertWithOk = By.xpath("//a[@href='#OKTab']");
	By alertWithTextBox=By.xpath("//li/a[contains(text(),'Alert with Textbox')]");
	By alertWithOkcalcle =By.xpath("//a[@class='analystic'][contains(text(),'Alert with OK & Cancel')]");
	
	By btn=By.xpath("//button[@class='btn btn-danger']");
	By btnForOKCancelAlert=By.xpath("//button[@class='btn btn-primary']");
	By btnForTextboxAlert=By.xpath("//button[@class='btn btn-info']");
	
	public AlertsTest(BaseTest baseTest){
		this.baseTest=baseTest;
		this.driver=baseTest.driver;
	}
	
	@When("^User switch to Alert page$")
	public void user_switch_to_Alert_page() {
		baseTest.getWebElement(image).click();
		baseTest.mouseHover(switchTo);
		baseTest.isVisible(baseTest.getWebElements(switchToMenu));
		baseTest.mouseHover(alertLink);
		baseTest.implicitWait();
		baseTest.getWebElement(alertLink).click();
		baseTest.pageLoadWait();
	}

	@When("^User click  alert with ok option$")
	public void user_click_alert_with_ok_option() {	
		System.out.println("user_click_alert_with_ok_option");
	   baseTest.getWebElement(alertWithOk).click();
	}

	
	@And("^User click  alert with okCancel option$")
	public void user_click_alert_with_okCancel_option() {
		System.out.println("user_click_alert_with_okCancel_option");
	   baseTest.getWebElement(alertWithOkcalcle).click();
	}
	
	
	@And("^User click alert with textbox option$")
	public void User_click_alert_with_textbox_option() {
		System.out.println("user_click_alert_with_okCancel_option");
	   baseTest.getWebElement(alertWithTextBox).click();
	}
	
	
 
	
	

	
	@When("^User click  button$")
	public void user_click_button() {
		baseTest.getWebElement(btn).click();
	}
	
	@And("^User click  button for OKCancelAlert$")
	public void user_click_button_for_OKCancelAlert() {
		baseTest.getWebElement(btnForOKCancelAlert).click();
	}
	
	
	@And("^User click button for textboxAlert$")
	public void User_click_button_for_textboxAlert() {
		baseTest.getWebElement(btnForTextboxAlert).click();
	}
	

	
	@And("^User should send username$")
	public void User_should_send_username1() {
	   baseTest.sendTextToAlert("raja");
	}
	
 
	
	@Then("^User should see alert displayed$")
	public void user_should_see_alert_displayed() {
		baseTest.checkIfAlertDisplayed();
	}

	
	
	
	
	
	@Then("^User accept the alert$")
	public void user_accept_the_alert() {
		System.out.println("user_accept_the_alert");
		baseTest.acceptAlert();
	}
	
	@Then("^User dismiss the alert$")
	public void User_dismiss_the_alert() {
		System.out.println("User_dismiss_the_alert");
		baseTest.declineAlert();
	}
	



}
