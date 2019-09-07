package com.qa.stepdef;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class BrowserResizeTest extends BaseTest {

	WebDriver driver;
	BaseTest baseTest;
	public BrowserResizeTest(BaseTest baseTest){
		this.baseTest=baseTest;
		this.driver=baseTest.driver;
	}
	
	
	@Then("^User resize the browser$") 
	public void User_resize_the_browser(){
		driver.manage().window().setSize(new Dimension(320,568));	
	}
	
}
