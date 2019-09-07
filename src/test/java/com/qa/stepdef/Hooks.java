package com.qa.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

 

public class Hooks extends BaseTest {
	
	BaseTest baseTest;
	public Hooks(BaseTest baseTest){
		this.baseTest=baseTest;
	}

	public WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\D\\QURATE\\SeleniumConcepts\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("----Browser Object created now----");
		baseTest.driver=this.driver;
		System.out.println("----Browser Object sent to BaseTest's WebDriver variable----");
	}
	
	@After
	public void tearDown(){
		System.out.println("----Browser quit----");
		try {
			Thread.sleep(1500);
			//driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
