package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class WebTableTest extends BaseTest{

	BaseTest baseTest;
	WebDriver driverr;
	public WebTableTest(BaseTest baseTest){
		this.baseTest=baseTest;
		this.driver=baseTest.driver;
	}
	By image=By.xpath("//img[@id='enterimg']");
	By webTable=By.linkText("WebTable");
	By rameshRecordEditBtn=By.xpath("//div[text()='rameshjadhav@gmail.com']/../following-sibling::div//button/i[contains(@class,'fa-pencil')]");
	By editableMode=By.xpath("//div[text()='rameshjadhav@gmail.com']/../following-sibling::div[1]") ;
//background-color: white;
	
	@When("^User switch to WebTable page$")
	public void User_switch_to_WebTable_page(){
		baseTest.getWebElement(image).click();
		baseTest.mouseHover(webTable);
		baseTest.getWebElement(webTable).click();
		baseTest.pageLoadWait();
		baseTest.doubleClick(rameshRecordEditBtn);
		System.out.println(baseTest.getWebElement(editableMode).getAttribute("style"));	
		//.equals("background-color: white; color: black;");
	}
	
	
	
	
}
