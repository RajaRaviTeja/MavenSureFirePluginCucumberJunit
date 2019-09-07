package com.qa.stepdef;

 import io.cucumber.java.en.Given;
 


public class Background extends BaseTest{	
	
	BaseTest baseTest;
	public Background(BaseTest baseTest){
		this.baseTest=baseTest;
	}
	
	@Given("^User launch the test site$")
	public void User_launch_the_test_site() {
		baseTest.driver.manage().window().maximize();
		baseTest.driver.get("http://demo.automationtesting.in/");
	}
	
	@Given("Launch the site with fileupload")
	public void launch_the_site_with_fileupload() {
		baseTest.driver.manage().window().maximize();
		baseTest.driver.get("https://html.com/input-type-file/");
	}
}
