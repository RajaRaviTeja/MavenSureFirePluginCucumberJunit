package com.qa.stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

 

public class FileUploadTest extends BaseTest{
	
	BaseTest baseTest;
	public FileUploadTest(BaseTest baseTest){
		this.baseTest = baseTest;
	}
	
	
    By fileUpload = By.xpath("//input[@id='fileupload']");

	@When("upload an file")
	public void upload_an_file() {
		baseTest.getWebElement(fileUpload).sendKeys("C:\\Users\\rajnakir\\Desktop\\Notepad++\\Selenium.txt");   
	}
 


	
}
